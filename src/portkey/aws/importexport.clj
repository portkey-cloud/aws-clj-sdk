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
   "eu-north-1"
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

(clojure.core/declare deser-log-key)

(clojure.core/declare deser-url)

(clojure.core/declare deser-carrier)

(clojure.core/declare deser-jobs-list)

(clojure.core/declare deser-artifact-list)

(clojure.core/declare deser-job-type)

(clojure.core/declare deser-error-count)

(clojure.core/declare deser-artifact)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-progress-code)

(clojure.core/declare deser-is-truncated)

(clojure.core/declare deser-tracking-number)

(clojure.core/declare deser-signature)

(clojure.core/declare deser-success)

(clojure.core/declare deser-signature-file-contents)

(clojure.core/declare deser-description)

(clojure.core/declare deser-generic-string)

(clojure.core/declare deser-progress-message)

(clojure.core/declare deser-creation-date)

(clojure.core/declare deser-location-code)

(clojure.core/declare deser-is-canceled)

(clojure.core/declare deser-job)

(clojure.core/declare deser-current-manifest)

(clojure.core/declare deser-location-message)

(clojure.core/declare deser-log-bucket)

(clojure.core/declare deser-warning-message)

(clojure.core/declare deser-job-id)

(clojure.core/defn- deser-log-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-url [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-carrier [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-jobs-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-job coll))) input))

(clojure.core/defn- deser-artifact-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-artifact coll))) input))

(clojure.core/defn- deser-job-type [input] (clojure.core/get {"Import" :import, "Export" :export} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-error-count [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-artifact [input] (clojure.core/let [letvar1082828 {"Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "URL" (portkey.aws/search-for-tag input "URL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1082828 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1082828 ["Description" :content]))) (letvar1082828 "URL") (clojure.core/assoc :url (deser-url (clojure.core/get-in letvar1082828 ["URL" :content]))))))

