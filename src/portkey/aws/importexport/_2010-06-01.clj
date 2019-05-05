(ns portkey.aws.importexport.-2010-06-01 (:require [portkey.aws]))

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

(clojure.core/defn- deser-artifact [input] (clojure.core/let [letvar1083583 {"Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "URL" (portkey.aws/search-for-tag input "URL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1083583 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1083583 ["Description" :content]))) (letvar1083583 "URL") (clojure.core/assoc :url (deser-url (clojure.core/get-in letvar1083583 ["URL" :content]))))))

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

(clojure.core/defn- deser-job [input] (clojure.core/let [letvar1083744 {"JobId" (portkey.aws/search-for-tag input "JobId" :flattened? nil :xmlAttribute? nil), "CreationDate" (portkey.aws/search-for-tag input "CreationDate" :flattened? nil :xmlAttribute? nil), "IsCanceled" (portkey.aws/search-for-tag input "IsCanceled" :flattened? nil :xmlAttribute? nil), "JobType" (portkey.aws/search-for-tag input "JobType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar1083744 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1083744 ["JobId" :content]))) (letvar1083744 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar1083744 ["CreationDate" :content]))) (letvar1083744 "IsCanceled") (clojure.core/assoc :is-canceled (deser-is-canceled (clojure.core/get-in letvar1083744 ["IsCanceled" :content]))) (letvar1083744 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar1083744 ["JobType" :content]))))))

(clojure.core/defn- deser-current-manifest [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-location-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-log-bucket [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-warning-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-job-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-invalid-version-exception ([input] (response-invalid-version-exception nil input)) ([resultWrapper1083771 input] (clojure.core/let [rawinput1083770 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083772 {"message" (portkey.aws/search-for-tag rawinput1083770 "message" :flattened? nil :result-wrapper resultWrapper1083771)}] (clojure.core/cond-> {} (letvar1083772 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083772 ["message" :content])))))))

(clojure.core/defn- response-invalid-address-exception ([input] (response-invalid-address-exception nil input)) ([resultWrapper1083774 input] (clojure.core/let [rawinput1083773 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083775 {"message" (portkey.aws/search-for-tag rawinput1083773 "message" :flattened? nil :result-wrapper resultWrapper1083774)}] (clojure.core/cond-> {} (letvar1083775 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083775 ["message" :content])))))))

(clojure.core/defn- response-malformed-manifest-exception ([input] (response-malformed-manifest-exception nil input)) ([resultWrapper1083777 input] (clojure.core/let [rawinput1083776 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083778 {"message" (portkey.aws/search-for-tag rawinput1083776 "message" :flattened? nil :result-wrapper resultWrapper1083777)}] (clojure.core/cond-> {} (letvar1083778 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083778 ["message" :content])))))))

(clojure.core/defn- response-invalid-manifest-field-exception ([input] (response-invalid-manifest-field-exception nil input)) ([resultWrapper1083780 input] (clojure.core/let [rawinput1083779 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083781 {"message" (portkey.aws/search-for-tag rawinput1083779 "message" :flattened? nil :result-wrapper resultWrapper1083780)}] (clojure.core/cond-> {} (letvar1083781 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083781 ["message" :content])))))))

(clojure.core/defn- response-get-shipping-label-output ([input] (response-get-shipping-label-output nil input)) ([resultWrapper1083783 input] (clojure.core/let [rawinput1083782 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083784 {"ShippingLabelURL" (portkey.aws/search-for-tag rawinput1083782 "ShippingLabelURL" :flattened? nil :result-wrapper resultWrapper1083783), "Warning" (portkey.aws/search-for-tag rawinput1083782 "Warning" :flattened? nil :result-wrapper resultWrapper1083783)}] (clojure.core/cond-> {} (letvar1083784 "ShippingLabelURL") (clojure.core/assoc :shipping-label-url (deser-generic-string (clojure.core/get-in letvar1083784 ["ShippingLabelURL" :content]))) (letvar1083784 "Warning") (clojure.core/assoc :warning (deser-generic-string (clojure.core/get-in letvar1083784 ["Warning" :content])))))))

(clojure.core/defn- response-multiple-regions-exception ([input] (response-multiple-regions-exception nil input)) ([resultWrapper1083786 input] (clojure.core/let [rawinput1083785 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083787 {"message" (portkey.aws/search-for-tag rawinput1083785 "message" :flattened? nil :result-wrapper resultWrapper1083786)}] (clojure.core/cond-> {} (letvar1083787 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083787 ["message" :content])))))))

