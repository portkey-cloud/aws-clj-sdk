(ns portkey.aws.cloudfront.-2018-06-18 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4},
   "aws-global"
   {:credential-scope {:service "cloudfront", :region "us-east-1"},
    :ssl-common-name "cloudfront.amazonaws.com",
    :endpoint "https://cloudfront.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare serboolean)

(clojure.core/declare ser-cookie-names)

(clojure.core/declare ser-content-type-profile)

(clojure.core/declare ser-logging-config)

(clojure.core/declare ser-streaming-distribution-config-with-tags)

(clojure.core/declare ser-custom-error-response-list)

(clojure.core/declare ser-certificate-source)

(clojure.core/declare ser-location-list)

(clojure.core/declare ser-field-patterns)

(clojure.core/declare ser-restrictions)

(clojure.core/declare ser-field-level-encryption-profile-config)

(clojure.core/declare serstring)

(clojure.core/declare ser-field-level-encryption-config)

(clojure.core/declare ser-query-arg-profile)

(clojure.core/declare ser-lambda-function-association)

(clojure.core/declare ser-forwarded-values)

(clojure.core/declare ser-invalidation-batch)

(clojure.core/declare ser-query-string-cache-keys-list)

(clojure.core/declare ser-public-key-config)

(clojure.core/declare ser-item-selection)

(clojure.core/declare ser-encryption-entity-list)

(clojure.core/declare ser-lambda-function-associations)

(clojure.core/declare ser-encryption-entities)

(clojure.core/declare ser-viewer-protocol-policy)

(clojure.core/declare ser-content-type-profile-list)

(clojure.core/declare ser-custom-error-response)

(clojure.core/declare serlong)

(clojure.core/declare ser-origin-list)

(clojure.core/declare ser-content-type-profile-config)

(clojure.core/declare ser-cached-methods)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-query-arg-profile-list)

(clojure.core/declare ser-cache-behaviors)

(clojure.core/declare ser-cache-behavior)

(clojure.core/declare ser-origin)

(clojure.core/declare ser-format)

(clojure.core/declare ser-custom-error-responses)

(clojure.core/declare ser-origin-ssl-protocols)

(clojure.core/declare ser-aliases)

(clojure.core/declare ser-event-type)

(clojure.core/declare ser-content-type-profiles)

(clojure.core/declare ser-encryption-entity)

(clojure.core/declare ser-lambda-function-arn)

(clojure.core/declare ser-allowed-methods)

(clojure.core/declare ser-price-class)

(clojure.core/declare ser-custom-origin-config)

(clojure.core/declare ser-s-3-origin)

(clojure.core/declare ser-cookie-name-list)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-query-string-cache-keys)

(clojure.core/declare ser-distribution-config)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-ssl-protocols-list)

(clojure.core/declare ser-aws-account-number-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-method)

(clojure.core/declare ser-alias-list)

(clojure.core/declare ser-origin-custom-headers-list)

(clojure.core/declare ser-query-arg-profile-config)

(clojure.core/declare ser-origin-protocol-policy)

(clojure.core/declare ser-query-arg-profiles)

(clojure.core/declare ser-path-list)

(clojure.core/declare ser-geo-restriction-type)

(clojure.core/declare ser-paths)

(clojure.core/declare serinteger)

(clojure.core/declare ser-cache-behavior-list)

(clojure.core/declare ser-origin-custom-header)

(clojure.core/declare ser-streaming-distribution-config)

(clojure.core/declare ser-field-pattern-list)

(clojure.core/declare ser-s-3-origin-config)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-streaming-logging-config)

(clojure.core/declare ser-ssl-protocol)

(clojure.core/declare ser-lambda-function-association-list)

(clojure.core/declare ser-headers)

(clojure.core/declare ser-minimum-protocol-version)

(clojure.core/declare ser-origins)

(clojure.core/declare ser-distribution-config-with-tags)

(clojure.core/declare ser-header-list)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-ssl-support-method)

(clojure.core/declare ser-http-version)

(clojure.core/declare ser-cookie-preference)

(clojure.core/declare ser-custom-headers)

(clojure.core/declare ser-methods-list)

(clojure.core/declare ser-default-cache-behavior)

(clojure.core/declare ser-trusted-signers)

(clojure.core/declare ser-viewer-certificate)

(clojure.core/declare ser-cloud-front-origin-access-identity-config)

(clojure.core/declare ser-geo-restriction)

(clojure.core/defn- ser-tag-keys [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "TagKeys", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key-list (input :items)) #:http.request.field{:name "Items", :shape "TagKeyList"}))))

(clojure.core/defn- serboolean [input] #:http.request.field{:value input, :shape "boolean"})

(clojure.core/defn- ser-cookie-names [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CookieNames", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-name-list (input :items)) #:http.request.field{:name "Items", :shape "CookieNameList"}))))

(clojure.core/defn- ser-content-type-profile [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-format (:format input)) #:http.request.field{:name "Format", :shape "Format"}) (clojure.core/into (serstring (:content-type input)) #:http.request.field{:name "ContentType", :shape "string"})], :shape "ContentTypeProfile", :type "structure"} (clojure.core/contains? input :profile-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :profile-id)) #:http.request.field{:name "ProfileId", :shape "string"}))))

(clojure.core/defn- ser-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serboolean (:include-cookies input)) #:http.request.field{:name "IncludeCookies", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "LoggingConfig", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-streaming-distribution-config (:streaming-distribution-config input)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "StreamingDistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-custom-error-response-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-custom-error-response coll) #:http.request.field{:shape "CustomErrorResponse", :location-name "CustomErrorResponse"}))) input), :shape "CustomErrorResponseList", :type "list"})

(clojure.core/defn- ser-certificate-source [input] #:http.request.field{:value (clojure.core/get {"cloudfront" "cloudfront", :cloudfront "cloudfront", "iam" "iam", :iam "iam", "acm" "acm", :acm "acm"} input), :shape "CertificateSource"})

(clojure.core/defn- ser-location-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Location"}))) input), :shape "LocationList", :type "list"})

(clojure.core/defn- ser-field-patterns [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "FieldPatterns", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-field-pattern-list (input :items)) #:http.request.field{:name "Items", :shape "FieldPatternList"}))))

(clojure.core/defn- ser-restrictions [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction (:geo-restriction input)) #:http.request.field{:name "GeoRestriction", :shape "GeoRestriction"})], :shape "Restrictions", :type "structure"}))

(clojure.core/defn- ser-field-level-encryption-profile-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:name input)) #:http.request.field{:name "Name", :shape "string"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-encryption-entities (:encryption-entities input)) #:http.request.field{:name "EncryptionEntities", :shape "EncryptionEntities"})], :shape "FieldLevelEncryptionProfileConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :comment)) #:http.request.field{:name "Comment", :shape "string"}))))

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-field-level-encryption-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "FieldLevelEncryptionConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :comment)) #:http.request.field{:name "Comment", :shape "string"})) (clojure.core/contains? input :query-arg-profile-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-arg-profile-config (input :query-arg-profile-config)) #:http.request.field{:name "QueryArgProfileConfig", :shape "QueryArgProfileConfig"})) (clojure.core/contains? input :content-type-profile-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type-profile-config (input :content-type-profile-config)) #:http.request.field{:name "ContentTypeProfileConfig", :shape "ContentTypeProfileConfig"}))))

(clojure.core/defn- ser-query-arg-profile [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:query-arg input)) #:http.request.field{:name "QueryArg", :shape "string"}) (clojure.core/into (serstring (:profile-id input)) #:http.request.field{:name "ProfileId", :shape "string"})], :shape "QueryArgProfile", :type "structure"}))

(clojure.core/defn- ser-lambda-function-association [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lambda-function-arn (:lambda-function-arn input)) #:http.request.field{:name "LambdaFunctionARN", :shape "LambdaFunctionARN"}) (clojure.core/into (ser-event-type (:event-type input)) #:http.request.field{:name "EventType", :shape "EventType"})], :shape "LambdaFunctionAssociation", :type "structure"} (clojure.core/contains? input :include-body) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :include-body)) #:http.request.field{:name "IncludeBody", :shape "boolean"}))))

(clojure.core/defn- ser-forwarded-values [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:query-string input)) #:http.request.field{:name "QueryString", :shape "boolean"}) (clojure.core/into (ser-cookie-preference (:cookies input)) #:http.request.field{:name "Cookies", :shape "CookiePreference"})], :shape "ForwardedValues", :type "structure"} (clojure.core/contains? input :headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-headers (input :headers)) #:http.request.field{:name "Headers", :shape "Headers"})) (clojure.core/contains? input :query-string-cache-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys (input :query-string-cache-keys)) #:http.request.field{:name "QueryStringCacheKeys", :shape "QueryStringCacheKeys"}))))

(clojure.core/defn- ser-invalidation-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-paths (:paths input)) #:http.request.field{:name "Paths", :shape "Paths"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "InvalidationBatch", :type "structure"}))

(clojure.core/defn- ser-query-string-cache-keys-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "QueryStringCacheKeysList", :type "list"})

(clojure.core/defn- ser-public-key-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (serstring (:name input)) #:http.request.field{:name "Name", :shape "string"}) (clojure.core/into (serstring (:encoded-key input)) #:http.request.field{:name "EncodedKey", :shape "string"})], :shape "PublicKeyConfig", :type "structure"} (clojure.core/contains? input :comment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :comment)) #:http.request.field{:name "Comment", :shape "string"}))))

(clojure.core/defn- ser-item-selection [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "whitelist" "whitelist", :whitelist "whitelist", "all" "all", :all "all"} input), :shape "ItemSelection"})

(clojure.core/defn- ser-encryption-entity-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-encryption-entity coll) #:http.request.field{:shape "EncryptionEntity", :location-name "EncryptionEntity"}))) input), :shape "EncryptionEntityList", :type "list"})

(clojure.core/defn- ser-lambda-function-associations [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "LambdaFunctionAssociations", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-association-list (input :items)) #:http.request.field{:name "Items", :shape "LambdaFunctionAssociationList"}))))

(clojure.core/defn- ser-encryption-entities [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "EncryptionEntities", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-entity-list (input :items)) #:http.request.field{:name "Items", :shape "EncryptionEntityList"}))))

(clojure.core/defn- ser-viewer-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"allow-all" "allow-all", :allowall "allow-all", "https-only" "https-only", :httpsonly "https-only", "redirect-to-https" "redirect-to-https", :redirecttohttps "redirect-to-https"} input), :shape "ViewerProtocolPolicy"})

(clojure.core/defn- ser-content-type-profile-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-content-type-profile coll) #:http.request.field{:shape "ContentTypeProfile", :location-name "ContentTypeProfile"}))) input), :shape "ContentTypeProfileList", :type "list"})

(clojure.core/defn- ser-custom-error-response [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:error-code input)) #:http.request.field{:name "ErrorCode", :shape "integer"})], :shape "CustomErrorResponse", :type "structure"} (clojure.core/contains? input :response-page-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-page-path)) #:http.request.field{:name "ResponsePagePath", :shape "string"})) (clojure.core/contains? input :response-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-code)) #:http.request.field{:name "ResponseCode", :shape "string"})) (clojure.core/contains? input :error-caching-min-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :error-caching-min-ttl)) #:http.request.field{:name "ErrorCachingMinTTL", :shape "long"}))))

(clojure.core/defn- serlong [input] #:http.request.field{:value input, :shape "long"})

(clojure.core/defn- ser-origin-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin coll) #:http.request.field{:shape "Origin", :location-name "Origin"}))) input), :shape "OriginList", :type "list", :min 1})

(clojure.core/defn- ser-content-type-profile-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:forward-when-content-type-is-unknown input)) #:http.request.field{:name "ForwardWhenContentTypeIsUnknown", :shape "boolean"})], :shape "ContentTypeProfileConfig", :type "structure"} (clojure.core/contains? input :content-type-profiles) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type-profiles (input :content-type-profiles)) #:http.request.field{:name "ContentTypeProfiles", :shape "ContentTypeProfiles"}))))

(clojure.core/defn- ser-cached-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "CachedMethods", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tags", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :items)) #:http.request.field{:name "Items", :shape "TagList"}))))

(clojure.core/defn- ser-query-arg-profile-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-query-arg-profile coll) #:http.request.field{:shape "QueryArgProfile", :location-name "QueryArgProfile"}))) input), :shape "QueryArgProfileList", :type "list"})

(clojure.core/defn- ser-cache-behaviors [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CacheBehaviors", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behavior-list (input :items)) #:http.request.field{:name "Items", :shape "CacheBehaviorList"}))))

(clojure.core/defn- ser-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:path-pattern input)) #:http.request.field{:name "PathPattern", :shape "string"}) (clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "CacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :field-level-encryption-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-level-encryption-id)) #:http.request.field{:name "FieldLevelEncryptionId", :shape "string"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:id input)) #:http.request.field{:name "Id", :shape "string"}) (clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"})], :shape "Origin", :type "structure"} (clojure.core/contains? input :origin-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :origin-path)) #:http.request.field{:name "OriginPath", :shape "string"})) (clojure.core/contains? input :custom-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-headers (input :custom-headers)) #:http.request.field{:name "CustomHeaders", :shape "CustomHeaders"})) (clojure.core/contains? input :s-3-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-origin-config (input :s-3-origin-config)) #:http.request.field{:name "S3OriginConfig", :shape "S3OriginConfig"})) (clojure.core/contains? input :custom-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-origin-config (input :custom-origin-config)) #:http.request.field{:name "CustomOriginConfig", :shape "CustomOriginConfig"}))))

(clojure.core/defn- ser-format [input] #:http.request.field{:value (clojure.core/get {"URLEncoded" "URLEncoded", :url-encoded "URLEncoded"} input), :shape "Format"})

(clojure.core/defn- ser-custom-error-responses [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomErrorResponses", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-response-list (input :items)) #:http.request.field{:name "Items", :shape "CustomErrorResponseList"}))))

(clojure.core/defn- ser-origin-ssl-protocols [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-ssl-protocols-list (:items input)) #:http.request.field{:name "Items", :shape "SslProtocolsList"})], :shape "OriginSslProtocols", :type "structure"}))

(clojure.core/defn- ser-aliases [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Aliases", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-list (input :items)) #:http.request.field{:name "Items", :shape "AliasList"}))))

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {"viewer-request" "viewer-request", :viewerrequest "viewer-request", "viewer-response" "viewer-response", :viewerresponse "viewer-response", "origin-request" "origin-request", :originrequest "origin-request", "origin-response" "origin-response", :originresponse "origin-response"} input), :shape "EventType"})

(clojure.core/defn- ser-content-type-profiles [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "ContentTypeProfiles", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type-profile-list (input :items)) #:http.request.field{:name "Items", :shape "ContentTypeProfileList"}))))

(clojure.core/defn- ser-encryption-entity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:public-key-id input)) #:http.request.field{:name "PublicKeyId", :shape "string"}) (clojure.core/into (serstring (:provider-id input)) #:http.request.field{:name "ProviderId", :shape "string"}) (clojure.core/into (ser-field-patterns (:field-patterns input)) #:http.request.field{:name "FieldPatterns", :shape "FieldPatterns"})], :shape "EncryptionEntity", :type "structure"}))

(clojure.core/defn- ser-lambda-function-arn [input] #:http.request.field{:value input, :shape "LambdaFunctionARN"})

(clojure.core/defn- ser-allowed-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "AllowedMethods", :type "structure"} (clojure.core/contains? input :cached-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cached-methods (input :cached-methods)) #:http.request.field{:name "CachedMethods", :shape "CachedMethods"}))))

(clojure.core/defn- ser-price-class [input] #:http.request.field{:value (clojure.core/get {"PriceClass_100" "PriceClass_100", :price-class-100 "PriceClass_100", "PriceClass_200" "PriceClass_200", :price-class-200 "PriceClass_200", "PriceClass_All" "PriceClass_All", :price-class-all "PriceClass_All"} input), :shape "PriceClass"})

(clojure.core/defn- ser-custom-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:http-port input)) #:http.request.field{:name "HTTPPort", :shape "integer"}) (clojure.core/into (serinteger (:https-port input)) #:http.request.field{:name "HTTPSPort", :shape "integer"}) (clojure.core/into (ser-origin-protocol-policy (:origin-protocol-policy input)) #:http.request.field{:name "OriginProtocolPolicy", :shape "OriginProtocolPolicy"})], :shape "CustomOriginConfig", :type "structure"} (clojure.core/contains? input :origin-ssl-protocols) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-ssl-protocols (input :origin-ssl-protocols)) #:http.request.field{:name "OriginSslProtocols", :shape "OriginSslProtocols"})) (clojure.core/contains? input :origin-read-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serinteger (input :origin-read-timeout)) #:http.request.field{:name "OriginReadTimeout", :shape "integer"})) (clojure.core/contains? input :origin-keepalive-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serinteger (input :origin-keepalive-timeout)) #:http.request.field{:name "OriginKeepaliveTimeout", :shape "integer"}))))

(clojure.core/defn- ser-s-3-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"}) (clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3Origin", :type "structure"}))

(clojure.core/defn- ser-cookie-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "CookieNameList", :type "list"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag", :location-name "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-query-string-cache-keys [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "QueryStringCacheKeys", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys-list (input :items)) #:http.request.field{:name "Items", :shape "QueryStringCacheKeysList"}))))

(clojure.core/defn- ser-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-origins (:origins input)) #:http.request.field{:name "Origins", :shape "Origins"}) (clojure.core/into (ser-default-cache-behavior (:default-cache-behavior input)) #:http.request.field{:name "DefaultCacheBehavior", :shape "DefaultCacheBehavior"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "DistributionConfig", :type "structure"} (clojure.core/contains? input :default-root-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :default-root-object)) #:http.request.field{:name "DefaultRootObject", :shape "string"})) (clojure.core/contains? input :is-ipv-6-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :is-ipv-6-enabled)) #:http.request.field{:name "IsIPV6Enabled", :shape "boolean"})) (clojure.core/contains? input :restrictions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restrictions (input :restrictions)) #:http.request.field{:name "Restrictions", :shape "Restrictions"})) (clojure.core/contains? input :web-acl-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "LoggingConfig"})) (clojure.core/contains? input :cache-behaviors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behaviors (input :cache-behaviors)) #:http.request.field{:name "CacheBehaviors", :shape "CacheBehaviors"})) (clojure.core/contains? input :custom-error-responses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-responses (input :custom-error-responses)) #:http.request.field{:name "CustomErrorResponses", :shape "CustomErrorResponses"})) (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"})) (clojure.core/contains? input :http-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-version (input :http-version)) #:http.request.field{:name "HttpVersion", :shape "HttpVersion"})) (clojure.core/contains? input :viewer-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-viewer-certificate (input :viewer-certificate)) #:http.request.field{:name "ViewerCertificate", :shape "ViewerCertificate"}))))

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey", :location-name "Key"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-ssl-protocols-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ssl-protocol coll) #:http.request.field{:shape "SslProtocol", :location-name "SslProtocol"}))) input), :shape "SslProtocolsList", :type "list"})

(clojure.core/defn- ser-aws-account-number-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "AwsAccountNumber"}))) input), :shape "AwsAccountNumberList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-method [input] #:http.request.field{:value (clojure.core/get {"DELETE" "DELETE", :get "GET", "OPTIONS" "OPTIONS", :patch "PATCH", "PATCH" "PATCH", :delete "DELETE", :head "HEAD", "HEAD" "HEAD", "POST" "POST", :post "POST", :options "OPTIONS", :put "PUT", "GET" "GET", "PUT" "PUT"} input), :shape "Method"})

(clojure.core/defn- ser-alias-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "CNAME"}))) input), :shape "AliasList", :type "list"})

(clojure.core/defn- ser-origin-custom-headers-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin-custom-header coll) #:http.request.field{:shape "OriginCustomHeader", :location-name "OriginCustomHeader"}))) input), :shape "OriginCustomHeadersList", :type "list"})

(clojure.core/defn- ser-query-arg-profile-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:forward-when-query-arg-profile-is-unknown input)) #:http.request.field{:name "ForwardWhenQueryArgProfileIsUnknown", :shape "boolean"})], :shape "QueryArgProfileConfig", :type "structure"} (clojure.core/contains? input :query-arg-profiles) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-arg-profiles (input :query-arg-profiles)) #:http.request.field{:name "QueryArgProfiles", :shape "QueryArgProfiles"}))))

