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

(clojure.core/defn- ser-origin-group-members [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-origin-group-member-list (:items input)) #:http.request.field{:name "Items", :shape "OriginGroupMemberList"})], :shape "OriginGroupMembers", :type "structure"}))

(clojure.core/defn- ser-invalidation-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-paths (:paths input)) #:http.request.field{:name "Paths", :shape "Paths"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "InvalidationBatch", :type "structure"}))

(clojure.core/defn- ser-origin-group-failover-criteria [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-status-codes (:status-codes input)) #:http.request.field{:name "StatusCodes", :shape "StatusCodes"})], :shape "OriginGroupFailoverCriteria", :type "structure"}))

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

(clojure.core/defn- ser-status-code-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serinteger coll) #:http.request.field{:shape "integer", :location-name "StatusCode"}))) input), :shape "StatusCodeList", :type "list", :min 1})

(clojure.core/defn- ser-geo-restriction-type [input] #:http.request.field{:value (clojure.core/get {"blacklist" "blacklist", :blacklist "blacklist", "whitelist" "whitelist", :whitelist "whitelist", "none" "none", :none "none"} input), :shape "GeoRestrictionType"})

(clojure.core/defn- ser-status-codes [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-status-code-list (:items input)) #:http.request.field{:name "Items", :shape "StatusCodeList"})], :shape "StatusCodes", :type "structure"}))

(clojure.core/defn- ser-paths [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Paths", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path-list (input :items)) #:http.request.field{:name "Items", :shape "PathList"}))))

(clojure.core/defn- serinteger [input] #:http.request.field{:value input, :shape "integer"})

(clojure.core/defn- ser-cache-behavior-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cache-behavior coll) #:http.request.field{:shape "CacheBehavior", :location-name "CacheBehavior"}))) input), :shape "CacheBehaviorList", :type "list"})

(clojure.core/defn- ser-origin-custom-header [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:header-name input)) #:http.request.field{:name "HeaderName", :shape "string"}) (clojure.core/into (serstring (:header-value input)) #:http.request.field{:name "HeaderValue", :shape "string"})], :shape "OriginCustomHeader", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-s-3-origin (:s-3-origin input)) #:http.request.field{:name "S3Origin", :shape "S3Origin"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "StreamingDistributionConfig", :type "structure"} (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-streaming-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "StreamingLoggingConfig"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"}))))

(clojure.core/defn- ser-origin-group-member-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin-group-member coll) #:http.request.field{:shape "OriginGroupMember", :location-name "OriginGroupMember"}))) input), :shape "OriginGroupMemberList", :type "list", :max 2, :min 2})

(clojure.core/defn- ser-field-pattern-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "FieldPattern"}))) input), :shape "FieldPatternList", :type "list"})

(clojure.core/defn- ser-s-3-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3OriginConfig", :type "structure"}))

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-origin-group [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:id input)) #:http.request.field{:name "Id", :shape "string"}) (clojure.core/into (ser-origin-group-failover-criteria (:failover-criteria input)) #:http.request.field{:name "FailoverCriteria", :shape "OriginGroupFailoverCriteria"}) (clojure.core/into (ser-origin-group-members (:members input)) #:http.request.field{:name "Members", :shape "OriginGroupMembers"})], :shape "OriginGroup", :type "structure"}))

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

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar222691 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar222691 ["Quantity" :content]))} (letvar222691 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar222691 ["Items" :content]))))))

(clojure.core/defn- deser-content-type-profile [input] (clojure.core/let [letvar222799 {"Format" (portkey.aws/search-for-tag input "Format" :flattened? nil :xmlAttribute? nil), "ProfileId" (portkey.aws/search-for-tag input "ProfileId" :flattened? nil :xmlAttribute? nil), "ContentType" (portkey.aws/search-for-tag input "ContentType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:format (deser-format (clojure.core/get-in letvar222799 ["Format" :content])), :content-type (deserstring (clojure.core/get-in letvar222799 ["ContentType" :content]))} (letvar222799 "ProfileId") (clojure.core/assoc :profile-id (deserstring (clojure.core/get-in letvar222799 ["ProfileId" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar222907 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar222907 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar222907 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar222907 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar222907 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar223015 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar223015 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar223015 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar223015 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar223140 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? nil :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar223140 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar223140 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar223140 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar223140 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-field-patterns [input] (clojure.core/let [letvar223287 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar223287 ["Quantity" :content]))} (letvar223287 "Items") (clojure.core/assoc :items (deser-field-pattern-list (clojure.core/get-in letvar223287 ["Items" :content]))))))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar223395 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar223395 ["GeoRestriction" :content]))})))

(clojure.core/defn- deser-field-level-encryption-profile-config [input] (clojure.core/let [letvar223503 {"Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "EncryptionEntities" (portkey.aws/search-for-tag input "EncryptionEntities" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:name (deserstring (clojure.core/get-in letvar223503 ["Name" :content])), :caller-reference (deserstring (clojure.core/get-in letvar223503 ["CallerReference" :content])), :encryption-entities (deser-encryption-entities (clojure.core/get-in letvar223503 ["EncryptionEntities" :content]))} (letvar223503 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar223503 ["Comment" :content]))))))

(clojure.core/defn- deserstring [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-field-level-encryption-config [input] (clojure.core/let [letvar223616 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "QueryArgProfileConfig" (portkey.aws/search-for-tag input "QueryArgProfileConfig" :flattened? nil :xmlAttribute? nil), "ContentTypeProfileConfig" (portkey.aws/search-for-tag input "ContentTypeProfileConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar223616 ["CallerReference" :content]))} (letvar223616 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar223616 ["Comment" :content]))) (letvar223616 "QueryArgProfileConfig") (clojure.core/assoc :query-arg-profile-config (deser-query-arg-profile-config (clojure.core/get-in letvar223616 ["QueryArgProfileConfig" :content]))) (letvar223616 "ContentTypeProfileConfig") (clojure.core/assoc :content-type-profile-config (deser-content-type-profile-config (clojure.core/get-in letvar223616 ["ContentTypeProfileConfig" :content]))))))

(clojure.core/defn- deser-origin-group-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-group coll))) input))

(clojure.core/defn- deser-field-level-encryption-profile [input] (clojure.core/let [letvar223741 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "FieldLevelEncryptionProfileConfig" (portkey.aws/search-for-tag input "FieldLevelEncryptionProfileConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar223741 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar223741 ["LastModifiedTime" :content])), :field-level-encryption-profile-config (deser-field-level-encryption-profile-config (clojure.core/get-in letvar223741 ["FieldLevelEncryptionProfileConfig" :content]))})))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar223849 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? nil :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar223849 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar223849 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar223849 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar223849 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar223849 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar223849 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar223849 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar223849 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar223957 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar223957 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar223957 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar223957 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar223957 ["Quantity" :content]))} (letvar223957 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar223957 ["NextMarker" :content]))) (letvar223957 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar223957 ["Items" :content]))))))

(clojure.core/defn- deser-query-arg-profile [input] (clojure.core/let [letvar224065 {"QueryArg" (portkey.aws/search-for-tag input "QueryArg" :flattened? nil :xmlAttribute? nil), "ProfileId" (portkey.aws/search-for-tag input "ProfileId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:query-arg (deserstring (clojure.core/get-in letvar224065 ["QueryArg" :content])), :profile-id (deserstring (clojure.core/get-in letvar224065 ["ProfileId" :content]))})))

(clojure.core/defn- deser-lambda-function-association [input] (clojure.core/let [letvar224173 {"LambdaFunctionARN" (portkey.aws/search-for-tag input "LambdaFunctionARN" :flattened? nil :xmlAttribute? nil), "EventType" (portkey.aws/search-for-tag input "EventType" :flattened? nil :xmlAttribute? nil), "IncludeBody" (portkey.aws/search-for-tag input "IncludeBody" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:lambda-function-arn (deser-lambda-function-arn (clojure.core/get-in letvar224173 ["LambdaFunctionARN" :content])), :event-type (deser-event-type (clojure.core/get-in letvar224173 ["EventType" :content]))} (letvar224173 "IncludeBody") (clojure.core/assoc :include-body (deserboolean (clojure.core/get-in letvar224173 ["IncludeBody" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar224281 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? nil :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? nil :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? nil :xmlAttribute? nil), "QueryStringCacheKeys" (portkey.aws/search-for-tag input "QueryStringCacheKeys" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar224281 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar224281 ["Cookies" :content]))} (letvar224281 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar224281 ["Headers" :content]))) (letvar224281 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar224281 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-origin-group-members [input] (clojure.core/let [letvar224389 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar224389 ["Quantity" :content])), :items (deser-origin-group-member-list (clojure.core/get-in letvar224389 ["Items" :content]))})))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar224497 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar224497 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar224497 ["CallerReference" :content]))})))

(clojure.core/defn- deser-origin-group-failover-criteria [input] (clojure.core/let [letvar224605 {"StatusCodes" (portkey.aws/search-for-tag input "StatusCodes" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:status-codes (deser-status-codes (clojure.core/get-in letvar224605 ["StatusCodes" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar224747 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar224747 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar224747 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar224747 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar224747 ["Quantity" :content]))} (letvar224747 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar224747 ["NextMarker" :content]))) (letvar224747 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar224747 ["Items" :content]))))))

(clojure.core/defn- deser-public-key-config [input] (clojure.core/let [letvar224855 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "EncodedKey" (portkey.aws/search-for-tag input "EncodedKey" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar224855 ["CallerReference" :content])), :name (deserstring (clojure.core/get-in letvar224855 ["Name" :content])), :encoded-key (deserstring (clojure.core/get-in letvar224855 ["EncodedKey" :content]))} (letvar224855 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar224855 ["Comment" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-encryption-entity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-encryption-entity coll))) input))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar224985 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? nil :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar224985 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar224985 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar224985 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar224985 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar224985 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar224985 ["StreamingDistributionConfig" :content]))} (letvar224985 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar224985 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-lambda-function-associations [input] (clojure.core/let [letvar225093 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar225093 ["Quantity" :content]))} (letvar225093 "Items") (clojure.core/assoc :items (deser-lambda-function-association-list (clojure.core/get-in letvar225093 ["Items" :content]))))))

(clojure.core/defn- deser-encryption-entities [input] (clojure.core/let [letvar225201 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar225201 ["Quantity" :content]))} (letvar225201 "Items") (clojure.core/assoc :items (deser-encryption-entity-list (clojure.core/get-in letvar225201 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-field-level-encryption-profile-summary [input] (clojure.core/let [letvar225314 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "EncryptionEntities" (portkey.aws/search-for-tag input "EncryptionEntities" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar225314 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar225314 ["LastModifiedTime" :content])), :name (deserstring (clojure.core/get-in letvar225314 ["Name" :content])), :encryption-entities (deser-encryption-entities (clojure.core/get-in letvar225314 ["EncryptionEntities" :content]))} (letvar225314 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar225314 ["Comment" :content]))))))

(clojure.core/defn- deser-content-type-profile-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-content-type-profile coll))) input))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar225439 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? nil :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? nil :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? nil :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar225439 ["ErrorCode" :content]))} (letvar225439 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar225439 ["ResponsePagePath" :content]))) (letvar225439 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar225439 ["ResponseCode" :content]))) (letvar225439 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar225439 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar225564 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? nil :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar225564 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar225564 ["AwsAccountNumber" :content]))) (letvar225564 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar225564 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-field-level-encryption-profile-list [input] (clojure.core/let [letvar225691 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar225691 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar225691 ["Quantity" :content]))} (letvar225691 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar225691 ["NextMarker" :content]))) (letvar225691 "Items") (clojure.core/assoc :items (deser-field-level-encryption-profile-summary-list (clojure.core/get-in letvar225691 ["Items" :content]))))))

