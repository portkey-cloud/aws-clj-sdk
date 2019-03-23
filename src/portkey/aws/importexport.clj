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

(clojure.core/defn- deser-artifact [input] (clojure.core/let [letvar428880 {"Description" (portkey.aws/search-for-tag input "Description" :flattened? nil :xmlAttribute? nil), "URL" (portkey.aws/search-for-tag input "URL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar428880 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar428880 ["Description" :content]))) (letvar428880 "URL") (clojure.core/assoc :url (deser-url (clojure.core/get-in letvar428880 ["URL" :content]))))))

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

(clojure.core/defn- deser-job [input] (clojure.core/let [letvar429041 {"JobId" (portkey.aws/search-for-tag input "JobId" :flattened? nil :xmlAttribute? nil), "CreationDate" (portkey.aws/search-for-tag input "CreationDate" :flattened? nil :xmlAttribute? nil), "IsCanceled" (portkey.aws/search-for-tag input "IsCanceled" :flattened? nil :xmlAttribute? nil), "JobType" (portkey.aws/search-for-tag input "JobType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar429041 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar429041 ["JobId" :content]))) (letvar429041 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar429041 ["CreationDate" :content]))) (letvar429041 "IsCanceled") (clojure.core/assoc :is-canceled (deser-is-canceled (clojure.core/get-in letvar429041 ["IsCanceled" :content]))) (letvar429041 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar429041 ["JobType" :content]))))))

(clojure.core/defn- deser-current-manifest [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-location-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-log-bucket [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-warning-message [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-job-id [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- response-invalid-version-exception ([input] (response-invalid-version-exception nil input)) ([resultWrapper429068 input] (clojure.core/let [rawinput429067 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429069 {"message" (portkey.aws/search-for-tag rawinput429067 "message" :flattened? nil :result-wrapper resultWrapper429068)}] (clojure.core/cond-> {} (letvar429069 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429069 ["message" :content])))))))

(clojure.core/defn- response-invalid-address-exception ([input] (response-invalid-address-exception nil input)) ([resultWrapper429071 input] (clojure.core/let [rawinput429070 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429072 {"message" (portkey.aws/search-for-tag rawinput429070 "message" :flattened? nil :result-wrapper resultWrapper429071)}] (clojure.core/cond-> {} (letvar429072 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429072 ["message" :content])))))))

(clojure.core/defn- response-malformed-manifest-exception ([input] (response-malformed-manifest-exception nil input)) ([resultWrapper429074 input] (clojure.core/let [rawinput429073 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429075 {"message" (portkey.aws/search-for-tag rawinput429073 "message" :flattened? nil :result-wrapper resultWrapper429074)}] (clojure.core/cond-> {} (letvar429075 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429075 ["message" :content])))))))

(clojure.core/defn- response-invalid-manifest-field-exception ([input] (response-invalid-manifest-field-exception nil input)) ([resultWrapper429077 input] (clojure.core/let [rawinput429076 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429078 {"message" (portkey.aws/search-for-tag rawinput429076 "message" :flattened? nil :result-wrapper resultWrapper429077)}] (clojure.core/cond-> {} (letvar429078 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429078 ["message" :content])))))))

(clojure.core/defn- response-get-shipping-label-output ([input] (response-get-shipping-label-output nil input)) ([resultWrapper429080 input] (clojure.core/let [rawinput429079 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429081 {"ShippingLabelURL" (portkey.aws/search-for-tag rawinput429079 "ShippingLabelURL" :flattened? nil :result-wrapper resultWrapper429080), "Warning" (portkey.aws/search-for-tag rawinput429079 "Warning" :flattened? nil :result-wrapper resultWrapper429080)}] (clojure.core/cond-> {} (letvar429081 "ShippingLabelURL") (clojure.core/assoc :shipping-label-url (deser-generic-string (clojure.core/get-in letvar429081 ["ShippingLabelURL" :content]))) (letvar429081 "Warning") (clojure.core/assoc :warning (deser-generic-string (clojure.core/get-in letvar429081 ["Warning" :content])))))))

(clojure.core/defn- response-multiple-regions-exception ([input] (response-multiple-regions-exception nil input)) ([resultWrapper429083 input] (clojure.core/let [rawinput429082 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429084 {"message" (portkey.aws/search-for-tag rawinput429082 "message" :flattened? nil :result-wrapper resultWrapper429083)}] (clojure.core/cond-> {} (letvar429084 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429084 ["message" :content])))))))

(clojure.core/defn- response-unable-to-update-job-id-exception ([input] (response-unable-to-update-job-id-exception nil input)) ([resultWrapper429086 input] (clojure.core/let [rawinput429085 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429087 {"message" (portkey.aws/search-for-tag rawinput429085 "message" :flattened? nil :result-wrapper resultWrapper429086)}] (clojure.core/cond-> {} (letvar429087 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429087 ["message" :content])))))))

(clojure.core/defn- response-missing-manifest-field-exception ([input] (response-missing-manifest-field-exception nil input)) ([resultWrapper429089 input] (clojure.core/let [rawinput429088 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429090 {"message" (portkey.aws/search-for-tag rawinput429088 "message" :flattened? nil :result-wrapper resultWrapper429089)}] (clojure.core/cond-> {} (letvar429090 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429090 ["message" :content])))))))

