(ns portkey.aws.cloudfront (:require [portkey.aws]))

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
   "eu-north-1"
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

(clojure.core/declare ser-origin-group-list)

(clojure.core/declare ser-query-arg-profile)

(clojure.core/declare ser-lambda-function-association)

(clojure.core/declare ser-forwarded-values)

(clojure.core/declare ser-origin-group-members)

(clojure.core/declare ser-invalidation-batch)

(clojure.core/declare ser-origin-group-failover-criteria)

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

(clojure.core/declare ser-origin-group-member)

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

(clojure.core/declare ser-status-code-list)

(clojure.core/declare ser-geo-restriction-type)

(clojure.core/declare ser-status-codes)

(clojure.core/declare ser-paths)

(clojure.core/declare serinteger)

(clojure.core/declare ser-cache-behavior-list)

(clojure.core/declare ser-origin-custom-header)

(clojure.core/declare ser-streaming-distribution-config)

(clojure.core/declare ser-origin-group-member-list)

(clojure.core/declare ser-field-pattern-list)

(clojure.core/declare ser-s-3-origin-config)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-origin-group)

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

(clojure.core/declare ser-origin-groups)

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

(clojure.core/defn- ser-origin-group-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin-group coll) #:http.request.field{:shape "OriginGroup", :location-name "OriginGroup"}))) input), :shape "OriginGroupList", :type "list"})

(clojure.core/defn- ser-query-arg-profile [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:query-arg input)) #:http.request.field{:name "QueryArg", :shape "string"}) (clojure.core/into (serstring (:profile-id input)) #:http.request.field{:name "ProfileId", :shape "string"})], :shape "QueryArgProfile", :type "structure"}))

(clojure.core/defn- ser-lambda-function-association [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lambda-function-arn (:lambda-function-arn input)) #:http.request.field{:name "LambdaFunctionARN", :shape "LambdaFunctionARN"}) (clojure.core/into (ser-event-type (:event-type input)) #:http.request.field{:name "EventType", :shape "EventType"})], :shape "LambdaFunctionAssociation", :type "structure"} (clojure.core/contains? input :include-body) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :include-body)) #:http.request.field{:name "IncludeBody", :shape "boolean"}))))

(clojure.core/defn- ser-forwarded-values [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:query-string input)) #:http.request.field{:name "QueryString", :shape "boolean"}) (clojure.core/into (ser-cookie-preference (:cookies input)) #:http.request.field{:name "Cookies", :shape "CookiePreference"})], :shape "ForwardedValues", :type "structure"} (clojure.core/contains? input :headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-headers (input :headers)) #:http.request.field{:name "Headers", :shape "Headers"})) (clojure.core/contains? input :query-string-cache-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys (input :query-string-cache-keys)) #:http.request.field{:name "QueryStringCacheKeys", :shape "QueryStringCacheKeys"}))))

(clojure.core/defn- ser-origin-group-members [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OriginGroupMembers"}))

(clojure.core/defn- ser-invalidation-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-paths (:paths input)) #:http.request.field{:name "Paths", :shape "Paths"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "InvalidationBatch", :type "structure"}))

(clojure.core/defn- ser-origin-group-failover-criteria [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OriginGroupFailoverCriteria"}))

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

(clojure.core/defn- ser-origin-group-member [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:origin-id input)) #:http.request.field{:name "OriginId", :shape "string"})], :shape "OriginGroupMember", :type "structure"}))

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

(clojure.core/defn- ser-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-origins (:origins input)) #:http.request.field{:name "Origins", :shape "Origins"}) (clojure.core/into (ser-default-cache-behavior (:default-cache-behavior input)) #:http.request.field{:name "DefaultCacheBehavior", :shape "DefaultCacheBehavior"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "DistributionConfig", :type "structure"} (clojure.core/contains? input :default-root-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :default-root-object)) #:http.request.field{:name "DefaultRootObject", :shape "string"})) (clojure.core/contains? input :is-ipv-6-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :is-ipv-6-enabled)) #:http.request.field{:name "IsIPV6Enabled", :shape "boolean"})) (clojure.core/contains? input :restrictions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restrictions (input :restrictions)) #:http.request.field{:name "Restrictions", :shape "Restrictions"})) (clojure.core/contains? input :web-acl-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "LoggingConfig"})) (clojure.core/contains? input :cache-behaviors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behaviors (input :cache-behaviors)) #:http.request.field{:name "CacheBehaviors", :shape "CacheBehaviors"})) (clojure.core/contains? input :custom-error-responses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-responses (input :custom-error-responses)) #:http.request.field{:name "CustomErrorResponses", :shape "CustomErrorResponses"})) (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"})) (clojure.core/contains? input :http-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-version (input :http-version)) #:http.request.field{:name "HttpVersion", :shape "HttpVersion"})) (clojure.core/contains? input :origin-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-groups (input :origin-groups)) #:http.request.field{:name "OriginGroups", :shape "OriginGroups"})) (clojure.core/contains? input :viewer-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-viewer-certificate (input :viewer-certificate)) #:http.request.field{:name "ViewerCertificate", :shape "ViewerCertificate"}))))

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

(clojure.core/defn- ser-status-code-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser coll) {}))) input), :shape "StatusCodeList"})

(clojure.core/defn- ser-geo-restriction-type [input] #:http.request.field{:value (clojure.core/get {"blacklist" "blacklist", :blacklist "blacklist", "whitelist" "whitelist", :whitelist "whitelist", "none" "none", :none "none"} input), :shape "GeoRestrictionType"})

(clojure.core/defn- ser-status-codes [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StatusCodes"}))

(clojure.core/defn- ser-paths [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Paths", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path-list (input :items)) #:http.request.field{:name "Items", :shape "PathList"}))))

(clojure.core/defn- serinteger [input] #:http.request.field{:value input, :shape "integer"})

(clojure.core/defn- ser-cache-behavior-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cache-behavior coll) #:http.request.field{:shape "CacheBehavior", :location-name "CacheBehavior"}))) input), :shape "CacheBehaviorList", :type "list"})

(clojure.core/defn- ser-origin-custom-header [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:header-name input)) #:http.request.field{:name "HeaderName", :shape "string"}) (clojure.core/into (serstring (:header-value input)) #:http.request.field{:name "HeaderValue", :shape "string"})], :shape "OriginCustomHeader", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-s-3-origin (:s-3-origin input)) #:http.request.field{:name "S3Origin", :shape "S3Origin"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "StreamingDistributionConfig", :type "structure"} (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-streaming-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "StreamingLoggingConfig"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"}))))

(clojure.core/defn- ser-origin-group-member-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin-group-member coll) #:http.request.field{:shape "OriginGroupMember", :location-name "OriginGroupMember"}))) input), :shape "OriginGroupMemberList", :type "list", :max 2, :min 2})

(clojure.core/defn- ser-field-pattern-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "FieldPattern"}))) input), :shape "FieldPatternList", :type "list"})

(clojure.core/defn- ser-s-3-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3OriginConfig", :type "structure"}))

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-origin-group [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "OriginGroup"}))

(clojure.core/defn- ser-streaming-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "StreamingLoggingConfig", :type "structure"}))

(clojure.core/defn- ser-ssl-protocol [input] #:http.request.field{:value (clojure.core/get {"SSLv3" "SSLv3", :ss-lv-3 "SSLv3", "TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1.1" "TLSv1.1", :tl-sv-11 "TLSv1.1", "TLSv1.2" "TLSv1.2", :tl-sv-12 "TLSv1.2"} input), :shape "SslProtocol"})

(clojure.core/defn- ser-lambda-function-association-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lambda-function-association coll) #:http.request.field{:shape "LambdaFunctionAssociation", :location-name "LambdaFunctionAssociation"}))) input), :shape "LambdaFunctionAssociationList", :type "list"})

(clojure.core/defn- ser-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Headers", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-header-list (input :items)) #:http.request.field{:name "Items", :shape "HeaderList"}))))

(clojure.core/defn- ser-minimum-protocol-version [input] #:http.request.field{:value (clojure.core/get {"TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1_2016" "TLSv1_2016", :tl-sv-12-2018 "TLSv1.2_2018", :ss-lv-3 "SSLv3", "TLSv1.2_2018" "TLSv1.2_2018", "SSLv3" "SSLv3", :tl-sv-11-2016 "TLSv1.1_2016", :tl-sv-1-2016 "TLSv1_2016", "TLSv1.1_2016" "TLSv1.1_2016"} input), :shape "MinimumProtocolVersion"})

(clojure.core/defn- ser-origins [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-origin-list (:items input)) #:http.request.field{:name "Items", :shape "OriginList"})], :shape "Origins", :type "structure"}))

(clojure.core/defn- ser-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-distribution-config (:distribution-config input)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "DistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-header-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "HeaderList", :type "list"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-ssl-support-method [input] #:http.request.field{:value (clojure.core/get {"sni-only" "sni-only", :snionly "sni-only", "vip" "vip", :vip "vip"} input), :shape "SSLSupportMethod"})

(clojure.core/defn- ser-http-version [input] #:http.request.field{:value (clojure.core/get {"http1.1" "http1.1", :http-11 "http1.1", "http2" "http2", :http-2 "http2"} input), :shape "HttpVersion"})

(clojure.core/defn- ser-cookie-preference [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-item-selection (:forward input)) #:http.request.field{:name "Forward", :shape "ItemSelection"})], :shape "CookiePreference", :type "structure"} (clojure.core/contains? input :whitelisted-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-names (input :whitelisted-names)) #:http.request.field{:name "WhitelistedNames", :shape "CookieNames"}))))

(clojure.core/defn- ser-custom-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomHeaders", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-custom-headers-list (input :items)) #:http.request.field{:name "Items", :shape "OriginCustomHeadersList"}))))

(clojure.core/defn- ser-origin-groups [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "OriginGroups", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-group-list (input :items)) #:http.request.field{:name "Items", :shape "OriginGroupList"}))))

(clojure.core/defn- ser-methods-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-method coll) #:http.request.field{:shape "Method", :location-name "Method"}))) input), :shape "MethodsList", :type "list"})

(clojure.core/defn- ser-default-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "DefaultCacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :field-level-encryption-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-level-encryption-id)) #:http.request.field{:name "FieldLevelEncryptionId", :shape "string"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-trusted-signers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "TrustedSigners", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-number-list (input :items)) #:http.request.field{:name "Items", :shape "AwsAccountNumberList"}))))

(clojure.core/defn- ser-viewer-certificate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ViewerCertificate", :type "structure"} (clojure.core/contains? input :cloud-front-default-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :cloud-front-default-certificate)) #:http.request.field{:name "CloudFrontDefaultCertificate", :shape "boolean"})) (clojure.core/contains? input :iam-certificate-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :iam-certificate-id)) #:http.request.field{:name "IAMCertificateId", :shape "string"})) (clojure.core/contains? input :acm-certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :acm-certificate-arn)) #:http.request.field{:name "ACMCertificateArn", :shape "string"})) (clojure.core/contains? input :ssl-support-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-support-method (input :ssl-support-method)) #:http.request.field{:name "SSLSupportMethod", :shape "SSLSupportMethod"})) (clojure.core/contains? input :minimum-protocol-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-protocol-version (input :minimum-protocol-version)) #:http.request.field{:name "MinimumProtocolVersion", :shape "MinimumProtocolVersion"})) (clojure.core/contains? input :certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :certificate)) #:http.request.field{:name "Certificate", :shape "string", :deprecated true})) (clojure.core/contains? input :certificate-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-source (input :certificate-source)) #:http.request.field{:name "CertificateSource", :shape "CertificateSource", :deprecated true}))))

(clojure.core/defn- ser-cloud-front-origin-access-identity-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"})], :shape "CloudFrontOriginAccessIdentityConfig", :type "structure"}))

(clojure.core/defn- ser-geo-restriction [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction-type (:restriction-type input)) #:http.request.field{:name "RestrictionType", :shape "GeoRestrictionType"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "GeoRestriction", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location-list (input :items)) #:http.request.field{:name "Items", :shape "LocationList"}))))

(clojure.core/defn- req-list-distributions-by-web-acl-id-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string", :location "uri", :location-name "WebACLId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-create-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-profile-config (input :field-level-encryption-profile-config)) #:http.request.field{:name "FieldLevelEncryptionProfileConfig", :shape "FieldLevelEncryptionProfileConfig", :location-name "FieldLevelEncryptionProfileConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-create-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-config (input :field-level-encryption-config)) #:http.request.field{:name "FieldLevelEncryptionConfig", :shape "FieldLevelEncryptionConfig", :location-name "FieldLevelEncryptionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-get-streaming-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-public-key-config (input :public-key-config)) #:http.request.field{:name "PublicKeyConfig", :shape "PublicKeyConfig", :location-name "PublicKeyConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-public-key-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})]}))

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-get-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-field-level-encryption-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-get-field-level-encryption-profile-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-list-field-level-encryption-configs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-update-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-config (input :field-level-encryption-config)) #:http.request.field{:name "FieldLevelEncryptionConfig", :shape "FieldLevelEncryptionConfig", :location-name "FieldLevelEncryptionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-field-level-encryption-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-public-keys-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-field-level-encryption-profile-config (input :field-level-encryption-profile-config)) #:http.request.field{:name "FieldLevelEncryptionProfileConfig", :shape "FieldLevelEncryptionProfileConfig", :location-name "FieldLevelEncryptionProfileConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-field-level-encryption-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

(clojure.core/defn- req-delete-field-level-encryption-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-public-key-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-public-key-config (input :public-key-config)) #:http.request.field{:name "PublicKeyConfig", :shape "PublicKeyConfig", :location-name "PublicKeyConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2018-11-05/"}})]}))

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

(clojure.core/declare deser-origin-group-list)

(clojure.core/declare deser-field-level-encryption-profile)

(clojure.core/declare deser-distribution)

(clojure.core/declare deser-cloud-front-origin-access-identity-list)

(clojure.core/declare deser-query-arg-profile)

(clojure.core/declare deser-lambda-function-association)

(clojure.core/declare deser-forwarded-values)

(clojure.core/declare deser-origin-group-members)

(clojure.core/declare deser-invalidation-batch)

(clojure.core/declare deser-origin-group-failover-criteria)

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

(clojure.core/declare deser-origin-group-member)

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

(clojure.core/declare deser-status-code-list)

(clojure.core/declare deser-geo-restriction-type)

(clojure.core/declare deser-status-codes)

(clojure.core/declare deser-paths)

(clojure.core/declare deser-field-level-encryption-summary-list)

(clojure.core/declare deserinteger)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary)

(clojure.core/declare deser-cache-behavior-list)

(clojure.core/declare deser-origin-custom-header)

(clojure.core/declare deser-streaming-distribution-config)

(clojure.core/declare deser-origin-group-member-list)

(clojure.core/declare deser-public-key-summary-list)

(clojure.core/declare deser-field-pattern-list)

(clojure.core/declare deser-s-3-origin-config)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-origin-group)

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

(clojure.core/declare deser-origin-groups)

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

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__21570__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__21570__auto__) true (clojure.core/= "false" boolstr__21570__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar125027 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar125027 ["Quantity" :content]))} (letvar125027 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar125027 ["Items" :content]))))))

(clojure.core/defn- deser-content-type-profile [input] (clojure.core/let [letvar125219 {"Format" (portkey.aws/search-for-tag input "Format" :flattened? false :xmlAttribute? nil), "ProfileId" (portkey.aws/search-for-tag input "ProfileId" :flattened? false :xmlAttribute? nil), "ContentType" (portkey.aws/search-for-tag input "ContentType" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:format (deser-format (clojure.core/get-in letvar125219 ["Format" :content])), :content-type (deserstring (clojure.core/get-in letvar125219 ["ContentType" :content]))} (letvar125219 "ProfileId") (clojure.core/assoc :profile-id (deserstring (clojure.core/get-in letvar125219 ["ProfileId" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar125411 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar125411 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar125411 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar125411 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar125411 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar125594 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar125594 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar125594 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar125594 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar125829 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar125829 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar125829 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar125829 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar125829 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-field-patterns [input] (clojure.core/let [letvar126098 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar126098 ["Quantity" :content]))} (letvar126098 "Items") (clojure.core/assoc :items (deser-field-pattern-list (clojure.core/get-in letvar126098 ["Items" :content]))))))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar126290 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar126290 ["GeoRestriction" :content]))})))