(clojure.core/defn- deser-content-type-profile-config [input] (clojure.core/let [letvar225799 {"ForwardWhenContentTypeIsUnknown" (portkey.aws/search-for-tag input "ForwardWhenContentTypeIsUnknown" :flattened? nil :xmlAttribute? nil), "ContentTypeProfiles" (portkey.aws/search-for-tag input "ContentTypeProfiles" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:forward-when-content-type-is-unknown (deserboolean (clojure.core/get-in letvar225799 ["ForwardWhenContentTypeIsUnknown" :content]))} (letvar225799 "ContentTypeProfiles") (clojure.core/assoc :content-type-profiles (deser-content-type-profiles (clojure.core/get-in letvar225799 ["ContentTypeProfiles" :content]))))))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar225907 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar225907 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar225907 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar226020 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar226020 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar226020 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-query-arg-profile-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-query-arg-profile coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar226162 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar226162 ["Quantity" :content]))} (letvar226162 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar226162 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar226270 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? nil :xmlAttribute? nil), "FieldLevelEncryptionId" (portkey.aws/search-for-tag input "FieldLevelEncryptionId" :flattened? nil :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? nil :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? nil :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? nil :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? nil :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? nil :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? nil :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? nil :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? nil :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? nil :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar226270 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar226270 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar226270 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar226270 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar226270 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar226270 ["MinTTL" :content]))} (letvar226270 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar226270 ["SmoothStreaming" :content]))) (letvar226270 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar226270 ["FieldLevelEncryptionId" :content]))) (letvar226270 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar226270 ["Compress" :content]))) (letvar226270 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar226270 ["LambdaFunctionAssociations" :content]))) (letvar226270 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar226270 ["MaxTTL" :content]))) (letvar226270 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar226270 ["AllowedMethods" :content]))) (letvar226270 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar226270 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar226378 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar226378 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar226378 ["Quantity" :content]))} (letvar226378 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar226378 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar226486 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? nil :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? nil :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? nil :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar226486 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar226486 ["DomainName" :content]))} (letvar226486 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar226486 ["OriginPath" :content]))) (letvar226486 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar226486 ["CustomHeaders" :content]))) (letvar226486 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar226486 ["S3OriginConfig" :content]))) (letvar226486 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar226486 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-format [input] (clojure.core/get {"URLEncoded" :url-encoded} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar226601 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar226601 ["Quantity" :content]))} (letvar226601 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar226601 ["Items" :content]))))))

(clojure.core/defn- deser-origin-group-member [input] (clojure.core/let [letvar226709 {"OriginId" (portkey.aws/search-for-tag input "OriginId" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-id (deserstring (clojure.core/get-in letvar226709 ["OriginId" :content]))})))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar226817 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar226817 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar226817 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar226817 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar226817 ["Quantity" :content]))} (letvar226817 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar226817 ["NextMarker" :content]))) (letvar226817 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar226817 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar226925 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar226925 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar226925 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar227033 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar227033 ["Quantity" :content]))} (letvar227033 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar227033 ["Items" :content]))))))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"viewer-request" :viewerrequest, "viewer-response" :viewerresponse, "origin-request" :originrequest, "origin-response" :originresponse} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-content-type-profiles [input] (clojure.core/let [letvar227146 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar227146 ["Quantity" :content]))} (letvar227146 "Items") (clojure.core/assoc :items (deser-content-type-profile-list (clojure.core/get-in letvar227146 ["Items" :content]))))))

(clojure.core/defn- deser-encryption-entity [input] (clojure.core/let [letvar227254 {"PublicKeyId" (portkey.aws/search-for-tag input "PublicKeyId" :flattened? nil :xmlAttribute? nil), "ProviderId" (portkey.aws/search-for-tag input "ProviderId" :flattened? nil :xmlAttribute? nil), "FieldPatterns" (portkey.aws/search-for-tag input "FieldPatterns" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:public-key-id (deserstring (clojure.core/get-in letvar227254 ["PublicKeyId" :content])), :provider-id (deserstring (clojure.core/get-in letvar227254 ["ProviderId" :content])), :field-patterns (deser-field-patterns (clojure.core/get-in letvar227254 ["FieldPatterns" :content]))})))

(clojure.core/defn- deser-lambda-function-arn [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar227367 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar227367 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar227367 ["Items" :content]))} (letvar227367 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar227367 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar227480 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? nil :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? nil :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? nil :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? nil :xmlAttribute? nil), "OriginReadTimeout" (portkey.aws/search-for-tag input "OriginReadTimeout" :flattened? nil :xmlAttribute? nil), "OriginKeepaliveTimeout" (portkey.aws/search-for-tag input "OriginKeepaliveTimeout" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar227480 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar227480 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar227480 ["OriginProtocolPolicy" :content]))} (letvar227480 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar227480 ["OriginSslProtocols" :content]))) (letvar227480 "OriginReadTimeout") (clojure.core/assoc :origin-read-timeout (deserinteger (clojure.core/get-in letvar227480 ["OriginReadTimeout" :content]))) (letvar227480 "OriginKeepaliveTimeout") (clojure.core/assoc :origin-keepalive-timeout (deserinteger (clojure.core/get-in letvar227480 ["OriginKeepaliveTimeout" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar227588 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar227588 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar227588 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar227696 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar227696 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar227696 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar227696 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar227696 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar227696 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar227696 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar227696 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar227696 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar227696 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar227696 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar227696 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar227804 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? nil :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar227804 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar227804 ["S3CanonicalUserId" :content]))} (letvar227804 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar227804 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-field-level-encryption [input] (clojure.core/let [letvar227929 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "FieldLevelEncryptionConfig" (portkey.aws/search-for-tag input "FieldLevelEncryptionConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar227929 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar227929 ["LastModifiedTime" :content])), :field-level-encryption-config (deser-field-level-encryption-config (clojure.core/get-in letvar227929 ["FieldLevelEncryptionConfig" :content]))})))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar228054 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar228054 ["Quantity" :content]))} (letvar228054 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar228054 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar228162 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar228162 ["Quantity" :content]))} (letvar228162 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar228162 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar228270 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? nil :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? nil :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? nil :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? nil :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? nil :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? nil :xmlAttribute? nil), "OriginGroups" (portkey.aws/search-for-tag input "OriginGroups" :flattened? nil :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? nil :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar228270 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar228270 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar228270 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar228270 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar228270 ["Enabled" :content]))} (letvar228270 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar228270 ["DefaultRootObject" :content]))) (letvar228270 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar228270 ["IsIPV6Enabled" :content]))) (letvar228270 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar228270 ["Restrictions" :content]))) (letvar228270 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar228270 ["WebACLId" :content]))) (letvar228270 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar228270 ["Logging" :content]))) (letvar228270 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar228270 ["CacheBehaviors" :content]))) (letvar228270 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar228270 ["CustomErrorResponses" :content]))) (letvar228270 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar228270 ["Aliases" :content]))) (letvar228270 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar228270 ["PriceClass" :content]))) (letvar228270 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar228270 ["HttpVersion" :content]))) (letvar228270 "OriginGroups") (clojure.core/assoc :origin-groups (deser-origin-groups (clojure.core/get-in letvar228270 ["OriginGroups" :content]))) (letvar228270 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar228270 ["ViewerCertificate" :content]))))))

(clojure.core/defn- deser-public-key-summary [input] (clojure.core/let [letvar228378 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Name" (portkey.aws/search-for-tag input "Name" :flattened? nil :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? nil :xmlAttribute? nil), "EncodedKey" (portkey.aws/search-for-tag input "EncodedKey" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar228378 ["Id" :content])), :name (deserstring (clojure.core/get-in letvar228378 ["Name" :content])), :created-time (desertimestamp (clojure.core/get-in letvar228378 ["CreatedTime" :content])), :encoded-key (deserstring (clojure.core/get-in letvar228378 ["EncodedKey" :content]))} (letvar228378 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar228378 ["Comment" :content]))))))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-method [input] (clojure.core/get {"GET" :get, "HEAD" :head, "POST" :post, "PUT" :put, "PATCH" :patch, "OPTIONS" :options, "DELETE" :delete} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-custom-header coll))) input))

(clojure.core/defn- deser-query-arg-profile-config [input] (clojure.core/let [letvar228564 {"ForwardWhenQueryArgProfileIsUnknown" (portkey.aws/search-for-tag input "ForwardWhenQueryArgProfileIsUnknown" :flattened? nil :xmlAttribute? nil), "QueryArgProfiles" (portkey.aws/search-for-tag input "QueryArgProfiles" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:forward-when-query-arg-profile-is-unknown (deserboolean (clojure.core/get-in letvar228564 ["ForwardWhenQueryArgProfileIsUnknown" :content]))} (letvar228564 "QueryArgProfiles") (clojure.core/assoc :query-arg-profiles (deser-query-arg-profiles (clojure.core/get-in letvar228564 ["QueryArgProfiles" :content]))))))

(clojure.core/defn- deser-origin-protocol-policy [input] (clojure.core/get {"http-only" :httponly, "match-viewer" :matchviewer, "https-only" :httpsonly} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signer coll))) input))

(clojure.core/defn- deser-query-arg-profiles [input] (clojure.core/let [letvar228694 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar228694 ["Quantity" :content]))} (letvar228694 "Items") (clojure.core/assoc :items (deser-query-arg-profile-list (clojure.core/get-in letvar228694 ["Items" :content]))))))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-status-code-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserinteger coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (clojure.core/get {"blacklist" :blacklist, "whitelist" :whitelist, "none" :none} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-status-codes [input] (clojure.core/let [letvar228841 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar228841 ["Quantity" :content])), :items (deser-status-code-list (clojure.core/get-in letvar228841 ["Items" :content]))})))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar228949 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar228949 ["Quantity" :content]))} (letvar228949 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar228949 ["Items" :content]))))))

(clojure.core/defn- deser-field-level-encryption-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-level-encryption-summary coll))) input))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar229076 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar229076 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar229076 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar229076 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar229201 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? nil :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar229201 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar229201 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar229309 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar229309 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar229309 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar229309 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar229309 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar229309 ["Enabled" :content]))} (letvar229309 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar229309 ["Aliases" :content]))) (letvar229309 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar229309 ["Logging" :content]))) (letvar229309 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar229309 ["PriceClass" :content]))))))

(clojure.core/defn- deser-origin-group-member-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-group-member coll))) input))

(clojure.core/defn- deser-public-key-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-public-key-summary coll))) input))

(clojure.core/defn- deser-field-pattern-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar229468 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar229468 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar229593 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar229593 ["Key" :content]))} (letvar229593 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar229593 ["Value" :content]))))))