(clojure.core/defn- response-list-jobs-output ([input] (response-list-jobs-output nil input)) ([resultWrapper429092 input] (clojure.core/let [rawinput429091 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429093 {"Jobs" (portkey.aws/search-for-tag rawinput429091 "Jobs" :flattened? nil :result-wrapper resultWrapper429092), "IsTruncated" (portkey.aws/search-for-tag rawinput429091 "IsTruncated" :flattened? nil :result-wrapper resultWrapper429092)}] (clojure.core/cond-> {} (letvar429093 "Jobs") (clojure.core/assoc :jobs (deser-jobs-list (clojure.core/get-in letvar429093 ["Jobs" :content]))) (letvar429093 "IsTruncated") (clojure.core/assoc :is-truncated (deser-is-truncated (clojure.core/get-in letvar429093 ["IsTruncated" :content])))))))

(clojure.core/defn- response-expired-job-id-exception ([input] (response-expired-job-id-exception nil input)) ([resultWrapper429095 input] (clojure.core/let [rawinput429094 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429096 {"message" (portkey.aws/search-for-tag rawinput429094 "message" :flattened? nil :result-wrapper resultWrapper429095)}] (clojure.core/cond-> {} (letvar429096 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429096 ["message" :content])))))))

(clojure.core/defn- response-invalid-job-id-exception ([input] (response-invalid-job-id-exception nil input)) ([resultWrapper429098 input] (clojure.core/let [rawinput429097 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429099 {"message" (portkey.aws/search-for-tag rawinput429097 "message" :flattened? nil :result-wrapper resultWrapper429098)}] (clojure.core/cond-> {} (letvar429099 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429099 ["message" :content])))))))

(clojure.core/defn- response-bucket-permission-exception ([input] (response-bucket-permission-exception nil input)) ([resultWrapper429101 input] (clojure.core/let [rawinput429100 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429102 {"message" (portkey.aws/search-for-tag rawinput429100 "message" :flattened? nil :result-wrapper resultWrapper429101)}] (clojure.core/cond-> {} (letvar429102 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429102 ["message" :content])))))))

(clojure.core/defn- response-cancel-job-output ([input] (response-cancel-job-output nil input)) ([resultWrapper429104 input] (clojure.core/let [rawinput429103 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429105 {"Success" (portkey.aws/search-for-tag rawinput429103 "Success" :flattened? nil :result-wrapper resultWrapper429104)}] (clojure.core/cond-> {} (letvar429105 "Success") (clojure.core/assoc :success (deser-success (clojure.core/get-in letvar429105 ["Success" :content])))))))

(clojure.core/defn- response-invalid-customs-exception ([input] (response-invalid-customs-exception nil input)) ([resultWrapper429107 input] (clojure.core/let [rawinput429106 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429108 {"message" (portkey.aws/search-for-tag rawinput429106 "message" :flattened? nil :result-wrapper resultWrapper429107)}] (clojure.core/cond-> {} (letvar429108 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429108 ["message" :content])))))))

(clojure.core/defn- response-missing-parameter-exception ([input] (response-missing-parameter-exception nil input)) ([resultWrapper429110 input] (clojure.core/let [rawinput429109 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429111 {"message" (portkey.aws/search-for-tag rawinput429109 "message" :flattened? nil :result-wrapper resultWrapper429110)}] (clojure.core/cond-> {} (letvar429111 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429111 ["message" :content])))))))

(clojure.core/defn- response-unable-to-cancel-job-id-exception ([input] (response-unable-to-cancel-job-id-exception nil input)) ([resultWrapper429113 input] (clojure.core/let [rawinput429112 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429114 {"message" (portkey.aws/search-for-tag rawinput429112 "message" :flattened? nil :result-wrapper resultWrapper429113)}] (clojure.core/cond-> {} (letvar429114 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429114 ["message" :content])))))))

