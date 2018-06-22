(ns portkey.aws.serverlessrepo.-2017-09-08 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "serverlessrepo", :region "ap-northeast-1"},
    :ssl-common-name "serverlessrepo.ap-northeast-1.amazonaws.com",
    :endpoint "https://serverlessrepo.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "serverlessrepo", :region "eu-west-1"},
    :ssl-common-name "serverlessrepo.eu-west-1.amazonaws.com",
    :endpoint "https://serverlessrepo.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "serverlessrepo", :region "us-east-2"},
    :ssl-common-name "serverlessrepo.us-east-2.amazonaws.com",
    :endpoint "https://serverlessrepo.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "serverlessrepo", :region "ap-southeast-2"},
    :ssl-common-name "serverlessrepo.ap-southeast-2.amazonaws.com",
    :endpoint "https://serverlessrepo.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "serverlessrepo", :region "sa-east-1"},
    :ssl-common-name "serverlessrepo.sa-east-1.amazonaws.com",
    :endpoint "https://serverlessrepo.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "serverlessrepo", :region "ap-southeast-1"},
    :ssl-common-name "serverlessrepo.ap-southeast-1.amazonaws.com",
    :endpoint "https://serverlessrepo.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "serverlessrepo", :region "ap-northeast-2"},
    :ssl-common-name "serverlessrepo.ap-northeast-2.amazonaws.com",
    :endpoint "https://serverlessrepo.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "serverlessrepo", :region "ca-central-1"},
    :ssl-common-name "serverlessrepo.ca-central-1.amazonaws.com",
    :endpoint "https://serverlessrepo.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "serverlessrepo", :region "eu-central-1"},
    :ssl-common-name "serverlessrepo.eu-central-1.amazonaws.com",
    :endpoint "https://serverlessrepo.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "serverlessrepo", :region "eu-west-2"},
    :ssl-common-name "serverlessrepo.eu-west-2.amazonaws.com",
    :endpoint "https://serverlessrepo.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "serverlessrepo", :region "us-west-2"},
    :ssl-common-name "serverlessrepo.us-west-2.amazonaws.com",
    :endpoint "https://serverlessrepo.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "serverlessrepo", :region "us-east-1"},
    :ssl-common-name "serverlessrepo.us-east-1.amazonaws.com",
    :endpoint "https://serverlessrepo.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "serverlessrepo", :region "us-west-1"},
    :ssl-common-name "serverlessrepo.us-west-1.amazonaws.com",
    :endpoint "https://serverlessrepo.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "serverlessrepo", :region "ap-south-1"},
    :ssl-common-name "serverlessrepo.ap-south-1.amazonaws.com",
    :endpoint "https://serverlessrepo.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/application (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.application/Description :portkey.aws.serverlessrepo.-2017-09-08.application/Author :portkey.aws.serverlessrepo.-2017-09-08.application/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.application/Name] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.application/LicenseUrl :portkey.aws.serverlessrepo.-2017-09-08.application/SpdxLicenseId :portkey.aws.serverlessrepo.-2017-09-08.application/Labels :portkey.aws.serverlessrepo.-2017-09-08.application/HomePageUrl :portkey.aws.serverlessrepo.-2017-09-08.application/ReadmeUrl :portkey.aws.serverlessrepo.-2017-09-08.application/CreationTime :portkey.aws.serverlessrepo.-2017-09-08/Version] :locations {"spdxLicenseId" "SpdxLicenseId", "applicationId" "ApplicationId", "author" "Author", "name" "Name", "labels" "Labels", "homePageUrl" "HomePageUrl", "creationTime" "CreationTime", "version" "Version", "readmeUrl" "ReadmeUrl", "licenseUrl" "LicenseUrl", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.internal-server-error-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.internal-server-error-exception/ErrorCode :portkey.aws.serverlessrepo.-2017-09-08.internal-server-error-exception/Message] :locations {"errorCode" "ErrorCode", "message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-policy-statement/actions (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-policy-statement/principals (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-policy-statement/statement-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/application-policy-statement (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.application-policy-statement/Principals :portkey.aws.serverlessrepo.-2017-09-08.application-policy-statement/Actions] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.application-policy-statement/StatementId] :locations {"actions" "Actions", "principals" "Principals", "statementId" "StatementId"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--list-of-application-summary (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo.-2017-09-08/application-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.bad-request-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.bad-request-exception/ErrorCode :portkey.aws.serverlessrepo.-2017-09-08.bad-request-exception/Message] :locations {"errorCode" "ErrorCode", "message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/readme-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/template-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/license-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/create-application-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.create-application-request/LicenseUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/TemplateUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/ReadmeBody :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/SourceCodeUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/TemplateBody :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/SpdxLicenseId :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/Description :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/Labels :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/LicenseBody :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/HomePageUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/ReadmeUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/Author :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/Name :portkey.aws.serverlessrepo.-2017-09-08.create-application-request/SemanticVersion] :locations {"spdxLicenseId" "SpdxLicenseId", "templateBody" "TemplateBody", "readmeBody" "ReadmeBody", "author" "Author", "name" "Name", "labels" "Labels", "templateUrl" "TemplateUrl", "licenseBody" "LicenseBody", "homePageUrl" "HomePageUrl", "readmeUrl" "ReadmeUrl", "licenseUrl" "LicenseUrl", "sourceCodeUrl" "SourceCodeUrl", "semanticVersion" "SemanticVersion", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-policy/statements (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-application-policy-statement))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/application-policy (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.application-policy/Statements] :opt-un [] :locations {"statements" "Statements"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-input/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-input/template-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-input/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/create-application-version-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.create-application-version-input/SourceCodeUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-input/TemplateBody :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-input/TemplateUrl] :locations {"sourceCodeUrl" "SourceCodeUrl", "templateBody" "TemplateBody", "templateUrl" "TemplateUrl"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--list-of-application-policy-statement (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo.-2017-09-08/application-policy-statement) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.list-application-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.list-application-versions-response/versions (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-version-summary))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/list-application-versions-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.list-application-versions-response/NextToken :portkey.aws.serverlessrepo.-2017-09-08.list-application-versions-response/Versions] :locations {"nextToken" "NextToken", "versions" "Versions"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.forbidden-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.forbidden-exception/ErrorCode :portkey.aws.serverlessrepo.-2017-09-08.forbidden-exception/Message] :locations {"errorCode" "ErrorCode", "message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-request/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-request/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-request/template-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-request/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/create-application-version-request (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.create-application-version-request/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-request/SemanticVersion] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.create-application-version-request/SourceCodeUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-request/TemplateBody :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-request/TemplateUrl] :locations {"sourceCodeUrl" "SourceCodeUrl", "templateBody" "TemplateBody", "templateUrl" "TemplateUrl"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-page/applications (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-application-summary))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-page/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/application-page (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.application-page/Applications] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.application-page/NextToken] :locations {"applications" "Applications", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--list-of-version-summary (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo.-2017-09-08/version-summary) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-summary/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-summary/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-summary/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-summary/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-summary/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-summary/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-summary/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-summary/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/application-summary (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.application-summary/Description :portkey.aws.serverlessrepo.-2017-09-08.application-summary/Author :portkey.aws.serverlessrepo.-2017-09-08.application-summary/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.application-summary/Name] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.application-summary/CreationTime :portkey.aws.serverlessrepo.-2017-09-08.application-summary/HomePageUrl :portkey.aws.serverlessrepo.-2017-09-08.application-summary/Labels :portkey.aws.serverlessrepo.-2017-09-08.application-summary/SpdxLicenseId] :locations {"applicationId" "ApplicationId", "author" "Author", "creationTime" "CreationTime", "description" "Description", "homePageUrl" "HomePageUrl", "labels" "Labels", "name" "Name", "spdxLicenseId" "SpdxLicenseId"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/update-application-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.update-application-response/LicenseUrl :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/SpdxLicenseId :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/Description :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/Labels :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/HomePageUrl :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/ReadmeUrl :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/CreationTime :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/Author :portkey.aws.serverlessrepo.-2017-09-08/Version :portkey.aws.serverlessrepo.-2017-09-08.update-application-response/Name] :locations {"spdxLicenseId" "SpdxLicenseId", "applicationId" "ApplicationId", "author" "Author", "name" "Name", "labels" "Labels", "homePageUrl" "HomePageUrl", "creationTime" "CreationTime", "version" "Version", "readmeUrl" "ReadmeUrl", "licenseUrl" "LicenseUrl", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/readme-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/template-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/license-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/create-application-input (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.create-application-input/Description :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/Name :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/Author] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.create-application-input/LicenseUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/TemplateUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/ReadmeBody :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/SourceCodeUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/TemplateBody :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/SpdxLicenseId :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/Labels :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/LicenseBody :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/HomePageUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/ReadmeUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-input/SemanticVersion] :locations {"spdxLicenseId" "SpdxLicenseId", "templateBody" "TemplateBody", "readmeBody" "ReadmeBody", "author" "Author", "name" "Name", "labels" "Labels", "templateUrl" "TemplateUrl", "licenseBody" "LicenseBody", "homePageUrl" "HomePageUrl", "readmeUrl" "ReadmeUrl", "licenseUrl" "LicenseUrl", "sourceCodeUrl" "SourceCodeUrl", "semanticVersion" "SemanticVersion", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-version-page/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.application-version-page/versions (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-version-summary))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/application-version-page (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.application-version-page/Versions] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.application-version-page/NextToken] :locations {"nextToken" "NextToken", "versions" "Versions"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-request/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/get-application-request (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.get-application-request/ApplicationId] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.get-application-request/SemanticVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.too-many-requests-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/too-many-requests-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.too-many-requests-exception/ErrorCode :portkey.aws.serverlessrepo.-2017-09-08.too-many-requests-exception/Message] :locations {"errorCode" "ErrorCode", "message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/parameter-definitions (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-parameter-definition))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/create-application-version-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/CreationTime :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/ParameterDefinitions :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/SemanticVersion :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/SourceCodeUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-version-response/TemplateUrl] :locations {"applicationId" "ApplicationId", "creationTime" "CreationTime", "parameterDefinitions" "ParameterDefinitions", "semanticVersion" "SemanticVersion", "sourceCodeUrl" "SourceCodeUrl", "templateUrl" "TemplateUrl"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--list-of-parameter-definition (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo.-2017-09-08/parameter-definition) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.version-summary/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.version-summary/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.version-summary/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.version-summary/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/version-summary (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.version-summary/CreationTime :portkey.aws.serverlessrepo.-2017-09-08.version-summary/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.version-summary/SemanticVersion] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.version-summary/SourceCodeUrl] :locations {"applicationId" "ApplicationId", "creationTime" "CreationTime", "semanticVersion" "SemanticVersion", "sourceCodeUrl" "SourceCodeUrl"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.change-set-details/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.change-set-details/change-set-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.change-set-details/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.change-set-details/stack-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/change-set-details (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.change-set-details/ChangeSetId :portkey.aws.serverlessrepo.-2017-09-08.change-set-details/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.change-set-details/StackId :portkey.aws.serverlessrepo.-2017-09-08.change-set-details/SemanticVersion] :opt-un [] :locations {"applicationId" "ApplicationId", "changeSetId" "ChangeSetId", "semanticVersion" "SemanticVersion", "stackId" "StackId"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo.-2017-09-08/--string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.put-application-policy-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.put-application-policy-request/statements (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-application-policy-statement))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/put-application-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.put-application-policy-request/ApplicationId] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.put-application-policy-request/Statements] :locations {"statements" "Statements"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.conflict-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.conflict-exception/ErrorCode :portkey.aws.serverlessrepo.-2017-09-08.conflict-exception/Message] :locations {"errorCode" "ErrorCode", "message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.not-found-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.not-found-exception/ErrorCode :portkey.aws.serverlessrepo.-2017-09-08.not-found-exception/Message] :locations {"errorCode" "ErrorCode", "message" "Message"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.list-applications-request/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/list-applications-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08/MaxItems :portkey.aws.serverlessrepo.-2017-09-08.list-applications-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/create-application-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.create-application-response/LicenseUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/SpdxLicenseId :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/Description :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/Labels :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/HomePageUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/ReadmeUrl :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/CreationTime :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/Author :portkey.aws.serverlessrepo.-2017-09-08/Version :portkey.aws.serverlessrepo.-2017-09-08.create-application-response/Name] :locations {"spdxLicenseId" "SpdxLicenseId", "applicationId" "ApplicationId", "author" "Author", "name" "Name", "labels" "Labels", "homePageUrl" "HomePageUrl", "creationTime" "CreationTime", "version" "Version", "readmeUrl" "ReadmeUrl", "licenseUrl" "LicenseUrl", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/max-items (clojure.spec.alpha/and clojure.core/int? (fn* [p1__13828__13829__auto__] (clojure.core/<= 1 p1__13828__13829__auto__)) (fn* [p1__13830__13831__auto__] (clojure.core/<= p1__13830__13831__auto__ 100))))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-policy-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/get-application-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.get-application-policy-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-request/parameter-overrides (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-parameter-value))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-request/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-request/stack-name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/create-cloud-formation-change-set-request (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-request/ApplicationId] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-request/ParameterOverrides :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-request/SemanticVersion :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-request/StackName] :locations {"parameterOverrides" "ParameterOverrides", "semanticVersion" "SemanticVersion", "stackName" "StackName"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.delete-application-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/delete-application-request (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.delete-application-request/ApplicationId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/get-application-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.get-application-response/LicenseUrl :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/SpdxLicenseId :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/Description :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/Labels :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/HomePageUrl :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/ReadmeUrl :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/CreationTime :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/Author :portkey.aws.serverlessrepo.-2017-09-08/Version :portkey.aws.serverlessrepo.-2017-09-08.get-application-response/Name] :locations {"spdxLicenseId" "SpdxLicenseId", "applicationId" "ApplicationId", "author" "Author", "name" "Name", "labels" "Labels", "homePageUrl" "HomePageUrl", "creationTime" "CreationTime", "version" "Version", "readmeUrl" "ReadmeUrl", "licenseUrl" "LicenseUrl", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/readme-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/update-application-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.update-application-input/Author :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/Description :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/HomePageUrl :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/Labels :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/ReadmeBody :portkey.aws.serverlessrepo.-2017-09-08.update-application-input/ReadmeUrl] :locations {"author" "Author", "description" "Description", "homePageUrl" "HomePageUrl", "labels" "Labels", "readmeBody" "ReadmeBody", "readmeUrl" "ReadmeUrl"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.version/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.version/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.version/parameter-definitions (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-parameter-definition))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.version/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.version/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.version/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/version (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.version/TemplateUrl :portkey.aws.serverlessrepo.-2017-09-08.version/ParameterDefinitions :portkey.aws.serverlessrepo.-2017-09-08.version/CreationTime :portkey.aws.serverlessrepo.-2017-09-08.version/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.version/SemanticVersion] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.version/SourceCodeUrl] :locations {"applicationId" "ApplicationId", "creationTime" "CreationTime", "parameterDefinitions" "ParameterDefinitions", "semanticVersion" "SemanticVersion", "sourceCodeUrl" "SourceCodeUrl", "templateUrl" "TemplateUrl"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.get-application-policy-response/statements (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-application-policy-statement))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/get-application-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.get-application-policy-response/Statements] :locations {"statements" "Statements"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/type (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/min-value (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--integer))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/allowed-values (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/min-length (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--integer))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/max-value (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--integer))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/max-length (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--integer))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/allowed-pattern (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/referenced-by-resources (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/default-value (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/no-echo (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--boolean))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/constraint-description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/parameter-definition (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/ReferencedByResources :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/Name] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/Type :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/MinValue :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/AllowedValues :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/MinLength :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/MaxValue :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/MaxLength :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/AllowedPattern :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/Description :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/DefaultValue :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/NoEcho :portkey.aws.serverlessrepo.-2017-09-08.parameter-definition/ConstraintDescription] :locations {"referencedByResources" "ReferencedByResources", "minLength" "MinLength", "allowedPattern" "AllowedPattern", "maxValue" "MaxValue", "maxLength" "MaxLength", "noEcho" "NoEcho", "name" "Name", "allowedValues" "AllowedValues", "constraintDescription" "ConstraintDescription", "type" "Type", "defaultValue" "DefaultValue", "minValue" "MinValue", "description" "Description"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--integer (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-input/parameter-overrides (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-parameter-value))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-input/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/create-cloud-formation-change-set-input (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-input/StackName] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-input/ParameterOverrides :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-input/SemanticVersion] :locations {"parameterOverrides" "ParameterOverrides", "semanticVersion" "SemanticVersion", "stackName" "StackName"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-response/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-response/change-set-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-response/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-response/stack-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/create-cloud-formation-change-set-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-response/ApplicationId :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-response/ChangeSetId :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-response/SemanticVersion :portkey.aws.serverlessrepo.-2017-09-08.create-cloud-formation-change-set-response/StackId] :locations {"applicationId" "ApplicationId", "changeSetId" "ChangeSetId", "semanticVersion" "SemanticVersion", "stackId" "StackId"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.list-application-versions-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.list-application-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/list-application-versions-request (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.list-application-versions-request/ApplicationId] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08/MaxItems :portkey.aws.serverlessrepo.-2017-09-08.list-application-versions-request/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.put-application-policy-response/statements (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-application-policy-statement))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/put-application-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.put-application-policy-response/Statements] :locations {"statements" "Statements"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.list-applications-response/applications (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of-application-summary))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.list-applications-response/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/list-applications-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.list-applications-response/Applications :portkey.aws.serverlessrepo.-2017-09-08.list-applications-response/NextToken] :locations {"applications" "Applications", "nextToken" "NextToken"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--list-of--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/readme-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/update-application-request (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.update-application-request/ApplicationId] :opt-un [:portkey.aws.serverlessrepo.-2017-09-08.update-application-request/Author :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/Description :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/HomePageUrl :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/Labels :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/ReadmeBody :portkey.aws.serverlessrepo.-2017-09-08.update-application-request/ReadmeUrl] :locations {"author" "Author", "description" "Description", "homePageUrl" "HomePageUrl", "labels" "Labels", "readmeBody" "ReadmeBody", "readmeUrl" "ReadmeUrl"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-value/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08.parameter-value/value (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/--string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/parameter-value (portkey.aws/json-keys :req-un [:portkey.aws.serverlessrepo.-2017-09-08.parameter-value/Value :portkey.aws.serverlessrepo.-2017-09-08.parameter-value/Name] :opt-un [] :locations {"name" "Name", "value" "Value"}))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.-2017-09-08/--list-of-parameter-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo.-2017-09-08/parameter-value) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13687__13688__auto__] (if (clojure.core/sequential? p1__13687__13688__auto__) p1__13687__13688__auto__ [p1__13687__13688__auto__])))))