(clojure.core/defn- deser-field-level-encryption-profile-config [input] (clojure.core/let [letvar126483 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "EncryptionEntities" (portkey.aws/search-for-tag input "EncryptionEntities" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deserstring (clojure.core/get-in letvar126483 ["Name" :content])), :caller-reference (deserstring (clojure.core/get-in letvar126483 ["CallerReference" :content])), :encryption-entities (deser-encryption-entities (clojure.core/get-in letvar126483 ["EncryptionEntities" :content]))} (letvar126483 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar126483 ["Comment" :content]))))))

(clojure.core/defn- deserstring [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-field-level-encryption-config [input] (clojure.core/let [letvar126684 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "QueryArgProfileConfig" (portkey.aws/search-for-tag input "QueryArgProfileConfig" :flattened? false :xmlAttribute? nil), "ContentTypeProfileConfig" (portkey.aws/search-for-tag input "ContentTypeProfileConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar126684 ["CallerReference" :content]))} (letvar126684 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar126684 ["Comment" :content]))) (letvar126684 "QueryArgProfileConfig") (clojure.core/assoc :query-arg-profile-config (deser-query-arg-profile-config (clojure.core/get-in letvar126684 ["QueryArgProfileConfig" :content]))) (letvar126684 "ContentTypeProfileConfig") (clojure.core/assoc :content-type-profile-config (deser-content-type-profile-config (clojure.core/get-in letvar126684 ["ContentTypeProfileConfig" :content]))))))

(clojure.core/defn- deser-origin-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser coll))) input))

(clojure.core/defn- deser-field-level-encryption-profile [input] (clojure.core/let [letvar126911 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "FieldLevelEncryptionProfileConfig" (portkey.aws/search-for-tag input "FieldLevelEncryptionProfileConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar126911 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar126911 ["LastModifiedTime" :content])), :field-level-encryption-profile-config (deser-field-level-encryption-profile-config (clojure.core/get-in letvar126911 ["FieldLevelEncryptionProfileConfig" :content]))})))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar127104 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar127104 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar127104 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar127104 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar127104 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar127104 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar127104 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar127104 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar127104 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar127289 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar127289 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar127289 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar127289 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar127289 ["Quantity" :content]))} (letvar127289 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar127289 ["NextMarker" :content]))) (letvar127289 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar127289 ["Items" :content]))))))

(clojure.core/defn- deser-query-arg-profile [input] (clojure.core/let [letvar127488 {"QueryArg" (portkey.aws/search-for-tag input "QueryArg" :flattened? false :xmlAttribute? nil), "ProfileId" (portkey.aws/search-for-tag input "ProfileId" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-arg (deserstring (clojure.core/get-in letvar127488 ["QueryArg" :content])), :profile-id (deserstring (clojure.core/get-in letvar127488 ["ProfileId" :content]))})))

(clojure.core/defn- deser-lambda-function-association [input] (clojure.core/let [letvar127681 {"LambdaFunctionARN" (portkey.aws/search-for-tag input "LambdaFunctionARN" :flattened? false :xmlAttribute? nil), "EventType" (portkey.aws/search-for-tag input "EventType" :flattened? false :xmlAttribute? nil), "IncludeBody" (portkey.aws/search-for-tag input "IncludeBody" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:lambda-function-arn (deser-lambda-function-arn (clojure.core/get-in letvar127681 ["LambdaFunctionARN" :content])), :event-type (deser-event-type (clojure.core/get-in letvar127681 ["EventType" :content]))} (letvar127681 "IncludeBody") (clojure.core/assoc :include-body (deserboolean (clojure.core/get-in letvar127681 ["IncludeBody" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar127862 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? false :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? false :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? false :xmlAttribute? nil), "QueryStringCacheKeys" (portkey.aws/search-for-tag input "QueryStringCacheKeys" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar127862 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar127862 ["Cookies" :content]))} (letvar127862 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar127862 ["Headers" :content]))) (letvar127862 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar127862 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-origin-group-members [input] (clojure.core/let [letvar128050 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar128234 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar128234 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar128234 ["CallerReference" :content]))})))

(clojure.core/defn- deser-origin-group-failover-criteria [input] (clojure.core/let [letvar128426 {"StatusCodes" (portkey.aws/search-for-tag input "StatusCodes" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:status-codes (deser-status-codes (clojure.core/get-in letvar128426 ["StatusCodes" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar128684 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar128684 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar128684 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar128684 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar128684 ["Quantity" :content]))} (letvar128684 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar128684 ["NextMarker" :content]))) (letvar128684 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar128684 ["Items" :content]))))))

(clojure.core/defn- deser-public-key-config [input] (clojure.core/let [letvar128862 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "EncodedKey" (portkey.aws/search-for-tag input "EncodedKey" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar128862 ["CallerReference" :content])), :name (deserstring (clojure.core/get-in letvar128862 ["Name" :content])), :encoded-key (deserstring (clojure.core/get-in letvar128862 ["EncodedKey" :content]))} (letvar128862 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar128862 ["Comment" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-encryption-entity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-encryption-entity coll))) input))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar129111 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar129111 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar129111 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar129111 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar129111 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar129111 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar129111 ["StreamingDistributionConfig" :content]))} (letvar129111 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar129111 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-lambda-function-associations [input] (clojure.core/let [letvar129303 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar129303 ["Quantity" :content]))} (letvar129303 "Items") (clojure.core/assoc :items (deser-lambda-function-association-list (clojure.core/get-in letvar129303 ["Items" :content]))))))

(clojure.core/defn- deser-encryption-entities [input] (clojure.core/let [letvar129499 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar129499 ["Quantity" :content]))} (letvar129499 "Items") (clojure.core/assoc :items (deser-encryption-entity-list (clojure.core/get-in letvar129499 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-field-level-encryption-profile-summary [input] (clojure.core/let [letvar129701 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "EncryptionEntities" (portkey.aws/search-for-tag input "EncryptionEntities" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar129701 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar129701 ["LastModifiedTime" :content])), :name (deserstring (clojure.core/get-in letvar129701 ["Name" :content])), :encryption-entities (deser-encryption-entities (clojure.core/get-in letvar129701 ["EncryptionEntities" :content]))} (letvar129701 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar129701 ["Comment" :content]))))))

(clojure.core/defn- deser-content-type-profile-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-content-type-profile coll))) input))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar129940 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? false :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? false :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? false :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar129940 ["ErrorCode" :content]))} (letvar129940 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar129940 ["ResponsePagePath" :content]))) (letvar129940 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar129940 ["ResponseCode" :content]))) (letvar129940 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar129940 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar130169 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? false :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar130169 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar130169 ["AwsAccountNumber" :content]))) (letvar130169 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar130169 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-field-level-encryption-profile-list [input] (clojure.core/let [letvar130386 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar130386 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar130386 ["Quantity" :content]))} (letvar130386 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar130386 ["NextMarker" :content]))) (letvar130386 "Items") (clojure.core/assoc :items (deser-field-level-encryption-profile-summary-list (clojure.core/get-in letvar130386 ["Items" :content]))))))

(clojure.core/defn- deser-content-type-profile-config [input] (clojure.core/let [letvar130578 {"ForwardWhenContentTypeIsUnknown" (portkey.aws/search-for-tag input "ForwardWhenContentTypeIsUnknown" :flattened? false :xmlAttribute? nil), "ContentTypeProfiles" (portkey.aws/search-for-tag input "ContentTypeProfiles" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward-when-content-type-is-unknown (deserboolean (clojure.core/get-in letvar130578 ["ForwardWhenContentTypeIsUnknown" :content]))} (letvar130578 "ContentTypeProfiles") (clojure.core/assoc :content-type-profiles (deser-content-type-profiles (clojure.core/get-in letvar130578 ["ContentTypeProfiles" :content]))))))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar130770 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar130770 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar130770 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar130967 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar130967 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar130967 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-query-arg-profile-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-arg-profile coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar131225 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar131225 ["Quantity" :content]))} (letvar131225 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar131225 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar131419 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "FieldLevelEncryptionId" (portkey.aws/search-for-tag input "FieldLevelEncryptionId" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar131419 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar131419 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar131419 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar131419 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar131419 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar131419 ["MinTTL" :content]))} (letvar131419 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar131419 ["SmoothStreaming" :content]))) (letvar131419 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar131419 ["FieldLevelEncryptionId" :content]))) (letvar131419 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar131419 ["Compress" :content]))) (letvar131419 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar131419 ["LambdaFunctionAssociations" :content]))) (letvar131419 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar131419 ["MaxTTL" :content]))) (letvar131419 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar131419 ["AllowedMethods" :content]))) (letvar131419 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar131419 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar131611 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar131611 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar131611 ["Quantity" :content]))} (letvar131611 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar131611 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar131802 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? false :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? false :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? false :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar131802 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar131802 ["DomainName" :content]))} (letvar131802 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar131802 ["OriginPath" :content]))) (letvar131802 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar131802 ["CustomHeaders" :content]))) (letvar131802 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar131802 ["S3OriginConfig" :content]))) (letvar131802 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar131802 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-format [input] (clojure.core/get {"URLEncoded" :url-encoded} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar132002 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar132002 ["Quantity" :content]))} (letvar132002 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar132002 ["Items" :content]))))))

(clojure.core/defn- deser-origin-group-member [input] (clojure.core/let [letvar132176 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar132367 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar132367 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar132367 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar132367 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar132367 ["Quantity" :content]))} (letvar132367 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar132367 ["NextMarker" :content]))) (letvar132367 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar132367 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar132555 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar132555 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar132555 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar132732 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar132732 ["Quantity" :content]))} (letvar132732 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar132732 ["Items" :content]))))))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"viewer-request" :viewerrequest, "viewer-response" :viewerresponse, "origin-request" :originrequest, "origin-response" :originresponse} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-content-type-profiles [input] (clojure.core/let [letvar132933 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar132933 ["Quantity" :content]))} (letvar132933 "Items") (clojure.core/assoc :items (deser-content-type-profile-list (clojure.core/get-in letvar132933 ["Items" :content]))))))

(clojure.core/defn- deser-encryption-entity [input] (clojure.core/let [letvar133125 {"PublicKeyId" (portkey.aws/search-for-tag input "PublicKeyId" :flattened? false :xmlAttribute? nil), "ProviderId" (portkey.aws/search-for-tag input "ProviderId" :flattened? false :xmlAttribute? nil), "FieldPatterns" (portkey.aws/search-for-tag input "FieldPatterns" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:public-key-id (deserstring (clojure.core/get-in letvar133125 ["PublicKeyId" :content])), :provider-id (deserstring (clojure.core/get-in letvar133125 ["ProviderId" :content])), :field-patterns (deser-field-patterns (clojure.core/get-in letvar133125 ["FieldPatterns" :content]))})))

(clojure.core/defn- deser-lambda-function-arn [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar133322 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar133322 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar133322 ["Items" :content]))} (letvar133322 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar133322 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar133522 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? false :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? false :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? false :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? false :xmlAttribute? nil), "OriginReadTimeout" (portkey.aws/search-for-tag input "OriginReadTimeout" :flattened? false :xmlAttribute? nil), "OriginKeepaliveTimeout" (portkey.aws/search-for-tag input "OriginKeepaliveTimeout" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar133522 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar133522 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar133522 ["OriginProtocolPolicy" :content]))} (letvar133522 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar133522 ["OriginSslProtocols" :content]))) (letvar133522 "OriginReadTimeout") (clojure.core/assoc :origin-read-timeout (deserinteger (clojure.core/get-in letvar133522 ["OriginReadTimeout" :content]))) (letvar133522 "OriginKeepaliveTimeout") (clojure.core/assoc :origin-keepalive-timeout (deserinteger (clojure.core/get-in letvar133522 ["OriginKeepaliveTimeout" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar133725 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar133725 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar133725 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar133916 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar133916 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar133916 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar133916 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar133916 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar133916 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar133916 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar133916 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar133916 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar133916 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar133916 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar133916 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar134112 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar134112 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar134112 ["S3CanonicalUserId" :content]))} (letvar134112 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar134112 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-field-level-encryption [input] (clojure.core/let [letvar134347 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "FieldLevelEncryptionConfig" (portkey.aws/search-for-tag input "FieldLevelEncryptionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar134347 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar134347 ["LastModifiedTime" :content])), :field-level-encryption-config (deser-field-level-encryption-config (clojure.core/get-in letvar134347 ["FieldLevelEncryptionConfig" :content]))})))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar134563 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar134563 ["Quantity" :content]))} (letvar134563 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar134563 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar134738 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar134738 ["Quantity" :content]))} (letvar134738 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar134738 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar134917 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar134917 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar134917 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar134917 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar134917 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar134917 ["Enabled" :content]))} (letvar134917 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar134917 ["DefaultRootObject" :content]))) (letvar134917 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar134917 ["IsIPV6Enabled" :content]))) (letvar134917 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar134917 ["Restrictions" :content]))) (letvar134917 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar134917 ["WebACLId" :content]))) (letvar134917 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar134917 ["Logging" :content]))) (letvar134917 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar134917 ["CacheBehaviors" :content]))) (letvar134917 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar134917 ["CustomErrorResponses" :content]))) (letvar134917 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar134917 ["Aliases" :content]))) (letvar134917 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar134917 ["PriceClass" :content]))) (letvar134917 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar134917 ["HttpVersion" :content]))) (letvar134917 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar134917 ["ViewerCertificate" :content]))))))

(clojure.core/defn- deser-public-key-summary [input] (clojure.core/let [letvar135112 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? false :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? false :xmlAttribute? nil), "EncodedKey" (portkey.aws/search-for-tag input "EncodedKey" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar135112 ["Id" :content])), :name (deserstring (clojure.core/get-in letvar135112 ["Name" :content])), :created-time (desertimestamp (clojure.core/get-in letvar135112 ["CreatedTime" :content])), :encoded-key (deserstring (clojure.core/get-in letvar135112 ["EncodedKey" :content]))} (letvar135112 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar135112 ["Comment" :content]))))))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-value [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-method [input] (clojure.core/get {"GET" :get, "HEAD" :head, "POST" :post, "PUT" :put, "PATCH" :patch, "OPTIONS" :options, "DELETE" :delete} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-custom-header coll))) input))

