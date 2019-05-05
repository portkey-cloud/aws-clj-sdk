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

(clojure.core/defn- deser-attribute [input] (clojure.core/let [letvar1683399 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "AlternateNameEncoding" (portkey.aws/search-for-tag input "AlternateNameEncoding" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil), "AlternateValueEncoding" (portkey.aws/search-for-tag input "AlternateValueEncoding" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-string (clojure.core/get-in letvar1683399 ["Name" :content])), :value (deser-string (clojure.core/get-in letvar1683399 ["Value" :content]))} (letvar1683399 "AlternateNameEncoding") (clojure.core/assoc :alternate-name-encoding (deser-string (clojure.core/get-in letvar1683399 ["AlternateNameEncoding" :content]))) (letvar1683399 "AlternateValueEncoding") (clojure.core/assoc :alternate-value-encoding (deser-string (clojure.core/get-in letvar1683399 ["AlternateValueEncoding" :content]))))))

(clojure.core/defn- deser-domain-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string (:content coll)))) input))

(clojure.core/defn- deser-integer [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-long [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-item [input] (clojure.core/let [letvar1683533 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "AlternateNameEncoding" (portkey.aws/search-for-tag input "AlternateNameEncoding" :flattened? nil :xmlAttribute? nil), "Attribute" (portkey.aws/search-for-tag input "Attribute" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-string (clojure.core/get-in letvar1683533 ["Name" :content])), :attributes (deser-attribute-list (clojure.core/get-in letvar1683533 ["Attribute"]))} (letvar1683533 "AlternateNameEncoding") (clojure.core/assoc :alternate-name-encoding (deser-string (clojure.core/get-in letvar1683533 ["AlternateNameEncoding" :content]))))))

(clojure.core/defn- deser-float [input] (java.lang.Float. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- response-invalid-query-expression ([input] (response-invalid-query-expression nil input)) ([resultWrapper1683537 input] (clojure.core/let [rawinput1683536 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683538 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683536 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683537)}] (clojure.core/cond-> {} (letvar1683538 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683538 ["BoxUsage" :content])))))))

(clojure.core/defn- response-duplicate-item-name ([input] (response-duplicate-item-name nil input)) ([resultWrapper1683540 input] (clojure.core/let [rawinput1683539 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683541 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683539 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683540)}] (clojure.core/cond-> {} (letvar1683541 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683541 ["BoxUsage" :content])))))))

(clojure.core/defn- response-invalid-number-predicates ([input] (response-invalid-number-predicates nil input)) ([resultWrapper1683543 input] (clojure.core/let [rawinput1683542 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683544 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683542 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683543)}] (clojure.core/cond-> {} (letvar1683544 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683544 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-submitted-attributes-exceeded ([input] (response-number-submitted-attributes-exceeded nil input)) ([resultWrapper1683546 input] (clojure.core/let [rawinput1683545 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683547 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683545 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683546)}] (clojure.core/cond-> {} (letvar1683547 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683547 ["BoxUsage" :content])))))))

(clojure.core/defn- response-select-result ([input] (response-select-result nil input)) ([resultWrapper1683549 input] (clojure.core/let [rawinput1683548 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683550 {"Item" (portkey.aws/search-for-tag rawinput1683548 "Item" :flattened? true :result-wrapper resultWrapper1683549), "NextToken" (portkey.aws/search-for-tag rawinput1683548 "NextToken" :flattened? nil :result-wrapper resultWrapper1683549)}] (clojure.core/cond-> {} (letvar1683550 "Item") (clojure.core/assoc :items (deser-item-list (clojure.core/get-in letvar1683550 ["Item"]))) (letvar1683550 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1683550 ["NextToken" :content])))))))

