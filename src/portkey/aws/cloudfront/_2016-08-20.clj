(ns portkey.aws.cloudfront.-2016-08-20 (:require [portkey.aws]))

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

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})]}))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})]}))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})]}))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})]}))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-08-20/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

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

(clojure.core/declare deser-cookie-preference)

(clojure.core/declare deser-custom-headers)

(clojure.core/declare deser-methods-list)

(clojure.core/declare deser-default-cache-behavior)

(clojure.core/declare deser-trusted-signers)

(clojure.core/declare deser-viewer-certificate)

(clojure.core/declare deser-cloud-front-origin-access-identity-config)

(clojure.core/declare deser-geo-restriction)

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar70036 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar70036 ["Quantity" :content]))} (letvar70036 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar70036 ["Items" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar70132 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar70132 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar70132 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar70132 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar70132 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar70228 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar70228 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar70228 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar70228 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar70341 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar70341 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar70341 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar70341 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar70341 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar70476 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar70476 ["GeoRestriction" :content]))})))

(clojure.core/defn- deserstring [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar70577 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar70577 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar70577 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar70577 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar70577 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar70577 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar70577 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar70577 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar70577 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar70673 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar70673 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar70673 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar70673 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar70673 ["Quantity" :content]))} (letvar70673 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar70673 ["NextMarker" :content]))) (letvar70673 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar70673 ["Items" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar70769 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? false :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? false :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? false :xmlAttribute? nil), "QueryStringCacheKeys" (portkey.aws/search-for-tag input "QueryStringCacheKeys" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar70769 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar70769 ["Cookies" :content]))} (letvar70769 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar70769 ["Headers" :content]))) (letvar70769 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar70769 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar70865 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar70865 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar70865 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar70995 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar70995 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar70995 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar70995 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar70995 ["Quantity" :content]))} (letvar70995 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar70995 ["NextMarker" :content]))) (letvar70995 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar70995 ["Items" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar71096 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar71096 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar71096 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar71096 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar71096 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar71096 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar71096 ["StreamingDistributionConfig" :content]))} (letvar71096 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar71096 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar71197 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? false :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? false :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? false :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar71197 ["ErrorCode" :content]))} (letvar71197 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar71197 ["ResponsePagePath" :content]))) (letvar71197 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar71197 ["ResponseCode" :content]))) (letvar71197 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar71197 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar71310 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? false :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar71310 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar71310 ["AwsAccountNumber" :content]))) (letvar71310 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar71310 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar71425 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar71425 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar71425 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar71526 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar71526 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar71526 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar71639 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar71639 ["Quantity" :content]))} (letvar71639 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar71639 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar71735 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar71735 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar71735 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar71735 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar71735 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar71735 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar71735 ["MinTTL" :content]))} (letvar71735 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar71735 ["SmoothStreaming" :content]))) (letvar71735 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar71735 ["Compress" :content]))) (letvar71735 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar71735 ["MaxTTL" :content]))) (letvar71735 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar71735 ["AllowedMethods" :content]))) (letvar71735 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar71735 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar71831 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar71831 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar71831 ["Quantity" :content]))} (letvar71831 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar71831 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar71927 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? false :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? false :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? false :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar71927 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar71927 ["DomainName" :content]))} (letvar71927 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar71927 ["OriginPath" :content]))) (letvar71927 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar71927 ["CustomHeaders" :content]))) (letvar71927 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar71927 ["S3OriginConfig" :content]))) (letvar71927 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar71927 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar72025 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar72025 ["Quantity" :content]))} (letvar72025 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar72025 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar72121 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar72121 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar72121 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar72121 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar72121 ["Quantity" :content]))} (letvar72121 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar72121 ["NextMarker" :content]))) (letvar72121 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar72121 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar72217 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar72217 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar72217 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar72313 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar72313 ["Quantity" :content]))} (letvar72313 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar72313 ["Items" :content]))))))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar72409 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar72409 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar72409 ["Items" :content]))} (letvar72409 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar72409 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar72510 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? false :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? false :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? false :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar72510 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar72510 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar72510 ["OriginProtocolPolicy" :content]))} (letvar72510 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar72510 ["OriginSslProtocols" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar72606 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar72606 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar72606 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar72702 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar72702 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar72702 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar72702 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar72702 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar72702 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar72702 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar72702 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar72702 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar72702 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar72702 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar72702 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar72798 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar72798 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar72798 ["S3CanonicalUserId" :content]))} (letvar72798 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar72798 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar72928 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar72928 ["Quantity" :content]))} (letvar72928 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar72928 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar73024 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar73024 ["Quantity" :content]))} (letvar73024 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar73024 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar73120 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar73120 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar73120 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar73120 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar73120 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar73120 ["Enabled" :content]))} (letvar73120 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar73120 ["DefaultRootObject" :content]))) (letvar73120 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar73120 ["Restrictions" :content]))) (letvar73120 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar73120 ["WebACLId" :content]))) (letvar73120 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar73120 ["Logging" :content]))) (letvar73120 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar73120 ["CacheBehaviors" :content]))) (letvar73120 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar73120 ["CustomErrorResponses" :content]))) (letvar73120 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar73120 ["Aliases" :content]))) (letvar73120 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar73120 ["PriceClass" :content]))) (letvar73120 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar73120 ["ViewerCertificate" :content]))))))

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

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar73338 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar73338 ["Quantity" :content]))} (letvar73338 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar73338 ["Items" :content]))))))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar73436 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar73436 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar73436 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar73436 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar73549 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? false :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar73549 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar73549 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar73645 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar73645 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar73645 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar73645 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar73645 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar73645 ["Enabled" :content]))} (letvar73645 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar73645 ["Aliases" :content]))) (letvar73645 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar73645 ["Logging" :content]))) (letvar73645 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar73645 ["PriceClass" :content]))))))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar73741 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar73741 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar73854 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar73854 ["Key" :content]))} (letvar73854 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar73854 ["Value" :content]))))))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar73950 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar73950 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar73950 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar73950 ["Prefix" :content]))})))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar74046 {"Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar74046 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar74046 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar74046 ["WebACLId" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar74046 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar74046 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar74046 ["ViewerCertificate" :content])), :domain-name (deserstring (clojure.core/get-in letvar74046 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar74046 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar74046 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar74046 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar74046 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar74046 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar74046 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar74046 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar74046 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar74046 ["PriceClass" :content]))})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar74147 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar74147 ["Quantity" :content]))} (letvar74147 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar74147 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar74248 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar74248 ["Quantity" :content]))} (letvar74248 "Items") (clojure.core/assoc :items (deser-origin-list (clojure.core/get-in letvar74248 ["Items" :content]))))))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar74361 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar74361 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar74361 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar74361 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar74361 ["Quantity" :content]))} (letvar74361 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar74361 ["NextMarker" :content]))) (letvar74361 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar74361 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar74462 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? false :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar74462 ["Forward" :content]))} (letvar74462 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar74462 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar74558 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar74558 ["Quantity" :content]))} (letvar74558 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar74558 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar74671 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar74671 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar74671 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar74671 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar74671 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar74671 ["MinTTL" :content]))} (letvar74671 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar74671 ["SmoothStreaming" :content]))) (letvar74671 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar74671 ["Compress" :content]))) (letvar74671 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar74671 ["MaxTTL" :content]))) (letvar74671 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar74671 ["AllowedMethods" :content]))) (letvar74671 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar74671 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar74767 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar74767 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar74767 ["Quantity" :content]))} (letvar74767 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar74767 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar74863 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? false :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? false :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? false :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? false :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? false :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? false :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar74863 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar74863 ["CloudFrontDefaultCertificate" :content]))) (letvar74863 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar74863 ["IAMCertificateId" :content]))) (letvar74863 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar74863 ["ACMCertificateArn" :content]))) (letvar74863 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar74863 ["SSLSupportMethod" :content]))) (letvar74863 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar74863 ["MinimumProtocolVersion" :content]))) (letvar74863 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar74863 ["Certificate" :content]))) (letvar74863 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar74863 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar74959 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar74959 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar74959 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar75055 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar75055 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar75055 ["Quantity" :content]))} (letvar75055 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar75055 ["Items" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-result [input] (clojure.core/let [rawinput75056 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75057 {"Tags" (portkey.aws/search-for-tag rawinput75056 "Tags" :flattened? false)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar75057 ["Tags" :content]))})))

(clojure.core/defn- response-no-such-origin [input] (clojure.core/let [rawinput75058 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75059 {"Message" (portkey.aws/search-for-tag rawinput75058 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75059 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75059 ["Message" :content]))))))

