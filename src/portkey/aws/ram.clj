(ns portkey.aws.ram (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-resource-arn-list)

(clojure.core/declare ser-tag-value-list)

(clojure.core/declare ser-principal-arn-or-id-list)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-resource-share-arn-list)

(clojure.core/declare ser-tag-filters)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-string)

(clojure.core/declare ser-resource-owner)

(clojure.core/declare ser-tag-filter)

(clojure.core/declare ser-resource-share-association-status)

(clojure.core/declare ser-resource-share-invitation-arn-list)

(clojure.core/declare ser-resource-share-association-type)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-resource-share-status)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-resource-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "ResourceArnList", :type "list"})

(clojure.core/defn- ser-tag-value-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-value coll) #:http.request.field{:shape "TagValue"}))) input), :shape "TagValueList", :type "list"})

(clojure.core/defn- ser-principal-arn-or-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "PrincipalArnOrIdList", :type "list"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-resource-share-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "ResourceShareArnList", :type "list"})

(clojure.core/defn- ser-tag-filters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-filter coll) #:http.request.field{:shape "TagFilter"}))) input), :shape "TagFilters", :type "list"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-resource-owner [input] #:http.request.field{:value (clojure.core/get {"SELF" "SELF", :self "SELF", "OTHER-ACCOUNTS" "OTHER-ACCOUNTS", :otheraccounts "OTHER-ACCOUNTS"} input), :shape "ResourceOwner"})

(clojure.core/defn- ser-tag-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagFilter", :type "structure"} (clojure.core/contains? input :tag-key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :tag-key)) #:http.request.field{:name "tagKey", :shape "TagKey"})) (clojure.core/contains? input :tag-values) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value-list (input :tag-values)) #:http.request.field{:name "tagValues", :shape "TagValueList"}))))

(clojure.core/defn- ser-resource-share-association-status [input] #:http.request.field{:value (clojure.core/get {:associating "ASSOCIATING", :associated "ASSOCIATED", :disassociated "DISASSOCIATED", "FAILED" "FAILED", :disassociating "DISASSOCIATING", "DISASSOCIATED" "DISASSOCIATED", "ASSOCIATED" "ASSOCIATED", "ASSOCIATING" "ASSOCIATING", "DISASSOCIATING" "DISASSOCIATING", :failed "FAILED"} input), :shape "ResourceShareAssociationStatus"})

(clojure.core/defn- ser-resource-share-invitation-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-string coll) #:http.request.field{:shape "String"}))) input), :shape "ResourceShareInvitationArnList", :type "list"})

(clojure.core/defn- ser-resource-share-association-type [input] #:http.request.field{:value (clojure.core/get {"PRINCIPAL" "PRINCIPAL", :principal "PRINCIPAL", "RESOURCE" "RESOURCE", :resource "RESOURCE"} input), :shape "ResourceShareAssociationType"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "value", :shape "TagValue"}))))

(clojure.core/defn- ser-resource-share-status [input] #:http.request.field{:value (clojure.core/get {:deleted "DELETED", :pending "PENDING", "PENDING" "PENDING", :deleting "DELETING", :active "ACTIVE", "DELETING" "DELETING", "ACTIVE" "ACTIVE", "FAILED" "FAILED", "DELETED" "DELETED", :failed "FAILED"} input), :shape "ResourceShareStatus"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-update-resource-share-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-share-arn)) #:http.request.field{:name "resourceShareArn", :shape "String"})]} (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :allow-external-principals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :allow-external-principals)) #:http.request.field{:name "allowExternalPrincipals", :shape "Boolean"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String"}))))

(clojure.core/defn- req-list-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-owner (input :resource-owner)) #:http.request.field{:name "resourceOwner", :shape "ResourceOwner"})]} (clojure.core/contains? input :principal) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :principal)) #:http.request.field{:name "principal", :shape "String"})) (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resource-type)) #:http.request.field{:name "resourceType", :shape "String"})) (clojure.core/contains? input :resource-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn-list (input :resource-arns)) #:http.request.field{:name "resourceArns", :shape "ResourceArnList"})) (clojure.core/contains? input :resource-share-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-share-arn-list (input :resource-share-arns)) #:http.request.field{:name "resourceShareArns", :shape "ResourceShareArnList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-reject-resource-share-invitation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-share-invitation-arn)) #:http.request.field{:name "resourceShareInvitationArn", :shape "String"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String"}))))

(clojure.core/defn- req-delete-resource-share-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-string (input :resource-share-arn)) #:http.request.field{:name "resourceShareArn", :shape "String", :location "querystring", :location-name "resourceShareArn"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String", :location "querystring", :location-name "clientToken"}))))

(clojure.core/defn- req-list-principals-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-owner (input :resource-owner)) #:http.request.field{:name "resourceOwner", :shape "ResourceOwner"})]} (clojure.core/contains? input :resource-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "String"})) (clojure.core/contains? input :principals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-principal-arn-or-id-list (input :principals)) #:http.request.field{:name "principals", :shape "PrincipalArnOrIdList"})) (clojure.core/contains? input :resource-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resource-type)) #:http.request.field{:name "resourceType", :shape "String"})) (clojure.core/contains? input :resource-share-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-share-arn-list (input :resource-share-arns)) #:http.request.field{:name "resourceShareArns", :shape "ResourceShareArnList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-get-resource-share-associations-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-share-association-type (input :association-type)) #:http.request.field{:name "associationType", :shape "ResourceShareAssociationType"})]} (clojure.core/contains? input :resource-share-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-share-arn-list (input :resource-share-arns)) #:http.request.field{:name "resourceShareArns", :shape "ResourceShareArnList"})) (clojure.core/contains? input :resource-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "String"})) (clojure.core/contains? input :principal) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :principal)) #:http.request.field{:name "principal", :shape "String"})) (clojure.core/contains? input :association-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-share-association-status (input :association-status)) #:http.request.field{:name "associationStatus", :shape "ResourceShareAssociationStatus"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-associate-resource-share-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-share-arn)) #:http.request.field{:name "resourceShareArn", :shape "String"})]} (clojure.core/contains? input :resource-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn-list (input :resource-arns)) #:http.request.field{:name "resourceArns", :shape "ResourceArnList"})) (clojure.core/contains? input :principals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-principal-arn-or-id-list (input :principals)) #:http.request.field{:name "principals", :shape "PrincipalArnOrIdList"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String"}))))

(clojure.core/defn- req-get-resource-shares-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-owner (input :resource-owner)) #:http.request.field{:name "resourceOwner", :shape "ResourceOwner"})]} (clojure.core/contains? input :resource-share-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-share-arn-list (input :resource-share-arns)) #:http.request.field{:name "resourceShareArns", :shape "ResourceShareArnList"})) (clojure.core/contains? input :resource-share-status) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-share-status (input :resource-share-status)) #:http.request.field{:name "resourceShareStatus", :shape "ResourceShareStatus"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})) (clojure.core/contains? input :tag-filters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-filters (input :tag-filters)) #:http.request.field{:name "tagFilters", :shape "TagFilters"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-accept-resource-share-invitation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-share-invitation-arn)) #:http.request.field{:name "resourceShareInvitationArn", :shape "String"})]} (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-share-arn)) #:http.request.field{:name "resourceShareArn", :shape "String"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})]}))

(clojure.core/defn- req-disassociate-resource-share-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-share-arn)) #:http.request.field{:name "resourceShareArn", :shape "String"})]} (clojure.core/contains? input :resource-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn-list (input :resource-arns)) #:http.request.field{:name "resourceArns", :shape "ResourceArnList"})) (clojure.core/contains? input :principals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-principal-arn-or-id-list (input :principals)) #:http.request.field{:name "principals", :shape "PrincipalArnOrIdList"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String"}))))

(clojure.core/defn- req-create-resource-share-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :name)) #:http.request.field{:name "name", :shape "String"})]} (clojure.core/contains? input :resource-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-arn-list (input :resource-arns)) #:http.request.field{:name "resourceArns", :shape "ResourceArnList"})) (clojure.core/contains? input :principals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-principal-arn-or-id-list (input :principals)) #:http.request.field{:name "principals", :shape "PrincipalArnOrIdList"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})) (clojure.core/contains? input :allow-external-principals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :allow-external-principals)) #:http.request.field{:name "allowExternalPrincipals", :shape "Boolean"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :client-token)) #:http.request.field{:name "clientToken", :shape "String"}))))

(clojure.core/defn- req-get-resource-share-invitations-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :resource-share-invitation-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-share-invitation-arn-list (input :resource-share-invitation-arns)) #:http.request.field{:name "resourceShareInvitationArns", :shape "ResourceShareInvitationArnList"})) (clojure.core/contains? input :resource-share-arns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-share-arn-list (input :resource-share-arns)) #:http.request.field{:name "resourceShareArns", :shape "ResourceShareArnList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-get-resource-policies-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn-list (input :resource-arns)) #:http.request.field{:name "resourceArns", :shape "ResourceArnList"})]} (clojure.core/contains? input :principal) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :principal)) #:http.request.field{:name "principal", :shape "String"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-share-arn)) #:http.request.field{:name "resourceShareArn", :shape "String"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "tagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-enable-sharing-with-aws-organization-request [input] (clojure.core/cond-> {}))

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-principal-list)

(clojure.core/declare deser-resource-share-invitation-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-resource-status)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-string)

