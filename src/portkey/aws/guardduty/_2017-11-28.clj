(ns portkey.aws.guardduty.-2017-11-28 (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/create-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.unarchive-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/unarchive-findings-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.unarchive-findings-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/FindingIds] :locations {"findingIds" "FindingIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.create-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.create-threat-intel-set-request/format (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/threat-intel-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/create-threat-intel-set-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.create-threat-intel-set-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/Activate :portkey.aws.guardduty.-2017-11-28.create-threat-intel-set-request/Format :portkey.aws.guardduty.-2017-11-28/Location :portkey.aws.guardduty.-2017-11-28/Name] :locations {"activate" "Activate", "format" "Format", "location" "Location", "name" "Name"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.internal-server-error-exception/type (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.internal-server-error-exception/Message :portkey.aws.guardduty.-2017-11-28.internal-server-error-exception/Type] :locations {"message" "Message", "__type" "Type"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/ip-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/enable clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/delete-detector-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-master-account-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/Master] :locations {"master" "Master"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.start-monitoring-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/start-monitoring-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.start-monitoring-members-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/severity (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--double))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/schema-version (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/type (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/title (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/description (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/account-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/partition (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/arn (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/region (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding/confidence (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--double))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/finding (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.finding/AccountId :portkey.aws.guardduty.-2017-11-28.finding/SchemaVersion :portkey.aws.guardduty.-2017-11-28/CreatedAt :portkey.aws.guardduty.-2017-11-28/Resource :portkey.aws.guardduty.-2017-11-28.finding/Severity :portkey.aws.guardduty.-2017-11-28/UpdatedAt :portkey.aws.guardduty.-2017-11-28.finding/Type :portkey.aws.guardduty.-2017-11-28.finding/Region :portkey.aws.guardduty.-2017-11-28.finding/Id :portkey.aws.guardduty.-2017-11-28.finding/Arn] :opt-un [:portkey.aws.guardduty.-2017-11-28.finding/Title :portkey.aws.guardduty.-2017-11-28.finding/Description :portkey.aws.guardduty.-2017-11-28.finding/Partition :portkey.aws.guardduty.-2017-11-28/Service :portkey.aws.guardduty.-2017-11-28.finding/Confidence] :locations {"confidence" "Confidence", "resource" "Resource", "updatedAt" "UpdatedAt", "accountId" "AccountId", "arn" "Arn", "createdAt" "CreatedAt", "partition" "Partition", "id" "Id", "region" "Region", "title" "Title", "type" "Type", "schemaVersion" "SchemaVersion", "service" "Service", "severity" "Severity", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/create-detector-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/DetectorId] :locations {"detectorId" "DetectorId"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.invite-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.invite-members-request/disable-email-notification (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/invite-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.invite-members-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/AccountIds :portkey.aws.guardduty.-2017-11-28.invite-members-request/DisableEmailNotification :portkey.aws.guardduty.-2017-11-28/Message] :locations {"accountIds" "AccountIds", "disableEmailNotification" "DisableEmailNotification", "message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/update-threat-intel-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/--timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/service-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.port-probe-action/blocked (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.port-probe-action/port-probe-details (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--list-of-port-probe-detail))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/port-probe-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.port-probe-action/Blocked :portkey.aws.guardduty.-2017-11-28.port-probe-action/PortProbeDetails] :locations {"blocked" "Blocked", "portProbeDetails" "PortProbeDetails"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/delete-invitations-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.delete-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/delete-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.delete-members-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/email (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/ip-set-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/ip-set-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.listipsets-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.listipsets-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/listipsets-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.listipsets-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/MaxResults :portkey.aws.guardduty.-2017-11-28.listipsets-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.country/country-code (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.country/country-name (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/country (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.country/CountryCode :portkey.aws.guardduty.-2017-11-28.country/CountryName] :locations {"countryCode" "CountryCode", "countryName" "CountryName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.bad-request-exception/type (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.bad-request-exception/Message :portkey.aws.guardduty.-2017-11-28.bad-request-exception/Type] :locations {"message" "Message", "__type" "Type"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.unprocessed-account/account-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.unprocessed-account/result (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/unprocessed-account (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.unprocessed-account/AccountId :portkey.aws.guardduty.-2017-11-28.unprocessed-account/Result] :opt-un [] :locations {"accountId" "AccountId", "result" "Result"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/ipv6-addresses (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/ipv6-address) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.delete-detector-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/delete-detector-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.delete-detector-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.archive-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/archive-findings-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.archive-findings-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/FindingIds] :locations {"findingIds" "FindingIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/decline-invitations-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/disassociate-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/invitation-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.organization/asn (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.organization/asn-org (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.organization/isp (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.organization/org (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/organization (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.organization/Asn :portkey.aws.guardduty.-2017-11-28.organization/AsnOrg :portkey.aws.guardduty.-2017-11-28.organization/Isp :portkey.aws.guardduty.-2017-11-28.organization/Org] :locations {"asn" "Asn", "asnOrg" "AsnOrg", "isp" "Isp", "org" "Org"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.security-group/group-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.security-group/group-name (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/security-group (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.security-group/GroupId :portkey.aws.guardduty.-2017-11-28.security-group/GroupName] :locations {"groupId" "GroupId", "groupName" "GroupName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/port-probe-detail (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/LocalPortDetails :portkey.aws.guardduty.-2017-11-28/RemoteIpDetails] :locations {"localPortDetails" "LocalPortDetails", "remoteIpDetails" "RemoteIpDetails"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/disassociate-from-master-account-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.create-sample-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/create-sample-findings-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.create-sample-findings-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/FindingTypes] :locations {"findingTypes" "FindingTypes"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/ip-set-format (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"STIX" "STIX", "PROOF_POINT" "PROOF_POINT", :txt "TXT", :stix "STIX", :alien-vault "ALIEN_VAULT", "TXT" "TXT", :fire-eye "FIRE_EYE", "ALIEN_VAULT" "ALIEN_VAULT", :proof-point "PROOF_POINT", :otx-csv "OTX_CSV", "OTX_CSV" "OTX_CSV", "FIRE_EYE" "FIRE_EYE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/private-ip-address-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/PrivateDnsName :portkey.aws.guardduty.-2017-11-28/PrivateIpAddress] :locations {"privateDnsName" "PrivateDnsName", "privateIpAddress" "PrivateIpAddress"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.list-threat-intel-sets-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.list-threat-intel-sets-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/list-threat-intel-sets-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.list-threat-intel-sets-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/MaxResults :portkey.aws.guardduty.-2017-11-28.list-threat-intel-sets-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/comments (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.disassociate-from-master-account-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/disassociate-from-master-account-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.disassociate-from-master-account-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/security-groups (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/security-group) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/threat-intel-set-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/threat-intel-set-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/threat-intel-set-format (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"STIX" "STIX", "PROOF_POINT" "PROOF_POINT", :txt "TXT", :stix "STIX", :alien-vault "ALIEN_VAULT", "TXT" "TXT", :fire-eye "FIRE_EYE", "ALIEN_VAULT" "ALIEN_VAULT", :proof-point "PROOF_POINT", :otx-csv "OTX_CSV", "OTX_CSV" "OTX_CSV", "FIRE_EYE" "FIRE_EYE"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/detector-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.createipset-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.createipset-request/format (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/ip-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/createipset-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.createipset-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/Activate :portkey.aws.guardduty.-2017-11-28.createipset-request/Format :portkey.aws.guardduty.-2017-11-28/Location :portkey.aws.guardduty.-2017-11-28/Name] :locations {"activate" "Activate", "format" "Format", "location" "Location", "name" "Name"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/Members :portkey.aws.guardduty.-2017-11-28/UnprocessedAccounts] :locations {"members" "Members", "unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.instance-details/instance-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.instance-details/platform (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.instance-details/image-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.instance-details/instance-type (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.instance-details/availability-zone (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.instance-details/instance-state (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.instance-details/launch-time (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/instance-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.instance-details/InstanceId :portkey.aws.guardduty.-2017-11-28.instance-details/Platform :portkey.aws.guardduty.-2017-11-28.instance-details/ImageId :portkey.aws.guardduty.-2017-11-28.instance-details/InstanceType :portkey.aws.guardduty.-2017-11-28/Tags :portkey.aws.guardduty.-2017-11-28.instance-details/AvailabilityZone :portkey.aws.guardduty.-2017-11-28.instance-details/InstanceState :portkey.aws.guardduty.-2017-11-28/ProductCodes :portkey.aws.guardduty.-2017-11-28.instance-details/LaunchTime :portkey.aws.guardduty.-2017-11-28/IamInstanceProfile :portkey.aws.guardduty.-2017-11-28/NetworkInterfaces] :locations {"productCodes" "ProductCodes", "networkInterfaces" "NetworkInterfaces", "tags" "Tags", "iamInstanceProfile" "IamInstanceProfile", "launchTime" "LaunchTime", "availabilityZone" "AvailabilityZone", "imageId" "ImageId", "instanceType" "InstanceType", "instanceState" "InstanceState", "platform" "Platform", "instanceId" "InstanceId"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/--string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-threat-intel-set-request/threat-intel-set-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-threat-intel-set-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.get-threat-intel-set-request/ThreatIntelSetId :portkey.aws.guardduty.-2017-11-28.get-threat-intel-set-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.member/relationship-status (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/member (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28/Email :portkey.aws.guardduty.-2017-11-28/AccountId :portkey.aws.guardduty.-2017-11-28/MasterId :portkey.aws.guardduty.-2017-11-28/UpdatedAt :portkey.aws.guardduty.-2017-11-28.member/RelationshipStatus] :opt-un [:portkey.aws.guardduty.-2017-11-28/DetectorId :portkey.aws.guardduty.-2017-11-28/InvitedAt] :locations {"accountId" "AccountId", "detectorId" "DetectorId", "email" "Email", "invitedAt" "InvitedAt", "masterId" "MasterId", "relationshipStatus" "RelationshipStatus", "updatedAt" "UpdatedAt"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/--long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-threat-intel-set-response/format (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/threat-intel-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-threat-intel-set-response/status (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/threat-intel-set-status))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-threat-intel-set-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.get-threat-intel-set-response/Format :portkey.aws.guardduty.-2017-11-28/Location :portkey.aws.guardduty.-2017-11-28/Name :portkey.aws.guardduty.-2017-11-28.get-threat-intel-set-response/Status] :locations {"format" "Format", "location" "Location", "name" "Name", "status" "Status"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/neq (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/--string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.list-detectors-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/list-detectors-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/MaxResults :portkey.aws.guardduty.-2017-11-28.list-detectors-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/tags (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/tag) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/archive-findings-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/location (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/delete-threat-intel-set-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.get-members-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/members (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/member) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/finding-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/finding-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/updateipset-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.updateipset-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.updateipset-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/updateipset-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.updateipset-request/DetectorId :portkey.aws.guardduty.-2017-11-28.updateipset-request/IpSetId] :opt-un [:portkey.aws.guardduty.-2017-11-28/Activate :portkey.aws.guardduty.-2017-11-28/Location :portkey.aws.guardduty.-2017-11-28/Name] :locations {"activate" "Activate", "location" "Location", "name" "Name"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.geo-location/lat (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--double))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.geo-location/lon (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--double))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/geo-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.geo-location/Lat :portkey.aws.guardduty.-2017-11-28.geo-location/Lon] :locations {"lat" "Lat", "lon" "Lon"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/list-invitations-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/Invitations :portkey.aws.guardduty.-2017-11-28/NextToken] :locations {"invitations" "Invitations", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.update-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.update-threat-intel-set-request/threat-intel-set-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/update-threat-intel-set-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.update-threat-intel-set-request/ThreatIntelSetId :portkey.aws.guardduty.-2017-11-28.update-threat-intel-set-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/Activate :portkey.aws.guardduty.-2017-11-28/Location :portkey.aws.guardduty.-2017-11-28/Name] :locations {"activate" "Activate", "location" "Location", "name" "Name"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/finding-types (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/finding-type) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/list-detectors-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/DetectorIds :portkey.aws.guardduty.-2017-11-28/NextToken] :locations {"detectorIds" "DetectorIds", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/stop-monitoring-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.list-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/list-findings-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.list-findings-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/FindingCriteria :portkey.aws.guardduty.-2017-11-28/MaxResults :portkey.aws.guardduty.-2017-11-28/NextToken :portkey.aws.guardduty.-2017-11-28/SortCriteria] :locations {"findingCriteria" "FindingCriteria", "maxResults" "MaxResults", "nextToken" "NextToken", "sortCriteria" "SortCriteria"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.getipset-response/format (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/ip-set-format))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.getipset-response/status (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/ip-set-status))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/getipset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.getipset-response/Format :portkey.aws.guardduty.-2017-11-28/Location :portkey.aws.guardduty.-2017-11-28/Name :portkey.aws.guardduty.-2017-11-28.getipset-response/Status] :locations {"format" "Format", "location" "Location", "name" "Name", "status" "Status"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/--list-of-port-probe-detail (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/port-probe-detail) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-master-account-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-master-account-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.get-master-account-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/domain (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.list-invitations-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/list-invitations-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/MaxResults :portkey.aws.guardduty.-2017-11-28.list-invitations-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/private-dns-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.local-port-details/port (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.local-port-details/port-name (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/local-port-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.local-port-details/Port :portkey.aws.guardduty.-2017-11-28.local-port-details/PortName] :locations {"port" "Port", "portName" "PortName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.remote-ip-details/ip-addressv4 (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/remote-ip-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/City :portkey.aws.guardduty.-2017-11-28/Country :portkey.aws.guardduty.-2017-11-28/GeoLocation :portkey.aws.guardduty.-2017-11-28.remote-ip-details/IpAddressV4 :portkey.aws.guardduty.-2017-11-28/Organization] :locations {"city" "City", "country" "Country", "geoLocation" "GeoLocation", "ipAddressV4" "IpAddressV4", "organization" "Organization"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/ip-set-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:inactive "INACTIVE", :deleted "DELETED", "DEACTIVATING" "DEACTIVATING", "ACTIVATING" "ACTIVATING", :delete-pending "DELETE_PENDING", "ERROR" "ERROR", :active "ACTIVE", "INACTIVE" "INACTIVE", "ACTIVE" "ACTIVE", "DELETE_PENDING" "DELETE_PENDING", :error "ERROR", "DELETED" "DELETED", :deactivating "DEACTIVATING", :activating "ACTIVATING"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/deleteipset-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/--boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/threat-intel-set-status (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {:inactive "INACTIVE", :deleted "DELETED", "DEACTIVATING" "DEACTIVATING", "ACTIVATING" "ACTIVATING", :delete-pending "DELETE_PENDING", "ERROR" "ERROR", :active "ACTIVE", "INACTIVE" "INACTIVE", "ACTIVE" "ACTIVE", "DELETE_PENDING" "DELETE_PENDING", :error "ERROR", "DELETED" "DELETED", :deactivating "DEACTIVATING", :activating "ACTIVATING"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/domain-details (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/dns-request-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/Domain] :locations {"domain" "Domain"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/update-findings-feedback-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding-statistics/count-by-severity (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--map-of-count-by-severity-finding-statistic))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/finding-statistics (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.finding-statistics/CountBySeverity] :locations {"countBySeverity" "CountBySeverity"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.master/account-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.master/relationship-status (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/master (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.master/AccountId :portkey.aws.guardduty.-2017-11-28/InvitationId :portkey.aws.guardduty.-2017-11-28/InvitedAt :portkey.aws.guardduty.-2017-11-28.master/RelationshipStatus] :locations {"accountId" "AccountId", "invitationId" "InvitationId", "invitedAt" "InvitedAt", "relationshipStatus" "RelationshipStatus"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.stop-monitoring-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/stop-monitoring-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.stop-monitoring-members-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/account-detail (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28/Email :portkey.aws.guardduty.-2017-11-28/AccountId] :opt-un [] :locations {"accountId" "AccountId", "email" "Email"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-findings-statistics-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-findings-statistics-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.get-findings-statistics-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/FindingCriteria :portkey.aws.guardduty.-2017-11-28/FindingStatisticTypes] :locations {"findingCriteria" "FindingCriteria", "findingStatisticTypes" "FindingStatisticTypes"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/account-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.network-connection-action/blocked (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.network-connection-action/connection-direction (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.network-connection-action/protocol (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/network-connection-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.network-connection-action/Blocked :portkey.aws.guardduty.-2017-11-28.network-connection-action/ConnectionDirection :portkey.aws.guardduty.-2017-11-28/LocalPortDetails :portkey.aws.guardduty.-2017-11-28.network-connection-action/Protocol :portkey.aws.guardduty.-2017-11-28/RemoteIpDetails :portkey.aws.guardduty.-2017-11-28/RemotePortDetails] :locations {"blocked" "Blocked", "connectionDirection" "ConnectionDirection", "localPortDetails" "LocalPortDetails", "protocol" "Protocol", "remoteIpDetails" "RemoteIpDetails", "remotePortDetails" "RemotePortDetails"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.access-key-details/access-key-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.access-key-details/principal-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.access-key-details/user-name (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.access-key-details/user-type (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/access-key-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.access-key-details/AccessKeyId :portkey.aws.guardduty.-2017-11-28.access-key-details/PrincipalId :portkey.aws.guardduty.-2017-11-28.access-key-details/UserName :portkey.aws.guardduty.-2017-11-28.access-key-details/UserType] :locations {"accessKeyId" "AccessKeyId", "principalId" "PrincipalId", "userName" "UserName", "userType" "UserType"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/master-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/eq (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/--string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.network-interface/public-dns-name (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.network-interface/public-ip (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.network-interface/subnet-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.network-interface/vpc-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/network-interface (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.network-interface/PublicDnsName :portkey.aws.guardduty.-2017-11-28.network-interface/PublicIp :portkey.aws.guardduty.-2017-11-28/Ipv6Addresses :portkey.aws.guardduty.-2017-11-28.network-interface/SubnetId :portkey.aws.guardduty.-2017-11-28/SecurityGroups :portkey.aws.guardduty.-2017-11-28/PrivateDnsName :portkey.aws.guardduty.-2017-11-28.network-interface/VpcId :portkey.aws.guardduty.-2017-11-28/PrivateIpAddresses :portkey.aws.guardduty.-2017-11-28/PrivateIpAddress] :locations {"subnetId" "SubnetId", "privateIpAddress" "PrivateIpAddress", "privateIpAddresses" "PrivateIpAddresses", "publicDnsName" "PublicDnsName", "publicIp" "PublicIp", "ipv6Addresses" "Ipv6Addresses", "vpcId" "VpcId", "privateDnsName" "PrivateDnsName", "securityGroups" "SecurityGroups"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/unarchive-findings-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.delete-threat-intel-set-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.delete-threat-intel-set-request/threat-intel-set-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/delete-threat-intel-set-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.delete-threat-intel-set-request/ThreatIntelSetId :portkey.aws.guardduty.-2017-11-28.delete-threat-intel-set-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-invitations-count-response/invitations-count (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-invitations-count-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.get-invitations-count-response/InvitationsCount] :locations {"invitationsCount" "InvitationsCount"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.create-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/create-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.create-members-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/AccountDetails] :locations {"accountDetails" "AccountDetails"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.invitation/account-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.invitation/relationship-status (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/invitation (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.invitation/AccountId :portkey.aws.guardduty.-2017-11-28/InvitationId :portkey.aws.guardduty.-2017-11-28/InvitedAt :portkey.aws.guardduty.-2017-11-28.invitation/RelationshipStatus] :locations {"accountId" "AccountId", "invitationId" "InvitationId", "invitedAt" "InvitedAt", "relationshipStatus" "RelationshipStatus"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/unprocessed-accounts (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/unprocessed-account) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/--map-of-count-by-severity-finding-statistic (clojure.spec.alpha/map-of :portkey.aws.guardduty.-2017-11-28/--string :portkey.aws.guardduty.-2017-11-28/count-by-severity-finding-statistic))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/delete-invitations-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.disassociate-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/disassociate-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.disassociate-members-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/finding-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/finding-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-detector-response/status (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/detector-status))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-detector-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/CreatedAt :portkey.aws.guardduty.-2017-11-28/ServiceRole :portkey.aws.guardduty.-2017-11-28.get-detector-response/Status :portkey.aws.guardduty.-2017-11-28/UpdatedAt] :locations {"createdAt" "CreatedAt", "serviceRole" "ServiceRole", "status" "Status", "updatedAt" "UpdatedAt"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/findings (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/finding) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/created-at (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/start-monitoring-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-invitations-count-request (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/private-ip-addresses (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/private-ip-address-details) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/--double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/detector-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/threat-intel-set-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-findings-statistics-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/FindingStatistics] :locations {"findingStatistics" "FindingStatistics"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.update-findings-feedback-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/update-findings-feedback-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.update-findings-feedback-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/Comments :portkey.aws.guardduty.-2017-11-28/Feedback :portkey.aws.guardduty.-2017-11-28/FindingIds] :locations {"comments" "Comments", "feedback" "Feedback", "findingIds" "FindingIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/order-by (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"ASC" "ASC", :asc "ASC", "DESC" "DESC", :desc "DESC"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/account-details (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/account-detail) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/create-threat-intel-set-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/ThreatIntelSetId] :locations {"threatIntelSetId" "ThreatIntelSetId"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.deleteipset-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.deleteipset-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/deleteipset-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.deleteipset-request/DetectorId :portkey.aws.guardduty.-2017-11-28.deleteipset-request/IpSetId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/product-codes (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/product-code) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/list-findings-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/FindingIds :portkey.aws.guardduty.-2017-11-28/NextToken] :locations {"findingIds" "FindingIds", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/accept-invitation-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.city/city-name (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/city (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.city/CityName] :locations {"cityName" "CityName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/detector-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/detector-id) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/updated-at (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-findings-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/Findings] :locations {"findings" "Findings"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 50))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.tag/key (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.tag/value (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/tag (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.tag/Key :portkey.aws.guardduty.-2017-11-28.tag/Value] :locations {"key" "Key", "value" "Value"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/finding-statistic-types (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/finding-statistic-type) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.resource/resource-type (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/resource (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/AccessKeyDetails :portkey.aws.guardduty.-2017-11-28/InstanceDetails :portkey.aws.guardduty.-2017-11-28.resource/ResourceType] :locations {"accessKeyDetails" "AccessKeyDetails", "instanceDetails" "InstanceDetails", "resourceType" "ResourceType"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.condition/gt (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.condition/gte (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.condition/lt (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.condition/lte (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/condition (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/Eq :portkey.aws.guardduty.-2017-11-28.condition/Gt :portkey.aws.guardduty.-2017-11-28.condition/Gte :portkey.aws.guardduty.-2017-11-28.condition/Lt :portkey.aws.guardduty.-2017-11-28.condition/Lte :portkey.aws.guardduty.-2017-11-28/Neq] :locations {"eq" "Eq", "gt" "Gt", "gte" "Gte", "lt" "Lt", "lte" "Lte", "neq" "Neq"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/delete-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.product-code/code (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.product-code/product-type (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/product-code (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.product-code/Code :portkey.aws.guardduty.-2017-11-28.product-code/ProductType] :locations {"code" "Code", "productType" "ProductType"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.finding-criteria/criterion (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--map-of-condition))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/finding-criteria (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.finding-criteria/Criterion] :locations {"criterion" "Criterion"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/list-threat-intel-sets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/NextToken :portkey.aws.guardduty.-2017-11-28/ThreatIntelSetIds] :locations {"nextToken" "NextToken", "threatIntelSetIds" "ThreatIntelSetIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/--integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/decline-invitations-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/AccountIds] :locations {"accountIds" "AccountIds"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/create-detector-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/Enable] :locations {"enable" "Enable"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.service/count (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.service/event-first-seen (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.service/event-last-seen (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.service/service-name (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.service/resource-role (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.service/user-feedback (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.service/archived (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--boolean))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/service (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.service/Count :portkey.aws.guardduty.-2017-11-28.service/EventFirstSeen :portkey.aws.guardduty.-2017-11-28.service/EventLastSeen :portkey.aws.guardduty.-2017-11-28/DetectorId :portkey.aws.guardduty.-2017-11-28.service/ServiceName :portkey.aws.guardduty.-2017-11-28.service/ResourceRole :portkey.aws.guardduty.-2017-11-28.service/UserFeedback :portkey.aws.guardduty.-2017-11-28/Action :portkey.aws.guardduty.-2017-11-28.service/Archived] :locations {"eventFirstSeen" "EventFirstSeen", "detectorId" "DetectorId", "resourceRole" "ResourceRole", "count" "Count", "archived" "Archived", "userFeedback" "UserFeedback", "action" "Action", "serviceName" "ServiceName", "eventLastSeen" "EventLastSeen"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.remote-port-details/port (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--integer))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.remote-port-details/port-name (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/remote-port-details (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.remote-port-details/Port :portkey.aws.guardduty.-2017-11-28.remote-port-details/PortName] :locations {"port" "Port", "portName" "PortName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/feedback (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"USEFUL" "USEFUL", :useful "USEFUL", "NOT_USEFUL" "NOT_USEFUL", :not-useful "NOT_USEFUL"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/account-ids (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/--string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/invite-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/UnprocessedAccounts] :locations {"unprocessedAccounts" "UnprocessedAccounts"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/invited-at (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.aws-api-call-action/api (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.aws-api-call-action/caller-type (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.aws-api-call-action/service-name (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/aws-api-call-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.aws-api-call-action/Api :portkey.aws.guardduty.-2017-11-28.aws-api-call-action/CallerType :portkey.aws.guardduty.-2017-11-28/DomainDetails :portkey.aws.guardduty.-2017-11-28/RemoteIpDetails :portkey.aws.guardduty.-2017-11-28.aws-api-call-action/ServiceName] :locations {"api" "Api", "callerType" "CallerType", "domainDetails" "DomainDetails", "remoteIpDetails" "RemoteIpDetails", "serviceName" "ServiceName"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.error-response/message (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.error-response/type (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/error-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.error-response/Message :portkey.aws.guardduty.-2017-11-28.error-response/Type] :locations {"message" "Message", "__type" "Type"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/ipv6-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.sort-criteria/attribute-name (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/sort-criteria (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.sort-criteria/AttributeName :portkey.aws.guardduty.-2017-11-28/OrderBy] :locations {"attributeName" "AttributeName", "orderBy" "OrderBy"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/invitations (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/invitation) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/create-sample-findings-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.accept-invitation-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/accept-invitation-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.accept-invitation-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/InvitationId :portkey.aws.guardduty.-2017-11-28/MasterId] :locations {"invitationId" "InvitationId", "masterId" "MasterId"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.action/action-type (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.action/ActionType :portkey.aws.guardduty.-2017-11-28/AwsApiCallAction :portkey.aws.guardduty.-2017-11-28/DnsRequestAction :portkey.aws.guardduty.-2017-11-28/NetworkConnectionAction :portkey.aws.guardduty.-2017-11-28/PortProbeAction] :locations {"actionType" "ActionType", "awsApiCallAction" "AwsApiCallAction", "dnsRequestAction" "DnsRequestAction", "networkConnectionAction" "NetworkConnectionAction", "portProbeAction" "PortProbeAction"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/count-by-severity-finding-statistic (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-detector-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-detector-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.get-detector-request/DetectorId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.update-detector-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/update-detector-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.update-detector-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/Enable] :locations {"enable" "Enable"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.getipset-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.getipset-request/ip-set-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/getipset-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.getipset-request/DetectorId :portkey.aws.guardduty.-2017-11-28.getipset-request/IpSetId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.iam-instance-profile/arn (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.iam-instance-profile/id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/iam-instance-profile (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28.iam-instance-profile/Arn :portkey.aws.guardduty.-2017-11-28.iam-instance-profile/Id] :locations {"arn" "Arn", "id" "Id"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/update-detector-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/createipset-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/IpSetId] :locations {"ipSetId" "IpSetId"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/--map-of-condition (clojure.spec.alpha/map-of :portkey.aws.guardduty.-2017-11-28/--string :portkey.aws.guardduty.-2017-11-28/condition))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/list-members-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/Members :portkey.aws.guardduty.-2017-11-28/NextToken] :locations {"members" "Members", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.list-members-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.list-members-request/next-token (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.list-members-request/only-associated (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/list-members-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.list-members-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/MaxResults :portkey.aws.guardduty.-2017-11-28.list-members-request/NextToken :portkey.aws.guardduty.-2017-11-28.list-members-request/OnlyAssociated] :locations {}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/finding-statistic-type (clojure.spec.alpha/conformer (clojure.core/let [m__13766__auto__ {"COUNT_BY_SEVERITY" "COUNT_BY_SEVERITY", :count-by-severity "COUNT_BY_SEVERITY"}] (clojure.core/fn [s__13767__auto__] (m__13766__auto__ s__13767__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/private-ip-address (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/network-interfaces (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.guardduty.-2017-11-28/network-interface) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/listipsets-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.guardduty.-2017-11-28/IpSetIds :portkey.aws.guardduty.-2017-11-28/NextToken] :locations {"ipSetIds" "IpSetIds", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28.get-findings-request/detector-id (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/--string))
(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/get-findings-request (portkey.aws/json-keys :req-un [:portkey.aws.guardduty.-2017-11-28.get-findings-request/DetectorId] :opt-un [:portkey.aws.guardduty.-2017-11-28/FindingIds :portkey.aws.guardduty.-2017-11-28/SortCriteria] :locations {"findingIds" "FindingIds", "sortCriteria" "SortCriteria"}))

(clojure.spec.alpha/def :portkey.aws.guardduty.-2017-11-28/activate clojure.core/boolean?)

(clojure.core/defn get-invitations-count "Returns the count of all GuardDuty membership invitations that were sent to the\ncurrent member account except the currently accepted invitation." ([] (get-invitations-count {})) ([get-invitations-count-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "GET" "/invitation/count" get-invitations-count-request :portkey.aws.guardduty.-2017-11-28/get-invitations-count-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/get-invitations-count-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-invitations-count :args (clojure.spec.alpha/? :portkey.aws.guardduty.-2017-11-28/get-invitations-count-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/get-invitations-count-response))

(clojure.core/defn create-threat-intel-set "Create a new ThreatIntelSet. ThreatIntelSets consist of known malicious IP\naddresses. GuardDuty generates findings based on ThreatIntelSets." ([create-threat-intel-set-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/threatintelset" create-threat-intel-set-request :portkey.aws.guardduty.-2017-11-28/create-threat-intel-set-request {:payload nil, :move {"activate" "Activate", "format" "Format", "location" "Location", "name" "Name"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/create-threat-intel-set-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/create-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/create-threat-intel-set-response))

(clojure.core/defn updateipset "Updates the IPSet specified by the IPSet ID." ([updateipset-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/ipset/{ipSetId}" updateipset-request :portkey.aws.guardduty.-2017-11-28/updateipset-request {:payload nil, :move {"activate" "Activate", "location" "Location", "name" "Name"}, :headers {}, :uri {"detectorId" "DetectorId", "ipSetId" "IpSetId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/updateipset-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef updateipset :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/updateipset-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/updateipset-response))

(clojure.core/defn get-members "Retrieves GuardDuty member accounts (to the current GuardDuty master account)\nspecified by the account IDs." ([get-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/member/get" get-members-request :portkey.aws.guardduty.-2017-11-28/get-members-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/get-members-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/get-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/get-members-response))

(clojure.core/defn getipset "Retrieves the IPSet specified by the IPSet ID." ([getipset-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "GET" "/detector/{detectorId}/ipset/{ipSetId}" getipset-request :portkey.aws.guardduty.-2017-11-28/getipset-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId", "ipSetId" "IpSetId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/getipset-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef getipset :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/getipset-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/getipset-response))

(clojure.core/defn list-findings "Lists Amazon GuardDuty findings for the specified detector ID." ([list-findings-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/findings" list-findings-request :portkey.aws.guardduty.-2017-11-28/list-findings-request {:payload nil, :move {"findingCriteria" "FindingCriteria", "maxResults" "MaxResults", "nextToken" "NextToken", "sortCriteria" "SortCriteria"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/list-findings-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/list-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/list-findings-response))

(clojure.core/defn get-threat-intel-set "Retrieves the ThreatIntelSet that is specified by the ThreatIntelSet ID." ([get-threat-intel-set-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "GET" "/detector/{detectorId}/threatintelset/{threatIntelSetId}" get-threat-intel-set-request :portkey.aws.guardduty.-2017-11-28/get-threat-intel-set-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId", "threatIntelSetId" "ThreatIntelSetId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/get-threat-intel-set-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/get-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/get-threat-intel-set-response))

(clojure.core/defn update-findings-feedback "Marks specified Amazon GuardDuty findings as useful or not useful." ([update-findings-feedback-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/findings/feedback" update-findings-feedback-request :portkey.aws.guardduty.-2017-11-28/update-findings-feedback-request {:payload nil, :move {"comments" "Comments", "feedback" "Feedback", "findingIds" "FindingIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/update-findings-feedback-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-findings-feedback :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/update-findings-feedback-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/update-findings-feedback-response))

(clojure.core/defn decline-invitations "Declines invitations sent to the current member account by AWS account specified\nby their account IDs." ([] (decline-invitations {})) ([decline-invitations-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/invitation/decline" decline-invitations-request :portkey.aws.guardduty.-2017-11-28/decline-invitations-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/decline-invitations-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef decline-invitations :args (clojure.spec.alpha/? :portkey.aws.guardduty.-2017-11-28/decline-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/decline-invitations-response))

(clojure.core/defn create-sample-findings "Generates example findings of types specified by the list of finding types. If\n'NULL' is specified for findingTypes, the API generates example findings of all\nsupported finding types." ([create-sample-findings-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/findings/create" create-sample-findings-request :portkey.aws.guardduty.-2017-11-28/create-sample-findings-request {:payload nil, :move {"findingTypes" "FindingTypes"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/create-sample-findings-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-sample-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/create-sample-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/create-sample-findings-response))

(clojure.core/defn get-master-account "Provides the details for the GuardDuty master account to the current GuardDuty\nmember account." ([get-master-account-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "GET" "/detector/{detectorId}/master" get-master-account-request :portkey.aws.guardduty.-2017-11-28/get-master-account-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/get-master-account-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-master-account :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/get-master-account-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/get-master-account-response))

(clojure.core/defn create-detector "Creates a single Amazon GuardDuty detector. A detector is an object that\nrepresents the GuardDuty service. A detector must be created in order for\nGuardDuty to become operational." ([] (create-detector {})) ([create-detector-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector" create-detector-request :portkey.aws.guardduty.-2017-11-28/create-detector-request {:payload nil, :move {"enable" "Enable"}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/create-detector-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-detector :args (clojure.spec.alpha/? :portkey.aws.guardduty.-2017-11-28/create-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/create-detector-response))

(clojure.core/defn disassociate-members "Disassociates GuardDuty member accounts (to the current GuardDuty master\naccount) specified by the account IDs." ([disassociate-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/member/disassociate" disassociate-members-request :portkey.aws.guardduty.-2017-11-28/disassociate-members-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/disassociate-members-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef disassociate-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/disassociate-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/disassociate-members-response))

(clojure.core/defn delete-threat-intel-set "Deletes ThreatIntelSet specified by the ThreatIntelSet ID." ([delete-threat-intel-set-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "DELETE" "/detector/{detectorId}/threatintelset/{threatIntelSetId}" delete-threat-intel-set-request :portkey.aws.guardduty.-2017-11-28/delete-threat-intel-set-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId", "threatIntelSetId" "ThreatIntelSetId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/delete-threat-intel-set-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/delete-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/delete-threat-intel-set-response))

(clojure.core/defn list-threat-intel-sets "Lists the ThreatIntelSets of the GuardDuty service specified by the detector ID." ([list-threat-intel-sets-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "GET" "/detector/{detectorId}/threatintelset" list-threat-intel-sets-request :portkey.aws.guardduty.-2017-11-28/list-threat-intel-sets-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} 200 :portkey.aws.guardduty.-2017-11-28/list-threat-intel-sets-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-threat-intel-sets :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/list-threat-intel-sets-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/list-threat-intel-sets-response))

(clojure.core/defn update-detector "Updates an Amazon GuardDuty detector specified by the detectorId." ([update-detector-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}" update-detector-request :portkey.aws.guardduty.-2017-11-28/update-detector-request {:payload nil, :move {"enable" "Enable"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/update-detector-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/update-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/update-detector-response))

(clojure.core/defn get-detector "Retrieves an Amazon GuardDuty detector specified by the detectorId." ([get-detector-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "GET" "/detector/{detectorId}" get-detector-request :portkey.aws.guardduty.-2017-11-28/get-detector-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/get-detector-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/get-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/get-detector-response))

(clojure.core/defn invite-members "Invites other AWS accounts (created as members of the current AWS account by\nCreateMembers) to enable GuardDuty and allow the current AWS account to view and\nmanage these accounts' GuardDuty findings on their behalf as the master account." ([invite-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/member/invite" invite-members-request :portkey.aws.guardduty.-2017-11-28/invite-members-request {:payload nil, :move {"accountIds" "AccountIds", "disableEmailNotification" "DisableEmailNotification", "message" "Message"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/invite-members-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef invite-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/invite-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/invite-members-response))

(clojure.core/defn createipset "Creates a new IPSet - a list of trusted IP addresses that have been whitelisted\nfor secure communication with AWS infrastructure and applications." ([createipset-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/ipset" createipset-request :portkey.aws.guardduty.-2017-11-28/createipset-request {:payload nil, :move {"activate" "Activate", "format" "Format", "location" "Location", "name" "Name"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/createipset-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef createipset :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/createipset-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/createipset-response))

(clojure.core/defn update-threat-intel-set "Updates the ThreatIntelSet specified by ThreatIntelSet ID." ([update-threat-intel-set-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/threatintelset/{threatIntelSetId}" update-threat-intel-set-request :portkey.aws.guardduty.-2017-11-28/update-threat-intel-set-request {:payload nil, :move {"activate" "Activate", "location" "Location", "name" "Name"}, :headers {}, :uri {"detectorId" "DetectorId", "threatIntelSetId" "ThreatIntelSetId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/update-threat-intel-set-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef update-threat-intel-set :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/update-threat-intel-set-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/update-threat-intel-set-response))

(clojure.core/defn list-invitations "Lists all GuardDuty membership invitations that were sent to the current AWS\naccount." ([] (list-invitations {})) ([list-invitations-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "GET" "/invitation" list-invitations-request :portkey.aws.guardduty.-2017-11-28/list-invitations-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} 200 :portkey.aws.guardduty.-2017-11-28/list-invitations-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-invitations :args (clojure.spec.alpha/? :portkey.aws.guardduty.-2017-11-28/list-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/list-invitations-response))

(clojure.core/defn disassociate-from-master-account "Disassociates the current GuardDuty member account from its master account." ([disassociate-from-master-account-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/master/disassociate" disassociate-from-master-account-request :portkey.aws.guardduty.-2017-11-28/disassociate-from-master-account-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/disassociate-from-master-account-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef disassociate-from-master-account :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/disassociate-from-master-account-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/disassociate-from-master-account-response))

(clojure.core/defn archive-findings "Archives Amazon GuardDuty findings specified by the list of finding IDs." ([archive-findings-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/findings/archive" archive-findings-request :portkey.aws.guardduty.-2017-11-28/archive-findings-request {:payload nil, :move {"findingIds" "FindingIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/archive-findings-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef archive-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/archive-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/archive-findings-response))

(clojure.core/defn stop-monitoring-members "Disables GuardDuty from monitoring findings of the member accounts specified by\nthe account IDs. After running this command, a master GuardDuty account can run\nStartMonitoringMembers to re-enable GuardDuty to monitor these members’\nfindings." ([stop-monitoring-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/member/stop" stop-monitoring-members-request :portkey.aws.guardduty.-2017-11-28/stop-monitoring-members-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/stop-monitoring-members-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef stop-monitoring-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/stop-monitoring-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/stop-monitoring-members-response))

(clojure.core/defn start-monitoring-members "Re-enables GuardDuty to monitor findings of the member accounts specified by the\naccount IDs. A master GuardDuty account can run this command after disabling\nGuardDuty from monitoring these members' findings by running\nStopMonitoringMembers." ([start-monitoring-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/member/start" start-monitoring-members-request :portkey.aws.guardduty.-2017-11-28/start-monitoring-members-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/start-monitoring-members-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef start-monitoring-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/start-monitoring-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/start-monitoring-members-response))

(clojure.core/defn deleteipset "Deletes the IPSet specified by the IPSet ID." ([deleteipset-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "DELETE" "/detector/{detectorId}/ipset/{ipSetId}" deleteipset-request :portkey.aws.guardduty.-2017-11-28/deleteipset-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId", "ipSetId" "IpSetId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/deleteipset-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef deleteipset :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/deleteipset-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/deleteipset-response))

(clojure.core/defn get-findings-statistics "Lists Amazon GuardDuty findings' statistics for the specified detector ID." ([get-findings-statistics-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/findings/statistics" get-findings-statistics-request :portkey.aws.guardduty.-2017-11-28/get-findings-statistics-request {:payload nil, :move {"findingCriteria" "FindingCriteria", "findingStatisticTypes" "FindingStatisticTypes"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/get-findings-statistics-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-findings-statistics :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/get-findings-statistics-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/get-findings-statistics-response))

(clojure.core/defn accept-invitation "Accepts the invitation to be monitored by a master GuardDuty account." ([accept-invitation-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/master" accept-invitation-request :portkey.aws.guardduty.-2017-11-28/accept-invitation-request {:payload nil, :move {"invitationId" "InvitationId", "masterId" "MasterId"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/accept-invitation-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef accept-invitation :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/accept-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/accept-invitation-response))

(clojure.core/defn create-members "Creates member accounts of the current AWS account by specifying a list of AWS\naccount IDs. The current AWS account can then invite these members to manage\nGuardDuty in their accounts." ([create-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/member" create-members-request :portkey.aws.guardduty.-2017-11-28/create-members-request {:payload nil, :move {"accountDetails" "AccountDetails"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/create-members-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef create-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/create-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/create-members-response))

(clojure.core/defn unarchive-findings "Unarchives Amazon GuardDuty findings specified by the list of finding IDs." ([unarchive-findings-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/findings/unarchive" unarchive-findings-request :portkey.aws.guardduty.-2017-11-28/unarchive-findings-request {:payload nil, :move {"findingIds" "FindingIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/unarchive-findings-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef unarchive-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/unarchive-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/unarchive-findings-response))

(clojure.core/defn list-members "Lists details about all member accounts for the current GuardDuty master\naccount." ([list-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "GET" "/detector/{detectorId}/member" list-members-request :portkey.aws.guardduty.-2017-11-28/list-members-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken", "onlyAssociated" "OnlyAssociated"}} 200 :portkey.aws.guardduty.-2017-11-28/list-members-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/list-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/list-members-response))

(clojure.core/defn delete-invitations "Deletes invitations sent to the current member account by AWS accounts specified\nby their account IDs." ([] (delete-invitations {})) ([delete-invitations-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/invitation/delete" delete-invitations-request :portkey.aws.guardduty.-2017-11-28/delete-invitations-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/delete-invitations-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-invitations :args (clojure.spec.alpha/? :portkey.aws.guardduty.-2017-11-28/delete-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/delete-invitations-response))

(clojure.core/defn delete-detector "Deletes a Amazon GuardDuty detector specified by the detector ID." ([delete-detector-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "DELETE" "/detector/{detectorId}" delete-detector-request :portkey.aws.guardduty.-2017-11-28/delete-detector-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/delete-detector-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-detector :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/delete-detector-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/delete-detector-response))

(clojure.core/defn list-detectors "Lists detectorIds of all the existing Amazon GuardDuty detector resources." ([] (list-detectors {})) ([list-detectors-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "GET" "/detector" list-detectors-request :portkey.aws.guardduty.-2017-11-28/list-detectors-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} 200 :portkey.aws.guardduty.-2017-11-28/list-detectors-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef list-detectors :args (clojure.spec.alpha/? :portkey.aws.guardduty.-2017-11-28/list-detectors-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/list-detectors-response))

(clojure.core/defn get-findings "Describes Amazon GuardDuty findings specified by finding IDs." ([get-findings-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/findings/get" get-findings-request :portkey.aws.guardduty.-2017-11-28/get-findings-request {:payload nil, :move {"findingIds" "FindingIds", "sortCriteria" "SortCriteria"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/get-findings-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef get-findings :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/get-findings-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/get-findings-response))

(clojure.core/defn listipsets "Lists the IPSets of the GuardDuty service specified by the detector ID." ([listipsets-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "GET" "/detector/{detectorId}/ipset" listipsets-request :portkey.aws.guardduty.-2017-11-28/listipsets-request {:payload nil, :move {}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}} 200 :portkey.aws.guardduty.-2017-11-28/listipsets-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef listipsets :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/listipsets-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/listipsets-response))

(clojure.core/defn delete-members "Deletes GuardDuty member accounts (to the current GuardDuty master account)\nspecified by the account IDs." ([delete-members-request] (portkey.aws/-rest-json-call portkey.aws.guardduty.-2017-11-28/endpoints "POST" "/detector/{detectorId}/member/delete" delete-members-request :portkey.aws.guardduty.-2017-11-28/delete-members-request {:payload nil, :move {"accountIds" "AccountIds"}, :headers {}, :uri {"detectorId" "DetectorId"}, :querystring {}} 200 :portkey.aws.guardduty.-2017-11-28/delete-members-response {"BadRequestException" :portkey.aws.guardduty.-2017-11-28/bad-request-exception, "InternalServerErrorException" :portkey.aws.guardduty.-2017-11-28/internal-server-error-exception})))
(clojure.spec.alpha/fdef delete-members :args (clojure.spec.alpha/tuple :portkey.aws.guardduty.-2017-11-28/delete-members-request) :ret (clojure.spec.alpha/and :portkey.aws.guardduty.-2017-11-28/delete-members-response))