(clojure.core/defn- response-invalid-protocol-settings [input] (clojure.core/let [rawinput75060 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75061 {"Message" (portkey.aws/search-for-tag rawinput75060 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75061 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75061 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list [input] (clojure.core/let [rawinput75062 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75063 {"Message" (portkey.aws/search-for-tag rawinput75062 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75063 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75063 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cache-behaviors [input] (clojure.core/let [rawinput75064 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75065 {"Message" (portkey.aws/search-for-tag rawinput75064 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75065 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75065 ["Message" :content]))))))

(clojure.core/defn- response-too-many-origin-custom-headers [input] (clojure.core/let [rawinput75066 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75067 {"Message" (portkey.aws/search-for-tag rawinput75066 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75067 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75067 ["Message" :content]))))))

(clojure.core/defn- response-too-many-streaming-distributions [input] (clojure.core/let [rawinput75068 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75069 {"Message" (portkey.aws/search-for-tag rawinput75068 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75069 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75069 ["Message" :content]))))))

(clojure.core/defn- response-get-streaming-distribution-result [input] (clojure.core/let [rawinput75070 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75071 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput75070 "StreamingDistribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75071 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar75071 ["StreamingDistribution" :content]))) (letvar75071 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75071 ["ETag"]))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es [input] (clojure.core/let [rawinput75072 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75073 {"Message" (portkey.aws/search-for-tag rawinput75072 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75073 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75073 ["Message" :content]))))))

(clojure.core/defn- response-invalid-viewer-certificate [input] (clojure.core/let [rawinput75074 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75075 {"Message" (portkey.aws/search-for-tag rawinput75074 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75075 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75075 ["Message" :content]))))))

(clojure.core/defn- response-invalid-argument [input] (clojure.core/let [rawinput75076 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75077 {"Message" (portkey.aws/search-for-tag rawinput75076 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75077 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75077 ["Message" :content]))))))

(clojure.core/defn- response-streaming-distribution-not-disabled [input] (clojure.core/let [rawinput75078 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75079 {"Message" (portkey.aws/search-for-tag rawinput75078 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75079 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75079 ["Message" :content]))))))

(clojure.core/defn- response-too-many-certificates [input] (clojure.core/let [rawinput75080 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75081 {"Message" (portkey.aws/search-for-tag rawinput75080 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75081 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75081 ["Message" :content]))))))

(clojure.core/defn- response-access-denied [input] (clojure.core/let [rawinput75082 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75083 {"Message" (portkey.aws/search-for-tag rawinput75082 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75083 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75083 ["Message" :content]))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use [input] (clojure.core/let [rawinput75084 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75085 {"Message" (portkey.aws/search-for-tag rawinput75084 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75085 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75085 ["Message" :content]))))))

(clojure.core/defn- response-no-such-resource [input] (clojure.core/let [rawinput75086 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75087 {"Message" (portkey.aws/search-for-tag rawinput75086 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75087 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75087 ["Message" :content]))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput75088 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75089 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput75088 "CloudFrontOriginAccessIdentity" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75089 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar75089 ["CloudFrontOriginAccessIdentity" :content]))) (letvar75089 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75089 ["ETag"]))))))

