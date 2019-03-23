(ns portkey.aws.sdb (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "sdb", :region "ap-northeast-1"},
    :ssl-common-name "sdb.ap-northeast-1.amazonaws.com",
    :endpoint "https://sdb.ap-northeast-1.amazonaws.com",
    :signature-version :v2},
   "eu-west-1"
   {:credential-scope {:service "sdb", :region "eu-west-1"},
    :ssl-common-name "sdb.eu-west-1.amazonaws.com",
    :endpoint "https://sdb.eu-west-1.amazonaws.com",
    :signature-version :v2},
   "ap-southeast-2"
   {:credential-scope {:service "sdb", :region "ap-southeast-2"},
    :ssl-common-name "sdb.ap-southeast-2.amazonaws.com",
    :endpoint "https://sdb.ap-southeast-2.amazonaws.com",
    :signature-version :v2},
   "sa-east-1"
   {:credential-scope {:service "sdb", :region "sa-east-1"},
    :ssl-common-name "sdb.sa-east-1.amazonaws.com",
    :endpoint "https://sdb.sa-east-1.amazonaws.com",
    :signature-version :v2},
   "ap-southeast-1"
   {:credential-scope {:service "sdb", :region "ap-southeast-1"},
    :ssl-common-name "sdb.ap-southeast-1.amazonaws.com",
    :endpoint "https://sdb.ap-southeast-1.amazonaws.com",
    :signature-version :v2},
   "us-west-2"
   {:credential-scope {:service "sdb", :region "us-west-2"},
    :ssl-common-name "sdb.us-west-2.amazonaws.com",
    :endpoint "https://sdb.us-west-2.amazonaws.com",
    :signature-version :v2},
   "us-east-1"
   {:credential-scope {:service "sdb", :region "us-east-1"},
    :ssl-common-name "sdb.amazonaws.com",
    :endpoint "https://sdb.amazonaws.com",
    :signature-version :v2},
   "us-west-1"
   {:credential-scope {:service "sdb", :region "us-west-1"},
    :ssl-common-name "sdb.us-west-1.amazonaws.com",
    :endpoint "https://sdb.us-west-1.amazonaws.com",
    :signature-version :v2}})

(clojure.core/declare ser-attribute-list)

(clojure.core/declare ser-deletable-item-list)

(clojure.core/declare ser-deletable-item)

(clojure.core/declare ser-replaceable-item)

(clojure.core/declare ser-attribute)

(clojure.core/declare ser-replaceable-attribute-list)

(clojure.core/declare ser-update-condition)

(clojure.core/declare ser-attribute-name-list)

(clojure.core/declare ser-integer)

(clojure.core/declare ser-string)

(clojure.core/declare ser-replaceable-attribute)

(clojure.core/declare ser-replaceable-item-list)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute coll) #:http.request.field{:shape "Attribute", :location-name "Attribute"}))) input), :shape "AttributeList", :type "list", :flattened true})

(clojure.core/defn- ser-deletable-item-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-deletable-item coll) #:http.request.field{:shape "DeletableItem", :location-name "Item"}))) input), :shape "DeletableItemList", :type "list", :flattened true})

(clojure.core/defn- ser-deletable-item [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "String", :location-name "ItemName"})], :shape "DeletableItem", :type "structure"} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-list (input :attributes)) #:http.request.field{:name "Attributes", :shape "AttributeList"}))))

(clojure.core/defn- ser-replaceable-item [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "String", :location-name "ItemName"}) (clojure.core/into (ser-replaceable-attribute-list (:attributes input)) #:http.request.field{:name "Attributes", :shape "ReplaceableAttributeList"})], :shape "ReplaceableItem", :type "structure"}))

(clojure.core/defn- ser-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "Value", :shape "String"})], :shape "Attribute", :type "structure"} (clojure.core/contains? input :alternate-name-encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :alternate-name-encoding)) #:http.request.field{:name "AlternateNameEncoding", :shape "String"})) (clojure.core/contains? input :alternate-value-encoding) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :alternate-value-encoding)) #:http.request.field{:name "AlternateValueEncoding", :shape "String"}))))

(clojure.core/defn- ser-replaceable-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-replaceable-attribute coll) #:http.request.field{:shape "ReplaceableAttribute", :location-name "Attribute"}))) input), :shape "ReplaceableAttributeList", :type "list", :flattened true})

(clojure.core/defn- ser-update-condition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "UpdateCondition", :type "structure"} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "Name", :shape "String"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :value)) #:http.request.field{:name "Value", :shape "String"})) (clojure.core/contains? input :exists) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :exists)) #:http.request.field{:name "Exists", :shape "Boolean"}))))

