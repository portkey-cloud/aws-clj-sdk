(ns portkey.aws.sdb.-2009-04-15 (:require [portkey.aws]))

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

(clojure.core/defn- deser-attribute [input] (clojure.core/let [letvar524416 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "AlternateNameEncoding" (portkey.aws/search-for-tag input "AlternateNameEncoding" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil), "AlternateValueEncoding" (portkey.aws/search-for-tag input "AlternateValueEncoding" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-string (clojure.core/get-in letvar524416 ["Name" :content])), :value (deser-string (clojure.core/get-in letvar524416 ["Value" :content]))} (letvar524416 "AlternateNameEncoding") (clojure.core/assoc :alternate-name-encoding (deser-string (clojure.core/get-in letvar524416 ["AlternateNameEncoding" :content]))) (letvar524416 "AlternateValueEncoding") (clojure.core/assoc :alternate-value-encoding (deser-string (clojure.core/get-in letvar524416 ["AlternateValueEncoding" :content]))))))

(clojure.core/defn- deser-domain-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string (:content coll)))) input))

(clojure.core/defn- deser-integer [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-string [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-long [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-item [input] (clojure.core/let [letvar524550 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "AlternateNameEncoding" (portkey.aws/search-for-tag input "AlternateNameEncoding" :flattened? nil :xmlAttribute? nil), "Attribute" (portkey.aws/search-for-tag input "Attribute" :flattened? true :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deser-string (clojure.core/get-in letvar524550 ["Name" :content])), :attributes (deser-attribute-list (clojure.core/get-in letvar524550 ["Attribute"]))} (letvar524550 "AlternateNameEncoding") (clojure.core/assoc :alternate-name-encoding (deser-string (clojure.core/get-in letvar524550 ["AlternateNameEncoding" :content]))))))

(clojure.core/defn- deser-float [input] (java.lang.Float. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- response-invalid-query-expression ([input] (response-invalid-query-expression nil input)) ([resultWrapper524554 input] (clojure.core/let [rawinput524553 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524555 {"BoxUsage" (portkey.aws/search-for-tag rawinput524553 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524554)}] (clojure.core/cond-> {} (letvar524555 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524555 ["BoxUsage" :content])))))))

(clojure.core/defn- response-duplicate-item-name ([input] (response-duplicate-item-name nil input)) ([resultWrapper524557 input] (clojure.core/let [rawinput524556 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524558 {"BoxUsage" (portkey.aws/search-for-tag rawinput524556 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524557)}] (clojure.core/cond-> {} (letvar524558 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524558 ["BoxUsage" :content])))))))

(clojure.core/defn- response-invalid-number-predicates ([input] (response-invalid-number-predicates nil input)) ([resultWrapper524560 input] (clojure.core/let [rawinput524559 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524561 {"BoxUsage" (portkey.aws/search-for-tag rawinput524559 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524560)}] (clojure.core/cond-> {} (letvar524561 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524561 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-submitted-attributes-exceeded ([input] (response-number-submitted-attributes-exceeded nil input)) ([resultWrapper524563 input] (clojure.core/let [rawinput524562 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524564 {"BoxUsage" (portkey.aws/search-for-tag rawinput524562 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524563)}] (clojure.core/cond-> {} (letvar524564 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524564 ["BoxUsage" :content])))))))

(clojure.core/defn- response-select-result ([input] (response-select-result nil input)) ([resultWrapper524566 input] (clojure.core/let [rawinput524565 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524567 {"Item" (portkey.aws/search-for-tag rawinput524565 "Item" :flattened? true :result-wrapper resultWrapper524566), "NextToken" (portkey.aws/search-for-tag rawinput524565 "NextToken" :flattened? nil :result-wrapper resultWrapper524566)}] (clojure.core/cond-> {} (letvar524567 "Item") (clojure.core/assoc :items (deser-item-list (clojure.core/get-in letvar524567 ["Item"]))) (letvar524567 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar524567 ["NextToken" :content])))))))