(clojure.core/defn- response-missing-customs-exception ([input] (response-missing-customs-exception nil input)) ([resultWrapper429116 input] (clojure.core/let [rawinput429115 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429117 {"message" (portkey.aws/search-for-tag rawinput429115 "message" :flattened? nil :result-wrapper resultWrapper429116)}] (clojure.core/cond-> {} (letvar429117 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429117 ["message" :content])))))))

(clojure.core/defn- response-canceled-job-id-exception ([input] (response-canceled-job-id-exception nil input)) ([resultWrapper429119 input] (clojure.core/let [rawinput429118 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429120 {"message" (portkey.aws/search-for-tag rawinput429118 "message" :flattened? nil :result-wrapper resultWrapper429119)}] (clojure.core/cond-> {} (letvar429120 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429120 ["message" :content])))))))

(clojure.core/defn- response-no-such-bucket-exception ([input] (response-no-such-bucket-exception nil input)) ([resultWrapper429122 input] (clojure.core/let [rawinput429121 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429123 {"message" (portkey.aws/search-for-tag rawinput429121 "message" :flattened? nil :result-wrapper resultWrapper429122)}] (clojure.core/cond-> {} (letvar429123 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429123 ["message" :content])))))))

(clojure.core/defn- response-get-status-output ([input] (response-get-status-output nil input)) ([resultWrapper429125 input] (clojure.core/let [rawinput429124 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429126 {"LogKey" (portkey.aws/search-for-tag rawinput429124 "LogKey" :flattened? nil :result-wrapper resultWrapper429125), "Carrier" (portkey.aws/search-for-tag rawinput429124 "Carrier" :flattened? nil :result-wrapper resultWrapper429125), "ArtifactList" (portkey.aws/search-for-tag rawinput429124 "ArtifactList" :flattened? nil :result-wrapper resultWrapper429125), "JobType" (portkey.aws/search-for-tag rawinput429124 "JobType" :flattened? nil :result-wrapper resultWrapper429125), "ErrorCount" (portkey.aws/search-for-tag rawinput429124 "ErrorCount" :flattened? nil :result-wrapper resultWrapper429125), "ProgressCode" (portkey.aws/search-for-tag rawinput429124 "ProgressCode" :flattened? nil :result-wrapper resultWrapper429125), "TrackingNumber" (portkey.aws/search-for-tag rawinput429124 "TrackingNumber" :flattened? nil :result-wrapper resultWrapper429125), "Signature" (portkey.aws/search-for-tag rawinput429124 "Signature" :flattened? nil :result-wrapper resultWrapper429125), "SignatureFileContents" (portkey.aws/search-for-tag rawinput429124 "SignatureFileContents" :flattened? nil :result-wrapper resultWrapper429125), "ProgressMessage" (portkey.aws/search-for-tag rawinput429124 "ProgressMessage" :flattened? nil :result-wrapper resultWrapper429125), "CreationDate" (portkey.aws/search-for-tag rawinput429124 "CreationDate" :flattened? nil :result-wrapper resultWrapper429125), "LocationCode" (portkey.aws/search-for-tag rawinput429124 "LocationCode" :flattened? nil :result-wrapper resultWrapper429125), "CurrentManifest" (portkey.aws/search-for-tag rawinput429124 "CurrentManifest" :flattened? nil :result-wrapper resultWrapper429125), "LocationMessage" (portkey.aws/search-for-tag rawinput429124 "LocationMessage" :flattened? nil :result-wrapper resultWrapper429125), "LogBucket" (portkey.aws/search-for-tag rawinput429124 "LogBucket" :flattened? nil :result-wrapper resultWrapper429125), "JobId" (portkey.aws/search-for-tag rawinput429124 "JobId" :flattened? nil :result-wrapper resultWrapper429125)}] (clojure.core/cond-> {} (letvar429126 "LogKey") (clojure.core/assoc :log-key (deser-log-key (clojure.core/get-in letvar429126 ["LogKey" :content]))) (letvar429126 "Carrier") (clojure.core/assoc :carrier (deser-carrier (clojure.core/get-in letvar429126 ["Carrier" :content]))) (letvar429126 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar429126 ["ArtifactList" :content]))) (letvar429126 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar429126 ["JobType" :content]))) (letvar429126 "ErrorCount") (clojure.core/assoc :error-count (deser-error-count (clojure.core/get-in letvar429126 ["ErrorCount" :content]))) (letvar429126 "ProgressCode") (clojure.core/assoc :progress-code (deser-progress-code (clojure.core/get-in letvar429126 ["ProgressCode" :content]))) (letvar429126 "TrackingNumber") (clojure.core/assoc :tracking-number (deser-tracking-number (clojure.core/get-in letvar429126 ["TrackingNumber" :content]))) (letvar429126 "Signature") (clojure.core/assoc :signature (deser-signature (clojure.core/get-in letvar429126 ["Signature" :content]))) (letvar429126 "SignatureFileContents") (clojure.core/assoc :signature-file-contents (deser-signature (clojure.core/get-in letvar429126 ["SignatureFileContents" :content]))) (letvar429126 "ProgressMessage") (clojure.core/assoc :progress-message (deser-progress-message (clojure.core/get-in letvar429126 ["ProgressMessage" :content]))) (letvar429126 "CreationDate") (clojure.core/assoc :creation-date (deser-creation-date (clojure.core/get-in letvar429126 ["CreationDate" :content]))) (letvar429126 "LocationCode") (clojure.core/assoc :location-code (deser-location-code (clojure.core/get-in letvar429126 ["LocationCode" :content]))) (letvar429126 "CurrentManifest") (clojure.core/assoc :current-manifest (deser-current-manifest (clojure.core/get-in letvar429126 ["CurrentManifest" :content]))) (letvar429126 "LocationMessage") (clojure.core/assoc :location-message (deser-location-message (clojure.core/get-in letvar429126 ["LocationMessage" :content]))) (letvar429126 "LogBucket") (clojure.core/assoc :log-bucket (deser-log-bucket (clojure.core/get-in letvar429126 ["LogBucket" :content]))) (letvar429126 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar429126 ["JobId" :content])))))))

