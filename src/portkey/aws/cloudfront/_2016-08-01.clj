(ns portkey.aws.cloudfront.-2016-08-01 (:require [portkey.aws]))

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

(clojure.core/declare ser-logging-config)

(clojure.core/declare ser-streaming-distribution-config-with-tags)

(clojure.core/declare ser-custom-error-response-list)

(clojure.core/declare ser-certificate-source)

(clojure.core/declare ser-location-list)

(clojure.core/declare ser-restrictions)

(clojure.core/declare serstring)

(clojure.core/declare ser-forwarded-values)

(clojure.core/declare ser-invalidation-batch)

(clojure.core/declare ser-item-selection)

(clojure.core/declare ser-viewer-protocol-policy)

(clojure.core/declare ser-custom-error-response)

(clojure.core/declare serlong)

(clojure.core/declare ser-origin-list)

(clojure.core/declare ser-cached-methods)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-cache-behaviors)

(clojure.core/declare ser-cache-behavior)

(clojure.core/declare ser-origin)

(clojure.core/declare ser-custom-error-responses)

(clojure.core/declare ser-origin-ssl-protocols)

(clojure.core/declare ser-aliases)

(clojure.core/declare ser-allowed-methods)

(clojure.core/declare ser-price-class)

(clojure.core/declare ser-custom-origin-config)

(clojure.core/declare ser-s-3-origin)

(clojure.core/declare ser-cookie-name-list)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-distribution-config)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-ssl-protocols-list)

(clojure.core/declare ser-aws-account-number-list)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-method)

(clojure.core/declare ser-alias-list)

(clojure.core/declare ser-origin-custom-headers-list)

(clojure.core/declare ser-origin-protocol-policy)

(clojure.core/declare ser-path-list)

(clojure.core/declare ser-geo-restriction-type)

(clojure.core/declare ser-paths)

(clojure.core/declare serinteger)

(clojure.core/declare ser-cache-behavior-list)

(clojure.core/declare ser-origin-custom-header)

(clojure.core/declare ser-streaming-distribution-config)

(clojure.core/declare ser-s-3-origin-config)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-streaming-logging-config)

(clojure.core/declare ser-ssl-protocol)

(clojure.core/declare ser-headers)

(clojure.core/declare ser-minimum-protocol-version)

(clojure.core/declare ser-origins)

(clojure.core/declare ser-distribution-config-with-tags)

(clojure.core/declare ser-header-list)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-ssl-support-method)

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

(clojure.core/defn- ser-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serboolean (:include-cookies input)) #:http.request.field{:name "IncludeCookies", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "LoggingConfig", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-streaming-distribution-config (:streaming-distribution-config input)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "StreamingDistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-custom-error-response-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-custom-error-response coll) #:http.request.field{:shape "CustomErrorResponse", :location-name "CustomErrorResponse"}))) input), :shape "CustomErrorResponseList", :type "list"})

(clojure.core/defn- ser-certificate-source [input] #:http.request.field{:value (clojure.core/get {"cloudfront" "cloudfront", :cloudfront "cloudfront", "iam" "iam", :iam "iam", "acm" "acm", :acm "acm"} input), :shape "CertificateSource"})

(clojure.core/defn- ser-location-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Location"}))) input), :shape "LocationList", :type "list"})

(clojure.core/defn- ser-restrictions [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction (:geo-restriction input)) #:http.request.field{:name "GeoRestriction", :shape "GeoRestriction"})], :shape "Restrictions", :type "structure"}))

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-forwarded-values [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:query-string input)) #:http.request.field{:name "QueryString", :shape "boolean"}) (clojure.core/into (ser-cookie-preference (:cookies input)) #:http.request.field{:name "Cookies", :shape "CookiePreference"})], :shape "ForwardedValues", :type "structure"} (clojure.core/contains? input :headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-headers (input :headers)) #:http.request.field{:name "Headers", :shape "Headers"})) (clojure.core/contains? input :query-string-cache-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys (input :query-string-cache-keys)) #:http.request.field{:name "QueryStringCacheKeys", :shape "QueryStringCacheKeys"}))))

(clojure.core/defn- ser-invalidation-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-paths (:paths input)) #:http.request.field{:name "Paths", :shape "Paths"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "InvalidationBatch", :type "structure"}))

(clojure.core/defn- ser-item-selection [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "whitelist" "whitelist", :whitelist "whitelist", "all" "all", :all "all"} input), :shape "ItemSelection"})

(clojure.core/defn- ser-viewer-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"allow-all" "allow-all", :allowall "allow-all", "https-only" "https-only", :httpsonly "https-only", "redirect-to-https" "redirect-to-https", :redirecttohttps "redirect-to-https"} input), :shape "ViewerProtocolPolicy"})

(clojure.core/defn- ser-custom-error-response [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:error-code input)) #:http.request.field{:name "ErrorCode", :shape "integer"})], :shape "CustomErrorResponse", :type "structure"} (clojure.core/contains? input :response-page-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-page-path)) #:http.request.field{:name "ResponsePagePath", :shape "string"})) (clojure.core/contains? input :response-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-code)) #:http.request.field{:name "ResponseCode", :shape "string"})) (clojure.core/contains? input :error-caching-min-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :error-caching-min-ttl)) #:http.request.field{:name "ErrorCachingMinTTL", :shape "long"}))))

(clojure.core/defn- serlong [input] #:http.request.field{:value input, :shape "long"})

(clojure.core/defn- ser-origin-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin coll) #:http.request.field{:shape "Origin", :location-name "Origin"}))) input), :shape "OriginList", :type "list", :min 1})

(clojure.core/defn- ser-cached-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "CachedMethods", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tags", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :items)) #:http.request.field{:name "Items", :shape "TagList"}))))

(clojure.core/defn- ser-cache-behaviors [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CacheBehaviors", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behavior-list (input :items)) #:http.request.field{:name "Items", :shape "CacheBehaviorList"}))))

(clojure.core/defn- ser-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:path-pattern input)) #:http.request.field{:name "PathPattern", :shape "string"}) (clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "CacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :field-level-encryption-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :field-level-encryption-id)) #:http.request.field{:name "FieldLevelEncryptionId", :shape "string"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:id input)) #:http.request.field{:name "Id", :shape "string"}) (clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"})], :shape "Origin", :type "structure"} (clojure.core/contains? input :origin-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :origin-path)) #:http.request.field{:name "OriginPath", :shape "string"})) (clojure.core/contains? input :custom-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-headers (input :custom-headers)) #:http.request.field{:name "CustomHeaders", :shape "CustomHeaders"})) (clojure.core/contains? input :s-3-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-origin-config (input :s-3-origin-config)) #:http.request.field{:name "S3OriginConfig", :shape "S3OriginConfig"})) (clojure.core/contains? input :custom-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-origin-config (input :custom-origin-config)) #:http.request.field{:name "CustomOriginConfig", :shape "CustomOriginConfig"}))))

(clojure.core/defn- ser-custom-error-responses [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomErrorResponses", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-response-list (input :items)) #:http.request.field{:name "Items", :shape "CustomErrorResponseList"}))))

(clojure.core/defn- ser-origin-ssl-protocols [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-ssl-protocols-list (:items input)) #:http.request.field{:name "Items", :shape "SslProtocolsList"})], :shape "OriginSslProtocols", :type "structure"}))

(clojure.core/defn- ser-aliases [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Aliases", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-list (input :items)) #:http.request.field{:name "Items", :shape "AliasList"}))))

(clojure.core/defn- ser-allowed-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "AllowedMethods", :type "structure"} (clojure.core/contains? input :cached-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cached-methods (input :cached-methods)) #:http.request.field{:name "CachedMethods", :shape "CachedMethods"}))))

(clojure.core/defn- ser-price-class [input] #:http.request.field{:value (clojure.core/get {"PriceClass_100" "PriceClass_100", :price-class-100 "PriceClass_100", "PriceClass_200" "PriceClass_200", :price-class-200 "PriceClass_200", "PriceClass_All" "PriceClass_All", :price-class-all "PriceClass_All"} input), :shape "PriceClass"})

(clojure.core/defn- ser-custom-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:http-port input)) #:http.request.field{:name "HTTPPort", :shape "integer"}) (clojure.core/into (serinteger (:https-port input)) #:http.request.field{:name "HTTPSPort", :shape "integer"}) (clojure.core/into (ser-origin-protocol-policy (:origin-protocol-policy input)) #:http.request.field{:name "OriginProtocolPolicy", :shape "OriginProtocolPolicy"})], :shape "CustomOriginConfig", :type "structure"} (clojure.core/contains? input :origin-ssl-protocols) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-ssl-protocols (input :origin-ssl-protocols)) #:http.request.field{:name "OriginSslProtocols", :shape "OriginSslProtocols"}))))

(clojure.core/defn- ser-s-3-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"}) (clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3Origin", :type "structure"}))

(clojure.core/defn- ser-cookie-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "CookieNameList", :type "list"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag", :location-name "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-origins (:origins input)) #:http.request.field{:name "Origins", :shape "Origins"}) (clojure.core/into (ser-default-cache-behavior (:default-cache-behavior input)) #:http.request.field{:name "DefaultCacheBehavior", :shape "DefaultCacheBehavior"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "DistributionConfig", :type "structure"} (clojure.core/contains? input :default-root-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :default-root-object)) #:http.request.field{:name "DefaultRootObject", :shape "string"})) (clojure.core/contains? input :restrictions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restrictions (input :restrictions)) #:http.request.field{:name "Restrictions", :shape "Restrictions"})) (clojure.core/contains? input :web-acl-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "LoggingConfig"})) (clojure.core/contains? input :cache-behaviors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behaviors (input :cache-behaviors)) #:http.request.field{:name "CacheBehaviors", :shape "CacheBehaviors"})) (clojure.core/contains? input :custom-error-responses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-responses (input :custom-error-responses)) #:http.request.field{:name "CustomErrorResponses", :shape "CustomErrorResponses"})) (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"})) (clojure.core/contains? input :viewer-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-viewer-certificate (input :viewer-certificate)) #:http.request.field{:name "ViewerCertificate", :shape "ViewerCertificate"}))))

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey", :location-name "Key"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-ssl-protocols-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ssl-protocol coll) #:http.request.field{:shape "SslProtocol", :location-name "SslProtocol"}))) input), :shape "SslProtocolsList", :type "list"})

(clojure.core/defn- ser-aws-account-number-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "AwsAccountNumber"}))) input), :shape "AwsAccountNumberList", :type "list"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-method [input] #:http.request.field{:value (clojure.core/get {"DELETE" "DELETE", :get "GET", "OPTIONS" "OPTIONS", :patch "PATCH", "PATCH" "PATCH", :delete "DELETE", :head "HEAD", "HEAD" "HEAD", "POST" "POST", :post "POST", :options "OPTIONS", :put "PUT", "GET" "GET", "PUT" "PUT"} input), :shape "Method"})

(clojure.core/defn- ser-alias-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "CNAME"}))) input), :shape "AliasList", :type "list"})