(clojure.core/defn- response-invalid-parameter-value ([input] (response-invalid-parameter-value nil input)) ([resultWrapper524569 input] (clojure.core/let [rawinput524568 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524570 {"BoxUsage" (portkey.aws/search-for-tag rawinput524568 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524569)}] (clojure.core/cond-> {} (letvar524570 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524570 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-domain-bytes-exceeded ([input] (response-number-domain-bytes-exceeded nil input)) ([resultWrapper524572 input] (clojure.core/let [rawinput524571 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524573 {"BoxUsage" (portkey.aws/search-for-tag rawinput524571 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524572)}] (clojure.core/cond-> {} (letvar524573 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524573 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-domain-attributes-exceeded ([input] (response-number-domain-attributes-exceeded nil input)) ([resultWrapper524575 input] (clojure.core/let [rawinput524574 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524576 {"BoxUsage" (portkey.aws/search-for-tag rawinput524574 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524575)}] (clojure.core/cond-> {} (letvar524576 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524576 ["BoxUsage" :content])))))))

(clojure.core/defn- response-no-such-domain ([input] (response-no-such-domain nil input)) ([resultWrapper524578 input] (clojure.core/let [rawinput524577 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524579 {"BoxUsage" (portkey.aws/search-for-tag rawinput524577 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524578)}] (clojure.core/cond-> {} (letvar524579 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524579 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-domains-exceeded ([input] (response-number-domains-exceeded nil input)) ([resultWrapper524581 input] (clojure.core/let [rawinput524580 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524582 {"BoxUsage" (portkey.aws/search-for-tag rawinput524580 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524581)}] (clojure.core/cond-> {} (letvar524582 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524582 ["BoxUsage" :content])))))))

(clojure.core/defn- response-list-domains-result ([input] (response-list-domains-result nil input)) ([resultWrapper524584 input] (clojure.core/let [rawinput524583 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524585 {"DomainName" (portkey.aws/search-for-tag rawinput524583 "DomainName" :flattened? true :result-wrapper resultWrapper524584), "NextToken" (portkey.aws/search-for-tag rawinput524583 "NextToken" :flattened? nil :result-wrapper resultWrapper524584)}] (clojure.core/cond-> {} (letvar524585 "DomainName") (clojure.core/assoc :domain-names (deser-domain-name-list (clojure.core/get-in letvar524585 ["DomainName"]))) (letvar524585 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar524585 ["NextToken" :content])))))))

(clojure.core/defn- response-attribute-does-not-exist ([input] (response-attribute-does-not-exist nil input)) ([resultWrapper524587 input] (clojure.core/let [rawinput524586 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524588 {"BoxUsage" (portkey.aws/search-for-tag rawinput524586 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524587)}] (clojure.core/cond-> {} (letvar524588 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524588 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-submitted-items-exceeded ([input] (response-number-submitted-items-exceeded nil input)) ([resultWrapper524590 input] (clojure.core/let [rawinput524589 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524591 {"BoxUsage" (portkey.aws/search-for-tag rawinput524589 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524590)}] (clojure.core/cond-> {} (letvar524591 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524591 ["BoxUsage" :content])))))))

(clojure.core/defn- response-invalid-number-value-tests ([input] (response-invalid-number-value-tests nil input)) ([resultWrapper524593 input] (clojure.core/let [rawinput524592 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524594 {"BoxUsage" (portkey.aws/search-for-tag rawinput524592 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524593)}] (clojure.core/cond-> {} (letvar524594 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524594 ["BoxUsage" :content])))))))

(clojure.core/defn- response-number-item-attributes-exceeded ([input] (response-number-item-attributes-exceeded nil input)) ([resultWrapper524596 input] (clojure.core/let [rawinput524595 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524597 {"BoxUsage" (portkey.aws/search-for-tag rawinput524595 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524596)}] (clojure.core/cond-> {} (letvar524597 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524597 ["BoxUsage" :content])))))))

(clojure.core/defn- response-domain-metadata-result ([input] (response-domain-metadata-result nil input)) ([resultWrapper524599 input] (clojure.core/let [rawinput524598 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524600 {"ItemCount" (portkey.aws/search-for-tag rawinput524598 "ItemCount" :flattened? nil :result-wrapper resultWrapper524599), "ItemNamesSizeBytes" (portkey.aws/search-for-tag rawinput524598 "ItemNamesSizeBytes" :flattened? nil :result-wrapper resultWrapper524599), "AttributeNameCount" (portkey.aws/search-for-tag rawinput524598 "AttributeNameCount" :flattened? nil :result-wrapper resultWrapper524599), "AttributeNamesSizeBytes" (portkey.aws/search-for-tag rawinput524598 "AttributeNamesSizeBytes" :flattened? nil :result-wrapper resultWrapper524599), "AttributeValueCount" (portkey.aws/search-for-tag rawinput524598 "AttributeValueCount" :flattened? nil :result-wrapper resultWrapper524599), "AttributeValuesSizeBytes" (portkey.aws/search-for-tag rawinput524598 "AttributeValuesSizeBytes" :flattened? nil :result-wrapper resultWrapper524599), "Timestamp" (portkey.aws/search-for-tag rawinput524598 "Timestamp" :flattened? nil :result-wrapper resultWrapper524599)}] (clojure.core/cond-> {} (letvar524600 "ItemCount") (clojure.core/assoc :item-count (deser-integer (clojure.core/get-in letvar524600 ["ItemCount" :content]))) (letvar524600 "ItemNamesSizeBytes") (clojure.core/assoc :item-names-size-bytes (deser-long (clojure.core/get-in letvar524600 ["ItemNamesSizeBytes" :content]))) (letvar524600 "AttributeNameCount") (clojure.core/assoc :attribute-name-count (deser-integer (clojure.core/get-in letvar524600 ["AttributeNameCount" :content]))) (letvar524600 "AttributeNamesSizeBytes") (clojure.core/assoc :attribute-names-size-bytes (deser-long (clojure.core/get-in letvar524600 ["AttributeNamesSizeBytes" :content]))) (letvar524600 "AttributeValueCount") (clojure.core/assoc :attribute-value-count (deser-integer (clojure.core/get-in letvar524600 ["AttributeValueCount" :content]))) (letvar524600 "AttributeValuesSizeBytes") (clojure.core/assoc :attribute-values-size-bytes (deser-long (clojure.core/get-in letvar524600 ["AttributeValuesSizeBytes" :content]))) (letvar524600 "Timestamp") (clojure.core/assoc :timestamp (deser-integer (clojure.core/get-in letvar524600 ["Timestamp" :content])))))))

(clojure.core/defn- response-get-attributes-result ([input] (response-get-attributes-result nil input)) ([resultWrapper524602 input] (clojure.core/let [rawinput524601 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524603 {"Attribute" (portkey.aws/search-for-tag rawinput524601 "Attribute" :flattened? true :result-wrapper resultWrapper524602)}] (clojure.core/cond-> {} (letvar524603 "Attribute") (clojure.core/assoc :attributes (deser-attribute-list (clojure.core/get-in letvar524603 ["Attribute"])))))))

(clojure.core/defn- response-too-many-requested-attributes ([input] (response-too-many-requested-attributes nil input)) ([resultWrapper524605 input] (clojure.core/let [rawinput524604 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524606 {"BoxUsage" (portkey.aws/search-for-tag rawinput524604 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524605)}] (clojure.core/cond-> {} (letvar524606 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524606 ["BoxUsage" :content])))))))

(clojure.core/defn- response-request-timeout ([input] (response-request-timeout nil input)) ([resultWrapper524608 input] (clojure.core/let [rawinput524607 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524609 {"BoxUsage" (portkey.aws/search-for-tag rawinput524607 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524608)}] (clojure.core/cond-> {} (letvar524609 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524609 ["BoxUsage" :content])))))))