(clojure.core/defn- response-create-job-quota-exceeded-exception ([input] (response-create-job-quota-exceeded-exception nil input)) ([resultWrapper429128 input] (clojure.core/let [rawinput429127 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429129 {"message" (portkey.aws/search-for-tag rawinput429127 "message" :flattened? nil :result-wrapper resultWrapper429128)}] (clojure.core/cond-> {} (letvar429129 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429129 ["message" :content])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper429131 input] (clojure.core/let [rawinput429130 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429132 {"message" (portkey.aws/search-for-tag rawinput429130 "message" :flattened? nil :result-wrapper resultWrapper429131)}] (clojure.core/cond-> {} (letvar429132 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429132 ["message" :content])))))))

(clojure.core/defn- response-update-job-output ([input] (response-update-job-output nil input)) ([resultWrapper429134 input] (clojure.core/let [rawinput429133 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429135 {"Success" (portkey.aws/search-for-tag rawinput429133 "Success" :flattened? nil :result-wrapper resultWrapper429134), "WarningMessage" (portkey.aws/search-for-tag rawinput429133 "WarningMessage" :flattened? nil :result-wrapper resultWrapper429134), "ArtifactList" (portkey.aws/search-for-tag rawinput429133 "ArtifactList" :flattened? nil :result-wrapper resultWrapper429134)}] (clojure.core/cond-> {} (letvar429135 "Success") (clojure.core/assoc :success (deser-success (clojure.core/get-in letvar429135 ["Success" :content]))) (letvar429135 "WarningMessage") (clojure.core/assoc :warning-message (deser-warning-message (clojure.core/get-in letvar429135 ["WarningMessage" :content]))) (letvar429135 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar429135 ["ArtifactList" :content])))))))

(clojure.core/defn- response-invalid-file-system-exception ([input] (response-invalid-file-system-exception nil input)) ([resultWrapper429137 input] (clojure.core/let [rawinput429136 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429138 {"message" (portkey.aws/search-for-tag rawinput429136 "message" :flattened? nil :result-wrapper resultWrapper429137)}] (clojure.core/cond-> {} (letvar429138 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429138 ["message" :content])))))))

