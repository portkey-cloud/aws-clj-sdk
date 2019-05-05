(ns portkey.aws.cloudfront.-2016-09-29 (:require [portkey.aws]))

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

(clojure.core/declare ser-query-string-cache-keys-list)

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

(clojure.core/declare ser-query-string-cache-keys)

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

(clojure.core/defn- ser-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serboolean (:include-cookies input)) #:http.request.field{:name "IncludeCookies", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "LoggingConfig", :type "structure"}))

(clojure.core/defn- ser-streaming-distribution-config-with-tags [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-streaming-distribution-config (:streaming-distribution-config input)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig"}) (clojure.core/into (ser-tags (:tags input)) #:http.request.field{:name "Tags", :shape "Tags"})], :shape "StreamingDistributionConfigWithTags", :type "structure"}))

(clojure.core/defn- ser-custom-error-response-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-custom-error-response coll) #:http.request.field{:shape "CustomErrorResponse", :location-name "CustomErrorResponse"}))) input), :shape "CustomErrorResponseList", :type "list"})

(clojure.core/defn- ser-certificate-source [input] #:http.request.field{:value (clojure.core/get {"cloudfront" "cloudfront", :cloudfront "cloudfront", "iam" "iam", :iam "iam", "acm" "acm", :acm "acm"} input), :shape "CertificateSource"})

(clojure.core/defn- ser-location-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Location"}))) input), :shape "LocationList", :type "list"})

(clojure.core/defn- ser-restrictions [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-geo-restriction (:geo-restriction input)) #:http.request.field{:name "GeoRestriction", :shape "GeoRestriction"})], :shape "Restrictions", :type "structure"}))

(clojure.core/defn- serstring [input] #:http.request.field{:value input, :shape "string"})

(clojure.core/defn- ser-forwarded-values [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:query-string input)) #:http.request.field{:name "QueryString", :shape "boolean"}) (clojure.core/into (ser-cookie-preference (:cookies input)) #:http.request.field{:name "Cookies", :shape "CookiePreference"})], :shape "ForwardedValues", :type "structure"} (clojure.core/contains? input :headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-headers (input :headers)) #:http.request.field{:name "Headers", :shape "Headers"})) (clojure.core/contains? input :query-string-cache-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys (input :query-string-cache-keys)) #:http.request.field{:name "QueryStringCacheKeys", :shape "QueryStringCacheKeys"}))))

(clojure.core/defn- ser-invalidation-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-paths (:paths input)) #:http.request.field{:name "Paths", :shape "Paths"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "InvalidationBatch", :type "structure"}))

(clojure.core/defn- ser-query-string-cache-keys-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "QueryStringCacheKeysList", :type "list"})

(clojure.core/defn- ser-item-selection [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "whitelist" "whitelist", :whitelist "whitelist", "all" "all", :all "all"} input), :shape "ItemSelection"})

(clojure.core/defn- ser-viewer-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"allow-all" "allow-all", :allowall "allow-all", "https-only" "https-only", :httpsonly "https-only", "redirect-to-https" "redirect-to-https", :redirecttohttps "redirect-to-https"} input), :shape "ViewerProtocolPolicy"})

(clojure.core/defn- ser-custom-error-response [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:error-code input)) #:http.request.field{:name "ErrorCode", :shape "integer"})], :shape "CustomErrorResponse", :type "structure"} (clojure.core/contains? input :response-page-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-page-path)) #:http.request.field{:name "ResponsePagePath", :shape "string"})) (clojure.core/contains? input :response-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-code)) #:http.request.field{:name "ResponseCode", :shape "string"})) (clojure.core/contains? input :error-caching-min-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :error-caching-min-ttl)) #:http.request.field{:name "ErrorCachingMinTTL", :shape "long"}))))

(clojure.core/defn- serlong [input] #:http.request.field{:value input, :shape "long"})

(clojure.core/defn- ser-origin-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin coll) #:http.request.field{:shape "Origin", :location-name "Origin"}))) input), :shape "OriginList", :type "list", :min 1})

(clojure.core/defn- ser-cached-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "CachedMethods", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tags", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :items)) #:http.request.field{:name "Items", :shape "TagList"}))))

(clojure.core/defn- ser-cache-behaviors [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CacheBehaviors", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behavior-list (input :items)) #:http.request.field{:name "Items", :shape "CacheBehaviorList"}))))

(clojure.core/defn- ser-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:path-pattern input)) #:http.request.field{:name "PathPattern", :shape "string"}) (clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "CacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

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

(clojure.core/defn- ser-query-string-cache-keys [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "QueryStringCacheKeys", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys-list (input :items)) #:http.request.field{:name "Items", :shape "QueryStringCacheKeysList"}))))

(clojure.core/defn- ser-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-origins (:origins input)) #:http.request.field{:name "Origins", :shape "Origins"}) (clojure.core/into (ser-default-cache-behavior (:default-cache-behavior input)) #:http.request.field{:name "DefaultCacheBehavior", :shape "DefaultCacheBehavior"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "DistributionConfig", :type "structure"} (clojure.core/contains? input :default-root-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :default-root-object)) #:http.request.field{:name "DefaultRootObject", :shape "string"})) (clojure.core/contains? input :is-ipv-6-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :is-ipv-6-enabled)) #:http.request.field{:name "IsIPV6Enabled", :shape "boolean"})) (clojure.core/contains? input :restrictions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restrictions (input :restrictions)) #:http.request.field{:name "Restrictions", :shape "Restrictions"})) (clojure.core/contains? input :web-acl-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "LoggingConfig"})) (clojure.core/contains? input :cache-behaviors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behaviors (input :cache-behaviors)) #:http.request.field{:name "CacheBehaviors", :shape "CacheBehaviors"})) (clojure.core/contains? input :custom-error-responses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-responses (input :custom-error-responses)) #:http.request.field{:name "CustomErrorResponses", :shape "CustomErrorResponses"})) (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"})) (clojure.core/contains? input :http-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-version (input :http-version)) #:http.request.field{:name "HttpVersion", :shape "HttpVersion"})) (clojure.core/contains? input :viewer-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-viewer-certificate (input :viewer-certificate)) #:http.request.field{:name "ViewerCertificate", :shape "ViewerCertificate"}))))

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

(clojure.core/defn- ser-http-version [input] #:http.request.field{:value (clojure.core/get {"http1.1" "http1.1", :http-11 "http1.1", "http2" "http2", :http-2 "http2"} input), :shape "HttpVersion"})

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

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})]}))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})]}))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})]}))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})]}))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-29/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

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

(clojure.core/declare deser-query-string-cache-keys-list)

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

(clojure.core/declare deser-query-string-cache-keys)

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

(clojure.core/declare deser-http-version)

(clojure.core/declare deser-cookie-preference)

(clojure.core/declare deser-custom-headers)

(clojure.core/declare deser-methods-list)

(clojure.core/declare deser-default-cache-behavior)

(clojure.core/declare deser-trusted-signers)

(clojure.core/declare deser-viewer-certificate)

(clojure.core/declare deser-cloud-front-origin-access-identity-config)

(clojure.core/declare deser-geo-restriction)

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar277814 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar277814 ["Quantity" :content]))} (letvar277814 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar277814 ["Items" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar277922 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar277922 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar277922 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar277922 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar277922 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar278030 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar278030 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar278030 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar278030 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar278155 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? nil :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar278155 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar278155 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar278155 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar278155 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar278302 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar278302 ["GeoRestriction" :content]))})))

