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

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__21570__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__21570__auto__) true (clojure.core/= "false" boolstr__21570__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar83767 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar83767 ["Quantity" :content]))} (letvar83767 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar83767 ["Items" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar83863 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar83863 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar83863 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar83863 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar83863 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar83959 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar83959 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar83959 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar83959 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar84072 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar84072 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar84072 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar84072 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar84072 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar84207 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar84207 ["GeoRestriction" :content]))})))

(clojure.core/defn- deserstring [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar84308 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar84308 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar84308 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar84308 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar84308 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar84308 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar84308 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar84308 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar84308 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar84404 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar84404 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar84404 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar84404 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar84404 ["Quantity" :content]))} (letvar84404 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar84404 ["NextMarker" :content]))) (letvar84404 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar84404 ["Items" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar84500 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? false :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? false :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? false :xmlAttribute? nil), "QueryStringCacheKeys" (portkey.aws/search-for-tag input "QueryStringCacheKeys" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar84500 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar84500 ["Cookies" :content]))} (letvar84500 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar84500 ["Headers" :content]))) (letvar84500 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar84500 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar84596 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar84596 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar84596 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar84726 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar84726 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar84726 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar84726 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar84726 ["Quantity" :content]))} (letvar84726 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar84726 ["NextMarker" :content]))) (letvar84726 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar84726 ["Items" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar84827 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar84827 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar84827 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar84827 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar84827 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar84827 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar84827 ["StreamingDistributionConfig" :content]))} (letvar84827 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar84827 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar84928 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? false :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? false :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? false :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar84928 ["ErrorCode" :content]))} (letvar84928 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar84928 ["ResponsePagePath" :content]))) (letvar84928 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar84928 ["ResponseCode" :content]))) (letvar84928 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar84928 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar85041 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? false :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar85041 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar85041 ["AwsAccountNumber" :content]))) (letvar85041 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar85041 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar85156 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar85156 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar85156 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar85257 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar85257 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar85257 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar85370 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar85370 ["Quantity" :content]))} (letvar85370 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar85370 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar85466 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar85466 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar85466 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar85466 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar85466 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar85466 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar85466 ["MinTTL" :content]))} (letvar85466 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar85466 ["SmoothStreaming" :content]))) (letvar85466 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar85466 ["Compress" :content]))) (letvar85466 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar85466 ["MaxTTL" :content]))) (letvar85466 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar85466 ["AllowedMethods" :content]))) (letvar85466 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar85466 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar85562 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar85562 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar85562 ["Quantity" :content]))} (letvar85562 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar85562 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar85658 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? false :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? false :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? false :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar85658 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar85658 ["DomainName" :content]))} (letvar85658 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar85658 ["OriginPath" :content]))) (letvar85658 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar85658 ["CustomHeaders" :content]))) (letvar85658 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar85658 ["S3OriginConfig" :content]))) (letvar85658 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar85658 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar85756 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar85756 ["Quantity" :content]))} (letvar85756 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar85756 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar85852 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar85852 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar85852 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar85852 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar85852 ["Quantity" :content]))} (letvar85852 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar85852 ["NextMarker" :content]))) (letvar85852 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar85852 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar85948 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar85948 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar85948 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar86044 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar86044 ["Quantity" :content]))} (letvar86044 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar86044 ["Items" :content]))))))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar86140 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar86140 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar86140 ["Items" :content]))} (letvar86140 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar86140 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar86241 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? false :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? false :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? false :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar86241 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar86241 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar86241 ["OriginProtocolPolicy" :content]))} (letvar86241 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar86241 ["OriginSslProtocols" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar86337 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar86337 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar86337 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar86433 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar86433 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar86433 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar86433 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar86433 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar86433 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar86433 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar86433 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar86433 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar86433 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar86433 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar86433 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar86529 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar86529 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar86529 ["S3CanonicalUserId" :content]))} (letvar86529 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar86529 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar86659 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar86659 ["Quantity" :content]))} (letvar86659 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar86659 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar86755 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar86755 ["Quantity" :content]))} (letvar86755 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar86755 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar86851 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar86851 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar86851 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar86851 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar86851 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar86851 ["Enabled" :content]))} (letvar86851 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar86851 ["DefaultRootObject" :content]))) (letvar86851 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar86851 ["IsIPV6Enabled" :content]))) (letvar86851 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar86851 ["Restrictions" :content]))) (letvar86851 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar86851 ["WebACLId" :content]))) (letvar86851 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar86851 ["Logging" :content]))) (letvar86851 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar86851 ["CacheBehaviors" :content]))) (letvar86851 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar86851 ["CustomErrorResponses" :content]))) (letvar86851 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar86851 ["Aliases" :content]))) (letvar86851 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar86851 ["PriceClass" :content]))) (letvar86851 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar86851 ["HttpVersion" :content]))) (letvar86851 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar86851 ["ViewerCertificate" :content]))))))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-value [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-method [input] (clojure.core/get {"GET" :get, "HEAD" :head, "POST" :post, "PUT" :put, "PATCH" :patch, "OPTIONS" :options, "DELETE" :delete} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-custom-header coll))) input))