(clojure.core/defn- response-invalid-access-key-id-exception ([input] (response-invalid-access-key-id-exception nil input)) ([resultWrapper429140 input] (clojure.core/let [rawinput429139 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429141 {"message" (portkey.aws/search-for-tag rawinput429139 "message" :flattened? nil :result-wrapper resultWrapper429140)}] (clojure.core/cond-> {} (letvar429141 "message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar429141 ["message" :content])))))))

(clojure.core/defn- response-create-job-output ([input] (response-create-job-output nil input)) ([resultWrapper429143 input] (clojure.core/let [rawinput429142 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar429144 {"JobId" (portkey.aws/search-for-tag rawinput429142 "JobId" :flattened? nil :result-wrapper resultWrapper429143), "JobType" (portkey.aws/search-for-tag rawinput429142 "JobType" :flattened? nil :result-wrapper resultWrapper429143), "Signature" (portkey.aws/search-for-tag rawinput429142 "Signature" :flattened? nil :result-wrapper resultWrapper429143), "SignatureFileContents" (portkey.aws/search-for-tag rawinput429142 "SignatureFileContents" :flattened? nil :result-wrapper resultWrapper429143), "WarningMessage" (portkey.aws/search-for-tag rawinput429142 "WarningMessage" :flattened? nil :result-wrapper resultWrapper429143), "ArtifactList" (portkey.aws/search-for-tag rawinput429142 "ArtifactList" :flattened? nil :result-wrapper resultWrapper429143)}] (clojure.core/cond-> {} (letvar429144 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar429144 ["JobId" :content]))) (letvar429144 "JobType") (clojure.core/assoc :job-type (deser-job-type (clojure.core/get-in letvar429144 ["JobType" :content]))) (letvar429144 "Signature") (clojure.core/assoc :signature (deser-signature (clojure.core/get-in letvar429144 ["Signature" :content]))) (letvar429144 "SignatureFileContents") (clojure.core/assoc :signature-file-contents (deser-signature-file-contents (clojure.core/get-in letvar429144 ["SignatureFileContents" :content]))) (letvar429144 "WarningMessage") (clojure.core/assoc :warning-message (deser-warning-message (clojure.core/get-in letvar429144 ["WarningMessage" :content]))) (letvar429144 "ArtifactList") (clojure.core/assoc :artifact-list (deser-artifact-list (clojure.core/get-in letvar429144 ["ArtifactList" :content])))))))

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

(clojure.core/defn cancel-job ([cancel-job-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-cancel-job-input cancel-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/cancel-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=CancelJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/cancel-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CancelJobResult", :http.request.configuration/action "CancelJob", :http.request.configuration/output-deser-fn response-cancel-job-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "UnableToCancelJobIdException" :portkey.aws.importexport/unable-to-cancel-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}})))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/cancel-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/cancel-job-output))

(clojure.core/defn create-job ([create-job-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-job-input create-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/create-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=CreateJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/create-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "CreateJobResult", :http.request.configuration/action "CreateJob", :http.request.configuration/output-deser-fn response-create-job-output, :http.request.spec/error-spec {"InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport/multiple-regions-exception, "MissingManifestFieldException" :portkey.aws.importexport/missing-manifest-field-exception, "InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport/missing-customs-exception, "NoSuchBucketException" :portkey.aws.importexport/no-such-bucket-exception, "CreateJobQuotaExceededException" :portkey.aws.importexport/create-job-quota-exceeded-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception}})))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/create-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/create-job-output))

(clojure.core/defn get-shipping-label ([get-shipping-label-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-shipping-label-input get-shipping-label-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/get-shipping-label-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=GetShippingLabel", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/get-shipping-label-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetShippingLabelResult", :http.request.configuration/action "GetShippingLabel", :http.request.configuration/output-deser-fn response-get-shipping-label-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-shipping-label :args (clojure.spec.alpha/tuple :portkey.aws.importexport/get-shipping-label-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/get-shipping-label-output))

(clojure.core/defn get-status ([get-status-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-status-input get-status-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/get-status-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=GetStatus", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/get-status-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetStatusResult", :http.request.configuration/action "GetStatus", :http.request.configuration/output-deser-fn response-get-status-output, :http.request.spec/error-spec {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}})))))
(clojure.spec.alpha/fdef get-status :args (clojure.spec.alpha/tuple :portkey.aws.importexport/get-status-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/get-status-output))

(clojure.core/defn list-jobs ([] (list-jobs {})) ([list-jobs-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-jobs-input list-jobs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/list-jobs-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=ListJobs", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/list-jobs-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListJobsResult", :http.request.configuration/action "ListJobs", :http.request.configuration/output-deser-fn response-list-jobs-output, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}})))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.importexport/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/list-jobs-output))

(clojure.core/defn update-job ([update-job-inputinput] (clojure.core/let [request-function-result__284154__auto__ (req-update-job-input update-job-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.importexport/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.importexport/update-job-output, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/?Operation=UpdateJob", :http.request.configuration/version "2010-06-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.importexport/update-job-input, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "UpdateJobResult", :http.request.configuration/action "UpdateJob", :http.request.configuration/output-deser-fn response-update-job-output, :http.request.spec/error-spec {"InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport/multiple-regions-exception, "UnableToUpdateJobIdException" :portkey.aws.importexport/unable-to-update-job-id-exception, "MissingManifestFieldException" :portkey.aws.importexport/missing-manifest-field-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport/missing-customs-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "NoSuchBucketException" :portkey.aws.importexport/no-such-bucket-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception}})))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/update-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/update-job-output))