(clojure.core/defn- deserstring [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar278415 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? nil :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar278415 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar278415 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar278415 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar278415 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar278415 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar278415 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar278415 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar278415 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar278523 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar278523 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar278523 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar278523 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar278523 ["Quantity" :content]))} (letvar278523 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar278523 ["NextMarker" :content]))) (letvar278523 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar278523 ["Items" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar278631 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? nil :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? nil :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? nil :xmlAttribute? nil), "QueryStringCacheKeys" (portkey.aws/search-for-tag input "QueryStringCacheKeys" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar278631 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar278631 ["Cookies" :content]))} (letvar278631 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar278631 ["Headers" :content]))) (letvar278631 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar278631 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar278739 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar278739 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar278739 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar278881 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar278881 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar278881 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar278881 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar278881 ["Quantity" :content]))} (letvar278881 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar278881 ["NextMarker" :content]))) (letvar278881 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar278881 ["Items" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar278994 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? nil :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar278994 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar278994 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar278994 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar278994 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar278994 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar278994 ["StreamingDistributionConfig" :content]))} (letvar278994 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar278994 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar279107 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? nil :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? nil :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? nil :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar279107 ["ErrorCode" :content]))} (letvar279107 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar279107 ["ResponsePagePath" :content]))) (letvar279107 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar279107 ["ResponseCode" :content]))) (letvar279107 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar279107 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar279232 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? nil :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar279232 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar279232 ["AwsAccountNumber" :content]))) (letvar279232 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar279232 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar279359 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar279359 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar279359 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar279472 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar279472 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar279472 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar279597 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar279597 ["Quantity" :content]))} (letvar279597 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar279597 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar279705 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? nil :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? nil :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? nil :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? nil :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? nil :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? nil :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? nil :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? nil :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? nil :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar279705 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar279705 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar279705 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar279705 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar279705 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar279705 ["MinTTL" :content]))} (letvar279705 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar279705 ["SmoothStreaming" :content]))) (letvar279705 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar279705 ["Compress" :content]))) (letvar279705 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar279705 ["MaxTTL" :content]))) (letvar279705 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar279705 ["AllowedMethods" :content]))) (letvar279705 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar279705 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar279813 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar279813 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar279813 ["Quantity" :content]))} (letvar279813 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar279813 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar279921 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? nil :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? nil :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? nil :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar279921 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar279921 ["DomainName" :content]))} (letvar279921 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar279921 ["OriginPath" :content]))) (letvar279921 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar279921 ["CustomHeaders" :content]))) (letvar279921 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar279921 ["S3OriginConfig" :content]))) (letvar279921 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar279921 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar280031 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar280031 ["Quantity" :content]))} (letvar280031 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar280031 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar280139 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar280139 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar280139 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar280139 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar280139 ["Quantity" :content]))} (letvar280139 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar280139 ["NextMarker" :content]))) (letvar280139 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar280139 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar280247 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar280247 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar280247 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar280355 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar280355 ["Quantity" :content]))} (letvar280355 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar280355 ["Items" :content]))))))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar280463 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar280463 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar280463 ["Items" :content]))} (letvar280463 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar280463 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar280576 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? nil :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? nil :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? nil :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar280576 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar280576 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar280576 ["OriginProtocolPolicy" :content]))} (letvar280576 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar280576 ["OriginSslProtocols" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar280684 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar280684 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar280684 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar280792 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar280792 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar280792 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar280792 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar280792 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar280792 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar280792 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar280792 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar280792 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar280792 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar280792 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar280792 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar280900 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? nil :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar280900 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar280900 ["S3CanonicalUserId" :content]))} (letvar280900 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar280900 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar281042 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar281042 ["Quantity" :content]))} (letvar281042 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar281042 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar281150 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar281150 ["Quantity" :content]))} (letvar281150 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar281150 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar281258 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? nil :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? nil :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? nil :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? nil :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? nil :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? nil :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? nil :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar281258 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar281258 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar281258 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar281258 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar281258 ["Enabled" :content]))} (letvar281258 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar281258 ["DefaultRootObject" :content]))) (letvar281258 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar281258 ["IsIPV6Enabled" :content]))) (letvar281258 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar281258 ["Restrictions" :content]))) (letvar281258 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar281258 ["WebACLId" :content]))) (letvar281258 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar281258 ["Logging" :content]))) (letvar281258 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar281258 ["CacheBehaviors" :content]))) (letvar281258 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar281258 ["CustomErrorResponses" :content]))) (letvar281258 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar281258 ["Aliases" :content]))) (letvar281258 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar281258 ["PriceClass" :content]))) (letvar281258 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar281258 ["HttpVersion" :content]))) (letvar281258 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar281258 ["ViewerCertificate" :content]))))))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-value [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-method [input] (clojure.core/get {"GET" :get, "HEAD" :head, "POST" :post, "PUT" :put, "PATCH" :patch, "OPTIONS" :options, "DELETE" :delete} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-custom-header coll))) input))

(clojure.core/defn- deser-origin-protocol-policy [input] (clojure.core/get {"http-only" :httponly, "match-viewer" :matchviewer, "https-only" :httpsonly} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signer coll))) input))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (clojure.core/get {"blacklist" :blacklist, "whitelist" :whitelist, "none" :none} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar281488 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar281488 ["Quantity" :content]))} (letvar281488 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar281488 ["Items" :content]))))))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar281598 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar281598 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar281598 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar281598 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar281723 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? nil :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar281723 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar281723 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar281831 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar281831 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar281831 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar281831 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar281831 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar281831 ["Enabled" :content]))} (letvar281831 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar281831 ["Aliases" :content]))) (letvar281831 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar281831 ["Logging" :content]))) (letvar281831 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar281831 ["PriceClass" :content]))))))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar281939 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar281939 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar282064 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar282064 ["Key" :content]))} (letvar282064 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar282064 ["Value" :content]))))))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar282172 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar282172 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar282172 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar282172 ["Prefix" :content]))})))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar282280 {"IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? nil :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? nil :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? nil :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? nil :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar282280 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar282280 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar282280 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar282280 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar282280 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar282280 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar282280 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar282280 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar282280 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar282280 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar282280 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar282280 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar282280 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar282280 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar282280 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar282280 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar282280 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar282280 ["PriceClass" :content]))})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar282393 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar282393 ["Quantity" :content]))} (letvar282393 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar282393 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar282506 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar282506 ["Quantity" :content]))} (letvar282506 "Items") (clojure.core/assoc :items (deser-origin-list (clojure.core/get-in letvar282506 ["Items" :content]))))))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar282631 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar282631 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar282631 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar282631 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar282631 ["Quantity" :content]))} (letvar282631 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar282631 ["NextMarker" :content]))) (letvar282631 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar282631 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-http-version [input] (clojure.core/get {"http1.1" :http-11, "http2" :http-2} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar282749 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? nil :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar282749 ["Forward" :content]))} (letvar282749 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar282749 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar282857 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar282857 ["Quantity" :content]))} (letvar282857 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar282857 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar282982 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? nil :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? nil :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? nil :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? nil :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? nil :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? nil :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? nil :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? nil :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar282982 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar282982 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar282982 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar282982 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar282982 ["MinTTL" :content]))} (letvar282982 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar282982 ["SmoothStreaming" :content]))) (letvar282982 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar282982 ["Compress" :content]))) (letvar282982 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar282982 ["MaxTTL" :content]))) (letvar282982 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar282982 ["AllowedMethods" :content]))) (letvar282982 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar282982 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar283090 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar283090 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar283090 ["Quantity" :content]))} (letvar283090 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar283090 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar283198 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? nil :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? nil :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? nil :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? nil :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? nil :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? nil :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar283198 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar283198 ["CloudFrontDefaultCertificate" :content]))) (letvar283198 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar283198 ["IAMCertificateId" :content]))) (letvar283198 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar283198 ["ACMCertificateArn" :content]))) (letvar283198 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar283198 ["SSLSupportMethod" :content]))) (letvar283198 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar283198 ["MinimumProtocolVersion" :content]))) (letvar283198 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar283198 ["Certificate" :content]))) (letvar283198 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar283198 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar283306 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar283306 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar283306 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar283414 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar283414 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar283414 ["Quantity" :content]))} (letvar283414 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar283414 ["Items" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-result ([input] (response-list-tags-for-resource-result nil input)) ([resultWrapper283416 input] (clojure.core/let [rawinput283415 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283417 {"Tags" (portkey.aws/search-for-tag rawinput283415 "Tags" :flattened? nil :result-wrapper resultWrapper283416)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar283417 ["Tags" :content]))}))))

(clojure.core/defn- response-no-such-origin ([input] (response-no-such-origin nil input)) ([resultWrapper283419 input] (clojure.core/let [rawinput283418 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283420 {"Message" (portkey.aws/search-for-tag rawinput283418 "Message" :flattened? nil :result-wrapper resultWrapper283419)}] (clojure.core/cond-> {} (letvar283420 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283420 ["Message" :content])))))))