(clojure.core/defn- ser-origin-custom-headers-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin-custom-header coll) #:http.request.field{:shape "OriginCustomHeader", :location-name "OriginCustomHeader"}))) input), :shape "OriginCustomHeadersList", :type "list"})

(clojure.core/defn- ser-origin-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"http-only" "http-only", :httponly "http-only", "match-viewer" "match-viewer", :matchviewer "match-viewer", "https-only" "https-only", :httpsonly "https-only"} input), :shape "OriginProtocolPolicy"})

(clojure.core/defn- ser-path-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Path"}))) input), :shape "PathList", :type "list"})

(clojure.core/defn- ser-geo-restriction-type [input] #:http.request.field{:value (clojure.core/get {"blacklist" "blacklist", :blacklist "blacklist", "whitelist" "whitelist", :whitelist "whitelist", "none" "none", :none "none"} input), :shape "GeoRestrictionType"})

(clojure.core/defn- ser-paths [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Paths", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-path-list (input :items)) #:http.request.field{:name "Items", :shape "PathList"}))))

(clojure.core/defn- serinteger [input] #:http.request.field{:value input, :shape "integer"})

(clojure.core/defn- ser-cache-behavior-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-cache-behavior coll) #:http.request.field{:shape "CacheBehavior", :location-name "CacheBehavior"}))) input), :shape "CacheBehaviorList", :type "list"})

(clojure.core/defn- ser-origin-custom-header [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:header-name input)) #:http.request.field{:name "HeaderName", :shape "string"}) (clojure.core/into (serstring (:header-value input)) #:http.request.field{:name "HeaderValue", :shape "string"})], :shape "OriginCustomHeader", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-s-3-origin (:s-3-origin input)) #:http.request.field{:name "S3Origin", :shape "S3Origin"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "StreamingDistributionConfig", :type "structure"} (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-streaming-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "StreamingLoggingConfig"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"}))))

(clojure.core/defn- ser-s-3-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3OriginConfig", :type "structure"}))

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"})], :shape "Tag", :type "structure"} (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value (input :value)) #:http.request.field{:name "Value", :shape "TagValue"}))))

(clojure.core/defn- ser-streaming-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "StreamingLoggingConfig", :type "structure"}))

(clojure.core/defn- ser-ssl-protocol [input] #:http.request.field{:value (clojure.core/get {"SSLv3" "SSLv3", :ss-lv-3 "SSLv3", "TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1.1" "TLSv1.1", :tl-sv-11 "TLSv1.1", "TLSv1.2" "TLSv1.2", :tl-sv-12 "TLSv1.2"} input), :shape "SslProtocol"})

(clojure.core/defn- ser-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Headers", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-header-list (input :items)) #:http.request.field{:name "Items", :shape "HeaderList"}))))

(clojure.core/defn- ser-minimum-protocol-version [input] #:http.request.field{:value (clojure.core/get {"SSLv3" "SSLv3", :ss-lv-3 "SSLv3", "TLSv1" "TLSv1", :tl-sv-1 "TLSv1"} input), :shape "MinimumProtocolVersion"})

(clojure.core/defn- ser-origins [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Origins", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-list (input :items)) #:http.request.field{:name "Items", :shape "OriginList"}))))

(clojure.core/defn- ser-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-distribution-config (:distribution-config input)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "DistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-header-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "HeaderList", :type "list"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-ssl-support-method [input] #:http.request.field{:value (clojure.core/get {"sni-only" "sni-only", :snionly "sni-only", "vip" "vip", :vip "vip"} input), :shape "SSLSupportMethod"})

(clojure.core/defn- ser-cookie-preference [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-item-selection (:forward input)) #:http.request.field{:name "Forward", :shape "ItemSelection"})], :shape "CookiePreference", :type "structure"} (clojure.core/contains? input :whitelisted-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-names (input :whitelisted-names)) #:http.request.field{:name "WhitelistedNames", :shape "CookieNames"}))))

(clojure.core/defn- ser-custom-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomHeaders", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-custom-headers-list (input :items)) #:http.request.field{:name "Items", :shape "OriginCustomHeadersList"}))))

(clojure.core/defn- ser-methods-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-method coll) #:http.request.field{:shape "Method", :location-name "Method"}))) input), :shape "MethodsList", :type "list"})

(clojure.core/defn- ser-default-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "DefaultCacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-trusted-signers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "TrustedSigners", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-number-list (input :items)) #:http.request.field{:name "Items", :shape "AwsAccountNumberList"}))))

(clojure.core/defn- ser-viewer-certificate [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ViewerCertificate", :type "structure"} (clojure.core/contains? input :cloud-front-default-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :cloud-front-default-certificate)) #:http.request.field{:name "CloudFrontDefaultCertificate", :shape "boolean"})) (clojure.core/contains? input :iam-certificate-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :iam-certificate-id)) #:http.request.field{:name "IAMCertificateId", :shape "string"})) (clojure.core/contains? input :acm-certificate-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :acm-certificate-arn)) #:http.request.field{:name "ACMCertificateArn", :shape "string"})) (clojure.core/contains? input :ssl-support-method) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ssl-support-method (input :ssl-support-method)) #:http.request.field{:name "SSLSupportMethod", :shape "SSLSupportMethod"})) (clojure.core/contains? input :minimum-protocol-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-minimum-protocol-version (input :minimum-protocol-version)) #:http.request.field{:name "MinimumProtocolVersion", :shape "MinimumProtocolVersion"})) (clojure.core/contains? input :certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :certificate)) #:http.request.field{:name "Certificate", :shape "string", :deprecated true})) (clojure.core/contains? input :certificate-source) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-source (input :certificate-source)) #:http.request.field{:name "CertificateSource", :shape "CertificateSource", :deprecated true}))))

(clojure.core/defn- ser-cloud-front-origin-access-identity-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"})], :shape "CloudFrontOriginAccessIdentityConfig", :type "structure"}))

(clojure.core/defn- ser-geo-restriction [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction-type (:restriction-type input)) #:http.request.field{:name "RestrictionType", :shape "GeoRestrictionType"}) (clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "GeoRestriction", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-location-list (input :items)) #:http.request.field{:name "Items", :shape "LocationList"}))))

(clojure.core/defn- req-list-distributions-by-web-acl-id-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string", :location "uri", :location-name "WebACLId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-streaming-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-delete-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})]}))

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})]}))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})]}))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})]}))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})]}))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-01/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-list-cloud-front-origin-access-identities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/declare deserboolean)

