(ns portkey.aws.ecr.-2015-09-21 (:require [portkey.aws]))

(def
 endpoints
 '{"us-gov-east-1"
   {:credential-scope {:service "api.ecr", :region "us-gov-east-1"},
    :ssl-common-name "api.ecr.us-gov-east-1.amazonaws.com",
    :endpoint "https://api.ecr.us-gov-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope {:service "api.ecr", :region "ap-northeast-1"},
    :ssl-common-name "api.ecr.ap-northeast-1.amazonaws.com",
    :endpoint "https://api.ecr.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "api.ecr", :region "eu-west-1"},
    :ssl-common-name "api.ecr.eu-west-1.amazonaws.com",
    :endpoint "https://api.ecr.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "api.ecr", :region "us-east-2"},
    :ssl-common-name "api.ecr.us-east-2.amazonaws.com",
    :endpoint "https://api.ecr.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "api.ecr", :region "ap-southeast-2"},
    :ssl-common-name "api.ecr.ap-southeast-2.amazonaws.com",
    :endpoint "https://api.ecr.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "api.ecr", :region "cn-north-1"},
    :ssl-common-name "api.ecr.cn-north-1.amazonaws.com.cn",
    :endpoint "https://api.ecr.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "api.ecr", :region "sa-east-1"},
    :ssl-common-name "api.ecr.sa-east-1.amazonaws.com",
    :endpoint "https://api.ecr.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "api.ecr", :region "ap-southeast-1"},
    :ssl-common-name "api.ecr.ap-southeast-1.amazonaws.com",
    :endpoint "https://api.ecr.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "api.ecr", :region "cn-northwest-1"},
    :ssl-common-name "api.ecr.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://api.ecr.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "api.ecr", :region "ap-northeast-2"},
    :ssl-common-name "api.ecr.ap-northeast-2.amazonaws.com",
    :endpoint "https://api.ecr.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "api.ecr", :region "eu-west-3"},
    :ssl-common-name "api.ecr.eu-west-3.amazonaws.com",
    :endpoint "https://api.ecr.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "api.ecr", :region "ca-central-1"},
    :ssl-common-name "api.ecr.ca-central-1.amazonaws.com",
    :endpoint "https://api.ecr.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "api.ecr", :region "eu-central-1"},
    :ssl-common-name "api.ecr.eu-central-1.amazonaws.com",
    :endpoint "https://api.ecr.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "api.ecr", :region "eu-west-2"},
    :ssl-common-name "api.ecr.eu-west-2.amazonaws.com",
    :endpoint "https://api.ecr.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "api.ecr", :region "us-gov-west-1"},
    :ssl-common-name "api.ecr.us-gov-west-1.amazonaws.com",
    :endpoint "https://api.ecr.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "api.ecr", :region "us-west-2"},
    :ssl-common-name "api.ecr.us-west-2.amazonaws.com",
    :endpoint "https://api.ecr.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "api.ecr", :region "us-east-1"},
    :ssl-common-name "api.ecr.us-east-1.amazonaws.com",
    :endpoint "https://api.ecr.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "api.ecr", :region "us-west-1"},
    :ssl-common-name "api.ecr.us-west-1.amazonaws.com",
    :endpoint "https://api.ecr.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "api.ecr", :region "ap-south-1"},
    :ssl-common-name "api.ecr.ap-south-1.amazonaws.com",
    :endpoint "https://api.ecr.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope {:service "api.ecr", :region "eu-north-1"},
    :ssl-common-name "api.ecr.eu-north-1.amazonaws.com",
    :endpoint "https://api.ecr.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-media-type-list)

(clojure.core/declare ser-describe-images-filter)

(clojure.core/declare ser-media-type)

(clojure.core/declare ser-image-digest)

(clojure.core/declare ser-layer-part-blob)

(clojure.core/declare ser-repository-name)

(clojure.core/declare ser-batched-operation-layer-digest)

(clojure.core/declare ser-tag-status)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-repository-policy-text)

(clojure.core/declare ser-lifecycle-policy-preview-filter)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-lifecycle-preview-max-results)

(clojure.core/declare ser-batched-operation-layer-digest-list)

(clojure.core/declare ser-part-size)

(clojure.core/declare ser-force-flag)

(clojure.core/declare ser-image-tag)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-image-identifier)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-get-authorization-token-registry-id-list)

(clojure.core/declare ser-layer-digest-list)

(clojure.core/declare ser-registry-id)

(clojure.core/declare ser-arn)

(clojure.core/declare ser-layer-digest)

(clojure.core/declare ser-upload-id)

(clojure.core/declare ser-image-manifest)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-list-images-filter)

(clojure.core/declare ser-image-identifier-list)

(clojure.core/declare ser-lifecycle-policy-text)

(clojure.core/declare ser-repository-name-list)

(clojure.core/defn- ser-media-type-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-media-type coll) #:http.request.field{:shape "MediaType"}))) input), :shape "MediaTypeList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-describe-images-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DescribeImagesFilter", :type "structure"} (clojure.core/contains? input :tag-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-status (input :tag-status)) #:http.request.field{:name "tagStatus", :shape "TagStatus"}))))