(clojure.core/defn- response-invalid-protocol-settings ([input] (response-invalid-protocol-settings nil input)) ([resultWrapper283422 input] (clojure.core/let [rawinput283421 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283423 {"Message" (portkey.aws/search-for-tag rawinput283421 "Message" :flattened? nil :result-wrapper resultWrapper283422)}] (clojure.core/cond-> {} (letvar283423 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283423 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list ([input] (response-too-many-cookie-names-in-white-list nil input)) ([resultWrapper283425 input] (clojure.core/let [rawinput283424 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283426 {"Message" (portkey.aws/search-for-tag rawinput283424 "Message" :flattened? nil :result-wrapper resultWrapper283425)}] (clojure.core/cond-> {} (letvar283426 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283426 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cache-behaviors ([input] (response-too-many-cache-behaviors nil input)) ([resultWrapper283428 input] (clojure.core/let [rawinput283427 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283429 {"Message" (portkey.aws/search-for-tag rawinput283427 "Message" :flattened? nil :result-wrapper resultWrapper283428)}] (clojure.core/cond-> {} (letvar283429 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283429 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origin-custom-headers ([input] (response-too-many-origin-custom-headers nil input)) ([resultWrapper283431 input] (clojure.core/let [rawinput283430 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283432 {"Message" (portkey.aws/search-for-tag rawinput283430 "Message" :flattened? nil :result-wrapper resultWrapper283431)}] (clojure.core/cond-> {} (letvar283432 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283432 ["Message" :content])))))))

(clojure.core/defn- response-too-many-streaming-distributions ([input] (response-too-many-streaming-distributions nil input)) ([resultWrapper283434 input] (clojure.core/let [rawinput283433 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283435 {"Message" (portkey.aws/search-for-tag rawinput283433 "Message" :flattened? nil :result-wrapper resultWrapper283434)}] (clojure.core/cond-> {} (letvar283435 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283435 ["Message" :content])))))))

(clojure.core/defn- response-get-streaming-distribution-result ([input] (response-get-streaming-distribution-result nil input)) ([resultWrapper283437 input] (clojure.core/let [rawinput283436 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283438 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput283436 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper283437), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283438 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar283438 ["StreamingDistribution" :content]))) (letvar283438 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283438 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es ([input] (response-too-many-streaming-distribution-cnam-es nil input)) ([resultWrapper283440 input] (clojure.core/let [rawinput283439 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283441 {"Message" (portkey.aws/search-for-tag rawinput283439 "Message" :flattened? nil :result-wrapper resultWrapper283440)}] (clojure.core/cond-> {} (letvar283441 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283441 ["Message" :content])))))))

(clojure.core/defn- response-invalid-viewer-certificate ([input] (response-invalid-viewer-certificate nil input)) ([resultWrapper283443 input] (clojure.core/let [rawinput283442 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283444 {"Message" (portkey.aws/search-for-tag rawinput283442 "Message" :flattened? nil :result-wrapper resultWrapper283443)}] (clojure.core/cond-> {} (letvar283444 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283444 ["Message" :content])))))))

(clojure.core/defn- response-invalid-argument ([input] (response-invalid-argument nil input)) ([resultWrapper283446 input] (clojure.core/let [rawinput283445 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283447 {"Message" (portkey.aws/search-for-tag rawinput283445 "Message" :flattened? nil :result-wrapper resultWrapper283446)}] (clojure.core/cond-> {} (letvar283447 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283447 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-not-disabled ([input] (response-streaming-distribution-not-disabled nil input)) ([resultWrapper283449 input] (clojure.core/let [rawinput283448 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283450 {"Message" (portkey.aws/search-for-tag rawinput283448 "Message" :flattened? nil :result-wrapper resultWrapper283449)}] (clojure.core/cond-> {} (letvar283450 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283450 ["Message" :content])))))))

(clojure.core/defn- response-too-many-certificates ([input] (response-too-many-certificates nil input)) ([resultWrapper283452 input] (clojure.core/let [rawinput283451 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283453 {"Message" (portkey.aws/search-for-tag rawinput283451 "Message" :flattened? nil :result-wrapper resultWrapper283452)}] (clojure.core/cond-> {} (letvar283453 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283453 ["Message" :content])))))))

(clojure.core/defn- response-access-denied ([input] (response-access-denied nil input)) ([resultWrapper283455 input] (clojure.core/let [rawinput283454 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283456 {"Message" (portkey.aws/search-for-tag rawinput283454 "Message" :flattened? nil :result-wrapper resultWrapper283455)}] (clojure.core/cond-> {} (letvar283456 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283456 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use ([input] (response-cloud-front-origin-access-identity-in-use nil input)) ([resultWrapper283458 input] (clojure.core/let [rawinput283457 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283459 {"Message" (portkey.aws/search-for-tag rawinput283457 "Message" :flattened? nil :result-wrapper resultWrapper283458)}] (clojure.core/cond-> {} (letvar283459 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283459 ["Message" :content])))))))

(clojure.core/defn- response-no-such-resource ([input] (response-no-such-resource nil input)) ([resultWrapper283461 input] (clojure.core/let [rawinput283460 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283462 {"Message" (portkey.aws/search-for-tag rawinput283460 "Message" :flattened? nil :result-wrapper resultWrapper283461)}] (clojure.core/cond-> {} (letvar283462 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283462 ["Message" :content])))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result ([input] (response-update-cloud-front-origin-access-identity-result nil input)) ([resultWrapper283464 input] (clojure.core/let [rawinput283463 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283465 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput283463 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper283464), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283465 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar283465 ["CloudFrontOriginAccessIdentity" :content]))) (letvar283465 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283465 ["ETag"])))))))

(clojure.core/defn- response-invalid-error-code ([input] (response-invalid-error-code nil input)) ([resultWrapper283467 input] (clojure.core/let [rawinput283466 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283468 {"Message" (portkey.aws/search-for-tag rawinput283466 "Message" :flattened? nil :result-wrapper resultWrapper283467)}] (clojure.core/cond-> {} (letvar283468 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283468 ["Message" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-result ([input] (response-create-streaming-distribution-result nil input)) ([resultWrapper283470 input] (clojure.core/let [rawinput283469 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283471 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput283469 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper283470), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283471 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar283471 ["StreamingDistribution" :content]))) (letvar283471 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar283471 ["Location"]))) (letvar283471 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283471 ["ETag"])))))))