(clojure.core/declare deser-cookie-names)

(clojure.core/declare deser-logging-config)

(clojure.core/declare deser-invalidation-summary)

(clojure.core/declare deser-custom-error-response-list)

(clojure.core/declare deser-invalidation)

(clojure.core/declare deser-certificate-source)

(clojure.core/declare deser-location-list)

(clojure.core/declare deser-key-pair-id-list)

(clojure.core/declare deser-restrictions)

(clojure.core/declare deserstring)

(clojure.core/declare deser-distribution)

(clojure.core/declare deser-cloud-front-origin-access-identity-list)

(clojure.core/declare deser-forwarded-values)

(clojure.core/declare deser-invalidation-batch)

(clojure.core/declare deser-invalidation-summary-list)

(clojure.core/declare deser-streaming-distribution-list)

(clojure.core/declare deser-item-selection)

(clojure.core/declare deser-streaming-distribution)

(clojure.core/declare deser-viewer-protocol-policy)

(clojure.core/declare deser-custom-error-response)

(clojure.core/declare deser-distribution-summary-list)

(clojure.core/declare deser-signer)

(clojure.core/declare deserlong)

(clojure.core/declare deser-origin-list)

(clojure.core/declare deser-cached-methods)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-streaming-distribution-summary-list)

(clojure.core/declare deser-cache-behaviors)

(clojure.core/declare deser-cache-behavior)

(clojure.core/declare deser-active-trusted-signers)

(clojure.core/declare deser-origin)

(clojure.core/declare desertimestamp)

(clojure.core/declare deser-custom-error-responses)

(clojure.core/declare deser-invalidation-list)

(clojure.core/declare deser-origin-ssl-protocols)

(clojure.core/declare deser-aliases)

(clojure.core/declare deser-allowed-methods)

(clojure.core/declare deser-price-class)

(clojure.core/declare deser-custom-origin-config)

(clojure.core/declare deser-s-3-origin)

(clojure.core/declare deser-streaming-distribution-summary)

(clojure.core/declare deser-cloud-front-origin-access-identity)

(clojure.core/declare deser-cookie-name-list)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-key-pair-ids)

(clojure.core/declare deser-distribution-config)

(clojure.core/declare deser-ssl-protocols-list)

(clojure.core/declare deser-aws-account-number-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-method)

(clojure.core/declare deser-alias-list)

(clojure.core/declare deser-origin-custom-headers-list)

(clojure.core/declare deser-origin-protocol-policy)

(clojure.core/declare deser-signer-list)

(clojure.core/declare deser-path-list)

(clojure.core/declare deser-geo-restriction-type)

(clojure.core/declare deser-paths)

(clojure.core/declare deserinteger)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary)

(clojure.core/declare deser-cache-behavior-list)

(clojure.core/declare deser-origin-custom-header)

(clojure.core/declare deser-streaming-distribution-config)

(clojure.core/declare deser-s-3-origin-config)

(clojure.core/declare deser-cloud-front-origin-access-identity-summary-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-streaming-logging-config)

(clojure.core/declare deser-distribution-summary)

(clojure.core/declare deser-ssl-protocol)

(clojure.core/declare deser-headers)

(clojure.core/declare deser-minimum-protocol-version)

(clojure.core/declare deser-origins)

(clojure.core/declare deser-header-list)

(clojure.core/declare deser-distribution-list)

(clojure.core/declare deser-ssl-support-method)

(clojure.core/declare deser-cookie-preference)

(clojure.core/declare deser-custom-headers)

(clojure.core/declare deser-methods-list)

(clojure.core/declare deser-default-cache-behavior)

(clojure.core/declare deser-trusted-signers)

(clojure.core/declare deser-viewer-certificate)

(clojure.core/declare deser-cloud-front-origin-access-identity-config)

(clojure.core/declare deser-geo-restriction)

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__21570__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__21570__auto__) true (clojure.core/= "false" boolstr__21570__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar170390 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar170390 ["Quantity" :content]))} (letvar170390 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar170390 ["Items" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar170567 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar170567 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar170567 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar170567 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar170567 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar170750 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar170750 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar170750 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar170750 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar170965 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar170965 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar170965 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar170965 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar170965 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar171233 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar171233 ["GeoRestriction" :content]))})))

(clojure.core/defn- deserstring [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar171448 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar171448 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar171448 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar171448 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar171448 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar171448 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar171448 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar171448 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar171448 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar171627 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar171627 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar171627 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar171627 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar171627 ["Quantity" :content]))} (letvar171627 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar171627 ["NextMarker" :content]))) (letvar171627 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar171627 ["Items" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar171811 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? false :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? false :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar171811 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar171811 ["Cookies" :content]))} (letvar171811 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar171811 ["Headers" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar171999 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar171999 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar171999 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar172201 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar172201 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar172201 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar172201 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar172201 ["Quantity" :content]))} (letvar172201 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar172201 ["NextMarker" :content]))) (letvar172201 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar172201 ["Items" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar172302 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar172302 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar172302 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar172302 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar172302 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar172302 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar172302 ["StreamingDistributionConfig" :content]))} (letvar172302 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar172302 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar172403 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? false :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? false :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? false :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar172403 ["ErrorCode" :content]))} (letvar172403 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar172403 ["ResponsePagePath" :content]))) (letvar172403 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar172403 ["ResponseCode" :content]))) (letvar172403 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar172403 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar172516 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? false :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar172516 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar172516 ["AwsAccountNumber" :content]))) (letvar172516 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar172516 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar172631 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar172631 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar172631 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar172732 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar172732 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar172732 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar172845 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar172845 ["Quantity" :content]))} (letvar172845 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar172845 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar172941 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar172941 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar172941 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar172941 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar172941 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar172941 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar172941 ["MinTTL" :content]))} (letvar172941 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar172941 ["SmoothStreaming" :content]))) (letvar172941 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar172941 ["Compress" :content]))) (letvar172941 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar172941 ["MaxTTL" :content]))) (letvar172941 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar172941 ["AllowedMethods" :content]))) (letvar172941 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar172941 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar173037 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar173037 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar173037 ["Quantity" :content]))} (letvar173037 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar173037 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar173133 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? false :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? false :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? false :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar173133 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar173133 ["DomainName" :content]))} (letvar173133 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar173133 ["OriginPath" :content]))) (letvar173133 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar173133 ["CustomHeaders" :content]))) (letvar173133 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar173133 ["S3OriginConfig" :content]))) (letvar173133 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar173133 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar173231 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar173231 ["Quantity" :content]))} (letvar173231 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar173231 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar173327 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar173327 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar173327 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar173327 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar173327 ["Quantity" :content]))} (letvar173327 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar173327 ["NextMarker" :content]))) (letvar173327 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar173327 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar173423 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar173423 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar173423 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar173519 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar173519 ["Quantity" :content]))} (letvar173519 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar173519 ["Items" :content]))))))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar173615 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar173615 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar173615 ["Items" :content]))} (letvar173615 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar173615 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar173716 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? false :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? false :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? false :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar173716 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar173716 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar173716 ["OriginProtocolPolicy" :content]))} (letvar173716 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar173716 ["OriginSslProtocols" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar173812 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar173812 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar173812 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar173908 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar173908 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar173908 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar173908 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar173908 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar173908 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar173908 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar173908 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar173908 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar173908 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar173908 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar173908 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar174004 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar174004 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar174004 ["S3CanonicalUserId" :content]))} (letvar174004 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar174004 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar174209 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar174363 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-value [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-method [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser coll))) input))