(clojure.core/defn- response-invalid-parameter-value ([input] (response-invalid-parameter-value nil input)) ([resultWrapper1683552 input] (clojure.core/let [rawinput1683551 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683553 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683551 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683552)}] (clojure.core/cond-> {} (letvar1683553 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683553 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-domain-bytes-exceeded ([input] (response-number-domain-bytes-exceeded nil input)) ([resultWrapper1683555 input] (clojure.core/let [rawinput1683554 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683556 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683554 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683555)}] (clojure.core/cond-> {} (letvar1683556 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683556 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-domain-attributes-exceeded ([input] (response-number-domain-attributes-exceeded nil input)) ([resultWrapper1683558 input] (clojure.core/let [rawinput1683557 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683559 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683557 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683558)}] (clojure.core/cond-> {} (letvar1683559 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683559 ["BoxUsage" :content])))))))

(clojure.core/defn- response-no-such-domain ([input] (response-no-such-domain nil input)) ([resultWrapper1683561 input] (clojure.core/let [rawinput1683560 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683562 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683560 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683561)}] (clojure.core/cond-> {} (letvar1683562 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683562 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-domains-exceeded ([input] (response-number-domains-exceeded nil input)) ([resultWrapper1683564 input] (clojure.core/let [rawinput1683563 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683565 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683563 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683564)}] (clojure.core/cond-> {} (letvar1683565 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683565 ["BoxUsage" :content])))))))

(clojure.core/defn- response-list-domains-result ([input] (response-list-domains-result nil input)) ([resultWrapper1683567 input] (clojure.core/let [rawinput1683566 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683568 {"DomainName" (portkey.aws/search-for-tag rawinput1683566 "DomainName" :flattened? true :result-wrapper resultWrapper1683567), "NextToken" (portkey.aws/search-for-tag rawinput1683566 "NextToken" :flattened? nil :result-wrapper resultWrapper1683567)}] (clojure.core/cond-> {} (letvar1683568 "DomainName") (clojure.core/assoc :domain-names (deser-domain-name-list (clojure.core/get-in letvar1683568 ["DomainName"]))) (letvar1683568 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1683568 ["NextToken" :content])))))))

(clojure.core/defn- response-attribute-does-not-exist ([input] (response-attribute-does-not-exist nil input)) ([resultWrapper1683570 input] (clojure.core/let [rawinput1683569 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683571 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683569 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683570)}] (clojure.core/cond-> {} (letvar1683571 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683571 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-submitted-items-exceeded ([input] (response-number-submitted-items-exceeded nil input)) ([resultWrapper1683573 input] (clojure.core/let [rawinput1683572 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683574 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683572 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683573)}] (clojure.core/cond-> {} (letvar1683574 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683574 ["BoxUsage" :content])))))))

(clojure.core/defn- response-invalid-number-value-tests ([input] (response-invalid-number-value-tests nil input)) ([resultWrapper1683576 input] (clojure.core/let [rawinput1683575 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683577 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683575 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683576)}] (clojure.core/cond-> {} (letvar1683577 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683577 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-item-attributes-exceeded ([input] (response-number-item-attributes-exceeded nil input)) ([resultWrapper1683579 input] (clojure.core/let [rawinput1683578 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683580 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683578 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683579)}] (clojure.core/cond-> {} (letvar1683580 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683580 ["BoxUsage" :content])))))))