(clojure.core/defn- response-invalid-relative-path ([input] (response-invalid-relative-path nil input)) ([resultWrapper283473 input] (clojure.core/let [rawinput283472 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283474 {"Message" (portkey.aws/search-for-tag rawinput283472 "Message" :flattened? nil :result-wrapper resultWrapper283473)}] (clojure.core/cond-> {} (letvar283474 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283474 ["Message" :content])))))))

(clojure.core/defn- response-invalid-location-code ([input] (response-invalid-location-code nil input)) ([resultWrapper283476 input] (clojure.core/let [rawinput283475 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283477 {"Message" (portkey.aws/search-for-tag rawinput283475 "Message" :flattened? nil :result-wrapper resultWrapper283476)}] (clojure.core/cond-> {} (letvar283477 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283477 ["Message" :content])))))))

(clojure.core/defn- response-invalid-web-acl-id ([input] (response-invalid-web-acl-id nil input)) ([resultWrapper283479 input] (clojure.core/let [rawinput283478 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283480 {"Message" (portkey.aws/search-for-tag rawinput283478 "Message" :flattened? nil :result-wrapper resultWrapper283479)}] (clojure.core/cond-> {} (letvar283480 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283480 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin ([input] (response-invalid-origin nil input)) ([resultWrapper283482 input] (clojure.core/let [rawinput283481 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283483 {"Message" (portkey.aws/search-for-tag rawinput283481 "Message" :flattened? nil :result-wrapper resultWrapper283482)}] (clojure.core/cond-> {} (letvar283483 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283483 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities ([input] (response-too-many-cloud-front-origin-access-identities nil input)) ([resultWrapper283485 input] (clojure.core/let [rawinput283484 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283486 {"Message" (portkey.aws/search-for-tag rawinput283484 "Message" :flattened? nil :result-wrapper resultWrapper283485)}] (clojure.core/cond-> {} (letvar283486 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283486 ["Message" :content])))))))

(clojure.core/defn- response-update-distribution-result ([input] (response-update-distribution-result nil input)) ([resultWrapper283488 input] (clojure.core/let [rawinput283487 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283489 {"Distribution" (portkey.aws/search-for-tag rawinput283487 "Distribution" :flattened? nil :result-wrapper resultWrapper283488), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283489 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar283489 ["Distribution" :content]))) (letvar283489 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283489 ["ETag"])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result ([input] (response-get-cloud-front-origin-access-identity-result nil input)) ([resultWrapper283491 input] (clojure.core/let [rawinput283490 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283492 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput283490 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper283491), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283492 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar283492 ["CloudFrontOriginAccessIdentity" :content]))) (letvar283492 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283492 ["ETag"])))))))

(clojure.core/defn- response-invalid-query-string-parameters ([input] (response-invalid-query-string-parameters nil input)) ([resultWrapper283494 input] (clojure.core/let [rawinput283493 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283495 {"Message" (portkey.aws/search-for-tag rawinput283493 "Message" :flattened? nil :result-wrapper resultWrapper283494)}] (clojure.core/cond-> {} (letvar283495 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283495 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origins ([input] (response-too-many-origins nil input)) ([resultWrapper283497 input] (clojure.core/let [rawinput283496 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283498 {"Message" (portkey.aws/search-for-tag rawinput283496 "Message" :flattened? nil :result-wrapper resultWrapper283497)}] (clojure.core/cond-> {} (letvar283498 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283498 ["Message" :content])))))))

(clojure.core/defn- response-invalid-ttl-order ([input] (response-invalid-ttl-order nil input)) ([resultWrapper283500 input] (clojure.core/let [rawinput283499 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283501 {"Message" (portkey.aws/search-for-tag rawinput283499 "Message" :flattened? nil :result-wrapper resultWrapper283500)}] (clojure.core/cond-> {} (letvar283501 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283501 ["Message" :content])))))))

(clojure.core/defn- response-no-such-streaming-distribution ([input] (response-no-such-streaming-distribution nil input)) ([resultWrapper283503 input] (clojure.core/let [rawinput283502 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283504 {"Message" (portkey.aws/search-for-tag rawinput283502 "Message" :flattened? nil :result-wrapper resultWrapper283503)}] (clojure.core/cond-> {} (letvar283504 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283504 ["Message" :content])))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result ([input] (response-create-cloud-front-origin-access-identity-result nil input)) ([resultWrapper283506 input] (clojure.core/let [rawinput283505 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283507 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput283505 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper283506), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283507 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar283507 ["CloudFrontOriginAccessIdentity" :content]))) (letvar283507 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar283507 ["Location"]))) (letvar283507 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283507 ["ETag"])))))))

(clojure.core/defn- response-cname-already-exists ([input] (response-cname-already-exists nil input)) ([resultWrapper283509 input] (clojure.core/let [rawinput283508 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283510 {"Message" (portkey.aws/search-for-tag rawinput283508 "Message" :flattened? nil :result-wrapper resultWrapper283509)}] (clojure.core/cond-> {} (letvar283510 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283510 ["Message" :content])))))))

(clojure.core/defn- response-invalid-default-root-object ([input] (response-invalid-default-root-object nil input)) ([resultWrapper283512 input] (clojure.core/let [rawinput283511 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283513 {"Message" (portkey.aws/search-for-tag rawinput283511 "Message" :flattened? nil :result-wrapper resultWrapper283512)}] (clojure.core/cond-> {} (letvar283513 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283513 ["Message" :content])))))))

(clojure.core/defn- response-invalid-response-code ([input] (response-invalid-response-code nil input)) ([resultWrapper283515 input] (clojure.core/let [rawinput283514 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283516 {"Message" (portkey.aws/search-for-tag rawinput283514 "Message" :flattened? nil :result-wrapper resultWrapper283515)}] (clojure.core/cond-> {} (letvar283516 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283516 ["Message" :content])))))))

(clojure.core/defn- response-no-such-invalidation ([input] (response-no-such-invalidation nil input)) ([resultWrapper283518 input] (clojure.core/let [rawinput283517 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283519 {"Message" (portkey.aws/search-for-tag rawinput283517 "Message" :flattened? nil :result-wrapper resultWrapper283518)}] (clojure.core/cond-> {} (letvar283519 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283519 ["Message" :content])))))))

