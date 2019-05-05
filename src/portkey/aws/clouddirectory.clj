(ns portkey.aws.clouddirectory (:require [portkey.aws]))

(def
 endpoints
 '{"eu-west-1"
   {:credential-scope {:service "clouddirectory", :region "eu-west-1"},
    :ssl-common-name "clouddirectory.eu-west-1.amazonaws.com",
    :endpoint "https://clouddirectory.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "clouddirectory", :region "us-east-2"},
    :ssl-common-name "clouddirectory.us-east-2.amazonaws.com",
    :endpoint "https://clouddirectory.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "clouddirectory", :region "ap-southeast-2"},
    :ssl-common-name "clouddirectory.ap-southeast-2.amazonaws.com",
    :endpoint "https://clouddirectory.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "clouddirectory", :region "ap-southeast-1"},
    :ssl-common-name "clouddirectory.ap-southeast-1.amazonaws.com",
    :endpoint "https://clouddirectory.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "clouddirectory", :region "ca-central-1"},
    :ssl-common-name "clouddirectory.ca-central-1.amazonaws.com",
    :endpoint "https://clouddirectory.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "clouddirectory", :region "eu-central-1"},
    :ssl-common-name "clouddirectory.eu-central-1.amazonaws.com",
    :endpoint "https://clouddirectory.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "clouddirectory", :region "eu-west-2"},
    :ssl-common-name "clouddirectory.eu-west-2.amazonaws.com",
    :endpoint "https://clouddirectory.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "clouddirectory", :region "us-gov-west-1"},
    :ssl-common-name "clouddirectory.us-gov-west-1.amazonaws.com",
    :endpoint "https://clouddirectory.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "clouddirectory", :region "us-west-2"},
    :ssl-common-name "clouddirectory.us-west-2.amazonaws.com",
    :endpoint "https://clouddirectory.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "clouddirectory", :region "us-east-1"},
    :ssl-common-name "clouddirectory.us-east-1.amazonaws.com",
    :endpoint "https://clouddirectory.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-batch-get-object-attributes)

(clojure.core/declare ser-facet-name)

(clojure.core/declare ser-batch-list-index)

(clojure.core/declare ser-link-attribute-action)

(clojure.core/declare ser-schema-facet)

(clojure.core/declare ser-batch-update-link-attributes)

(clojure.core/declare ser-link-attribute-update-list)

(clojure.core/declare ser-batch-list-object-attributes)

(clojure.core/declare ser-facet-attribute)

(clojure.core/declare ser-object-attribute-update)

(clojure.core/declare ser-typed-attribute-value)

(clojure.core/declare ser-facet-attribute-definition)

(clojure.core/declare ser-facet-attribute-list)

(clojure.core/declare ser-datetime-attribute-value)

(clojure.core/declare ser-object-attribute-range)

(clojure.core/declare ser-batch-read-operation)

(clojure.core/declare ser-number-attribute-value)

(clojure.core/declare ser-object-attribute-action)

(clojure.core/declare ser-typed-link-attribute-range-list)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-required-attribute-behavior)

(clojure.core/declare ser-typed-attribute-value-range)

(clojure.core/declare ser-batch-add-facet-to-object)

(clojure.core/declare ser-typed-link-name)

(clojure.core/declare ser-batch-update-object-attributes)

(clojure.core/declare ser-batch-write-operation-list)

(clojure.core/declare ser-batch-list-object-policies)

(clojure.core/declare ser-batch-remove-facet-from-object)

(clojure.core/declare ser-batch-attach-typed-link)

(clojure.core/declare ser-batch-get-object-information)

(clojure.core/declare ser-typed-link-attribute-definition-list)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-update-action-type)

(clojure.core/declare ser-facet-attribute-type)

(clojure.core/declare ser-batch-list-object-children)

(clojure.core/declare ser-boolean-attribute-value)

(clojure.core/declare ser-batch-attach-policy)

(clojure.core/declare ser-schema-json-document)

(clojure.core/declare ser-attribute-key-list)

(clojure.core/declare ser-selector-object-reference)

(clojure.core/declare ser-rule-map)

(clojure.core/declare ser-batch-list-object-parent-paths)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-batch-list-outgoing-typed-links)

(clojure.core/declare ser-batch-list-incoming-typed-links)

(clojure.core/declare ser-attribute-key-and-value-list)

(clojure.core/declare ser-typed-link-attribute-range)

(clojure.core/declare ser-typed-link-specifier)

(clojure.core/declare ser-object-attribute-range-list)

(clojure.core/declare ser-typed-link-facet)

(clojure.core/declare ser-range-mode)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-binary-attribute-value)

(clojure.core/declare ser-batch-read-operation-list)

(clojure.core/declare ser-batch-get-link-attributes)

(clojure.core/declare ser-batch-detach-typed-link)

(clojure.core/declare ser-object-attribute-update-list)

(clojure.core/declare ser-attribute-name-and-value-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-facet-attribute-update-list)

(clojure.core/declare ser-attribute-name-and-value)

(clojure.core/declare ser-batch-list-policy-attachments)

(clojure.core/declare ser-object-reference)

(clojure.core/declare ser-attribute-key)

(clojure.core/declare ser-bool)

(clojure.core/declare ser-attribute-name-list)

(clojure.core/declare ser-batch-attach-to-index)

(clojure.core/declare ser-batch-reference-name)

(clojure.core/declare ser-batch-write-operation)

(clojure.core/declare ser-directory-arn)

(clojure.core/declare ser-rule-parameter-value)

(clojure.core/declare ser-batch-detach-from-index)

(clojure.core/declare ser-typed-link-facet-attribute-update)

(clojure.core/declare ser-facet-attribute-update)

(clojure.core/declare ser-typed-link-schema-and-facet-name)

(clojure.core/declare ser-rule)

(clojure.core/declare ser-batch-attach-object)

(clojure.core/declare ser-batch-delete-object)

(clojure.core/declare ser-rule-parameter-key)

(clojure.core/declare ser-batch-lookup-policy)

(clojure.core/declare ser-typed-link-facet-attribute-update-list)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-link-attribute-update)

(clojure.core/declare ser-batch-create-index)

(clojure.core/declare ser-link-name)

(clojure.core/declare ser-number-results)

(clojure.core/declare ser-tags-number-results)

(clojure.core/declare ser-batch-detach-policy)

(clojure.core/declare ser-directory-state)

(clojure.core/declare ser-rule-key)

(clojure.core/declare ser-object-type)

(clojure.core/declare ser-consistency-level)

(clojure.core/declare ser-directory-name)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-version)

(clojure.core/declare ser-batch-create-object)

(clojure.core/declare ser-facet-style)

(clojure.core/declare ser-batch-detach-object)

(clojure.core/declare ser-schema-name)

(clojure.core/declare ser-typed-link-attribute-definition)

(clojure.core/declare ser-string-attribute-value)

(clojure.core/declare ser-rule-parameter-map)

(clojure.core/declare ser-schema-facet-list)

(clojure.core/declare ser-attribute-key-and-value)

(clojure.core/declare ser-batch-list-attached-indices)

(clojure.core/declare ser-batch-list-object-parents)

(clojure.core/declare ser-facet-attribute-reference)

(clojure.core/declare ser-rule-type)