(clojure.core/defn- response-missing-parameter ([input] (response-missing-parameter nil input)) ([resultWrapper524611 input] (clojure.core/let [rawinput524610 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524612 {"BoxUsage" (portkey.aws/search-for-tag rawinput524610 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524611)}] (clojure.core/cond-> {} (letvar524612 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524612 ["BoxUsage" :content])))))))

(clojure.core/defn- response-invalid-next-token ([input] (response-invalid-next-token nil input)) ([resultWrapper524614 input] (clojure.core/let [rawinput524613 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar524615 {"BoxUsage" (portkey.aws/search-for-tag rawinput524613 "BoxUsage" :flattened? nil :result-wrapper resultWrapper524614)}] (clojure.core/cond-> {} (letvar524615 "BoxUsage") (clojure.core/assoc :box-usage (deser-float (clojure.core/get-in letvar524615 ["BoxUsage" :content])))))))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.invalid-query-expression/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/invalid-query-expression (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.invalid-query-expression/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.delete-attributes-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.delete-attributes-request/item-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.delete-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.delete-attributes-request/expected (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/update-condition))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/delete-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.delete-attributes-request/domain-name :portkey.aws.sdb.-2009-04-15.delete-attributes-request/item-name] :opt-un [:portkey.aws.sdb.-2009-04-15.delete-attributes-request/attributes :portkey.aws.sdb.-2009-04-15.delete-attributes-request/expected]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/attribute-list (clojure.spec.alpha/coll-of :portkey.aws.sdb.-2009-04-15/attribute))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.duplicate-item-name/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/duplicate-item-name (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.duplicate-item-name/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.invalid-number-predicates/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/invalid-number-predicates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.invalid-number-predicates/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/deletable-item-list (clojure.spec.alpha/coll-of :portkey.aws.sdb.-2009-04-15/deletable-item))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.deletable-item/name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.deletable-item/attributes (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/deletable-item (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.deletable-item/name] :opt-un [:portkey.aws.sdb.-2009-04-15.deletable-item/attributes]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.number-submitted-attributes-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/number-submitted-attributes-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.number-submitted-attributes-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.select-result/items (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/item-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.select-result/next-token (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/select-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.select-result/items :portkey.aws.sdb.-2009-04-15.select-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.replaceable-item/name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.replaceable-item/attributes (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/replaceable-attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/replaceable-item (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.replaceable-item/name :portkey.aws.sdb.-2009-04-15.replaceable-item/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.domain-metadata-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/domain-metadata-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.domain-metadata-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.invalid-parameter-value/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/invalid-parameter-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.invalid-parameter-value/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.batch-put-attributes-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.batch-put-attributes-request/items (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/replaceable-item-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/batch-put-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.batch-put-attributes-request/domain-name :portkey.aws.sdb.-2009-04-15.batch-put-attributes-request/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.put-attributes-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.put-attributes-request/item-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.put-attributes-request/attributes (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/replaceable-attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.put-attributes-request/expected (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/update-condition))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/put-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.put-attributes-request/domain-name :portkey.aws.sdb.-2009-04-15.put-attributes-request/item-name :portkey.aws.sdb.-2009-04-15.put-attributes-request/attributes] :opt-un [:portkey.aws.sdb.-2009-04-15.put-attributes-request/expected]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.create-domain-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/create-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.create-domain-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.number-domain-bytes-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/number-domain-bytes-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.number-domain-bytes-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.number-domain-attributes-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/number-domain-attributes-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.number-domain-attributes-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/item-list (clojure.spec.alpha/coll-of :portkey.aws.sdb.-2009-04-15/item))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.batch-delete-attributes-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.batch-delete-attributes-request/items (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/deletable-item-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/batch-delete-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.batch-delete-attributes-request/domain-name :portkey.aws.sdb.-2009-04-15.batch-delete-attributes-request/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.attribute/name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.attribute/alternate-name-encoding (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.attribute/value (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.attribute/alternate-value-encoding (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.attribute/name :portkey.aws.sdb.-2009-04-15.attribute/value] :opt-un [:portkey.aws.sdb.-2009-04-15.attribute/alternate-name-encoding :portkey.aws.sdb.-2009-04-15.attribute/alternate-value-encoding]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/replaceable-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.sdb.-2009-04-15/replaceable-attribute))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/domain-name-list (clojure.spec.alpha/coll-of :portkey.aws.sdb.-2009-04-15/string))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.update-condition/name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.update-condition/value (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.update-condition/exists (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/boolean))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/update-condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.update-condition/name :portkey.aws.sdb.-2009-04-15.update-condition/value :portkey.aws.sdb.-2009-04-15.update-condition/exists]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.delete-domain-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/delete-domain-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.delete-domain-request/domain-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.no-such-domain/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/no-such-domain (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.no-such-domain/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.list-domains-request/max-number-of-domains (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/integer))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.list-domains-request/next-token (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/list-domains-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.list-domains-request/max-number-of-domains :portkey.aws.sdb.-2009-04-15.list-domains-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.number-domains-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/number-domains-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.number-domains-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.list-domains-result/domain-names (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/domain-name-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.list-domains-result/next-token (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/list-domains-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.list-domains-result/domain-names :portkey.aws.sdb.-2009-04-15.list-domains-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.sdb.-2009-04-15/string))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.replaceable-attribute/name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.replaceable-attribute/value (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.replaceable-attribute/replace (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/boolean))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/replaceable-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.replaceable-attribute/name :portkey.aws.sdb.-2009-04-15.replaceable-attribute/value] :opt-un [:portkey.aws.sdb.-2009-04-15.replaceable-attribute/replace]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.get-attributes-request/domain-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.get-attributes-request/item-name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.get-attributes-request/attribute-names (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.get-attributes-request/consistent-read (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/boolean))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/get-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.get-attributes-request/domain-name :portkey.aws.sdb.-2009-04-15.get-attributes-request/item-name] :opt-un [:portkey.aws.sdb.-2009-04-15.get-attributes-request/attribute-names :portkey.aws.sdb.-2009-04-15.get-attributes-request/consistent-read]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/replaceable-item-list (clojure.spec.alpha/coll-of :portkey.aws.sdb.-2009-04-15/replaceable-item))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.select-request/select-expression (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.select-request/next-token (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.select-request/consistent-read (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/boolean))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/select-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.select-request/select-expression] :opt-un [:portkey.aws.sdb.-2009-04-15.select-request/next-token :portkey.aws.sdb.-2009-04-15.select-request/consistent-read]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.attribute-does-not-exist/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/attribute-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.attribute-does-not-exist/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.number-submitted-items-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/number-submitted-items-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.number-submitted-items-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.invalid-number-value-tests/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/invalid-number-value-tests (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.invalid-number-value-tests/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.number-item-attributes-exceeded/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/number-item-attributes-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.number-item-attributes-exceeded/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.domain-metadata-result/item-count (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/integer))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.domain-metadata-result/item-names-size-bytes (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/long))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.domain-metadata-result/attribute-name-count (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/integer))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.domain-metadata-result/attribute-names-size-bytes (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/long))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.domain-metadata-result/attribute-value-count (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/integer))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.domain-metadata-result/attribute-values-size-bytes (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/long))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.domain-metadata-result/timestamp (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/integer))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/domain-metadata-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.domain-metadata-result/item-count :portkey.aws.sdb.-2009-04-15.domain-metadata-result/item-names-size-bytes :portkey.aws.sdb.-2009-04-15.domain-metadata-result/attribute-name-count :portkey.aws.sdb.-2009-04-15.domain-metadata-result/attribute-names-size-bytes :portkey.aws.sdb.-2009-04-15.domain-metadata-result/attribute-value-count :portkey.aws.sdb.-2009-04-15.domain-metadata-result/attribute-values-size-bytes :portkey.aws.sdb.-2009-04-15.domain-metadata-result/timestamp]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.get-attributes-result/attributes (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/get-attributes-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.get-attributes-result/attributes]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.too-many-requested-attributes/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/too-many-requested-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.too-many-requested-attributes/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.request-timeout/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/request-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.request-timeout/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.item/name (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.item/alternate-name-encoding (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/string))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.item/attributes (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/attribute-list))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/item (clojure.spec.alpha/keys :req-un [:portkey.aws.sdb.-2009-04-15.item/name :portkey.aws.sdb.-2009-04-15.item/attributes] :opt-un [:portkey.aws.sdb.-2009-04-15.item/alternate-name-encoding]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.missing-parameter/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/missing-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.missing-parameter/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15.invalid-next-token/box-usage (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/float))
(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/invalid-next-token (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sdb.-2009-04-15.invalid-next-token/box-usage]))

