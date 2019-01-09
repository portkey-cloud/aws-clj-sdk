(ns portkey.aws.serverlessrepo (:require [portkey.aws]))

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

(clojure.core/declare ser-application-policy-statement)

(clojure.core/declare ser-list-of-application-policy-statement)

(clojure.core/declare ser-string)

(clojure.core/declare ser-list-of-string)

(clojure.core/declare ser-max-items)

(clojure.core/declare ser-parameter-value)

(clojure.core/declare ser-list-of-parameter-value)

(clojure.core/defn- ser-application-policy-statement [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-list-of-string (:principals input)) #:http.request.field{:name "Principals", :shape "__listOf__string", :location-name "principals"}) (clojure.core/into (ser-list-of-string (:actions input)) #:http.request.field{:name "Actions", :shape "__listOf__string", :location-name "actions"})], :shape "ApplicationPolicyStatement", :type "structure"} (clojure.core/contains? input :statement-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :statement-id)) #:http.request.field{:name "StatementId", :shape "__string", :location-name "statementId"}))))

(clojure.core/defn- ser-list-of-application-policy-statement [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-application-policy-statement coll) #:http.request.field{:shape "ApplicationPolicyStatement"}))) input), :shape "__listOfApplicationPolicyStatement", :type "list"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "__string"})

(clojure.core/defn- ser-list-of-string [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "__string"}))) input), :shape "__listOf__string", :type "list"})

(clojure.core/defn- ser-max-items [input] #:http.request.field{:value input, :shape "MaxItems"})

(clojure.core/defn- ser-parameter-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:value input)) #:http.request.field{:name "Value", :shape "__string", :location-name "value"}) (clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"})], :shape "ParameterValue", :type "structure"}))

(clojure.core/defn- ser-list-of-parameter-value [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-value coll) #:http.request.field{:shape "ParameterValue"}))) input), :shape "__listOfParameterValue", :type "list"})

(clojure.core/defn- req-create-application-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"}) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "__string", :location-name "name"}) (clojure.core/into (ser-string (input :author)) #:http.request.field{:name "Author", :shape "__string", :location-name "author"})]} (clojure.core/contains? input :license-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :license-url)) #:http.request.field{:name "LicenseUrl", :shape "__string", :location-name "licenseUrl"})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :template-url)) #:http.request.field{:name "TemplateUrl", :shape "__string", :location-name "templateUrl"})) (clojure.core/contains? input :readme-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :readme-body)) #:http.request.field{:name "ReadmeBody", :shape "__string", :location-name "readmeBody"})) (clojure.core/contains? input :source-code-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-code-url)) #:http.request.field{:name "SourceCodeUrl", :shape "__string", :location-name "sourceCodeUrl"})) (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "__string", :location-name "templateBody"})) (clojure.core/contains? input :spdx-license-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :spdx-license-id)) #:http.request.field{:name "SpdxLicenseId", :shape "__string", :location-name "spdxLicenseId"})) (clojure.core/contains? input :labels) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :labels)) #:http.request.field{:name "Labels", :shape "__listOf__string", :location-name "labels"})) (clojure.core/contains? input :license-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :license-body)) #:http.request.field{:name "LicenseBody", :shape "__string", :location-name "licenseBody"})) (clojure.core/contains? input :home-page-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :home-page-url)) #:http.request.field{:name "HomePageUrl", :shape "__string", :location-name "homePageUrl"})) (clojure.core/contains? input :readme-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :readme-url)) #:http.request.field{:name "ReadmeUrl", :shape "__string", :location-name "readmeUrl"})) (clojure.core/contains? input :semantic-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :semantic-version)) #:http.request.field{:name "SemanticVersion", :shape "__string", :location-name "semanticVersion"}))))

(clojure.core/defn- req-create-application-version-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "__string", :location "uri", :location-name "applicationId"}) (clojure.core/into (ser-string (input :semantic-version)) #:http.request.field{:name "SemanticVersion", :shape "__string", :location "uri", :location-name "semanticVersion"})]} (clojure.core/contains? input :source-code-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :source-code-url)) #:http.request.field{:name "SourceCodeUrl", :shape "__string", :location-name "sourceCodeUrl"})) (clojure.core/contains? input :template-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :template-body)) #:http.request.field{:name "TemplateBody", :shape "__string", :location-name "templateBody"})) (clojure.core/contains? input :template-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :template-url)) #:http.request.field{:name "TemplateUrl", :shape "__string", :location-name "templateUrl"}))))

(clojure.core/defn- req-get-application-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "__string", :location "uri", :location-name "applicationId"})]} (clojure.core/contains? input :semantic-version) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :semantic-version)) #:http.request.field{:name "SemanticVersion", :shape "__string", :location "querystring", :location-name "semanticVersion"}))))

