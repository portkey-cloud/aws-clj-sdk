(ns portkey.aws.comprehendmedical (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-bounded-length-string)

(clojure.core/defn- ser-bounded-length-string [input] #:http.request.field{:value input, :shape "BoundedLengthString"})

(clojure.core/defn- req-detect-phi-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-bounded-length-string (input :text)) #:http.request.field{:name "Text", :shape "BoundedLengthString"})]}))

(clojure.core/defn- req-detect-entities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-bounded-length-string (input :text)) #:http.request.field{:name "Text", :shape "BoundedLengthString"})]}))

(clojure.core/declare deser-attribute-list)

(clojure.core/declare deser-entity-list)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-entity-sub-type)

(clojure.core/declare deser-trait)

(clojure.core/declare deser-attribute)

(clojure.core/declare deser-trait-list)

(clojure.core/declare deser-unmapped-attribute-list)

(clojure.core/declare deser-unmapped-attribute)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-entity)

(clojure.core/declare deser-entity-type)

(clojure.core/declare deser-float)

(clojure.core/defn- deser-attribute-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute coll))) input))

(clojure.core/defn- deser-entity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entity coll))) input))

(clojure.core/defn- deser-attribute-name [input] (clojure.core/get {"SIGN" :sign, "SYMPTOM" :symptom, "DIAGNOSIS" :diagnosis, "NEGATION" :negation} input))

(clojure.core/defn- deser-entity-sub-type [input] (clojure.core/get {"URL" :url, "TEST_NAME" :test-name, "STRENGTH" :strength, "AGE" :age, "CONTACT_POINT" :contact-point, "TREATMENT_NAME" :treatment-name, "NAME" :name, "DATE" :date, "DIRECTION" :direction, "SYSTEM_ORGAN_SITE" :system-organ-site, "FORM" :form, "BRAND_NAME" :brand-name, "PROCEDURE_NAME" :procedure-name, "GENERIC_NAME" :generic-name, "QUANTITY" :quantity, "FREQUENCY" :frequency, "TEST_VALUE" :test-value, "QUALITY" :quality, "DURATION" :duration, "RATE" :rate, "TEST_UNITS" :test-units, "ADDRESS" :address, "ROUTE_OR_MODE" :route-or-mode, "ACUITY" :acuity, "DOSAGE" :dosage, "EMAIL" :email, "PROFESSION" :profession, "IDENTIFIER" :identifier} input))

(clojure.core/defn- deser-trait [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-attribute-name (input "Name"))) (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score")))))

(clojure.core/defn- deser-attribute [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-entity-sub-type (input "Type"))) (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score"))) (clojure.core/contains? input "RelationshipScore") (clojure.core/assoc :relationship-score (deser-float (input "RelationshipScore"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-integer (input "Id"))) (clojure.core/contains? input "BeginOffset") (clojure.core/assoc :begin-offset (deser-integer (input "BeginOffset"))) (clojure.core/contains? input "EndOffset") (clojure.core/assoc :end-offset (deser-integer (input "EndOffset"))) (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-string (input "Text"))) (clojure.core/contains? input "Traits") (clojure.core/assoc :traits (deser-trait-list (input "Traits")))))

(clojure.core/defn- deser-trait-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-trait coll))) input))

(clojure.core/defn- deser-unmapped-attribute-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unmapped-attribute coll))) input))

(clojure.core/defn- deser-unmapped-attribute [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-entity-type (input "Type"))) (clojure.core/contains? input "Attribute") (clojure.core/assoc :attribute (deser-attribute (input "Attribute")))))

(clojure.core/defn- deser-integer [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-entity [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-entity-sub-type (input "Type"))) (clojure.core/contains? input "Category") (clojure.core/assoc :category (deser-entity-type (input "Category"))) (clojure.core/contains? input "BeginOffset") (clojure.core/assoc :begin-offset (deser-integer (input "BeginOffset"))) (clojure.core/contains? input "Score") (clojure.core/assoc :score (deser-float (input "Score"))) (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attribute-list (input "Attributes"))) (clojure.core/contains? input "Traits") (clojure.core/assoc :traits (deser-trait-list (input "Traits"))) (clojure.core/contains? input "EndOffset") (clojure.core/assoc :end-offset (deser-integer (input "EndOffset"))) (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-string (input "Text"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-integer (input "Id")))))