(clojure.core/defn- ser-origin-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"http-only" "http-only", :httponly "http-only", "match-viewer" "match-viewer", :matchviewer "match-viewer", "https-only" "https-only", :httpsonly "https-only"} input), :shape "OriginProtocolPolicy"})

(clojure.core/defn- ser-query-arg-profiles [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "QueryArgProfiles", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-arg-profile-list (input :items)) #:http.request.field{:name "Items", :shape "QueryArgProfileList"}))))

(clojure.core/defn- ser-path-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Path"}))) input), :shape "PathList", :type "list"})

(clojure.core/defn- ser-geo-restriction-type [input] #:http.request.field{:value (clojure.core/get {"blacklist" "blacklist", :blacklist "blacklist", "whitelist" "whitelist", :whitelist "whitelist", "none" "none", :none "none"} input), :shape "GeoRestrictionType"})

(clojure.core/defn- ser-paths [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Paths", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path-list (input :items)) #:http.request.field{:name "Items", :shape "PathList"}))))

(clojure.core/defn- serinteger [input] #:http.request.field{:value input, :shape "integer"})

(clojure.core/defn- ser-cache-behavior-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cache-behavior coll) #:http.request.field{:shape "CacheBehavior", :location-name "CacheBehavior"}))) input), :shape "CacheBehaviorList", :type "list"})

(clojure.core/defn- ser-origin-custom-header [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:header-name input)) #:http.request.field{:name "HeaderName", :shape "string"}) (clojure.core/into (serstring (:header-value input)) #:http.request.field{:name "HeaderValue", :shape "string"})], :shape "OriginCustomHeader", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-s-3-origin (:s-3-origin input)) #:http.request.field{:name "S3Origin", :shape "S3Origin"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "StreamingDistributionConfig", :type "structure"} (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-streaming-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "StreamingLoggingConfig"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"}))))

(clojure.core/defn- ser-field-pattern-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "FieldPattern"}))) input), :shape "FieldPatternList", :type "list"})

(clojure.core/defn- ser-s-3-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3OriginConfig", :type "structure"}))

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-streaming-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "StreamingLoggingConfig", :type "structure"}))

(clojure.core/defn- ser-ssl-protocol [input] #:http.request.field{:value (clojure.core/get {"SSLv3" "SSLv3", :ss-lv-3 "SSLv3", "TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1.1" "TLSv1.1", :tl-sv-11 "TLSv1.1", "TLSv1.2" "TLSv1.2", :tl-sv-12 "TLSv1.2"} input), :shape "SslProtocol"})

(clojure.core/defn- ser-lambda-function-association-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lambda-function-association coll) #:http.request.field{:shape "LambdaFunctionAssociation", :location-name "LambdaFunctionAssociation"}))) input), :shape "LambdaFunctionAssociationList", :type "list"})

(clojure.core/defn- ser-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Headers", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-header-list (input :items)) #:http.request.field{:name "Items", :shape "HeaderList"}))))

(clojure.core/defn- ser-minimum-protocol-version [input] #:http.request.field{:value (clojure.core/get {"TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1_2016" "TLSv1_2016", :tl-sv-12-2018 "TLSv1.2_2018", :ss-lv-3 "SSLv3", "TLSv1.2_2018" "TLSv1.2_2018", "SSLv3" "SSLv3", :tl-sv-11-2016 "TLSv1.1_2016", :tl-sv-1-2016 "TLSv1_2016", "TLSv1.1_2016" "TLSv1.1_2016"} input), :shape "MinimumProtocolVersion"})

(clojure.core/defn- ser-origins [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Origins", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-list (input :items)) #:http.request.field{:name "Items", :shape "OriginList"}))))

(clojure.core/defn- ser-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-distribution-config (:distribution-config input)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "DistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-header-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "HeaderList", :type "list"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-ssl-support-method [input] #:http.request.field{:value (clojure.core/get {"sni-only" "sni-only", :snionly "sni-only", "vip" "vip", :vip "vip"} input), :shape "SSLSupportMethod"})

(clojure.core/defn- ser-http-version [input] #:http.request.field{:value (clojure.core/get {"http1.1" "http1.1", :http-11 "http1.1", "http2" "http2", :http-2 "http2"} input), :shape "HttpVersion"})

(clojure.core/defn- ser-cookie-preference [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-item-selection (:forward input)) #:http.request.field{:name "Forward", :shape "ItemSelection"})], :shape "CookiePreference", :type "structure"} (clojure.core/contains? input :whitelisted-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-names (input :whitelisted-names)) #:http.request.field{:name "WhitelistedNames", :shape "CookieNames"}))))

(clojure.core/defn- ser-custom-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomHeaders", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-custom-headers-list (input :items)) #:http.request.field{:name "Items", :shape "OriginCustomHeadersList"}))))

(clojure.core/defn- ser-methods-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-method coll) #:http.request.field{:shape "Method", :location-name "Method"}))) input), :shape "MethodsList", :type "list"})

(clojure.core/defn- ser-default-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "DefaultCacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :field-level-encryption-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-level-encryption-id)) #:http.request.field{:name "FieldLevelEncryptionId", :shape "string"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-trusted-signers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "TrustedSigners", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-number-list (input :items)) #:http.request.field{:name "Items", :shape "AwsAccountNumberList"}))))

(clojure.core/defn- ser-viewer-certificate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ViewerCertificate", :type "structure"} (clojure.core/contains? input :cloud-front-default-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :cloud-front-default-certificate)) #:http.request.field{:name "CloudFrontDefaultCertificate", :shape "boolean"})) (clojure.core/contains? input :iam-certificate-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :iam-certificate-id)) #:http.request.field{:name "IAMCertificateId", :shape "string"})) (clojure.core/contains? input :acm-certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :acm-certificate-arn)) #:http.request.field{:name "ACMCertificateArn", :shape "string"})) (clojure.core/contains? input :ssl-support-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-support-method (input :ssl-support-method)) #:http.request.field{:name "SSLSupportMethod", :shape "SSLSupportMethod"})) (clojure.core/contains? input :minimum-protocol-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-protocol-version (input :minimum-protocol-version)) #:http.request.field{:name "MinimumProtocolVersion", :shape "MinimumProtocolVersion"})) (clojure.core/contains? input :certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :certificate)) #:http.request.field{:name "Certificate", :shape "string", :deprecated true})) (clojure.core/contains? input :certificate-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-source (input :certificate-source)) #:http.request.field{:name "CertificateSource", :shape "CertificateSource", :deprecated true}))))

(clojure.core/defn- ser-cloud-front-origin-access-identity-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"})], :shape "CloudFrontOriginAccessIdentityConfig", :type "structure"}))

(clojure.core/defn- ser-geo-restriction [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction-type (:restriction-type input)) #:http.request.field{:name "RestrictionType", :shape "GeoRestrictionType"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "GeoRestriction", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location-list (input :items)) #:http.request.field{:name "Items", :shape "LocationList"}))))

(clojure.core/defn- req-list-distributions-by-web-acl-id-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string", :location "uri", :location-name "WebACLId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-create-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-profile-config (input :field-level-encryption-profile-config)) #:http.request.field{:name "FieldLevelEncryptionProfileConfig", :shape "FieldLevelEncryptionProfileConfig", :location-name "FieldLevelEncryptionProfileConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-create-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-config (input :field-level-encryption-config)) #:http.request.field{:name "FieldLevelEncryptionConfig", :shape "FieldLevelEncryptionConfig", :location-name "FieldLevelEncryptionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-get-streaming-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-public-key-config (input :public-key-config)) #:http.request.field{:name "PublicKeyConfig", :shape "PublicKeyConfig", :location-name "PublicKeyConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-public-key-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})]}))

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-get-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-field-level-encryption-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-get-field-level-encryption-profile-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-list-field-level-encryption-configs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-update-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-config (input :field-level-encryption-config)) #:http.request.field{:name "FieldLevelEncryptionConfig", :shape "FieldLevelEncryptionConfig", :location-name "FieldLevelEncryptionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-field-level-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-public-keys-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-profile-config (input :field-level-encryption-profile-config)) #:http.request.field{:name "FieldLevelEncryptionProfileConfig", :shape "FieldLevelEncryptionProfileConfig", :location-name "FieldLevelEncryptionProfileConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-delete-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-public-key-config (input :public-key-config)) #:http.request.field{:name "PublicKeyConfig", :shape "PublicKeyConfig", :location-name "PublicKeyConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-06-18/"}})]}))

(clojure.core/defn- req-list-cloud-front-origin-access-identities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/declare deserboolean)

(clojure.core/declare deser-cookie-names)

(clojure.core/declare deser-content-type-profile)

(clojure.core/declare deser-logging-config)

(clojure.core/declare deser-invalidation-summary)

(clojure.core/declare deser-custom-error-response-list)

(clojure.core/declare deser-invalidation)

(clojure.core/declare deser-certificate-source)

(clojure.core/declare deser-location-list)

(clojure.core/declare deser-key-pair-id-list)

(clojure.core/declare deser-field-patterns)

(clojure.core/declare deser-restrictions)

(clojure.core/declare deser-field-level-encryption-profile-config)

(clojure.core/declare deserstring)

(clojure.core/declare deser-field-level-encryption-config)

(clojure.core/declare deser-field-level-encryption-profile)

(clojure.core/declare deser-distribution)

(clojure.core/declare deser-cloud-front-origin-access-identity-list)

(clojure.core/declare deser-query-arg-profile)

(clojure.core/declare deser-lambda-function-association)

(clojure.core/declare deser-forwarded-values)

(clojure.core/declare deser-invalidation-batch)

(clojure.core/declare deser-invalidation-summary-list)

(clojure.core/declare deser-query-string-cache-keys-list)

(clojure.core/declare deser-streaming-distribution-list)

(clojure.core/declare deser-public-key-config)

(clojure.core/declare deser-item-selection)

(clojure.core/declare deser-encryption-entity-list)

(clojure.core/declare deser-streaming-distribution)

(clojure.core/declare deser-lambda-function-associations)

(clojure.core/declare deser-encryption-entities)

(clojure.core/declare deser-viewer-protocol-policy)

(clojure.core/declare deser-field-level-encryption-profile-summary)

(clojure.core/declare deser-content-type-profile-list)

(clojure.core/declare deser-custom-error-response)

(clojure.core/declare deser-distribution-summary-list)

(clojure.core/declare deser-signer)

(clojure.core/declare deserlong)

(clojure.core/declare deser-origin-list)

(clojure.core/declare deser-field-level-encryption-profile-list)

(clojure.core/declare deser-content-type-profile-config)

(clojure.core/declare deser-cached-methods)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-streaming-distribution-summary-list)

(clojure.core/declare deser-query-arg-profile-list)

(clojure.core/declare deser-cache-behaviors)

(clojure.core/declare deser-cache-behavior)

(clojure.core/declare deser-active-trusted-signers)

(clojure.core/declare deser-origin)

(clojure.core/declare desertimestamp)

(clojure.core/declare deser-format)

(clojure.core/declare deser-custom-error-responses)

(clojure.core/declare deser-invalidation-list)

(clojure.core/declare deser-origin-ssl-protocols)

(clojure.core/declare deser-aliases)

(clojure.core/declare deser-event-type)

(clojure.core/declare deser-content-type-profiles)

(clojure.core/declare deser-encryption-entity)

(clojure.core/declare deser-lambda-function-arn)

(clojure.core/declare deser-allowed-methods)

(clojure.core/declare deser-price-class)

(clojure.core/declare deser-custom-origin-config)

(clojure.core/declare deser-s-3-origin)

(clojure.core/declare deser-streaming-distribution-summary)

(clojure.core/declare deser-cloud-front-origin-access-identity)

(clojure.core/declare deser-cookie-name-list)

(clojure.core/declare deser-field-level-encryption)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-query-string-cache-keys)

(clojure.core/declare deser-key-pair-ids)

(clojure.core/declare deser-distribution-config)

(clojure.core/declare deser-public-key-summary)

(clojure.core/declare deser-ssl-protocols-list)

(clojure.core/declare deser-aws-account-number-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-method)

(clojure.core/declare deser-alias-list)

(clojure.core/declare deser-origin-custom-headers-list)

(clojure.core/declare deser-query-arg-profile-config)

(clojure.core/declare deser-origin-protocol-policy)

(clojure.core/declare deser-signer-list)

(clojure.core/declare deser-query-arg-profiles)

(clojure.core/declare deser-path-list)

(clojure.core/declare deser-geo-restriction-type)

(clojure.core/declare deser-paths)

(clojure.core/declare deser-field-level-encryption-summary-list)

(clojure.core/declare deserinteger)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary)

(clojure.core/declare deser-cache-behavior-list)

(clojure.core/declare deser-origin-custom-header)

(clojure.core/declare deser-streaming-distribution-config)

(clojure.core/declare deser-public-key-summary-list)

(clojure.core/declare deser-field-pattern-list)

(clojure.core/declare deser-s-3-origin-config)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-streaming-logging-config)

(clojure.core/declare deser-field-level-encryption-summary)

(clojure.core/declare deser-distribution-summary)

(clojure.core/declare deser-ssl-protocol)

(clojure.core/declare deser-lambda-function-association-list)

(clojure.core/declare deser-headers)

(clojure.core/declare deser-minimum-protocol-version)

(clojure.core/declare deser-origins)

(clojure.core/declare deser-header-list)

(clojure.core/declare deser-distribution-list)

(clojure.core/declare deser-ssl-support-method)

(clojure.core/declare deser-http-version)

(clojure.core/declare deser-cookie-preference)

(clojure.core/declare deser-custom-headers)

(clojure.core/declare deser-methods-list)

(clojure.core/declare deser-public-key-list)

(clojure.core/declare deser-default-cache-behavior)

(clojure.core/declare deser-trusted-signers)

(clojure.core/declare deser-field-level-encryption-list)

(clojure.core/declare deser-public-key)

(clojure.core/declare deser-field-level-encryption-profile-summary-list)

(clojure.core/declare deser-viewer-certificate)

(clojure.core/declare deser-cloud-front-origin-access-identity-config)

(clojure.core/declare deser-geo-restriction)

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar135104 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar135104 ["Quantity" :content]))} (letvar135104 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar135104 ["Items" :content]))))))