(clojure.core/defn- ser-attribute-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String", :location-name "AttributeName"}))) input), :shape "AttributeNameList", :type "list", :flattened true})

(clojure.core/defn- ser-integer [input] #:http.request.field{:value input, :shape "Integer"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-replaceable-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-string (:name input)) #:http.request.field{:name "Name", :shape "String"}) (clojure.core/into (ser-string (:value input)) #:http.request.field{:name "Value", :shape "String"})], :shape "ReplaceableAttribute", :type "structure"} (clojure.core/contains? input :replace) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :replace)) #:http.request.field{:name "Replace", :shape "Boolean"}))))

(clojure.core/defn- ser-replaceable-item-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-replaceable-item coll) #:http.request.field{:shape "ReplaceableItem", :location-name "Item"}))) input), :shape "ReplaceableItemList", :type "list", :flattened true})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-delete-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :domain-name)) #:http.request.field{:name "DomainName", :shape "String"}) (clojure.core/into (ser-string (input :item-name)) #:http.request.field{:name "ItemName", :shape "String"})]} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-list (input :attributes)) #:http.request.field{:name "Attributes", :shape "AttributeList"})) (clojure.core/contains? input :expected) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-condition (input :expected)) #:http.request.field{:name "Expected", :shape "UpdateCondition"}))))

(clojure.core/defn- req-domain-metadata-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :domain-name)) #:http.request.field{:name "DomainName", :shape "String"})]}))

(clojure.core/defn- req-batch-put-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :domain-name)) #:http.request.field{:name "DomainName", :shape "String"}) (clojure.core/into (ser-replaceable-item-list (input :items)) #:http.request.field{:name "Items", :shape "ReplaceableItemList"})]}))

(clojure.core/defn- req-put-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :domain-name)) #:http.request.field{:name "DomainName", :shape "String"}) (clojure.core/into (ser-string (input :item-name)) #:http.request.field{:name "ItemName", :shape "String"}) (clojure.core/into (ser-replaceable-attribute-list (input :attributes)) #:http.request.field{:name "Attributes", :shape "ReplaceableAttributeList"})]} (clojure.core/contains? input :expected) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-condition (input :expected)) #:http.request.field{:name "Expected", :shape "UpdateCondition"}))))

(clojure.core/defn- req-create-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :domain-name)) #:http.request.field{:name "DomainName", :shape "String"})]}))

(clojure.core/defn- req-batch-delete-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :domain-name)) #:http.request.field{:name "DomainName", :shape "String"}) (clojure.core/into (ser-deletable-item-list (input :items)) #:http.request.field{:name "Items", :shape "DeletableItemList"})]}))

(clojure.core/defn- req-delete-domain-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :domain-name)) #:http.request.field{:name "DomainName", :shape "String"})]}))

(clojure.core/defn- req-list-domains-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-number-of-domains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer (input :max-number-of-domains)) #:http.request.field{:name "MaxNumberOfDomains", :shape "Integer"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"}))))

(clojure.core/defn- req-get-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :domain-name)) #:http.request.field{:name "DomainName", :shape "String"}) (clojure.core/into (ser-string (input :item-name)) #:http.request.field{:name "ItemName", :shape "String"})]} (clojure.core/contains? input :attribute-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name-list (input :attribute-names)) #:http.request.field{:name "AttributeNames", :shape "AttributeNameList"})) (clojure.core/contains? input :consistent-read) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :consistent-read)) #:http.request.field{:name "ConsistentRead", :shape "Boolean"}))))

(clojure.core/defn- req-select-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :select-expression)) #:http.request.field{:name "SelectExpression", :shape "String"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "String"})) (clojure.core/contains? input :consistent-read) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :consistent-read)) #:http.request.field{:name "ConsistentRead", :shape "Boolean"}))))

(clojure.core/declare deser-attribute-list)

(clojure.core/declare deser-item-list)

(clojure.core/declare deser-attribute)

(clojure.core/declare deser-domain-name-list)

(clojure.core/declare deser-integer)

(clojure.core/declare deser-string)

(clojure.core/declare deser-long)

(clojure.core/declare deser-item)

(clojure.core/declare deser-float)

(clojure.core/defn- deser-attribute-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute (:content coll)))) input))

(clojure.core/defn- deser-item-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-item (:content coll)))) input))

(clojure.core/defn- deser-attribute [input] (clojure.core/let [letvar523288 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "AlternateNameEncoding" (portkey.aws/search-for-tag input "AlternateNameEncoding" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil), "AlternateValueEncoding" (portkey.aws/search-for-tag input "AlternateValueEncoding" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-string (clojure.core/get-in letvar523288 ["Name" :content])), :value (deser-string (clojure.core/get-in letvar523288 ["Value" :content]))} (letvar523288 "AlternateNameEncoding") (clojure.core/assoc :alternate-name-encoding (deser-string (clojure.core/get-in letvar523288 ["AlternateNameEncoding" :content]))) (letvar523288 "AlternateValueEncoding") (clojure.core/assoc :alternate-value-encoding (deser-string (clojure.core/get-in letvar523288 ["AlternateValueEncoding" :content]))))))