(clojure.core/defn list-applications "Lists applications owned by the requester." ([] (list-applications {})) ([list-applications-request] (portkey.aws/-rest-json-call portkey.aws.serverlessrepo.-2017-09-08/endpoints "GET" "/applications" list-applications-request :portkey.aws.serverlessrepo.-2017-09-08/list-applications-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"maxItems" "MaxItems", "nextToken" "NextToken"}} 200 :portkey.aws.serverlessrepo.-2017-09-08/list-applications-response {"NotFoundException" :portkey.aws.serverlessrepo.-2017-09-08/not-found-exception, "BadRequestException" :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception})))
(clojure.spec.alpha/fdef list-applications :args (clojure.spec.alpha/? :portkey.aws.serverlessrepo.-2017-09-08/list-applications-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/list-applications-response))

(clojure.core/defn create-application-version "Creates an application version." ([create-application-version-request] (portkey.aws/-rest-json-call portkey.aws.serverlessrepo.-2017-09-08/endpoints "PUT" "/applications/{applicationId}/versions/{semanticVersion}" create-application-version-request :portkey.aws.serverlessrepo.-2017-09-08/create-application-version-request {:payload nil, :move {"sourceCodeUrl" "SourceCodeUrl", "templateBody" "TemplateBody", "templateUrl" "TemplateUrl"}, :headers {}, :uri {"applicationId" "ApplicationId", "semanticVersion" "SemanticVersion"}, :querystring {}} 201 :portkey.aws.serverlessrepo.-2017-09-08/create-application-version-response {"TooManyRequestsException" :portkey.aws.serverlessrepo.-2017-09-08/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception, "ConflictException" :portkey.aws.serverlessrepo.-2017-09-08/conflict-exception, "ForbiddenException" :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception})))
(clojure.spec.alpha/fdef create-application-version :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo.-2017-09-08/create-application-version-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/create-application-version-response))