(clojure.core/defn- ser-batch-get-object-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"}) (clojure.core/into (ser-schema-facet (:schema-facet input)) #:http.request.field{:name "SchemaFacet", :shape "SchemaFacet"}) (clojure.core/into (ser-attribute-name-list (:attribute-names input)) #:http.request.field{:name "AttributeNames", :shape "AttributeNameList"})], :shape "BatchGetObjectAttributes", :type "structure"}))

(clojure.core/defn- ser-facet-name [input] #:http.request.field{:value input, :shape "FacetName"})

(clojure.core/defn- ser-batch-list-index [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:index-reference input)) #:http.request.field{:name "IndexReference", :shape "ObjectReference"})], :shape "BatchListIndex", :type "structure"} (clojure.core/contains? input :ranges-on-indexed-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-attribute-range-list (input :ranges-on-indexed-values)) #:http.request.field{:name "RangesOnIndexedValues", :shape "ObjectAttributeRangeList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"}))))

(clojure.core/defn- ser-link-attribute-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LinkAttributeAction", :type "structure"} (clojure.core/contains? input :attribute-action-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-action-type (input :attribute-action-type)) #:http.request.field{:name "AttributeActionType", :shape "UpdateActionType"})) (clojure.core/contains? input :attribute-update-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-attribute-value (input :attribute-update-value)) #:http.request.field{:name "AttributeUpdateValue", :shape "TypedAttributeValue"}))))

(clojure.core/defn- ser-schema-facet [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SchemaFacet", :type "structure"} (clojure.core/contains? input :schema-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn"})) (clojure.core/contains? input :facet-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-facet-name (input :facet-name)) #:http.request.field{:name "FacetName", :shape "FacetName"}))))

(clojure.core/defn- ser-batch-update-link-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-typed-link-specifier (:typed-link-specifier input)) #:http.request.field{:name "TypedLinkSpecifier", :shape "TypedLinkSpecifier"}) (clojure.core/into (ser-link-attribute-update-list (:attribute-updates input)) #:http.request.field{:name "AttributeUpdates", :shape "LinkAttributeUpdateList"})], :shape "BatchUpdateLinkAttributes", :type "structure"}))

(clojure.core/defn- ser-link-attribute-update-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-link-attribute-update coll) #:http.request.field{:shape "LinkAttributeUpdate"}))) input), :shape "LinkAttributeUpdateList", :type "list"})

(clojure.core/defn- ser-batch-list-object-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchListObjectAttributes", :type "structure"} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :facet-filter) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schema-facet (input :facet-filter)) #:http.request.field{:name "FacetFilter", :shape "SchemaFacet"}))))

(clojure.core/defn- ser-facet-attribute [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-attribute-name (:name input)) #:http.request.field{:name "Name", :shape "AttributeName"})], :shape "FacetAttribute", :type "structure"} (clojure.core/contains? input :attribute-definition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-facet-attribute-definition (input :attribute-definition)) #:http.request.field{:name "AttributeDefinition", :shape "FacetAttributeDefinition"})) (clojure.core/contains? input :attribute-reference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-facet-attribute-reference (input :attribute-reference)) #:http.request.field{:name "AttributeReference", :shape "FacetAttributeReference"})) (clojure.core/contains? input :required-behavior) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-required-attribute-behavior (input :required-behavior)) #:http.request.field{:name "RequiredBehavior", :shape "RequiredAttributeBehavior"}))))

(clojure.core/defn- ser-object-attribute-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ObjectAttributeUpdate", :type "structure"} (clojure.core/contains? input :object-attribute-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-key (input :object-attribute-key)) #:http.request.field{:name "ObjectAttributeKey", :shape "AttributeKey"})) (clojure.core/contains? input :object-attribute-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-attribute-action (input :object-attribute-action)) #:http.request.field{:name "ObjectAttributeAction", :shape "ObjectAttributeAction"}))))

(clojure.core/defn- ser-typed-attribute-value [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TypedAttributeValue", :type "structure"} (clojure.core/contains? input :string-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-attribute-value (input :string-value)) #:http.request.field{:name "StringValue", :shape "StringAttributeValue"})) (clojure.core/contains? input :binary-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-binary-attribute-value (input :binary-value)) #:http.request.field{:name "BinaryValue", :shape "BinaryAttributeValue"})) (clojure.core/contains? input :boolean-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-attribute-value (input :boolean-value)) #:http.request.field{:name "BooleanValue", :shape "BooleanAttributeValue"})) (clojure.core/contains? input :number-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-attribute-value (input :number-value)) #:http.request.field{:name "NumberValue", :shape "NumberAttributeValue"})) (clojure.core/contains? input :datetime-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-datetime-attribute-value (input :datetime-value)) #:http.request.field{:name "DatetimeValue", :shape "DatetimeAttributeValue"}))))

(clojure.core/defn- ser-facet-attribute-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-facet-attribute-type (:type input)) #:http.request.field{:name "Type", :shape "FacetAttributeType"})], :shape "FacetAttributeDefinition", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-attribute-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "TypedAttributeValue"})) (clojure.core/contains? input :is-immutable) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bool (input :is-immutable)) #:http.request.field{:name "IsImmutable", :shape "Bool"})) (clojure.core/contains? input :rules) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-map (input :rules)) #:http.request.field{:name "Rules", :shape "RuleMap"}))))

(clojure.core/defn- ser-facet-attribute-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-facet-attribute coll) #:http.request.field{:shape "FacetAttribute"}))) input), :shape "FacetAttributeList", :type "list"})

(clojure.core/defn- ser-datetime-attribute-value [input] #:http.request.field{:value input, :shape "DatetimeAttributeValue"})

(clojure.core/defn- ser-object-attribute-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ObjectAttributeRange", :type "structure"} (clojure.core/contains? input :attribute-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-key (input :attribute-key)) #:http.request.field{:name "AttributeKey", :shape "AttributeKey"})) (clojure.core/contains? input :range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-attribute-value-range (input :range)) #:http.request.field{:name "Range", :shape "TypedAttributeValueRange"}))))

(clojure.core/defn- ser-batch-read-operation [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BatchReadOperation", :type "structure"} (clojure.core/contains? input :list-object-policies) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-list-object-policies (input :list-object-policies)) #:http.request.field{:name "ListObjectPolicies", :shape "BatchListObjectPolicies"})) (clojure.core/contains? input :list-object-parent-paths) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-list-object-parent-paths (input :list-object-parent-paths)) #:http.request.field{:name "ListObjectParentPaths", :shape "BatchListObjectParentPaths"})) (clojure.core/contains? input :list-incoming-typed-links) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-list-incoming-typed-links (input :list-incoming-typed-links)) #:http.request.field{:name "ListIncomingTypedLinks", :shape "BatchListIncomingTypedLinks"})) (clojure.core/contains? input :get-object-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-get-object-attributes (input :get-object-attributes)) #:http.request.field{:name "GetObjectAttributes", :shape "BatchGetObjectAttributes"})) (clojure.core/contains? input :get-object-information) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-get-object-information (input :get-object-information)) #:http.request.field{:name "GetObjectInformation", :shape "BatchGetObjectInformation"})) (clojure.core/contains? input :list-policy-attachments) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-list-policy-attachments (input :list-policy-attachments)) #:http.request.field{:name "ListPolicyAttachments", :shape "BatchListPolicyAttachments"})) (clojure.core/contains? input :list-outgoing-typed-links) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-list-outgoing-typed-links (input :list-outgoing-typed-links)) #:http.request.field{:name "ListOutgoingTypedLinks", :shape "BatchListOutgoingTypedLinks"})) (clojure.core/contains? input :get-link-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-get-link-attributes (input :get-link-attributes)) #:http.request.field{:name "GetLinkAttributes", :shape "BatchGetLinkAttributes"})) (clojure.core/contains? input :list-object-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-list-object-attributes (input :list-object-attributes)) #:http.request.field{:name "ListObjectAttributes", :shape "BatchListObjectAttributes"})) (clojure.core/contains? input :list-index) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-list-index (input :list-index)) #:http.request.field{:name "ListIndex", :shape "BatchListIndex"})) (clojure.core/contains? input :list-object-children) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-list-object-children (input :list-object-children)) #:http.request.field{:name "ListObjectChildren", :shape "BatchListObjectChildren"})) (clojure.core/contains? input :list-object-parents) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-list-object-parents (input :list-object-parents)) #:http.request.field{:name "ListObjectParents", :shape "BatchListObjectParents"})) (clojure.core/contains? input :list-attached-indices) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-list-attached-indices (input :list-attached-indices)) #:http.request.field{:name "ListAttachedIndices", :shape "BatchListAttachedIndices"})) (clojure.core/contains? input :lookup-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-lookup-policy (input :lookup-policy)) #:http.request.field{:name "LookupPolicy", :shape "BatchLookupPolicy"}))))

(clojure.core/defn- ser-number-attribute-value [input] #:http.request.field{:value input, :shape "NumberAttributeValue"})

(clojure.core/defn- ser-object-attribute-action [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ObjectAttributeAction", :type "structure"} (clojure.core/contains? input :object-attribute-action-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-action-type (input :object-attribute-action-type)) #:http.request.field{:name "ObjectAttributeActionType", :shape "UpdateActionType"})) (clojure.core/contains? input :object-attribute-update-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-attribute-value (input :object-attribute-update-value)) #:http.request.field{:name "ObjectAttributeUpdateValue", :shape "TypedAttributeValue"}))))

(clojure.core/defn- ser-typed-link-attribute-range-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-typed-link-attribute-range coll) #:http.request.field{:shape "TypedLinkAttributeRange"}))) input), :shape "TypedLinkAttributeRangeList", :type "list"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-required-attribute-behavior [input] #:http.request.field{:value (clojure.core/get {"REQUIRED_ALWAYS" "REQUIRED_ALWAYS", :required-always "REQUIRED_ALWAYS", "NOT_REQUIRED" "NOT_REQUIRED", :not-required "NOT_REQUIRED"} input), :shape "RequiredAttributeBehavior"})

(clojure.core/defn- ser-typed-attribute-value-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-range-mode (:start-mode input)) #:http.request.field{:name "StartMode", :shape "RangeMode"}) (clojure.core/into (ser-range-mode (:end-mode input)) #:http.request.field{:name "EndMode", :shape "RangeMode"})], :shape "TypedAttributeValueRange", :type "structure"} (clojure.core/contains? input :start-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-attribute-value (input :start-value)) #:http.request.field{:name "StartValue", :shape "TypedAttributeValue"})) (clojure.core/contains? input :end-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-attribute-value (input :end-value)) #:http.request.field{:name "EndValue", :shape "TypedAttributeValue"}))))

(clojure.core/defn- ser-batch-add-facet-to-object [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-schema-facet (:schema-facet input)) #:http.request.field{:name "SchemaFacet", :shape "SchemaFacet"}) (clojure.core/into (ser-attribute-key-and-value-list (:object-attribute-list input)) #:http.request.field{:name "ObjectAttributeList", :shape "AttributeKeyAndValueList"}) (clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchAddFacetToObject", :type "structure"}))

(clojure.core/defn- ser-typed-link-name [input] #:http.request.field{:value input, :shape "TypedLinkName"})

(clojure.core/defn- ser-batch-update-object-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-attribute-update-list (:attribute-updates input)) #:http.request.field{:name "AttributeUpdates", :shape "ObjectAttributeUpdateList"})], :shape "BatchUpdateObjectAttributes", :type "structure"}))

(clojure.core/defn- ser-batch-write-operation-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-batch-write-operation coll) #:http.request.field{:shape "BatchWriteOperation"}))) input), :shape "BatchWriteOperationList", :type "list"})

(clojure.core/defn- ser-batch-list-object-policies [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchListObjectPolicies", :type "structure"} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- ser-batch-remove-facet-from-object [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-schema-facet (:schema-facet input)) #:http.request.field{:name "SchemaFacet", :shape "SchemaFacet"}) (clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchRemoveFacetFromObject", :type "structure"}))

(clojure.core/defn- ser-batch-attach-typed-link [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:source-object-reference input)) #:http.request.field{:name "SourceObjectReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (:target-object-reference input)) #:http.request.field{:name "TargetObjectReference", :shape "ObjectReference"}) (clojure.core/into (ser-typed-link-schema-and-facet-name (:typed-link-facet input)) #:http.request.field{:name "TypedLinkFacet", :shape "TypedLinkSchemaAndFacetName"}) (clojure.core/into (ser-attribute-name-and-value-list (:attributes input)) #:http.request.field{:name "Attributes", :shape "AttributeNameAndValueList"})], :shape "BatchAttachTypedLink", :type "structure"}))

(clojure.core/defn- ser-batch-get-object-information [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchGetObjectInformation", :type "structure"}))

(clojure.core/defn- ser-typed-link-attribute-definition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-typed-link-attribute-definition coll) #:http.request.field{:shape "TypedLinkAttributeDefinition"}))) input), :shape "TypedLinkAttributeDefinitionList", :type "list"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-update-action-type [input] #:http.request.field{:value (clojure.core/get {"CREATE_OR_UPDATE" "CREATE_OR_UPDATE", :create-or-update "CREATE_OR_UPDATE", "DELETE" "DELETE", :delete "DELETE"} input), :shape "UpdateActionType"})

(clojure.core/defn- ser-facet-attribute-type [input] #:http.request.field{:value (clojure.core/get {:binary "BINARY", :variant "VARIANT", :number "NUMBER", "NUMBER" "NUMBER", :string "STRING", "STRING" "STRING", "VARIANT" "VARIANT", :datetime "DATETIME", "DATETIME" "DATETIME", :boolean "BOOLEAN", "BOOLEAN" "BOOLEAN", "BINARY" "BINARY"} input), :shape "FacetAttributeType"})

(clojure.core/defn- ser-batch-list-object-children [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchListObjectChildren", :type "structure"} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- ser-boolean-attribute-value [input] #:http.request.field{:value input, :shape "BooleanAttributeValue"})

(clojure.core/defn- ser-batch-attach-policy [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:policy-reference input)) #:http.request.field{:name "PolicyReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchAttachPolicy", :type "structure"}))

(clojure.core/defn- ser-schema-json-document [input] #:http.request.field{:value input, :shape "SchemaJsonDocument"})

(clojure.core/defn- ser-attribute-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-key coll) #:http.request.field{:shape "AttributeKey"}))) input), :shape "AttributeKeyList", :type "list"})

(clojure.core/defn- ser-selector-object-reference [input] #:http.request.field{:value input, :shape "SelectorObjectReference"})

(clojure.core/defn- ser-rule-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-rule-key k) #:http.request.field{:map-info "key", :shape "RuleKey"}) (clojure.core/into (ser-rule v) #:http.request.field{:map-info "value", :shape "Rule"})])) input), :shape "RuleMap", :type "map"})

(clojure.core/defn- ser-batch-list-object-parent-paths [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchListObjectParentPaths", :type "structure"} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-batch-list-outgoing-typed-links [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchListOutgoingTypedLinks", :type "structure"} (clojure.core/contains? input :filter-attribute-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-link-attribute-range-list (input :filter-attribute-ranges)) #:http.request.field{:name "FilterAttributeRanges", :shape "TypedLinkAttributeRangeList"})) (clojure.core/contains? input :filter-typed-link) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-link-schema-and-facet-name (input :filter-typed-link)) #:http.request.field{:name "FilterTypedLink", :shape "TypedLinkSchemaAndFacetName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- ser-batch-list-incoming-typed-links [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchListIncomingTypedLinks", :type "structure"} (clojure.core/contains? input :filter-attribute-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-link-attribute-range-list (input :filter-attribute-ranges)) #:http.request.field{:name "FilterAttributeRanges", :shape "TypedLinkAttributeRangeList"})) (clojure.core/contains? input :filter-typed-link) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-link-schema-and-facet-name (input :filter-typed-link)) #:http.request.field{:name "FilterTypedLink", :shape "TypedLinkSchemaAndFacetName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- ser-attribute-key-and-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-key-and-value coll) #:http.request.field{:shape "AttributeKeyAndValue"}))) input), :shape "AttributeKeyAndValueList", :type "list"})

(clojure.core/defn- ser-typed-link-attribute-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-typed-attribute-value-range (:range input)) #:http.request.field{:name "Range", :shape "TypedAttributeValueRange"})], :shape "TypedLinkAttributeRange", :type "structure"} (clojure.core/contains? input :attribute-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-name (input :attribute-name)) #:http.request.field{:name "AttributeName", :shape "AttributeName"}))))

(clojure.core/defn- ser-typed-link-specifier [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-typed-link-schema-and-facet-name (:typed-link-facet input)) #:http.request.field{:name "TypedLinkFacet", :shape "TypedLinkSchemaAndFacetName"}) (clojure.core/into (ser-object-reference (:source-object-reference input)) #:http.request.field{:name "SourceObjectReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (:target-object-reference input)) #:http.request.field{:name "TargetObjectReference", :shape "ObjectReference"}) (clojure.core/into (ser-attribute-name-and-value-list (:identity-attribute-values input)) #:http.request.field{:name "IdentityAttributeValues", :shape "AttributeNameAndValueList"})], :shape "TypedLinkSpecifier", :type "structure"}))

(clojure.core/defn- ser-object-attribute-range-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-object-attribute-range coll) #:http.request.field{:shape "ObjectAttributeRange"}))) input), :shape "ObjectAttributeRangeList", :type "list"})

(clojure.core/defn- ser-typed-link-facet [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-typed-link-name (:name input)) #:http.request.field{:name "Name", :shape "TypedLinkName"}) (clojure.core/into (ser-typed-link-attribute-definition-list (:attributes input)) #:http.request.field{:name "Attributes", :shape "TypedLinkAttributeDefinitionList"}) (clojure.core/into (ser-attribute-name-list (:identity-attribute-order input)) #:http.request.field{:name "IdentityAttributeOrder", :shape "AttributeNameList"})], :shape "TypedLinkFacet", :type "structure"}))

(clojure.core/defn- ser-range-mode [input] #:http.request.field{:value (clojure.core/get {:exclusive "EXCLUSIVE", "LAST" "LAST", :inclusive "INCLUSIVE", :last-before-missing-values "LAST_BEFORE_MISSING_VALUES", "EXCLUSIVE" "EXCLUSIVE", :first "FIRST", "INCLUSIVE" "INCLUSIVE", :last "LAST", "FIRST" "FIRST", "LAST_BEFORE_MISSING_VALUES" "LAST_BEFORE_MISSING_VALUES"} input), :shape "RangeMode"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-binary-attribute-value [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "BinaryAttributeValue"})

(clojure.core/defn- ser-batch-read-operation-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-batch-read-operation coll) #:http.request.field{:shape "BatchReadOperation"}))) input), :shape "BatchReadOperationList", :type "list"})

(clojure.core/defn- ser-batch-get-link-attributes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-typed-link-specifier (:typed-link-specifier input)) #:http.request.field{:name "TypedLinkSpecifier", :shape "TypedLinkSpecifier"}) (clojure.core/into (ser-attribute-name-list (:attribute-names input)) #:http.request.field{:name "AttributeNames", :shape "AttributeNameList"})], :shape "BatchGetLinkAttributes", :type "structure"}))

(clojure.core/defn- ser-batch-detach-typed-link [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-typed-link-specifier (:typed-link-specifier input)) #:http.request.field{:name "TypedLinkSpecifier", :shape "TypedLinkSpecifier"})], :shape "BatchDetachTypedLink", :type "structure"}))

(clojure.core/defn- ser-object-attribute-update-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-object-attribute-update coll) #:http.request.field{:shape "ObjectAttributeUpdate"}))) input), :shape "ObjectAttributeUpdateList", :type "list"})

(clojure.core/defn- ser-attribute-name-and-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-name-and-value coll) #:http.request.field{:shape "AttributeNameAndValue"}))) input), :shape "AttributeNameAndValueList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-facet-attribute-update-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-facet-attribute-update coll) #:http.request.field{:shape "FacetAttributeUpdate"}))) input), :shape "FacetAttributeUpdateList", :type "list"})

(clojure.core/defn- ser-attribute-name-and-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-attribute-name (:attribute-name input)) #:http.request.field{:name "AttributeName", :shape "AttributeName"}) (clojure.core/into (ser-typed-attribute-value (:value input)) #:http.request.field{:name "Value", :shape "TypedAttributeValue"})], :shape "AttributeNameAndValue", :type "structure"}))

(clojure.core/defn- ser-batch-list-policy-attachments [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:policy-reference input)) #:http.request.field{:name "PolicyReference", :shape "ObjectReference"})], :shape "BatchListPolicyAttachments", :type "structure"} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- ser-object-reference [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ObjectReference", :type "structure"} (clojure.core/contains? input :selector) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-selector-object-reference (input :selector)) #:http.request.field{:name "Selector", :shape "SelectorObjectReference"}))))

(clojure.core/defn- ser-attribute-key [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn (:schema-arn input)) #:http.request.field{:name "SchemaArn", :shape "Arn"}) (clojure.core/into (ser-facet-name (:facet-name input)) #:http.request.field{:name "FacetName", :shape "FacetName"}) (clojure.core/into (ser-attribute-name (:name input)) #:http.request.field{:name "Name", :shape "AttributeName"})], :shape "AttributeKey", :type "structure"}))

(clojure.core/defn- ser-bool [input] #:http.request.field{:value input, :shape "Bool"})

(clojure.core/defn- ser-attribute-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-name coll) #:http.request.field{:shape "AttributeName"}))) input), :shape "AttributeNameList", :type "list"})

(clojure.core/defn- ser-batch-attach-to-index [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:index-reference input)) #:http.request.field{:name "IndexReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (:target-reference input)) #:http.request.field{:name "TargetReference", :shape "ObjectReference"})], :shape "BatchAttachToIndex", :type "structure"}))

(clojure.core/defn- ser-batch-reference-name [input] #:http.request.field{:value input, :shape "BatchReferenceName"})

(clojure.core/defn- ser-batch-write-operation [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "BatchWriteOperation", :type "structure"} (clojure.core/contains? input :create-index) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-create-index (input :create-index)) #:http.request.field{:name "CreateIndex", :shape "BatchCreateIndex"})) (clojure.core/contains? input :create-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-create-object (input :create-object)) #:http.request.field{:name "CreateObject", :shape "BatchCreateObject"})) (clojure.core/contains? input :detach-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-detach-policy (input :detach-policy)) #:http.request.field{:name "DetachPolicy", :shape "BatchDetachPolicy"})) (clojure.core/contains? input :detach-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-detach-object (input :detach-object)) #:http.request.field{:name "DetachObject", :shape "BatchDetachObject"})) (clojure.core/contains? input :detach-from-index) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-detach-from-index (input :detach-from-index)) #:http.request.field{:name "DetachFromIndex", :shape "BatchDetachFromIndex"})) (clojure.core/contains? input :attach-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-attach-object (input :attach-object)) #:http.request.field{:name "AttachObject", :shape "BatchAttachObject"})) (clojure.core/contains? input :update-link-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-update-link-attributes (input :update-link-attributes)) #:http.request.field{:name "UpdateLinkAttributes", :shape "BatchUpdateLinkAttributes"})) (clojure.core/contains? input :attach-to-index) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-attach-to-index (input :attach-to-index)) #:http.request.field{:name "AttachToIndex", :shape "BatchAttachToIndex"})) (clojure.core/contains? input :attach-typed-link) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-attach-typed-link (input :attach-typed-link)) #:http.request.field{:name "AttachTypedLink", :shape "BatchAttachTypedLink"})) (clojure.core/contains? input :detach-typed-link) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-detach-typed-link (input :detach-typed-link)) #:http.request.field{:name "DetachTypedLink", :shape "BatchDetachTypedLink"})) (clojure.core/contains? input :add-facet-to-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-add-facet-to-object (input :add-facet-to-object)) #:http.request.field{:name "AddFacetToObject", :shape "BatchAddFacetToObject"})) (clojure.core/contains? input :update-object-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-update-object-attributes (input :update-object-attributes)) #:http.request.field{:name "UpdateObjectAttributes", :shape "BatchUpdateObjectAttributes"})) (clojure.core/contains? input :delete-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-delete-object (input :delete-object)) #:http.request.field{:name "DeleteObject", :shape "BatchDeleteObject"})) (clojure.core/contains? input :attach-policy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-attach-policy (input :attach-policy)) #:http.request.field{:name "AttachPolicy", :shape "BatchAttachPolicy"})) (clojure.core/contains? input :remove-facet-from-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-remove-facet-from-object (input :remove-facet-from-object)) #:http.request.field{:name "RemoveFacetFromObject", :shape "BatchRemoveFacetFromObject"}))))

(clojure.core/defn- ser-directory-arn [input] #:http.request.field{:value input, :shape "DirectoryArn"})

(clojure.core/defn- ser-rule-parameter-value [input] #:http.request.field{:value input, :shape "RuleParameterValue"})

(clojure.core/defn- ser-batch-detach-from-index [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:index-reference input)) #:http.request.field{:name "IndexReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (:target-reference input)) #:http.request.field{:name "TargetReference", :shape "ObjectReference"})], :shape "BatchDetachFromIndex", :type "structure"}))

(clojure.core/defn- ser-typed-link-facet-attribute-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-typed-link-attribute-definition (:attribute input)) #:http.request.field{:name "Attribute", :shape "TypedLinkAttributeDefinition"}) (clojure.core/into (ser-update-action-type (:action input)) #:http.request.field{:name "Action", :shape "UpdateActionType"})], :shape "TypedLinkFacetAttributeUpdate", :type "structure"}))

(clojure.core/defn- ser-facet-attribute-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FacetAttributeUpdate", :type "structure"} (clojure.core/contains? input :attribute) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-facet-attribute (input :attribute)) #:http.request.field{:name "Attribute", :shape "FacetAttribute"})) (clojure.core/contains? input :action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-update-action-type (input :action)) #:http.request.field{:name "Action", :shape "UpdateActionType"}))))

(clojure.core/defn- ser-typed-link-schema-and-facet-name [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn (:schema-arn input)) #:http.request.field{:name "SchemaArn", :shape "Arn"}) (clojure.core/into (ser-typed-link-name (:typed-link-name input)) #:http.request.field{:name "TypedLinkName", :shape "TypedLinkName"})], :shape "TypedLinkSchemaAndFacetName", :type "structure"}))

(clojure.core/defn- ser-rule [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Rule", :type "structure"} (clojure.core/contains? input :type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-type (input :type)) #:http.request.field{:name "Type", :shape "RuleType"})) (clojure.core/contains? input :parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-parameter-map (input :parameters)) #:http.request.field{:name "Parameters", :shape "RuleParameterMap"}))))

(clojure.core/defn- ser-batch-attach-object [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:parent-reference input)) #:http.request.field{:name "ParentReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (:child-reference input)) #:http.request.field{:name "ChildReference", :shape "ObjectReference"}) (clojure.core/into (ser-link-name (:link-name input)) #:http.request.field{:name "LinkName", :shape "LinkName"})], :shape "BatchAttachObject", :type "structure"}))

(clojure.core/defn- ser-batch-delete-object [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchDeleteObject", :type "structure"}))

(clojure.core/defn- ser-rule-parameter-key [input] #:http.request.field{:value input, :shape "RuleParameterKey"})

(clojure.core/defn- ser-batch-lookup-policy [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchLookupPolicy", :type "structure"} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- ser-typed-link-facet-attribute-update-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-typed-link-facet-attribute-update coll) #:http.request.field{:shape "TypedLinkFacetAttributeUpdate"}))) input), :shape "TypedLinkFacetAttributeUpdateList", :type "list"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-link-attribute-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LinkAttributeUpdate", :type "structure"} (clojure.core/contains? input :attribute-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-key (input :attribute-key)) #:http.request.field{:name "AttributeKey", :shape "AttributeKey"})) (clojure.core/contains? input :attribute-action) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-link-attribute-action (input :attribute-action)) #:http.request.field{:name "AttributeAction", :shape "LinkAttributeAction"}))))

(clojure.core/defn- ser-batch-create-index [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-attribute-key-list (:ordered-indexed-attribute-list input)) #:http.request.field{:name "OrderedIndexedAttributeList", :shape "AttributeKeyList"}) (clojure.core/into (ser-bool (:is-unique input)) #:http.request.field{:name "IsUnique", :shape "Bool"})], :shape "BatchCreateIndex", :type "structure"} (clojure.core/contains? input :parent-reference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-reference (input :parent-reference)) #:http.request.field{:name "ParentReference", :shape "ObjectReference"})) (clojure.core/contains? input :link-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-link-name (input :link-name)) #:http.request.field{:name "LinkName", :shape "LinkName"})) (clojure.core/contains? input :batch-reference-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-reference-name (input :batch-reference-name)) #:http.request.field{:name "BatchReferenceName", :shape "BatchReferenceName"}))))

(clojure.core/defn- ser-link-name [input] #:http.request.field{:value input, :shape "LinkName"})

(clojure.core/defn- ser-number-results [input] #:http.request.field{:value input, :shape "NumberResults"})

(clojure.core/defn- ser-tags-number-results [input] #:http.request.field{:value input, :shape "TagsNumberResults"})

(clojure.core/defn- ser-batch-detach-policy [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:policy-reference input)) #:http.request.field{:name "PolicyReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchDetachPolicy", :type "structure"}))

(clojure.core/defn- ser-directory-state [input] #:http.request.field{:value (clojure.core/get {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED", "DELETED" "DELETED", :deleted "DELETED"} input), :shape "DirectoryState"})

(clojure.core/defn- ser-rule-key [input] #:http.request.field{:value input, :shape "RuleKey"})

(clojure.core/defn- ser-object-type [input] #:http.request.field{:value (clojure.core/get {"NODE" "NODE", :node "NODE", "LEAF_NODE" "LEAF_NODE", :leaf-node "LEAF_NODE", "POLICY" "POLICY", :policy "POLICY", "INDEX" "INDEX", :index "INDEX"} input), :shape "ObjectType"})

(clojure.core/defn- ser-consistency-level [input] #:http.request.field{:value (clojure.core/get {"SERIALIZABLE" "SERIALIZABLE", :serializable "SERIALIZABLE", "EVENTUAL" "EVENTUAL", :eventual "EVENTUAL"} input), :shape "ConsistencyLevel"})

(clojure.core/defn- ser-directory-name [input] #:http.request.field{:value input, :shape "DirectoryName"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-batch-create-object [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-schema-facet-list (:schema-facet input)) #:http.request.field{:name "SchemaFacet", :shape "SchemaFacetList"}) (clojure.core/into (ser-attribute-key-and-value-list (:object-attribute-list input)) #:http.request.field{:name "ObjectAttributeList", :shape "AttributeKeyAndValueList"})], :shape "BatchCreateObject", :type "structure"} (clojure.core/contains? input :parent-reference) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-reference (input :parent-reference)) #:http.request.field{:name "ParentReference", :shape "ObjectReference"})) (clojure.core/contains? input :link-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-link-name (input :link-name)) #:http.request.field{:name "LinkName", :shape "LinkName"})) (clojure.core/contains? input :batch-reference-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-reference-name (input :batch-reference-name)) #:http.request.field{:name "BatchReferenceName", :shape "BatchReferenceName"}))))

(clojure.core/defn- ser-facet-style [input] #:http.request.field{:value (clojure.core/get {"STATIC" "STATIC", :static "STATIC", "DYNAMIC" "DYNAMIC", :dynamic "DYNAMIC"} input), :shape "FacetStyle"})

(clojure.core/defn- ser-batch-detach-object [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:parent-reference input)) #:http.request.field{:name "ParentReference", :shape "ObjectReference"}) (clojure.core/into (ser-link-name (:link-name input)) #:http.request.field{:name "LinkName", :shape "LinkName"})], :shape "BatchDetachObject", :type "structure"} (clojure.core/contains? input :batch-reference-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-reference-name (input :batch-reference-name)) #:http.request.field{:name "BatchReferenceName", :shape "BatchReferenceName"}))))

(clojure.core/defn- ser-schema-name [input] #:http.request.field{:value input, :shape "SchemaName"})

(clojure.core/defn- ser-typed-link-attribute-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-attribute-name (:name input)) #:http.request.field{:name "Name", :shape "AttributeName"}) (clojure.core/into (ser-facet-attribute-type (:type input)) #:http.request.field{:name "Type", :shape "FacetAttributeType"}) (clojure.core/into (ser-required-attribute-behavior (:required-behavior input)) #:http.request.field{:name "RequiredBehavior", :shape "RequiredAttributeBehavior"})], :shape "TypedLinkAttributeDefinition", :type "structure"} (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-attribute-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "TypedAttributeValue"})) (clojure.core/contains? input :is-immutable) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bool (input :is-immutable)) #:http.request.field{:name "IsImmutable", :shape "Bool"})) (clojure.core/contains? input :rules) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rule-map (input :rules)) #:http.request.field{:name "Rules", :shape "RuleMap"}))))

(clojure.core/defn- ser-string-attribute-value [input] #:http.request.field{:value input, :shape "StringAttributeValue"})

(clojure.core/defn- ser-rule-parameter-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-rule-parameter-key k) #:http.request.field{:map-info "key", :shape "RuleParameterKey"}) (clojure.core/into (ser-rule-parameter-value v) #:http.request.field{:map-info "value", :shape "RuleParameterValue"})])) input), :shape "RuleParameterMap", :type "map"})

(clojure.core/defn- ser-schema-facet-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-schema-facet coll) #:http.request.field{:shape "SchemaFacet"}))) input), :shape "SchemaFacetList", :type "list"})

(clojure.core/defn- ser-attribute-key-and-value [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-attribute-key (:key input)) #:http.request.field{:name "Key", :shape "AttributeKey"}) (clojure.core/into (ser-typed-attribute-value (:value input)) #:http.request.field{:name "Value", :shape "TypedAttributeValue"})], :shape "AttributeKeyAndValue", :type "structure"}))

(clojure.core/defn- ser-batch-list-attached-indices [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:target-reference input)) #:http.request.field{:name "TargetReference", :shape "ObjectReference"})], :shape "BatchListAttachedIndices", :type "structure"} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- ser-batch-list-object-parents [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-object-reference (:object-reference input)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})], :shape "BatchListObjectParents", :type "structure"} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- ser-facet-attribute-reference [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-facet-name (:target-facet-name input)) #:http.request.field{:name "TargetFacetName", :shape "FacetName"}) (clojure.core/into (ser-attribute-name (:target-attribute-name input)) #:http.request.field{:name "TargetAttributeName", :shape "AttributeName"})], :shape "FacetAttributeReference", :type "structure"}))

(clojure.core/defn- ser-rule-type [input] #:http.request.field{:value (clojure.core/get {"BINARY_LENGTH" "BINARY_LENGTH", :binary-length "BINARY_LENGTH", "NUMBER_COMPARISON" "NUMBER_COMPARISON", :number-comparison "NUMBER_COMPARISON", "STRING_FROM_SET" "STRING_FROM_SET", :string-from-set "STRING_FROM_SET", "STRING_LENGTH" "STRING_LENGTH", :string-length "STRING_LENGTH"} input), :shape "RuleType"})

(clojure.core/defn- req-delete-object-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]}))

(clojure.core/defn- req-attach-to-index-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :index-reference)) #:http.request.field{:name "IndexReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (input :target-reference)) #:http.request.field{:name "TargetReference", :shape "ObjectReference"})]}))

(clojure.core/defn- req-create-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-directory-name (input :name)) #:http.request.field{:name "Name", :shape "DirectoryName"})], :header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})]}))

(clojure.core/defn- req-list-incoming-typed-links-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]} (clojure.core/contains? input :filter-attribute-ranges) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-link-attribute-range-list (input :filter-attribute-ranges)) #:http.request.field{:name "FilterAttributeRanges", :shape "TypedLinkAttributeRangeList"})) (clojure.core/contains? input :filter-typed-link) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-link-schema-and-facet-name (input :filter-typed-link)) #:http.request.field{:name "FilterTypedLink", :shape "TypedLinkSchemaAndFacetName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel"}))))

(clojure.core/defn- req-list-object-parents-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel", :location "header", :location-name "x-amz-consistency-level"})) (clojure.core/contains? input :include-all-links-to-each-parent) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bool (input :include-all-links-to-each-parent)) #:http.request.field{:name "IncludeAllLinksToEachParent", :shape "Bool"}))))

(clojure.core/defn- req-attach-typed-link-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :source-object-reference)) #:http.request.field{:name "SourceObjectReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (input :target-object-reference)) #:http.request.field{:name "TargetObjectReference", :shape "ObjectReference"}) (clojure.core/into (ser-typed-link-schema-and-facet-name (input :typed-link-facet)) #:http.request.field{:name "TypedLinkFacet", :shape "TypedLinkSchemaAndFacetName"}) (clojure.core/into (ser-attribute-name-and-value-list (input :attributes)) #:http.request.field{:name "Attributes", :shape "AttributeNameAndValueList"})]}))

(clojure.core/defn- req-detach-from-index-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :index-reference)) #:http.request.field{:name "IndexReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (input :target-reference)) #:http.request.field{:name "TargetReference", :shape "ObjectReference"})]}))

(clojure.core/defn- req-delete-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})]}))

(clojure.core/defn- req-get-facet-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-facet-name (input :name)) #:http.request.field{:name "Name", :shape "FacetName"})]}))

(clojure.core/defn- req-list-policy-attachments-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :policy-reference)) #:http.request.field{:name "PolicyReference", :shape "ObjectReference"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel", :location "header", :location-name "x-amz-consistency-level"}))))

(clojure.core/defn- req-list-object-children-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel", :location "header", :location-name "x-amz-consistency-level"}))))

(clojure.core/defn- req-list-object-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel", :location "header", :location-name "x-amz-consistency-level"})) (clojure.core/contains? input :facet-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schema-facet (input :facet-filter)) #:http.request.field{:name "FacetFilter", :shape "SchemaFacet"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "TagsNumberResults"}))))

(clojure.core/defn- req-attach-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :policy-reference)) #:http.request.field{:name "PolicyReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]}))

(clojure.core/defn- req-update-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-schema-name (input :name)) #:http.request.field{:name "Name", :shape "SchemaName"})]}))

(clojure.core/defn- req-create-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-schema-name (input :name)) #:http.request.field{:name "Name", :shape "SchemaName"})]}))

(clojure.core/defn- req-create-index-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-attribute-key-list (input :ordered-indexed-attribute-list)) #:http.request.field{:name "OrderedIndexedAttributeList", :shape "AttributeKeyList"}) (clojure.core/into (ser-bool (input :is-unique)) #:http.request.field{:name "IsUnique", :shape "Bool"})]} (clojure.core/contains? input :parent-reference) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-reference (input :parent-reference)) #:http.request.field{:name "ParentReference", :shape "ObjectReference"})) (clojure.core/contains? input :link-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-link-name (input :link-name)) #:http.request.field{:name "LinkName", :shape "LinkName"}))))

(clojure.core/defn- req-batch-read-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-batch-read-operation-list (input :operations)) #:http.request.field{:name "Operations", :shape "BatchReadOperationList"})]} (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel", :location "header", :location-name "x-amz-consistency-level"}))))

(clojure.core/defn- req-enable-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})]}))

(clojure.core/defn- req-list-managed-schema-arns-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :schema-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- req-update-object-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-attribute-update-list (input :attribute-updates)) #:http.request.field{:name "AttributeUpdates", :shape "ObjectAttributeUpdateList"})]}))

(clojure.core/defn- req-add-facet-to-object-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-schema-facet (input :schema-facet)) #:http.request.field{:name "SchemaFacet", :shape "SchemaFacet"}) (clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]} (clojure.core/contains? input :object-attribute-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-key-and-value-list (input :object-attribute-list)) #:http.request.field{:name "ObjectAttributeList", :shape "AttributeKeyAndValueList"}))))

(clojure.core/defn- req-remove-facet-from-object-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-schema-facet (input :schema-facet)) #:http.request.field{:name "SchemaFacet", :shape "SchemaFacet"}) (clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]}))

(clojure.core/defn- req-detach-object-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :parent-reference)) #:http.request.field{:name "ParentReference", :shape "ObjectReference"}) (clojure.core/into (ser-link-name (input :link-name)) #:http.request.field{:name "LinkName", :shape "LinkName"})]}))

(clojure.core/defn- req-list-outgoing-typed-links-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]} (clojure.core/contains? input :filter-attribute-ranges) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-link-attribute-range-list (input :filter-attribute-ranges)) #:http.request.field{:name "FilterAttributeRanges", :shape "TypedLinkAttributeRangeList"})) (clojure.core/contains? input :filter-typed-link) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-typed-link-schema-and-facet-name (input :filter-typed-link)) #:http.request.field{:name "FilterTypedLink", :shape "TypedLinkSchemaAndFacetName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel"}))))

(clojure.core/defn- req-list-facet-names-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- req-list-directories-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :state) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-directory-state (input :state)) #:http.request.field{:name "state", :shape "DirectoryState"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-create-facet-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-facet-name (input :name)) #:http.request.field{:name "Name", :shape "FacetName"})]} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-facet-attribute-list (input :attributes)) #:http.request.field{:name "Attributes", :shape "FacetAttributeList"})) (clojure.core/contains? input :object-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-type (input :object-type)) #:http.request.field{:name "ObjectType", :shape "ObjectType"})) (clojure.core/contains? input :facet-style) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-facet-style (input :facet-style)) #:http.request.field{:name "FacetStyle", :shape "FacetStyle"}))))

(clojure.core/defn- req-get-applied-schema-version-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn"})]}))

(clojure.core/defn- req-list-attached-indices-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :target-reference)) #:http.request.field{:name "TargetReference", :shape "ObjectReference"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel", :location "header", :location-name "x-amz-consistency-level"}))))

(clojure.core/defn- req-update-typed-link-facet-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-typed-link-name (input :name)) #:http.request.field{:name "Name", :shape "TypedLinkName"}) (clojure.core/into (ser-typed-link-facet-attribute-update-list (input :attribute-updates)) #:http.request.field{:name "AttributeUpdates", :shape "TypedLinkFacetAttributeUpdateList"}) (clojure.core/into (ser-attribute-name-list (input :identity-attribute-order)) #:http.request.field{:name "IdentityAttributeOrder", :shape "AttributeNameList"})]}))

(clojure.core/defn- req-lookup-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- req-get-schema-as-json-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})]}))

(clojure.core/defn- req-list-object-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel", :location "header", :location-name "x-amz-consistency-level"}))))

(clojure.core/defn- req-list-index-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :index-reference)) #:http.request.field{:name "IndexReference", :shape "ObjectReference"})]} (clojure.core/contains? input :ranges-on-indexed-values) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-attribute-range-list (input :ranges-on-indexed-values)) #:http.request.field{:name "RangesOnIndexedValues", :shape "ObjectAttributeRangeList"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel", :location "header", :location-name "x-amz-consistency-level"}))))

(clojure.core/defn- req-get-typed-link-facet-information-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-typed-link-name (input :name)) #:http.request.field{:name "Name", :shape "TypedLinkName"})]}))

(clojure.core/defn- req-get-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-directory-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "DirectoryArn", :location "header", :location-name "x-amz-data-partition"})]}))

(clojure.core/defn- req-update-facet-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-facet-name (input :name)) #:http.request.field{:name "Name", :shape "FacetName"})]} (clojure.core/contains? input :attribute-updates) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-facet-attribute-update-list (input :attribute-updates)) #:http.request.field{:name "AttributeUpdates", :shape "FacetAttributeUpdateList"})) (clojure.core/contains? input :object-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-type (input :object-type)) #:http.request.field{:name "ObjectType", :shape "ObjectType"}))))

(clojure.core/defn- req-put-schema-from-json-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-schema-json-document (input :document)) #:http.request.field{:name "Document", :shape "SchemaJsonDocument"})]}))

(clojure.core/defn- req-list-development-schema-arns-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- req-publish-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :development-schema-arn)) #:http.request.field{:name "DevelopmentSchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-version (input :version)) #:http.request.field{:name "Version", :shape "Version"})]} (clojure.core/contains? input :minor-version) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-version (input :minor-version)) #:http.request.field{:name "MinorVersion", :shape "Version"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-schema-name (input :name)) #:http.request.field{:name "Name", :shape "SchemaName"}))))

(clojure.core/defn- req-create-typed-link-facet-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-typed-link-facet (input :facet)) #:http.request.field{:name "Facet", :shape "TypedLinkFacet"})]}))

(clojure.core/defn- req-batch-write-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-batch-write-operation-list (input :operations)) #:http.request.field{:name "Operations", :shape "BatchWriteOperationList"})]}))

(clojure.core/defn- req-delete-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})]}))

(clojure.core/defn- req-apply-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :published-schema-arn)) #:http.request.field{:name "PublishedSchemaArn", :shape "Arn"})], :header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})]}))

(clojure.core/defn- req-get-object-information-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]} (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel", :location "header", :location-name "x-amz-consistency-level"}))))

(clojure.core/defn- req-delete-typed-link-facet-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-typed-link-name (input :name)) #:http.request.field{:name "Name", :shape "TypedLinkName"})]}))

(clojure.core/defn- req-list-typed-link-facet-names-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- req-update-link-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-typed-link-specifier (input :typed-link-specifier)) #:http.request.field{:name "TypedLinkSpecifier", :shape "TypedLinkSpecifier"}) (clojure.core/into (ser-link-attribute-update-list (input :attribute-updates)) #:http.request.field{:name "AttributeUpdates", :shape "LinkAttributeUpdateList"})]}))

(clojure.core/defn- req-detach-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :policy-reference)) #:http.request.field{:name "PolicyReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]}))

(clojure.core/defn- req-create-object-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-schema-facet-list (input :schema-facets)) #:http.request.field{:name "SchemaFacets", :shape "SchemaFacetList"})]} (clojure.core/contains? input :object-attribute-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-key-and-value-list (input :object-attribute-list)) #:http.request.field{:name "ObjectAttributeList", :shape "AttributeKeyAndValueList"})) (clojure.core/contains? input :parent-reference) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-reference (input :parent-reference)) #:http.request.field{:name "ParentReference", :shape "ObjectReference"})) (clojure.core/contains? input :link-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-link-name (input :link-name)) #:http.request.field{:name "LinkName", :shape "LinkName"}))))

(clojure.core/defn- req-list-typed-link-facet-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-typed-link-name (input :name)) #:http.request.field{:name "Name", :shape "TypedLinkName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- req-detach-typed-link-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-typed-link-specifier (input :typed-link-specifier)) #:http.request.field{:name "TypedLinkSpecifier", :shape "TypedLinkSpecifier"})]}))

(clojure.core/defn- req-disable-directory-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})]}))

(clojure.core/defn- req-list-facet-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-facet-name (input :name)) #:http.request.field{:name "Name", :shape "FacetName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- req-get-link-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-typed-link-specifier (input :typed-link-specifier)) #:http.request.field{:name "TypedLinkSpecifier", :shape "TypedLinkSpecifier"}) (clojure.core/into (ser-attribute-name-list (input :attribute-names)) #:http.request.field{:name "AttributeNames", :shape "AttributeNameList"})]} (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel"}))))

(clojure.core/defn- req-get-object-attributes-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"}) (clojure.core/into (ser-schema-facet (input :schema-facet)) #:http.request.field{:name "SchemaFacet", :shape "SchemaFacet"}) (clojure.core/into (ser-attribute-name-list (input :attribute-names)) #:http.request.field{:name "AttributeNames", :shape "AttributeNameList"})]} (clojure.core/contains? input :consistency-level) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-consistency-level (input :consistency-level)) #:http.request.field{:name "ConsistencyLevel", :shape "ConsistencyLevel", :location "header", :location-name "x-amz-consistency-level"}))))

(clojure.core/defn- req-upgrade-applied-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :published-schema-arn)) #:http.request.field{:name "PublishedSchemaArn", :shape "Arn"}) (clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bool (input :dry-run)) #:http.request.field{:name "DryRun", :shape "Bool"}))))

(clojure.core/defn- req-attach-object-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :parent-reference)) #:http.request.field{:name "ParentReference", :shape "ObjectReference"}) (clojure.core/into (ser-object-reference (input :child-reference)) #:http.request.field{:name "ChildReference", :shape "ObjectReference"}) (clojure.core/into (ser-link-name (input :link-name)) #:http.request.field{:name "LinkName", :shape "LinkName"})]}))

(clojure.core/defn- req-delete-facet-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-facet-name (input :name)) #:http.request.field{:name "Name", :shape "FacetName"})]}))

(clojure.core/defn- req-list-published-schema-arns-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :schema-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- req-upgrade-published-schema-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :development-schema-arn)) #:http.request.field{:name "DevelopmentSchemaArn", :shape "Arn"}) (clojure.core/into (ser-arn (input :published-schema-arn)) #:http.request.field{:name "PublishedSchemaArn", :shape "Arn"}) (clojure.core/into (ser-version (input :minor-version)) #:http.request.field{:name "MinorVersion", :shape "Version"})]} (clojure.core/contains? input :dry-run) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bool (input :dry-run)) #:http.request.field{:name "DryRun", :shape "Bool"}))))

(clojure.core/defn- req-list-applied-schema-arns-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn"})]} (clojure.core/contains? input :schema-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn (input :schema-arn)) #:http.request.field{:name "SchemaArn", :shape "Arn"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- req-list-object-parent-paths-request [input] (clojure.core/cond-> #:http.request.configuration{:header [(clojure.core/into (ser-arn (input :directory-arn)) #:http.request.field{:name "DirectoryArn", :shape "Arn", :location "header", :location-name "x-amz-data-partition"})], :body [(clojure.core/into (ser-object-reference (input :object-reference)) #:http.request.field{:name "ObjectReference", :shape "ObjectReference"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-number-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "NumberResults"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "Arn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/declare deser-batch-update-object-attributes-response)

(clojure.core/declare deser-facet-name)

(clojure.core/declare deser-batch-read-successful-response)

(clojure.core/declare deser-object-identifier-and-link-name-tuple)

(clojure.core/declare deser-policy-attachment)

(clojure.core/declare deser-batch-attach-typed-link-response)

(clojure.core/declare deser-schema-facet)

(clojure.core/declare deser-batch-list-index-response)

(clojure.core/declare deser-batch-list-attached-indices-response)

(clojure.core/declare deser-batch-write-operation-response-list)

(clojure.core/declare deser-facet-attribute)

(clojure.core/declare deser-typed-attribute-value)

(clojure.core/declare deser-facet-attribute-definition)

(clojure.core/declare deser-object-identifier-and-link-name-list)

(clojure.core/declare deser-facet-attribute-list)

(clojure.core/declare deser-datetime-attribute-value)

(clojure.core/declare deser-batch-list-object-policies-response)

(clojure.core/declare deser-number-attribute-value)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-required-attribute-behavior)

(clojure.core/declare deser-typed-link-name)

(clojure.core/declare deser-batch-read-exception)

(clojure.core/declare deser-batch-delete-object-response)

(clojure.core/declare deser-typed-link-attribute-definition-list)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-facet-attribute-type)

(clojure.core/declare deser-boolean-attribute-value)

(clojure.core/declare deser-policy-attachment-list)

(clojure.core/declare deser-batch-list-object-parent-paths-response)

(clojure.core/declare deser-schema-json-document)

(clojure.core/declare deser-batch-write-exception-type)

(clojure.core/declare deser-selector-object-reference)

(clojure.core/declare deser-typed-link-name-list)

(clojure.core/declare deser-rule-map)

(clojure.core/declare deser-batch-read-operation-response-list)

(clojure.core/declare deser-batch-write-operation-response)

(clojure.core/declare deser-arns)

(clojure.core/declare deser-batch-attach-to-index-response)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-batch-get-link-attributes-response)

(clojure.core/declare deser-attribute-key-and-value-list)

(clojure.core/declare deser-date)

(clojure.core/declare deser-batch-get-object-attributes-response)

(clojure.core/declare deser-directory)

(clojure.core/declare deser-typed-link-specifier)

(clojure.core/declare deser-policy-to-path)

(clojure.core/declare deser-typed-link-specifier-list)

(clojure.core/declare deser-batch-attach-object-response)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-batch-list-object-children-response)

(clojure.core/declare deser-binary-attribute-value)

(clojure.core/declare deser-batch-list-policy-attachments-response)

(clojure.core/declare deser-path-to-object-identifiers-list)

(clojure.core/declare deser-batch-add-facet-to-object-response)

(clojure.core/declare deser-batch-operation-index)

(clojure.core/declare deser-attribute-name-and-value-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-attribute-name-and-value)

(clojure.core/declare deser-facet)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-object-reference)

(clojure.core/declare deser-attribute-key)

(clojure.core/declare deser-bool)

(clojure.core/declare deser-attribute-name-list)

(clojure.core/declare deser-batch-detach-typed-link-response)

(clojure.core/declare deser-directory-arn)

(clojure.core/declare deser-rule-parameter-value)

(clojure.core/declare deser-object-identifier-to-link-name-map)

(clojure.core/declare deser-batch-create-object-response)

(clojure.core/declare deser-batch-detach-from-index-response)

(clojure.core/declare deser-batch-remove-facet-from-object-response)

(clojure.core/declare deser-batch-attach-policy-response)

(clojure.core/declare deser-batch-list-incoming-typed-links-response)

(clojure.core/declare deser-index-attachment)

(clojure.core/declare deser-link-name-to-object-identifier-map)

(clojure.core/declare deser-typed-link-schema-and-facet-name)

(clojure.core/declare deser-path-string)

(clojure.core/declare deser-rule)

(clojure.core/declare deser-policy-to-path-list)

(clojure.core/declare deser-rule-parameter-key)

(clojure.core/declare deser-path-to-object-identifiers)

(clojure.core/declare deser-batch-create-index-response)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-object-identifier)

(clojure.core/declare deser-directory-list)

(clojure.core/declare deser-batch-read-exception-type)

(clojure.core/declare deser-link-name)

(clojure.core/declare deser-directory-state)

(clojure.core/declare deser-rule-key)

(clojure.core/declare deser-object-type)

(clojure.core/declare deser-object-identifier-list)

(clojure.core/declare deser-batch-list-object-parents-response)

(clojure.core/declare deser-directory-name)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-facet-style)

(clojure.core/declare deser-batch-read-operation-response)

(clojure.core/declare deser-schema-name)

(clojure.core/declare deser-typed-link-attribute-definition)

(clojure.core/declare deser-string-attribute-value)

(clojure.core/declare deser-rule-parameter-map)

(clojure.core/declare deser-batch-list-outgoing-typed-links-response)

(clojure.core/declare deser-batch-detach-object-response)

(clojure.core/declare deser-schema-facet-list)

(clojure.core/declare deser-batch-detach-policy-response)

(clojure.core/declare deser-attribute-key-and-value)

(clojure.core/declare deser-batch-list-object-attributes-response)

(clojure.core/declare deser-policy-type)

(clojure.core/declare deser-batch-get-object-information-response)

(clojure.core/declare deser-facet-attribute-reference)

(clojure.core/declare deser-batch-update-link-attributes-response)

(clojure.core/declare deser-index-attachment-list)

(clojure.core/declare deser-batch-lookup-policy-response)

(clojure.core/declare deser-facet-name-list)

(clojure.core/declare deser-rule-type)

(clojure.core/defn- deser-batch-update-object-attributes-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (input "ObjectIdentifier")))))