(clojure.core/defn- response-invalid-error-code [input] (clojure.core/let [rawinput75090 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75091 {"Message" (portkey.aws/search-for-tag rawinput75090 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75091 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75091 ["Message" :content]))))))

(clojure.core/defn- response-create-streaming-distribution-result [input] (clojure.core/let [rawinput75092 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75093 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput75092 "StreamingDistribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75093 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar75093 ["StreamingDistribution" :content]))) (letvar75093 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar75093 ["Location"]))) (letvar75093 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75093 ["ETag"]))))))

(clojure.core/defn- response-invalid-relative-path [input] (clojure.core/let [rawinput75094 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75095 {"Message" (portkey.aws/search-for-tag rawinput75094 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75095 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75095 ["Message" :content]))))))

(clojure.core/defn- response-invalid-location-code [input] (clojure.core/let [rawinput75096 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75097 {"Message" (portkey.aws/search-for-tag rawinput75096 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75097 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75097 ["Message" :content]))))))

(clojure.core/defn- response-invalid-web-acl-id [input] (clojure.core/let [rawinput75098 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75099 {"Message" (portkey.aws/search-for-tag rawinput75098 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75099 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75099 ["Message" :content]))))))

(clojure.core/defn- response-invalid-origin [input] (clojure.core/let [rawinput75100 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75101 {"Message" (portkey.aws/search-for-tag rawinput75100 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75101 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75101 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities [input] (clojure.core/let [rawinput75102 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75103 {"Message" (portkey.aws/search-for-tag rawinput75102 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75103 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75103 ["Message" :content]))))))

(clojure.core/defn- response-update-distribution-result [input] (clojure.core/let [rawinput75104 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75105 {"Distribution" (portkey.aws/search-for-tag rawinput75104 "Distribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75105 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar75105 ["Distribution" :content]))) (letvar75105 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75105 ["ETag"]))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput75106 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75107 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput75106 "CloudFrontOriginAccessIdentity" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75107 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar75107 ["CloudFrontOriginAccessIdentity" :content]))) (letvar75107 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75107 ["ETag"]))))))

(clojure.core/defn- response-invalid-query-string-parameters [input] (clojure.core/let [rawinput75108 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75109 {"Message" (portkey.aws/search-for-tag rawinput75108 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75109 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75109 ["Message" :content]))))))

(clojure.core/defn- response-too-many-origins [input] (clojure.core/let [rawinput75110 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75111 {"Message" (portkey.aws/search-for-tag rawinput75110 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75111 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75111 ["Message" :content]))))))

(clojure.core/defn- response-invalid-ttl-order [input] (clojure.core/let [rawinput75112 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75113 {"Message" (portkey.aws/search-for-tag rawinput75112 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75113 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75113 ["Message" :content]))))))

(clojure.core/defn- response-no-such-streaming-distribution [input] (clojure.core/let [rawinput75114 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75115 {"Message" (portkey.aws/search-for-tag rawinput75114 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75115 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75115 ["Message" :content]))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput75116 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75117 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput75116 "CloudFrontOriginAccessIdentity" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75117 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar75117 ["CloudFrontOriginAccessIdentity" :content]))) (letvar75117 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar75117 ["Location"]))) (letvar75117 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75117 ["ETag"]))))))