(clojure.core/defn- deser-origin-protocol-policy [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser coll))) input))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar174788 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar174987 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar175201 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar175379 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar175531 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar175756 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar175756 "Key") (clojure.core/assoc :key (deser-tag-key (clojure.core/get-in letvar175756 ["Key" :content]))) (letvar175756 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar175756 ["Value" :content]))))))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar175947 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar176125 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar176304 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar176487 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar176695 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar176860 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar176965 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser coll))) input))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar177182 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar177182 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar177182 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar177182 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar177182 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar177182 ["MinTTL" :content]))} (letvar177182 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar177182 ["SmoothStreaming" :content]))) (letvar177182 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar177182 ["Compress" :content]))) (letvar177182 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar177182 ["MaxTTL" :content]))) (letvar177182 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar177182 ["AllowedMethods" :content]))) (letvar177182 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar177182 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar177355 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar177528 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar177709 {}] (clojure.core/cond-> {})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar177862 {}] (clojure.core/cond-> {})))

(clojure.core/defn- response-list-tags-for-resource-result ([input] (response-list-tags-for-resource-result nil input)) ([resultWrapper177866 input] (clojure.core/let [rawinput177865 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177868 {"Tags" (portkey.aws/search-for-tag rawinput177865 "Tags" :flattened? false :result-wrapper resultWrapper177866)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar177868 ["Tags" :content]))}))))

(clojure.core/defn- response-no-such-origin ([input] (response-no-such-origin nil input)) ([resultWrapper177870 input] (clojure.core/let [rawinput177869 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177871 {"Message" (portkey.aws/search-for-tag rawinput177869 "Message" :flattened? false :result-wrapper resultWrapper177870)}] (clojure.core/cond-> {} (letvar177871 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177871 ["Message" :content])))))))

(clojure.core/defn- response-invalid-protocol-settings ([input] (response-invalid-protocol-settings nil input)) ([resultWrapper177873 input] (clojure.core/let [rawinput177872 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177875 {"Message" (portkey.aws/search-for-tag rawinput177872 "Message" :flattened? false :result-wrapper resultWrapper177873)}] (clojure.core/cond-> {} (letvar177875 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177875 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list ([input] (response-too-many-cookie-names-in-white-list nil input)) ([resultWrapper177878 input] (clojure.core/let [rawinput177877 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177879 {"Message" (portkey.aws/search-for-tag rawinput177877 "Message" :flattened? false :result-wrapper resultWrapper177878)}] (clojure.core/cond-> {} (letvar177879 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177879 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cache-behaviors ([input] (response-too-many-cache-behaviors nil input)) ([resultWrapper177881 input] (clojure.core/let [rawinput177880 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177882 {"Message" (portkey.aws/search-for-tag rawinput177880 "Message" :flattened? false :result-wrapper resultWrapper177881)}] (clojure.core/cond-> {} (letvar177882 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177882 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origin-custom-headers ([input] (response-too-many-origin-custom-headers nil input)) ([resultWrapper177884 input] (clojure.core/let [rawinput177883 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177885 {"Message" (portkey.aws/search-for-tag rawinput177883 "Message" :flattened? false :result-wrapper resultWrapper177884)}] (clojure.core/cond-> {} (letvar177885 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177885 ["Message" :content])))))))

(clojure.core/defn- response-too-many-streaming-distributions ([input] (response-too-many-streaming-distributions nil input)) ([resultWrapper177887 input] (clojure.core/let [rawinput177886 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177888 {"Message" (portkey.aws/search-for-tag rawinput177886 "Message" :flattened? false :result-wrapper resultWrapper177887)}] (clojure.core/cond-> {} (letvar177888 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177888 ["Message" :content])))))))

(clojure.core/defn- response-get-streaming-distribution-result ([input] (response-get-streaming-distribution-result nil input)) ([resultWrapper177890 input] (clojure.core/let [rawinput177889 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177891 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput177889 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper177890), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar177891 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar177891 ["StreamingDistribution" :content]))) (letvar177891 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar177891 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es ([input] (response-too-many-streaming-distribution-cnam-es nil input)) ([resultWrapper177894 input] (clojure.core/let [rawinput177893 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177895 {"Message" (portkey.aws/search-for-tag rawinput177893 "Message" :flattened? false :result-wrapper resultWrapper177894)}] (clojure.core/cond-> {} (letvar177895 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177895 ["Message" :content])))))))

(clojure.core/defn- response-invalid-viewer-certificate ([input] (response-invalid-viewer-certificate nil input)) ([resultWrapper177897 input] (clojure.core/let [rawinput177896 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177898 {"Message" (portkey.aws/search-for-tag rawinput177896 "Message" :flattened? false :result-wrapper resultWrapper177897)}] (clojure.core/cond-> {} (letvar177898 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177898 ["Message" :content])))))))

(clojure.core/defn- response-invalid-argument ([input] (response-invalid-argument nil input)) ([resultWrapper177902 input] (clojure.core/let [rawinput177901 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177903 {"Message" (portkey.aws/search-for-tag rawinput177901 "Message" :flattened? false :result-wrapper resultWrapper177902)}] (clojure.core/cond-> {} (letvar177903 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177903 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-not-disabled ([input] (response-streaming-distribution-not-disabled nil input)) ([resultWrapper177905 input] (clojure.core/let [rawinput177904 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177906 {"Message" (portkey.aws/search-for-tag rawinput177904 "Message" :flattened? false :result-wrapper resultWrapper177905)}] (clojure.core/cond-> {} (letvar177906 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177906 ["Message" :content])))))))

(clojure.core/defn- response-too-many-certificates ([input] (response-too-many-certificates nil input)) ([resultWrapper177909 input] (clojure.core/let [rawinput177908 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177910 {"Message" (portkey.aws/search-for-tag rawinput177908 "Message" :flattened? false :result-wrapper resultWrapper177909)}] (clojure.core/cond-> {} (letvar177910 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177910 ["Message" :content])))))))

(clojure.core/defn- response-access-denied ([input] (response-access-denied nil input)) ([resultWrapper177913 input] (clojure.core/let [rawinput177912 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177914 {"Message" (portkey.aws/search-for-tag rawinput177912 "Message" :flattened? false :result-wrapper resultWrapper177913)}] (clojure.core/cond-> {} (letvar177914 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177914 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use ([input] (response-cloud-front-origin-access-identity-in-use nil input)) ([resultWrapper177916 input] (clojure.core/let [rawinput177915 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177917 {"Message" (portkey.aws/search-for-tag rawinput177915 "Message" :flattened? false :result-wrapper resultWrapper177916)}] (clojure.core/cond-> {} (letvar177917 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177917 ["Message" :content])))))))

(clojure.core/defn- response-no-such-resource ([input] (response-no-such-resource nil input)) ([resultWrapper177919 input] (clojure.core/let [rawinput177918 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177920 {"Message" (portkey.aws/search-for-tag rawinput177918 "Message" :flattened? false :result-wrapper resultWrapper177919)}] (clojure.core/cond-> {} (letvar177920 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177920 ["Message" :content])))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result ([input] (response-update-cloud-front-origin-access-identity-result nil input)) ([resultWrapper177922 input] (clojure.core/let [rawinput177921 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177923 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput177921 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper177922), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar177923 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar177923 ["CloudFrontOriginAccessIdentity" :content]))) (letvar177923 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar177923 ["ETag"])))))))

(clojure.core/defn- response-invalid-error-code ([input] (response-invalid-error-code nil input)) ([resultWrapper177925 input] (clojure.core/let [rawinput177924 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177926 {"Message" (portkey.aws/search-for-tag rawinput177924 "Message" :flattened? false :result-wrapper resultWrapper177925)}] (clojure.core/cond-> {} (letvar177926 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177926 ["Message" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-result ([input] (response-create-streaming-distribution-result nil input)) ([resultWrapper177928 input] (clojure.core/let [rawinput177927 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177929 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput177927 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper177928), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar177929 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar177929 ["StreamingDistribution" :content]))) (letvar177929 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar177929 ["Location"]))) (letvar177929 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar177929 ["ETag"])))))))

