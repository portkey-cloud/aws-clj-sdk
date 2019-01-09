(ns portkey.aws.ecr.-2015-09-21 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "ecr", :region "ap-northeast-1"},
    :ssl-common-name "ecr.ap-northeast-1.amazonaws.com",
    :endpoint "https://ecr.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "ecr", :region "eu-west-1"},
    :ssl-common-name "ecr.eu-west-1.amazonaws.com",
    :endpoint "https://ecr.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "ecr", :region "us-east-2"},
    :ssl-common-name "ecr.us-east-2.amazonaws.com",
    :endpoint "https://ecr.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "ecr", :region "ap-southeast-2"},
    :ssl-common-name "ecr.ap-southeast-2.amazonaws.com",
    :endpoint "https://ecr.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "ecr", :region "cn-north-1"},
    :ssl-common-name "ecr.cn-north-1.amazonaws.com.cn",
    :endpoint "https://ecr.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "ecr", :region "sa-east-1"},
    :ssl-common-name "ecr.sa-east-1.amazonaws.com",
    :endpoint "https://ecr.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "ecr", :region "ap-southeast-1"},
    :ssl-common-name "ecr.ap-southeast-1.amazonaws.com",
    :endpoint "https://ecr.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "cn-northwest-1"
   {:credential-scope {:service "ecr", :region "cn-northwest-1"},
    :ssl-common-name "ecr.cn-northwest-1.amazonaws.com.cn",
    :endpoint "https://ecr.cn-northwest-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "ecr", :region "ap-northeast-2"},
    :ssl-common-name "ecr.ap-northeast-2.amazonaws.com",
    :endpoint "https://ecr.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "ecr", :region "eu-west-3"},
    :ssl-common-name "ecr.eu-west-3.amazonaws.com",
    :endpoint "https://ecr.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "ecr", :region "ca-central-1"},
    :ssl-common-name "ecr.ca-central-1.amazonaws.com",
    :endpoint "https://ecr.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "ecr", :region "eu-central-1"},
    :ssl-common-name "ecr.eu-central-1.amazonaws.com",
    :endpoint "https://ecr.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "ecr", :region "eu-west-2"},
    :ssl-common-name "ecr.eu-west-2.amazonaws.com",
    :endpoint "https://ecr.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "ecr", :region "us-gov-west-1"},
    :ssl-common-name "ecr.us-gov-west-1.amazonaws.com",
    :endpoint "https://ecr.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "ecr", :region "us-west-2"},
    :ssl-common-name "ecr.us-west-2.amazonaws.com",
    :endpoint "https://ecr.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "ecr", :region "us-east-1"},
    :ssl-common-name "ecr.us-east-1.amazonaws.com",
    :endpoint "https://ecr.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "ecr", :region "us-west-1"},
    :ssl-common-name "ecr.us-west-1.amazonaws.com",
    :endpoint "https://ecr.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "ecr", :region "ap-south-1"},
    :ssl-common-name "ecr.ap-south-1.amazonaws.com",
    :endpoint "https://ecr.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-media-type-list)

(clojure.core/declare ser-describe-images-filter)

(clojure.core/declare ser-media-type)

(clojure.core/declare ser-image-digest)

(clojure.core/declare ser-layer-part-blob)

(clojure.core/declare ser-repository-name)

(clojure.core/declare ser-batched-operation-layer-digest)

(clojure.core/declare ser-tag-status)

(clojure.core/declare ser-repository-policy-text)

(clojure.core/declare ser-lifecycle-policy-preview-filter)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-batched-operation-layer-digest-list)

(clojure.core/declare ser-part-size)

(clojure.core/declare ser-force-flag)

(clojure.core/declare ser-image-tag)

(clojure.core/declare ser-image-identifier)

(clojure.core/declare ser-get-authorization-token-registry-id-list)

(clojure.core/declare ser-layer-digest-list)

(clojure.core/declare ser-registry-id)

(clojure.core/declare ser-layer-digest)

(clojure.core/declare ser-upload-id)

(clojure.core/declare ser-image-manifest)

(clojure.core/declare ser-max-results)

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