(clojure.core/defn- deser-origin-protocol-policy [input] (clojure.core/get {"http-only" :httponly, "match-viewer" :matchviewer, "https-only" :httpsonly} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signer coll))) input))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (clojure.core/get {"blacklist" :blacklist, "whitelist" :whitelist, "none" :none} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar87069 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar87069 ["Quantity" :content]))} (letvar87069 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar87069 ["Items" :content]))))))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar87167 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar87167 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar87167 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar87167 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar87280 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? false :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar87280 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar87280 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar87376 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar87376 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar87376 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar87376 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar87376 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar87376 ["Enabled" :content]))} (letvar87376 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar87376 ["Aliases" :content]))) (letvar87376 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar87376 ["Logging" :content]))) (letvar87376 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar87376 ["PriceClass" :content]))))))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar87472 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar87472 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar87585 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar87585 ["Key" :content]))} (letvar87585 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar87585 ["Value" :content]))))))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar87681 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar87681 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar87681 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar87681 ["Prefix" :content]))})))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar87777 {"IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar87777 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar87777 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar87777 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar87777 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar87777 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar87777 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar87777 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar87777 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar87777 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar87777 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar87777 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar87777 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar87777 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar87777 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar87777 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar87777 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar87777 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar87777 ["PriceClass" :content]))})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar87878 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar87878 ["Quantity" :content]))} (letvar87878 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar87878 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar87979 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar87979 ["Quantity" :content]))} (letvar87979 "Items") (clojure.core/assoc :items (deser-origin-list (clojure.core/get-in letvar87979 ["Items" :content]))))))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar88092 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar88092 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar88092 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar88092 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar88092 ["Quantity" :content]))} (letvar88092 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar88092 ["NextMarker" :content]))) (letvar88092 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar88092 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-http-version [input] (clojure.core/get {"http1.1" :http-11, "http2" :http-2} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar88198 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? false :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar88198 ["Forward" :content]))} (letvar88198 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar88198 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar88294 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar88294 ["Quantity" :content]))} (letvar88294 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar88294 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar88407 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar88407 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar88407 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar88407 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar88407 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar88407 ["MinTTL" :content]))} (letvar88407 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar88407 ["SmoothStreaming" :content]))) (letvar88407 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar88407 ["Compress" :content]))) (letvar88407 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar88407 ["MaxTTL" :content]))) (letvar88407 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar88407 ["AllowedMethods" :content]))) (letvar88407 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar88407 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar88503 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar88503 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar88503 ["Quantity" :content]))} (letvar88503 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar88503 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar88599 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? false :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? false :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? false :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? false :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? false :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? false :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar88599 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar88599 ["CloudFrontDefaultCertificate" :content]))) (letvar88599 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar88599 ["IAMCertificateId" :content]))) (letvar88599 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar88599 ["ACMCertificateArn" :content]))) (letvar88599 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar88599 ["SSLSupportMethod" :content]))) (letvar88599 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar88599 ["MinimumProtocolVersion" :content]))) (letvar88599 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar88599 ["Certificate" :content]))) (letvar88599 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar88599 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar88695 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar88695 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar88695 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar88791 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar88791 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar88791 ["Quantity" :content]))} (letvar88791 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar88791 ["Items" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-result ([input] (response-list-tags-for-resource-result nil input)) ([resultWrapper88793 input] (clojure.core/let [rawinput88792 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88794 {"Tags" (portkey.aws/search-for-tag rawinput88792 "Tags" :flattened? false :result-wrapper resultWrapper88793)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar88794 ["Tags" :content]))}))))

(clojure.core/defn- response-no-such-origin ([input] (response-no-such-origin nil input)) ([resultWrapper88796 input] (clojure.core/let [rawinput88795 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88797 {"Message" (portkey.aws/search-for-tag rawinput88795 "Message" :flattened? false :result-wrapper resultWrapper88796)}] (clojure.core/cond-> {} (letvar88797 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88797 ["Message" :content])))))))