(clojure.core/defn- deser-domain-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string (:content coll)))) input))

(clojure.core/defn- deser-integer [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-long [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-item [input] (clojure.core/let [letvar523422 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "AlternateNameEncoding" (portkey.aws/search-for-tag input "AlternateNameEncoding" :flattened? nil :xmlAttribute? nil), "Attribute" (portkey.aws/search-for-tag input "Attribute" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-string (clojure.core/get-in letvar523422 ["Name" :content])), :attributes (deser-attribute-list (clojure.core/get-in letvar523422 ["Attribute"]))} (letvar523422 "AlternateNameEncoding") (clojure.core/assoc :alternate-name-encoding (deser-string (clojure.core/get-in letvar523422 ["AlternateNameEncoding" :content]))))))

(clojure.core/defn- deser-float [input] (java.lang.Float. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- response-invalid-query-expression ([input] (response-invalid-query-expression nil input)) ([resultWrapper523426 input] (clojure.core/let [rawinput523425 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523427 {"BoxUsage" (portkey.aws/search-for-tag rawinput523425 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523426)}] (clojure.core/cond-> {} (letvar523427 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523427 ["BoxUsage" :content])))))))

(clojure.core/defn- response-duplicate-item-name ([input] (response-duplicate-item-name nil input)) ([resultWrapper523429 input] (clojure.core/let [rawinput523428 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523430 {"BoxUsage" (portkey.aws/search-for-tag rawinput523428 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523429)}] (clojure.core/cond-> {} (letvar523430 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523430 ["BoxUsage" :content])))))))

(clojure.core/defn- response-invalid-number-predicates ([input] (response-invalid-number-predicates nil input)) ([resultWrapper523432 input] (clojure.core/let [rawinput523431 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523433 {"BoxUsage" (portkey.aws/search-for-tag rawinput523431 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523432)}] (clojure.core/cond-> {} (letvar523433 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523433 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-submitted-attributes-exceeded ([input] (response-number-submitted-attributes-exceeded nil input)) ([resultWrapper523435 input] (clojure.core/let [rawinput523434 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523436 {"BoxUsage" (portkey.aws/search-for-tag rawinput523434 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523435)}] (clojure.core/cond-> {} (letvar523436 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523436 ["BoxUsage" :content])))))))

(clojure.core/defn- response-select-result ([input] (response-select-result nil input)) ([resultWrapper523438 input] (clojure.core/let [rawinput523437 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523439 {"Item" (portkey.aws/search-for-tag rawinput523437 "Item" :flattened? true :result-wrapper resultWrapper523438), "NextToken" (portkey.aws/search-for-tag rawinput523437 "NextToken" :flattened? nil :result-wrapper resultWrapper523438)}] (clojure.core/cond-> {} (letvar523439 "Item") (clojure.core/assoc :items (deser-item-list (clojure.core/get-in letvar523439 ["Item"]))) (letvar523439 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar523439 ["NextToken" :content])))))))