(clojure.spec.alpha/def :portkey.aws.sdb.-2009-04-15/boolean clojure.core/boolean?)

(clojure.core/defn list-domains ([] (list-domains {})) ([list-domains-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-list-domains-request list-domains-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb.-2009-04-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb.-2009-04-15/list-domains-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb.-2009-04-15/list-domains-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "ListDomainsResult", :http.request.configuration/action "ListDomains", :http.request.configuration/output-deser-fn response-list-domains-result, :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb.-2009-04-15/invalid-parameter-value, "InvalidNextToken" :portkey.aws.sdb.-2009-04-15/invalid-next-token}})))))
(clojure.spec.alpha/fdef list-domains :args (clojure.spec.alpha/? :portkey.aws.sdb.-2009-04-15/list-domains-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/list-domains-result))

(clojure.core/defn get-attributes ([get-attributes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-get-attributes-request get-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb.-2009-04-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb.-2009-04-15/get-attributes-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb.-2009-04-15/get-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "GetAttributesResult", :http.request.configuration/action "GetAttributes", :http.request.configuration/output-deser-fn response-get-attributes-result, :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb.-2009-04-15/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb.-2009-04-15/missing-parameter, "NoSuchDomain" :portkey.aws.sdb.-2009-04-15/no-such-domain}})))))
(clojure.spec.alpha/fdef get-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb.-2009-04-15/get-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/get-attributes-result))

