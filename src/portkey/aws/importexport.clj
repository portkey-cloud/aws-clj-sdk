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

(clojure.core/declare ser-country ser-apiversion ser-city ser-job-type ser-company ser-validate-only ser-state-or-province ser-manifest-addendum ser-marker ser-manifest ser-street3 ser-name ser-postal-code ser-max-jobs ser-street2 ser-generic-string ser-phone-number ser-job-id-list ser-street1 ser-job-id)

(clojure.core/defn- ser-country [shape-input] shape-input)
(clojure.core/defn- ser-apiversion [shape-input] shape-input)
(clojure.core/defn- ser-city [shape-input] shape-input)
(clojure.core/defn- ser-job-type [shape-input] ({"Import" "Import", :import "Import", "Export" "Export", :export "Export"} shape-input))
(clojure.core/defn- ser-company [shape-input] shape-input)
(clojure.core/defn- ser-validate-only [shape-input] shape-input)
(clojure.core/defn- ser-state-or-province [shape-input] shape-input)
(clojure.core/defn- ser-manifest-addendum [shape-input] shape-input)
(clojure.core/defn- ser-marker [shape-input] shape-input)
(clojure.core/defn- ser-manifest [shape-input] shape-input)
(clojure.core/defn- ser-street3 [shape-input] shape-input)
(clojure.core/defn- ser-name [shape-input] shape-input)
(clojure.core/defn- ser-postal-code [shape-input] shape-input)
(clojure.core/defn- ser-max-jobs [shape-input] shape-input)
(clojure.core/defn- ser-street2 [shape-input] shape-input)
(clojure.core/defn- ser-generic-string [shape-input] shape-input)
(clojure.core/defn- ser-phone-number [shape-input] shape-input)
(clojure.core/defn- ser-job-id-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-street1 [shape-input] shape-input)
(clojure.core/defn- ser-job-id [shape-input] shape-input)

(clojure.core/defn req<-cancel-job-input [action-name60963 input60962] (clojure.core/let [input60964 {:body {"JobId" (ser-job-id (input60962 :job-id)), "Version" "2010-06-01", "Action" action-name60963}}] (clojure.core/cond-> input60964 (clojure.core/contains? input60962 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input60962 :apiversion))))))
(clojure.core/defn req<-create-job-input [action-name60966 input60965] (clojure.core/let [input60967 {:body {"JobType" (ser-job-type (input60965 :job-type)), "Manifest" (ser-manifest (input60965 :manifest)), "ValidateOnly" (ser-validate-only (input60965 :validate-only)), "Version" "2010-06-01", "Action" action-name60966}}] (clojure.core/cond-> input60967 (clojure.core/contains? input60965 :manifest-addendum) (clojure.core/assoc-in [:body "ManifestAddendum"] (ser-manifest-addendum (input60965 :manifest-addendum))) (clojure.core/contains? input60965 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input60965 :apiversion))))))
(clojure.core/defn req<-get-shipping-label-input [action-name60969 input60968] (clojure.core/let [input60970 {:body {"jobIds" (ser-job-id-list (input60968 :job-ids)), "Version" "2010-06-01", "Action" action-name60969}}] (clojure.core/cond-> input60970 (clojure.core/contains? input60968 :country) (clojure.core/assoc-in [:body "country"] (ser-country (input60968 :country))) (clojure.core/contains? input60968 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input60968 :apiversion))) (clojure.core/contains? input60968 :city) (clojure.core/assoc-in [:body "city"] (ser-city (input60968 :city))) (clojure.core/contains? input60968 :company) (clojure.core/assoc-in [:body "company"] (ser-company (input60968 :company))) (clojure.core/contains? input60968 :state-or-province) (clojure.core/assoc-in [:body "stateOrProvince"] (ser-state-or-province (input60968 :state-or-province))) (clojure.core/contains? input60968 :street3) (clojure.core/assoc-in [:body "street3"] (ser-street3 (input60968 :street3))) (clojure.core/contains? input60968 :name) (clojure.core/assoc-in [:body "name"] (ser-name (input60968 :name))) (clojure.core/contains? input60968 :postal-code) (clojure.core/assoc-in [:body "postalCode"] (ser-postal-code (input60968 :postal-code))) (clojure.core/contains? input60968 :street2) (clojure.core/assoc-in [:body "street2"] (ser-street2 (input60968 :street2))) (clojure.core/contains? input60968 :phone-number) (clojure.core/assoc-in [:body "phoneNumber"] (ser-phone-number (input60968 :phone-number))) (clojure.core/contains? input60968 :street1) (clojure.core/assoc-in [:body "street1"] (ser-street1 (input60968 :street1))))))
(clojure.core/defn req<-get-status-input [action-name60972 input60971] (clojure.core/let [input60973 {:body {"JobId" (ser-job-id (input60971 :job-id)), "Version" "2010-06-01", "Action" action-name60972}}] (clojure.core/cond-> input60973 (clojure.core/contains? input60971 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input60971 :apiversion))))))
(clojure.core/defn req<-list-jobs-input [action-name60975 input60974] (clojure.core/cond-> {:body {"Version" "2010-06-01", "Action" action-name60975}} (clojure.core/contains? input60974 :max-jobs) (clojure.core/assoc-in [:body "MaxJobs"] (ser-max-jobs (input60974 :max-jobs))) (clojure.core/contains? input60974 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input60974 :marker))) (clojure.core/contains? input60974 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input60974 :apiversion)))))
(clojure.core/defn req<-update-job-input [action-name60977 input60976] (clojure.core/let [input60978 {:body {"JobId" (ser-job-id (input60976 :job-id)), "Manifest" (ser-manifest (input60976 :manifest)), "JobType" (ser-job-type (input60976 :job-type)), "ValidateOnly" (ser-validate-only (input60976 :validate-only)), "Version" "2010-06-01", "Action" action-name60977}}] (clojure.core/cond-> input60978 (clojure.core/contains? input60976 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input60976 :apiversion))))))

