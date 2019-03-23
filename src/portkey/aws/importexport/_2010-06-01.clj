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

(clojure.core/defn- deser-artifact [input] (clojure.core/let [letvar429635 {"Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "URL" (portkey.aws/search-for-tag input "URL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar429635 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar429635 ["Description" :content]))) (letvar429635 "URL") (clojure.core/assoc :url (deser-url (clojure.core/get-in letvar429635 ["URL" :content]))))))

(clojure.core/defn- deser-error-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-progress-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-is-truncated [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-tracking-number [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-signature [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-success [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-signature-file-contents [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-description [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-generic-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-progress-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-creation-date [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-location-code [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-is-canceled [input] (clojure.core/when-let [boolstr__283693__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__283693__auto__) true (clojure.core/= "false" boolstr__283693__auto__) false)))

(clojure.core/defn- deser-job [input] (clojure.core/let [letvar429796 {"JobId" (portkey.aws/search-for-tag input "JobId" :flattened? nil :xmlAttribute? nil), "CreationDate" (portkey.aws/search-for-tag input "CreationDate" :flattened? nil :xmlAttribute? nil), "IsCanceled" (portkey.aws/search-for-tag input "IsCanceled" :flattened? nil :xmlAttribute? nil), "JobType" (portkey.aws/search-for-tag input "JobType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar429796 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar429796 ["JobId" :content]))) (letvar429796 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar429796 ["CreationDate" :content]))) (letvar429796 "IsCanceled") (clojure.core/assoc :is-canceled (deser-is-canceled (clojure.core/get-in letvar429796 ["IsCanceled" :content]))) (letvar429796 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar429796 ["JobType" :content]))))))

(clojure.core/defn- deser-current-manifest [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-location-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-log-bucket [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-warning-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-job-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-invalid-version-exception ([input] (response-invalid-version-exception nil input)) ([resultWrapper429823 input] (clojure.core/let [rawinput429822 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429824 {"message" (portkey.aws/search-for-tag rawinput429822 "message" :flattened? nil :result-wrapper resultWrapper429823)}] (clojure.core/cond-> {} (letvar429824 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429824 ["message" :content])))))))

(clojure.core/defn- response-invalid-address-exception ([input] (response-invalid-address-exception nil input)) ([resultWrapper429826 input] (clojure.core/let [rawinput429825 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429827 {"message" (portkey.aws/search-for-tag rawinput429825 "message" :flattened? nil :result-wrapper resultWrapper429826)}] (clojure.core/cond-> {} (letvar429827 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429827 ["message" :content])))))))

(clojure.core/defn- response-malformed-manifest-exception ([input] (response-malformed-manifest-exception nil input)) ([resultWrapper429829 input] (clojure.core/let [rawinput429828 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429830 {"message" (portkey.aws/search-for-tag rawinput429828 "message" :flattened? nil :result-wrapper resultWrapper429829)}] (clojure.core/cond-> {} (letvar429830 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429830 ["message" :content])))))))

(clojure.core/defn- response-invalid-manifest-field-exception ([input] (response-invalid-manifest-field-exception nil input)) ([resultWrapper429832 input] (clojure.core/let [rawinput429831 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429833 {"message" (portkey.aws/search-for-tag rawinput429831 "message" :flattened? nil :result-wrapper resultWrapper429832)}] (clojure.core/cond-> {} (letvar429833 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429833 ["message" :content])))))))

(clojure.core/defn- response-get-shipping-label-output ([input] (response-get-shipping-label-output nil input)) ([resultWrapper429835 input] (clojure.core/let [rawinput429834 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429836 {"ShippingLabelURL" (portkey.aws/search-for-tag rawinput429834 "ShippingLabelURL" :flattened? nil :result-wrapper resultWrapper429835), "Warning" (portkey.aws/search-for-tag rawinput429834 "Warning" :flattened? nil :result-wrapper resultWrapper429835)}] (clojure.core/cond-> {} (letvar429836 "ShippingLabelURL") (clojure.core/assoc :shipping-label-url (deser-generic-string (clojure.core/get-in letvar429836 ["ShippingLabelURL" :content]))) (letvar429836 "Warning") (clojure.core/assoc :warning (deser-generic-string (clojure.core/get-in letvar429836 ["Warning" :content])))))))

(clojure.core/defn- response-multiple-regions-exception ([input] (response-multiple-regions-exception nil input)) ([resultWrapper429838 input] (clojure.core/let [rawinput429837 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429839 {"message" (portkey.aws/search-for-tag rawinput429837 "message" :flattened? nil :result-wrapper resultWrapper429838)}] (clojure.core/cond-> {} (letvar429839 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429839 ["message" :content])))))))

(clojure.core/defn- response-unable-to-update-job-id-exception ([input] (response-unable-to-update-job-id-exception nil input)) ([resultWrapper429841 input] (clojure.core/let [rawinput429840 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429842 {"message" (portkey.aws/search-for-tag rawinput429840 "message" :flattened? nil :result-wrapper resultWrapper429841)}] (clojure.core/cond-> {} (letvar429842 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429842 ["message" :content])))))))

(clojure.core/defn- response-missing-manifest-field-exception ([input] (response-missing-manifest-field-exception nil input)) ([resultWrapper429844 input] (clojure.core/let [rawinput429843 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429845 {"message" (portkey.aws/search-for-tag rawinput429843 "message" :flattened? nil :result-wrapper resultWrapper429844)}] (clojure.core/cond-> {} (letvar429845 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429845 ["message" :content])))))))