(clojure.core/defn- req-put-application-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "__string", :location "uri", :location-name "applicationId"})], :body [(clojure.core/into (ser-list-of-application-policy-statement (input :statements)) #:http.request.field{:name "Statements", :shape "__listOfApplicationPolicyStatement", :location-name "statements"})]}))

(clojure.core/defn- req-list-applications-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems", :location "querystring", :location-name "maxItems"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-get-application-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "__string", :location "uri", :location-name "applicationId"})]}))

(clojure.core/defn- req-create-cloud-formation-change-set-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "__string", :location "uri", :location-name "applicationId"})], :body [(clojure.core/into (ser-string (input :stack-name)) #:http.request.field{:name "StackName", :shape "__string", :location-name "stackName"})]} (clojure.core/contains? input :parameter-overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-parameter-value (input :parameter-overrides)) #:http.request.field{:name "ParameterOverrides", :shape "__listOfParameterValue", :location-name "parameterOverrides"})) (clojure.core/contains? input :semantic-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :semantic-version)) #:http.request.field{:name "SemanticVersion", :shape "__string", :location-name "semanticVersion"}))))

(clojure.core/defn- req-delete-application-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "__string", :location "uri", :location-name "applicationId"})]}))

(clojure.core/defn- req-list-application-versions-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "__string", :location "uri", :location-name "applicationId"})]} (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-items (input :max-items)) #:http.request.field{:name "MaxItems", :shape "MaxItems", :location "querystring", :location-name "maxItems"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "__string", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-update-application-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-string (input :application-id)) #:http.request.field{:name "ApplicationId", :shape "__string", :location "uri", :location-name "applicationId"})]} (clojure.core/contains? input :author) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :author)) #:http.request.field{:name "Author", :shape "__string", :location-name "author"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :description)) #:http.request.field{:name "Description", :shape "__string", :location-name "description"})) (clojure.core/contains? input :home-page-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :home-page-url)) #:http.request.field{:name "HomePageUrl", :shape "__string", :location-name "homePageUrl"})) (clojure.core/contains? input :labels) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-of-string (input :labels)) #:http.request.field{:name "Labels", :shape "__listOf__string", :location-name "labels"})) (clojure.core/contains? input :readme-body) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :readme-body)) #:http.request.field{:name "ReadmeBody", :shape "__string", :location-name "readmeBody"})) (clojure.core/contains? input :readme-url) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :readme-url)) #:http.request.field{:name "ReadmeUrl", :shape "__string", :location-name "readmeUrl"}))))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/application (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.application/description :portkey.aws.serverlessrepo.application/author :portkey.aws.serverlessrepo.application/application-id :portkey.aws.serverlessrepo.application/name] :opt-un [:portkey.aws.serverlessrepo.application/license-url :portkey.aws.serverlessrepo.application/spdx-license-id :portkey.aws.serverlessrepo.application/labels :portkey.aws.serverlessrepo.application/home-page-url :portkey.aws.serverlessrepo.application/readme-url :portkey.aws.serverlessrepo.application/creation-time :portkey.aws.serverlessrepo/version]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.internal-server-error-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.internal-server-error-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/internal-server-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.internal-server-error-exception/error-code :portkey.aws.serverlessrepo.internal-server-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-policy-statement/actions (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-policy-statement/principals (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-policy-statement/statement-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/application-policy-statement (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.application-policy-statement/principals :portkey.aws.serverlessrepo.application-policy-statement/actions] :opt-un [:portkey.aws.serverlessrepo.application-policy-statement/statement-id]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/list-of-application-summary (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo/application-summary))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.bad-request-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.bad-request-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/bad-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.bad-request-exception/error-code :portkey.aws.serverlessrepo.bad-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/readme-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/template-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/license-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-request/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/create-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.create-application-request/description :portkey.aws.serverlessrepo.create-application-request/name :portkey.aws.serverlessrepo.create-application-request/author] :opt-un [:portkey.aws.serverlessrepo.create-application-request/license-url :portkey.aws.serverlessrepo.create-application-request/template-url :portkey.aws.serverlessrepo.create-application-request/readme-body :portkey.aws.serverlessrepo.create-application-request/source-code-url :portkey.aws.serverlessrepo.create-application-request/template-body :portkey.aws.serverlessrepo.create-application-request/spdx-license-id :portkey.aws.serverlessrepo.create-application-request/labels :portkey.aws.serverlessrepo.create-application-request/license-body :portkey.aws.serverlessrepo.create-application-request/home-page-url :portkey.aws.serverlessrepo.create-application-request/readme-url :portkey.aws.serverlessrepo.create-application-request/semantic-version]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-policy/statements (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-application-policy-statement))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/application-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.application-policy/statements] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-input/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-input/template-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-input/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/create-application-version-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.create-application-version-input/source-code-url :portkey.aws.serverlessrepo.create-application-version-input/template-body :portkey.aws.serverlessrepo.create-application-version-input/template-url]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/list-of-application-policy-statement (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo/application-policy-statement))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.list-application-versions-response/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.list-application-versions-response/versions (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-version-summary))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/list-application-versions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.list-application-versions-response/next-token :portkey.aws.serverlessrepo.list-application-versions-response/versions]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.forbidden-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.forbidden-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/forbidden-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.forbidden-exception/error-code :portkey.aws.serverlessrepo.forbidden-exception/message]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-request/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-request/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-request/template-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-request/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/create-application-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.create-application-version-request/application-id :portkey.aws.serverlessrepo.create-application-version-request/semantic-version] :opt-un [:portkey.aws.serverlessrepo.create-application-version-request/source-code-url :portkey.aws.serverlessrepo.create-application-version-request/template-body :portkey.aws.serverlessrepo.create-application-version-request/template-url]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-page/applications (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-application-summary))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-page/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/application-page (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.application-page/applications] :opt-un [:portkey.aws.serverlessrepo.application-page/next-token]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/list-of-version-summary (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo/version-summary))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-summary/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-summary/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-summary/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-summary/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-summary/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-summary/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-summary/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-summary/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/application-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.application-summary/description :portkey.aws.serverlessrepo.application-summary/author :portkey.aws.serverlessrepo.application-summary/application-id :portkey.aws.serverlessrepo.application-summary/name] :opt-un [:portkey.aws.serverlessrepo.application-summary/creation-time :portkey.aws.serverlessrepo.application-summary/home-page-url :portkey.aws.serverlessrepo.application-summary/labels :portkey.aws.serverlessrepo.application-summary/spdx-license-id]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-response/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-response/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-response/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-response/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-response/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-response/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-response/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-response/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-response/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-response/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/update-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.update-application-response/license-url :portkey.aws.serverlessrepo.update-application-response/spdx-license-id :portkey.aws.serverlessrepo.update-application-response/application-id :portkey.aws.serverlessrepo.update-application-response/description :portkey.aws.serverlessrepo.update-application-response/labels :portkey.aws.serverlessrepo.update-application-response/home-page-url :portkey.aws.serverlessrepo.update-application-response/readme-url :portkey.aws.serverlessrepo.update-application-response/creation-time :portkey.aws.serverlessrepo.update-application-response/author :portkey.aws.serverlessrepo/version :portkey.aws.serverlessrepo.update-application-response/name]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/readme-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/template-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/license-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-input/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/create-application-input (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.create-application-input/description :portkey.aws.serverlessrepo.create-application-input/name :portkey.aws.serverlessrepo.create-application-input/author] :opt-un [:portkey.aws.serverlessrepo.create-application-input/license-url :portkey.aws.serverlessrepo.create-application-input/template-url :portkey.aws.serverlessrepo.create-application-input/readme-body :portkey.aws.serverlessrepo.create-application-input/source-code-url :portkey.aws.serverlessrepo.create-application-input/template-body :portkey.aws.serverlessrepo.create-application-input/spdx-license-id :portkey.aws.serverlessrepo.create-application-input/labels :portkey.aws.serverlessrepo.create-application-input/license-body :portkey.aws.serverlessrepo.create-application-input/home-page-url :portkey.aws.serverlessrepo.create-application-input/readme-url :portkey.aws.serverlessrepo.create-application-input/semantic-version]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-version-page/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.application-version-page/versions (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-version-summary))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/application-version-page (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.application-version-page/versions] :opt-un [:portkey.aws.serverlessrepo.application-version-page/next-token]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-request/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/get-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.get-application-request/application-id] :opt-un [:portkey.aws.serverlessrepo.get-application-request/semantic-version]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.too-many-requests-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.too-many-requests-exception/error-code :portkey.aws.serverlessrepo.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-response/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-response/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-response/parameter-definitions (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-parameter-definition))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-response/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-response/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-version-response/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/create-application-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.create-application-version-response/application-id :portkey.aws.serverlessrepo.create-application-version-response/creation-time :portkey.aws.serverlessrepo.create-application-version-response/parameter-definitions :portkey.aws.serverlessrepo.create-application-version-response/semantic-version :portkey.aws.serverlessrepo.create-application-version-response/source-code-url :portkey.aws.serverlessrepo.create-application-version-response/template-url]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/list-of-parameter-definition (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo/parameter-definition))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.version-summary/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.version-summary/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.version-summary/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.version-summary/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/version-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.version-summary/creation-time :portkey.aws.serverlessrepo.version-summary/application-id :portkey.aws.serverlessrepo.version-summary/semantic-version] :opt-un [:portkey.aws.serverlessrepo.version-summary/source-code-url]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.change-set-details/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.change-set-details/change-set-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.change-set-details/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.change-set-details/stack-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/change-set-details (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.change-set-details/change-set-id :portkey.aws.serverlessrepo.change-set-details/application-id :portkey.aws.serverlessrepo.change-set-details/stack-id :portkey.aws.serverlessrepo.change-set-details/semantic-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/list-of-string (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo/string))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.put-application-policy-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.put-application-policy-request/statements (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-application-policy-statement))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/put-application-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.put-application-policy-request/application-id :portkey.aws.serverlessrepo.put-application-policy-request/statements] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.conflict-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.conflict-exception/error-code :portkey.aws.serverlessrepo.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.not-found-exception/error-code (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.not-found-exception/message (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.not-found-exception/error-code :portkey.aws.serverlessrepo.not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.list-applications-request/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/list-applications-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo/max-items :portkey.aws.serverlessrepo.list-applications-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-response/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-response/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-response/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-response/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-response/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-response/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-response/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-response/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-response/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-application-response/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/create-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.create-application-response/license-url :portkey.aws.serverlessrepo.create-application-response/spdx-license-id :portkey.aws.serverlessrepo.create-application-response/application-id :portkey.aws.serverlessrepo.create-application-response/description :portkey.aws.serverlessrepo.create-application-response/labels :portkey.aws.serverlessrepo.create-application-response/home-page-url :portkey.aws.serverlessrepo.create-application-response/readme-url :portkey.aws.serverlessrepo.create-application-response/creation-time :portkey.aws.serverlessrepo.create-application-response/author :portkey.aws.serverlessrepo/version :portkey.aws.serverlessrepo.create-application-response/name]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/max-items (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-policy-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/get-application-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.get-application-policy-request/application-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-request/parameter-overrides (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-parameter-value))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-request/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-request/stack-name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/create-cloud-formation-change-set-request (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.create-cloud-formation-change-set-request/application-id :portkey.aws.serverlessrepo.create-cloud-formation-change-set-request/stack-name] :opt-un [:portkey.aws.serverlessrepo.create-cloud-formation-change-set-request/parameter-overrides :portkey.aws.serverlessrepo.create-cloud-formation-change-set-request/semantic-version]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.delete-application-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/delete-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.delete-application-request/application-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-response/license-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-response/spdx-license-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-response/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-response/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-response/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-response/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-response/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-response/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-response/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-response/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/get-application-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.get-application-response/license-url :portkey.aws.serverlessrepo.get-application-response/spdx-license-id :portkey.aws.serverlessrepo.get-application-response/application-id :portkey.aws.serverlessrepo.get-application-response/description :portkey.aws.serverlessrepo.get-application-response/labels :portkey.aws.serverlessrepo.get-application-response/home-page-url :portkey.aws.serverlessrepo.get-application-response/readme-url :portkey.aws.serverlessrepo.get-application-response/creation-time :portkey.aws.serverlessrepo.get-application-response/author :portkey.aws.serverlessrepo/version :portkey.aws.serverlessrepo.get-application-response/name]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-input/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-input/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-input/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-input/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-input/readme-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-input/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/update-application-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.update-application-input/author :portkey.aws.serverlessrepo.update-application-input/description :portkey.aws.serverlessrepo.update-application-input/home-page-url :portkey.aws.serverlessrepo.update-application-input/labels :portkey.aws.serverlessrepo.update-application-input/readme-body :portkey.aws.serverlessrepo.update-application-input/readme-url]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.version/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.version/creation-time (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.version/parameter-definitions (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-parameter-definition))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.version/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.version/source-code-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.version/template-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/version (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.version/template-url :portkey.aws.serverlessrepo.version/parameter-definitions :portkey.aws.serverlessrepo.version/creation-time :portkey.aws.serverlessrepo.version/application-id :portkey.aws.serverlessrepo.version/semantic-version] :opt-un [:portkey.aws.serverlessrepo.version/source-code-url]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.get-application-policy-response/statements (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-application-policy-statement))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/get-application-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.get-application-policy-response/statements]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/type (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/min-value (clojure.spec.alpha/and :portkey.aws.serverlessrepo/integer))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/allowed-values (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/min-length (clojure.spec.alpha/and :portkey.aws.serverlessrepo/integer))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/max-value (clojure.spec.alpha/and :portkey.aws.serverlessrepo/integer))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/max-length (clojure.spec.alpha/and :portkey.aws.serverlessrepo/integer))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/allowed-pattern (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/referenced-by-resources (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/default-value (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/no-echo (clojure.spec.alpha/and :portkey.aws.serverlessrepo/boolean))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/constraint-description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-definition/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/parameter-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.parameter-definition/referenced-by-resources :portkey.aws.serverlessrepo.parameter-definition/name] :opt-un [:portkey.aws.serverlessrepo.parameter-definition/type :portkey.aws.serverlessrepo.parameter-definition/min-value :portkey.aws.serverlessrepo.parameter-definition/allowed-values :portkey.aws.serverlessrepo.parameter-definition/min-length :portkey.aws.serverlessrepo.parameter-definition/max-value :portkey.aws.serverlessrepo.parameter-definition/max-length :portkey.aws.serverlessrepo.parameter-definition/allowed-pattern :portkey.aws.serverlessrepo.parameter-definition/description :portkey.aws.serverlessrepo.parameter-definition/default-value :portkey.aws.serverlessrepo.parameter-definition/no-echo :portkey.aws.serverlessrepo.parameter-definition/constraint-description]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-input/parameter-overrides (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-parameter-value))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-input/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-input/stack-name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/create-cloud-formation-change-set-input (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.create-cloud-formation-change-set-input/stack-name] :opt-un [:portkey.aws.serverlessrepo.create-cloud-formation-change-set-input/parameter-overrides :portkey.aws.serverlessrepo.create-cloud-formation-change-set-input/semantic-version]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-response/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-response/change-set-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-response/semantic-version (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.create-cloud-formation-change-set-response/stack-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/create-cloud-formation-change-set-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.create-cloud-formation-change-set-response/application-id :portkey.aws.serverlessrepo.create-cloud-formation-change-set-response/change-set-id :portkey.aws.serverlessrepo.create-cloud-formation-change-set-response/semantic-version :portkey.aws.serverlessrepo.create-cloud-formation-change-set-response/stack-id]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.list-application-versions-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.list-application-versions-request/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/list-application-versions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.list-application-versions-request/application-id] :opt-un [:portkey.aws.serverlessrepo/max-items :portkey.aws.serverlessrepo.list-application-versions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.put-application-policy-response/statements (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-application-policy-statement))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/put-application-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.put-application-policy-response/statements]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.list-applications-response/applications (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-application-summary))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.list-applications-response/next-token (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/list-applications-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.serverlessrepo.list-applications-response/applications :portkey.aws.serverlessrepo.list-applications-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-request/application-id (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-request/author (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-request/description (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-request/home-page-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-request/labels (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-of-string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-request/readme-body (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.update-application-request/readme-url (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/update-application-request (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.update-application-request/application-id] :opt-un [:portkey.aws.serverlessrepo.update-application-request/author :portkey.aws.serverlessrepo.update-application-request/description :portkey.aws.serverlessrepo.update-application-request/home-page-url :portkey.aws.serverlessrepo.update-application-request/labels :portkey.aws.serverlessrepo.update-application-request/readme-body :portkey.aws.serverlessrepo.update-application-request/readme-url]))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-value/name (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo.parameter-value/value (clojure.spec.alpha/and :portkey.aws.serverlessrepo/string))
(clojure.spec.alpha/def :portkey.aws.serverlessrepo/parameter-value (clojure.spec.alpha/keys :req-un [:portkey.aws.serverlessrepo.parameter-value/value :portkey.aws.serverlessrepo.parameter-value/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.serverlessrepo/list-of-parameter-value (clojure.spec.alpha/coll-of :portkey.aws.serverlessrepo/parameter-value))

(clojure.core/defn list-applications ([] (list-applications {})) ([list-applications-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-applications-request list-applications-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.serverlessrepo/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.serverlessrepo/list-applications-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/applications", :http.request.configuration/version "2017-09-08", :http.request.configuration/service-id "ServerlessApplicationRepository", :http.request.spec/input-spec :portkey.aws.serverlessrepo/list-applications-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListApplications", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.serverlessrepo/not-found-exception, "BadRequestException" :portkey.aws.serverlessrepo/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-applications :args (clojure.spec.alpha/? :portkey.aws.serverlessrepo/list-applications-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-applications-response))

(clojure.core/defn create-application-version ([create-application-version-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-application-version-request create-application-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.serverlessrepo/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.serverlessrepo/create-application-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/applications/{applicationId}/versions/{semanticVersion}", :http.request.configuration/version "2017-09-08", :http.request.configuration/service-id "ServerlessApplicationRepository", :http.request.spec/input-spec :portkey.aws.serverlessrepo/create-application-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateApplicationVersion", :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.serverlessrepo/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo/internal-server-error-exception, "ConflictException" :portkey.aws.serverlessrepo/conflict-exception, "ForbiddenException" :portkey.aws.serverlessrepo/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-application-version :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo/create-application-version-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo/create-application-version-response))

(clojure.core/defn delete-application ([delete-application-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-application-request delete-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.serverlessrepo/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/applications/{applicationId}", :http.request.configuration/version "2017-09-08", :http.request.configuration/service-id "ServerlessApplicationRepository", :http.request.spec/input-spec :portkey.aws.serverlessrepo/delete-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteApplication", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.serverlessrepo/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo/forbidden-exception, "NotFoundException" :portkey.aws.serverlessrepo/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo/too-many-requests-exception, "ConflictException" :portkey.aws.serverlessrepo/conflict-exception}})))))
(clojure.spec.alpha/fdef delete-application :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo/delete-application-request) :ret clojure.core/true?)