(clojure.core/defn- deser-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-progress-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-is-truncated [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-tracking-number [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-signature [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-success [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-signature-file-contents [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-generic-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-progress-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-creation-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-location-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-is-canceled [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-job [input] (clojure.core/let [letvar1082989 {"JobId" (portkey.aws/search-for-tag input "JobId" :flattened? nil :xmlAttribute? nil), "CreationDate" (portkey.aws/search-for-tag input "CreationDate" :flattened? nil :xmlAttribute? nil), "IsCanceled" (portkey.aws/search-for-tag input "IsCanceled" :flattened? nil :xmlAttribute? nil), "JobType" (portkey.aws/search-for-tag input "JobType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1082989 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1082989 ["JobId" :content]))) (letvar1082989 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar1082989 ["CreationDate" :content]))) (letvar1082989 "IsCanceled") (clojure.core/assoc :is-canceled (deser-is-canceled (clojure.core/get-in letvar1082989 ["IsCanceled" :content]))) (letvar1082989 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar1082989 ["JobType" :content]))))))

(clojure.core/defn- deser-current-manifest [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-location-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-log-bucket [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-warning-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-job-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-invalid-version-exception ([input] (response-invalid-version-exception nil input)) ([resultWrapper1083016 input] (clojure.core/let [rawinput1083015 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083017 {"message" (portkey.aws/search-for-tag rawinput1083015 "message" :flattened? nil :result-wrapper resultWrapper1083016)}] (clojure.core/cond-> {} (letvar1083017 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083017 ["message" :content])))))))

(clojure.core/defn- response-invalid-address-exception ([input] (response-invalid-address-exception nil input)) ([resultWrapper1083019 input] (clojure.core/let [rawinput1083018 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083020 {"message" (portkey.aws/search-for-tag rawinput1083018 "message" :flattened? nil :result-wrapper resultWrapper1083019)}] (clojure.core/cond-> {} (letvar1083020 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083020 ["message" :content])))))))

(clojure.core/defn- response-malformed-manifest-exception ([input] (response-malformed-manifest-exception nil input)) ([resultWrapper1083022 input] (clojure.core/let [rawinput1083021 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083023 {"message" (portkey.aws/search-for-tag rawinput1083021 "message" :flattened? nil :result-wrapper resultWrapper1083022)}] (clojure.core/cond-> {} (letvar1083023 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083023 ["message" :content])))))))

(clojure.core/defn- response-invalid-manifest-field-exception ([input] (response-invalid-manifest-field-exception nil input)) ([resultWrapper1083025 input] (clojure.core/let [rawinput1083024 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083026 {"message" (portkey.aws/search-for-tag rawinput1083024 "message" :flattened? nil :result-wrapper resultWrapper1083025)}] (clojure.core/cond-> {} (letvar1083026 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083026 ["message" :content])))))))

(clojure.core/defn- response-get-shipping-label-output ([input] (response-get-shipping-label-output nil input)) ([resultWrapper1083028 input] (clojure.core/let [rawinput1083027 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083029 {"ShippingLabelURL" (portkey.aws/search-for-tag rawinput1083027 "ShippingLabelURL" :flattened? nil :result-wrapper resultWrapper1083028), "Warning" (portkey.aws/search-for-tag rawinput1083027 "Warning" :flattened? nil :result-wrapper resultWrapper1083028)}] (clojure.core/cond-> {} (letvar1083029 "ShippingLabelURL") (clojure.core/assoc :shipping-label-url (deser-generic-string (clojure.core/get-in letvar1083029 ["ShippingLabelURL" :content]))) (letvar1083029 "Warning") (clojure.core/assoc :warning (deser-generic-string (clojure.core/get-in letvar1083029 ["Warning" :content])))))))

(clojure.core/defn- response-multiple-regions-exception ([input] (response-multiple-regions-exception nil input)) ([resultWrapper1083031 input] (clojure.core/let [rawinput1083030 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083032 {"message" (portkey.aws/search-for-tag rawinput1083030 "message" :flattened? nil :result-wrapper resultWrapper1083031)}] (clojure.core/cond-> {} (letvar1083032 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083032 ["message" :content])))))))

(clojure.core/defn- response-unable-to-update-job-id-exception ([input] (response-unable-to-update-job-id-exception nil input)) ([resultWrapper1083034 input] (clojure.core/let [rawinput1083033 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083035 {"message" (portkey.aws/search-for-tag rawinput1083033 "message" :flattened? nil :result-wrapper resultWrapper1083034)}] (clojure.core/cond-> {} (letvar1083035 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083035 ["message" :content])))))))

(clojure.core/defn- response-missing-manifest-field-exception ([input] (response-missing-manifest-field-exception nil input)) ([resultWrapper1083037 input] (clojure.core/let [rawinput1083036 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083038 {"message" (portkey.aws/search-for-tag rawinput1083036 "message" :flattened? nil :result-wrapper resultWrapper1083037)}] (clojure.core/cond-> {} (letvar1083038 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083038 ["message" :content])))))))

(clojure.core/defn- response-list-jobs-output ([input] (response-list-jobs-output nil input)) ([resultWrapper1083040 input] (clojure.core/let [rawinput1083039 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083041 {"Jobs" (portkey.aws/search-for-tag rawinput1083039 "Jobs" :flattened? nil :result-wrapper resultWrapper1083040), "IsTruncated" (portkey.aws/search-for-tag rawinput1083039 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1083040)}] (clojure.core/cond-> {} (letvar1083041 "Jobs") (clojure.core/assoc :jobs (deser-jobs-list (clojure.core/get-in letvar1083041 ["Jobs" :content]))) (letvar1083041 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1083041 ["IsTruncated" :content])))))))

(clojure.core/defn- response-expired-job-id-exception ([input] (response-expired-job-id-exception nil input)) ([resultWrapper1083043 input] (clojure.core/let [rawinput1083042 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083044 {"message" (portkey.aws/search-for-tag rawinput1083042 "message" :flattened? nil :result-wrapper resultWrapper1083043)}] (clojure.core/cond-> {} (letvar1083044 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083044 ["message" :content])))))))

(clojure.core/defn- response-invalid-job-id-exception ([input] (response-invalid-job-id-exception nil input)) ([resultWrapper1083046 input] (clojure.core/let [rawinput1083045 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083047 {"message" (portkey.aws/search-for-tag rawinput1083045 "message" :flattened? nil :result-wrapper resultWrapper1083046)}] (clojure.core/cond-> {} (letvar1083047 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083047 ["message" :content])))))))