(clojure.core/defn- response-list-jobs-output ([input] (response-list-jobs-output nil input)) ([resultWrapper429847 input] (clojure.core/let [rawinput429846 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429848 {"Jobs" (portkey.aws/search-for-tag rawinput429846 "Jobs" :flattened? nil :result-wrapper resultWrapper429847), "IsTruncated" (portkey.aws/search-for-tag rawinput429846 "IsTruncated" :flattened? nil :result-wrapper resultWrapper429847)}] (clojure.core/cond-> {} (letvar429848 "Jobs") (clojure.core/assoc :jobs (deser-jobs-list (clojure.core/get-in letvar429848 ["Jobs" :content]))) (letvar429848 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar429848 ["IsTruncated" :content])))))))

(clojure.core/defn- response-expired-job-id-exception ([input] (response-expired-job-id-exception nil input)) ([resultWrapper429850 input] (clojure.core/let [rawinput429849 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429851 {"message" (portkey.aws/search-for-tag rawinput429849 "message" :flattened? nil :result-wrapper resultWrapper429850)}] (clojure.core/cond-> {} (letvar429851 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429851 ["message" :content])))))))

(clojure.core/defn- response-invalid-job-id-exception ([input] (response-invalid-job-id-exception nil input)) ([resultWrapper429853 input] (clojure.core/let [rawinput429852 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429854 {"message" (portkey.aws/search-for-tag rawinput429852 "message" :flattened? nil :result-wrapper resultWrapper429853)}] (clojure.core/cond-> {} (letvar429854 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429854 ["message" :content])))))))

(clojure.core/defn- response-bucket-permission-exception ([input] (response-bucket-permission-exception nil input)) ([resultWrapper429856 input] (clojure.core/let [rawinput429855 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429857 {"message" (portkey.aws/search-for-tag rawinput429855 "message" :flattened? nil :result-wrapper resultWrapper429856)}] (clojure.core/cond-> {} (letvar429857 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429857 ["message" :content])))))))

(clojure.core/defn- response-cancel-job-output ([input] (response-cancel-job-output nil input)) ([resultWrapper429859 input] (clojure.core/let [rawinput429858 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429860 {"Success" (portkey.aws/search-for-tag rawinput429858 "Success" :flattened? nil :result-wrapper resultWrapper429859)}] (clojure.core/cond-> {} (letvar429860 "Success") (clojure.core/assoc :success (deser-success (clojure.core/get-in letvar429860 ["Success" :content])))))))

(clojure.core/defn- response-invalid-customs-exception ([input] (response-invalid-customs-exception nil input)) ([resultWrapper429862 input] (clojure.core/let [rawinput429861 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429863 {"message" (portkey.aws/search-for-tag rawinput429861 "message" :flattened? nil :result-wrapper resultWrapper429862)}] (clojure.core/cond-> {} (letvar429863 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429863 ["message" :content])))))))

(clojure.core/defn- response-missing-parameter-exception ([input] (response-missing-parameter-exception nil input)) ([resultWrapper429865 input] (clojure.core/let [rawinput429864 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429866 {"message" (portkey.aws/search-for-tag rawinput429864 "message" :flattened? nil :result-wrapper resultWrapper429865)}] (clojure.core/cond-> {} (letvar429866 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429866 ["message" :content])))))))

(clojure.core/defn- response-unable-to-cancel-job-id-exception ([input] (response-unable-to-cancel-job-id-exception nil input)) ([resultWrapper429868 input] (clojure.core/let [rawinput429867 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429869 {"message" (portkey.aws/search-for-tag rawinput429867 "message" :flattened? nil :result-wrapper resultWrapper429868)}] (clojure.core/cond-> {} (letvar429869 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429869 ["message" :content])))))))

