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
   "eu-west-2"
   {:credential-scope {:service "clouddirectory", :region "eu-west-2"},
    :ssl-common-name "clouddirectory.eu-west-2.amazonaws.com",
    :endpoint "https://clouddirectory.eu-west-2.amazonaws.com",
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

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-update-object-attributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/ObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-object-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.delete-object-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-rule-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-rule-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-rule-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-to-index-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-to-index-request/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-to-index-request/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-to-index-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.attach-to-index-request/DirectoryArn :portkey.aws.clouddirectory.attach-to-index-request/IndexReference :portkey.aws.clouddirectory.attach-to-index-request/TargetReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 64)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-directory-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-directory-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-directory-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.create-directory-request/Name :portkey.aws.clouddirectory.create-directory-request/SchemaArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-exception/index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-operation-index))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-exception/type (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-write-exception-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-write-exception/Index :portkey.aws.clouddirectory.batch-write-exception/Type :portkey.aws.clouddirectory.batch-write-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-incoming-typed-links-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-incoming-typed-links-request/filter-attribute-ranges (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-incoming-typed-links-request/filter-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-incoming-typed-links-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-incoming-typed-links-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-incoming-typed-links-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory.list-incoming-typed-links-request/FilterAttributeRanges :portkey.aws.clouddirectory.list-incoming-typed-links-request/FilterTypedLink :portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-incoming-typed-links-request/MaxResults :portkey.aws.clouddirectory/ConsistencyLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-object-policies (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-policies-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-object-parent-paths (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-parent-paths-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-incoming-typed-links (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-incoming-typed-links-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/get-object-information (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-get-object-information-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-policy-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-policy-attachments-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-outgoing-typed-links (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-outgoing-typed-links-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-object-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-attributes-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-index-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-object-children (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-children-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/list-attached-indices (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-attached-indices-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-successful-response/lookup-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-lookup-policy-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-successful-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-read-successful-response/ListObjectPolicies :portkey.aws.clouddirectory.batch-read-successful-response/ListObjectParentPaths :portkey.aws.clouddirectory.batch-read-successful-response/ListIncomingTypedLinks :portkey.aws.clouddirectory.batch-read-successful-response/GetObjectInformation :portkey.aws.clouddirectory.batch-read-successful-response/ListPolicyAttachments :portkey.aws.clouddirectory.batch-read-successful-response/ListOutgoingTypedLinks :portkey.aws.clouddirectory.batch-read-successful-response/ListObjectAttributes :portkey.aws.clouddirectory.batch-read-successful-response/ListIndex :portkey.aws.clouddirectory.batch-read-successful-response/ListObjectChildren :portkey.aws.clouddirectory.batch-read-successful-response/ListAttachedIndices :portkey.aws.clouddirectory.batch-read-successful-response/LookupPolicy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-index/ranges-on-indexed-values (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-index/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-index/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-index (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-list-index/IndexReference] :opt-un [:portkey.aws.clouddirectory.batch-list-index/RangesOnIndexedValues :portkey.aws.clouddirectory.batch-list-index/MaxResults :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-children-response/children (clojure.spec.alpha/and :portkey.aws.clouddirectory/link-name-to-object-identifier-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-children-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-object-children-response/Children :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.policy-attachment/policy-id (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/policy-attachment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.policy-attachment/PolicyId :portkey.aws.clouddirectory/ObjectIdentifier :portkey.aws.clouddirectory/PolicyType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parents-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parents-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-parents-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-object-parents-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-object-parents-request/MaxResults :portkey.aws.clouddirectory/ConsistencyLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-not-detached-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-not-detached-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.object-not-detached-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-typed-link-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/TypedLinkSpecifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/put-schema-from-json-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/Arn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.schema-facet/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-facet (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.schema-facet/SchemaArn :portkey.aws.clouddirectory/FacetName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-index-response/index-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/index-attachment-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-index-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-index-response/IndexAttachments :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-attached-indices-response/index-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/index-attachment-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-attached-indices-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-attached-indices-response/IndexAttachments :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-operation-response-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/batch-write-operation-response :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-typed-link-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-typed-link-request/source-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-typed-link-request/target-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-typed-link-request/typed-link-facet (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-typed-link-request/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-typed-link-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.attach-typed-link-request/DirectoryArn :portkey.aws.clouddirectory.attach-typed-link-request/SourceObjectReference :portkey.aws.clouddirectory.attach-typed-link-request/TargetObjectReference :portkey.aws.clouddirectory.attach-typed-link-request/TypedLinkFacet :portkey.aws.clouddirectory.attach-typed-link-request/Attributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-attributes/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-attributes/facet-filter (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-attributes (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.batch-list-object-attributes/MaxResults :portkey.aws.clouddirectory.batch-list-object-attributes/FacetFilter] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute/attribute-definition (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-definition))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute/attribute-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute/required-behavior (clojure.spec.alpha/and :portkey.aws.clouddirectory/required-attribute-behavior))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.facet-attribute/Name] :opt-un [:portkey.aws.clouddirectory.facet-attribute/AttributeDefinition :portkey.aws.clouddirectory.facet-attribute/AttributeReference :portkey.aws.clouddirectory.facet-attribute/RequiredBehavior] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-attribute-update/object-attribute-key (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-attribute-update (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.object-attribute-update/ObjectAttributeKey :portkey.aws.clouddirectory/ObjectAttributeAction] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-facet-update-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-facet-update-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-facet-update-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value/string-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/string-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value/binary-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/binary-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value/boolean-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/boolean-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value/number-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value/datetime-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/datetime-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-attribute-value (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.typed-attribute-value/StringValue :portkey.aws.clouddirectory.typed-attribute-value/BinaryValue :portkey.aws.clouddirectory.typed-attribute-value/BooleanValue :portkey.aws.clouddirectory.typed-attribute-value/NumberValue :portkey.aws.clouddirectory.typed-attribute-value/DatetimeValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-from-index-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-from-index-request/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-from-index-request/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-from-index-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.detach-from-index-request/DirectoryArn :portkey.aws.clouddirectory.detach-from-index-request/IndexReference :portkey.aws.clouddirectory.detach-from-index-request/TargetReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-definition/type (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-definition/default-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-definition/is-immutable (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-definition/rules (clojure.spec.alpha/and :portkey.aws.clouddirectory/rule-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-definition (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.facet-attribute-definition/Type] :opt-un [:portkey.aws.clouddirectory.facet-attribute-definition/DefaultValue :portkey.aws.clouddirectory.facet-attribute-definition/IsImmutable :portkey.aws.clouddirectory.facet-attribute-definition/Rules] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.validation-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.validation-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-index-response/index-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/index-attachment-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-index-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-index-response/IndexAttachments :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-object-information-response/schema-facets (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-object-information-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.get-object-information-response/SchemaFacets :portkey.aws.clouddirectory/ObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parents-response/parents (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-to-link-name-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-parents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-object-parents-response/Parents :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/facet-attribute :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-directory-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-directory-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.delete-directory-request/DirectoryArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/datetime-attribute-value clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-tags-for-resource-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-tags-for-resource-response/Tags :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-facet-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.get-facet-request/SchemaArn :portkey.aws.clouddirectory.get-facet-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-policies-response/attached-policy-ids (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-object-policies-response/AttachedPolicyIds :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-attribute-range/range (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value-range))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-attribute-range (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/AttributeKey :portkey.aws.clouddirectory.object-attribute-range/Range] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-policy-attachments-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-policy-attachments-request/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-policy-attachments-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-policy-attachments-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-policy-attachments-request/DirectoryArn :portkey.aws.clouddirectory.list-policy-attachments-request/PolicyReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-policy-attachments-request/MaxResults :portkey.aws.clouddirectory/ConsistencyLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-object-policies (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-policies))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-object-parent-paths (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-parent-paths))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-incoming-typed-links (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-incoming-typed-links))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/get-object-information (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-get-object-information))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-policy-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-policy-attachments))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-outgoing-typed-links (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-outgoing-typed-links))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-object-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-attributes))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-index))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-object-children (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-object-children))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/list-attached-indices (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-list-attached-indices))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation/lookup-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-lookup-policy))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-operation (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-read-operation/ListObjectPolicies :portkey.aws.clouddirectory.batch-read-operation/ListObjectParentPaths :portkey.aws.clouddirectory.batch-read-operation/ListIncomingTypedLinks :portkey.aws.clouddirectory.batch-read-operation/GetObjectInformation :portkey.aws.clouddirectory.batch-read-operation/ListPolicyAttachments :portkey.aws.clouddirectory.batch-read-operation/ListOutgoingTypedLinks :portkey.aws.clouddirectory.batch-read-operation/ListObjectAttributes :portkey.aws.clouddirectory.batch-read-operation/ListIndex :portkey.aws.clouddirectory.batch-read-operation/ListObjectChildren :portkey.aws.clouddirectory.batch-read-operation/ListAttachedIndices :portkey.aws.clouddirectory.batch-read-operation/LookupPolicy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/number-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-attribute-action/object-attribute-action-type (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-action-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-attribute-action/object-attribute-update-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-attribute-action (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.object-attribute-action/ObjectAttributeActionType :portkey.aws.clouddirectory.object-attribute-action/ObjectAttributeUpdateValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory-not-enabled-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-not-enabled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.directory-not-enabled-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-children-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-children-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-children-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-object-children-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-object-children-request/MaxResults :portkey.aws.clouddirectory/ConsistencyLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-typed-link-facet-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-names-response/facet-names (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-typed-link-facet-names-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-typed-link-facet-names-response/FacetNames :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-attribute-range-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/typed-link-attribute-range :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 64)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/required-attribute-behavior (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"REQUIRED_ALWAYS" "REQUIRED_ALWAYS", :required-always "REQUIRED_ALWAYS", "NOT_REQUIRED" "NOT_REQUIRED", :not-required "NOT_REQUIRED"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value-range/start-mode (clojure.spec.alpha/and :portkey.aws.clouddirectory/range-mode))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value-range/start-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value-range/end-mode (clojure.spec.alpha/and :portkey.aws.clouddirectory/range-mode))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-attribute-value-range/end-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-attribute-value-range (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.typed-attribute-value-range/StartMode :portkey.aws.clouddirectory.typed-attribute-value-range/EndMode] :opt-un [:portkey.aws.clouddirectory.typed-attribute-value-range/StartValue :portkey.aws.clouddirectory.typed-attribute-value-range/EndValue] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.unsupported-index-type-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/unsupported-index-type-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.unsupported-index-type-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-add-facet-to-object/object-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-add-facet-to-object (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/SchemaFacet :portkey.aws.clouddirectory.batch-add-facet-to-object/ObjectAttributeList :portkey.aws.clouddirectory/ObjectReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-facet-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/Facet] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-attributes-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-attributes-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-attributes-request/facet-filter (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-attributes-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-object-attributes-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-object-attributes-request/MaxResults :portkey.aws.clouddirectory/ConsistencyLevel :portkey.aws.clouddirectory.list-object-attributes-request/FacetFilter] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-tags-for-resource-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/tags-number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-tags-for-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-tags-for-resource-request/ResourceArn] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-tags-for-resource-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.publish-schema-response/published-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/publish-schema-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.publish-schema-response/PublishedSchemaArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-policy-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-policy-request/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.attach-policy-request/PolicyReference :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory.attach-policy-request/DirectoryArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-update-object-attributes/attribute-updates (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-attribute-update-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-update-object-attributes (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/ObjectReference :portkey.aws.clouddirectory.batch-update-object-attributes/AttributeUpdates] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-directory-response/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-directory-response (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.delete-directory-response/DirectoryArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-schema-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-schema-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-schema-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.update-schema-request/SchemaArn :portkey.aws.clouddirectory.update-schema-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-schema-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-schema-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.create-schema-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-operation-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/batch-write-operation :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-policies/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-policies (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.batch-list-object-policies/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-remove-facet-from-object (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/SchemaFacet :portkey.aws.clouddirectory/ObjectReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-exception/type (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-exception-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-read-exception/Type :portkey.aws.clouddirectory.batch-read-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-outgoing-typed-links-response/typed-link-specifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-specifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-outgoing-typed-links-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-outgoing-typed-links-response/TypedLinkSpecifiers :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-typed-link/source-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-typed-link/target-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-typed-link/typed-link-facet (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-typed-link/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-typed-link (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-attach-typed-link/SourceObjectReference :portkey.aws.clouddirectory.batch-attach-typed-link/TargetObjectReference :portkey.aws.clouddirectory.batch-attach-typed-link/TypedLinkFacet :portkey.aws.clouddirectory.batch-attach-typed-link/Attributes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-index-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-index-request/ordered-indexed-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-index-request/is-unique (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-index-request/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-index-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.create-index-request/DirectoryArn :portkey.aws.clouddirectory.create-index-request/OrderedIndexedAttributeList :portkey.aws.clouddirectory.create-index-request/IsUnique] :opt-un [:portkey.aws.clouddirectory.create-index-request/ParentReference :portkey.aws.clouddirectory/LinkName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-request/operations (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-operation-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-read-request/DirectoryArn :portkey.aws.clouddirectory.batch-read-request/Operations] :opt-un [:portkey.aws.clouddirectory/ConsistencyLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.enable-directory-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/enable-directory-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.enable-directory-request/DirectoryArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-parent-paths-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/PathToObjectIdentifiersList :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-object-attributes-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-object-attributes-request/attribute-updates (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-attribute-update-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-object-attributes-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.update-object-attributes-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference :portkey.aws.clouddirectory.update-object-attributes-request/AttributeUpdates] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-get-object-information (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/ObjectReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-delete-object-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-to-index-response/attached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-to-index-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.attach-to-index-response/AttachedObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-attribute-definition-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/typed-link-attribute-definition :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-schema-doc-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-schema-doc-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-schema-doc-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-action-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"CREATE_OR_UPDATE" "CREATE_OR_UPDATE", :create-or-update "CREATE_OR_UPDATE", "DELETE" "DELETE", :delete "DELETE"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {:binary "BINARY", :number "NUMBER", "NUMBER" "NUMBER", :string "STRING", "STRING" "STRING", :datetime "DATETIME", "DATETIME" "DATETIME", :boolean "BOOLEAN", "BOOLEAN" "BOOLEAN", "BINARY" "BINARY"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-children/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-children (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.batch-list-object-children/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-typed-link-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/TypedLinkSpecifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/boolean-attribute-value clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.clouddirectory.link-name-already-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/link-name-already-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.link-name-already-in-use-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/policy-attachment-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/policy-attachment :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.limit-exceeded-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-in-use-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-in-use-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet-in-use-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-parent-paths-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/PathToObjectIdentifiersList :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-policy/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-policy (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-attach-policy/PolicyReference :portkey.aws.clouddirectory/ObjectReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-attributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-object-attributes-response/Attributes :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-json-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/ObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-exception-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {:object-already-detached-exception "ObjectAlreadyDetachedException", :not-policy-exception "NotPolicyException", "ObjectNotDetachedException" "ObjectNotDetachedException", "ValidationException" "ValidationException", :internal-service-exception "InternalServiceException", :not-index-exception "NotIndexException", "DirectoryNotEnabledException" "DirectoryNotEnabledException", "UnsupportedIndexTypeException" "UnsupportedIndexTypeException", :resource-not-found-exception "ResourceNotFoundException", :limit-exceeded-exception "LimitExceededException", "LinkNameAlreadyInUseException" "LinkNameAlreadyInUseException", "LimitExceededException" "LimitExceededException", :object-not-detached-exception "ObjectNotDetachedException", "InvalidArnException" "InvalidArnException", "NotPolicyException" "NotPolicyException", "ResourceNotFoundException" "ResourceNotFoundException", "FacetValidationException" "FacetValidationException", "AccessDeniedException" "AccessDeniedException", :validation-exception "ValidationException", "NotIndexException" "NotIndexException", :indexed-attribute-missing-exception "IndexedAttributeMissingException", :facet-validation-exception "FacetValidationException", "IndexedAttributeMissingException" "IndexedAttributeMissingException", :directory-not-enabled-exception "DirectoryNotEnabledException", :access-denied-exception "AccessDeniedException", "InvalidAttachmentException" "InvalidAttachmentException", "ObjectAlreadyDetachedException" "ObjectAlreadyDetachedException", :still-contains-links-exception "StillContainsLinksException", :link-name-already-in-use-exception "LinkNameAlreadyInUseException", :unsupported-index-type-exception "UnsupportedIndexTypeException", "StillContainsLinksException" "StillContainsLinksException", "InternalServiceException" "InternalServiceException", :invalid-arn-exception "InvalidArnException", :invalid-attachment-exception "InvalidAttachmentException"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-object-attributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/ObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/lookup-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/PolicyToPathList :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/attribute-key :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-tagging-request-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-tagging-request-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-tagging-request-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/selector-object-reference (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-facet-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-from-index-response/detached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-from-index-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.detach-from-index-response/DetachedObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/typed-link-name :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-map (clojure.spec.alpha/map-of :portkey.aws.clouddirectory/rule-key :portkey.aws.clouddirectory/rule))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-operation-response-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/batch-read-operation-response :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/create-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-create-index-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/create-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-create-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/detach-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-policy-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/detach-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/detach-from-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-from-index-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/attach-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/attach-to-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-to-index-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/attach-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-typed-link-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/detach-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-typed-link-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/add-facet-to-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-add-facet-to-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/update-object-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-update-object-attributes-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/delete-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-delete-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/attach-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-policy-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation-response/remove-facet-from-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-remove-facet-from-object-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-operation-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-write-operation-response/CreateIndex :portkey.aws.clouddirectory.batch-write-operation-response/CreateObject :portkey.aws.clouddirectory.batch-write-operation-response/DetachPolicy :portkey.aws.clouddirectory.batch-write-operation-response/DetachObject :portkey.aws.clouddirectory.batch-write-operation-response/DetachFromIndex :portkey.aws.clouddirectory.batch-write-operation-response/AttachObject :portkey.aws.clouddirectory.batch-write-operation-response/AttachToIndex :portkey.aws.clouddirectory.batch-write-operation-response/AttachTypedLink :portkey.aws.clouddirectory.batch-write-operation-response/DetachTypedLink :portkey.aws.clouddirectory.batch-write-operation-response/AddFacetToObject :portkey.aws.clouddirectory.batch-write-operation-response/UpdateObjectAttributes :portkey.aws.clouddirectory.batch-write-operation-response/DeleteObject :portkey.aws.clouddirectory.batch-write-operation-response/AttachPolicy :portkey.aws.clouddirectory.batch-write-operation-response/RemoveFacetFromObject] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/arns (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/arn :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-typed-link-facet-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-to-index-response/attached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-to-index-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-attach-to-index-response/AttachedObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.add-facet-to-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.add-facet-to-object-request/object-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/add-facet-to-object-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.add-facet-to-object-request/DirectoryArn :portkey.aws.clouddirectory/SchemaFacet :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory.add-facet-to-object-request/ObjectAttributeList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-response/responses (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-write-operation-response-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-write-response/Responses] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory-not-disabled-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-not-disabled-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.directory-not-disabled-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.remove-facet-from-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/remove-facet-from-object-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.remove-facet-from-object-request/DirectoryArn :portkey.aws.clouddirectory/SchemaFacet :portkey.aws.clouddirectory/ObjectReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-parent-paths/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-parent-paths (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.batch-list-object-parent-paths/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-object-request/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-object-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.detach-object-request/DirectoryArn :portkey.aws.clouddirectory.detach-object-request/ParentReference :portkey.aws.clouddirectory/LinkName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-development-schema-arns-response/schema-arns (clojure.spec.alpha/and :portkey.aws.clouddirectory/arns))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-development-schema-arns-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-development-schema-arns-response/SchemaArns :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-resource-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-outgoing-typed-links/filter-attribute-ranges (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-outgoing-typed-links/filter-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-outgoing-typed-links/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-outgoing-typed-links (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory.batch-list-outgoing-typed-links/FilterAttributeRanges :portkey.aws.clouddirectory.batch-list-outgoing-typed-links/FilterTypedLink :portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.batch-list-outgoing-typed-links/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-incoming-typed-links/filter-attribute-ranges (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-incoming-typed-links/filter-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-incoming-typed-links/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-incoming-typed-links (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory.batch-list-incoming-typed-links/FilterAttributeRanges :portkey.aws.clouddirectory.batch-list-incoming-typed-links/FilterTypedLink :portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.batch-list-incoming-typed-links/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-key-and-value-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/attribute-key-and-value :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-range/range (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value-range))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-attribute-range (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.typed-link-attribute-range/Range] :opt-un [:portkey.aws.clouddirectory/AttributeName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-next-token-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-next-token-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-schema-response/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-schema-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.update-schema-response/SchemaArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-outgoing-typed-links-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-outgoing-typed-links-request/filter-attribute-ranges (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-outgoing-typed-links-request/filter-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-outgoing-typed-links-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-outgoing-typed-links-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-outgoing-typed-links-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory.list-outgoing-typed-links-request/FilterAttributeRanges :portkey.aws.clouddirectory.list-outgoing-typed-links-request/FilterTypedLink :portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-outgoing-typed-links-request/MaxResults :portkey.aws.clouddirectory/ConsistencyLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory-deleted-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-deleted-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.directory-deleted-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory/state (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-state))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory/creation-date-time (clojure.spec.alpha/and :portkey.aws.clouddirectory/date))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.directory/Name :portkey.aws.clouddirectory/DirectoryArn :portkey.aws.clouddirectory.directory/State :portkey.aws.clouddirectory.directory/CreationDateTime] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-specifier/typed-link-facet (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-schema-and-facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-specifier/source-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-specifier/target-object-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-specifier/identity-attribute-values (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-specifier (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.typed-link-specifier/TypedLinkFacet :portkey.aws.clouddirectory.typed-link-specifier/SourceObjectReference :portkey.aws.clouddirectory.typed-link-specifier/TargetObjectReference :portkey.aws.clouddirectory.typed-link-specifier/IdentityAttributeValues] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-names-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-names-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-facet-names-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-facet-names-request/SchemaArn] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-facet-names-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-directories-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-directories-request/state (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-state))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-directories-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-directories-request/MaxResults :portkey.aws.clouddirectory.list-directories-request/state] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.policy-to-path/path (clojure.spec.alpha/and :portkey.aws.clouddirectory/path-string))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.policy-to-path/policies (clojure.spec.alpha/and :portkey.aws.clouddirectory/policy-attachment-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/policy-to-path (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.policy-to-path/Path :portkey.aws.clouddirectory.policy-to-path/Policies] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-index-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/ObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-attribute-range-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/object-attribute-range :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-object-response/detached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.detach-object-response/DetachedObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-facet/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-facet/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-definition-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-facet/identity-attribute-order (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-facet (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.typed-link-facet/Name :portkey.aws.clouddirectory.typed-link-facet/Attributes :portkey.aws.clouddirectory.typed-link-facet/IdentityAttributeOrder] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-arn-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-arn-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-arn-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.not-policy-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/not-policy-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.not-policy-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.tag-resource-request/ResourceArn :portkey.aws.clouddirectory.tag-resource-request/Tags] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-facet-request/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-facet-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.create-facet-request/SchemaArn :portkey.aws.clouddirectory.create-facet-request/Name :portkey.aws.clouddirectory/ObjectType] :opt-un [:portkey.aws.clouddirectory.create-facet-request/Attributes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-specifier-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/typed-link-specifier :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-object-response/attached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.attach-object-response/AttachedObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-object-response/attached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-attach-object-response/attachedObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/range-mode (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {:exclusive "EXCLUSIVE", "LAST" "LAST", :inclusive "INCLUSIVE", :last-before-missing-values "LAST_BEFORE_MISSING_VALUES", "EXCLUSIVE" "EXCLUSIVE", :first "FIRST", "INCLUSIVE" "INCLUSIVE", :last "LAST", "FIRST" "FIRST", "LAST_BEFORE_MISSING_VALUES" "LAST_BEFORE_MISSING_VALUES"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/tag :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.cannot-list-parent-of-root-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/cannot-list-parent-of-root-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.cannot-list-parent-of-root-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-names-response/facet-names (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-facet-names-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-facet-names-response/FacetNames :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-children-response/children (clojure.spec.alpha/and :portkey.aws.clouddirectory/link-name-to-object-identifier-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-children-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-object-children-response/Children :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/tag-key :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-policies-response/attached-policy-ids (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-policies-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-object-policies-response/AttachedPolicyIds :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/binary-attribute-value (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-attached-indices-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-attached-indices-request/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-attached-indices-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-attached-indices-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-attached-indices-request/DirectoryArn :portkey.aws.clouddirectory.list-attached-indices-request/TargetReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-attached-indices-request/MaxResults :portkey.aws.clouddirectory/ConsistencyLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-policy-attachments-response/object-identifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-policy-attachments-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-policy-attachments-response/ObjectIdentifiers :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-operation-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/batch-read-operation :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/path-to-object-identifiers-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/path-to-object-identifiers :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-add-facet-to-object-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-typed-link-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-typed-link-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-typed-link-facet-request/attribute-updates (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-facet-attribute-update-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-typed-link-facet-request/identity-attribute-order (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-typed-link-facet-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.update-typed-link-facet-request/SchemaArn :portkey.aws.clouddirectory.update-typed-link-facet-request/Name :portkey.aws.clouddirectory.update-typed-link-facet-request/AttributeUpdates :portkey.aws.clouddirectory.update-typed-link-facet-request/IdentityAttributeOrder] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-schema-response/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-schema-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.create-schema-response/SchemaArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-operation-index (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.apply-schema-response/applied-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.apply-schema-response/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/apply-schema-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.apply-schema-response/AppliedSchemaArn :portkey.aws.clouddirectory.apply-schema-response/DirectoryArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.resource-not-found-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-typed-link (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/TypedLinkSpecifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-attribute-update-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/object-attribute-update :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.lookup-policy-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.lookup-policy-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/lookup-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.lookup-policy-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.lookup-policy-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-schema-as-json-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-schema-as-json-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.get-schema-as-json-request/SchemaArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-policy-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-policies-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-policies-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-object-policies-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-object-policies-request/MaxResults :portkey.aws.clouddirectory/ConsistencyLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-name-and-value-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/attribute-name-and-value :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-index-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-index-request/ranges-on-indexed-values (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-attribute-range-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-index-request/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-index-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-index-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-index-request/DirectoryArn :portkey.aws.clouddirectory.list-index-request/IndexReference] :opt-un [:portkey.aws.clouddirectory.list-index-request/RangesOnIndexedValues :portkey.aws.clouddirectory.list-index-request/MaxResults :portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory/ConsistencyLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.schema-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.schema-already-exists-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-update-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/facet-attribute-update :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-validation-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-validation-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet-validation-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.schema-already-published-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-already-published-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.schema-already-published-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attribute-name-and-value/value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-name-and-value (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/AttributeName :portkey.aws.clouddirectory.attribute-name-and-value/Value] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-policy-attachments/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-policy-attachments/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-policy-attachments (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-list-policy-attachments/PolicyReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.batch-list-policy-attachments/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet/Name :portkey.aws.clouddirectory/ObjectType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-typed-link-facet-information-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-typed-link-facet-information-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-typed-link-facet-information-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.get-typed-link-facet-information-request/SchemaArn :portkey.aws.clouddirectory.get-typed-link-facet-information-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-incoming-typed-links-response/link-specifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-specifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-incoming-typed-links-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-incoming-typed-links-response/LinkSpecifiers :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-directory-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/DirectoryArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-reference/selector (clojure.spec.alpha/and :portkey.aws.clouddirectory/selector-object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-reference (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.object-reference/Selector] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.update-facet-request/attribute-updates (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-update-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-facet-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.update-facet-request/SchemaArn :portkey.aws.clouddirectory.update-facet-request/Name] :opt-un [:portkey.aws.clouddirectory.update-facet-request/AttributeUpdates :portkey.aws.clouddirectory/ObjectType] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attribute-key/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attribute-key/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-key (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.attribute-key/SchemaArn :portkey.aws.clouddirectory/FacetName :portkey.aws.clouddirectory.attribute-key/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/bool clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/attribute-name :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-to-index/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-to-index/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-to-index (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-attach-to-index/IndexReference :portkey.aws.clouddirectory.batch-attach-to-index/TargetReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-typed-link-facet-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-reference-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/create-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-create-index))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/create-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-create-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/detach-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-policy))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/detach-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/detach-from-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-from-index))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/attach-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/attach-to-index (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-to-index))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/attach-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-typed-link))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/detach-typed-link (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-detach-typed-link))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/add-facet-to-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-add-facet-to-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/update-object-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-update-object-attributes))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/delete-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-delete-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/attach-policy (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-attach-policy))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-operation/remove-facet-from-object (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-remove-facet-from-object))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-operation (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-write-operation/CreateIndex :portkey.aws.clouddirectory.batch-write-operation/CreateObject :portkey.aws.clouddirectory.batch-write-operation/DetachPolicy :portkey.aws.clouddirectory.batch-write-operation/DetachObject :portkey.aws.clouddirectory.batch-write-operation/DetachFromIndex :portkey.aws.clouddirectory.batch-write-operation/AttachObject :portkey.aws.clouddirectory.batch-write-operation/AttachToIndex :portkey.aws.clouddirectory.batch-write-operation/AttachTypedLink :portkey.aws.clouddirectory.batch-write-operation/DetachTypedLink :portkey.aws.clouddirectory.batch-write-operation/AddFacetToObject :portkey.aws.clouddirectory.batch-write-operation/UpdateObjectAttributes :portkey.aws.clouddirectory.batch-write-operation/DeleteObject :portkey.aws.clouddirectory.batch-write-operation/AttachPolicy :portkey.aws.clouddirectory.batch-write-operation/RemoveFacetFromObject] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.put-schema-from-json-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.put-schema-from-json-request/document (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-json-document))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/put-schema-from-json-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.put-schema-from-json-request/SchemaArn :portkey.aws.clouddirectory.put-schema-from-json-request/Document] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-typed-link-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/access-denied-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.access-denied-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-attached-indices-response/index-attachments (clojure.spec.alpha/and :portkey.aws.clouddirectory/index-attachment-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-attached-indices-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-attached-indices-response/IndexAttachments :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-development-schema-arns-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-development-schema-arns-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-development-schema-arns-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/remove-facet-from-object-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-parameter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-identifier-to-link-name-map (clojure.spec.alpha/map-of :portkey.aws.clouddirectory/object-identifier :portkey.aws.clouddirectory/link-name))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.publish-schema-request/development-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.publish-schema-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/publish-schema-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.publish-schema-request/DevelopmentSchemaArn :portkey.aws.clouddirectory/Version] :opt-un [:portkey.aws.clouddirectory.publish-schema-request/Name] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-create-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/ObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-from-index/index-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-from-index/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-from-index (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-detach-from-index/IndexReference :portkey.aws.clouddirectory.batch-detach-from-index/TargetReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-from-index-response/detached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-from-index-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-detach-from-index-response/DetachedObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-facet-attribute-update/attribute (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-definition))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-facet-attribute-update/action (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-action-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-facet-attribute-update (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.typed-link-facet-attribute-update/Attribute :portkey.aws.clouddirectory.typed-link-facet-attribute-update/Action] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-schema-response/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-schema-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.delete-schema-response/SchemaArn] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-typed-link-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-typed-link-facet-request/facet (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-facet))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-typed-link-facet-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.create-typed-link-facet-request/SchemaArn :portkey.aws.clouddirectory.create-typed-link-facet-request/Facet] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-remove-facet-from-object-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-policy-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-incoming-typed-links-response/link-specifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-specifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-incoming-typed-links-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-incoming-typed-links-response/LinkSpecifiers :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-update/attribute (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-update/action (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-action-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-update (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet-attribute-update/Attribute :portkey.aws.clouddirectory.facet-attribute-update/Action] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-facet-attributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-facet-attributes-response/Attributes :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.index-attachment/indexed-attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/index-attachment (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.index-attachment/IndexedAttributes :portkey.aws.clouddirectory/ObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.not-index-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/not-index-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.not-index-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/link-name-to-object-identifier-map (clojure.spec.alpha/map-of :portkey.aws.clouddirectory/link-name :portkey.aws.clouddirectory/object-identifier))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-schema-and-facet-name/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-schema-and-facet-name (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.typed-link-schema-and-facet-name/SchemaArn :portkey.aws.clouddirectory/TypedLinkName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-policy-attachments-response/object-identifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-policy-attachments-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-policy-attachments-response/ObjectIdentifiers :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/path-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-write-request/operations (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-write-operation-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-write-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-write-request/DirectoryArn :portkey.aws.clouddirectory.batch-write-request/Operations] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.rule/type (clojure.spec.alpha/and :portkey.aws.clouddirectory/rule-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.rule/parameters (clojure.spec.alpha/and :portkey.aws.clouddirectory/rule-parameter-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.rule/Type :portkey.aws.clouddirectory.rule/Parameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-object/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-attach-object/child-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-attach-object (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-attach-object/ParentReference :portkey.aws.clouddirectory.batch-attach-object/ChildReference :portkey.aws.clouddirectory/LinkName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/policy-to-path-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/policy-to-path :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-delete-object (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/ObjectReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-parameter-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.path-to-object-identifiers/path (clojure.spec.alpha/and :portkey.aws.clouddirectory/path-string))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.path-to-object-identifiers/object-identifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/path-to-object-identifiers (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.path-to-object-identifiers/Path :portkey.aws.clouddirectory.path-to-object-identifiers/ObjectIdentifiers] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-create-index-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/ObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-lookup-policy/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-lookup-policy (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.batch-lookup-policy/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-facet-attribute-update-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/typed-link-facet-attribute-update :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-schema-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-schema-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.delete-schema-request/SchemaArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.apply-schema-request/published-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.apply-schema-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/apply-schema-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.apply-schema-request/PublishedSchemaArn :portkey.aws.clouddirectory.apply-schema-request/DirectoryArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-object-information-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-object-information-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.get-object-information-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/ConsistencyLevel] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.not-node-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/not-node-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.not-node-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-typed-link-facet-information-response/identity-attribute-order (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-typed-link-facet-information-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.get-typed-link-facet-information-response/IdentityAttributeOrder] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-typed-link-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-typed-link-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-typed-link-facet-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.delete-typed-link-facet-request/SchemaArn :portkey.aws.clouddirectory.delete-typed-link-facet-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-index/ordered-indexed-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-index/is-unique (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-index/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-create-index (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-create-index/OrderedIndexedAttributeList :portkey.aws.clouddirectory.batch-create-index/IsUnique] :opt-un [:portkey.aws.clouddirectory.batch-create-index/ParentReference :portkey.aws.clouddirectory/LinkName :portkey.aws.clouddirectory/BatchReferenceName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-identifier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/directory :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-exception-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {:cannot-list-parent-of-root-exception "CannotListParentOfRootException", :not-policy-exception "NotPolicyException", "ValidationException" "ValidationException", :internal-service-exception "InternalServiceException", :not-index-exception "NotIndexException", "DirectoryNotEnabledException" "DirectoryNotEnabledException", :resource-not-found-exception "ResourceNotFoundException", :limit-exceeded-exception "LimitExceededException", "LimitExceededException" "LimitExceededException", "InvalidNextTokenException" "InvalidNextTokenException", "InvalidArnException" "InvalidArnException", "NotPolicyException" "NotPolicyException", "CannotListParentOfRootException" "CannotListParentOfRootException", "ResourceNotFoundException" "ResourceNotFoundException", "FacetValidationException" "FacetValidationException", "AccessDeniedException" "AccessDeniedException", :validation-exception "ValidationException", "NotIndexException" "NotIndexException", :facet-validation-exception "FacetValidationException", "NotNodeException" "NotNodeException", :invalid-next-token-exception "InvalidNextTokenException", :directory-not-enabled-exception "DirectoryNotEnabledException", :access-denied-exception "AccessDeniedException", :not-node-exception "NotNodeException", "InternalServiceException" "InternalServiceException", :invalid-arn-exception "InvalidArnException"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/link-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 64)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"[^\/\[\]\(\):\{\}#@!?\s\\;]+" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/number-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__96584__96585__auto__] (clojure.core/<= 1 p1__96584__96585__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-directories-response/directories (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-directories-response (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-directories-response/Directories] :opt-un [:portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.indexed-attribute-missing-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/indexed-attribute-missing-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.indexed-attribute-missing-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/tags-number-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__96584__96585__auto__] (clojure.core/<= 50 p1__96584__96585__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-policy/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-policy (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-detach-policy/PolicyReference :portkey.aws.clouddirectory/ObjectReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-state (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"ENABLED" "ENABLED", :enabled "ENABLED", "DISABLED" "DISABLED", :disabled "DISABLED", "DELETED" "DELETED", :deleted "DELETED"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 64)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"NODE" "NODE", :node "NODE", "LEAF_NODE" "LEAF_NODE", :leaf-node "LEAF_NODE", "POLICY" "POLICY", :policy "POLICY", "INDEX" "INDEX", :index "INDEX"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-identifier-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/object-identifier :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.retryable-conflict-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/retryable-conflict-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.retryable-conflict-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-names-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-names-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-typed-link-facet-names-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-typed-link-facet-names-request/SchemaArn] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-typed-link-facet-names-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/consistency-level (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"SERIALIZABLE" "SERIALIZABLE", :serializable "SERIALIZABLE", "EVENTUAL" "EVENTUAL", :eventual "EVENTUAL"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 64)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-policy-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-policy-request/policy-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-policy-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.detach-policy-request/DirectoryArn :portkey.aws.clouddirectory.detach-policy-request/PolicyReference :portkey.aws.clouddirectory/ObjectReference] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.tag/key (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-key))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.tag/value (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/tag (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.tag/Key :portkey.aws.clouddirectory.tag/Value] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-object-request/schema-facets (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-object-request/object-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-object-request/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-object-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.create-object-request/DirectoryArn :portkey.aws.clouddirectory.create-object-request/SchemaFacets] :opt-un [:portkey.aws.clouddirectory.create-object-request/ObjectAttributeList :portkey.aws.clouddirectory.create-object-request/ParentReference :portkey.aws.clouddirectory/LinkName] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 10)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-object/schema-facet (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-object/object-attribute-list (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-create-object/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-create-object (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-create-object/SchemaFacet :portkey.aws.clouddirectory.batch-create-object/ObjectAttributeList :portkey.aws.clouddirectory.batch-create-object/ParentReference :portkey.aws.clouddirectory/LinkName :portkey.aws.clouddirectory/BatchReferenceName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-typed-link-facet-attributes-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/SchemaArn :portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/Name] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-typed-link-facet-attributes-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.detach-typed-link-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-typed-link-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.detach-typed-link-request/DirectoryArn :portkey.aws.clouddirectory/TypedLinkSpecifier] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.directory-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/directory-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.directory-already-exists-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.disable-directory-response/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/disable-directory-response (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.disable-directory-response/DirectoryArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.invalid-attachment-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/invalid-attachment-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.invalid-attachment-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.object-already-detached-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/object-already-detached-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.object-already-detached-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.disable-directory-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/disable-directory-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.disable-directory-request/DirectoryArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-response/responses (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-operation-response-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-read-response/Responses] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-attributes-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-attributes-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-facet-attributes-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-facet-attributes-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-facet-attributes-request/SchemaArn :portkey.aws.clouddirectory.list-facet-attributes-request/Name] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-facet-attributes-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-object/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-object (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-detach-object/ParentReference :portkey.aws.clouddirectory/LinkName :portkey.aws.clouddirectory/BatchReferenceName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation-response/successful-response (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-successful-response))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-read-operation-response/exception-response (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-exception))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-read-operation-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-read-operation-response/SuccessfulResponse :portkey.aws.clouddirectory.batch-read-operation-response/ExceptionResponse] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__96545__auto__] (clojure.core/<= 1 (clojure.core/count s__96545__auto__))) (clojure.core/fn [s__96546__auto__] (clojure.core/< (clojure.core/count s__96546__auto__) 32)) (clojure.core/fn [s__96547__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9._-]*$" s__96547__auto__))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/type (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-attribute-type))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/default-value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/is-immutable (clojure.spec.alpha/and :portkey.aws.clouddirectory/bool))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/rules (clojure.spec.alpha/and :portkey.aws.clouddirectory/rule-map))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.typed-link-attribute-definition/required-behavior (clojure.spec.alpha/and :portkey.aws.clouddirectory/required-attribute-behavior))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/typed-link-attribute-definition (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.typed-link-attribute-definition/Name :portkey.aws.clouddirectory.typed-link-attribute-definition/Type :portkey.aws.clouddirectory.typed-link-attribute-definition/RequiredBehavior] :opt-un [:portkey.aws.clouddirectory.typed-link-attribute-definition/DefaultValue :portkey.aws.clouddirectory.typed-link-attribute-definition/IsImmutable :portkey.aws.clouddirectory.typed-link-attribute-definition/Rules] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/string-attribute-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-parameter-map (clojure.spec.alpha/map-of :portkey.aws.clouddirectory/rule-parameter-key :portkey.aws.clouddirectory/rule-parameter-value))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-outgoing-typed-links-response/typed-link-specifiers (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-specifier-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-outgoing-typed-links-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-outgoing-typed-links-response/TypedLinkSpecifiers :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-detach-object-response/detached-object-identifier (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-identifier))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-object-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-detach-object-response/detachedObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/schema-facet-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/schema-facet :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-detach-policy-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-object-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-object-request/parent-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attach-object-request/child-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attach-object-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.attach-object-request/DirectoryArn :portkey.aws.clouddirectory.attach-object-request/ParentReference :portkey.aws.clouddirectory.attach-object-request/ChildReference :portkey.aws.clouddirectory/LinkName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.attribute-key-and-value/key (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.attribute-key-and-value/value (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-attribute-value))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/attribute-key-and-value (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.attribute-key-and-value/Key :portkey.aws.clouddirectory.attribute-key-and-value/Value] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-applied-schema-arns-response/schema-arns (clojure.spec.alpha/and :portkey.aws.clouddirectory/arns))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-applied-schema-arns-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-applied-schema-arns-response/SchemaArns :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-attached-indices/target-reference (clojure.spec.alpha/and :portkey.aws.clouddirectory/object-reference))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-attached-indices/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-attached-indices (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.batch-list-attached-indices/TargetReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.batch-list-attached-indices/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-list-object-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-key-and-value-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-list-object-attributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-list-object-attributes-response/Attributes :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.still-contains-links-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/still-contains-links-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.still-contains-links-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/policy-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/add-facet-to-object-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-facet-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-object-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-already-exists-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.facet-already-exists-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-schema-as-json-response/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.get-schema-as-json-response/document (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-json-document))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-schema-as-json-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.get-schema-as-json-response/Name :portkey.aws.clouddirectory.get-schema-as-json-response/Document] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.internal-service-exception/message (clojure.spec.alpha/and :portkey.aws.clouddirectory/exception-message))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/internal-service-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.internal-service-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.batch-get-object-information-response/schema-facets (clojure.spec.alpha/and :portkey.aws.clouddirectory/schema-facet-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-get-object-information-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.batch-get-object-information-response/SchemaFacets :portkey.aws.clouddirectory/ObjectIdentifier] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-typed-link-facet-attributes-response/attributes (clojure.spec.alpha/and :portkey.aws.clouddirectory/typed-link-attribute-definition-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-typed-link-facet-attributes-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-typed-link-facet-attributes-response/Attributes :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/untag-resource-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-facet-request/schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.delete-facet-request/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/delete-facet-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.delete-facet-request/SchemaArn :portkey.aws.clouddirectory.delete-facet-request/Name] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-published-schema-arns-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-published-schema-arns-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-published-schema-arns-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-applied-schema-arns-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-applied-schema-arns-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-applied-schema-arns-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-applied-schema-arns-request/DirectoryArn] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-applied-schema-arns-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parent-paths-request/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-object-parent-paths-request/max-results (clojure.spec.alpha/and :portkey.aws.clouddirectory/number-results))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-object-parent-paths-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.list-object-parent-paths-request/DirectoryArn :portkey.aws.clouddirectory/ObjectReference] :opt-un [:portkey.aws.clouddirectory/NextToken :portkey.aws.clouddirectory.list-object-parent-paths-request/MaxResults] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/update-facet-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-reference/target-facet-name (clojure.spec.alpha/and :portkey.aws.clouddirectory/facet-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.facet-attribute-reference/target-attribute-name (clojure.spec.alpha/and :portkey.aws.clouddirectory/attribute-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-attribute-reference (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.facet-attribute-reference/TargetFacetName :portkey.aws.clouddirectory.facet-attribute-reference/TargetAttributeName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/untag-resource-request (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.untag-resource-request/ResourceArn :portkey.aws.clouddirectory.untag-resource-request/TagKeys] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/index-attachment-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/index-attachment :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/batch-lookup-policy-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory/PolicyToPathList :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/detach-policy-response (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.list-published-schema-arns-response/schema-arns (clojure.spec.alpha/and :portkey.aws.clouddirectory/arns))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/list-published-schema-arns-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.clouddirectory.list-published-schema-arns-response/SchemaArns :portkey.aws.clouddirectory/NextToken] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.enable-directory-response/directory-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/enable-directory-response (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory.enable-directory-response/DirectoryArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/facet-name-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.clouddirectory/facet-name :max-count nil) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__129128__129129__auto__] (if (clojure.core/sequential? p1__129128__129129__auto__) p1__129128__129129__auto__ [p1__129128__129129__auto__])))))

(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-directory-response/name (clojure.spec.alpha/and :portkey.aws.clouddirectory/directory-name))
(clojure.spec.alpha/def :portkey.aws.clouddirectory.create-directory-response/applied-schema-arn (clojure.spec.alpha/and :portkey.aws.clouddirectory/arn))
(clojure.spec.alpha/def :portkey.aws.clouddirectory/create-directory-response (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/DirectoryArn :portkey.aws.clouddirectory.create-directory-response/Name :portkey.aws.clouddirectory/ObjectIdentifier :portkey.aws.clouddirectory.create-directory-response/AppliedSchemaArn] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/get-directory-response (portkey.aws/json-keys :req-un [:portkey.aws.clouddirectory/Directory] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.clouddirectory/rule-type (clojure.spec.alpha/conformer (clojure.core/let [m__96543__auto__ {"BINARY_LENGTH" "BINARY_LENGTH", :binary-length "BINARY_LENGTH", "NUMBER_COMPARISON" "NUMBER_COMPARISON", :number-comparison "NUMBER_COMPARISON", "STRING_FROM_SET" "STRING_FROM_SET", :string-from-set "STRING_FROM_SET", "STRING_LENGTH" "STRING_LENGTH", :string-length "STRING_LENGTH"}] (clojure.core/fn [s__96544__auto__] (m__96543__auto__ s__96544__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.core/defn tag-resource ([tag-resource-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/tags/add" tag-resource-request :portkey.aws.clouddirectory/tag-resource-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/tag-resource-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidTaggingRequestException" :portkey.aws.clouddirectory/invalid-tagging-request-exception})))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/tag-resource-response))

(clojure.core/defn list-object-policies ([list-object-policies-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/object/policy" list-object-policies-request :portkey.aws.clouddirectory/list-object-policies-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil], "ConsistencyLevel" ["x-amz-consistency-level" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-object-policies-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-object-policies :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-object-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-object-policies-response))

(clojure.core/defn create-index ([create-index-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/index" create-index-request :portkey.aws.clouddirectory/create-index-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/create-index-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "UnsupportedIndexTypeException" :portkey.aws.clouddirectory/unsupported-index-type-exception, "LinkNameAlreadyInUseException" :portkey.aws.clouddirectory/link-name-already-in-use-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef create-index :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-index-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-index-response))

(clojure.core/defn list-object-parent-paths ([list-object-parent-paths-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/object/parentpaths" list-object-parent-paths-request :portkey.aws.clouddirectory/list-object-parent-paths-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-object-parent-paths-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-object-parent-paths :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-object-parent-paths-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-object-parent-paths-response))

(clojure.core/defn put-schema-from-json ([put-schema-from-json-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/schema/json" put-schema-from-json-request :portkey.aws.clouddirectory/put-schema-from-json-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/put-schema-from-json-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "InvalidSchemaDocException" :portkey.aws.clouddirectory/invalid-schema-doc-exception, "InvalidRuleException" :portkey.aws.clouddirectory/invalid-rule-exception})))
(clojure.spec.alpha/fdef put-schema-from-json :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/put-schema-from-json-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/put-schema-from-json-response))

(clojure.core/defn create-object ([create-object-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/object" create-object-request :portkey.aws.clouddirectory/create-object-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/create-object-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "UnsupportedIndexTypeException" :portkey.aws.clouddirectory/unsupported-index-type-exception, "LinkNameAlreadyInUseException" :portkey.aws.clouddirectory/link-name-already-in-use-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef create-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-object-response))

(clojure.core/defn detach-policy ([detach-policy-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/policy/detach" detach-policy-request :portkey.aws.clouddirectory/detach-policy-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/detach-policy-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "NotPolicyException" :portkey.aws.clouddirectory/not-policy-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef detach-policy :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/detach-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/detach-policy-response))

(clojure.core/defn delete-directory ([delete-directory-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/directory" delete-directory-request :portkey.aws.clouddirectory/delete-directory-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/delete-directory-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "DirectoryNotDisabledException" :portkey.aws.clouddirectory/directory-not-disabled-exception, "DirectoryDeletedException" :portkey.aws.clouddirectory/directory-deleted-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef delete-directory :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/delete-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/delete-directory-response))

(clojure.core/defn batch-write ([batch-write-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/batchwrite" batch-write-request :portkey.aws.clouddirectory/batch-write-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/batch-write-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "BatchWriteException" :portkey.aws.clouddirectory/batch-write-exception})))
(clojure.spec.alpha/fdef batch-write :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/batch-write-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-write-response))

(clojure.core/defn list-typed-link-facet-names ([list-typed-link-facet-names-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/typedlink/facet/list" list-typed-link-facet-names-request :portkey.aws.clouddirectory/list-typed-link-facet-names-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-typed-link-facet-names-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception})))
(clojure.spec.alpha/fdef list-typed-link-facet-names :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-typed-link-facet-names-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-typed-link-facet-names-response))

(clojure.core/defn batch-read ([batch-read-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/batchread" batch-read-request :portkey.aws.clouddirectory/batch-read-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil], "ConsistencyLevel" ["x-amz-consistency-level" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/batch-read-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception})))
(clojure.spec.alpha/fdef batch-read :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/batch-read-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/batch-read-response))

(clojure.core/defn list-incoming-typed-links ([list-incoming-typed-links-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/typedlink/incoming" list-incoming-typed-links-request :portkey.aws.clouddirectory/list-incoming-typed-links-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-incoming-typed-links-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-incoming-typed-links :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-incoming-typed-links-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-incoming-typed-links-response))

(clojure.core/defn list-development-schema-arns ([] (list-development-schema-arns {})) ([list-development-schema-arns-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/schema/development" list-development-schema-arns-request :portkey.aws.clouddirectory/list-development-schema-arns-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-development-schema-arns-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception})))
(clojure.spec.alpha/fdef list-development-schema-arns :args (clojure.spec.alpha/? :portkey.aws.clouddirectory/list-development-schema-arns-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-development-schema-arns-response))

(clojure.core/defn delete-schema ([delete-schema-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/schema" delete-schema-request :portkey.aws.clouddirectory/delete-schema-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/delete-schema-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "StillContainsLinksException" :portkey.aws.clouddirectory/still-contains-links-exception})))
(clojure.spec.alpha/fdef delete-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/delete-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/delete-schema-response))

(clojure.core/defn delete-typed-link-facet ([delete-typed-link-facet-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/typedlink/facet/delete" delete-typed-link-facet-request :portkey.aws.clouddirectory/delete-typed-link-facet-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/delete-typed-link-facet-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception})))
(clojure.spec.alpha/fdef delete-typed-link-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/delete-typed-link-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/delete-typed-link-facet-response))

(clojure.core/defn publish-schema ([publish-schema-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/schema/publish" publish-schema-request :portkey.aws.clouddirectory/publish-schema-request {:payload nil, :move {}, :headers {"DevelopmentSchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/publish-schema-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "SchemaAlreadyPublishedException" :portkey.aws.clouddirectory/schema-already-published-exception})))
(clojure.spec.alpha/fdef publish-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/publish-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/publish-schema-response))

(clojure.core/defn disable-directory ([disable-directory-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/directory/disable" disable-directory-request :portkey.aws.clouddirectory/disable-directory-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/disable-directory-response {"ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "DirectoryDeletedException" :portkey.aws.clouddirectory/directory-deleted-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception})))
(clojure.spec.alpha/fdef disable-directory :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/disable-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/disable-directory-response))

(clojure.core/defn create-typed-link-facet ([create-typed-link-facet-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/typedlink/facet/create" create-typed-link-facet-request :portkey.aws.clouddirectory/create-typed-link-facet-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/create-typed-link-facet-response {"InvalidRuleException" :portkey.aws.clouddirectory/invalid-rule-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "FacetAlreadyExistsException" :portkey.aws.clouddirectory/facet-already-exists-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef create-typed-link-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-typed-link-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-typed-link-facet-response))

(clojure.core/defn create-facet ([create-facet-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/facet/create" create-facet-request :portkey.aws.clouddirectory/create-facet-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/create-facet-response {"InvalidRuleException" :portkey.aws.clouddirectory/invalid-rule-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "FacetAlreadyExistsException" :portkey.aws.clouddirectory/facet-already-exists-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef create-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-facet-response))

(clojure.core/defn detach-object ([detach-object-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/object/detach" detach-object-request :portkey.aws.clouddirectory/detach-object-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/detach-object-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception})))
(clojure.spec.alpha/fdef detach-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/detach-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/detach-object-response))

(clojure.core/defn get-object-information ([get-object-information-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/object/information" get-object-information-request :portkey.aws.clouddirectory/get-object-information-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil], "ConsistencyLevel" ["x-amz-consistency-level" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/get-object-information-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception})))
(clojure.spec.alpha/fdef get-object-information :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-object-information-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-object-information-response))

(clojure.core/defn list-facet-names ([list-facet-names-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/facet/list" list-facet-names-request :portkey.aws.clouddirectory/list-facet-names-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-facet-names-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception})))
(clojure.spec.alpha/fdef list-facet-names :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-facet-names-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-facet-names-response))

(clojure.core/defn detach-from-index ([detach-from-index-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/index/detach" detach-from-index-request :portkey.aws.clouddirectory/detach-from-index-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/detach-from-index-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "NotIndexException" :portkey.aws.clouddirectory/not-index-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ObjectAlreadyDetachedException" :portkey.aws.clouddirectory/object-already-detached-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef detach-from-index :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/detach-from-index-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/detach-from-index-response))

(clojure.core/defn attach-object ([attach-object-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/object/attach" attach-object-request :portkey.aws.clouddirectory/attach-object-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/attach-object-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LinkNameAlreadyInUseException" :portkey.aws.clouddirectory/link-name-already-in-use-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidAttachmentException" :portkey.aws.clouddirectory/invalid-attachment-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef attach-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/attach-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/attach-object-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/tags" list-tags-for-resource-request :portkey.aws.clouddirectory/list-tags-for-resource-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-tags-for-resource-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidTaggingRequestException" :portkey.aws.clouddirectory/invalid-tagging-request-exception})))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-tags-for-resource-response))

(clojure.core/defn apply-schema ([apply-schema-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/schema/apply" apply-schema-request :portkey.aws.clouddirectory/apply-schema-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/apply-schema-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidAttachmentException" :portkey.aws.clouddirectory/invalid-attachment-exception})))
(clojure.spec.alpha/fdef apply-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/apply-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/apply-schema-response))

(clojure.core/defn list-policy-attachments ([list-policy-attachments-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/policy/attachment" list-policy-attachments-request :portkey.aws.clouddirectory/list-policy-attachments-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil], "ConsistencyLevel" ["x-amz-consistency-level" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-policy-attachments-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "NotPolicyException" :portkey.aws.clouddirectory/not-policy-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-policy-attachments :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-policy-attachments-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-policy-attachments-response))

(clojure.core/defn list-outgoing-typed-links ([list-outgoing-typed-links-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/typedlink/outgoing" list-outgoing-typed-links-request :portkey.aws.clouddirectory/list-outgoing-typed-links-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-outgoing-typed-links-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-outgoing-typed-links :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-outgoing-typed-links-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-outgoing-typed-links-response))

(clojure.core/defn get-facet ([get-facet-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/facet" get-facet-request :portkey.aws.clouddirectory/get-facet-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/get-facet-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception})))
(clojure.spec.alpha/fdef get-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-facet-response))

(clojure.core/defn list-facet-attributes ([list-facet-attributes-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/facet/attributes" list-facet-attributes-request :portkey.aws.clouddirectory/list-facet-attributes-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-facet-attributes-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-facet-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-facet-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-facet-attributes-response))

(clojure.core/defn attach-to-index ([attach-to-index-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/index/attach" attach-to-index-request :portkey.aws.clouddirectory/attach-to-index-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/attach-to-index-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LinkNameAlreadyInUseException" :portkey.aws.clouddirectory/link-name-already-in-use-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "NotIndexException" :portkey.aws.clouddirectory/not-index-exception, "IndexedAttributeMissingException" :portkey.aws.clouddirectory/indexed-attribute-missing-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef attach-to-index :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/attach-to-index-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/attach-to-index-response))

(clojure.core/defn list-directories ([] (list-directories {})) ([list-directories-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/directory/list" list-directories-request :portkey.aws.clouddirectory/list-directories-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-directories-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception})))
(clojure.spec.alpha/fdef list-directories :args (clojure.spec.alpha/? :portkey.aws.clouddirectory/list-directories-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-directories-response))

(clojure.core/defn list-object-attributes ([list-object-attributes-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/object/attributes" list-object-attributes-request :portkey.aws.clouddirectory/list-object-attributes-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil], "ConsistencyLevel" ["x-amz-consistency-level" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-object-attributes-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-object-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-object-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-object-attributes-response))

(clojure.core/defn list-index ([list-index-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/index/targets" list-index-request :portkey.aws.clouddirectory/list-index-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil], "ConsistencyLevel" ["x-amz-consistency-level" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-index-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "NotIndexException" :portkey.aws.clouddirectory/not-index-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-index :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-index-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-index-response))

(clojure.core/defn attach-typed-link ([attach-typed-link-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/typedlink/attach" attach-typed-link-request :portkey.aws.clouddirectory/attach-typed-link-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/attach-typed-link-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidAttachmentException" :portkey.aws.clouddirectory/invalid-attachment-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef attach-typed-link :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/attach-typed-link-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/attach-typed-link-response))

(clojure.core/defn detach-typed-link ([detach-typed-link-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/typedlink/detach" detach-typed-link-request :portkey.aws.clouddirectory/detach-typed-link-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 nil {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef detach-typed-link :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/detach-typed-link-request) :ret clojure.core/true?)

(clojure.core/defn list-object-children ([list-object-children-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/object/children" list-object-children-request :portkey.aws.clouddirectory/list-object-children-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil], "ConsistencyLevel" ["x-amz-consistency-level" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-object-children-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "NotNodeException" :portkey.aws.clouddirectory/not-node-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-object-children :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-object-children-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-object-children-response))

(clojure.core/defn update-typed-link-facet ([update-typed-link-facet-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/typedlink/facet" update-typed-link-facet-request :portkey.aws.clouddirectory/update-typed-link-facet-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/update-typed-link-facet-response {"InvalidRuleException" :portkey.aws.clouddirectory/invalid-rule-exception, "InvalidFacetUpdateException" :portkey.aws.clouddirectory/invalid-facet-update-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef update-typed-link-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/update-typed-link-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-typed-link-facet-response))

(clojure.core/defn add-facet-to-object ([add-facet-to-object-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/object/facets" add-facet-to-object-request :portkey.aws.clouddirectory/add-facet-to-object-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/add-facet-to-object-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef add-facet-to-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/add-facet-to-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/add-facet-to-object-response))

(clojure.core/defn create-schema ([create-schema-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/schema/create" create-schema-request :portkey.aws.clouddirectory/create-schema-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/create-schema-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "SchemaAlreadyExistsException" :portkey.aws.clouddirectory/schema-already-exists-exception})))
(clojure.spec.alpha/fdef create-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-schema-response))

(clojure.core/defn update-object-attributes ([update-object-attributes-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/object/update" update-object-attributes-request :portkey.aws.clouddirectory/update-object-attributes-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/update-object-attributes-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef update-object-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/update-object-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-object-attributes-response))

(clojure.core/defn delete-object ([delete-object-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/object/delete" delete-object-request :portkey.aws.clouddirectory/delete-object-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/delete-object-response {"ObjectNotDetachedException" :portkey.aws.clouddirectory/object-not-detached-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef delete-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/delete-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/delete-object-response))

(clojure.core/defn list-object-parents ([list-object-parents-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/object/parent" list-object-parents-request :portkey.aws.clouddirectory/list-object-parents-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil], "ConsistencyLevel" ["x-amz-consistency-level" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-object-parents-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "CannotListParentOfRootException" :portkey.aws.clouddirectory/cannot-list-parent-of-root-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-object-parents :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-object-parents-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-object-parents-response))

(clojure.core/defn update-schema ([update-schema-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/schema/update" update-schema-request :portkey.aws.clouddirectory/update-schema-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/update-schema-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception})))
(clojure.spec.alpha/fdef update-schema :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/update-schema-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-schema-response))

(clojure.core/defn untag-resource ([untag-resource-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/tags/remove" untag-resource-request :portkey.aws.clouddirectory/untag-resource-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/untag-resource-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidTaggingRequestException" :portkey.aws.clouddirectory/invalid-tagging-request-exception})))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/untag-resource-response))

(clojure.core/defn update-facet ([update-facet-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/facet" update-facet-request :portkey.aws.clouddirectory/update-facet-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/update-facet-response {"InvalidRuleException" :portkey.aws.clouddirectory/invalid-rule-exception, "InvalidFacetUpdateException" :portkey.aws.clouddirectory/invalid-facet-update-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef update-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/update-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/update-facet-response))

(clojure.core/defn list-applied-schema-arns ([list-applied-schema-arns-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/schema/applied" list-applied-schema-arns-request :portkey.aws.clouddirectory/list-applied-schema-arns-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-applied-schema-arns-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception})))
(clojure.spec.alpha/fdef list-applied-schema-arns :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-applied-schema-arns-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-applied-schema-arns-response))

(clojure.core/defn create-directory ([create-directory-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/directory/create" create-directory-request :portkey.aws.clouddirectory/create-directory-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/create-directory-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryAlreadyExistsException" :portkey.aws.clouddirectory/directory-already-exists-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception})))
(clojure.spec.alpha/fdef create-directory :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/create-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/create-directory-response))

(clojure.core/defn get-schema-as-json ([get-schema-as-json-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/schema/json" get-schema-as-json-request :portkey.aws.clouddirectory/get-schema-as-json-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/get-schema-as-json-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception})))
(clojure.spec.alpha/fdef get-schema-as-json :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-schema-as-json-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-schema-as-json-response))

(clojure.core/defn list-attached-indices ([list-attached-indices-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/object/indices" list-attached-indices-request :portkey.aws.clouddirectory/list-attached-indices-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil], "ConsistencyLevel" ["x-amz-consistency-level" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-attached-indices-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception})))
(clojure.spec.alpha/fdef list-attached-indices :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-attached-indices-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-attached-indices-response))

(clojure.core/defn attach-policy ([attach-policy-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/policy/attach" attach-policy-request :portkey.aws.clouddirectory/attach-policy-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/attach-policy-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "NotPolicyException" :portkey.aws.clouddirectory/not-policy-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef attach-policy :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/attach-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/attach-policy-response))

(clojure.core/defn get-typed-link-facet-information ([get-typed-link-facet-information-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/typedlink/facet/get" get-typed-link-facet-information-request :portkey.aws.clouddirectory/get-typed-link-facet-information-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/get-typed-link-facet-information-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef get-typed-link-facet-information :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-typed-link-facet-information-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-typed-link-facet-information-response))

(clojure.core/defn lookup-policy ([lookup-policy-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/policy/lookup" lookup-policy-request :portkey.aws.clouddirectory/lookup-policy-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/lookup-policy-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef lookup-policy :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/lookup-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/lookup-policy-response))

(clojure.core/defn get-directory ([get-directory-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/directory/get" get-directory-request :portkey.aws.clouddirectory/get-directory-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/get-directory-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception})))
(clojure.spec.alpha/fdef get-directory :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/get-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/get-directory-response))

(clojure.core/defn list-published-schema-arns ([] (list-published-schema-arns {})) ([list-published-schema-arns-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/schema/published" list-published-schema-arns-request :portkey.aws.clouddirectory/list-published-schema-arns-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-published-schema-arns-response {"InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception})))
(clojure.spec.alpha/fdef list-published-schema-arns :args (clojure.spec.alpha/? :portkey.aws.clouddirectory/list-published-schema-arns-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-published-schema-arns-response))

(clojure.core/defn list-typed-link-facet-attributes ([list-typed-link-facet-attributes-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "POST" "/amazonclouddirectory/2017-01-11/typedlink/facet/attributes" list-typed-link-facet-attributes-request :portkey.aws.clouddirectory/list-typed-link-facet-attributes-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/list-typed-link-facet-attributes-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidNextTokenException" :portkey.aws.clouddirectory/invalid-next-token-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef list-typed-link-facet-attributes :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/list-typed-link-facet-attributes-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/list-typed-link-facet-attributes-response))

(clojure.core/defn enable-directory ([enable-directory-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/directory/enable" enable-directory-request :portkey.aws.clouddirectory/enable-directory-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/enable-directory-response {"ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "DirectoryDeletedException" :portkey.aws.clouddirectory/directory-deleted-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception, "ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception})))
(clojure.spec.alpha/fdef enable-directory :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/enable-directory-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/enable-directory-response))

(clojure.core/defn delete-facet ([delete-facet-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/facet/delete" delete-facet-request :portkey.aws.clouddirectory/delete-facet-request {:payload nil, :move {}, :headers {"SchemaArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/delete-facet-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "FacetInUseException" :portkey.aws.clouddirectory/facet-in-use-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "FacetNotFoundException" :portkey.aws.clouddirectory/facet-not-found-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef delete-facet :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/delete-facet-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/delete-facet-response))

(clojure.core/defn remove-facet-from-object ([remove-facet-from-object-request] (portkey.aws/-rest-json-call portkey.aws.clouddirectory/endpoints "PUT" "/amazonclouddirectory/2017-01-11/object/facets/delete" remove-facet-from-object-request :portkey.aws.clouddirectory/remove-facet-from-object-request {:payload nil, :move {}, :headers {"DirectoryArn" ["x-amz-data-partition" nil]}, :uri {}, :querystring {}} 200 :portkey.aws.clouddirectory/remove-facet-from-object-response {"ValidationException" :portkey.aws.clouddirectory/validation-exception, "DirectoryNotEnabledException" :portkey.aws.clouddirectory/directory-not-enabled-exception, "LimitExceededException" :portkey.aws.clouddirectory/limit-exceeded-exception, "InvalidArnException" :portkey.aws.clouddirectory/invalid-arn-exception, "ResourceNotFoundException" :portkey.aws.clouddirectory/resource-not-found-exception, "FacetValidationException" :portkey.aws.clouddirectory/facet-validation-exception, "AccessDeniedException" :portkey.aws.clouddirectory/access-denied-exception, "RetryableConflictException" :portkey.aws.clouddirectory/retryable-conflict-exception, "InternalServiceException" :portkey.aws.clouddirectory/internal-service-exception})))
(clojure.spec.alpha/fdef remove-facet-from-object :args (clojure.spec.alpha/tuple :portkey.aws.clouddirectory/remove-facet-from-object-request) :ret (clojure.spec.alpha/and :portkey.aws.clouddirectory/remove-facet-from-object-response))