(clojure.core/defn- response-invalid-relative-path ([input] (response-invalid-relative-path nil input)) ([resultWrapper177931 input] (clojure.core/let [rawinput177930 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177932 {"Message" (portkey.aws/search-for-tag rawinput177930 "Message" :flattened? false :result-wrapper resultWrapper177931)}] (clojure.core/cond-> {} (letvar177932 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177932 ["Message" :content])))))))

(clojure.core/defn- response-invalid-location-code ([input] (response-invalid-location-code nil input)) ([resultWrapper177935 input] (clojure.core/let [rawinput177934 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177936 {"Message" (portkey.aws/search-for-tag rawinput177934 "Message" :flattened? false :result-wrapper resultWrapper177935)}] (clojure.core/cond-> {} (letvar177936 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177936 ["Message" :content])))))))

(clojure.core/defn- response-invalid-web-acl-id ([input] (response-invalid-web-acl-id nil input)) ([resultWrapper177938 input] (clojure.core/let [rawinput177937 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177939 {"Message" (portkey.aws/search-for-tag rawinput177937 "Message" :flattened? false :result-wrapper resultWrapper177938)}] (clojure.core/cond-> {} (letvar177939 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177939 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin ([input] (response-invalid-origin nil input)) ([resultWrapper177943 input] (clojure.core/let [rawinput177942 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177944 {"Message" (portkey.aws/search-for-tag rawinput177942 "Message" :flattened? false :result-wrapper resultWrapper177943)}] (clojure.core/cond-> {} (letvar177944 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177944 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities ([input] (response-too-many-cloud-front-origin-access-identities nil input)) ([resultWrapper177946 input] (clojure.core/let [rawinput177945 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177947 {"Message" (portkey.aws/search-for-tag rawinput177945 "Message" :flattened? false :result-wrapper resultWrapper177946)}] (clojure.core/cond-> {} (letvar177947 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177947 ["Message" :content])))))))

(clojure.core/defn- response-update-distribution-result ([input] (response-update-distribution-result nil input)) ([resultWrapper177949 input] (clojure.core/let [rawinput177948 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177951 {"Distribution" (portkey.aws/search-for-tag rawinput177948 "Distribution" :flattened? false :result-wrapper resultWrapper177949), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar177951 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar177951 ["Distribution" :content]))) (letvar177951 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar177951 ["ETag"])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result ([input] (response-get-cloud-front-origin-access-identity-result nil input)) ([resultWrapper177954 input] (clojure.core/let [rawinput177953 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177955 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput177953 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper177954), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar177955 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar177955 ["CloudFrontOriginAccessIdentity" :content]))) (letvar177955 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar177955 ["ETag"])))))))

(clojure.core/defn- response-too-many-origins ([input] (response-too-many-origins nil input)) ([resultWrapper177957 input] (clojure.core/let [rawinput177956 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177958 {"Message" (portkey.aws/search-for-tag rawinput177956 "Message" :flattened? false :result-wrapper resultWrapper177957)}] (clojure.core/cond-> {} (letvar177958 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177958 ["Message" :content])))))))

(clojure.core/defn- response-invalid-ttl-order ([input] (response-invalid-ttl-order nil input)) ([resultWrapper177960 input] (clojure.core/let [rawinput177959 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177961 {"Message" (portkey.aws/search-for-tag rawinput177959 "Message" :flattened? false :result-wrapper resultWrapper177960)}] (clojure.core/cond-> {} (letvar177961 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177961 ["Message" :content])))))))

(clojure.core/defn- response-no-such-streaming-distribution ([input] (response-no-such-streaming-distribution nil input)) ([resultWrapper177963 input] (clojure.core/let [rawinput177962 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177964 {"Message" (portkey.aws/search-for-tag rawinput177962 "Message" :flattened? false :result-wrapper resultWrapper177963)}] (clojure.core/cond-> {} (letvar177964 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177964 ["Message" :content])))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result ([input] (response-create-cloud-front-origin-access-identity-result nil input)) ([resultWrapper177967 input] (clojure.core/let [rawinput177966 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177968 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput177966 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper177967), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar177968 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar177968 ["CloudFrontOriginAccessIdentity" :content]))) (letvar177968 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar177968 ["Location"]))) (letvar177968 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar177968 ["ETag"])))))))

(clojure.core/defn- response-cname-already-exists ([input] (response-cname-already-exists nil input)) ([resultWrapper177973 input] (clojure.core/let [rawinput177972 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177974 {"Message" (portkey.aws/search-for-tag rawinput177972 "Message" :flattened? false :result-wrapper resultWrapper177973)}] (clojure.core/cond-> {} (letvar177974 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177974 ["Message" :content])))))))

(clojure.core/defn- response-invalid-default-root-object ([input] (response-invalid-default-root-object nil input)) ([resultWrapper177977 input] (clojure.core/let [rawinput177976 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177981 {"Message" (portkey.aws/search-for-tag rawinput177976 "Message" :flattened? false :result-wrapper resultWrapper177977)}] (clojure.core/cond-> {} (letvar177981 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177981 ["Message" :content])))))))

(clojure.core/defn- response-invalid-response-code ([input] (response-invalid-response-code nil input)) ([resultWrapper177983 input] (clojure.core/let [rawinput177982 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177984 {"Message" (portkey.aws/search-for-tag rawinput177982 "Message" :flattened? false :result-wrapper resultWrapper177983)}] (clojure.core/cond-> {} (letvar177984 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177984 ["Message" :content])))))))

(clojure.core/defn- response-no-such-invalidation ([input] (response-no-such-invalidation nil input)) ([resultWrapper177986 input] (clojure.core/let [rawinput177985 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177987 {"Message" (portkey.aws/search-for-tag rawinput177985 "Message" :flattened? false :result-wrapper resultWrapper177986)}] (clojure.core/cond-> {} (letvar177987 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177987 ["Message" :content])))))))

(clojure.core/defn- response-too-many-invalidations-in-progress ([input] (response-too-many-invalidations-in-progress nil input)) ([resultWrapper177990 input] (clojure.core/let [rawinput177989 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177991 {"Message" (portkey.aws/search-for-tag rawinput177989 "Message" :flattened? false :result-wrapper resultWrapper177990)}] (clojure.core/cond-> {} (letvar177991 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177991 ["Message" :content])))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result ([input] (response-list-cloud-front-origin-access-identities-result nil input)) ([resultWrapper177993 input] (clojure.core/let [rawinput177992 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177994 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput177992 "CloudFrontOriginAccessIdentityList" :flattened? false :result-wrapper resultWrapper177993)}] (clojure.core/cond-> {} (letvar177994 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar177994 ["CloudFrontOriginAccessIdentityList" :content])))))))

(clojure.core/defn- response-invalid-forward-cookies ([input] (response-invalid-forward-cookies nil input)) ([resultWrapper177998 input] (clojure.core/let [rawinput177997 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar177999 {"Message" (portkey.aws/search-for-tag rawinput177997 "Message" :flattened? false :result-wrapper resultWrapper177998)}] (clojure.core/cond-> {} (letvar177999 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar177999 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-config-result ([input] (response-get-distribution-config-result nil input)) ([resultWrapper178001 input] (clojure.core/let [rawinput178000 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178002 {"DistributionConfig" (portkey.aws/search-for-tag rawinput178000 "DistributionConfig" :flattened? false :result-wrapper resultWrapper178001), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar178002 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar178002 ["DistributionConfig" :content]))) (letvar178002 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar178002 ["ETag"])))))))