(clojure.core/defn- ser-media-type [input] #:http.request.field{:value input, :shape "MediaType"})

(clojure.core/defn- ser-image-digest [input] #:http.request.field{:value input, :shape "ImageDigest"})

(clojure.core/defn- ser-layer-part-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "LayerPartBlob"})

(clojure.core/defn- ser-repository-name [input] #:http.request.field{:value input, :shape "RepositoryName"})

(clojure.core/defn- ser-batched-operation-layer-digest [input] #:http.request.field{:value input, :shape "BatchedOperationLayerDigest"})

(clojure.core/defn- ser-tag-status [input] #:http.request.field{:value (clojure.core/get {"TAGGED" "TAGGED", :tagged "TAGGED", "UNTAGGED" "UNTAGGED", :untagged "UNTAGGED", "ANY" "ANY", :any "ANY"} input), :shape "TagStatus"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-repository-policy-text [input] #:http.request.field{:value input, :shape "RepositoryPolicyText"})

(clojure.core/defn- ser-lifecycle-policy-preview-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LifecyclePolicyPreviewFilter", :type "structure"} (clojure.core/contains? input :tag-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-status (input :tag-status)) #:http.request.field{:name "tagStatus", :shape "TagStatus"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-lifecycle-preview-max-results [input] #:http.request.field{:value input, :shape "LifecyclePreviewMaxResults"})

(clojure.core/defn- ser-batched-operation-layer-digest-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-batched-operation-layer-digest coll) #:http.request.field{:shape "BatchedOperationLayerDigest"}))) input), :shape "BatchedOperationLayerDigestList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-part-size [input] #:http.request.field{:value input, :shape "PartSize"})

(clojure.core/defn- ser-force-flag [input] #:http.request.field{:value input, :shape "ForceFlag"})

(clojure.core/defn- ser-image-tag [input] #:http.request.field{:value input, :shape "ImageTag"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-image-identifier [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ImageIdentifier", :type "structure"} (clojure.core/contains? input :image-digest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-digest (input :image-digest)) #:http.request.field{:name "imageDigest", :shape "ImageDigest"})) (clojure.core/contains? input :image-tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-tag (input :image-tag)) #:http.request.field{:name "imageTag", :shape "ImageTag"}))))

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-get-authorization-token-registry-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-registry-id coll) #:http.request.field{:shape "RegistryId"}))) input), :shape "GetAuthorizationTokenRegistryIdList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-layer-digest-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-layer-digest coll) #:http.request.field{:shape "LayerDigest"}))) input), :shape "LayerDigestList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-registry-id [input] #:http.request.field{:value input, :shape "RegistryId"})

(clojure.core/defn- ser-arn [input] #:http.request.field{:value input, :shape "Arn"})

(clojure.core/defn- ser-layer-digest [input] #:http.request.field{:value input, :shape "LayerDigest"})

(clojure.core/defn- ser-upload-id [input] #:http.request.field{:value input, :shape "UploadId"})

(clojure.core/defn- ser-image-manifest [input] #:http.request.field{:value input, :shape "ImageManifest"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key (input :key)) #:http.request.field{:name "Key", :shape "TagKey"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-list-images-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ListImagesFilter", :type "structure"} (clojure.core/contains? input :tag-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-status (input :tag-status)) #:http.request.field{:name "tagStatus", :shape "TagStatus"}))))

(clojure.core/defn- ser-image-identifier-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-image-identifier coll) #:http.request.field{:shape "ImageIdentifier"}))) input), :shape "ImageIdentifierList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-lifecycle-policy-text [input] #:http.request.field{:value input, :shape "LifecyclePolicyText"})

(clojure.core/defn- ser-repository-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-repository-name coll) #:http.request.field{:shape "RepositoryName"}))) input), :shape "RepositoryNameList", :type "list", :max 100, :min 1})

(clojure.core/defn- req-get-authorization-token-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :registry-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-authorization-token-registry-id-list (input :registry-ids)) #:http.request.field{:name "registryIds", :shape "GetAuthorizationTokenRegistryIdList"}))))

(clojure.core/defn- req-put-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-image-manifest (input :image-manifest)) #:http.request.field{:name "imageManifest", :shape "ImageManifest"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :image-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-tag (input :image-tag)) #:http.request.field{:name "imageTag", :shape "ImageTag"}))))

(clojure.core/defn- req-get-download-url-for-layer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-layer-digest (input :layer-digest)) #:http.request.field{:name "layerDigest", :shape "LayerDigest"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"})]}))

(clojure.core/defn- req-complete-layer-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-upload-id (input :upload-id)) #:http.request.field{:name "uploadId", :shape "UploadId"}) (clojure.core/into (ser-layer-digest-list (input :layer-digests)) #:http.request.field{:name "layerDigests", :shape "LayerDigestList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-batch-check-layer-availability-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-batched-operation-layer-digest-list (input :layer-digests)) #:http.request.field{:name "layerDigests", :shape "BatchedOperationLayerDigestList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-list-images-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-images-filter (input :filter)) #:http.request.field{:name "filter", :shape "ListImagesFilter"}))))

(clojure.core/defn- req-get-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"})]}))

(clojure.core/defn- req-delete-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-upload-layer-part-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-upload-id (input :upload-id)) #:http.request.field{:name "uploadId", :shape "UploadId"}) (clojure.core/into (ser-part-size (input :part-first-byte)) #:http.request.field{:name "partFirstByte", :shape "PartSize"}) (clojure.core/into (ser-part-size (input :part-last-byte)) #:http.request.field{:name "partLastByte", :shape "PartSize"}) (clojure.core/into (ser-layer-part-blob (input :layer-part-blob)) #:http.request.field{:name "layerPartBlob", :shape "LayerPartBlob"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-get-lifecycle-policy-preview-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :image-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-preview-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "LifecyclePreviewMaxResults"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-policy-preview-filter (input :filter)) #:http.request.field{:name "filter", :shape "LifecyclePolicyPreviewFilter"}))))

(clojure.core/defn- req-describe-repositories-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :repository-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-name-list (input :repository-names)) #:http.request.field{:name "repositoryNames", :shape "RepositoryNameList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-put-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-lifecycle-policy-text (input :lifecycle-policy-text)) #:http.request.field{:name "lifecyclePolicyText", :shape "LifecyclePolicyText"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-batch-delete-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-start-lifecycle-policy-preview-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :lifecycle-policy-text) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-policy-text (input :lifecycle-policy-text)) #:http.request.field{:name "lifecyclePolicyText", :shape "LifecyclePolicyText"}))))

(clojure.core/defn- req-describe-images-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :image-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-images-filter (input :filter)) #:http.request.field{:name "filter", :shape "DescribeImagesFilter"}))))

(clojure.core/defn- req-batch-get-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :accepted-media-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-media-type-list (input :accepted-media-types)) #:http.request.field{:name "acceptedMediaTypes", :shape "MediaTypeList"}))))

(clojure.core/defn- req-get-repository-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-delete-repository-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-create-repository-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "tags", :shape "TagList"}))))

(clojure.core/defn- req-initiate-layer-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-set-repository-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-repository-policy-text (input :policy-text)) #:http.request.field{:name "policyText", :shape "RepositoryPolicyText"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-flag (input :force)) #:http.request.field{:name "force", :shape "ForceFlag"}))))

(clojure.core/defn- req-delete-repository-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-flag (input :force)) #:http.request.field{:name "force", :shape "ForceFlag"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn (input :resource-arn)) #:http.request.field{:name "resourceArn", :shape "Arn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "tagKeys", :shape "TagKeyList"})]}))

(clojure.core/declare deser-image-failure-list)

(clojure.core/declare deser-proxy-endpoint)

(clojure.core/declare deser-lifecycle-policy-preview-status)

(clojure.core/declare deser-image-count)

(clojure.core/declare deser-repository-list)

(clojure.core/declare deser-media-type)

(clojure.core/declare deser-image-digest)

(clojure.core/declare deser-layer-failure-reason)

(clojure.core/declare deser-lifecycle-policy-rule-action)

(clojure.core/declare deser-repository-name)

(clojure.core/declare deser-evaluation-timestamp)

(clojure.core/declare deser-image-tag-list)

(clojure.core/declare deser-image-action-type)

(clojure.core/declare deser-batched-operation-layer-digest)

(clojure.core/declare deser-lifecycle-policy-rule-priority)

(clojure.core/declare deser-repository)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-layer-failure)

(clojure.core/declare deser-repository-policy-text)

(clojure.core/declare deser-authorization-data-list)

(clojure.core/declare deser-base-64)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-layer-availability)

(clojure.core/declare deser-image-list)

(clojure.core/declare deser-lifecycle-policy-preview-result-list)

(clojure.core/declare deser-part-size)

(clojure.core/declare deser-image-tag)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-layer)

(clojure.core/declare deser-layer-size-in-bytes)

(clojure.core/declare deser-image-identifier)

(clojure.core/declare deser-image-size-in-bytes)

(clojure.core/declare deser-url)

(clojure.core/declare deser-layer-failure-code)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-creation-timestamp)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-lifecycle-policy-preview-summary)

(clojure.core/declare deser-expiration-timestamp)

(clojure.core/declare deser-layer-list)

(clojure.core/declare deser-image-failure-reason)

(clojure.core/declare deser-image-detail)

(clojure.core/declare deser-registry-id)

(clojure.core/declare deser-image-failure)

(clojure.core/declare deser-arn)

(clojure.core/declare deser-layer-digest)

(clojure.core/declare deser-upload-id)

(clojure.core/declare deser-authorization-data)

(clojure.core/declare deser-image-manifest)

(clojure.core/declare deser-lifecycle-policy-preview-result)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-image-detail-list)

(clojure.core/declare deser-layer-failure-list)

(clojure.core/declare deser-image-failure-code)

(clojure.core/declare deser-image)

(clojure.core/declare deser-image-identifier-list)

(clojure.core/declare deser-lifecycle-policy-text)

(clojure.core/declare deser-push-timestamp)

(clojure.core/defn- deser-image-failure-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image-failure coll))) input))

(clojure.core/defn- deser-proxy-endpoint [input] input)

(clojure.core/defn- deser-lifecycle-policy-preview-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "COMPLETE" :complete, "EXPIRED" :expired, "FAILED" :failed} input))

(clojure.core/defn- deser-image-count [input] input)

(clojure.core/defn- deser-repository-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-repository coll))) input))

(clojure.core/defn- deser-media-type [input] input)

(clojure.core/defn- deser-image-digest [input] input)

(clojure.core/defn- deser-layer-failure-reason [input] input)

(clojure.core/defn- deser-lifecycle-policy-rule-action [input] (clojure.core/cond-> {} (clojure.core/contains? input "type") (clojure.core/assoc :type (deser-image-action-type (input "type")))))

(clojure.core/defn- deser-repository-name [input] input)

(clojure.core/defn- deser-evaluation-timestamp [input] input)

(clojure.core/defn- deser-image-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image-tag coll))) input))

(clojure.core/defn- deser-image-action-type [input] (clojure.core/get {"EXPIRE" :expire} input))

(clojure.core/defn- deser-batched-operation-layer-digest [input] input)

(clojure.core/defn- deser-lifecycle-policy-rule-priority [input] input)

(clojure.core/defn- deser-repository [input] (clojure.core/cond-> {} (clojure.core/contains? input "repositoryArn") (clojure.core/assoc :repository-arn (deser-arn (input "repositoryArn"))) (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "repositoryUri") (clojure.core/assoc :repository-uri (deser-url (input "repositoryUri"))) (clojure.core/contains? input "createdAt") (clojure.core/assoc :created-at (deser-creation-timestamp (input "createdAt")))))

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-layer-failure [input] (clojure.core/cond-> {} (clojure.core/contains? input "layerDigest") (clojure.core/assoc :layer-digest (deser-batched-operation-layer-digest (input "layerDigest"))) (clojure.core/contains? input "failureCode") (clojure.core/assoc :failure-code (deser-layer-failure-code (input "failureCode"))) (clojure.core/contains? input "failureReason") (clojure.core/assoc :failure-reason (deser-layer-failure-reason (input "failureReason")))))

(clojure.core/defn- deser-repository-policy-text [input] input)

(clojure.core/defn- deser-authorization-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-authorization-data coll))) input))

(clojure.core/defn- deser-base-64 [input] input)

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-layer-availability [input] (clojure.core/get {"AVAILABLE" :available, "UNAVAILABLE" :unavailable} input))

(clojure.core/defn- deser-image-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image coll))) input))

(clojure.core/defn- deser-lifecycle-policy-preview-result-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lifecycle-policy-preview-result coll))) input))

(clojure.core/defn- deser-part-size [input] input)

(clojure.core/defn- deser-image-tag [input] input)

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-layer [input] (clojure.core/cond-> {} (clojure.core/contains? input "layerDigest") (clojure.core/assoc :layer-digest (deser-layer-digest (input "layerDigest"))) (clojure.core/contains? input "layerAvailability") (clojure.core/assoc :layer-availability (deser-layer-availability (input "layerAvailability"))) (clojure.core/contains? input "layerSize") (clojure.core/assoc :layer-size (deser-layer-size-in-bytes (input "layerSize"))) (clojure.core/contains? input "mediaType") (clojure.core/assoc :media-type (deser-media-type (input "mediaType")))))

(clojure.core/defn- deser-layer-size-in-bytes [input] input)

(clojure.core/defn- deser-image-identifier [input] (clojure.core/cond-> {} (clojure.core/contains? input "imageDigest") (clojure.core/assoc :image-digest (deser-image-digest (input "imageDigest"))) (clojure.core/contains? input "imageTag") (clojure.core/assoc :image-tag (deser-image-tag (input "imageTag")))))

(clojure.core/defn- deser-image-size-in-bytes [input] input)

(clojure.core/defn- deser-url [input] input)

(clojure.core/defn- deser-layer-failure-code [input] (clojure.core/get {"InvalidLayerDigest" :invalid-layer-digest, "MissingLayerDigest" :missing-layer-digest} input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-creation-timestamp [input] input)

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-lifecycle-policy-preview-summary [input] (clojure.core/cond-> {} (clojure.core/contains? input "expiringImageTotalCount") (clojure.core/assoc :expiring-image-total-count (deser-image-count (input "expiringImageTotalCount")))))

(clojure.core/defn- deser-expiration-timestamp [input] input)

(clojure.core/defn- deser-layer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-layer coll))) input))

(clojure.core/defn- deser-image-failure-reason [input] input)