(clojure.core/defn- deser-content-type-profile [input] (clojure.core/let [letvar135200 {"Format" (portkey.aws/search-for-tag input "Format" :flattened? false :xmlAttribute? nil), "ProfileId" (portkey.aws/search-for-tag input "ProfileId" :flattened? false :xmlAttribute? nil), "ContentType" (portkey.aws/search-for-tag input "ContentType" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:format (deser-format (clojure.core/get-in letvar135200 ["Format" :content])), :content-type (deserstring (clojure.core/get-in letvar135200 ["ContentType" :content]))} (letvar135200 "ProfileId") (clojure.core/assoc :profile-id (deserstring (clojure.core/get-in letvar135200 ["ProfileId" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar135296 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar135296 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar135296 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar135296 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar135296 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar135392 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar135392 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar135392 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar135392 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar135505 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar135505 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar135505 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar135505 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar135505 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-field-patterns [input] (clojure.core/let [letvar135640 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar135640 ["Quantity" :content]))} (letvar135640 "Items") (clojure.core/assoc :items (deser-field-pattern-list (clojure.core/get-in letvar135640 ["Items" :content]))))))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar135736 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar135736 ["GeoRestriction" :content]))})))

(clojure.core/defn- deser-field-level-encryption-profile-config [input] (clojure.core/let [letvar135832 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "EncryptionEntities" (portkey.aws/search-for-tag input "EncryptionEntities" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deserstring (clojure.core/get-in letvar135832 ["Name" :content])), :caller-reference (deserstring (clojure.core/get-in letvar135832 ["CallerReference" :content])), :encryption-entities (deser-encryption-entities (clojure.core/get-in letvar135832 ["EncryptionEntities" :content]))} (letvar135832 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar135832 ["Comment" :content]))))))

(clojure.core/defn- deserstring [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-field-level-encryption-config [input] (clojure.core/let [letvar135933 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "QueryArgProfileConfig" (portkey.aws/search-for-tag input "QueryArgProfileConfig" :flattened? false :xmlAttribute? nil), "ContentTypeProfileConfig" (portkey.aws/search-for-tag input "ContentTypeProfileConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar135933 ["CallerReference" :content]))} (letvar135933 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar135933 ["Comment" :content]))) (letvar135933 "QueryArgProfileConfig") (clojure.core/assoc :query-arg-profile-config (deser-query-arg-profile-config (clojure.core/get-in letvar135933 ["QueryArgProfileConfig" :content]))) (letvar135933 "ContentTypeProfileConfig") (clojure.core/assoc :content-type-profile-config (deser-content-type-profile-config (clojure.core/get-in letvar135933 ["ContentTypeProfileConfig" :content]))))))

(clojure.core/defn- deser-field-level-encryption-profile [input] (clojure.core/let [letvar136029 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "FieldLevelEncryptionProfileConfig" (portkey.aws/search-for-tag input "FieldLevelEncryptionProfileConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar136029 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar136029 ["LastModifiedTime" :content])), :field-level-encryption-profile-config (deser-field-level-encryption-profile-config (clojure.core/get-in letvar136029 ["FieldLevelEncryptionProfileConfig" :content]))})))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar136125 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar136125 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar136125 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar136125 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar136125 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar136125 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar136125 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar136125 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar136125 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar136221 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar136221 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar136221 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar136221 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar136221 ["Quantity" :content]))} (letvar136221 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar136221 ["NextMarker" :content]))) (letvar136221 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar136221 ["Items" :content]))))))

(clojure.core/defn- deser-query-arg-profile [input] (clojure.core/let [letvar136317 {"QueryArg" (portkey.aws/search-for-tag input "QueryArg" :flattened? false :xmlAttribute? nil), "ProfileId" (portkey.aws/search-for-tag input "ProfileId" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-arg (deserstring (clojure.core/get-in letvar136317 ["QueryArg" :content])), :profile-id (deserstring (clojure.core/get-in letvar136317 ["ProfileId" :content]))})))

(clojure.core/defn- deser-lambda-function-association [input] (clojure.core/let [letvar136413 {"LambdaFunctionARN" (portkey.aws/search-for-tag input "LambdaFunctionARN" :flattened? false :xmlAttribute? nil), "EventType" (portkey.aws/search-for-tag input "EventType" :flattened? false :xmlAttribute? nil), "IncludeBody" (portkey.aws/search-for-tag input "IncludeBody" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:lambda-function-arn (deser-lambda-function-arn (clojure.core/get-in letvar136413 ["LambdaFunctionARN" :content])), :event-type (deser-event-type (clojure.core/get-in letvar136413 ["EventType" :content]))} (letvar136413 "IncludeBody") (clojure.core/assoc :include-body (deserboolean (clojure.core/get-in letvar136413 ["IncludeBody" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar136509 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? false :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? false :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? false :xmlAttribute? nil), "QueryStringCacheKeys" (portkey.aws/search-for-tag input "QueryStringCacheKeys" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar136509 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar136509 ["Cookies" :content]))} (letvar136509 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar136509 ["Headers" :content]))) (letvar136509 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar136509 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar136605 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar136605 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar136605 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar136735 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar136735 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar136735 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar136735 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar136735 ["Quantity" :content]))} (letvar136735 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar136735 ["NextMarker" :content]))) (letvar136735 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar136735 ["Items" :content]))))))

(clojure.core/defn- deser-public-key-config [input] (clojure.core/let [letvar136831 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "EncodedKey" (portkey.aws/search-for-tag input "EncodedKey" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar136831 ["CallerReference" :content])), :name (deserstring (clojure.core/get-in letvar136831 ["Name" :content])), :encoded-key (deserstring (clojure.core/get-in letvar136831 ["EncodedKey" :content]))} (letvar136831 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar136831 ["Comment" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-encryption-entity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-encryption-entity coll))) input))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar136949 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar136949 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar136949 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar136949 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar136949 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar136949 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar136949 ["StreamingDistributionConfig" :content]))} (letvar136949 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar136949 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-lambda-function-associations [input] (clojure.core/let [letvar137045 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar137045 ["Quantity" :content]))} (letvar137045 "Items") (clojure.core/assoc :items (deser-lambda-function-association-list (clojure.core/get-in letvar137045 ["Items" :content]))))))

(clojure.core/defn- deser-encryption-entities [input] (clojure.core/let [letvar137141 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar137141 ["Quantity" :content]))} (letvar137141 "Items") (clojure.core/assoc :items (deser-encryption-entity-list (clojure.core/get-in letvar137141 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-field-level-encryption-profile-summary [input] (clojure.core/let [letvar137242 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "EncryptionEntities" (portkey.aws/search-for-tag input "EncryptionEntities" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar137242 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar137242 ["LastModifiedTime" :content])), :name (deserstring (clojure.core/get-in letvar137242 ["Name" :content])), :encryption-entities (deser-encryption-entities (clojure.core/get-in letvar137242 ["EncryptionEntities" :content]))} (letvar137242 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar137242 ["Comment" :content]))))))

(clojure.core/defn- deser-content-type-profile-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-content-type-profile coll))) input))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar137355 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? false :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? false :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? false :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar137355 ["ErrorCode" :content]))} (letvar137355 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar137355 ["ResponsePagePath" :content]))) (letvar137355 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar137355 ["ResponseCode" :content]))) (letvar137355 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar137355 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar137468 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? false :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar137468 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar137468 ["AwsAccountNumber" :content]))) (letvar137468 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar137468 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-field-level-encryption-profile-list [input] (clojure.core/let [letvar137583 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar137583 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar137583 ["Quantity" :content]))} (letvar137583 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar137583 ["NextMarker" :content]))) (letvar137583 "Items") (clojure.core/assoc :items (deser-field-level-encryption-profile-summary-list (clojure.core/get-in letvar137583 ["Items" :content]))))))