(clojure.core/defn delete-application "Deletes the specified application." ([delete-application-request] (portkey.aws/-rest-json-call portkey.aws.serverlessrepo.-2017-09-08/endpoints "DELETE" "/applications/{applicationId}" delete-application-request :portkey.aws.serverlessrepo.-2017-09-08/delete-application-request {:payload nil, :move {}, :headers {}, :uri {"applicationId" "ApplicationId"}, :querystring {}} 204 nil {"BadRequestException" :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception, "NotFoundException" :portkey.aws.serverlessrepo.-2017-09-08/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo.-2017-09-08/too-many-requests-exception, "ConflictException" :portkey.aws.serverlessrepo.-2017-09-08/conflict-exception})))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo.-2017-09-08/delete-application-request) :ret clojure.core/true?)

(clojure.core/defn get-application "Gets the specified application." ([get-application-request] (portkey.aws/-rest-json-call portkey.aws.serverlessrepo.-2017-09-08/endpoints "GET" "/applications/{applicationId}" get-application-request :portkey.aws.serverlessrepo.-2017-09-08/get-application-request {:payload nil, :move {}, :headers {}, :uri {"applicationId" "ApplicationId"}, :querystring {"semanticVersion" "SemanticVersion"}} 200 :portkey.aws.serverlessrepo.-2017-09-08/get-application-response {"NotFoundException" :portkey.aws.serverlessrepo.-2017-09-08/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo.-2017-09-08/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception})))
(clojure.spec.alpha/fdef get-application :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo.-2017-09-08/get-application-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/get-application-response))