(clojure.core/declare deser-policy-list)

(clojure.core/declare deser-resource-share)

(clojure.core/declare deser-resource-share-association)

(clojure.core/declare deser-resource-share-list)

(clojure.core/declare deser-resource-list)

(clojure.core/declare deser-resource-share-association-status)

(clojure.core/declare deser-resource-share-invitation)

(clojure.core/declare deser-resource-share-association-type)

(clojure.core/declare deser-policy)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-resource)

(clojure.core/declare deser-principal)

(clojure.core/declare deser-resource-share-status)

(clojure.core/declare deser-resource-share-association-list)

(clojure.core/declare deser-resource-share-invitation-status)

(clojure.core/declare deser-date-time)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-principal-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-principal coll))) input))

(clojure.core/defn- deser-resource-share-invitation-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-share-invitation coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-resource-status [input] (clojure.core/get {"AVAILABLE" :available, "ZONAL_RESOURCE_INACCESSIBLE" :zonal-resource-inaccessible, "LIMIT_EXCEEDED" :limit-exceeded, "UNAVAILABLE" :unavailable} input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-policy-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-policy coll))) input))

(clojure.core/defn- deser-resource-share [input] (clojure.core/cond-> {} (clojure.core/contains? input "tags") (clojure.core/assoc :tags (deser-tag-list (input "tags"))) (clojure.core/contains? input "owningAccountId") (clojure.core/assoc :owning-account-id (deser-string (input "owningAccountId"))) (clojure.core/contains? input "name") (clojure.core/assoc :name (deser-string (input "name"))) (clojure.core/contains? input "lastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-date-time (input "lastUpdatedTime"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-resource-share-status (input "status"))) (clojure.core/contains? input "statusMessage") (clojure.core/assoc :status-message (deser-string (input "statusMessage"))) (clojure.core/contains? input "allowExternalPrincipals") (clojure.core/assoc :allow-external-principals (deser-boolean (input "allowExternalPrincipals"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-date-time (input "creationTime"))) (clojure.core/contains? input "resourceShareArn") (clojure.core/assoc :resource-share-arn (deser-string (input "resourceShareArn")))))

(clojure.core/defn- deser-resource-share-association [input] (clojure.core/cond-> {} (clojure.core/contains? input "resourceShareArn") (clojure.core/assoc :resource-share-arn (deser-string (input "resourceShareArn"))) (clojure.core/contains? input "associatedEntity") (clojure.core/assoc :associated-entity (deser-string (input "associatedEntity"))) (clojure.core/contains? input "associationType") (clojure.core/assoc :association-type (deser-resource-share-association-type (input "associationType"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-resource-share-association-status (input "status"))) (clojure.core/contains? input "statusMessage") (clojure.core/assoc :status-message (deser-string (input "statusMessage"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-date-time (input "creationTime"))) (clojure.core/contains? input "lastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-date-time (input "lastUpdatedTime"))) (clojure.core/contains? input "external") (clojure.core/assoc :external (deser-boolean (input "external")))))

(clojure.core/defn- deser-resource-share-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-share coll))) input))

(clojure.core/defn- deser-resource-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource coll))) input))

(clojure.core/defn- deser-resource-share-association-status [input] (clojure.core/get {"ASSOCIATING" :associating, "ASSOCIATED" :associated, "FAILED" :failed, "DISASSOCIATING" :disassociating, "DISASSOCIATED" :disassociated} input))

(clojure.core/defn- deser-resource-share-invitation [input] (clojure.core/cond-> {} (clojure.core/contains? input "resourceShareInvitationArn") (clojure.core/assoc :resource-share-invitation-arn (deser-string (input "resourceShareInvitationArn"))) (clojure.core/contains? input "resourceShareName") (clojure.core/assoc :resource-share-name (deser-string (input "resourceShareName"))) (clojure.core/contains? input "resourceShareArn") (clojure.core/assoc :resource-share-arn (deser-string (input "resourceShareArn"))) (clojure.core/contains? input "senderAccountId") (clojure.core/assoc :sender-account-id (deser-string (input "senderAccountId"))) (clojure.core/contains? input "receiverAccountId") (clojure.core/assoc :receiver-account-id (deser-string (input "receiverAccountId"))) (clojure.core/contains? input "invitationTimestamp") (clojure.core/assoc :invitation-timestamp (deser-date-time (input "invitationTimestamp"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-resource-share-invitation-status (input "status"))) (clojure.core/contains? input "resourceShareAssociations") (clojure.core/assoc :resource-share-associations (deser-resource-share-association-list (input "resourceShareAssociations")))))

(clojure.core/defn- deser-resource-share-association-type [input] (clojure.core/get {"PRINCIPAL" :principal, "RESOURCE" :resource} input))

(clojure.core/defn- deser-policy [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "key") (clojure.core/assoc :key (deser-tag-key (input "key"))) (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-tag-value (input "value")))))

(clojure.core/defn- deser-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "arn") (clojure.core/assoc :arn (deser-string (input "arn"))) (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-string (input "type"))) (clojure.core/contains? input "resourceShareArn") (clojure.core/assoc :resource-share-arn (deser-string (input "resourceShareArn"))) (clojure.core/contains? input "status") (clojure.core/assoc :status (deser-resource-status (input "status"))) (clojure.core/contains? input "statusMessage") (clojure.core/assoc :status-message (deser-string (input "statusMessage"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-date-time (input "creationTime"))) (clojure.core/contains? input "lastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-date-time (input "lastUpdatedTime")))))

(clojure.core/defn- deser-principal [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "resourceShareArn") (clojure.core/assoc :resource-share-arn (deser-string (input "resourceShareArn"))) (clojure.core/contains? input "creationTime") (clojure.core/assoc :creation-time (deser-date-time (input "creationTime"))) (clojure.core/contains? input "lastUpdatedTime") (clojure.core/assoc :last-updated-time (deser-date-time (input "lastUpdatedTime"))) (clojure.core/contains? input "external") (clojure.core/assoc :external (deser-boolean (input "external")))))

(clojure.core/defn- deser-resource-share-status [input] (clojure.core/get {"PENDING" :pending, "ACTIVE" :active, "FAILED" :failed, "DELETING" :deleting, "DELETED" :deleted} input))

(clojure.core/defn- deser-resource-share-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-resource-share-association coll))) input))

(clojure.core/defn- deser-resource-share-invitation-status [input] (clojure.core/get {"PENDING" :pending, "ACCEPTED" :accepted, "REJECTED" :rejected, "EXPIRED" :expired} input))

(clojure.core/defn- deser-date-time [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-accept-resource-share-invitation-response ([input] (response-accept-resource-share-invitation-response nil input)) ([resultWrapper1427609 input] (clojure.core/let [rawinput1427608 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427610 {"resourceShareInvitation" (rawinput1427608 "resourceShareInvitation"), "clientToken" (rawinput1427608 "clientToken")}] (clojure.core/cond-> {} (letvar1427610 "resourceShareInvitation") (clojure.core/assoc :resource-share-invitation (deser-resource-share-invitation (clojure.core/get-in letvar1427610 ["resourceShareInvitation"]))) (letvar1427610 "clientToken") (clojure.core/assoc :client-token (deser-string (clojure.core/get-in letvar1427610 ["clientToken"])))))))

(clojure.core/defn- response-malformed-arn-exception ([input] (response-malformed-arn-exception nil input)) ([resultWrapper1427612 input] (clojure.core/let [rawinput1427611 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427613 {"message" (rawinput1427611 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427613 ["message"]))}))))