(clojure.core/defn- deser-content-type-profile-config [input] (clojure.core/let [letvar137679 {"ForwardWhenContentTypeIsUnknown" (portkey.aws/search-for-tag input "ForwardWhenContentTypeIsUnknown" :flattened? false :xmlAttribute? nil), "ContentTypeProfiles" (portkey.aws/search-for-tag input "ContentTypeProfiles" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward-when-content-type-is-unknown (deserboolean (clojure.core/get-in letvar137679 ["ForwardWhenContentTypeIsUnknown" :content]))} (letvar137679 "ContentTypeProfiles") (clojure.core/assoc :content-type-profiles (deser-content-type-profiles (clojure.core/get-in letvar137679 ["ContentTypeProfiles" :content]))))))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar137775 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar137775 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar137775 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar137876 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar137876 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar137876 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-query-arg-profile-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-arg-profile coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar138006 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar138006 ["Quantity" :content]))} (letvar138006 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar138006 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar138102 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "FieldLevelEncryptionId" (portkey.aws/search-for-tag input "FieldLevelEncryptionId" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar138102 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar138102 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar138102 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar138102 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar138102 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar138102 ["MinTTL" :content]))} (letvar138102 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar138102 ["SmoothStreaming" :content]))) (letvar138102 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar138102 ["FieldLevelEncryptionId" :content]))) (letvar138102 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar138102 ["Compress" :content]))) (letvar138102 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar138102 ["LambdaFunctionAssociations" :content]))) (letvar138102 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar138102 ["MaxTTL" :content]))) (letvar138102 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar138102 ["AllowedMethods" :content]))) (letvar138102 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar138102 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar138198 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar138198 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar138198 ["Quantity" :content]))} (letvar138198 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar138198 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar138294 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? false :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? false :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? false :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar138294 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar138294 ["DomainName" :content]))} (letvar138294 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar138294 ["OriginPath" :content]))) (letvar138294 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar138294 ["CustomHeaders" :content]))) (letvar138294 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar138294 ["S3OriginConfig" :content]))) (letvar138294 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar138294 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-format [input] (clojure.core/get {"URLEncoded" :url-encoded} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar138397 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar138397 ["Quantity" :content]))} (letvar138397 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar138397 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar138493 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar138493 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar138493 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar138493 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar138493 ["Quantity" :content]))} (letvar138493 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar138493 ["NextMarker" :content]))) (letvar138493 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar138493 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar138589 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar138589 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar138589 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar138685 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar138685 ["Quantity" :content]))} (letvar138685 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar138685 ["Items" :content]))))))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"viewer-request" :viewerrequest, "viewer-response" :viewerresponse, "origin-request" :originrequest, "origin-response" :originresponse} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-content-type-profiles [input] (clojure.core/let [letvar138786 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar138786 ["Quantity" :content]))} (letvar138786 "Items") (clojure.core/assoc :items (deser-content-type-profile-list (clojure.core/get-in letvar138786 ["Items" :content]))))))

(clojure.core/defn- deser-encryption-entity [input] (clojure.core/let [letvar138882 {"PublicKeyId" (portkey.aws/search-for-tag input "PublicKeyId" :flattened? false :xmlAttribute? nil), "ProviderId" (portkey.aws/search-for-tag input "ProviderId" :flattened? false :xmlAttribute? nil), "FieldPatterns" (portkey.aws/search-for-tag input "FieldPatterns" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:public-key-id (deserstring (clojure.core/get-in letvar138882 ["PublicKeyId" :content])), :provider-id (deserstring (clojure.core/get-in letvar138882 ["ProviderId" :content])), :field-patterns (deser-field-patterns (clojure.core/get-in letvar138882 ["FieldPatterns" :content]))})))

(clojure.core/defn- deser-lambda-function-arn [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar138983 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar138983 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar138983 ["Items" :content]))} (letvar138983 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar138983 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar139084 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? false :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? false :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? false :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? false :xmlAttribute? nil), "OriginReadTimeout" (portkey.aws/search-for-tag input "OriginReadTimeout" :flattened? false :xmlAttribute? nil), "OriginKeepaliveTimeout" (portkey.aws/search-for-tag input "OriginKeepaliveTimeout" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar139084 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar139084 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar139084 ["OriginProtocolPolicy" :content]))} (letvar139084 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar139084 ["OriginSslProtocols" :content]))) (letvar139084 "OriginReadTimeout") (clojure.core/assoc :origin-read-timeout (deserinteger (clojure.core/get-in letvar139084 ["OriginReadTimeout" :content]))) (letvar139084 "OriginKeepaliveTimeout") (clojure.core/assoc :origin-keepalive-timeout (deserinteger (clojure.core/get-in letvar139084 ["OriginKeepaliveTimeout" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar139180 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar139180 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar139180 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar139276 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar139276 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar139276 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar139276 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar139276 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar139276 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar139276 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar139276 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar139276 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar139276 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar139276 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar139276 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar139372 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar139372 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar139372 ["S3CanonicalUserId" :content]))} (letvar139372 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar139372 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-field-level-encryption [input] (clojure.core/let [letvar139485 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "FieldLevelEncryptionConfig" (portkey.aws/search-for-tag input "FieldLevelEncryptionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar139485 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar139485 ["LastModifiedTime" :content])), :field-level-encryption-config (deser-field-level-encryption-config (clojure.core/get-in letvar139485 ["FieldLevelEncryptionConfig" :content]))})))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar139598 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar139598 ["Quantity" :content]))} (letvar139598 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar139598 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar139694 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar139694 ["Quantity" :content]))} (letvar139694 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar139694 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar139790 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar139790 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar139790 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar139790 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar139790 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar139790 ["Enabled" :content]))} (letvar139790 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar139790 ["DefaultRootObject" :content]))) (letvar139790 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar139790 ["IsIPV6Enabled" :content]))) (letvar139790 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar139790 ["Restrictions" :content]))) (letvar139790 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar139790 ["WebACLId" :content]))) (letvar139790 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar139790 ["Logging" :content]))) (letvar139790 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar139790 ["CacheBehaviors" :content]))) (letvar139790 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar139790 ["CustomErrorResponses" :content]))) (letvar139790 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar139790 ["Aliases" :content]))) (letvar139790 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar139790 ["PriceClass" :content]))) (letvar139790 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar139790 ["HttpVersion" :content]))) (letvar139790 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar139790 ["ViewerCertificate" :content]))))))

(clojure.core/defn- deser-public-key-summary [input] (clojure.core/let [letvar139886 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? false :xmlAttribute? nil), "EncodedKey" (portkey.aws/search-for-tag input "EncodedKey" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar139886 ["Id" :content])), :name (deserstring (clojure.core/get-in letvar139886 ["Name" :content])), :created-time (desertimestamp (clojure.core/get-in letvar139886 ["CreatedTime" :content])), :encoded-key (deserstring (clojure.core/get-in letvar139886 ["EncodedKey" :content]))} (letvar139886 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar139886 ["Comment" :content]))))))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-value [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-method [input] (clojure.core/get {"GET" :get, "HEAD" :head, "POST" :post, "PUT" :put, "PATCH" :patch, "OPTIONS" :options, "DELETE" :delete} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-custom-header coll))) input))

(clojure.core/defn- deser-query-arg-profile-config [input] (clojure.core/let [letvar140060 {"ForwardWhenQueryArgProfileIsUnknown" (portkey.aws/search-for-tag input "ForwardWhenQueryArgProfileIsUnknown" :flattened? false :xmlAttribute? nil), "QueryArgProfiles" (portkey.aws/search-for-tag input "QueryArgProfiles" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward-when-query-arg-profile-is-unknown (deserboolean (clojure.core/get-in letvar140060 ["ForwardWhenQueryArgProfileIsUnknown" :content]))} (letvar140060 "QueryArgProfiles") (clojure.core/assoc :query-arg-profiles (deser-query-arg-profiles (clojure.core/get-in letvar140060 ["QueryArgProfiles" :content]))))))

(clojure.core/defn- deser-origin-protocol-policy [input] (clojure.core/get {"http-only" :httponly, "match-viewer" :matchviewer, "https-only" :httpsonly} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signer coll))) input))

(clojure.core/defn- deser-query-arg-profiles [input] (clojure.core/let [letvar140178 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar140178 ["Quantity" :content]))} (letvar140178 "Items") (clojure.core/assoc :items (deser-query-arg-profile-list (clojure.core/get-in letvar140178 ["Items" :content]))))))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (clojure.core/get {"blacklist" :blacklist, "whitelist" :whitelist, "none" :none} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar140296 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar140296 ["Quantity" :content]))} (letvar140296 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar140296 ["Items" :content]))))))

(clojure.core/defn- deser-field-level-encryption-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-level-encryption-summary coll))) input))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar140411 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar140411 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar140411 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar140411 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar140524 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? false :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar140524 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar140524 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar140620 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar140620 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar140620 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar140620 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar140620 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar140620 ["Enabled" :content]))} (letvar140620 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar140620 ["Aliases" :content]))) (letvar140620 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar140620 ["Logging" :content]))) (letvar140620 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar140620 ["PriceClass" :content]))))))

(clojure.core/defn- deser-public-key-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-public-key-summary coll))) input))

(clojure.core/defn- deser-field-pattern-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar140750 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar140750 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar140863 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar140863 ["Key" :content]))} (letvar140863 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar140863 ["Value" :content]))))))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar140959 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar140959 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar140959 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar140959 ["Prefix" :content]))})))

(clojure.core/defn- deser-field-level-encryption-summary [input] (clojure.core/let [letvar141055 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "QueryArgProfileConfig" (portkey.aws/search-for-tag input "QueryArgProfileConfig" :flattened? false :xmlAttribute? nil), "ContentTypeProfileConfig" (portkey.aws/search-for-tag input "ContentTypeProfileConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar141055 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar141055 ["LastModifiedTime" :content]))} (letvar141055 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar141055 ["Comment" :content]))) (letvar141055 "QueryArgProfileConfig") (clojure.core/assoc :query-arg-profile-config (deser-query-arg-profile-config (clojure.core/get-in letvar141055 ["QueryArgProfileConfig" :content]))) (letvar141055 "ContentTypeProfileConfig") (clojure.core/assoc :content-type-profile-config (deser-content-type-profile-config (clojure.core/get-in letvar141055 ["ContentTypeProfileConfig" :content]))))))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar141151 {"IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar141151 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar141151 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar141151 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar141151 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar141151 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar141151 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar141151 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar141151 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar141151 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar141151 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar141151 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar141151 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar141151 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar141151 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar141151 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar141151 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar141151 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar141151 ["PriceClass" :content]))})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-lambda-function-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-association coll))) input))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar141269 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar141269 ["Quantity" :content]))} (letvar141269 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar141269 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1_2016" :tl-sv-1-2016, "TLSv1.1_2016" :tl-sv-11-2016, "TLSv1.2_2018" :tl-sv-12-2018} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar141370 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar141370 ["Quantity" :content]))} (letvar141370 "Items") (clojure.core/assoc :items (deser-origin-list (clojure.core/get-in letvar141370 ["Items" :content]))))))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar141483 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar141483 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar141483 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar141483 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar141483 ["Quantity" :content]))} (letvar141483 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar141483 ["NextMarker" :content]))) (letvar141483 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar141483 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-http-version [input] (clojure.core/get {"http1.1" :http-11, "http2" :http-2} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar141589 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? false :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar141589 ["Forward" :content]))} (letvar141589 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar141589 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar141685 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar141685 ["Quantity" :content]))} (letvar141685 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar141685 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-public-key-list [input] (clojure.core/let [letvar141798 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar141798 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar141798 ["Quantity" :content]))} (letvar141798 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar141798 ["NextMarker" :content]))) (letvar141798 "Items") (clojure.core/assoc :items (deser-public-key-summary-list (clojure.core/get-in letvar141798 ["Items" :content]))))))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar141894 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "FieldLevelEncryptionId" (portkey.aws/search-for-tag input "FieldLevelEncryptionId" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar141894 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar141894 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar141894 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar141894 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar141894 ["MinTTL" :content]))} (letvar141894 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar141894 ["SmoothStreaming" :content]))) (letvar141894 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar141894 ["FieldLevelEncryptionId" :content]))) (letvar141894 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar141894 ["Compress" :content]))) (letvar141894 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar141894 ["LambdaFunctionAssociations" :content]))) (letvar141894 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar141894 ["MaxTTL" :content]))) (letvar141894 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar141894 ["AllowedMethods" :content]))) (letvar141894 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar141894 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar141990 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar141990 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar141990 ["Quantity" :content]))} (letvar141990 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar141990 ["Items" :content]))))))

(clojure.core/defn- deser-field-level-encryption-list [input] (clojure.core/let [letvar142086 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar142086 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar142086 ["Quantity" :content]))} (letvar142086 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar142086 ["NextMarker" :content]))) (letvar142086 "Items") (clojure.core/assoc :items (deser-field-level-encryption-summary-list (clojure.core/get-in letvar142086 ["Items" :content]))))))

(clojure.core/defn- deser-public-key [input] (clojure.core/let [letvar142182 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? false :xmlAttribute? nil), "PublicKeyConfig" (portkey.aws/search-for-tag input "PublicKeyConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar142182 ["Id" :content])), :created-time (desertimestamp (clojure.core/get-in letvar142182 ["CreatedTime" :content])), :public-key-config (deser-public-key-config (clojure.core/get-in letvar142182 ["PublicKeyConfig" :content]))})))

(clojure.core/defn- deser-field-level-encryption-profile-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-level-encryption-profile-summary coll))) input))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar142295 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? false :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? false :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? false :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? false :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? false :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? false :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar142295 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar142295 ["CloudFrontDefaultCertificate" :content]))) (letvar142295 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar142295 ["IAMCertificateId" :content]))) (letvar142295 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar142295 ["ACMCertificateArn" :content]))) (letvar142295 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar142295 ["SSLSupportMethod" :content]))) (letvar142295 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar142295 ["MinimumProtocolVersion" :content]))) (letvar142295 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar142295 ["Certificate" :content]))) (letvar142295 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar142295 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar142391 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar142391 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar142391 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar142487 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar142487 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar142487 ["Quantity" :content]))} (letvar142487 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar142487 ["Items" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-result [input] (clojure.core/let [rawinput142488 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142489 {"Tags" (portkey.aws/search-for-tag rawinput142488 "Tags" :flattened? false)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar142489 ["Tags" :content]))})))

(clojure.core/defn- response-too-many-distributions-with-lambda-associations [input] (clojure.core/let [rawinput142490 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142491 {"Message" (portkey.aws/search-for-tag rawinput142490 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142491 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142491 ["Message" :content]))))))

(clojure.core/defn- response-no-such-origin [input] (clojure.core/let [rawinput142492 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142493 {"Message" (portkey.aws/search-for-tag rawinput142492 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142493 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142493 ["Message" :content]))))))