(clojure.core/defn- response-invalid-parameter-value ([input] (response-invalid-parameter-value nil input)) ([resultWrapper523441 input] (clojure.core/let [rawinput523440 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523442 {"BoxUsage" (portkey.aws/search-for-tag rawinput523440 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523441)}] (clojure.core/cond-> {} (letvar523442 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523442 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-domain-bytes-exceeded ([input] (response-number-domain-bytes-exceeded nil input)) ([resultWrapper523444 input] (clojure.core/let [rawinput523443 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523445 {"BoxUsage" (portkey.aws/search-for-tag rawinput523443 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523444)}] (clojure.core/cond-> {} (letvar523445 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523445 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-domain-attributes-exceeded ([input] (response-number-domain-attributes-exceeded nil input)) ([resultWrapper523447 input] (clojure.core/let [rawinput523446 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523448 {"BoxUsage" (portkey.aws/search-for-tag rawinput523446 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523447)}] (clojure.core/cond-> {} (letvar523448 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523448 ["BoxUsage" :content])))))))

(clojure.core/defn- response-no-such-domain ([input] (response-no-such-domain nil input)) ([resultWrapper523450 input] (clojure.core/let [rawinput523449 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523451 {"BoxUsage" (portkey.aws/search-for-tag rawinput523449 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523450)}] (clojure.core/cond-> {} (letvar523451 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523451 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-domains-exceeded ([input] (response-number-domains-exceeded nil input)) ([resultWrapper523453 input] (clojure.core/let [rawinput523452 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523454 {"BoxUsage" (portkey.aws/search-for-tag rawinput523452 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523453)}] (clojure.core/cond-> {} (letvar523454 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523454 ["BoxUsage" :content])))))))

(clojure.core/defn- response-list-domains-result ([input] (response-list-domains-result nil input)) ([resultWrapper523456 input] (clojure.core/let [rawinput523455 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523457 {"DomainName" (portkey.aws/search-for-tag rawinput523455 "DomainName" :flattened? true :result-wrapper resultWrapper523456), "NextToken" (portkey.aws/search-for-tag rawinput523455 "NextToken" :flattened? nil :result-wrapper resultWrapper523456)}] (clojure.core/cond-> {} (letvar523457 "DomainName") (clojure.core/assoc :domain-names (deser-domain-name-list (clojure.core/get-in letvar523457 ["DomainName"]))) (letvar523457 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar523457 ["NextToken" :content])))))))

(clojure.core/defn- response-attribute-does-not-exist ([input] (response-attribute-does-not-exist nil input)) ([resultWrapper523459 input] (clojure.core/let [rawinput523458 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523460 {"BoxUsage" (portkey.aws/search-for-tag rawinput523458 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523459)}] (clojure.core/cond-> {} (letvar523460 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523460 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-submitted-items-exceeded ([input] (response-number-submitted-items-exceeded nil input)) ([resultWrapper523462 input] (clojure.core/let [rawinput523461 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523463 {"BoxUsage" (portkey.aws/search-for-tag rawinput523461 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523462)}] (clojure.core/cond-> {} (letvar523463 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523463 ["BoxUsage" :content])))))))

(clojure.core/defn- response-invalid-number-value-tests ([input] (response-invalid-number-value-tests nil input)) ([resultWrapper523465 input] (clojure.core/let [rawinput523464 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523466 {"BoxUsage" (portkey.aws/search-for-tag rawinput523464 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523465)}] (clojure.core/cond-> {} (letvar523466 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523466 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-item-attributes-exceeded ([input] (response-number-item-attributes-exceeded nil input)) ([resultWrapper523468 input] (clojure.core/let [rawinput523467 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523469 {"BoxUsage" (portkey.aws/search-for-tag rawinput523467 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523468)}] (clojure.core/cond-> {} (letvar523469 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523469 ["BoxUsage" :content])))))))

(clojure.core/defn- response-domain-metadata-result ([input] (response-domain-metadata-result nil input)) ([resultWrapper523471 input] (clojure.core/let [rawinput523470 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523472 {"ItemCount" (portkey.aws/search-for-tag rawinput523470 "ItemCount" :flattened? nil :result-wrapper resultWrapper523471), "ItemNamesSizeBytes" (portkey.aws/search-for-tag rawinput523470 "ItemNamesSizeBytes" :flattened? nil :result-wrapper resultWrapper523471), "AttributeNameCount" (portkey.aws/search-for-tag rawinput523470 "AttributeNameCount" :flattened? nil :result-wrapper resultWrapper523471), "AttributeNamesSizeBytes" (portkey.aws/search-for-tag rawinput523470 "AttributeNamesSizeBytes" :flattened? nil :result-wrapper resultWrapper523471), "AttributeValueCount" (portkey.aws/search-for-tag rawinput523470 "AttributeValueCount" :flattened? nil :result-wrapper resultWrapper523471), "AttributeValuesSizeBytes" (portkey.aws/search-for-tag rawinput523470 "AttributeValuesSizeBytes" :flattened? nil :result-wrapper resultWrapper523471), "Timestamp" (portkey.aws/search-for-tag rawinput523470 "Timestamp" :flattened? nil :result-wrapper resultWrapper523471)}] (clojure.core/cond-> {} (letvar523472 "ItemCount") (clojure.core/assoc :item-count (deser-integer (clojure.core/get-in letvar523472 ["ItemCount" :content]))) (letvar523472 "ItemNamesSizeBytes") (clojure.core/assoc :item-names-size-bytes (deser-long (clojure.core/get-in letvar523472 ["ItemNamesSizeBytes" :content]))) (letvar523472 "AttributeNameCount") (clojure.core/assoc :attribute-name-count (deser-integer (clojure.core/get-in letvar523472 ["AttributeNameCount" :content]))) (letvar523472 "AttributeNamesSizeBytes") (clojure.core/assoc :attribute-names-size-bytes (deser-long (clojure.core/get-in letvar523472 ["AttributeNamesSizeBytes" :content]))) (letvar523472 "AttributeValueCount") (clojure.core/assoc :attribute-value-count (deser-integer (clojure.core/get-in letvar523472 ["AttributeValueCount" :content]))) (letvar523472 "AttributeValuesSizeBytes") (clojure.core/assoc :attribute-values-size-bytes (deser-long (clojure.core/get-in letvar523472 ["AttributeValuesSizeBytes" :content]))) (letvar523472 "Timestamp") (clojure.core/assoc :timestamp (deser-integer (clojure.core/get-in letvar523472 ["Timestamp" :content])))))))

(clojure.core/defn- response-get-attributes-result ([input] (response-get-attributes-result nil input)) ([resultWrapper523474 input] (clojure.core/let [rawinput523473 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523475 {"Attribute" (portkey.aws/search-for-tag rawinput523473 "Attribute" :flattened? true :result-wrapper resultWrapper523474)}] (clojure.core/cond-> {} (letvar523475 "Attribute") (clojure.core/assoc :attributes (deser-attribute-list (clojure.core/get-in letvar523475 ["Attribute"])))))))

(clojure.core/defn- response-too-many-requested-attributes ([input] (response-too-many-requested-attributes nil input)) ([resultWrapper523477 input] (clojure.core/let [rawinput523476 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523478 {"BoxUsage" (portkey.aws/search-for-tag rawinput523476 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523477)}] (clojure.core/cond-> {} (letvar523478 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523478 ["BoxUsage" :content])))))))

(clojure.core/defn- response-request-timeout ([input] (response-request-timeout nil input)) ([resultWrapper523480 input] (clojure.core/let [rawinput523479 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523481 {"BoxUsage" (portkey.aws/search-for-tag rawinput523479 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523480)}] (clojure.core/cond-> {} (letvar523481 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523481 ["BoxUsage" :content])))))))

(clojure.core/defn- response-missing-parameter ([input] (response-missing-parameter nil input)) ([resultWrapper523483 input] (clojure.core/let [rawinput523482 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523484 {"BoxUsage" (portkey.aws/search-for-tag rawinput523482 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523483)}] (clojure.core/cond-> {} (letvar523484 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523484 ["BoxUsage" :content])))))))

(clojure.core/defn- response-invalid-next-token ([input] (response-invalid-next-token nil input)) ([resultWrapper523486 input] (clojure.core/let [rawinput523485 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar523487 {"BoxUsage" (portkey.aws/search-for-tag rawinput523485 "BoxUsage" :flattened? nil :result-wrapper resultWrapper523486)}] (clojure.core/cond-> {} (letvar523487 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar523487 ["BoxUsage" :content])))))))

(clojure.spec.alpha/def :portkey.aws.sdb.invalid-query-expression/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/invalid-query-expression (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.invalid-query-expression/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.delete-attributes-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.delete-attributes-request/item-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.delete-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.sdb/attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb.delete-attributes-request/expected (clojure.spec.alpha/and :portkey.aws.sdb/update-condition))
(clojure.spec.alpha/def :portkey.aws.sdb/delete-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.delete-attributes-request/domain-name :portkey.aws.sdb.delete-attributes-request/item-name] :opt-un [:portkey.aws.sdb.delete-attributes-request/attributes :portkey.aws.sdb.delete-attributes-request/expected]))

(clojure.spec.alpha/def :portkey.aws.sdb/attribute-list (clojure.spec.alpha/coll-of :portkey.aws.sdb/attribute))

(clojure.spec.alpha/def :portkey.aws.sdb.duplicate-item-name/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/duplicate-item-name (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.duplicate-item-name/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.invalid-number-predicates/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/invalid-number-predicates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.invalid-number-predicates/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb/deletable-item-list (clojure.spec.alpha/coll-of :portkey.aws.sdb/deletable-item))

(clojure.spec.alpha/def :portkey.aws.sdb.deletable-item/name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.deletable-item/attributes (clojure.spec.alpha/and :portkey.aws.sdb/attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb/deletable-item (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.deletable-item/name] :opt-un [:portkey.aws.sdb.deletable-item/attributes]))

(clojure.spec.alpha/def :portkey.aws.sdb.number-submitted-attributes-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/number-submitted-attributes-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.number-submitted-attributes-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.select-result/items (clojure.spec.alpha/and :portkey.aws.sdb/item-list))
(clojure.spec.alpha/def :portkey.aws.sdb.select-result/next-token (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb/select-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.select-result/items :portkey.aws.sdb.select-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.sdb.replaceable-item/name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.replaceable-item/attributes (clojure.spec.alpha/and :portkey.aws.sdb/replaceable-attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb/replaceable-item (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.replaceable-item/name :portkey.aws.sdb.replaceable-item/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.domain-metadata-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb/domain-metadata-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.domain-metadata-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.invalid-parameter-value/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/invalid-parameter-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.invalid-parameter-value/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.batch-put-attributes-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.batch-put-attributes-request/items (clojure.spec.alpha/and :portkey.aws.sdb/replaceable-item-list))
(clojure.spec.alpha/def :portkey.aws.sdb/batch-put-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.batch-put-attributes-request/domain-name :portkey.aws.sdb.batch-put-attributes-request/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.put-attributes-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.put-attributes-request/item-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.put-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.sdb/replaceable-attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb.put-attributes-request/expected (clojure.spec.alpha/and :portkey.aws.sdb/update-condition))
(clojure.spec.alpha/def :portkey.aws.sdb/put-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.put-attributes-request/domain-name :portkey.aws.sdb.put-attributes-request/item-name :portkey.aws.sdb.put-attributes-request/attributes] :opt-un [:portkey.aws.sdb.put-attributes-request/expected]))

(clojure.spec.alpha/def :portkey.aws.sdb.create-domain-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb/create-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.create-domain-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.number-domain-bytes-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/number-domain-bytes-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.number-domain-bytes-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.number-domain-attributes-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/number-domain-attributes-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.number-domain-attributes-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb/item-list (clojure.spec.alpha/coll-of :portkey.aws.sdb/item))

(clojure.spec.alpha/def :portkey.aws.sdb.batch-delete-attributes-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.batch-delete-attributes-request/items (clojure.spec.alpha/and :portkey.aws.sdb/deletable-item-list))
(clojure.spec.alpha/def :portkey.aws.sdb/batch-delete-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.batch-delete-attributes-request/domain-name :portkey.aws.sdb.batch-delete-attributes-request/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.attribute/name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.attribute/alternate-name-encoding (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.attribute/value (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.attribute/alternate-value-encoding (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb/attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.attribute/name :portkey.aws.sdb.attribute/value] :opt-un [:portkey.aws.sdb.attribute/alternate-name-encoding :portkey.aws.sdb.attribute/alternate-value-encoding]))

(clojure.spec.alpha/def :portkey.aws.sdb/replaceable-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.sdb/replaceable-attribute))

(clojure.spec.alpha/def :portkey.aws.sdb/domain-name-list (clojure.spec.alpha/coll-of :portkey.aws.sdb/string))

(clojure.spec.alpha/def :portkey.aws.sdb.update-condition/name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.update-condition/value (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.update-condition/exists (clojure.spec.alpha/and :portkey.aws.sdb/boolean))
(clojure.spec.alpha/def :portkey.aws.sdb/update-condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.update-condition/name :portkey.aws.sdb.update-condition/value :portkey.aws.sdb.update-condition/exists]))

(clojure.spec.alpha/def :portkey.aws.sdb.delete-domain-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb/delete-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.delete-domain-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.no-such-domain/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/no-such-domain (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.no-such-domain/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.list-domains-request/max-number-of-domains (clojure.spec.alpha/and :portkey.aws.sdb/integer))
(clojure.spec.alpha/def :portkey.aws.sdb.list-domains-request/next-token (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb/list-domains-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.list-domains-request/max-number-of-domains :portkey.aws.sdb.list-domains-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.sdb.number-domains-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/number-domains-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.number-domains-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.list-domains-result/domain-names (clojure.spec.alpha/and :portkey.aws.sdb/domain-name-list))
(clojure.spec.alpha/def :portkey.aws.sdb.list-domains-result/next-token (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb/list-domains-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.list-domains-result/domain-names :portkey.aws.sdb.list-domains-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.sdb/attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.sdb/string))

(clojure.spec.alpha/def :portkey.aws.sdb/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sdb/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sdb.replaceable-attribute/name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.replaceable-attribute/value (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.replaceable-attribute/replace (clojure.spec.alpha/and :portkey.aws.sdb/boolean))
(clojure.spec.alpha/def :portkey.aws.sdb/replaceable-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.replaceable-attribute/name :portkey.aws.sdb.replaceable-attribute/value] :opt-un [:portkey.aws.sdb.replaceable-attribute/replace]))

(clojure.spec.alpha/def :portkey.aws.sdb.get-attributes-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.get-attributes-request/item-name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.get-attributes-request/attribute-names (clojure.spec.alpha/and :portkey.aws.sdb/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sdb.get-attributes-request/consistent-read (clojure.spec.alpha/and :portkey.aws.sdb/boolean))
(clojure.spec.alpha/def :portkey.aws.sdb/get-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.get-attributes-request/domain-name :portkey.aws.sdb.get-attributes-request/item-name] :opt-un [:portkey.aws.sdb.get-attributes-request/attribute-names :portkey.aws.sdb.get-attributes-request/consistent-read]))

(clojure.spec.alpha/def :portkey.aws.sdb/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sdb/replaceable-item-list (clojure.spec.alpha/coll-of :portkey.aws.sdb/replaceable-item))

(clojure.spec.alpha/def :portkey.aws.sdb.select-request/select-expression (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.select-request/next-token (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.select-request/consistent-read (clojure.spec.alpha/and :portkey.aws.sdb/boolean))
(clojure.spec.alpha/def :portkey.aws.sdb/select-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.select-request/select-expression] :opt-un [:portkey.aws.sdb.select-request/next-token :portkey.aws.sdb.select-request/consistent-read]))

(clojure.spec.alpha/def :portkey.aws.sdb.attribute-does-not-exist/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/attribute-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.attribute-does-not-exist/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.number-submitted-items-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/number-submitted-items-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.number-submitted-items-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.invalid-number-value-tests/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/invalid-number-value-tests (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.invalid-number-value-tests/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.number-item-attributes-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/number-item-attributes-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.number-item-attributes-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.domain-metadata-result/item-count (clojure.spec.alpha/and :portkey.aws.sdb/integer))
(clojure.spec.alpha/def :portkey.aws.sdb.domain-metadata-result/item-names-size-bytes (clojure.spec.alpha/and :portkey.aws.sdb/long))
(clojure.spec.alpha/def :portkey.aws.sdb.domain-metadata-result/attribute-name-count (clojure.spec.alpha/and :portkey.aws.sdb/integer))
(clojure.spec.alpha/def :portkey.aws.sdb.domain-metadata-result/attribute-names-size-bytes (clojure.spec.alpha/and :portkey.aws.sdb/long))
(clojure.spec.alpha/def :portkey.aws.sdb.domain-metadata-result/attribute-value-count (clojure.spec.alpha/and :portkey.aws.sdb/integer))
(clojure.spec.alpha/def :portkey.aws.sdb.domain-metadata-result/attribute-values-size-bytes (clojure.spec.alpha/and :portkey.aws.sdb/long))
(clojure.spec.alpha/def :portkey.aws.sdb.domain-metadata-result/timestamp (clojure.spec.alpha/and :portkey.aws.sdb/integer))
(clojure.spec.alpha/def :portkey.aws.sdb/domain-metadata-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.domain-metadata-result/item-count :portkey.aws.sdb.domain-metadata-result/item-names-size-bytes :portkey.aws.sdb.domain-metadata-result/attribute-name-count :portkey.aws.sdb.domain-metadata-result/attribute-names-size-bytes :portkey.aws.sdb.domain-metadata-result/attribute-value-count :portkey.aws.sdb.domain-metadata-result/attribute-values-size-bytes :portkey.aws.sdb.domain-metadata-result/timestamp]))

(clojure.spec.alpha/def :portkey.aws.sdb.get-attributes-result/attributes (clojure.spec.alpha/and :portkey.aws.sdb/attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb/get-attributes-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.get-attributes-result/attributes]))