(clojure.core/defn- deser-query-arg-profile-config [input] (clojure.core/let [letvar135464 {"ForwardWhenQueryArgProfileIsUnknown" (portkey.aws/search-for-tag input "ForwardWhenQueryArgProfileIsUnknown" :flattened? false :xmlAttribute? nil), "QueryArgProfiles" (portkey.aws/search-for-tag input "QueryArgProfiles" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward-when-query-arg-profile-is-unknown (deserboolean (clojure.core/get-in letvar135464 ["ForwardWhenQueryArgProfileIsUnknown" :content]))} (letvar135464 "QueryArgProfiles") (clojure.core/assoc :query-arg-profiles (deser-query-arg-profiles (clojure.core/get-in letvar135464 ["QueryArgProfiles" :content]))))))

(clojure.core/defn- deser-origin-protocol-policy [input] (clojure.core/get {"http-only" :httponly, "match-viewer" :matchviewer, "https-only" :httpsonly} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signer coll))) input))

(clojure.core/defn- deser-query-arg-profiles [input] (clojure.core/let [letvar135706 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar135706 ["Quantity" :content]))} (letvar135706 "Items") (clojure.core/assoc :items (deser-query-arg-profile-list (clojure.core/get-in letvar135706 ["Items" :content]))))))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-status-code-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserinteger coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (clojure.core/get {"blacklist" :blacklist, "whitelist" :whitelist, "none" :none} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-status-codes [input] (clojure.core/let [letvar135999 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar136181 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar136181 ["Quantity" :content]))} (letvar136181 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar136181 ["Items" :content]))))))

(clojure.core/defn- deser-field-level-encryption-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-level-encryption-summary coll))) input))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar136424 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar136424 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar136424 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar136424 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar136637 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? false :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar136637 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar136637 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar136842 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar136842 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar136842 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar136842 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar136842 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar136842 ["Enabled" :content]))} (letvar136842 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar136842 ["Aliases" :content]))) (letvar136842 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar136842 ["Logging" :content]))) (letvar136842 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar136842 ["PriceClass" :content]))))))

(clojure.core/defn- deser-origin-group-member-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser coll))) input))

(clojure.core/defn- deser-public-key-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-public-key-summary coll))) input))

(clojure.core/defn- deser-field-pattern-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar137140 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar137140 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar137466 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar137466 ["Key" :content]))} (letvar137466 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar137466 ["Value" :content]))))))

(clojure.core/defn- deser-origin-group [input] (clojure.core/let [letvar137763 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "FailoverCriteria" (portkey.aws/search-for-tag input "FailoverCriteria" :flattened? false :xmlAttribute? nil), "Members" (portkey.aws/search-for-tag input "Members" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar137763 ["Id" :content])), :failover-criteria (deser-origin-group-failover-criteria (clojure.core/get-in letvar137763 ["FailoverCriteria" :content])), :members (deser-origin-group-members (clojure.core/get-in letvar137763 ["Members" :content]))})))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar137956 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar137956 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar137956 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar137956 ["Prefix" :content]))})))

(clojure.core/defn- deser-field-level-encryption-summary [input] (clojure.core/let [letvar138148 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "QueryArgProfileConfig" (portkey.aws/search-for-tag input "QueryArgProfileConfig" :flattened? false :xmlAttribute? nil), "ContentTypeProfileConfig" (portkey.aws/search-for-tag input "ContentTypeProfileConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar138148 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar138148 ["LastModifiedTime" :content]))} (letvar138148 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar138148 ["Comment" :content]))) (letvar138148 "QueryArgProfileConfig") (clojure.core/assoc :query-arg-profile-config (deser-query-arg-profile-config (clojure.core/get-in letvar138148 ["QueryArgProfileConfig" :content]))) (letvar138148 "ContentTypeProfileConfig") (clojure.core/assoc :content-type-profile-config (deser-content-type-profile-config (clojure.core/get-in letvar138148 ["ContentTypeProfileConfig" :content]))))))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar138349 {"IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? false :xmlAttribute? nil), "OriginGroups" (portkey.aws/search-for-tag input "OriginGroups" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar138349 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar138349 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar138349 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar138349 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar138349 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar138349 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar138349 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar138349 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar138349 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar138349 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar138349 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar138349 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar138349 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar138349 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar138349 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar138349 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar138349 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar138349 ["PriceClass" :content]))} (letvar138349 "OriginGroups") (clojure.core/assoc :origin-groups (deser-origin-groups (clojure.core/get-in letvar138349 ["OriginGroups" :content]))))))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-lambda-function-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-association coll))) input))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar138597 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar138597 ["Quantity" :content]))} (letvar138597 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar138597 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1_2016" :tl-sv-1-2016, "TLSv1.1_2016" :tl-sv-11-2016, "TLSv1.2_2018" :tl-sv-12-2018} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar138801 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar138801 ["Quantity" :content])), :items (deser-origin-list (clojure.core/get-in letvar138801 ["Items" :content]))})))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar139016 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar139016 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar139016 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar139016 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar139016 ["Quantity" :content]))} (letvar139016 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar139016 ["NextMarker" :content]))) (letvar139016 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar139016 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-http-version [input] (clojure.core/get {"http1.1" :http-11, "http2" :http-2} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar139233 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? false :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar139233 ["Forward" :content]))} (letvar139233 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar139233 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar139414 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar139414 ["Quantity" :content]))} (letvar139414 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar139414 ["Items" :content]))))))

(clojure.core/defn- deser-origin-groups [input] (clojure.core/let [letvar139600 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar139600 ["Quantity" :content]))} (letvar139600 "Items") (clojure.core/assoc :items (deser-origin-group-list (clojure.core/get-in letvar139600 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-public-key-list [input] (clojure.core/let [letvar139828 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar139828 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar139828 ["Quantity" :content]))} (letvar139828 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar139828 ["NextMarker" :content]))) (letvar139828 "Items") (clojure.core/assoc :items (deser-public-key-summary-list (clojure.core/get-in letvar139828 ["Items" :content]))))))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar140010 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "FieldLevelEncryptionId" (portkey.aws/search-for-tag input "FieldLevelEncryptionId" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar140010 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar140010 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar140010 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar140010 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar140010 ["MinTTL" :content]))} (letvar140010 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar140010 ["SmoothStreaming" :content]))) (letvar140010 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar140010 ["FieldLevelEncryptionId" :content]))) (letvar140010 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar140010 ["Compress" :content]))) (letvar140010 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar140010 ["LambdaFunctionAssociations" :content]))) (letvar140010 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar140010 ["MaxTTL" :content]))) (letvar140010 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar140010 ["AllowedMethods" :content]))) (letvar140010 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar140010 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar140203 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar140203 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar140203 ["Quantity" :content]))} (letvar140203 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar140203 ["Items" :content]))))))

(clojure.core/defn- deser-field-level-encryption-list [input] (clojure.core/let [letvar140384 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar140384 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar140384 ["Quantity" :content]))} (letvar140384 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar140384 ["NextMarker" :content]))) (letvar140384 "Items") (clojure.core/assoc :items (deser-field-level-encryption-summary-list (clojure.core/get-in letvar140384 ["Items" :content]))))))

(clojure.core/defn- deser-public-key [input] (clojure.core/let [letvar140568 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? false :xmlAttribute? nil), "PublicKeyConfig" (portkey.aws/search-for-tag input "PublicKeyConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar140568 ["Id" :content])), :created-time (desertimestamp (clojure.core/get-in letvar140568 ["CreatedTime" :content])), :public-key-config (deser-public-key-config (clojure.core/get-in letvar140568 ["PublicKeyConfig" :content]))})))

(clojure.core/defn- deser-field-level-encryption-profile-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-level-encryption-profile-summary coll))) input))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar140792 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? false :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? false :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? false :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? false :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? false :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? false :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar140792 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar140792 ["CloudFrontDefaultCertificate" :content]))) (letvar140792 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar140792 ["IAMCertificateId" :content]))) (letvar140792 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar140792 ["ACMCertificateArn" :content]))) (letvar140792 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar140792 ["SSLSupportMethod" :content]))) (letvar140792 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar140792 ["MinimumProtocolVersion" :content]))) (letvar140792 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar140792 ["Certificate" :content]))) (letvar140792 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar140792 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar140983 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar140983 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar140983 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar141172 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar141172 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar141172 ["Quantity" :content]))} (letvar141172 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar141172 ["Items" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-result ([input] (response-list-tags-for-resource-result nil input)) ([resultWrapper141187 input] (clojure.core/let [rawinput141186 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141188 {"Tags" (portkey.aws/search-for-tag rawinput141186 "Tags" :flattened? false :result-wrapper resultWrapper141187)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar141188 ["Tags" :content]))}))))

(clojure.core/defn- response-too-many-distributions-with-lambda-associations ([input] (response-too-many-distributions-with-lambda-associations nil input)) ([resultWrapper141190 input] (clojure.core/let [rawinput141189 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141191 {"Message" (portkey.aws/search-for-tag rawinput141189 "Message" :flattened? false :result-wrapper resultWrapper141190)}] (clojure.core/cond-> {} (letvar141191 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141191 ["Message" :content])))))))

(clojure.core/defn- response-no-such-origin ([input] (response-no-such-origin nil input)) ([resultWrapper141193 input] (clojure.core/let [rawinput141192 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141194 {"Message" (portkey.aws/search-for-tag rawinput141192 "Message" :flattened? false :result-wrapper resultWrapper141193)}] (clojure.core/cond-> {} (letvar141194 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141194 ["Message" :content])))))))

(clojure.core/defn- response-invalid-protocol-settings ([input] (response-invalid-protocol-settings nil input)) ([resultWrapper141196 input] (clojure.core/let [rawinput141195 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141197 {"Message" (portkey.aws/search-for-tag rawinput141195 "Message" :flattened? false :result-wrapper resultWrapper141196)}] (clojure.core/cond-> {} (letvar141197 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141197 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list ([input] (response-too-many-cookie-names-in-white-list nil input)) ([resultWrapper141199 input] (clojure.core/let [rawinput141198 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141200 {"Message" (portkey.aws/search-for-tag rawinput141198 "Message" :flattened? false :result-wrapper resultWrapper141199)}] (clojure.core/cond-> {} (letvar141200 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141200 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cache-behaviors ([input] (response-too-many-cache-behaviors nil input)) ([resultWrapper141202 input] (clojure.core/let [rawinput141201 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141204 {"Message" (portkey.aws/search-for-tag rawinput141201 "Message" :flattened? false :result-wrapper resultWrapper141202)}] (clojure.core/cond-> {} (letvar141204 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141204 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origin-custom-headers ([input] (response-too-many-origin-custom-headers nil input)) ([resultWrapper141208 input] (clojure.core/let [rawinput141207 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141209 {"Message" (portkey.aws/search-for-tag rawinput141207 "Message" :flattened? false :result-wrapper resultWrapper141208)}] (clojure.core/cond-> {} (letvar141209 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141209 ["Message" :content])))))))

(clojure.core/defn- response-create-field-level-encryption-config-result ([input] (response-create-field-level-encryption-config-result nil input)) ([resultWrapper141213 input] (clojure.core/let [rawinput141212 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141214 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput141212 "FieldLevelEncryption" :flattened? false :result-wrapper resultWrapper141213), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141214 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar141214 ["FieldLevelEncryption" :content]))) (letvar141214 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar141214 ["Location"]))) (letvar141214 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141214 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distributions ([input] (response-too-many-streaming-distributions nil input)) ([resultWrapper141216 input] (clojure.core/let [rawinput141215 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141217 {"Message" (portkey.aws/search-for-tag rawinput141215 "Message" :flattened? false :result-wrapper resultWrapper141216)}] (clojure.core/cond-> {} (letvar141217 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141217 ["Message" :content])))))))

(clojure.core/defn- response-get-streaming-distribution-result ([input] (response-get-streaming-distribution-result nil input)) ([resultWrapper141219 input] (clojure.core/let [rawinput141218 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141220 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput141218 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper141219), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141220 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar141220 ["StreamingDistribution" :content]))) (letvar141220 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141220 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es ([input] (response-too-many-streaming-distribution-cnam-es nil input)) ([resultWrapper141225 input] (clojure.core/let [rawinput141224 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141226 {"Message" (portkey.aws/search-for-tag rawinput141224 "Message" :flattened? false :result-wrapper resultWrapper141225)}] (clojure.core/cond-> {} (letvar141226 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141226 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-profile-already-exists ([input] (response-field-level-encryption-profile-already-exists nil input)) ([resultWrapper141230 input] (clojure.core/let [rawinput141229 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141231 {"Message" (portkey.aws/search-for-tag rawinput141229 "Message" :flattened? false :result-wrapper resultWrapper141230)}] (clojure.core/cond-> {} (letvar141231 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141231 ["Message" :content])))))))

(clojure.core/defn- response-invalid-viewer-certificate ([input] (response-invalid-viewer-certificate nil input)) ([resultWrapper141233 input] (clojure.core/let [rawinput141232 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141234 {"Message" (portkey.aws/search-for-tag rawinput141232 "Message" :flattened? false :result-wrapper resultWrapper141233)}] (clojure.core/cond-> {} (letvar141234 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141234 ["Message" :content])))))))

(clojure.core/defn- response-get-public-key-config-result ([input] (response-get-public-key-config-result nil input)) ([resultWrapper141236 input] (clojure.core/let [rawinput141235 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141237 {"PublicKeyConfig" (portkey.aws/search-for-tag rawinput141235 "PublicKeyConfig" :flattened? false :result-wrapper resultWrapper141236), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141237 "PublicKeyConfig") (clojure.core/assoc :public-key-config (deser-public-key-config (clojure.core/get-in letvar141237 ["PublicKeyConfig" :content]))) (letvar141237 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141237 ["ETag"])))))))

(clojure.core/defn- response-invalid-argument ([input] (response-invalid-argument nil input)) ([resultWrapper141239 input] (clojure.core/let [rawinput141238 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141240 {"Message" (portkey.aws/search-for-tag rawinput141238 "Message" :flattened? false :result-wrapper resultWrapper141239)}] (clojure.core/cond-> {} (letvar141240 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141240 ["Message" :content])))))))

(clojure.core/defn- response-no-such-public-key ([input] (response-no-such-public-key nil input)) ([resultWrapper141245 input] (clojure.core/let [rawinput141244 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141246 {"Message" (portkey.aws/search-for-tag rawinput141244 "Message" :flattened? false :result-wrapper resultWrapper141245)}] (clojure.core/cond-> {} (letvar141246 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141246 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-not-disabled ([input] (response-streaming-distribution-not-disabled nil input)) ([resultWrapper141250 input] (clojure.core/let [rawinput141249 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141251 {"Message" (portkey.aws/search-for-tag rawinput141249 "Message" :flattened? false :result-wrapper resultWrapper141250)}] (clojure.core/cond-> {} (letvar141251 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141251 ["Message" :content])))))))

(clojure.core/defn- response-illegal-field-level-encryption-config-association-with-cache-behavior ([input] (response-illegal-field-level-encryption-config-association-with-cache-behavior nil input)) ([resultWrapper141253 input] (clojure.core/let [rawinput141252 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141254 {"Message" (portkey.aws/search-for-tag rawinput141252 "Message" :flattened? false :result-wrapper resultWrapper141253)}] (clojure.core/cond-> {} (letvar141254 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141254 ["Message" :content])))))))

(clojure.core/defn- response-too-many-certificates ([input] (response-too-many-certificates nil input)) ([resultWrapper141256 input] (clojure.core/let [rawinput141255 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141257 {"Message" (portkey.aws/search-for-tag rawinput141255 "Message" :flattened? false :result-wrapper resultWrapper141256)}] (clojure.core/cond-> {} (letvar141257 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141257 ["Message" :content])))))))