(clojure.core/defn- response-cname-already-exists [input] (clojure.core/let [rawinput75118 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75119 {"Message" (portkey.aws/search-for-tag rawinput75118 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75119 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75119 ["Message" :content]))))))

(clojure.core/defn- response-invalid-default-root-object [input] (clojure.core/let [rawinput75120 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75121 {"Message" (portkey.aws/search-for-tag rawinput75120 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75121 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75121 ["Message" :content]))))))

(clojure.core/defn- response-invalid-response-code [input] (clojure.core/let [rawinput75122 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75123 {"Message" (portkey.aws/search-for-tag rawinput75122 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75123 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75123 ["Message" :content]))))))

(clojure.core/defn- response-no-such-invalidation [input] (clojure.core/let [rawinput75124 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75125 {"Message" (portkey.aws/search-for-tag rawinput75124 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75125 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75125 ["Message" :content]))))))

(clojure.core/defn- response-too-many-invalidations-in-progress [input] (clojure.core/let [rawinput75126 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75127 {"Message" (portkey.aws/search-for-tag rawinput75126 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75127 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75127 ["Message" :content]))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result [input] (clojure.core/let [rawinput75128 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75129 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput75128 "CloudFrontOriginAccessIdentityList" :flattened? false)}] (clojure.core/cond-> {} (letvar75129 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar75129 ["CloudFrontOriginAccessIdentityList" :content]))))))

(clojure.core/defn- response-invalid-forward-cookies [input] (clojure.core/let [rawinput75130 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75131 {"Message" (portkey.aws/search-for-tag rawinput75130 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75131 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75131 ["Message" :content]))))))