(clojure.core/defn- deser-facet-name [input] input)

(clojure.core/defn- deser-batch-read-successful-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ListObjectPolicies") (clojure.core/assoc :list-object-policies (deser-batch-list-object-policies-response (input "ListObjectPolicies"))) (clojure.core/contains? input "ListObjectParentPaths") (clojure.core/assoc :list-object-parent-paths (deser-batch-list-object-parent-paths-response (input "ListObjectParentPaths"))) (clojure.core/contains? input "ListIncomingTypedLinks") (clojure.core/assoc :list-incoming-typed-links (deser-batch-list-incoming-typed-links-response (input "ListIncomingTypedLinks"))) (clojure.core/contains? input "GetObjectAttributes") (clojure.core/assoc :get-object-attributes (deser-batch-get-object-attributes-response (input "GetObjectAttributes"))) (clojure.core/contains? input "GetObjectInformation") (clojure.core/assoc :get-object-information (deser-batch-get-object-information-response (input "GetObjectInformation"))) (clojure.core/contains? input "ListPolicyAttachments") (clojure.core/assoc :list-policy-attachments (deser-batch-list-policy-attachments-response (input "ListPolicyAttachments"))) (clojure.core/contains? input "ListOutgoingTypedLinks") (clojure.core/assoc :list-outgoing-typed-links (deser-batch-list-outgoing-typed-links-response (input "ListOutgoingTypedLinks"))) (clojure.core/contains? input "GetLinkAttributes") (clojure.core/assoc :get-link-attributes (deser-batch-get-link-attributes-response (input "GetLinkAttributes"))) (clojure.core/contains? input "ListObjectAttributes") (clojure.core/assoc :list-object-attributes (deser-batch-list-object-attributes-response (input "ListObjectAttributes"))) (clojure.core/contains? input "ListIndex") (clojure.core/assoc :list-index (deser-batch-list-index-response (input "ListIndex"))) (clojure.core/contains? input "ListObjectChildren") (clojure.core/assoc :list-object-children (deser-batch-list-object-children-response (input "ListObjectChildren"))) (clojure.core/contains? input "ListObjectParents") (clojure.core/assoc :list-object-parents (deser-batch-list-object-parents-response (input "ListObjectParents"))) (clojure.core/contains? input "ListAttachedIndices") (clojure.core/assoc :list-attached-indices (deser-batch-list-attached-indices-response (input "ListAttachedIndices"))) (clojure.core/contains? input "LookupPolicy") (clojure.core/assoc :lookup-policy (deser-batch-lookup-policy-response (input "LookupPolicy")))))

(clojure.core/defn- deser-object-identifier-and-link-name-tuple [input] (clojure.core/cond-> {} (clojure.core/contains? input "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (input "ObjectIdentifier"))) (clojure.core/contains? input "LinkName") (clojure.core/assoc :link-name (deser-link-name (input "LinkName")))))

(clojure.core/defn- deser-policy-attachment [input] (clojure.core/cond-> {} (clojure.core/contains? input "PolicyId") (clojure.core/assoc :policy-id (deser-object-identifier (input "PolicyId"))) (clojure.core/contains? input "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (input "ObjectIdentifier"))) (clojure.core/contains? input "PolicyType") (clojure.core/assoc :policy-type (deser-policy-type (input "PolicyType")))))

(clojure.core/defn- deser-batch-attach-typed-link-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "TypedLinkSpecifier") (clojure.core/assoc :typed-link-specifier (deser-typed-link-specifier (input "TypedLinkSpecifier")))))

(clojure.core/defn- deser-schema-facet [input] (clojure.core/cond-> {} (clojure.core/contains? input "SchemaArn") (clojure.core/assoc :schema-arn (deser-arn (input "SchemaArn"))) (clojure.core/contains? input "FacetName") (clojure.core/assoc :facet-name (deser-facet-name (input "FacetName")))))

(clojure.core/defn- deser-batch-list-index-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "IndexAttachments") (clojure.core/assoc :index-attachments (deser-index-attachment-list (input "IndexAttachments"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-batch-list-attached-indices-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "IndexAttachments") (clojure.core/assoc :index-attachments (deser-index-attachment-list (input "IndexAttachments"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-batch-write-operation-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-write-operation-response coll))) input))

(clojure.core/defn- deser-facet-attribute [input] (clojure.core/cond-> {:name (deser-attribute-name (input "Name"))} (clojure.core/contains? input "AttributeDefinition") (clojure.core/assoc :attribute-definition (deser-facet-attribute-definition (input "AttributeDefinition"))) (clojure.core/contains? input "AttributeReference") (clojure.core/assoc :attribute-reference (deser-facet-attribute-reference (input "AttributeReference"))) (clojure.core/contains? input "RequiredBehavior") (clojure.core/assoc :required-behavior (deser-required-attribute-behavior (input "RequiredBehavior")))))

(clojure.core/defn- deser-typed-attribute-value [input] (clojure.core/cond-> {} (clojure.core/contains? input "StringValue") (clojure.core/assoc :string-value (deser-string-attribute-value (input "StringValue"))) (clojure.core/contains? input "BinaryValue") (clojure.core/assoc :binary-value (deser-binary-attribute-value (input "BinaryValue"))) (clojure.core/contains? input "BooleanValue") (clojure.core/assoc :boolean-value (deser-boolean-attribute-value (input "BooleanValue"))) (clojure.core/contains? input "NumberValue") (clojure.core/assoc :number-value (deser-number-attribute-value (input "NumberValue"))) (clojure.core/contains? input "DatetimeValue") (clojure.core/assoc :datetime-value (deser-datetime-attribute-value (input "DatetimeValue")))))

(clojure.core/defn- deser-facet-attribute-definition [input] (clojure.core/cond-> {:type (deser-facet-attribute-type (input "Type"))} (clojure.core/contains? input "DefaultValue") (clojure.core/assoc :default-value (deser-typed-attribute-value (input "DefaultValue"))) (clojure.core/contains? input "IsImmutable") (clojure.core/assoc :is-immutable (deser-bool (input "IsImmutable"))) (clojure.core/contains? input "Rules") (clojure.core/assoc :rules (deser-rule-map (input "Rules")))))

(clojure.core/defn- deser-object-identifier-and-link-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-object-identifier-and-link-name-tuple coll))) input))

(clojure.core/defn- deser-facet-attribute-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-facet-attribute coll))) input))

(clojure.core/defn- deser-datetime-attribute-value [input] input)

(clojure.core/defn- deser-batch-list-object-policies-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "AttachedPolicyIds") (clojure.core/assoc :attached-policy-ids (deser-object-identifier-list (input "AttachedPolicyIds"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-number-attribute-value [input] input)

(clojure.core/defn- deser-attribute-name [input] input)

(clojure.core/defn- deser-required-attribute-behavior [input] (clojure.core/get {"REQUIRED_ALWAYS" :required-always, "NOT_REQUIRED" :not-required} input))

(clojure.core/defn- deser-typed-link-name [input] input)

(clojure.core/defn- deser-batch-read-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-batch-read-exception-type (input "Type"))) (clojure.core/contains? input "Message") (clojure.core/assoc :message (deser-exception-message (input "Message")))))

(clojure.core/defn- deser-batch-delete-object-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-typed-link-attribute-definition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-typed-link-attribute-definition coll))) input))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-facet-attribute-type [input] (clojure.core/get {"STRING" :string, "BINARY" :binary, "BOOLEAN" :boolean, "NUMBER" :number, "DATETIME" :datetime, "VARIANT" :variant} input))

(clojure.core/defn- deser-boolean-attribute-value [input] input)

(clojure.core/defn- deser-policy-attachment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-attachment coll))) input))

(clojure.core/defn- deser-batch-list-object-parent-paths-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "PathToObjectIdentifiersList") (clojure.core/assoc :path-to-object-identifiers-list (deser-path-to-object-identifiers-list (input "PathToObjectIdentifiersList"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-schema-json-document [input] input)

(clojure.core/defn- deser-batch-write-exception-type [input] (clojure.core/get {"ObjectNotDetachedException" :object-not-detached-exception, "ValidationException" :validation-exception, "DirectoryNotEnabledException" :directory-not-enabled-exception, "UnsupportedIndexTypeException" :unsupported-index-type-exception, "LinkNameAlreadyInUseException" :link-name-already-in-use-exception, "LimitExceededException" :limit-exceeded-exception, "InvalidArnException" :invalid-arn-exception, "NotPolicyException" :not-policy-exception, "ResourceNotFoundException" :resource-not-found-exception, "FacetValidationException" :facet-validation-exception, "AccessDeniedException" :access-denied-exception, "NotIndexException" :not-index-exception, "NotNodeException" :not-node-exception, "IndexedAttributeMissingException" :indexed-attribute-missing-exception, "InvalidAttachmentException" :invalid-attachment-exception, "ObjectAlreadyDetachedException" :object-already-detached-exception, "StillContainsLinksException" :still-contains-links-exception, "InternalServiceException" :internal-service-exception} input))

(clojure.core/defn- deser-selector-object-reference [input] input)

(clojure.core/defn- deser-typed-link-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-typed-link-name coll))) input))

(clojure.core/defn- deser-rule-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-rule-key k) (deser-rule v)])) input))

(clojure.core/defn- deser-batch-read-operation-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-batch-read-operation-response coll))) input))

(clojure.core/defn- deser-batch-write-operation-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "CreateIndex") (clojure.core/assoc :create-index (deser-batch-create-index-response (input "CreateIndex"))) (clojure.core/contains? input "CreateObject") (clojure.core/assoc :create-object (deser-batch-create-object-response (input "CreateObject"))) (clojure.core/contains? input "DetachPolicy") (clojure.core/assoc :detach-policy (deser-batch-detach-policy-response (input "DetachPolicy"))) (clojure.core/contains? input "DetachObject") (clojure.core/assoc :detach-object (deser-batch-detach-object-response (input "DetachObject"))) (clojure.core/contains? input "DetachFromIndex") (clojure.core/assoc :detach-from-index (deser-batch-detach-from-index-response (input "DetachFromIndex"))) (clojure.core/contains? input "AttachObject") (clojure.core/assoc :attach-object (deser-batch-attach-object-response (input "AttachObject"))) (clojure.core/contains? input "UpdateLinkAttributes") (clojure.core/assoc :update-link-attributes (deser-batch-update-link-attributes-response (input "UpdateLinkAttributes"))) (clojure.core/contains? input "AttachToIndex") (clojure.core/assoc :attach-to-index (deser-batch-attach-to-index-response (input "AttachToIndex"))) (clojure.core/contains? input "AttachTypedLink") (clojure.core/assoc :attach-typed-link (deser-batch-attach-typed-link-response (input "AttachTypedLink"))) (clojure.core/contains? input "DetachTypedLink") (clojure.core/assoc :detach-typed-link (deser-batch-detach-typed-link-response (input "DetachTypedLink"))) (clojure.core/contains? input "AddFacetToObject") (clojure.core/assoc :add-facet-to-object (deser-batch-add-facet-to-object-response (input "AddFacetToObject"))) (clojure.core/contains? input "UpdateObjectAttributes") (clojure.core/assoc :update-object-attributes (deser-batch-update-object-attributes-response (input "UpdateObjectAttributes"))) (clojure.core/contains? input "DeleteObject") (clojure.core/assoc :delete-object (deser-batch-delete-object-response (input "DeleteObject"))) (clojure.core/contains? input "AttachPolicy") (clojure.core/assoc :attach-policy (deser-batch-attach-policy-response (input "AttachPolicy"))) (clojure.core/contains? input "RemoveFacetFromObject") (clojure.core/assoc :remove-facet-from-object (deser-batch-remove-facet-from-object-response (input "RemoveFacetFromObject")))))

(clojure.core/defn- deser-arns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-arn coll))) input))

(clojure.core/defn- deser-batch-attach-to-index-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "AttachedObjectIdentifier") (clojure.core/assoc :attached-object-identifier (deser-object-identifier (input "AttachedObjectIdentifier")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-batch-get-link-attributes-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attribute-key-and-value-list (input "Attributes")))))

(clojure.core/defn- deser-attribute-key-and-value-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-key-and-value coll))) input))

(clojure.core/defn- deser-date [input] input)

(clojure.core/defn- deser-batch-get-object-attributes-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attribute-key-and-value-list (input "Attributes")))))

(clojure.core/defn- deser-directory [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-directory-name (input "Name"))) (clojure.core/contains? input "DirectoryArn") (clojure.core/assoc :directory-arn (deser-directory-arn (input "DirectoryArn"))) (clojure.core/contains? input "State") (clojure.core/assoc :state (deser-directory-state (input "State"))) (clojure.core/contains? input "CreationDateTime") (clojure.core/assoc :creation-date-time (deser-date (input "CreationDateTime")))))

(clojure.core/defn- deser-typed-link-specifier [input] (clojure.core/cond-> {:typed-link-facet (deser-typed-link-schema-and-facet-name (input "TypedLinkFacet")), :source-object-reference (deser-object-reference (input "SourceObjectReference")), :target-object-reference (deser-object-reference (input "TargetObjectReference")), :identity-attribute-values (deser-attribute-name-and-value-list (input "IdentityAttributeValues"))}))

(clojure.core/defn- deser-policy-to-path [input] (clojure.core/cond-> {} (clojure.core/contains? input "Path") (clojure.core/assoc :path (deser-path-string (input "Path"))) (clojure.core/contains? input "Policies") (clojure.core/assoc :policies (deser-policy-attachment-list (input "Policies")))))