(clojure.core/defn- response-operation-not-permitted-exception ([input] (response-operation-not-permitted-exception nil input)) ([resultWrapper1427615 input] (clojure.core/let [rawinput1427614 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427616 {"message" (rawinput1427614 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427616 ["message"]))}))))

(clojure.core/defn- response-missing-required-parameter-exception ([input] (response-missing-required-parameter-exception nil input)) ([resultWrapper1427618 input] (clojure.core/let [rawinput1427617 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427619 {"message" (rawinput1427617 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427619 ["message"]))}))))

(clojure.core/defn- response-resource-share-invitation-already-rejected-exception ([input] (response-resource-share-invitation-already-rejected-exception nil input)) ([resultWrapper1427621 input] (clojure.core/let [rawinput1427620 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427622 {"message" (rawinput1427620 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427622 ["message"]))}))))

(clojure.core/defn- response-invalid-client-token-exception ([input] (response-invalid-client-token-exception nil input)) ([resultWrapper1427624 input] (clojure.core/let [rawinput1427623 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427625 {"message" (rawinput1427623 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427625 ["message"]))}))))

(clojure.core/defn- response-resource-share-invitation-arn-not-found-exception ([input] (response-resource-share-invitation-arn-not-found-exception nil input)) ([resultWrapper1427627 input] (clojure.core/let [rawinput1427626 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427628 {"message" (rawinput1427626 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427628 ["message"]))}))))

(clojure.core/defn- response-unknown-resource-exception ([input] (response-unknown-resource-exception nil input)) ([resultWrapper1427630 input] (clojure.core/let [rawinput1427629 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427631 {"message" (rawinput1427629 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427631 ["message"]))}))))

(clojure.core/defn- response-list-resources-response ([input] (response-list-resources-response nil input)) ([resultWrapper1427633 input] (clojure.core/let [rawinput1427632 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427634 {"resources" (rawinput1427632 "resources"), "nextToken" (rawinput1427632 "nextToken")}] (clojure.core/cond-> {} (letvar1427634 "resources") (clojure.core/assoc :resources (deser-resource-list (clojure.core/get-in letvar1427634 ["resources"]))) (letvar1427634 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1427634 ["nextToken"])))))))

(clojure.core/defn- response-invalid-max-results-exception ([input] (response-invalid-max-results-exception nil input)) ([resultWrapper1427636 input] (clojure.core/let [rawinput1427635 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427637 {"message" (rawinput1427635 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427637 ["message"]))}))))

(clojure.core/defn- response-associate-resource-share-response ([input] (response-associate-resource-share-response nil input)) ([resultWrapper1427639 input] (clojure.core/let [rawinput1427638 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427640 {"resourceShareAssociations" (rawinput1427638 "resourceShareAssociations"), "clientToken" (rawinput1427638 "clientToken")}] (clojure.core/cond-> {} (letvar1427640 "resourceShareAssociations") (clojure.core/assoc :resource-share-associations (deser-resource-share-association-list (clojure.core/get-in letvar1427640 ["resourceShareAssociations"]))) (letvar1427640 "clientToken") (clojure.core/assoc :client-token (deser-string (clojure.core/get-in letvar1427640 ["clientToken"])))))))

(clojure.core/defn- response-get-resource-share-invitations-response ([input] (response-get-resource-share-invitations-response nil input)) ([resultWrapper1427642 input] (clojure.core/let [rawinput1427641 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427643 {"resourceShareInvitations" (rawinput1427641 "resourceShareInvitations"), "nextToken" (rawinput1427641 "nextToken")}] (clojure.core/cond-> {} (letvar1427643 "resourceShareInvitations") (clojure.core/assoc :resource-share-invitations (deser-resource-share-invitation-list (clojure.core/get-in letvar1427643 ["resourceShareInvitations"]))) (letvar1427643 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1427643 ["nextToken"])))))))

(clojure.core/defn- response-tag-limit-exceeded-exception ([input] (response-tag-limit-exceeded-exception nil input)) ([resultWrapper1427645 input] (clojure.core/let [rawinput1427644 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427646 {"message" (rawinput1427644 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427646 ["message"]))}))))

(clojure.core/defn- response-service-unavailable-exception ([input] (response-service-unavailable-exception nil input)) ([resultWrapper1427648 input] (clojure.core/let [rawinput1427647 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427649 {"message" (rawinput1427647 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427649 ["message"]))}))))

(clojure.core/defn- response-get-resource-policies-response ([input] (response-get-resource-policies-response nil input)) ([resultWrapper1427651 input] (clojure.core/let [rawinput1427650 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427652 {"policies" (rawinput1427650 "policies"), "nextToken" (rawinput1427650 "nextToken")}] (clojure.core/cond-> {} (letvar1427652 "policies") (clojure.core/assoc :policies (deser-policy-list (clojure.core/get-in letvar1427652 ["policies"]))) (letvar1427652 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1427652 ["nextToken"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1427654 input] (clojure.core/let [rawinput1427653 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427655 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper1427657 input] (clojure.core/let [rawinput1427656 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427658 {"message" (rawinput1427656 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427658 ["message"]))}))))

(clojure.core/defn- response-enable-sharing-with-aws-organization-response ([input] (response-enable-sharing-with-aws-organization-response nil input)) ([resultWrapper1427660 input] (clojure.core/let [rawinput1427659 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427661 {"returnValue" (rawinput1427659 "returnValue")}] (clojure.core/cond-> {} (letvar1427661 "returnValue") (clojure.core/assoc :return-value (deser-boolean (clojure.core/get-in letvar1427661 ["returnValue"])))))))

(clojure.core/defn- response-idempotent-parameter-mismatch-exception ([input] (response-idempotent-parameter-mismatch-exception nil input)) ([resultWrapper1427663 input] (clojure.core/let [rawinput1427662 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427664 {"message" (rawinput1427662 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427664 ["message"]))}))))

(clojure.core/defn- response-get-resource-share-associations-response ([input] (response-get-resource-share-associations-response nil input)) ([resultWrapper1427666 input] (clojure.core/let [rawinput1427665 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427667 {"resourceShareAssociations" (rawinput1427665 "resourceShareAssociations"), "nextToken" (rawinput1427665 "nextToken")}] (clojure.core/cond-> {} (letvar1427667 "resourceShareAssociations") (clojure.core/assoc :resource-share-associations (deser-resource-share-association-list (clojure.core/get-in letvar1427667 ["resourceShareAssociations"]))) (letvar1427667 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1427667 ["nextToken"])))))))

(clojure.core/defn- response-disassociate-resource-share-response ([input] (response-disassociate-resource-share-response nil input)) ([resultWrapper1427669 input] (clojure.core/let [rawinput1427668 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427670 {"resourceShareAssociations" (rawinput1427668 "resourceShareAssociations"), "clientToken" (rawinput1427668 "clientToken")}] (clojure.core/cond-> {} (letvar1427670 "resourceShareAssociations") (clojure.core/assoc :resource-share-associations (deser-resource-share-association-list (clojure.core/get-in letvar1427670 ["resourceShareAssociations"]))) (letvar1427670 "clientToken") (clojure.core/assoc :client-token (deser-string (clojure.core/get-in letvar1427670 ["clientToken"])))))))

(clojure.core/defn- response-update-resource-share-response ([input] (response-update-resource-share-response nil input)) ([resultWrapper1427672 input] (clojure.core/let [rawinput1427671 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427673 {"resourceShare" (rawinput1427671 "resourceShare"), "clientToken" (rawinput1427671 "clientToken")}] (clojure.core/cond-> {} (letvar1427673 "resourceShare") (clojure.core/assoc :resource-share (deser-resource-share (clojure.core/get-in letvar1427673 ["resourceShare"]))) (letvar1427673 "clientToken") (clojure.core/assoc :client-token (deser-string (clojure.core/get-in letvar1427673 ["clientToken"])))))))

(clojure.core/defn- response-invalid-resource-type-exception ([input] (response-invalid-resource-type-exception nil input)) ([resultWrapper1427675 input] (clojure.core/let [rawinput1427674 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427676 {"message" (rawinput1427674 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427676 ["message"]))}))))