(clojure.core/defn- deser-origin-group [input] (clojure.core/let [letvar229701 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "FailoverCriteria" (portkey.aws/search-for-tag input "FailoverCriteria" :flattened? nil :xmlAttribute? nil), "Members" (portkey.aws/search-for-tag input "Members" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar229701 ["Id" :content])), :failover-criteria (deser-origin-group-failover-criteria (clojure.core/get-in letvar229701 ["FailoverCriteria" :content])), :members (deser-origin-group-members (clojure.core/get-in letvar229701 ["Members" :content]))})))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar229809 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar229809 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar229809 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar229809 ["Prefix" :content]))})))

(clojure.core/defn- deser-field-level-encryption-summary [input] (clojure.core/let [letvar229917 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "QueryArgProfileConfig" (portkey.aws/search-for-tag input "QueryArgProfileConfig" :flattened? nil :xmlAttribute? nil), "ContentTypeProfileConfig" (portkey.aws/search-for-tag input "ContentTypeProfileConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar229917 ["Id" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar229917 ["LastModifiedTime" :content]))} (letvar229917 "Comment") (clojure.core/assoc :comment (deserstring (clojure.core/get-in letvar229917 ["Comment" :content]))) (letvar229917 "QueryArgProfileConfig") (clojure.core/assoc :query-arg-profile-config (deser-query-arg-profile-config (clojure.core/get-in letvar229917 ["QueryArgProfileConfig" :content]))) (letvar229917 "ContentTypeProfileConfig") (clojure.core/assoc :content-type-profile-config (deser-content-type-profile-config (clojure.core/get-in letvar229917 ["ContentTypeProfileConfig" :content]))))))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar230025 {"IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? nil :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? nil :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? nil :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? nil :xmlAttribute? nil), "OriginGroups" (portkey.aws/search-for-tag input "OriginGroups" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? nil :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar230025 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar230025 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar230025 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar230025 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar230025 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar230025 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar230025 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar230025 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar230025 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar230025 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar230025 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar230025 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar230025 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar230025 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar230025 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar230025 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar230025 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar230025 ["PriceClass" :content]))} (letvar230025 "OriginGroups") (clojure.core/assoc :origin-groups (deser-origin-groups (clojure.core/get-in letvar230025 ["OriginGroups" :content]))))))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lambda-function-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-association coll))) input))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar230155 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar230155 ["Quantity" :content]))} (letvar230155 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar230155 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1_2016" :tl-sv-1-2016, "TLSv1.1_2016" :tl-sv-11-2016, "TLSv1.2_2018" :tl-sv-12-2018} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar230268 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar230268 ["Quantity" :content])), :items (deser-origin-list (clojure.core/get-in letvar230268 ["Items" :content]))})))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar230393 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar230393 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar230393 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar230393 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar230393 ["Quantity" :content]))} (letvar230393 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar230393 ["NextMarker" :content]))) (letvar230393 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar230393 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-http-version [input] (clojure.core/get {"http1.1" :http-11, "http2" :http-2} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar230511 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? nil :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar230511 ["Forward" :content]))} (letvar230511 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar230511 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar230619 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar230619 ["Quantity" :content]))} (letvar230619 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar230619 ["Items" :content]))))))

(clojure.core/defn- deser-origin-groups [input] (clojure.core/let [letvar230727 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar230727 ["Quantity" :content]))} (letvar230727 "Items") (clojure.core/assoc :items (deser-origin-group-list (clojure.core/get-in letvar230727 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-public-key-list [input] (clojure.core/let [letvar230852 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar230852 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar230852 ["Quantity" :content]))} (letvar230852 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar230852 ["NextMarker" :content]))) (letvar230852 "Items") (clojure.core/assoc :items (deser-public-key-summary-list (clojure.core/get-in letvar230852 ["Items" :content]))))))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar230960 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? nil :xmlAttribute? nil), "FieldLevelEncryptionId" (portkey.aws/search-for-tag input "FieldLevelEncryptionId" :flattened? nil :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? nil :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? nil :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? nil :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? nil :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? nil :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? nil :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? nil :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? nil :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar230960 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar230960 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar230960 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar230960 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar230960 ["MinTTL" :content]))} (letvar230960 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar230960 ["SmoothStreaming" :content]))) (letvar230960 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar230960 ["FieldLevelEncryptionId" :content]))) (letvar230960 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar230960 ["Compress" :content]))) (letvar230960 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar230960 ["LambdaFunctionAssociations" :content]))) (letvar230960 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar230960 ["MaxTTL" :content]))) (letvar230960 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar230960 ["AllowedMethods" :content]))) (letvar230960 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar230960 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar231068 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar231068 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar231068 ["Quantity" :content]))} (letvar231068 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar231068 ["Items" :content]))))))

(clojure.core/defn- deser-field-level-encryption-list [input] (clojure.core/let [letvar231176 {"NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:max-items (deserinteger (clojure.core/get-in letvar231176 ["MaxItems" :content])), :quantity (deserinteger (clojure.core/get-in letvar231176 ["Quantity" :content]))} (letvar231176 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar231176 ["NextMarker" :content]))) (letvar231176 "Items") (clojure.core/assoc :items (deser-field-level-encryption-summary-list (clojure.core/get-in letvar231176 ["Items" :content]))))))

(clojure.core/defn- deser-public-key [input] (clojure.core/let [letvar231284 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "CreatedTime" (portkey.aws/search-for-tag input "CreatedTime" :flattened? nil :xmlAttribute? nil), "PublicKeyConfig" (portkey.aws/search-for-tag input "PublicKeyConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar231284 ["Id" :content])), :created-time (desertimestamp (clojure.core/get-in letvar231284 ["CreatedTime" :content])), :public-key-config (deser-public-key-config (clojure.core/get-in letvar231284 ["PublicKeyConfig" :content]))})))

(clojure.core/defn- deser-field-level-encryption-profile-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-field-level-encryption-profile-summary coll))) input))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar231409 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? nil :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? nil :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? nil :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? nil :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? nil :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? nil :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar231409 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar231409 ["CloudFrontDefaultCertificate" :content]))) (letvar231409 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar231409 ["IAMCertificateId" :content]))) (letvar231409 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar231409 ["ACMCertificateArn" :content]))) (letvar231409 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar231409 ["SSLSupportMethod" :content]))) (letvar231409 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar231409 ["MinimumProtocolVersion" :content]))) (letvar231409 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar231409 ["Certificate" :content]))) (letvar231409 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar231409 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar231517 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar231517 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar231517 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar231625 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar231625 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar231625 ["Quantity" :content]))} (letvar231625 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar231625 ["Items" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-result ([input] (response-list-tags-for-resource-result nil input)) ([resultWrapper231627 input] (clojure.core/let [rawinput231626 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231628 {"Tags" (portkey.aws/search-for-tag rawinput231626 "Tags" :flattened? nil :result-wrapper resultWrapper231627)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar231628 ["Tags" :content]))}))))

(clojure.core/defn- response-too-many-distributions-with-lambda-associations ([input] (response-too-many-distributions-with-lambda-associations nil input)) ([resultWrapper231630 input] (clojure.core/let [rawinput231629 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231631 {"Message" (portkey.aws/search-for-tag rawinput231629 "Message" :flattened? nil :result-wrapper resultWrapper231630)}] (clojure.core/cond-> {} (letvar231631 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231631 ["Message" :content])))))))

(clojure.core/defn- response-no-such-origin ([input] (response-no-such-origin nil input)) ([resultWrapper231633 input] (clojure.core/let [rawinput231632 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231634 {"Message" (portkey.aws/search-for-tag rawinput231632 "Message" :flattened? nil :result-wrapper resultWrapper231633)}] (clojure.core/cond-> {} (letvar231634 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231634 ["Message" :content])))))))

(clojure.core/defn- response-invalid-protocol-settings ([input] (response-invalid-protocol-settings nil input)) ([resultWrapper231636 input] (clojure.core/let [rawinput231635 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231637 {"Message" (portkey.aws/search-for-tag rawinput231635 "Message" :flattened? nil :result-wrapper resultWrapper231636)}] (clojure.core/cond-> {} (letvar231637 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231637 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list ([input] (response-too-many-cookie-names-in-white-list nil input)) ([resultWrapper231639 input] (clojure.core/let [rawinput231638 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231640 {"Message" (portkey.aws/search-for-tag rawinput231638 "Message" :flattened? nil :result-wrapper resultWrapper231639)}] (clojure.core/cond-> {} (letvar231640 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231640 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cache-behaviors ([input] (response-too-many-cache-behaviors nil input)) ([resultWrapper231642 input] (clojure.core/let [rawinput231641 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231643 {"Message" (portkey.aws/search-for-tag rawinput231641 "Message" :flattened? nil :result-wrapper resultWrapper231642)}] (clojure.core/cond-> {} (letvar231643 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231643 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origin-custom-headers ([input] (response-too-many-origin-custom-headers nil input)) ([resultWrapper231645 input] (clojure.core/let [rawinput231644 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231646 {"Message" (portkey.aws/search-for-tag rawinput231644 "Message" :flattened? nil :result-wrapper resultWrapper231645)}] (clojure.core/cond-> {} (letvar231646 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231646 ["Message" :content])))))))

(clojure.core/defn- response-create-field-level-encryption-config-result ([input] (response-create-field-level-encryption-config-result nil input)) ([resultWrapper231648 input] (clojure.core/let [rawinput231647 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231649 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput231647 "FieldLevelEncryption" :flattened? nil :result-wrapper resultWrapper231648), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231649 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar231649 ["FieldLevelEncryption" :content]))) (letvar231649 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar231649 ["Location"]))) (letvar231649 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231649 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distributions ([input] (response-too-many-streaming-distributions nil input)) ([resultWrapper231651 input] (clojure.core/let [rawinput231650 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231652 {"Message" (portkey.aws/search-for-tag rawinput231650 "Message" :flattened? nil :result-wrapper resultWrapper231651)}] (clojure.core/cond-> {} (letvar231652 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231652 ["Message" :content])))))))

(clojure.core/defn- response-get-streaming-distribution-result ([input] (response-get-streaming-distribution-result nil input)) ([resultWrapper231654 input] (clojure.core/let [rawinput231653 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231655 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput231653 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper231654), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231655 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar231655 ["StreamingDistribution" :content]))) (letvar231655 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231655 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es ([input] (response-too-many-streaming-distribution-cnam-es nil input)) ([resultWrapper231657 input] (clojure.core/let [rawinput231656 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231658 {"Message" (portkey.aws/search-for-tag rawinput231656 "Message" :flattened? nil :result-wrapper resultWrapper231657)}] (clojure.core/cond-> {} (letvar231658 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231658 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-profile-already-exists ([input] (response-field-level-encryption-profile-already-exists nil input)) ([resultWrapper231660 input] (clojure.core/let [rawinput231659 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231661 {"Message" (portkey.aws/search-for-tag rawinput231659 "Message" :flattened? nil :result-wrapper resultWrapper231660)}] (clojure.core/cond-> {} (letvar231661 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231661 ["Message" :content])))))))

(clojure.core/defn- response-invalid-viewer-certificate ([input] (response-invalid-viewer-certificate nil input)) ([resultWrapper231663 input] (clojure.core/let [rawinput231662 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231664 {"Message" (portkey.aws/search-for-tag rawinput231662 "Message" :flattened? nil :result-wrapper resultWrapper231663)}] (clojure.core/cond-> {} (letvar231664 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231664 ["Message" :content])))))))

(clojure.core/defn- response-get-public-key-config-result ([input] (response-get-public-key-config-result nil input)) ([resultWrapper231666 input] (clojure.core/let [rawinput231665 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231667 {"PublicKeyConfig" (portkey.aws/search-for-tag rawinput231665 "PublicKeyConfig" :flattened? nil :result-wrapper resultWrapper231666), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231667 "PublicKeyConfig") (clojure.core/assoc :public-key-config (deser-public-key-config (clojure.core/get-in letvar231667 ["PublicKeyConfig" :content]))) (letvar231667 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231667 ["ETag"])))))))

(clojure.core/defn- response-invalid-argument ([input] (response-invalid-argument nil input)) ([resultWrapper231669 input] (clojure.core/let [rawinput231668 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231670 {"Message" (portkey.aws/search-for-tag rawinput231668 "Message" :flattened? nil :result-wrapper resultWrapper231669)}] (clojure.core/cond-> {} (letvar231670 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231670 ["Message" :content])))))))

(clojure.core/defn- response-no-such-public-key ([input] (response-no-such-public-key nil input)) ([resultWrapper231672 input] (clojure.core/let [rawinput231671 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231673 {"Message" (portkey.aws/search-for-tag rawinput231671 "Message" :flattened? nil :result-wrapper resultWrapper231672)}] (clojure.core/cond-> {} (letvar231673 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231673 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-not-disabled ([input] (response-streaming-distribution-not-disabled nil input)) ([resultWrapper231675 input] (clojure.core/let [rawinput231674 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231676 {"Message" (portkey.aws/search-for-tag rawinput231674 "Message" :flattened? nil :result-wrapper resultWrapper231675)}] (clojure.core/cond-> {} (letvar231676 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231676 ["Message" :content])))))))

(clojure.core/defn- response-illegal-field-level-encryption-config-association-with-cache-behavior ([input] (response-illegal-field-level-encryption-config-association-with-cache-behavior nil input)) ([resultWrapper231678 input] (clojure.core/let [rawinput231677 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231679 {"Message" (portkey.aws/search-for-tag rawinput231677 "Message" :flattened? nil :result-wrapper resultWrapper231678)}] (clojure.core/cond-> {} (letvar231679 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231679 ["Message" :content])))))))

(clojure.core/defn- response-too-many-certificates ([input] (response-too-many-certificates nil input)) ([resultWrapper231681 input] (clojure.core/let [rawinput231680 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231682 {"Message" (portkey.aws/search-for-tag rawinput231680 "Message" :flattened? nil :result-wrapper resultWrapper231681)}] (clojure.core/cond-> {} (letvar231682 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231682 ["Message" :content])))))))

