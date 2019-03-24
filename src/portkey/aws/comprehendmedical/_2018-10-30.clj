(ns portkey.aws.comprehendmedical.-2018-10-30 (:require [portkey.aws]))

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

(clojure.core/defn- response-detect-phi-response ([input] (response-detect-phi-response nil input)) ([resultWrapper1630776 input] (clojure.core/let [rawinput1630775 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1630777 {"Entities" (rawinput1630775 "Entities"), "PaginationToken" (rawinput1630775 "PaginationToken")}] (clojure.core/cond-> {:entities (deser-entity-list (clojure.core/get-in letvar1630777 ["Entities"]))} (letvar1630777 "PaginationToken") (clojure.core/assoc :pagination-token (deser-string (clojure.core/get-in letvar1630777 ["PaginationToken"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1630779 input] (clojure.core/let [rawinput1630778 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1630780 {"Message" (rawinput1630778 "Message")}] (clojure.core/cond-> {} (letvar1630780 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1630780 ["Message"])))))))

(clojure.core/defn- response-text-size-limit-exceeded-exception ([input] (response-text-size-limit-exceeded-exception nil input)) ([resultWrapper1630782 input] (clojure.core/let [rawinput1630781 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1630783 {"Message" (rawinput1630781 "Message")}] (clojure.core/cond-> {} (letvar1630783 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1630783 ["Message"])))))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1630785 input] (clojure.core/let [rawinput1630784 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1630786 {"Message" (rawinput1630784 "Message")}] (clojure.core/cond-> {} (letvar1630786 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1630786 ["Message"])))))))

(clojure.core/defn- response-too-many-requests-exception ([input] (response-too-many-requests-exception nil input)) ([resultWrapper1630788 input] (clojure.core/let [rawinput1630787 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1630789 {"Message" (rawinput1630787 "Message")}] (clojure.core/cond-> {} (letvar1630789 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1630789 ["Message"])))))))

(clojure.core/defn- response-internal-server-exception ([input] (response-internal-server-exception nil input)) ([resultWrapper1630791 input] (clojure.core/let [rawinput1630790 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1630792 {"Message" (rawinput1630790 "Message")}] (clojure.core/cond-> {} (letvar1630792 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1630792 ["Message"])))))))

(clojure.core/defn- response-invalid-encoding-exception ([input] (response-invalid-encoding-exception nil input)) ([resultWrapper1630794 input] (clojure.core/let [rawinput1630793 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1630795 {"Message" (rawinput1630793 "Message")}] (clojure.core/cond-> {} (letvar1630795 "Message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1630795 ["Message"])))))))

(clojure.core/defn- response-detect-entities-response ([input] (response-detect-entities-response nil input)) ([resultWrapper1630797 input] (clojure.core/let [rawinput1630796 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1630798 {"Entities" (rawinput1630796 "Entities"), "UnmappedAttributes" (rawinput1630796 "UnmappedAttributes"), "PaginationToken" (rawinput1630796 "PaginationToken")}] (clojure.core/cond-> {:entities (deser-entity-list (clojure.core/get-in letvar1630798 ["Entities"]))} (letvar1630798 "UnmappedAttributes") (clojure.core/assoc :unmapped-attributes (deser-unmapped-attribute-list (clojure.core/get-in letvar1630798 ["UnmappedAttributes"]))) (letvar1630798 "PaginationToken") (clojure.core/assoc :pagination-token (deser-string (clojure.core/get-in letvar1630798 ["PaginationToken"])))))))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.detect-phi-response/entities (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/entity-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.detect-phi-response/pagination-token (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/detect-phi-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehendmedical.-2018-10-30.detect-phi-response/entities] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.detect-phi-response/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/attribute-list (clojure.spec.alpha/coll-of :portkey.aws.comprehendmedical.-2018-10-30/attribute))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/entity-list (clojure.spec.alpha/coll-of :portkey.aws.comprehendmedical.-2018-10-30/entity))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/attribute-name #{"SIGN" :sign :diagnosis "NEGATION" :negation :symptom "SYMPTOM" "DIAGNOSIS"})

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/entity-sub-type #{"URL" :generic-name :test-value :address "TEST_NAME" "STRENGTH" :email :date :acuity "AGE" :age "CONTACT_POINT" :route-or-mode "TREATMENT_NAME" "NAME" :dosage :name "DATE" "DIRECTION" :frequency "SYSTEM_ORGAN_SITE" "FORM" "BRAND_NAME" :procedure-name :duration :contact-point :rate "PROCEDURE_NAME" "GENERIC_NAME" "QUANTITY" "FREQUENCY" :system-organ-site "TEST_VALUE" :strength "QUALITY" "DURATION" "RATE" "TEST_UNITS" "ADDRESS" :url :identifier :test-name :brand-name :quality "ROUTE_OR_MODE" :profession "ACUITY" :form :test-units "DOSAGE" "EMAIL" :quantity "PROFESSION" "IDENTIFIER" :treatment-name :direction})

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.text-size-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/text-size-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.text-size-limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.trait/name (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/attribute-name))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.trait/score (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/float))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/trait (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.trait/name :portkey.aws.comprehendmedical.-2018-10-30.trait/score]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/service-unavailable-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.attribute/type (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/entity-sub-type))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.attribute/score (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/float))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.attribute/relationship-score (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/float))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.attribute/id (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.attribute/begin-offset (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.attribute/end-offset (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.attribute/text (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.attribute/traits (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/trait-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.attribute/type :portkey.aws.comprehendmedical.-2018-10-30.attribute/score :portkey.aws.comprehendmedical.-2018-10-30.attribute/relationship-score :portkey.aws.comprehendmedical.-2018-10-30.attribute/id :portkey.aws.comprehendmedical.-2018-10-30.attribute/begin-offset :portkey.aws.comprehendmedical.-2018-10-30.attribute/end-offset :portkey.aws.comprehendmedical.-2018-10-30.attribute/text :portkey.aws.comprehendmedical.-2018-10-30.attribute/traits]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.too-many-requests-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/too-many-requests-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.too-many-requests-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/trait-list (clojure.spec.alpha/coll-of :portkey.aws.comprehendmedical.-2018-10-30/trait))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.detect-phi-request/text (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/bounded-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/detect-phi-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehendmedical.-2018-10-30.detect-phi-request/text] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.internal-server-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/internal-server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.internal-server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/unmapped-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.comprehendmedical.-2018-10-30/unmapped-attribute))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.unmapped-attribute/type (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/entity-type))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/unmapped-attribute (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.unmapped-attribute/type :portkey.aws.comprehendmedical.-2018-10-30/attribute]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__)))))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.detect-entities-request/text (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/bounded-length-string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/detect-entities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehendmedical.-2018-10-30.detect-entities-request/text] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.invalid-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/invalid-encoding-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.invalid-encoding-exception/message]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.detect-entities-response/entities (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/entity-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.detect-entities-response/unmapped-attributes (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/unmapped-attribute-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.detect-entities-response/pagination-token (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/detect-entities-response (clojure.spec.alpha/keys :req-un [:portkey.aws.comprehendmedical.-2018-10-30.detect-entities-response/entities] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.detect-entities-response/unmapped-attributes :portkey.aws.comprehendmedical.-2018-10-30.detect-entities-response/pagination-token]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.entity/type (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/entity-sub-type))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.entity/category (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/entity-type))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.entity/begin-offset (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.entity/score (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/float))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.entity/attributes (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/attribute-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.entity/traits (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/trait-list))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.entity/end-offset (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.entity/text (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/string))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30.entity/id (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/integer))
(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/entity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.comprehendmedical.-2018-10-30.entity/type :portkey.aws.comprehendmedical.-2018-10-30.entity/category :portkey.aws.comprehendmedical.-2018-10-30.entity/begin-offset :portkey.aws.comprehendmedical.-2018-10-30.entity/score :portkey.aws.comprehendmedical.-2018-10-30.entity/attributes :portkey.aws.comprehendmedical.-2018-10-30.entity/traits :portkey.aws.comprehendmedical.-2018-10-30.entity/end-offset :portkey.aws.comprehendmedical.-2018-10-30.entity/text :portkey.aws.comprehendmedical.-2018-10-30.entity/id]))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/bounded-length-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 20000))))

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/entity-type #{:anatomy "MEDICATION" "PROTECTED_HEALTH_INFORMATION" "TEST_TREATMENT_PROCEDURE" "ANATOMY" :test-treatment-procedure :protected-health-information :medical-condition "MEDICAL_CONDITION" :medication})