(clojure.core/defn- response-invalid-protocol-settings [input] (clojure.core/let [rawinput142494 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142495 {"Message" (portkey.aws/search-for-tag rawinput142494 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142495 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142495 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list [input] (clojure.core/let [rawinput142496 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142497 {"Message" (portkey.aws/search-for-tag rawinput142496 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142497 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142497 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cache-behaviors [input] (clojure.core/let [rawinput142498 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142499 {"Message" (portkey.aws/search-for-tag rawinput142498 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142499 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142499 ["Message" :content]))))))

(clojure.core/defn- response-too-many-origin-custom-headers [input] (clojure.core/let [rawinput142500 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142501 {"Message" (portkey.aws/search-for-tag rawinput142500 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142501 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142501 ["Message" :content]))))))

(clojure.core/defn- response-create-field-level-encryption-config-result [input] (clojure.core/let [rawinput142502 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142503 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput142502 "FieldLevelEncryption" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142503 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar142503 ["FieldLevelEncryption" :content]))) (letvar142503 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar142503 ["Location"]))) (letvar142503 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142503 ["ETag"]))))))

(clojure.core/defn- response-too-many-streaming-distributions [input] (clojure.core/let [rawinput142504 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142505 {"Message" (portkey.aws/search-for-tag rawinput142504 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142505 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142505 ["Message" :content]))))))

(clojure.core/defn- response-get-streaming-distribution-result [input] (clojure.core/let [rawinput142506 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142507 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput142506 "StreamingDistribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142507 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar142507 ["StreamingDistribution" :content]))) (letvar142507 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142507 ["ETag"]))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es [input] (clojure.core/let [rawinput142508 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142509 {"Message" (portkey.aws/search-for-tag rawinput142508 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142509 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142509 ["Message" :content]))))))

(clojure.core/defn- response-field-level-encryption-profile-already-exists [input] (clojure.core/let [rawinput142510 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142511 {"Message" (portkey.aws/search-for-tag rawinput142510 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142511 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142511 ["Message" :content]))))))

(clojure.core/defn- response-invalid-viewer-certificate [input] (clojure.core/let [rawinput142512 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142513 {"Message" (portkey.aws/search-for-tag rawinput142512 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142513 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142513 ["Message" :content]))))))

(clojure.core/defn- response-get-public-key-config-result [input] (clojure.core/let [rawinput142514 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142515 {"PublicKeyConfig" (portkey.aws/search-for-tag rawinput142514 "PublicKeyConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142515 "PublicKeyConfig") (clojure.core/assoc :public-key-config (deser-public-key-config (clojure.core/get-in letvar142515 ["PublicKeyConfig" :content]))) (letvar142515 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142515 ["ETag"]))))))

(clojure.core/defn- response-invalid-argument [input] (clojure.core/let [rawinput142516 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142517 {"Message" (portkey.aws/search-for-tag rawinput142516 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142517 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142517 ["Message" :content]))))))

(clojure.core/defn- response-no-such-public-key [input] (clojure.core/let [rawinput142518 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142519 {"Message" (portkey.aws/search-for-tag rawinput142518 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142519 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142519 ["Message" :content]))))))

(clojure.core/defn- response-streaming-distribution-not-disabled [input] (clojure.core/let [rawinput142520 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142521 {"Message" (portkey.aws/search-for-tag rawinput142520 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142521 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142521 ["Message" :content]))))))

(clojure.core/defn- response-illegal-field-level-encryption-config-association-with-cache-behavior [input] (clojure.core/let [rawinput142522 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142523 {"Message" (portkey.aws/search-for-tag rawinput142522 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142523 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142523 ["Message" :content]))))))

(clojure.core/defn- response-too-many-certificates [input] (clojure.core/let [rawinput142524 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142525 {"Message" (portkey.aws/search-for-tag rawinput142524 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142525 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142525 ["Message" :content]))))))

(clojure.core/defn- response-access-denied [input] (clojure.core/let [rawinput142526 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142527 {"Message" (portkey.aws/search-for-tag rawinput142526 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142527 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142527 ["Message" :content]))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use [input] (clojure.core/let [rawinput142528 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142529 {"Message" (portkey.aws/search-for-tag rawinput142528 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142529 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142529 ["Message" :content]))))))

(clojure.core/defn- response-cannot-change-immutable-public-key-fields [input] (clojure.core/let [rawinput142530 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142531 {"Message" (portkey.aws/search-for-tag rawinput142530 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142531 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142531 ["Message" :content]))))))

(clojure.core/defn- response-field-level-encryption-profile-size-exceeded [input] (clojure.core/let [rawinput142532 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142533 {"Message" (portkey.aws/search-for-tag rawinput142532 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142533 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142533 ["Message" :content]))))))

(clojure.core/defn- response-invalid-lambda-function-association [input] (clojure.core/let [rawinput142534 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142535 {"Message" (portkey.aws/search-for-tag rawinput142534 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142535 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142535 ["Message" :content]))))))

(clojure.core/defn- response-create-field-level-encryption-profile-result [input] (clojure.core/let [rawinput142536 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142537 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput142536 "FieldLevelEncryptionProfile" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142537 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar142537 ["FieldLevelEncryptionProfile" :content]))) (letvar142537 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar142537 ["Location"]))) (letvar142537 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142537 ["ETag"]))))))

(clojure.core/defn- response-get-field-level-encryption-profile-result [input] (clojure.core/let [rawinput142538 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142539 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput142538 "FieldLevelEncryptionProfile" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142539 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar142539 ["FieldLevelEncryptionProfile" :content]))) (letvar142539 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142539 ["ETag"]))))))

(clojure.core/defn- response-no-such-resource [input] (clojure.core/let [rawinput142540 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142541 {"Message" (portkey.aws/search-for-tag rawinput142540 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142541 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142541 ["Message" :content]))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput142542 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142543 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput142542 "CloudFrontOriginAccessIdentity" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142543 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar142543 ["CloudFrontOriginAccessIdentity" :content]))) (letvar142543 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142543 ["ETag"]))))))

(clojure.core/defn- response-invalid-error-code [input] (clojure.core/let [rawinput142544 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142545 {"Message" (portkey.aws/search-for-tag rawinput142544 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142545 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142545 ["Message" :content]))))))

(clojure.core/defn- response-field-level-encryption-profile-in-use [input] (clojure.core/let [rawinput142546 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142547 {"Message" (portkey.aws/search-for-tag rawinput142546 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142547 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142547 ["Message" :content]))))))

(clojure.core/defn- response-too-many-lambda-function-associations [input] (clojure.core/let [rawinput142548 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142549 {"Message" (portkey.aws/search-for-tag rawinput142548 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142549 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142549 ["Message" :content]))))))

(clojure.core/defn- response-create-streaming-distribution-result [input] (clojure.core/let [rawinput142550 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142551 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput142550 "StreamingDistribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142551 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar142551 ["StreamingDistribution" :content]))) (letvar142551 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar142551 ["Location"]))) (letvar142551 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142551 ["ETag"]))))))

(clojure.core/defn- response-too-many-field-level-encryption-profiles [input] (clojure.core/let [rawinput142552 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142553 {"Message" (portkey.aws/search-for-tag rawinput142552 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142553 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142553 ["Message" :content]))))))

(clojure.core/defn- response-no-such-field-level-encryption-profile [input] (clojure.core/let [rawinput142554 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142555 {"Message" (portkey.aws/search-for-tag rawinput142554 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142555 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142555 ["Message" :content]))))))

(clojure.core/defn- response-invalid-relative-path [input] (clojure.core/let [rawinput142556 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142557 {"Message" (portkey.aws/search-for-tag rawinput142556 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142557 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142557 ["Message" :content]))))))

(clojure.core/defn- response-create-public-key-result [input] (clojure.core/let [rawinput142558 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142559 {"PublicKey" (portkey.aws/search-for-tag rawinput142558 "PublicKey" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142559 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar142559 ["PublicKey" :content]))) (letvar142559 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar142559 ["Location"]))) (letvar142559 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142559 ["ETag"]))))))

(clojure.core/defn- response-invalid-location-code [input] (clojure.core/let [rawinput142560 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142561 {"Message" (portkey.aws/search-for-tag rawinput142560 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142561 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142561 ["Message" :content]))))))

(clojure.core/defn- response-invalid-web-acl-id [input] (clojure.core/let [rawinput142562 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142563 {"Message" (portkey.aws/search-for-tag rawinput142562 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142563 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142563 ["Message" :content]))))))

(clojure.core/defn- response-invalid-origin [input] (clojure.core/let [rawinput142564 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142565 {"Message" (portkey.aws/search-for-tag rawinput142564 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142565 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142565 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities [input] (clojure.core/let [rawinput142566 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142567 {"Message" (portkey.aws/search-for-tag rawinput142566 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142567 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142567 ["Message" :content]))))))

(clojure.core/defn- response-field-level-encryption-config-already-exists [input] (clojure.core/let [rawinput142568 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142569 {"Message" (portkey.aws/search-for-tag rawinput142568 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142569 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142569 ["Message" :content]))))))

(clojure.core/defn- response-no-such-field-level-encryption-config [input] (clojure.core/let [rawinput142570 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142571 {"Message" (portkey.aws/search-for-tag rawinput142570 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142571 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142571 ["Message" :content]))))))

(clojure.core/defn- response-update-distribution-result [input] (clojure.core/let [rawinput142572 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142573 {"Distribution" (portkey.aws/search-for-tag rawinput142572 "Distribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142573 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar142573 ["Distribution" :content]))) (letvar142573 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142573 ["ETag"]))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput142574 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142575 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput142574 "CloudFrontOriginAccessIdentity" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142575 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar142575 ["CloudFrontOriginAccessIdentity" :content]))) (letvar142575 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142575 ["ETag"]))))))

(clojure.core/defn- response-too-many-field-level-encryption-encryption-entities [input] (clojure.core/let [rawinput142576 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142577 {"Message" (portkey.aws/search-for-tag rawinput142576 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142577 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142577 ["Message" :content]))))))

(clojure.core/defn- response-get-field-level-encryption-result [input] (clojure.core/let [rawinput142578 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142579 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput142578 "FieldLevelEncryption" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142579 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar142579 ["FieldLevelEncryption" :content]))) (letvar142579 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142579 ["ETag"]))))))

(clojure.core/defn- response-invalid-query-string-parameters [input] (clojure.core/let [rawinput142580 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142581 {"Message" (portkey.aws/search-for-tag rawinput142580 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142581 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142581 ["Message" :content]))))))

(clojure.core/defn- response-public-key-already-exists [input] (clojure.core/let [rawinput142582 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142583 {"Message" (portkey.aws/search-for-tag rawinput142582 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142583 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142583 ["Message" :content]))))))

(clojure.core/defn- response-too-many-origins [input] (clojure.core/let [rawinput142584 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142585 {"Message" (portkey.aws/search-for-tag rawinput142584 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142585 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142585 ["Message" :content]))))))

(clojure.core/defn- response-invalid-ttl-order [input] (clojure.core/let [rawinput142586 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142587 {"Message" (portkey.aws/search-for-tag rawinput142586 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142587 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142587 ["Message" :content]))))))

(clojure.core/defn- response-no-such-streaming-distribution [input] (clojure.core/let [rawinput142588 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142589 {"Message" (portkey.aws/search-for-tag rawinput142588 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142589 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142589 ["Message" :content]))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput142590 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142591 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput142590 "CloudFrontOriginAccessIdentity" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142591 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar142591 ["CloudFrontOriginAccessIdentity" :content]))) (letvar142591 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar142591 ["Location"]))) (letvar142591 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142591 ["ETag"]))))))

(clojure.core/defn- response-cname-already-exists [input] (clojure.core/let [rawinput142592 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142593 {"Message" (portkey.aws/search-for-tag rawinput142592 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142593 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142593 ["Message" :content]))))))

(clojure.core/defn- response-invalid-default-root-object [input] (clojure.core/let [rawinput142594 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142595 {"Message" (portkey.aws/search-for-tag rawinput142594 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142595 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142595 ["Message" :content]))))))

(clojure.core/defn- response-invalid-response-code [input] (clojure.core/let [rawinput142596 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142597 {"Message" (portkey.aws/search-for-tag rawinput142596 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142597 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142597 ["Message" :content]))))))

(clojure.core/defn- response-no-such-invalidation [input] (clojure.core/let [rawinput142598 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142599 {"Message" (portkey.aws/search-for-tag rawinput142598 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142599 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142599 ["Message" :content]))))))

(clojure.core/defn- response-too-many-invalidations-in-progress [input] (clojure.core/let [rawinput142600 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142601 {"Message" (portkey.aws/search-for-tag rawinput142600 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142601 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142601 ["Message" :content]))))))

(clojure.core/defn- response-get-public-key-result [input] (clojure.core/let [rawinput142602 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142603 {"PublicKey" (portkey.aws/search-for-tag rawinput142602 "PublicKey" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142603 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar142603 ["PublicKey" :content]))) (letvar142603 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142603 ["ETag"]))))))

(clojure.core/defn- response-too-many-distributions-associated-to-field-level-encryption-config [input] (clojure.core/let [rawinput142604 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142605 {"Message" (portkey.aws/search-for-tag rawinput142604 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142605 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142605 ["Message" :content]))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result [input] (clojure.core/let [rawinput142606 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142607 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput142606 "CloudFrontOriginAccessIdentityList" :flattened? false)}] (clojure.core/cond-> {} (letvar142607 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar142607 ["CloudFrontOriginAccessIdentityList" :content]))))))

(clojure.core/defn- response-update-public-key-result [input] (clojure.core/let [rawinput142608 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142609 {"PublicKey" (portkey.aws/search-for-tag rawinput142608 "PublicKey" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142609 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar142609 ["PublicKey" :content]))) (letvar142609 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142609 ["ETag"]))))))

(clojure.core/defn- response-invalid-forward-cookies [input] (clojure.core/let [rawinput142610 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142611 {"Message" (portkey.aws/search-for-tag rawinput142610 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142611 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142611 ["Message" :content]))))))

(clojure.core/defn- response-get-distribution-config-result [input] (clojure.core/let [rawinput142612 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142613 {"DistributionConfig" (portkey.aws/search-for-tag rawinput142612 "DistributionConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142613 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar142613 ["DistributionConfig" :content]))) (letvar142613 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142613 ["ETag"]))))))

(clojure.core/defn- response-invalid-required-protocol [input] (clojure.core/let [rawinput142614 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142615 {"Message" (portkey.aws/search-for-tag rawinput142614 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142615 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142615 ["Message" :content]))))))

(clojure.core/defn- response-update-field-level-encryption-config-result [input] (clojure.core/let [rawinput142616 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142617 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput142616 "FieldLevelEncryption" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142617 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar142617 ["FieldLevelEncryption" :content]))) (letvar142617 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142617 ["ETag"]))))))