(clojure.core/defn- response-access-denied ([input] (response-access-denied nil input)) ([resultWrapper231684 input] (clojure.core/let [rawinput231683 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231685 {"Message" (portkey.aws/search-for-tag rawinput231683 "Message" :flattened? nil :result-wrapper resultWrapper231684)}] (clojure.core/cond-> {} (letvar231685 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231685 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use ([input] (response-cloud-front-origin-access-identity-in-use nil input)) ([resultWrapper231687 input] (clojure.core/let [rawinput231686 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231688 {"Message" (portkey.aws/search-for-tag rawinput231686 "Message" :flattened? nil :result-wrapper resultWrapper231687)}] (clojure.core/cond-> {} (letvar231688 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231688 ["Message" :content])))))))

(clojure.core/defn- response-cannot-change-immutable-public-key-fields ([input] (response-cannot-change-immutable-public-key-fields nil input)) ([resultWrapper231690 input] (clojure.core/let [rawinput231689 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231691 {"Message" (portkey.aws/search-for-tag rawinput231689 "Message" :flattened? nil :result-wrapper resultWrapper231690)}] (clojure.core/cond-> {} (letvar231691 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231691 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-profile-size-exceeded ([input] (response-field-level-encryption-profile-size-exceeded nil input)) ([resultWrapper231693 input] (clojure.core/let [rawinput231692 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231694 {"Message" (portkey.aws/search-for-tag rawinput231692 "Message" :flattened? nil :result-wrapper resultWrapper231693)}] (clojure.core/cond-> {} (letvar231694 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231694 ["Message" :content])))))))

(clojure.core/defn- response-invalid-lambda-function-association ([input] (response-invalid-lambda-function-association nil input)) ([resultWrapper231696 input] (clojure.core/let [rawinput231695 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231697 {"Message" (portkey.aws/search-for-tag rawinput231695 "Message" :flattened? nil :result-wrapper resultWrapper231696)}] (clojure.core/cond-> {} (letvar231697 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231697 ["Message" :content])))))))

(clojure.core/defn- response-create-field-level-encryption-profile-result ([input] (response-create-field-level-encryption-profile-result nil input)) ([resultWrapper231699 input] (clojure.core/let [rawinput231698 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231700 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput231698 "FieldLevelEncryptionProfile" :flattened? nil :result-wrapper resultWrapper231699), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231700 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar231700 ["FieldLevelEncryptionProfile" :content]))) (letvar231700 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar231700 ["Location"]))) (letvar231700 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231700 ["ETag"])))))))

(clojure.core/defn- response-get-field-level-encryption-profile-result ([input] (response-get-field-level-encryption-profile-result nil input)) ([resultWrapper231702 input] (clojure.core/let [rawinput231701 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231703 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput231701 "FieldLevelEncryptionProfile" :flattened? nil :result-wrapper resultWrapper231702), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231703 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar231703 ["FieldLevelEncryptionProfile" :content]))) (letvar231703 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231703 ["ETag"])))))))

(clojure.core/defn- response-no-such-resource ([input] (response-no-such-resource nil input)) ([resultWrapper231705 input] (clojure.core/let [rawinput231704 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231706 {"Message" (portkey.aws/search-for-tag rawinput231704 "Message" :flattened? nil :result-wrapper resultWrapper231705)}] (clojure.core/cond-> {} (letvar231706 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231706 ["Message" :content])))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result ([input] (response-update-cloud-front-origin-access-identity-result nil input)) ([resultWrapper231708 input] (clojure.core/let [rawinput231707 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231709 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput231707 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper231708), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231709 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar231709 ["CloudFrontOriginAccessIdentity" :content]))) (letvar231709 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231709 ["ETag"])))))))

(clojure.core/defn- response-invalid-error-code ([input] (response-invalid-error-code nil input)) ([resultWrapper231711 input] (clojure.core/let [rawinput231710 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231712 {"Message" (portkey.aws/search-for-tag rawinput231710 "Message" :flattened? nil :result-wrapper resultWrapper231711)}] (clojure.core/cond-> {} (letvar231712 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231712 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-profile-in-use ([input] (response-field-level-encryption-profile-in-use nil input)) ([resultWrapper231714 input] (clojure.core/let [rawinput231713 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231715 {"Message" (portkey.aws/search-for-tag rawinput231713 "Message" :flattened? nil :result-wrapper resultWrapper231714)}] (clojure.core/cond-> {} (letvar231715 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231715 ["Message" :content])))))))

(clojure.core/defn- response-too-many-lambda-function-associations ([input] (response-too-many-lambda-function-associations nil input)) ([resultWrapper231717 input] (clojure.core/let [rawinput231716 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231718 {"Message" (portkey.aws/search-for-tag rawinput231716 "Message" :flattened? nil :result-wrapper resultWrapper231717)}] (clojure.core/cond-> {} (letvar231718 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231718 ["Message" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-result ([input] (response-create-streaming-distribution-result nil input)) ([resultWrapper231720 input] (clojure.core/let [rawinput231719 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231721 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput231719 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper231720), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231721 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar231721 ["StreamingDistribution" :content]))) (letvar231721 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar231721 ["Location"]))) (letvar231721 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231721 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-profiles ([input] (response-too-many-field-level-encryption-profiles nil input)) ([resultWrapper231723 input] (clojure.core/let [rawinput231722 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231724 {"Message" (portkey.aws/search-for-tag rawinput231722 "Message" :flattened? nil :result-wrapper resultWrapper231723)}] (clojure.core/cond-> {} (letvar231724 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231724 ["Message" :content])))))))

(clojure.core/defn- response-no-such-field-level-encryption-profile ([input] (response-no-such-field-level-encryption-profile nil input)) ([resultWrapper231726 input] (clojure.core/let [rawinput231725 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231727 {"Message" (portkey.aws/search-for-tag rawinput231725 "Message" :flattened? nil :result-wrapper resultWrapper231726)}] (clojure.core/cond-> {} (letvar231727 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231727 ["Message" :content])))))))

(clojure.core/defn- response-invalid-relative-path ([input] (response-invalid-relative-path nil input)) ([resultWrapper231729 input] (clojure.core/let [rawinput231728 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231730 {"Message" (portkey.aws/search-for-tag rawinput231728 "Message" :flattened? nil :result-wrapper resultWrapper231729)}] (clojure.core/cond-> {} (letvar231730 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231730 ["Message" :content])))))))

(clojure.core/defn- response-create-public-key-result ([input] (response-create-public-key-result nil input)) ([resultWrapper231732 input] (clojure.core/let [rawinput231731 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231733 {"PublicKey" (portkey.aws/search-for-tag rawinput231731 "PublicKey" :flattened? nil :result-wrapper resultWrapper231732), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231733 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar231733 ["PublicKey" :content]))) (letvar231733 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar231733 ["Location"]))) (letvar231733 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231733 ["ETag"])))))))

(clojure.core/defn- response-invalid-location-code ([input] (response-invalid-location-code nil input)) ([resultWrapper231735 input] (clojure.core/let [rawinput231734 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231736 {"Message" (portkey.aws/search-for-tag rawinput231734 "Message" :flattened? nil :result-wrapper resultWrapper231735)}] (clojure.core/cond-> {} (letvar231736 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231736 ["Message" :content])))))))

