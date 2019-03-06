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

(clojure.core/defn- ser-forwarded-values [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:query-string input)) #:http.request.field{:name "QueryString", :shape "boolean"}) (clojure.core/into (ser-cookie-preference (:cookies input)) #:http.request.field{:name "Cookies", :shape "CookiePreference"})], :shape "ForwardedValues", :type "structure"} (clojure.core/contains? input :headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-headers (input :headers)) #:http.request.field{:name "Headers", :shape "Headers"}))))

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

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar60387 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar60387 ["Quantity" :content]))} (letvar60387 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar60387 ["Items" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar60483 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar60483 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar60483 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar60483 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar60483 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar60579 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar60579 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar60579 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar60579 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar60692 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar60692 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar60692 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar60692 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar60692 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar60827 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar60827 ["GeoRestriction" :content]))})))

(clojure.core/defn- deserstring [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar60928 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar60928 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar60928 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar60928 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar60928 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar60928 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar60928 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar60928 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar60928 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar61024 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar61024 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar61024 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar61024 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar61024 ["Quantity" :content]))} (letvar61024 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar61024 ["NextMarker" :content]))) (letvar61024 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar61024 ["Items" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar61120 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? false :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? false :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar61120 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar61120 ["Cookies" :content]))} (letvar61120 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar61120 ["Headers" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar61216 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar61216 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar61216 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar61329 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar61329 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar61329 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar61329 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar61329 ["Quantity" :content]))} (letvar61329 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar61329 ["NextMarker" :content]))) (letvar61329 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar61329 ["Items" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar61430 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar61430 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar61430 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar61430 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar61430 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar61430 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar61430 ["StreamingDistributionConfig" :content]))} (letvar61430 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar61430 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar61531 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? false :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? false :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? false :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar61531 ["ErrorCode" :content]))} (letvar61531 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar61531 ["ResponsePagePath" :content]))) (letvar61531 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar61531 ["ResponseCode" :content]))) (letvar61531 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar61531 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar61644 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? false :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar61644 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar61644 ["AwsAccountNumber" :content]))) (letvar61644 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar61644 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar61759 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar61759 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar61759 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar61860 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar61860 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar61860 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar61973 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar61973 ["Quantity" :content]))} (letvar61973 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar61973 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar62069 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar62069 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar62069 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar62069 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar62069 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar62069 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar62069 ["MinTTL" :content]))} (letvar62069 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar62069 ["SmoothStreaming" :content]))) (letvar62069 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar62069 ["Compress" :content]))) (letvar62069 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar62069 ["MaxTTL" :content]))) (letvar62069 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar62069 ["AllowedMethods" :content]))) (letvar62069 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar62069 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar62165 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar62165 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar62165 ["Quantity" :content]))} (letvar62165 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar62165 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar62261 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? false :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? false :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? false :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar62261 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar62261 ["DomainName" :content]))} (letvar62261 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar62261 ["OriginPath" :content]))) (letvar62261 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar62261 ["CustomHeaders" :content]))) (letvar62261 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar62261 ["S3OriginConfig" :content]))) (letvar62261 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar62261 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar62359 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar62359 ["Quantity" :content]))} (letvar62359 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar62359 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar62455 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar62455 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar62455 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar62455 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar62455 ["Quantity" :content]))} (letvar62455 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar62455 ["NextMarker" :content]))) (letvar62455 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar62455 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar62551 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar62551 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar62551 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar62647 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar62647 ["Quantity" :content]))} (letvar62647 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar62647 ["Items" :content]))))))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar62743 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar62743 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar62743 ["Items" :content]))} (letvar62743 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar62743 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar62844 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? false :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? false :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? false :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar62844 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar62844 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar62844 ["OriginProtocolPolicy" :content]))} (letvar62844 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar62844 ["OriginSslProtocols" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar62940 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar62940 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar62940 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar63036 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar63036 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar63036 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar63036 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar63036 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar63036 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar63036 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar63036 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar63036 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar63036 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar63036 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar63036 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar63132 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar63132 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar63132 ["S3CanonicalUserId" :content]))} (letvar63132 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar63132 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar63262 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar63262 ["Quantity" :content]))} (letvar63262 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar63262 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar63358 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar63358 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar63358 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar63358 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar63358 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar63358 ["Enabled" :content]))} (letvar63358 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar63358 ["DefaultRootObject" :content]))) (letvar63358 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar63358 ["Restrictions" :content]))) (letvar63358 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar63358 ["WebACLId" :content]))) (letvar63358 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar63358 ["Logging" :content]))) (letvar63358 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar63358 ["CacheBehaviors" :content]))) (letvar63358 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar63358 ["CustomErrorResponses" :content]))) (letvar63358 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar63358 ["Aliases" :content]))) (letvar63358 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar63358 ["PriceClass" :content]))) (letvar63358 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar63358 ["ViewerCertificate" :content]))))))

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

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar63576 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar63576 ["Quantity" :content]))} (letvar63576 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar63576 ["Items" :content]))))))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar63674 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar63674 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar63674 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar63674 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar63787 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? false :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar63787 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar63787 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar63883 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar63883 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar63883 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar63883 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar63883 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar63883 ["Enabled" :content]))} (letvar63883 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar63883 ["Aliases" :content]))) (letvar63883 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar63883 ["Logging" :content]))) (letvar63883 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar63883 ["PriceClass" :content]))))))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar63979 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar63979 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar64092 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar64092 ["Key" :content]))} (letvar64092 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar64092 ["Value" :content]))))))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar64188 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar64188 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar64188 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar64188 ["Prefix" :content]))})))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar64284 {"Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar64284 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar64284 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar64284 ["WebACLId" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar64284 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar64284 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar64284 ["ViewerCertificate" :content])), :domain-name (deserstring (clojure.core/get-in letvar64284 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar64284 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar64284 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar64284 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar64284 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar64284 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar64284 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar64284 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar64284 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar64284 ["PriceClass" :content]))})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar64385 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar64385 ["Quantity" :content]))} (letvar64385 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar64385 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar64486 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar64486 ["Quantity" :content]))} (letvar64486 "Items") (clojure.core/assoc :items (deser-origin-list (clojure.core/get-in letvar64486 ["Items" :content]))))))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar64599 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar64599 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar64599 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar64599 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar64599 ["Quantity" :content]))} (letvar64599 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar64599 ["NextMarker" :content]))) (letvar64599 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar64599 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar64700 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? false :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar64700 ["Forward" :content]))} (letvar64700 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar64700 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar64796 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar64796 ["Quantity" :content]))} (letvar64796 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar64796 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar64909 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar64909 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar64909 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar64909 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar64909 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar64909 ["MinTTL" :content]))} (letvar64909 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar64909 ["SmoothStreaming" :content]))) (letvar64909 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar64909 ["Compress" :content]))) (letvar64909 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar64909 ["MaxTTL" :content]))) (letvar64909 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar64909 ["AllowedMethods" :content]))) (letvar64909 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar64909 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar65005 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar65005 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar65005 ["Quantity" :content]))} (letvar65005 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar65005 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar65101 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? false :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? false :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? false :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? false :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? false :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? false :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar65101 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar65101 ["CloudFrontDefaultCertificate" :content]))) (letvar65101 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar65101 ["IAMCertificateId" :content]))) (letvar65101 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar65101 ["ACMCertificateArn" :content]))) (letvar65101 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar65101 ["SSLSupportMethod" :content]))) (letvar65101 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar65101 ["MinimumProtocolVersion" :content]))) (letvar65101 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar65101 ["Certificate" :content]))) (letvar65101 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar65101 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar65197 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar65197 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar65197 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar65293 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar65293 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar65293 ["Quantity" :content]))} (letvar65293 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar65293 ["Items" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-result [input] (clojure.core/let [rawinput65294 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65295 {"Tags" (portkey.aws/search-for-tag rawinput65294 "Tags" :flattened? false)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar65295 ["Tags" :content]))})))

(clojure.core/defn- response-no-such-origin [input] (clojure.core/let [rawinput65296 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65297 {"Message" (portkey.aws/search-for-tag rawinput65296 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65297 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65297 ["Message" :content]))))))