(clojure.core/defn- response-bucket-permission-exception ([input] (response-bucket-permission-exception nil input)) ([resultWrapper1083049 input] (clojure.core/let [rawinput1083048 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083050 {"message" (portkey.aws/search-for-tag rawinput1083048 "message" :flattened? nil :result-wrapper resultWrapper1083049)}] (clojure.core/cond-> {} (letvar1083050 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083050 ["message" :content])))))))

(clojure.core/defn- response-cancel-job-output ([input] (response-cancel-job-output nil input)) ([resultWrapper1083052 input] (clojure.core/let [rawinput1083051 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083053 {"Success" (portkey.aws/search-for-tag rawinput1083051 "Success" :flattened? nil :result-wrapper resultWrapper1083052)}] (clojure.core/cond-> {} (letvar1083053 "Success") (clojure.core/assoc :success (deser-success (clojure.core/get-in letvar1083053 ["Success" :content])))))))

(clojure.core/defn- response-invalid-customs-exception ([input] (response-invalid-customs-exception nil input)) ([resultWrapper1083055 input] (clojure.core/let [rawinput1083054 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083056 {"message" (portkey.aws/search-for-tag rawinput1083054 "message" :flattened? nil :result-wrapper resultWrapper1083055)}] (clojure.core/cond-> {} (letvar1083056 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083056 ["message" :content])))))))

(clojure.core/defn- response-missing-parameter-exception ([input] (response-missing-parameter-exception nil input)) ([resultWrapper1083058 input] (clojure.core/let [rawinput1083057 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083059 {"message" (portkey.aws/search-for-tag rawinput1083057 "message" :flattened? nil :result-wrapper resultWrapper1083058)}] (clojure.core/cond-> {} (letvar1083059 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083059 ["message" :content])))))))

(clojure.core/defn- response-unable-to-cancel-job-id-exception ([input] (response-unable-to-cancel-job-id-exception nil input)) ([resultWrapper1083061 input] (clojure.core/let [rawinput1083060 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083062 {"message" (portkey.aws/search-for-tag rawinput1083060 "message" :flattened? nil :result-wrapper resultWrapper1083061)}] (clojure.core/cond-> {} (letvar1083062 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083062 ["message" :content])))))))

(clojure.core/defn- response-missing-customs-exception ([input] (response-missing-customs-exception nil input)) ([resultWrapper1083064 input] (clojure.core/let [rawinput1083063 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083065 {"message" (portkey.aws/search-for-tag rawinput1083063 "message" :flattened? nil :result-wrapper resultWrapper1083064)}] (clojure.core/cond-> {} (letvar1083065 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083065 ["message" :content])))))))

(clojure.core/defn- response-canceled-job-id-exception ([input] (response-canceled-job-id-exception nil input)) ([resultWrapper1083067 input] (clojure.core/let [rawinput1083066 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083068 {"message" (portkey.aws/search-for-tag rawinput1083066 "message" :flattened? nil :result-wrapper resultWrapper1083067)}] (clojure.core/cond-> {} (letvar1083068 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083068 ["message" :content])))))))

(clojure.core/defn- response-no-such-bucket-exception ([input] (response-no-such-bucket-exception nil input)) ([resultWrapper1083070 input] (clojure.core/let [rawinput1083069 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083071 {"message" (portkey.aws/search-for-tag rawinput1083069 "message" :flattened? nil :result-wrapper resultWrapper1083070)}] (clojure.core/cond-> {} (letvar1083071 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083071 ["message" :content])))))))