(clojure.core/defn- response-resource-share-invitation-already-accepted-exception ([input] (response-resource-share-invitation-already-accepted-exception nil input)) ([resultWrapper1427678 input] (clojure.core/let [rawinput1427677 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427679 {"message" (rawinput1427677 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427679 ["message"]))}))))

(clojure.core/defn- response-resource-share-invitation-expired-exception ([input] (response-resource-share-invitation-expired-exception nil input)) ([resultWrapper1427681 input] (clojure.core/let [rawinput1427680 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427682 {"message" (rawinput1427680 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427682 ["message"]))}))))

(clojure.core/defn- response-invalid-state-transition-exception ([input] (response-invalid-state-transition-exception nil input)) ([resultWrapper1427684 input] (clojure.core/let [rawinput1427683 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427685 {"message" (rawinput1427683 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427685 ["message"]))}))))

(clojure.core/defn- response-list-principals-response ([input] (response-list-principals-response nil input)) ([resultWrapper1427687 input] (clojure.core/let [rawinput1427686 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427688 {"principals" (rawinput1427686 "principals"), "nextToken" (rawinput1427686 "nextToken")}] (clojure.core/cond-> {} (letvar1427688 "principals") (clojure.core/assoc :principals (deser-principal-list (clojure.core/get-in letvar1427688 ["principals"]))) (letvar1427688 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1427688 ["nextToken"])))))))