(clojure.core/defn- deser-image-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "imageDigest") (clojure.core/assoc :image-digest (deser-image-digest (input "imageDigest"))) (clojure.core/contains? input "imageTags") (clojure.core/assoc :image-tags (deser-image-tag-list (input "imageTags"))) (clojure.core/contains? input "imageSizeInBytes") (clojure.core/assoc :image-size-in-bytes (deser-image-size-in-bytes (input "imageSizeInBytes"))) (clojure.core/contains? input "imagePushedAt") (clojure.core/assoc :image-pushed-at (deser-push-timestamp (input "imagePushedAt")))))

(clojure.core/defn- deser-registry-id [input] input)

(clojure.core/defn- deser-image-failure [input] (clojure.core/cond-> {} (clojure.core/contains? input "imageId") (clojure.core/assoc :image-id (deser-image-identifier (input "imageId"))) (clojure.core/contains? input "failureCode") (clojure.core/assoc :failure-code (deser-image-failure-code (input "failureCode"))) (clojure.core/contains? input "failureReason") (clojure.core/assoc :failure-reason (deser-image-failure-reason (input "failureReason")))))

(clojure.core/defn- deser-arn [input] input)

(clojure.core/defn- deser-layer-digest [input] input)

(clojure.core/defn- deser-upload-id [input] input)

(clojure.core/defn- deser-authorization-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "authorizationToken") (clojure.core/assoc :authorization-token (deser-base-64 (input "authorizationToken"))) (clojure.core/contains? input "expiresAt") (clojure.core/assoc :expires-at (deser-expiration-timestamp (input "expiresAt"))) (clojure.core/contains? input "proxyEndpoint") (clojure.core/assoc :proxy-endpoint (deser-proxy-endpoint (input "proxyEndpoint")))))

(clojure.core/defn- deser-image-manifest [input] input)

(clojure.core/defn- deser-lifecycle-policy-preview-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "imageTags") (clojure.core/assoc :image-tags (deser-image-tag-list (input "imageTags"))) (clojure.core/contains? input "imageDigest") (clojure.core/assoc :image-digest (deser-image-digest (input "imageDigest"))) (clojure.core/contains? input "imagePushedAt") (clojure.core/assoc :image-pushed-at (deser-push-timestamp (input "imagePushedAt"))) (clojure.core/contains? input "action") (clojure.core/assoc :action (deser-lifecycle-policy-rule-action (input "action"))) (clojure.core/contains? input "appliedRulePriority") (clojure.core/assoc :applied-rule-priority (deser-lifecycle-policy-rule-priority (input "appliedRulePriority")))))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value (input "Value")))))

(clojure.core/defn- deser-image-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image-detail coll))) input))

(clojure.core/defn- deser-layer-failure-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-layer-failure coll))) input))

(clojure.core/defn- deser-image-failure-code [input] (clojure.core/get {"InvalidImageDigest" :invalid-image-digest, "InvalidImageTag" :invalid-image-tag, "ImageTagDoesNotMatchDigest" :image-tag-does-not-match-digest, "ImageNotFound" :image-not-found, "MissingDigestAndTag" :missing-digest-and-tag} input))

(clojure.core/defn- deser-image [input] (clojure.core/cond-> {} (clojure.core/contains? input "registryId") (clojure.core/assoc :registry-id (deser-registry-id (input "registryId"))) (clojure.core/contains? input "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (input "repositoryName"))) (clojure.core/contains? input "imageId") (clojure.core/assoc :image-id (deser-image-identifier (input "imageId"))) (clojure.core/contains? input "imageManifest") (clojure.core/assoc :image-manifest (deser-image-manifest (input "imageManifest")))))

(clojure.core/defn- deser-image-identifier-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-image-identifier coll))) input))

(clojure.core/defn- deser-lifecycle-policy-text [input] input)

(clojure.core/defn- deser-push-timestamp [input] input)

(clojure.core/defn- response-get-download-url-for-layer-response ([input] (response-get-download-url-for-layer-response nil input)) ([resultWrapper1689673 input] (clojure.core/let [rawinput1689672 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689674 {"downloadUrl" (rawinput1689672 "downloadUrl"), "layerDigest" (rawinput1689672 "layerDigest")}] (clojure.core/cond-> {} (letvar1689674 "downloadUrl") (clojure.core/assoc :download-url (deser-url (clojure.core/get-in letvar1689674 ["downloadUrl"]))) (letvar1689674 "layerDigest") (clojure.core/assoc :layer-digest (deser-layer-digest (clojure.core/get-in letvar1689674 ["layerDigest"])))))))

(clojure.core/defn- response-repository-already-exists-exception ([input] (response-repository-already-exists-exception nil input)) ([resultWrapper1689676 input] (clojure.core/let [rawinput1689675 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689677 {"message" (rawinput1689675 "message")}] (clojure.core/cond-> {} (letvar1689677 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689677 ["message"])))))))

(clojure.core/defn- response-layer-already-exists-exception ([input] (response-layer-already-exists-exception nil input)) ([resultWrapper1689679 input] (clojure.core/let [rawinput1689678 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689680 {"message" (rawinput1689678 "message")}] (clojure.core/cond-> {} (letvar1689680 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689680 ["message"])))))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1689682 input] (clojure.core/let [rawinput1689681 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689683 {"tags" (rawinput1689681 "tags")}] (clojure.core/cond-> {} (letvar1689683 "tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1689683 ["tags"])))))))

(clojure.core/defn- response-set-repository-policy-response ([input] (response-set-repository-policy-response nil input)) ([resultWrapper1689685 input] (clojure.core/let [rawinput1689684 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689686 {"registryId" (rawinput1689684 "registryId"), "repositoryName" (rawinput1689684 "repositoryName"), "policyText" (rawinput1689684 "policyText")}] (clojure.core/cond-> {} (letvar1689686 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689686 ["registryId"]))) (letvar1689686 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689686 ["repositoryName"]))) (letvar1689686 "policyText") (clojure.core/assoc :policy-text (deser-repository-policy-text (clojure.core/get-in letvar1689686 ["policyText"])))))))

(clojure.core/defn- response-layer-inaccessible-exception ([input] (response-layer-inaccessible-exception nil input)) ([resultWrapper1689688 input] (clojure.core/let [rawinput1689687 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689689 {"message" (rawinput1689687 "message")}] (clojure.core/cond-> {} (letvar1689689 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689689 ["message"])))))))

(clojure.core/defn- response-put-image-response ([input] (response-put-image-response nil input)) ([resultWrapper1689691 input] (clojure.core/let [rawinput1689690 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689692 {"image" (rawinput1689690 "image")}] (clojure.core/cond-> {} (letvar1689692 "image") (clojure.core/assoc :image (deser-image (clojure.core/get-in letvar1689692 ["image"])))))))

(clojure.core/defn- response-batch-get-image-response ([input] (response-batch-get-image-response nil input)) ([resultWrapper1689694 input] (clojure.core/let [rawinput1689693 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689695 {"images" (rawinput1689693 "images"), "failures" (rawinput1689693 "failures")}] (clojure.core/cond-> {} (letvar1689695 "images") (clojure.core/assoc :images (deser-image-list (clojure.core/get-in letvar1689695 ["images"]))) (letvar1689695 "failures") (clojure.core/assoc :failures (deser-image-failure-list (clojure.core/get-in letvar1689695 ["failures"])))))))

(clojure.core/defn- response-list-images-response ([input] (response-list-images-response nil input)) ([resultWrapper1689697 input] (clojure.core/let [rawinput1689696 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689698 {"imageIds" (rawinput1689696 "imageIds"), "nextToken" (rawinput1689696 "nextToken")}] (clojure.core/cond-> {} (letvar1689698 "imageIds") (clojure.core/assoc :image-ids (deser-image-identifier-list (clojure.core/get-in letvar1689698 ["imageIds"]))) (letvar1689698 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1689698 ["nextToken"])))))))

(clojure.core/defn- response-repository-policy-not-found-exception ([input] (response-repository-policy-not-found-exception nil input)) ([resultWrapper1689700 input] (clojure.core/let [rawinput1689699 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689701 {"message" (rawinput1689699 "message")}] (clojure.core/cond-> {} (letvar1689701 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689701 ["message"])))))))

(clojure.core/defn- response-lifecycle-policy-preview-in-progress-exception ([input] (response-lifecycle-policy-preview-in-progress-exception nil input)) ([resultWrapper1689703 input] (clojure.core/let [rawinput1689702 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689704 {"message" (rawinput1689702 "message")}] (clojure.core/cond-> {} (letvar1689704 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689704 ["message"])))))))

(clojure.core/defn- response-delete-repository-response ([input] (response-delete-repository-response nil input)) ([resultWrapper1689706 input] (clojure.core/let [rawinput1689705 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689707 {"repository" (rawinput1689705 "repository")}] (clojure.core/cond-> {} (letvar1689707 "repository") (clojure.core/assoc :repository (deser-repository (clojure.core/get-in letvar1689707 ["repository"])))))))

(clojure.core/defn- response-delete-lifecycle-policy-response ([input] (response-delete-lifecycle-policy-response nil input)) ([resultWrapper1689709 input] (clojure.core/let [rawinput1689708 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689710 {"registryId" (rawinput1689708 "registryId"), "repositoryName" (rawinput1689708 "repositoryName"), "lifecyclePolicyText" (rawinput1689708 "lifecyclePolicyText"), "lastEvaluatedAt" (rawinput1689708 "lastEvaluatedAt")}] (clojure.core/cond-> {} (letvar1689710 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689710 ["registryId"]))) (letvar1689710 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689710 ["repositoryName"]))) (letvar1689710 "lifecyclePolicyText") (clojure.core/assoc :lifecycle-policy-text (deser-lifecycle-policy-text (clojure.core/get-in letvar1689710 ["lifecyclePolicyText"]))) (letvar1689710 "lastEvaluatedAt") (clojure.core/assoc :last-evaluated-at (deser-evaluation-timestamp (clojure.core/get-in letvar1689710 ["lastEvaluatedAt"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1689712 input] (clojure.core/let [rawinput1689711 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689713 {"message" (rawinput1689711 "message")}] (clojure.core/cond-> {} (letvar1689713 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689713 ["message"])))))))