(clojure.core/defn- response-invalid-required-protocol ([input] (response-invalid-required-protocol nil input)) ([resultWrapper178004 input] (clojure.core/let [rawinput178003 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178005 {"Message" (portkey.aws/search-for-tag rawinput178003 "Message" :flattened? false :result-wrapper resultWrapper178004)}] (clojure.core/cond-> {} (letvar178005 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178005 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-result ([input] (response-get-distribution-result nil input)) ([resultWrapper178007 input] (clojure.core/let [rawinput178006 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178008 {"Distribution" (portkey.aws/search-for-tag rawinput178006 "Distribution" :flattened? false :result-wrapper resultWrapper178007), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar178008 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar178008 ["Distribution" :content]))) (letvar178008 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar178008 ["ETag"])))))))

(clojure.core/defn- response-get-streaming-distribution-config-result ([input] (response-get-streaming-distribution-config-result nil input)) ([resultWrapper178010 input] (clojure.core/let [rawinput178009 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178015 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput178009 "StreamingDistributionConfig" :flattened? false :result-wrapper resultWrapper178010), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar178015 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar178015 ["StreamingDistributionConfig" :content]))) (letvar178015 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar178015 ["ETag"])))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin ([input] (response-invalid-headers-for-s-3-origin nil input)) ([resultWrapper178017 input] (clojure.core/let [rawinput178016 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178018 {"Message" (portkey.aws/search-for-tag rawinput178016 "Message" :flattened? false :result-wrapper resultWrapper178017)}] (clojure.core/cond-> {} (letvar178018 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178018 ["Message" :content])))))))

(clojure.core/defn- response-too-many-distribution-cnam-es ([input] (response-too-many-distribution-cnam-es nil input)) ([resultWrapper178022 input] (clojure.core/let [rawinput178021 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178023 {"Message" (portkey.aws/search-for-tag rawinput178021 "Message" :flattened? false :result-wrapper resultWrapper178022)}] (clojure.core/cond-> {} (letvar178023 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178023 ["Message" :content])))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter ([input] (response-invalid-geo-restriction-parameter nil input)) ([resultWrapper178025 input] (clojure.core/let [rawinput178024 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178026 {"Message" (portkey.aws/search-for-tag rawinput178024 "Message" :flattened? false :result-wrapper resultWrapper178025)}] (clojure.core/cond-> {} (letvar178026 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178026 ["Message" :content])))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity ([input] (response-no-such-cloud-front-origin-access-identity nil input)) ([resultWrapper178028 input] (clojure.core/let [rawinput178027 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178029 {"Message" (portkey.aws/search-for-tag rawinput178027 "Message" :flattened? false :result-wrapper resultWrapper178028)}] (clojure.core/cond-> {} (letvar178029 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178029 ["Message" :content])))))))

(clojure.core/defn- response-list-invalidations-result ([input] (response-list-invalidations-result nil input)) ([resultWrapper178032 input] (clojure.core/let [rawinput178031 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178033 {"InvalidationList" (portkey.aws/search-for-tag rawinput178031 "InvalidationList" :flattened? false :result-wrapper resultWrapper178032)}] (clojure.core/cond-> {} (letvar178033 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar178033 ["InvalidationList" :content])))))))

(clojure.core/defn- response-batch-too-large ([input] (response-batch-too-large nil input)) ([resultWrapper178038 input] (clojure.core/let [rawinput178037 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178039 {"Message" (portkey.aws/search-for-tag rawinput178037 "Message" :flattened? false :result-wrapper resultWrapper178038)}] (clojure.core/cond-> {} (letvar178039 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178039 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-with-tags-result ([input] (response-create-distribution-with-tags-result nil input)) ([resultWrapper178044 input] (clojure.core/let [rawinput178043 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178045 {"Distribution" (portkey.aws/search-for-tag rawinput178043 "Distribution" :flattened? false :result-wrapper resultWrapper178044), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar178045 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar178045 ["Distribution" :content]))) (letvar178045 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar178045 ["Location"]))) (letvar178045 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar178045 ["ETag"])))))))

(clojure.core/defn- response-list-streaming-distributions-result ([input] (response-list-streaming-distributions-result nil input)) ([resultWrapper178048 input] (clojure.core/let [rawinput178047 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178049 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput178047 "StreamingDistributionList" :flattened? false :result-wrapper resultWrapper178048)}] (clojure.core/cond-> {} (letvar178049 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar178049 ["StreamingDistributionList" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result ([input] (response-create-streaming-distribution-with-tags-result nil input)) ([resultWrapper178053 input] (clojure.core/let [rawinput178052 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178055 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput178052 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper178053), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar178055 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar178055 ["StreamingDistribution" :content]))) (letvar178055 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar178055 ["Location"]))) (letvar178055 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar178055 ["ETag"])))))))

(clojure.core/defn- response-create-invalidation-result ([input] (response-create-invalidation-result nil input)) ([resultWrapper178059 input] (clojure.core/let [rawinput178058 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178060 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput178058 "Invalidation" :flattened? false :result-wrapper resultWrapper178059)}] (clojure.core/cond-> {} (letvar178060 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar178060 ["Location"]))) (letvar178060 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar178060 ["Invalidation" :content])))))))

(clojure.core/defn- response-missing-body ([input] (response-missing-body nil input)) ([resultWrapper178062 input] (clojure.core/let [rawinput178061 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178063 {"Message" (portkey.aws/search-for-tag rawinput178061 "Message" :flattened? false :result-wrapper resultWrapper178062)}] (clojure.core/cond-> {} (letvar178063 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178063 ["Message" :content])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result ([input] (response-get-cloud-front-origin-access-identity-config-result nil input)) ([resultWrapper178067 input] (clojure.core/let [rawinput178066 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178068 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput178066 "CloudFrontOriginAccessIdentityConfig" :flattened? false :result-wrapper resultWrapper178067), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar178068 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar178068 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar178068 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar178068 ["ETag"])))))))

(clojure.core/defn- response-distribution-not-disabled ([input] (response-distribution-not-disabled nil input)) ([resultWrapper178070 input] (clojure.core/let [rawinput178069 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178071 {"Message" (portkey.aws/search-for-tag rawinput178069 "Message" :flattened? false :result-wrapper resultWrapper178070)}] (clojure.core/cond-> {} (letvar178071 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178071 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists ([input] (response-cloud-front-origin-access-identity-already-exists nil input)) ([resultWrapper178073 input] (clojure.core/let [rawinput178072 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178074 {"Message" (portkey.aws/search-for-tag rawinput178072 "Message" :flattened? false :result-wrapper resultWrapper178073)}] (clojure.core/cond-> {} (letvar178074 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178074 ["Message" :content])))))))

(clojure.core/defn- response-precondition-failed ([input] (response-precondition-failed nil input)) ([resultWrapper178078 input] (clojure.core/let [rawinput178077 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178082 {"Message" (portkey.aws/search-for-tag rawinput178077 "Message" :flattened? false :result-wrapper resultWrapper178078)}] (clojure.core/cond-> {} (letvar178082 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178082 ["Message" :content])))))))

(clojure.core/defn- response-distribution-already-exists ([input] (response-distribution-already-exists nil input)) ([resultWrapper178085 input] (clojure.core/let [rawinput178084 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178086 {"Message" (portkey.aws/search-for-tag rawinput178084 "Message" :flattened? false :result-wrapper resultWrapper178085)}] (clojure.core/cond-> {} (letvar178086 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178086 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-access-identity ([input] (response-invalid-origin-access-identity nil input)) ([resultWrapper178088 input] (clojure.core/let [rawinput178087 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178089 {"Message" (portkey.aws/search-for-tag rawinput178087 "Message" :flattened? false :result-wrapper resultWrapper178088)}] (clojure.core/cond-> {} (letvar178089 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178089 ["Message" :content])))))))

(clojure.core/defn- response-too-many-trusted-signers ([input] (response-too-many-trusted-signers nil input)) ([resultWrapper178091 input] (clojure.core/let [rawinput178090 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178092 {"Message" (portkey.aws/search-for-tag rawinput178090 "Message" :flattened? false :result-wrapper resultWrapper178091)}] (clojure.core/cond-> {} (letvar178092 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178092 ["Message" :content])))))))