(clojure.core/defn- response-access-denied ([input] (response-access-denied nil input)) ([resultWrapper141259 input] (clojure.core/let [rawinput141258 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141260 {"Message" (portkey.aws/search-for-tag rawinput141258 "Message" :flattened? false :result-wrapper resultWrapper141259)}] (clojure.core/cond-> {} (letvar141260 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141260 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use ([input] (response-cloud-front-origin-access-identity-in-use nil input)) ([resultWrapper141262 input] (clojure.core/let [rawinput141261 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141263 {"Message" (portkey.aws/search-for-tag rawinput141261 "Message" :flattened? false :result-wrapper resultWrapper141262)}] (clojure.core/cond-> {} (letvar141263 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141263 ["Message" :content])))))))

(clojure.core/defn- response-cannot-change-immutable-public-key-fields ([input] (response-cannot-change-immutable-public-key-fields nil input)) ([resultWrapper141266 input] (clojure.core/let [rawinput141265 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141267 {"Message" (portkey.aws/search-for-tag rawinput141265 "Message" :flattened? false :result-wrapper resultWrapper141266)}] (clojure.core/cond-> {} (letvar141267 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141267 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-profile-size-exceeded ([input] (response-field-level-encryption-profile-size-exceeded nil input)) ([resultWrapper141271 input] (clojure.core/let [rawinput141270 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141273 {"Message" (portkey.aws/search-for-tag rawinput141270 "Message" :flattened? false :result-wrapper resultWrapper141271)}] (clojure.core/cond-> {} (letvar141273 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141273 ["Message" :content])))))))

(clojure.core/defn- response-invalid-lambda-function-association ([input] (response-invalid-lambda-function-association nil input)) ([resultWrapper141278 input] (clojure.core/let [rawinput141277 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141279 {"Message" (portkey.aws/search-for-tag rawinput141277 "Message" :flattened? false :result-wrapper resultWrapper141278)}] (clojure.core/cond-> {} (letvar141279 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141279 ["Message" :content])))))))

(clojure.core/defn- response-create-field-level-encryption-profile-result ([input] (response-create-field-level-encryption-profile-result nil input)) ([resultWrapper141282 input] (clojure.core/let [rawinput141281 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141283 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput141281 "FieldLevelEncryptionProfile" :flattened? false :result-wrapper resultWrapper141282), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141283 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar141283 ["FieldLevelEncryptionProfile" :content]))) (letvar141283 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar141283 ["Location"]))) (letvar141283 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141283 ["ETag"])))))))

(clojure.core/defn- response-get-field-level-encryption-profile-result ([input] (response-get-field-level-encryption-profile-result nil input)) ([resultWrapper141288 input] (clojure.core/let [rawinput141287 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141289 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput141287 "FieldLevelEncryptionProfile" :flattened? false :result-wrapper resultWrapper141288), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141289 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar141289 ["FieldLevelEncryptionProfile" :content]))) (letvar141289 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141289 ["ETag"])))))))

(clojure.core/defn- response-no-such-resource ([input] (response-no-such-resource nil input)) ([resultWrapper141291 input] (clojure.core/let [rawinput141290 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141292 {"Message" (portkey.aws/search-for-tag rawinput141290 "Message" :flattened? false :result-wrapper resultWrapper141291)}] (clojure.core/cond-> {} (letvar141292 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141292 ["Message" :content])))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result ([input] (response-update-cloud-front-origin-access-identity-result nil input)) ([resultWrapper141294 input] (clojure.core/let [rawinput141293 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141295 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput141293 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper141294), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141295 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar141295 ["CloudFrontOriginAccessIdentity" :content]))) (letvar141295 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141295 ["ETag"])))))))

(clojure.core/defn- response-invalid-error-code ([input] (response-invalid-error-code nil input)) ([resultWrapper141297 input] (clojure.core/let [rawinput141296 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141298 {"Message" (portkey.aws/search-for-tag rawinput141296 "Message" :flattened? false :result-wrapper resultWrapper141297)}] (clojure.core/cond-> {} (letvar141298 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141298 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-profile-in-use ([input] (response-field-level-encryption-profile-in-use nil input)) ([resultWrapper141301 input] (clojure.core/let [rawinput141300 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141303 {"Message" (portkey.aws/search-for-tag rawinput141300 "Message" :flattened? false :result-wrapper resultWrapper141301)}] (clojure.core/cond-> {} (letvar141303 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141303 ["Message" :content])))))))

(clojure.core/defn- response-too-many-lambda-function-associations ([input] (response-too-many-lambda-function-associations nil input)) ([resultWrapper141307 input] (clojure.core/let [rawinput141306 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141309 {"Message" (portkey.aws/search-for-tag rawinput141306 "Message" :flattened? false :result-wrapper resultWrapper141307)}] (clojure.core/cond-> {} (letvar141309 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141309 ["Message" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-result ([input] (response-create-streaming-distribution-result nil input)) ([resultWrapper141311 input] (clojure.core/let [rawinput141310 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141312 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput141310 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper141311), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141312 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar141312 ["StreamingDistribution" :content]))) (letvar141312 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar141312 ["Location"]))) (letvar141312 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141312 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-profiles ([input] (response-too-many-field-level-encryption-profiles nil input)) ([resultWrapper141314 input] (clojure.core/let [rawinput141313 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141315 {"Message" (portkey.aws/search-for-tag rawinput141313 "Message" :flattened? false :result-wrapper resultWrapper141314)}] (clojure.core/cond-> {} (letvar141315 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141315 ["Message" :content])))))))

(clojure.core/defn- response-no-such-field-level-encryption-profile ([input] (response-no-such-field-level-encryption-profile nil input)) ([resultWrapper141317 input] (clojure.core/let [rawinput141316 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141318 {"Message" (portkey.aws/search-for-tag rawinput141316 "Message" :flattened? false :result-wrapper resultWrapper141317)}] (clojure.core/cond-> {} (letvar141318 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141318 ["Message" :content])))))))

(clojure.core/defn- response-invalid-relative-path ([input] (response-invalid-relative-path nil input)) ([resultWrapper141322 input] (clojure.core/let [rawinput141321 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141323 {"Message" (portkey.aws/search-for-tag rawinput141321 "Message" :flattened? false :result-wrapper resultWrapper141322)}] (clojure.core/cond-> {} (letvar141323 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141323 ["Message" :content])))))))

(clojure.core/defn- response-create-public-key-result ([input] (response-create-public-key-result nil input)) ([resultWrapper141325 input] (clojure.core/let [rawinput141324 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141326 {"PublicKey" (portkey.aws/search-for-tag rawinput141324 "PublicKey" :flattened? false :result-wrapper resultWrapper141325), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141326 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar141326 ["PublicKey" :content]))) (letvar141326 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar141326 ["Location"]))) (letvar141326 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141326 ["ETag"])))))))

(clojure.core/defn- response-invalid-location-code ([input] (response-invalid-location-code nil input)) ([resultWrapper141328 input] (clojure.core/let [rawinput141327 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141329 {"Message" (portkey.aws/search-for-tag rawinput141327 "Message" :flattened? false :result-wrapper resultWrapper141328)}] (clojure.core/cond-> {} (letvar141329 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141329 ["Message" :content])))))))

(clojure.core/defn- response-invalid-web-acl-id ([input] (response-invalid-web-acl-id nil input)) ([resultWrapper141331 input] (clojure.core/let [rawinput141330 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141332 {"Message" (portkey.aws/search-for-tag rawinput141330 "Message" :flattened? false :result-wrapper resultWrapper141331)}] (clojure.core/cond-> {} (letvar141332 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141332 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin ([input] (response-invalid-origin nil input)) ([resultWrapper141334 input] (clojure.core/let [rawinput141333 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141335 {"Message" (portkey.aws/search-for-tag rawinput141333 "Message" :flattened? false :result-wrapper resultWrapper141334)}] (clojure.core/cond-> {} (letvar141335 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141335 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities ([input] (response-too-many-cloud-front-origin-access-identities nil input)) ([resultWrapper141337 input] (clojure.core/let [rawinput141336 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141338 {"Message" (portkey.aws/search-for-tag rawinput141336 "Message" :flattened? false :result-wrapper resultWrapper141337)}] (clojure.core/cond-> {} (letvar141338 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141338 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-config-already-exists ([input] (response-field-level-encryption-config-already-exists nil input)) ([resultWrapper141340 input] (clojure.core/let [rawinput141339 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141342 {"Message" (portkey.aws/search-for-tag rawinput141339 "Message" :flattened? false :result-wrapper resultWrapper141340)}] (clojure.core/cond-> {} (letvar141342 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141342 ["Message" :content])))))))

(clojure.core/defn- response-no-such-field-level-encryption-config ([input] (response-no-such-field-level-encryption-config nil input)) ([resultWrapper141346 input] (clojure.core/let [rawinput141345 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141347 {"Message" (portkey.aws/search-for-tag rawinput141345 "Message" :flattened? false :result-wrapper resultWrapper141346)}] (clojure.core/cond-> {} (letvar141347 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141347 ["Message" :content])))))))

(clojure.core/defn- response-update-distribution-result ([input] (response-update-distribution-result nil input)) ([resultWrapper141351 input] (clojure.core/let [rawinput141350 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141352 {"Distribution" (portkey.aws/search-for-tag rawinput141350 "Distribution" :flattened? false :result-wrapper resultWrapper141351), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141352 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar141352 ["Distribution" :content]))) (letvar141352 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141352 ["ETag"])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result ([input] (response-get-cloud-front-origin-access-identity-result nil input)) ([resultWrapper141358 input] (clojure.core/let [rawinput141357 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141360 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput141357 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper141358), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141360 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar141360 ["CloudFrontOriginAccessIdentity" :content]))) (letvar141360 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141360 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-encryption-entities ([input] (response-too-many-field-level-encryption-encryption-entities nil input)) ([resultWrapper141364 input] (clojure.core/let [rawinput141363 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141365 {"Message" (portkey.aws/search-for-tag rawinput141363 "Message" :flattened? false :result-wrapper resultWrapper141364)}] (clojure.core/cond-> {} (letvar141365 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141365 ["Message" :content])))))))

(clojure.core/defn- response-get-field-level-encryption-result ([input] (response-get-field-level-encryption-result nil input)) ([resultWrapper141367 input] (clojure.core/let [rawinput141366 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141373 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput141366 "FieldLevelEncryption" :flattened? false :result-wrapper resultWrapper141367), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141373 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar141373 ["FieldLevelEncryption" :content]))) (letvar141373 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141373 ["ETag"])))))))

(clojure.core/defn- response-invalid-query-string-parameters ([input] (response-invalid-query-string-parameters nil input)) ([resultWrapper141375 input] (clojure.core/let [rawinput141374 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141376 {"Message" (portkey.aws/search-for-tag rawinput141374 "Message" :flattened? false :result-wrapper resultWrapper141375)}] (clojure.core/cond-> {} (letvar141376 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141376 ["Message" :content])))))))

(clojure.core/defn- response-public-key-already-exists ([input] (response-public-key-already-exists nil input)) ([resultWrapper141378 input] (clojure.core/let [rawinput141377 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141379 {"Message" (portkey.aws/search-for-tag rawinput141377 "Message" :flattened? false :result-wrapper resultWrapper141378)}] (clojure.core/cond-> {} (letvar141379 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141379 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origins ([input] (response-too-many-origins nil input)) ([resultWrapper141381 input] (clojure.core/let [rawinput141380 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141382 {"Message" (portkey.aws/search-for-tag rawinput141380 "Message" :flattened? false :result-wrapper resultWrapper141381)}] (clojure.core/cond-> {} (letvar141382 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141382 ["Message" :content])))))))

(clojure.core/defn- response-invalid-ttl-order ([input] (response-invalid-ttl-order nil input)) ([resultWrapper141384 input] (clojure.core/let [rawinput141383 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141385 {"Message" (portkey.aws/search-for-tag rawinput141383 "Message" :flattened? false :result-wrapper resultWrapper141384)}] (clojure.core/cond-> {} (letvar141385 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141385 ["Message" :content])))))))

(clojure.core/defn- response-no-such-streaming-distribution ([input] (response-no-such-streaming-distribution nil input)) ([resultWrapper141387 input] (clojure.core/let [rawinput141386 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141388 {"Message" (portkey.aws/search-for-tag rawinput141386 "Message" :flattened? false :result-wrapper resultWrapper141387)}] (clojure.core/cond-> {} (letvar141388 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141388 ["Message" :content])))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result ([input] (response-create-cloud-front-origin-access-identity-result nil input)) ([resultWrapper141390 input] (clojure.core/let [rawinput141389 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141391 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput141389 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper141390), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141391 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar141391 ["CloudFrontOriginAccessIdentity" :content]))) (letvar141391 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar141391 ["Location"]))) (letvar141391 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141391 ["ETag"])))))))

(clojure.core/defn- response-cname-already-exists ([input] (response-cname-already-exists nil input)) ([resultWrapper141393 input] (clojure.core/let [rawinput141392 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141394 {"Message" (portkey.aws/search-for-tag rawinput141392 "Message" :flattened? false :result-wrapper resultWrapper141393)}] (clojure.core/cond-> {} (letvar141394 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141394 ["Message" :content])))))))

(clojure.core/defn- response-invalid-default-root-object ([input] (response-invalid-default-root-object nil input)) ([resultWrapper141399 input] (clojure.core/let [rawinput141398 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141400 {"Message" (portkey.aws/search-for-tag rawinput141398 "Message" :flattened? false :result-wrapper resultWrapper141399)}] (clojure.core/cond-> {} (letvar141400 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141400 ["Message" :content])))))))

(clojure.core/defn- response-invalid-response-code ([input] (response-invalid-response-code nil input)) ([resultWrapper141404 input] (clojure.core/let [rawinput141403 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141405 {"Message" (portkey.aws/search-for-tag rawinput141403 "Message" :flattened? false :result-wrapper resultWrapper141404)}] (clojure.core/cond-> {} (letvar141405 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141405 ["Message" :content])))))))

(clojure.core/defn- response-no-such-invalidation ([input] (response-no-such-invalidation nil input)) ([resultWrapper141407 input] (clojure.core/let [rawinput141406 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141408 {"Message" (portkey.aws/search-for-tag rawinput141406 "Message" :flattened? false :result-wrapper resultWrapper141407)}] (clojure.core/cond-> {} (letvar141408 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141408 ["Message" :content])))))))

