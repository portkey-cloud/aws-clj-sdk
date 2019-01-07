(ns portkey.aws.importexport (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope
    {:service "IngestionService", :region "us-east-1"},
    :ssl-common-name "importexport.amazonaws.com",
    :endpoint "https://importexport.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare sercountry)

(clojure.core/declare ser-api-version)

(clojure.core/declare sercity)

(clojure.core/declare ser-job-type)

(clojure.core/declare sercompany)

(clojure.core/declare ser-validate-only)

(clojure.core/declare serstate-or-province)

(clojure.core/declare ser-manifest-addendum)

(clojure.core/declare ser-marker)

(clojure.core/declare ser-manifest)

(clojure.core/declare serstreet-3)

(clojure.core/declare sername)

(clojure.core/declare serpostal-code)

(clojure.core/declare ser-max-jobs)

(clojure.core/declare serstreet-2)

(clojure.core/declare ser-generic-string)

(clojure.core/declare serphone-number)

(clojure.core/declare ser-job-id-list)

(clojure.core/declare serstreet-1)

(clojure.core/declare ser-job-id)

(clojure.core/defn- sercountry [input] #:http.request.field{:value input, :shape "country"})

(clojure.core/defn- ser-api-version [input] #:http.request.field{:value input, :shape "APIVersion"})

(clojure.core/defn- sercity [input] #:http.request.field{:value input, :shape "city"})

(clojure.core/defn- ser-job-type [input] #:http.request.field{:value (clojure.core/get {"Import" "Import", :import "Import", "Export" "Export", :export "Export"} input), :shape "JobType"})

(clojure.core/defn- sercompany [input] #:http.request.field{:value input, :shape "company"})

(clojure.core/defn- ser-validate-only [input] #:http.request.field{:value input, :shape "ValidateOnly"})

(clojure.core/defn- serstate-or-province [input] #:http.request.field{:value input, :shape "stateOrProvince"})

(clojure.core/defn- ser-manifest-addendum [input] #:http.request.field{:value input, :shape "ManifestAddendum"})

(clojure.core/defn- ser-marker [input] #:http.request.field{:value input, :shape "Marker"})

(clojure.core/defn- ser-manifest [input] #:http.request.field{:value input, :shape "Manifest"})

(clojure.core/defn- serstreet-3 [input] #:http.request.field{:value input, :shape "street3"})

(clojure.core/defn- sername [input] #:http.request.field{:value input, :shape "name"})

(clojure.core/defn- serpostal-code [input] #:http.request.field{:value input, :shape "postalCode"})

(clojure.core/defn- ser-max-jobs [input] #:http.request.field{:value input, :shape "MaxJobs"})

(clojure.core/defn- serstreet-2 [input] #:http.request.field{:value input, :shape "street2"})

(clojure.core/defn- ser-generic-string [input] #:http.request.field{:value input, :shape "GenericString"})

(clojure.core/defn- serphone-number [input] #:http.request.field{:value input, :shape "phoneNumber"})

(clojure.core/defn- ser-job-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-generic-string coll) #:http.request.field{:shape "GenericString"}))) input), :shape "JobIdList", :type "list"})

(clojure.core/defn- serstreet-1 [input] #:http.request.field{:value input, :shape "street1"})

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-create-job-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-type (input :job-type)) #:http.request.field{:name "JobType", :shape "JobType"}) (clojure.core/into (ser-manifest (input :manifest)) #:http.request.field{:name "Manifest", :shape "Manifest"}) (clojure.core/into (ser-validate-only (input :validate-only)) #:http.request.field{:name "ValidateOnly", :shape "ValidateOnly"})]} (clojure.core/contains? input :manifest-addendum) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-manifest-addendum (input :manifest-addendum)) #:http.request.field{:name "ManifestAddendum", :shape "ManifestAddendum"})) (clojure.core/contains? input :api-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-api-version (input :api-version)) #:http.request.field{:name "APIVersion", :shape "APIVersion"}))))

(clojure.core/defn- req-cancel-job-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :api-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-api-version (input :api-version)) #:http.request.field{:name "APIVersion", :shape "APIVersion"}))))

(clojure.core/defn- req-get-shipping-label-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id-list (input :job-ids)) #:http.request.field{:name "jobIds", :shape "JobIdList"})]} (clojure.core/contains? input :country) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sercountry (input :country)) #:http.request.field{:name "country", :shape "country"})) (clojure.core/contains? input :api-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-api-version (input :api-version)) #:http.request.field{:name "APIVersion", :shape "APIVersion"})) (clojure.core/contains? input :city) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sercity (input :city)) #:http.request.field{:name "city", :shape "city"})) (clojure.core/contains? input :company) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sercompany (input :company)) #:http.request.field{:name "company", :shape "company"})) (clojure.core/contains? input :state-or-province) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstate-or-province (input :state-or-province)) #:http.request.field{:name "stateOrProvince", :shape "stateOrProvince"})) (clojure.core/contains? input :street-3) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstreet-3 (input :street-3)) #:http.request.field{:name "street3", :shape "street3"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (sername (input :name)) #:http.request.field{:name "name", :shape "name"})) (clojure.core/contains? input :postal-code) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serpostal-code (input :postal-code)) #:http.request.field{:name "postalCode", :shape "postalCode"})) (clojure.core/contains? input :street-2) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstreet-2 (input :street-2)) #:http.request.field{:name "street2", :shape "street2"})) (clojure.core/contains? input :phone-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serphone-number (input :phone-number)) #:http.request.field{:name "phoneNumber", :shape "phoneNumber"})) (clojure.core/contains? input :street-1) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstreet-1 (input :street-1)) #:http.request.field{:name "street1", :shape "street1"}))))

(clojure.core/defn- req-update-job-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"}) (clojure.core/into (ser-manifest (input :manifest)) #:http.request.field{:name "Manifest", :shape "Manifest"}) (clojure.core/into (ser-job-type (input :job-type)) #:http.request.field{:name "JobType", :shape "JobType"}) (clojure.core/into (ser-validate-only (input :validate-only)) #:http.request.field{:name "ValidateOnly", :shape "ValidateOnly"})]} (clojure.core/contains? input :api-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-api-version (input :api-version)) #:http.request.field{:name "APIVersion", :shape "APIVersion"}))))

(clojure.core/defn- req-get-status-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :api-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-api-version (input :api-version)) #:http.request.field{:name "APIVersion", :shape "APIVersion"}))))

(clojure.core/defn- req-list-jobs-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-jobs) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-jobs (input :max-jobs)) #:http.request.field{:name "MaxJobs", :shape "MaxJobs"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :api-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-api-version (input :api-version)) #:http.request.field{:name "APIVersion", :shape "APIVersion"}))))

(clojure.spec.alpha/def :portkey.aws.importexport/log-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/create-job-input (clojure.spec.alpha/keys :req-un [:portkey.aws.importexport/job-type :portkey.aws.importexport/manifest :portkey.aws.importexport/validate-only] :opt-un [:portkey.aws.importexport/manifest-addendum :portkey.aws.importexport/api-version]))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-version-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-version-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-version-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport/carrier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-address-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-address-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-address-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport/country (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/jobs-list (clojure.spec.alpha/coll-of :portkey.aws.importexport/job))

(clojure.spec.alpha/def :portkey.aws.importexport/api-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/cancel-job-input (clojure.spec.alpha/keys :req-un [:portkey.aws.importexport/job-id] :opt-un [:portkey.aws.importexport/api-version]))

(clojure.spec.alpha/def :portkey.aws.importexport/artifact-list (clojure.spec.alpha/coll-of :portkey.aws.importexport/artifact))

(clojure.spec.alpha/def :portkey.aws.importexport.malformed-manifest-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/malformed-manifest-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.malformed-manifest-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-manifest-field-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-manifest-field-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-manifest-field-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.get-shipping-label-input/job-ids (clojure.spec.alpha/and :portkey.aws.importexport/job-id-list))
(clojure.spec.alpha/def :portkey.aws.importexport/get-shipping-label-input (clojure.spec.alpha/keys :req-un [:portkey.aws.importexport.get-shipping-label-input/job-ids] :opt-un [:portkey.aws.importexport/country :portkey.aws.importexport/api-version :portkey.aws.importexport/city :portkey.aws.importexport/company :portkey.aws.importexport/state-or-province :portkey.aws.importexport/street-3 :portkey.aws.importexport/name :portkey.aws.importexport/postal-code :portkey.aws.importexport/street-2 :portkey.aws.importexport/phone-number :portkey.aws.importexport/street-1]))

(clojure.spec.alpha/def :portkey.aws.importexport.get-shipping-label-output/shipping-label-url (clojure.spec.alpha/and :portkey.aws.importexport/generic-string))
(clojure.spec.alpha/def :portkey.aws.importexport.get-shipping-label-output/warning (clojure.spec.alpha/and :portkey.aws.importexport/generic-string))
(clojure.spec.alpha/def :portkey.aws.importexport/get-shipping-label-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.get-shipping-label-output/shipping-label-url :portkey.aws.importexport.get-shipping-label-output/warning]))

(clojure.spec.alpha/def :portkey.aws.importexport.multiple-regions-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/multiple-regions-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.multiple-regions-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.unable-to-update-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/unable-to-update-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.unable-to-update-job-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport/city (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/job-type #{:export "Export" "Import" :import})

(clojure.spec.alpha/def :portkey.aws.importexport/company (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/error-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.importexport/validate-only clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport/state-or-province (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/manifest-addendum (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.missing-manifest-field-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/missing-manifest-field-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.missing-manifest-field-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.list-jobs-output/jobs (clojure.spec.alpha/and :portkey.aws.importexport/jobs-list))
(clojure.spec.alpha/def :portkey.aws.importexport/list-jobs-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.list-jobs-output/jobs :portkey.aws.importexport/is-truncated]))

(clojure.spec.alpha/def :portkey.aws.importexport.expired-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/expired-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.expired-job-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-job-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport/manifest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/artifact (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport/description :portkey.aws.importexport/url]))

(clojure.spec.alpha/def :portkey.aws.importexport/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.bucket-permission-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/bucket-permission-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.bucket-permission-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport/progress-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/street-3 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/is-truncated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport/update-job-input (clojure.spec.alpha/keys :req-un [:portkey.aws.importexport/job-id :portkey.aws.importexport/manifest :portkey.aws.importexport/job-type :portkey.aws.importexport/validate-only] :opt-un [:portkey.aws.importexport/api-version]))

(clojure.spec.alpha/def :portkey.aws.importexport/tracking-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/postal-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/max-jobs clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.importexport/success clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport/cancel-job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport/success]))

(clojure.spec.alpha/def :portkey.aws.importexport/signature-file-contents (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/street-2 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-customs-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-customs-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-customs-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.missing-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/missing-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.missing-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/get-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.importexport/job-id] :opt-un [:portkey.aws.importexport/api-version]))

(clojure.spec.alpha/def :portkey.aws.importexport/list-jobs-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport/max-jobs :portkey.aws.importexport/marker :portkey.aws.importexport/api-version]))

(clojure.spec.alpha/def :portkey.aws.importexport/phone-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.unable-to-cancel-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/unable-to-cancel-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.unable-to-cancel-job-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.missing-customs-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/missing-customs-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.missing-customs-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport/progress-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.importexport/location-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/is-canceled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport/job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport/job-id :portkey.aws.importexport/creation-date :portkey.aws.importexport/is-canceled :portkey.aws.importexport/job-type]))

(clojure.spec.alpha/def :portkey.aws.importexport/current-manifest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/location-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.canceled-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/canceled-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.canceled-job-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.no-such-bucket-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/no-such-bucket-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.no-such-bucket-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport/log-bucket (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.get-status-output/signature-file-contents (clojure.spec.alpha/and :portkey.aws.importexport/signature))
(clojure.spec.alpha/def :portkey.aws.importexport/get-status-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport/log-key :portkey.aws.importexport/carrier :portkey.aws.importexport/artifact-list :portkey.aws.importexport/job-type :portkey.aws.importexport/error-count :portkey.aws.importexport/progress-code :portkey.aws.importexport/tracking-number :portkey.aws.importexport/signature :portkey.aws.importexport.get-status-output/signature-file-contents :portkey.aws.importexport/progress-message :portkey.aws.importexport/creation-date :portkey.aws.importexport/location-code :portkey.aws.importexport/current-manifest :portkey.aws.importexport/location-message :portkey.aws.importexport/log-bucket :portkey.aws.importexport/job-id]))

(clojure.spec.alpha/def :portkey.aws.importexport.create-job-quota-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/create-job-quota-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.create-job-quota-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport/update-job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport/success :portkey.aws.importexport/warning-message :portkey.aws.importexport/artifact-list]))

(clojure.spec.alpha/def :portkey.aws.importexport/job-id-list (clojure.spec.alpha/coll-of :portkey.aws.importexport/generic-string))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-file-system-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-file-system-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-file-system-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-access-key-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-access-key-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-access-key-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport/warning-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/street-1 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/create-job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport/job-id :portkey.aws.importexport/job-type :portkey.aws.importexport/signature :portkey.aws.importexport/signature-file-contents :portkey.aws.importexport/warning-message :portkey.aws.importexport/artifact-list]))

(clojure.spec.alpha/def :portkey.aws.importexport/job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn cancel-job ([cancel-job-inputinput] (clojure.core/let [request-function-result__195099__auto__ (req-cancel-job-input cancel-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.spec/output-spec :portkey.aws.importexport/cancel-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=CancelJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/cancel-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelJob", :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "UnableToCancelJobIdException" :portkey.aws.importexport/unable-to-cancel-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/cancel-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/cancel-job-output))

(clojure.core/defn create-job ([create-job-inputinput] (clojure.core/let [request-function-result__195099__auto__ (req-create-job-input create-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.spec/output-spec :portkey.aws.importexport/create-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=CreateJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/create-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateJob", :http.request.spec/error-spec {"InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport/multiple-regions-exception, "MissingManifestFieldException" :portkey.aws.importexport/missing-manifest-field-exception, "InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport/missing-customs-exception, "NoSuchBucketException" :portkey.aws.importexport/no-such-bucket-exception, "CreateJobQuotaExceededException" :portkey.aws.importexport/create-job-quota-exceeded-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/create-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/create-job-output))

(clojure.core/defn get-shipping-label ([get-shipping-label-inputinput] (clojure.core/let [request-function-result__195099__auto__ (req-get-shipping-label-input get-shipping-label-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.spec/output-spec :portkey.aws.importexport/get-shipping-label-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=GetShippingLabel", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/get-shipping-label-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetShippingLabel", :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-shipping-label :args (clojure.spec.alpha/tuple :portkey.aws.importexport/get-shipping-label-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/get-shipping-label-output))

(clojure.core/defn get-status ([get-status-inputinput] (clojure.core/let [request-function-result__195099__auto__ (req-get-status-input get-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.spec/output-spec :portkey.aws.importexport/get-status-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=GetStatus", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/get-status-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStatus", :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}})))))
(clojure.spec.alpha/fdef get-status :args (clojure.spec.alpha/tuple :portkey.aws.importexport/get-status-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/get-status-output))

(clojure.core/defn list-jobs ([] (list-jobs {})) ([list-jobs-inputinput] (clojure.core/let [request-function-result__195099__auto__ (req-list-jobs-input list-jobs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.spec/output-spec :portkey.aws.importexport/list-jobs-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=ListJobs", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/list-jobs-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListJobs", :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.importexport/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/list-jobs-output))

(clojure.core/defn update-job ([update-job-inputinput] (clojure.core/let [request-function-result__195099__auto__ (req-update-job-input update-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__195099__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.spec/output-spec :portkey.aws.importexport/update-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=UpdateJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/update-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateJob", :http.request.spec/error-spec {"InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport/multiple-regions-exception, "UnableToUpdateJobIdException" :portkey.aws.importexport/unable-to-update-job-id-exception, "MissingManifestFieldException" :portkey.aws.importexport/missing-manifest-field-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport/missing-customs-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "NoSuchBucketException" :portkey.aws.importexport/no-such-bucket-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception}})))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/update-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/update-job-output))