(clojure.core/defn- response-too-many-invalidations-in-progress ([input] (response-too-many-invalidations-in-progress nil input)) ([resultWrapper283521 input] (clojure.core/let [rawinput283520 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283522 {"Message" (portkey.aws/search-for-tag rawinput283520 "Message" :flattened? nil :result-wrapper resultWrapper283521)}] (clojure.core/cond-> {} (letvar283522 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283522 ["Message" :content])))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result ([input] (response-list-cloud-front-origin-access-identities-result nil input)) ([resultWrapper283524 input] (clojure.core/let [rawinput283523 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283525 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput283523 "CloudFrontOriginAccessIdentityList" :flattened? nil :result-wrapper resultWrapper283524)}] (clojure.core/cond-> {} (letvar283525 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar283525 ["CloudFrontOriginAccessIdentityList" :content])))))))

(clojure.core/defn- response-invalid-forward-cookies ([input] (response-invalid-forward-cookies nil input)) ([resultWrapper283527 input] (clojure.core/let [rawinput283526 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283528 {"Message" (portkey.aws/search-for-tag rawinput283526 "Message" :flattened? nil :result-wrapper resultWrapper283527)}] (clojure.core/cond-> {} (letvar283528 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283528 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-config-result ([input] (response-get-distribution-config-result nil input)) ([resultWrapper283530 input] (clojure.core/let [rawinput283529 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283531 {"DistributionConfig" (portkey.aws/search-for-tag rawinput283529 "DistributionConfig" :flattened? nil :result-wrapper resultWrapper283530), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283531 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar283531 ["DistributionConfig" :content]))) (letvar283531 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283531 ["ETag"])))))))

(clojure.core/defn- response-invalid-required-protocol ([input] (response-invalid-required-protocol nil input)) ([resultWrapper283533 input] (clojure.core/let [rawinput283532 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283534 {"Message" (portkey.aws/search-for-tag rawinput283532 "Message" :flattened? nil :result-wrapper resultWrapper283533)}] (clojure.core/cond-> {} (letvar283534 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283534 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-result ([input] (response-get-distribution-result nil input)) ([resultWrapper283536 input] (clojure.core/let [rawinput283535 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283537 {"Distribution" (portkey.aws/search-for-tag rawinput283535 "Distribution" :flattened? nil :result-wrapper resultWrapper283536), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283537 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar283537 ["Distribution" :content]))) (letvar283537 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283537 ["ETag"])))))))

(clojure.core/defn- response-get-streaming-distribution-config-result ([input] (response-get-streaming-distribution-config-result nil input)) ([resultWrapper283539 input] (clojure.core/let [rawinput283538 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283540 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput283538 "StreamingDistributionConfig" :flattened? nil :result-wrapper resultWrapper283539), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283540 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar283540 ["StreamingDistributionConfig" :content]))) (letvar283540 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283540 ["ETag"])))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin ([input] (response-invalid-headers-for-s-3-origin nil input)) ([resultWrapper283542 input] (clojure.core/let [rawinput283541 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283543 {"Message" (portkey.aws/search-for-tag rawinput283541 "Message" :flattened? nil :result-wrapper resultWrapper283542)}] (clojure.core/cond-> {} (letvar283543 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283543 ["Message" :content])))))))

(clojure.core/defn- response-too-many-distribution-cnam-es ([input] (response-too-many-distribution-cnam-es nil input)) ([resultWrapper283545 input] (clojure.core/let [rawinput283544 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283546 {"Message" (portkey.aws/search-for-tag rawinput283544 "Message" :flattened? nil :result-wrapper resultWrapper283545)}] (clojure.core/cond-> {} (letvar283546 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283546 ["Message" :content])))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter ([input] (response-invalid-geo-restriction-parameter nil input)) ([resultWrapper283548 input] (clojure.core/let [rawinput283547 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283549 {"Message" (portkey.aws/search-for-tag rawinput283547 "Message" :flattened? nil :result-wrapper resultWrapper283548)}] (clojure.core/cond-> {} (letvar283549 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283549 ["Message" :content])))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity ([input] (response-no-such-cloud-front-origin-access-identity nil input)) ([resultWrapper283551 input] (clojure.core/let [rawinput283550 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283552 {"Message" (portkey.aws/search-for-tag rawinput283550 "Message" :flattened? nil :result-wrapper resultWrapper283551)}] (clojure.core/cond-> {} (letvar283552 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283552 ["Message" :content])))))))

(clojure.core/defn- response-list-invalidations-result ([input] (response-list-invalidations-result nil input)) ([resultWrapper283554 input] (clojure.core/let [rawinput283553 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283555 {"InvalidationList" (portkey.aws/search-for-tag rawinput283553 "InvalidationList" :flattened? nil :result-wrapper resultWrapper283554)}] (clojure.core/cond-> {} (letvar283555 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar283555 ["InvalidationList" :content])))))))

(clojure.core/defn- response-batch-too-large ([input] (response-batch-too-large nil input)) ([resultWrapper283557 input] (clojure.core/let [rawinput283556 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283558 {"Message" (portkey.aws/search-for-tag rawinput283556 "Message" :flattened? nil :result-wrapper resultWrapper283557)}] (clojure.core/cond-> {} (letvar283558 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283558 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-with-tags-result ([input] (response-create-distribution-with-tags-result nil input)) ([resultWrapper283560 input] (clojure.core/let [rawinput283559 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283561 {"Distribution" (portkey.aws/search-for-tag rawinput283559 "Distribution" :flattened? nil :result-wrapper resultWrapper283560), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283561 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar283561 ["Distribution" :content]))) (letvar283561 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar283561 ["Location"]))) (letvar283561 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283561 ["ETag"])))))))

(clojure.core/defn- response-list-streaming-distributions-result ([input] (response-list-streaming-distributions-result nil input)) ([resultWrapper283563 input] (clojure.core/let [rawinput283562 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283564 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput283562 "StreamingDistributionList" :flattened? nil :result-wrapper resultWrapper283563)}] (clojure.core/cond-> {} (letvar283564 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar283564 ["StreamingDistributionList" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result ([input] (response-create-streaming-distribution-with-tags-result nil input)) ([resultWrapper283566 input] (clojure.core/let [rawinput283565 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283567 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput283565 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper283566), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283567 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar283567 ["StreamingDistribution" :content]))) (letvar283567 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar283567 ["Location"]))) (letvar283567 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283567 ["ETag"])))))))

(clojure.core/defn- response-create-invalidation-result ([input] (response-create-invalidation-result nil input)) ([resultWrapper283569 input] (clojure.core/let [rawinput283568 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283570 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput283568 "Invalidation" :flattened? nil :result-wrapper resultWrapper283569)}] (clojure.core/cond-> {} (letvar283570 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar283570 ["Location"]))) (letvar283570 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar283570 ["Invalidation" :content])))))))

(clojure.core/defn- response-missing-body ([input] (response-missing-body nil input)) ([resultWrapper283572 input] (clojure.core/let [rawinput283571 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283573 {"Message" (portkey.aws/search-for-tag rawinput283571 "Message" :flattened? nil :result-wrapper resultWrapper283572)}] (clojure.core/cond-> {} (letvar283573 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283573 ["Message" :content])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result ([input] (response-get-cloud-front-origin-access-identity-config-result nil input)) ([resultWrapper283575 input] (clojure.core/let [rawinput283574 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283576 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput283574 "CloudFrontOriginAccessIdentityConfig" :flattened? nil :result-wrapper resultWrapper283575), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283576 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar283576 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar283576 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283576 ["ETag"])))))))