(clojure.core/defn- ser-tag-status [input] #:http.request.field{:value (clojure.core/get {"TAGGED" "TAGGED", :tagged "TAGGED", "UNTAGGED" "UNTAGGED", :untagged "UNTAGGED"} input), :shape "TagStatus"})

(clojure.core/defn- ser-repository-policy-text [input] #:http.request.field{:value input, :shape "RepositoryPolicyText"})

(clojure.core/defn- ser-lifecycle-policy-preview-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LifecyclePolicyPreviewFilter", :type "structure"} (clojure.core/contains? input :tag-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-status (input :tag-status)) #:http.request.field{:name "tagStatus", :shape "TagStatus"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-batched-operation-layer-digest-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-batched-operation-layer-digest coll) #:http.request.field{:shape "BatchedOperationLayerDigest"}))) input), :shape "BatchedOperationLayerDigestList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-part-size [input] #:http.request.field{:value input, :shape "PartSize"})

(clojure.core/defn- ser-force-flag [input] #:http.request.field{:value input, :shape "ForceFlag"})

(clojure.core/defn- ser-image-tag [input] #:http.request.field{:value input, :shape "ImageTag"})

(clojure.core/defn- ser-image-identifier [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ImageIdentifier", :type "structure"} (clojure.core/contains? input :image-digest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-digest (input :image-digest)) #:http.request.field{:name "imageDigest", :shape "ImageDigest"})) (clojure.core/contains? input :image-tag) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-tag (input :image-tag)) #:http.request.field{:name "imageTag", :shape "ImageTag"}))))

(clojure.core/defn- ser-get-authorization-token-registry-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-registry-id coll) #:http.request.field{:shape "RegistryId"}))) input), :shape "GetAuthorizationTokenRegistryIdList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-layer-digest-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-layer-digest coll) #:http.request.field{:shape "LayerDigest"}))) input), :shape "LayerDigestList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-registry-id [input] #:http.request.field{:value input, :shape "RegistryId"})

(clojure.core/defn- ser-layer-digest [input] #:http.request.field{:value input, :shape "LayerDigest"})

(clojure.core/defn- ser-upload-id [input] #:http.request.field{:value input, :shape "UploadId"})

(clojure.core/defn- ser-image-manifest [input] #:http.request.field{:value input, :shape "ImageManifest"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-list-images-filter [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ListImagesFilter", :type "structure"} (clojure.core/contains? input :tag-status) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-status (input :tag-status)) #:http.request.field{:name "tagStatus", :shape "TagStatus"}))))

(clojure.core/defn- ser-image-identifier-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-image-identifier coll) #:http.request.field{:shape "ImageIdentifier"}))) input), :shape "ImageIdentifierList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-lifecycle-policy-text [input] #:http.request.field{:value input, :shape "LifecyclePolicyText"})

(clojure.core/defn- ser-repository-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-repository-name coll) #:http.request.field{:shape "RepositoryName"}))) input), :shape "RepositoryNameList", :type "list", :max 100, :min 1})

(clojure.core/defn- req-get-authorization-token-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :registry-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-get-authorization-token-registry-id-list (input :registry-ids)) #:http.request.field{:name "registryIds", :shape "GetAuthorizationTokenRegistryIdList"}))))

(clojure.core/defn- req-put-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-image-manifest (input :image-manifest)) #:http.request.field{:name "imageManifest", :shape "ImageManifest"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :image-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-tag (input :image-tag)) #:http.request.field{:name "imageTag", :shape "ImageTag"}))))

(clojure.core/defn- req-get-download-url-for-layer-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-layer-digest (input :layer-digest)) #:http.request.field{:name "layerDigest", :shape "LayerDigest"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-complete-layer-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-upload-id (input :upload-id)) #:http.request.field{:name "uploadId", :shape "UploadId"}) (clojure.core/into (ser-layer-digest-list (input :layer-digests)) #:http.request.field{:name "layerDigests", :shape "LayerDigestList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-batch-check-layer-availability-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-batched-operation-layer-digest-list (input :layer-digests)) #:http.request.field{:name "layerDigests", :shape "BatchedOperationLayerDigestList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-list-images-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-images-filter (input :filter)) #:http.request.field{:name "filter", :shape "ListImagesFilter"}))))

(clojure.core/defn- req-get-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-delete-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-upload-layer-part-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-upload-id (input :upload-id)) #:http.request.field{:name "uploadId", :shape "UploadId"}) (clojure.core/into (ser-part-size (input :part-first-byte)) #:http.request.field{:name "partFirstByte", :shape "PartSize"}) (clojure.core/into (ser-part-size (input :part-last-byte)) #:http.request.field{:name "partLastByte", :shape "PartSize"}) (clojure.core/into (ser-layer-part-blob (input :layer-part-blob)) #:http.request.field{:name "layerPartBlob", :shape "LayerPartBlob"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-get-lifecycle-policy-preview-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :image-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-policy-preview-filter (input :filter)) #:http.request.field{:name "filter", :shape "LifecyclePolicyPreviewFilter"}))))

(clojure.core/defn- req-describe-repositories-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :repository-names) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-repository-name-list (input :repository-names)) #:http.request.field{:name "repositoryNames", :shape "RepositoryNameList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-put-lifecycle-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-lifecycle-policy-text (input :lifecycle-policy-text)) #:http.request.field{:name "lifecyclePolicyText", :shape "LifecyclePolicyText"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-batch-delete-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-start-lifecycle-policy-preview-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :lifecycle-policy-text) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lifecycle-policy-text (input :lifecycle-policy-text)) #:http.request.field{:name "lifecyclePolicyText", :shape "LifecyclePolicyText"}))))

(clojure.core/defn- req-describe-images-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :image-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"})) (clojure.core/contains? input :filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-describe-images-filter (input :filter)) #:http.request.field{:name "filter", :shape "DescribeImagesFilter"}))))

(clojure.core/defn- req-batch-get-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-image-identifier-list (input :image-ids)) #:http.request.field{:name "imageIds", :shape "ImageIdentifierList"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :accepted-media-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-media-type-list (input :accepted-media-types)) #:http.request.field{:name "acceptedMediaTypes", :shape "MediaTypeList"}))))

(clojure.core/defn- req-get-repository-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-delete-repository-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-create-repository-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]}))

(clojure.core/defn- req-initiate-layer-upload-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"}))))

(clojure.core/defn- req-set-repository-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"}) (clojure.core/into (ser-repository-policy-text (input :policy-text)) #:http.request.field{:name "policyText", :shape "RepositoryPolicyText"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-flag (input :force)) #:http.request.field{:name "force", :shape "ForceFlag"}))))

(clojure.core/defn- req-delete-repository-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-repository-name (input :repository-name)) #:http.request.field{:name "repositoryName", :shape "RepositoryName"})]} (clojure.core/contains? input :registry-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-registry-id (input :registry-id)) #:http.request.field{:name "registryId", :shape "RegistryId"})) (clojure.core/contains? input :force) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-force-flag (input :force)) #:http.request.field{:name "force", :shape "ForceFlag"}))))

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

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 2 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"(?:[a-z0-9]+(?:[._-][a-z0-9]+)*/)*[a-z0-9]+(?:[._-][a-z0-9]+)*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-get-image-response/images (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-get-image-response/failures (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-failure-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batch-get-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.batch-get-image-response/images :portkey.aws.ecr.-2015-09-21.batch-get-image-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-images-response/image-ids (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.list-images-response/next-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/list-images-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.list-images-response/image-ids :portkey.aws.ecr.-2015-09-21.list-images-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/evaluation-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-tag-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/image-tag))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-action-type #{"EXPIRE" :expire})

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batched-operation-layer-digest (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.repository-policy-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-policy-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.repository-policy-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/tag-status #{:untagged "TAGGED" "UNTAGGED" :tagged})

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

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-policy-text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/lifecycle-policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/last-evaluated-at (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/evaluation-timestamp))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/registry-id :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/repository-name :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/lifecycle-policy-text :portkey.aws.ecr.-2015-09-21.delete-lifecycle-policy-response/last-evaluated-at]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/authorization-data-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/authorization-data))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/base-64 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^\S+$" s__27882__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.initiate-layer-upload-response/upload-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.initiate-layer-upload-response/part-size (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.initiate-layer-upload-response/upload-id :portkey.aws.ecr.-2015-09-21.initiate-layer-upload-response/part-size]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-availability #{:unavailable "AVAILABLE" "UNAVAILABLE" :available})

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/image))

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

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-repository-policy-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-repository-policy-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-repository-policy-response/policy-text (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-policy-text))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-repository-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.get-repository-policy-response/registry-id :portkey.aws.ecr.-2015-09-21.get-repository-policy-response/repository-name :portkey.aws.ecr.-2015-09-21.get-repository-policy-response/policy-text]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-tag (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer/layer-digest (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-digest))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer/layer-availability (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-availability))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer/layer-size (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/layer-size-in-bytes))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.layer/media-type (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/media-type))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.layer/layer-digest :portkey.aws.ecr.-2015-09-21.layer/layer-availability :portkey.aws.ecr.-2015-09-21.layer/layer-size :portkey.aws.ecr.-2015-09-21.layer/media-type]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-size-in-bytes clojure.core/int?)

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
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/max-results (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/max-results))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/filter (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-filter))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/repository-name] :opt-un [:portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/registry-id :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/image-ids :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/next-token :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/max-results :portkey.aws.ecr.-2015-09-21.get-lifecycle-policy-preview-request/filter]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-failure-code #{"MissingLayerDigest" "InvalidLayerDigest" :invalid-layer-digest :missing-layer-digest})

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

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/registry-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9]{12}" s__27882__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/layer-digest (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.create-repository-request/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/create-repository-request (clojure.spec.alpha/keys :req-un [:portkey.aws.ecr.-2015-09-21.create-repository-request/repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.image-already-exists-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/image-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.image-already-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-delete-image-response/image-ids (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-identifier-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.batch-delete-image-response/failures (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/image-failure-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/batch-delete-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.batch-delete-image-response/image-ids :portkey.aws.ecr.-2015-09-21.batch-delete-image-response/failures]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-repositories-response/repositories (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-list))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.describe-repositories-response/next-token (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/next-token))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/describe-repositories-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.describe-repositories-response/repositories :portkey.aws.ecr.-2015-09-21.describe-repositories-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/upload-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}" s__27882__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/max-results (clojure.spec.alpha/int-in 1 100))

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

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/lifecycle-policy-text (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 100 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/registry-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/registry-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/repository-name (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/repository-name))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/upload-id (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/upload-id))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/last-byte-received (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/part-size))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/upload-layer-part-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.upload-layer-part-response/registry-id :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/repository-name :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/upload-id :portkey.aws.ecr.-2015-09-21.upload-layer-part-response/last-byte-received]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/push-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21.empty-upload-exception/message (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/exception-message))
(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/empty-upload-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.ecr.-2015-09-21.empty-upload-exception/message]))