(clojure.core/defn- response-get-distribution-config-result [input] (clojure.core/let [rawinput75132 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75133 {"DistributionConfig" (portkey.aws/search-for-tag rawinput75132 "DistributionConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75133 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar75133 ["DistributionConfig" :content]))) (letvar75133 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75133 ["ETag"]))))))

(clojure.core/defn- response-invalid-required-protocol [input] (clojure.core/let [rawinput75134 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75135 {"Message" (portkey.aws/search-for-tag rawinput75134 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75135 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75135 ["Message" :content]))))))

(clojure.core/defn- response-get-distribution-result [input] (clojure.core/let [rawinput75136 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75137 {"Distribution" (portkey.aws/search-for-tag rawinput75136 "Distribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75137 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar75137 ["Distribution" :content]))) (letvar75137 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75137 ["ETag"]))))))

(clojure.core/defn- response-get-streaming-distribution-config-result [input] (clojure.core/let [rawinput75138 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75139 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput75138 "StreamingDistributionConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75139 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar75139 ["StreamingDistributionConfig" :content]))) (letvar75139 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75139 ["ETag"]))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin [input] (clojure.core/let [rawinput75140 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75141 {"Message" (portkey.aws/search-for-tag rawinput75140 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75141 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75141 ["Message" :content]))))))

(clojure.core/defn- response-too-many-distribution-cnam-es [input] (clojure.core/let [rawinput75142 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75143 {"Message" (portkey.aws/search-for-tag rawinput75142 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75143 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75143 ["Message" :content]))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter [input] (clojure.core/let [rawinput75144 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75145 {"Message" (portkey.aws/search-for-tag rawinput75144 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75145 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75145 ["Message" :content]))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity [input] (clojure.core/let [rawinput75146 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75147 {"Message" (portkey.aws/search-for-tag rawinput75146 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75147 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75147 ["Message" :content]))))))

(clojure.core/defn- response-list-invalidations-result [input] (clojure.core/let [rawinput75148 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75149 {"InvalidationList" (portkey.aws/search-for-tag rawinput75148 "InvalidationList" :flattened? false)}] (clojure.core/cond-> {} (letvar75149 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar75149 ["InvalidationList" :content]))))))

(clojure.core/defn- response-batch-too-large [input] (clojure.core/let [rawinput75150 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75151 {"Message" (portkey.aws/search-for-tag rawinput75150 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75151 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75151 ["Message" :content]))))))

(clojure.core/defn- response-create-distribution-with-tags-result [input] (clojure.core/let [rawinput75152 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75153 {"Distribution" (portkey.aws/search-for-tag rawinput75152 "Distribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75153 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar75153 ["Distribution" :content]))) (letvar75153 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar75153 ["Location"]))) (letvar75153 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75153 ["ETag"]))))))

(clojure.core/defn- response-list-streaming-distributions-result [input] (clojure.core/let [rawinput75154 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75155 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput75154 "StreamingDistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar75155 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar75155 ["StreamingDistributionList" :content]))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result [input] (clojure.core/let [rawinput75156 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75157 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput75156 "StreamingDistribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75157 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar75157 ["StreamingDistribution" :content]))) (letvar75157 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar75157 ["Location"]))) (letvar75157 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75157 ["ETag"]))))))

(clojure.core/defn- response-create-invalidation-result [input] (clojure.core/let [rawinput75158 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75159 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput75158 "Invalidation" :flattened? false)}] (clojure.core/cond-> {} (letvar75159 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar75159 ["Location"]))) (letvar75159 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar75159 ["Invalidation" :content]))))))

(clojure.core/defn- response-missing-body [input] (clojure.core/let [rawinput75160 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75161 {"Message" (portkey.aws/search-for-tag rawinput75160 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75161 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75161 ["Message" :content]))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result [input] (clojure.core/let [rawinput75162 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75163 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput75162 "CloudFrontOriginAccessIdentityConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75163 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar75163 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar75163 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75163 ["ETag"]))))))

(clojure.core/defn- response-distribution-not-disabled [input] (clojure.core/let [rawinput75164 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75165 {"Message" (portkey.aws/search-for-tag rawinput75164 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75165 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75165 ["Message" :content]))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists [input] (clojure.core/let [rawinput75166 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75167 {"Message" (portkey.aws/search-for-tag rawinput75166 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75167 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75167 ["Message" :content]))))))

(clojure.core/defn- response-precondition-failed [input] (clojure.core/let [rawinput75168 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75169 {"Message" (portkey.aws/search-for-tag rawinput75168 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75169 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75169 ["Message" :content]))))))

(clojure.core/defn- response-distribution-already-exists [input] (clojure.core/let [rawinput75170 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75171 {"Message" (portkey.aws/search-for-tag rawinput75170 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75171 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75171 ["Message" :content]))))))

(clojure.core/defn- response-invalid-origin-access-identity [input] (clojure.core/let [rawinput75172 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75173 {"Message" (portkey.aws/search-for-tag rawinput75172 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75173 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75173 ["Message" :content]))))))

(clojure.core/defn- response-too-many-trusted-signers [input] (clojure.core/let [rawinput75174 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75175 {"Message" (portkey.aws/search-for-tag rawinput75174 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75175 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75175 ["Message" :content]))))))

(clojure.core/defn- response-invalid-minimum-protocol-version [input] (clojure.core/let [rawinput75176 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75177 {"Message" (portkey.aws/search-for-tag rawinput75176 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75177 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75177 ["Message" :content]))))))

(clojure.core/defn- response-streaming-distribution-already-exists [input] (clojure.core/let [rawinput75178 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75179 {"Message" (portkey.aws/search-for-tag rawinput75178 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75179 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75179 ["Message" :content]))))))

(clojure.core/defn- response-invalid-if-match-version [input] (clojure.core/let [rawinput75180 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75181 {"Message" (portkey.aws/search-for-tag rawinput75180 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75181 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75181 ["Message" :content]))))))

(clojure.core/defn- response-create-distribution-result [input] (clojure.core/let [rawinput75182 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75183 {"Distribution" (portkey.aws/search-for-tag rawinput75182 "Distribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75183 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar75183 ["Distribution" :content]))) (letvar75183 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar75183 ["Location"]))) (letvar75183 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75183 ["ETag"]))))))

(clojure.core/defn- response-too-many-distributions [input] (clojure.core/let [rawinput75184 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75185 {"Message" (portkey.aws/search-for-tag rawinput75184 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75185 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75185 ["Message" :content]))))))

(clojure.core/defn- response-no-such-distribution [input] (clojure.core/let [rawinput75186 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75187 {"Message" (portkey.aws/search-for-tag rawinput75186 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75187 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75187 ["Message" :content]))))))

(clojure.core/defn- response-update-streaming-distribution-result [input] (clojure.core/let [rawinput75188 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75189 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput75188 "StreamingDistribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar75189 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar75189 ["StreamingDistribution" :content]))) (letvar75189 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar75189 ["ETag"]))))))

(clojure.core/defn- response-illegal-update [input] (clojure.core/let [rawinput75190 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75191 {"Message" (portkey.aws/search-for-tag rawinput75190 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75191 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75191 ["Message" :content]))))))

(clojure.core/defn- response-inconsistent-quantities [input] (clojure.core/let [rawinput75192 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75193 {"Message" (portkey.aws/search-for-tag rawinput75192 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75193 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75193 ["Message" :content]))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result [input] (clojure.core/let [rawinput75194 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75195 {"DistributionList" (portkey.aws/search-for-tag rawinput75194 "DistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar75195 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar75195 ["DistributionList" :content]))))))

(clojure.core/defn- response-too-many-query-string-parameters [input] (clojure.core/let [rawinput75196 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75197 {"Message" (portkey.aws/search-for-tag rawinput75196 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75197 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75197 ["Message" :content]))))))

(clojure.core/defn- response-invalid-tagging [input] (clojure.core/let [rawinput75198 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75199 {"Message" (portkey.aws/search-for-tag rawinput75198 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75199 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75199 ["Message" :content]))))))

(clojure.core/defn- response-list-distributions-result [input] (clojure.core/let [rawinput75200 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75201 {"DistributionList" (portkey.aws/search-for-tag rawinput75200 "DistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar75201 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar75201 ["DistributionList" :content]))))))

(clojure.core/defn- response-trusted-signer-does-not-exist [input] (clojure.core/let [rawinput75202 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75203 {"Message" (portkey.aws/search-for-tag rawinput75202 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75203 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75203 ["Message" :content]))))))

(clojure.core/defn- response-get-invalidation-result [input] (clojure.core/let [rawinput75204 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75205 {"Invalidation" (portkey.aws/search-for-tag rawinput75204 "Invalidation" :flattened? false)}] (clojure.core/cond-> {} (letvar75205 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar75205 ["Invalidation" :content]))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values [input] (clojure.core/let [rawinput75206 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar75207 {"Message" (portkey.aws/search-for-tag rawinput75206 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar75207 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar75207 ["Message" :content]))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2016-08-20.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2016-08-20.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.logging-config/enabled :portkey.aws.cloudfront.-2016-08-20.logging-config/include-cookies :portkey.aws.cloudfront.-2016-08-20.logging-config/bucket :portkey.aws.cloudfront.-2016-08-20.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/streaming-distribution-config :portkey.aws.cloudfront.-2016-08-20/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.invalidation-summary/id :portkey.aws.cloudfront.-2016-08-20.invalidation-summary/create-time :portkey.aws.cloudfront.-2016-08-20.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.invalidation/id :portkey.aws.cloudfront.-2016-08-20.invalidation/status :portkey.aws.cloudfront.-2016-08-20.invalidation/create-time :portkey.aws.cloudfront.-2016-08-20/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/streaming-distribution :portkey.aws.cloudfront.-2016-08-20.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-20.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.distribution/id :portkey.aws.cloudfront.-2016-08-20.distribution/arn :portkey.aws.cloudfront.-2016-08-20.distribution/status :portkey.aws.cloudfront.-2016-08-20.distribution/last-modified-time :portkey.aws.cloudfront.-2016-08-20.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2016-08-20.distribution/domain-name :portkey.aws.cloudfront.-2016-08-20/active-trusted-signers :portkey.aws.cloudfront.-2016-08-20/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.forwarded-values/query-string :portkey.aws.cloudfront.-2016-08-20.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2016-08-20/headers :portkey.aws.cloudfront.-2016-08-20/query-string-cache-keys]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/paths :portkey.aws.cloudfront.-2016-08-20.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-20.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/query-string-cache-keys-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/marker :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.streaming-distribution/id :portkey.aws.cloudfront.-2016-08-20.streaming-distribution/arn :portkey.aws.cloudfront.-2016-08-20.streaming-distribution/status :portkey.aws.cloudfront.-2016-08-20.streaming-distribution/domain-name :portkey.aws.cloudfront.-2016-08-20/active-trusted-signers :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2016-08-20.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2016-08-20.custom-error-response/response-page-path :portkey.aws.cloudfront.-2016-08-20.custom-error-response/response-code :portkey.aws.cloudfront.-2016-08-20.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.signer/aws-account-number :portkey.aws.cloudfront.-2016-08-20/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-08-20.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.cached-methods/quantity :portkey.aws.cloudfront.-2016-08-20.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128)) (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__22929__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/streaming-distribution :portkey.aws.cloudfront.-2016-08-20.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2016-08-20.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.cache-behavior/path-pattern :portkey.aws.cloudfront.-2016-08-20.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-08-20/forwarded-values :portkey.aws.cloudfront.-2016-08-20/trusted-signers :portkey.aws.cloudfront.-2016-08-20/viewer-protocol-policy :portkey.aws.cloudfront.-2016-08-20.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-08-20.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-08-20.cache-behavior/compress :portkey.aws.cloudfront.-2016-08-20.cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-08-20/allowed-methods :portkey.aws.cloudfront.-2016-08-20.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2016-08-20.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.active-trusted-signers/enabled :portkey.aws.cloudfront.-2016-08-20.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.origin/id :portkey.aws.cloudfront.-2016-08-20.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2016-08-20.origin/origin-path :portkey.aws.cloudfront.-2016-08-20/custom-headers :portkey.aws.cloudfront.-2016-08-20/s-3-origin-config :portkey.aws.cloudfront.-2016-08-20/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.invalidation-list/marker :portkey.aws.cloudfront.-2016-08-20.invalidation-list/max-items :portkey.aws.cloudfront.-2016-08-20.invalidation-list/is-truncated :portkey.aws.cloudfront.-2016-08-20.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalidation-list/next-marker :portkey.aws.cloudfront.-2016-08-20.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2016-08-20.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/distribution :portkey.aws.cloudfront.-2016-08-20.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-08-20.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.allowed-methods/quantity :portkey.aws.cloudfront.-2016-08-20.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2016-08-20/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.custom-origin-config/http-port :portkey.aws.cloudfront.-2016-08-20.custom-origin-config/https-port :portkey.aws.cloudfront.-2016-08-20/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2016-08-20/origin-ssl-protocols]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.list-distributions-request/marker :portkey.aws.cloudfront.-2016-08-20.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.s-3-origin/domain-name :portkey.aws.cloudfront.-2016-08-20.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-08-20.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2016-08-20.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/id :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/arn :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/status :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2016-08-20/s-3-origin :portkey.aws.cloudfront.-2016-08-20/aliases :portkey.aws.cloudfront.-2016-08-20/trusted-signers :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2016-08-20/price-class :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-08-20.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-20.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-08-20/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.tag-resource-request/resource :portkey.aws.cloudfront.-2016-08-20/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.query-string-cache-keys/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.query-string-cache-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/query-string-cache-keys-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/query-string-cache-keys (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.query-string-cache-keys/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.query-string-cache-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.distribution-config/caller-reference :portkey.aws.cloudfront.-2016-08-20/origins :portkey.aws.cloudfront.-2016-08-20/default-cache-behavior :portkey.aws.cloudfront.-2016-08-20.distribution-config/comment :portkey.aws.cloudfront.-2016-08-20.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-08-20.distribution-config/default-root-object :portkey.aws.cloudfront.-2016-08-20/restrictions :portkey.aws.cloudfront.-2016-08-20.distribution-config/web-acl-id :portkey.aws.cloudfront.-2016-08-20.distribution-config/logging :portkey.aws.cloudfront.-2016-08-20/cache-behaviors :portkey.aws.cloudfront.-2016-08-20/custom-error-responses :portkey.aws.cloudfront.-2016-08-20/aliases :portkey.aws.cloudfront.-2016-08-20/price-class :portkey.aws.cloudfront.-2016-08-20/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/distribution-config :portkey.aws.cloudfront.-2016-08-20.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 0 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256)) (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__22929__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/distribution :portkey.aws.cloudfront.-2016-08-20.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/streaming-distribution-config :portkey.aws.cloudfront.-2016-08-20.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/distribution :portkey.aws.cloudfront.-2016-08-20.create-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-08-20.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/streaming-distribution-config :portkey.aws.cloudfront.-2016-08-20.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-20.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/streaming-distribution :portkey.aws.cloudfront.-2016-08-20.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-08-20.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.create-invalidation-result/location :portkey.aws.cloudfront.-2016-08-20/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-08-20.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.origin-custom-header/header-name :portkey.aws.cloudfront.-2016-08-20.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2016-08-20/s-3-origin :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-config/comment :portkey.aws.cloudfront.-2016-08-20/trusted-signers :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-08-20/aliases :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-config/logging :portkey.aws.cloudfront.-2016-08-20/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.tag/key] :opt-un [:portkey.aws.cloudfront.-2016-08-20.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.streaming-logging-config/enabled :portkey.aws.cloudfront.-2016-08-20.streaming-logging-config/bucket :portkey.aws.cloudfront.-2016-08-20.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.distribution-summary/id :portkey.aws.cloudfront.-2016-08-20.distribution-summary/arn :portkey.aws.cloudfront.-2016-08-20.distribution-summary/status :portkey.aws.cloudfront.-2016-08-20.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-08-20.distribution-summary/domain-name :portkey.aws.cloudfront.-2016-08-20/aliases :portkey.aws.cloudfront.-2016-08-20/origins :portkey.aws.cloudfront.-2016-08-20/default-cache-behavior :portkey.aws.cloudfront.-2016-08-20/cache-behaviors :portkey.aws.cloudfront.-2016-08-20/custom-error-responses :portkey.aws.cloudfront.-2016-08-20.distribution-summary/comment :portkey.aws.cloudfront.-2016-08-20/price-class :portkey.aws.cloudfront.-2016-08-20.distribution-summary/enabled :portkey.aws.cloudfront.-2016-08-20/viewer-certificate :portkey.aws.cloudfront.-2016-08-20/restrictions :portkey.aws.cloudfront.-2016-08-20.distribution-summary/web-acl-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/minimum-protocol-version #{"TLSv1" :tl-sv-1 :ss-lv-3 "SSLv3"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.origins/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.origins/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/distribution-config :portkey.aws.cloudfront.-2016-08-20/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/distribution :portkey.aws.cloudfront.-2016-08-20.create-distribution-result/location :portkey.aws.cloudfront.-2016-08-20.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-20.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-08-20.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__22929__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.distribution-list/marker :portkey.aws.cloudfront.-2016-08-20.distribution-list/max-items :portkey.aws.cloudfront.-2016-08-20.distribution-list/is-truncated :portkey.aws.cloudfront.-2016-08-20.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.distribution-list/next-marker :portkey.aws.cloudfront.-2016-08-20.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/streaming-distribution :portkey.aws.cloudfront.-2016-08-20.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2016-08-20.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2016-08-20.list-invalidations-request/marker :portkey.aws.cloudfront.-2016-08-20.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-08-20/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.untag-resource-request/resource :portkey.aws.cloudfront.-2016-08-20/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-08-20/forwarded-values :portkey.aws.cloudfront.-2016-08-20/trusted-signers :portkey.aws.cloudfront.-2016-08-20/viewer-protocol-policy :portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/compress :portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-08-20/allowed-methods :portkey.aws.cloudfront.-2016-08-20.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.trusted-signers/enabled :portkey.aws.cloudfront.-2016-08-20.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20/distribution-config :portkey.aws.cloudfront.-2016-08-20.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-08-20.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2016-08-20.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2016-08-20.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2016-08-20/ssl-support-method :portkey.aws.cloudfront.-2016-08-20/minimum-protocol-version :portkey.aws.cloudfront.-2016-08-20.viewer-certificate/certificate :portkey.aws.cloudfront.-2016-08-20/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-08-20.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2016-08-20.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2016-08-20.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-20/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-08-20.geo-restriction/restriction-type :portkey.aws.cloudfront.-2016-08-20.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2016-08-20.geo-restriction/items]))

(clojure.core/defn tag-resource-2016-08-20 ([tag-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/tagging?Operation=Tag", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "TagResource2016_08_20", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-20/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-08-20/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2016-08-20 ([get-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distribution/{Id}", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistribution2016_08_20", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/get-distribution-result))

(clojure.core/defn create-streaming-distribution-with-tags-2016-08-20 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/streaming-distribution?WithTags", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistributionWithTags2016_08_20", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-08-20/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-20/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-08-20/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-08-20/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-20/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-20/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-20/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-20/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-20/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2016-08-20 ([update-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distribution/{Id}/config", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDistribution2016_08_20", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-08-20/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-08-20/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-08-20/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-08-20/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-08-20/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-08-20/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-08-20/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-08-20/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-08-20/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-08-20/invalid-web-acl-id, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-08-20/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-08-20/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-08-20/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-08-20/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-08-20/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-08-20/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-08-20/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-08-20/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-20/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-08-20/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-08-20/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-20/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-20/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-20/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-08-20/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-20/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2016-08-20/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-20/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-08-20/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-20/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-08-20/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/update-distribution-result))

(clojure.core/defn delete-streaming-distribution-2016-08-20 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/streaming-distribution/{Id}", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteStreamingDistribution2016_08_20", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-20/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-20/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2016-08-20 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2016_08_20", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-20/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-20/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-20/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2016-08-20 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distribution?WithTags", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistributionWithTags2016_08_20", :http.request.configuration/output-deser-fn response-create-distribution-with-tags-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-08-20/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-08-20/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-08-20/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-08-20/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-08-20/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-08-20/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-08-20/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-08-20/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-08-20/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-08-20/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-08-20/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-08-20/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-08-20/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-08-20/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-08-20/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-08-20/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-08-20/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-08-20/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-08-20/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-08-20/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-20/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-08-20/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-08-20/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-20/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-20/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-08-20/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-08-20/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-20/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-08-20/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-20/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-20/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-08-20/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/create-distribution-with-tags-result))

(clojure.core/defn get-invalidation-2016-08-20 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInvalidation2016_08_20", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2016-08-20/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/get-invalidation-result))

(clojure.core/defn create-streaming-distribution-2016-08-20 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/streaming-distribution", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistribution2016_08_20", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-08-20/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-20/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-08-20/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-08-20/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-20/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-20/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-20/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-20/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/create-streaming-distribution-result))

(clojure.core/defn list-tags-for-resource-2016-08-20 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/tagging", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource2016_08_20", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-20/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-08-20/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2016-08-20 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/streaming-distribution/{Id}", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistribution2016_08_20", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-result))

(clojure.core/defn create-distribution-2016-08-20 ([create-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distribution", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistribution2016_08_20", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-08-20/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-08-20/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-08-20/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-08-20/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-08-20/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-08-20/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-08-20/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-08-20/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-08-20/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-08-20/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-08-20/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-08-20/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-08-20/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-08-20/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-08-20/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-08-20/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-08-20/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-08-20/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-08-20/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-08-20/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-20/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-08-20/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-08-20/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-20/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-20/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-08-20/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-08-20/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-20/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-08-20/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-20/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-08-20/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/create-distribution-result))

(clojure.core/defn get-streaming-distribution-config-2016-08-20 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistributionConfig2016_08_20", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/get-streaming-distribution-config-result))

(clojure.core/defn list-distributions-2016-08-20 ([] (list-distributions-2016-08-20 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distribution", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributions2016_08_20", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2016-08-20 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-08-20/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/list-distributions-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2016-08-20 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2016_08_20", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-20/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2016-08-20 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInvalidations2016_08_20", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/list-invalidations-result))

(clojure.core/defn untag-resource-2016-08-20 ([untag-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/tagging?Operation=Untag", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "UntagResource2016_08_20", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-20/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-08-20/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2016-08-20 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2016_08_20", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-20/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2016-08-20 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2016_08_20", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2016-08-20/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-20/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2016-08-20/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-20/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-20/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-20/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2016-08-20 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStreamingDistribution2016_08_20", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-20/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-08-20/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-20/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-20/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-20/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-20/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2016-08-20/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-20/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-20/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2016-08-20 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distribution/{Id}/config", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistributionConfig2016_08_20", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/get-distribution-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2016-08-20 ([] (list-cloud-front-origin-access-identities-2016-08-20 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/origin-access-identity/cloudfront", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2016_08_20", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2016-08-20 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-08-20/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2016-08-20 ([] (list-streaming-distributions-2016-08-20 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/streaming-distribution", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreamingDistributions2016_08_20", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2016-08-20 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-08-20/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/list-streaming-distributions-result))

(clojure.core/defn delete-distribution-2016-08-20 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distribution/{Id}", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteDistribution2016_08_20", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2016-08-20/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-20/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-20/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2016-08-20 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateInvalidation2016_08_20", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-20/access-denied, "MissingBody" :portkey.aws.cloudfront.-2016-08-20/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-20/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2016-08-20/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2016-08-20/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-20/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/create-invalidation-result))

(clojure.core/defn list-distributions-by-web-acl-id-2016-08-20 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributionsByWebACLId2016_08_20", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-08-20/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2016-08-20 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-20/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-20/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-20/origin-access-identity/cloudfront", :http.request.configuration/version "2016-08-20", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-20/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2016_08_20", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2016-08-20/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-08-20/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2016-08-20/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-20/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-20/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2016-08-20 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-20/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-20/create-cloud-front-origin-access-identity-result))