(clojure.core/defn update-application "Updates the specified application." ([update-application-request] (portkey.aws/-rest-json-call portkey.aws.serverlessrepo.-2017-09-08/endpoints "PATCH" "/applications/{applicationId}" update-application-request :portkey.aws.serverlessrepo.-2017-09-08/update-application-request {:payload nil, :move {"author" "Author", "description" "Description", "homePageUrl" "HomePageUrl", "labels" "Labels", "readmeBody" "ReadmeBody", "readmeUrl" "ReadmeUrl"}, :headers {}, :uri {"applicationId" "ApplicationId"}, :querystring {}} 200 :portkey.aws.serverlessrepo.-2017-09-08/update-application-response {"BadRequestException" :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception, "NotFoundException" :portkey.aws.serverlessrepo.-2017-09-08/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo.-2017-09-08/too-many-requests-exception, "ConflictException" :portkey.aws.serverlessrepo.-2017-09-08/conflict-exception})))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo.-2017-09-08/update-application-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/update-application-response))

(clojure.core/defn create-cloud-formation-change-set "Creates an AWS CloudFormation ChangeSet for the given application." ([create-cloud-formation-change-set-request] (portkey.aws/-rest-json-call portkey.aws.serverlessrepo.-2017-09-08/endpoints "POST" "/applications/{applicationId}/changesets" create-cloud-formation-change-set-request :portkey.aws.serverlessrepo.-2017-09-08/create-cloud-formation-change-set-request {:payload nil, :move {"parameterOverrides" "ParameterOverrides", "semanticVersion" "SemanticVersion", "stackName" "StackName"}, :headers {}, :uri {"applicationId" "ApplicationId"}, :querystring {}} 201 :portkey.aws.serverlessrepo.-2017-09-08/create-cloud-formation-change-set-response {"TooManyRequestsException" :portkey.aws.serverlessrepo.-2017-09-08/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception})))
(clojure.spec.alpha/fdef create-cloud-formation-change-set :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo.-2017-09-08/create-cloud-formation-change-set-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/create-cloud-formation-change-set-response))