(clojure.core/defn- response-too-many-invalidations-in-progress ([input] (response-too-many-invalidations-in-progress nil input)) ([resultWrapper141410 input] (clojure.core/let [rawinput141409 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141411 {"Message" (portkey.aws/search-for-tag rawinput141409 "Message" :flattened? false :result-wrapper resultWrapper141410)}] (clojure.core/cond-> {} (letvar141411 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141411 ["Message" :content])))))))

(clojure.core/defn- response-get-public-key-result ([input] (response-get-public-key-result nil input)) ([resultWrapper141413 input] (clojure.core/let [rawinput141412 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141414 {"PublicKey" (portkey.aws/search-for-tag rawinput141412 "PublicKey" :flattened? false :result-wrapper resultWrapper141413), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141414 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar141414 ["PublicKey" :content]))) (letvar141414 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141414 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions-associated-to-field-level-encryption-config ([input] (response-too-many-distributions-associated-to-field-level-encryption-config nil input)) ([resultWrapper141416 input] (clojure.core/let [rawinput141415 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141418 {"Message" (portkey.aws/search-for-tag rawinput141415 "Message" :flattened? false :result-wrapper resultWrapper141416)}] (clojure.core/cond-> {} (letvar141418 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141418 ["Message" :content])))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result ([input] (response-list-cloud-front-origin-access-identities-result nil input)) ([resultWrapper141422 input] (clojure.core/let [rawinput141421 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141425 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput141421 "CloudFrontOriginAccessIdentityList" :flattened? false :result-wrapper resultWrapper141422)}] (clojure.core/cond-> {} (letvar141425 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar141425 ["CloudFrontOriginAccessIdentityList" :content])))))))

(clojure.core/defn- response-update-public-key-result ([input] (response-update-public-key-result nil input)) ([resultWrapper141427 input] (clojure.core/let [rawinput141426 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141428 {"PublicKey" (portkey.aws/search-for-tag rawinput141426 "PublicKey" :flattened? false :result-wrapper resultWrapper141427), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141428 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar141428 ["PublicKey" :content]))) (letvar141428 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141428 ["ETag"])))))))

(clojure.core/defn- response-invalid-forward-cookies ([input] (response-invalid-forward-cookies nil input)) ([resultWrapper141430 input] (clojure.core/let [rawinput141429 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141431 {"Message" (portkey.aws/search-for-tag rawinput141429 "Message" :flattened? false :result-wrapper resultWrapper141430)}] (clojure.core/cond-> {} (letvar141431 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141431 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-config-result ([input] (response-get-distribution-config-result nil input)) ([resultWrapper141433 input] (clojure.core/let [rawinput141432 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141434 {"DistributionConfig" (portkey.aws/search-for-tag rawinput141432 "DistributionConfig" :flattened? false :result-wrapper resultWrapper141433), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141434 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar141434 ["DistributionConfig" :content]))) (letvar141434 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141434 ["ETag"])))))))

(clojure.core/defn- response-invalid-required-protocol ([input] (response-invalid-required-protocol nil input)) ([resultWrapper141436 input] (clojure.core/let [rawinput141435 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141437 {"Message" (portkey.aws/search-for-tag rawinput141435 "Message" :flattened? false :result-wrapper resultWrapper141436)}] (clojure.core/cond-> {} (letvar141437 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141437 ["Message" :content])))))))

(clojure.core/defn- response-update-field-level-encryption-config-result ([input] (response-update-field-level-encryption-config-result nil input)) ([resultWrapper141440 input] (clojure.core/let [rawinput141439 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141443 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput141439 "FieldLevelEncryption" :flattened? false :result-wrapper resultWrapper141440), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141443 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar141443 ["FieldLevelEncryption" :content]))) (letvar141443 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141443 ["ETag"])))))))

(clojure.core/defn- response-get-distribution-result ([input] (response-get-distribution-result nil input)) ([resultWrapper141447 input] (clojure.core/let [rawinput141446 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141448 {"Distribution" (portkey.aws/search-for-tag rawinput141446 "Distribution" :flattened? false :result-wrapper resultWrapper141447), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141448 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar141448 ["Distribution" :content]))) (letvar141448 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141448 ["ETag"])))))))

(clojure.core/defn- response-update-field-level-encryption-profile-result ([input] (response-update-field-level-encryption-profile-result nil input)) ([resultWrapper141450 input] (clojure.core/let [rawinput141449 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141451 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput141449 "FieldLevelEncryptionProfile" :flattened? false :result-wrapper resultWrapper141450), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141451 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar141451 ["FieldLevelEncryptionProfile" :content]))) (letvar141451 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141451 ["ETag"])))))))

(clojure.core/defn- response-get-streaming-distribution-config-result ([input] (response-get-streaming-distribution-config-result nil input)) ([resultWrapper141453 input] (clojure.core/let [rawinput141452 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141454 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput141452 "StreamingDistributionConfig" :flattened? false :result-wrapper resultWrapper141453), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141454 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar141454 ["StreamingDistributionConfig" :content]))) (letvar141454 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141454 ["ETag"])))))))

(clojure.core/defn- response-too-many-origin-groups-per-distribution ([input] (response-too-many-origin-groups-per-distribution nil input)) ([resultWrapper141456 input] (clojure.core/let [rawinput141455 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141458 {"Message" (portkey.aws/search-for-tag rawinput141455 "Message" :flattened? false :result-wrapper resultWrapper141456)}] (clojure.core/cond-> {} (letvar141458 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141458 ["Message" :content])))))))

(clojure.core/defn- response-list-public-keys-result ([input] (response-list-public-keys-result nil input)) ([resultWrapper141462 input] (clojure.core/let [rawinput141461 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141463 {"PublicKeyList" (portkey.aws/search-for-tag rawinput141461 "PublicKeyList" :flattened? false :result-wrapper resultWrapper141462)}] (clojure.core/cond-> {} (letvar141463 "PublicKeyList") (clojure.core/assoc :public-key-list (deser-public-key-list (clojure.core/get-in letvar141463 ["PublicKeyList" :content])))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin ([input] (response-invalid-headers-for-s-3-origin nil input)) ([resultWrapper141467 input] (clojure.core/let [rawinput141466 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141468 {"Message" (portkey.aws/search-for-tag rawinput141466 "Message" :flattened? false :result-wrapper resultWrapper141467)}] (clojure.core/cond-> {} (letvar141468 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141468 ["Message" :content])))))))

(clojure.core/defn- response-get-field-level-encryption-config-result ([input] (response-get-field-level-encryption-config-result nil input)) ([resultWrapper141470 input] (clojure.core/let [rawinput141469 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141471 {"FieldLevelEncryptionConfig" (portkey.aws/search-for-tag rawinput141469 "FieldLevelEncryptionConfig" :flattened? false :result-wrapper resultWrapper141470), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141471 "FieldLevelEncryptionConfig") (clojure.core/assoc :field-level-encryption-config (deser-field-level-encryption-config (clojure.core/get-in letvar141471 ["FieldLevelEncryptionConfig" :content]))) (letvar141471 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141471 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-configs ([input] (response-too-many-field-level-encryption-configs nil input)) ([resultWrapper141473 input] (clojure.core/let [rawinput141472 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141474 {"Message" (portkey.aws/search-for-tag rawinput141472 "Message" :flattened? false :result-wrapper resultWrapper141473)}] (clojure.core/cond-> {} (letvar141474 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141474 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-config-in-use ([input] (response-field-level-encryption-config-in-use nil input)) ([resultWrapper141476 input] (clojure.core/let [rawinput141475 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141478 {"Message" (portkey.aws/search-for-tag rawinput141475 "Message" :flattened? false :result-wrapper resultWrapper141476)}] (clojure.core/cond-> {} (letvar141478 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141478 ["Message" :content])))))))

(clojure.core/defn- response-too-many-distribution-cnam-es ([input] (response-too-many-distribution-cnam-es nil input)) ([resultWrapper141482 input] (clojure.core/let [rawinput141481 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141483 {"Message" (portkey.aws/search-for-tag rawinput141481 "Message" :flattened? false :result-wrapper resultWrapper141482)}] (clojure.core/cond-> {} (letvar141483 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141483 ["Message" :content])))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter ([input] (response-invalid-geo-restriction-parameter nil input)) ([resultWrapper141487 input] (clojure.core/let [rawinput141486 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141489 {"Message" (portkey.aws/search-for-tag rawinput141486 "Message" :flattened? false :result-wrapper resultWrapper141487)}] (clojure.core/cond-> {} (letvar141489 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141489 ["Message" :content])))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity ([input] (response-no-such-cloud-front-origin-access-identity nil input)) ([resultWrapper141493 input] (clojure.core/let [rawinput141492 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141494 {"Message" (portkey.aws/search-for-tag rawinput141492 "Message" :flattened? false :result-wrapper resultWrapper141493)}] (clojure.core/cond-> {} (letvar141494 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141494 ["Message" :content])))))))

(clojure.core/defn- response-list-invalidations-result ([input] (response-list-invalidations-result nil input)) ([resultWrapper141496 input] (clojure.core/let [rawinput141495 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141497 {"InvalidationList" (portkey.aws/search-for-tag rawinput141495 "InvalidationList" :flattened? false :result-wrapper resultWrapper141496)}] (clojure.core/cond-> {} (letvar141497 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar141497 ["InvalidationList" :content])))))))

(clojure.core/defn- response-batch-too-large ([input] (response-batch-too-large nil input)) ([resultWrapper141499 input] (clojure.core/let [rawinput141498 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141500 {"Message" (portkey.aws/search-for-tag rawinput141498 "Message" :flattened? false :result-wrapper resultWrapper141499)}] (clojure.core/cond-> {} (letvar141500 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141500 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-with-tags-result ([input] (response-create-distribution-with-tags-result nil input)) ([resultWrapper141502 input] (clojure.core/let [rawinput141501 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141503 {"Distribution" (portkey.aws/search-for-tag rawinput141501 "Distribution" :flattened? false :result-wrapper resultWrapper141502), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141503 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar141503 ["Distribution" :content]))) (letvar141503 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar141503 ["Location"]))) (letvar141503 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141503 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-query-arg-profiles ([input] (response-too-many-field-level-encryption-query-arg-profiles nil input)) ([resultWrapper141505 input] (clojure.core/let [rawinput141504 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141506 {"Message" (portkey.aws/search-for-tag rawinput141504 "Message" :flattened? false :result-wrapper resultWrapper141505)}] (clojure.core/cond-> {} (letvar141506 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141506 ["Message" :content])))))))

(clojure.core/defn- response-list-streaming-distributions-result ([input] (response-list-streaming-distributions-result nil input)) ([resultWrapper141508 input] (clojure.core/let [rawinput141507 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141510 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput141507 "StreamingDistributionList" :flattened? false :result-wrapper resultWrapper141508)}] (clojure.core/cond-> {} (letvar141510 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar141510 ["StreamingDistributionList" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result ([input] (response-create-streaming-distribution-with-tags-result nil input)) ([resultWrapper141515 input] (clojure.core/let [rawinput141514 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141517 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput141514 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper141515), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141517 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar141517 ["StreamingDistribution" :content]))) (letvar141517 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar141517 ["Location"]))) (letvar141517 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141517 ["ETag"])))))))

(clojure.core/defn- response-create-invalidation-result ([input] (response-create-invalidation-result nil input)) ([resultWrapper141522 input] (clojure.core/let [rawinput141521 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141523 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput141521 "Invalidation" :flattened? false :result-wrapper resultWrapper141522)}] (clojure.core/cond-> {} (letvar141523 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar141523 ["Location"]))) (letvar141523 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar141523 ["Invalidation" :content])))))))

(clojure.core/defn- response-missing-body ([input] (response-missing-body nil input)) ([resultWrapper141525 input] (clojure.core/let [rawinput141524 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141526 {"Message" (portkey.aws/search-for-tag rawinput141524 "Message" :flattened? false :result-wrapper resultWrapper141525)}] (clojure.core/cond-> {} (letvar141526 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141526 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-read-timeout ([input] (response-invalid-origin-read-timeout nil input)) ([resultWrapper141528 input] (clojure.core/let [rawinput141527 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141529 {"Message" (portkey.aws/search-for-tag rawinput141527 "Message" :flattened? false :result-wrapper resultWrapper141528)}] (clojure.core/cond-> {} (letvar141529 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141529 ["Message" :content])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result ([input] (response-get-cloud-front-origin-access-identity-config-result nil input)) ([resultWrapper141531 input] (clojure.core/let [rawinput141530 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141532 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput141530 "CloudFrontOriginAccessIdentityConfig" :flattened? false :result-wrapper resultWrapper141531), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141532 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar141532 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar141532 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141532 ["ETag"])))))))

(clojure.core/defn- response-distribution-not-disabled ([input] (response-distribution-not-disabled nil input)) ([resultWrapper141535 input] (clojure.core/let [rawinput141534 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141536 {"Message" (portkey.aws/search-for-tag rawinput141534 "Message" :flattened? false :result-wrapper resultWrapper141535)}] (clojure.core/cond-> {} (letvar141536 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141536 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists ([input] (response-cloud-front-origin-access-identity-already-exists nil input)) ([resultWrapper141540 input] (clojure.core/let [rawinput141539 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141542 {"Message" (portkey.aws/search-for-tag rawinput141539 "Message" :flattened? false :result-wrapper resultWrapper141540)}] (clojure.core/cond-> {} (letvar141542 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141542 ["Message" :content])))))))

(clojure.core/defn- response-precondition-failed ([input] (response-precondition-failed nil input)) ([resultWrapper141545 input] (clojure.core/let [rawinput141544 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141546 {"Message" (portkey.aws/search-for-tag rawinput141544 "Message" :flattened? false :result-wrapper resultWrapper141545)}] (clojure.core/cond-> {} (letvar141546 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141546 ["Message" :content])))))))

(clojure.core/defn- response-distribution-already-exists ([input] (response-distribution-already-exists nil input)) ([resultWrapper141548 input] (clojure.core/let [rawinput141547 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141549 {"Message" (portkey.aws/search-for-tag rawinput141547 "Message" :flattened? false :result-wrapper resultWrapper141548)}] (clojure.core/cond-> {} (letvar141549 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141549 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-access-identity ([input] (response-invalid-origin-access-identity nil input)) ([resultWrapper141551 input] (clojure.core/let [rawinput141550 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141552 {"Message" (portkey.aws/search-for-tag rawinput141550 "Message" :flattened? false :result-wrapper resultWrapper141551)}] (clojure.core/cond-> {} (letvar141552 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141552 ["Message" :content])))))))

(clojure.core/defn- response-too-many-trusted-signers ([input] (response-too-many-trusted-signers nil input)) ([resultWrapper141554 input] (clojure.core/let [rawinput141553 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141555 {"Message" (portkey.aws/search-for-tag rawinput141553 "Message" :flattened? false :result-wrapper resultWrapper141554)}] (clojure.core/cond-> {} (letvar141555 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141555 ["Message" :content])))))))

(clojure.core/defn- response-too-many-public-keys ([input] (response-too-many-public-keys nil input)) ([resultWrapper141558 input] (clojure.core/let [rawinput141557 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141560 {"Message" (portkey.aws/search-for-tag rawinput141557 "Message" :flattened? false :result-wrapper resultWrapper141558)}] (clojure.core/cond-> {} (letvar141560 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141560 ["Message" :content])))))))

(clojure.core/defn- response-invalid-minimum-protocol-version ([input] (response-invalid-minimum-protocol-version nil input)) ([resultWrapper141563 input] (clojure.core/let [rawinput141562 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141565 {"Message" (portkey.aws/search-for-tag rawinput141562 "Message" :flattened? false :result-wrapper resultWrapper141563)}] (clojure.core/cond-> {} (letvar141565 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141565 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-already-exists ([input] (response-streaming-distribution-already-exists nil input)) ([resultWrapper141568 input] (clojure.core/let [rawinput141567 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141569 {"Message" (portkey.aws/search-for-tag rawinput141567 "Message" :flattened? false :result-wrapper resultWrapper141568)}] (clojure.core/cond-> {} (letvar141569 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141569 ["Message" :content])))))))

(clojure.core/defn- response-public-key-in-use ([input] (response-public-key-in-use nil input)) ([resultWrapper141571 input] (clojure.core/let [rawinput141570 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141572 {"Message" (portkey.aws/search-for-tag rawinput141570 "Message" :flattened? false :result-wrapper resultWrapper141571)}] (clojure.core/cond-> {} (letvar141572 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141572 ["Message" :content])))))))

(clojure.core/defn- response-invalid-if-match-version ([input] (response-invalid-if-match-version nil input)) ([resultWrapper141574 input] (clojure.core/let [rawinput141573 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141575 {"Message" (portkey.aws/search-for-tag rawinput141573 "Message" :flattened? false :result-wrapper resultWrapper141574)}] (clojure.core/cond-> {} (letvar141575 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141575 ["Message" :content])))))))