(clojure.core/defn- deser-typed-link-specifier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-typed-link-specifier coll))) input))

(clojure.core/defn- deser-batch-attach-object-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "attachedObjectIdentifier") (clojure.core/assoc :attached-object-identifier (deser-object-identifier (input "attachedObjectIdentifier")))))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-batch-list-object-children-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Children") (clojure.core/assoc :children (deser-link-name-to-object-identifier-map (input "Children"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-binary-attribute-value [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-batch-list-policy-attachments-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ObjectIdentifiers") (clojure.core/assoc :object-identifiers (deser-object-identifier-list (input "ObjectIdentifiers"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-path-to-object-identifiers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-path-to-object-identifiers coll))) input))

(clojure.core/defn- deser-batch-add-facet-to-object-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-batch-operation-index [input] input)

(clojure.core/defn- deser-attribute-name-and-value-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-name-and-value coll))) input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-attribute-name-and-value [input] (clojure.core/cond-> {:attribute-name (deser-attribute-name (input "AttributeName")), :value (deser-typed-attribute-value (input "Value"))}))

(clojure.core/defn- deser-facet [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-facet-name (input "Name"))) (clojure.core/contains? input "ObjectType") (clojure.core/assoc :object-type (deser-object-type (input "ObjectType"))) (clojure.core/contains? input "FacetStyle") (clojure.core/assoc :facet-style (deser-facet-style (input "FacetStyle")))))

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-object-reference [input] (clojure.core/cond-> {} (clojure.core/contains? input "Selector") (clojure.core/assoc :selector (deser-selector-object-reference (input "Selector")))))

(clojure.core/defn- deser-attribute-key [input] (clojure.core/cond-> {:schema-arn (deser-arn (input "SchemaArn")), :facet-name (deser-facet-name (input "FacetName")), :name (deser-attribute-name (input "Name"))}))

(clojure.core/defn- deser-bool [input] input)

(clojure.core/defn- deser-attribute-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-name coll))) input))

(clojure.core/defn- deser-batch-detach-typed-link-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-directory-arn [input] input)

(clojure.core/defn- deser-rule-parameter-value [input] input)

(clojure.core/defn- deser-object-identifier-to-link-name-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-object-identifier k) (deser-link-name v)])) input))

(clojure.core/defn- deser-batch-create-object-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (input "ObjectIdentifier")))))

(clojure.core/defn- deser-batch-detach-from-index-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "DetachedObjectIdentifier") (clojure.core/assoc :detached-object-identifier (deser-object-identifier (input "DetachedObjectIdentifier")))))

(clojure.core/defn- deser-batch-remove-facet-from-object-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-batch-attach-policy-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-batch-list-incoming-typed-links-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "LinkSpecifiers") (clojure.core/assoc :link-specifiers (deser-typed-link-specifier-list (input "LinkSpecifiers"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-index-attachment [input] (clojure.core/cond-> {} (clojure.core/contains? input "IndexedAttributes") (clojure.core/assoc :indexed-attributes (deser-attribute-key-and-value-list (input "IndexedAttributes"))) (clojure.core/contains? input "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (input "ObjectIdentifier")))))

(clojure.core/defn- deser-link-name-to-object-identifier-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-link-name k) (deser-object-identifier v)])) input))

(clojure.core/defn- deser-typed-link-schema-and-facet-name [input] (clojure.core/cond-> {:schema-arn (deser-arn (input "SchemaArn")), :typed-link-name (deser-typed-link-name (input "TypedLinkName"))}))

(clojure.core/defn- deser-path-string [input] input)

(clojure.core/defn- deser-rule [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-rule-type (input "Type"))) (clojure.core/contains? input "Parameters") (clojure.core/assoc :parameters (deser-rule-parameter-map (input "Parameters")))))

(clojure.core/defn- deser-policy-to-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy-to-path coll))) input))

(clojure.core/defn- deser-rule-parameter-key [input] input)

(clojure.core/defn- deser-path-to-object-identifiers [input] (clojure.core/cond-> {} (clojure.core/contains? input "Path") (clojure.core/assoc :path (deser-path-string (input "Path"))) (clojure.core/contains? input "ObjectIdentifiers") (clojure.core/assoc :object-identifiers (deser-object-identifier-list (input "ObjectIdentifiers")))))

(clojure.core/defn- deser-batch-create-index-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (input "ObjectIdentifier")))))

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-object-identifier [input] input)

(clojure.core/defn- deser-directory-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-directory coll))) input))

(clojure.core/defn- deser-batch-read-exception-type [input] (clojure.core/get {"ValidationException" :validation-exception, "DirectoryNotEnabledException" :directory-not-enabled-exception, "LimitExceededException" :limit-exceeded-exception, "InvalidNextTokenException" :invalid-next-token-exception, "InvalidArnException" :invalid-arn-exception, "NotPolicyException" :not-policy-exception, "CannotListParentOfRootException" :cannot-list-parent-of-root-exception, "ResourceNotFoundException" :resource-not-found-exception, "FacetValidationException" :facet-validation-exception, "AccessDeniedException" :access-denied-exception, "NotIndexException" :not-index-exception, "NotNodeException" :not-node-exception, "InternalServiceException" :internal-service-exception} input))

(clojure.core/defn- deser-link-name [input] input)

(clojure.core/defn- deser-directory-state [input] (clojure.core/get {"ENABLED" :enabled, "DISABLED" :disabled, "DELETED" :deleted} input))

(clojure.core/defn- deser-rule-key [input] input)

(clojure.core/defn- deser-object-type [input] (clojure.core/get {"NODE" :node, "LEAF_NODE" :leaf-node, "POLICY" :policy, "INDEX" :index} input))

(clojure.core/defn- deser-object-identifier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-object-identifier coll))) input))

(clojure.core/defn- deser-batch-list-object-parents-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "ParentLinks") (clojure.core/assoc :parent-links (deser-object-identifier-and-link-name-list (input "ParentLinks"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-directory-name [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-facet-style [input] (clojure.core/get {"STATIC" :static, "DYNAMIC" :dynamic} input))

(clojure.core/defn- deser-batch-read-operation-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "SuccessfulResponse") (clojure.core/assoc :successful-response (deser-batch-read-successful-response (input "SuccessfulResponse"))) (clojure.core/contains? input "ExceptionResponse") (clojure.core/assoc :exception-response (deser-batch-read-exception (input "ExceptionResponse")))))

(clojure.core/defn- deser-schema-name [input] input)

(clojure.core/defn- deser-typed-link-attribute-definition [input] (clojure.core/cond-> {:name (deser-attribute-name (input "Name")), :type (deser-facet-attribute-type (input "Type")), :required-behavior (deser-required-attribute-behavior (input "RequiredBehavior"))} (clojure.core/contains? input "DefaultValue") (clojure.core/assoc :default-value (deser-typed-attribute-value (input "DefaultValue"))) (clojure.core/contains? input "IsImmutable") (clojure.core/assoc :is-immutable (deser-bool (input "IsImmutable"))) (clojure.core/contains? input "Rules") (clojure.core/assoc :rules (deser-rule-map (input "Rules")))))

(clojure.core/defn- deser-string-attribute-value [input] input)

(clojure.core/defn- deser-rule-parameter-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-rule-parameter-key k) (deser-rule-parameter-value v)])) input))

(clojure.core/defn- deser-batch-list-outgoing-typed-links-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "TypedLinkSpecifiers") (clojure.core/assoc :typed-link-specifiers (deser-typed-link-specifier-list (input "TypedLinkSpecifiers"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-batch-detach-object-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "detachedObjectIdentifier") (clojure.core/assoc :detached-object-identifier (deser-object-identifier (input "detachedObjectIdentifier")))))

(clojure.core/defn- deser-schema-facet-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-schema-facet coll))) input))

(clojure.core/defn- deser-batch-detach-policy-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-attribute-key-and-value [input] (clojure.core/cond-> {:key (deser-attribute-key (input "Key")), :value (deser-typed-attribute-value (input "Value"))}))

(clojure.core/defn- deser-batch-list-object-attributes-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "Attributes") (clojure.core/assoc :attributes (deser-attribute-key-and-value-list (input "Attributes"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-policy-type [input] input)

(clojure.core/defn- deser-batch-get-object-information-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "SchemaFacets") (clojure.core/assoc :schema-facets (deser-schema-facet-list (input "SchemaFacets"))) (clojure.core/contains? input "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (input "ObjectIdentifier")))))

(clojure.core/defn- deser-facet-attribute-reference [input] (clojure.core/cond-> {:target-facet-name (deser-facet-name (input "TargetFacetName")), :target-attribute-name (deser-attribute-name (input "TargetAttributeName"))}))

(clojure.core/defn- deser-batch-update-link-attributes-response [input] (clojure.core/cond-> {}))

(clojure.core/defn- deser-index-attachment-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-index-attachment coll))) input))

(clojure.core/defn- deser-batch-lookup-policy-response [input] (clojure.core/cond-> {} (clojure.core/contains? input "PolicyToPathList") (clojure.core/assoc :policy-to-path-list (deser-policy-to-path-list (input "PolicyToPathList"))) (clojure.core/contains? input "NextToken") (clojure.core/assoc :next-token (deser-next-token (input "NextToken")))))

(clojure.core/defn- deser-facet-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-facet-name coll))) input))

(clojure.core/defn- deser-rule-type [input] (clojure.core/get {"BINARY_LENGTH" :binary-length, "NUMBER_COMPARISON" :number-comparison, "STRING_FROM_SET" :string-from-set, "STRING_LENGTH" :string-length} input))

(clojure.core/defn- response-invalid-rule-exception ([input] (response-invalid-rule-exception nil input)) ([resultWrapper91383 input] (clojure.core/let [rawinput91382 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91384 {"Message" (rawinput91382 "Message")}] (clojure.core/cond-> {} (letvar91384 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91384 ["Message"])))))))

(clojure.core/defn- response-batch-write-exception ([input] (response-batch-write-exception nil input)) ([resultWrapper91386 input] (clojure.core/let [rawinput91385 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91387 {"Index" (rawinput91385 "Index"), "Type" (rawinput91385 "Type"), "Message" (rawinput91385 "Message")}] (clojure.core/cond-> {} (letvar91387 "Index") (clojure.core/assoc :index (deser-batch-operation-index (clojure.core/get-in letvar91387 ["Index"]))) (letvar91387 "Type") (clojure.core/assoc :type (deser-batch-write-exception-type (clojure.core/get-in letvar91387 ["Type"]))) (letvar91387 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91387 ["Message"])))))))

(clojure.core/defn- response-list-object-children-response ([input] (response-list-object-children-response nil input)) ([resultWrapper91389 input] (clojure.core/let [rawinput91388 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91390 {"Children" (rawinput91388 "Children"), "NextToken" (rawinput91388 "NextToken")}] (clojure.core/cond-> {} (letvar91390 "Children") (clojure.core/assoc :children (deser-link-name-to-object-identifier-map (clojure.core/get-in letvar91390 ["Children"]))) (letvar91390 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91390 ["NextToken"])))))))

(clojure.core/defn- response-object-not-detached-exception ([input] (response-object-not-detached-exception nil input)) ([resultWrapper91392 input] (clojure.core/let [rawinput91391 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91393 {"Message" (rawinput91391 "Message")}] (clojure.core/cond-> {} (letvar91393 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91393 ["Message"])))))))

(clojure.core/defn- response-put-schema-from-json-response ([input] (response-put-schema-from-json-response nil input)) ([resultWrapper91395 input] (clojure.core/let [rawinput91394 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91396 {"Arn" (rawinput91394 "Arn")}] (clojure.core/cond-> {} (letvar91396 "Arn") (clojure.core/assoc :arn (deser-arn (clojure.core/get-in letvar91396 ["Arn"])))))))

(clojure.core/defn- response-invalid-facet-update-exception ([input] (response-invalid-facet-update-exception nil input)) ([resultWrapper91398 input] (clojure.core/let [rawinput91397 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91399 {"Message" (rawinput91397 "Message")}] (clojure.core/cond-> {} (letvar91399 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91399 ["Message"])))))))

(clojure.core/defn- response-validation-exception ([input] (response-validation-exception nil input)) ([resultWrapper91401 input] (clojure.core/let [rawinput91400 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91402 {"Message" (rawinput91400 "Message")}] (clojure.core/cond-> {} (letvar91402 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91402 ["Message"])))))))

(clojure.core/defn- response-list-index-response ([input] (response-list-index-response nil input)) ([resultWrapper91404 input] (clojure.core/let [rawinput91403 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91405 {"IndexAttachments" (rawinput91403 "IndexAttachments"), "NextToken" (rawinput91403 "NextToken")}] (clojure.core/cond-> {} (letvar91405 "IndexAttachments") (clojure.core/assoc :index-attachments (deser-index-attachment-list (clojure.core/get-in letvar91405 ["IndexAttachments"]))) (letvar91405 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91405 ["NextToken"])))))))

(clojure.core/defn- response-get-object-information-response ([input] (response-get-object-information-response nil input)) ([resultWrapper91407 input] (clojure.core/let [rawinput91406 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91408 {"SchemaFacets" (rawinput91406 "SchemaFacets"), "ObjectIdentifier" (rawinput91406 "ObjectIdentifier")}] (clojure.core/cond-> {} (letvar91408 "SchemaFacets") (clojure.core/assoc :schema-facets (deser-schema-facet-list (clojure.core/get-in letvar91408 ["SchemaFacets"]))) (letvar91408 "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (clojure.core/get-in letvar91408 ["ObjectIdentifier"])))))))

(clojure.core/defn- response-list-object-parents-response ([input] (response-list-object-parents-response nil input)) ([resultWrapper91410 input] (clojure.core/let [rawinput91409 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91411 {"Parents" (rawinput91409 "Parents"), "NextToken" (rawinput91409 "NextToken"), "ParentLinks" (rawinput91409 "ParentLinks")}] (clojure.core/cond-> {} (letvar91411 "Parents") (clojure.core/assoc :parents (deser-object-identifier-to-link-name-map (clojure.core/get-in letvar91411 ["Parents"]))) (letvar91411 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91411 ["NextToken"]))) (letvar91411 "ParentLinks") (clojure.core/assoc :parent-links (deser-object-identifier-and-link-name-list (clojure.core/get-in letvar91411 ["ParentLinks"])))))))

(clojure.core/defn- response-get-link-attributes-response ([input] (response-get-link-attributes-response nil input)) ([resultWrapper91413 input] (clojure.core/let [rawinput91412 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91414 {"Attributes" (rawinput91412 "Attributes")}] (clojure.core/cond-> {} (letvar91414 "Attributes") (clojure.core/assoc :attributes (deser-attribute-key-and-value-list (clojure.core/get-in letvar91414 ["Attributes"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper91416 input] (clojure.core/let [rawinput91415 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91417 {"Tags" (rawinput91415 "Tags"), "NextToken" (rawinput91415 "NextToken")}] (clojure.core/cond-> {} (letvar91417 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar91417 ["Tags"]))) (letvar91417 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91417 ["NextToken"])))))))

(clojure.core/defn- response-directory-not-enabled-exception ([input] (response-directory-not-enabled-exception nil input)) ([resultWrapper91419 input] (clojure.core/let [rawinput91418 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91420 {"Message" (rawinput91418 "Message")}] (clojure.core/cond-> {} (letvar91420 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91420 ["Message"])))))))

(clojure.core/defn- response-delete-typed-link-facet-response ([input] (response-delete-typed-link-facet-response nil input)) ([resultWrapper91422 input] (clojure.core/let [rawinput91421 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91423 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-typed-link-facet-names-response ([input] (response-list-typed-link-facet-names-response nil input)) ([resultWrapper91425 input] (clojure.core/let [rawinput91424 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91426 {"FacetNames" (rawinput91424 "FacetNames"), "NextToken" (rawinput91424 "NextToken")}] (clojure.core/cond-> {} (letvar91426 "FacetNames") (clojure.core/assoc :facet-names (deser-typed-link-name-list (clojure.core/get-in letvar91426 ["FacetNames"]))) (letvar91426 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91426 ["NextToken"])))))))

(clojure.core/defn- response-get-object-attributes-response ([input] (response-get-object-attributes-response nil input)) ([resultWrapper91428 input] (clojure.core/let [rawinput91427 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91429 {"Attributes" (rawinput91427 "Attributes")}] (clojure.core/cond-> {} (letvar91429 "Attributes") (clojure.core/assoc :attributes (deser-attribute-key-and-value-list (clojure.core/get-in letvar91429 ["Attributes"])))))))

(clojure.core/defn- response-unsupported-index-type-exception ([input] (response-unsupported-index-type-exception nil input)) ([resultWrapper91431 input] (clojure.core/let [rawinput91430 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91432 {"Message" (rawinput91430 "Message")}] (clojure.core/cond-> {} (letvar91432 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91432 ["Message"])))))))

(clojure.core/defn- response-get-facet-response ([input] (response-get-facet-response nil input)) ([resultWrapper91434 input] (clojure.core/let [rawinput91433 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91435 {"Facet" (rawinput91433 "Facet")}] (clojure.core/cond-> {} (letvar91435 "Facet") (clojure.core/assoc :facet (deser-facet (clojure.core/get-in letvar91435 ["Facet"])))))))

(clojure.core/defn- response-publish-schema-response ([input] (response-publish-schema-response nil input)) ([resultWrapper91437 input] (clojure.core/let [rawinput91436 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91438 {"PublishedSchemaArn" (rawinput91436 "PublishedSchemaArn")}] (clojure.core/cond-> {} (letvar91438 "PublishedSchemaArn") (clojure.core/assoc :published-schema-arn (deser-arn (clojure.core/get-in letvar91438 ["PublishedSchemaArn"])))))))

(clojure.core/defn- response-delete-directory-response ([input] (response-delete-directory-response nil input)) ([resultWrapper91440 input] (clojure.core/let [rawinput91439 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91441 {"DirectoryArn" (rawinput91439 "DirectoryArn")}] (clojure.core/cond-> {:directory-arn (deser-arn (clojure.core/get-in letvar91441 ["DirectoryArn"]))}))))

(clojure.core/defn- response-list-outgoing-typed-links-response ([input] (response-list-outgoing-typed-links-response nil input)) ([resultWrapper91443 input] (clojure.core/let [rawinput91442 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91444 {"TypedLinkSpecifiers" (rawinput91442 "TypedLinkSpecifiers"), "NextToken" (rawinput91442 "NextToken")}] (clojure.core/cond-> {} (letvar91444 "TypedLinkSpecifiers") (clojure.core/assoc :typed-link-specifiers (deser-typed-link-specifier-list (clojure.core/get-in letvar91444 ["TypedLinkSpecifiers"]))) (letvar91444 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91444 ["NextToken"])))))))

(clojure.core/defn- response-list-object-parent-paths-response ([input] (response-list-object-parent-paths-response nil input)) ([resultWrapper91446 input] (clojure.core/let [rawinput91445 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91447 {"PathToObjectIdentifiersList" (rawinput91445 "PathToObjectIdentifiersList"), "NextToken" (rawinput91445 "NextToken")}] (clojure.core/cond-> {} (letvar91447 "PathToObjectIdentifiersList") (clojure.core/assoc :path-to-object-identifiers-list (deser-path-to-object-identifiers-list (clojure.core/get-in letvar91447 ["PathToObjectIdentifiersList"]))) (letvar91447 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91447 ["NextToken"])))))))

(clojure.core/defn- response-attach-to-index-response ([input] (response-attach-to-index-response nil input)) ([resultWrapper91449 input] (clojure.core/let [rawinput91448 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91450 {"AttachedObjectIdentifier" (rawinput91448 "AttachedObjectIdentifier")}] (clojure.core/cond-> {} (letvar91450 "AttachedObjectIdentifier") (clojure.core/assoc :attached-object-identifier (deser-object-identifier (clojure.core/get-in letvar91450 ["AttachedObjectIdentifier"])))))))

(clojure.core/defn- response-invalid-schema-doc-exception ([input] (response-invalid-schema-doc-exception nil input)) ([resultWrapper91452 input] (clojure.core/let [rawinput91451 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91453 {"Message" (rawinput91451 "Message")}] (clojure.core/cond-> {} (letvar91453 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91453 ["Message"])))))))

(clojure.core/defn- response-attach-typed-link-response ([input] (response-attach-typed-link-response nil input)) ([resultWrapper91455 input] (clojure.core/let [rawinput91454 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91456 {"TypedLinkSpecifier" (rawinput91454 "TypedLinkSpecifier")}] (clojure.core/cond-> {} (letvar91456 "TypedLinkSpecifier") (clojure.core/assoc :typed-link-specifier (deser-typed-link-specifier (clojure.core/get-in letvar91456 ["TypedLinkSpecifier"])))))))

(clojure.core/defn- response-link-name-already-in-use-exception ([input] (response-link-name-already-in-use-exception nil input)) ([resultWrapper91458 input] (clojure.core/let [rawinput91457 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91459 {"Message" (rawinput91457 "Message")}] (clojure.core/cond-> {} (letvar91459 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91459 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper91461 input] (clojure.core/let [rawinput91460 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91462 {"Message" (rawinput91460 "Message")}] (clojure.core/cond-> {} (letvar91462 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91462 ["Message"])))))))

(clojure.core/defn- response-facet-in-use-exception ([input] (response-facet-in-use-exception nil input)) ([resultWrapper91464 input] (clojure.core/let [rawinput91463 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91465 {"Message" (rawinput91463 "Message")}] (clojure.core/cond-> {} (letvar91465 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91465 ["Message"])))))))

(clojure.core/defn- response-list-object-attributes-response ([input] (response-list-object-attributes-response nil input)) ([resultWrapper91467 input] (clojure.core/let [rawinput91466 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91468 {"Attributes" (rawinput91466 "Attributes"), "NextToken" (rawinput91466 "NextToken")}] (clojure.core/cond-> {} (letvar91468 "Attributes") (clojure.core/assoc :attributes (deser-attribute-key-and-value-list (clojure.core/get-in letvar91468 ["Attributes"]))) (letvar91468 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91468 ["NextToken"])))))))