(clojure.core/defn- response-invalid-minimum-protocol-version ([input] (response-invalid-minimum-protocol-version nil input)) ([resultWrapper178095 input] (clojure.core/let [rawinput178094 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178097 {"Message" (portkey.aws/search-for-tag rawinput178094 "Message" :flattened? false :result-wrapper resultWrapper178095)}] (clojure.core/cond-> {} (letvar178097 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178097 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-already-exists ([input] (response-streaming-distribution-already-exists nil input)) ([resultWrapper178099 input] (clojure.core/let [rawinput178098 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178100 {"Message" (portkey.aws/search-for-tag rawinput178098 "Message" :flattened? false :result-wrapper resultWrapper178099)}] (clojure.core/cond-> {} (letvar178100 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178100 ["Message" :content])))))))

(clojure.core/defn- response-invalid-if-match-version ([input] (response-invalid-if-match-version nil input)) ([resultWrapper178102 input] (clojure.core/let [rawinput178101 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178103 {"Message" (portkey.aws/search-for-tag rawinput178101 "Message" :flattened? false :result-wrapper resultWrapper178102)}] (clojure.core/cond-> {} (letvar178103 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178103 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-result ([input] (response-create-distribution-result nil input)) ([resultWrapper178105 input] (clojure.core/let [rawinput178104 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178106 {"Distribution" (portkey.aws/search-for-tag rawinput178104 "Distribution" :flattened? false :result-wrapper resultWrapper178105), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar178106 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar178106 ["Distribution" :content]))) (letvar178106 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar178106 ["Location"]))) (letvar178106 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar178106 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions ([input] (response-too-many-distributions nil input)) ([resultWrapper178113 input] (clojure.core/let [rawinput178112 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178115 {"Message" (portkey.aws/search-for-tag rawinput178112 "Message" :flattened? false :result-wrapper resultWrapper178113)}] (clojure.core/cond-> {} (letvar178115 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178115 ["Message" :content])))))))

(clojure.core/defn- response-no-such-distribution ([input] (response-no-such-distribution nil input)) ([resultWrapper178117 input] (clojure.core/let [rawinput178116 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178118 {"Message" (portkey.aws/search-for-tag rawinput178116 "Message" :flattened? false :result-wrapper resultWrapper178117)}] (clojure.core/cond-> {} (letvar178118 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178118 ["Message" :content])))))))

(clojure.core/defn- response-update-streaming-distribution-result ([input] (response-update-streaming-distribution-result nil input)) ([resultWrapper178120 input] (clojure.core/let [rawinput178119 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178121 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput178119 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper178120), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar178121 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar178121 ["StreamingDistribution" :content]))) (letvar178121 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar178121 ["ETag"])))))))

(clojure.core/defn- response-illegal-update ([input] (response-illegal-update nil input)) ([resultWrapper178127 input] (clojure.core/let [rawinput178126 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178129 {"Message" (portkey.aws/search-for-tag rawinput178126 "Message" :flattened? false :result-wrapper resultWrapper178127)}] (clojure.core/cond-> {} (letvar178129 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178129 ["Message" :content])))))))