(clojure.core/defn- response-invalid-protocol-settings [input] (clojure.core/let [rawinput65298 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65299 {"Message" (portkey.aws/search-for-tag rawinput65298 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65299 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65299 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list [input] (clojure.core/let [rawinput65300 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65301 {"Message" (portkey.aws/search-for-tag rawinput65300 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65301 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65301 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cache-behaviors [input] (clojure.core/let [rawinput65302 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65303 {"Message" (portkey.aws/search-for-tag rawinput65302 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65303 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65303 ["Message" :content]))))))

(clojure.core/defn- response-too-many-origin-custom-headers [input] (clojure.core/let [rawinput65304 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65305 {"Message" (portkey.aws/search-for-tag rawinput65304 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65305 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65305 ["Message" :content]))))))

(clojure.core/defn- response-too-many-streaming-distributions [input] (clojure.core/let [rawinput65306 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65307 {"Message" (portkey.aws/search-for-tag rawinput65306 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65307 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65307 ["Message" :content]))))))

(clojure.core/defn- response-get-streaming-distribution-result [input] (clojure.core/let [rawinput65308 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65309 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput65308 "StreamingDistribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65309 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar65309 ["StreamingDistribution" :content]))) (letvar65309 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65309 ["ETag"]))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es [input] (clojure.core/let [rawinput65310 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65311 {"Message" (portkey.aws/search-for-tag rawinput65310 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65311 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65311 ["Message" :content]))))))

(clojure.core/defn- response-invalid-viewer-certificate [input] (clojure.core/let [rawinput65312 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65313 {"Message" (portkey.aws/search-for-tag rawinput65312 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65313 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65313 ["Message" :content]))))))

(clojure.core/defn- response-invalid-argument [input] (clojure.core/let [rawinput65314 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65315 {"Message" (portkey.aws/search-for-tag rawinput65314 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65315 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65315 ["Message" :content]))))))

(clojure.core/defn- response-streaming-distribution-not-disabled [input] (clojure.core/let [rawinput65316 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65317 {"Message" (portkey.aws/search-for-tag rawinput65316 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65317 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65317 ["Message" :content]))))))

(clojure.core/defn- response-too-many-certificates [input] (clojure.core/let [rawinput65318 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65319 {"Message" (portkey.aws/search-for-tag rawinput65318 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65319 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65319 ["Message" :content]))))))

(clojure.core/defn- response-access-denied [input] (clojure.core/let [rawinput65320 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65321 {"Message" (portkey.aws/search-for-tag rawinput65320 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65321 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65321 ["Message" :content]))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use [input] (clojure.core/let [rawinput65322 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65323 {"Message" (portkey.aws/search-for-tag rawinput65322 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65323 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65323 ["Message" :content]))))))

(clojure.core/defn- response-no-such-resource [input] (clojure.core/let [rawinput65324 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65325 {"Message" (portkey.aws/search-for-tag rawinput65324 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65325 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65325 ["Message" :content]))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput65326 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65327 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput65326 "CloudFrontOriginAccessIdentity" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65327 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar65327 ["CloudFrontOriginAccessIdentity" :content]))) (letvar65327 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65327 ["ETag"]))))))

