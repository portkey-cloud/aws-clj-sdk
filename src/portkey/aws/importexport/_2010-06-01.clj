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

(clojure.core/defn req<-cancel-job-input [action-name61189 input61188] (clojure.core/let [input61190 {:body {"JobId" (ser-job-id (input61188 :job-id)), "Version" "2010-06-01", "Action" action-name61189}}] (clojure.core/cond-> input61190 (clojure.core/contains? input61188 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input61188 :apiversion))))))
(clojure.core/defn req<-create-job-input [action-name61192 input61191] (clojure.core/let [input61193 {:body {"JobType" (ser-job-type (input61191 :job-type)), "Manifest" (ser-manifest (input61191 :manifest)), "ValidateOnly" (ser-validate-only (input61191 :validate-only)), "Version" "2010-06-01", "Action" action-name61192}}] (clojure.core/cond-> input61193 (clojure.core/contains? input61191 :manifest-addendum) (clojure.core/assoc-in [:body "ManifestAddendum"] (ser-manifest-addendum (input61191 :manifest-addendum))) (clojure.core/contains? input61191 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input61191 :apiversion))))))
(clojure.core/defn req<-get-shipping-label-input [action-name61195 input61194] (clojure.core/let [input61196 {:body {"jobIds" (ser-job-id-list (input61194 :job-ids)), "Version" "2010-06-01", "Action" action-name61195}}] (clojure.core/cond-> input61196 (clojure.core/contains? input61194 :country) (clojure.core/assoc-in [:body "country"] (ser-country (input61194 :country))) (clojure.core/contains? input61194 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input61194 :apiversion))) (clojure.core/contains? input61194 :city) (clojure.core/assoc-in [:body "city"] (ser-city (input61194 :city))) (clojure.core/contains? input61194 :company) (clojure.core/assoc-in [:body "company"] (ser-company (input61194 :company))) (clojure.core/contains? input61194 :state-or-province) (clojure.core/assoc-in [:body "stateOrProvince"] (ser-state-or-province (input61194 :state-or-province))) (clojure.core/contains? input61194 :street3) (clojure.core/assoc-in [:body "street3"] (ser-street3 (input61194 :street3))) (clojure.core/contains? input61194 :name) (clojure.core/assoc-in [:body "name"] (ser-name (input61194 :name))) (clojure.core/contains? input61194 :postal-code) (clojure.core/assoc-in [:body "postalCode"] (ser-postal-code (input61194 :postal-code))) (clojure.core/contains? input61194 :street2) (clojure.core/assoc-in [:body "street2"] (ser-street2 (input61194 :street2))) (clojure.core/contains? input61194 :phone-number) (clojure.core/assoc-in [:body "phoneNumber"] (ser-phone-number (input61194 :phone-number))) (clojure.core/contains? input61194 :street1) (clojure.core/assoc-in [:body "street1"] (ser-street1 (input61194 :street1))))))
(clojure.core/defn req<-get-status-input [action-name61198 input61197] (clojure.core/let [input61199 {:body {"JobId" (ser-job-id (input61197 :job-id)), "Version" "2010-06-01", "Action" action-name61198}}] (clojure.core/cond-> input61199 (clojure.core/contains? input61197 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input61197 :apiversion))))))
(clojure.core/defn req<-list-jobs-input [action-name61201 input61200] (clojure.core/cond-> {:body {"Version" "2010-06-01", "Action" action-name61201}} (clojure.core/contains? input61200 :max-jobs) (clojure.core/assoc-in [:body "MaxJobs"] (ser-max-jobs (input61200 :max-jobs))) (clojure.core/contains? input61200 :marker) (clojure.core/assoc-in [:body "Marker"] (ser-marker (input61200 :marker))) (clojure.core/contains? input61200 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input61200 :apiversion)))))
(clojure.core/defn req<-update-job-input [action-name61203 input61202] (clojure.core/let [input61204 {:body {"JobId" (ser-job-id (input61202 :job-id)), "Manifest" (ser-manifest (input61202 :manifest)), "JobType" (ser-job-type (input61202 :job-type)), "ValidateOnly" (ser-validate-only (input61202 :validate-only)), "Version" "2010-06-01", "Action" action-name61203}}] (clojure.core/cond-> input61204 (clojure.core/contains? input61202 :apiversion) (clojure.core/assoc-in [:body "APIVersion"] (ser-apiversion (input61202 :apiversion))))))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/log-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/create-job-input (portkey.aws/json-keys :req-un [:portkey.aws.importexport.-2010-06-01/JobType :portkey.aws.importexport.-2010-06-01/Manifest :portkey.aws.importexport.-2010-06-01/ValidateOnly] :opt-un [:portkey.aws.importexport.-2010-06-01/ManifestAddendum :portkey.aws.importexport.-2010-06-01/APIVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-version-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-version-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-version-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/carrier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-address-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-address-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-address-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/country (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/jobs-list (clojure.spec.alpha/coll-of :portkey.aws.importexport.-2010-06-01/job))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/apiversion (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/cancel-job-input (portkey.aws/json-keys :req-un [:portkey.aws.importexport.-2010-06-01/JobId] :opt-un [:portkey.aws.importexport.-2010-06-01/APIVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/artifact-list (clojure.spec.alpha/coll-of :portkey.aws.importexport.-2010-06-01/artifact))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.malformed-manifest-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/malformed-manifest-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.malformed-manifest-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-manifest-field-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-manifest-field-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-manifest-field-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.get-shipping-label-input/job-ids (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/job-id-list))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/get-shipping-label-input (portkey.aws/json-keys :req-un [:portkey.aws.importexport.-2010-06-01.get-shipping-label-input/jobIds] :opt-un [:portkey.aws.importexport.-2010-06-01/country :portkey.aws.importexport.-2010-06-01/APIVersion :portkey.aws.importexport.-2010-06-01/city :portkey.aws.importexport.-2010-06-01/company :portkey.aws.importexport.-2010-06-01/stateOrProvince :portkey.aws.importexport.-2010-06-01/street3 :portkey.aws.importexport.-2010-06-01/name :portkey.aws.importexport.-2010-06-01/postalCode :portkey.aws.importexport.-2010-06-01/street2 :portkey.aws.importexport.-2010-06-01/phoneNumber :portkey.aws.importexport.-2010-06-01/street1] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.get-shipping-label-output/shipping-labelurl (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/generic-string))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.get-shipping-label-output/warning (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/generic-string))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/get-shipping-label-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.get-shipping-label-output/ShippingLabelURL :portkey.aws.importexport.-2010-06-01.get-shipping-label-output/Warning] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.multiple-regions-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/multiple-regions-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.multiple-regions-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.unable-to-update-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/unable-to-update-job-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.unable-to-update-job-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/city (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/job-type {"Import" "Import", :import "Import", "Export" "Export", :export "Export"})

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/company (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/error-count clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/validate-only clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/state-or-province (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/manifest-addendum (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/marker (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.missing-manifest-field-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/missing-manifest-field-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.missing-manifest-field-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.list-jobs-output/jobs (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/jobs-list))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/list-jobs-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.list-jobs-output/Jobs :portkey.aws.importexport.-2010-06-01/IsTruncated] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.expired-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/expired-job-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.expired-job-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-job-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/manifest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/artifact (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/Description :portkey.aws.importexport.-2010-06-01/URL] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.bucket-permission-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/bucket-permission-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.bucket-permission-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/progress-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/street3 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/is-truncated clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/update-job-input (portkey.aws/json-keys :req-un [:portkey.aws.importexport.-2010-06-01/JobId :portkey.aws.importexport.-2010-06-01/Manifest :portkey.aws.importexport.-2010-06-01/JobType :portkey.aws.importexport.-2010-06-01/ValidateOnly] :opt-un [:portkey.aws.importexport.-2010-06-01/APIVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/tracking-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/postal-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/signature (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/max-jobs clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/success clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/cancel-job-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/Success] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/signature-file-contents (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/street2 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/description (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-customs-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-customs-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-customs-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.missing-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/missing-parameter-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.missing-parameter-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/get-status-input (portkey.aws/json-keys :req-un [:portkey.aws.importexport.-2010-06-01/JobId] :opt-un [:portkey.aws.importexport.-2010-06-01/APIVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/list-jobs-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/MaxJobs :portkey.aws.importexport.-2010-06-01/Marker :portkey.aws.importexport.-2010-06-01/APIVersion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/phone-number (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.unable-to-cancel-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/unable-to-cancel-job-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.unable-to-cancel-job-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.missing-customs-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/missing-customs-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.missing-customs-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/progress-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/creation-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/location-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/is-canceled clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/job (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/JobId :portkey.aws.importexport.-2010-06-01/CreationDate :portkey.aws.importexport.-2010-06-01/IsCanceled :portkey.aws.importexport.-2010-06-01/JobType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/current-manifest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/location-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.canceled-job-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.canceled-job-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.no-such-bucket-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/no-such-bucket-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.no-such-bucket-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/log-bucket (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.get-status-output/signature-file-contents (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/signature))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/get-status-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/LogKey :portkey.aws.importexport.-2010-06-01/Carrier :portkey.aws.importexport.-2010-06-01/ArtifactList :portkey.aws.importexport.-2010-06-01/JobType :portkey.aws.importexport.-2010-06-01/ErrorCount :portkey.aws.importexport.-2010-06-01/ProgressCode :portkey.aws.importexport.-2010-06-01/TrackingNumber :portkey.aws.importexport.-2010-06-01/Signature :portkey.aws.importexport.-2010-06-01.get-status-output/SignatureFileContents :portkey.aws.importexport.-2010-06-01/ProgressMessage :portkey.aws.importexport.-2010-06-01/CreationDate :portkey.aws.importexport.-2010-06-01/LocationCode :portkey.aws.importexport.-2010-06-01/CurrentManifest :portkey.aws.importexport.-2010-06-01/LocationMessage :portkey.aws.importexport.-2010-06-01/LogBucket :portkey.aws.importexport.-2010-06-01/JobId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.create-job-quota-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/create-job-quota-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.create-job-quota-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-parameter-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/update-job-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/Success :portkey.aws.importexport.-2010-06-01/WarningMessage :portkey.aws.importexport.-2010-06-01/ArtifactList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/job-id-list (clojure.spec.alpha/coll-of :portkey.aws.importexport.-2010-06-01/generic-string))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-file-system-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-file-system-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-file-system-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01.invalid-access-key-id-exception/message (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/error-message))
(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01.invalid-access-key-id-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/warning-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/street1 (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/create-job-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.importexport.-2010-06-01/JobId :portkey.aws.importexport.-2010-06-01/JobType :portkey.aws.importexport.-2010-06-01/Signature :portkey.aws.importexport.-2010-06-01/SignatureFileContents :portkey.aws.importexport.-2010-06-01/WarningMessage :portkey.aws.importexport.-2010-06-01/ArtifactList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.importexport.-2010-06-01/job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn cancel-job "This operation cancels a specified job. Only the job owner can cancel it. The\noperation fails if the job has already started or is complete." ([cancel-job-input] (clojure.core/let [req<-input__36755__auto__ (req<-cancel-job-input "CancelJob" cancel-job-input)] (portkey.aws/-query-call portkey.aws.importexport.-2010-06-01/endpoints "POST" "/?Operation=CancelJob" req<-input__36755__auto__ :portkey.aws.importexport.-2010-06-01/cancel-job-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport.-2010-06-01/cancel-job-output {"InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "UnableToCancelJobIdException" :portkey.aws.importexport.-2010-06-01/unable-to-cancel-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception}))))
(clojure.spec.alpha/fdef cancel-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/cancel-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/cancel-job-output))

(clojure.core/defn create-job "This operation initiates the process of scheduling an upload or download of your\ndata. You include in the request a manifest that describes the data transfer\nspecifics. The response to the request includes a job ID, which you can use in\nother operations, a signature that you use to identify your storage device, and\nthe address where you should ship your storage device." ([create-job-input] (clojure.core/let [req<-input__36755__auto__ (req<-create-job-input "CreateJob" create-job-input)] (portkey.aws/-query-call portkey.aws.importexport.-2010-06-01/endpoints "POST" "/?Operation=CreateJob" req<-input__36755__auto__ :portkey.aws.importexport.-2010-06-01/create-job-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport.-2010-06-01/create-job-output {"InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport.-2010-06-01/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport.-2010-06-01/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport.-2010-06-01/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport.-2010-06-01/multiple-regions-exception, "MissingManifestFieldException" :portkey.aws.importexport.-2010-06-01/missing-manifest-field-exception, "InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport.-2010-06-01/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport.-2010-06-01/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport.-2010-06-01/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport.-2010-06-01/missing-customs-exception, "NoSuchBucketException" :portkey.aws.importexport.-2010-06-01/no-such-bucket-exception, "CreateJobQuotaExceededException" :portkey.aws.importexport.-2010-06-01/create-job-quota-exceeded-exception, "InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport.-2010-06-01/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception}))))
(clojure.spec.alpha/fdef create-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/create-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/create-job-output))

(clojure.core/defn get-shipping-label "This operation generates a pre-paid UPS shipping label that you will use to ship\nyour device to AWS for processing." ([get-shipping-label-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-shipping-label-input "GetShippingLabel" get-shipping-label-input)] (portkey.aws/-query-call portkey.aws.importexport.-2010-06-01/endpoints "POST" "/?Operation=GetShippingLabel" req<-input__36755__auto__ :portkey.aws.importexport.-2010-06-01/get-shipping-label-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport.-2010-06-01/get-shipping-label-output {"InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidAddressException" :portkey.aws.importexport.-2010-06-01/invalid-address-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception, "InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception}))))
(clojure.spec.alpha/fdef get-shipping-label :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/get-shipping-label-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/get-shipping-label-output))

(clojure.core/defn get-status "This operation returns information about a job, including where the job is in\nthe processing pipeline, the status of the results, and the signature value\nassociated with the job. You can only return information about jobs you own." ([get-status-input] (clojure.core/let [req<-input__36755__auto__ (req<-get-status-input "GetStatus" get-status-input)] (portkey.aws/-query-call portkey.aws.importexport.-2010-06-01/endpoints "POST" "/?Operation=GetStatus" req<-input__36755__auto__ :portkey.aws.importexport.-2010-06-01/get-status-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport.-2010-06-01/get-status-output {"InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception}))))
(clojure.spec.alpha/fdef get-status :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/get-status-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/get-status-output))

(clojure.core/defn list-jobs "This operation returns the jobs associated with the requester. AWS Import/Export\nlists the jobs in reverse chronological order based on the date of creation. For\nexample if Job Test1 was created 2009Dec30 and Test2 was created 2010Feb05, the\nListJobs operation would return Test2 followed by Test1." ([] (list-jobs {})) ([list-jobs-input] (clojure.core/let [req<-input__36755__auto__ (req<-list-jobs-input "ListJobs" list-jobs-input)] (portkey.aws/-query-call portkey.aws.importexport.-2010-06-01/endpoints "POST" "/?Operation=ListJobs" req<-input__36755__auto__ :portkey.aws.importexport.-2010-06-01/list-jobs-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport.-2010-06-01/list-jobs-output {"InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception, "InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception}))))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/? :portkey.aws.importexport.-2010-06-01/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/list-jobs-output))

(clojure.core/defn update-job "You use this operation to change the parameters specified in the original\nmanifest file by supplying a new manifest file. The manifest file attached to\nthis request replaces the original manifest file. You can only use the operation\nafter a CreateJob request but before the data transfer starts and you can only\nuse it on jobs you own." ([update-job-input] (clojure.core/let [req<-input__36755__auto__ (req<-update-job-input "UpdateJob" update-job-input)] (portkey.aws/-query-call portkey.aws.importexport.-2010-06-01/endpoints "POST" "/?Operation=UpdateJob" req<-input__36755__auto__ :portkey.aws.importexport.-2010-06-01/update-job-input {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.importexport.-2010-06-01/update-job-output {"InvalidVersionException" :portkey.aws.importexport.-2010-06-01/invalid-version-exception, "InvalidAddressException" :portkey.aws.importexport.-2010-06-01/invalid-address-exception, "MalformedManifestException" :portkey.aws.importexport.-2010-06-01/malformed-manifest-exception, "InvalidManifestFieldException" :portkey.aws.importexport.-2010-06-01/invalid-manifest-field-exception, "MultipleRegionsException" :portkey.aws.importexport.-2010-06-01/multiple-regions-exception, "UnableToUpdateJobIdException" :portkey.aws.importexport.-2010-06-01/unable-to-update-job-id-exception, "MissingManifestFieldException" :portkey.aws.importexport.-2010-06-01/missing-manifest-field-exception, "ExpiredJobIdException" :portkey.aws.importexport.-2010-06-01/expired-job-id-exception, "InvalidJobIdException" :portkey.aws.importexport.-2010-06-01/invalid-job-id-exception, "BucketPermissionException" :portkey.aws.importexport.-2010-06-01/bucket-permission-exception, "InvalidCustomsException" :portkey.aws.importexport.-2010-06-01/invalid-customs-exception, "MissingParameterException" :portkey.aws.importexport.-2010-06-01/missing-parameter-exception, "MissingCustomsException" :portkey.aws.importexport.-2010-06-01/missing-customs-exception, "CanceledJobIdException" :portkey.aws.importexport.-2010-06-01/canceled-job-id-exception, "NoSuchBucketException" :portkey.aws.importexport.-2010-06-01/no-such-bucket-exception, "InvalidParameterException" :portkey.aws.importexport.-2010-06-01/invalid-parameter-exception, "InvalidFileSystemException" :portkey.aws.importexport.-2010-06-01/invalid-file-system-exception, "InvalidAccessKeyIdException" :portkey.aws.importexport.-2010-06-01/invalid-access-key-id-exception}))))
(clojure.spec.alpha/fdef update-job :args (clojure.spec.alpha/tuple :portkey.aws.importexport.-2010-06-01/update-job-input) :ret (clojure.spec.alpha/and :portkey.aws.importexport.-2010-06-01/update-job-output))