(clojure.spec.alpha/def :portkey.aws.sdb.too-many-requested-attributes/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/too-many-requested-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.too-many-requested-attributes/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.request-timeout/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/request-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.request-timeout/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.item/name (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.item/alternate-name-encoding (clojure.spec.alpha/and :portkey.aws.sdb/string))
(clojure.spec.alpha/def :portkey.aws.sdb.item/attributes (clojure.spec.alpha/and :portkey.aws.sdb/attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb/item (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.item/name :portkey.aws.sdb.item/attributes] :opt-un [:portkey.aws.sdb.item/alternate-name-encoding]))

(clojure.spec.alpha/def :portkey.aws.sdb/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.sdb.missing-parameter/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/missing-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.missing-parameter/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.invalid-next-token/box-usage (clojure.spec.alpha/and :portkey.aws.sdb/float))
(clojure.spec.alpha/def :portkey.aws.sdb/invalid-next-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.invalid-next-token/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb/boolean clojure.core/boolean?)

(clojure.core/defn list-domains ([] (list-domains {})) ([list-domains-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-domains-request list-domains-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb/list-domains-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/list-domains-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListDomainsResult", :http.request.configuration/action "ListDomains", :http.request.configuration/output-deser-fn response-list-domains-result, :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "InvalidNextToken" :portkey.aws.sdb/invalid-next-token}})))))
(clojure.spec.alpha/fdef list-domains :args (clojure.spec.alpha/? :portkey.aws.sdb/list-domains-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb/list-domains-result))

(clojure.core/defn get-attributes ([get-attributes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-attributes-request get-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb/get-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/get-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetAttributesResult", :http.request.configuration/action "GetAttributes", :http.request.configuration/output-deser-fn response-get-attributes-result, :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb/missing-parameter, "NoSuchDomain" :portkey.aws.sdb/no-such-domain}})))))
(clojure.spec.alpha/fdef get-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb/get-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb/get-attributes-result))

(clojure.core/defn batch-delete-attributes ([batch-delete-attributes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-batch-delete-attributes-request batch-delete-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/batch-delete-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDeleteAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef batch-delete-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb/batch-delete-attributes-request) :ret clojure.core/true?)

(clojure.core/defn domain-metadata ([domain-metadata-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-domain-metadata-request domain-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb/domain-metadata-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/domain-metadata-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DomainMetadataResult", :http.request.configuration/action "DomainMetadata", :http.request.configuration/output-deser-fn response-domain-metadata-result, :http.request.spec/error-spec {"MissingParameter" :portkey.aws.sdb/missing-parameter, "NoSuchDomain" :portkey.aws.sdb/no-such-domain}})))))
(clojure.spec.alpha/fdef domain-metadata :args (clojure.spec.alpha/tuple :portkey.aws.sdb/domain-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb/domain-metadata-result))

(clojure.core/defn delete-attributes ([delete-attributes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-attributes-request delete-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/delete-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb/missing-parameter, "NoSuchDomain" :portkey.aws.sdb/no-such-domain, "AttributeDoesNotExist" :portkey.aws.sdb/attribute-does-not-exist}})))))
(clojure.spec.alpha/fdef delete-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb/delete-attributes-request) :ret clojure.core/true?)

(clojure.core/defn put-attributes ([put-attributes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-attributes-request put-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/put-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb/missing-parameter, "NoSuchDomain" :portkey.aws.sdb/no-such-domain, "NumberDomainAttributesExceeded" :portkey.aws.sdb/number-domain-attributes-exceeded, "NumberDomainBytesExceeded" :portkey.aws.sdb/number-domain-bytes-exceeded, "NumberItemAttributesExceeded" :portkey.aws.sdb/number-item-attributes-exceeded, "AttributeDoesNotExist" :portkey.aws.sdb/attribute-does-not-exist}})))))
(clojure.spec.alpha/fdef put-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb/put-attributes-request) :ret clojure.core/true?)