(clojure.core/defn- response-list-field-level-encryption-profiles-result ([input] (response-list-field-level-encryption-profiles-result nil input)) ([resultWrapper141577 input] (clojure.core/let [rawinput141576 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141578 {"FieldLevelEncryptionProfileList" (portkey.aws/search-for-tag rawinput141576 "FieldLevelEncryptionProfileList" :flattened? false :result-wrapper resultWrapper141577)}] (clojure.core/cond-> {} (letvar141578 "FieldLevelEncryptionProfileList") (clojure.core/assoc :field-level-encryption-profile-list (deser-field-level-encryption-profile-list (clojure.core/get-in letvar141578 ["FieldLevelEncryptionProfileList" :content])))))))

(clojure.core/defn- response-create-distribution-result ([input] (response-create-distribution-result nil input)) ([resultWrapper141580 input] (clojure.core/let [rawinput141579 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141582 {"Distribution" (portkey.aws/search-for-tag rawinput141579 "Distribution" :flattened? false :result-wrapper resultWrapper141580), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141582 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar141582 ["Distribution" :content]))) (letvar141582 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar141582 ["Location"]))) (letvar141582 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141582 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions ([input] (response-too-many-distributions nil input)) ([resultWrapper141587 input] (clojure.core/let [rawinput141586 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141589 {"Message" (portkey.aws/search-for-tag rawinput141586 "Message" :flattened? false :result-wrapper resultWrapper141587)}] (clojure.core/cond-> {} (letvar141589 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141589 ["Message" :content])))))))

(clojure.core/defn- response-list-field-level-encryption-configs-result ([input] (response-list-field-level-encryption-configs-result nil input)) ([resultWrapper141592 input] (clojure.core/let [rawinput141591 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141593 {"FieldLevelEncryptionList" (portkey.aws/search-for-tag rawinput141591 "FieldLevelEncryptionList" :flattened? false :result-wrapper resultWrapper141592)}] (clojure.core/cond-> {} (letvar141593 "FieldLevelEncryptionList") (clojure.core/assoc :field-level-encryption-list (deser-field-level-encryption-list (clojure.core/get-in letvar141593 ["FieldLevelEncryptionList" :content])))))))

(clojure.core/defn- response-no-such-distribution ([input] (response-no-such-distribution nil input)) ([resultWrapper141597 input] (clojure.core/let [rawinput141596 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141598 {"Message" (portkey.aws/search-for-tag rawinput141596 "Message" :flattened? false :result-wrapper resultWrapper141597)}] (clojure.core/cond-> {} (letvar141598 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141598 ["Message" :content])))))))

(clojure.core/defn- response-query-arg-profile-empty ([input] (response-query-arg-profile-empty nil input)) ([resultWrapper141600 input] (clojure.core/let [rawinput141599 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141601 {"Message" (portkey.aws/search-for-tag rawinput141599 "Message" :flattened? false :result-wrapper resultWrapper141600)}] (clojure.core/cond-> {} (letvar141601 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141601 ["Message" :content])))))))

(clojure.core/defn- response-update-streaming-distribution-result ([input] (response-update-streaming-distribution-result nil input)) ([resultWrapper141603 input] (clojure.core/let [rawinput141602 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141604 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput141602 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper141603), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141604 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar141604 ["StreamingDistribution" :content]))) (letvar141604 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141604 ["ETag"])))))))

(clojure.core/defn- response-illegal-update ([input] (response-illegal-update nil input)) ([resultWrapper141606 input] (clojure.core/let [rawinput141605 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141607 {"Message" (portkey.aws/search-for-tag rawinput141605 "Message" :flattened? false :result-wrapper resultWrapper141606)}] (clojure.core/cond-> {} (letvar141607 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141607 ["Message" :content])))))))