(clojure.core/defn- response-invalid-error-code [input] (clojure.core/let [rawinput65328 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65329 {"Message" (portkey.aws/search-for-tag rawinput65328 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65329 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65329 ["Message" :content]))))))

(clojure.core/defn- response-create-streaming-distribution-result [input] (clojure.core/let [rawinput65330 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65331 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput65330 "StreamingDistribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65331 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar65331 ["StreamingDistribution" :content]))) (letvar65331 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar65331 ["Location"]))) (letvar65331 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65331 ["ETag"]))))))

(clojure.core/defn- response-invalid-relative-path [input] (clojure.core/let [rawinput65332 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65333 {"Message" (portkey.aws/search-for-tag rawinput65332 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65333 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65333 ["Message" :content]))))))

(clojure.core/defn- response-invalid-location-code [input] (clojure.core/let [rawinput65334 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65335 {"Message" (portkey.aws/search-for-tag rawinput65334 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65335 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65335 ["Message" :content]))))))

(clojure.core/defn- response-invalid-web-acl-id [input] (clojure.core/let [rawinput65336 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65337 {"Message" (portkey.aws/search-for-tag rawinput65336 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65337 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65337 ["Message" :content]))))))

(clojure.core/defn- response-invalid-origin [input] (clojure.core/let [rawinput65338 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65339 {"Message" (portkey.aws/search-for-tag rawinput65338 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65339 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65339 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities [input] (clojure.core/let [rawinput65340 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65341 {"Message" (portkey.aws/search-for-tag rawinput65340 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65341 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65341 ["Message" :content]))))))

(clojure.core/defn- response-update-distribution-result [input] (clojure.core/let [rawinput65342 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65343 {"Distribution" (portkey.aws/search-for-tag rawinput65342 "Distribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65343 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar65343 ["Distribution" :content]))) (letvar65343 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65343 ["ETag"]))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput65344 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65345 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput65344 "CloudFrontOriginAccessIdentity" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65345 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar65345 ["CloudFrontOriginAccessIdentity" :content]))) (letvar65345 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65345 ["ETag"]))))))

(clojure.core/defn- response-too-many-origins [input] (clojure.core/let [rawinput65346 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65347 {"Message" (portkey.aws/search-for-tag rawinput65346 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65347 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65347 ["Message" :content]))))))

(clojure.core/defn- response-invalid-ttl-order [input] (clojure.core/let [rawinput65348 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65349 {"Message" (portkey.aws/search-for-tag rawinput65348 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65349 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65349 ["Message" :content]))))))

(clojure.core/defn- response-no-such-streaming-distribution [input] (clojure.core/let [rawinput65350 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65351 {"Message" (portkey.aws/search-for-tag rawinput65350 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65351 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65351 ["Message" :content]))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput65352 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65353 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput65352 "CloudFrontOriginAccessIdentity" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65353 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar65353 ["CloudFrontOriginAccessIdentity" :content]))) (letvar65353 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar65353 ["Location"]))) (letvar65353 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65353 ["ETag"]))))))