(clojure.spec.alpha/def :portkey.aws.importexport/log-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/create-job-input (portkey.aws/json-keys :req-un [:portkey.aws.importexport/JobType :portkey.aws.importexport/Manifest :portkey.aws.importexport/ValidateOnly] :opt-un [:portkey.aws.importexport/ManifestAddendum :portkey.aws.importexport/APIVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-version-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-version-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-version-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/carrier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-address-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-address-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-address-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/country (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/jobs-list (clojure.spec.alpha/coll-of :portkey.aws.importexport/job))

(clojure.spec.alpha/def :portkey.aws.importexport/apiversion (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/cancel-job-input (portkey.aws/json-keys :req-un [:portkey.aws.importexport/JobId] :opt-un [:portkey.aws.importexport/APIVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/artifact-list (clojure.spec.alpha/coll-of :portkey.aws.importexport/artifact))

(clojure.spec.alpha/def :portkey.aws.importexport.malformed-manifest-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/malformed-manifest-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.malformed-manifest-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-manifest-field-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-manifest-field-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-manifest-field-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.get-shipping-label-input/job-ids (clojure.spec.alpha/and :portkey.aws.importexport/job-id-list))
(clojure.spec.alpha/def :portkey.aws.importexport/get-shipping-label-input (portkey.aws/json-keys :req-un [:portkey.aws.importexport.get-shipping-label-input/jobIds] :opt-un [:portkey.aws.importexport/country :portkey.aws.importexport/APIVersion :portkey.aws.importexport/city :portkey.aws.importexport/company :portkey.aws.importexport/stateOrProvince :portkey.aws.importexport/street3 :portkey.aws.importexport/name :portkey.aws.importexport/postalCode :portkey.aws.importexport/street2 :portkey.aws.importexport/phoneNumber :portkey.aws.importexport/street1] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.get-shipping-label-output/shipping-labelurl (clojure.spec.alpha/and :portkey.aws.importexport/generic-string))
(clojure.spec.alpha/def :portkey.aws.importexport.get-shipping-label-output/warning (clojure.spec.alpha/and :portkey.aws.importexport/generic-string))
(clojure.spec.alpha/def :portkey.aws.importexport/get-shipping-label-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.get-shipping-label-output/ShippingLabelURL :portkey.aws.importexport.get-shipping-label-output/Warning] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.multiple-regions-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/multiple-regions-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.multiple-regions-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.unable-to-update-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/unable-to-update-job-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.unable-to-update-job-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/city (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/job-type {"Import" "Import", :import "Import", "Export" "Export", :export "Export"})

(clojure.spec.alpha/def :portkey.aws.importexport/company (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/error-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.importexport/validate-only clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport/state-or-province (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/manifest-addendum (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.missing-manifest-field-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/missing-manifest-field-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.missing-manifest-field-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.list-jobs-output/jobs (clojure.spec.alpha/and :portkey.aws.importexport/jobs-list))
(clojure.spec.alpha/def :portkey.aws.importexport/list-jobs-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.list-jobs-output/Jobs :portkey.aws.importexport/IsTruncated] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.expired-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/expired-job-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.expired-job-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-job-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-job-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/manifest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/artifact (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport/Description :portkey.aws.importexport/URL] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.bucket-permission-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/bucket-permission-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.bucket-permission-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/progress-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/street3 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/is-truncated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport/update-job-input (portkey.aws/json-keys :req-un [:portkey.aws.importexport/JobId :portkey.aws.importexport/Manifest :portkey.aws.importexport/JobType :portkey.aws.importexport/ValidateOnly] :opt-un [:portkey.aws.importexport/APIVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/tracking-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/postal-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/max-jobs clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.importexport/success clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport/cancel-job-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport/Success] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/signature-file-contents (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/street2 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-customs-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-customs-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-customs-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.missing-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/missing-parameter-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.missing-parameter-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/get-status-input (portkey.aws/json-keys :req-un [:portkey.aws.importexport/JobId] :opt-un [:portkey.aws.importexport/APIVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/list-jobs-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport/MaxJobs :portkey.aws.importexport/Marker :portkey.aws.importexport/APIVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/phone-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.unable-to-cancel-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/unable-to-cancel-job-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.unable-to-cancel-job-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.missing-customs-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/missing-customs-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.missing-customs-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/progress-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.importexport/location-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/is-canceled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport/job (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport/JobId :portkey.aws.importexport/CreationDate :portkey.aws.importexport/IsCanceled :portkey.aws.importexport/JobType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/current-manifest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/location-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.canceled-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/canceled-job-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.canceled-job-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.no-such-bucket-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/no-such-bucket-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.no-such-bucket-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/log-bucket (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.get-status-output/signature-file-contents (clojure.spec.alpha/and :portkey.aws.importexport/signature))
(clojure.spec.alpha/def :portkey.aws.importexport/get-status-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport/LogKey :portkey.aws.importexport/Carrier :portkey.aws.importexport/ArtifactList :portkey.aws.importexport/JobType :portkey.aws.importexport/ErrorCount :portkey.aws.importexport/ProgressCode :portkey.aws.importexport/TrackingNumber :portkey.aws.importexport/Signature :portkey.aws.importexport.get-status-output/SignatureFileContents :portkey.aws.importexport/ProgressMessage :portkey.aws.importexport/CreationDate :portkey.aws.importexport/LocationCode :portkey.aws.importexport/CurrentManifest :portkey.aws.importexport/LocationMessage :portkey.aws.importexport/LogBucket :portkey.aws.importexport/JobId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.create-job-quota-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/create-job-quota-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.create-job-quota-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-parameter-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-parameter-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/update-job-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport/Success :portkey.aws.importexport/WarningMessage :portkey.aws.importexport/ArtifactList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/job-id-list (clojure.spec.alpha/coll-of :portkey.aws.importexport/generic-string))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-file-system-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-file-system-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-file-system-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.invalid-access-key-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport/invalid-access-key-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.invalid-access-key-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/warning-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/street1 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport/create-job-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport/JobId :portkey.aws.importexport/JobType :portkey.aws.importexport/Signature :portkey.aws.importexport/SignatureFileContents :portkey.aws.importexport/WarningMessage :portkey.aws.importexport/ArtifactList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport/job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn cancel-job "This operation cancels a specified job. Only the job owner can cancel it. The\noperation fails if the job has already started or is complete." ([cancel-job-input] (clojure.core/let [req<-input__36755__auto__ (req<-cancel-job-input "CancelJob" cancel-job-input)] (portkey.aws/-query-call portkey.aws.importexport/endpoints "POST" "/?Operation=CancelJob" req<-input__36755__auto__ :portkey.aws.importexport/cancel-job-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport/cancel-job-output {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "UnableToCancelJobIdException" :portkey.aws.importexport/unable-to-cancel-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/cancel-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/cancel-job-output))

(clojure.core/defn create-job "This operation initiates the process of scheduling an upload or download of your\ndata. You include in the request a manifest that describes the data transfer\nspecifics. The response to the request includes a job ID, which you can use in\nother operations, a signature that you use to identify your storage device, and\nthe address where you should ship your storage device." ([create-job-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-job-input "CreateJob" create-job-input)] (portkey.aws/-query-call portkey.aws.importexport/endpoints "POST" "/?Operation=CreateJob" req<-input__36755__auto__ :portkey.aws.importexport/create-job-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport/create-job-output {"InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport/multiple-regions-exception, "MissingManifestFieldException" :portkey.aws.importexport/missing-manifest-field-exception, "InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport/missing-customs-exception, "NoSuchBucketException" :portkey.aws.importexport/no-such-bucket-exception, "CreateJobQuotaExceededException" :portkey.aws.importexport/create-job-quota-exceeded-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception}))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/create-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/create-job-output))

(clojure.core/defn get-shipping-label "This operation generates a pre-paid UPS shipping label that you will use to ship\nyour device to AWS for processing." ([get-shipping-label-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-shipping-label-input "GetShippingLabel" get-shipping-label-input)] (portkey.aws/-query-call portkey.aws.importexport/endpoints "POST" "/?Operation=GetShippingLabel" req<-input__36755__auto__ :portkey.aws.importexport/get-shipping-label-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport/get-shipping-label-output {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception}))))
(clojure.spec.alpha/fdef get-shipping-label :args (clojure.spec.alpha/tuple :portkey.aws.importexport/get-shipping-label-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/get-shipping-label-output))

(clojure.core/defn get-status "This operation returns information about a job, including where the job is in\nthe processing pipeline, the status of the results, and the signature value\nassociated with the job. You can only return information about jobs you own." ([get-status-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-status-input "GetStatus" get-status-input)] (portkey.aws/-query-call portkey.aws.importexport/endpoints "POST" "/?Operation=GetStatus" req<-input__36755__auto__ :portkey.aws.importexport/get-status-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport/get-status-output {"InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}))))
(clojure.spec.alpha/fdef get-status :args (clojure.spec.alpha/tuple :portkey.aws.importexport/get-status-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/get-status-output))

(clojure.core/defn list-jobs "This operation returns the jobs associated with the requester. AWS Import/Export\nlists the jobs in reverse chronological order based on the date of creation. For\nexample if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the\nListJobs operation would return Test2 followed by Test1." ([] (list-jobs {})) ([list-jobs-input] (clojure.core/let [req<-input__36755__auto__ (req<-list-jobs-input "ListJobs" list-jobs-input)] (portkey.aws/-query-call portkey.aws.importexport/endpoints "POST" "/?Operation=ListJobs" req<-input__36755__auto__ :portkey.aws.importexport/list-jobs-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport/list-jobs-output {"InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport/invalid-version-exception}))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.importexport/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/list-jobs-output))

(clojure.core/defn update-job "You use this operation to change the parameters specified in the original\nmanifest file by supplying a new manifest file. The manifest file attached to\nthis request replaces the original manifest file. You can only use the operation\nafter a CreateJob request but before the data transfer starts and you can only\nuse it on jobs you own." ([update-job-input] (clojure.core/let [req<-input__36755__auto__ (req<-update-job-input "UpdateJob" update-job-input)] (portkey.aws/-query-call portkey.aws.importexport/endpoints "POST" "/?Operation=UpdateJob" req<-input__36755__auto__ :portkey.aws.importexport/update-job-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport/update-job-output {"InvalidVersionException" :portkey.aws.importexport/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport/multiple-regions-exception, "UnableToUpdateJobIdException" :portkey.aws.importexport/unable-to-update-job-id-exception, "MissingManifestFieldException" :portkey.aws.importexport/missing-manifest-field-exception, "ExpiredJobIdException" :portkey.aws.importexport/expired-job-id-exception, "InvalidJobIdException" :portkey.aws.importexport/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport/missing-customs-exception, "CanceledJobIdException" :portkey.aws.importexport/canceled-job-id-exception, "NoSuchBucketException" :portkey.aws.importexport/no-such-bucket-exception, "InvalidParameterException" :portkey.aws.importexport/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport/invalid-access-key-id-exception}))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport/update-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport/update-job-output))