(clojure.core/defn- deser-entity-type [input] (clojure.core/get {"MEDICATION" :medication, "MEDICAL_CONDITION" :medical-condition, "PROTECTED_HEALTH_INFORMATION" :protected-health-information, "TEST_TREATMENT_PROCEDURE" :test-treatment-procedure, "ANATOMY" :anatomy} input))

(clojure.core/defn- deser-float [input] input)

(clojure.core/defn- response-detect-phi-response ([input] (response-detect-phi-response nil input)) ([resultWrapper1584801 input] (clojure.core/let [rawinput1584800 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1584802 {"Entities" (rawinput1584800 "Entities"), "PaginationToken" (rawinput1584800 "PaginationToken")}] (clojure.core/cond-> {:entities (deser-entity-list (clojure.core/get-in letvar1584802 ["Entities"]))} (letvar1584802 "PaginationToken") (clojure.core/assoc :pagination-token (deser-string (clojure.core/get-in letvar1584802 ["PaginationToken"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1584804 input] (clojure.core/let [rawinput1584803 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1584805 {"Message" (rawinput1584803 "Message")}] (clojure.core/cond-> {} (letvar1584805 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1584805 ["Message"])))))))

(clojure.core/defn- response-text-size-limit-exceeded-exception ([input] (response-text-size-limit-exceeded-exception nil input)) ([resultWrapper1584807 input] (clojure.core/let [rawinput1584806 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1584808 {"Message" (rawinput1584806 "Message")}] (clojure.core/cond-> {} (letvar1584808 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1584808 ["Message"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1584810 input] (clojure.core/let [rawinput1584809 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1584811 {"Message" (rawinput1584809 "Message")}] (clojure.core/cond-> {} (letvar1584811 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1584811 ["Message"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1584813 input] (clojure.core/let [rawinput1584812 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1584814 {"Message" (rawinput1584812 "Message")}] (clojure.core/cond-> {} (letvar1584814 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1584814 ["Message"])))))))

(clojure.core/defn- response-internal-server-exception ([input] (response-internal-server-exception nil input)) ([resultWrapper1584816 input] (clojure.core/let [rawinput1584815 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1584817 {"Message" (rawinput1584815 "Message")}] (clojure.core/cond-> {} (letvar1584817 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1584817 ["Message"])))))))

(clojure.core/defn- response-invalid-encoding-exception ([input] (response-invalid-encoding-exception nil input)) ([resultWrapper1584819 input] (clojure.core/let [rawinput1584818 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1584820 {"Message" (rawinput1584818 "Message")}] (clojure.core/cond-> {} (letvar1584820 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1584820 ["Message"])))))))

(clojure.core/defn- response-detect-entities-response ([input] (response-detect-entities-response nil input)) ([resultWrapper1584822 input] (clojure.core/let [rawinput1584821 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1584823 {"Entities" (rawinput1584821 "Entities"), "UnmappedAttributes" (rawinput1584821 "UnmappedAttributes"), "PaginationToken" (rawinput1584821 "PaginationToken")}] (clojure.core/cond-> {:entities (deser-entity-list (clojure.core/get-in letvar1584823 ["Entities"]))} (letvar1584823 "UnmappedAttributes") (clojure.core/assoc :unmapped-attributes (deser-unmapped-attribute-list (clojure.core/get-in letvar1584823 ["UnmappedAttributes"]))) (letvar1584823 "PaginationToken") (clojure.core/assoc :pagination-token (deser-string (clojure.core/get-in letvar1584823 ["PaginationToken"])))))))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.detect-phi-response/entities (clojure.spec.alpha/and :portkey.aws.comprehendmedical/entity-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.detect-phi-response/pagination-token (clojure.spec.alpha/and :portkey.aws.comprehendmedical/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/detect-phi-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehendmedical.detect-phi-response/entities] :opt-un [:portkey.aws.comprehendmedical.detect-phi-response/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/attribute-list (clojure.spec.alpha/coll-of :portkey.aws.comprehendmedical/attribute))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/entity-list (clojure.spec.alpha/coll-of :portkey.aws.comprehendmedical/entity))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/attribute-name #{"SIGN" :sign :diagnosis "NEGATION" :negation :symptom "SYMPTOM" "DIAGNOSIS"})

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/entity-sub-type #{"URL" :generic-name :test-value :address "TEST_NAME" "STRENGTH" :email :date :acuity "AGE" :age "CONTACT_POINT" :route-or-mode "TREATMENT_NAME" "NAME" :dosage :name "DATE" "DIRECTION" :frequency "SYSTEM_ORGAN_SITE" "FORM" "BRAND_NAME" :procedure-name :duration :contact-point :rate "PROCEDURE_NAME" "GENERIC_NAME" "QUANTITY" "FREQUENCY" :system-organ-site "TEST_VALUE" :strength "QUALITY" "DURATION" "RATE" "TEST_UNITS" "ADDRESS" :url :identifier :test-name :brand-name :quality "ROUTE_OR_MODE" :profession "ACUITY" :form :test-units "DOSAGE" "EMAIL" :quantity "PROFESSION" "IDENTIFIER" :treatment-name :direction})

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.text-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/text-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.text-size-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.trait/name (clojure.spec.alpha/and :portkey.aws.comprehendmedical/attribute-name))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.trait/score (clojure.spec.alpha/and :portkey.aws.comprehendmedical/float))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/trait (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.trait/name :portkey.aws.comprehendmedical.trait/score]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.attribute/type (clojure.spec.alpha/and :portkey.aws.comprehendmedical/entity-sub-type))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.attribute/score (clojure.spec.alpha/and :portkey.aws.comprehendmedical/float))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.attribute/relationship-score (clojure.spec.alpha/and :portkey.aws.comprehendmedical/float))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.attribute/id (clojure.spec.alpha/and :portkey.aws.comprehendmedical/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.attribute/begin-offset (clojure.spec.alpha/and :portkey.aws.comprehendmedical/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.attribute/end-offset (clojure.spec.alpha/and :portkey.aws.comprehendmedical/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.attribute/text (clojure.spec.alpha/and :portkey.aws.comprehendmedical/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.attribute/traits (clojure.spec.alpha/and :portkey.aws.comprehendmedical/trait-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.attribute/type :portkey.aws.comprehendmedical.attribute/score :portkey.aws.comprehendmedical.attribute/relationship-score :portkey.aws.comprehendmedical.attribute/id :portkey.aws.comprehendmedical.attribute/begin-offset :portkey.aws.comprehendmedical.attribute/end-offset :portkey.aws.comprehendmedical.attribute/text :portkey.aws.comprehendmedical.attribute/traits]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/trait-list (clojure.spec.alpha/coll-of :portkey.aws.comprehendmedical/trait))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.detect-phi-request/text (clojure.spec.alpha/and :portkey.aws.comprehendmedical/bounded-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/detect-phi-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehendmedical.detect-phi-request/text] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.internal-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/unmapped-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.comprehendmedical/unmapped-attribute))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.unmapped-attribute/type (clojure.spec.alpha/and :portkey.aws.comprehendmedical/entity-type))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/unmapped-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.unmapped-attribute/type :portkey.aws.comprehendmedical/attribute]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.detect-entities-request/text (clojure.spec.alpha/and :portkey.aws.comprehendmedical/bounded-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/detect-entities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehendmedical.detect-entities-request/text] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.invalid-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/invalid-encoding-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.invalid-encoding-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.detect-entities-response/entities (clojure.spec.alpha/and :portkey.aws.comprehendmedical/entity-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.detect-entities-response/unmapped-attributes (clojure.spec.alpha/and :portkey.aws.comprehendmedical/unmapped-attribute-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.detect-entities-response/pagination-token (clojure.spec.alpha/and :portkey.aws.comprehendmedical/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/detect-entities-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehendmedical.detect-entities-response/entities] :opt-un [:portkey.aws.comprehendmedical.detect-entities-response/unmapped-attributes :portkey.aws.comprehendmedical.detect-entities-response/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.entity/type (clojure.spec.alpha/and :portkey.aws.comprehendmedical/entity-sub-type))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.entity/category (clojure.spec.alpha/and :portkey.aws.comprehendmedical/entity-type))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.entity/begin-offset (clojure.spec.alpha/and :portkey.aws.comprehendmedical/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.entity/score (clojure.spec.alpha/and :portkey.aws.comprehendmedical/float))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.entity/attributes (clojure.spec.alpha/and :portkey.aws.comprehendmedical/attribute-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.entity/traits (clojure.spec.alpha/and :portkey.aws.comprehendmedical/trait-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.entity/end-offset (clojure.spec.alpha/and :portkey.aws.comprehendmedical/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.entity/text (clojure.spec.alpha/and :portkey.aws.comprehendmedical/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.entity/id (clojure.spec.alpha/and :portkey.aws.comprehendmedical/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical/entity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.entity/type :portkey.aws.comprehendmedical.entity/category :portkey.aws.comprehendmedical.entity/begin-offset :portkey.aws.comprehendmedical.entity/score :portkey.aws.comprehendmedical.entity/attributes :portkey.aws.comprehendmedical.entity/traits :portkey.aws.comprehendmedical.entity/end-offset :portkey.aws.comprehendmedical.entity/text :portkey.aws.comprehendmedical.entity/id]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/bounded-length-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 20000))))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/entity-type #{:anatomy "MEDICATION" "PROTECTED_HEALTH_INFORMATION" "TEST_TREATMENT_PROCEDURE" "ANATOMY" :test-treatment-procedure :protected-health-information :medical-condition "MEDICAL_CONDITION" :medication})

(clojure.spec.alpha/def :portkey.aws.comprehendmedical/float clojure.core/float?)

(clojure.core/defn detect-entities " Inspects the clinical text for a variety of medical entities and returns\nspecific information about them such as entity category, location, and\nconfidence score on that information ." ([detect-entities-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-entities-request detect-entities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehendmedical/endpoints, :http.request.configuration/target-prefix "ComprehendMedical_20181030", :http.request.spec/output-spec :portkey.aws.comprehendmedical/detect-entities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-10-30", :http.request.configuration/service-id "ComprehendMedical", :http.request.spec/input-spec :portkey.aws.comprehendmedical/detect-entities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectEntities", :http.request.configuration/output-deser-fn response-detect-entities-response, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.comprehendmedical/internal-server-exception, "ServiceUnavailableException" :portkey.aws.comprehendmedical/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.comprehendmedical/too-many-requests-exception, "InvalidRequestException" :portkey.aws.comprehendmedical/invalid-request-exception, "InvalidEncodingException" :portkey.aws.comprehendmedical/invalid-encoding-exception, "TextSizeLimitExceededException" :portkey.aws.comprehendmedical/text-size-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef detect-entities :args (clojure.spec.alpha/tuple :portkey.aws.comprehendmedical/detect-entities-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehendmedical/detect-entities-response))

(clojure.core/defn detect-phi " Inspects the clinical text for personal health information (PHI) entities and\nentity category, location, and confidence score on that information." ([detect-phi-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-phi-request detect-phi-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.comprehendmedical/endpoints, :http.request.configuration/target-prefix "ComprehendMedical_20181030", :http.request.spec/output-spec :portkey.aws.comprehendmedical/detect-phi-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-10-30", :http.request.configuration/service-id "ComprehendMedical", :http.request.spec/input-spec :portkey.aws.comprehendmedical/detect-phi-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectPHI", :http.request.configuration/output-deser-fn response-detect-phi-response, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.comprehendmedical/internal-server-exception, "ServiceUnavailableException" :portkey.aws.comprehendmedical/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.comprehendmedical/too-many-requests-exception, "InvalidRequestException" :portkey.aws.comprehendmedical/invalid-request-exception, "InvalidEncodingException" :portkey.aws.comprehendmedical/invalid-encoding-exception, "TextSizeLimitExceededException" :portkey.aws.comprehendmedical/text-size-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef detect-phi :args (clojure.spec.alpha/tuple :portkey.aws.comprehendmedical/detect-phi-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehendmedical/detect-phi-response))