(clojure.core/defn- response-missing-customs-exception ([input] (response-missing-customs-exception nil input)) ([resultWrapper429871 input] (clojure.core/let [rawinput429870 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429872 {"message" (portkey.aws/search-for-tag rawinput429870 "message" :flattened? nil :result-wrapper resultWrapper429871)}] (clojure.core/cond-> {} (letvar429872 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429872 ["message" :content])))))))

(clojure.core/defn- response-canceled-job-id-exception ([input] (response-canceled-job-id-exception nil input)) ([resultWrapper429874 input] (clojure.core/let [rawinput429873 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429875 {"message" (portkey.aws/search-for-tag rawinput429873 "message" :flattened? nil :result-wrapper resultWrapper429874)}] (clojure.core/cond-> {} (letvar429875 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429875 ["message" :content])))))))

(clojure.core/defn- response-no-such-bucket-exception ([input] (response-no-such-bucket-exception nil input)) ([resultWrapper429877 input] (clojure.core/let [rawinput429876 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429878 {"message" (portkey.aws/search-for-tag rawinput429876 "message" :flattened? nil :result-wrapper resultWrapper429877)}] (clojure.core/cond-> {} (letvar429878 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429878 ["message" :content])))))))

(clojure.core/defn- response-get-status-output ([input] (response-get-status-output nil input)) ([resultWrapper429880 input] (clojure.core/let [rawinput429879 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429881 {"LogKey" (portkey.aws/search-for-tag rawinput429879 "LogKey" :flattened? nil :result-wrapper resultWrapper429880), "Carrier" (portkey.aws/search-for-tag rawinput429879 "Carrier" :flattened? nil :result-wrapper resultWrapper429880), "ArtifactList" (portkey.aws/search-for-tag rawinput429879 "ArtifactList" :flattened? nil :result-wrapper resultWrapper429880), "JobType" (portkey.aws/search-for-tag rawinput429879 "JobType" :flattened? nil :result-wrapper resultWrapper429880), "ErrorCount" (portkey.aws/search-for-tag rawinput429879 "ErrorCount" :flattened? nil :result-wrapper resultWrapper429880), "ProgressCode" (portkey.aws/search-for-tag rawinput429879 "ProgressCode" :flattened? nil :result-wrapper resultWrapper429880), "TrackingNumber" (portkey.aws/search-for-tag rawinput429879 "TrackingNumber" :flattened? nil :result-wrapper resultWrapper429880), "Signature" (portkey.aws/search-for-tag rawinput429879 "Signature" :flattened? nil :result-wrapper resultWrapper429880), "SignatureFileContents" (portkey.aws/search-for-tag rawinput429879 "SignatureFileContents" :flattened? nil :result-wrapper resultWrapper429880), "ProgressMessage" (portkey.aws/search-for-tag rawinput429879 "ProgressMessage" :flattened? nil :result-wrapper resultWrapper429880), "CreationDate" (portkey.aws/search-for-tag rawinput429879 "CreationDate" :flattened? nil :result-wrapper resultWrapper429880), "LocationCode" (portkey.aws/search-for-tag rawinput429879 "LocationCode" :flattened? nil :result-wrapper resultWrapper429880), "CurrentManifest" (portkey.aws/search-for-tag rawinput429879 "CurrentManifest" :flattened? nil :result-wrapper resultWrapper429880), "LocationMessage" (portkey.aws/search-for-tag rawinput429879 "LocationMessage" :flattened? nil :result-wrapper resultWrapper429880), "LogBucket" (portkey.aws/search-for-tag rawinput429879 "LogBucket" :flattened? nil :result-wrapper resultWrapper429880), "JobId" (portkey.aws/search-for-tag rawinput429879 "JobId" :flattened? nil :result-wrapper resultWrapper429880)}] (clojure.core/cond-> {} (letvar429881 "LogKey") (clojure.core/assoc :log-key (deser-log-key (clojure.core/get-in letvar429881 ["LogKey" :content]))) (letvar429881 "Carrier") (clojure.core/assoc :carrier (deser-carrier (clojure.core/get-in letvar429881 ["Carrier" :content]))) (letvar429881 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar429881 ["ArtifactList" :content]))) (letvar429881 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar429881 ["JobType" :content]))) (letvar429881 "ErrorCount") (clojure.core/assoc :error-count (deser-error-count (clojure.core/get-in letvar429881 ["ErrorCount" :content]))) (letvar429881 "ProgressCode") (clojure.core/assoc :progress-code (deser-progress-code (clojure.core/get-in letvar429881 ["ProgressCode" :content]))) (letvar429881 "TrackingNumber") (clojure.core/assoc :tracking-number (deser-tracking-number (clojure.core/get-in letvar429881 ["TrackingNumber" :content]))) (letvar429881 "Signature") (clojure.core/assoc :signature (deser-signature (clojure.core/get-in letvar429881 ["Signature" :content]))) (letvar429881 "SignatureFileContents") (clojure.core/assoc :signature-file-contents (deser-signature (clojure.core/get-in letvar429881 ["SignatureFileContents" :content]))) (letvar429881 "ProgressMessage") (clojure.core/assoc :progress-message (deser-progress-message (clojure.core/get-in letvar429881 ["ProgressMessage" :content]))) (letvar429881 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar429881 ["CreationDate" :content]))) (letvar429881 "LocationCode") (clojure.core/assoc :location-code (deser-location-code (clojure.core/get-in letvar429881 ["LocationCode" :content]))) (letvar429881 "CurrentManifest") (clojure.core/assoc :current-manifest (deser-current-manifest (clojure.core/get-in letvar429881 ["CurrentManifest" :content]))) (letvar429881 "LocationMessage") (clojure.core/assoc :location-message (deser-location-message (clojure.core/get-in letvar429881 ["LocationMessage" :content]))) (letvar429881 "LogBucket") (clojure.core/assoc :log-bucket (deser-log-bucket (clojure.core/get-in letvar429881 ["LogBucket" :content]))) (letvar429881 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar429881 ["JobId" :content])))))))