(clojure.core/defn- response-unable-to-update-job-id-exception ([input] (response-unable-to-update-job-id-exception nil input)) ([resultWrapper1083789 input] (clojure.core/let [rawinput1083788 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083790 {"message" (portkey.aws/search-for-tag rawinput1083788 "message" :flattened? nil :result-wrapper resultWrapper1083789)}] (clojure.core/cond-> {} (letvar1083790 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083790 ["message" :content])))))))

(clojure.core/defn- response-missing-manifest-field-exception ([input] (response-missing-manifest-field-exception nil input)) ([resultWrapper1083792 input] (clojure.core/let [rawinput1083791 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083793 {"message" (portkey.aws/search-for-tag rawinput1083791 "message" :flattened? nil :result-wrapper resultWrapper1083792)}] (clojure.core/cond-> {} (letvar1083793 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083793 ["message" :content])))))))

(clojure.core/defn- response-list-jobs-output ([input] (response-list-jobs-output nil input)) ([resultWrapper1083795 input] (clojure.core/let [rawinput1083794 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083796 {"Jobs" (portkey.aws/search-for-tag rawinput1083794 "Jobs" :flattened? nil :result-wrapper resultWrapper1083795), "IsTruncated" (portkey.aws/search-for-tag rawinput1083794 "IsTruncated" :flattened? nil :result-wrapper resultWrapper1083795)}] (clojure.core/cond-> {} (letvar1083796 "Jobs") (clojure.core/assoc :jobs (deser-jobs-list (clojure.core/get-in letvar1083796 ["Jobs" :content]))) (letvar1083796 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar1083796 ["IsTruncated" :content])))))))

(clojure.core/defn- response-expired-job-id-exception ([input] (response-expired-job-id-exception nil input)) ([resultWrapper1083798 input] (clojure.core/let [rawinput1083797 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083799 {"message" (portkey.aws/search-for-tag rawinput1083797 "message" :flattened? nil :result-wrapper resultWrapper1083798)}] (clojure.core/cond-> {} (letvar1083799 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083799 ["message" :content])))))))

(clojure.core/defn- response-invalid-job-id-exception ([input] (response-invalid-job-id-exception nil input)) ([resultWrapper1083801 input] (clojure.core/let [rawinput1083800 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083802 {"message" (portkey.aws/search-for-tag rawinput1083800 "message" :flattened? nil :result-wrapper resultWrapper1083801)}] (clojure.core/cond-> {} (letvar1083802 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083802 ["message" :content])))))))

(clojure.core/defn- response-bucket-permission-exception ([input] (response-bucket-permission-exception nil input)) ([resultWrapper1083804 input] (clojure.core/let [rawinput1083803 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083805 {"message" (portkey.aws/search-for-tag rawinput1083803 "message" :flattened? nil :result-wrapper resultWrapper1083804)}] (clojure.core/cond-> {} (letvar1083805 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083805 ["message" :content])))))))

(clojure.core/defn- response-cancel-job-output ([input] (response-cancel-job-output nil input)) ([resultWrapper1083807 input] (clojure.core/let [rawinput1083806 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083808 {"Success" (portkey.aws/search-for-tag rawinput1083806 "Success" :flattened? nil :result-wrapper resultWrapper1083807)}] (clojure.core/cond-> {} (letvar1083808 "Success") (clojure.core/assoc :success (deser-success (clojure.core/get-in letvar1083808 ["Success" :content])))))))

(clojure.core/defn- response-invalid-customs-exception ([input] (response-invalid-customs-exception nil input)) ([resultWrapper1083810 input] (clojure.core/let [rawinput1083809 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083811 {"message" (portkey.aws/search-for-tag rawinput1083809 "message" :flattened? nil :result-wrapper resultWrapper1083810)}] (clojure.core/cond-> {} (letvar1083811 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083811 ["message" :content])))))))

(clojure.core/defn- response-missing-parameter-exception ([input] (response-missing-parameter-exception nil input)) ([resultWrapper1083813 input] (clojure.core/let [rawinput1083812 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083814 {"message" (portkey.aws/search-for-tag rawinput1083812 "message" :flattened? nil :result-wrapper resultWrapper1083813)}] (clojure.core/cond-> {} (letvar1083814 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083814 ["message" :content])))))))