(clojure.core/defn- response-invalid-protocol-settings ([input] (response-invalid-protocol-settings nil input)) ([resultWrapper88799 input] (clojure.core/let [rawinput88798 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88800 {"Message" (portkey.aws/search-for-tag rawinput88798 "Message" :flattened? false :result-wrapper resultWrapper88799)}] (clojure.core/cond-> {} (letvar88800 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88800 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list ([input] (response-too-many-cookie-names-in-white-list nil input)) ([resultWrapper88802 input] (clojure.core/let [rawinput88801 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88803 {"Message" (portkey.aws/search-for-tag rawinput88801 "Message" :flattened? false :result-wrapper resultWrapper88802)}] (clojure.core/cond-> {} (letvar88803 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88803 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cache-behaviors ([input] (response-too-many-cache-behaviors nil input)) ([resultWrapper88805 input] (clojure.core/let [rawinput88804 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88806 {"Message" (portkey.aws/search-for-tag rawinput88804 "Message" :flattened? false :result-wrapper resultWrapper88805)}] (clojure.core/cond-> {} (letvar88806 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88806 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origin-custom-headers ([input] (response-too-many-origin-custom-headers nil input)) ([resultWrapper88808 input] (clojure.core/let [rawinput88807 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88809 {"Message" (portkey.aws/search-for-tag rawinput88807 "Message" :flattened? false :result-wrapper resultWrapper88808)}] (clojure.core/cond-> {} (letvar88809 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88809 ["Message" :content])))))))

(clojure.core/defn- response-too-many-streaming-distributions ([input] (response-too-many-streaming-distributions nil input)) ([resultWrapper88811 input] (clojure.core/let [rawinput88810 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88812 {"Message" (portkey.aws/search-for-tag rawinput88810 "Message" :flattened? false :result-wrapper resultWrapper88811)}] (clojure.core/cond-> {} (letvar88812 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88812 ["Message" :content])))))))

(clojure.core/defn- response-get-streaming-distribution-result ([input] (response-get-streaming-distribution-result nil input)) ([resultWrapper88814 input] (clojure.core/let [rawinput88813 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88815 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput88813 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper88814), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88815 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar88815 ["StreamingDistribution" :content]))) (letvar88815 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88815 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es ([input] (response-too-many-streaming-distribution-cnam-es nil input)) ([resultWrapper88817 input] (clojure.core/let [rawinput88816 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88818 {"Message" (portkey.aws/search-for-tag rawinput88816 "Message" :flattened? false :result-wrapper resultWrapper88817)}] (clojure.core/cond-> {} (letvar88818 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88818 ["Message" :content])))))))

(clojure.core/defn- response-invalid-viewer-certificate ([input] (response-invalid-viewer-certificate nil input)) ([resultWrapper88820 input] (clojure.core/let [rawinput88819 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88821 {"Message" (portkey.aws/search-for-tag rawinput88819 "Message" :flattened? false :result-wrapper resultWrapper88820)}] (clojure.core/cond-> {} (letvar88821 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88821 ["Message" :content])))))))

(clojure.core/defn- response-invalid-argument ([input] (response-invalid-argument nil input)) ([resultWrapper88823 input] (clojure.core/let [rawinput88822 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88824 {"Message" (portkey.aws/search-for-tag rawinput88822 "Message" :flattened? false :result-wrapper resultWrapper88823)}] (clojure.core/cond-> {} (letvar88824 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88824 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-not-disabled ([input] (response-streaming-distribution-not-disabled nil input)) ([resultWrapper88826 input] (clojure.core/let [rawinput88825 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88827 {"Message" (portkey.aws/search-for-tag rawinput88825 "Message" :flattened? false :result-wrapper resultWrapper88826)}] (clojure.core/cond-> {} (letvar88827 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88827 ["Message" :content])))))))

(clojure.core/defn- response-too-many-certificates ([input] (response-too-many-certificates nil input)) ([resultWrapper88829 input] (clojure.core/let [rawinput88828 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88830 {"Message" (portkey.aws/search-for-tag rawinput88828 "Message" :flattened? false :result-wrapper resultWrapper88829)}] (clojure.core/cond-> {} (letvar88830 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88830 ["Message" :content])))))))

(clojure.core/defn- response-access-denied ([input] (response-access-denied nil input)) ([resultWrapper88832 input] (clojure.core/let [rawinput88831 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88833 {"Message" (portkey.aws/search-for-tag rawinput88831 "Message" :flattened? false :result-wrapper resultWrapper88832)}] (clojure.core/cond-> {} (letvar88833 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88833 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use ([input] (response-cloud-front-origin-access-identity-in-use nil input)) ([resultWrapper88835 input] (clojure.core/let [rawinput88834 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88836 {"Message" (portkey.aws/search-for-tag rawinput88834 "Message" :flattened? false :result-wrapper resultWrapper88835)}] (clojure.core/cond-> {} (letvar88836 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88836 ["Message" :content])))))))

(clojure.core/defn- response-no-such-resource ([input] (response-no-such-resource nil input)) ([resultWrapper88838 input] (clojure.core/let [rawinput88837 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88839 {"Message" (portkey.aws/search-for-tag rawinput88837 "Message" :flattened? false :result-wrapper resultWrapper88838)}] (clojure.core/cond-> {} (letvar88839 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88839 ["Message" :content])))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result ([input] (response-update-cloud-front-origin-access-identity-result nil input)) ([resultWrapper88841 input] (clojure.core/let [rawinput88840 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88842 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput88840 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper88841), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88842 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar88842 ["CloudFrontOriginAccessIdentity" :content]))) (letvar88842 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88842 ["ETag"])))))))

(clojure.core/defn- response-invalid-error-code ([input] (response-invalid-error-code nil input)) ([resultWrapper88844 input] (clojure.core/let [rawinput88843 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88845 {"Message" (portkey.aws/search-for-tag rawinput88843 "Message" :flattened? false :result-wrapper resultWrapper88844)}] (clojure.core/cond-> {} (letvar88845 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88845 ["Message" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-result ([input] (response-create-streaming-distribution-result nil input)) ([resultWrapper88847 input] (clojure.core/let [rawinput88846 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88848 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput88846 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper88847), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88848 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar88848 ["StreamingDistribution" :content]))) (letvar88848 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar88848 ["Location"]))) (letvar88848 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88848 ["ETag"])))))))

(clojure.core/defn- response-invalid-relative-path ([input] (response-invalid-relative-path nil input)) ([resultWrapper88850 input] (clojure.core/let [rawinput88849 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88851 {"Message" (portkey.aws/search-for-tag rawinput88849 "Message" :flattened? false :result-wrapper resultWrapper88850)}] (clojure.core/cond-> {} (letvar88851 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88851 ["Message" :content])))))))