(clojure.core/defn- response-create-repository-response ([input] (response-create-repository-response nil input)) ([resultWrapper1689715 input] (clojure.core/let [rawinput1689714 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689716 {"repository" (rawinput1689714 "repository")}] (clojure.core/cond-> {} (letvar1689716 "repository") (clojure.core/assoc :repository (deser-repository (clojure.core/get-in letvar1689716 ["repository"])))))))

(clojure.core/defn- response-describe-images-response ([input] (response-describe-images-response nil input)) ([resultWrapper1689718 input] (clojure.core/let [rawinput1689717 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689719 {"imageDetails" (rawinput1689717 "imageDetails"), "nextToken" (rawinput1689717 "nextToken")}] (clojure.core/cond-> {} (letvar1689719 "imageDetails") (clojure.core/assoc :image-details (deser-image-detail-list (clojure.core/get-in letvar1689719 ["imageDetails"]))) (letvar1689719 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1689719 ["nextToken"])))))))

(clojure.core/defn- response-get-authorization-token-response ([input] (response-get-authorization-token-response nil input)) ([resultWrapper1689721 input] (clojure.core/let [rawinput1689720 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689722 {"authorizationData" (rawinput1689720 "authorizationData")}] (clojure.core/cond-> {} (letvar1689722 "authorizationData") (clojure.core/assoc :authorization-data (deser-authorization-data-list (clojure.core/get-in letvar1689722 ["authorizationData"])))))))

(clojure.core/defn- response-invalid-tag-parameter-exception ([input] (response-invalid-tag-parameter-exception nil input)) ([resultWrapper1689724 input] (clojure.core/let [rawinput1689723 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689725 {"message" (rawinput1689723 "message")}] (clojure.core/cond-> {} (letvar1689725 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689725 ["message"])))))))

(clojure.core/defn- response-initiate-layer-upload-response ([input] (response-initiate-layer-upload-response nil input)) ([resultWrapper1689727 input] (clojure.core/let [rawinput1689726 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689728 {"uploadId" (rawinput1689726 "uploadId"), "partSize" (rawinput1689726 "partSize")}] (clojure.core/cond-> {} (letvar1689728 "uploadId") (clojure.core/assoc :upload-id (deser-upload-id (clojure.core/get-in letvar1689728 ["uploadId"]))) (letvar1689728 "partSize") (clojure.core/assoc :part-size (deser-part-size (clojure.core/get-in letvar1689728 ["partSize"])))))))

(clojure.core/defn- response-tag-resource-response ([input] (response-tag-resource-response nil input)) ([resultWrapper1689730 input] (clojure.core/let [rawinput1689729 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689731 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-layers-not-found-exception ([input] (response-layers-not-found-exception nil input)) ([resultWrapper1689733 input] (clojure.core/let [rawinput1689732 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689734 {"message" (rawinput1689732 "message")}] (clojure.core/cond-> {} (letvar1689734 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689734 ["message"])))))))

(clojure.core/defn- response-delete-repository-policy-response ([input] (response-delete-repository-policy-response nil input)) ([resultWrapper1689736 input] (clojure.core/let [rawinput1689735 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689737 {"registryId" (rawinput1689735 "registryId"), "repositoryName" (rawinput1689735 "repositoryName"), "policyText" (rawinput1689735 "policyText")}] (clojure.core/cond-> {} (letvar1689737 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689737 ["registryId"]))) (letvar1689737 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689737 ["repositoryName"]))) (letvar1689737 "policyText") (clojure.core/assoc :policy-text (deser-repository-policy-text (clojure.core/get-in letvar1689737 ["policyText"])))))))

(clojure.core/defn- response-get-repository-policy-response ([input] (response-get-repository-policy-response nil input)) ([resultWrapper1689739 input] (clojure.core/let [rawinput1689738 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689740 {"registryId" (rawinput1689738 "registryId"), "repositoryName" (rawinput1689738 "repositoryName"), "policyText" (rawinput1689738 "policyText")}] (clojure.core/cond-> {} (letvar1689740 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689740 ["registryId"]))) (letvar1689740 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689740 ["repositoryName"]))) (letvar1689740 "policyText") (clojure.core/assoc :policy-text (deser-repository-policy-text (clojure.core/get-in letvar1689740 ["policyText"])))))))

(clojure.core/defn- response-put-lifecycle-policy-response ([input] (response-put-lifecycle-policy-response nil input)) ([resultWrapper1689742 input] (clojure.core/let [rawinput1689741 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689743 {"registryId" (rawinput1689741 "registryId"), "repositoryName" (rawinput1689741 "repositoryName"), "lifecyclePolicyText" (rawinput1689741 "lifecyclePolicyText")}] (clojure.core/cond-> {} (letvar1689743 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689743 ["registryId"]))) (letvar1689743 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689743 ["repositoryName"]))) (letvar1689743 "lifecyclePolicyText") (clojure.core/assoc :lifecycle-policy-text (deser-lifecycle-policy-text (clojure.core/get-in letvar1689743 ["lifecyclePolicyText"])))))))

(clojure.core/defn- response-layer-part-too-small-exception ([input] (response-layer-part-too-small-exception nil input)) ([resultWrapper1689745 input] (clojure.core/let [rawinput1689744 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689746 {"message" (rawinput1689744 "message")}] (clojure.core/cond-> {} (letvar1689746 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689746 ["message"])))))))

(clojure.core/defn- response-start-lifecycle-policy-preview-response ([input] (response-start-lifecycle-policy-preview-response nil input)) ([resultWrapper1689748 input] (clojure.core/let [rawinput1689747 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689749 {"registryId" (rawinput1689747 "registryId"), "repositoryName" (rawinput1689747 "repositoryName"), "lifecyclePolicyText" (rawinput1689747 "lifecyclePolicyText"), "status" (rawinput1689747 "status")}] (clojure.core/cond-> {} (letvar1689749 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689749 ["registryId"]))) (letvar1689749 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689749 ["repositoryName"]))) (letvar1689749 "lifecyclePolicyText") (clojure.core/assoc :lifecycle-policy-text (deser-lifecycle-policy-text (clojure.core/get-in letvar1689749 ["lifecyclePolicyText"]))) (letvar1689749 "status") (clojure.core/assoc :status (deser-lifecycle-policy-preview-status (clojure.core/get-in letvar1689749 ["status"])))))))

(clojure.core/defn- response-complete-layer-upload-response ([input] (response-complete-layer-upload-response nil input)) ([resultWrapper1689751 input] (clojure.core/let [rawinput1689750 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689752 {"registryId" (rawinput1689750 "registryId"), "repositoryName" (rawinput1689750 "repositoryName"), "uploadId" (rawinput1689750 "uploadId"), "layerDigest" (rawinput1689750 "layerDigest")}] (clojure.core/cond-> {} (letvar1689752 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689752 ["registryId"]))) (letvar1689752 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689752 ["repositoryName"]))) (letvar1689752 "uploadId") (clojure.core/assoc :upload-id (deser-upload-id (clojure.core/get-in letvar1689752 ["uploadId"]))) (letvar1689752 "layerDigest") (clojure.core/assoc :layer-digest (deser-layer-digest (clojure.core/get-in letvar1689752 ["layerDigest"])))))))

(clojure.core/defn- response-too-many-tags-exception ([input] (response-too-many-tags-exception nil input)) ([resultWrapper1689754 input] (clojure.core/let [rawinput1689753 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689755 {"message" (rawinput1689753 "message")}] (clojure.core/cond-> {} (letvar1689755 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689755 ["message"])))))))

(clojure.core/defn- response-invalid-layer-exception ([input] (response-invalid-layer-exception nil input)) ([resultWrapper1689757 input] (clojure.core/let [rawinput1689756 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689758 {"message" (rawinput1689756 "message")}] (clojure.core/cond-> {} (letvar1689758 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689758 ["message"])))))))

(clojure.core/defn- response-repository-not-empty-exception ([input] (response-repository-not-empty-exception nil input)) ([resultWrapper1689760 input] (clojure.core/let [rawinput1689759 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689761 {"message" (rawinput1689759 "message")}] (clojure.core/cond-> {} (letvar1689761 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689761 ["message"])))))))

(clojure.core/defn- response-server-exception ([input] (response-server-exception nil input)) ([resultWrapper1689763 input] (clojure.core/let [rawinput1689762 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689764 {"message" (rawinput1689762 "message")}] (clojure.core/cond-> {} (letvar1689764 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689764 ["message"])))))))

(clojure.core/defn- response-batch-check-layer-availability-response ([input] (response-batch-check-layer-availability-response nil input)) ([resultWrapper1689766 input] (clojure.core/let [rawinput1689765 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689767 {"layers" (rawinput1689765 "layers"), "failures" (rawinput1689765 "failures")}] (clojure.core/cond-> {} (letvar1689767 "layers") (clojure.core/assoc :layers (deser-layer-list (clojure.core/get-in letvar1689767 ["layers"]))) (letvar1689767 "failures") (clojure.core/assoc :failures (deser-layer-failure-list (clojure.core/get-in letvar1689767 ["failures"])))))))

(clojure.core/defn- response-get-lifecycle-policy-response ([input] (response-get-lifecycle-policy-response nil input)) ([resultWrapper1689769 input] (clojure.core/let [rawinput1689768 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689770 {"registryId" (rawinput1689768 "registryId"), "repositoryName" (rawinput1689768 "repositoryName"), "lifecyclePolicyText" (rawinput1689768 "lifecyclePolicyText"), "lastEvaluatedAt" (rawinput1689768 "lastEvaluatedAt")}] (clojure.core/cond-> {} (letvar1689770 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689770 ["registryId"]))) (letvar1689770 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689770 ["repositoryName"]))) (letvar1689770 "lifecyclePolicyText") (clojure.core/assoc :lifecycle-policy-text (deser-lifecycle-policy-text (clojure.core/get-in letvar1689770 ["lifecyclePolicyText"]))) (letvar1689770 "lastEvaluatedAt") (clojure.core/assoc :last-evaluated-at (deser-evaluation-timestamp (clojure.core/get-in letvar1689770 ["lastEvaluatedAt"])))))))