(clojure.core/defn- response-invalid-web-acl-id ([input] (response-invalid-web-acl-id nil input)) ([resultWrapper231738 input] (clojure.core/let [rawinput231737 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231739 {"Message" (portkey.aws/search-for-tag rawinput231737 "Message" :flattened? nil :result-wrapper resultWrapper231738)}] (clojure.core/cond-> {} (letvar231739 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231739 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin ([input] (response-invalid-origin nil input)) ([resultWrapper231741 input] (clojure.core/let [rawinput231740 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231742 {"Message" (portkey.aws/search-for-tag rawinput231740 "Message" :flattened? nil :result-wrapper resultWrapper231741)}] (clojure.core/cond-> {} (letvar231742 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231742 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities ([input] (response-too-many-cloud-front-origin-access-identities nil input)) ([resultWrapper231744 input] (clojure.core/let [rawinput231743 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231745 {"Message" (portkey.aws/search-for-tag rawinput231743 "Message" :flattened? nil :result-wrapper resultWrapper231744)}] (clojure.core/cond-> {} (letvar231745 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231745 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-config-already-exists ([input] (response-field-level-encryption-config-already-exists nil input)) ([resultWrapper231747 input] (clojure.core/let [rawinput231746 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231748 {"Message" (portkey.aws/search-for-tag rawinput231746 "Message" :flattened? nil :result-wrapper resultWrapper231747)}] (clojure.core/cond-> {} (letvar231748 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231748 ["Message" :content])))))))

(clojure.core/defn- response-no-such-field-level-encryption-config ([input] (response-no-such-field-level-encryption-config nil input)) ([resultWrapper231750 input] (clojure.core/let [rawinput231749 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231751 {"Message" (portkey.aws/search-for-tag rawinput231749 "Message" :flattened? nil :result-wrapper resultWrapper231750)}] (clojure.core/cond-> {} (letvar231751 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231751 ["Message" :content])))))))

(clojure.core/defn- response-update-distribution-result ([input] (response-update-distribution-result nil input)) ([resultWrapper231753 input] (clojure.core/let [rawinput231752 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231754 {"Distribution" (portkey.aws/search-for-tag rawinput231752 "Distribution" :flattened? nil :result-wrapper resultWrapper231753), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231754 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar231754 ["Distribution" :content]))) (letvar231754 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231754 ["ETag"])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result ([input] (response-get-cloud-front-origin-access-identity-result nil input)) ([resultWrapper231756 input] (clojure.core/let [rawinput231755 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231757 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput231755 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper231756), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231757 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar231757 ["CloudFrontOriginAccessIdentity" :content]))) (letvar231757 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231757 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-encryption-entities ([input] (response-too-many-field-level-encryption-encryption-entities nil input)) ([resultWrapper231759 input] (clojure.core/let [rawinput231758 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231760 {"Message" (portkey.aws/search-for-tag rawinput231758 "Message" :flattened? nil :result-wrapper resultWrapper231759)}] (clojure.core/cond-> {} (letvar231760 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231760 ["Message" :content])))))))

(clojure.core/defn- response-get-field-level-encryption-result ([input] (response-get-field-level-encryption-result nil input)) ([resultWrapper231762 input] (clojure.core/let [rawinput231761 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231763 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput231761 "FieldLevelEncryption" :flattened? nil :result-wrapper resultWrapper231762), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231763 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar231763 ["FieldLevelEncryption" :content]))) (letvar231763 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231763 ["ETag"])))))))

(clojure.core/defn- response-invalid-query-string-parameters ([input] (response-invalid-query-string-parameters nil input)) ([resultWrapper231765 input] (clojure.core/let [rawinput231764 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231766 {"Message" (portkey.aws/search-for-tag rawinput231764 "Message" :flattened? nil :result-wrapper resultWrapper231765)}] (clojure.core/cond-> {} (letvar231766 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231766 ["Message" :content])))))))

(clojure.core/defn- response-public-key-already-exists ([input] (response-public-key-already-exists nil input)) ([resultWrapper231768 input] (clojure.core/let [rawinput231767 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231769 {"Message" (portkey.aws/search-for-tag rawinput231767 "Message" :flattened? nil :result-wrapper resultWrapper231768)}] (clojure.core/cond-> {} (letvar231769 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231769 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origins ([input] (response-too-many-origins nil input)) ([resultWrapper231771 input] (clojure.core/let [rawinput231770 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231772 {"Message" (portkey.aws/search-for-tag rawinput231770 "Message" :flattened? nil :result-wrapper resultWrapper231771)}] (clojure.core/cond-> {} (letvar231772 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231772 ["Message" :content])))))))

(clojure.core/defn- response-invalid-ttl-order ([input] (response-invalid-ttl-order nil input)) ([resultWrapper231774 input] (clojure.core/let [rawinput231773 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231775 {"Message" (portkey.aws/search-for-tag rawinput231773 "Message" :flattened? nil :result-wrapper resultWrapper231774)}] (clojure.core/cond-> {} (letvar231775 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231775 ["Message" :content])))))))

(clojure.core/defn- response-no-such-streaming-distribution ([input] (response-no-such-streaming-distribution nil input)) ([resultWrapper231777 input] (clojure.core/let [rawinput231776 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231778 {"Message" (portkey.aws/search-for-tag rawinput231776 "Message" :flattened? nil :result-wrapper resultWrapper231777)}] (clojure.core/cond-> {} (letvar231778 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231778 ["Message" :content])))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result ([input] (response-create-cloud-front-origin-access-identity-result nil input)) ([resultWrapper231780 input] (clojure.core/let [rawinput231779 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231781 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput231779 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper231780), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231781 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar231781 ["CloudFrontOriginAccessIdentity" :content]))) (letvar231781 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar231781 ["Location"]))) (letvar231781 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231781 ["ETag"])))))))

(clojure.core/defn- response-cname-already-exists ([input] (response-cname-already-exists nil input)) ([resultWrapper231783 input] (clojure.core/let [rawinput231782 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231784 {"Message" (portkey.aws/search-for-tag rawinput231782 "Message" :flattened? nil :result-wrapper resultWrapper231783)}] (clojure.core/cond-> {} (letvar231784 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231784 ["Message" :content])))))))

(clojure.core/defn- response-invalid-default-root-object ([input] (response-invalid-default-root-object nil input)) ([resultWrapper231786 input] (clojure.core/let [rawinput231785 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231787 {"Message" (portkey.aws/search-for-tag rawinput231785 "Message" :flattened? nil :result-wrapper resultWrapper231786)}] (clojure.core/cond-> {} (letvar231787 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231787 ["Message" :content])))))))

(clojure.core/defn- response-invalid-response-code ([input] (response-invalid-response-code nil input)) ([resultWrapper231789 input] (clojure.core/let [rawinput231788 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231790 {"Message" (portkey.aws/search-for-tag rawinput231788 "Message" :flattened? nil :result-wrapper resultWrapper231789)}] (clojure.core/cond-> {} (letvar231790 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231790 ["Message" :content])))))))

(clojure.core/defn- response-no-such-invalidation ([input] (response-no-such-invalidation nil input)) ([resultWrapper231792 input] (clojure.core/let [rawinput231791 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231793 {"Message" (portkey.aws/search-for-tag rawinput231791 "Message" :flattened? nil :result-wrapper resultWrapper231792)}] (clojure.core/cond-> {} (letvar231793 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231793 ["Message" :content])))))))

(clojure.core/defn- response-too-many-invalidations-in-progress ([input] (response-too-many-invalidations-in-progress nil input)) ([resultWrapper231795 input] (clojure.core/let [rawinput231794 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231796 {"Message" (portkey.aws/search-for-tag rawinput231794 "Message" :flattened? nil :result-wrapper resultWrapper231795)}] (clojure.core/cond-> {} (letvar231796 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231796 ["Message" :content])))))))

(clojure.core/defn- response-get-public-key-result ([input] (response-get-public-key-result nil input)) ([resultWrapper231798 input] (clojure.core/let [rawinput231797 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231799 {"PublicKey" (portkey.aws/search-for-tag rawinput231797 "PublicKey" :flattened? nil :result-wrapper resultWrapper231798), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231799 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar231799 ["PublicKey" :content]))) (letvar231799 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231799 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions-associated-to-field-level-encryption-config ([input] (response-too-many-distributions-associated-to-field-level-encryption-config nil input)) ([resultWrapper231801 input] (clojure.core/let [rawinput231800 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231802 {"Message" (portkey.aws/search-for-tag rawinput231800 "Message" :flattened? nil :result-wrapper resultWrapper231801)}] (clojure.core/cond-> {} (letvar231802 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231802 ["Message" :content])))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result ([input] (response-list-cloud-front-origin-access-identities-result nil input)) ([resultWrapper231804 input] (clojure.core/let [rawinput231803 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231805 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput231803 "CloudFrontOriginAccessIdentityList" :flattened? nil :result-wrapper resultWrapper231804)}] (clojure.core/cond-> {} (letvar231805 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar231805 ["CloudFrontOriginAccessIdentityList" :content])))))))

(clojure.core/defn- response-update-public-key-result ([input] (response-update-public-key-result nil input)) ([resultWrapper231807 input] (clojure.core/let [rawinput231806 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231808 {"PublicKey" (portkey.aws/search-for-tag rawinput231806 "PublicKey" :flattened? nil :result-wrapper resultWrapper231807), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231808 "PublicKey") (clojure.core/assoc :public-key (deser-public-key (clojure.core/get-in letvar231808 ["PublicKey" :content]))) (letvar231808 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231808 ["ETag"])))))))

(clojure.core/defn- response-invalid-forward-cookies ([input] (response-invalid-forward-cookies nil input)) ([resultWrapper231810 input] (clojure.core/let [rawinput231809 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231811 {"Message" (portkey.aws/search-for-tag rawinput231809 "Message" :flattened? nil :result-wrapper resultWrapper231810)}] (clojure.core/cond-> {} (letvar231811 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231811 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-config-result ([input] (response-get-distribution-config-result nil input)) ([resultWrapper231813 input] (clojure.core/let [rawinput231812 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231814 {"DistributionConfig" (portkey.aws/search-for-tag rawinput231812 "DistributionConfig" :flattened? nil :result-wrapper resultWrapper231813), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231814 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar231814 ["DistributionConfig" :content]))) (letvar231814 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231814 ["ETag"])))))))

(clojure.core/defn- response-invalid-required-protocol ([input] (response-invalid-required-protocol nil input)) ([resultWrapper231816 input] (clojure.core/let [rawinput231815 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231817 {"Message" (portkey.aws/search-for-tag rawinput231815 "Message" :flattened? nil :result-wrapper resultWrapper231816)}] (clojure.core/cond-> {} (letvar231817 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231817 ["Message" :content])))))))

(clojure.core/defn- response-update-field-level-encryption-config-result ([input] (response-update-field-level-encryption-config-result nil input)) ([resultWrapper231819 input] (clojure.core/let [rawinput231818 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231820 {"FieldLevelEncryption" (portkey.aws/search-for-tag rawinput231818 "FieldLevelEncryption" :flattened? nil :result-wrapper resultWrapper231819), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231820 "FieldLevelEncryption") (clojure.core/assoc :field-level-encryption (deser-field-level-encryption (clojure.core/get-in letvar231820 ["FieldLevelEncryption" :content]))) (letvar231820 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231820 ["ETag"])))))))

(clojure.core/defn- response-get-distribution-result ([input] (response-get-distribution-result nil input)) ([resultWrapper231822 input] (clojure.core/let [rawinput231821 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231823 {"Distribution" (portkey.aws/search-for-tag rawinput231821 "Distribution" :flattened? nil :result-wrapper resultWrapper231822), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231823 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar231823 ["Distribution" :content]))) (letvar231823 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231823 ["ETag"])))))))

(clojure.core/defn- response-update-field-level-encryption-profile-result ([input] (response-update-field-level-encryption-profile-result nil input)) ([resultWrapper231825 input] (clojure.core/let [rawinput231824 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231826 {"FieldLevelEncryptionProfile" (portkey.aws/search-for-tag rawinput231824 "FieldLevelEncryptionProfile" :flattened? nil :result-wrapper resultWrapper231825), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231826 "FieldLevelEncryptionProfile") (clojure.core/assoc :field-level-encryption-profile (deser-field-level-encryption-profile (clojure.core/get-in letvar231826 ["FieldLevelEncryptionProfile" :content]))) (letvar231826 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231826 ["ETag"])))))))

(clojure.core/defn- response-get-streaming-distribution-config-result ([input] (response-get-streaming-distribution-config-result nil input)) ([resultWrapper231828 input] (clojure.core/let [rawinput231827 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231829 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput231827 "StreamingDistributionConfig" :flattened? nil :result-wrapper resultWrapper231828), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231829 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar231829 ["StreamingDistributionConfig" :content]))) (letvar231829 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231829 ["ETag"])))))))

(clojure.core/defn- response-too-many-origin-groups-per-distribution ([input] (response-too-many-origin-groups-per-distribution nil input)) ([resultWrapper231831 input] (clojure.core/let [rawinput231830 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231832 {"Message" (portkey.aws/search-for-tag rawinput231830 "Message" :flattened? nil :result-wrapper resultWrapper231831)}] (clojure.core/cond-> {} (letvar231832 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231832 ["Message" :content])))))))