(clojure.core/defn- response-get-status-output ([input] (response-get-status-output nil input)) ([resultWrapper1083073 input] (clojure.core/let [rawinput1083072 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083074 {"LogKey" (portkey.aws/search-for-tag rawinput1083072 "LogKey" :flattened? nil :result-wrapper resultWrapper1083073), "Carrier" (portkey.aws/search-for-tag rawinput1083072 "Carrier" :flattened? nil :result-wrapper resultWrapper1083073), "ArtifactList" (portkey.aws/search-for-tag rawinput1083072 "ArtifactList" :flattened? nil :result-wrapper resultWrapper1083073), "JobType" (portkey.aws/search-for-tag rawinput1083072 "JobType" :flattened? nil :result-wrapper resultWrapper1083073), "ErrorCount" (portkey.aws/search-for-tag rawinput1083072 "ErrorCount" :flattened? nil :result-wrapper resultWrapper1083073), "ProgressCode" (portkey.aws/search-for-tag rawinput1083072 "ProgressCode" :flattened? nil :result-wrapper resultWrapper1083073), "TrackingNumber" (portkey.aws/search-for-tag rawinput1083072 "TrackingNumber" :flattened? nil :result-wrapper resultWrapper1083073), "Signature" (portkey.aws/search-for-tag rawinput1083072 "Signature" :flattened? nil :result-wrapper resultWrapper1083073), "SignatureFileContents" (portkey.aws/search-for-tag rawinput1083072 "SignatureFileContents" :flattened? nil :result-wrapper resultWrapper1083073), "ProgressMessage" (portkey.aws/search-for-tag rawinput1083072 "ProgressMessage" :flattened? nil :result-wrapper resultWrapper1083073), "CreationDate" (portkey.aws/search-for-tag rawinput1083072 "CreationDate" :flattened? nil :result-wrapper resultWrapper1083073), "LocationCode" (portkey.aws/search-for-tag rawinput1083072 "LocationCode" :flattened? nil :result-wrapper resultWrapper1083073), "CurrentManifest" (portkey.aws/search-for-tag rawinput1083072 "CurrentManifest" :flattened? nil :result-wrapper resultWrapper1083073), "LocationMessage" (portkey.aws/search-for-tag rawinput1083072 "LocationMessage" :flattened? nil :result-wrapper resultWrapper1083073), "LogBucket" (portkey.aws/search-for-tag rawinput1083072 "LogBucket" :flattened? nil :result-wrapper resultWrapper1083073), "JobId" (portkey.aws/search-for-tag rawinput1083072 "JobId" :flattened? nil :result-wrapper resultWrapper1083073)}] (clojure.core/cond-> {} (letvar1083074 "LogKey") (clojure.core/assoc :log-key (deser-log-key (clojure.core/get-in letvar1083074 ["LogKey" :content]))) (letvar1083074 "Carrier") (clojure.core/assoc :carrier (deser-carrier (clojure.core/get-in letvar1083074 ["Carrier" :content]))) (letvar1083074 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar1083074 ["ArtifactList" :content]))) (letvar1083074 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar1083074 ["JobType" :content]))) (letvar1083074 "ErrorCount") (clojure.core/assoc :error-count (deser-error-count (clojure.core/get-in letvar1083074 ["ErrorCount" :content]))) (letvar1083074 "ProgressCode") (clojure.core/assoc :progress-code (deser-progress-code (clojure.core/get-in letvar1083074 ["ProgressCode" :content]))) (letvar1083074 "TrackingNumber") (clojure.core/assoc :tracking-number (deser-tracking-number (clojure.core/get-in letvar1083074 ["TrackingNumber" :content]))) (letvar1083074 "Signature") (clojure.core/assoc :signature (deser-signature (clojure.core/get-in letvar1083074 ["Signature" :content]))) (letvar1083074 "SignatureFileContents") (clojure.core/assoc :signature-file-contents (deser-signature (clojure.core/get-in letvar1083074 ["SignatureFileContents" :content]))) (letvar1083074 "ProgressMessage") (clojure.core/assoc :progress-message (deser-progress-message (clojure.core/get-in letvar1083074 ["ProgressMessage" :content]))) (letvar1083074 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar1083074 ["CreationDate" :content]))) (letvar1083074 "LocationCode") (clojure.core/assoc :location-code (deser-location-code (clojure.core/get-in letvar1083074 ["LocationCode" :content]))) (letvar1083074 "CurrentManifest") (clojure.core/assoc :current-manifest (deser-current-manifest (clojure.core/get-in letvar1083074 ["CurrentManifest" :content]))) (letvar1083074 "LocationMessage") (clojure.core/assoc :location-message (deser-location-message (clojure.core/get-in letvar1083074 ["LocationMessage" :content]))) (letvar1083074 "LogBucket") (clojure.core/assoc :log-bucket (deser-log-bucket (clojure.core/get-in letvar1083074 ["LogBucket" :content]))) (letvar1083074 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1083074 ["JobId" :content])))))))