(clojure.core/defn get-application ([get-application-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-application-request get-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.serverlessrepo/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.serverlessrepo/get-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/applications/{applicationId}", :http.request.configuration/version "2017-09-08", :http.request.configuration/service-id "ServerlessApplicationRepository", :http.request.spec/input-spec :portkey.aws.serverlessrepo/get-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetApplication", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.serverlessrepo/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo/forbidden-exception}})))))
(clojure.spec.alpha/fdef get-application :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo/get-application-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo/get-application-response))

(clojure.core/defn update-application ([update-application-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-application-request update-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.serverlessrepo/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.serverlessrepo/update-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/applications/{applicationId}", :http.request.configuration/version "2017-09-08", :http.request.configuration/service-id "ServerlessApplicationRepository", :http.request.spec/input-spec :portkey.aws.serverlessrepo/update-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :patch, :http.request.configuration/response-code 200, :http.request.configuration/action "UpdateApplication", :http.request.spec/error-spec {"BadRequestException" :portkey.aws.serverlessrepo/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo/forbidden-exception, "NotFoundException" :portkey.aws.serverlessrepo/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo/too-many-requests-exception, "ConflictException" :portkey.aws.serverlessrepo/conflict-exception}})))))
(clojure.spec.alpha/fdef update-application :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo/update-application-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo/update-application-response))

(clojure.core/defn create-cloud-formation-change-set ([create-cloud-formation-change-set-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-cloud-formation-change-set-request create-cloud-formation-change-set-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.serverlessrepo/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.serverlessrepo/create-cloud-formation-change-set-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/applications/{applicationId}/changesets", :http.request.configuration/version "2017-09-08", :http.request.configuration/service-id "ServerlessApplicationRepository", :http.request.spec/input-spec :portkey.aws.serverlessrepo/create-cloud-formation-change-set-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateCloudFormationChangeSet", :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.serverlessrepo/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-cloud-formation-change-set :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo/create-cloud-formation-change-set-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo/create-cloud-formation-change-set-response))

(clojure.core/defn create-application ([create-application-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-application-request create-application-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.serverlessrepo/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.serverlessrepo/create-application-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/applications", :http.request.configuration/version "2017-09-08", :http.request.configuration/service-id "ServerlessApplicationRepository", :http.request.spec/input-spec :portkey.aws.serverlessrepo/create-application-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateApplication", :http.request.spec/error-spec {"TooManyRequestsException" :portkey.aws.serverlessrepo/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo/internal-server-error-exception, "ConflictException" :portkey.aws.serverlessrepo/conflict-exception, "ForbiddenException" :portkey.aws.serverlessrepo/forbidden-exception}})))))
(clojure.spec.alpha/fdef create-application :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo/create-application-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo/create-application-response))