(clojure.core/defn- response-invalid-layer-part-exception ([input] (response-invalid-layer-part-exception nil input)) ([resultWrapper1689772 input] (clojure.core/let [rawinput1689771 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689773 {"registryId" (rawinput1689771 "registryId"), "repositoryName" (rawinput1689771 "repositoryName"), "uploadId" (rawinput1689771 "uploadId"), "lastValidByteReceived" (rawinput1689771 "lastValidByteReceived"), "message" (rawinput1689771 "message")}] (clojure.core/cond-> {} (letvar1689773 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689773 ["registryId"]))) (letvar1689773 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689773 ["repositoryName"]))) (letvar1689773 "uploadId") (clojure.core/assoc :upload-id (deser-upload-id (clojure.core/get-in letvar1689773 ["uploadId"]))) (letvar1689773 "lastValidByteReceived") (clojure.core/assoc :last-valid-byte-received (deser-part-size (clojure.core/get-in letvar1689773 ["lastValidByteReceived"]))) (letvar1689773 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689773 ["message"])))))))

(clojure.core/defn- response-image-already-exists-exception ([input] (response-image-already-exists-exception nil input)) ([resultWrapper1689775 input] (clojure.core/let [rawinput1689774 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689776 {"message" (rawinput1689774 "message")}] (clojure.core/cond-> {} (letvar1689776 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689776 ["message"])))))))

(clojure.core/defn- response-batch-delete-image-response ([input] (response-batch-delete-image-response nil input)) ([resultWrapper1689778 input] (clojure.core/let [rawinput1689777 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689779 {"imageIds" (rawinput1689777 "imageIds"), "failures" (rawinput1689777 "failures")}] (clojure.core/cond-> {} (letvar1689779 "imageIds") (clojure.core/assoc :image-ids (deser-image-identifier-list (clojure.core/get-in letvar1689779 ["imageIds"]))) (letvar1689779 "failures") (clojure.core/assoc :failures (deser-image-failure-list (clojure.core/get-in letvar1689779 ["failures"])))))))

(clojure.core/defn- response-describe-repositories-response ([input] (response-describe-repositories-response nil input)) ([resultWrapper1689781 input] (clojure.core/let [rawinput1689780 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689782 {"repositories" (rawinput1689780 "repositories"), "nextToken" (rawinput1689780 "nextToken")}] (clojure.core/cond-> {} (letvar1689782 "repositories") (clojure.core/assoc :repositories (deser-repository-list (clojure.core/get-in letvar1689782 ["repositories"]))) (letvar1689782 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1689782 ["nextToken"])))))))

(clojure.core/defn- response-repository-not-found-exception ([input] (response-repository-not-found-exception nil input)) ([resultWrapper1689784 input] (clojure.core/let [rawinput1689783 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689785 {"message" (rawinput1689783 "message")}] (clojure.core/cond-> {} (letvar1689785 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689785 ["message"])))))))

(clojure.core/defn- response-upload-not-found-exception ([input] (response-upload-not-found-exception nil input)) ([resultWrapper1689787 input] (clojure.core/let [rawinput1689786 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689788 {"message" (rawinput1689786 "message")}] (clojure.core/cond-> {} (letvar1689788 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689788 ["message"])))))))

(clojure.core/defn- response-get-lifecycle-policy-preview-response ([input] (response-get-lifecycle-policy-preview-response nil input)) ([resultWrapper1689790 input] (clojure.core/let [rawinput1689789 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689791 {"registryId" (rawinput1689789 "registryId"), "repositoryName" (rawinput1689789 "repositoryName"), "lifecyclePolicyText" (rawinput1689789 "lifecyclePolicyText"), "status" (rawinput1689789 "status"), "nextToken" (rawinput1689789 "nextToken"), "previewResults" (rawinput1689789 "previewResults"), "summary" (rawinput1689789 "summary")}] (clojure.core/cond-> {} (letvar1689791 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689791 ["registryId"]))) (letvar1689791 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689791 ["repositoryName"]))) (letvar1689791 "lifecyclePolicyText") (clojure.core/assoc :lifecycle-policy-text (deser-lifecycle-policy-text (clojure.core/get-in letvar1689791 ["lifecyclePolicyText"]))) (letvar1689791 "status") (clojure.core/assoc :status (deser-lifecycle-policy-preview-status (clojure.core/get-in letvar1689791 ["status"]))) (letvar1689791 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1689791 ["nextToken"]))) (letvar1689791 "previewResults") (clojure.core/assoc :preview-results (deser-lifecycle-policy-preview-result-list (clojure.core/get-in letvar1689791 ["previewResults"]))) (letvar1689791 "summary") (clojure.core/assoc :summary (deser-lifecycle-policy-preview-summary (clojure.core/get-in letvar1689791 ["summary"])))))))

(clojure.core/defn- response-lifecycle-policy-preview-not-found-exception ([input] (response-lifecycle-policy-preview-not-found-exception nil input)) ([resultWrapper1689793 input] (clojure.core/let [rawinput1689792 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689794 {"message" (rawinput1689792 "message")}] (clojure.core/cond-> {} (letvar1689794 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689794 ["message"])))))))

(clojure.core/defn- response-image-not-found-exception ([input] (response-image-not-found-exception nil input)) ([resultWrapper1689796 input] (clojure.core/let [rawinput1689795 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689797 {"message" (rawinput1689795 "message")}] (clojure.core/cond-> {} (letvar1689797 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689797 ["message"])))))))