(clojure.core/defn- response-get-resource-shares-response ([input] (response-get-resource-shares-response nil input)) ([resultWrapper1427690 input] (clojure.core/let [rawinput1427689 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427691 {"resourceShares" (rawinput1427689 "resourceShares"), "nextToken" (rawinput1427689 "nextToken")}] (clojure.core/cond-> {} (letvar1427691 "resourceShares") (clojure.core/assoc :resource-shares (deser-resource-share-list (clojure.core/get-in letvar1427691 ["resourceShares"]))) (letvar1427691 "nextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1427691 ["nextToken"])))))))

(clojure.core/defn- response-resource-share-limit-exceeded-exception ([input] (response-resource-share-limit-exceeded-exception nil input)) ([resultWrapper1427693 input] (clojure.core/let [rawinput1427692 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427694 {"message" (rawinput1427692 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427694 ["message"]))}))))

(clojure.core/defn- response-server-internal-exception ([input] (response-server-internal-exception nil input)) ([resultWrapper1427696 input] (clojure.core/let [rawinput1427695 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427697 {"message" (rawinput1427695 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427697 ["message"]))}))))

(clojure.core/defn- response-resource-arn-not-found-exception ([input] (response-resource-arn-not-found-exception nil input)) ([resultWrapper1427699 input] (clojure.core/let [rawinput1427698 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427700 {"message" (rawinput1427698 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427700 ["message"]))}))))

(clojure.core/defn- response-create-resource-share-response ([input] (response-create-resource-share-response nil input)) ([resultWrapper1427702 input] (clojure.core/let [rawinput1427701 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427703 {"resourceShare" (rawinput1427701 "resourceShare"), "clientToken" (rawinput1427701 "clientToken")}] (clojure.core/cond-> {} (letvar1427703 "resourceShare") (clojure.core/assoc :resource-share (deser-resource-share (clojure.core/get-in letvar1427703 ["resourceShare"]))) (letvar1427703 "clientToken") (clojure.core/assoc :client-token (deser-string (clojure.core/get-in letvar1427703 ["clientToken"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1427705 input] (clojure.core/let [rawinput1427704 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427706 {"message" (rawinput1427704 "message")}] (clojure.core/cond-> {:message (deser-string (clojure.core/get-in letvar1427706 ["message"]))}))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1427708 input] (clojure.core/let [rawinput1427707 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427709 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-reject-resource-share-invitation-response ([input] (response-reject-resource-share-invitation-response nil input)) ([resultWrapper1427711 input] (clojure.core/let [rawinput1427710 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427712 {"resourceShareInvitation" (rawinput1427710 "resourceShareInvitation"), "clientToken" (rawinput1427710 "clientToken")}] (clojure.core/cond-> {} (letvar1427712 "resourceShareInvitation") (clojure.core/assoc :resource-share-invitation (deser-resource-share-invitation (clojure.core/get-in letvar1427712 ["resourceShareInvitation"]))) (letvar1427712 "clientToken") (clojure.core/assoc :client-token (deser-string (clojure.core/get-in letvar1427712 ["clientToken"])))))))

(clojure.core/defn- response-delete-resource-share-response ([input] (response-delete-resource-share-response nil input)) ([resultWrapper1427714 input] (clojure.core/let [rawinput1427713 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1427715 {"returnValue" (rawinput1427713 "returnValue"), "clientToken" (rawinput1427713 "clientToken")}] (clojure.core/cond-> {} (letvar1427715 "returnValue") (clojure.core/assoc :return-value (deser-boolean (clojure.core/get-in letvar1427715 ["returnValue"]))) (letvar1427715 "clientToken") (clojure.core/assoc :client-token (deser-string (clojure.core/get-in letvar1427715 ["clientToken"])))))))

(clojure.spec.alpha/def :portkey.aws.ram.accept-resource-share-invitation-response/resource-share-invitation (clojure.spec.alpha/and :portkey.aws.ram/resource-share-invitation))
(clojure.spec.alpha/def :portkey.aws.ram.accept-resource-share-invitation-response/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/accept-resource-share-invitation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.accept-resource-share-invitation-response/resource-share-invitation :portkey.aws.ram.accept-resource-share-invitation-response/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram/resource-arn-list (clojure.spec.alpha/coll-of :portkey.aws.ram/string))

(clojure.spec.alpha/def :portkey.aws.ram.update-resource-share-request/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.update-resource-share-request/name (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.update-resource-share-request/allow-external-principals (clojure.spec.alpha/and :portkey.aws.ram/boolean))
(clojure.spec.alpha/def :portkey.aws.ram.update-resource-share-request/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/update-resource-share-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.update-resource-share-request/resource-share-arn] :opt-un [:portkey.aws.ram.update-resource-share-request/name :portkey.aws.ram.update-resource-share-request/allow-external-principals :portkey.aws.ram.update-resource-share-request/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram/tag-value-list (clojure.spec.alpha/coll-of :portkey.aws.ram/tag-value))

(clojure.spec.alpha/def :portkey.aws.ram.malformed-arn-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/malformed-arn-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.malformed-arn-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram/principal-arn-or-id-list (clojure.spec.alpha/coll-of :portkey.aws.ram/string))

(clojure.spec.alpha/def :portkey.aws.ram.operation-not-permitted-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/operation-not-permitted-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.operation-not-permitted-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.list-resources-request/resource-owner (clojure.spec.alpha/and :portkey.aws.ram/resource-owner))
(clojure.spec.alpha/def :portkey.aws.ram.list-resources-request/principal (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.list-resources-request/resource-type (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.list-resources-request/resource-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.list-resources-request/resource-share-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-share-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.list-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.list-resources-request/max-results (clojure.spec.alpha/and :portkey.aws.ram/max-results))
(clojure.spec.alpha/def :portkey.aws.ram/list-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.list-resources-request/resource-owner] :opt-un [:portkey.aws.ram.list-resources-request/principal :portkey.aws.ram.list-resources-request/resource-type :portkey.aws.ram.list-resources-request/resource-arns :portkey.aws.ram.list-resources-request/resource-share-arns :portkey.aws.ram.list-resources-request/next-token :portkey.aws.ram.list-resources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ram.missing-required-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/missing-required-parameter-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.missing-required-parameter-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation-already-rejected-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/resource-share-invitation-already-rejected-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.resource-share-invitation-already-rejected-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.invalid-client-token-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/invalid-client-token-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.invalid-client-token-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.reject-resource-share-invitation-request/resource-share-invitation-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.reject-resource-share-invitation-request/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/reject-resource-share-invitation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.reject-resource-share-invitation-request/resource-share-invitation-arn] :opt-un [:portkey.aws.ram.reject-resource-share-invitation-request/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram.delete-resource-share-request/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.delete-resource-share-request/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/delete-resource-share-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.delete-resource-share-request/resource-share-arn] :opt-un [:portkey.aws.ram.delete-resource-share-request/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation-arn-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/resource-share-invitation-arn-not-found-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.resource-share-invitation-arn-not-found-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.list-principals-request/resource-owner (clojure.spec.alpha/and :portkey.aws.ram/resource-owner))
(clojure.spec.alpha/def :portkey.aws.ram.list-principals-request/resource-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.list-principals-request/principals (clojure.spec.alpha/and :portkey.aws.ram/principal-arn-or-id-list))
(clojure.spec.alpha/def :portkey.aws.ram.list-principals-request/resource-type (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.list-principals-request/resource-share-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-share-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.list-principals-request/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.list-principals-request/max-results (clojure.spec.alpha/and :portkey.aws.ram/max-results))
(clojure.spec.alpha/def :portkey.aws.ram/list-principals-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.list-principals-request/resource-owner] :opt-un [:portkey.aws.ram.list-principals-request/resource-arn :portkey.aws.ram.list-principals-request/principals :portkey.aws.ram.list-principals-request/resource-type :portkey.aws.ram.list-principals-request/resource-share-arns :portkey.aws.ram.list-principals-request/next-token :portkey.aws.ram.list-principals-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ram.unknown-resource-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/unknown-resource-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.unknown-resource-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.list-resources-response/resources (clojure.spec.alpha/and :portkey.aws.ram/resource-list))
(clojure.spec.alpha/def :portkey.aws.ram.list-resources-response/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/list-resources-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.list-resources-response/resources :portkey.aws.ram.list-resources-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ram/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ram.invalid-max-results-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/invalid-max-results-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.invalid-max-results-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.associate-resource-share-response/resource-share-associations (clojure.spec.alpha/and :portkey.aws.ram/resource-share-association-list))
(clojure.spec.alpha/def :portkey.aws.ram.associate-resource-share-response/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/associate-resource-share-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.associate-resource-share-response/resource-share-associations :portkey.aws.ram.associate-resource-share-response/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram/resource-share-arn-list (clojure.spec.alpha/coll-of :portkey.aws.ram/string))

(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-invitations-response/resource-share-invitations (clojure.spec.alpha/and :portkey.aws.ram/resource-share-invitation-list))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-invitations-response/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/get-resource-share-invitations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.get-resource-share-invitations-response/resource-share-invitations :portkey.aws.ram.get-resource-share-invitations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-associations-request/association-type (clojure.spec.alpha/and :portkey.aws.ram/resource-share-association-type))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-associations-request/resource-share-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-share-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-associations-request/resource-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-associations-request/principal (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-associations-request/association-status (clojure.spec.alpha/and :portkey.aws.ram/resource-share-association-status))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-associations-request/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-associations-request/max-results (clojure.spec.alpha/and :portkey.aws.ram/max-results))
(clojure.spec.alpha/def :portkey.aws.ram/get-resource-share-associations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.get-resource-share-associations-request/association-type] :opt-un [:portkey.aws.ram.get-resource-share-associations-request/resource-share-arns :portkey.aws.ram.get-resource-share-associations-request/resource-arn :portkey.aws.ram.get-resource-share-associations-request/principal :portkey.aws.ram.get-resource-share-associations-request/association-status :portkey.aws.ram.get-resource-share-associations-request/next-token :portkey.aws.ram.get-resource-share-associations-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ram.tag-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/tag-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.tag-limit-exceeded-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/service-unavailable-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.service-unavailable-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.get-resource-policies-response/policies (clojure.spec.alpha/and :portkey.aws.ram/policy-list))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-policies-response/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/get-resource-policies-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.get-resource-policies-response/policies :portkey.aws.ram.get-resource-policies-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ram.associate-resource-share-request/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.associate-resource-share-request/resource-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.associate-resource-share-request/principals (clojure.spec.alpha/and :portkey.aws.ram/principal-arn-or-id-list))
(clojure.spec.alpha/def :portkey.aws.ram.associate-resource-share-request/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/associate-resource-share-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.associate-resource-share-request/resource-share-arn] :opt-un [:portkey.aws.ram.associate-resource-share-request/resource-arns :portkey.aws.ram.associate-resource-share-request/principals :portkey.aws.ram.associate-resource-share-request/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram.get-resource-shares-request/resource-share-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-share-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-shares-request/resource-share-status (clojure.spec.alpha/and :portkey.aws.ram/resource-share-status))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-shares-request/resource-owner (clojure.spec.alpha/and :portkey.aws.ram/resource-owner))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-shares-request/name (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-shares-request/tag-filters (clojure.spec.alpha/and :portkey.aws.ram/tag-filters))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-shares-request/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-shares-request/max-results (clojure.spec.alpha/and :portkey.aws.ram/max-results))
(clojure.spec.alpha/def :portkey.aws.ram/get-resource-shares-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.get-resource-shares-request/resource-owner] :opt-un [:portkey.aws.ram.get-resource-shares-request/resource-share-arns :portkey.aws.ram.get-resource-shares-request/resource-share-status :portkey.aws.ram.get-resource-shares-request/name :portkey.aws.ram.get-resource-shares-request/tag-filters :portkey.aws.ram.get-resource-shares-request/next-token :portkey.aws.ram.get-resource-shares-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ram/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram/principal-list (clojure.spec.alpha/coll-of :portkey.aws.ram/principal))

(clojure.spec.alpha/def :portkey.aws.ram.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.invalid-next-token-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram/tag-filters (clojure.spec.alpha/coll-of :portkey.aws.ram/tag-filter))

(clojure.spec.alpha/def :portkey.aws.ram.enable-sharing-with-aws-organization-response/return-value (clojure.spec.alpha/and :portkey.aws.ram/boolean))
(clojure.spec.alpha/def :portkey.aws.ram/enable-sharing-with-aws-organization-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.enable-sharing-with-aws-organization-response/return-value]))

(clojure.spec.alpha/def :portkey.aws.ram.accept-resource-share-invitation-request/resource-share-invitation-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.accept-resource-share-invitation-request/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/accept-resource-share-invitation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.accept-resource-share-invitation-request/resource-share-invitation-arn] :opt-un [:portkey.aws.ram.accept-resource-share-invitation-request/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram.tag-resource-request/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.ram/tag-list))
(clojure.spec.alpha/def :portkey.aws.ram/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.tag-resource-request/resource-share-arn :portkey.aws.ram.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram/resource-share-invitation-list (clojure.spec.alpha/coll-of :portkey.aws.ram/resource-share-invitation))

(clojure.spec.alpha/def :portkey.aws.ram/tag-list (clojure.spec.alpha/coll-of :portkey.aws.ram/tag))

(clojure.spec.alpha/def :portkey.aws.ram.disassociate-resource-share-request/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.disassociate-resource-share-request/resource-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.disassociate-resource-share-request/principals (clojure.spec.alpha/and :portkey.aws.ram/principal-arn-or-id-list))
(clojure.spec.alpha/def :portkey.aws.ram.disassociate-resource-share-request/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/disassociate-resource-share-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.disassociate-resource-share-request/resource-share-arn] :opt-un [:portkey.aws.ram.disassociate-resource-share-request/resource-arns :portkey.aws.ram.disassociate-resource-share-request/principals :portkey.aws.ram.disassociate-resource-share-request/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.ram/tag-key))

(clojure.spec.alpha/def :portkey.aws.ram/resource-status #{:limit-exceeded "LIMIT_EXCEEDED" :zonal-resource-inaccessible "ZONAL_RESOURCE_INACCESSIBLE" :unavailable "AVAILABLE" "UNAVAILABLE" :available})

(clojure.spec.alpha/def :portkey.aws.ram/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ram.idempotent-parameter-mismatch-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.idempotent-parameter-mismatch-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-associations-response/resource-share-associations (clojure.spec.alpha/and :portkey.aws.ram/resource-share-association-list))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-associations-response/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/get-resource-share-associations-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.get-resource-share-associations-response/resource-share-associations :portkey.aws.ram.get-resource-share-associations-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ram.disassociate-resource-share-response/resource-share-associations (clojure.spec.alpha/and :portkey.aws.ram/resource-share-association-list))
(clojure.spec.alpha/def :portkey.aws.ram.disassociate-resource-share-response/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/disassociate-resource-share-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.disassociate-resource-share-response/resource-share-associations :portkey.aws.ram.disassociate-resource-share-response/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram.update-resource-share-response/resource-share (clojure.spec.alpha/and :portkey.aws.ram/resource-share))
(clojure.spec.alpha/def :portkey.aws.ram.update-resource-share-response/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/update-resource-share-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.update-resource-share-response/resource-share :portkey.aws.ram.update-resource-share-response/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ram/resource-owner #{"SELF" "OTHER-ACCOUNTS" :otheraccounts :self})

(clojure.spec.alpha/def :portkey.aws.ram.invalid-resource-type-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/invalid-resource-type-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.invalid-resource-type-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation-already-accepted-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/resource-share-invitation-already-accepted-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.resource-share-invitation-already-accepted-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation-expired-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/resource-share-invitation-expired-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.resource-share-invitation-expired-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.create-resource-share-request/name (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.create-resource-share-request/resource-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.create-resource-share-request/principals (clojure.spec.alpha/and :portkey.aws.ram/principal-arn-or-id-list))
(clojure.spec.alpha/def :portkey.aws.ram.create-resource-share-request/tags (clojure.spec.alpha/and :portkey.aws.ram/tag-list))
(clojure.spec.alpha/def :portkey.aws.ram.create-resource-share-request/allow-external-principals (clojure.spec.alpha/and :portkey.aws.ram/boolean))
(clojure.spec.alpha/def :portkey.aws.ram.create-resource-share-request/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/create-resource-share-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.create-resource-share-request/name] :opt-un [:portkey.aws.ram.create-resource-share-request/resource-arns :portkey.aws.ram.create-resource-share-request/principals :portkey.aws.ram.create-resource-share-request/tags :portkey.aws.ram.create-resource-share-request/allow-external-principals :portkey.aws.ram.create-resource-share-request/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram.invalid-state-transition-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/invalid-state-transition-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.invalid-state-transition-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram/policy-list (clojure.spec.alpha/coll-of :portkey.aws.ram/policy))

(clojure.spec.alpha/def :portkey.aws.ram.resource-share/tags (clojure.spec.alpha/and :portkey.aws.ram/tag-list))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share/owning-account-id (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share/name (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share/last-updated-time (clojure.spec.alpha/and :portkey.aws.ram/date-time))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share/status (clojure.spec.alpha/and :portkey.aws.ram/resource-share-status))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share/status-message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share/allow-external-principals (clojure.spec.alpha/and :portkey.aws.ram/boolean))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share/creation-time (clojure.spec.alpha/and :portkey.aws.ram/date-time))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/resource-share (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.resource-share/tags :portkey.aws.ram.resource-share/owning-account-id :portkey.aws.ram.resource-share/name :portkey.aws.ram.resource-share/last-updated-time :portkey.aws.ram.resource-share/status :portkey.aws.ram.resource-share/status-message :portkey.aws.ram.resource-share/allow-external-principals :portkey.aws.ram.resource-share/creation-time :portkey.aws.ram.resource-share/resource-share-arn]))

(clojure.spec.alpha/def :portkey.aws.ram.resource-share-association/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-association/associated-entity (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-association/association-type (clojure.spec.alpha/and :portkey.aws.ram/resource-share-association-type))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-association/status (clojure.spec.alpha/and :portkey.aws.ram/resource-share-association-status))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-association/status-message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-association/creation-time (clojure.spec.alpha/and :portkey.aws.ram/date-time))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-association/last-updated-time (clojure.spec.alpha/and :portkey.aws.ram/date-time))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-association/external (clojure.spec.alpha/and :portkey.aws.ram/boolean))
(clojure.spec.alpha/def :portkey.aws.ram/resource-share-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.resource-share-association/resource-share-arn :portkey.aws.ram.resource-share-association/associated-entity :portkey.aws.ram.resource-share-association/association-type :portkey.aws.ram.resource-share-association/status :portkey.aws.ram.resource-share-association/status-message :portkey.aws.ram.resource-share-association/creation-time :portkey.aws.ram.resource-share-association/last-updated-time :portkey.aws.ram.resource-share-association/external]))