(clojure.core/defn- response-inconsistent-quantities ([input] (response-inconsistent-quantities nil input)) ([resultWrapper178133 input] (clojure.core/let [rawinput178132 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178134 {"Message" (portkey.aws/search-for-tag rawinput178132 "Message" :flattened? false :result-wrapper resultWrapper178133)}] (clojure.core/cond-> {} (letvar178134 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178134 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result ([input] (response-list-distributions-by-web-acl-id-result nil input)) ([resultWrapper178136 input] (clojure.core/let [rawinput178135 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178137 {"DistributionList" (portkey.aws/search-for-tag rawinput178135 "DistributionList" :flattened? false :result-wrapper resultWrapper178136)}] (clojure.core/cond-> {} (letvar178137 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar178137 ["DistributionList" :content])))))))

(clojure.core/defn- response-invalid-tagging ([input] (response-invalid-tagging nil input)) ([resultWrapper178142 input] (clojure.core/let [rawinput178141 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178143 {"Message" (portkey.aws/search-for-tag rawinput178141 "Message" :flattened? false :result-wrapper resultWrapper178142)}] (clojure.core/cond-> {} (letvar178143 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178143 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-result ([input] (response-list-distributions-result nil input)) ([resultWrapper178146 input] (clojure.core/let [rawinput178145 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178148 {"DistributionList" (portkey.aws/search-for-tag rawinput178145 "DistributionList" :flattened? false :result-wrapper resultWrapper178146)}] (clojure.core/cond-> {} (letvar178148 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar178148 ["DistributionList" :content])))))))

(clojure.core/defn- response-trusted-signer-does-not-exist ([input] (response-trusted-signer-does-not-exist nil input)) ([resultWrapper178153 input] (clojure.core/let [rawinput178152 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178154 {"Message" (portkey.aws/search-for-tag rawinput178152 "Message" :flattened? false :result-wrapper resultWrapper178153)}] (clojure.core/cond-> {} (letvar178154 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178154 ["Message" :content])))))))

(clojure.core/defn- response-get-invalidation-result ([input] (response-get-invalidation-result nil input)) ([resultWrapper178157 input] (clojure.core/let [rawinput178156 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178158 {"Invalidation" (portkey.aws/search-for-tag rawinput178156 "Invalidation" :flattened? false :result-wrapper resultWrapper178157)}] (clojure.core/cond-> {} (letvar178158 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar178158 ["Invalidation" :content])))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values ([input] (response-too-many-headers-in-forwarded-values nil input)) ([resultWrapper178160 input] (clojure.core/let [rawinput178159 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar178161 {"Message" (portkey.aws/search-for-tag rawinput178159 "Message" :flattened? false :result-wrapper resultWrapper178160)}] (clojure.core/cond-> {} (letvar178161 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar178161 ["Message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2016-08-01.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2016-08-01.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.logging-config/enabled :portkey.aws.cloudfront.-2016-08-01.logging-config/include-cookies :portkey.aws.cloudfront.-2016-08-01.logging-config/bucket :portkey.aws.cloudfront.-2016-08-01.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/streaming-distribution-config :portkey.aws.cloudfront.-2016-08-01/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.invalidation-summary/id :portkey.aws.cloudfront.-2016-08-01.invalidation-summary/create-time :portkey.aws.cloudfront.-2016-08-01.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.invalidation/id :portkey.aws.cloudfront.-2016-08-01.invalidation/status :portkey.aws.cloudfront.-2016-08-01.invalidation/create-time :portkey.aws.cloudfront.-2016-08-01/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/streaming-distribution :portkey.aws.cloudfront.-2016-08-01.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-01.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.distribution/id :portkey.aws.cloudfront.-2016-08-01.distribution/arn :portkey.aws.cloudfront.-2016-08-01.distribution/status :portkey.aws.cloudfront.-2016-08-01.distribution/last-modified-time :portkey.aws.cloudfront.-2016-08-01.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2016-08-01.distribution/domain-name :portkey.aws.cloudfront.-2016-08-01/active-trusted-signers :portkey.aws.cloudfront.-2016-08-01/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.forwarded-values/query-string :portkey.aws.cloudfront.-2016-08-01.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2016-08-01/headers]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/paths :portkey.aws.cloudfront.-2016-08-01.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-01.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/marker :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.streaming-distribution/id :portkey.aws.cloudfront.-2016-08-01.streaming-distribution/arn :portkey.aws.cloudfront.-2016-08-01.streaming-distribution/status :portkey.aws.cloudfront.-2016-08-01.streaming-distribution/domain-name :portkey.aws.cloudfront.-2016-08-01/active-trusted-signers :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2016-08-01.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2016-08-01.custom-error-response/response-page-path :portkey.aws.cloudfront.-2016-08-01.custom-error-response/response-code :portkey.aws.cloudfront.-2016-08-01.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.signer/aws-account-number :portkey.aws.cloudfront.-2016-08-01/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-08-01.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.cached-methods/quantity :portkey.aws.cloudfront.-2016-08-01.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21055__auto__] (clojure.core/<= 1 (clojure.core/count s__21055__auto__))) (clojure.core/fn [s__21056__auto__] (clojure.core/< (clojure.core/count s__21056__auto__) 128)) (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21057__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/streaming-distribution :portkey.aws.cloudfront.-2016-08-01.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2016-08-01.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.cache-behavior/path-pattern :portkey.aws.cloudfront.-2016-08-01.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-08-01/forwarded-values :portkey.aws.cloudfront.-2016-08-01/trusted-signers :portkey.aws.cloudfront.-2016-08-01/viewer-protocol-policy :portkey.aws.cloudfront.-2016-08-01.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-08-01.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-08-01.cache-behavior/compress :portkey.aws.cloudfront.-2016-08-01.cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-08-01/allowed-methods :portkey.aws.cloudfront.-2016-08-01.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2016-08-01.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.active-trusted-signers/enabled :portkey.aws.cloudfront.-2016-08-01.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.origin/id :portkey.aws.cloudfront.-2016-08-01.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2016-08-01.origin/origin-path :portkey.aws.cloudfront.-2016-08-01/custom-headers :portkey.aws.cloudfront.-2016-08-01/s-3-origin-config :portkey.aws.cloudfront.-2016-08-01/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.invalidation-list/marker :portkey.aws.cloudfront.-2016-08-01.invalidation-list/max-items :portkey.aws.cloudfront.-2016-08-01.invalidation-list/is-truncated :portkey.aws.cloudfront.-2016-08-01.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalidation-list/next-marker :portkey.aws.cloudfront.-2016-08-01.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2016-08-01.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/distribution :portkey.aws.cloudfront.-2016-08-01.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-08-01.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.allowed-methods/quantity :portkey.aws.cloudfront.-2016-08-01.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2016-08-01/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.custom-origin-config/http-port :portkey.aws.cloudfront.-2016-08-01.custom-origin-config/https-port :portkey.aws.cloudfront.-2016-08-01/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2016-08-01/origin-ssl-protocols]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.list-distributions-request/marker :portkey.aws.cloudfront.-2016-08-01.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.s-3-origin/domain-name :portkey.aws.cloudfront.-2016-08-01.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-08-01.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2016-08-01.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/id :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/arn :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/status :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2016-08-01/s-3-origin :portkey.aws.cloudfront.-2016-08-01/aliases :portkey.aws.cloudfront.-2016-08-01/trusted-signers :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2016-08-01/price-class :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-08-01.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-01.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-08-01/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.tag-resource-request/resource :portkey.aws.cloudfront.-2016-08-01/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.distribution-config/caller-reference :portkey.aws.cloudfront.-2016-08-01/origins :portkey.aws.cloudfront.-2016-08-01/default-cache-behavior :portkey.aws.cloudfront.-2016-08-01.distribution-config/comment :portkey.aws.cloudfront.-2016-08-01.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-08-01.distribution-config/default-root-object :portkey.aws.cloudfront.-2016-08-01/restrictions :portkey.aws.cloudfront.-2016-08-01.distribution-config/web-acl-id :portkey.aws.cloudfront.-2016-08-01.distribution-config/logging :portkey.aws.cloudfront.-2016-08-01/cache-behaviors :portkey.aws.cloudfront.-2016-08-01/custom-error-responses :portkey.aws.cloudfront.-2016-08-01/aliases :portkey.aws.cloudfront.-2016-08-01/price-class :portkey.aws.cloudfront.-2016-08-01/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/distribution-config :portkey.aws.cloudfront.-2016-08-01.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21055__auto__] (clojure.core/<= 0 (clojure.core/count s__21055__auto__))) (clojure.core/fn [s__21056__auto__] (clojure.core/< (clojure.core/count s__21056__auto__) 256)) (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21057__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/distribution :portkey.aws.cloudfront.-2016-08-01.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/streaming-distribution-config :portkey.aws.cloudfront.-2016-08-01.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/distribution :portkey.aws.cloudfront.-2016-08-01.create-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-08-01.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/streaming-distribution-config :portkey.aws.cloudfront.-2016-08-01.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-01.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/streaming-distribution :portkey.aws.cloudfront.-2016-08-01.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-08-01.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.create-invalidation-result/location :portkey.aws.cloudfront.-2016-08-01/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-08-01.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.origin-custom-header/header-name :portkey.aws.cloudfront.-2016-08-01.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2016-08-01/s-3-origin :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-config/comment :portkey.aws.cloudfront.-2016-08-01/trusted-signers :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-08-01/aliases :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-config/logging :portkey.aws.cloudfront.-2016-08-01/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.tag/key] :opt-un [:portkey.aws.cloudfront.-2016-08-01.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.streaming-logging-config/enabled :portkey.aws.cloudfront.-2016-08-01.streaming-logging-config/bucket :portkey.aws.cloudfront.-2016-08-01.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.distribution-summary/id :portkey.aws.cloudfront.-2016-08-01.distribution-summary/arn :portkey.aws.cloudfront.-2016-08-01.distribution-summary/status :portkey.aws.cloudfront.-2016-08-01.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-08-01.distribution-summary/domain-name :portkey.aws.cloudfront.-2016-08-01/aliases :portkey.aws.cloudfront.-2016-08-01/origins :portkey.aws.cloudfront.-2016-08-01/default-cache-behavior :portkey.aws.cloudfront.-2016-08-01/cache-behaviors :portkey.aws.cloudfront.-2016-08-01/custom-error-responses :portkey.aws.cloudfront.-2016-08-01.distribution-summary/comment :portkey.aws.cloudfront.-2016-08-01/price-class :portkey.aws.cloudfront.-2016-08-01.distribution-summary/enabled :portkey.aws.cloudfront.-2016-08-01/viewer-certificate :portkey.aws.cloudfront.-2016-08-01/restrictions :portkey.aws.cloudfront.-2016-08-01.distribution-summary/web-acl-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/minimum-protocol-version #{"TLSv1" :tl-sv-1 :ss-lv-3 "SSLv3"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.origins/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.origins/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/distribution-config :portkey.aws.cloudfront.-2016-08-01/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/distribution :portkey.aws.cloudfront.-2016-08-01.create-distribution-result/location :portkey.aws.cloudfront.-2016-08-01.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-01.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-08-01.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__21057__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.distribution-list/marker :portkey.aws.cloudfront.-2016-08-01.distribution-list/max-items :portkey.aws.cloudfront.-2016-08-01.distribution-list/is-truncated :portkey.aws.cloudfront.-2016-08-01.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.distribution-list/next-marker :portkey.aws.cloudfront.-2016-08-01.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/streaming-distribution :portkey.aws.cloudfront.-2016-08-01.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2016-08-01.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2016-08-01.list-invalidations-request/marker :portkey.aws.cloudfront.-2016-08-01.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-01/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.untag-resource-request/resource :portkey.aws.cloudfront.-2016-08-01/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-08-01/forwarded-values :portkey.aws.cloudfront.-2016-08-01/trusted-signers :portkey.aws.cloudfront.-2016-08-01/viewer-protocol-policy :portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/compress :portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-08-01/allowed-methods :portkey.aws.cloudfront.-2016-08-01.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.trusted-signers/enabled :portkey.aws.cloudfront.-2016-08-01.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01/distribution-config :portkey.aws.cloudfront.-2016-08-01.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-01.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2016-08-01.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2016-08-01.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2016-08-01/ssl-support-method :portkey.aws.cloudfront.-2016-08-01/minimum-protocol-version :portkey.aws.cloudfront.-2016-08-01.viewer-certificate/certificate :portkey.aws.cloudfront.-2016-08-01/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-01.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2016-08-01.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2016-08-01.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-01.geo-restriction/restriction-type :portkey.aws.cloudfront.-2016-08-01.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-01.geo-restriction/items]))

(clojure.core/defn tag-resource-2016-08-01 ([tag-resource-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/tagging?Operation=Tag", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource2016_08_01", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-01/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-08-01/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2016-08-01 ([get-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution/{Id}", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistribution2016_08_01", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/get-distribution-result))

(clojure.core/defn create-streaming-distribution-with-tags-2016-08-01 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/streaming-distribution?WithTags", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistributionWithTags2016_08_01", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-08-01/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-01/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-08-01/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-08-01/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-01/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-01/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-01/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-with-tags-result))