(clojure.core/defn- response-lifecycle-policy-not-found-exception ([input] (response-lifecycle-policy-not-found-exception nil input)) ([resultWrapper1689799 input] (clojure.core/let [rawinput1689798 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689800 {"message" (rawinput1689798 "message")}] (clojure.core/cond-> {} (letvar1689800 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689800 ["message"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1689802 input] (clojure.core/let [rawinput1689801 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689803 {"message" (rawinput1689801 "message")}] (clojure.core/cond-> {} (letvar1689803 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689803 ["message"])))))))

(clojure.core/defn- response-upload-layer-part-response ([input] (response-upload-layer-part-response nil input)) ([resultWrapper1689805 input] (clojure.core/let [rawinput1689804 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689806 {"registryId" (rawinput1689804 "registryId"), "repositoryName" (rawinput1689804 "repositoryName"), "uploadId" (rawinput1689804 "uploadId"), "lastByteReceived" (rawinput1689804 "lastByteReceived")}] (clojure.core/cond-> {} (letvar1689806 "registryId") (clojure.core/assoc :registry-id (deser-registry-id (clojure.core/get-in letvar1689806 ["registryId"]))) (letvar1689806 "repositoryName") (clojure.core/assoc :repository-name (deser-repository-name (clojure.core/get-in letvar1689806 ["repositoryName"]))) (letvar1689806 "uploadId") (clojure.core/assoc :upload-id (deser-upload-id (clojure.core/get-in letvar1689806 ["uploadId"]))) (letvar1689806 "lastByteReceived") (clojure.core/assoc :last-byte-received (deser-part-size (clojure.core/get-in letvar1689806 ["lastByteReceived"])))))))

(clojure.core/defn- response-untag-resource-response ([input] (response-untag-resource-response nil input)) ([resultWrapper1689808 input] (clojure.core/let [rawinput1689807 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689809 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-empty-upload-exception ([input] (response-empty-upload-exception nil input)) ([resultWrapper1689811 input] (clojure.core/let [rawinput1689810 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1689812 {"message" (rawinput1689810 "message")}] (clojure.core/cond-> {} (letvar1689812 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1689812 ["message"])))))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-failure-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/image-failure))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/media-type-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/media-type :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/proxy-endpoint (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-download-url-for-layer-response/download-url (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/url))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-download-url-for-layer-response/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-download-url-for-layer-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.get-download-url-for-layer-response/download-url :portkey.aws.ecr.-2015-09-21.get-download-url-for-layer-response/layer-digest]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-authorization-token-request/registry-ids (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-authorization-token-registry-id-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-authorization-token-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.get-authorization-token-request/registry-ids]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.repository-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.repository-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-images-filter/tag-status (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/tag-status))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/describe-images-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.describe-images-filter/tag-status]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-image-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-image-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-image-request/image-manifest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-manifest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-image-request/image-tag (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-tag))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/put-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.put-image-request/repository-name :portkey.aws.ecr.-2015-09-21.put-image-request/image-manifest] :opt-un [:portkey.aws.ecr.-2015-09-21.put-image-request/registry-id :portkey.aws.ecr.-2015-09-21.put-image-request/image-tag]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-download-url-for-layer-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-download-url-for-layer-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-download-url-for-layer-request/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-download-url-for-layer-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.get-download-url-for-layer-request/repository-name :portkey.aws.ecr.-2015-09-21.get-download-url-for-layer-request/layer-digest] :opt-un [:portkey.aws.ecr.-2015-09-21.get-download-url-for-layer-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.layer-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-status #{"IN_PROGRESS" :in-progress "EXPIRED" "COMPLETE" "FAILED" :expired :complete :failed})

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-count (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-tags-for-resource-response/tags (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/tag-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.list-tags-for-resource-response/tags]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/repository))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.set-repository-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.set-repository-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.set-repository-policy-response/policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/set-repository-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.set-repository-policy-response/registry-id :portkey.aws.ecr.-2015-09-21.set-repository-policy-response/repository-name :portkey.aws.ecr.-2015-09-21.set-repository-policy-response/policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/media-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-digest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-failure-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer-inaccessible-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-inaccessible-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.layer-inaccessible-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-rule-action/type (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-action-type))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-rule-action (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.lifecycle-policy-rule-action/type]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-image-response/image (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/put-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.put-image-response/image]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-part-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 2 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-get-image-response/images (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-get-image-response/failures (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-failure-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batch-get-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.batch-get-image-response/images :portkey.aws.ecr.-2015-09-21.batch-get-image-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/arn))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-images-response/image-ids (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-images-response/next-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/list-images-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.list-images-response/image-ids :portkey.aws.ecr.-2015-09-21.list-images-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/evaluation-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-tag-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/image-tag))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-action-type #{"EXPIRE" :expire})

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batched-operation-layer-digest (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.repository-policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.repository-policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/tag-status #{:untagged "TAGGED" "UNTAGGED" "ANY" :tagged :any})

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-in-progress-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-in-progress-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-in-progress-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-rule-priority (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.repository/repository-arn (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/arn))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.repository/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.repository/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.repository/repository-uri (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/url))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.repository/created-at (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/creation-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.repository/repository-arn :portkey.aws.ecr.-2015-09-21.repository/registry-id :portkey.aws.ecr.-2015-09-21.repository/repository-name :portkey.aws.ecr.-2015-09-21.repository/repository-uri :portkey.aws.ecr.-2015-09-21.repository/created-at]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.complete-layer-upload-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.complete-layer-upload-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.complete-layer-upload-request/upload-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.complete-layer-upload-request/layer-digests (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-digest-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/complete-layer-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.complete-layer-upload-request/repository-name :portkey.aws.ecr.-2015-09-21.complete-layer-upload-request/upload-id :portkey.aws.ecr.-2015-09-21.complete-layer-upload-request/layer-digests] :opt-un [:portkey.aws.ecr.-2015-09-21.complete-layer-upload-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-check-layer-availability-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-check-layer-availability-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-check-layer-availability-request/layer-digests (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/batched-operation-layer-digest-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batch-check-layer-availability-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.batch-check-layer-availability-request/repository-name :portkey.aws.ecr.-2015-09-21.batch-check-layer-availability-request/layer-digests] :opt-un [:portkey.aws.ecr.-2015-09-21.batch-check-layer-availability-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-repository-response/repository (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/delete-repository-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.delete-repository-response/repository]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer-failure/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/batched-operation-layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer-failure/failure-code (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-failure-code))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer-failure/failure-reason (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-failure-reason))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.layer-failure/layer-digest :portkey.aws.ecr.-2015-09-21.layer-failure/failure-code :portkey.aws.ecr.-2015-09-21.layer-failure/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-images-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-images-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-images-request/next-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-images-request/max-results (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/max-results))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-images-request/filter (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/list-images-filter))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/list-images-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.list-images-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.list-images-request/registry-id :portkey.aws.ecr.-2015-09-21.list-images-request/next-token :portkey.aws.ecr.-2015-09-21.list-images-request/max-results :portkey.aws.ecr.-2015-09-21.list-images-request/filter]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-policy-text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/last-evaluated-at (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/evaluation-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/registry-id :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/repository-name :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/lifecycle-policy-text :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/last-evaluated-at]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/authorization-data-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/authorization-data))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/base-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\S+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.create-repository-response/repository (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/create-repository-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.create-repository-response/repository]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-images-response/image-details (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-detail-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-images-response/next-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/describe-images-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.describe-images-response/image-details :portkey.aws.ecr.-2015-09-21.describe-images-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-authorization-token-response/authorization-data (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/authorization-data-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-authorization-token-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.get-authorization-token-response/authorization-data]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-filter/tag-status (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/tag-status))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-filter/tag-status]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.invalid-tag-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/invalid-tag-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.invalid-tag-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.initiate-layer-upload-response/upload-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.initiate-layer-upload-response/part-size (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.initiate-layer-upload-response/upload-id :portkey.aws.ecr.-2015-09-21.initiate-layer-upload-response/part-size]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/tag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-availability #{:unavailable "AVAILABLE" "UNAVAILABLE" :available})

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/image))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-preview-max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layers-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layers-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.layers-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-repository-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-repository-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-repository-policy-response/policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/delete-repository-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.delete-repository-policy-response/registry-id :portkey.aws.ecr.-2015-09-21.delete-repository-policy-response/repository-name :portkey.aws.ecr.-2015-09-21.delete-repository-policy-response/policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-result-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-result))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batched-operation-layer-digest-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/batched-operation-layer-digest :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/part-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/force-flag clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.tag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/arn))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/tag-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.tag-resource-request/resource-arn :portkey.aws.ecr.-2015-09-21.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-repository-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-repository-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-repository-policy-response/policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-repository-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.get-repository-policy-response/registry-id :portkey.aws.ecr.-2015-09-21.get-repository-policy-response/repository-name :portkey.aws.ecr.-2015-09-21.get-repository-policy-response/policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-tag (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/tag-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/tag))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer/layer-availability (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-availability))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer/layer-size (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-size-in-bytes))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer/media-type (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/media-type))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.layer/layer-digest :portkey.aws.ecr.-2015-09-21.layer/layer-availability :portkey.aws.ecr.-2015-09-21.layer/layer-size :portkey.aws.ecr.-2015-09-21.layer/media-type]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-size-in-bytes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/tag-key))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-request/upload-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-request/part-first-byte (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-request/part-last-byte (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-request/layer-part-blob (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-part-blob))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/upload-layer-part-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.upload-layer-part-request/repository-name :portkey.aws.ecr.-2015-09-21.upload-layer-part-request/upload-id :portkey.aws.ecr.-2015-09-21.upload-layer-part-request/part-first-byte :portkey.aws.ecr.-2015-09-21.upload-layer-part-request/part-last-byte :portkey.aws.ecr.-2015-09-21.upload-layer-part-request/layer-part-blob] :opt-un [:portkey.aws.ecr.-2015-09-21.upload-layer-part-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/put-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-response/registry-id :portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-response/repository-name :portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-response/lifecycle-policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-identifier/image-digest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-identifier/image-tag (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-tag))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-identifier (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.image-identifier/image-digest :portkey.aws.ecr.-2015-09-21.image-identifier/image-tag]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-size-in-bytes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/image-ids (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/next-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/max-results (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-preview-max-results))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/filter (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-filter))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/registry-id :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/image-ids :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/next-token :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/max-results :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/filter]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-failure-code #{"MissingLayerDigest" "InvalidLayerDigest" :invalid-layer-digest :missing-layer-digest})

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/creation-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/exception-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-repositories-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-repositories-request/repository-names (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-repositories-request/next-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-repositories-request/max-results (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/max-results))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/describe-repositories-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.describe-repositories-request/registry-id :portkey.aws.ecr.-2015-09-21.describe-repositories-request/repository-names :portkey.aws.ecr.-2015-09-21.describe-repositories-request/next-token :portkey.aws.ecr.-2015-09-21.describe-repositories-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer-part-too-small-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-part-too-small-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.layer-part-too-small-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-request/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/put-lifecycle-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-request/repository-name :portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-request/lifecycle-policy-text] :opt-un [:portkey.aws.ecr.-2015-09-21.put-lifecycle-policy-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-response/status (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-status))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/start-lifecycle-policy-preview-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-response/registry-id :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-response/repository-name :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-response/lifecycle-policy-text :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-response/status]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-summary/expiring-image-total-count (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-count))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-summary (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-summary/expiring-image-total-count]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.complete-layer-upload-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.complete-layer-upload-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.complete-layer-upload-response/upload-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.complete-layer-upload-response/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/complete-layer-upload-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.complete-layer-upload-response/registry-id :portkey.aws.ecr.-2015-09-21.complete-layer-upload-response/repository-name :portkey.aws.ecr.-2015-09-21.complete-layer-upload-response/upload-id :portkey.aws.ecr.-2015-09-21.complete-layer-upload-response/layer-digest]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.too-many-tags-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/too-many-tags-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.too-many-tags-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-delete-image-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-delete-image-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-delete-image-request/image-ids (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batch-delete-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.batch-delete-image-request/repository-name :portkey.aws.ecr.-2015-09-21.batch-delete-image-request/image-ids] :opt-un [:portkey.aws.ecr.-2015-09-21.batch-delete-image-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/expiration-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.invalid-layer-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/invalid-layer-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.invalid-layer-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-request/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/start-lifecycle-policy-preview-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-request/registry-id :portkey.aws.ecr.-2015-09-21.start-lifecycle-policy-preview-request/lifecycle-policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-images-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-images-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-images-request/image-ids (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-images-request/next-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-images-request/max-results (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/max-results))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-images-request/filter (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/describe-images-filter))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/describe-images-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.describe-images-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.describe-images-request/registry-id :portkey.aws.ecr.-2015-09-21.describe-images-request/image-ids :portkey.aws.ecr.-2015-09-21.describe-images-request/next-token :portkey.aws.ecr.-2015-09-21.describe-images-request/max-results :portkey.aws.ecr.-2015-09-21.describe-images-request/filter]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/layer))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.repository-not-empty-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-not-empty-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.repository-not-empty-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-get-image-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-get-image-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-get-image-request/image-ids (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-get-image-request/accepted-media-types (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/media-type-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batch-get-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.batch-get-image-request/repository-name :portkey.aws.ecr.-2015-09-21.batch-get-image-request/image-ids] :opt-un [:portkey.aws.ecr.-2015-09-21.batch-get-image-request/registry-id :portkey.aws.ecr.-2015-09-21.batch-get-image-request/accepted-media-types]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-failure-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.server-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/server-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.server-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-authorization-token-registry-id-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/registry-id :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-check-layer-availability-response/layers (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-check-layer-availability-response/failures (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-failure-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batch-check-layer-availability-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.batch-check-layer-availability-response/layers :portkey.aws.ecr.-2015-09-21.batch-check-layer-availability-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-detail/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-detail/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-detail/image-digest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-detail/image-tags (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-tag-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-detail/image-size-in-bytes (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-size-in-bytes))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-detail/image-pushed-at (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/push-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.image-detail/registry-id :portkey.aws.ecr.-2015-09-21.image-detail/repository-name :portkey.aws.ecr.-2015-09-21.image-detail/image-digest :portkey.aws.ecr.-2015-09-21.image-detail/image-tags :portkey.aws.ecr.-2015-09-21.image-detail/image-size-in-bytes :portkey.aws.ecr.-2015-09-21.image-detail/image-pushed-at]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-repository-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-repository-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-repository-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.get-repository-policy-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.get-repository-policy-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-digest-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/layer-digest :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-response/last-evaluated-at (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/evaluation-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-response/registry-id :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-response/repository-name :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-response/lifecycle-policy-text :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-response/last-evaluated-at]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/registry-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[0-9]{12}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-failure/image-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-identifier))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-failure/failure-code (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-failure-code))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-failure/failure-reason (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-failure-reason))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.image-failure/image-id :portkey.aws.ecr.-2015-09-21.image-failure/failure-code :portkey.aws.ecr.-2015-09-21.image-failure/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.invalid-layer-part-exception/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.invalid-layer-part-exception/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.invalid-layer-part-exception/upload-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.invalid-layer-part-exception/last-valid-byte-received (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.invalid-layer-part-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/invalid-layer-part-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.invalid-layer-part-exception/registry-id :portkey.aws.ecr.-2015-09-21.invalid-layer-part-exception/repository-name :portkey.aws.ecr.-2015-09-21.invalid-layer-part-exception/upload-id :portkey.aws.ecr.-2015-09-21.invalid-layer-part-exception/last-valid-byte-received :portkey.aws.ecr.-2015-09-21.invalid-layer-part-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-repository-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-repository-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/delete-repository-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.delete-repository-policy-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.delete-repository-policy-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-digest (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.create-repository-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.create-repository-request/tags (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/tag-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/create-repository-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.create-repository-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.create-repository-request/tags]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.image-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-delete-image-response/image-ids (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-delete-image-response/failures (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-failure-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batch-delete-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.batch-delete-image-response/image-ids :portkey.aws.ecr.-2015-09-21.batch-delete-image-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-repositories-response/repositories (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-repositories-response/next-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/describe-repositories-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.describe-repositories-response/repositories :portkey.aws.ecr.-2015-09-21.describe-repositories-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/upload-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.repository-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.repository-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.authorization-data/authorization-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/base-64))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.authorization-data/expires-at (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/expiration-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.authorization-data/proxy-endpoint (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/proxy-endpoint))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/authorization-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.authorization-data/authorization-token :portkey.aws.ecr.-2015-09-21.authorization-data/expires-at :portkey.aws.ecr.-2015-09-21.authorization-data/proxy-endpoint]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/upload-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.upload-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-manifest (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-result/image-tags (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-tag-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-result/image-digest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-result/image-pushed-at (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/push-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-result/action (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-rule-action))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-result/applied-rule-priority (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-rule-priority))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-result/image-tags :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-result/image-digest :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-result/image-pushed-at :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-result/action :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-result/applied-rule-priority]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/status (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-status))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/next-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/preview-results (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-result-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/summary (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-summary))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/registry-id :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/repository-name :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/lifecycle-policy-text :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/status :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/next-token :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/preview-results :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-response/summary]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/max-results (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.tag/key (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/tag-key))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.tag/value (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/tag-value))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.tag/key :portkey.aws.ecr.-2015-09-21.tag/value]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.initiate-layer-upload-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.initiate-layer-upload-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.initiate-layer-upload-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.initiate-layer-upload-request/registry-id]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-images-filter/tag-status (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/tag-status))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/list-images-filter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.list-images-filter/tag-status]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-detail-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/image-detail))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-failure-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/layer-failure))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.set-repository-policy-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.set-repository-policy-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.set-repository-policy-request/policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.set-repository-policy-request/force (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/force-flag))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/set-repository-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.set-repository-policy-request/repository-name :portkey.aws.ecr.-2015-09-21.set-repository-policy-request/policy-text] :opt-un [:portkey.aws.ecr.-2015-09-21.set-repository-policy-request/registry-id :portkey.aws.ecr.-2015-09-21.set-repository-policy-request/force]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.lifecycle-policy-preview-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-failure-code #{"ImageNotFound" "InvalidImageDigest" :invalid-image-digest :image-not-found "InvalidImageTag" "ImageTagDoesNotMatchDigest" "MissingDigestAndTag" :image-tag-does-not-match-digest :invalid-image-tag :missing-digest-and-tag})

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-repository-request/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-repository-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-repository-request/force (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/force-flag))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/delete-repository-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.delete-repository-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.delete-repository-request/registry-id :portkey.aws.ecr.-2015-09-21.delete-repository-request/force]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image/image-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-identifier))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image/image-manifest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-manifest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.image/registry-id :portkey.aws.ecr.-2015-09-21.image/repository-name :portkey.aws.ecr.-2015-09-21.image/image-id :portkey.aws.ecr.-2015-09-21.image/image-manifest]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-identifier-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/image-identifier :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.image-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.lifecycle-policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.lifecycle-policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 100 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 30720))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/upload-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/last-byte-received (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/upload-layer-part-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.upload-layer-part-response/registry-id :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/repository-name :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/upload-id :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/last-byte-received]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/untag-resource-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.untag-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/arn))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.untag-resource-request/resource-arn :portkey.aws.ecr.-2015-09-21.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/push-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.empty-upload-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/empty-upload-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.empty-upload-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-name-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/repository-name :min-count 1 :max-count 100))