(clojure.core/defn- response-get-field-level-encryption-profile-config-result ([input] (response-get-field-level-encryption-profile-config-result nil input)) ([resultWrapper141610 input] (clojure.core/let [rawinput141608 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141612 {"FieldLevelEncryptionProfileConfig" (portkey.aws/search-for-tag rawinput141608 "FieldLevelEncryptionProfileConfig" :flattened? false :result-wrapper resultWrapper141610), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar141612 "FieldLevelEncryptionProfileConfig") (clojure.core/assoc :field-level-encryption-profile-config (deser-field-level-encryption-profile-config (clojure.core/get-in letvar141612 ["FieldLevelEncryptionProfileConfig" :content]))) (letvar141612 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar141612 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-content-type-profiles ([input] (response-too-many-field-level-encryption-content-type-profiles nil input)) ([resultWrapper141617 input] (clojure.core/let [rawinput141616 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141618 {"Message" (portkey.aws/search-for-tag rawinput141616 "Message" :flattened? false :result-wrapper resultWrapper141617)}] (clojure.core/cond-> {} (letvar141618 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141618 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-keepalive-timeout ([input] (response-invalid-origin-keepalive-timeout nil input)) ([resultWrapper141620 input] (clojure.core/let [rawinput141619 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141621 {"Message" (portkey.aws/search-for-tag rawinput141619 "Message" :flattened? false :result-wrapper resultWrapper141620)}] (clojure.core/cond-> {} (letvar141621 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141621 ["Message" :content])))))))

(clojure.core/defn- response-inconsistent-quantities ([input] (response-inconsistent-quantities nil input)) ([resultWrapper141623 input] (clojure.core/let [rawinput141622 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141624 {"Message" (portkey.aws/search-for-tag rawinput141622 "Message" :flattened? false :result-wrapper resultWrapper141623)}] (clojure.core/cond-> {} (letvar141624 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141624 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result ([input] (response-list-distributions-by-web-acl-id-result nil input)) ([resultWrapper141626 input] (clojure.core/let [rawinput141625 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141627 {"DistributionList" (portkey.aws/search-for-tag rawinput141625 "DistributionList" :flattened? false :result-wrapper resultWrapper141626)}] (clojure.core/cond-> {} (letvar141627 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar141627 ["DistributionList" :content])))))))

(clojure.core/defn- response-too-many-query-string-parameters ([input] (response-too-many-query-string-parameters nil input)) ([resultWrapper141629 input] (clojure.core/let [rawinput141628 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141630 {"Message" (portkey.aws/search-for-tag rawinput141628 "Message" :flattened? false :result-wrapper resultWrapper141629)}] (clojure.core/cond-> {} (letvar141630 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141630 ["Message" :content])))))))

(clojure.core/defn- response-invalid-tagging ([input] (response-invalid-tagging nil input)) ([resultWrapper141633 input] (clojure.core/let [rawinput141632 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141634 {"Message" (portkey.aws/search-for-tag rawinput141632 "Message" :flattened? false :result-wrapper resultWrapper141633)}] (clojure.core/cond-> {} (letvar141634 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141634 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-result ([input] (response-list-distributions-result nil input)) ([resultWrapper141638 input] (clojure.core/let [rawinput141637 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141639 {"DistributionList" (portkey.aws/search-for-tag rawinput141637 "DistributionList" :flattened? false :result-wrapper resultWrapper141638)}] (clojure.core/cond-> {} (letvar141639 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar141639 ["DistributionList" :content])))))))

(clojure.core/defn- response-trusted-signer-does-not-exist ([input] (response-trusted-signer-does-not-exist nil input)) ([resultWrapper141644 input] (clojure.core/let [rawinput141643 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141645 {"Message" (portkey.aws/search-for-tag rawinput141643 "Message" :flattened? false :result-wrapper resultWrapper141644)}] (clojure.core/cond-> {} (letvar141645 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141645 ["Message" :content])))))))

(clojure.core/defn- response-too-many-field-level-encryption-field-patterns ([input] (response-too-many-field-level-encryption-field-patterns nil input)) ([resultWrapper141649 input] (clojure.core/let [rawinput141648 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141650 {"Message" (portkey.aws/search-for-tag rawinput141648 "Message" :flattened? false :result-wrapper resultWrapper141649)}] (clojure.core/cond-> {} (letvar141650 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141650 ["Message" :content])))))))

(clojure.core/defn- response-get-invalidation-result ([input] (response-get-invalidation-result nil input)) ([resultWrapper141652 input] (clojure.core/let [rawinput141651 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141653 {"Invalidation" (portkey.aws/search-for-tag rawinput141651 "Invalidation" :flattened? false :result-wrapper resultWrapper141652)}] (clojure.core/cond-> {} (letvar141653 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar141653 ["Invalidation" :content])))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values ([input] (response-too-many-headers-in-forwarded-values nil input)) ([resultWrapper141655 input] (clojure.core/let [rawinput141654 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar141656 {"Message" (portkey.aws/search-for-tag rawinput141654 "Message" :flattened? false :result-wrapper resultWrapper141655)}] (clojure.core/cond-> {} (letvar141656 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar141656 ["Message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-distributions-with-lambda-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-distributions-with-lambda-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-distributions-with-lambda-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.content-type-profile/profile-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.content-type-profile/content-type (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/content-type-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/format :portkey.aws.cloudfront.content-type-profile/content-type] :opt-un [:portkey.aws.cloudfront.content-type-profile/profile-id]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.logging-config/enabled :portkey.aws.cloudfront.logging-config/include-cookies :portkey.aws.cloudfront.logging-config/bucket :portkey.aws.cloudfront.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/streaming-distribution-config :portkey.aws.cloudfront/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.invalidation-summary/id :portkey.aws.cloudfront.invalidation-summary/create-time :portkey.aws.cloudfront.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/create-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/field-level-encryption-profile-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/create-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/field-level-encryption-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.invalidation/id :portkey.aws.cloudfront.invalidation/status :portkey.aws.cloudfront.invalidation/create-time :portkey.aws.cloudfront/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.create-field-level-encryption-config-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.create-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/create-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/field-level-encryption :portkey.aws.cloudfront.create-field-level-encryption-config-result/location :portkey.aws.cloudfront.create-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/streaming-distribution :portkey.aws.cloudfront.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-patterns/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-patterns/items (clojure.spec.alpha/and :portkey.aws.cloudfront/field-pattern-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-patterns (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.field-patterns/quantity] :opt-un [:portkey.aws.cloudfront.field-patterns/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-profile-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.field-level-encryption-profile-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-config/name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.field-level-encryption-profile-config/name :portkey.aws.cloudfront.field-level-encryption-profile-config/caller-reference :portkey.aws.cloudfront/encryption-entities] :opt-un [:portkey.aws.cloudfront.field-level-encryption-profile-config/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-public-key-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-public-key-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/public-key-config :portkey.aws.cloudfront.get-public-key-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.no-such-public-key/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/no-such-public-key (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.no-such-public-key/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.illegal-field-level-encryption-config-association-with-cache-behavior/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/illegal-field-level-encryption-config-association-with-cache-behavior (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.illegal-field-level-encryption-config-association-with-cache-behavior/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.field-level-encryption-config/caller-reference] :opt-un [:portkey.aws.cloudfront.field-level-encryption-config/comment :portkey.aws.cloudfront/query-arg-profile-config :portkey.aws.cloudfront/content-type-profile-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-group-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/origin-group))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.field-level-encryption-profile/id :portkey.aws.cloudfront.field-level-encryption-profile/last-modified-time :portkey.aws.cloudfront/field-level-encryption-profile-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.distribution/id :portkey.aws.cloudfront.distribution/arn :portkey.aws.cloudfront.distribution/status :portkey.aws.cloudfront.distribution/last-modified-time :portkey.aws.cloudfront.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.distribution/domain-name :portkey.aws.cloudfront/active-trusted-signers :portkey.aws.cloudfront/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.query-arg-profile/query-arg (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.query-arg-profile/profile-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/query-arg-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.query-arg-profile/query-arg :portkey.aws.cloudfront.query-arg-profile/profile-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.lambda-function-association/include-body (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront/lambda-function-association (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/lambda-function-arn :portkey.aws.cloudfront/event-type] :opt-un [:portkey.aws.cloudfront.lambda-function-association/include-body]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.forwarded-values/query-string :portkey.aws.cloudfront.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront/headers :portkey.aws.cloudfront/query-string-cache-keys]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-group-members/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-group-members/items (clojure.spec.alpha/and :portkey.aws.cloudfront/origin-group-member-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-group-members (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.origin-group-members/quantity :portkey.aws.cloudfront.origin-group-members/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/paths :portkey.aws.cloudfront.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-group-failover-criteria (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/status-codes] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.update-public-key-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/public-key-config :portkey.aws.cloudfront.update-public-key-request/id] :opt-un [:portkey.aws.cloudfront.update-public-key-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-public-key-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-public-key-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-public-key-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/query-string-cache-keys-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.streaming-distribution-list/marker :portkey.aws.cloudfront.streaming-distribution-list/max-items :portkey.aws.cloudfront.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.streaming-distribution-list/next-marker :portkey.aws.cloudfront.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-config/name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-config/encoded-key (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/public-key-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.public-key-config/caller-reference :portkey.aws.cloudfront.public-key-config/name :portkey.aws.cloudfront.public-key-config/encoded-key] :opt-un [:portkey.aws.cloudfront.public-key-config/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront/encryption-entity-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/encryption-entity))

(clojure.spec.alpha/def :portkey.aws.cloudfront.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.streaming-distribution/id :portkey.aws.cloudfront.streaming-distribution/arn :portkey.aws.cloudfront.streaming-distribution/status :portkey.aws.cloudfront.streaming-distribution/domain-name :portkey.aws.cloudfront/active-trusted-signers :portkey.aws.cloudfront/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.lambda-function-associations/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.lambda-function-associations/items (clojure.spec.alpha/and :portkey.aws.cloudfront/lambda-function-association-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/lambda-function-associations (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.lambda-function-associations/quantity] :opt-un [:portkey.aws.cloudfront.lambda-function-associations/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.encryption-entities/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.encryption-entities/items (clojure.spec.alpha/and :portkey.aws.cloudfront/encryption-entity-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/encryption-entities (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.encryption-entities/quantity] :opt-un [:portkey.aws.cloudfront.encryption-entities/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cannot-change-immutable-public-key-fields/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cannot-change-immutable-public-key-fields (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.cannot-change-immutable-public-key-fields/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-field-level-encryption-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-size-exceeded/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-profile-size-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.field-level-encryption-profile-size-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-lambda-function-association/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-lambda-function-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-lambda-function-association/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-summary/name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-profile-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.field-level-encryption-profile-summary/id :portkey.aws.cloudfront.field-level-encryption-profile-summary/last-modified-time :portkey.aws.cloudfront.field-level-encryption-profile-summary/name :portkey.aws.cloudfront/encryption-entities] :opt-un [:portkey.aws.cloudfront.field-level-encryption-profile-summary/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/content-type-profile-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/content-type-profile))

(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.custom-error-response/response-page-path :portkey.aws.cloudfront.custom-error-response/response-code :portkey.aws.cloudfront.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.create-field-level-encryption-profile-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.create-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/create-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/field-level-encryption-profile :portkey.aws.cloudfront.create-field-level-encryption-profile-result/location :portkey.aws.cloudfront.create-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.signer/aws-account-number :portkey.aws.cloudfront/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/field-level-encryption-profile :portkey.aws.cloudfront.get-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-public-key-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/cloud-front-origin-access-identity :portkey.aws.cloudfront.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront/field-level-encryption-profile-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-profile-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.field-level-encryption-profile-list/max-items :portkey.aws.cloudfront.field-level-encryption-profile-list/quantity] :opt-un [:portkey.aws.cloudfront.field-level-encryption-profile-list/next-marker :portkey.aws.cloudfront.field-level-encryption-profile-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-profile-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-profile-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.field-level-encryption-profile-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.content-type-profile-config/forward-when-content-type-is-unknown (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront/content-type-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.content-type-profile-config/forward-when-content-type-is-unknown] :opt-un [:portkey.aws.cloudfront/content-type-profiles]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.cached-methods/quantity :portkey.aws.cloudfront.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21055__auto__] (clojure.core/<= 1 (clojure.core/count s__21055__auto__))) (clojure.core/fn [s__21056__auto__] (clojure.core/< (clojure.core/count s__21056__auto__) 128)) (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21057__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-lambda-function-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-lambda-function-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-lambda-function-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/streaming-distribution :portkey.aws.cloudfront.create-streaming-distribution-result/location :portkey.aws.cloudfront.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.list-field-level-encryption-profiles-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.list-field-level-encryption-profiles-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/list-field-level-encryption-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.list-field-level-encryption-profiles-request/marker :portkey.aws.cloudfront.list-field-level-encryption-profiles-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-field-level-encryption-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-field-level-encryption-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-field-level-encryption-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront/query-arg-profile-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/query-arg-profile))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cache-behavior/field-level-encryption-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.cache-behavior/path-pattern :portkey.aws.cloudfront.cache-behavior/target-origin-id :portkey.aws.cloudfront/forwarded-values :portkey.aws.cloudfront/trusted-signers :portkey.aws.cloudfront/viewer-protocol-policy :portkey.aws.cloudfront.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.cache-behavior/smooth-streaming :portkey.aws.cloudfront.cache-behavior/field-level-encryption-id :portkey.aws.cloudfront.cache-behavior/compress :portkey.aws.cloudfront/lambda-function-associations :portkey.aws.cloudfront.cache-behavior/max-ttl :portkey.aws.cloudfront/allowed-methods :portkey.aws.cloudfront.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.no-such-field-level-encryption-profile/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/no-such-field-level-encryption-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.no-such-field-level-encryption-profile/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.list-streaming-distributions-request/marker :portkey.aws.cloudfront.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.active-trusted-signers/enabled :portkey.aws.cloudfront.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.create-public-key-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.create-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/create-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/public-key :portkey.aws.cloudfront.create-public-key-result/location :portkey.aws.cloudfront.create-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.origin/id :portkey.aws.cloudfront.origin/domain-name] :opt-un [:portkey.aws.cloudfront.origin/origin-path :portkey.aws.cloudfront/custom-headers :portkey.aws.cloudfront/s-3-origin-config :portkey.aws.cloudfront/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-config-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-config-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.field-level-encryption-config-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/format #{"URLEncoded" :url-encoded})

(clojure.spec.alpha/def :portkey.aws.cloudfront.no-such-field-level-encryption-config/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/no-such-field-level-encryption-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.no-such-field-level-encryption-config/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-group-member/origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-group-member (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.origin-group-member/origin-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.invalidation-list/marker :portkey.aws.cloudfront.invalidation-list/max-items :portkey.aws.cloudfront.invalidation-list/is-truncated :portkey.aws.cloudfront.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.invalidation-list/next-marker :portkey.aws.cloudfront.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.origin-ssl-protocols/quantity :portkey.aws.cloudfront.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.aliases/quantity] :opt-un [:portkey.aws.cloudfront.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/event-type #{:viewerresponse :originresponse :viewerrequest "viewer-response" :originrequest "origin-response" "origin-request" "viewer-request"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/distribution :portkey.aws.cloudfront.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.content-type-profiles/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.content-type-profiles/items (clojure.spec.alpha/and :portkey.aws.cloudfront/content-type-profile-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/content-type-profiles (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.content-type-profiles/quantity] :opt-un [:portkey.aws.cloudfront.content-type-profiles/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.encryption-entity/public-key-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.encryption-entity/provider-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/encryption-entity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.encryption-entity/public-key-id :portkey.aws.cloudfront.encryption-entity/provider-id :portkey.aws.cloudfront/field-patterns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/lambda-function-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/cloud-front-origin-access-identity :portkey.aws.cloudfront.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-field-level-encryption-profile-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-field-level-encryption-encryption-entities/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-field-level-encryption-encryption-entities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-field-level-encryption-encryption-entities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.allowed-methods/quantity :portkey.aws.cloudfront.allowed-methods/items] :opt-un [:portkey.aws.cloudfront/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-field-level-encryption-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-field-level-encryption-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/field-level-encryption :portkey.aws.cloudfront.get-field-level-encryption-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-origin-config/origin-read-timeout (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-origin-config/origin-keepalive-timeout (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.custom-origin-config/http-port :portkey.aws.cloudfront.custom-origin-config/https-port :portkey.aws.cloudfront/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront/origin-ssl-protocols :portkey.aws.cloudfront.custom-origin-config/origin-read-timeout :portkey.aws.cloudfront.custom-origin-config/origin-keepalive-timeout]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/public-key-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.public-key-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.list-distributions-request/marker :portkey.aws.cloudfront.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.s-3-origin/domain-name :portkey.aws.cloudfront.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/cloud-front-origin-access-identity :portkey.aws.cloudfront.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.streaming-distribution-summary/id :portkey.aws.cloudfront.streaming-distribution-summary/arn :portkey.aws.cloudfront.streaming-distribution-summary/status :portkey.aws.cloudfront.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.streaming-distribution-summary/domain-name :portkey.aws.cloudfront/s-3-origin :portkey.aws.cloudfront/aliases :portkey.aws.cloudfront/trusted-signers :portkey.aws.cloudfront.streaming-distribution-summary/comment :portkey.aws.cloudfront/price-class :portkey.aws.cloudfront.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.create-invalidation-request/distribution-id :portkey.aws.cloudfront/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-field-level-encryption-profile-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-field-level-encryption-profile-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-field-level-encryption-profile-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.tag-resource-request/resource :portkey.aws.cloudfront/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.list-field-level-encryption-configs-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.list-field-level-encryption-configs-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/list-field-level-encryption-configs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.list-field-level-encryption-configs-request/marker :portkey.aws.cloudfront.list-field-level-encryption-configs-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.field-level-encryption/id :portkey.aws.cloudfront.field-level-encryption/last-modified-time :portkey.aws.cloudfront/field-level-encryption-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.query-string-cache-keys/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.query-string-cache-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront/query-string-cache-keys-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/query-string-cache-keys (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.query-string-cache-keys/quantity] :opt-un [:portkey.aws.cloudfront.query-string-cache-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-config/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.distribution-config/caller-reference :portkey.aws.cloudfront/origins :portkey.aws.cloudfront/default-cache-behavior :portkey.aws.cloudfront.distribution-config/comment :portkey.aws.cloudfront.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.distribution-config/default-root-object :portkey.aws.cloudfront.distribution-config/is-ipv-6-enabled :portkey.aws.cloudfront/restrictions :portkey.aws.cloudfront.distribution-config/web-acl-id :portkey.aws.cloudfront.distribution-config/logging :portkey.aws.cloudfront/cache-behaviors :portkey.aws.cloudfront/custom-error-responses :portkey.aws.cloudfront/aliases :portkey.aws.cloudfront/price-class :portkey.aws.cloudfront/http-version :portkey.aws.cloudfront/origin-groups :portkey.aws.cloudfront/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/public-key :portkey.aws.cloudfront.get-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-distributions-associated-to-field-level-encryption-config/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-distributions-associated-to-field-level-encryption-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-distributions-associated-to-field-level-encryption-config/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-public-key-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-public-key-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/public-key :portkey.aws.cloudfront.update-public-key-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.update-field-level-encryption-config-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/field-level-encryption-config :portkey.aws.cloudfront.update-field-level-encryption-config-request/id] :opt-un [:portkey.aws.cloudfront.update-field-level-encryption-config-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-summary/name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-summary/created-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-summary/encoded-key (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/public-key-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.public-key-summary/id :portkey.aws.cloudfront.public-key-summary/name :portkey.aws.cloudfront.public-key-summary/created-time :portkey.aws.cloudfront.public-key-summary/encoded-key] :opt-un [:portkey.aws.cloudfront.public-key-summary/comment]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-field-level-encryption-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-field-level-encryption-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-field-level-encryption-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/distribution-config :portkey.aws.cloudfront.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/field-level-encryption :portkey.aws.cloudfront.update-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.list-public-keys-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.list-public-keys-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/list-public-keys-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.list-public-keys-request/marker :portkey.aws.cloudfront.list-public-keys-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21055__auto__] (clojure.core/<= 0 (clojure.core/count s__21055__auto__))) (clojure.core/fn [s__21056__auto__] (clojure.core/< (clojure.core/count s__21056__auto__) 256)) (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21057__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/distribution :portkey.aws.cloudfront.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-field-level-encryption-profile-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-field-level-encryption-profile-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/field-level-encryption-profile :portkey.aws.cloudfront.update-field-level-encryption-profile-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/streaming-distribution-config :portkey.aws.cloudfront.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-origin-groups-per-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-origin-groups-per-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-origin-groups-per-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.query-arg-profile-config/forward-when-query-arg-profile-is-unknown (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront/query-arg-profile-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.query-arg-profile-config/forward-when-query-arg-profile-is-unknown] :opt-un [:portkey.aws.cloudfront/query-arg-profiles]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront/list-public-keys-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/public-key-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-field-level-encryption-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-field-level-encryption-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/field-level-encryption-config :portkey.aws.cloudfront.get-field-level-encryption-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-field-level-encryption-configs/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-field-level-encryption-configs (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-field-level-encryption-configs/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.query-arg-profiles/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.query-arg-profiles/items (clojure.spec.alpha/and :portkey.aws.cloudfront/query-arg-profile-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/query-arg-profiles (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.query-arg-profiles/quantity] :opt-un [:portkey.aws.cloudfront.query-arg-profiles/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-config-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-config-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.field-level-encryption-config-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/status-code-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/integer :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.status-codes/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.status-codes/items (clojure.spec.alpha/and :portkey.aws.cloudfront/status-code-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/status-codes (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.status-codes/quantity :portkey.aws.cloudfront.status-codes/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.paths/quantity] :opt-un [:portkey.aws.cloudfront.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/field-level-encryption-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/distribution :portkey.aws.cloudfront.create-distribution-with-tags-result/location :portkey.aws.cloudfront.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-field-level-encryption-query-arg-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-field-level-encryption-query-arg-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-field-level-encryption-query-arg-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/streaming-distribution-config :portkey.aws.cloudfront.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/streaming-distribution :portkey.aws.cloudfront.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.create-invalidation-result/location :portkey.aws.cloudfront/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-origin-read-timeout/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-origin-read-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-origin-read-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.origin-custom-header/header-name :portkey.aws.cloudfront.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.streaming-distribution-config/caller-reference :portkey.aws.cloudfront/s-3-origin :portkey.aws.cloudfront.streaming-distribution-config/comment :portkey.aws.cloudfront/trusted-signers :portkey.aws.cloudfront.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront/aliases :portkey.aws.cloudfront.streaming-distribution-config/logging :portkey.aws.cloudfront/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-group-member-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/origin-group-member :min-count 2 :max-count 2))

(clojure.spec.alpha/def :portkey.aws.cloudfront/public-key-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/public-key-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/field-pattern-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.tag/key] :opt-un [:portkey.aws.cloudfront.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-group/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-group/failover-criteria (clojure.spec.alpha/and :portkey.aws.cloudfront/origin-group-failover-criteria))
(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-group/members (clojure.spec.alpha/and :portkey.aws.cloudfront/origin-group-members))
(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-group (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.origin-group/id :portkey.aws.cloudfront.origin-group/failover-criteria :portkey.aws.cloudfront.origin-group/members] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.streaming-logging-config/enabled :portkey.aws.cloudfront.streaming-logging-config/bucket :portkey.aws.cloudfront.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-public-keys/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-public-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-public-keys/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.update-field-level-encryption-profile-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/field-level-encryption-profile-config :portkey.aws.cloudfront.update-field-level-encryption-profile-request/id] :opt-un [:portkey.aws.cloudfront.update-field-level-encryption-profile-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.field-level-encryption-summary/id :portkey.aws.cloudfront.field-level-encryption-summary/last-modified-time] :opt-un [:portkey.aws.cloudfront.field-level-encryption-summary/comment :portkey.aws.cloudfront/query-arg-profile-config :portkey.aws.cloudfront/content-type-profile-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-summary/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.distribution-summary/id :portkey.aws.cloudfront.distribution-summary/arn :portkey.aws.cloudfront.distribution-summary/status :portkey.aws.cloudfront.distribution-summary/last-modified-time :portkey.aws.cloudfront.distribution-summary/domain-name :portkey.aws.cloudfront/aliases :portkey.aws.cloudfront/origins :portkey.aws.cloudfront/default-cache-behavior :portkey.aws.cloudfront/cache-behaviors :portkey.aws.cloudfront/custom-error-responses :portkey.aws.cloudfront.distribution-summary/comment :portkey.aws.cloudfront/price-class :portkey.aws.cloudfront.distribution-summary/enabled :portkey.aws.cloudfront/viewer-certificate :portkey.aws.cloudfront/restrictions :portkey.aws.cloudfront.distribution-summary/web-acl-id :portkey.aws.cloudfront/http-version :portkey.aws.cloudfront.distribution-summary/is-ipv-6-enabled] :opt-un [:portkey.aws.cloudfront/origin-groups]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/public-key-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.public-key-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/lambda-function-association-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/lambda-function-association))

(clojure.spec.alpha/def :portkey.aws.cloudfront.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.headers/quantity] :opt-un [:portkey.aws.cloudfront.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/minimum-protocol-version #{"TLSv1" :tl-sv-1 "TLSv1_2016" :tl-sv-12-2018 :ss-lv-3 "TLSv1.2_2018" "SSLv3" :tl-sv-11-2016 :tl-sv-1-2016 "TLSv1.1_2016"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.origins/quantity :portkey.aws.cloudfront.origins/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/distribution-config :portkey.aws.cloudfront/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/list-field-level-encryption-profiles-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/field-level-encryption-profile-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-public-key-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-public-key-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/delete-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.delete-public-key-request/id] :opt-un [:portkey.aws.cloudfront.delete-public-key-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/distribution :portkey.aws.cloudfront.create-distribution-result/location :portkey.aws.cloudfront.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/list-field-level-encryption-configs-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/field-level-encryption-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.get-invalidation-request/distribution-id :portkey.aws.cloudfront.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.query-arg-profile-empty/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/query-arg-profile-empty (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.query-arg-profile-empty/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__21057__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.distribution-list/marker :portkey.aws.cloudfront.distribution-list/max-items :portkey.aws.cloudfront.distribution-list/is-truncated :portkey.aws.cloudfront.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.distribution-list/next-marker :portkey.aws.cloudfront.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/streaming-distribution :portkey.aws.cloudfront.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.get-field-level-encryption-profile-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/get-field-level-encryption-profile-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/field-level-encryption-profile-config :portkey.aws.cloudfront.get-field-level-encryption-profile-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/http-version #{:http-11 "http2" :http-2 "http1.1"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-field-level-encryption-content-type-profiles/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-field-level-encryption-content-type-profiles (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-field-level-encryption-content-type-profiles/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-groups/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.origin-groups/items (clojure.spec.alpha/and :portkey.aws.cloudfront/origin-group-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/origin-groups (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.origin-groups/quantity] :opt-un [:portkey.aws.cloudfront.origin-groups/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-origin-keepalive-timeout/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-origin-keepalive-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-origin-keepalive-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-field-level-encryption-profile-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-field-level-encryption-profile-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/delete-field-level-encryption-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.delete-field-level-encryption-profile-request/id] :opt-un [:portkey.aws.cloudfront.delete-field-level-encryption-profile-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.list-invalidations-request/marker :portkey.aws.cloudfront.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.untag-resource-request/resource :portkey.aws.cloudfront/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront/public-key-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/public-key-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.public-key-list/max-items :portkey.aws.cloudfront.public-key-list/quantity] :opt-un [:portkey.aws.cloudfront.public-key-list/next-marker :portkey.aws.cloudfront.public-key-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.default-cache-behavior/field-level-encryption-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.default-cache-behavior/target-origin-id :portkey.aws.cloudfront/forwarded-values :portkey.aws.cloudfront/trusted-signers :portkey.aws.cloudfront/viewer-protocol-policy :portkey.aws.cloudfront.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.default-cache-behavior/field-level-encryption-id :portkey.aws.cloudfront.default-cache-behavior/compress :portkey.aws.cloudfront/lambda-function-associations :portkey.aws.cloudfront.default-cache-behavior/max-ttl :portkey.aws.cloudfront/allowed-methods :portkey.aws.cloudfront.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.trusted-signers/enabled :portkey.aws.cloudfront.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-field-level-encryption-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.delete-field-level-encryption-config-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/delete-field-level-encryption-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.delete-field-level-encryption-config-request/id] :opt-un [:portkey.aws.cloudfront.delete-field-level-encryption-config-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-field-level-encryption-field-patterns/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-field-level-encryption-field-patterns (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-field-level-encryption-field-patterns/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.field-level-encryption-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront/field-level-encryption-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.field-level-encryption-list/max-items :portkey.aws.cloudfront.field-level-encryption-list/quantity] :opt-un [:portkey.aws.cloudfront.field-level-encryption-list/next-marker :portkey.aws.cloudfront.field-level-encryption-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.public-key/created-time (clojure.spec.alpha/and :portkey.aws.cloudfront/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront/public-key (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.public-key/id :portkey.aws.cloudfront.public-key/created-time :portkey.aws.cloudfront/public-key-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/distribution-config :portkey.aws.cloudfront.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/field-level-encryption-profile-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront/field-level-encryption-profile-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront/create-public-key-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront/public-key-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront/ssl-support-method :portkey.aws.cloudfront/minimum-protocol-version :portkey.aws.cloudfront.viewer-certificate/certificate :portkey.aws.cloudfront/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.geo-restriction/restriction-type :portkey.aws.cloudfront.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.geo-restriction/items]))

(clojure.core/defn tag-resource-2018-11-05 ([tag-resource-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/tagging?Operation=Tag", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2018-11-05 ([get-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistribution2018_11_05", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-distribution-result))

(clojure.core/defn get-public-key-2018-11-05 ([get-public-key-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-public-key-request get-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPublicKey2018_11_05", :http.request.configuration/output-deser-fn response-get-public-key-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key}})))))
(clojure.spec.alpha/fdef get-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-public-key-result))

(clojure.core/defn create-streaming-distribution-with-tags-2018-11-05 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution?WithTags", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistributionWithTags2018_11_05", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidOrigin" :portkey.aws.cloudfront/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2018-11-05 ([update-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDistribution2018_11_05", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront/invalid-web-acl-id, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront/invalid-required-protocol, "TooManyOriginGroupsPerDistribution" :portkey.aws.cloudfront/too-many-origin-groups-per-distribution, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront/invalid-origin-read-timeout, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-distribution-result))

(clojure.core/defn update-field-level-encryption-profile-2018-11-05 ([update-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-field-level-encryption-profile-request update-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn response-update-field-level-encryption-profile-result, :http.request.spec/error-spec {"FieldLevelEncryptionProfileAlreadyExists" :portkey.aws.cloudfront/field-level-encryption-profile-already-exists, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key, "AccessDenied" :portkey.aws.cloudfront/access-denied, "FieldLevelEncryptionProfileSizeExceeded" :portkey.aws.cloudfront/field-level-encryption-profile-size-exceeded, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile, "TooManyFieldLevelEncryptionEncryptionEntities" :portkey.aws.cloudfront/too-many-field-level-encryption-encryption-entities, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TooManyFieldLevelEncryptionFieldPatterns" :portkey.aws.cloudfront/too-many-field-level-encryption-field-patterns}})))))
(clojure.spec.alpha/fdef update-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-field-level-encryption-profile-result))

(clojure.core/defn delete-streaming-distribution-2018-11-05 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2018-11-05 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2018-11-05 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution?WithTags", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistributionWithTags2018_11_05", :http.request.configuration/output-deser-fn response-create-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront/invalid-origin, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront/invalid-required-protocol, "TooManyOriginGroupsPerDistribution" :portkey.aws.cloudfront/too-many-origin-groups-per-distribution, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-distribution-with-tags-result))

(clojure.core/defn delete-field-level-encryption-profile-2018-11-05 ([delete-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-field-level-encryption-profile-request delete-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "FieldLevelEncryptionProfileInUse" :portkey.aws.cloudfront/field-level-encryption-profile-in-use}})))))
(clojure.spec.alpha/fdef delete-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-field-level-encryption-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-invalidation-2018-11-05 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvalidation2018_11_05", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-invalidation-result))

(clojure.core/defn list-field-level-encryption-profiles-2018-11-05 ([] (list-field-level-encryption-profiles-2018-11-05 {})) ([list-field-level-encryption-profiles-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-field-level-encryption-profiles-request list-field-level-encryption-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-field-level-encryption-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-field-level-encryption-profiles-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFieldLevelEncryptionProfiles2018_11_05", :http.request.configuration/output-deser-fn response-list-field-level-encryption-profiles-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-field-level-encryption-profiles-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-field-level-encryption-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-field-level-encryption-profiles-result))

(clojure.core/defn create-field-level-encryption-profile-2018-11-05 ([create-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-field-level-encryption-profile-request create-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn response-create-field-level-encryption-profile-result, :http.request.spec/error-spec {"InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key, "FieldLevelEncryptionProfileAlreadyExists" :portkey.aws.cloudfront/field-level-encryption-profile-already-exists, "FieldLevelEncryptionProfileSizeExceeded" :portkey.aws.cloudfront/field-level-encryption-profile-size-exceeded, "TooManyFieldLevelEncryptionProfiles" :portkey.aws.cloudfront/too-many-field-level-encryption-profiles, "TooManyFieldLevelEncryptionEncryptionEntities" :portkey.aws.cloudfront/too-many-field-level-encryption-encryption-entities, "TooManyFieldLevelEncryptionFieldPatterns" :portkey.aws.cloudfront/too-many-field-level-encryption-field-patterns}})))))
(clojure.spec.alpha/fdef create-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-field-level-encryption-profile-result))

(clojure.core/defn create-streaming-distribution-2018-11-05 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidOrigin" :portkey.aws.cloudfront/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-streaming-distribution-result))

(clojure.core/defn get-field-level-encryption-profile-2018-11-05 ([get-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-field-level-encryption-profile-request get-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-profile-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-field-level-encryption-profile-result))

(clojure.core/defn list-field-level-encryption-configs-2018-11-05 ([] (list-field-level-encryption-configs-2018-11-05 {})) ([list-field-level-encryption-configs-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-field-level-encryption-configs-request list-field-level-encryption-configs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-field-level-encryption-configs-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-field-level-encryption-configs-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFieldLevelEncryptionConfigs2018_11_05", :http.request.configuration/output-deser-fn response-list-field-level-encryption-configs-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-field-level-encryption-configs-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-field-level-encryption-configs-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-field-level-encryption-configs-result))

(clojure.core/defn list-tags-for-resource-2018-11-05 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/tagging", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource2018_11_05", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2018-11-05 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-streaming-distribution-result))

(clojure.core/defn get-field-level-encryption-2018-11-05 ([get-field-level-encryption-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-field-level-encryption-request get-field-level-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-field-level-encryption-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-field-level-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryption2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-field-level-encryption-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-field-level-encryption-result))

(clojure.core/defn create-distribution-2018-11-05 ([create-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistribution2018_11_05", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront/invalid-origin, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront/invalid-required-protocol, "TooManyOriginGroupsPerDistribution" :portkey.aws.cloudfront/too-many-origin-groups-per-distribution, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-distribution-result))

(clojure.core/defn create-field-level-encryption-config-2018-11-05 ([create-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-field-level-encryption-config-request create-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn response-create-field-level-encryption-config-result, :http.request.spec/error-spec {"InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile, "FieldLevelEncryptionConfigAlreadyExists" :portkey.aws.cloudfront/field-level-encryption-config-already-exists, "TooManyFieldLevelEncryptionConfigs" :portkey.aws.cloudfront/too-many-field-level-encryption-configs, "TooManyFieldLevelEncryptionQueryArgProfiles" :portkey.aws.cloudfront/too-many-field-level-encryption-query-arg-profiles, "TooManyFieldLevelEncryptionContentTypeProfiles" :portkey.aws.cloudfront/too-many-field-level-encryption-content-type-profiles, "QueryArgProfileEmpty" :portkey.aws.cloudfront/query-arg-profile-empty}})))))
(clojure.spec.alpha/fdef create-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-field-level-encryption-config-result))

(clojure.core/defn get-streaming-distribution-config-2018-11-05 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistributionConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-streaming-distribution-config-result))

(clojure.core/defn update-field-level-encryption-config-2018-11-05 ([update-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-field-level-encryption-config-request update-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn response-update-field-level-encryption-config-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config, "TooManyFieldLevelEncryptionQueryArgProfiles" :portkey.aws.cloudfront/too-many-field-level-encryption-query-arg-profiles, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "QueryArgProfileEmpty" :portkey.aws.cloudfront/query-arg-profile-empty, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "TooManyFieldLevelEncryptionContentTypeProfiles" :portkey.aws.cloudfront/too-many-field-level-encryption-content-type-profiles, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-field-level-encryption-config-result))

(clojure.core/defn list-distributions-2018-11-05 ([] (list-distributions-2018-11-05 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributions2018_11_05", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-distributions-result))

(clojure.core/defn list-public-keys-2018-11-05 ([] (list-public-keys-2018-11-05 {})) ([list-public-keys-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-public-keys-request list-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-public-keys-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-public-keys-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPublicKeys2018_11_05", :http.request.configuration/output-deser-fn response-list-public-keys-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-public-keys-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-public-keys-result))

(clojure.core/defn create-public-key-2018-11-05 ([create-public-key-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-public-key-request create-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePublicKey2018_11_05", :http.request.configuration/output-deser-fn response-create-public-key-result, :http.request.spec/error-spec {"PublicKeyAlreadyExists" :portkey.aws.cloudfront/public-key-already-exists, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "TooManyPublicKeys" :portkey.aws.cloudfront/too-many-public-keys}})))))
(clojure.spec.alpha/fdef create-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-public-key-result))

(clojure.core/defn get-field-level-encryption-profile-config-2018-11-05 ([get-field-level-encryption-profile-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-field-level-encryption-profile-config-request get-field-level-encryption-profile-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-field-level-encryption-profile-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-field-level-encryption-profile-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryptionProfileConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-profile-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-profile-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-field-level-encryption-profile-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-field-level-encryption-profile-config-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2018-11-05 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2018-11-05 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInvalidations2018_11_05", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-invalidations-result))

(clojure.core/defn delete-public-key-2018-11-05 ([delete-public-key-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-public-key-request delete-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePublicKey2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "PublicKeyInUse" :portkey.aws.cloudfront/public-key-in-use, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-public-key-request) :ret clojure.core/true?)

(clojure.core/defn untag-resource-2018-11-05 ([untag-resource-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/tagging?Operation=Untag", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2018-11-05 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2018-11-05 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2018-11-05 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "MissingBody" :portkey.aws.cloudfront/missing-body, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2018-11-05 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistributionConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-distribution-config-result))

(clojure.core/defn get-public-key-config-2018-11-05 ([get-public-key-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-public-key-config-request get-public-key-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-public-key-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-public-key-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPublicKeyConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-public-key-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key}})))))
(clojure.spec.alpha/fdef get-public-key-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-public-key-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-public-key-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2018-11-05 ([] (list-cloud-front-origin-access-identities-2018-11-05 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2018_11_05", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2018-11-05 ([] (list-streaming-distributions-2018-11-05 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamingDistributions2018_11_05", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-streaming-distributions-result))

(clojure.core/defn update-public-key-2018-11-05 ([update-public-key-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-public-key-request update-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePublicKey2018_11_05", :http.request.configuration/output-deser-fn response-update-public-key-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "CannotChangeImmutablePublicKeyFields" :portkey.aws.cloudfront/cannot-change-immutable-public-key-fields, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed}})))))
(clojure.spec.alpha/fdef update-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-public-key-result))

(clojure.core/defn get-field-level-encryption-config-2018-11-05 ([get-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-field-level-encryption-config-request get-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-field-level-encryption-config-result))

(clojure.core/defn delete-distribution-2018-11-05 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDistribution2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2018-11-05 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInvalidation2018_11_05", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-invalidation-result))

(clojure.core/defn delete-field-level-encryption-config-2018-11-05 ([delete-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-field-level-encryption-config-request delete-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "FieldLevelEncryptionConfigInUse" :portkey.aws.cloudfront/field-level-encryption-config-in-use}})))))
(clojure.spec.alpha/fdef delete-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-field-level-encryption-config-request) :ret clojure.core/true?)

(clojure.core/defn list-distributions-by-web-acl-id-2018-11-05 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributionsByWebACLId2018_11_05", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2018-11-05 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-cloud-front-origin-access-identity-result))