(clojure.core/defn- response-create-object-response ([input] (response-create-object-response nil input)) ([resultWrapper91470 input] (clojure.core/let [rawinput91469 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91471 {"ObjectIdentifier" (rawinput91469 "ObjectIdentifier")}] (clojure.core/cond-> {} (letvar91471 "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (clojure.core/get-in letvar91471 ["ObjectIdentifier"])))))))

(clojure.core/defn- response-update-object-attributes-response ([input] (response-update-object-attributes-response nil input)) ([resultWrapper91473 input] (clojure.core/let [rawinput91472 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91474 {"ObjectIdentifier" (rawinput91472 "ObjectIdentifier")}] (clojure.core/cond-> {} (letvar91474 "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (clojure.core/get-in letvar91474 ["ObjectIdentifier"])))))))

(clojure.core/defn- response-lookup-policy-response ([input] (response-lookup-policy-response nil input)) ([resultWrapper91476 input] (clojure.core/let [rawinput91475 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91477 {"PolicyToPathList" (rawinput91475 "PolicyToPathList"), "NextToken" (rawinput91475 "NextToken")}] (clojure.core/cond-> {} (letvar91477 "PolicyToPathList") (clojure.core/assoc :policy-to-path-list (deser-policy-to-path-list (clojure.core/get-in letvar91477 ["PolicyToPathList"]))) (letvar91477 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91477 ["NextToken"])))))))

(clojure.core/defn- response-invalid-tagging-request-exception ([input] (response-invalid-tagging-request-exception nil input)) ([resultWrapper91479 input] (clojure.core/let [rawinput91478 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91480 {"Message" (rawinput91478 "Message")}] (clojure.core/cond-> {} (letvar91480 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91480 ["Message"])))))))

(clojure.core/defn- response-create-facet-response ([input] (response-create-facet-response nil input)) ([resultWrapper91482 input] (clojure.core/let [rawinput91481 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91483 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detach-from-index-response ([input] (response-detach-from-index-response nil input)) ([resultWrapper91485 input] (clojure.core/let [rawinput91484 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91486 {"DetachedObjectIdentifier" (rawinput91484 "DetachedObjectIdentifier")}] (clojure.core/cond-> {} (letvar91486 "DetachedObjectIdentifier") (clojure.core/assoc :detached-object-identifier (deser-object-identifier (clojure.core/get-in letvar91486 ["DetachedObjectIdentifier"])))))))

(clojure.core/defn- response-upgrade-published-schema-response ([input] (response-upgrade-published-schema-response nil input)) ([resultWrapper91488 input] (clojure.core/let [rawinput91487 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91489 {"UpgradedSchemaArn" (rawinput91487 "UpgradedSchemaArn")}] (clojure.core/cond-> {} (letvar91489 "UpgradedSchemaArn") (clojure.core/assoc :upgraded-schema-arn (deser-arn (clojure.core/get-in letvar91489 ["UpgradedSchemaArn"])))))))

(clojure.core/defn- response-update-link-attributes-response ([input] (response-update-link-attributes-response nil input)) ([resultWrapper91491 input] (clojure.core/let [rawinput91490 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91492 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-typed-link-facet-response ([input] (response-update-typed-link-facet-response nil input)) ([resultWrapper91494 input] (clojure.core/let [rawinput91493 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91495 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-batch-write-response ([input] (response-batch-write-response nil input)) ([resultWrapper91497 input] (clojure.core/let [rawinput91496 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91498 {"Responses" (rawinput91496 "Responses")}] (clojure.core/cond-> {} (letvar91498 "Responses") (clojure.core/assoc :responses (deser-batch-write-operation-response-list (clojure.core/get-in letvar91498 ["Responses"])))))))

(clojure.core/defn- response-directory-not-disabled-exception ([input] (response-directory-not-disabled-exception nil input)) ([resultWrapper91500 input] (clojure.core/let [rawinput91499 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91501 {"Message" (rawinput91499 "Message")}] (clojure.core/cond-> {} (letvar91501 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91501 ["Message"])))))))

(clojure.core/defn- response-get-applied-schema-version-response ([input] (response-get-applied-schema-version-response nil input)) ([resultWrapper91503 input] (clojure.core/let [rawinput91502 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91504 {"AppliedSchemaArn" (rawinput91502 "AppliedSchemaArn")}] (clojure.core/cond-> {} (letvar91504 "AppliedSchemaArn") (clojure.core/assoc :applied-schema-arn (deser-arn (clojure.core/get-in letvar91504 ["AppliedSchemaArn"])))))))

(clojure.core/defn- response-list-development-schema-arns-response ([input] (response-list-development-schema-arns-response nil input)) ([resultWrapper91506 input] (clojure.core/let [rawinput91505 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91507 {"SchemaArns" (rawinput91505 "SchemaArns"), "NextToken" (rawinput91505 "NextToken")}] (clojure.core/cond-> {} (letvar91507 "SchemaArns") (clojure.core/assoc :schema-arns (deser-arns (clojure.core/get-in letvar91507 ["SchemaArns"]))) (letvar91507 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91507 ["NextToken"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper91509 input] (clojure.core/let [rawinput91508 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91510 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper91512 input] (clojure.core/let [rawinput91511 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91513 {"Message" (rawinput91511 "Message")}] (clojure.core/cond-> {} (letvar91513 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91513 ["Message"])))))))

(clojure.core/defn- response-update-schema-response ([input] (response-update-schema-response nil input)) ([resultWrapper91515 input] (clojure.core/let [rawinput91514 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91516 {"SchemaArn" (rawinput91514 "SchemaArn")}] (clojure.core/cond-> {} (letvar91516 "SchemaArn") (clojure.core/assoc :schema-arn (deser-arn (clojure.core/get-in letvar91516 ["SchemaArn"])))))))

(clojure.core/defn- response-directory-deleted-exception ([input] (response-directory-deleted-exception nil input)) ([resultWrapper91518 input] (clojure.core/let [rawinput91517 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91519 {"Message" (rawinput91517 "Message")}] (clojure.core/cond-> {} (letvar91519 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91519 ["Message"])))))))

(clojure.core/defn- response-create-index-response ([input] (response-create-index-response nil input)) ([resultWrapper91521 input] (clojure.core/let [rawinput91520 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91522 {"ObjectIdentifier" (rawinput91520 "ObjectIdentifier")}] (clojure.core/cond-> {} (letvar91522 "ObjectIdentifier") (clojure.core/assoc :object-identifier (deser-object-identifier (clojure.core/get-in letvar91522 ["ObjectIdentifier"])))))))

(clojure.core/defn- response-detach-object-response ([input] (response-detach-object-response nil input)) ([resultWrapper91524 input] (clojure.core/let [rawinput91523 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91525 {"DetachedObjectIdentifier" (rawinput91523 "DetachedObjectIdentifier")}] (clojure.core/cond-> {} (letvar91525 "DetachedObjectIdentifier") (clojure.core/assoc :detached-object-identifier (deser-object-identifier (clojure.core/get-in letvar91525 ["DetachedObjectIdentifier"])))))))

(clojure.core/defn- response-invalid-arn-exception ([input] (response-invalid-arn-exception nil input)) ([resultWrapper91527 input] (clojure.core/let [rawinput91526 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91528 {"Message" (rawinput91526 "Message")}] (clojure.core/cond-> {} (letvar91528 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91528 ["Message"])))))))

(clojure.core/defn- response-facet-not-found-exception ([input] (response-facet-not-found-exception nil input)) ([resultWrapper91530 input] (clojure.core/let [rawinput91529 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91531 {"Message" (rawinput91529 "Message")}] (clojure.core/cond-> {} (letvar91531 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91531 ["Message"])))))))

(clojure.core/defn- response-not-policy-exception ([input] (response-not-policy-exception nil input)) ([resultWrapper91533 input] (clojure.core/let [rawinput91532 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91534 {"Message" (rawinput91532 "Message")}] (clojure.core/cond-> {} (letvar91534 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91534 ["Message"])))))))

(clojure.core/defn- response-attach-object-response ([input] (response-attach-object-response nil input)) ([resultWrapper91536 input] (clojure.core/let [rawinput91535 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91537 {"AttachedObjectIdentifier" (rawinput91535 "AttachedObjectIdentifier")}] (clojure.core/cond-> {} (letvar91537 "AttachedObjectIdentifier") (clojure.core/assoc :attached-object-identifier (deser-object-identifier (clojure.core/get-in letvar91537 ["AttachedObjectIdentifier"])))))))

(clojure.core/defn- response-cannot-list-parent-of-root-exception ([input] (response-cannot-list-parent-of-root-exception nil input)) ([resultWrapper91539 input] (clojure.core/let [rawinput91538 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91540 {"Message" (rawinput91538 "Message")}] (clojure.core/cond-> {} (letvar91540 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91540 ["Message"])))))))

(clojure.core/defn- response-list-facet-names-response ([input] (response-list-facet-names-response nil input)) ([resultWrapper91542 input] (clojure.core/let [rawinput91541 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91543 {"FacetNames" (rawinput91541 "FacetNames"), "NextToken" (rawinput91541 "NextToken")}] (clojure.core/cond-> {} (letvar91543 "FacetNames") (clojure.core/assoc :facet-names (deser-facet-name-list (clojure.core/get-in letvar91543 ["FacetNames"]))) (letvar91543 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91543 ["NextToken"])))))))

(clojure.core/defn- response-list-object-policies-response ([input] (response-list-object-policies-response nil input)) ([resultWrapper91545 input] (clojure.core/let [rawinput91544 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91546 {"AttachedPolicyIds" (rawinput91544 "AttachedPolicyIds"), "NextToken" (rawinput91544 "NextToken")}] (clojure.core/cond-> {} (letvar91546 "AttachedPolicyIds") (clojure.core/assoc :attached-policy-ids (deser-object-identifier-list (clojure.core/get-in letvar91546 ["AttachedPolicyIds"]))) (letvar91546 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91546 ["NextToken"])))))))

(clojure.core/defn- response-create-schema-response ([input] (response-create-schema-response nil input)) ([resultWrapper91548 input] (clojure.core/let [rawinput91547 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91549 {"SchemaArn" (rawinput91547 "SchemaArn")}] (clojure.core/cond-> {} (letvar91549 "SchemaArn") (clojure.core/assoc :schema-arn (deser-arn (clojure.core/get-in letvar91549 ["SchemaArn"])))))))

(clojure.core/defn- response-apply-schema-response ([input] (response-apply-schema-response nil input)) ([resultWrapper91551 input] (clojure.core/let [rawinput91550 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91552 {"AppliedSchemaArn" (rawinput91550 "AppliedSchemaArn"), "DirectoryArn" (rawinput91550 "DirectoryArn")}] (clojure.core/cond-> {} (letvar91552 "AppliedSchemaArn") (clojure.core/assoc :applied-schema-arn (deser-arn (clojure.core/get-in letvar91552 ["AppliedSchemaArn"]))) (letvar91552 "DirectoryArn") (clojure.core/assoc :directory-arn (deser-arn (clojure.core/get-in letvar91552 ["DirectoryArn"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper91554 input] (clojure.core/let [rawinput91553 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91555 {"Message" (rawinput91553 "Message")}] (clojure.core/cond-> {} (letvar91555 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91555 ["Message"])))))))

(clojure.core/defn- response-attach-policy-response ([input] (response-attach-policy-response nil input)) ([resultWrapper91557 input] (clojure.core/let [rawinput91556 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91558 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-schema-already-exists-exception ([input] (response-schema-already-exists-exception nil input)) ([resultWrapper91560 input] (clojure.core/let [rawinput91559 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91561 {"Message" (rawinput91559 "Message")}] (clojure.core/cond-> {} (letvar91561 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91561 ["Message"])))))))

(clojure.core/defn- response-facet-validation-exception ([input] (response-facet-validation-exception nil input)) ([resultWrapper91563 input] (clojure.core/let [rawinput91562 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91564 {"Message" (rawinput91562 "Message")}] (clojure.core/cond-> {} (letvar91564 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91564 ["Message"])))))))

(clojure.core/defn- response-schema-already-published-exception ([input] (response-schema-already-published-exception nil input)) ([resultWrapper91566 input] (clojure.core/let [rawinput91565 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91567 {"Message" (rawinput91565 "Message")}] (clojure.core/cond-> {} (letvar91567 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91567 ["Message"])))))))

(clojure.core/defn- response-list-incoming-typed-links-response ([input] (response-list-incoming-typed-links-response nil input)) ([resultWrapper91569 input] (clojure.core/let [rawinput91568 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91570 {"LinkSpecifiers" (rawinput91568 "LinkSpecifiers"), "NextToken" (rawinput91568 "NextToken")}] (clojure.core/cond-> {} (letvar91570 "LinkSpecifiers") (clojure.core/assoc :link-specifiers (deser-typed-link-specifier-list (clojure.core/get-in letvar91570 ["LinkSpecifiers"]))) (letvar91570 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91570 ["NextToken"])))))))

(clojure.core/defn- response-create-typed-link-facet-response ([input] (response-create-typed-link-facet-response nil input)) ([resultWrapper91572 input] (clojure.core/let [rawinput91571 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91573 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-upgrade-applied-schema-response ([input] (response-upgrade-applied-schema-response nil input)) ([resultWrapper91575 input] (clojure.core/let [rawinput91574 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91576 {"UpgradedSchemaArn" (rawinput91574 "UpgradedSchemaArn"), "DirectoryArn" (rawinput91574 "DirectoryArn")}] (clojure.core/cond-> {} (letvar91576 "UpgradedSchemaArn") (clojure.core/assoc :upgraded-schema-arn (deser-arn (clojure.core/get-in letvar91576 ["UpgradedSchemaArn"]))) (letvar91576 "DirectoryArn") (clojure.core/assoc :directory-arn (deser-arn (clojure.core/get-in letvar91576 ["DirectoryArn"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper91578 input] (clojure.core/let [rawinput91577 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91579 {"Message" (rawinput91577 "Message")}] (clojure.core/cond-> {} (letvar91579 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91579 ["Message"])))))))

(clojure.core/defn- response-list-attached-indices-response ([input] (response-list-attached-indices-response nil input)) ([resultWrapper91581 input] (clojure.core/let [rawinput91580 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91582 {"IndexAttachments" (rawinput91580 "IndexAttachments"), "NextToken" (rawinput91580 "NextToken")}] (clojure.core/cond-> {} (letvar91582 "IndexAttachments") (clojure.core/assoc :index-attachments (deser-index-attachment-list (clojure.core/get-in letvar91582 ["IndexAttachments"]))) (letvar91582 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91582 ["NextToken"])))))))

(clojure.core/defn- response-remove-facet-from-object-response ([input] (response-remove-facet-from-object-response nil input)) ([resultWrapper91584 input] (clojure.core/let [rawinput91583 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91585 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-schema-response ([input] (response-delete-schema-response nil input)) ([resultWrapper91587 input] (clojure.core/let [rawinput91586 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91588 {"SchemaArn" (rawinput91586 "SchemaArn")}] (clojure.core/cond-> {} (letvar91588 "SchemaArn") (clojure.core/assoc :schema-arn (deser-arn (clojure.core/get-in letvar91588 ["SchemaArn"])))))))

(clojure.core/defn- response-list-facet-attributes-response ([input] (response-list-facet-attributes-response nil input)) ([resultWrapper91590 input] (clojure.core/let [rawinput91589 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91591 {"Attributes" (rawinput91589 "Attributes"), "NextToken" (rawinput91589 "NextToken")}] (clojure.core/cond-> {} (letvar91591 "Attributes") (clojure.core/assoc :attributes (deser-facet-attribute-list (clojure.core/get-in letvar91591 ["Attributes"]))) (letvar91591 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91591 ["NextToken"])))))))

(clojure.core/defn- response-not-index-exception ([input] (response-not-index-exception nil input)) ([resultWrapper91593 input] (clojure.core/let [rawinput91592 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91594 {"Message" (rawinput91592 "Message")}] (clojure.core/cond-> {} (letvar91594 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91594 ["Message"])))))))

(clojure.core/defn- response-list-policy-attachments-response ([input] (response-list-policy-attachments-response nil input)) ([resultWrapper91596 input] (clojure.core/let [rawinput91595 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91597 {"ObjectIdentifiers" (rawinput91595 "ObjectIdentifiers"), "NextToken" (rawinput91595 "NextToken")}] (clojure.core/cond-> {} (letvar91597 "ObjectIdentifiers") (clojure.core/assoc :object-identifiers (deser-object-identifier-list (clojure.core/get-in letvar91597 ["ObjectIdentifiers"]))) (letvar91597 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91597 ["NextToken"])))))))

(clojure.core/defn- response-not-node-exception ([input] (response-not-node-exception nil input)) ([resultWrapper91599 input] (clojure.core/let [rawinput91598 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91600 {"Message" (rawinput91598 "Message")}] (clojure.core/cond-> {} (letvar91600 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91600 ["Message"])))))))

(clojure.core/defn- response-get-typed-link-facet-information-response ([input] (response-get-typed-link-facet-information-response nil input)) ([resultWrapper91602 input] (clojure.core/let [rawinput91601 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91603 {"IdentityAttributeOrder" (rawinput91601 "IdentityAttributeOrder")}] (clojure.core/cond-> {} (letvar91603 "IdentityAttributeOrder") (clojure.core/assoc :identity-attribute-order (deser-attribute-name-list (clojure.core/get-in letvar91603 ["IdentityAttributeOrder"])))))))

(clojure.core/defn- response-list-directories-response ([input] (response-list-directories-response nil input)) ([resultWrapper91605 input] (clojure.core/let [rawinput91604 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91606 {"Directories" (rawinput91604 "Directories"), "NextToken" (rawinput91604 "NextToken")}] (clojure.core/cond-> {:directories (deser-directory-list (clojure.core/get-in letvar91606 ["Directories"]))} (letvar91606 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91606 ["NextToken"])))))))

(clojure.core/defn- response-indexed-attribute-missing-exception ([input] (response-indexed-attribute-missing-exception nil input)) ([resultWrapper91608 input] (clojure.core/let [rawinput91607 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91609 {"Message" (rawinput91607 "Message")}] (clojure.core/cond-> {} (letvar91609 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91609 ["Message"])))))))

(clojure.core/defn- response-incompatible-schema-exception ([input] (response-incompatible-schema-exception nil input)) ([resultWrapper91611 input] (clojure.core/let [rawinput91610 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91612 {"Message" (rawinput91610 "Message")}] (clojure.core/cond-> {} (letvar91612 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91612 ["Message"])))))))

(clojure.core/defn- response-list-managed-schema-arns-response ([input] (response-list-managed-schema-arns-response nil input)) ([resultWrapper91614 input] (clojure.core/let [rawinput91613 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91615 {"SchemaArns" (rawinput91613 "SchemaArns"), "NextToken" (rawinput91613 "NextToken")}] (clojure.core/cond-> {} (letvar91615 "SchemaArns") (clojure.core/assoc :schema-arns (deser-arns (clojure.core/get-in letvar91615 ["SchemaArns"]))) (letvar91615 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91615 ["NextToken"])))))))

(clojure.core/defn- response-retryable-conflict-exception ([input] (response-retryable-conflict-exception nil input)) ([resultWrapper91617 input] (clojure.core/let [rawinput91616 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91618 {"Message" (rawinput91616 "Message")}] (clojure.core/cond-> {} (letvar91618 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91618 ["Message"])))))))

(clojure.core/defn- response-directory-already-exists-exception ([input] (response-directory-already-exists-exception nil input)) ([resultWrapper91620 input] (clojure.core/let [rawinput91619 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91621 {"Message" (rawinput91619 "Message")}] (clojure.core/cond-> {} (letvar91621 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91621 ["Message"])))))))

(clojure.core/defn- response-disable-directory-response ([input] (response-disable-directory-response nil input)) ([resultWrapper91623 input] (clojure.core/let [rawinput91622 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91624 {"DirectoryArn" (rawinput91622 "DirectoryArn")}] (clojure.core/cond-> {:directory-arn (deser-arn (clojure.core/get-in letvar91624 ["DirectoryArn"]))}))))

(clojure.core/defn- response-invalid-attachment-exception ([input] (response-invalid-attachment-exception nil input)) ([resultWrapper91626 input] (clojure.core/let [rawinput91625 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91627 {"Message" (rawinput91625 "Message")}] (clojure.core/cond-> {} (letvar91627 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91627 ["Message"])))))))

(clojure.core/defn- response-object-already-detached-exception ([input] (response-object-already-detached-exception nil input)) ([resultWrapper91629 input] (clojure.core/let [rawinput91628 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91630 {"Message" (rawinput91628 "Message")}] (clojure.core/cond-> {} (letvar91630 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91630 ["Message"])))))))

(clojure.core/defn- response-batch-read-response ([input] (response-batch-read-response nil input)) ([resultWrapper91632 input] (clojure.core/let [rawinput91631 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91633 {"Responses" (rawinput91631 "Responses")}] (clojure.core/cond-> {} (letvar91633 "Responses") (clojure.core/assoc :responses (deser-batch-read-operation-response-list (clojure.core/get-in letvar91633 ["Responses"])))))))

(clojure.core/defn- response-list-applied-schema-arns-response ([input] (response-list-applied-schema-arns-response nil input)) ([resultWrapper91635 input] (clojure.core/let [rawinput91634 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91636 {"SchemaArns" (rawinput91634 "SchemaArns"), "NextToken" (rawinput91634 "NextToken")}] (clojure.core/cond-> {} (letvar91636 "SchemaArns") (clojure.core/assoc :schema-arns (deser-arns (clojure.core/get-in letvar91636 ["SchemaArns"]))) (letvar91636 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91636 ["NextToken"])))))))

(clojure.core/defn- response-still-contains-links-exception ([input] (response-still-contains-links-exception nil input)) ([resultWrapper91638 input] (clojure.core/let [rawinput91637 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91639 {"Message" (rawinput91637 "Message")}] (clojure.core/cond-> {} (letvar91639 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91639 ["Message"])))))))