(clojure.core/defn- response-invalid-location-code ([input] (response-invalid-location-code nil input)) ([resultWrapper88853 input] (clojure.core/let [rawinput88852 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88854 {"Message" (portkey.aws/search-for-tag rawinput88852 "Message" :flattened? false :result-wrapper resultWrapper88853)}] (clojure.core/cond-> {} (letvar88854 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88854 ["Message" :content])))))))

(clojure.core/defn- response-invalid-web-acl-id ([input] (response-invalid-web-acl-id nil input)) ([resultWrapper88856 input] (clojure.core/let [rawinput88855 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88857 {"Message" (portkey.aws/search-for-tag rawinput88855 "Message" :flattened? false :result-wrapper resultWrapper88856)}] (clojure.core/cond-> {} (letvar88857 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88857 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin ([input] (response-invalid-origin nil input)) ([resultWrapper88859 input] (clojure.core/let [rawinput88858 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88860 {"Message" (portkey.aws/search-for-tag rawinput88858 "Message" :flattened? false :result-wrapper resultWrapper88859)}] (clojure.core/cond-> {} (letvar88860 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88860 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities ([input] (response-too-many-cloud-front-origin-access-identities nil input)) ([resultWrapper88862 input] (clojure.core/let [rawinput88861 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88863 {"Message" (portkey.aws/search-for-tag rawinput88861 "Message" :flattened? false :result-wrapper resultWrapper88862)}] (clojure.core/cond-> {} (letvar88863 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88863 ["Message" :content])))))))

(clojure.core/defn- response-update-distribution-result ([input] (response-update-distribution-result nil input)) ([resultWrapper88865 input] (clojure.core/let [rawinput88864 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88866 {"Distribution" (portkey.aws/search-for-tag rawinput88864 "Distribution" :flattened? false :result-wrapper resultWrapper88865), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88866 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar88866 ["Distribution" :content]))) (letvar88866 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88866 ["ETag"])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result ([input] (response-get-cloud-front-origin-access-identity-result nil input)) ([resultWrapper88868 input] (clojure.core/let [rawinput88867 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88869 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput88867 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper88868), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88869 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar88869 ["CloudFrontOriginAccessIdentity" :content]))) (letvar88869 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88869 ["ETag"])))))))

(clojure.core/defn- response-invalid-query-string-parameters ([input] (response-invalid-query-string-parameters nil input)) ([resultWrapper88871 input] (clojure.core/let [rawinput88870 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88872 {"Message" (portkey.aws/search-for-tag rawinput88870 "Message" :flattened? false :result-wrapper resultWrapper88871)}] (clojure.core/cond-> {} (letvar88872 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88872 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origins ([input] (response-too-many-origins nil input)) ([resultWrapper88874 input] (clojure.core/let [rawinput88873 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88875 {"Message" (portkey.aws/search-for-tag rawinput88873 "Message" :flattened? false :result-wrapper resultWrapper88874)}] (clojure.core/cond-> {} (letvar88875 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88875 ["Message" :content])))))))

(clojure.core/defn- response-invalid-ttl-order ([input] (response-invalid-ttl-order nil input)) ([resultWrapper88877 input] (clojure.core/let [rawinput88876 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88878 {"Message" (portkey.aws/search-for-tag rawinput88876 "Message" :flattened? false :result-wrapper resultWrapper88877)}] (clojure.core/cond-> {} (letvar88878 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88878 ["Message" :content])))))))

(clojure.core/defn- response-no-such-streaming-distribution ([input] (response-no-such-streaming-distribution nil input)) ([resultWrapper88880 input] (clojure.core/let [rawinput88879 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88881 {"Message" (portkey.aws/search-for-tag rawinput88879 "Message" :flattened? false :result-wrapper resultWrapper88880)}] (clojure.core/cond-> {} (letvar88881 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88881 ["Message" :content])))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result ([input] (response-create-cloud-front-origin-access-identity-result nil input)) ([resultWrapper88883 input] (clojure.core/let [rawinput88882 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88884 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput88882 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper88883), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88884 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar88884 ["CloudFrontOriginAccessIdentity" :content]))) (letvar88884 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar88884 ["Location"]))) (letvar88884 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88884 ["ETag"])))))))

(clojure.core/defn- response-cname-already-exists ([input] (response-cname-already-exists nil input)) ([resultWrapper88886 input] (clojure.core/let [rawinput88885 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88887 {"Message" (portkey.aws/search-for-tag rawinput88885 "Message" :flattened? false :result-wrapper resultWrapper88886)}] (clojure.core/cond-> {} (letvar88887 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88887 ["Message" :content])))))))

(clojure.core/defn- response-invalid-default-root-object ([input] (response-invalid-default-root-object nil input)) ([resultWrapper88889 input] (clojure.core/let [rawinput88888 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88890 {"Message" (portkey.aws/search-for-tag rawinput88888 "Message" :flattened? false :result-wrapper resultWrapper88889)}] (clojure.core/cond-> {} (letvar88890 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88890 ["Message" :content])))))))

(clojure.core/defn- response-invalid-response-code ([input] (response-invalid-response-code nil input)) ([resultWrapper88892 input] (clojure.core/let [rawinput88891 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88893 {"Message" (portkey.aws/search-for-tag rawinput88891 "Message" :flattened? false :result-wrapper resultWrapper88892)}] (clojure.core/cond-> {} (letvar88893 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88893 ["Message" :content])))))))