(clojure.core/defn- response-unable-to-cancel-job-id-exception ([input] (response-unable-to-cancel-job-id-exception nil input)) ([resultWrapper1083816 input] (clojure.core/let [rawinput1083815 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083817 {"message" (portkey.aws/search-for-tag rawinput1083815 "message" :flattened? nil :result-wrapper resultWrapper1083816)}] (clojure.core/cond-> {} (letvar1083817 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083817 ["message" :content])))))))

(clojure.core/defn- response-missing-customs-exception ([input] (response-missing-customs-exception nil input)) ([resultWrapper1083819 input] (clojure.core/let [rawinput1083818 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083820 {"message" (portkey.aws/search-for-tag rawinput1083818 "message" :flattened? nil :result-wrapper resultWrapper1083819)}] (clojure.core/cond-> {} (letvar1083820 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083820 ["message" :content])))))))

(clojure.core/defn- response-canceled-job-id-exception ([input] (response-canceled-job-id-exception nil input)) ([resultWrapper1083822 input] (clojure.core/let [rawinput1083821 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083823 {"message" (portkey.aws/search-for-tag rawinput1083821 "message" :flattened? nil :result-wrapper resultWrapper1083822)}] (clojure.core/cond-> {} (letvar1083823 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083823 ["message" :content])))))))

(clojure.core/defn- response-no-such-bucket-exception ([input] (response-no-such-bucket-exception nil input)) ([resultWrapper1083825 input] (clojure.core/let [rawinput1083824 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083826 {"message" (portkey.aws/search-for-tag rawinput1083824 "message" :flattened? nil :result-wrapper resultWrapper1083825)}] (clojure.core/cond-> {} (letvar1083826 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083826 ["message" :content])))))))

(clojure.core/defn- response-get-status-output ([input] (response-get-status-output nil input)) ([resultWrapper1083828 input] (clojure.core/let [rawinput1083827 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083829 {"LogKey" (portkey.aws/search-for-tag rawinput1083827 "LogKey" :flattened? nil :result-wrapper resultWrapper1083828), "Carrier" (portkey.aws/search-for-tag rawinput1083827 "Carrier" :flattened? nil :result-wrapper resultWrapper1083828), "ArtifactList" (portkey.aws/search-for-tag rawinput1083827 "ArtifactList" :flattened? nil :result-wrapper resultWrapper1083828), "JobType" (portkey.aws/search-for-tag rawinput1083827 "JobType" :flattened? nil :result-wrapper resultWrapper1083828), "ErrorCount" (portkey.aws/search-for-tag rawinput1083827 "ErrorCount" :flattened? nil :result-wrapper resultWrapper1083828), "ProgressCode" (portkey.aws/search-for-tag rawinput1083827 "ProgressCode" :flattened? nil :result-wrapper resultWrapper1083828), "TrackingNumber" (portkey.aws/search-for-tag rawinput1083827 "TrackingNumber" :flattened? nil :result-wrapper resultWrapper1083828), "Signature" (portkey.aws/search-for-tag rawinput1083827 "Signature" :flattened? nil :result-wrapper resultWrapper1083828), "SignatureFileContents" (portkey.aws/search-for-tag rawinput1083827 "SignatureFileContents" :flattened? nil :result-wrapper resultWrapper1083828), "ProgressMessage" (portkey.aws/search-for-tag rawinput1083827 "ProgressMessage" :flattened? nil :result-wrapper resultWrapper1083828), "CreationDate" (portkey.aws/search-for-tag rawinput1083827 "CreationDate" :flattened? nil :result-wrapper resultWrapper1083828), "LocationCode" (portkey.aws/search-for-tag rawinput1083827 "LocationCode" :flattened? nil :result-wrapper resultWrapper1083828), "CurrentManifest" (portkey.aws/search-for-tag rawinput1083827 "CurrentManifest" :flattened? nil :result-wrapper resultWrapper1083828), "LocationMessage" (portkey.aws/search-for-tag rawinput1083827 "LocationMessage" :flattened? nil :result-wrapper resultWrapper1083828), "LogBucket" (portkey.aws/search-for-tag rawinput1083827 "LogBucket" :flattened? nil :result-wrapper resultWrapper1083828), "JobId" (portkey.aws/search-for-tag rawinput1083827 "JobId" :flattened? nil :result-wrapper resultWrapper1083828)}] (clojure.core/cond-> {} (letvar1083829 "LogKey") (clojure.core/assoc :log-key (deser-log-key (clojure.core/get-in letvar1083829 ["LogKey" :content]))) (letvar1083829 "Carrier") (clojure.core/assoc :carrier (deser-carrier (clojure.core/get-in letvar1083829 ["Carrier" :content]))) (letvar1083829 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar1083829 ["ArtifactList" :content]))) (letvar1083829 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar1083829 ["JobType" :content]))) (letvar1083829 "ErrorCount") (clojure.core/assoc :error-count (deser-error-count (clojure.core/get-in letvar1083829 ["ErrorCount" :content]))) (letvar1083829 "ProgressCode") (clojure.core/assoc :progress-code (deser-progress-code (clojure.core/get-in letvar1083829 ["ProgressCode" :content]))) (letvar1083829 "TrackingNumber") (clojure.core/assoc :tracking-number (deser-tracking-number (clojure.core/get-in letvar1083829 ["TrackingNumber" :content]))) (letvar1083829 "Signature") (clojure.core/assoc :signature (deser-signature (clojure.core/get-in letvar1083829 ["Signature" :content]))) (letvar1083829 "SignatureFileContents") (clojure.core/assoc :signature-file-contents (deser-signature (clojure.core/get-in letvar1083829 ["SignatureFileContents" :content]))) (letvar1083829 "ProgressMessage") (clojure.core/assoc :progress-message (deser-progress-message (clojure.core/get-in letvar1083829 ["ProgressMessage" :content]))) (letvar1083829 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar1083829 ["CreationDate" :content]))) (letvar1083829 "LocationCode") (clojure.core/assoc :location-code (deser-location-code (clojure.core/get-in letvar1083829 ["LocationCode" :content]))) (letvar1083829 "CurrentManifest") (clojure.core/assoc :current-manifest (deser-current-manifest (clojure.core/get-in letvar1083829 ["CurrentManifest" :content]))) (letvar1083829 "LocationMessage") (clojure.core/assoc :location-message (deser-location-message (clojure.core/get-in letvar1083829 ["LocationMessage" :content]))) (letvar1083829 "LogBucket") (clojure.core/assoc :log-bucket (deser-log-bucket (clojure.core/get-in letvar1083829 ["LogBucket" :content]))) (letvar1083829 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1083829 ["JobId" :content])))))))