(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-invitations-request/resource-share-invitation-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-share-invitation-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-invitations-request/resource-share-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-share-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-invitations-request/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-share-invitations-request/max-results (clojure.spec.alpha/and :portkey.aws.ram/max-results))
(clojure.spec.alpha/def :portkey.aws.ram/get-resource-share-invitations-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.get-resource-share-invitations-request/resource-share-invitation-arns :portkey.aws.ram.get-resource-share-invitations-request/resource-share-arns :portkey.aws.ram.get-resource-share-invitations-request/next-token :portkey.aws.ram.get-resource-share-invitations-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ram/resource-share-list (clojure.spec.alpha/coll-of :portkey.aws.ram/resource-share))

(clojure.spec.alpha/def :portkey.aws.ram/resource-list (clojure.spec.alpha/coll-of :portkey.aws.ram/resource))

(clojure.spec.alpha/def :portkey.aws.ram.tag-filter/tag-key (clojure.spec.alpha/and :portkey.aws.ram/tag-key))
(clojure.spec.alpha/def :portkey.aws.ram.tag-filter/tag-values (clojure.spec.alpha/and :portkey.aws.ram/tag-value-list))
(clojure.spec.alpha/def :portkey.aws.ram/tag-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.tag-filter/tag-key :portkey.aws.ram.tag-filter/tag-values]))

(clojure.spec.alpha/def :portkey.aws.ram/resource-share-association-status #{:associating :associated :disassociated "FAILED" :disassociating "DISASSOCIATED" "ASSOCIATED" "ASSOCIATING" "DISASSOCIATING" :failed})

(clojure.spec.alpha/def :portkey.aws.ram.list-principals-response/principals (clojure.spec.alpha/and :portkey.aws.ram/principal-list))
(clojure.spec.alpha/def :portkey.aws.ram.list-principals-response/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/list-principals-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.list-principals-response/principals :portkey.aws.ram.list-principals-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ram.get-resource-shares-response/resource-shares (clojure.spec.alpha/and :portkey.aws.ram/resource-share-list))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-shares-response/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/get-resource-shares-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.get-resource-shares-response/resource-shares :portkey.aws.ram.get-resource-shares-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ram.resource-share-limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/resource-share-limit-exceeded-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.resource-share-limit-exceeded-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation/resource-share-invitation-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation/resource-share-name (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation/sender-account-id (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation/receiver-account-id (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation/invitation-timestamp (clojure.spec.alpha/and :portkey.aws.ram/date-time))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation/status (clojure.spec.alpha/and :portkey.aws.ram/resource-share-invitation-status))
(clojure.spec.alpha/def :portkey.aws.ram.resource-share-invitation/resource-share-associations (clojure.spec.alpha/and :portkey.aws.ram/resource-share-association-list))
(clojure.spec.alpha/def :portkey.aws.ram/resource-share-invitation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.resource-share-invitation/resource-share-invitation-arn :portkey.aws.ram.resource-share-invitation/resource-share-name :portkey.aws.ram.resource-share-invitation/resource-share-arn :portkey.aws.ram.resource-share-invitation/sender-account-id :portkey.aws.ram.resource-share-invitation/receiver-account-id :portkey.aws.ram.resource-share-invitation/invitation-timestamp :portkey.aws.ram.resource-share-invitation/status :portkey.aws.ram.resource-share-invitation/resource-share-associations]))

(clojure.spec.alpha/def :portkey.aws.ram/resource-share-invitation-arn-list (clojure.spec.alpha/coll-of :portkey.aws.ram/string))

(clojure.spec.alpha/def :portkey.aws.ram/resource-share-association-type #{"PRINCIPAL" :resource "RESOURCE" :principal})

(clojure.spec.alpha/def :portkey.aws.ram/policy (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ram/max-results (clojure.spec.alpha/int-in 1 500))

(clojure.spec.alpha/def :portkey.aws.ram.tag/key (clojure.spec.alpha/and :portkey.aws.ram/tag-key))
(clojure.spec.alpha/def :portkey.aws.ram.tag/value (clojure.spec.alpha/and :portkey.aws.ram/tag-value))
(clojure.spec.alpha/def :portkey.aws.ram/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.tag/key :portkey.aws.ram.tag/value]))