(clojure.spec.alpha/def :portkey.aws.ecr.-2015-09-21/repository-name-list (clojure.spec.alpha/coll-of :portkey.aws.ecr.-2015-09-21/repository-name :min-count 1 :max-count 100))

(clojure.core/defn complete-layer-upload ([complete-layer-upload-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-complete-layer-upload-request complete-layer-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/complete-layer-upload-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/complete-layer-upload-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CompleteLayerUpload", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "UploadNotFoundException" :portkey.aws.ecr.-2015-09-21/upload-not-found-exception, "InvalidLayerException" :portkey.aws.ecr.-2015-09-21/invalid-layer-exception, "LayerPartTooSmallException" :portkey.aws.ecr.-2015-09-21/layer-part-too-small-exception, "LayerAlreadyExistsException" :portkey.aws.ecr.-2015-09-21/layer-already-exists-exception, "EmptyUploadException" :portkey.aws.ecr.-2015-09-21/empty-upload-exception}})))))
(clojure.spec.alpha/fdef complete-layer-upload :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/complete-layer-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/complete-layer-upload-response))

(clojure.core/defn set-repository-policy ([set-repository-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-set-repository-policy-request set-repository-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/set-repository-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/set-repository-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "SetRepositoryPolicy", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef set-repository-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/set-repository-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/set-repository-policy-response))

(clojure.core/defn put-image ([put-image-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-image-request put-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/put-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/put-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutImage", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "ImageAlreadyExistsException" :portkey.aws.ecr.-2015-09-21/image-already-exists-exception, "LayersNotFoundException" :portkey.aws.ecr.-2015-09-21/layers-not-found-exception, "LimitExceededException" :portkey.aws.ecr.-2015-09-21/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef put-image :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/put-image-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/put-image-response))

(clojure.core/defn describe-images ([describe-images-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-images-request describe-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/describe-images-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/describe-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeImages", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "ImageNotFoundException" :portkey.aws.ecr.-2015-09-21/image-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-images :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/describe-images-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/describe-images-response))

(clojure.core/defn start-lifecycle-policy-preview ([start-lifecycle-policy-preview-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-start-lifecycle-policy-preview-request start-lifecycle-policy-preview-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/start-lifecycle-policy-preview-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/start-lifecycle-policy-preview-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartLifecyclePolicyPreview", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "LifecyclePolicyNotFoundException" :portkey.aws.ecr.-2015-09-21/lifecycle-policy-not-found-exception, "LifecyclePolicyPreviewInProgressException" :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-in-progress-exception}})))))
(clojure.spec.alpha/fdef start-lifecycle-policy-preview :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/start-lifecycle-policy-preview-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/start-lifecycle-policy-preview-response))

(clojure.core/defn delete-lifecycle-policy ([delete-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-lifecycle-policy-request delete-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLifecyclePolicy", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "LifecyclePolicyNotFoundException" :portkey.aws.ecr.-2015-09-21/lifecycle-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/delete-lifecycle-policy-response))

(clojure.core/defn describe-repositories ([] (describe-repositories {})) ([describe-repositories-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-repositories-request describe-repositories-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/describe-repositories-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/describe-repositories-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeRepositories", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-repositories :args (clojure.spec.alpha/? :portkey.aws.ecr.-2015-09-21/describe-repositories-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/describe-repositories-response))

(clojure.core/defn batch-check-layer-availability ([batch-check-layer-availability-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-check-layer-availability-request batch-check-layer-availability-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/batch-check-layer-availability-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/batch-check-layer-availability-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchCheckLayerAvailability", :http.request.spec/error-spec {"RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "ServerException" :portkey.aws.ecr.-2015-09-21/server-exception}})))))
(clojure.spec.alpha/fdef batch-check-layer-availability :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/batch-check-layer-availability-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/batch-check-layer-availability-response))

(clojure.core/defn put-lifecycle-policy ([put-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-put-lifecycle-policy-request put-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/put-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/put-lifecycle-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutLifecyclePolicy", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef put-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/put-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/put-lifecycle-policy-response))

(clojure.core/defn batch-get-image ([batch-get-image-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-get-image-request batch-get-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/batch-get-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/batch-get-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchGetImage", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef batch-get-image :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/batch-get-image-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/batch-get-image-response))

(clojure.core/defn get-lifecycle-policy ([get-lifecycle-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-lifecycle-policy-request get-lifecycle-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLifecyclePolicy", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "LifecyclePolicyNotFoundException" :portkey.aws.ecr.-2015-09-21/lifecycle-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef get-lifecycle-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-response))

(clojure.core/defn get-authorization-token ([] (get-authorization-token {})) ([get-authorization-token-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-authorization-token-request get-authorization-token-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/get-authorization-token-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/get-authorization-token-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetAuthorizationToken", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef get-authorization-token :args (clojure.spec.alpha/? :portkey.aws.ecr.-2015-09-21/get-authorization-token-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-authorization-token-response))

(clojure.core/defn delete-repository ([delete-repository-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-repository-request delete-repository-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/delete-repository-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/delete-repository-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRepository", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "RepositoryNotEmptyException" :portkey.aws.ecr.-2015-09-21/repository-not-empty-exception}})))))
(clojure.spec.alpha/fdef delete-repository :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/delete-repository-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/delete-repository-response))

(clojure.core/defn get-lifecycle-policy-preview ([get-lifecycle-policy-preview-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-lifecycle-policy-preview-request get-lifecycle-policy-preview-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetLifecyclePolicyPreview", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "LifecyclePolicyPreviewNotFoundException" :portkey.aws.ecr.-2015-09-21/lifecycle-policy-preview-not-found-exception}})))))
(clojure.spec.alpha/fdef get-lifecycle-policy-preview :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-lifecycle-policy-preview-response))

(clojure.core/defn get-download-url-for-layer ([get-download-url-for-layer-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-download-url-for-layer-request get-download-url-for-layer-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/get-download-url-for-layer-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/get-download-url-for-layer-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDownloadUrlForLayer", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "LayersNotFoundException" :portkey.aws.ecr.-2015-09-21/layers-not-found-exception, "LayerInaccessibleException" :portkey.aws.ecr.-2015-09-21/layer-inaccessible-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef get-download-url-for-layer :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/get-download-url-for-layer-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-download-url-for-layer-response))

(clojure.core/defn list-images ([list-images-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-images-request list-images-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/list-images-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/list-images-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListImages", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef list-images :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/list-images-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/list-images-response))

(clojure.core/defn upload-layer-part ([upload-layer-part-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-upload-layer-part-request upload-layer-part-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/upload-layer-part-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/upload-layer-part-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UploadLayerPart", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "InvalidLayerPartException" :portkey.aws.ecr.-2015-09-21/invalid-layer-part-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "UploadNotFoundException" :portkey.aws.ecr.-2015-09-21/upload-not-found-exception, "LimitExceededException" :portkey.aws.ecr.-2015-09-21/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef upload-layer-part :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/upload-layer-part-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/upload-layer-part-response))

(clojure.core/defn initiate-layer-upload ([initiate-layer-upload-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-initiate-layer-upload-request initiate-layer-upload-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "InitiateLayerUpload", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef initiate-layer-upload :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/initiate-layer-upload-response))

(clojure.core/defn get-repository-policy ([get-repository-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-repository-policy-request get-repository-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/get-repository-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/get-repository-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetRepositoryPolicy", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "RepositoryPolicyNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef get-repository-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/get-repository-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/get-repository-policy-response))

(clojure.core/defn delete-repository-policy ([delete-repository-policy-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-repository-policy-request delete-repository-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/delete-repository-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/delete-repository-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteRepositoryPolicy", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception, "RepositoryPolicyNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-policy-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-repository-policy :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/delete-repository-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/delete-repository-policy-response))

(clojure.core/defn batch-delete-image ([batch-delete-image-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-batch-delete-image-request batch-delete-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/batch-delete-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/batch-delete-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "BatchDeleteImage", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryNotFoundException" :portkey.aws.ecr.-2015-09-21/repository-not-found-exception}})))))
(clojure.spec.alpha/fdef batch-delete-image :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/batch-delete-image-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/batch-delete-image-response))

(clojure.core/defn create-repository ([create-repository-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-repository-request create-repository-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.ecr.-2015-09-21/endpoints, :http.request.configuration/target-prefix "AmazonEC2ContainerRegistry_V20150921", :http.request.spec/output-spec :portkey.aws.ecr.-2015-09-21/create-repository-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2015-09-21", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.ecr.-2015-09-21/create-repository-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateRepository", :http.request.spec/error-spec {"ServerException" :portkey.aws.ecr.-2015-09-21/server-exception, "InvalidParameterException" :portkey.aws.ecr.-2015-09-21/invalid-parameter-exception, "RepositoryAlreadyExistsException" :portkey.aws.ecr.-2015-09-21/repository-already-exists-exception, "LimitExceededException" :portkey.aws.ecr.-2015-09-21/limit-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-repository :args (clojure.spec.alpha/tuple :portkey.aws.ecr.-2015-09-21/create-repository-request) :ret (clojure.spec.alpha/and :portkey.aws.ecr.-2015-09-21/create-repository-response))