(clojure.core/defn- response-no-such-invalidation ([input] (response-no-such-invalidation nil input)) ([resultWrapper88895 input] (clojure.core/let [rawinput88894 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88896 {"Message" (portkey.aws/search-for-tag rawinput88894 "Message" :flattened? false :result-wrapper resultWrapper88895)}] (clojure.core/cond-> {} (letvar88896 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88896 ["Message" :content])))))))

(clojure.core/defn- response-too-many-invalidations-in-progress ([input] (response-too-many-invalidations-in-progress nil input)) ([resultWrapper88898 input] (clojure.core/let [rawinput88897 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88899 {"Message" (portkey.aws/search-for-tag rawinput88897 "Message" :flattened? false :result-wrapper resultWrapper88898)}] (clojure.core/cond-> {} (letvar88899 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88899 ["Message" :content])))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result ([input] (response-list-cloud-front-origin-access-identities-result nil input)) ([resultWrapper88901 input] (clojure.core/let [rawinput88900 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88902 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput88900 "CloudFrontOriginAccessIdentityList" :flattened? false :result-wrapper resultWrapper88901)}] (clojure.core/cond-> {} (letvar88902 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar88902 ["CloudFrontOriginAccessIdentityList" :content])))))))

(clojure.core/defn- response-invalid-forward-cookies ([input] (response-invalid-forward-cookies nil input)) ([resultWrapper88904 input] (clojure.core/let [rawinput88903 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88905 {"Message" (portkey.aws/search-for-tag rawinput88903 "Message" :flattened? false :result-wrapper resultWrapper88904)}] (clojure.core/cond-> {} (letvar88905 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88905 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-config-result ([input] (response-get-distribution-config-result nil input)) ([resultWrapper88907 input] (clojure.core/let [rawinput88906 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88908 {"DistributionConfig" (portkey.aws/search-for-tag rawinput88906 "DistributionConfig" :flattened? false :result-wrapper resultWrapper88907), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88908 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar88908 ["DistributionConfig" :content]))) (letvar88908 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88908 ["ETag"])))))))

(clojure.core/defn- response-invalid-required-protocol ([input] (response-invalid-required-protocol nil input)) ([resultWrapper88910 input] (clojure.core/let [rawinput88909 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88911 {"Message" (portkey.aws/search-for-tag rawinput88909 "Message" :flattened? false :result-wrapper resultWrapper88910)}] (clojure.core/cond-> {} (letvar88911 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88911 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-result ([input] (response-get-distribution-result nil input)) ([resultWrapper88913 input] (clojure.core/let [rawinput88912 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88914 {"Distribution" (portkey.aws/search-for-tag rawinput88912 "Distribution" :flattened? false :result-wrapper resultWrapper88913), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88914 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar88914 ["Distribution" :content]))) (letvar88914 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88914 ["ETag"])))))))

(clojure.core/defn- response-get-streaming-distribution-config-result ([input] (response-get-streaming-distribution-config-result nil input)) ([resultWrapper88916 input] (clojure.core/let [rawinput88915 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88917 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput88915 "StreamingDistributionConfig" :flattened? false :result-wrapper resultWrapper88916), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88917 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar88917 ["StreamingDistributionConfig" :content]))) (letvar88917 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88917 ["ETag"])))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin ([input] (response-invalid-headers-for-s-3-origin nil input)) ([resultWrapper88919 input] (clojure.core/let [rawinput88918 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88920 {"Message" (portkey.aws/search-for-tag rawinput88918 "Message" :flattened? false :result-wrapper resultWrapper88919)}] (clojure.core/cond-> {} (letvar88920 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88920 ["Message" :content])))))))

(clojure.core/defn- response-too-many-distribution-cnam-es ([input] (response-too-many-distribution-cnam-es nil input)) ([resultWrapper88922 input] (clojure.core/let [rawinput88921 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88923 {"Message" (portkey.aws/search-for-tag rawinput88921 "Message" :flattened? false :result-wrapper resultWrapper88922)}] (clojure.core/cond-> {} (letvar88923 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88923 ["Message" :content])))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter ([input] (response-invalid-geo-restriction-parameter nil input)) ([resultWrapper88925 input] (clojure.core/let [rawinput88924 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88926 {"Message" (portkey.aws/search-for-tag rawinput88924 "Message" :flattened? false :result-wrapper resultWrapper88925)}] (clojure.core/cond-> {} (letvar88926 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88926 ["Message" :content])))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity ([input] (response-no-such-cloud-front-origin-access-identity nil input)) ([resultWrapper88928 input] (clojure.core/let [rawinput88927 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88929 {"Message" (portkey.aws/search-for-tag rawinput88927 "Message" :flattened? false :result-wrapper resultWrapper88928)}] (clojure.core/cond-> {} (letvar88929 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88929 ["Message" :content])))))))

(clojure.core/defn- response-list-invalidations-result ([input] (response-list-invalidations-result nil input)) ([resultWrapper88931 input] (clojure.core/let [rawinput88930 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88932 {"InvalidationList" (portkey.aws/search-for-tag rawinput88930 "InvalidationList" :flattened? false :result-wrapper resultWrapper88931)}] (clojure.core/cond-> {} (letvar88932 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar88932 ["InvalidationList" :content])))))))