(clojure.core/defn tag-resource "Adds specified tags to a resource with the specified ARN. Existing tags on a\nresource are not changed if they are not specified in the request parameters." ([tag-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/tag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn response-tag-resource-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "InvalidTagParameterException" :portkey.aws.ecr.-2015-09-21/invalid-tag-parameter-exception, "TooManyTagsException" :portkey.aws.ecr.-2015-09-21/too-many-tags-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "ServerException" :portkey.aws.ecr.-2015-09-21/server-exception}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/tag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/tag-resource-response))

(clojure.core/defn complete-layer-upload "Informs Amazon ECR that the image layer upload has completed for a specified\nregistry, repository name, and upload ID. You can optionally provide a sha256\ndigest of the image layer for data validation purposes.\n This operation is used by the Amazon ECR proxy, and it is not intended for\ngeneral use by customers for pulling and pushing images. In most cases, you\nshould use the docker CLI to pull, tag, and push images." ([complete-layer-upload-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-complete-layer-upload-request complete-layer-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/complete-layer-upload-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/complete-layer-upload-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CompleteLayerUpload", :http.request.configuration/output-deser-fn response-complete-layer-upload-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "UploadNotFoundException" :portkey.aws.ecr.-2015-09-21/upload-not-found-exception, "InvalidLayerException" :portkey.aws.ecr.-2015-09-21/invalid-layer-exception, "LayerPartTooSmallException" :portkey.aws.ecr.-2015-09-21/layer-part-too-small-exception, "LayerAlreadyExistsException" :portkey.aws.ecr.-2015-09-21/layer-already-exists-exception, "EmptyUploadException" :portkey.aws.ecr.-2015-09-21/empty-upload-exception}})))))
(clojure.spec.alpha/fdef complete-layer-upload :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/complete-layer-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/complete-layer-upload-response))

(clojure.core/defn set-repository-policy "Applies a repository policy on a specified repository to control access\npermissions." ([set-repository-policy-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-set-repository-policy-request set-repository-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/set-repository-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/set-repository-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetRepositoryPolicy", :http.request.configuration/output-deser-fn response-set-repository-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef set-repository-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/set-repository-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/set-repository-policy-response))

(clojure.core/defn put-image "Creates or updates the image manifest and tags associated with an image.\n This operation is used by the Amazon ECR proxy, and it is not intended for\ngeneral use by customers for pulling and pushing images. In most cases, you\nshould use the docker CLI to pull, tag, and push images." ([put-image-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-image-request put-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/put-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/put-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutImage", :http.request.configuration/output-deser-fn response-put-image-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "ImageAlreadyExistsException" :portkey.aws.ecr.-2015-09-21/image-already-exists-exception, "LayersNotFoundException" :portkey.aws.ecr.-2015-09-21/layers-not-found-exception, "LimitExceededException" :portkey.aws.ecr.-2015-09-21/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef put-image :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/put-image-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/put-image-response))

(clojure.core/defn describe-images "Returns metadata about the images in a repository, including image size, image\ntags, and creation date.\n Beginning with Docker version 1.9, the Docker client compresses image layers\nbefore pushing them to a V2 Docker registry. The output of the docker images\ncommand shows the uncompressed image size, so it may return a larger image size\nthan the image sizes returned by DescribeImages." ([describe-images-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-images-request describe-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/describe-images-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/describe-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeImages", :http.request.configuration/output-deser-fn response-describe-images-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "ImageNotFoundException" :portkey.aws.ecr.-2015-09-21/image-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-images :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/describe-images-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/describe-images-response))

(clojure.core/defn start-lifecycle-policy-preview "Starts a preview of the specified lifecycle policy. This allows you to see the\nresults before creating the lifecycle policy." ([start-lifecycle-policy-preview-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-lifecycle-policy-preview-request start-lifecycle-policy-preview-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/start-lifecycle-policy-preview-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/start-lifecycle-policy-preview-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartLifecyclePolicyPreview", :http.request.configuration/output-deser-fn response-start-lifecycle-policy-preview-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "LifecyclePolicyNotFoundException" :portkey.aws.ecr.-2015-09-21/lifecycle-policy-not-found-exception, "LifecyclePolicyPreviewInProgressException" :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-in-progress-exception}})))))
(clojure.spec.alpha/fdef start-lifecycle-policy-preview :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/start-lifecycle-policy-preview-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/start-lifecycle-policy-preview-response))

(clojure.core/defn delete-lifecycle-policy "Deletes the specified lifecycle policy." ([delete-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-lifecycle-policy-request delete-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLifecyclePolicy", :http.request.configuration/output-deser-fn response-delete-lifecycle-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "LifecyclePolicyNotFoundException" :portkey.aws.ecr.-2015-09-21/lifecycle-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-response))

(clojure.core/defn list-tags-for-resource "List the tags for an Amazon ECR resource." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "ServerException" :portkey.aws.ecr.-2015-09-21/server-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/list-tags-for-resource-response))

(clojure.core/defn describe-repositories "Describes image repositories in a registry." ([] (describe-repositories {})) ([describe-repositories-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-repositories-request describe-repositories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/describe-repositories-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/describe-repositories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeRepositories", :http.request.configuration/output-deser-fn response-describe-repositories-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-repositories :args (clojure.spec.alpha/? :portkey.aws.ecr.-2015-09-21/describe-repositories-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/describe-repositories-response))

(clojure.core/defn batch-check-layer-availability "Check the availability of multiple image layers in a specified registry and\nrepository.\n This operation is used by the Amazon ECR proxy, and it is not intended for\ngeneral use by customers for pulling and pushing images. In most cases, you\nshould use the docker CLI to pull, tag, and push images." ([batch-check-layer-availability-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-check-layer-availability-request batch-check-layer-availability-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/batch-check-layer-availability-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/batch-check-layer-availability-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchCheckLayerAvailability", :http.request.configuration/output-deser-fn response-batch-check-layer-availability-response, :http.request.spec/error-spec {"RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "ServerException" :portkey.aws.ecr.-2015-09-21/server-exception}})))))
(clojure.spec.alpha/fdef batch-check-layer-availability :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/batch-check-layer-availability-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/batch-check-layer-availability-response))

(clojure.core/defn put-lifecycle-policy "Creates or updates a lifecycle policy. For information about lifecycle policy\nsyntax, see Lifecycle Policy Template\n(http://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html)." ([put-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-put-lifecycle-policy-request put-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/put-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/put-lifecycle-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutLifecyclePolicy", :http.request.configuration/output-deser-fn response-put-lifecycle-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef put-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/put-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/put-lifecycle-policy-response))

(clojure.core/defn batch-get-image "Gets detailed information for specified images within a specified repository.\nImages are specified with either imageTag or imageDigest." ([batch-get-image-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-get-image-request batch-get-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/batch-get-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/batch-get-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchGetImage", :http.request.configuration/output-deser-fn response-batch-get-image-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef batch-get-image :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/batch-get-image-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/batch-get-image-response))

(clojure.core/defn get-lifecycle-policy "Retrieves the specified lifecycle policy." ([get-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-lifecycle-policy-request get-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLifecyclePolicy", :http.request.configuration/output-deser-fn response-get-lifecycle-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "LifecyclePolicyNotFoundException" :portkey.aws.ecr.-2015-09-21/lifecycle-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef get-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-response))

(clojure.core/defn get-authorization-token "Retrieves a token that is valid for a specified registry for 12 hours. This\ncommand allows you to use the docker CLI to push and pull images with Amazon\nECR. If you do not specify a registry, the default registry is assumed.\n The authorizationToken returned for each registry specified is a base64 encoded\nstring that can be decoded and used in a docker login command to authenticate to\na registry. The AWS CLI offers an aws ecr get-login command that simplifies the\nlogin process." ([] (get-authorization-token {})) ([get-authorization-token-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-authorization-token-request get-authorization-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/get-authorization-token-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/get-authorization-token-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetAuthorizationToken", :http.request.configuration/output-deser-fn response-get-authorization-token-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-authorization-token :args (clojure.spec.alpha/? :portkey.aws.ecr.-2015-09-21/get-authorization-token-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-authorization-token-response))

(clojure.core/defn delete-repository "Deletes an existing image repository. If a repository contains images, you must\nuse the force option to delete it." ([delete-repository-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-repository-request delete-repository-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/delete-repository-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/delete-repository-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRepository", :http.request.configuration/output-deser-fn response-delete-repository-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "RepositoryNotEmptyException" :portkey.aws.ecr.-2015-09-21/repository-not-empty-exception}})))))
(clojure.spec.alpha/fdef delete-repository :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/delete-repository-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/delete-repository-response))

(clojure.core/defn get-lifecycle-policy-preview "Retrieves the results of the specified lifecycle policy preview request." ([get-lifecycle-policy-preview-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-lifecycle-policy-preview-request get-lifecycle-policy-preview-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLifecyclePolicyPreview", :http.request.configuration/output-deser-fn response-get-lifecycle-policy-preview-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "LifecyclePolicyPreviewNotFoundException" :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-not-found-exception}})))))
(clojure.spec.alpha/fdef get-lifecycle-policy-preview :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-response))

(clojure.core/defn get-download-url-for-layer "Retrieves the pre-signed Amazon S3 download URL corresponding to an image layer.\nYou can only get URLs for image layers that are referenced in an image.\n This operation is used by the Amazon ECR proxy, and it is not intended for\ngeneral use by customers for pulling and pushing images. In most cases, you\nshould use the docker CLI to pull, tag, and push images." ([get-download-url-for-layer-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-download-url-for-layer-request get-download-url-for-layer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/get-download-url-for-layer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/get-download-url-for-layer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDownloadUrlForLayer", :http.request.configuration/output-deser-fn response-get-download-url-for-layer-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "LayersNotFoundException" :portkey.aws.ecr.-2015-09-21/layers-not-found-exception, "LayerInaccessibleException" :portkey.aws.ecr.-2015-09-21/layer-inaccessible-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef get-download-url-for-layer :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/get-download-url-for-layer-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-download-url-for-layer-response))

(clojure.core/defn list-images "Lists all the image IDs for a given repository.\n You can filter images based on whether or not they are tagged by setting the\ntagStatus parameter to TAGGED or UNTAGGED. For example, you can filter your\nresults to return only UNTAGGED images and then pipe that result to a\nBatchDeleteImage operation to delete them. Or, you can filter your results to\nreturn only TAGGED images to list all of the tags in your repository." ([list-images-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-images-request list-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/list-images-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/list-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListImages", :http.request.configuration/output-deser-fn response-list-images-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef list-images :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/list-images-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/list-images-response))

(clojure.core/defn untag-resource "Deletes specified tags from a resource." ([untag-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/untag-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn response-untag-resource-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "InvalidTagParameterException" :portkey.aws.ecr.-2015-09-21/invalid-tag-parameter-exception, "TooManyTagsException" :portkey.aws.ecr.-2015-09-21/too-many-tags-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "ServerException" :portkey.aws.ecr.-2015-09-21/server-exception}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/untag-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/untag-resource-response))

(clojure.core/defn upload-layer-part "Uploads an image layer part to Amazon ECR.\n This operation is used by the Amazon ECR proxy, and it is not intended for\ngeneral use by customers for pulling and pushing images. In most cases, you\nshould use the docker CLI to pull, tag, and push images." ([upload-layer-part-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-upload-layer-part-request upload-layer-part-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/upload-layer-part-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/upload-layer-part-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UploadLayerPart", :http.request.configuration/output-deser-fn response-upload-layer-part-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "InvalidLayerPartException" :portkey.aws.ecr.-2015-09-21/invalid-layer-part-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "UploadNotFoundException" :portkey.aws.ecr.-2015-09-21/upload-not-found-exception, "LimitExceededException" :portkey.aws.ecr.-2015-09-21/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef upload-layer-part :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/upload-layer-part-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/upload-layer-part-response))

(clojure.core/defn initiate-layer-upload "Notify Amazon ECR that you intend to upload an image layer.\n This operation is used by the Amazon ECR proxy, and it is not intended for\ngeneral use by customers for pulling and pushing images. In most cases, you\nshould use the docker CLI to pull, tag, and push images." ([initiate-layer-upload-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-initiate-layer-upload-request initiate-layer-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "InitiateLayerUpload", :http.request.configuration/output-deser-fn response-initiate-layer-upload-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef initiate-layer-upload :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-response))

(clojure.core/defn get-repository-policy "Retrieves the repository policy for a specified repository." ([get-repository-policy-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-repository-policy-request get-repository-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/get-repository-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/get-repository-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRepositoryPolicy", :http.request.configuration/output-deser-fn response-get-repository-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "RepositoryPolicyNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef get-repository-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/get-repository-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-repository-policy-response))

(clojure.core/defn delete-repository-policy "Deletes the repository policy from a specified repository." ([delete-repository-policy-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-repository-policy-request delete-repository-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/delete-repository-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/delete-repository-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteRepositoryPolicy", :http.request.configuration/output-deser-fn response-delete-repository-policy-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "RepositoryPolicyNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-repository-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/delete-repository-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/delete-repository-policy-response))

(clojure.core/defn batch-delete-image "Deletes a list of specified images within a specified repository. Images are\nspecified with either imageTag or imageDigest.\n You can remove a tag from an image by specifying the image's tag in your\nrequest. When you remove the last tag from an image, the image is deleted from\nyour repository.\n You can completely delete an image (and all of its tags) by specifying the\nimage's digest in your request." ([batch-delete-image-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-batch-delete-image-request batch-delete-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/batch-delete-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/batch-delete-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "BatchDeleteImage", :http.request.configuration/output-deser-fn response-batch-delete-image-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef batch-delete-image :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/batch-delete-image-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/batch-delete-image-response))

(clojure.core/defn create-repository "Creates an image repository." ([create-repository-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-repository-request create-repository-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/create-repository-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id "ECR", :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/create-repository-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateRepository", :http.request.configuration/output-deser-fn response-create-repository-response, :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "InvalidTagParameterException" :portkey.aws.ecr.-2015-09-21/invalid-tag-parameter-exception, "TooManyTagsException" :portkey.aws.ecr.-2015-09-21/too-many-tags-exception, "RepositoryAlreadyExistsException" :portkey.aws.ecr.-2015-09-21/repository-already-exists-exception, "LimitExceededException" :portkey.aws.ecr.-2015-09-21/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-repository :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/create-repository-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/create-repository-response))