(clojure.core/defn batch-delete-attributes ([batch-delete-attributes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-batch-delete-attributes-request batch-delete-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb.-2009-04-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb.-2009-04-15/batch-delete-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDeleteAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef batch-delete-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb.-2009-04-15/batch-delete-attributes-request) :ret clojure.core/true?)

(clojure.core/defn domain-metadata ([domain-metadata-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-domain-metadata-request domain-metadata-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb.-2009-04-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb.-2009-04-15/domain-metadata-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb.-2009-04-15/domain-metadata-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "DomainMetadataResult", :http.request.configuration/action "DomainMetadata", :http.request.configuration/output-deser-fn response-domain-metadata-result, :http.request.spec/error-spec {"MissingParameter" :portkey.aws.sdb.-2009-04-15/missing-parameter, "NoSuchDomain" :portkey.aws.sdb.-2009-04-15/no-such-domain}})))))
(clojure.spec.alpha/fdef domain-metadata :args (clojure.spec.alpha/tuple :portkey.aws.sdb.-2009-04-15/domain-metadata-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/domain-metadata-result))

(clojure.core/defn delete-attributes ([delete-attributes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-attributes-request delete-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb.-2009-04-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb.-2009-04-15/delete-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb.-2009-04-15/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb.-2009-04-15/missing-parameter, "NoSuchDomain" :portkey.aws.sdb.-2009-04-15/no-such-domain, "AttributeDoesNotExist" :portkey.aws.sdb.-2009-04-15/attribute-does-not-exist}})))))
(clojure.spec.alpha/fdef delete-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb.-2009-04-15/delete-attributes-request) :ret clojure.core/true?)