(clojure.core/defn- response-list-public-keys-result ([input] (response-list-public-keys-result nil input)) ([resultWrapper231834 input] (clojure.core/let [rawinput231833 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231835 {"PublicKeyList" (portkey.aws/search-for-tag rawinput231833 "PublicKeyList" :flattened? nil :result-wrapper resultWrapper231834)}] (clojure.core/cond-> {} (letvar231835 "PublicKeyList") (clojure.core/assoc :public-key-list (deser-public-key-list (clojure.core/get-in letvar231835 ["PublicKeyList" :content])))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin ([input] (response-invalid-headers-for-s-3-origin nil input)) ([resultWrapper231837 input] (clojure.core/let [rawinput231836 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231838 {"Message" (portkey.aws/search-for-tag rawinput231836 "Message" :flattened? nil :result-wrapper resultWrapper231837)}] (clojure.core/cond-> {} (letvar231838 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231838 ["Message" :content])))))))

(clojure.core/defn- response-get-field-level-encryption-config-result ([input] (response-get-field-level-encryption-config-result nil input)) ([resultWrapper231840 input] (clojure.core/let [rawinput231839 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231841 {"FieldLevelEncryptionConfig" (portkey.aws/search-for-tag rawinput231839 "FieldLevelEncryptionConfig" :flattened? nil :result-wrapper resultWrapper231840), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231841 "FieldLevelEncryptionConfig") (clojure.core/assoc :field-level-encryption-config (deser-field-level-encryption-config (clojure.core/get-in letvar231841 ["FieldLevelEncryptionConfig" :content]))) (letvar231841 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231841 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-configs ([input] (response-too-many-field-level-encryption-configs nil input)) ([resultWrapper231843 input] (clojure.core/let [rawinput231842 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231844 {"Message" (portkey.aws/search-for-tag rawinput231842 "Message" :flattened? nil :result-wrapper resultWrapper231843)}] (clojure.core/cond-> {} (letvar231844 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231844 ["Message" :content])))))))

(clojure.core/defn- response-field-level-encryption-config-in-use ([input] (response-field-level-encryption-config-in-use nil input)) ([resultWrapper231846 input] (clojure.core/let [rawinput231845 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231847 {"Message" (portkey.aws/search-for-tag rawinput231845 "Message" :flattened? nil :result-wrapper resultWrapper231846)}] (clojure.core/cond-> {} (letvar231847 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231847 ["Message" :content])))))))

(clojure.core/defn- response-too-many-distribution-cnam-es ([input] (response-too-many-distribution-cnam-es nil input)) ([resultWrapper231849 input] (clojure.core/let [rawinput231848 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231850 {"Message" (portkey.aws/search-for-tag rawinput231848 "Message" :flattened? nil :result-wrapper resultWrapper231849)}] (clojure.core/cond-> {} (letvar231850 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231850 ["Message" :content])))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter ([input] (response-invalid-geo-restriction-parameter nil input)) ([resultWrapper231852 input] (clojure.core/let [rawinput231851 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231853 {"Message" (portkey.aws/search-for-tag rawinput231851 "Message" :flattened? nil :result-wrapper resultWrapper231852)}] (clojure.core/cond-> {} (letvar231853 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231853 ["Message" :content])))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity ([input] (response-no-such-cloud-front-origin-access-identity nil input)) ([resultWrapper231855 input] (clojure.core/let [rawinput231854 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231856 {"Message" (portkey.aws/search-for-tag rawinput231854 "Message" :flattened? nil :result-wrapper resultWrapper231855)}] (clojure.core/cond-> {} (letvar231856 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231856 ["Message" :content])))))))

(clojure.core/defn- response-list-invalidations-result ([input] (response-list-invalidations-result nil input)) ([resultWrapper231858 input] (clojure.core/let [rawinput231857 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231859 {"InvalidationList" (portkey.aws/search-for-tag rawinput231857 "InvalidationList" :flattened? nil :result-wrapper resultWrapper231858)}] (clojure.core/cond-> {} (letvar231859 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar231859 ["InvalidationList" :content])))))))

(clojure.core/defn- response-batch-too-large ([input] (response-batch-too-large nil input)) ([resultWrapper231861 input] (clojure.core/let [rawinput231860 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231862 {"Message" (portkey.aws/search-for-tag rawinput231860 "Message" :flattened? nil :result-wrapper resultWrapper231861)}] (clojure.core/cond-> {} (letvar231862 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231862 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-with-tags-result ([input] (response-create-distribution-with-tags-result nil input)) ([resultWrapper231864 input] (clojure.core/let [rawinput231863 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231865 {"Distribution" (portkey.aws/search-for-tag rawinput231863 "Distribution" :flattened? nil :result-wrapper resultWrapper231864), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231865 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar231865 ["Distribution" :content]))) (letvar231865 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar231865 ["Location"]))) (letvar231865 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231865 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-query-arg-profiles ([input] (response-too-many-field-level-encryption-query-arg-profiles nil input)) ([resultWrapper231867 input] (clojure.core/let [rawinput231866 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231868 {"Message" (portkey.aws/search-for-tag rawinput231866 "Message" :flattened? nil :result-wrapper resultWrapper231867)}] (clojure.core/cond-> {} (letvar231868 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231868 ["Message" :content])))))))

(clojure.core/defn- response-list-streaming-distributions-result ([input] (response-list-streaming-distributions-result nil input)) ([resultWrapper231870 input] (clojure.core/let [rawinput231869 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231871 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput231869 "StreamingDistributionList" :flattened? nil :result-wrapper resultWrapper231870)}] (clojure.core/cond-> {} (letvar231871 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar231871 ["StreamingDistributionList" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result ([input] (response-create-streaming-distribution-with-tags-result nil input)) ([resultWrapper231873 input] (clojure.core/let [rawinput231872 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231874 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput231872 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper231873), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231874 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar231874 ["StreamingDistribution" :content]))) (letvar231874 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar231874 ["Location"]))) (letvar231874 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231874 ["ETag"])))))))

(clojure.core/defn- response-create-invalidation-result ([input] (response-create-invalidation-result nil input)) ([resultWrapper231876 input] (clojure.core/let [rawinput231875 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231877 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput231875 "Invalidation" :flattened? nil :result-wrapper resultWrapper231876)}] (clojure.core/cond-> {} (letvar231877 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar231877 ["Location"]))) (letvar231877 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar231877 ["Invalidation" :content])))))))

(clojure.core/defn- response-missing-body ([input] (response-missing-body nil input)) ([resultWrapper231879 input] (clojure.core/let [rawinput231878 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231880 {"Message" (portkey.aws/search-for-tag rawinput231878 "Message" :flattened? nil :result-wrapper resultWrapper231879)}] (clojure.core/cond-> {} (letvar231880 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231880 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-read-timeout ([input] (response-invalid-origin-read-timeout nil input)) ([resultWrapper231882 input] (clojure.core/let [rawinput231881 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231883 {"Message" (portkey.aws/search-for-tag rawinput231881 "Message" :flattened? nil :result-wrapper resultWrapper231882)}] (clojure.core/cond-> {} (letvar231883 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231883 ["Message" :content])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result ([input] (response-get-cloud-front-origin-access-identity-config-result nil input)) ([resultWrapper231885 input] (clojure.core/let [rawinput231884 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231886 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput231884 "CloudFrontOriginAccessIdentityConfig" :flattened? nil :result-wrapper resultWrapper231885), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231886 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar231886 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar231886 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231886 ["ETag"])))))))

(clojure.core/defn- response-distribution-not-disabled ([input] (response-distribution-not-disabled nil input)) ([resultWrapper231888 input] (clojure.core/let [rawinput231887 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231889 {"Message" (portkey.aws/search-for-tag rawinput231887 "Message" :flattened? nil :result-wrapper resultWrapper231888)}] (clojure.core/cond-> {} (letvar231889 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231889 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists ([input] (response-cloud-front-origin-access-identity-already-exists nil input)) ([resultWrapper231891 input] (clojure.core/let [rawinput231890 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231892 {"Message" (portkey.aws/search-for-tag rawinput231890 "Message" :flattened? nil :result-wrapper resultWrapper231891)}] (clojure.core/cond-> {} (letvar231892 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231892 ["Message" :content])))))))

(clojure.core/defn- response-precondition-failed ([input] (response-precondition-failed nil input)) ([resultWrapper231894 input] (clojure.core/let [rawinput231893 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231895 {"Message" (portkey.aws/search-for-tag rawinput231893 "Message" :flattened? nil :result-wrapper resultWrapper231894)}] (clojure.core/cond-> {} (letvar231895 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231895 ["Message" :content])))))))

(clojure.core/defn- response-distribution-already-exists ([input] (response-distribution-already-exists nil input)) ([resultWrapper231897 input] (clojure.core/let [rawinput231896 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231898 {"Message" (portkey.aws/search-for-tag rawinput231896 "Message" :flattened? nil :result-wrapper resultWrapper231897)}] (clojure.core/cond-> {} (letvar231898 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231898 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-access-identity ([input] (response-invalid-origin-access-identity nil input)) ([resultWrapper231900 input] (clojure.core/let [rawinput231899 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231901 {"Message" (portkey.aws/search-for-tag rawinput231899 "Message" :flattened? nil :result-wrapper resultWrapper231900)}] (clojure.core/cond-> {} (letvar231901 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231901 ["Message" :content])))))))

(clojure.core/defn- response-too-many-trusted-signers ([input] (response-too-many-trusted-signers nil input)) ([resultWrapper231903 input] (clojure.core/let [rawinput231902 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231904 {"Message" (portkey.aws/search-for-tag rawinput231902 "Message" :flattened? nil :result-wrapper resultWrapper231903)}] (clojure.core/cond-> {} (letvar231904 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231904 ["Message" :content])))))))

(clojure.core/defn- response-too-many-public-keys ([input] (response-too-many-public-keys nil input)) ([resultWrapper231906 input] (clojure.core/let [rawinput231905 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231907 {"Message" (portkey.aws/search-for-tag rawinput231905 "Message" :flattened? nil :result-wrapper resultWrapper231906)}] (clojure.core/cond-> {} (letvar231907 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231907 ["Message" :content])))))))

(clojure.core/defn- response-invalid-minimum-protocol-version ([input] (response-invalid-minimum-protocol-version nil input)) ([resultWrapper231909 input] (clojure.core/let [rawinput231908 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231910 {"Message" (portkey.aws/search-for-tag rawinput231908 "Message" :flattened? nil :result-wrapper resultWrapper231909)}] (clojure.core/cond-> {} (letvar231910 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231910 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-already-exists ([input] (response-streaming-distribution-already-exists nil input)) ([resultWrapper231912 input] (clojure.core/let [rawinput231911 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231913 {"Message" (portkey.aws/search-for-tag rawinput231911 "Message" :flattened? nil :result-wrapper resultWrapper231912)}] (clojure.core/cond-> {} (letvar231913 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231913 ["Message" :content])))))))

(clojure.core/defn- response-public-key-in-use ([input] (response-public-key-in-use nil input)) ([resultWrapper231915 input] (clojure.core/let [rawinput231914 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231916 {"Message" (portkey.aws/search-for-tag rawinput231914 "Message" :flattened? nil :result-wrapper resultWrapper231915)}] (clojure.core/cond-> {} (letvar231916 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231916 ["Message" :content])))))))

(clojure.core/defn- response-invalid-if-match-version ([input] (response-invalid-if-match-version nil input)) ([resultWrapper231918 input] (clojure.core/let [rawinput231917 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231919 {"Message" (portkey.aws/search-for-tag rawinput231917 "Message" :flattened? nil :result-wrapper resultWrapper231918)}] (clojure.core/cond-> {} (letvar231919 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231919 ["Message" :content])))))))