(clojure.core/defn- response-create-job-quota-exceeded-exception ([input] (response-create-job-quota-exceeded-exception nil input)) ([resultWrapper429883 input] (clojure.core/let [rawinput429882 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429884 {"message" (portkey.aws/search-for-tag rawinput429882 "message" :flattened? nil :result-wrapper resultWrapper429883)}] (clojure.core/cond-> {} (letvar429884 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429884 ["message" :content])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper429886 input] (clojure.core/let [rawinput429885 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429887 {"message" (portkey.aws/search-for-tag rawinput429885 "message" :flattened? nil :result-wrapper resultWrapper429886)}] (clojure.core/cond-> {} (letvar429887 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429887 ["message" :content])))))))

(clojure.core/defn- response-update-job-output ([input] (response-update-job-output nil input)) ([resultWrapper429889 input] (clojure.core/let [rawinput429888 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429890 {"Success" (portkey.aws/search-for-tag rawinput429888 "Success" :flattened? nil :result-wrapper resultWrapper429889), "WarningMessage" (portkey.aws/search-for-tag rawinput429888 "WarningMessage" :flattened? nil :result-wrapper resultWrapper429889), "ArtifactList" (portkey.aws/search-for-tag rawinput429888 "ArtifactList" :flattened? nil :result-wrapper resultWrapper429889)}] (clojure.core/cond-> {} (letvar429890 "Success") (clojure.core/assoc :success (deser-success (clojure.core/get-in letvar429890 ["Success" :content]))) (letvar429890 "WarningMessage") (clojure.core/assoc :warning-message (deser-warning-message (clojure.core/get-in letvar429890 ["WarningMessage" :content]))) (letvar429890 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar429890 ["ArtifactList" :content])))))))

(clojure.core/defn- response-invalid-file-system-exception ([input] (response-invalid-file-system-exception nil input)) ([resultWrapper429892 input] (clojure.core/let [rawinput429891 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429893 {"message" (portkey.aws/search-for-tag rawinput429891 "message" :flattened? nil :result-wrapper resultWrapper429892)}] (clojure.core/cond-> {} (letvar429893 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429893 ["message" :content])))))))

(clojure.core/defn- response-invalid-access-key-id-exception ([input] (response-invalid-access-key-id-exception nil input)) ([resultWrapper429895 input] (clojure.core/let [rawinput429894 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429896 {"message" (portkey.aws/search-for-tag rawinput429894 "message" :flattened? nil :result-wrapper resultWrapper429895)}] (clojure.core/cond-> {} (letvar429896 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429896 ["message" :content])))))))