(clojure.core/defn- response-add-facet-to-object-response ([input] (response-add-facet-to-object-response nil input)) ([resultWrapper91641 input] (clojure.core/let [rawinput91640 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91642 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-facet-response ([input] (response-delete-facet-response nil input)) ([resultWrapper91644 input] (clojure.core/let [rawinput91643 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91645 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-delete-object-response ([input] (response-delete-object-response nil input)) ([resultWrapper91647 input] (clojure.core/let [rawinput91646 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91648 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-facet-already-exists-exception ([input] (response-facet-already-exists-exception nil input)) ([resultWrapper91650 input] (clojure.core/let [rawinput91649 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91651 {"Message" (rawinput91649 "Message")}] (clojure.core/cond-> {} (letvar91651 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91651 ["Message"])))))))

(clojure.core/defn- response-get-schema-as-json-response ([input] (response-get-schema-as-json-response nil input)) ([resultWrapper91653 input] (clojure.core/let [rawinput91652 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91654 {"Name" (rawinput91652 "Name"), "Document" (rawinput91652 "Document")}] (clojure.core/cond-> {} (letvar91654 "Name") (clojure.core/assoc :name (deser-schema-name (clojure.core/get-in letvar91654 ["Name"]))) (letvar91654 "Document") (clojure.core/assoc :document (deser-schema-json-document (clojure.core/get-in letvar91654 ["Document"])))))))

(clojure.core/defn- response-internal-service-exception ([input] (response-internal-service-exception nil input)) ([resultWrapper91656 input] (clojure.core/let [rawinput91655 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91657 {"Message" (rawinput91655 "Message")}] (clojure.core/cond-> {} (letvar91657 "Message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar91657 ["Message"])))))))

(clojure.core/defn- response-list-typed-link-facet-attributes-response ([input] (response-list-typed-link-facet-attributes-response nil input)) ([resultWrapper91659 input] (clojure.core/let [rawinput91658 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91660 {"Attributes" (rawinput91658 "Attributes"), "NextToken" (rawinput91658 "NextToken")}] (clojure.core/cond-> {} (letvar91660 "Attributes") (clojure.core/assoc :attributes (deser-typed-link-attribute-definition-list (clojure.core/get-in letvar91660 ["Attributes"]))) (letvar91660 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91660 ["NextToken"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper91662 input] (clojure.core/let [rawinput91661 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91663 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-update-facet-response ([input] (response-update-facet-response nil input)) ([resultWrapper91665 input] (clojure.core/let [rawinput91664 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91666 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-detach-policy-response ([input] (response-detach-policy-response nil input)) ([resultWrapper91668 input] (clojure.core/let [rawinput91667 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91669 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-published-schema-arns-response ([input] (response-list-published-schema-arns-response nil input)) ([resultWrapper91671 input] (clojure.core/let [rawinput91670 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91672 {"SchemaArns" (rawinput91670 "SchemaArns"), "NextToken" (rawinput91670 "NextToken")}] (clojure.core/cond-> {} (letvar91672 "SchemaArns") (clojure.core/assoc :schema-arns (deser-arns (clojure.core/get-in letvar91672 ["SchemaArns"]))) (letvar91672 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar91672 ["NextToken"])))))))

(clojure.core/defn- response-enable-directory-response ([input] (response-enable-directory-response nil input)) ([resultWrapper91674 input] (clojure.core/let [rawinput91673 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91675 {"DirectoryArn" (rawinput91673 "DirectoryArn")}] (clojure.core/cond-> {:directory-arn (deser-arn (clojure.core/get-in letvar91675 ["DirectoryArn"]))}))))

(clojure.core/defn- response-create-directory-response ([input] (response-create-directory-response nil input)) ([resultWrapper91677 input] (clojure.core/let [rawinput91676 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91678 {"DirectoryArn" (rawinput91676 "DirectoryArn"), "Name" (rawinput91676 "Name"), "ObjectIdentifier" (rawinput91676 "ObjectIdentifier"), "AppliedSchemaArn" (rawinput91676 "AppliedSchemaArn")}] (clojure.core/cond-> {:directory-arn (deser-directory-arn (clojure.core/get-in letvar91678 ["DirectoryArn"])), :name (deser-directory-name (clojure.core/get-in letvar91678 ["Name"])), :object-identifier (deser-object-identifier (clojure.core/get-in letvar91678 ["ObjectIdentifier"])), :applied-schema-arn (deser-arn (clojure.core/get-in letvar91678 ["AppliedSchemaArn"]))}))))

(clojure.core/defn- response-get-directory-response ([input] (response-get-directory-response nil input)) ([resultWrapper91680 input] (clojure.core/let [rawinput91679 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar91681 {"Directory" (rawinput91679 "Directory")}] (clojure.core/cond-> {:directory (deser-directory (clojure.core/get-in letvar91681 ["Directory"]))}))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-update-object-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.delete-object-request/directory-arn :portkey.aws.clouddirectory/object-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-rule-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-rule-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-rule-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-to-index-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-to-index-request/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-to-index-request/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-to-index-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.attach-to-index-request/directory-arn :portkey.aws.clouddirectory.attach-to-index-request/index-reference :portkey.aws.clouddirectory.attach-to-index-request/target-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-get-object-attributes/attribute-names (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-get-object-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference :portkey.aws.clouddirectory/schema-facet :portkey.aws.clouddirectory.batch-get-object-attributes/attribute-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 64)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-directory-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-directory-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.create-directory-request/name :portkey.aws.clouddirectory.create-directory-request/schema-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-exception/index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-operation-index))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-exception/type (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-write-exception-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-write-exception/index :portkey.aws.clouddirectory.batch-write-exception/type :portkey.aws.clouddirectory.batch-write-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-incoming-typed-links-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-incoming-typed-links-request/filter-attribute-ranges (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-incoming-typed-links-request/filter-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-incoming-typed-links-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-incoming-typed-links-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-incoming-typed-links-request/directory-arn :portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory.list-incoming-typed-links-request/filter-attribute-ranges :portkey.aws.clouddirectory.list-incoming-typed-links-request/filter-typed-link :portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-incoming-typed-links-request/max-results :portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-object-policies (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-policies-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-object-parent-paths (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-parent-paths-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-incoming-typed-links (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-incoming-typed-links-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/get-object-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-get-object-attributes-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/get-object-information (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-get-object-information-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-policy-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-policy-attachments-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-outgoing-typed-links (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-outgoing-typed-links-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/get-link-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-get-link-attributes-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-object-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-attributes-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-index-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-object-children (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-children-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-object-parents (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-parents-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-attached-indices (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-attached-indices-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/lookup-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-lookup-policy-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-successful-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-read-successful-response/list-object-policies :portkey.aws.clouddirectory.batch-read-successful-response/list-object-parent-paths :portkey.aws.clouddirectory.batch-read-successful-response/list-incoming-typed-links :portkey.aws.clouddirectory.batch-read-successful-response/get-object-attributes :portkey.aws.clouddirectory.batch-read-successful-response/get-object-information :portkey.aws.clouddirectory.batch-read-successful-response/list-policy-attachments :portkey.aws.clouddirectory.batch-read-successful-response/list-outgoing-typed-links :portkey.aws.clouddirectory.batch-read-successful-response/get-link-attributes :portkey.aws.clouddirectory.batch-read-successful-response/list-object-attributes :portkey.aws.clouddirectory.batch-read-successful-response/list-index :portkey.aws.clouddirectory.batch-read-successful-response/list-object-children :portkey.aws.clouddirectory.batch-read-successful-response/list-object-parents :portkey.aws.clouddirectory.batch-read-successful-response/list-attached-indices :portkey.aws.clouddirectory.batch-read-successful-response/lookup-policy]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-identifier-and-link-name-tuple (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/object-identifier :portkey.aws.clouddirectory/link-name]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-index/ranges-on-indexed-values (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-index/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-index/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-index (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-list-index/index-reference] :opt-un [:portkey.aws.clouddirectory.batch-list-index/ranges-on-indexed-values :portkey.aws.clouddirectory.batch-list-index/max-results :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-children-response/children (clojure.spec.alpha/and :portkey.aws.clouddirectory/link-name-to-object-identifier-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-children-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-object-children-response/children :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.policy-attachment/policy-id (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/policy-attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.policy-attachment/policy-id :portkey.aws.clouddirectory/object-identifier :portkey.aws.clouddirectory/policy-type]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parents-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parents-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parents-request/include-all-links-to-each-parent (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-parents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-object-parents-request/directory-arn :portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-object-parents-request/max-results :portkey.aws.clouddirectory/consistency-level :portkey.aws.clouddirectory.list-object-parents-request/include-all-links-to-each-parent]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-not-detached-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-not-detached-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.object-not-detached-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-typed-link-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/typed-link-specifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/put-schema-from-json-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/arn]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.link-attribute-action/attribute-action-type (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-action-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.link-attribute-action/attribute-update-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/link-attribute-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.link-attribute-action/attribute-action-type :portkey.aws.clouddirectory.link-attribute-action/attribute-update-value]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.schema-facet/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-facet (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.schema-facet/schema-arn :portkey.aws.clouddirectory/facet-name]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-index-response/index-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/index-attachment-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-index-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-index-response/index-attachments :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-update-link-attributes/attribute-updates (clojure.spec.alpha/and :portkey.aws.clouddirectory/link-attribute-update-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-update-link-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/typed-link-specifier :portkey.aws.clouddirectory.batch-update-link-attributes/attribute-updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-attached-indices-response/index-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/index-attachment-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-attached-indices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-attached-indices-response/index-attachments :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-operation-response-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/batch-write-operation-response))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-typed-link-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-typed-link-request/source-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-typed-link-request/target-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-typed-link-request/typed-link-facet (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-typed-link-request/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-typed-link-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.attach-typed-link-request/directory-arn :portkey.aws.clouddirectory.attach-typed-link-request/source-object-reference :portkey.aws.clouddirectory.attach-typed-link-request/target-object-reference :portkey.aws.clouddirectory.attach-typed-link-request/typed-link-facet :portkey.aws.clouddirectory.attach-typed-link-request/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/link-attribute-update-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/link-attribute-update))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-attributes/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-attributes/facet-filter (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.batch-list-object-attributes/max-results :portkey.aws.clouddirectory.batch-list-object-attributes/facet-filter]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute/attribute-definition (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-definition))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute/attribute-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute/required-behavior (clojure.spec.alpha/and :portkey.aws.clouddirectory/required-attribute-behavior))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.facet-attribute/name] :opt-un [:portkey.aws.clouddirectory.facet-attribute/attribute-definition :portkey.aws.clouddirectory.facet-attribute/attribute-reference :portkey.aws.clouddirectory.facet-attribute/required-behavior]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-attribute-update/object-attribute-key (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-attribute-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.object-attribute-update/object-attribute-key :portkey.aws.clouddirectory/object-attribute-action]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-facet-update-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-facet-update-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-facet-update-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value/string-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/string-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value/binary-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/binary-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value/boolean-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/boolean-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value/number-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value/datetime-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/datetime-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-attribute-value (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.typed-attribute-value/string-value :portkey.aws.clouddirectory.typed-attribute-value/binary-value :portkey.aws.clouddirectory.typed-attribute-value/boolean-value :portkey.aws.clouddirectory.typed-attribute-value/number-value :portkey.aws.clouddirectory.typed-attribute-value/datetime-value]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-from-index-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-from-index-request/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-from-index-request/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-from-index-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.detach-from-index-request/directory-arn :portkey.aws.clouddirectory.detach-from-index-request/index-reference :portkey.aws.clouddirectory.detach-from-index-request/target-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-definition/type (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-definition/default-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-definition/is-immutable (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-definition/rules (clojure.spec.alpha/and :portkey.aws.clouddirectory/rule-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.facet-attribute-definition/type] :opt-un [:portkey.aws.clouddirectory.facet-attribute-definition/default-value :portkey.aws.clouddirectory.facet-attribute-definition/is-immutable :portkey.aws.clouddirectory.facet-attribute-definition/rules]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.validation-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-identifier-and-link-name-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/object-identifier-and-link-name-tuple))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-index-response/index-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/index-attachment-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-index-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-index-response/index-attachments :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-object-information-response/schema-facets (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-object-information-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.get-object-information-response/schema-facets :portkey.aws.clouddirectory/object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parents-response/parents (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-to-link-name-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parents-response/parent-links (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-and-link-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-parents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-object-parents-response/parents :portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-object-parents-response/parent-links]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/facet-attribute))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-directory-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.delete-directory-request/directory-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/datetime-attribute-value clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-link-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-link-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.get-link-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-tags-for-resource-response/tags :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-facet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.get-facet-request/schema-arn :portkey.aws.clouddirectory.get-facet-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-policies-response/attached-policy-ids (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-object-policies-response/attached-policy-ids :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-attribute-range/range (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value-range))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-attribute-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/attribute-key :portkey.aws.clouddirectory.object-attribute-range/range]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-policy-attachments-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-policy-attachments-request/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-policy-attachments-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-policy-attachments-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-policy-attachments-request/directory-arn :portkey.aws.clouddirectory.list-policy-attachments-request/policy-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-policy-attachments-request/max-results :portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-object-policies (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-policies))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-object-parent-paths (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-parent-paths))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-incoming-typed-links (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-incoming-typed-links))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/get-object-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-get-object-attributes))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/get-object-information (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-get-object-information))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-policy-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-policy-attachments))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-outgoing-typed-links (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-outgoing-typed-links))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/get-link-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-get-link-attributes))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-object-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-attributes))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-index))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-object-children (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-children))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-object-parents (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-parents))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-attached-indices (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-attached-indices))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/lookup-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-lookup-policy))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-read-operation/list-object-policies :portkey.aws.clouddirectory.batch-read-operation/list-object-parent-paths :portkey.aws.clouddirectory.batch-read-operation/list-incoming-typed-links :portkey.aws.clouddirectory.batch-read-operation/get-object-attributes :portkey.aws.clouddirectory.batch-read-operation/get-object-information :portkey.aws.clouddirectory.batch-read-operation/list-policy-attachments :portkey.aws.clouddirectory.batch-read-operation/list-outgoing-typed-links :portkey.aws.clouddirectory.batch-read-operation/get-link-attributes :portkey.aws.clouddirectory.batch-read-operation/list-object-attributes :portkey.aws.clouddirectory.batch-read-operation/list-index :portkey.aws.clouddirectory.batch-read-operation/list-object-children :portkey.aws.clouddirectory.batch-read-operation/list-object-parents :portkey.aws.clouddirectory.batch-read-operation/list-attached-indices :portkey.aws.clouddirectory.batch-read-operation/lookup-policy]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/number-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-attribute-action/object-attribute-action-type (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-action-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-attribute-action/object-attribute-update-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-attribute-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.object-attribute-action/object-attribute-action-type :portkey.aws.clouddirectory.object-attribute-action/object-attribute-update-value]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory-not-enabled-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-not-enabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.directory-not-enabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-children-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-children-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-children-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-object-children-request/directory-arn :portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-object-children-request/max-results :portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-typed-link-facet-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-names-response/facet-names (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-typed-link-facet-names-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-typed-link-facet-names-response/facet-names :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-attribute-range-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/typed-link-attribute-range))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 230)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._:-]*$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/required-attribute-behavior #{"REQUIRED_ALWAYS" :required-always :not-required "NOT_REQUIRED"})

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-object-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-object-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.get-object-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value-range/start-mode (clojure.spec.alpha/and :portkey.aws.clouddirectory/range-mode))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value-range/start-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value-range/end-mode (clojure.spec.alpha/and :portkey.aws.clouddirectory/range-mode))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value-range/end-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-attribute-value-range (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.typed-attribute-value-range/start-mode :portkey.aws.clouddirectory.typed-attribute-value-range/end-mode] :opt-un [:portkey.aws.clouddirectory.typed-attribute-value-range/start-value :portkey.aws.clouddirectory.typed-attribute-value-range/end-value]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.unsupported-index-type-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/unsupported-index-type-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.unsupported-index-type-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-add-facet-to-object/object-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-add-facet-to-object (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/schema-facet :portkey.aws.clouddirectory.batch-add-facet-to-object/object-attribute-list :portkey.aws.clouddirectory/object-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-facet-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/facet]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-attributes-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-attributes-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-attributes-request/facet-filter (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-object-attributes-request/directory-arn :portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-object-attributes-request/max-results :portkey.aws.clouddirectory/consistency-level :portkey.aws.clouddirectory.list-object-attributes-request/facet-filter]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-tags-for-resource-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/tags-number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-tags-for-resource-request/resource-arn] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-tags-for-resource-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.publish-schema-response/published-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/publish-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.publish-schema-response/published-schema-arn]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-policy-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-policy-request/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.attach-policy-request/directory-arn :portkey.aws.clouddirectory.attach-policy-request/policy-reference :portkey.aws.clouddirectory/object-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-update-object-attributes/attribute-updates (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-attribute-update-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-update-object-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference :portkey.aws.clouddirectory.batch-update-object-attributes/attribute-updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-directory-response/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-directory-response (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.delete-directory-response/directory-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-schema-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-schema-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.update-schema-request/schema-arn :portkey.aws.clouddirectory.update-schema-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-schema-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.create-schema-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-operation-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/batch-write-operation))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-policies/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-policies (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.batch-list-object-policies/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-remove-facet-from-object (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/schema-facet :portkey.aws.clouddirectory/object-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-exception/type (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-exception-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-read-exception/type :portkey.aws.clouddirectory.batch-read-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-outgoing-typed-links-response/typed-link-specifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-specifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-outgoing-typed-links-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-outgoing-typed-links-response/typed-link-specifiers :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-typed-link/source-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-typed-link/target-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-typed-link/typed-link-facet (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-typed-link/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-typed-link (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-attach-typed-link/source-object-reference :portkey.aws.clouddirectory.batch-attach-typed-link/target-object-reference :portkey.aws.clouddirectory.batch-attach-typed-link/typed-link-facet :portkey.aws.clouddirectory.batch-attach-typed-link/attributes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-index-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-index-request/ordered-indexed-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-index-request/is-unique (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-index-request/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-index-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.create-index-request/directory-arn :portkey.aws.clouddirectory.create-index-request/ordered-indexed-attribute-list :portkey.aws.clouddirectory.create-index-request/is-unique] :opt-un [:portkey.aws.clouddirectory.create-index-request/parent-reference :portkey.aws.clouddirectory/link-name]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-request/operations (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-operation-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-read-request/directory-arn :portkey.aws.clouddirectory.batch-read-request/operations] :opt-un [:portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.enable-directory-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/enable-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.enable-directory-request/directory-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-managed-schema-arns-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-managed-schema-arns-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-managed-schema-arns-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-managed-schema-arns-request/schema-arn :portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-managed-schema-arns-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-parent-paths-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/path-to-object-identifiers-list :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-object-attributes-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-object-attributes-request/attribute-updates (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-attribute-update-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-object-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.update-object-attributes-request/directory-arn :portkey.aws.clouddirectory/object-reference :portkey.aws.clouddirectory.update-object-attributes-request/attribute-updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-get-object-information (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-delete-object-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-to-index-response/attached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-to-index-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.attach-to-index-response/attached-object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-attribute-definition-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/typed-link-attribute-definition))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-schema-doc-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-schema-doc-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-schema-doc-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-action-type #{"DELETE" "CREATE_OR_UPDATE" :delete :create-or-update})

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-type #{:binary :variant :number "NUMBER" :string "STRING" "VARIANT" :datetime "DATETIME" :boolean "BOOLEAN" "BINARY"})

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-children/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-children (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.batch-list-object-children/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-typed-link-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/typed-link-specifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/boolean-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.clouddirectory.link-name-already-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/link-name-already-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.link-name-already-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/policy-attachment-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/policy-attachment))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet-in-use-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-parent-paths-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/path-to-object-identifiers-list :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-policy/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-attach-policy/policy-reference :portkey.aws.clouddirectory/object-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-object-attributes-response/attributes :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-json-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-object-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-exception-type #{:object-already-detached-exception :not-policy-exception "ObjectNotDetachedException" "ValidationException" :internal-service-exception :not-index-exception "DirectoryNotEnabledException" "UnsupportedIndexTypeException" :resource-not-found-exception :limit-exceeded-exception "LinkNameAlreadyInUseException" "LimitExceededException" :object-not-detached-exception "InvalidArnException" "NotPolicyException" "ResourceNotFoundException" "FacetValidationException" "AccessDeniedException" :validation-exception "NotIndexException" :indexed-attribute-missing-exception :facet-validation-exception "NotNodeException" "IndexedAttributeMissingException" :directory-not-enabled-exception :access-denied-exception "InvalidAttachmentException" "ObjectAlreadyDetachedException" :not-node-exception :still-contains-links-exception :link-name-already-in-use-exception :unsupported-index-type-exception "StillContainsLinksException" "InternalServiceException" :invalid-arn-exception :invalid-attachment-exception})

(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-object-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/lookup-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/policy-to-path-list :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-key-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/attribute-key))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-tagging-request-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-tagging-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-tagging-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/selector-object-reference (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-facet-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-from-index-response/detached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-from-index-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.detach-from-index-response/detached-object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-name-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/typed-link-name))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-map (clojure.spec.alpha/map-of :portkey.aws.clouddirectory/rule-key :portkey.aws.clouddirectory/rule))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-operation-response-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/batch-read-operation-response))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.upgrade-published-schema-response/upgraded-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/upgrade-published-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.upgrade-published-schema-response/upgraded-schema-arn]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/create-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-create-index-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/create-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-create-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/detach-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-policy-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/detach-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/detach-from-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-from-index-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/attach-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/update-link-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-update-link-attributes-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/attach-to-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-to-index-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/attach-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-typed-link-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/detach-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-typed-link-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/add-facet-to-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-add-facet-to-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/update-object-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-update-object-attributes-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/delete-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-delete-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/attach-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-policy-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/remove-facet-from-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-remove-facet-from-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-operation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-write-operation-response/create-index :portkey.aws.clouddirectory.batch-write-operation-response/create-object :portkey.aws.clouddirectory.batch-write-operation-response/detach-policy :portkey.aws.clouddirectory.batch-write-operation-response/detach-object :portkey.aws.clouddirectory.batch-write-operation-response/detach-from-index :portkey.aws.clouddirectory.batch-write-operation-response/attach-object :portkey.aws.clouddirectory.batch-write-operation-response/update-link-attributes :portkey.aws.clouddirectory.batch-write-operation-response/attach-to-index :portkey.aws.clouddirectory.batch-write-operation-response/attach-typed-link :portkey.aws.clouddirectory.batch-write-operation-response/detach-typed-link :portkey.aws.clouddirectory.batch-write-operation-response/add-facet-to-object :portkey.aws.clouddirectory.batch-write-operation-response/update-object-attributes :portkey.aws.clouddirectory.batch-write-operation-response/delete-object :portkey.aws.clouddirectory.batch-write-operation-response/attach-policy :portkey.aws.clouddirectory.batch-write-operation-response/remove-facet-from-object]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/arns (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/arn))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-link-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-typed-link-facet-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-to-index-response/attached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-to-index-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-attach-to-index-response/attached-object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.add-facet-to-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.add-facet-to-object-request/object-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/add-facet-to-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.add-facet-to-object-request/directory-arn :portkey.aws.clouddirectory/schema-facet :portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory.add-facet-to-object-request/object-attribute-list]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-response/responses (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-write-operation-response-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-write-response/responses]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory-not-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-not-disabled-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.directory-not-disabled-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.remove-facet-from-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/remove-facet-from-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.remove-facet-from-object-request/directory-arn :portkey.aws.clouddirectory/schema-facet :portkey.aws.clouddirectory/object-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-applied-schema-version-response/applied-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-applied-schema-version-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.get-applied-schema-version-response/applied-schema-arn]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-parent-paths/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-parent-paths (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.batch-list-object-parent-paths/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-object-request/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.detach-object-request/directory-arn :portkey.aws.clouddirectory.detach-object-request/parent-reference :portkey.aws.clouddirectory/link-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-development-schema-arns-response/schema-arns (clojure.spec.alpha/and :portkey.aws.clouddirectory/arns))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-development-schema-arns-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-development-schema-arns-response/schema-arns :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-get-link-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-get-link-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-get-link-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-outgoing-typed-links/filter-attribute-ranges (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-outgoing-typed-links/filter-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-outgoing-typed-links/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-outgoing-typed-links (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory.batch-list-outgoing-typed-links/filter-attribute-ranges :portkey.aws.clouddirectory.batch-list-outgoing-typed-links/filter-typed-link :portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.batch-list-outgoing-typed-links/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-incoming-typed-links/filter-attribute-ranges (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-incoming-typed-links/filter-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-incoming-typed-links/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-incoming-typed-links (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory.batch-list-incoming-typed-links/filter-attribute-ranges :portkey.aws.clouddirectory.batch-list-incoming-typed-links/filter-typed-link :portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.batch-list-incoming-typed-links/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-key-and-value-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/attribute-key-and-value))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-range/range (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value-range))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-attribute-range (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.typed-link-attribute-range/range] :opt-un [:portkey.aws.clouddirectory/attribute-name]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-get-object-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-get-object-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-get-object-attributes-response/attributes]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-schema-response/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.update-schema-response/schema-arn]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-outgoing-typed-links-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-outgoing-typed-links-request/filter-attribute-ranges (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-outgoing-typed-links-request/filter-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-outgoing-typed-links-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-outgoing-typed-links-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-outgoing-typed-links-request/directory-arn :portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory.list-outgoing-typed-links-request/filter-attribute-ranges :portkey.aws.clouddirectory.list-outgoing-typed-links-request/filter-typed-link :portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-outgoing-typed-links-request/max-results :portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory-deleted-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-deleted-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.directory-deleted-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory/state (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-state))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory/creation-date-time (clojure.spec.alpha/and :portkey.aws.clouddirectory/date))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.directory/name :portkey.aws.clouddirectory/directory-arn :portkey.aws.clouddirectory.directory/state :portkey.aws.clouddirectory.directory/creation-date-time]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-specifier/typed-link-facet (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-specifier/source-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-specifier/target-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-specifier/identity-attribute-values (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-specifier (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.typed-link-specifier/typed-link-facet :portkey.aws.clouddirectory.typed-link-specifier/source-object-reference :portkey.aws.clouddirectory.typed-link-specifier/target-object-reference :portkey.aws.clouddirectory.typed-link-specifier/identity-attribute-values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-names-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-names-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-facet-names-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-facet-names-request/schema-arn] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-facet-names-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-directories-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-directories-request/state (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-state))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-directories-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-directories-request/max-results :portkey.aws.clouddirectory.list-directories-request/state]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.policy-to-path/path (clojure.spec.alpha/and :portkey.aws.clouddirectory/path-string))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.policy-to-path/policies (clojure.spec.alpha/and :portkey.aws.clouddirectory/policy-attachment-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/policy-to-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.policy-to-path/path :portkey.aws.clouddirectory.policy-to-path/policies]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-index-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-attribute-range-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/object-attribute-range))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-object-response/detached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-object-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.detach-object-response/detached-object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-facet/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-facet/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-definition-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-facet/identity-attribute-order (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-facet (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.typed-link-facet/name :portkey.aws.clouddirectory.typed-link-facet/attributes :portkey.aws.clouddirectory.typed-link-facet/identity-attribute-order] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-arn-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-arn-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-arn-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.not-policy-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/not-policy-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.not-policy-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.tag-resource-request/resource-arn :portkey.aws.clouddirectory.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-facet-request/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-facet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.create-facet-request/schema-arn :portkey.aws.clouddirectory.create-facet-request/name] :opt-un [:portkey.aws.clouddirectory.create-facet-request/attributes :portkey.aws.clouddirectory/object-type :portkey.aws.clouddirectory/facet-style]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-specifier-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/typed-link-specifier))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-object-response/attached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-object-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.attach-object-response/attached-object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-object-response/attached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-object-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-attach-object-response/attached-object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/range-mode #{:exclusive "LAST" :inclusive :last-before-missing-values "EXCLUSIVE" :first "INCLUSIVE" :last "FIRST" "LAST_BEFORE_MISSING_VALUES"})

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/tag))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.cannot-list-parent-of-root-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/cannot-list-parent-of-root-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.cannot-list-parent-of-root-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-names-response/facet-names (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-facet-names-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-facet-names-response/facet-names :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-children-response/children (clojure.spec.alpha/and :portkey.aws.clouddirectory/link-name-to-object-identifier-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-children-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-object-children-response/children :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/tag-key))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-policies-response/attached-policy-ids (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-object-policies-response/attached-policy-ids :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/binary-attribute-value clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-applied-schema-version-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-applied-schema-version-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.get-applied-schema-version-request/schema-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-attached-indices-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-attached-indices-request/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-attached-indices-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-attached-indices-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-attached-indices-request/directory-arn :portkey.aws.clouddirectory.list-attached-indices-request/target-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-attached-indices-request/max-results :portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-policy-attachments-response/object-identifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-policy-attachments-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-policy-attachments-response/object-identifiers :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-operation-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/batch-read-operation))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-get-link-attributes/attribute-names (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-get-link-attributes (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/typed-link-specifier :portkey.aws.clouddirectory.batch-get-link-attributes/attribute-names] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/path-to-object-identifiers-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/path-to-object-identifiers))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-add-facet-to-object-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-typed-link-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-typed-link-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-typed-link-facet-request/attribute-updates (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-facet-attribute-update-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-typed-link-facet-request/identity-attribute-order (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-typed-link-facet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.update-typed-link-facet-request/schema-arn :portkey.aws.clouddirectory.update-typed-link-facet-request/name :portkey.aws.clouddirectory.update-typed-link-facet-request/attribute-updates :portkey.aws.clouddirectory.update-typed-link-facet-request/identity-attribute-order] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-schema-response/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.create-schema-response/schema-arn]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-operation-index clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.clouddirectory.apply-schema-response/applied-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.apply-schema-response/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/apply-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.apply-schema-response/applied-schema-arn :portkey.aws.clouddirectory.apply-schema-response/directory-arn]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-typed-link (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/typed-link-specifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-attribute-update-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/object-attribute-update))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.lookup-policy-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.lookup-policy-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/lookup-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.lookup-policy-request/directory-arn :portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.lookup-policy-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-schema-as-json-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-schema-as-json-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.get-schema-as-json-request/schema-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-policies-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-policies-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-object-policies-request/directory-arn :portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-object-policies-request/max-results :portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-name-and-value-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/attribute-name-and-value))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-index-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-index-request/ranges-on-indexed-values (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-index-request/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-index-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-index-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-index-request/directory-arn :portkey.aws.clouddirectory.list-index-request/index-reference] :opt-un [:portkey.aws.clouddirectory.list-index-request/ranges-on-indexed-values :portkey.aws.clouddirectory.list-index-request/max-results :portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.schema-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.schema-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-update-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/facet-attribute-update))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-validation-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet-validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.schema-already-published-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-already-published-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.schema-already-published-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attribute-name-and-value/value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-name-and-value (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/attribute-name :portkey.aws.clouddirectory.attribute-name-and-value/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-policy-attachments/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-policy-attachments/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-policy-attachments (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-list-policy-attachments/policy-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.batch-list-policy-attachments/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet/name :portkey.aws.clouddirectory/object-type :portkey.aws.clouddirectory/facet-style]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-typed-link-facet-information-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-typed-link-facet-information-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-typed-link-facet-information-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.get-typed-link-facet-information-request/schema-arn :portkey.aws.clouddirectory.get-typed-link-facet-information-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-incoming-typed-links-response/link-specifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-specifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-incoming-typed-links-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-incoming-typed-links-response/link-specifiers :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/directory-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-reference/selector (clojure.spec.alpha/and :portkey.aws.clouddirectory/selector-object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-reference (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.object-reference/selector]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-facet-request/attribute-updates (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-update-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-facet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.update-facet-request/schema-arn :portkey.aws.clouddirectory.update-facet-request/name] :opt-un [:portkey.aws.clouddirectory.update-facet-request/attribute-updates :portkey.aws.clouddirectory/object-type]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attribute-key/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attribute-key/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-key (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.attribute-key/schema-arn :portkey.aws.clouddirectory/facet-name :portkey.aws.clouddirectory.attribute-key/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/bool clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-name-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/attribute-name))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-to-index/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-to-index/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-to-index (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-attach-to-index/index-reference :portkey.aws.clouddirectory.batch-attach-to-index/target-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-typed-link-facet-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-reference-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/create-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-create-index))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/create-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-create-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/detach-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-policy))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/detach-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/detach-from-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-from-index))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/attach-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/update-link-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-update-link-attributes))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/attach-to-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-to-index))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/attach-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-typed-link))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/detach-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-typed-link))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/add-facet-to-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-add-facet-to-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/update-object-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-update-object-attributes))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/delete-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-delete-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/attach-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-policy))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/remove-facet-from-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-remove-facet-from-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-operation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-write-operation/create-index :portkey.aws.clouddirectory.batch-write-operation/create-object :portkey.aws.clouddirectory.batch-write-operation/detach-policy :portkey.aws.clouddirectory.batch-write-operation/detach-object :portkey.aws.clouddirectory.batch-write-operation/detach-from-index :portkey.aws.clouddirectory.batch-write-operation/attach-object :portkey.aws.clouddirectory.batch-write-operation/update-link-attributes :portkey.aws.clouddirectory.batch-write-operation/attach-to-index :portkey.aws.clouddirectory.batch-write-operation/attach-typed-link :portkey.aws.clouddirectory.batch-write-operation/detach-typed-link :portkey.aws.clouddirectory.batch-write-operation/add-facet-to-object :portkey.aws.clouddirectory.batch-write-operation/update-object-attributes :portkey.aws.clouddirectory.batch-write-operation/delete-object :portkey.aws.clouddirectory.batch-write-operation/attach-policy :portkey.aws.clouddirectory.batch-write-operation/remove-facet-from-object]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.upgrade-applied-schema-response/upgraded-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.upgrade-applied-schema-response/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/upgrade-applied-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.upgrade-applied-schema-response/upgraded-schema-arn :portkey.aws.clouddirectory.upgrade-applied-schema-response/directory-arn]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.put-schema-from-json-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.put-schema-from-json-request/document (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-json-document))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/put-schema-from-json-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.put-schema-from-json-request/schema-arn :portkey.aws.clouddirectory.put-schema-from-json-request/document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-typed-link-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-attached-indices-response/index-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/index-attachment-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-attached-indices-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-attached-indices-response/index-attachments :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-development-schema-arns-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-development-schema-arns-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-development-schema-arns-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/remove-facet-from-object-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-parameter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-identifier-to-link-name-map (clojure.spec.alpha/map-of :portkey.aws.clouddirectory/object-identifier :portkey.aws.clouddirectory/link-name))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.publish-schema-request/development-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.publish-schema-request/minor-version (clojure.spec.alpha/and :portkey.aws.clouddirectory/version))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.publish-schema-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/publish-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.publish-schema-request/development-schema-arn :portkey.aws.clouddirectory/version] :opt-un [:portkey.aws.clouddirectory.publish-schema-request/minor-version :portkey.aws.clouddirectory.publish-schema-request/name]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-create-object-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-from-index/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-from-index/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-from-index (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-detach-from-index/index-reference :portkey.aws.clouddirectory.batch-detach-from-index/target-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-from-index-response/detached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-from-index-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-detach-from-index-response/detached-object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-facet-attribute-update/attribute (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-definition))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-facet-attribute-update/action (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-action-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-facet-attribute-update (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.typed-link-facet-attribute-update/attribute :portkey.aws.clouddirectory.typed-link-facet-attribute-update/action] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-schema-response/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-schema-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.delete-schema-response/schema-arn]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-typed-link-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-typed-link-facet-request/facet (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-facet))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-typed-link-facet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.create-typed-link-facet-request/schema-arn :portkey.aws.clouddirectory.create-typed-link-facet-request/facet] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-remove-facet-from-object-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-incoming-typed-links-response/link-specifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-specifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-incoming-typed-links-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-incoming-typed-links-response/link-specifiers :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-update/attribute (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-update/action (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-action-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet-attribute-update/attribute :portkey.aws.clouddirectory.facet-attribute-update/action]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-facet-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-facet-attributes-response/attributes :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.index-attachment/indexed-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/index-attachment (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.index-attachment/indexed-attributes :portkey.aws.clouddirectory/object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.not-index-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/not-index-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.not-index-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/link-name-to-object-identifier-map (clojure.spec.alpha/map-of :portkey.aws.clouddirectory/link-name :portkey.aws.clouddirectory/object-identifier))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-schema-and-facet-name/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-schema-and-facet-name (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.typed-link-schema-and-facet-name/schema-arn :portkey.aws.clouddirectory/typed-link-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-policy-attachments-response/object-identifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-policy-attachments-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-policy-attachments-response/object-identifiers :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/path-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-request/operations (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-write-operation-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-write-request/directory-arn :portkey.aws.clouddirectory.batch-write-request/operations] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.rule/type (clojure.spec.alpha/and :portkey.aws.clouddirectory/rule-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.rule/parameters (clojure.spec.alpha/and :portkey.aws.clouddirectory/rule-parameter-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.rule/type :portkey.aws.clouddirectory.rule/parameters]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-object/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-object/child-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-object (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-attach-object/parent-reference :portkey.aws.clouddirectory.batch-attach-object/child-reference :portkey.aws.clouddirectory/link-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/policy-to-path-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/policy-to-path))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-delete-object (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-parameter-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.path-to-object-identifiers/path (clojure.spec.alpha/and :portkey.aws.clouddirectory/path-string))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.path-to-object-identifiers/object-identifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/path-to-object-identifiers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.path-to-object-identifiers/path :portkey.aws.clouddirectory.path-to-object-identifiers/object-identifiers]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-create-index-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-lookup-policy/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-lookup-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.batch-lookup-policy/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-facet-attribute-update-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/typed-link-facet-attribute-update))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-schema-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.delete-schema-request/schema-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.apply-schema-request/published-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.apply-schema-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/apply-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.apply-schema-request/published-schema-arn :portkey.aws.clouddirectory.apply-schema-request/directory-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.link-attribute-update/attribute-action (clojure.spec.alpha/and :portkey.aws.clouddirectory/link-attribute-action))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/link-attribute-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/attribute-key :portkey.aws.clouddirectory.link-attribute-update/attribute-action]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-object-information-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-object-information-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.get-object-information-request/directory-arn :portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.not-node-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/not-node-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.not-node-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-typed-link-facet-information-response/identity-attribute-order (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-typed-link-facet-information-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.get-typed-link-facet-information-response/identity-attribute-order]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-typed-link-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-typed-link-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-typed-link-facet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.delete-typed-link-facet-request/schema-arn :portkey.aws.clouddirectory.delete-typed-link-facet-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-index/ordered-indexed-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-index/is-unique (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-index/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-create-index (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-create-index/ordered-indexed-attribute-list :portkey.aws.clouddirectory.batch-create-index/is-unique] :opt-un [:portkey.aws.clouddirectory.batch-create-index/parent-reference :portkey.aws.clouddirectory/link-name :portkey.aws.clouddirectory/batch-reference-name]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-identifier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/directory))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-exception-type #{:cannot-list-parent-of-root-exception :not-policy-exception "ValidationException" :internal-service-exception :not-index-exception "DirectoryNotEnabledException" :resource-not-found-exception :limit-exceeded-exception "LimitExceededException" "InvalidNextTokenException" "InvalidArnException" "NotPolicyException" "CannotListParentOfRootException" "ResourceNotFoundException" "FacetValidationException" "AccessDeniedException" :validation-exception "NotIndexException" :facet-validation-exception "NotNodeException" :invalid-next-token-exception :directory-not-enabled-exception :access-denied-exception :not-node-exception "InternalServiceException" :invalid-arn-exception})