(clojure.core/defn- response-domain-metadata-result ([input] (response-domain-metadata-result nil input)) ([resultWrapper1683582 input] (clojure.core/let [rawinput1683581 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683583 {"ItemCount" (portkey.aws/search-for-tag rawinput1683581 "ItemCount" :flattened? nil :result-wrapper resultWrapper1683582), "ItemNamesSizeBytes" (portkey.aws/search-for-tag rawinput1683581 "ItemNamesSizeBytes" :flattened? nil :result-wrapper resultWrapper1683582), "AttributeNameCount" (portkey.aws/search-for-tag rawinput1683581 "AttributeNameCount" :flattened? nil :result-wrapper resultWrapper1683582), "AttributeNamesSizeBytes" (portkey.aws/search-for-tag rawinput1683581 "AttributeNamesSizeBytes" :flattened? nil :result-wrapper resultWrapper1683582), "AttributeValueCount" (portkey.aws/search-for-tag rawinput1683581 "AttributeValueCount" :flattened? nil :result-wrapper resultWrapper1683582), "AttributeValuesSizeBytes" (portkey.aws/search-for-tag rawinput1683581 "AttributeValuesSizeBytes" :flattened? nil :result-wrapper resultWrapper1683582), "Timestamp" (portkey.aws/search-for-tag rawinput1683581 "Timestamp" :flattened? nil :result-wrapper resultWrapper1683582)}] (clojure.core/cond-> {} (letvar1683583 "ItemCount") (clojure.core/assoc :item-count (deser-integer (clojure.core/get-in letvar1683583 ["ItemCount" :content]))) (letvar1683583 "ItemNamesSizeBytes") (clojure.core/assoc :item-names-size-bytes (deser-long (clojure.core/get-in letvar1683583 ["ItemNamesSizeBytes" :content]))) (letvar1683583 "AttributeNameCount") (clojure.core/assoc :attribute-name-count (deser-integer (clojure.core/get-in letvar1683583 ["AttributeNameCount" :content]))) (letvar1683583 "AttributeNamesSizeBytes") (clojure.core/assoc :attribute-names-size-bytes (deser-long (clojure.core/get-in letvar1683583 ["AttributeNamesSizeBytes" :content]))) (letvar1683583 "AttributeValueCount") (clojure.core/assoc :attribute-value-count (deser-integer (clojure.core/get-in letvar1683583 ["AttributeValueCount" :content]))) (letvar1683583 "AttributeValuesSizeBytes") (clojure.core/assoc :attribute-values-size-bytes (deser-long (clojure.core/get-in letvar1683583 ["AttributeValuesSizeBytes" :content]))) (letvar1683583 "Timestamp") (clojure.core/assoc :timestamp (deser-integer (clojure.core/get-in letvar1683583 ["Timestamp" :content])))))))

(clojure.core/defn- response-get-attributes-result ([input] (response-get-attributes-result nil input)) ([resultWrapper1683585 input] (clojure.core/let [rawinput1683584 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683586 {"Attribute" (portkey.aws/search-for-tag rawinput1683584 "Attribute" :flattened? true :result-wrapper resultWrapper1683585)}] (clojure.core/cond-> {} (letvar1683586 "Attribute") (clojure.core/assoc :attributes (deser-attribute-list (clojure.core/get-in letvar1683586 ["Attribute"])))))))

(clojure.core/defn- response-too-many-requested-attributes ([input] (response-too-many-requested-attributes nil input)) ([resultWrapper1683588 input] (clojure.core/let [rawinput1683587 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683589 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683587 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683588)}] (clojure.core/cond-> {} (letvar1683589 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683589 ["BoxUsage" :content])))))))

(clojure.core/defn- response-request-timeout ([input] (response-request-timeout nil input)) ([resultWrapper1683591 input] (clojure.core/let [rawinput1683590 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683592 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683590 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683591)}] (clojure.core/cond-> {} (letvar1683592 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683592 ["BoxUsage" :content])))))))

(clojure.core/defn- response-missing-parameter ([input] (response-missing-parameter nil input)) ([resultWrapper1683594 input] (clojure.core/let [rawinput1683593 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683595 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683593 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683594)}] (clojure.core/cond-> {} (letvar1683595 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683595 ["BoxUsage" :content])))))))

(clojure.core/defn- response-invalid-next-token ([input] (response-invalid-next-token nil input)) ([resultWrapper1683597 input] (clojure.core/let [rawinput1683596 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar1683598 {"BoxUsage" (portkey.aws/search-for-tag rawinput1683596 "BoxUsage" :flattened? nil :result-wrapper resultWrapper1683597)}] (clojure.core/cond-> {} (letvar1683598 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar1683598 ["BoxUsage" :content])))))))

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