(clojure.core/defn- response-create-job-quota-exceeded-exception ([input] (response-create-job-quota-exceeded-exception nil input)) ([resultWrapper1083831 input] (clojure.core/let [rawinput1083830 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083832 {"message" (portkey.aws/search-for-tag rawinput1083830 "message" :flattened? nil :result-wrapper resultWrapper1083831)}] (clojure.core/cond-> {} (letvar1083832 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083832 ["message" :content])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1083834 input] (clojure.core/let [rawinput1083833 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083835 {"message" (portkey.aws/search-for-tag rawinput1083833 "message" :flattened? nil :result-wrapper resultWrapper1083834)}] (clojure.core/cond-> {} (letvar1083835 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083835 ["message" :content])))))))

(clojure.core/defn- response-update-job-output ([input] (response-update-job-output nil input)) ([resultWrapper1083837 input] (clojure.core/let [rawinput1083836 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083838 {"Success" (portkey.aws/search-for-tag rawinput1083836 "Success" :flattened? nil :result-wrapper resultWrapper1083837), "WarningMessage" (portkey.aws/search-for-tag rawinput1083836 "WarningMessage" :flattened? nil :result-wrapper resultWrapper1083837), "ArtifactList" (portkey.aws/search-for-tag rawinput1083836 "ArtifactList" :flattened? nil :result-wrapper resultWrapper1083837)}] (clojure.core/cond-> {} (letvar1083838 "Success") (clojure.core/assoc :success (deser-success (clojure.core/get-in letvar1083838 ["Success" :content]))) (letvar1083838 "WarningMessage") (clojure.core/assoc :warning-message (deser-warning-message (clojure.core/get-in letvar1083838 ["WarningMessage" :content]))) (letvar1083838 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar1083838 ["ArtifactList" :content])))))))

(clojure.core/defn- response-invalid-file-system-exception ([input] (response-invalid-file-system-exception nil input)) ([resultWrapper1083840 input] (clojure.core/let [rawinput1083839 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083841 {"message" (portkey.aws/search-for-tag rawinput1083839 "message" :flattened? nil :result-wrapper resultWrapper1083840)}] (clojure.core/cond-> {} (letvar1083841 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083841 ["message" :content])))))))