(clojure.core/defn create-domain ([create-domain-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-domain-request create-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/create-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDomain", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb/missing-parameter, "NumberDomainsExceeded" :portkey.aws.sdb/number-domains-exceeded}})))))
(clojure.spec.alpha/fdef create-domain :args (clojure.spec.alpha/tuple :portkey.aws.sdb/create-domain-request) :ret clojure.core/true?)

(clojure.core/defn batch-put-attributes ([batch-put-attributes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-batch-put-attributes-request batch-put-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/batch-put-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchPutAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"DuplicateItemName" :portkey.aws.sdb/duplicate-item-name, "NumberSubmittedAttributesExceeded" :portkey.aws.sdb/number-submitted-attributes-exceeded, "InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "NumberDomainBytesExceeded" :portkey.aws.sdb/number-domain-bytes-exceeded, "NumberDomainAttributesExceeded" :portkey.aws.sdb/number-domain-attributes-exceeded, "NoSuchDomain" :portkey.aws.sdb/no-such-domain, "NumberSubmittedItemsExceeded" :portkey.aws.sdb/number-submitted-items-exceeded, "NumberItemAttributesExceeded" :portkey.aws.sdb/number-item-attributes-exceeded, "MissingParameter" :portkey.aws.sdb/missing-parameter}})))))
(clojure.spec.alpha/fdef batch-put-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb/batch-put-attributes-request) :ret clojure.core/true?)

(clojure.core/defn delete-domain ([delete-domain-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-domain-request delete-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/delete-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDomain", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"MissingParameter" :portkey.aws.sdb/missing-parameter}})))))
(clojure.spec.alpha/fdef delete-domain :args (clojure.spec.alpha/tuple :portkey.aws.sdb/delete-domain-request) :ret clojure.core/true?)

(clojure.core/defn select ([select-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-select-request select-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb/select-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/select-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SelectResult", :http.request.configuration/action "Select", :http.request.configuration/output-deser-fn response-select-result, :http.request.spec/error-spec {"InvalidQueryExpression" :portkey.aws.sdb/invalid-query-expression, "InvalidNumberPredicates" :portkey.aws.sdb/invalid-number-predicates, "InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "NoSuchDomain" :portkey.aws.sdb/no-such-domain, "InvalidNumberValueTests" :portkey.aws.sdb/invalid-number-value-tests, "TooManyRequestedAttributes" :portkey.aws.sdb/too-many-requested-attributes, "RequestTimeout" :portkey.aws.sdb/request-timeout, "MissingParameter" :portkey.aws.sdb/missing-parameter, "InvalidNextToken" :portkey.aws.sdb/invalid-next-token}})))))
(clojure.spec.alpha/fdef select :args (clojure.spec.alpha/tuple :portkey.aws.sdb/select-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb/select-result))