(clojure.spec.alpha/def :portkey.aws.clouddirectory/link-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 64)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"[^\/\[\]\(\):\{\}#@!?\s\\;]+" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/number-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-directories-response/directories (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-directories-response (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-directories-response/directories] :opt-un [:portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.indexed-attribute-missing-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/indexed-attribute-missing-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.indexed-attribute-missing-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tags-number-results (clojure.spec.alpha/int-in 50 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-policy/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-policy (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-detach-policy/policy-reference :portkey.aws.clouddirectory/object-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-state #{:deleted "DISABLED" :disabled "DELETED" "ENABLED" :enabled})

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 64)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-type #{:leaf-node "INDEX" "LEAF_NODE" :index :node :policy "POLICY" "NODE"})

(clojure.spec.alpha/def :portkey.aws.clouddirectory.incompatible-schema-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/incompatible-schema-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.incompatible-schema-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/object-identifier))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-managed-schema-arns-response/schema-arns (clojure.spec.alpha/and :portkey.aws.clouddirectory/arns))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-managed-schema-arns-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-managed-schema-arns-response/schema-arns :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.retryable-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/retryable-conflict-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.retryable-conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-parents-response/parent-links (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-and-link-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-parents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-object-parents-response/parent-links :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-names-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-names-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-typed-link-facet-names-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-typed-link-facet-names-request/schema-arn] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-typed-link-facet-names-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/consistency-level #{"SERIALIZABLE" :serializable "EVENTUAL" :eventual})

(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 64)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-link-attributes-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-link-attributes-request/attribute-updates (clojure.spec.alpha/and :portkey.aws.clouddirectory/link-attribute-update-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-link-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.update-link-attributes-request/directory-arn :portkey.aws.clouddirectory/typed-link-specifier :portkey.aws.clouddirectory.update-link-attributes-request/attribute-updates] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-policy-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-policy-request/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.detach-policy-request/directory-arn :portkey.aws.clouddirectory.detach-policy-request/policy-reference :portkey.aws.clouddirectory/object-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.tag/key (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-key))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.tag/value (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.tag/key :portkey.aws.clouddirectory.tag/value]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-object-request/schema-facets (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-object-request/object-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-object-request/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.create-object-request/directory-arn :portkey.aws.clouddirectory.create-object-request/schema-facets] :opt-un [:portkey.aws.clouddirectory.create-object-request/object-attribute-list :portkey.aws.clouddirectory.create-object-request/parent-reference :portkey.aws.clouddirectory/link-name]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 10)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-object/schema-facet (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-object/object-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-object/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-create-object (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-create-object/schema-facet :portkey.aws.clouddirectory.batch-create-object/object-attribute-list] :opt-un [:portkey.aws.clouddirectory.batch-create-object/parent-reference :portkey.aws.clouddirectory/link-name :portkey.aws.clouddirectory/batch-reference-name]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-typed-link-facet-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/schema-arn :portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/name] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-typed-link-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-typed-link-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.detach-typed-link-request/directory-arn :portkey.aws.clouddirectory/typed-link-specifier] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.directory-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.disable-directory-response/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/disable-directory-response (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.disable-directory-response/directory-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-attachment-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-attachment-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-attachment-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-already-detached-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-already-detached-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.object-already-detached-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.disable-directory-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/disable-directory-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.disable-directory-request/directory-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-response/responses (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-operation-response-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-read-response/responses]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-style #{:static :dynamic "STATIC" "DYNAMIC"})

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-attributes-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-attributes-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-attributes-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-facet-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-facet-attributes-request/schema-arn :portkey.aws.clouddirectory.list-facet-attributes-request/name] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-facet-attributes-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-object/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-object (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-detach-object/parent-reference :portkey.aws.clouddirectory/link-name] :opt-un [:portkey.aws.clouddirectory/batch-reference-name]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation-response/successful-response (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-successful-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation-response/exception-response (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-exception))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-operation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-read-operation-response/successful-response :portkey.aws.clouddirectory.batch-read-operation-response/exception-response]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21110__auto__] (clojure.core/<= 1 (clojure.core/count s__21110__auto__))) (clojure.core/fn [s__21111__auto__] (clojure.core/< (clojure.core/count s__21111__auto__) 32)) (clojure.core/fn [s__21112__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__21112__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/type (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/default-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/is-immutable (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/rules (clojure.spec.alpha/and :portkey.aws.clouddirectory/rule-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/required-behavior (clojure.spec.alpha/and :portkey.aws.clouddirectory/required-attribute-behavior))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-attribute-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.typed-link-attribute-definition/name :portkey.aws.clouddirectory.typed-link-attribute-definition/type :portkey.aws.clouddirectory.typed-link-attribute-definition/required-behavior] :opt-un [:portkey.aws.clouddirectory.typed-link-attribute-definition/default-value :portkey.aws.clouddirectory.typed-link-attribute-definition/is-immutable :portkey.aws.clouddirectory.typed-link-attribute-definition/rules]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-link-attributes-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-link-attributes-request/attribute-names (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-link-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.get-link-attributes-request/directory-arn :portkey.aws.clouddirectory/typed-link-specifier :portkey.aws.clouddirectory.get-link-attributes-request/attribute-names] :opt-un [:portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/string-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-parameter-map (clojure.spec.alpha/map-of :portkey.aws.clouddirectory/rule-parameter-key :portkey.aws.clouddirectory/rule-parameter-value))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-object-attributes-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-object-attributes-request/attribute-names (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-object-attributes-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.get-object-attributes-request/directory-arn :portkey.aws.clouddirectory/object-reference :portkey.aws.clouddirectory/schema-facet :portkey.aws.clouddirectory.get-object-attributes-request/attribute-names] :opt-un [:portkey.aws.clouddirectory/consistency-level]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-outgoing-typed-links-response/typed-link-specifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-specifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-outgoing-typed-links-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-outgoing-typed-links-response/typed-link-specifiers :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-object-response/detached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-object-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-detach-object-response/detached-object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-facet-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/schema-facet))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.upgrade-applied-schema-request/published-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.upgrade-applied-schema-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.upgrade-applied-schema-request/dry-run (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/upgrade-applied-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.upgrade-applied-schema-request/published-schema-arn :portkey.aws.clouddirectory.upgrade-applied-schema-request/directory-arn] :opt-un [:portkey.aws.clouddirectory.upgrade-applied-schema-request/dry-run]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-object-request/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-object-request/child-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-object-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.attach-object-request/directory-arn :portkey.aws.clouddirectory.attach-object-request/parent-reference :portkey.aws.clouddirectory.attach-object-request/child-reference :portkey.aws.clouddirectory/link-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attribute-key-and-value/key (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attribute-key-and-value/value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-key-and-value (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.attribute-key-and-value/key :portkey.aws.clouddirectory.attribute-key-and-value/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-applied-schema-arns-response/schema-arns (clojure.spec.alpha/and :portkey.aws.clouddirectory/arns))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-applied-schema-arns-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-applied-schema-arns-response/schema-arns :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-attached-indices/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-attached-indices/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-attached-indices (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.batch-list-attached-indices/target-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.batch-list-attached-indices/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-object-attributes-response/attributes :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.still-contains-links-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/still-contains-links-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.still-contains-links-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/policy-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/add-facet-to-object-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-facet-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-object-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-schema-as-json-response/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-schema-as-json-response/document (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-json-document))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-schema-as-json-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.get-schema-as-json-response/name :portkey.aws.clouddirectory.get-schema-as-json-response/document]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.internal-service-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/internal-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.internal-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-parents/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-parents (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.batch-list-object-parents/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-get-object-information-response/schema-facets (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-get-object-information-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-get-object-information-response/schema-facets :portkey.aws.clouddirectory/object-identifier]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-definition-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-typed-link-facet-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-typed-link-facet-attributes-response/attributes :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-facet-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.delete-facet-request/schema-arn :portkey.aws.clouddirectory.delete-facet-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-published-schema-arns-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-published-schema-arns-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-published-schema-arns-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-published-schema-arns-request/schema-arn :portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-published-schema-arns-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.upgrade-published-schema-request/development-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.upgrade-published-schema-request/published-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.upgrade-published-schema-request/minor-version (clojure.spec.alpha/and :portkey.aws.clouddirectory/version))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.upgrade-published-schema-request/dry-run (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/upgrade-published-schema-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.upgrade-published-schema-request/development-schema-arn :portkey.aws.clouddirectory.upgrade-published-schema-request/published-schema-arn :portkey.aws.clouddirectory.upgrade-published-schema-request/minor-version] :opt-un [:portkey.aws.clouddirectory.upgrade-published-schema-request/dry-run]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-applied-schema-arns-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-applied-schema-arns-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-applied-schema-arns-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-applied-schema-arns-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-applied-schema-arns-request/directory-arn] :opt-un [:portkey.aws.clouddirectory.list-applied-schema-arns-request/schema-arn :portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-applied-schema-arns-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parent-paths-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parent-paths-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-parent-paths-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.list-object-parent-paths-request/directory-arn :portkey.aws.clouddirectory/object-reference] :opt-un [:portkey.aws.clouddirectory/next-token :portkey.aws.clouddirectory.list-object-parent-paths-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-facet-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-reference/target-facet-name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-reference/target-attribute-name (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-reference (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.facet-attribute-reference/target-facet-name :portkey.aws.clouddirectory.facet-attribute-reference/target-attribute-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-update-link-attributes-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.untag-resource-request/resource-arn :portkey.aws.clouddirectory.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/index-attachment-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/index-attachment))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-lookup-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory/policy-to-path-list :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-published-schema-arns-response/schema-arns (clojure.spec.alpha/and :portkey.aws.clouddirectory/arns))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-published-schema-arns-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-published-schema-arns-response/schema-arns :portkey.aws.clouddirectory/next-token]))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.enable-directory-response/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/enable-directory-response (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory.enable-directory-response/directory-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-name-list (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/facet-name))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-directory-response/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-directory-response/applied-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-directory-response (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/directory-arn :portkey.aws.clouddirectory.create-directory-response/name :portkey.aws.clouddirectory/object-identifier :portkey.aws.clouddirectory.create-directory-response/applied-schema-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-directory-response (clojure.spec.alpha/keys :req-un [:portkey.aws.clouddirectory/directory] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-type #{:number-comparison "BINARY_LENGTH" "NUMBER_COMPARISON" :binary-length :string-length "STRING_LENGTH" :string-from-set "STRING_FROM_SET"})

(clojure.core/defn tag-resource "An API operation for adding tags to a resource." ([tag-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/tags/add", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidTaggingRequestException" :portkey.aws.clouddirectory/invalid-tagging-request-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-resource-response))

(clojure.core/defn list-object-policies "Returns policies attached to an object in pagination fashion." ([list-object-policies-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-object-policies-request list-object-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-object-policies-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/policy", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-object-policies-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjectPolicies", :http.request.configuration/output-deser-fn response-list-object-policies-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-object-policies :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-object-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-object-policies-response))

(clojure.core/defn create-index "Creates an index object. See Indexing and search\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/indexing_search.html)\nfor more information." ([create-index-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-index-request create-index-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/create-index-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/index", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/create-index-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateIndex", :http.request.configuration/output-deser-fn response-create-index-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "UnsupportedIndexTypeException" :portkey.aws.clouddirectory/unsupported-index-type-exception, "LinkNameAlreadyInUseException" :portkey.aws.clouddirectory/link-name-already-in-use-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-index :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-index-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-index-response))

(clojure.core/defn list-object-parent-paths "Retrieves all available parent paths for any object type such as node, leaf\nnode, policy node, and index node objects. For more information about objects,\nsee Directory Structure\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directorystructure.html).\n Use this API to evaluate all parents for an object. The call returns all\nobjects from the root of the directory up to the requested object. The API\nreturns the number of paths based on user-defined MaxResults, in case there are\nmultiple paths to the parent. The order of the paths and nodes returned is\nconsistent among multiple API calls unless the objects are deleted or moved.\nPaths not leading to the directory root are ignored from the target object." ([list-object-parent-paths-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-object-parent-paths-request list-object-parent-paths-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-object-parent-paths-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/parentpaths", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-object-parent-paths-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjectParentPaths", :http.request.configuration/output-deser-fn response-list-object-parent-paths-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-object-parent-paths :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-object-parent-paths-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-object-parent-paths-response))

(clojure.core/defn put-schema-from-json "Allows a schema to be updated using JSON upload. Only available for development\nschemas. See JSON Schema Format\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_jsonformat.html#schemas_json)\nfor more information." ([put-schema-from-json-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-put-schema-from-json-request put-schema-from-json-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/put-schema-from-json-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/json", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/put-schema-from-json-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutSchemaFromJson", :http.request.configuration/output-deser-fn response-put-schema-from-json-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "InvalidSchemaDocException" :portkey.aws.clouddirectory/invalid-schema-doc-exception, "InvalidRuleException" :portkey.aws.clouddirectory/invalid-rule-exception}})))))
(clojure.spec.alpha/fdef put-schema-from-json :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/put-schema-from-json-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/put-schema-from-json-response))

(clojure.core/defn upgrade-applied-schema "Upgrades a single directory in-place using the PublishedSchemaArn with schema\nupdates found in MinorVersion. Backwards-compatible minor version upgrades are\ninstantaneously available for readers on all objects in the directory. Note:\nThis is a synchronous API call and upgrades only one schema on a given directory\nper call. To upgrade multiple directories from one schema, you would need to\ncall this API on each directory." ([upgrade-applied-schema-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-upgrade-applied-schema-request upgrade-applied-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/upgrade-applied-schema-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/upgradeapplied", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/upgrade-applied-schema-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpgradeAppliedSchema", :http.request.configuration/output-deser-fn response-upgrade-applied-schema-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "SchemaAlreadyExistsException" :portkey.aws.clouddirectory/schema-already-exists-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "IncompatibleSchemaException" :portkey.aws.clouddirectory/incompatible-schema-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidAttachmentException" :portkey.aws.clouddirectory/invalid-attachment-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef upgrade-applied-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/upgrade-applied-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/upgrade-applied-schema-response))

(clojure.core/defn create-object "Creates an object in a Directory. Additionally attaches the object to a parent,\nif a parent reference and LinkName is specified. An object is simply a\ncollection of Facet attributes. You can also use this API call to create a\npolicy object, if the facet from which you create the object is a policy facet." ([create-object-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-object-request create-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/create-object-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/create-object-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateObject", :http.request.configuration/output-deser-fn response-create-object-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "UnsupportedIndexTypeException" :portkey.aws.clouddirectory/unsupported-index-type-exception, "LinkNameAlreadyInUseException" :portkey.aws.clouddirectory/link-name-already-in-use-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-object-response))

(clojure.core/defn detach-policy "Detaches a policy from an object." ([detach-policy-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-detach-policy-request detach-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/detach-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/policy/detach", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/detach-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachPolicy", :http.request.configuration/output-deser-fn response-detach-policy-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "NotPolicyException" :portkey.aws.clouddirectory/not-policy-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef detach-policy :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/detach-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/detach-policy-response))

(clojure.core/defn delete-directory "Deletes a directory. Only disabled directories can be deleted. A deleted\ndirectory cannot be undone. Exercise extreme caution when deleting directories." ([delete-directory-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-directory-request delete-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/delete-directory-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/directory", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/delete-directory-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDirectory", :http.request.configuration/output-deser-fn response-delete-directory-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "DirectoryNotDisabledException" :portkey.aws.clouddirectory/directory-not-disabled-exception, "DirectoryDeletedException" :portkey.aws.clouddirectory/directory-deleted-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-directory :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/delete-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/delete-directory-response))

(clojure.core/defn batch-write "Performs all the write operations in a batch. Either all the operations succeed\nor none." ([batch-write-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-batch-write-request batch-write-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/batch-write-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/batchwrite", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/batch-write-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchWrite", :http.request.configuration/output-deser-fn response-batch-write-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "BatchWriteException" :portkey.aws.clouddirectory/batch-write-exception}})))))
(clojure.spec.alpha/fdef batch-write :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/batch-write-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-write-response))

(clojure.core/defn list-typed-link-facet-names "Returns a paginated list of TypedLink facet names for a particular schema. For\nmore information, see Typed Links\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink)." ([list-typed-link-facet-names-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-typed-link-facet-names-request list-typed-link-facet-names-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-typed-link-facet-names-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/facet/list", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-typed-link-facet-names-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTypedLinkFacetNames", :http.request.configuration/output-deser-fn response-list-typed-link-facet-names-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-typed-link-facet-names :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-typed-link-facet-names-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-typed-link-facet-names-response))

(clojure.core/defn batch-read "Performs all the read operations in a batch." ([batch-read-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-batch-read-request batch-read-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/batch-read-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/batchread", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/batch-read-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchRead", :http.request.configuration/output-deser-fn response-batch-read-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception}})))))
(clojure.spec.alpha/fdef batch-read :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/batch-read-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-response))