(clojure.core/defn put-application-policy ([put-application-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-application-policy-request put-application-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.serverlessrepo/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.serverlessrepo/put-application-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/applications/{applicationId}/policy", :http.request.configuration/version "2017-09-08", :http.request.configuration/service-id "ServerlessApplicationRepository", :http.request.spec/input-spec :portkey.aws.serverlessrepo/put-application-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/action "PutApplicationPolicy", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.serverlessrepo/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo/forbidden-exception}})))))
(clojure.spec.alpha/fdef put-application-policy :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo/put-application-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo/put-application-policy-response))

(clojure.core/defn get-application-policy ([get-application-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-application-policy-request get-application-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.serverlessrepo/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.serverlessrepo/get-application-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/applications/{applicationId}/policy", :http.request.configuration/version "2017-09-08", :http.request.configuration/service-id "ServerlessApplicationRepository", :http.request.spec/input-spec :portkey.aws.serverlessrepo/get-application-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "GetApplicationPolicy", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.serverlessrepo/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo/forbidden-exception}})))))
(clojure.spec.alpha/fdef get-application-policy :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo/get-application-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo/get-application-policy-response))

(clojure.core/defn list-application-versions ([list-application-versions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-application-versions-request list-application-versions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.serverlessrepo/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.serverlessrepo/list-application-versions-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/applications/{applicationId}/versions", :http.request.configuration/version "2017-09-08", :http.request.configuration/service-id "ServerlessApplicationRepository", :http.request.spec/input-spec :portkey.aws.serverlessrepo/list-application-versions-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code 200, :http.request.configuration/action "ListApplicationVersions", :http.request.spec/error-spec {"NotFoundException" :portkey.aws.serverlessrepo/not-found-exception, "TooManyRequestsException" :portkey.aws.serverlessrepo/too-many-requests-exception, "BadRequestException" :portkey.aws.serverlessrepo/bad-request-exception, "InternalServerErrorException" :portkey.aws.serverlessrepo/internal-server-error-exception, "ForbiddenException" :portkey.aws.serverlessrepo/forbidden-exception}})))))
(clojure.spec.alpha/fdef list-application-versions :args (clojure.spec.alpha/tuple :portkey.aws.serverlessrepo/list-application-versions-request) :ret (clojure.spec.alpha/and :portkey.aws.serverlessrepo/list-application-versions-response))