(clojure.core/defn- response-list-field-level-encryption-profiles-result ([input] (response-list-field-level-encryption-profiles-result nil input)) ([resultWrapper231921 input] (clojure.core/let [rawinput231920 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231922 {"FieldLevelEncryptionProfileList" (portkey.aws/search-for-tag rawinput231920 "FieldLevelEncryptionProfileList" :flattened? nil :result-wrapper resultWrapper231921)}] (clojure.core/cond-> {} (letvar231922 "FieldLevelEncryptionProfileList") (clojure.core/assoc :field-level-encryption-profile-list (deser-field-level-encryption-profile-list (clojure.core/get-in letvar231922 ["FieldLevelEncryptionProfileList" :content])))))))

(clojure.core/defn- response-create-distribution-result ([input] (response-create-distribution-result nil input)) ([resultWrapper231924 input] (clojure.core/let [rawinput231923 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231925 {"Distribution" (portkey.aws/search-for-tag rawinput231923 "Distribution" :flattened? nil :result-wrapper resultWrapper231924), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231925 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar231925 ["Distribution" :content]))) (letvar231925 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar231925 ["Location"]))) (letvar231925 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231925 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions ([input] (response-too-many-distributions nil input)) ([resultWrapper231927 input] (clojure.core/let [rawinput231926 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231928 {"Message" (portkey.aws/search-for-tag rawinput231926 "Message" :flattened? nil :result-wrapper resultWrapper231927)}] (clojure.core/cond-> {} (letvar231928 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231928 ["Message" :content])))))))

(clojure.core/defn- response-list-field-level-encryption-configs-result ([input] (response-list-field-level-encryption-configs-result nil input)) ([resultWrapper231930 input] (clojure.core/let [rawinput231929 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231931 {"FieldLevelEncryptionList" (portkey.aws/search-for-tag rawinput231929 "FieldLevelEncryptionList" :flattened? nil :result-wrapper resultWrapper231930)}] (clojure.core/cond-> {} (letvar231931 "FieldLevelEncryptionList") (clojure.core/assoc :field-level-encryption-list (deser-field-level-encryption-list (clojure.core/get-in letvar231931 ["FieldLevelEncryptionList" :content])))))))

(clojure.core/defn- response-no-such-distribution ([input] (response-no-such-distribution nil input)) ([resultWrapper231933 input] (clojure.core/let [rawinput231932 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231934 {"Message" (portkey.aws/search-for-tag rawinput231932 "Message" :flattened? nil :result-wrapper resultWrapper231933)}] (clojure.core/cond-> {} (letvar231934 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231934 ["Message" :content])))))))

(clojure.core/defn- response-query-arg-profile-empty ([input] (response-query-arg-profile-empty nil input)) ([resultWrapper231936 input] (clojure.core/let [rawinput231935 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231937 {"Message" (portkey.aws/search-for-tag rawinput231935 "Message" :flattened? nil :result-wrapper resultWrapper231936)}] (clojure.core/cond-> {} (letvar231937 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231937 ["Message" :content])))))))

(clojure.core/defn- response-update-streaming-distribution-result ([input] (response-update-streaming-distribution-result nil input)) ([resultWrapper231939 input] (clojure.core/let [rawinput231938 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231940 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput231938 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper231939), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231940 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar231940 ["StreamingDistribution" :content]))) (letvar231940 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231940 ["ETag"])))))))

(clojure.core/defn- response-illegal-update ([input] (response-illegal-update nil input)) ([resultWrapper231942 input] (clojure.core/let [rawinput231941 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231943 {"Message" (portkey.aws/search-for-tag rawinput231941 "Message" :flattened? nil :result-wrapper resultWrapper231942)}] (clojure.core/cond-> {} (letvar231943 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231943 ["Message" :content])))))))

(clojure.core/defn- response-get-field-level-encryption-profile-config-result ([input] (response-get-field-level-encryption-profile-config-result nil input)) ([resultWrapper231945 input] (clojure.core/let [rawinput231944 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231946 {"FieldLevelEncryptionProfileConfig" (portkey.aws/search-for-tag rawinput231944 "FieldLevelEncryptionProfileConfig" :flattened? nil :result-wrapper resultWrapper231945), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar231946 "FieldLevelEncryptionProfileConfig") (clojure.core/assoc :field-level-encryption-profile-config (deser-field-level-encryption-profile-config (clojure.core/get-in letvar231946 ["FieldLevelEncryptionProfileConfig" :content]))) (letvar231946 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar231946 ["ETag"])))))))

(clojure.core/defn- response-too-many-field-level-encryption-content-type-profiles ([input] (response-too-many-field-level-encryption-content-type-profiles nil input)) ([resultWrapper231948 input] (clojure.core/let [rawinput231947 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231949 {"Message" (portkey.aws/search-for-tag rawinput231947 "Message" :flattened? nil :result-wrapper resultWrapper231948)}] (clojure.core/cond-> {} (letvar231949 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231949 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-keepalive-timeout ([input] (response-invalid-origin-keepalive-timeout nil input)) ([resultWrapper231951 input] (clojure.core/let [rawinput231950 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231952 {"Message" (portkey.aws/search-for-tag rawinput231950 "Message" :flattened? nil :result-wrapper resultWrapper231951)}] (clojure.core/cond-> {} (letvar231952 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231952 ["Message" :content])))))))

(clojure.core/defn- response-inconsistent-quantities ([input] (response-inconsistent-quantities nil input)) ([resultWrapper231954 input] (clojure.core/let [rawinput231953 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231955 {"Message" (portkey.aws/search-for-tag rawinput231953 "Message" :flattened? nil :result-wrapper resultWrapper231954)}] (clojure.core/cond-> {} (letvar231955 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231955 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result ([input] (response-list-distributions-by-web-acl-id-result nil input)) ([resultWrapper231957 input] (clojure.core/let [rawinput231956 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231958 {"DistributionList" (portkey.aws/search-for-tag rawinput231956 "DistributionList" :flattened? nil :result-wrapper resultWrapper231957)}] (clojure.core/cond-> {} (letvar231958 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar231958 ["DistributionList" :content])))))))

(clojure.core/defn- response-too-many-query-string-parameters ([input] (response-too-many-query-string-parameters nil input)) ([resultWrapper231960 input] (clojure.core/let [rawinput231959 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231961 {"Message" (portkey.aws/search-for-tag rawinput231959 "Message" :flattened? nil :result-wrapper resultWrapper231960)}] (clojure.core/cond-> {} (letvar231961 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231961 ["Message" :content])))))))

(clojure.core/defn- response-invalid-tagging ([input] (response-invalid-tagging nil input)) ([resultWrapper231963 input] (clojure.core/let [rawinput231962 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231964 {"Message" (portkey.aws/search-for-tag rawinput231962 "Message" :flattened? nil :result-wrapper resultWrapper231963)}] (clojure.core/cond-> {} (letvar231964 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231964 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-result ([input] (response-list-distributions-result nil input)) ([resultWrapper231966 input] (clojure.core/let [rawinput231965 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231967 {"DistributionList" (portkey.aws/search-for-tag rawinput231965 "DistributionList" :flattened? nil :result-wrapper resultWrapper231966)}] (clojure.core/cond-> {} (letvar231967 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar231967 ["DistributionList" :content])))))))

(clojure.core/defn- response-trusted-signer-does-not-exist ([input] (response-trusted-signer-does-not-exist nil input)) ([resultWrapper231969 input] (clojure.core/let [rawinput231968 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231970 {"Message" (portkey.aws/search-for-tag rawinput231968 "Message" :flattened? nil :result-wrapper resultWrapper231969)}] (clojure.core/cond-> {} (letvar231970 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231970 ["Message" :content])))))))

(clojure.core/defn- response-too-many-field-level-encryption-field-patterns ([input] (response-too-many-field-level-encryption-field-patterns nil input)) ([resultWrapper231972 input] (clojure.core/let [rawinput231971 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231973 {"Message" (portkey.aws/search-for-tag rawinput231971 "Message" :flattened? nil :result-wrapper resultWrapper231972)}] (clojure.core/cond-> {} (letvar231973 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231973 ["Message" :content])))))))

(clojure.core/defn- response-get-invalidation-result ([input] (response-get-invalidation-result nil input)) ([resultWrapper231975 input] (clojure.core/let [rawinput231974 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231976 {"Invalidation" (portkey.aws/search-for-tag rawinput231974 "Invalidation" :flattened? nil :result-wrapper resultWrapper231975)}] (clojure.core/cond-> {} (letvar231976 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar231976 ["Invalidation" :content])))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values ([input] (response-too-many-headers-in-forwarded-values nil input)) ([resultWrapper231978 input] (clojure.core/let [rawinput231977 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar231979 {"Message" (portkey.aws/search-for-tag rawinput231977 "Message" :flattened? nil :result-wrapper resultWrapper231978)}] (clojure.core/cond-> {} (letvar231979 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar231979 ["Message" :content])))))))

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

(clojure.spec.alpha/def :portkey.aws.cloudfront/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.cloudfront/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.cloudfront/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__21078__auto__))))

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

(clojure.core/defn tag-resource-2018-11-05 ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/tagging?Operation=Tag", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2018-11-05 ([get-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistribution2018_11_05", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-distribution-result))

(clojure.core/defn get-public-key-2018-11-05 ([get-public-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-public-key-request get-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPublicKey2018_11_05", :http.request.configuration/output-deser-fn response-get-public-key-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key}})))))
(clojure.spec.alpha/fdef get-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-public-key-result))

(clojure.core/defn create-streaming-distribution-with-tags-2018-11-05 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution?WithTags", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistributionWithTags2018_11_05", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidOrigin" :portkey.aws.cloudfront/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2018-11-05 ([update-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDistribution2018_11_05", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront/invalid-web-acl-id, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront/invalid-required-protocol, "TooManyOriginGroupsPerDistribution" :portkey.aws.cloudfront/too-many-origin-groups-per-distribution, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront/invalid-origin-read-timeout, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-distribution-result))

(clojure.core/defn update-field-level-encryption-profile-2018-11-05 ([update-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-field-level-encryption-profile-request update-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn response-update-field-level-encryption-profile-result, :http.request.spec/error-spec {"FieldLevelEncryptionProfileAlreadyExists" :portkey.aws.cloudfront/field-level-encryption-profile-already-exists, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key, "AccessDenied" :portkey.aws.cloudfront/access-denied, "FieldLevelEncryptionProfileSizeExceeded" :portkey.aws.cloudfront/field-level-encryption-profile-size-exceeded, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile, "TooManyFieldLevelEncryptionEncryptionEntities" :portkey.aws.cloudfront/too-many-field-level-encryption-encryption-entities, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TooManyFieldLevelEncryptionFieldPatterns" :portkey.aws.cloudfront/too-many-field-level-encryption-field-patterns}})))))
(clojure.spec.alpha/fdef update-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-field-level-encryption-profile-result))

(clojure.core/defn delete-streaming-distribution-2018-11-05 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2018-11-05 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2018-11-05 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution?WithTags", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistributionWithTags2018_11_05", :http.request.configuration/output-deser-fn response-create-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront/invalid-origin, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront/invalid-required-protocol, "TooManyOriginGroupsPerDistribution" :portkey.aws.cloudfront/too-many-origin-groups-per-distribution, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-distribution-with-tags-result))

(clojure.core/defn delete-field-level-encryption-profile-2018-11-05 ([delete-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-field-level-encryption-profile-request delete-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "FieldLevelEncryptionProfileInUse" :portkey.aws.cloudfront/field-level-encryption-profile-in-use}})))))
(clojure.spec.alpha/fdef delete-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-field-level-encryption-profile-request) :ret clojure.core/true?)