(clojure.core/defn- response-batch-too-large ([input] (response-batch-too-large nil input)) ([resultWrapper88934 input] (clojure.core/let [rawinput88933 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88935 {"Message" (portkey.aws/search-for-tag rawinput88933 "Message" :flattened? false :result-wrapper resultWrapper88934)}] (clojure.core/cond-> {} (letvar88935 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88935 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-with-tags-result ([input] (response-create-distribution-with-tags-result nil input)) ([resultWrapper88937 input] (clojure.core/let [rawinput88936 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88938 {"Distribution" (portkey.aws/search-for-tag rawinput88936 "Distribution" :flattened? false :result-wrapper resultWrapper88937), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88938 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar88938 ["Distribution" :content]))) (letvar88938 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar88938 ["Location"]))) (letvar88938 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88938 ["ETag"])))))))

(clojure.core/defn- response-list-streaming-distributions-result ([input] (response-list-streaming-distributions-result nil input)) ([resultWrapper88940 input] (clojure.core/let [rawinput88939 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88941 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput88939 "StreamingDistributionList" :flattened? false :result-wrapper resultWrapper88940)}] (clojure.core/cond-> {} (letvar88941 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar88941 ["StreamingDistributionList" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result ([input] (response-create-streaming-distribution-with-tags-result nil input)) ([resultWrapper88943 input] (clojure.core/let [rawinput88942 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88944 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput88942 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper88943), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88944 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar88944 ["StreamingDistribution" :content]))) (letvar88944 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar88944 ["Location"]))) (letvar88944 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88944 ["ETag"])))))))

(clojure.core/defn- response-create-invalidation-result ([input] (response-create-invalidation-result nil input)) ([resultWrapper88946 input] (clojure.core/let [rawinput88945 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88947 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput88945 "Invalidation" :flattened? false :result-wrapper resultWrapper88946)}] (clojure.core/cond-> {} (letvar88947 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar88947 ["Location"]))) (letvar88947 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar88947 ["Invalidation" :content])))))))

(clojure.core/defn- response-missing-body ([input] (response-missing-body nil input)) ([resultWrapper88949 input] (clojure.core/let [rawinput88948 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88950 {"Message" (portkey.aws/search-for-tag rawinput88948 "Message" :flattened? false :result-wrapper resultWrapper88949)}] (clojure.core/cond-> {} (letvar88950 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88950 ["Message" :content])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result ([input] (response-get-cloud-front-origin-access-identity-config-result nil input)) ([resultWrapper88952 input] (clojure.core/let [rawinput88951 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88953 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput88951 "CloudFrontOriginAccessIdentityConfig" :flattened? false :result-wrapper resultWrapper88952), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88953 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar88953 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar88953 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88953 ["ETag"])))))))

(clojure.core/defn- response-distribution-not-disabled ([input] (response-distribution-not-disabled nil input)) ([resultWrapper88955 input] (clojure.core/let [rawinput88954 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88956 {"Message" (portkey.aws/search-for-tag rawinput88954 "Message" :flattened? false :result-wrapper resultWrapper88955)}] (clojure.core/cond-> {} (letvar88956 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88956 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists ([input] (response-cloud-front-origin-access-identity-already-exists nil input)) ([resultWrapper88958 input] (clojure.core/let [rawinput88957 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88959 {"Message" (portkey.aws/search-for-tag rawinput88957 "Message" :flattened? false :result-wrapper resultWrapper88958)}] (clojure.core/cond-> {} (letvar88959 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88959 ["Message" :content])))))))

(clojure.core/defn- response-precondition-failed ([input] (response-precondition-failed nil input)) ([resultWrapper88961 input] (clojure.core/let [rawinput88960 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88962 {"Message" (portkey.aws/search-for-tag rawinput88960 "Message" :flattened? false :result-wrapper resultWrapper88961)}] (clojure.core/cond-> {} (letvar88962 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88962 ["Message" :content])))))))

(clojure.core/defn- response-distribution-already-exists ([input] (response-distribution-already-exists nil input)) ([resultWrapper88964 input] (clojure.core/let [rawinput88963 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88965 {"Message" (portkey.aws/search-for-tag rawinput88963 "Message" :flattened? false :result-wrapper resultWrapper88964)}] (clojure.core/cond-> {} (letvar88965 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88965 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-access-identity ([input] (response-invalid-origin-access-identity nil input)) ([resultWrapper88967 input] (clojure.core/let [rawinput88966 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88968 {"Message" (portkey.aws/search-for-tag rawinput88966 "Message" :flattened? false :result-wrapper resultWrapper88967)}] (clojure.core/cond-> {} (letvar88968 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88968 ["Message" :content])))))))

(clojure.core/defn- response-too-many-trusted-signers ([input] (response-too-many-trusted-signers nil input)) ([resultWrapper88970 input] (clojure.core/let [rawinput88969 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88971 {"Message" (portkey.aws/search-for-tag rawinput88969 "Message" :flattened? false :result-wrapper resultWrapper88970)}] (clojure.core/cond-> {} (letvar88971 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88971 ["Message" :content])))))))

