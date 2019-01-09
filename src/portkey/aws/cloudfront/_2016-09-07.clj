(ns portkey.aws.cloudfront.-2016-09-07 (:require [portkey.aws]))

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

(clojure.core/defn- ser-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-origins (:origins input)) #:http.request.field{:name "Origins", :shape "Origins"}) (clojure.core/into (ser-default-cache-behavior (:default-cache-behavior input)) #:http.request.field{:name "DefaultCacheBehavior", :shape "DefaultCacheBehavior"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "DistributionConfig", :type "structure"} (clojure.core/contains? input :default-root-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :default-root-object)) #:http.request.field{:name "DefaultRootObject", :shape "string"})) (clojure.core/contains? input :restrictions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restrictions (input :restrictions)) #:http.request.field{:name "Restrictions", :shape "Restrictions"})) (clojure.core/contains? input :web-acl-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "LoggingConfig"})) (clojure.core/contains? input :cache-behaviors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behaviors (input :cache-behaviors)) #:http.request.field{:name "CacheBehaviors", :shape "CacheBehaviors"})) (clojure.core/contains? input :custom-error-responses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-responses (input :custom-error-responses)) #:http.request.field{:name "CustomErrorResponses", :shape "CustomErrorResponses"})) (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"})) (clojure.core/contains? input :http-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-version (input :http-version)) #:http.request.field{:name "HttpVersion", :shape "HttpVersion"})) (clojure.core/contains? input :viewer-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-viewer-certificate (input :viewer-certificate)) #:http.request.field{:name "ViewerCertificate", :shape "ViewerCertificate"}))))

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

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})]}))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})]}))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})]}))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})]}))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-09-07/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-list-cloud-front-origin-access-identities-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2016-09-07.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2016-09-07.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.logging-config/enabled :portkey.aws.cloudfront.-2016-09-07.logging-config/include-cookies :portkey.aws.cloudfront.-2016-09-07.logging-config/bucket :portkey.aws.cloudfront.-2016-09-07.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/streaming-distribution-config :portkey.aws.cloudfront.-2016-09-07/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.invalidation-summary/id :portkey.aws.cloudfront.-2016-09-07.invalidation-summary/create-time :portkey.aws.cloudfront.-2016-09-07.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.invalidation/id :portkey.aws.cloudfront.-2016-09-07.invalidation/status :portkey.aws.cloudfront.-2016-09-07.invalidation/create-time :portkey.aws.cloudfront.-2016-09-07/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/streaming-distribution :portkey.aws.cloudfront.-2016-09-07.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-07.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.distribution/id :portkey.aws.cloudfront.-2016-09-07.distribution/arn :portkey.aws.cloudfront.-2016-09-07.distribution/status :portkey.aws.cloudfront.-2016-09-07.distribution/last-modified-time :portkey.aws.cloudfront.-2016-09-07.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2016-09-07.distribution/domain-name :portkey.aws.cloudfront.-2016-09-07/active-trusted-signers :portkey.aws.cloudfront.-2016-09-07/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.forwarded-values/query-string :portkey.aws.cloudfront.-2016-09-07.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2016-09-07/headers :portkey.aws.cloudfront.-2016-09-07/query-string-cache-keys]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/paths :portkey.aws.cloudfront.-2016-09-07.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-07.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/query-string-cache-keys-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/marker :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.streaming-distribution/id :portkey.aws.cloudfront.-2016-09-07.streaming-distribution/arn :portkey.aws.cloudfront.-2016-09-07.streaming-distribution/status :portkey.aws.cloudfront.-2016-09-07.streaming-distribution/domain-name :portkey.aws.cloudfront.-2016-09-07/active-trusted-signers :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2016-09-07.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2016-09-07.custom-error-response/response-page-path :portkey.aws.cloudfront.-2016-09-07.custom-error-response/response-code :portkey.aws.cloudfront.-2016-09-07.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.signer/aws-account-number :portkey.aws.cloudfront.-2016-09-07/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-09-07.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.cached-methods/quantity :portkey.aws.cloudfront.-2016-09-07.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/streaming-distribution :portkey.aws.cloudfront.-2016-09-07.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2016-09-07.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.cache-behavior/path-pattern :portkey.aws.cloudfront.-2016-09-07.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-09-07/forwarded-values :portkey.aws.cloudfront.-2016-09-07/trusted-signers :portkey.aws.cloudfront.-2016-09-07/viewer-protocol-policy :portkey.aws.cloudfront.-2016-09-07.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-09-07.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-09-07.cache-behavior/compress :portkey.aws.cloudfront.-2016-09-07.cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-09-07/allowed-methods :portkey.aws.cloudfront.-2016-09-07.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2016-09-07.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.active-trusted-signers/enabled :portkey.aws.cloudfront.-2016-09-07.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.origin/id :portkey.aws.cloudfront.-2016-09-07.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2016-09-07.origin/origin-path :portkey.aws.cloudfront.-2016-09-07/custom-headers :portkey.aws.cloudfront.-2016-09-07/s-3-origin-config :portkey.aws.cloudfront.-2016-09-07/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.invalidation-list/marker :portkey.aws.cloudfront.-2016-09-07.invalidation-list/max-items :portkey.aws.cloudfront.-2016-09-07.invalidation-list/is-truncated :portkey.aws.cloudfront.-2016-09-07.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalidation-list/next-marker :portkey.aws.cloudfront.-2016-09-07.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2016-09-07.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/distribution :portkey.aws.cloudfront.-2016-09-07.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-09-07.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.allowed-methods/quantity :portkey.aws.cloudfront.-2016-09-07.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2016-09-07/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.custom-origin-config/http-port :portkey.aws.cloudfront.-2016-09-07.custom-origin-config/https-port :portkey.aws.cloudfront.-2016-09-07/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2016-09-07/origin-ssl-protocols]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.list-distributions-request/marker :portkey.aws.cloudfront.-2016-09-07.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.s-3-origin/domain-name :portkey.aws.cloudfront.-2016-09-07.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-09-07.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2016-09-07.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/id :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/arn :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/status :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2016-09-07/s-3-origin :portkey.aws.cloudfront.-2016-09-07/aliases :portkey.aws.cloudfront.-2016-09-07/trusted-signers :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2016-09-07/price-class :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-09-07.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-07.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-09-07/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.tag-resource-request/resource :portkey.aws.cloudfront.-2016-09-07/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.query-string-cache-keys/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.query-string-cache-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/query-string-cache-keys-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/query-string-cache-keys (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.query-string-cache-keys/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.query-string-cache-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.distribution-config/caller-reference :portkey.aws.cloudfront.-2016-09-07/origins :portkey.aws.cloudfront.-2016-09-07/default-cache-behavior :portkey.aws.cloudfront.-2016-09-07.distribution-config/comment :portkey.aws.cloudfront.-2016-09-07.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-09-07.distribution-config/default-root-object :portkey.aws.cloudfront.-2016-09-07/restrictions :portkey.aws.cloudfront.-2016-09-07.distribution-config/web-acl-id :portkey.aws.cloudfront.-2016-09-07.distribution-config/logging :portkey.aws.cloudfront.-2016-09-07/cache-behaviors :portkey.aws.cloudfront.-2016-09-07/custom-error-responses :portkey.aws.cloudfront.-2016-09-07/aliases :portkey.aws.cloudfront.-2016-09-07/price-class :portkey.aws.cloudfront.-2016-09-07/http-version :portkey.aws.cloudfront.-2016-09-07/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/distribution-config :portkey.aws.cloudfront.-2016-09-07.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/distribution :portkey.aws.cloudfront.-2016-09-07.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/streaming-distribution-config :portkey.aws.cloudfront.-2016-09-07.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/distribution :portkey.aws.cloudfront.-2016-09-07.create-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-09-07.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/streaming-distribution-config :portkey.aws.cloudfront.-2016-09-07.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-07.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/streaming-distribution :portkey.aws.cloudfront.-2016-09-07.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-09-07.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.create-invalidation-result/location :portkey.aws.cloudfront.-2016-09-07/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-09-07.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.origin-custom-header/header-name :portkey.aws.cloudfront.-2016-09-07.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2016-09-07/s-3-origin :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-config/comment :portkey.aws.cloudfront.-2016-09-07/trusted-signers :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-09-07/aliases :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-config/logging :portkey.aws.cloudfront.-2016-09-07/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.tag/key] :opt-un [:portkey.aws.cloudfront.-2016-09-07.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.streaming-logging-config/enabled :portkey.aws.cloudfront.-2016-09-07.streaming-logging-config/bucket :portkey.aws.cloudfront.-2016-09-07.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.distribution-summary/id :portkey.aws.cloudfront.-2016-09-07.distribution-summary/arn :portkey.aws.cloudfront.-2016-09-07.distribution-summary/status :portkey.aws.cloudfront.-2016-09-07.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-09-07.distribution-summary/domain-name :portkey.aws.cloudfront.-2016-09-07/aliases :portkey.aws.cloudfront.-2016-09-07/origins :portkey.aws.cloudfront.-2016-09-07/default-cache-behavior :portkey.aws.cloudfront.-2016-09-07/cache-behaviors :portkey.aws.cloudfront.-2016-09-07/custom-error-responses :portkey.aws.cloudfront.-2016-09-07.distribution-summary/comment :portkey.aws.cloudfront.-2016-09-07/price-class :portkey.aws.cloudfront.-2016-09-07.distribution-summary/enabled :portkey.aws.cloudfront.-2016-09-07/viewer-certificate :portkey.aws.cloudfront.-2016-09-07/restrictions :portkey.aws.cloudfront.-2016-09-07.distribution-summary/web-acl-id :portkey.aws.cloudfront.-2016-09-07/http-version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/minimum-protocol-version #{"TLSv1" :tl-sv-1 :ss-lv-3 "SSLv3"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.origins/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.origins/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/distribution-config :portkey.aws.cloudfront.-2016-09-07/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/distribution :portkey.aws.cloudfront.-2016-09-07.create-distribution-result/location :portkey.aws.cloudfront.-2016-09-07.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-07.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-09-07.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.distribution-list/marker :portkey.aws.cloudfront.-2016-09-07.distribution-list/max-items :portkey.aws.cloudfront.-2016-09-07.distribution-list/is-truncated :portkey.aws.cloudfront.-2016-09-07.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.distribution-list/next-marker :portkey.aws.cloudfront.-2016-09-07.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/streaming-distribution :portkey.aws.cloudfront.-2016-09-07.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/http-version #{:http-11 "http2" :http-2 "http1.1"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2016-09-07.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2016-09-07.list-invalidations-request/marker :portkey.aws.cloudfront.-2016-09-07.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-09-07/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.untag-resource-request/resource :portkey.aws.cloudfront.-2016-09-07/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-09-07/forwarded-values :portkey.aws.cloudfront.-2016-09-07/trusted-signers :portkey.aws.cloudfront.-2016-09-07/viewer-protocol-policy :portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/compress :portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-09-07/allowed-methods :portkey.aws.cloudfront.-2016-09-07.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.trusted-signers/enabled :portkey.aws.cloudfront.-2016-09-07.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07/distribution-config :portkey.aws.cloudfront.-2016-09-07.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-09-07.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2016-09-07.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2016-09-07.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2016-09-07/ssl-support-method :portkey.aws.cloudfront.-2016-09-07/minimum-protocol-version :portkey.aws.cloudfront.-2016-09-07.viewer-certificate/certificate :portkey.aws.cloudfront.-2016-09-07/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-09-07.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2016-09-07.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2016-09-07.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-09-07/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-09-07.geo-restriction/restriction-type :portkey.aws.cloudfront.-2016-09-07.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2016-09-07.geo-restriction/items]))

(clojure.core/defn tag-resource-2016-09-07 ([tag-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/tagging?Operation=Tag", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "TagResource2016_09_07", :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-07/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-09-07/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2016-09-07 ([get-distribution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distribution/{Id}", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistribution2016_09_07", :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/get-distribution-result))

(clojure.core/defn create-streaming-distribution-with-tags-2016-09-07 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/streaming-distribution?WithTags", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistributionWithTags2016_09_07", :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-09-07/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-07/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-07/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-07/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-07/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-07/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-07/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-07/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-07/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2016-09-07 ([update-distribution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distribution/{Id}/config", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDistribution2016_09_07", :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-09-07/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-09-07/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-09-07/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-09-07/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-09-07/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-09-07/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-09-07/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-09-07/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-09-07/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-07/invalid-web-acl-id, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-09-07/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-09-07/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-09-07/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-09-07/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-09-07/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-09-07/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-09-07/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-09-07/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-07/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-09-07/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-09-07/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-07/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-07/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-07/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-09-07/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-07/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2016-09-07/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-07/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-09-07/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-07/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-09-07/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/update-distribution-result))

(clojure.core/defn delete-streaming-distribution-2016-09-07 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/streaming-distribution/{Id}", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteStreamingDistribution2016_09_07", :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-07/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-07/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2016-09-07 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2016_09_07", :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-07/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-07/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-07/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2016-09-07 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distribution?WithTags", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistributionWithTags2016_09_07", :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-09-07/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-09-07/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-09-07/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-09-07/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-09-07/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-09-07/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-09-07/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-09-07/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-09-07/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-09-07/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-07/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-07/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-09-07/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-09-07/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-09-07/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-09-07/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-09-07/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-09-07/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-09-07/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-09-07/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-07/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-09-07/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-09-07/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-07/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-07/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-09-07/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-09-07/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-07/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-09-07/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-07/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-07/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-09-07/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/create-distribution-with-tags-result))

(clojure.core/defn get-invalidation-2016-09-07 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInvalidation2016_09_07", :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2016-09-07/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/get-invalidation-result))

(clojure.core/defn create-streaming-distribution-2016-09-07 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/streaming-distribution", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistribution2016_09_07", :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-09-07/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-07/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-07/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-07/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-07/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-07/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-07/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-07/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/create-streaming-distribution-result))

(clojure.core/defn list-tags-for-resource-2016-09-07 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/tagging", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource2016_09_07", :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-07/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-09-07/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2016-09-07 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/streaming-distribution/{Id}", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistribution2016_09_07", :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-result))

(clojure.core/defn create-distribution-2016-09-07 ([create-distribution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distribution", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistribution2016_09_07", :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-09-07/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-09-07/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-09-07/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-09-07/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-09-07/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-09-07/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-09-07/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-09-07/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-09-07/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-09-07/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-07/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-09-07/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-09-07/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-09-07/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-09-07/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-09-07/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-09-07/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-09-07/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-09-07/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-09-07/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-07/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-09-07/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-09-07/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-07/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-07/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-09-07/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-09-07/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-07/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-09-07/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-07/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-09-07/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/create-distribution-result))

(clojure.core/defn get-streaming-distribution-config-2016-09-07 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistributionConfig2016_09_07", :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/get-streaming-distribution-config-result))

(clojure.core/defn list-distributions-2016-09-07 ([] (list-distributions-2016-09-07 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distribution", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributions2016_09_07", :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2016-09-07 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-09-07/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/list-distributions-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2016-09-07 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2016_09_07", :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-07/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2016-09-07 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInvalidations2016_09_07", :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/list-invalidations-result))

(clojure.core/defn untag-resource-2016-09-07 ([untag-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/tagging?Operation=Untag", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "UntagResource2016_09_07", :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-09-07/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-09-07/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2016-09-07 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2016_09_07", :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-07/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2016-09-07 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2016_09_07", :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2016-09-07/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-07/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2016-09-07/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-07/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-07/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-07/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2016-09-07 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStreamingDistribution2016_09_07", :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-09-07/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-07/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-07/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-09-07/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-09-07/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-07/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2016-09-07/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-07/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-09-07/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2016-09-07 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distribution/{Id}/config", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistributionConfig2016_09_07", :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/get-distribution-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2016-09-07 ([] (list-cloud-front-origin-access-identities-2016-09-07 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/origin-access-identity/cloudfront", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2016_09_07", :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2016-09-07 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-09-07/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2016-09-07 ([] (list-streaming-distributions-2016-09-07 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/streaming-distribution", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreamingDistributions2016_09_07", :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2016-09-07 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-09-07/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/list-streaming-distributions-result))

(clojure.core/defn delete-distribution-2016-09-07 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distribution/{Id}", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteDistribution2016_09_07", :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2016-09-07/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-09-07/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-09-07/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2016-09-07 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateInvalidation2016_09_07", :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-09-07/access-denied, "MissingBody" :portkey.aws.cloudfront.-2016-09-07/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-09-07/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2016-09-07/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2016-09-07/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-07/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/create-invalidation-result))

(clojure.core/defn list-distributions-by-web-acl-id-2016-09-07 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributionsByWebACLId2016_09_07", :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-09-07/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2016-09-07 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-09-07/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-09-07/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-09-07/origin-access-identity/cloudfront", :http.request.configuration/version "2016-09-07", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-09-07/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2016_09_07", :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2016-09-07/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-09-07/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2016-09-07/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2016-09-07/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-09-07/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2016-09-07 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-09-07/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-09-07/create-cloud-front-origin-access-identity-result))