(clojure.core/defn- response-get-distribution-result [input] (clojure.core/let [rawinput142618 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142619 {"Distribution" (portkey.aws/search-for-tag rawinput142618 "Distribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142619 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar142619 ["Distribution" :content]))) (letvar142619 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142619 ["ETag"]))))))

(clojure.core/defn- response-update-field-level-encryption-profile-result [input] (clojure.core/let [rawinput142620 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142621 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput142620 "FieldLevelEncryptionProfile" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142621 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar142621 ["FieldLevelEncryptionProfile" :content]))) (letvar142621 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142621 ["ETag"]))))))

(clojure.core/defn- response-get-streaming-distribution-config-result [input] (clojure.core/let [rawinput142622 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142623 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput142622 "StreamingDistributionConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142623 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar142623 ["StreamingDistributionConfig" :content]))) (letvar142623 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142623 ["ETag"]))))))

(clojure.core/defn- response-list-public-keys-result [input] (clojure.core/let [rawinput142624 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142625 {"PublicKeyList" (portkey.aws/search-for-tag rawinput142624 "PublicKeyList" :flattened? false)}] (clojure.core/cond-> {} (letvar142625 "PublicKeyList") (clojure.core/assoc :public-key-list (deser-public-key-list (clojure.core/get-in letvar142625 ["PublicKeyList" :content]))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin [input] (clojure.core/let [rawinput142626 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142627 {"Message" (portkey.aws/search-for-tag rawinput142626 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142627 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142627 ["Message" :content]))))))

(clojure.core/defn- response-get-field-level-encryption-config-result [input] (clojure.core/let [rawinput142628 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142629 {"FieldLevelEncryptionConfig" (portkey.aws/search-for-tag rawinput142628 "FieldLevelEncryptionConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142629 "FieldLevelEncryptionConfig") (clojure.core/assoc :field-level-encryption-config (deser-field-level-encryption-config (clojure.core/get-in letvar142629 ["FieldLevelEncryptionConfig" :content]))) (letvar142629 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142629 ["ETag"]))))))

(clojure.core/defn- response-too-many-field-level-encryption-configs [input] (clojure.core/let [rawinput142630 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142631 {"Message" (portkey.aws/search-for-tag rawinput142630 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142631 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142631 ["Message" :content]))))))

(clojure.core/defn- response-field-level-encryption-config-in-use [input] (clojure.core/let [rawinput142632 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142633 {"Message" (portkey.aws/search-for-tag rawinput142632 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142633 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142633 ["Message" :content]))))))

(clojure.core/defn- response-too-many-distribution-cnam-es [input] (clojure.core/let [rawinput142634 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142635 {"Message" (portkey.aws/search-for-tag rawinput142634 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142635 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142635 ["Message" :content]))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter [input] (clojure.core/let [rawinput142636 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142637 {"Message" (portkey.aws/search-for-tag rawinput142636 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142637 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142637 ["Message" :content]))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity [input] (clojure.core/let [rawinput142638 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142639 {"Message" (portkey.aws/search-for-tag rawinput142638 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142639 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142639 ["Message" :content]))))))

(clojure.core/defn- response-list-invalidations-result [input] (clojure.core/let [rawinput142640 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142641 {"InvalidationList" (portkey.aws/search-for-tag rawinput142640 "InvalidationList" :flattened? false)}] (clojure.core/cond-> {} (letvar142641 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar142641 ["InvalidationList" :content]))))))

(clojure.core/defn- response-batch-too-large [input] (clojure.core/let [rawinput142642 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142643 {"Message" (portkey.aws/search-for-tag rawinput142642 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142643 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142643 ["Message" :content]))))))

(clojure.core/defn- response-create-distribution-with-tags-result [input] (clojure.core/let [rawinput142644 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142645 {"Distribution" (portkey.aws/search-for-tag rawinput142644 "Distribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142645 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar142645 ["Distribution" :content]))) (letvar142645 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar142645 ["Location"]))) (letvar142645 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142645 ["ETag"]))))))

(clojure.core/defn- response-too-many-field-level-encryption-query-arg-profiles [input] (clojure.core/let [rawinput142646 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142647 {"Message" (portkey.aws/search-for-tag rawinput142646 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142647 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142647 ["Message" :content]))))))

(clojure.core/defn- response-list-streaming-distributions-result [input] (clojure.core/let [rawinput142648 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142649 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput142648 "StreamingDistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar142649 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar142649 ["StreamingDistributionList" :content]))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result [input] (clojure.core/let [rawinput142650 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142651 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput142650 "StreamingDistribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142651 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar142651 ["StreamingDistribution" :content]))) (letvar142651 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar142651 ["Location"]))) (letvar142651 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142651 ["ETag"]))))))

(clojure.core/defn- response-create-invalidation-result [input] (clojure.core/let [rawinput142652 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142653 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput142652 "Invalidation" :flattened? false)}] (clojure.core/cond-> {} (letvar142653 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar142653 ["Location"]))) (letvar142653 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar142653 ["Invalidation" :content]))))))

(clojure.core/defn- response-missing-body [input] (clojure.core/let [rawinput142654 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142655 {"Message" (portkey.aws/search-for-tag rawinput142654 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142655 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142655 ["Message" :content]))))))

(clojure.core/defn- response-invalid-origin-read-timeout [input] (clojure.core/let [rawinput142656 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142657 {"Message" (portkey.aws/search-for-tag rawinput142656 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142657 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142657 ["Message" :content]))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result [input] (clojure.core/let [rawinput142658 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142659 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput142658 "CloudFrontOriginAccessIdentityConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142659 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar142659 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar142659 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142659 ["ETag"]))))))

(clojure.core/defn- response-distribution-not-disabled [input] (clojure.core/let [rawinput142660 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142661 {"Message" (portkey.aws/search-for-tag rawinput142660 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142661 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142661 ["Message" :content]))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists [input] (clojure.core/let [rawinput142662 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142663 {"Message" (portkey.aws/search-for-tag rawinput142662 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142663 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142663 ["Message" :content]))))))

(clojure.core/defn- response-precondition-failed [input] (clojure.core/let [rawinput142664 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142665 {"Message" (portkey.aws/search-for-tag rawinput142664 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142665 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142665 ["Message" :content]))))))

(clojure.core/defn- response-distribution-already-exists [input] (clojure.core/let [rawinput142666 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142667 {"Message" (portkey.aws/search-for-tag rawinput142666 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142667 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142667 ["Message" :content]))))))

(clojure.core/defn- response-invalid-origin-access-identity [input] (clojure.core/let [rawinput142668 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142669 {"Message" (portkey.aws/search-for-tag rawinput142668 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142669 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142669 ["Message" :content]))))))

(clojure.core/defn- response-too-many-trusted-signers [input] (clojure.core/let [rawinput142670 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142671 {"Message" (portkey.aws/search-for-tag rawinput142670 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142671 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142671 ["Message" :content]))))))

(clojure.core/defn- response-too-many-public-keys [input] (clojure.core/let [rawinput142672 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142673 {"Message" (portkey.aws/search-for-tag rawinput142672 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142673 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142673 ["Message" :content]))))))

(clojure.core/defn- response-invalid-minimum-protocol-version [input] (clojure.core/let [rawinput142674 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142675 {"Message" (portkey.aws/search-for-tag rawinput142674 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142675 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142675 ["Message" :content]))))))

(clojure.core/defn- response-streaming-distribution-already-exists [input] (clojure.core/let [rawinput142676 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142677 {"Message" (portkey.aws/search-for-tag rawinput142676 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142677 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142677 ["Message" :content]))))))

(clojure.core/defn- response-public-key-in-use [input] (clojure.core/let [rawinput142678 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142679 {"Message" (portkey.aws/search-for-tag rawinput142678 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142679 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142679 ["Message" :content]))))))

(clojure.core/defn- response-invalid-if-match-version [input] (clojure.core/let [rawinput142680 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142681 {"Message" (portkey.aws/search-for-tag rawinput142680 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142681 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142681 ["Message" :content]))))))

(clojure.core/defn- response-list-field-level-encryption-profiles-result [input] (clojure.core/let [rawinput142682 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142683 {"FieldLevelEncryptionProfileList" (portkey.aws/search-for-tag rawinput142682 "FieldLevelEncryptionProfileList" :flattened? false)}] (clojure.core/cond-> {} (letvar142683 "FieldLevelEncryptionProfileList") (clojure.core/assoc :field-level-encryption-profile-list (deser-field-level-encryption-profile-list (clojure.core/get-in letvar142683 ["FieldLevelEncryptionProfileList" :content]))))))