(clojure.core/defn create-application "Creates an application, optionally including an AWS SAM file to create the first\napplication version in the same call." ([] (create-application {})) ([create-application-request] (portkey.aws/-rest-json-call portkey.aws.serverlessrepo.-2017-09-08/endpoints "POST" "/applications" create-application-request :portkey.aws.serverlessrepo.-2017-09-08/create-application-request {:payload nil, :move {"spdxLicenseId" "SpdxLicenseId", "templateBody" "TemplateBody", "readmeBody" "ReadmeBody", "author" "Author", "name" "Name", "labels" "Labels", "templateUrl" "TemplateUrl", "licenseBody" "LicenseBody", "homePageUrl" "HomePageUrl", "readmeUrl" "ReadmeUrl", "licenseUrl" "LicenseUrl", "sourceCodeUrl" "SourceCodeUrl", "semanticVersion" "SemanticVersion", "description" "Description"}, :headers {}, :uri {}, :querystring {}} 201 :portkey.aws.serverlessrepo.-2017-09-08/create-application-response {"TooManyRequestsException" :portkey.aws.serverlessrepo.-2017-09-08/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception, "ConflictException" :portkey.aws.serverlessrepo.-2017-09-08/conflict-exception, "ForbiddenException" :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception})))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/? :portkey.aws.serverlessrepo.-2017-09-08/create-application-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/create-application-response))