(clojure.core/defn put-attributes ([put-attributes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-put-attributes-request put-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb.-2009-04-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb.-2009-04-15/put-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb.-2009-04-15/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb.-2009-04-15/missing-parameter, "NoSuchDomain" :portkey.aws.sdb.-2009-04-15/no-such-domain, "NumberDomainAttributesExceeded" :portkey.aws.sdb.-2009-04-15/number-domain-attributes-exceeded, "NumberDomainBytesExceeded" :portkey.aws.sdb.-2009-04-15/number-domain-bytes-exceeded, "NumberItemAttributesExceeded" :portkey.aws.sdb.-2009-04-15/number-item-attributes-exceeded, "AttributeDoesNotExist" :portkey.aws.sdb.-2009-04-15/attribute-does-not-exist}})))))
(clojure.spec.alpha/fdef put-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb.-2009-04-15/put-attributes-request) :ret clojure.core/true?)

(clojure.core/defn create-domain ([create-domain-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-create-domain-request create-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb.-2009-04-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb.-2009-04-15/create-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDomain", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"InvalidParameterValue" :portkey.aws.sdb.-2009-04-15/invalid-parameter-value, "MissingParameter" :portkey.aws.sdb.-2009-04-15/missing-parameter, "NumberDomainsExceeded" :portkey.aws.sdb.-2009-04-15/number-domains-exceeded}})))))
(clojure.spec.alpha/fdef create-domain :args (clojure.spec.alpha/tuple :portkey.aws.sdb.-2009-04-15/create-domain-request) :ret clojure.core/true?)

(clojure.core/defn batch-put-attributes ([batch-put-attributes-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-batch-put-attributes-request batch-put-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb.-2009-04-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb.-2009-04-15/batch-put-attributes-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchPutAttributes", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"DuplicateItemName" :portkey.aws.sdb.-2009-04-15/duplicate-item-name, "NumberSubmittedAttributesExceeded" :portkey.aws.sdb.-2009-04-15/number-submitted-attributes-exceeded, "InvalidParameterValue" :portkey.aws.sdb.-2009-04-15/invalid-parameter-value, "NumberDomainBytesExceeded" :portkey.aws.sdb.-2009-04-15/number-domain-bytes-exceeded, "NumberDomainAttributesExceeded" :portkey.aws.sdb.-2009-04-15/number-domain-attributes-exceeded, "NoSuchDomain" :portkey.aws.sdb.-2009-04-15/no-such-domain, "NumberSubmittedItemsExceeded" :portkey.aws.sdb.-2009-04-15/number-submitted-items-exceeded, "NumberItemAttributesExceeded" :portkey.aws.sdb.-2009-04-15/number-item-attributes-exceeded, "MissingParameter" :portkey.aws.sdb.-2009-04-15/missing-parameter}})))))
(clojure.spec.alpha/fdef batch-put-attributes :args (clojure.spec.alpha/tuple :portkey.aws.sdb.-2009-04-15/batch-put-attributes-request) :ret clojure.core/true?)

(clojure.core/defn delete-domain ([delete-domain-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-delete-domain-request delete-domain-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb.-2009-04-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb.-2009-04-15/delete-domain-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDomain", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__284153__auto__] {}), :http.request.spec/error-spec {"MissingParameter" :portkey.aws.sdb.-2009-04-15/missing-parameter}})))))
(clojure.spec.alpha/fdef delete-domain :args (clojure.spec.alpha/tuple :portkey.aws.sdb.-2009-04-15/delete-domain-request) :ret clojure.core/true?)

(clojure.core/defn select ([select-requestinput] (clojure.core/let [request-function-result__284154__auto__ (req-select-request select-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__284154__auto__ {:http.request.configuration/endpoints portkey.aws.sdb.-2009-04-15/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.sdb.-2009-04-15/select-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2009-04-15", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.sdb.-2009-04-15/select-request, :http.request.configuration/protocol "query", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper "SelectResult", :http.request.configuration/action "Select", :http.request.configuration/output-deser-fn response-select-result, :http.request.spec/error-spec {"InvalidQueryExpression" :portkey.aws.sdb.-2009-04-15/invalid-query-expression, "InvalidNumberPredicates" :portkey.aws.sdb.-2009-04-15/invalid-number-predicates, "InvalidParameterValue" :portkey.aws.sdb.-2009-04-15/invalid-parameter-value, "NoSuchDomain" :portkey.aws.sdb.-2009-04-15/no-such-domain, "InvalidNumberValueTests" :portkey.aws.sdb.-2009-04-15/invalid-number-value-tests, "TooManyRequestedAttributes" :portkey.aws.sdb.-2009-04-15/too-many-requested-attributes, "RequestTimeout" :portkey.aws.sdb.-2009-04-15/request-timeout, "MissingParameter" :portkey.aws.sdb.-2009-04-15/missing-parameter, "InvalidNextToken" :portkey.aws.sdb.-2009-04-15/invalid-next-token}})))))
(clojure.spec.alpha/fdef select :args (clojure.spec.alpha/tuple :portkey.aws.sdb.-2009-04-15/select-request) :ret (clojure.spec.alpha/and :portkey.aws.sdb.-2009-04-15/select-result))