(clojure.core/defn list-domains " The ListDomains operation lists all domains associated with the Access Key ID.\nIt returns domain names up to the limit set by MaxNumberOfDomains. A NextToken\nis returned if there are more than MaxNumberOfDomains domains. Calling\nListDomains successive times with the NextToken provided by the operation\nreturns up to MaxNumberOfDomains more domain names with each successive\noperation call." ([] (list-domains {})) ([list-domains-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-domains-request list-domains-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb/list-domains-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/list-domains-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListDomainsResult", :http.request.configuration/action "ListDomains", :http.request.configuration/output-deser-fn response-list-domains-result, :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "InvalidNextToken" :portkey.aws.sdb/invalid-next-token}})))))
(clojure.spec.alpha/fdef list-domains :args (clojure.spec.alpha/? :portkey.aws.sdb/list-domains-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb/list-domains-result))

(clojure.core/defn get-attributes " Returns all of the attributes associated with the specified item. Optionally,\nthe attributes returned can be limited to one or more attributes by specifying\nan attribute name parameter.\n If the item does not exist on the replica that was accessed for this operation,\nan empty set is returned. The system does not return an error as it cannot\nguarantee the item does not exist on other replicas." ([get-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-attributes-request get-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb/get-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/get-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetAttributesResult", :http.request.configuration/action "GetAttributes", :http.request.configuration/output-deser-fn response-get-attributes-result, :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb/missing-parameter, "NoSuchDomain" :portkey.aws.sdb/no-such-domain}})))))
(clojure.spec.alpha/fdef get-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb/get-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb/get-attributes-result))

(clojure.core/defn batch-delete-attributes " Performs multiple DeleteAttributes operations in a single call, which reduces\nround trips and latencies. This enables Amazon SimpleDB to optimize requests,\nwhich generally yields better throughput.\n The following limitations are enforced for this operation:\n *1 MB request size\n *25 item limit per BatchDeleteAttributes operation" ([batch-delete-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-delete-attributes-request batch-delete-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/batch-delete-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDeleteAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef batch-delete-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb/batch-delete-attributes-request) :ret clojure.core/true?)

(clojure.core/defn domain-metadata " Returns information about the domain, including when the domain was created,\nthe number of items and attributes in the domain, and the size of the attribute\nnames and values." ([domain-metadata-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-domain-metadata-request domain-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb/domain-metadata-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/domain-metadata-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DomainMetadataResult", :http.request.configuration/action "DomainMetadata", :http.request.configuration/output-deser-fn response-domain-metadata-result, :http.request.spec/error-spec {"MissingParameter" :portkey.aws.sdb/missing-parameter, "NoSuchDomain" :portkey.aws.sdb/no-such-domain}})))))
(clojure.spec.alpha/fdef domain-metadata :args (clojure.spec.alpha/tuple :portkey.aws.sdb/domain-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb/domain-metadata-result))

(clojure.core/defn delete-attributes " Deletes one or more attributes associated with an item. If all attributes of\nthe item are deleted, the item is deleted.\n DeleteAttributes is an idempotent operation; running it multiple times on the\nsame item or attribute does not result in an error response.\n Because Amazon SimpleDB makes multiple copies of item data and uses an eventual\nconsistency update model, performing a GetAttributes or Select operation (read)\nimmediately after a DeleteAttributes or PutAttributes operation (write) might\nnot return updated item data." ([delete-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-attributes-request delete-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/delete-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb/missing-parameter, "NoSuchDomain" :portkey.aws.sdb/no-such-domain, "AttributeDoesNotExist" :portkey.aws.sdb/attribute-does-not-exist}})))))
(clojure.spec.alpha/fdef delete-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb/delete-attributes-request) :ret clojure.core/true?)

(clojure.core/defn put-attributes " The PutAttributes operation creates or replaces attributes in an item. The\nclient may specify new attributes using a combination of the Attribute.X.Name\nand Attribute.X.Value parameters. The client specifies the first attribute by\nthe parameters Attribute.0.Name and Attribute.0.Value, the second attribute by\nthe parameters Attribute.1.Name and Attribute.1.Value, and so on.\n Attributes are uniquely identified in an item by their name/value combination.\nFor example, a single item can have the attributes { \"first_name\", \"first_value\"\n} and { \"first_name\", second_value\" }. However, it cannot have two attribute\ninstances where both the Attribute.X.Name and Attribute.X.Value are the same.\n Optionally, the requestor can supply the Replace parameter for each individual\nattribute. Setting this value to true causes the new attribute value to replace\nthe existing attribute value(s). For example, if an item has the attributes {\n'a', '1' }, { 'b', '2'} and { 'b', '3' } and the requestor calls PutAttributes\nusing the attributes { 'b', '4' } with the Replace parameter set to true, the\nfinal attributes of the item are changed to { 'a', '1' } and { 'b', '4' }, which\nreplaces the previous values of the 'b' attribute with the new value.\n You cannot specify an empty string as an attribute name.\n Because Amazon SimpleDB makes multiple copies of client data and uses an\neventual consistency update model, an immediate GetAttributes or Select\noperation (read) immediately after a PutAttributes or DeleteAttributes operation\n(write) might not return the updated data.\n The following limitations are enforced for this operation:\n *256 total attribute name-value pairs per item\n *One billion attributes per domain\n *10 GB of total user data storage per domain" ([put-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-put-attributes-request put-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/put-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb/missing-parameter, "NoSuchDomain" :portkey.aws.sdb/no-such-domain, "NumberDomainAttributesExceeded" :portkey.aws.sdb/number-domain-attributes-exceeded, "NumberDomainBytesExceeded" :portkey.aws.sdb/number-domain-bytes-exceeded, "NumberItemAttributesExceeded" :portkey.aws.sdb/number-item-attributes-exceeded, "AttributeDoesNotExist" :portkey.aws.sdb/attribute-does-not-exist}})))))
(clojure.spec.alpha/fdef put-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb/put-attributes-request) :ret clojure.core/true?)