(clojure.spec.alpha/def :portkey.aws.ram.resource/arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource/type (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource/status (clojure.spec.alpha/and :portkey.aws.ram/resource-status))
(clojure.spec.alpha/def :portkey.aws.ram.resource/status-message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.resource/creation-time (clojure.spec.alpha/and :portkey.aws.ram/date-time))
(clojure.spec.alpha/def :portkey.aws.ram.resource/last-updated-time (clojure.spec.alpha/and :portkey.aws.ram/date-time))
(clojure.spec.alpha/def :portkey.aws.ram/resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.resource/arn :portkey.aws.ram.resource/type :portkey.aws.ram.resource/resource-share-arn :portkey.aws.ram.resource/status :portkey.aws.ram.resource/status-message :portkey.aws.ram.resource/creation-time :portkey.aws.ram.resource/last-updated-time]))

(clojure.spec.alpha/def :portkey.aws.ram.server-internal-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/server-internal-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.server-internal-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.resource-arn-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/resource-arn-not-found-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.resource-arn-not-found-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.get-resource-policies-request/resource-arns (clojure.spec.alpha/and :portkey.aws.ram/resource-arn-list))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-policies-request/principal (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-policies-request/next-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.get-resource-policies-request/max-results (clojure.spec.alpha/and :portkey.aws.ram/max-results))
(clojure.spec.alpha/def :portkey.aws.ram/get-resource-policies-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.get-resource-policies-request/resource-arns] :opt-un [:portkey.aws.ram.get-resource-policies-request/principal :portkey.aws.ram.get-resource-policies-request/next-token :portkey.aws.ram.get-resource-policies-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ram.principal/id (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.principal/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.principal/creation-time (clojure.spec.alpha/and :portkey.aws.ram/date-time))
(clojure.spec.alpha/def :portkey.aws.ram.principal/last-updated-time (clojure.spec.alpha/and :portkey.aws.ram/date-time))
(clojure.spec.alpha/def :portkey.aws.ram.principal/external (clojure.spec.alpha/and :portkey.aws.ram/boolean))
(clojure.spec.alpha/def :portkey.aws.ram/principal (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.principal/id :portkey.aws.ram.principal/resource-share-arn :portkey.aws.ram.principal/creation-time :portkey.aws.ram.principal/last-updated-time :portkey.aws.ram.principal/external]))

(clojure.spec.alpha/def :portkey.aws.ram.create-resource-share-response/resource-share (clojure.spec.alpha/and :portkey.aws.ram/resource-share))
(clojure.spec.alpha/def :portkey.aws.ram.create-resource-share-response/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/create-resource-share-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.create-resource-share-response/resource-share :portkey.aws.ram.create-resource-share-response/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram/resource-share-status #{:deleted :pending "PENDING" :deleting :active "DELETING" "ACTIVE" "FAILED" "DELETED" :failed})

(clojure.spec.alpha/def :portkey.aws.ram.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.invalid-parameter-exception/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram/resource-share-association-list (clojure.spec.alpha/coll-of :portkey.aws.ram/resource-share-association))

(clojure.spec.alpha/def :portkey.aws.ram/resource-share-invitation-status #{"ACCEPTED" :rejected "EXPIRED" :pending :accepted "PENDING" "REJECTED" :expired})

(clojure.spec.alpha/def :portkey.aws.ram/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram.reject-resource-share-invitation-response/resource-share-invitation (clojure.spec.alpha/and :portkey.aws.ram/resource-share-invitation))
(clojure.spec.alpha/def :portkey.aws.ram.reject-resource-share-invitation-response/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/reject-resource-share-invitation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.reject-resource-share-invitation-response/resource-share-invitation :portkey.aws.ram.reject-resource-share-invitation-response/client-token]))

(clojure.spec.alpha/def :portkey.aws.ram.untag-resource-request/resource-share-arn (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.ram/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.ram/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ram.untag-resource-request/resource-share-arn :portkey.aws.ram.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram/enable-sharing-with-aws-organization-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ram/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ram/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ram.delete-resource-share-response/return-value (clojure.spec.alpha/and :portkey.aws.ram/boolean))
(clojure.spec.alpha/def :portkey.aws.ram.delete-resource-share-response/client-token (clojure.spec.alpha/and :portkey.aws.ram/string))
(clojure.spec.alpha/def :portkey.aws.ram/delete-resource-share-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ram.delete-resource-share-response/return-value :portkey.aws.ram.delete-resource-share-response/client-token]))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/tagresource", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/tag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception, "MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "TagLimitExceededException" :portkey.aws.ram/tag-limit-exceeded-exception, "ResourceArnNotFoundException" :portkey.aws.ram/resource-arn-not-found-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.ram/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/tag-resource-response))