(clojure.core/defn list-incoming-typed-links "Returns a paginated list of all the incoming TypedLinkSpecifier information for\nan object. It also supports filtering by typed link facet and identity\nattributes. For more information, see Typed Links\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink)." ([list-incoming-typed-links-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-incoming-typed-links-request list-incoming-typed-links-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-incoming-typed-links-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/incoming", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-incoming-typed-links-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListIncomingTypedLinks", :http.request.configuration/output-deser-fn response-list-incoming-typed-links-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-incoming-typed-links :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-incoming-typed-links-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-incoming-typed-links-response))

(clojure.core/defn list-development-schema-arns "Retrieves each Amazon Resource Name (ARN) of schemas in the development state." ([] (list-development-schema-arns {})) ([list-development-schema-arns-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-development-schema-arns-request list-development-schema-arns-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-development-schema-arns-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/development", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-development-schema-arns-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDevelopmentSchemaArns", :http.request.configuration/output-deser-fn response-list-development-schema-arns-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-development-schema-arns :args (clojure.spec.alpha/? :portkey.aws.clouddirectory/list-development-schema-arns-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-development-schema-arns-response))

(clojure.core/defn delete-schema "Deletes a given schema. Schemas in a development and published state can only be\ndeleted." ([delete-schema-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-schema-request delete-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/delete-schema-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/delete-schema-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSchema", :http.request.configuration/output-deser-fn response-delete-schema-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "StillContainsLinksException" :portkey.aws.clouddirectory/still-contains-links-exception}})))))
(clojure.spec.alpha/fdef delete-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/delete-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/delete-schema-response))

(clojure.core/defn delete-typed-link-facet "Deletes a TypedLinkFacet. For more information, see Typed Links\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink)." ([delete-typed-link-facet-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-typed-link-facet-request delete-typed-link-facet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/delete-typed-link-facet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/facet/delete", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/delete-typed-link-facet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTypedLinkFacet", :http.request.configuration/output-deser-fn response-delete-typed-link-facet-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-typed-link-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/delete-typed-link-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/delete-typed-link-facet-response))

(clojure.core/defn publish-schema "Publishes a development schema with a major version and a recommended minor\nversion." ([publish-schema-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-publish-schema-request publish-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/publish-schema-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/publish", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/publish-schema-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PublishSchema", :http.request.configuration/output-deser-fn response-publish-schema-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "SchemaAlreadyPublishedException" :portkey.aws.clouddirectory/schema-already-published-exception}})))))
(clojure.spec.alpha/fdef publish-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/publish-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/publish-schema-response))

(clojure.core/defn disable-directory "Disables the specified directory. Disabled directories cannot be read or written\nto. Only enabled directories can be disabled. Disabled directories may be\nreenabled." ([disable-directory-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-disable-directory-request disable-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/disable-directory-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/directory/disable", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/disable-directory-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableDirectory", :http.request.configuration/output-deser-fn response-disable-directory-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "DirectoryDeletedException" :portkey.aws.clouddirectory/directory-deleted-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef disable-directory :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/disable-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/disable-directory-response))

(clojure.core/defn create-typed-link-facet "Creates a TypedLinkFacet. For more information, see Typed Links\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink)." ([create-typed-link-facet-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-typed-link-facet-request create-typed-link-facet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/create-typed-link-facet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/facet/create", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/create-typed-link-facet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTypedLinkFacet", :http.request.configuration/output-deser-fn response-create-typed-link-facet-response, :http.request.spec/error-spec {"InvalidRuleException" :portkey.aws.clouddirectory/invalid-rule-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "FacetAlreadyExistsException" :portkey.aws.clouddirectory/facet-already-exists-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-typed-link-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-typed-link-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-typed-link-facet-response))

(clojure.core/defn get-object-attributes "Retrieves attributes within a facet that are associated with an object." ([get-object-attributes-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-object-attributes-request get-object-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/get-object-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/attributes/get", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/get-object-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectAttributes", :http.request.configuration/output-deser-fn response-get-object-attributes-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef get-object-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-object-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-object-attributes-response))

(clojure.core/defn create-facet "Creates a new Facet in a schema. Facet creation is allowed only in development\nor applied schemas." ([create-facet-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-facet-request create-facet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/create-facet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/facet/create", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/create-facet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFacet", :http.request.configuration/output-deser-fn response-create-facet-response, :http.request.spec/error-spec {"InvalidRuleException" :portkey.aws.clouddirectory/invalid-rule-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "FacetAlreadyExistsException" :portkey.aws.clouddirectory/facet-already-exists-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef create-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-facet-response))

(clojure.core/defn detach-object "Detaches a given object from the parent object. The object that is to be\ndetached from the parent is specified by the link name." ([detach-object-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-detach-object-request detach-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/detach-object-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/detach", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/detach-object-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachObject", :http.request.configuration/output-deser-fn response-detach-object-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "NotNodeException" :portkey.aws.clouddirectory/not-node-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef detach-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/detach-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/detach-object-response))

(clojure.core/defn get-object-information "Retrieves metadata about an object." ([get-object-information-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-object-information-request get-object-information-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/get-object-information-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/information", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/get-object-information-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetObjectInformation", :http.request.configuration/output-deser-fn response-get-object-information-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-object-information :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-object-information-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-object-information-response))

(clojure.core/defn list-facet-names "Retrieves the names of facets that exist in a schema." ([list-facet-names-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-facet-names-request list-facet-names-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-facet-names-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/facet/list", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-facet-names-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFacetNames", :http.request.configuration/output-deser-fn response-list-facet-names-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-facet-names :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-facet-names-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-facet-names-response))

(clojure.core/defn upgrade-published-schema "Upgrades a published schema under a new minor version revision using the current\ncontents of DevelopmentSchemaArn." ([upgrade-published-schema-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-upgrade-published-schema-request upgrade-published-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/upgrade-published-schema-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/upgradepublished", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/upgrade-published-schema-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpgradePublishedSchema", :http.request.configuration/output-deser-fn response-upgrade-published-schema-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "IncompatibleSchemaException" :portkey.aws.clouddirectory/incompatible-schema-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidAttachmentException" :portkey.aws.clouddirectory/invalid-attachment-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef upgrade-published-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/upgrade-published-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/upgrade-published-schema-response))

(clojure.core/defn detach-from-index "Detaches the specified object from the specified index." ([detach-from-index-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-detach-from-index-request detach-from-index-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/detach-from-index-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/index/detach", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/detach-from-index-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachFromIndex", :http.request.configuration/output-deser-fn response-detach-from-index-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "NotIndexException" :portkey.aws.clouddirectory/not-index-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ObjectAlreadyDetachedException" :portkey.aws.clouddirectory/object-already-detached-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef detach-from-index :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/detach-from-index-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/detach-from-index-response))

(clojure.core/defn attach-object "Attaches an existing object to another object. An object can be accessed in two\nways:\n * Using the path\n * Using ObjectIdentifier" ([attach-object-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-attach-object-request attach-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/attach-object-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/attach", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/attach-object-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachObject", :http.request.configuration/output-deser-fn response-attach-object-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LinkNameAlreadyInUseException" :portkey.aws.clouddirectory/link-name-already-in-use-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidAttachmentException" :portkey.aws.clouddirectory/invalid-attachment-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef attach-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/attach-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/attach-object-response))

(clojure.core/defn list-tags-for-resource "Returns tags for a resource. Tagging is currently supported only for directories\nwith a limit of 50 tags per directory. All 50 tags are returned for a given\ndirectory with this API call." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/tags", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-tags-for-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidTaggingRequestException" :portkey.aws.clouddirectory/invalid-tagging-request-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-tags-for-resource-response))

(clojure.core/defn apply-schema "Copies the input published schema, at the specified version, into the Directory\nwith the same name and version as that of the published schema." ([apply-schema-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-apply-schema-request apply-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/apply-schema-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/apply", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/apply-schema-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ApplySchema", :http.request.configuration/output-deser-fn response-apply-schema-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "SchemaAlreadyExistsException" :portkey.aws.clouddirectory/schema-already-exists-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidAttachmentException" :portkey.aws.clouddirectory/invalid-attachment-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef apply-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/apply-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/apply-schema-response))

(clojure.core/defn list-policy-attachments "Returns all of the ObjectIdentifiers to which a given policy is attached." ([list-policy-attachments-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-policy-attachments-request list-policy-attachments-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-policy-attachments-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/policy/attachment", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-policy-attachments-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPolicyAttachments", :http.request.configuration/output-deser-fn response-list-policy-attachments-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "NotPolicyException" :portkey.aws.clouddirectory/not-policy-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-policy-attachments :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-policy-attachments-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-policy-attachments-response))

(clojure.core/defn list-outgoing-typed-links "Returns a paginated list of all the outgoing TypedLinkSpecifier information for\nan object. It also supports filtering by typed link facet and identity\nattributes. For more information, see Typed Links\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink)." ([list-outgoing-typed-links-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-outgoing-typed-links-request list-outgoing-typed-links-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-outgoing-typed-links-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/outgoing", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-outgoing-typed-links-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListOutgoingTypedLinks", :http.request.configuration/output-deser-fn response-list-outgoing-typed-links-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-outgoing-typed-links :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-outgoing-typed-links-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-outgoing-typed-links-response))

(clojure.core/defn get-facet "Gets details of the Facet, such as facet name, attributes, Rules, or ObjectType.\nYou can call this on all kinds of schema facets -- published, development, or\napplied." ([get-facet-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-facet-request get-facet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/get-facet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/facet", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/get-facet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFacet", :http.request.configuration/output-deser-fn response-get-facet-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception}})))))
(clojure.spec.alpha/fdef get-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-facet-response))

(clojure.core/defn list-facet-attributes "Retrieves attributes attached to the facet." ([list-facet-attributes-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-facet-attributes-request list-facet-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-facet-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/facet/attributes", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-facet-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFacetAttributes", :http.request.configuration/output-deser-fn response-list-facet-attributes-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-facet-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-facet-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-facet-attributes-response))

(clojure.core/defn update-link-attributes "Updates a given typed link’s attributes. Attributes to be updated must not\ncontribute to the typed link’s identity, as defined by its\nIdentityAttributeOrder." ([update-link-attributes-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-link-attributes-request update-link-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/update-link-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/attributes/update", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/update-link-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateLinkAttributes", :http.request.configuration/output-deser-fn response-update-link-attributes-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-link-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/update-link-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-link-attributes-response))

(clojure.core/defn attach-to-index "Attaches the specified object to the specified index." ([attach-to-index-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-attach-to-index-request attach-to-index-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/attach-to-index-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/index/attach", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/attach-to-index-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachToIndex", :http.request.configuration/output-deser-fn response-attach-to-index-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LinkNameAlreadyInUseException" :portkey.aws.clouddirectory/link-name-already-in-use-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "NotIndexException" :portkey.aws.clouddirectory/not-index-exception, "IndexedAttributeMissingException" :portkey.aws.clouddirectory/indexed-attribute-missing-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidAttachmentException" :portkey.aws.clouddirectory/invalid-attachment-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef attach-to-index :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/attach-to-index-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/attach-to-index-response))

(clojure.core/defn list-directories "Lists directories created within an account." ([] (list-directories {})) ([list-directories-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-directories-request list-directories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-directories-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/directory/list", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-directories-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDirectories", :http.request.configuration/output-deser-fn response-list-directories-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-directories :args (clojure.spec.alpha/? :portkey.aws.clouddirectory/list-directories-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-directories-response))

(clojure.core/defn get-link-attributes "Retrieves attributes that are associated with a typed link." ([get-link-attributes-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-link-attributes-request get-link-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/get-link-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/attributes/get", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/get-link-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLinkAttributes", :http.request.configuration/output-deser-fn response-get-link-attributes-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef get-link-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-link-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-link-attributes-response))

(clojure.core/defn list-object-attributes "Lists all attributes that are associated with an object." ([list-object-attributes-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-object-attributes-request list-object-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-object-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/attributes", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-object-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjectAttributes", :http.request.configuration/output-deser-fn response-list-object-attributes-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-object-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-object-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-object-attributes-response))

(clojure.core/defn list-index "Lists objects attached to the specified index." ([list-index-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-index-request list-index-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-index-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/index/targets", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-index-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListIndex", :http.request.configuration/output-deser-fn response-list-index-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "NotIndexException" :portkey.aws.clouddirectory/not-index-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-index :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-index-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-index-response))

(clojure.core/defn attach-typed-link "Attaches a typed link to a specified source and target object. For more\ninformation, see Typed Links\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink)." ([attach-typed-link-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-attach-typed-link-request attach-typed-link-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/attach-typed-link-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/attach", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/attach-typed-link-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachTypedLink", :http.request.configuration/output-deser-fn response-attach-typed-link-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidAttachmentException" :portkey.aws.clouddirectory/invalid-attachment-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef attach-typed-link :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/attach-typed-link-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/attach-typed-link-response))

(clojure.core/defn detach-typed-link "Detaches a typed link from a specified source and target object. For more\ninformation, see Typed Links\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink)." ([detach-typed-link-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-detach-typed-link-request detach-typed-link-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/detach", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/detach-typed-link-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachTypedLink", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22152__auto__] {}), :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef detach-typed-link :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/detach-typed-link-request) :ret clojure.core/true?)

(clojure.core/defn list-object-children "Returns a paginated list of child objects that are associated with a given\nobject." ([list-object-children-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-object-children-request list-object-children-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-object-children-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/children", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-object-children-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjectChildren", :http.request.configuration/output-deser-fn response-list-object-children-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "NotNodeException" :portkey.aws.clouddirectory/not-node-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-object-children :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-object-children-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-object-children-response))

(clojure.core/defn update-typed-link-facet "Updates a TypedLinkFacet. For more information, see Typed Links\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink)." ([update-typed-link-facet-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-typed-link-facet-request update-typed-link-facet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/update-typed-link-facet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/facet", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/update-typed-link-facet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateTypedLinkFacet", :http.request.configuration/output-deser-fn response-update-typed-link-facet-response, :http.request.spec/error-spec {"InvalidRuleException" :portkey.aws.clouddirectory/invalid-rule-exception, "InvalidFacetUpdateException" :portkey.aws.clouddirectory/invalid-facet-update-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-typed-link-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/update-typed-link-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-typed-link-facet-response))

(clojure.core/defn add-facet-to-object "Adds a new Facet to an object. An object can have more than one facet applied on\nit." ([add-facet-to-object-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-add-facet-to-object-request add-facet-to-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/add-facet-to-object-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/facets", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/add-facet-to-object-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddFacetToObject", :http.request.configuration/output-deser-fn response-add-facet-to-object-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef add-facet-to-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/add-facet-to-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/add-facet-to-object-response))

(clojure.core/defn get-applied-schema-version "Returns current applied schema version ARN, including the minor version in use." ([get-applied-schema-version-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-applied-schema-version-request get-applied-schema-version-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/get-applied-schema-version-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/getappliedschema", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/get-applied-schema-version-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAppliedSchemaVersion", :http.request.configuration/output-deser-fn response-get-applied-schema-version-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-applied-schema-version :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-applied-schema-version-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-applied-schema-version-response))

(clojure.core/defn create-schema "Creates a new schema in a development state. A schema can exist in three phases:\n * Development: This is a mutable phase of the schema. All new schemas are in\nthe development phase. Once the schema is finalized, it can be published.\n * Published: Published schemas are immutable and have a version associated with\nthem.\n * Applied: Applied schemas are mutable in a way that allows you to add new\nschema facets. You can also add new, nonrequired attributes to existing schema\nfacets. You can apply only published schemas to directories." ([create-schema-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-schema-request create-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/create-schema-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/create", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/create-schema-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSchema", :http.request.configuration/output-deser-fn response-create-schema-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "SchemaAlreadyExistsException" :portkey.aws.clouddirectory/schema-already-exists-exception}})))))
(clojure.spec.alpha/fdef create-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-schema-response))

(clojure.core/defn update-object-attributes "Updates a given object's attributes." ([update-object-attributes-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-object-attributes-request update-object-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/update-object-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/update", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/update-object-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateObjectAttributes", :http.request.configuration/output-deser-fn response-update-object-attributes-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LinkNameAlreadyInUseException" :portkey.aws.clouddirectory/link-name-already-in-use-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-object-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/update-object-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-object-attributes-response))

(clojure.core/defn delete-object "Deletes an object and its associated attributes. Only objects with no children\nand no parents can be deleted. The maximum number of attributes that can be\ndeleted during an object deletion is 30. For more information, see Amazon Cloud\nDirectory Limits\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/limits.html)." ([delete-object-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-object-request delete-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/delete-object-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/delete", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/delete-object-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteObject", :http.request.configuration/output-deser-fn response-delete-object-response, :http.request.spec/error-spec {"ObjectNotDetachedException" :portkey.aws.clouddirectory/object-not-detached-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/delete-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/delete-object-response))

(clojure.core/defn list-object-parents "Lists parent objects that are associated with a given object in pagination\nfashion." ([list-object-parents-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-object-parents-request list-object-parents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-object-parents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/parent", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-object-parents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListObjectParents", :http.request.configuration/output-deser-fn response-list-object-parents-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "CannotListParentOfRootException" :portkey.aws.clouddirectory/cannot-list-parent-of-root-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-object-parents :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-object-parents-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-object-parents-response))

(clojure.core/defn update-schema "Updates the schema name with a new name. Only development schema names can be\nupdated." ([update-schema-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-schema-request update-schema-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/update-schema-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/update", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/update-schema-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSchema", :http.request.configuration/output-deser-fn response-update-schema-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef update-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/update-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-schema-response))

(clojure.core/defn untag-resource "An API operation for removing tags from a resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/tags/remove", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidTaggingRequestException" :portkey.aws.clouddirectory/invalid-tagging-request-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/untag-resource-response))

(clojure.core/defn update-facet "Does the following:\n * Adds new Attributes, Rules, or ObjectTypes.\n * Updates existing Attributes, Rules, or ObjectTypes.\n * Deletes existing Attributes, Rules, or ObjectTypes." ([update-facet-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-update-facet-request update-facet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/update-facet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/facet", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/update-facet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFacet", :http.request.configuration/output-deser-fn response-update-facet-response, :http.request.spec/error-spec {"InvalidRuleException" :portkey.aws.clouddirectory/invalid-rule-exception, "InvalidFacetUpdateException" :portkey.aws.clouddirectory/invalid-facet-update-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef update-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/update-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-facet-response))

(clojure.core/defn list-applied-schema-arns "Lists schema major versions applied to a directory. If SchemaArn is provided,\nlists the minor version." ([list-applied-schema-arns-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-applied-schema-arns-request list-applied-schema-arns-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-applied-schema-arns-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/applied", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-applied-schema-arns-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAppliedSchemaArns", :http.request.configuration/output-deser-fn response-list-applied-schema-arns-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-applied-schema-arns :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-applied-schema-arns-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-applied-schema-arns-response))

(clojure.core/defn create-directory "Creates a Directory by copying the published schema into the directory. A\ndirectory cannot be created without a schema.\n You can also quickly create a directory using a managed schema, called the\nQuickStartSchema. For more information, see Managed Schema\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_managed.html)\nin the Amazon Cloud Directory Developer Guide." ([create-directory-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-create-directory-request create-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/create-directory-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/directory/create", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/create-directory-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDirectory", :http.request.configuration/output-deser-fn response-create-directory-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryAlreadyExistsException" :portkey.aws.clouddirectory/directory-already-exists-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef create-directory :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-directory-response))

(clojure.core/defn get-schema-as-json "Retrieves a JSON representation of the schema. See JSON Schema Format\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/schemas_jsonformat.html#schemas_json)\nfor more information." ([get-schema-as-json-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-schema-as-json-request get-schema-as-json-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/get-schema-as-json-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/json", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/get-schema-as-json-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSchemaAsJson", :http.request.configuration/output-deser-fn response-get-schema-as-json-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-schema-as-json :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-schema-as-json-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-schema-as-json-response))

(clojure.core/defn list-attached-indices "Lists indices attached to the specified object." ([list-attached-indices-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-attached-indices-request list-attached-indices-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-attached-indices-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/indices", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-attached-indices-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAttachedIndices", :http.request.configuration/output-deser-fn response-list-attached-indices-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-attached-indices :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-attached-indices-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-attached-indices-response))

(clojure.core/defn attach-policy "Attaches a policy object to a regular object. An object can have a limited\nnumber of attached policies." ([attach-policy-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-attach-policy-request attach-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/attach-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/policy/attach", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/attach-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachPolicy", :http.request.configuration/output-deser-fn response-attach-policy-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "NotPolicyException" :portkey.aws.clouddirectory/not-policy-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef attach-policy :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/attach-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/attach-policy-response))

(clojure.core/defn get-typed-link-facet-information "Returns the identity attribute order for a specific TypedLinkFacet. For more\ninformation, see Typed Links\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink)." ([get-typed-link-facet-information-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-typed-link-facet-information-request get-typed-link-facet-information-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/get-typed-link-facet-information-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/facet/get", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/get-typed-link-facet-information-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetTypedLinkFacetInformation", :http.request.configuration/output-deser-fn response-get-typed-link-facet-information-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef get-typed-link-facet-information :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-typed-link-facet-information-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-typed-link-facet-information-response))

(clojure.core/defn lookup-policy "Lists all policies from the root of the Directory to the object specified. If\nthere are no policies present, an empty list is returned. If policies are\npresent, and if some objects don't have the policies attached, it returns the\nObjectIdentifier for such objects. If policies are present, it returns\nObjectIdentifier, policyId, and policyType. Paths that don't lead to the root\nfrom the target object are ignored. For more information, see Policies\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/key_concepts_directory.html#key_concepts_policies)." ([lookup-policy-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-lookup-policy-request lookup-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/lookup-policy-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/policy/lookup", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/lookup-policy-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "LookupPolicy", :http.request.configuration/output-deser-fn response-lookup-policy-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef lookup-policy :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/lookup-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/lookup-policy-response))

(clojure.core/defn get-directory "Retrieves metadata about a directory." ([get-directory-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-get-directory-request get-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/get-directory-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/directory/get", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/get-directory-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDirectory", :http.request.configuration/output-deser-fn response-get-directory-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception}})))))
(clojure.spec.alpha/fdef get-directory :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-directory-response))

(clojure.core/defn list-managed-schema-arns "Lists the major version families of each managed schema. If a major version ARN\nis provided as SchemaArn, the minor version revisions in that family are listed\ninstead." ([] (list-managed-schema-arns {})) ([list-managed-schema-arns-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-managed-schema-arns-request list-managed-schema-arns-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-managed-schema-arns-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/managed", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-managed-schema-arns-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListManagedSchemaArns", :http.request.configuration/output-deser-fn response-list-managed-schema-arns-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-managed-schema-arns :args (clojure.spec.alpha/? :portkey.aws.clouddirectory/list-managed-schema-arns-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-managed-schema-arns-response))

(clojure.core/defn list-published-schema-arns "Lists the major version families of each published schema. If a major version\nARN is provided as SchemaArn, the minor version revisions in that family are\nlisted instead." ([] (list-published-schema-arns {})) ([list-published-schema-arns-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-published-schema-arns-request list-published-schema-arns-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-published-schema-arns-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/schema/published", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-published-schema-arns-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPublishedSchemaArns", :http.request.configuration/output-deser-fn response-list-published-schema-arns-response, :http.request.spec/error-spec {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception}})))))
(clojure.spec.alpha/fdef list-published-schema-arns :args (clojure.spec.alpha/? :portkey.aws.clouddirectory/list-published-schema-arns-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-published-schema-arns-response))

(clojure.core/defn list-typed-link-facet-attributes "Returns a paginated list of all attribute definitions for a particular\nTypedLinkFacet. For more information, see Typed Links\n(https://docs.aws.amazon.com/clouddirectory/latest/developerguide/directory_objects_links.html#directory_objects_links_typedlink)." ([list-typed-link-facet-attributes-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-list-typed-link-facet-attributes-request list-typed-link-facet-attributes-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/list-typed-link-facet-attributes-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/typedlink/facet/attributes", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/list-typed-link-facet-attributes-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTypedLinkFacetAttributes", :http.request.configuration/output-deser-fn response-list-typed-link-facet-attributes-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef list-typed-link-facet-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-typed-link-facet-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-typed-link-facet-attributes-response))

(clojure.core/defn enable-directory "Enables the specified directory. Only disabled directories can be enabled. Once\nenabled, the directory can then be read and written to." ([enable-directory-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-enable-directory-request enable-directory-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/enable-directory-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/directory/enable", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/enable-directory-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableDirectory", :http.request.configuration/output-deser-fn response-enable-directory-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "DirectoryDeletedException" :portkey.aws.clouddirectory/directory-deleted-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception}})))))
(clojure.spec.alpha/fdef enable-directory :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/enable-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/enable-directory-response))

(clojure.core/defn delete-facet "Deletes a given Facet. All attributes and Rules that are associated with the\nfacet will be deleted. Only development schema facets are allowed deletion." ([delete-facet-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-delete-facet-request delete-facet-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/delete-facet-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/facet/delete", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/delete-facet-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFacet", :http.request.configuration/output-deser-fn response-delete-facet-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "FacetInUseException" :portkey.aws.clouddirectory/facet-in-use-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef delete-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/delete-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/delete-facet-response))

(clojure.core/defn remove-facet-from-object "Removes the specified facet from the specified object." ([remove-facet-from-object-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-remove-facet-from-object-request remove-facet-from-object-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.clouddirectory/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.clouddirectory/remove-facet-from-object-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/amazonclouddirectory/2017-01-11/object/facets/delete", :http.request.configuration/version "2017-01-11", :http.request.configuration/service-id "CloudDirectory", :http.request.spec/input-spec :portkey.aws.clouddirectory/remove-facet-from-object-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code 200, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveFacetFromObject", :http.request.configuration/output-deser-fn response-remove-facet-from-object-response, :http.request.spec/error-spec {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception}})))))
(clojure.spec.alpha/fdef remove-facet-from-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/remove-facet-from-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/remove-facet-from-object-response))