(clojure.core/defn- response-invalid-access-key-id-exception ([input] (response-invalid-access-key-id-exception nil input)) ([resultWrapper1083843 input] (clojure.core/let [rawinput1083842 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083844 {"message" (portkey.aws/search-for-tag rawinput1083842 "message" :flattened? nil :result-wrapper resultWrapper1083843)}] (clojure.core/cond-> {} (letvar1083844 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar1083844 ["message" :content])))))))

(clojure.core/defn- response-create-job-output ([input] (response-create-job-output nil input)) ([resultWrapper1083846 input] (clojure.core/let [rawinput1083845 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1083847 {"JobId" (portkey.aws/search-for-tag rawinput1083845 "JobId" :flattened? nil :result-wrapper resultWrapper1083846), "JobType" (portkey.aws/search-for-tag rawinput1083845 "JobType" :flattened? nil :result-wrapper resultWrapper1083846), "Signature" (portkey.aws/search-for-tag rawinput1083845 "Signature" :flattened? nil :result-wrapper resultWrapper1083846), "SignatureFileContents" (portkey.aws/search-for-tag rawinput1083845 "SignatureFileContents" :flattened? nil :result-wrapper resultWrapper1083846), "WarningMessage" (portkey.aws/search-for-tag rawinput1083845 "WarningMessage" :flattened? nil :result-wrapper resultWrapper1083846), "ArtifactList" (portkey.aws/search-for-tag rawinput1083845 "ArtifactList" :flattened? nil :result-wrapper resultWrapper1083846)}] (clojure.core/cond-> {} (letvar1083847 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1083847 ["JobId" :content]))) (letvar1083847 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar1083847 ["JobType" :content]))) (letvar1083847 "Signature") (clojure.core/assoc :signature (deser-signature (clojure.core/get-in letvar1083847 ["Signature" :content]))) (letvar1083847 "SignatureFileContents") (clojure.core/assoc :signature-file-contents (deser-signature-file-contents (clojure.core/get-in letvar1083847 ["SignatureFileContents" :content]))) (letvar1083847 "WarningMessage") (clojure.core/assoc :warning-message (deser-warning-message (clojure.core/get-in letvar1083847 ["WarningMessage" :content]))) (letvar1083847 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar1083847 ["ArtifactList" :content])))))))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/log-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/create-job-input (clojure.spec.alpha/keys :req-un [:portkey.aws.importexport.-2010-06-01/job-type :portkey.aws.importexport.-2010-06-01/manifest :portkey.aws.importexport.-2010-06-01/validate-only] :opt-un [:portkey.aws.importexport.-2010-06-01/manifest-addendum :portkey.aws.importexport.-2010-06-01/api-version]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-version-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-version-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-version-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/carrier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-address-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-address-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-address-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/country (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/jobs-list (clojure.spec.alpha/coll-of :portkey.aws.importexport.-2010-06-01/job))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/api-version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/cancel-job-input (clojure.spec.alpha/keys :req-un [:portkey.aws.importexport.-2010-06-01/job-id] :opt-un [:portkey.aws.importexport.-2010-06-01/api-version]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/artifact-list (clojure.spec.alpha/coll-of :portkey.aws.importexport.-2010-06-01/artifact))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.malformed-manifest-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/malformed-manifest-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.malformed-manifest-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-manifest-field-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-manifest-field-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-manifest-field-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.get-shipping-label-input/job-ids (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/job-id-list))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/get-shipping-label-input (clojure.spec.alpha/keys :req-un [:portkey.aws.importexport.-2010-06-01.get-shipping-label-input/job-ids] :opt-un [:portkey.aws.importexport.-2010-06-01/country :portkey.aws.importexport.-2010-06-01/api-version :portkey.aws.importexport.-2010-06-01/city :portkey.aws.importexport.-2010-06-01/company :portkey.aws.importexport.-2010-06-01/state-or-province :portkey.aws.importexport.-2010-06-01/street-3 :portkey.aws.importexport.-2010-06-01/name :portkey.aws.importexport.-2010-06-01/postal-code :portkey.aws.importexport.-2010-06-01/street-2 :portkey.aws.importexport.-2010-06-01/phone-number :portkey.aws.importexport.-2010-06-01/street-1]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.get-shipping-label-output/shipping-label-url (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/generic-string))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.get-shipping-label-output/warning (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/generic-string))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/get-shipping-label-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.get-shipping-label-output/shipping-label-url :portkey.aws.importexport.-2010-06-01.get-shipping-label-output/warning]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.multiple-regions-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/multiple-regions-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.multiple-regions-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.unable-to-update-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/unable-to-update-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.unable-to-update-job-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/city (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/job-type #{:export "Export" "Import" :import})

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/company (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/error-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/validate-only clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/state-or-province (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/manifest-addendum (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.missing-manifest-field-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/missing-manifest-field-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.missing-manifest-field-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.list-jobs-output/jobs (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/jobs-list))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/list-jobs-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.list-jobs-output/jobs :portkey.aws.importexport.-2010-06-01/is-truncated]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.expired-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/expired-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.expired-job-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-job-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/manifest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/artifact (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/description :portkey.aws.importexport.-2010-06-01/url]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.bucket-permission-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/bucket-permission-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.bucket-permission-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/progress-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/street-3 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/is-truncated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/update-job-input (clojure.spec.alpha/keys :req-un [:portkey.aws.importexport.-2010-06-01/job-id :portkey.aws.importexport.-2010-06-01/manifest :portkey.aws.importexport.-2010-06-01/job-type :portkey.aws.importexport.-2010-06-01/validate-only] :opt-un [:portkey.aws.importexport.-2010-06-01/api-version]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/tracking-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/postal-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/max-jobs clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/success clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/cancel-job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/success]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/signature-file-contents (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/street-2 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-customs-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-customs-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-customs-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.missing-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/missing-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.missing-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/get-status-input (clojure.spec.alpha/keys :req-un [:portkey.aws.importexport.-2010-06-01/job-id] :opt-un [:portkey.aws.importexport.-2010-06-01/api-version]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/list-jobs-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/max-jobs :portkey.aws.importexport.-2010-06-01/marker :portkey.aws.importexport.-2010-06-01/api-version]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/phone-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.unable-to-cancel-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/unable-to-cancel-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.unable-to-cancel-job-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.missing-customs-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/missing-customs-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.missing-customs-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/progress-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/location-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/is-canceled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/job-id :portkey.aws.importexport.-2010-06-01/creation-date :portkey.aws.importexport.-2010-06-01/is-canceled :portkey.aws.importexport.-2010-06-01/job-type]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/current-manifest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/location-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.canceled-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.canceled-job-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.no-such-bucket-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/no-such-bucket-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.no-such-bucket-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/log-bucket (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.get-status-output/signature-file-contents (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/signature))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/get-status-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/log-key :portkey.aws.importexport.-2010-06-01/carrier :portkey.aws.importexport.-2010-06-01/artifact-list :portkey.aws.importexport.-2010-06-01/job-type :portkey.aws.importexport.-2010-06-01/error-count :portkey.aws.importexport.-2010-06-01/progress-code :portkey.aws.importexport.-2010-06-01/tracking-number :portkey.aws.importexport.-2010-06-01/signature :portkey.aws.importexport.-2010-06-01.get-status-output/signature-file-contents :portkey.aws.importexport.-2010-06-01/progress-message :portkey.aws.importexport.-2010-06-01/creation-date :portkey.aws.importexport.-2010-06-01/location-code :portkey.aws.importexport.-2010-06-01/current-manifest :portkey.aws.importexport.-2010-06-01/location-message :portkey.aws.importexport.-2010-06-01/log-bucket :portkey.aws.importexport.-2010-06-01/job-id]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.create-job-quota-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/create-job-quota-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.create-job-quota-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/update-job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/success :portkey.aws.importexport.-2010-06-01/warning-message :portkey.aws.importexport.-2010-06-01/artifact-list]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/job-id-list (clojure.spec.alpha/coll-of :portkey.aws.importexport.-2010-06-01/generic-string))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-file-system-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-file-system-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-file-system-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-access-key-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-access-key-id-exception/message]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/warning-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/street-1 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/create-job-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/job-id :portkey.aws.importexport.-2010-06-01/job-type :portkey.aws.importexport.-2010-06-01/signature :portkey.aws.importexport.-2010-06-01/signature-file-contents :portkey.aws.importexport.-2010-06-01/warning-message :portkey.aws.importexport.-2010-06-01/artifact-list]))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn cancel-job "This operation cancels a specified job. Only the job owner can cancel it. The\noperation fails if the job has already started or is complete." ([cancel-job-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-cancel-job-input cancel-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/cancel-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=CancelJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/cancel-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CancelJobResult", :http.request.configuration/action "CancelJob", :http.request.configuration/output-deser-fn response-cancel-job-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "UnableToCancelJobIdException" :portkey.aws.importexport.-2010-06-01/unable-to-cancel-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/cancel-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/cancel-job-output))

(clojure.core/defn create-job "This operation initiates the process of scheduling an upload or download of your\ndata. You include in the request a manifest that describes the data transfer\nspecifics. The response to the request includes a job ID, which you can use in\nother operations, a signature that you use to identify your storage device, and\nthe address where you should ship your storage device." ([create-job-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-job-input create-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/create-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=CreateJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/create-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateJobResult", :http.request.configuration/action "CreateJob", :http.request.configuration/output-deser-fn response-create-job-output, :http.request.spec/error-spec {"InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport.-2010-06-01/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport.-2010-06-01/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport.-2010-06-01/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport.-2010-06-01/multiple-regions-exception, "MissingManifestFieldException" :portkey.aws.importexport.-2010-06-01/missing-manifest-field-exception, "InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport.-2010-06-01/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport.-2010-06-01/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport.-2010-06-01/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport.-2010-06-01/missing-customs-exception, "NoSuchBucketException" :portkey.aws.importexport.-2010-06-01/no-such-bucket-exception, "CreateJobQuotaExceededException" :portkey.aws.importexport.-2010-06-01/create-job-quota-exceeded-exception, "InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport.-2010-06-01/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/create-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/create-job-output))

(clojure.core/defn get-shipping-label "This operation generates a pre-paid UPS shipping label that you will use to ship\nyour device to AWS for processing." ([get-shipping-label-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-shipping-label-input get-shipping-label-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/get-shipping-label-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=GetShippingLabel", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/get-shipping-label-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetShippingLabelResult", :http.request.configuration/action "GetShippingLabel", :http.request.configuration/output-deser-fn response-get-shipping-label-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidAddressException" :portkey.aws.importexport.-2010-06-01/invalid-address-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception, "InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-shipping-label :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/get-shipping-label-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/get-shipping-label-output))

(clojure.core/defn get-status "This operation returns information about a job, including where the job is in\nthe processing pipeline, the status of the results, and the signature value\nassociated with the job. You can only return information about jobs you own." ([get-status-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-status-input get-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/get-status-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=GetStatus", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/get-status-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetStatusResult", :http.request.configuration/action "GetStatus", :http.request.configuration/output-deser-fn response-get-status-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception}})))))
(clojure.spec.alpha/fdef get-status :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/get-status-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/get-status-output))