(clojure.spec.alpha/def :portkey.aws.comprehendmedical.-2018-10-30/float clojure.core/float?)

(clojure.core/defn detect-entities ([detect-entities-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-detect-entities-request detect-entities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.comprehendmedical.-2018-10-30/endpoints, :http.request.configuration/target-prefix "ComprehendMedical_20181030", :http.request.spec/output-spec :portkey.aws.comprehendmedical.-2018-10-30/detect-entities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-10-30", :http.request.configuration/service-id "ComprehendMedical", :http.request.spec/input-spec :portkey.aws.comprehendmedical.-2018-10-30/detect-entities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectEntities", :http.request.configuration/output-deser-fn response-detect-entities-response, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.comprehendmedical.-2018-10-30/internal-server-exception, "ServiceUnavailableException" :portkey.aws.comprehendmedical.-2018-10-30/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.comprehendmedical.-2018-10-30/too-many-requests-exception, "InvalidRequestException" :portkey.aws.comprehendmedical.-2018-10-30/invalid-request-exception, "InvalidEncodingException" :portkey.aws.comprehendmedical.-2018-10-30/invalid-encoding-exception, "TextSizeLimitExceededException" :portkey.aws.comprehendmedical.-2018-10-30/text-size-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef detect-entities :args (clojure.spec.alpha/tuple :portkey.aws.comprehendmedical.-2018-10-30/detect-entities-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/detect-entities-response))

(clojure.core/defn detect-phi ([detect-phi-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-detect-phi-request detect-phi-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.comprehendmedical.-2018-10-30/endpoints, :http.request.configuration/target-prefix "ComprehendMedical_20181030", :http.request.spec/output-spec :portkey.aws.comprehendmedical.-2018-10-30/detect-phi-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-10-30", :http.request.configuration/service-id "ComprehendMedical", :http.request.spec/input-spec :portkey.aws.comprehendmedical.-2018-10-30/detect-phi-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectPHI", :http.request.configuration/output-deser-fn response-detect-phi-response, :http.request.spec/error-spec {"InternalServerException" :portkey.aws.comprehendmedical.-2018-10-30/internal-server-exception, "ServiceUnavailableException" :portkey.aws.comprehendmedical.-2018-10-30/service-unavailable-exception, "TooManyRequestsException" :portkey.aws.comprehendmedical.-2018-10-30/too-many-requests-exception, "InvalidRequestException" :portkey.aws.comprehendmedical.-2018-10-30/invalid-request-exception, "InvalidEncodingException" :portkey.aws.comprehendmedical.-2018-10-30/invalid-encoding-exception, "TextSizeLimitExceededException" :portkey.aws.comprehendmedical.-2018-10-30/text-size-limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef detect-phi :args (clojure.spec.alpha/tuple :portkey.aws.comprehendmedical.-2018-10-30/detect-phi-request) :ret (clojure.spec.alpha/and :portkey.aws.comprehendmedical.-2018-10-30/detect-phi-response))