(clojure.core/defn- response-create-job-output ([input] (response-create-job-output nil input)) ([resultWrapper429898 input] (clojure.core/let [rawinput429897 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429899 {"JobId" (portkey.aws/search-for-tag rawinput429897 "JobId" :flattened? nil :result-wrapper resultWrapper429898), "JobType" (portkey.aws/search-for-tag rawinput429897 "JobType" :flattened? nil :result-wrapper resultWrapper429898), "Signature" (portkey.aws/search-for-tag rawinput429897 "Signature" :flattened? nil :result-wrapper resultWrapper429898), "SignatureFileContents" (portkey.aws/search-for-tag rawinput429897 "SignatureFileContents" :flattened? nil :result-wrapper resultWrapper429898), "WarningMessage" (portkey.aws/search-for-tag rawinput429897 "WarningMessage" :flattened? nil :result-wrapper resultWrapper429898), "ArtifactList" (portkey.aws/search-for-tag rawinput429897 "ArtifactList" :flattened? nil :result-wrapper resultWrapper429898)}] (clojure.core/cond-> {} (letvar429899 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar429899 ["JobId" :content]))) (letvar429899 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar429899 ["JobType" :content]))) (letvar429899 "Signature") (clojure.core/assoc :signature (deser-signature (clojure.core/get-in letvar429899 ["Signature" :content]))) (letvar429899 "SignatureFileContents") (clojure.core/assoc :signature-file-contents (deser-signature-file-contents (clojure.core/get-in letvar429899 ["SignatureFileContents" :content]))) (letvar429899 "WarningMessage") (clojure.core/assoc :warning-message (deser-warning-message (clojure.core/get-in letvar429899 ["WarningMessage" :content]))) (letvar429899 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar429899 ["ArtifactList" :content])))))))

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

(clojure.core/defn cancel-job ([cancel-job-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-cancel-job-input cancel-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/cancel-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=CancelJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/cancel-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CancelJobResult", :http.request.configuration/action "CancelJob", :http.request.configuration/output-deser-fn response-cancel-job-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "UnableToCancelJobIdException" :portkey.aws.importexport.-2010-06-01/unable-to-cancel-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/cancel-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/cancel-job-output))

(clojure.core/defn create-job ([create-job-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-job-input create-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/create-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=CreateJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/create-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateJobResult", :http.request.configuration/action "CreateJob", :http.request.configuration/output-deser-fn response-create-job-output, :http.request.spec/error-spec {"InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport.-2010-06-01/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport.-2010-06-01/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport.-2010-06-01/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport.-2010-06-01/multiple-regions-exception, "MissingManifestFieldException" :portkey.aws.importexport.-2010-06-01/missing-manifest-field-exception, "InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport.-2010-06-01/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport.-2010-06-01/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport.-2010-06-01/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport.-2010-06-01/missing-customs-exception, "NoSuchBucketException" :portkey.aws.importexport.-2010-06-01/no-such-bucket-exception, "CreateJobQuotaExceededException" :portkey.aws.importexport.-2010-06-01/create-job-quota-exceeded-exception, "InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport.-2010-06-01/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/create-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/create-job-output))

(clojure.core/defn get-shipping-label ([get-shipping-label-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-shipping-label-input get-shipping-label-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/get-shipping-label-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=GetShippingLabel", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/get-shipping-label-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetShippingLabelResult", :http.request.configuration/action "GetShippingLabel", :http.request.configuration/output-deser-fn response-get-shipping-label-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidAddressException" :portkey.aws.importexport.-2010-06-01/invalid-address-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception, "InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-shipping-label :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/get-shipping-label-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/get-shipping-label-output))

(clojure.core/defn get-status ([get-status-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-status-input get-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/get-status-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=GetStatus", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/get-status-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetStatusResult", :http.request.configuration/action "GetStatus", :http.request.configuration/output-deser-fn response-get-status-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception}})))))
(clojure.spec.alpha/fdef get-status :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/get-status-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/get-status-output))

(clojure.core/defn list-jobs ([] (list-jobs {})) ([list-jobs-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-jobs-input list-jobs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/list-jobs-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=ListJobs", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/list-jobs-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListJobsResult", :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn response-list-jobs-output, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.importexport.-2010-06-01/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/list-jobs-output))

(clojure.core/defn update-job ([update-job-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-job-input update-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport.-2010-06-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport.-2010-06-01/update-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=UpdateJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport.-2010-06-01/update-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateJobResult", :http.request.configuration/action "UpdateJob", :http.request.configuration/output-deser-fn response-update-job-output, :http.request.spec/error-spec {"InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport.-2010-06-01/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport.-2010-06-01/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport.-2010-06-01/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport.-2010-06-01/multiple-regions-exception, "UnableToUpdateJobIdException" :portkey.aws.importexport.-2010-06-01/unable-to-update-job-id-exception, "MissingManifestFieldException" :portkey.aws.importexport.-2010-06-01/missing-manifest-field-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport.-2010-06-01/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport.-2010-06-01/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport.-2010-06-01/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport.-2010-06-01/missing-customs-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "NoSuchBucketException" :portkey.aws.importexport.-2010-06-01/no-such-bucket-exception, "InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport.-2010-06-01/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception}})))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/update-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/update-job-output))