(clojure.core/defn list-jobs "This operation returns the jobs associated with the requester. AWS Import/Export\nlists the jobs in reverse chronological order based on the date of creation. For\nexample if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the\nListJobs operation would return Test2 followed by Test1." ([] (list-jobs {})) ([list-jobs-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-jobs-input list-jobs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/list-jobs-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=ListJobs", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/list-jobs-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListJobsResult", :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn response-list-jobs-output, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.importexport.-2010-06-01/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/list-jobs-output))

(clojure.core/defn update-job "You use this operation to change the parameters specified in the original\nmanifest file by supplying a new manifest file. The manifest file attached to\nthis request replaces the original manifest file. You can only use the operation\nafter a CreateJob request but before the data transfer starts and you can only\nuse it on jobs you own." ([update-job-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-job-input update-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/update-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=UpdateJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/update-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateJobResult", :http.request.configuration/action "UpdateJob", :http.request.configuration/output-deser-fn response-update-job-output, :http.request.spec/error-spec {"InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport.-2010-06-01/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport.-2010-06-01/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport.-2010-06-01/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport.-2010-06-01/multiple-regions-exception, "UnableToUpdateJobIdException" :portkey.aws.importexport.-2010-06-01/unable-to-update-job-id-exception, "MissingManifestFieldException" :portkey.aws.importexport.-2010-06-01/missing-manifest-field-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport.-2010-06-01/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport.-2010-06-01/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport.-2010-06-01/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport.-2010-06-01/missing-customs-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "NoSuchBucketException" :portkey.aws.importexport.-2010-06-01/no-such-bucket-exception, "InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport.-2010-06-01/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception}})))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/update-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/update-job-output))