(clojure.core/defn create-domain " The CreateDomain operation creates a new domain. The domain name should be\nunique among the domains associated with the Access Key ID provided in the\nrequest. The CreateDomain operation may take 10 or more seconds to complete.\n The client can create up to 100 domains per account.\n If the client requires additional domains, go to\nhttp://aws.amazon.com/contact-us/simpledb-limit-request/\n(http://aws.amazon.com/contact-us/simpledb-limit-request/)." ([create-domain-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-domain-request create-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/create-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDomain", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb/missing-parameter, "NumberDomainsExceeded" :portkey.aws.sdb/number-domains-exceeded}})))))
(clojure.spec.alpha/fdef create-domain :args (clojure.spec.alpha/tuple :portkey.aws.sdb/create-domain-request) :ret clojure.core/true?)

(clojure.core/defn batch-put-attributes " The BatchPutAttributes operation creates or replaces attributes within one or\nmore items. By using this operation, the client can perform multiple\nPutAttribute operation with a single call. This helps yield savings in round\ntrips and latencies, enabling Amazon SimpleDB to optimize requests and generally\nproduce better throughput.\n The client may specify the item name with the Item.X.ItemName parameter. The\nclient may specify new attributes using a combination of the\nItem.X.Attribute.Y.Name and Item.X.Attribute.Y.Value parameters. The client may\nspecify the first attribute for the first item using the parameters\nItem.0.Attribute.0.Name and Item.0.Attribute.0.Value, and for the second\nattribute for the first item by the parameters Item.0.Attribute.1.Name and\nItem.0.Attribute.1.Value, and so on.\n Attributes are uniquely identified within an item by their name/value\ncombination. For example, a single item can have the attributes { \"first_name\",\n\"first_value\" } and { \"first_name\", \"second_value\" }. However, it cannot have\ntwo attribute instances where both the Item.X.Attribute.Y.Name and\nItem.X.Attribute.Y.Value are the same.\n Optionally, the requester can supply the Replace parameter for each individual\nvalue. Setting this value to true will cause the new attribute values to replace\nthe existing attribute values. For example, if an item I has the attributes {\n'a', '1' }, { 'b', '2'} and { 'b', '3' } and the requester does a\nBatchPutAttributes of {'I', 'b', '4' } with the Replace parameter set to true,\nthe final attributes of the item will be { 'a', '1' } and { 'b', '4' },\nreplacing the previous values of the 'b' attribute with the new value.\n This operation is vulnerable to exceeding the maximum URL size when making a\nREST request using the HTTP GET method. This operation does not support\nconditions using Expected.X.Name, Expected.X.Value, or Expected.X.Exists. You\ncan execute multiple BatchPutAttributes operations and other operations in\nparallel. However, large numbers of concurrent BatchPutAttributes calls can\nresult in Service Unavailable (503) responses.\n The following limitations are enforced for this operation:\n *256 attribute name-value pairs per item\n *1 MB request size\n *1 billion attributes per domain\n *10 GB of total user data storage per domain\n *25 item limit per BatchPutAttributes operation" ([batch-put-attributes-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-batch-put-attributes-request batch-put-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/batch-put-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchPutAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"DuplicateItemName" :portkey.aws.sdb/duplicate-item-name, "NumberSubmittedAttributesExceeded" :portkey.aws.sdb/number-submitted-attributes-exceeded, "InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "NumberDomainBytesExceeded" :portkey.aws.sdb/number-domain-bytes-exceeded, "NumberDomainAttributesExceeded" :portkey.aws.sdb/number-domain-attributes-exceeded, "NoSuchDomain" :portkey.aws.sdb/no-such-domain, "NumberSubmittedItemsExceeded" :portkey.aws.sdb/number-submitted-items-exceeded, "NumberItemAttributesExceeded" :portkey.aws.sdb/number-item-attributes-exceeded, "MissingParameter" :portkey.aws.sdb/missing-parameter}})))))
(clojure.spec.alpha/fdef batch-put-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb/batch-put-attributes-request) :ret clojure.core/true?)

(clojure.core/defn delete-domain " The DeleteDomain operation deletes a domain. Any items (and their attributes)\nin the domain are deleted as well. The DeleteDomain operation might take 10 or\nmore seconds to complete." ([delete-domain-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-domain-request delete-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/delete-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDomain", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"MissingParameter" :portkey.aws.sdb/missing-parameter}})))))
(clojure.spec.alpha/fdef delete-domain :args (clojure.spec.alpha/tuple :portkey.aws.sdb/delete-domain-request) :ret clojure.core/true?)

(clojure.core/defn select " The Select operation returns a set of attributes for ItemNames that match the\nselect expression. Select is similar to the standard SQL SELECT statement.\n The total size of the response cannot exceed 1 MB in total size. Amazon\nSimpleDB automatically adjusts the number of items returned per page to enforce\nthis limit. For example, if the client asks to retrieve 2500 items, but each\nindividual item is 10 kB in size, the system returns 100 items and an\nappropriate NextToken so the client can access the next page of results.\n For information on how to construct select expressions, see Using Select to\nCreate Amazon SimpleDB Queries in the Developer Guide." ([select-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-select-request select-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.sdb/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb/select-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb/select-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SelectResult", :http.request.configuration/action "Select", :http.request.configuration/output-deser-fn response-select-result, :http.request.spec/error-spec {"InvalidQueryExpression" :portkey.aws.sdb/invalid-query-expression, "InvalidNumberPredicates" :portkey.aws.sdb/invalid-number-predicates, "InvalidParameterValue" :portkey.aws.sdb/invalid-parameter-value, "NoSuchDomain" :portkey.aws.sdb/no-such-domain, "InvalidNumberValueTests" :portkey.aws.sdb/invalid-number-value-tests, "TooManyRequestedAttributes" :portkey.aws.sdb/too-many-requested-attributes, "RequestTimeout" :portkey.aws.sdb/request-timeout, "MissingParameter" :portkey.aws.sdb/missing-parameter, "InvalidNextToken" :portkey.aws.sdb/invalid-next-token}})))))
(clojure.spec.alpha/fdef select :args (clojure.spec.alpha/tuple :portkey.aws.sdb/select-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb/select-result))