(clojure.core/defn get-resource-policies ([get-resource-policies-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-resource-policies-request get-resource-policies-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/get-resource-policies-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getresourcepolicies", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/get-resource-policies-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResourcePolicies", :http.request.configuration/output-deser-fn response-get-resource-policies-response, :http.request.spec/error-spec {"MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "InvalidNextTokenException" :portkey.aws.ram/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-resource-policies :args (clojure.spec.alpha/tuple :portkey.aws.ram/get-resource-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/get-resource-policies-response))

(clojure.core/defn get-resource-share-associations ([get-resource-share-associations-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-resource-share-associations-request get-resource-share-associations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/get-resource-share-associations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getresourceshareassociations", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/get-resource-share-associations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResourceShareAssociations", :http.request.configuration/output-deser-fn response-get-resource-share-associations-response, :http.request.spec/error-spec {"UnknownResourceException" :portkey.aws.ram/unknown-resource-exception, "MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "InvalidNextTokenException" :portkey.aws.ram/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception, "OperationNotPermittedException" :portkey.aws.ram/operation-not-permitted-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-resource-share-associations :args (clojure.spec.alpha/tuple :portkey.aws.ram/get-resource-share-associations-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/get-resource-share-associations-response))

(clojure.core/defn update-resource-share ([update-resource-share-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-update-resource-share-request update-resource-share-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/update-resource-share-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/updateresourceshare", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/update-resource-share-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateResourceShare", :http.request.configuration/output-deser-fn response-update-resource-share-response, :http.request.spec/error-spec {"MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "OperationNotPermittedException" :portkey.aws.ram/operation-not-permitted-exception, "MissingRequiredParameterException" :portkey.aws.ram/missing-required-parameter-exception, "InvalidClientTokenException" :portkey.aws.ram/invalid-client-token-exception, "UnknownResourceException" :portkey.aws.ram/unknown-resource-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception, "IdempotentParameterMismatchException" :portkey.aws.ram/idempotent-parameter-mismatch-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-resource-share :args (clojure.spec.alpha/tuple :portkey.aws.ram/update-resource-share-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/update-resource-share-response))

(clojure.core/defn associate-resource-share ([associate-resource-share-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-associate-resource-share-request associate-resource-share-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/associate-resource-share-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/associateresourceshare", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/associate-resource-share-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateResourceShare", :http.request.configuration/output-deser-fn response-associate-resource-share-response, :http.request.spec/error-spec {"MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "OperationNotPermittedException" :portkey.aws.ram/operation-not-permitted-exception, "InvalidClientTokenException" :portkey.aws.ram/invalid-client-token-exception, "UnknownResourceException" :portkey.aws.ram/unknown-resource-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception, "IdempotentParameterMismatchException" :portkey.aws.ram/idempotent-parameter-mismatch-exception, "InvalidStateTransitionException" :portkey.aws.ram/invalid-state-transition-exception, "ResourceShareLimitExceededException" :portkey.aws.ram/resource-share-limit-exceeded-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef associate-resource-share :args (clojure.spec.alpha/tuple :portkey.aws.ram/associate-resource-share-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/associate-resource-share-response))

(clojure.core/defn accept-resource-share-invitation ([accept-resource-share-invitation-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-accept-resource-share-invitation-request accept-resource-share-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/accept-resource-share-invitation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/acceptresourceshareinvitation", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/accept-resource-share-invitation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AcceptResourceShareInvitation", :http.request.configuration/output-deser-fn response-accept-resource-share-invitation-response, :http.request.spec/error-spec {"MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "OperationNotPermittedException" :portkey.aws.ram/operation-not-permitted-exception, "ResourceShareInvitationArnNotFoundException" :portkey.aws.ram/resource-share-invitation-arn-not-found-exception, "ResourceShareInvitationAlreadyAcceptedException" :portkey.aws.ram/resource-share-invitation-already-accepted-exception, "ResourceShareInvitationAlreadyRejectedException" :portkey.aws.ram/resource-share-invitation-already-rejected-exception, "ResourceShareInvitationExpiredException" :portkey.aws.ram/resource-share-invitation-expired-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef accept-resource-share-invitation :args (clojure.spec.alpha/tuple :portkey.aws.ram/accept-resource-share-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/accept-resource-share-invitation-response))

(clojure.core/defn reject-resource-share-invitation ([reject-resource-share-invitation-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-reject-resource-share-invitation-request reject-resource-share-invitation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/reject-resource-share-invitation-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/rejectresourceshareinvitation", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/reject-resource-share-invitation-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RejectResourceShareInvitation", :http.request.configuration/output-deser-fn response-reject-resource-share-invitation-response, :http.request.spec/error-spec {"MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "OperationNotPermittedException" :portkey.aws.ram/operation-not-permitted-exception, "ResourceShareInvitationArnNotFoundException" :portkey.aws.ram/resource-share-invitation-arn-not-found-exception, "ResourceShareInvitationAlreadyAcceptedException" :portkey.aws.ram/resource-share-invitation-already-accepted-exception, "ResourceShareInvitationAlreadyRejectedException" :portkey.aws.ram/resource-share-invitation-already-rejected-exception, "ResourceShareInvitationExpiredException" :portkey.aws.ram/resource-share-invitation-expired-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef reject-resource-share-invitation :args (clojure.spec.alpha/tuple :portkey.aws.ram/reject-resource-share-invitation-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/reject-resource-share-invitation-response))

(clojure.core/defn delete-resource-share ([delete-resource-share-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-delete-resource-share-request delete-resource-share-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/delete-resource-share-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/deleteresourceshare", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/delete-resource-share-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResourceShare", :http.request.configuration/output-deser-fn response-delete-resource-share-response, :http.request.spec/error-spec {"MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "OperationNotPermittedException" :portkey.aws.ram/operation-not-permitted-exception, "InvalidClientTokenException" :portkey.aws.ram/invalid-client-token-exception, "UnknownResourceException" :portkey.aws.ram/unknown-resource-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception, "IdempotentParameterMismatchException" :portkey.aws.ram/idempotent-parameter-mismatch-exception, "InvalidStateTransitionException" :portkey.aws.ram/invalid-state-transition-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef delete-resource-share :args (clojure.spec.alpha/tuple :portkey.aws.ram/delete-resource-share-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/delete-resource-share-response))

(clojure.core/defn list-resources ([list-resources-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-resources-request list-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/list-resources-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listresources", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/list-resources-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListResources", :http.request.configuration/output-deser-fn response-list-resources-response, :http.request.spec/error-spec {"InvalidResourceTypeException" :portkey.aws.ram/invalid-resource-type-exception, "UnknownResourceException" :portkey.aws.ram/unknown-resource-exception, "MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "InvalidNextTokenException" :portkey.aws.ram/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-resources :args (clojure.spec.alpha/tuple :portkey.aws.ram/list-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/list-resources-response))

(clojure.core/defn disassociate-resource-share ([disassociate-resource-share-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-disassociate-resource-share-request disassociate-resource-share-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/disassociate-resource-share-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/disassociateresourceshare", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/disassociate-resource-share-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateResourceShare", :http.request.configuration/output-deser-fn response-disassociate-resource-share-response, :http.request.spec/error-spec {"MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "OperationNotPermittedException" :portkey.aws.ram/operation-not-permitted-exception, "InvalidClientTokenException" :portkey.aws.ram/invalid-client-token-exception, "UnknownResourceException" :portkey.aws.ram/unknown-resource-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception, "IdempotentParameterMismatchException" :portkey.aws.ram/idempotent-parameter-mismatch-exception, "InvalidStateTransitionException" :portkey.aws.ram/invalid-state-transition-exception, "ResourceShareLimitExceededException" :portkey.aws.ram/resource-share-limit-exceeded-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef disassociate-resource-share :args (clojure.spec.alpha/tuple :portkey.aws.ram/disassociate-resource-share-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/disassociate-resource-share-response))

(clojure.core/defn list-principals ([list-principals-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-list-principals-request list-principals-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/list-principals-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/listprincipals", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/list-principals-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPrincipals", :http.request.configuration/output-deser-fn response-list-principals-response, :http.request.spec/error-spec {"MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "UnknownResourceException" :portkey.aws.ram/unknown-resource-exception, "InvalidNextTokenException" :portkey.aws.ram/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef list-principals :args (clojure.spec.alpha/tuple :portkey.aws.ram/list-principals-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/list-principals-response))

(clojure.core/defn create-resource-share ([create-resource-share-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-create-resource-share-request create-resource-share-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/create-resource-share-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/createresourceshare", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/create-resource-share-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateResourceShare", :http.request.configuration/output-deser-fn response-create-resource-share-response, :http.request.spec/error-spec {"MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "OperationNotPermittedException" :portkey.aws.ram/operation-not-permitted-exception, "InvalidClientTokenException" :portkey.aws.ram/invalid-client-token-exception, "UnknownResourceException" :portkey.aws.ram/unknown-resource-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception, "IdempotentParameterMismatchException" :portkey.aws.ram/idempotent-parameter-mismatch-exception, "InvalidStateTransitionException" :portkey.aws.ram/invalid-state-transition-exception, "ResourceShareLimitExceededException" :portkey.aws.ram/resource-share-limit-exceeded-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef create-resource-share :args (clojure.spec.alpha/tuple :portkey.aws.ram/create-resource-share-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/create-resource-share-response))

(clojure.core/defn enable-sharing-with-aws-organization ([] (enable-sharing-with-aws-organization {})) ([enable-sharing-with-aws-organization-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-enable-sharing-with-aws-organization-request enable-sharing-with-aws-organization-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/enable-sharing-with-aws-organization-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/enablesharingwithawsorganization", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/enable-sharing-with-aws-organization-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "EnableSharingWithAwsOrganization", :http.request.configuration/output-deser-fn response-enable-sharing-with-aws-organization-response, :http.request.spec/error-spec {"OperationNotPermittedException" :portkey.aws.ram/operation-not-permitted-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef enable-sharing-with-aws-organization :args (clojure.spec.alpha/? :portkey.aws.ram/enable-sharing-with-aws-organization-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/enable-sharing-with-aws-organization-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/untagresource", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/untag-resource-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.ram/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/untag-resource-response))

(clojure.core/defn get-resource-share-invitations ([] (get-resource-share-invitations {})) ([get-resource-share-invitations-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-resource-share-invitations-request get-resource-share-invitations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/get-resource-share-invitations-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getresourceshareinvitations", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/get-resource-share-invitations-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResourceShareInvitations", :http.request.configuration/output-deser-fn response-get-resource-share-invitations-response, :http.request.spec/error-spec {"ResourceShareInvitationArnNotFoundException" :portkey.aws.ram/resource-share-invitation-arn-not-found-exception, "InvalidMaxResultsException" :portkey.aws.ram/invalid-max-results-exception, "MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "InvalidNextTokenException" :portkey.aws.ram/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-resource-share-invitations :args (clojure.spec.alpha/? :portkey.aws.ram/get-resource-share-invitations-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/get-resource-share-invitations-response))

(clojure.core/defn get-resource-shares ([get-resource-shares-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-get-resource-shares-request get-resource-shares-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.ram/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.ram/get-resource-shares-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/getresourceshares", :http.request.configuration/version "2018-01-04", :http.request.configuration/service-id "RAM", :http.request.spec/input-spec :portkey.aws.ram/get-resource-shares-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResourceShares", :http.request.configuration/output-deser-fn response-get-resource-shares-response, :http.request.spec/error-spec {"UnknownResourceException" :portkey.aws.ram/unknown-resource-exception, "MalformedArnException" :portkey.aws.ram/malformed-arn-exception, "InvalidNextTokenException" :portkey.aws.ram/invalid-next-token-exception, "InvalidParameterException" :portkey.aws.ram/invalid-parameter-exception, "ServerInternalException" :portkey.aws.ram/server-internal-exception, "ServiceUnavailableException" :portkey.aws.ram/service-unavailable-exception}})))))
(clojure.spec.alpha/fdef get-resource-shares :args (clojure.spec.alpha/tuple :portkey.aws.ram/get-resource-shares-request) :ret (clojure.spec.alpha/and :portkey.aws.ram/get-resource-shares-response))