(clojure.core/defn- response-create-job-quota-exceeded-exception ([input] (response-create-job-quota-exceeded-exception nil input)) ([resultWrapper1083076 input] (clojure.core/let [rawinput1083075 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083077 {"message" (portkey.aws/search-for-tag rawinput1083075 "message" :flattened? nil :result-wrapper resultWrapper1083076)}] (clojure.core/cond-> {} (letvar1083077 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083077 ["message" :content])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1083079 input] (clojure.core/let [rawinput1083078 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083080 {"message" (portkey.aws/search-for-tag rawinput1083078 "message" :flattened? nil :result-wrapper resultWrapper1083079)}] (clojure.core/cond-> {} (letvar1083080 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083080 ["message" :content])))))))

(clojure.core/defn- response-update-job-output ([input] (response-update-job-output nil input)) ([resultWrapper1083082 input] (clojure.core/let [rawinput1083081 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083083 {"Success" (portkey.aws/search-for-tag rawinput1083081 "Success" :flattened? nil :result-wrapper resultWrapper1083082), "WarningMessage" (portkey.aws/search-for-tag rawinput1083081 "WarningMessage" :flattened? nil :result-wrapper resultWrapper1083082), "ArtifactList" (portkey.aws/search-for-tag rawinput1083081 "ArtifactList" :flattened? nil :result-wrapper resultWrapper1083082)}] (clojure.core/cond-> {} (letvar1083083 "Success") (clojure.core/assoc :success (deser-success (clojure.core/get-in letvar1083083 ["Success" :content]))) (letvar1083083 "WarningMessage") (clojure.core/assoc :warning-message (deser-warning-message (clojure.core/get-in letvar1083083 ["WarningMessage" :content]))) (letvar1083083 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar1083083 ["ArtifactList" :content])))))))

(clojure.core/defn- response-invalid-file-system-exception ([input] (response-invalid-file-system-exception nil input)) ([resultWrapper1083085 input] (clojure.core/let [rawinput1083084 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083086 {"message" (portkey.aws/search-for-tag rawinput1083084 "message" :flattened? nil :result-wrapper resultWrapper1083085)}] (clojure.core/cond-> {} (letvar1083086 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083086 ["message" :content])))))))

(clojure.core/defn- response-invalid-access-key-id-exception ([input] (response-invalid-access-key-id-exception nil input)) ([resultWrapper1083088 input] (clojure.core/let [rawinput1083087 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083089 {"message" (portkey.aws/search-for-tag rawinput1083087 "message" :flattened? nil :result-wrapper resultWrapper1083088)}] (clojure.core/cond-> {} (letvar1083089 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083089 ["message" :content])))))))

(clojure.core/defn- response-create-job-output ([input] (response-create-job-output nil input)) ([resultWrapper1083091 input] (clojure.core/let [rawinput1083090 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083092 {"JobId" (portkey.aws/search-for-tag rawinput1083090 "JobId" :flattened? nil :result-wrapper resultWrapper1083091), "JobType" (portkey.aws/search-for-tag rawinput1083090 "JobType" :flattened? nil :result-wrapper resultWrapper1083091), "Signature" (portkey.aws/search-for-tag rawinput1083090 "Signature" :flattened? nil :result-wrapper resultWrapper1083091), "SignatureFileContents" (portkey.aws/search-for-tag rawinput1083090 "SignatureFileContents" :flattened? nil :result-wrapper resultWrapper1083091), "WarningMessage" (portkey.aws/search-for-tag rawinput1083090 "WarningMessage" :flattened? nil :result-wrapper resultWrapper1083091), "ArtifactList" (portkey.aws/search-for-tag rawinput1083090 "ArtifactList" :flattened? nil :result-wrapper resultWrapper1083091)}] (clojure.core/cond-> {} (letvar1083092 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1083092 ["JobId" :content]))) (letvar1083092 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar1083092 ["JobType" :content]))) (letvar1083092 "Signature") (clojure.core/assoc :signature (deser-signature (clojure.core/get-in letvar1083092 ["Signature" :content]))) (letvar1083092 "SignatureFileContents") (clojure.core/assoc :signature-file-contents (deser-signature-file-contents (clojure.core/get-in letvar1083092 ["SignatureFileContents" :content]))) (letvar1083092 "WarningMessage") (clojure.core/assoc :warning-message (deser-warning-message (clojure.core/get-in letvar1083092 ["WarningMessage" :content]))) (letvar1083092 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar1083092 ["ArtifactList" :content])))))))

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