(clojure.core/defn get-invalidation-2018-11-05 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvalidation2018_11_05", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-invalidation-result))

(clojure.core/defn list-field-level-encryption-profiles-2018-11-05 ([] (list-field-level-encryption-profiles-2018-11-05 {})) ([list-field-level-encryption-profiles-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-field-level-encryption-profiles-request list-field-level-encryption-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-field-level-encryption-profiles-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-field-level-encryption-profiles-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFieldLevelEncryptionProfiles2018_11_05", :http.request.configuration/output-deser-fn response-list-field-level-encryption-profiles-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-field-level-encryption-profiles-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-field-level-encryption-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-field-level-encryption-profiles-result))

(clojure.core/defn create-field-level-encryption-profile-2018-11-05 ([create-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-field-level-encryption-profile-request create-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn response-create-field-level-encryption-profile-result, :http.request.spec/error-spec {"InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key, "FieldLevelEncryptionProfileAlreadyExists" :portkey.aws.cloudfront/field-level-encryption-profile-already-exists, "FieldLevelEncryptionProfileSizeExceeded" :portkey.aws.cloudfront/field-level-encryption-profile-size-exceeded, "TooManyFieldLevelEncryptionProfiles" :portkey.aws.cloudfront/too-many-field-level-encryption-profiles, "TooManyFieldLevelEncryptionEncryptionEntities" :portkey.aws.cloudfront/too-many-field-level-encryption-encryption-entities, "TooManyFieldLevelEncryptionFieldPatterns" :portkey.aws.cloudfront/too-many-field-level-encryption-field-patterns}})))))
(clojure.spec.alpha/fdef create-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-field-level-encryption-profile-result))

(clojure.core/defn create-streaming-distribution-2018-11-05 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidOrigin" :portkey.aws.cloudfront/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-streaming-distribution-result))

(clojure.core/defn get-field-level-encryption-profile-2018-11-05 ([get-field-level-encryption-profile-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-field-level-encryption-profile-request get-field-level-encryption-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-field-level-encryption-profile-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-field-level-encryption-profile-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryptionProfile2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-profile-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-profile-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-field-level-encryption-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-field-level-encryption-profile-result))

(clojure.core/defn list-field-level-encryption-configs-2018-11-05 ([] (list-field-level-encryption-configs-2018-11-05 {})) ([list-field-level-encryption-configs-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-field-level-encryption-configs-request list-field-level-encryption-configs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-field-level-encryption-configs-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-field-level-encryption-configs-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFieldLevelEncryptionConfigs2018_11_05", :http.request.configuration/output-deser-fn response-list-field-level-encryption-configs-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-field-level-encryption-configs-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-field-level-encryption-configs-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-field-level-encryption-configs-result))

(clojure.core/defn list-tags-for-resource-2018-11-05 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/tagging", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource2018_11_05", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2018-11-05 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-streaming-distribution-result))

(clojure.core/defn get-field-level-encryption-2018-11-05 ([get-field-level-encryption-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-field-level-encryption-request get-field-level-encryption-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-field-level-encryption-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-field-level-encryption-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryption2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-field-level-encryption-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-field-level-encryption-result))

(clojure.core/defn create-distribution-2018-11-05 ([create-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistribution2018_11_05", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "IllegalFieldLevelEncryptionConfigAssociationWithCacheBehavior" :portkey.aws.cloudfront/illegal-field-level-encryption-config-association-with-cache-behavior, "TooManyCertificates" :portkey.aws.cloudfront/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront/invalid-origin, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config, "InvalidQueryStringParameters" :portkey.aws.cloudfront/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront/invalid-response-code, "TooManyDistributionsAssociatedToFieldLevelEncryptionConfig" :portkey.aws.cloudfront/too-many-distributions-associated-to-field-level-encryption-config, "InvalidForwardCookies" :portkey.aws.cloudfront/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront/invalid-required-protocol, "TooManyOriginGroupsPerDistribution" :portkey.aws.cloudfront/too-many-origin-groups-per-distribution, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-distribution-result))

(clojure.core/defn create-field-level-encryption-config-2018-11-05 ([create-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-field-level-encryption-config-request create-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn response-create-field-level-encryption-config-result, :http.request.spec/error-spec {"InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile, "FieldLevelEncryptionConfigAlreadyExists" :portkey.aws.cloudfront/field-level-encryption-config-already-exists, "TooManyFieldLevelEncryptionConfigs" :portkey.aws.cloudfront/too-many-field-level-encryption-configs, "TooManyFieldLevelEncryptionQueryArgProfiles" :portkey.aws.cloudfront/too-many-field-level-encryption-query-arg-profiles, "TooManyFieldLevelEncryptionContentTypeProfiles" :portkey.aws.cloudfront/too-many-field-level-encryption-content-type-profiles, "QueryArgProfileEmpty" :portkey.aws.cloudfront/query-arg-profile-empty}})))))
(clojure.spec.alpha/fdef create-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-field-level-encryption-config-result))

(clojure.core/defn get-streaming-distribution-config-2018-11-05 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistributionConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-streaming-distribution-config-result))

(clojure.core/defn update-field-level-encryption-config-2018-11-05 ([update-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-field-level-encryption-config-request update-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn response-update-field-level-encryption-config-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config, "TooManyFieldLevelEncryptionQueryArgProfiles" :portkey.aws.cloudfront/too-many-field-level-encryption-query-arg-profiles, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "QueryArgProfileEmpty" :portkey.aws.cloudfront/query-arg-profile-empty, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "TooManyFieldLevelEncryptionContentTypeProfiles" :portkey.aws.cloudfront/too-many-field-level-encryption-content-type-profiles, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-field-level-encryption-config-result))

(clojure.core/defn list-distributions-2018-11-05 ([] (list-distributions-2018-11-05 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributions2018_11_05", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-distributions-result))

(clojure.core/defn list-public-keys-2018-11-05 ([] (list-public-keys-2018-11-05 {})) ([list-public-keys-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-public-keys-request list-public-keys-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-public-keys-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-public-keys-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListPublicKeys2018_11_05", :http.request.configuration/output-deser-fn response-list-public-keys-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-public-keys-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-public-keys-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-public-keys-result))

(clojure.core/defn create-public-key-2018-11-05 ([create-public-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-public-key-request create-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePublicKey2018_11_05", :http.request.configuration/output-deser-fn response-create-public-key-result, :http.request.spec/error-spec {"PublicKeyAlreadyExists" :portkey.aws.cloudfront/public-key-already-exists, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "TooManyPublicKeys" :portkey.aws.cloudfront/too-many-public-keys}})))))
(clojure.spec.alpha/fdef create-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-public-key-result))

(clojure.core/defn get-field-level-encryption-profile-config-2018-11-05 ([get-field-level-encryption-profile-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-field-level-encryption-profile-config-request get-field-level-encryption-profile-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-field-level-encryption-profile-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption-profile/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-field-level-encryption-profile-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryptionProfileConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-profile-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchFieldLevelEncryptionProfile" :portkey.aws.cloudfront/no-such-field-level-encryption-profile}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-profile-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-field-level-encryption-profile-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-field-level-encryption-profile-config-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2018-11-05 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2018-11-05 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInvalidations2018_11_05", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-invalidations-result))

(clojure.core/defn delete-public-key-2018-11-05 ([delete-public-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-public-key-request delete-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeletePublicKey2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "PublicKeyInUse" :portkey.aws.cloudfront/public-key-in-use, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-public-key-request) :ret clojure.core/true?)

(clojure.core/defn untag-resource-2018-11-05 ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/tagging?Operation=Untag", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2018-11-05 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2018-11-05 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2018-11-05 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateStreamingDistribution2018_11_05", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront/cname-already-exists, "MissingBody" :portkey.aws.cloudfront/missing-body, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2018-11-05 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistributionConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-distribution-config-result))

(clojure.core/defn get-public-key-config-2018-11-05 ([get-public-key-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-public-key-config-request get-public-key-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-public-key-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-public-key-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPublicKeyConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-public-key-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key}})))))
(clojure.spec.alpha/fdef get-public-key-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-public-key-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-public-key-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2018-11-05 ([] (list-cloud-front-origin-access-identities-2018-11-05 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2018_11_05", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2018-11-05 ([] (list-streaming-distributions-2018-11-05 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/streaming-distribution", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamingDistributions2018_11_05", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2018-11-05 :args (clojure.spec.alpha/? :portkey.aws.cloudfront/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-streaming-distributions-result))

(clojure.core/defn update-public-key-2018-11-05 ([update-public-key-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-public-key-request update-public-key-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/update-public-key-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/public-key/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/update-public-key-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdatePublicKey2018_11_05", :http.request.configuration/output-deser-fn response-update-public-key-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "CannotChangeImmutablePublicKeyFields" :portkey.aws.cloudfront/cannot-change-immutable-public-key-fields, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront/illegal-update, "NoSuchPublicKey" :portkey.aws.cloudfront/no-such-public-key, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed}})))))
(clojure.spec.alpha/fdef update-public-key-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/update-public-key-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/update-public-key-result))

(clojure.core/defn get-field-level-encryption-config-2018-11-05 ([get-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-field-level-encryption-config-request get-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/get-field-level-encryption-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}/config", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/get-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn response-get-field-level-encryption-config-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config}})))))
(clojure.spec.alpha/fdef get-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/get-field-level-encryption-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/get-field-level-encryption-config-result))

(clojure.core/defn delete-distribution-2018-11-05 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDistribution2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2018-11-05 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInvalidation2018_11_05", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "MissingBody" :portkey.aws.cloudfront/missing-body, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-invalidation-result))

(clojure.core/defn delete-field-level-encryption-config-2018-11-05 ([delete-field-level-encryption-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-field-level-encryption-config-request delete-field-level-encryption-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/field-level-encryption/{Id}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/delete-field-level-encryption-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFieldLevelEncryptionConfig2018_11_05", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront/invalid-if-match-version, "NoSuchFieldLevelEncryptionConfig" :portkey.aws.cloudfront/no-such-field-level-encryption-config, "PreconditionFailed" :portkey.aws.cloudfront/precondition-failed, "FieldLevelEncryptionConfigInUse" :portkey.aws.cloudfront/field-level-encryption-config-in-use}})))))
(clojure.spec.alpha/fdef delete-field-level-encryption-config-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/delete-field-level-encryption-config-request) :ret clojure.core/true?)

(clojure.core/defn list-distributions-by-web-acl-id-2018-11-05 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributionsByWebACLId2018_11_05", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2018-11-05 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2018-11-05/origin-access-identity/cloudfront", :http.request.configuration/version "2018-11-05", :http.request.configuration/service-id "CloudFront", :http.request.spec/input-spec :portkey.aws.cloudfront/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2018_11_05", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2018-11-05 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront/create-cloud-front-origin-access-identity-result))