(clojure.core/defn- response-distribution-not-disabled ([input] (response-distribution-not-disabled nil input)) ([resultWrapper283578 input] (clojure.core/let [rawinput283577 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283579 {"Message" (portkey.aws/search-for-tag rawinput283577 "Message" :flattened? nil :result-wrapper resultWrapper283578)}] (clojure.core/cond-> {} (letvar283579 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283579 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists ([input] (response-cloud-front-origin-access-identity-already-exists nil input)) ([resultWrapper283581 input] (clojure.core/let [rawinput283580 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283582 {"Message" (portkey.aws/search-for-tag rawinput283580 "Message" :flattened? nil :result-wrapper resultWrapper283581)}] (clojure.core/cond-> {} (letvar283582 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283582 ["Message" :content])))))))

(clojure.core/defn- response-precondition-failed ([input] (response-precondition-failed nil input)) ([resultWrapper283584 input] (clojure.core/let [rawinput283583 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283585 {"Message" (portkey.aws/search-for-tag rawinput283583 "Message" :flattened? nil :result-wrapper resultWrapper283584)}] (clojure.core/cond-> {} (letvar283585 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283585 ["Message" :content])))))))

(clojure.core/defn- response-distribution-already-exists ([input] (response-distribution-already-exists nil input)) ([resultWrapper283587 input] (clojure.core/let [rawinput283586 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283588 {"Message" (portkey.aws/search-for-tag rawinput283586 "Message" :flattened? nil :result-wrapper resultWrapper283587)}] (clojure.core/cond-> {} (letvar283588 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283588 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-access-identity ([input] (response-invalid-origin-access-identity nil input)) ([resultWrapper283590 input] (clojure.core/let [rawinput283589 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283591 {"Message" (portkey.aws/search-for-tag rawinput283589 "Message" :flattened? nil :result-wrapper resultWrapper283590)}] (clojure.core/cond-> {} (letvar283591 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283591 ["Message" :content])))))))

(clojure.core/defn- response-too-many-trusted-signers ([input] (response-too-many-trusted-signers nil input)) ([resultWrapper283593 input] (clojure.core/let [rawinput283592 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283594 {"Message" (portkey.aws/search-for-tag rawinput283592 "Message" :flattened? nil :result-wrapper resultWrapper283593)}] (clojure.core/cond-> {} (letvar283594 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283594 ["Message" :content])))))))

(clojure.core/defn- response-invalid-minimum-protocol-version ([input] (response-invalid-minimum-protocol-version nil input)) ([resultWrapper283596 input] (clojure.core/let [rawinput283595 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283597 {"Message" (portkey.aws/search-for-tag rawinput283595 "Message" :flattened? nil :result-wrapper resultWrapper283596)}] (clojure.core/cond-> {} (letvar283597 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283597 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-already-exists ([input] (response-streaming-distribution-already-exists nil input)) ([resultWrapper283599 input] (clojure.core/let [rawinput283598 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283600 {"Message" (portkey.aws/search-for-tag rawinput283598 "Message" :flattened? nil :result-wrapper resultWrapper283599)}] (clojure.core/cond-> {} (letvar283600 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283600 ["Message" :content])))))))

(clojure.core/defn- response-invalid-if-match-version ([input] (response-invalid-if-match-version nil input)) ([resultWrapper283602 input] (clojure.core/let [rawinput283601 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283603 {"Message" (portkey.aws/search-for-tag rawinput283601 "Message" :flattened? nil :result-wrapper resultWrapper283602)}] (clojure.core/cond-> {} (letvar283603 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283603 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-result ([input] (response-create-distribution-result nil input)) ([resultWrapper283605 input] (clojure.core/let [rawinput283604 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283606 {"Distribution" (portkey.aws/search-for-tag rawinput283604 "Distribution" :flattened? nil :result-wrapper resultWrapper283605), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283606 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar283606 ["Distribution" :content]))) (letvar283606 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar283606 ["Location"]))) (letvar283606 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283606 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions ([input] (response-too-many-distributions nil input)) ([resultWrapper283608 input] (clojure.core/let [rawinput283607 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283609 {"Message" (portkey.aws/search-for-tag rawinput283607 "Message" :flattened? nil :result-wrapper resultWrapper283608)}] (clojure.core/cond-> {} (letvar283609 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283609 ["Message" :content])))))))

(clojure.core/defn- response-no-such-distribution ([input] (response-no-such-distribution nil input)) ([resultWrapper283611 input] (clojure.core/let [rawinput283610 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283612 {"Message" (portkey.aws/search-for-tag rawinput283610 "Message" :flattened? nil :result-wrapper resultWrapper283611)}] (clojure.core/cond-> {} (letvar283612 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283612 ["Message" :content])))))))

(clojure.core/defn- response-update-streaming-distribution-result ([input] (response-update-streaming-distribution-result nil input)) ([resultWrapper283614 input] (clojure.core/let [rawinput283613 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283615 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput283613 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper283614), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar283615 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar283615 ["StreamingDistribution" :content]))) (letvar283615 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar283615 ["ETag"])))))))

(clojure.core/defn- response-illegal-update ([input] (response-illegal-update nil input)) ([resultWrapper283617 input] (clojure.core/let [rawinput283616 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283618 {"Message" (portkey.aws/search-for-tag rawinput283616 "Message" :flattened? nil :result-wrapper resultWrapper283617)}] (clojure.core/cond-> {} (letvar283618 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283618 ["Message" :content])))))))

(clojure.core/defn- response-inconsistent-quantities ([input] (response-inconsistent-quantities nil input)) ([resultWrapper283620 input] (clojure.core/let [rawinput283619 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283621 {"Message" (portkey.aws/search-for-tag rawinput283619 "Message" :flattened? nil :result-wrapper resultWrapper283620)}] (clojure.core/cond-> {} (letvar283621 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283621 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result ([input] (response-list-distributions-by-web-acl-id-result nil input)) ([resultWrapper283623 input] (clojure.core/let [rawinput283622 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283624 {"DistributionList" (portkey.aws/search-for-tag rawinput283622 "DistributionList" :flattened? nil :result-wrapper resultWrapper283623)}] (clojure.core/cond-> {} (letvar283624 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar283624 ["DistributionList" :content])))))))

(clojure.core/defn- response-too-many-query-string-parameters ([input] (response-too-many-query-string-parameters nil input)) ([resultWrapper283626 input] (clojure.core/let [rawinput283625 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283627 {"Message" (portkey.aws/search-for-tag rawinput283625 "Message" :flattened? nil :result-wrapper resultWrapper283626)}] (clojure.core/cond-> {} (letvar283627 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283627 ["Message" :content])))))))

(clojure.core/defn- response-invalid-tagging ([input] (response-invalid-tagging nil input)) ([resultWrapper283629 input] (clojure.core/let [rawinput283628 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283630 {"Message" (portkey.aws/search-for-tag rawinput283628 "Message" :flattened? nil :result-wrapper resultWrapper283629)}] (clojure.core/cond-> {} (letvar283630 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283630 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-result ([input] (response-list-distributions-result nil input)) ([resultWrapper283632 input] (clojure.core/let [rawinput283631 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283633 {"DistributionList" (portkey.aws/search-for-tag rawinput283631 "DistributionList" :flattened? nil :result-wrapper resultWrapper283632)}] (clojure.core/cond-> {} (letvar283633 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar283633 ["DistributionList" :content])))))))

(clojure.core/defn- response-trusted-signer-does-not-exist ([input] (response-trusted-signer-does-not-exist nil input)) ([resultWrapper283635 input] (clojure.core/let [rawinput283634 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283636 {"Message" (portkey.aws/search-for-tag rawinput283634 "Message" :flattened? nil :result-wrapper resultWrapper283635)}] (clojure.core/cond-> {} (letvar283636 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283636 ["Message" :content])))))))