(clojure.core/defn- response-create-distribution-result [input] (clojure.core/let [rawinput142684 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142685 {"Distribution" (portkey.aws/search-for-tag rawinput142684 "Distribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142685 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar142685 ["Distribution" :content]))) (letvar142685 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar142685 ["Location"]))) (letvar142685 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142685 ["ETag"]))))))

(clojure.core/defn- response-too-many-distributions [input] (clojure.core/let [rawinput142686 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142687 {"Message" (portkey.aws/search-for-tag rawinput142686 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142687 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142687 ["Message" :content]))))))

(clojure.core/defn- response-list-field-level-encryption-configs-result [input] (clojure.core/let [rawinput142688 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142689 {"FieldLevelEncryptionList" (portkey.aws/search-for-tag rawinput142688 "FieldLevelEncryptionList" :flattened? false)}] (clojure.core/cond-> {} (letvar142689 "FieldLevelEncryptionList") (clojure.core/assoc :field-level-encryption-list (deser-field-level-encryption-list (clojure.core/get-in letvar142689 ["FieldLevelEncryptionList" :content]))))))

(clojure.core/defn- response-no-such-distribution [input] (clojure.core/let [rawinput142690 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142691 {"Message" (portkey.aws/search-for-tag rawinput142690 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142691 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142691 ["Message" :content]))))))

(clojure.core/defn- response-query-arg-profile-empty [input] (clojure.core/let [rawinput142692 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142693 {"Message" (portkey.aws/search-for-tag rawinput142692 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142693 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142693 ["Message" :content]))))))

(clojure.core/defn- response-update-streaming-distribution-result [input] (clojure.core/let [rawinput142694 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142695 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput142694 "StreamingDistribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142695 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar142695 ["StreamingDistribution" :content]))) (letvar142695 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142695 ["ETag"]))))))

(clojure.core/defn- response-illegal-update [input] (clojure.core/let [rawinput142696 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142697 {"Message" (portkey.aws/search-for-tag rawinput142696 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142697 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142697 ["Message" :content]))))))

(clojure.core/defn- response-get-field-level-encryption-profile-config-result [input] (clojure.core/let [rawinput142698 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142699 {"FieldLevelEncryptionProfileConfig" (portkey.aws/search-for-tag rawinput142698 "FieldLevelEncryptionProfileConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar142699 "FieldLevelEncryptionProfileConfig") (clojure.core/assoc :field-level-encryption-profile-config (deser-field-level-encryption-profile-config (clojure.core/get-in letvar142699 ["FieldLevelEncryptionProfileConfig" :content]))) (letvar142699 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar142699 ["ETag"]))))))

(clojure.core/defn- response-too-many-field-level-encryption-content-type-profiles [input] (clojure.core/let [rawinput142700 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142701 {"Message" (portkey.aws/search-for-tag rawinput142700 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142701 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142701 ["Message" :content]))))))

(clojure.core/defn- response-invalid-origin-keepalive-timeout [input] (clojure.core/let [rawinput142702 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142703 {"Message" (portkey.aws/search-for-tag rawinput142702 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142703 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142703 ["Message" :content]))))))

(clojure.core/defn- response-inconsistent-quantities [input] (clojure.core/let [rawinput142704 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142705 {"Message" (portkey.aws/search-for-tag rawinput142704 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142705 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142705 ["Message" :content]))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result [input] (clojure.core/let [rawinput142706 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142707 {"DistributionList" (portkey.aws/search-for-tag rawinput142706 "DistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar142707 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar142707 ["DistributionList" :content]))))))

(clojure.core/defn- response-too-many-query-string-parameters [input] (clojure.core/let [rawinput142708 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142709 {"Message" (portkey.aws/search-for-tag rawinput142708 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142709 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142709 ["Message" :content]))))))

(clojure.core/defn- response-invalid-tagging [input] (clojure.core/let [rawinput142710 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142711 {"Message" (portkey.aws/search-for-tag rawinput142710 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142711 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142711 ["Message" :content]))))))

(clojure.core/defn- response-list-distributions-result [input] (clojure.core/let [rawinput142712 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142713 {"DistributionList" (portkey.aws/search-for-tag rawinput142712 "DistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar142713 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar142713 ["DistributionList" :content]))))))

(clojure.core/defn- response-trusted-signer-does-not-exist [input] (clojure.core/let [rawinput142714 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142715 {"Message" (portkey.aws/search-for-tag rawinput142714 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142715 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142715 ["Message" :content]))))))

(clojure.core/defn- response-too-many-field-level-encryption-field-patterns [input] (clojure.core/let [rawinput142716 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142717 {"Message" (portkey.aws/search-for-tag rawinput142716 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142717 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142717 ["Message" :content]))))))

(clojure.core/defn- response-get-invalidation-result [input] (clojure.core/let [rawinput142718 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142719 {"Invalidation" (portkey.aws/search-for-tag rawinput142718 "Invalidation" :flattened? false)}] (clojure.core/cond-> {} (letvar142719 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar142719 ["Invalidation" :content]))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values [input] (clojure.core/let [rawinput142720 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar142721 {"Message" (portkey.aws/search-for-tag rawinput142720 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar142721 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar142721 ["Message" :content]))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2018-06-18.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-distributions-with-lambda-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-with-lambda-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-distributions-with-lambda-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.content-type-profile/profile-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.content-type-profile/content-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/content-type-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/format :portkey.aws.cloudfront.-2018-06-18.content-type-profile/content-type] :opt-un [:portkey.aws.cloudfront.-2018-06-18.content-type-profile/profile-id]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.logging-config/enabled :portkey.aws.cloudfront.-2018-06-18.logging-config/include-cookies :portkey.aws.cloudfront.-2018-06-18.logging-config/bucket :portkey.aws.cloudfront.-2018-06-18.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config :portkey.aws.cloudfront.-2018-06-18/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.invalidation-summary/id :portkey.aws.cloudfront.-2018-06-18.invalidation-summary/create-time :portkey.aws.cloudfront.-2018-06-18.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.invalidation/id :portkey.aws.cloudfront.-2018-06-18.invalidation/status :portkey.aws.cloudfront.-2018-06-18.invalidation/create-time :portkey.aws.cloudfront.-2018-06-18/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-config-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-config-result/location :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-patterns/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-patterns/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/field-pattern-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-patterns (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-patterns/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-patterns/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/name :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/caller-reference :portkey.aws.cloudfront.-2018-06-18/encryption-entities] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-config/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-public-key-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/public-key-config :portkey.aws.cloudfront.-2018-06-18.get-public-key-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-public-key/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-public-key (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-public-key/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.illegal-field-level-encryption-config-association-with-cache-behavior/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/illegal-field-level-encryption-config-association-with-cache-behavior (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.illegal-field-level-encryption-config-association-with-cache-behavior/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config/caller-reference] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config/comment :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-config :portkey.aws.cloudfront.-2018-06-18/content-type-profile-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile/id :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile/last-modified-time :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.distribution/id :portkey.aws.cloudfront.-2018-06-18.distribution/arn :portkey.aws.cloudfront.-2018-06-18.distribution/status :portkey.aws.cloudfront.-2018-06-18.distribution/last-modified-time :portkey.aws.cloudfront.-2018-06-18.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2018-06-18.distribution/domain-name :portkey.aws.cloudfront.-2018-06-18/active-trusted-signers :portkey.aws.cloudfront.-2018-06-18/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profile/query-arg (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profile/profile-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-arg-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.query-arg-profile/query-arg :portkey.aws.cloudfront.-2018-06-18.query-arg-profile/profile-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.lambda-function-association/include-body (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/lambda-function-association (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/lambda-function-arn :portkey.aws.cloudfront.-2018-06-18/event-type] :opt-un [:portkey.aws.cloudfront.-2018-06-18.lambda-function-association/include-body]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.forwarded-values/query-string :portkey.aws.cloudfront.-2018-06-18.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2018-06-18/headers :portkey.aws.cloudfront.-2018-06-18/query-string-cache-keys]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/paths :portkey.aws.cloudfront.-2018-06-18.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-public-key-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/public-key-config :portkey.aws.cloudfront.-2018-06-18.update-public-key-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-public-key-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-public-key-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-public-key-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-string-cache-keys-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/marker :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-config/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-config/encoded-key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.public-key-config/caller-reference :portkey.aws.cloudfront.-2018-06-18.public-key-config/name :portkey.aws.cloudfront.-2018-06-18.public-key-config/encoded-key] :opt-un [:portkey.aws.cloudfront.-2018-06-18.public-key-config/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/encryption-entity-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/encryption-entity))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution/id :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/arn :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/status :portkey.aws.cloudfront.-2018-06-18.streaming-distribution/domain-name :portkey.aws.cloudfront.-2018-06-18/active-trusted-signers :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.lambda-function-associations/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.lambda-function-associations/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/lambda-function-association-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/lambda-function-associations (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.lambda-function-associations/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.lambda-function-associations/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.encryption-entities/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.encryption-entities/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/encryption-entity-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/encryption-entities (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.encryption-entities/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.encryption-entities/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cannot-change-immutable-public-key-fields/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cannot-change-immutable-public-key-fields (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cannot-change-immutable-public-key-fields/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-size-exceeded/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-size-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-size-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-lambda-function-association/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-lambda-function-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-lambda-function-association/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/id :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/last-modified-time :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/name :portkey.aws.cloudfront.-2018-06-18/encryption-entities] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-summary/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/content-type-profile-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/content-type-profile))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2018-06-18.custom-error-response/response-page-path :portkey.aws.cloudfront.-2018-06-18.custom-error-response/response-code :portkey.aws.cloudfront.-2018-06-18.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-profile-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-profile-result/location :portkey.aws.cloudfront.-2018-06-18.create-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.signer/aws-account-number :portkey.aws.cloudfront.-2018-06-18/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-public-key-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/max-items :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/next-marker :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-profile-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.content-type-profile-config/forward-when-content-type-is-unknown (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/content-type-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.content-type-profile-config/forward-when-content-type-is-unknown] :opt-un [:portkey.aws.cloudfront.-2018-06-18/content-type-profiles]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cached-methods/quantity :portkey.aws.cloudfront.-2018-06-18.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128)) (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__22929__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-lambda-function-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-lambda-function-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-lambda-function-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-profiles-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-profiles-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-profiles-request/marker :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-profiles-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/query-arg-profile))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/field-level-encryption-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cache-behavior/path-pattern :portkey.aws.cloudfront.-2018-06-18.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2018-06-18/forwarded-values :portkey.aws.cloudfront.-2018-06-18/trusted-signers :portkey.aws.cloudfront.-2018-06-18/viewer-protocol-policy :portkey.aws.cloudfront.-2018-06-18.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2018-06-18.cache-behavior/field-level-encryption-id :portkey.aws.cloudfront.-2018-06-18.cache-behavior/compress :portkey.aws.cloudfront.-2018-06-18/lambda-function-associations :portkey.aws.cloudfront.-2018-06-18.cache-behavior/max-ttl :portkey.aws.cloudfront.-2018-06-18/allowed-methods :portkey.aws.cloudfront.-2018-06-18.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-field-level-encryption-profile/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-field-level-encryption-profile/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2018-06-18.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/enabled :portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-public-key-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/public-key :portkey.aws.cloudfront.-2018-06-18.create-public-key-result/location :portkey.aws.cloudfront.-2018-06-18.create-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.origin/id :portkey.aws.cloudfront.-2018-06-18.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2018-06-18.origin/origin-path :portkey.aws.cloudfront.-2018-06-18/custom-headers :portkey.aws.cloudfront.-2018-06-18/s-3-origin-config :portkey.aws.cloudfront.-2018-06-18/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/format #{"URLEncoded" :url-encoded})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-field-level-encryption-config/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-field-level-encryption-config/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.invalidation-list/marker :portkey.aws.cloudfront.-2018-06-18.invalidation-list/max-items :portkey.aws.cloudfront.-2018-06-18.invalidation-list/is-truncated :portkey.aws.cloudfront.-2018-06-18.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalidation-list/next-marker :portkey.aws.cloudfront.-2018-06-18.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2018-06-18.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/event-type #{:viewerresponse :originresponse :viewerrequest "viewer-response" :originrequest "origin-response" "origin-request" "viewer-request"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution :portkey.aws.cloudfront.-2018-06-18.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.content-type-profiles/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.content-type-profiles/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/content-type-profile-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/content-type-profiles (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.content-type-profiles/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.content-type-profiles/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.encryption-entity/public-key-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.encryption-entity/provider-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/encryption-entity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.encryption-entity/public-key-id :portkey.aws.cloudfront.-2018-06-18.encryption-entity/provider-id :portkey.aws.cloudfront.-2018-06-18/field-patterns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-encryption-entities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-encryption-entities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-encryption-entities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.allowed-methods/quantity :portkey.aws.cloudfront.-2018-06-18.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/origin-read-timeout (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/origin-keepalive-timeout (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.custom-origin-config/http-port :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/https-port :portkey.aws.cloudfront.-2018-06-18/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2018-06-18/origin-ssl-protocols :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/origin-read-timeout :portkey.aws.cloudfront.-2018-06-18.custom-origin-config/origin-keepalive-timeout]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.public-key-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-distributions-request/marker :portkey.aws.cloudfront.-2018-06-18.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.s-3-origin/domain-name :portkey.aws.cloudfront.-2018-06-18.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2018-06-18.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2018-06-18.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/id :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/arn :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/status :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2018-06-18/s-3-origin :portkey.aws.cloudfront.-2018-06-18/aliases :portkey.aws.cloudfront.-2018-06-18/trusted-signers :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2018-06-18/price-class :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2018-06-18/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.tag-resource-request/resource :portkey.aws.cloudfront.-2018-06-18/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-configs-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-configs-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-configs-request/marker :portkey.aws.cloudfront.-2018-06-18.list-field-level-encryption-configs-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption/id :portkey.aws.cloudfront.-2018-06-18.field-level-encryption/last-modified-time :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-string-cache-keys/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-string-cache-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/query-string-cache-keys-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-string-cache-keys (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.query-string-cache-keys/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.query-string-cache-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.distribution-config/caller-reference :portkey.aws.cloudfront.-2018-06-18/origins :portkey.aws.cloudfront.-2018-06-18/default-cache-behavior :portkey.aws.cloudfront.-2018-06-18.distribution-config/comment :portkey.aws.cloudfront.-2018-06-18.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2018-06-18.distribution-config/default-root-object :portkey.aws.cloudfront.-2018-06-18.distribution-config/is-ipv-6-enabled :portkey.aws.cloudfront.-2018-06-18/restrictions :portkey.aws.cloudfront.-2018-06-18.distribution-config/web-acl-id :portkey.aws.cloudfront.-2018-06-18.distribution-config/logging :portkey.aws.cloudfront.-2018-06-18/cache-behaviors :portkey.aws.cloudfront.-2018-06-18/custom-error-responses :portkey.aws.cloudfront.-2018-06-18/aliases :portkey.aws.cloudfront.-2018-06-18/price-class :portkey.aws.cloudfront.-2018-06-18/http-version :portkey.aws.cloudfront.-2018-06-18/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/public-key :portkey.aws.cloudfront.-2018-06-18.get-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-distributions-associated-to-field-level-encryption-config/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-associated-to-field-level-encryption-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-distributions-associated-to-field-level-encryption-config/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/public-key :portkey.aws.cloudfront.-2018-06-18.update-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-summary/name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-summary/created-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-summary/encoded-key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.public-key-summary/id :portkey.aws.cloudfront.-2018-06-18.public-key-summary/name :portkey.aws.cloudfront.-2018-06-18.public-key-summary/created-time :portkey.aws.cloudfront.-2018-06-18.public-key-summary/encoded-key] :opt-un [:portkey.aws.cloudfront.-2018-06-18.public-key-summary/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution-config :portkey.aws.cloudfront.-2018-06-18.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-public-keys-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-public-keys-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-public-keys-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-public-keys-request/marker :portkey.aws.cloudfront.-2018-06-18.list-public-keys-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 0 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256)) (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__22929__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution :portkey.aws.cloudfront.-2018-06-18.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config :portkey.aws.cloudfront.-2018-06-18.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profile-config/forward-when-query-arg-profile-is-unknown (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.query-arg-profile-config/forward-when-query-arg-profile-is-unknown] :opt-un [:portkey.aws.cloudfront.-2018-06-18/query-arg-profiles]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-public-keys-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/public-key-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-configs/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-configs (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-configs/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profiles/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profiles/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-arg-profiles (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.query-arg-profiles/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.query-arg-profiles/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-config-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution :portkey.aws.cloudfront.-2018-06-18.create-distribution-with-tags-result/location :portkey.aws.cloudfront.-2018-06-18.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-query-arg-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-query-arg-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-query-arg-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config :portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.-2018-06-18.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.create-invalidation-result/location :portkey.aws.cloudfront.-2018-06-18/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-origin-read-timeout/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-origin-read-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-origin-read-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2018-06-18.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.origin-custom-header/header-name :portkey.aws.cloudfront.-2018-06-18.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2018-06-18/s-3-origin :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/comment :portkey.aws.cloudfront.-2018-06-18/trusted-signers :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2018-06-18/aliases :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-config/logging :portkey.aws.cloudfront.-2018-06-18/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/public-key-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-pattern-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.tag/key] :opt-un [:portkey.aws.cloudfront.-2018-06-18.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/enabled :portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/bucket :portkey.aws.cloudfront.-2018-06-18.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-public-keys/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-public-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-public-keys/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-config :portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-field-level-encryption-profile-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/id :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/last-modified-time] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-summary/comment :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-config :portkey.aws.cloudfront.-2018-06-18/content-type-profile-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.distribution-summary/id :portkey.aws.cloudfront.-2018-06-18.distribution-summary/arn :portkey.aws.cloudfront.-2018-06-18.distribution-summary/status :portkey.aws.cloudfront.-2018-06-18.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2018-06-18.distribution-summary/domain-name :portkey.aws.cloudfront.-2018-06-18/aliases :portkey.aws.cloudfront.-2018-06-18/origins :portkey.aws.cloudfront.-2018-06-18/default-cache-behavior :portkey.aws.cloudfront.-2018-06-18/cache-behaviors :portkey.aws.cloudfront.-2018-06-18/custom-error-responses :portkey.aws.cloudfront.-2018-06-18.distribution-summary/comment :portkey.aws.cloudfront.-2018-06-18/price-class :portkey.aws.cloudfront.-2018-06-18.distribution-summary/enabled :portkey.aws.cloudfront.-2018-06-18/viewer-certificate :portkey.aws.cloudfront.-2018-06-18/restrictions :portkey.aws.cloudfront.-2018-06-18.distribution-summary/web-acl-id :portkey.aws.cloudfront.-2018-06-18/http-version :portkey.aws.cloudfront.-2018-06-18.distribution-summary/is-ipv-6-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.public-key-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/lambda-function-association-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/lambda-function-association))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/minimum-protocol-version #{"TLSv1" :tl-sv-1 "TLSv1_2016" :tl-sv-12-2018 :ss-lv-3 "TLSv1.2_2018" "SSLv3" :tl-sv-11-2016 :tl-sv-1-2016 "TLSv1.1_2016"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.origins/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.origins/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/distribution-config :portkey.aws.cloudfront.-2018-06-18/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-public-key-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-public-key-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-public-key-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution :portkey.aws.cloudfront.-2018-06-18.create-distribution-result/location :portkey.aws.cloudfront.-2018-06-18.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2018-06-18.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.query-arg-profile-empty/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-empty (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.query-arg-profile-empty/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__22929__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.distribution-list/marker :portkey.aws.cloudfront.-2018-06-18.distribution-list/max-items :portkey.aws.cloudfront.-2018-06-18.distribution-list/is-truncated :portkey.aws.cloudfront.-2018-06-18.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.distribution-list/next-marker :portkey.aws.cloudfront.-2018-06-18.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/streaming-distribution :portkey.aws.cloudfront.-2018-06-18.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-config :portkey.aws.cloudfront.-2018-06-18.get-field-level-encryption-profile-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/http-version #{:http-11 "http2" :http-2 "http1.1"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-content-type-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-content-type-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-content-type-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2018-06-18.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-origin-keepalive-timeout/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-origin-keepalive-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-origin-keepalive-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-profile-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-profile-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-profile-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/marker :portkey.aws.cloudfront.-2018-06-18.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.untag-resource-request/resource :portkey.aws.cloudfront.-2018-06-18/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/public-key-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.public-key-list/max-items :portkey.aws.cloudfront.-2018-06-18.public-key-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.public-key-list/next-marker :portkey.aws.cloudfront.-2018-06-18.public-key-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/field-level-encryption-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2018-06-18/forwarded-values :portkey.aws.cloudfront.-2018-06-18/trusted-signers :portkey.aws.cloudfront.-2018-06-18/viewer-protocol-policy :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/field-level-encryption-id :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/compress :portkey.aws.cloudfront.-2018-06-18/lambda-function-associations :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2018-06-18/allowed-methods :portkey.aws.cloudfront.-2018-06-18.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.trusted-signers/enabled :portkey.aws.cloudfront.-2018-06-18.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-config-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-config-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.delete-field-level-encryption-config-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-field-patterns/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-field-patterns (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-field-level-encryption-field-patterns/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/max-items :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/next-marker :portkey.aws.cloudfront.-2018-06-18.field-level-encryption-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.public-key/created-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/public-key (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.public-key/id :portkey.aws.cloudfront.-2018-06-18.public-key/created-time :portkey.aws.cloudfront.-2018-06-18/public-key-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/distribution-config :portkey.aws.cloudfront.-2018-06-18.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2018-06-18.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/create-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18/public-key-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2018-06-18/ssl-support-method :portkey.aws.cloudfront.-2018-06-18/minimum-protocol-version :portkey.aws.cloudfront.-2018-06-18.viewer-certificate/certificate :portkey.aws.cloudfront.-2018-06-18/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2018-06-18.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2018-06-18.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2018-06-18.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2018-06-18/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2018-06-18.geo-restriction/restriction-type :portkey.aws.cloudfront.-2018-06-18.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2018-06-18.geo-restriction/items]))

(clojure.core/defn tag-resource-2018-06-18 ([tag-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/tagging?Operation=Tag", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "TagResource2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2018-06-18/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2018-06-18/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2018-06-18 ([get-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistribution2018_06_18", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-distribution-result))

(clojure.core/defn get-public-key-2018-06-18 ([get-public-key-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-public-key-request get-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPublicKey2018_06_18", :http.request.configuration/output-deser-fn response-get-public-key-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key}})))))
(clojure.spec.alpha/fdef get-public-key-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-public-key-result))

(clojure.core/defn create-streaming-distribution-with-tags-2018-06-18 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution?WithTags", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistributionWithTags2018_06_18", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2018-06-18/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2018-06-18/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2018-06-18 ([update-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDistribution2018_06_18", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2018-06-18/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2018-06-18/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2018-06-18/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2018-06-18/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2018-06-18/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront.-2018-06-18/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront.-2018-06-18/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2018-06-18/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2018-06-18/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2018-06-18/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2018-06-18/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-06-18/invalid-web-acl-id, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2018-06-18/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2018-06-18/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2018-06-18/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2018-06-18/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront.-2018-06-18/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2018-06-18/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2018-06-18/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2018-06-18/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-read-timeout, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2018-06-18/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-distribution-result))

(clojure.core/defn update-field-level-encryption-profile-2018-06-18 ([update-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-field-level-encryption-profile-request update-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateFieldLevelEncryptionProfile2018_06_18", :http.request.configuration/output-deser-fn response-update-field-level-encryption-profile-result, :http.request.spec/error-spec {"FieldLevelEncryptionProfileAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-already-exists, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "FieldLevelEncryptionProfileSizeExceeded" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-size-exceeded, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile, "TooManyFieldLevelEncryptionEncryptionEntities" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-encryption-entities, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TooManyFieldLevelEncryptionFieldPatterns" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-field-patterns}})))))
(clojure.spec.alpha/fdef update-field-level-encryption-profile-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-profile-result))

(clojure.core/defn delete-streaming-distribution-2018-06-18 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteStreamingDistribution2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2018-06-18 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2018-06-18 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution?WithTags", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistributionWithTags2018_06_18", :http.request.configuration/output-deser-fn response-create-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2018-06-18/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2018-06-18/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2018-06-18/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2018-06-18/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2018-06-18/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2018-06-18/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront.-2018-06-18/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront.-2018-06-18/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2018-06-18/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2018-06-18/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2018-06-18/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2018-06-18/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-06-18/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2018-06-18/invalid-origin, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2018-06-18/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2018-06-18/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2018-06-18/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2018-06-18/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront.-2018-06-18/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2018-06-18/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2018-06-18/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2018-06-18/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront.-2018-06-18/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2018-06-18/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-distribution-with-tags-result))

(clojure.core/defn delete-field-level-encryption-profile-2018-06-18 ([delete-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-field-level-encryption-profile-request delete-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteFieldLevelEncryptionProfile2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "FieldLevelEncryptionProfileInUse" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-in-use}})))))
(clojure.spec.alpha/fdef delete-field-level-encryption-profile-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-invalidation-2018-06-18 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInvalidation2018_06_18", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2018-06-18/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-invalidation-result))

(clojure.core/defn list-field-level-encryption-profiles-2018-06-18 ([] (list-field-level-encryption-profiles-2018-06-18 {})) ([list-field-level-encryption-profiles-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-field-level-encryption-profiles-request list-field-level-encryption-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListFieldLevelEncryptionProfiles2018_06_18", :http.request.configuration/output-deser-fn response-list-field-level-encryption-profiles-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-field-level-encryption-profiles-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-profiles-result))

(clojure.core/defn create-field-level-encryption-profile-2018-06-18 ([create-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-field-level-encryption-profile-request create-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateFieldLevelEncryptionProfile2018_06_18", :http.request.configuration/output-deser-fn response-create-field-level-encryption-profile-result, :http.request.spec/error-spec {"InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key, "FieldLevelEncryptionProfileAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-already-exists, "FieldLevelEncryptionProfileSizeExceeded" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-profile-size-exceeded, "TooManyFieldLevelEncryptionProfiles" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-profiles, "TooManyFieldLevelEncryptionEncryptionEntities" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-encryption-entities, "TooManyFieldLevelEncryptionFieldPatterns" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-field-patterns}})))))
(clojure.spec.alpha/fdef create-field-level-encryption-profile-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-profile-result))

(clojure.core/defn create-streaming-distribution-2018-06-18 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistribution2018_06_18", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2018-06-18/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-streaming-distribution-result))

(clojure.core/defn get-field-level-encryption-profile-2018-06-18 ([get-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-field-level-encryption-profile-request get-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFieldLevelEncryptionProfile2018_06_18", :http.request.configuration/output-deser-fn response-get-field-level-encryption-profile-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-profile-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-result))

(clojure.core/defn list-field-level-encryption-configs-2018-06-18 ([] (list-field-level-encryption-configs-2018-06-18 {})) ([list-field-level-encryption-configs-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-field-level-encryption-configs-request list-field-level-encryption-configs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListFieldLevelEncryptionConfigs2018_06_18", :http.request.configuration/output-deser-fn response-list-field-level-encryption-configs-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-field-level-encryption-configs-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-field-level-encryption-configs-result))

(clojure.core/defn list-tags-for-resource-2018-06-18 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/tagging", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource2018_06_18", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2018-06-18/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2018-06-18/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2018-06-18 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistribution2018_06_18", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-result))

(clojure.core/defn get-field-level-encryption-2018-06-18 ([get-field-level-encryption-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-field-level-encryption-request get-field-level-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFieldLevelEncryption2018_06_18", :http.request.configuration/output-deser-fn response-get-field-level-encryption-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-result))

(clojure.core/defn create-distribution-2018-06-18 ([create-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistribution2018_06_18", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2018-06-18/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2018-06-18/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2018-06-18/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2018-06-18/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2018-06-18/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2018-06-18/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront.-2018-06-18/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront.-2018-06-18/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2018-06-18/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2018-06-18/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2018-06-18/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2018-06-18/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2018-06-18/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-06-18/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2018-06-18/invalid-origin, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2018-06-18/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2018-06-18/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2018-06-18/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2018-06-18/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront.-2018-06-18/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2018-06-18/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2018-06-18/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2018-06-18/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2018-06-18/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2018-06-18/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2018-06-18/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-distribution-result))

(clojure.core/defn create-field-level-encryption-config-2018-06-18 ([create-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-field-level-encryption-config-request create-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateFieldLevelEncryptionConfig2018_06_18", :http.request.configuration/output-deser-fn response-create-field-level-encryption-config-result, :http.request.spec/error-spec {"InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile, "FieldLevelEncryptionConfigAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config-already-exists, "TooManyFieldLevelEncryptionConfigs" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-configs, "TooManyFieldLevelEncryptionQueryArgProfiles" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-query-arg-profiles, "TooManyFieldLevelEncryptionContentTypeProfiles" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-content-type-profiles, "QueryArgProfileEmpty" :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-empty}})))))
(clojure.spec.alpha/fdef create-field-level-encryption-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-field-level-encryption-config-result))

(clojure.core/defn get-streaming-distribution-config-2018-06-18 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistributionConfig2018_06_18", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-streaming-distribution-config-result))

(clojure.core/defn update-field-level-encryption-config-2018-06-18 ([update-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-field-level-encryption-config-request update-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateFieldLevelEncryptionConfig2018_06_18", :http.request.configuration/output-deser-fn response-update-field-level-encryption-config-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config, "TooManyFieldLevelEncryptionQueryArgProfiles" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-query-arg-profiles, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "QueryArgProfileEmpty" :portkey.aws.cloudfront.-2018-06-18/query-arg-profile-empty, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "TooManyFieldLevelEncryptionContentTypeProfiles" :portkey.aws.cloudfront.-2018-06-18/too-many-field-level-encryption-content-type-profiles, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-field-level-encryption-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-field-level-encryption-config-result))

(clojure.core/defn list-distributions-2018-06-18 ([] (list-distributions-2018-06-18 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributions2018_06_18", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-distributions-result))

(clojure.core/defn list-public-keys-2018-06-18 ([] (list-public-keys-2018-06-18 {})) ([list-public-keys-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-public-keys-request list-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-public-keys-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-public-keys-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListPublicKeys2018_06_18", :http.request.configuration/output-deser-fn response-list-public-keys-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-public-keys-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-public-keys-result))

(clojure.core/defn create-public-key-2018-06-18 ([create-public-key-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-public-key-request create-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreatePublicKey2018_06_18", :http.request.configuration/output-deser-fn response-create-public-key-result, :http.request.spec/error-spec {"PublicKeyAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/public-key-already-exists, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "TooManyPublicKeys" :portkey.aws.cloudfront.-2018-06-18/too-many-public-keys}})))))
(clojure.spec.alpha/fdef create-public-key-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-public-key-result))

(clojure.core/defn get-field-level-encryption-profile-config-2018-06-18 ([get-field-level-encryption-profile-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-field-level-encryption-profile-config-request get-field-level-encryption-profile-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption-profile/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFieldLevelEncryptionProfileConfig2018_06_18", :http.request.configuration/output-deser-fn response-get-field-level-encryption-profile-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-profile}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-profile-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-profile-config-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2018-06-18 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2018_06_18", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2018-06-18 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInvalidations2018_06_18", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-invalidations-result))

(clojure.core/defn delete-public-key-2018-06-18 ([delete-public-key-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-public-key-request delete-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeletePublicKey2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "PublicKeyInUse" :portkey.aws.cloudfront.-2018-06-18/public-key-in-use, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-public-key-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-public-key-request) :ret clojure.core/true?)

(clojure.core/defn untag-resource-2018-06-18 ([untag-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/tagging?Operation=Untag", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "UntagResource2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2018-06-18/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2018-06-18/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2018-06-18 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2018_06_18", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2018-06-18 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2018_06_18", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2018-06-18 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStreamingDistribution2018_06_18", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2018-06-18/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2018-06-18/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2018-06-18/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2018-06-18/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2018-06-18 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistributionConfig2018_06_18", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-distribution-config-result))

(clojure.core/defn get-public-key-config-2018-06-18 ([get-public-key-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-public-key-config-request get-public-key-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetPublicKeyConfig2018_06_18", :http.request.configuration/output-deser-fn response-get-public-key-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key}})))))
(clojure.spec.alpha/fdef get-public-key-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-public-key-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2018-06-18 ([] (list-cloud-front-origin-access-identities-2018-06-18 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2018_06_18", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2018-06-18 ([] (list-streaming-distributions-2018-06-18 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/streaming-distribution", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreamingDistributions2018_06_18", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2018-06-18 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-streaming-distributions-result))

(clojure.core/defn update-public-key-2018-06-18 ([update-public-key-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-public-key-request update-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/update-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/public-key/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/update-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdatePublicKey2018_06_18", :http.request.configuration/output-deser-fn response-update-public-key-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "CannotChangeImmutablePublicKeyFields" :portkey.aws.cloudfront.-2018-06-18/cannot-change-immutable-public-key-fields, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2018-06-18/illegal-update, "NoSuchPublicKey" :portkey.aws.cloudfront.-2018-06-18/no-such-public-key, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed}})))))
(clojure.spec.alpha/fdef update-public-key-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/update-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/update-public-key-result))

(clojure.core/defn get-field-level-encryption-config-2018-06-18 ([get-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-field-level-encryption-config-request get-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption/{Id}/config", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetFieldLevelEncryptionConfig2018_06_18", :http.request.configuration/output-deser-fn response-get-field-level-encryption-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/get-field-level-encryption-config-result))

(clojure.core/defn delete-distribution-2018-06-18 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteDistribution2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2018-06-18/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2018-06-18 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateInvalidation2018_06_18", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2018-06-18/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2018-06-18/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2018-06-18/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-invalidation-result))

(clojure.core/defn delete-field-level-encryption-config-2018-06-18 ([delete-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-field-level-encryption-config-request delete-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/field-level-encryption/{Id}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteFieldLevelEncryptionConfig2018_06_18", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2018-06-18/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2018-06-18/invalid-if-match-version, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront.-2018-06-18/no-such-field-level-encryption-config, "PreconditionFailed" :portkey.aws.cloudfront.-2018-06-18/precondition-failed, "FieldLevelEncryptionConfigInUse" :portkey.aws.cloudfront.-2018-06-18/field-level-encryption-config-in-use}})))))
(clojure.spec.alpha/fdef delete-field-level-encryption-config-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/delete-field-level-encryption-config-request) :ret clojure.core/true?)

(clojure.core/defn list-distributions-by-web-acl-id-2018-06-18 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributionsByWebACLId2018_06_18", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2018-06-18/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2018-06-18 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2018-06-18/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-06-18/origin-access-identity/cloudfront", :http.request.configuration/version "2018-06-18", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2018_06_18", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2018-06-18/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2018-06-18/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2018-06-18/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2018-06-18/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2018-06-18/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2018-06-18 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2018-06-18/create-cloud-front-origin-access-identity-result))