(clojure.core/defn- response-invalid-minimum-protocol-version ([input] (response-invalid-minimum-protocol-version nil input)) ([resultWrapper88973 input] (clojure.core/let [rawinput88972 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88974 {"Message" (portkey.aws/search-for-tag rawinput88972 "Message" :flattened? false :result-wrapper resultWrapper88973)}] (clojure.core/cond-> {} (letvar88974 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88974 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-already-exists ([input] (response-streaming-distribution-already-exists nil input)) ([resultWrapper88976 input] (clojure.core/let [rawinput88975 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88977 {"Message" (portkey.aws/search-for-tag rawinput88975 "Message" :flattened? false :result-wrapper resultWrapper88976)}] (clojure.core/cond-> {} (letvar88977 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88977 ["Message" :content])))))))

(clojure.core/defn- response-invalid-if-match-version ([input] (response-invalid-if-match-version nil input)) ([resultWrapper88979 input] (clojure.core/let [rawinput88978 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88980 {"Message" (portkey.aws/search-for-tag rawinput88978 "Message" :flattened? false :result-wrapper resultWrapper88979)}] (clojure.core/cond-> {} (letvar88980 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88980 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-result ([input] (response-create-distribution-result nil input)) ([resultWrapper88982 input] (clojure.core/let [rawinput88981 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88983 {"Distribution" (portkey.aws/search-for-tag rawinput88981 "Distribution" :flattened? false :result-wrapper resultWrapper88982), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88983 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar88983 ["Distribution" :content]))) (letvar88983 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar88983 ["Location"]))) (letvar88983 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88983 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions ([input] (response-too-many-distributions nil input)) ([resultWrapper88985 input] (clojure.core/let [rawinput88984 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88986 {"Message" (portkey.aws/search-for-tag rawinput88984 "Message" :flattened? false :result-wrapper resultWrapper88985)}] (clojure.core/cond-> {} (letvar88986 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88986 ["Message" :content])))))))

(clojure.core/defn- response-no-such-distribution ([input] (response-no-such-distribution nil input)) ([resultWrapper88988 input] (clojure.core/let [rawinput88987 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88989 {"Message" (portkey.aws/search-for-tag rawinput88987 "Message" :flattened? false :result-wrapper resultWrapper88988)}] (clojure.core/cond-> {} (letvar88989 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88989 ["Message" :content])))))))

(clojure.core/defn- response-update-streaming-distribution-result ([input] (response-update-streaming-distribution-result nil input)) ([resultWrapper88991 input] (clojure.core/let [rawinput88990 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88992 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput88990 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper88991), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar88992 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar88992 ["StreamingDistribution" :content]))) (letvar88992 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar88992 ["ETag"])))))))

(clojure.core/defn- response-illegal-update ([input] (response-illegal-update nil input)) ([resultWrapper88994 input] (clojure.core/let [rawinput88993 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88995 {"Message" (portkey.aws/search-for-tag rawinput88993 "Message" :flattened? false :result-wrapper resultWrapper88994)}] (clojure.core/cond-> {} (letvar88995 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88995 ["Message" :content])))))))

(clojure.core/defn- response-inconsistent-quantities ([input] (response-inconsistent-quantities nil input)) ([resultWrapper88997 input] (clojure.core/let [rawinput88996 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar88998 {"Message" (portkey.aws/search-for-tag rawinput88996 "Message" :flattened? false :result-wrapper resultWrapper88997)}] (clojure.core/cond-> {} (letvar88998 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar88998 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result ([input] (response-list-distributions-by-web-acl-id-result nil input)) ([resultWrapper89000 input] (clojure.core/let [rawinput88999 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar89001 {"DistributionList" (portkey.aws/search-for-tag rawinput88999 "DistributionList" :flattened? false :result-wrapper resultWrapper89000)}] (clojure.core/cond-> {} (letvar89001 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar89001 ["DistributionList" :content])))))))

(clojure.core/defn- response-too-many-query-string-parameters ([input] (response-too-many-query-string-parameters nil input)) ([resultWrapper89003 input] (clojure.core/let [rawinput89002 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar89004 {"Message" (portkey.aws/search-for-tag rawinput89002 "Message" :flattened? false :result-wrapper resultWrapper89003)}] (clojure.core/cond-> {} (letvar89004 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar89004 ["Message" :content])))))))

(clojure.core/defn- response-invalid-tagging ([input] (response-invalid-tagging nil input)) ([resultWrapper89006 input] (clojure.core/let [rawinput89005 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar89007 {"Message" (portkey.aws/search-for-tag rawinput89005 "Message" :flattened? false :result-wrapper resultWrapper89006)}] (clojure.core/cond-> {} (letvar89007 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar89007 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-result ([input] (response-list-distributions-result nil input)) ([resultWrapper89009 input] (clojure.core/let [rawinput89008 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar89010 {"DistributionList" (portkey.aws/search-for-tag rawinput89008 "DistributionList" :flattened? false :result-wrapper resultWrapper89009)}] (clojure.core/cond-> {} (letvar89010 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar89010 ["DistributionList" :content])))))))

(clojure.core/defn- response-trusted-signer-does-not-exist ([input] (response-trusted-signer-does-not-exist nil input)) ([resultWrapper89012 input] (clojure.core/let [rawinput89011 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar89013 {"Message" (portkey.aws/search-for-tag rawinput89011 "Message" :flattened? false :result-wrapper resultWrapper89012)}] (clojure.core/cond-> {} (letvar89013 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar89013 ["Message" :content])))))))