(clojure.core/defn- response-get-invalidation-result ([input] (response-get-invalidation-result nil input)) ([resultWrapper283638 input] (clojure.core/let [rawinput283637 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283639 {"Invalidation" (portkey.aws/search-for-tag rawinput283637 "Invalidation" :flattened? nil :result-wrapper resultWrapper283638)}] (clojure.core/cond-> {} (letvar283639 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar283639 ["Invalidation" :content])))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values ([input] (response-too-many-headers-in-forwarded-values nil input)) ([resultWrapper283641 input] (clojure.core/let [rawinput283640 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar283642 {"Message" (portkey.aws/search-for-tag rawinput283640 "Message" :flattened? nil :result-wrapper resultWrapper283641)}] (clojure.core/cond-> {} (letvar283642 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar283642 ["Message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2016-09-29.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2016-09-29.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.logging-config/enabled :portkey.aws.cloudfront.-2016-09-29.logging-config/include-cookies :portkey.aws.cloudfront.-2016-09-29.logging-config/bucket :portkey.aws.cloudfront.-2016-09-29.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/streaming-distribution-config :portkey.aws.cloudfront.-2016-09-29/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.invalidation-summary/id :portkey.aws.cloudfront.-2016-09-29.invalidation-summary/create-time :portkey.aws.cloudfront.-2016-09-29.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.invalidation/id :portkey.aws.cloudfront.-2016-09-29.invalidation/status :portkey.aws.cloudfront.-2016-09-29.invalidation/create-time :portkey.aws.cloudfront.-2016-09-29/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/streaming-distribution :portkey.aws.cloudfront.-2016-09-29.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-29.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.distribution/id :portkey.aws.cloudfront.-2016-09-29.distribution/arn :portkey.aws.cloudfront.-2016-09-29.distribution/status :portkey.aws.cloudfront.-2016-09-29.distribution/last-modified-time :portkey.aws.cloudfront.-2016-09-29.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2016-09-29.distribution/domain-name :portkey.aws.cloudfront.-2016-09-29/active-trusted-signers :portkey.aws.cloudfront.-2016-09-29/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.forwarded-values/query-string :portkey.aws.cloudfront.-2016-09-29.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2016-09-29/headers :portkey.aws.cloudfront.-2016-09-29/query-string-cache-keys]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/paths :portkey.aws.cloudfront.-2016-09-29.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-29.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/query-string-cache-keys-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/marker :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.streaming-distribution/id :portkey.aws.cloudfront.-2016-09-29.streaming-distribution/arn :portkey.aws.cloudfront.-2016-09-29.streaming-distribution/status :portkey.aws.cloudfront.-2016-09-29.streaming-distribution/domain-name :portkey.aws.cloudfront.-2016-09-29/active-trusted-signers :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2016-09-29.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2016-09-29.custom-error-response/response-page-path :portkey.aws.cloudfront.-2016-09-29.custom-error-response/response-code :portkey.aws.cloudfront.-2016-09-29.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.signer/aws-account-number :portkey.aws.cloudfront.-2016-09-29/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-09-29.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.cached-methods/quantity :portkey.aws.cloudfront.-2016-09-29.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/streaming-distribution :portkey.aws.cloudfront.-2016-09-29.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2016-09-29.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.cache-behavior/path-pattern :portkey.aws.cloudfront.-2016-09-29.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-09-29/forwarded-values :portkey.aws.cloudfront.-2016-09-29/trusted-signers :portkey.aws.cloudfront.-2016-09-29/viewer-protocol-policy :portkey.aws.cloudfront.-2016-09-29.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-09-29.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-09-29.cache-behavior/compress :portkey.aws.cloudfront.-2016-09-29.cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-09-29/allowed-methods :portkey.aws.cloudfront.-2016-09-29.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2016-09-29.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.active-trusted-signers/enabled :portkey.aws.cloudfront.-2016-09-29.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.origin/id :portkey.aws.cloudfront.-2016-09-29.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2016-09-29.origin/origin-path :portkey.aws.cloudfront.-2016-09-29/custom-headers :portkey.aws.cloudfront.-2016-09-29/s-3-origin-config :portkey.aws.cloudfront.-2016-09-29/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.invalidation-list/marker :portkey.aws.cloudfront.-2016-09-29.invalidation-list/max-items :portkey.aws.cloudfront.-2016-09-29.invalidation-list/is-truncated :portkey.aws.cloudfront.-2016-09-29.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalidation-list/next-marker :portkey.aws.cloudfront.-2016-09-29.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2016-09-29.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/distribution :portkey.aws.cloudfront.-2016-09-29.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-09-29.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.allowed-methods/quantity :portkey.aws.cloudfront.-2016-09-29.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2016-09-29/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.custom-origin-config/http-port :portkey.aws.cloudfront.-2016-09-29.custom-origin-config/https-port :portkey.aws.cloudfront.-2016-09-29/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2016-09-29/origin-ssl-protocols]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.list-distributions-request/marker :portkey.aws.cloudfront.-2016-09-29.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.s-3-origin/domain-name :portkey.aws.cloudfront.-2016-09-29.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-09-29.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2016-09-29.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/id :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/arn :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/status :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2016-09-29/s-3-origin :portkey.aws.cloudfront.-2016-09-29/aliases :portkey.aws.cloudfront.-2016-09-29/trusted-signers :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2016-09-29/price-class :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-09-29.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-29.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-09-29/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.tag-resource-request/resource :portkey.aws.cloudfront.-2016-09-29/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.query-string-cache-keys/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.query-string-cache-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/query-string-cache-keys-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/query-string-cache-keys (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.query-string-cache-keys/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.query-string-cache-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-config/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.distribution-config/caller-reference :portkey.aws.cloudfront.-2016-09-29/origins :portkey.aws.cloudfront.-2016-09-29/default-cache-behavior :portkey.aws.cloudfront.-2016-09-29.distribution-config/comment :portkey.aws.cloudfront.-2016-09-29.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-09-29.distribution-config/default-root-object :portkey.aws.cloudfront.-2016-09-29.distribution-config/is-ipv-6-enabled :portkey.aws.cloudfront.-2016-09-29/restrictions :portkey.aws.cloudfront.-2016-09-29.distribution-config/web-acl-id :portkey.aws.cloudfront.-2016-09-29.distribution-config/logging :portkey.aws.cloudfront.-2016-09-29/cache-behaviors :portkey.aws.cloudfront.-2016-09-29/custom-error-responses :portkey.aws.cloudfront.-2016-09-29/aliases :portkey.aws.cloudfront.-2016-09-29/price-class :portkey.aws.cloudfront.-2016-09-29/http-version :portkey.aws.cloudfront.-2016-09-29/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/distribution-config :portkey.aws.cloudfront.-2016-09-29.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/distribution :portkey.aws.cloudfront.-2016-09-29.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/streaming-distribution-config :portkey.aws.cloudfront.-2016-09-29.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/distribution :portkey.aws.cloudfront.-2016-09-29.create-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-09-29.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/streaming-distribution-config :portkey.aws.cloudfront.-2016-09-29.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-29.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/streaming-distribution :portkey.aws.cloudfront.-2016-09-29.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-09-29.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.create-invalidation-result/location :portkey.aws.cloudfront.-2016-09-29/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-09-29.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.origin-custom-header/header-name :portkey.aws.cloudfront.-2016-09-29.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2016-09-29/s-3-origin :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-config/comment :portkey.aws.cloudfront.-2016-09-29/trusted-signers :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-09-29/aliases :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-config/logging :portkey.aws.cloudfront.-2016-09-29/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.tag/key] :opt-un [:portkey.aws.cloudfront.-2016-09-29.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.streaming-logging-config/enabled :portkey.aws.cloudfront.-2016-09-29.streaming-logging-config/bucket :portkey.aws.cloudfront.-2016-09-29.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-summary/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.distribution-summary/id :portkey.aws.cloudfront.-2016-09-29.distribution-summary/arn :portkey.aws.cloudfront.-2016-09-29.distribution-summary/status :portkey.aws.cloudfront.-2016-09-29.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-09-29.distribution-summary/domain-name :portkey.aws.cloudfront.-2016-09-29/aliases :portkey.aws.cloudfront.-2016-09-29/origins :portkey.aws.cloudfront.-2016-09-29/default-cache-behavior :portkey.aws.cloudfront.-2016-09-29/cache-behaviors :portkey.aws.cloudfront.-2016-09-29/custom-error-responses :portkey.aws.cloudfront.-2016-09-29.distribution-summary/comment :portkey.aws.cloudfront.-2016-09-29/price-class :portkey.aws.cloudfront.-2016-09-29.distribution-summary/enabled :portkey.aws.cloudfront.-2016-09-29/viewer-certificate :portkey.aws.cloudfront.-2016-09-29/restrictions :portkey.aws.cloudfront.-2016-09-29.distribution-summary/web-acl-id :portkey.aws.cloudfront.-2016-09-29/http-version :portkey.aws.cloudfront.-2016-09-29.distribution-summary/is-ipv-6-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/minimum-protocol-version #{"TLSv1" :tl-sv-1 :ss-lv-3 "SSLv3"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.origins/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.origins/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/distribution-config :portkey.aws.cloudfront.-2016-09-29/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/distribution :portkey.aws.cloudfront.-2016-09-29.create-distribution-result/location :portkey.aws.cloudfront.-2016-09-29.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-29.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-09-29.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.distribution-list/marker :portkey.aws.cloudfront.-2016-09-29.distribution-list/max-items :portkey.aws.cloudfront.-2016-09-29.distribution-list/is-truncated :portkey.aws.cloudfront.-2016-09-29.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.distribution-list/next-marker :portkey.aws.cloudfront.-2016-09-29.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/streaming-distribution :portkey.aws.cloudfront.-2016-09-29.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/http-version #{:http-11 "http2" :http-2 "http1.1"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2016-09-29.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2016-09-29.list-invalidations-request/marker :portkey.aws.cloudfront.-2016-09-29.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-29/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.untag-resource-request/resource :portkey.aws.cloudfront.-2016-09-29/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-09-29/forwarded-values :portkey.aws.cloudfront.-2016-09-29/trusted-signers :portkey.aws.cloudfront.-2016-09-29/viewer-protocol-policy :portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/compress :portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-09-29/allowed-methods :portkey.aws.cloudfront.-2016-09-29.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.trusted-signers/enabled :portkey.aws.cloudfront.-2016-09-29.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29/distribution-config :portkey.aws.cloudfront.-2016-09-29.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-29.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2016-09-29.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2016-09-29.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2016-09-29/ssl-support-method :portkey.aws.cloudfront.-2016-09-29/minimum-protocol-version :portkey.aws.cloudfront.-2016-09-29.viewer-certificate/certificate :portkey.aws.cloudfront.-2016-09-29/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-29.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2016-09-29.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2016-09-29.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-29.geo-restriction/restriction-type :portkey.aws.cloudfront.-2016-09-29.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-29.geo-restriction/items]))

(clojure.core/defn tag-resource-2016-09-29 ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/tagging?Operation=Tag", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource2016_09_29", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-29/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-09-29/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2016-09-29 ([get-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistribution2016_09_29", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-distribution-result))

(clojure.core/defn create-streaming-distribution-with-tags-2016-09-29 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution?WithTags", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistributionWithTags2016_09_29", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-29/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-29/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2016-09-29 ([update-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDistribution2016_09_29", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-09-29/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-09-29/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-09-29/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-09-29/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-09-29/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-09-29/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-09-29/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-09-29/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-09-29/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-29/invalid-web-acl-id, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-09-29/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-09-29/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-09-29/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-09-29/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-09-29/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-09-29/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-09-29/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-09-29/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2016-09-29/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-09-29/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/update-distribution-result))

(clojure.core/defn delete-streaming-distribution-2016-09-29 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStreamingDistribution2016_09_29", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2016-09-29 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2016_09_29", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2016-09-29 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution?WithTags", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistributionWithTags2016_09_29", :http.request.configuration/output-deser-fn response-create-distribution-with-tags-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-09-29/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-09-29/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-09-29/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-09-29/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-09-29/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-09-29/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-09-29/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-09-29/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-09-29/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-09-29/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-29/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-29/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-09-29/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-09-29/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-09-29/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-09-29/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-09-29/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-09-29/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-09-29/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-09-29/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-09-29/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-29/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-09-29/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-distribution-with-tags-result))

(clojure.core/defn get-invalidation-2016-09-29 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvalidation2016_09_29", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2016-09-29/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-invalidation-result))

(clojure.core/defn create-streaming-distribution-2016-09-29 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistribution2016_09_29", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-29/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-result))

(clojure.core/defn list-tags-for-resource-2016-09-29 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/tagging", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource2016_09_29", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-29/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-09-29/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2016-09-29 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistribution2016_09_29", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-result))

(clojure.core/defn create-distribution-2016-09-29 ([create-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistribution2016_09_29", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-09-29/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-09-29/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-09-29/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-09-29/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-09-29/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-09-29/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-09-29/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-09-29/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-09-29/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-09-29/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-29/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-29/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-09-29/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-09-29/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-09-29/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-09-29/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-09-29/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-09-29/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-09-29/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-09-29/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-09-29/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-09-29/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-distribution-result))

(clojure.core/defn get-streaming-distribution-config-2016-09-29 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistributionConfig2016_09_29", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-config-result))

(clojure.core/defn list-distributions-2016-09-29 ([] (list-distributions-2016-09-29 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributions2016_09_29", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2016-09-29 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-09-29/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-distributions-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2016-09-29 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2016_09_29", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2016-09-29 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInvalidations2016_09_29", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-invalidations-result))

(clojure.core/defn untag-resource-2016-09-29 ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/tagging?Operation=Untag", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource2016_09_29", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-29/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-09-29/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2016-09-29 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2016_09_29", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2016-09-29 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2016_09_29", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2016-09-29/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2016-09-29 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateStreamingDistribution2016_09_29", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2016-09-29/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2016-09-29 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistributionConfig2016_09_29", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-distribution-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2016-09-29 ([] (list-cloud-front-origin-access-identities-2016-09-29 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2016_09_29", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2016-09-29 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-09-29/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2016-09-29 ([] (list-streaming-distributions-2016-09-29 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamingDistributions2016_09_29", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2016-09-29 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-09-29/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-streaming-distributions-result))

(clojure.core/defn delete-distribution-2016-09-29 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDistribution2016_09_29", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2016-09-29/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2016-09-29 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInvalidation2016_09_29", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2016-09-29/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2016-09-29/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-invalidation-result))

(clojure.core/defn list-distributions-by-web-acl-id-2016-09-29 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributionsByWebACLId2016_09_29", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-29/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2016-09-29 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2016_09_29", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2016-09-29/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-cloud-front-origin-access-identity-result))