(clojure.core/defn- response-cname-already-exists [input] (clojure.core/let [rawinput65354 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65355 {"Message" (portkey.aws/search-for-tag rawinput65354 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65355 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65355 ["Message" :content]))))))

(clojure.core/defn- response-invalid-default-root-object [input] (clojure.core/let [rawinput65356 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65357 {"Message" (portkey.aws/search-for-tag rawinput65356 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65357 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65357 ["Message" :content]))))))

(clojure.core/defn- response-invalid-response-code [input] (clojure.core/let [rawinput65358 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65359 {"Message" (portkey.aws/search-for-tag rawinput65358 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65359 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65359 ["Message" :content]))))))

(clojure.core/defn- response-no-such-invalidation [input] (clojure.core/let [rawinput65360 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65361 {"Message" (portkey.aws/search-for-tag rawinput65360 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65361 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65361 ["Message" :content]))))))

(clojure.core/defn- response-too-many-invalidations-in-progress [input] (clojure.core/let [rawinput65362 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65363 {"Message" (portkey.aws/search-for-tag rawinput65362 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65363 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65363 ["Message" :content]))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result [input] (clojure.core/let [rawinput65364 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65365 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput65364 "CloudFrontOriginAccessIdentityList" :flattened? false)}] (clojure.core/cond-> {} (letvar65365 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar65365 ["CloudFrontOriginAccessIdentityList" :content]))))))

(clojure.core/defn- response-invalid-forward-cookies [input] (clojure.core/let [rawinput65366 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65367 {"Message" (portkey.aws/search-for-tag rawinput65366 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65367 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65367 ["Message" :content]))))))