(clojure.core/defn cancel-job "This operation cancels a specified job. Only the job owner can cancel it. The\noperation fails if the job has already started or is complete." ([cancel-job-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-cancel-job-input cancel-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/cancel-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=CancelJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/cancel-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CancelJobResult", :http.request.configuration/action "CancelJob", :http.request.configuration/output-deser-fn response-cancel-job-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "UnableToCancelJobIdException" :portkey.aws.importexport/unable-to-cancel-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/cancel-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/cancel-job-output))

(clojure.core/defn create-job "This operation initiates the process of scheduling an upload or download of your\ndata. You include in the request a manifest that describes the data transfer\nspecifics. The response to the request includes a job ID, which you can use in\nother operations, a signature that you use to identify your storage device, and\nthe address where you should ship your storage device." ([create-job-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-job-input create-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/create-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=CreateJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/create-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateJobResult", :http.request.configuration/action "CreateJob", :http.request.configuration/output-deser-fn response-create-job-output, :http.request.spec/error-spec {"InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport/multiple-regions-exception, "MissingManifestFieldException" :portkey.aws.importexport/missing-manifest-field-exception, "InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport/missing-customs-exception, "NoSuchBucketException" :portkey.aws.importexport/no-such-bucket-exception, "CreateJobQuotaExceededException" :portkey.aws.importexport/create-job-quota-exceeded-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/create-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/create-job-output))

(clojure.core/defn get-shipping-label "This operation generates a pre-paid UPS shipping label that you will use to ship\nyour device to AWS for processing." ([get-shipping-label-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-shipping-label-input get-shipping-label-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/get-shipping-label-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=GetShippingLabel", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/get-shipping-label-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetShippingLabelResult", :http.request.configuration/action "GetShippingLabel", :http.request.configuration/output-deser-fn response-get-shipping-label-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-shipping-label :args (clojure.spec.alpha/tuple :portkey.aws.importexport/get-shipping-label-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/get-shipping-label-output))

(clojure.core/defn get-status "This operation returns information about a job, including where the job is in\nthe processing pipeline, the status of the results, and the signature value\nassociated with the job. You can only return information about jobs you own." ([get-status-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-status-input get-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/get-status-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=GetStatus", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/get-status-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetStatusResult", :http.request.configuration/action "GetStatus", :http.request.configuration/output-deser-fn response-get-status-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}})))))
(clojure.spec.alpha/fdef get-status :args (clojure.spec.alpha/tuple :portkey.aws.importexport/get-status-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/get-status-output))

(clojure.core/defn list-jobs "This operation returns the jobs associated with the requester. AWS Import/Export\nlists the jobs in reverse chronological order based on the date of creation. For\nexample if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the\nListJobs operation would return Test2 followed by Test1." ([] (list-jobs {})) ([list-jobs-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-jobs-input list-jobs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/list-jobs-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=ListJobs", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/list-jobs-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListJobsResult", :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn response-list-jobs-output, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.importexport/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/list-jobs-output))

(clojure.core/defn update-job "You use this operation to change the parameters specified in the original\nmanifest file by supplying a new manifest file. The manifest file attached to\nthis request replaces the original manifest file. You can only use the operation\nafter a CreateJob request but before the data transfer starts and you can only\nuse it on jobs you own." ([update-job-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-job-input update-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/update-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=UpdateJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/update-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateJobResult", :http.request.configuration/action "UpdateJob", :http.request.configuration/output-deser-fn response-update-job-output, :http.request.spec/error-spec {"InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport/multiple-regions-exception, "UnableToUpdateJobIdException" :portkey.aws.importexport/unable-to-update-job-id-exception, "MissingManifestFieldException" :portkey.aws.importexport/missing-manifest-field-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport/missing-customs-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "NoSuchBucketException" :portkey.aws.importexport/no-such-bucket-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception}})))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/update-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/update-job-output))