(clojure.core/defn- response-get-invalidation-result ([input] (response-get-invalidation-result nil input)) ([resultWrapper89015 input] (clojure.core/let [rawinput89014 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar89016 {"Invalidation" (portkey.aws/search-for-tag rawinput89014 "Invalidation" :flattened? false :result-wrapper resultWrapper89015)}] (clojure.core/cond-> {} (letvar89016 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar89016 ["Invalidation" :content])))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values ([input] (response-too-many-headers-in-forwarded-values nil input)) ([resultWrapper89018 input] (clojure.core/let [rawinput89017 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar89019 {"Message" (portkey.aws/search-for-tag rawinput89017 "Message" :flattened? false :result-wrapper resultWrapper89018)}] (clojure.core/cond-> {} (letvar89019 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar89019 ["Message" :content])))))))

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

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21055__auto__] (clojure.core/<= 1 (clojure.core/count s__21055__auto__))) (clojure.core/fn [s__21056__auto__] (clojure.core/< (clojure.core/count s__21056__auto__) 128)) (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21057__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21055__auto__] (clojure.core/<= 0 (clojure.core/count s__21055__auto__))) (clojure.core/fn [s__21056__auto__] (clojure.core/< (clojure.core/count s__21056__auto__) 256)) (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21057__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-29/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__21057__auto__))))

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

(clojure.core/defn tag-resource-2016-09-29 ([tag-resource-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/tagging?Operation=Tag", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource2016_09_29", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-29/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-09-29/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2016-09-29 ([get-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistribution2016_09_29", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-distribution-result))

(clojure.core/defn create-streaming-distribution-with-tags-2016-09-29 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution?WithTags", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistributionWithTags2016_09_29", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-29/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-29/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2016-09-29 ([update-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDistribution2016_09_29", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-09-29/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-09-29/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-09-29/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-09-29/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-09-29/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-09-29/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-09-29/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-09-29/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-09-29/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-29/invalid-web-acl-id, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-09-29/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-09-29/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-09-29/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-09-29/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-09-29/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-09-29/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-09-29/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-09-29/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2016-09-29/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-09-29/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/update-distribution-result))

(clojure.core/defn delete-streaming-distribution-2016-09-29 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStreamingDistribution2016_09_29", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2016-09-29 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2016_09_29", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2016-09-29 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution?WithTags", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistributionWithTags2016_09_29", :http.request.configuration/output-deser-fn response-create-distribution-with-tags-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-09-29/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-09-29/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-09-29/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-09-29/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-09-29/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-09-29/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-09-29/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-09-29/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-09-29/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-09-29/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-29/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-29/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-09-29/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-09-29/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-09-29/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-09-29/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-09-29/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-09-29/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-09-29/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-09-29/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-09-29/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-29/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-09-29/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-distribution-with-tags-result))

(clojure.core/defn get-invalidation-2016-09-29 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvalidation2016_09_29", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2016-09-29/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-invalidation-result))

(clojure.core/defn create-streaming-distribution-2016-09-29 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistribution2016_09_29", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-29/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-streaming-distribution-result))

(clojure.core/defn list-tags-for-resource-2016-09-29 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/tagging", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource2016_09_29", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-29/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-09-29/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2016-09-29 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistribution2016_09_29", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-result))

(clojure.core/defn create-distribution-2016-09-29 ([create-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistribution2016_09_29", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-09-29/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-09-29/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-09-29/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-09-29/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-09-29/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-09-29/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-09-29/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-09-29/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-09-29/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-09-29/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-29/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-29/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-09-29/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-09-29/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-09-29/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-09-29/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-09-29/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-09-29/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-09-29/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-09-29/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-09-29/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-09-29/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-09-29/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-distribution-result))

(clojure.core/defn get-streaming-distribution-config-2016-09-29 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistributionConfig2016_09_29", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-streaming-distribution-config-result))

(clojure.core/defn list-distributions-2016-09-29 ([] (list-distributions-2016-09-29 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributions2016_09_29", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2016-09-29 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-09-29/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-distributions-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2016-09-29 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2016_09_29", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2016-09-29 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInvalidations2016_09_29", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-invalidations-result))

(clojure.core/defn untag-resource-2016-09-29 ([untag-resource-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/tagging?Operation=Untag", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource2016_09_29", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-29/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-09-29/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2016-09-29 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2016_09_29", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2016-09-29 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2016_09_29", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2016-09-29/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2016-09-29 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateStreamingDistribution2016_09_29", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-29/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-29/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-29/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2016-09-29/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-29/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2016-09-29 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{Id}/config", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistributionConfig2016_09_29", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/get-distribution-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2016-09-29 ([] (list-cloud-front-origin-access-identities-2016-09-29 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2016_09_29", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2016-09-29 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-09-29/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2016-09-29 ([] (list-streaming-distributions-2016-09-29 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/streaming-distribution", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamingDistributions2016_09_29", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2016-09-29 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-09-29/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-streaming-distributions-result))

(clojure.core/defn delete-distribution-2016-09-29 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{Id}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDistribution2016_09_29", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2016-09-29/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-29/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-29/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2016-09-29 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInvalidation2016_09_29", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-29/access-denied, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-29/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2016-09-29/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2016-09-29/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-invalidation-result))

(clojure.core/defn list-distributions-by-web-acl-id-2016-09-29 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributionsByWebACLId2016_09_29", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-29/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2016-09-29 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-29/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-29/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-29/origin-access-identity/cloudfront", :http.request.configuration/version "2016-09-29", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-29/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2016_09_29", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2016-09-29/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-29/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2016-09-29/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-29/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-29/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2016-09-29 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-29/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-29/create-cloud-front-origin-access-identity-result))