(clojure.core/defn- response-get-distribution-config-result [input] (clojure.core/let [rawinput65368 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65369 {"DistributionConfig" (portkey.aws/search-for-tag rawinput65368 "DistributionConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65369 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar65369 ["DistributionConfig" :content]))) (letvar65369 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65369 ["ETag"]))))))

(clojure.core/defn- response-invalid-required-protocol [input] (clojure.core/let [rawinput65370 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65371 {"Message" (portkey.aws/search-for-tag rawinput65370 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65371 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65371 ["Message" :content]))))))

(clojure.core/defn- response-get-distribution-result [input] (clojure.core/let [rawinput65372 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65373 {"Distribution" (portkey.aws/search-for-tag rawinput65372 "Distribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65373 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar65373 ["Distribution" :content]))) (letvar65373 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65373 ["ETag"]))))))

(clojure.core/defn- response-get-streaming-distribution-config-result [input] (clojure.core/let [rawinput65374 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65375 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput65374 "StreamingDistributionConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65375 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar65375 ["StreamingDistributionConfig" :content]))) (letvar65375 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65375 ["ETag"]))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin [input] (clojure.core/let [rawinput65376 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65377 {"Message" (portkey.aws/search-for-tag rawinput65376 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65377 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65377 ["Message" :content]))))))

(clojure.core/defn- response-too-many-distribution-cnam-es [input] (clojure.core/let [rawinput65378 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65379 {"Message" (portkey.aws/search-for-tag rawinput65378 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65379 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65379 ["Message" :content]))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter [input] (clojure.core/let [rawinput65380 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65381 {"Message" (portkey.aws/search-for-tag rawinput65380 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65381 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65381 ["Message" :content]))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity [input] (clojure.core/let [rawinput65382 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65383 {"Message" (portkey.aws/search-for-tag rawinput65382 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65383 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65383 ["Message" :content]))))))

(clojure.core/defn- response-list-invalidations-result [input] (clojure.core/let [rawinput65384 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65385 {"InvalidationList" (portkey.aws/search-for-tag rawinput65384 "InvalidationList" :flattened? false)}] (clojure.core/cond-> {} (letvar65385 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar65385 ["InvalidationList" :content]))))))

(clojure.core/defn- response-batch-too-large [input] (clojure.core/let [rawinput65386 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65387 {"Message" (portkey.aws/search-for-tag rawinput65386 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65387 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65387 ["Message" :content]))))))

(clojure.core/defn- response-create-distribution-with-tags-result [input] (clojure.core/let [rawinput65388 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65389 {"Distribution" (portkey.aws/search-for-tag rawinput65388 "Distribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65389 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar65389 ["Distribution" :content]))) (letvar65389 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar65389 ["Location"]))) (letvar65389 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65389 ["ETag"]))))))

(clojure.core/defn- response-list-streaming-distributions-result [input] (clojure.core/let [rawinput65390 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65391 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput65390 "StreamingDistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar65391 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar65391 ["StreamingDistributionList" :content]))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result [input] (clojure.core/let [rawinput65392 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65393 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput65392 "StreamingDistribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65393 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar65393 ["StreamingDistribution" :content]))) (letvar65393 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar65393 ["Location"]))) (letvar65393 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65393 ["ETag"]))))))

(clojure.core/defn- response-create-invalidation-result [input] (clojure.core/let [rawinput65394 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65395 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput65394 "Invalidation" :flattened? false)}] (clojure.core/cond-> {} (letvar65395 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar65395 ["Location"]))) (letvar65395 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar65395 ["Invalidation" :content]))))))

(clojure.core/defn- response-missing-body [input] (clojure.core/let [rawinput65396 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65397 {"Message" (portkey.aws/search-for-tag rawinput65396 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65397 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65397 ["Message" :content]))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result [input] (clojure.core/let [rawinput65398 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65399 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput65398 "CloudFrontOriginAccessIdentityConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65399 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar65399 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar65399 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65399 ["ETag"]))))))

(clojure.core/defn- response-distribution-not-disabled [input] (clojure.core/let [rawinput65400 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65401 {"Message" (portkey.aws/search-for-tag rawinput65400 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65401 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65401 ["Message" :content]))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists [input] (clojure.core/let [rawinput65402 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65403 {"Message" (portkey.aws/search-for-tag rawinput65402 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65403 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65403 ["Message" :content]))))))

(clojure.core/defn- response-precondition-failed [input] (clojure.core/let [rawinput65404 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65405 {"Message" (portkey.aws/search-for-tag rawinput65404 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65405 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65405 ["Message" :content]))))))

(clojure.core/defn- response-distribution-already-exists [input] (clojure.core/let [rawinput65406 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65407 {"Message" (portkey.aws/search-for-tag rawinput65406 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65407 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65407 ["Message" :content]))))))

(clojure.core/defn- response-invalid-origin-access-identity [input] (clojure.core/let [rawinput65408 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65409 {"Message" (portkey.aws/search-for-tag rawinput65408 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65409 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65409 ["Message" :content]))))))

(clojure.core/defn- response-too-many-trusted-signers [input] (clojure.core/let [rawinput65410 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65411 {"Message" (portkey.aws/search-for-tag rawinput65410 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65411 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65411 ["Message" :content]))))))

(clojure.core/defn- response-invalid-minimum-protocol-version [input] (clojure.core/let [rawinput65412 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65413 {"Message" (portkey.aws/search-for-tag rawinput65412 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65413 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65413 ["Message" :content]))))))

(clojure.core/defn- response-streaming-distribution-already-exists [input] (clojure.core/let [rawinput65414 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65415 {"Message" (portkey.aws/search-for-tag rawinput65414 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65415 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65415 ["Message" :content]))))))

(clojure.core/defn- response-invalid-if-match-version [input] (clojure.core/let [rawinput65416 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65417 {"Message" (portkey.aws/search-for-tag rawinput65416 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65417 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65417 ["Message" :content]))))))

(clojure.core/defn- response-create-distribution-result [input] (clojure.core/let [rawinput65418 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65419 {"Distribution" (portkey.aws/search-for-tag rawinput65418 "Distribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65419 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar65419 ["Distribution" :content]))) (letvar65419 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar65419 ["Location"]))) (letvar65419 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65419 ["ETag"]))))))

(clojure.core/defn- response-too-many-distributions [input] (clojure.core/let [rawinput65420 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65421 {"Message" (portkey.aws/search-for-tag rawinput65420 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65421 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65421 ["Message" :content]))))))

(clojure.core/defn- response-no-such-distribution [input] (clojure.core/let [rawinput65422 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65423 {"Message" (portkey.aws/search-for-tag rawinput65422 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65423 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65423 ["Message" :content]))))))

(clojure.core/defn- response-update-streaming-distribution-result [input] (clojure.core/let [rawinput65424 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65425 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput65424 "StreamingDistribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar65425 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar65425 ["StreamingDistribution" :content]))) (letvar65425 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar65425 ["ETag"]))))))

(clojure.core/defn- response-illegal-update [input] (clojure.core/let [rawinput65426 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65427 {"Message" (portkey.aws/search-for-tag rawinput65426 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65427 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65427 ["Message" :content]))))))

(clojure.core/defn- response-inconsistent-quantities [input] (clojure.core/let [rawinput65428 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65429 {"Message" (portkey.aws/search-for-tag rawinput65428 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65429 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65429 ["Message" :content]))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result [input] (clojure.core/let [rawinput65430 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65431 {"DistributionList" (portkey.aws/search-for-tag rawinput65430 "DistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar65431 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar65431 ["DistributionList" :content]))))))

(clojure.core/defn- response-invalid-tagging [input] (clojure.core/let [rawinput65432 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65433 {"Message" (portkey.aws/search-for-tag rawinput65432 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65433 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65433 ["Message" :content]))))))

(clojure.core/defn- response-list-distributions-result [input] (clojure.core/let [rawinput65434 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65435 {"DistributionList" (portkey.aws/search-for-tag rawinput65434 "DistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar65435 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar65435 ["DistributionList" :content]))))))

(clojure.core/defn- response-trusted-signer-does-not-exist [input] (clojure.core/let [rawinput65436 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65437 {"Message" (portkey.aws/search-for-tag rawinput65436 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65437 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65437 ["Message" :content]))))))

(clojure.core/defn- response-get-invalidation-result [input] (clojure.core/let [rawinput65438 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65439 {"Invalidation" (portkey.aws/search-for-tag rawinput65438 "Invalidation" :flattened? false)}] (clojure.core/cond-> {} (letvar65439 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar65439 ["Invalidation" :content]))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values [input] (clojure.core/let [rawinput65440 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar65441 {"Message" (portkey.aws/search-for-tag rawinput65440 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar65441 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar65441 ["Message" :content]))))))

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

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 1 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 128)) (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__22929__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22927__auto__] (clojure.core/<= 0 (clojure.core/count s__22927__auto__))) (clojure.core/fn [s__22928__auto__] (clojure.core/< (clojure.core/count s__22928__auto__) 256)) (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__22929__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-08-01/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__22929__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__22929__auto__))))

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

(clojure.core/defn tag-resource-2016-08-01 ([tag-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/tagging?Operation=Tag", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "TagResource2016_08_01", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-01/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-08-01/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2016-08-01 ([get-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution/{Id}", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistribution2016_08_01", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/get-distribution-result))

(clojure.core/defn create-streaming-distribution-with-tags-2016-08-01 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/streaming-distribution?WithTags", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistributionWithTags2016_08_01", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-08-01/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-01/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-08-01/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-08-01/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-01/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-01/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-01/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2016-08-01 ([update-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution/{Id}/config", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDistribution2016_08_01", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-08-01/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-08-01/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-08-01/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-08-01/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-08-01/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-08-01/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-08-01/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-08-01/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-08-01/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-08-01/invalid-web-acl-id, "TooManyOrigins" :portkey.aws.cloudfront.-2016-08-01/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-08-01/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-08-01/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-08-01/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-08-01/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-08-01/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-08-01/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-01/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-08-01/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-08-01/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-01/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-01/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-08-01/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-01/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2016-08-01/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-01/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-08-01/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/update-distribution-result))

(clojure.core/defn delete-streaming-distribution-2016-08-01 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/streaming-distribution/{Id}", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteStreamingDistribution2016_08_01", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-01/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-01/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2016-08-01 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2016_08_01", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-01/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-01/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2016-08-01 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution?WithTags", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistributionWithTags2016_08_01", :http.request.configuration/output-deser-fn response-create-distribution-with-tags-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-08-01/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-08-01/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-08-01/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-08-01/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-08-01/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-08-01/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-08-01/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-08-01/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-08-01/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-08-01/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-08-01/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-08-01/invalid-origin, "TooManyOrigins" :portkey.aws.cloudfront.-2016-08-01/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-08-01/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-08-01/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-08-01/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-08-01/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-08-01/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-08-01/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-01/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-08-01/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-08-01/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-01/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-08-01/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-08-01/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-01/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-01/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-08-01/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/create-distribution-with-tags-result))

(clojure.core/defn get-invalidation-2016-08-01 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInvalidation2016_08_01", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2016-08-01/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/get-invalidation-result))

(clojure.core/defn create-streaming-distribution-2016-08-01 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/streaming-distribution", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistribution2016_08_01", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-08-01/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-01/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-08-01/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-08-01/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-01/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-01/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/create-streaming-distribution-result))

(clojure.core/defn list-tags-for-resource-2016-08-01 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/tagging", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource2016_08_01", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-01/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-08-01/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2016-08-01 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/streaming-distribution/{Id}", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistribution2016_08_01", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-result))

(clojure.core/defn create-distribution-2016-08-01 ([create-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistribution2016_08_01", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-08-01/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-08-01/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-08-01/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-08-01/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-08-01/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-08-01/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-08-01/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-08-01/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-08-01/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-08-01/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-08-01/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-08-01/invalid-origin, "TooManyOrigins" :portkey.aws.cloudfront.-2016-08-01/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-08-01/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-08-01/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-08-01/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-08-01/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-08-01/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-08-01/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-01/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-08-01/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-08-01/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-01/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-08-01/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-08-01/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-01/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-08-01/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/create-distribution-result))

(clojure.core/defn get-streaming-distribution-config-2016-08-01 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistributionConfig2016_08_01", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/get-streaming-distribution-config-result))

(clojure.core/defn list-distributions-2016-08-01 ([] (list-distributions-2016-08-01 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributions2016_08_01", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2016-08-01 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-08-01/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/list-distributions-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2016-08-01 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2016_08_01", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2016-08-01 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInvalidations2016_08_01", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/list-invalidations-result))

(clojure.core/defn untag-resource-2016-08-01 ([untag-resource-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/tagging?Operation=Untag", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/action "UntagResource2016_08_01", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-08-01/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-08-01/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2016-08-01 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2016_08_01", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2016-08-01 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2016_08_01", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2016-08-01/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-01/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2016-08-01/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-01/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2016-08-01 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStreamingDistribution2016_08_01", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-08-01/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-08-01/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-01/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-08-01/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-08-01/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-01/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2016-08-01/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-08-01/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2016-08-01 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution/{Id}/config", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistributionConfig2016_08_01", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/get-distribution-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2016-08-01 ([] (list-cloud-front-origin-access-identities-2016-08-01 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/origin-access-identity/cloudfront", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2016_08_01", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2016-08-01 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-08-01/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2016-08-01 ([] (list-streaming-distributions-2016-08-01 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/streaming-distribution", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreamingDistributions2016_08_01", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2016-08-01 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-08-01/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/list-streaming-distributions-result))

(clojure.core/defn delete-distribution-2016-08-01 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution/{Id}", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteDistribution2016_08_01", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2016-08-01/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-08-01/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-08-01/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2016-08-01 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateInvalidation2016_08_01", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-08-01/access-denied, "MissingBody" :portkey.aws.cloudfront.-2016-08-01/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-08-01/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2016-08-01/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2016-08-01/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/create-invalidation-result))

(clojure.core/defn list-distributions-by-web-acl-id-2016-08-01 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributionsByWebACLId2016_08_01", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-08-01/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2016-08-01 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-08-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-08-01/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-08-01/origin-access-identity/cloudfront", :http.request.configuration/version "2016-08-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-08-01/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2016_08_01", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2016-08-01/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-08-01/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2016-08-01/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2016-08-01/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-08-01/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2016-08-01 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-08-01/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-08-01/create-cloud-front-origin-access-identity-result))