(clojure.core/defn put-application-policy "Puts the policy for the specified application." ([put-application-policy-request] (portkey.aws/-rest-json-call portkey.aws.serverlessrepo.-2017-09-08/endpoints "PUT" "/applications/{applicationId}/policy" put-application-policy-request :portkey.aws.serverlessrepo.-2017-09-08/put-application-policy-request {:payload nil, :move {"statements" "Statements"}, :headers {}, :uri {"applicationId" "ApplicationId"}, :querystring {}} 200 :portkey.aws.serverlessrepo.-2017-09-08/put-application-policy-response {"NotFoundException" :portkey.aws.serverlessrepo.-2017-09-08/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo.-2017-09-08/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception})))
(clojure.spec.alpha/fdef put-application-policy :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo.-2017-09-08/put-application-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/put-application-policy-response))

(clojure.core/defn get-application-policy "Gets the policy for the specified application." ([get-application-policy-request] (portkey.aws/-rest-json-call portkey.aws.serverlessrepo.-2017-09-08/endpoints "GET" "/applications/{applicationId}/policy" get-application-policy-request :portkey.aws.serverlessrepo.-2017-09-08/get-application-policy-request {:payload nil, :move {}, :headers {}, :uri {"applicationId" "ApplicationId"}, :querystring {}} 200 :portkey.aws.serverlessrepo.-2017-09-08/get-application-policy-response {"NotFoundException" :portkey.aws.serverlessrepo.-2017-09-08/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo.-2017-09-08/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception})))
(clojure.spec.alpha/fdef get-application-policy :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo.-2017-09-08/get-application-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/get-application-policy-response))

(clojure.core/defn list-application-versions "Lists versions for the specified application." ([list-application-versions-request] (portkey.aws/-rest-json-call portkey.aws.serverlessrepo.-2017-09-08/endpoints "GET" "/applications/{applicationId}/versions" list-application-versions-request :portkey.aws.serverlessrepo.-2017-09-08/list-application-versions-request {:payload nil, :move {}, :headers {}, :uri {"applicationId" "ApplicationId"}, :querystring {"maxItems" "MaxItems", "nextToken" "NextToken"}} 200 :portkey.aws.serverlessrepo.-2017-09-08/list-application-versions-response {"NotFoundException" :portkey.aws.serverlessrepo.-2017-09-08/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo.-2017-09-08/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo.-2017-09-08/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo.-2017-09-08/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo.-2017-09-08/forbidden-exception})))
(clojure.spec.alpha/fdef list-application-versions :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo.-2017-09-08/list-application-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo.-2017-09-08/list-application-versions-response))
