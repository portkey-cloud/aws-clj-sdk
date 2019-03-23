(ns portkey.aws.cloudfront.-2016-01-28 (:require [portkey.aws]))

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

(clojure.core/declare serboolean)

(clojure.core/declare ser-cookie-names)

(clojure.core/declare ser-logging-config)

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

(clojure.core/declare ser-distribution-config)

(clojure.core/declare ser-ssl-protocols-list)

(clojure.core/declare ser-aws-account-number-list)

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

(clojure.core/declare ser-streaming-logging-config)

(clojure.core/declare ser-ssl-protocol)

(clojure.core/declare ser-headers)

(clojure.core/declare ser-minimum-protocol-version)

(clojure.core/declare ser-origins)

(clojure.core/declare ser-header-list)

(clojure.core/declare ser-ssl-support-method)

(clojure.core/declare ser-cookie-preference)

(clojure.core/declare ser-custom-headers)

(clojure.core/declare ser-methods-list)

(clojure.core/declare ser-default-cache-behavior)

(clojure.core/declare ser-trusted-signers)

(clojure.core/declare ser-viewer-certificate)

(clojure.core/declare ser-cloud-front-origin-access-identity-config)

(clojure.core/declare ser-geo-restriction)

(clojure.core/defn- serboolean [input] #:http.request.field{:value input, :shape "boolean"})

(clojure.core/defn- ser-cookie-names [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CookieNames", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cookie-name-list (input :items)) #:http.request.field{:name "Items", :shape "CookieNameList"}))))

(clojure.core/defn- ser-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serboolean (:include-cookies input)) #:http.request.field{:name "IncludeCookies", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "LoggingConfig", :type "structure"}))

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

(clojure.core/defn- ser-cache-behaviors [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CacheBehaviors", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behavior-list (input :items)) #:http.request.field{:name "Items", :shape "CacheBehaviorList"}))))

(clojure.core/defn- ser-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:path-pattern input)) #:http.request.field{:name "PathPattern", :shape "string"}) (clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "CacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:id input)) #:http.request.field{:name "Id", :shape "string"}) (clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"})], :shape "Origin", :type "structure"} (clojure.core/contains? input :origin-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :origin-path)) #:http.request.field{:name "OriginPath", :shape "string"})) (clojure.core/contains? input :custom-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-headers (input :custom-headers)) #:http.request.field{:name "CustomHeaders", :shape "CustomHeaders"})) (clojure.core/contains? input :s-3-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-origin-config (input :s-3-origin-config)) #:http.request.field{:name "S3OriginConfig", :shape "S3OriginConfig"})) (clojure.core/contains? input :custom-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-origin-config (input :custom-origin-config)) #:http.request.field{:name "CustomOriginConfig", :shape "CustomOriginConfig"}))))

(clojure.core/defn- ser-custom-error-responses [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomErrorResponses", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-response-list (input :items)) #:http.request.field{:name "Items", :shape "CustomErrorResponseList"}))))

(clojure.core/defn- ser-origin-ssl-protocols [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-ssl-protocols-list (:items input)) #:http.request.field{:name "Items", :shape "SslProtocolsList"})], :shape "OriginSslProtocols", :type "structure"}))

(clojure.core/defn- ser-aliases [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Aliases", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-list (input :items)) #:http.request.field{:name "Items", :shape "AliasList"}))))

(clojure.core/defn- ser-allowed-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "AllowedMethods", :type "structure"} (clojure.core/contains? input :cached-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cached-methods (input :cached-methods)) #:http.request.field{:name "CachedMethods", :shape "CachedMethods"}))))

(clojure.core/defn- ser-price-class [input] #:http.request.field{:value (clojure.core/get {"PriceClass_100" "PriceClass_100", :price-class-100 "PriceClass_100", "PriceClass_200" "PriceClass_200", :price-class-200 "PriceClass_200", "PriceClass_All" "PriceClass_All", :price-class-all "PriceClass_All"} input), :shape "PriceClass"})

(clojure.core/defn- ser-custom-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:http-port input)) #:http.request.field{:name "HTTPPort", :shape "integer"}) (clojure.core/into (serinteger (:https-port input)) #:http.request.field{:name "HTTPSPort", :shape "integer"}) (clojure.core/into (ser-origin-protocol-policy (:origin-protocol-policy input)) #:http.request.field{:name "OriginProtocolPolicy", :shape "OriginProtocolPolicy"})], :shape "CustomOriginConfig", :type "structure"} (clojure.core/contains? input :origin-ssl-protocols) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-ssl-protocols (input :origin-ssl-protocols)) #:http.request.field{:name "OriginSslProtocols", :shape "OriginSslProtocols"})) (clojure.core/contains? input :origin-read-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serinteger (input :origin-read-timeout)) #:http.request.field{:name "OriginReadTimeout", :shape "integer"})) (clojure.core/contains? input :origin-keepalive-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serinteger (input :origin-keepalive-timeout)) #:http.request.field{:name "OriginKeepaliveTimeout", :shape "integer"}))))

(clojure.core/defn- ser-s-3-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"}) (clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3Origin", :type "structure"}))

(clojure.core/defn- ser-cookie-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "CookieNameList", :type "list"})

(clojure.core/defn- ser-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-origins (:origins input)) #:http.request.field{:name "Origins", :shape "Origins"}) (clojure.core/into (ser-default-cache-behavior (:default-cache-behavior input)) #:http.request.field{:name "DefaultCacheBehavior", :shape "DefaultCacheBehavior"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "DistributionConfig", :type "structure"} (clojure.core/contains? input :default-root-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :default-root-object)) #:http.request.field{:name "DefaultRootObject", :shape "string"})) (clojure.core/contains? input :is-ipv-6-enabled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :is-ipv-6-enabled)) #:http.request.field{:name "IsIPV6Enabled", :shape "boolean"})) (clojure.core/contains? input :restrictions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restrictions (input :restrictions)) #:http.request.field{:name "Restrictions", :shape "Restrictions"})) (clojure.core/contains? input :web-acl-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "LoggingConfig"})) (clojure.core/contains? input :cache-behaviors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behaviors (input :cache-behaviors)) #:http.request.field{:name "CacheBehaviors", :shape "CacheBehaviors"})) (clojure.core/contains? input :custom-error-responses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-responses (input :custom-error-responses)) #:http.request.field{:name "CustomErrorResponses", :shape "CustomErrorResponses"})) (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"})) (clojure.core/contains? input :http-version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-http-version (input :http-version)) #:http.request.field{:name "HttpVersion", :shape "HttpVersion"})) (clojure.core/contains? input :origin-groups) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-groups (input :origin-groups)) #:http.request.field{:name "OriginGroups", :shape "OriginGroups"})) (clojure.core/contains? input :viewer-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-viewer-certificate (input :viewer-certificate)) #:http.request.field{:name "ViewerCertificate", :shape "ViewerCertificate"}))))

(clojure.core/defn- ser-ssl-protocols-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ssl-protocol coll) #:http.request.field{:shape "SslProtocol", :location-name "SslProtocol"}))) input), :shape "SslProtocolsList", :type "list"})

(clojure.core/defn- ser-aws-account-number-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "AwsAccountNumber"}))) input), :shape "AwsAccountNumberList", :type "list"})

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

(clojure.core/defn- ser-streaming-logging-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"}) (clojure.core/into (serstring (:bucket input)) #:http.request.field{:name "Bucket", :shape "string"}) (clojure.core/into (serstring (:prefix input)) #:http.request.field{:name "Prefix", :shape "string"})], :shape "StreamingLoggingConfig", :type "structure"}))

(clojure.core/defn- ser-ssl-protocol [input] #:http.request.field{:value (clojure.core/get {"SSLv3" "SSLv3", :ss-lv-3 "SSLv3", "TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1.1" "TLSv1.1", :tl-sv-11 "TLSv1.1", "TLSv1.2" "TLSv1.2", :tl-sv-12 "TLSv1.2"} input), :shape "SslProtocol"})

(clojure.core/defn- ser-headers [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Headers", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-header-list (input :items)) #:http.request.field{:name "Items", :shape "HeaderList"}))))

(clojure.core/defn- ser-minimum-protocol-version [input] #:http.request.field{:value (clojure.core/get {"SSLv3" "SSLv3", :ss-lv-3 "SSLv3", "TLSv1" "TLSv1", :tl-sv-1 "TLSv1"} input), :shape "MinimumProtocolVersion"})

(clojure.core/defn- ser-origins [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Origins", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-list (input :items)) #:http.request.field{:name "Items", :shape "OriginList"}))))

(clojure.core/defn- ser-header-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "HeaderList", :type "list"})

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

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-01-28/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-01-28/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-01-28/"}})]}))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-01-28/"}})]}))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-01-28/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-01-28/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-01-28/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

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

(clojure.core/declare deser-key-pair-ids)

(clojure.core/declare deser-distribution-config)

(clojure.core/declare deser-ssl-protocols-list)

(clojure.core/declare deser-aws-account-number-list)

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

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar151365 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar151365 ["Quantity" :content]))} (letvar151365 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar151365 ["Items" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar151549 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar151549 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar151549 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar151549 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar151549 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar151655 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar151655 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar151655 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar151655 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar151881 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar151881 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar151881 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar151881 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar151881 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar152182 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar152182 ["GeoRestriction" :content]))})))

(clojure.core/defn- deserstring [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar152380 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar152380 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar152380 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar152380 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar152380 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar152380 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar152380 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar152380 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar152579 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar152579 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar152579 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar152579 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar152579 ["Quantity" :content]))} (letvar152579 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar152579 ["NextMarker" :content]))) (letvar152579 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar152579 ["Items" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar152741 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? false :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? false :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? false :xmlAttribute? nil), "QueryStringCacheKeys" (portkey.aws/search-for-tag input "QueryStringCacheKeys" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar152741 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar152741 ["Cookies" :content]))} (letvar152741 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar152741 ["Headers" :content]))) (letvar152741 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar152741 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar152941 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar152941 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar152941 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar153176 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar153176 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar153176 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar153176 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar153176 ["Quantity" :content]))} (letvar153176 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar153176 ["NextMarker" :content]))) (letvar153176 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar153176 ["Items" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar153390 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar153390 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar153390 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar153390 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar153390 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar153390 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar153390 ["StreamingDistributionConfig" :content]))} (letvar153390 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar153390 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar153604 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? false :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? false :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? false :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar153604 ["ErrorCode" :content]))} (letvar153604 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar153604 ["ResponsePagePath" :content]))) (letvar153604 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar153604 ["ResponseCode" :content]))) (letvar153604 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar153604 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar153845 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? false :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar153845 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar153845 ["AwsAccountNumber" :content]))) (letvar153845 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar153845 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar154057 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar154057 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar154057 ["Items" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar154291 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar154291 ["Quantity" :content]))} (letvar154291 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar154291 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar154490 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "FieldLevelEncryptionId" (portkey.aws/search-for-tag input "FieldLevelEncryptionId" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar154490 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar154490 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar154490 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar154490 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar154490 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar154490 ["MinTTL" :content]))} (letvar154490 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar154490 ["SmoothStreaming" :content]))) (letvar154490 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar154490 ["FieldLevelEncryptionId" :content]))) (letvar154490 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar154490 ["Compress" :content]))) (letvar154490 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar154490 ["LambdaFunctionAssociations" :content]))) (letvar154490 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar154490 ["MaxTTL" :content]))) (letvar154490 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar154490 ["AllowedMethods" :content]))) (letvar154490 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar154490 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar154688 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar154688 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar154688 ["Quantity" :content]))} (letvar154688 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar154688 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar154882 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? false :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? false :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? false :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar154882 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar154882 ["DomainName" :content]))} (letvar154882 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar154882 ["OriginPath" :content]))) (letvar154882 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar154882 ["CustomHeaders" :content]))) (letvar154882 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar154882 ["S3OriginConfig" :content]))) (letvar154882 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar154882 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar155098 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar155098 ["Quantity" :content]))} (letvar155098 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar155098 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar155273 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar155273 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar155273 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar155273 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar155273 ["Quantity" :content]))} (letvar155273 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar155273 ["NextMarker" :content]))) (letvar155273 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar155273 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar155465 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar155465 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar155465 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar155654 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar155654 ["Quantity" :content]))} (letvar155654 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar155654 ["Items" :content]))))))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar155859 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar155859 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar155859 ["Items" :content]))} (letvar155859 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar155859 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar156057 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? false :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? false :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? false :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar156057 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar156057 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar156057 ["OriginProtocolPolicy" :content]))} (letvar156057 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar156057 ["OriginSslProtocols" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar156252 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar156252 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar156252 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar156446 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar156446 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar156446 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar156446 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar156446 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar156446 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar156446 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar156446 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar156446 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar156446 ["LastModifiedTime" :content])), :price-class (deser-price-class (clojure.core/get-in letvar156446 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar156654 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar156654 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar156654 ["S3CanonicalUserId" :content]))} (letvar156654 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar156654 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar156880 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar156880 ["Quantity" :content]))} (letvar156880 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar156880 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar157065 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? false :xmlAttribute? nil), "OriginGroups" (portkey.aws/search-for-tag input "OriginGroups" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar157065 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar157065 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar157065 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar157065 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar157065 ["Enabled" :content]))} (letvar157065 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar157065 ["DefaultRootObject" :content]))) (letvar157065 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar157065 ["IsIPV6Enabled" :content]))) (letvar157065 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar157065 ["Restrictions" :content]))) (letvar157065 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar157065 ["WebACLId" :content]))) (letvar157065 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar157065 ["Logging" :content]))) (letvar157065 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar157065 ["CacheBehaviors" :content]))) (letvar157065 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar157065 ["CustomErrorResponses" :content]))) (letvar157065 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar157065 ["Aliases" :content]))) (letvar157065 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar157065 ["PriceClass" :content]))) (letvar157065 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar157065 ["HttpVersion" :content]))) (letvar157065 "OriginGroups") (clojure.core/assoc :origin-groups (deser-origin-groups (clojure.core/get-in letvar157065 ["OriginGroups" :content]))) (letvar157065 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar157065 ["ViewerCertificate" :content]))))))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-method [input] (clojure.core/get {"GET" :get, "HEAD" :head, "POST" :post, "PUT" :put, "PATCH" :patch, "OPTIONS" :options, "DELETE" :delete} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-custom-header coll))) input))

(clojure.core/defn- deser-origin-protocol-policy [input] (clojure.core/get {"http-only" :httponly, "match-viewer" :matchviewer, "https-only" :httpsonly} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signer coll))) input))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (clojure.core/get {"blacklist" :blacklist, "whitelist" :whitelist, "none" :none} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar157527 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar157527 ["Quantity" :content]))} (letvar157527 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar157527 ["Items" :content]))))))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar157730 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar157730 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar157730 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar157730 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar157939 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? false :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar157939 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar157939 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar158131 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar158131 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar158131 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar158131 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar158131 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar158131 ["Enabled" :content]))} (letvar158131 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar158131 ["Aliases" :content]))) (letvar158131 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar158131 ["Logging" :content]))) (letvar158131 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar158131 ["PriceClass" :content]))))))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar158323 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar158323 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar158532 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar158532 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar158532 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar158532 ["Prefix" :content]))})))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar158730 {"IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? false :xmlAttribute? nil), "OriginGroups" (portkey.aws/search-for-tag input "OriginGroups" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar158730 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar158730 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar158730 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar158730 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar158730 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar158730 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar158730 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar158730 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar158730 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar158730 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar158730 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar158730 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar158730 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar158730 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar158730 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar158730 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar158730 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar158730 ["PriceClass" :content]))} (letvar158730 "OriginGroups") (clojure.core/assoc :origin-groups (deser-origin-groups (clojure.core/get-in letvar158730 ["OriginGroups" :content]))))))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar158932 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar158932 ["Quantity" :content]))} (letvar158932 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar158932 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar159136 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar159136 ["Quantity" :content])), :items (deser-origin-list (clojure.core/get-in letvar159136 ["Items" :content]))})))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar159366 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar159366 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar159366 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar159366 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar159366 ["Quantity" :content]))} (letvar159366 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar159366 ["NextMarker" :content]))) (letvar159366 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar159366 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar159568 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? false :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar159568 ["Forward" :content]))} (letvar159568 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar159568 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar159766 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar159766 ["Quantity" :content]))} (letvar159766 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar159766 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar160005 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "FieldLevelEncryptionId" (portkey.aws/search-for-tag input "FieldLevelEncryptionId" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar160005 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar160005 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar160005 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar160005 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar160005 ["MinTTL" :content]))} (letvar160005 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar160005 ["SmoothStreaming" :content]))) (letvar160005 "FieldLevelEncryptionId") (clojure.core/assoc :field-level-encryption-id (deserstring (clojure.core/get-in letvar160005 ["FieldLevelEncryptionId" :content]))) (letvar160005 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar160005 ["Compress" :content]))) (letvar160005 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar160005 ["LambdaFunctionAssociations" :content]))) (letvar160005 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar160005 ["MaxTTL" :content]))) (letvar160005 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar160005 ["AllowedMethods" :content]))) (letvar160005 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar160005 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar160188 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar160188 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar160188 ["Quantity" :content]))} (letvar160188 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar160188 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar160381 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? false :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? false :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? false :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? false :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? false :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? false :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar160381 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar160381 ["CloudFrontDefaultCertificate" :content]))) (letvar160381 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar160381 ["IAMCertificateId" :content]))) (letvar160381 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar160381 ["ACMCertificateArn" :content]))) (letvar160381 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar160381 ["SSLSupportMethod" :content]))) (letvar160381 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar160381 ["MinimumProtocolVersion" :content]))) (letvar160381 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar160381 ["Certificate" :content]))) (letvar160381 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar160381 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar160580 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar160580 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar160580 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar160769 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar160769 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar160769 ["Quantity" :content]))} (letvar160769 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar160769 ["Items" :content]))))))

(clojure.core/defn- response-no-such-origin ([input] (response-no-such-origin nil input)) ([resultWrapper160786 input] (clojure.core/let [rawinput160785 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160787 {"Message" (portkey.aws/search-for-tag rawinput160785 "Message" :flattened? false :result-wrapper resultWrapper160786)}] (clojure.core/cond-> {} (letvar160787 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160787 ["Message" :content])))))))

(clojure.core/defn- response-invalid-protocol-settings ([input] (response-invalid-protocol-settings nil input)) ([resultWrapper160789 input] (clojure.core/let [rawinput160788 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160790 {"Message" (portkey.aws/search-for-tag rawinput160788 "Message" :flattened? false :result-wrapper resultWrapper160789)}] (clojure.core/cond-> {} (letvar160790 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160790 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list ([input] (response-too-many-cookie-names-in-white-list nil input)) ([resultWrapper160796 input] (clojure.core/let [rawinput160795 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160797 {"Message" (portkey.aws/search-for-tag rawinput160795 "Message" :flattened? false :result-wrapper resultWrapper160796)}] (clojure.core/cond-> {} (letvar160797 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160797 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cache-behaviors ([input] (response-too-many-cache-behaviors nil input)) ([resultWrapper160799 input] (clojure.core/let [rawinput160798 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160800 {"Message" (portkey.aws/search-for-tag rawinput160798 "Message" :flattened? false :result-wrapper resultWrapper160799)}] (clojure.core/cond-> {} (letvar160800 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160800 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origin-custom-headers ([input] (response-too-many-origin-custom-headers nil input)) ([resultWrapper160803 input] (clojure.core/let [rawinput160802 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160804 {"Message" (portkey.aws/search-for-tag rawinput160802 "Message" :flattened? false :result-wrapper resultWrapper160803)}] (clojure.core/cond-> {} (letvar160804 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160804 ["Message" :content])))))))

(clojure.core/defn- response-too-many-streaming-distributions ([input] (response-too-many-streaming-distributions nil input)) ([resultWrapper160806 input] (clojure.core/let [rawinput160805 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160807 {"Message" (portkey.aws/search-for-tag rawinput160805 "Message" :flattened? false :result-wrapper resultWrapper160806)}] (clojure.core/cond-> {} (letvar160807 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160807 ["Message" :content])))))))

(clojure.core/defn- response-get-streaming-distribution-result ([input] (response-get-streaming-distribution-result nil input)) ([resultWrapper160809 input] (clojure.core/let [rawinput160808 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160812 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput160808 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper160809), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar160812 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar160812 ["StreamingDistribution" :content]))) (letvar160812 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar160812 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es ([input] (response-too-many-streaming-distribution-cnam-es nil input)) ([resultWrapper160818 input] (clojure.core/let [rawinput160817 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160819 {"Message" (portkey.aws/search-for-tag rawinput160817 "Message" :flattened? false :result-wrapper resultWrapper160818)}] (clojure.core/cond-> {} (letvar160819 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160819 ["Message" :content])))))))

(clojure.core/defn- response-invalid-viewer-certificate ([input] (response-invalid-viewer-certificate nil input)) ([resultWrapper160821 input] (clojure.core/let [rawinput160820 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160822 {"Message" (portkey.aws/search-for-tag rawinput160820 "Message" :flattened? false :result-wrapper resultWrapper160821)}] (clojure.core/cond-> {} (letvar160822 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160822 ["Message" :content])))))))

(clojure.core/defn- response-invalid-argument ([input] (response-invalid-argument nil input)) ([resultWrapper160824 input] (clojure.core/let [rawinput160823 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160825 {"Message" (portkey.aws/search-for-tag rawinput160823 "Message" :flattened? false :result-wrapper resultWrapper160824)}] (clojure.core/cond-> {} (letvar160825 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160825 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-not-disabled ([input] (response-streaming-distribution-not-disabled nil input)) ([resultWrapper160828 input] (clojure.core/let [rawinput160827 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160830 {"Message" (portkey.aws/search-for-tag rawinput160827 "Message" :flattened? false :result-wrapper resultWrapper160828)}] (clojure.core/cond-> {} (letvar160830 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160830 ["Message" :content])))))))

(clojure.core/defn- response-too-many-certificates ([input] (response-too-many-certificates nil input)) ([resultWrapper160835 input] (clojure.core/let [rawinput160834 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160836 {"Message" (portkey.aws/search-for-tag rawinput160834 "Message" :flattened? false :result-wrapper resultWrapper160835)}] (clojure.core/cond-> {} (letvar160836 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160836 ["Message" :content])))))))

(clojure.core/defn- response-access-denied ([input] (response-access-denied nil input)) ([resultWrapper160840 input] (clojure.core/let [rawinput160839 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160841 {"Message" (portkey.aws/search-for-tag rawinput160839 "Message" :flattened? false :result-wrapper resultWrapper160840)}] (clojure.core/cond-> {} (letvar160841 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160841 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use ([input] (response-cloud-front-origin-access-identity-in-use nil input)) ([resultWrapper160843 input] (clojure.core/let [rawinput160842 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160844 {"Message" (portkey.aws/search-for-tag rawinput160842 "Message" :flattened? false :result-wrapper resultWrapper160843)}] (clojure.core/cond-> {} (letvar160844 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160844 ["Message" :content])))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result ([input] (response-update-cloud-front-origin-access-identity-result nil input)) ([resultWrapper160847 input] (clojure.core/let [rawinput160846 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160848 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput160846 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper160847), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar160848 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar160848 ["CloudFrontOriginAccessIdentity" :content]))) (letvar160848 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar160848 ["ETag"])))))))

(clojure.core/defn- response-invalid-error-code ([input] (response-invalid-error-code nil input)) ([resultWrapper160852 input] (clojure.core/let [rawinput160851 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160853 {"Message" (portkey.aws/search-for-tag rawinput160851 "Message" :flattened? false :result-wrapper resultWrapper160852)}] (clojure.core/cond-> {} (letvar160853 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160853 ["Message" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-result ([input] (response-create-streaming-distribution-result nil input)) ([resultWrapper160859 input] (clojure.core/let [rawinput160858 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160860 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput160858 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper160859), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar160860 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar160860 ["StreamingDistribution" :content]))) (letvar160860 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar160860 ["Location"]))) (letvar160860 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar160860 ["ETag"])))))))

(clojure.core/defn- response-invalid-relative-path ([input] (response-invalid-relative-path nil input)) ([resultWrapper160863 input] (clojure.core/let [rawinput160862 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160864 {"Message" (portkey.aws/search-for-tag rawinput160862 "Message" :flattened? false :result-wrapper resultWrapper160863)}] (clojure.core/cond-> {} (letvar160864 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160864 ["Message" :content])))))))

(clojure.core/defn- response-invalid-location-code ([input] (response-invalid-location-code nil input)) ([resultWrapper160866 input] (clojure.core/let [rawinput160865 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160867 {"Message" (portkey.aws/search-for-tag rawinput160865 "Message" :flattened? false :result-wrapper resultWrapper160866)}] (clojure.core/cond-> {} (letvar160867 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160867 ["Message" :content])))))))

(clojure.core/defn- response-invalid-web-acl-id ([input] (response-invalid-web-acl-id nil input)) ([resultWrapper160869 input] (clojure.core/let [rawinput160868 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160870 {"Message" (portkey.aws/search-for-tag rawinput160868 "Message" :flattened? false :result-wrapper resultWrapper160869)}] (clojure.core/cond-> {} (letvar160870 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160870 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin ([input] (response-invalid-origin nil input)) ([resultWrapper160872 input] (clojure.core/let [rawinput160871 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160873 {"Message" (portkey.aws/search-for-tag rawinput160871 "Message" :flattened? false :result-wrapper resultWrapper160872)}] (clojure.core/cond-> {} (letvar160873 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160873 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities ([input] (response-too-many-cloud-front-origin-access-identities nil input)) ([resultWrapper160875 input] (clojure.core/let [rawinput160874 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160876 {"Message" (portkey.aws/search-for-tag rawinput160874 "Message" :flattened? false :result-wrapper resultWrapper160875)}] (clojure.core/cond-> {} (letvar160876 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160876 ["Message" :content])))))))

(clojure.core/defn- response-update-distribution-result ([input] (response-update-distribution-result nil input)) ([resultWrapper160878 input] (clojure.core/let [rawinput160877 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160879 {"Distribution" (portkey.aws/search-for-tag rawinput160877 "Distribution" :flattened? false :result-wrapper resultWrapper160878), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar160879 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar160879 ["Distribution" :content]))) (letvar160879 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar160879 ["ETag"])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result ([input] (response-get-cloud-front-origin-access-identity-result nil input)) ([resultWrapper160881 input] (clojure.core/let [rawinput160880 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160882 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput160880 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper160881), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar160882 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar160882 ["CloudFrontOriginAccessIdentity" :content]))) (letvar160882 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar160882 ["ETag"])))))))

(clojure.core/defn- response-too-many-origins ([input] (response-too-many-origins nil input)) ([resultWrapper160884 input] (clojure.core/let [rawinput160883 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160885 {"Message" (portkey.aws/search-for-tag rawinput160883 "Message" :flattened? false :result-wrapper resultWrapper160884)}] (clojure.core/cond-> {} (letvar160885 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160885 ["Message" :content])))))))

(clojure.core/defn- response-invalid-ttl-order ([input] (response-invalid-ttl-order nil input)) ([resultWrapper160887 input] (clojure.core/let [rawinput160886 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160888 {"Message" (portkey.aws/search-for-tag rawinput160886 "Message" :flattened? false :result-wrapper resultWrapper160887)}] (clojure.core/cond-> {} (letvar160888 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160888 ["Message" :content])))))))

(clojure.core/defn- response-no-such-streaming-distribution ([input] (response-no-such-streaming-distribution nil input)) ([resultWrapper160890 input] (clojure.core/let [rawinput160889 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160891 {"Message" (portkey.aws/search-for-tag rawinput160889 "Message" :flattened? false :result-wrapper resultWrapper160890)}] (clojure.core/cond-> {} (letvar160891 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160891 ["Message" :content])))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result ([input] (response-create-cloud-front-origin-access-identity-result nil input)) ([resultWrapper160893 input] (clojure.core/let [rawinput160892 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160894 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput160892 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper160893), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar160894 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar160894 ["CloudFrontOriginAccessIdentity" :content]))) (letvar160894 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar160894 ["Location"]))) (letvar160894 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar160894 ["ETag"])))))))

(clojure.core/defn- response-cname-already-exists ([input] (response-cname-already-exists nil input)) ([resultWrapper160897 input] (clojure.core/let [rawinput160896 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160898 {"Message" (portkey.aws/search-for-tag rawinput160896 "Message" :flattened? false :result-wrapper resultWrapper160897)}] (clojure.core/cond-> {} (letvar160898 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160898 ["Message" :content])))))))

(clojure.core/defn- response-invalid-default-root-object ([input] (response-invalid-default-root-object nil input)) ([resultWrapper160900 input] (clojure.core/let [rawinput160899 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160901 {"Message" (portkey.aws/search-for-tag rawinput160899 "Message" :flattened? false :result-wrapper resultWrapper160900)}] (clojure.core/cond-> {} (letvar160901 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160901 ["Message" :content])))))))

(clojure.core/defn- response-invalid-response-code ([input] (response-invalid-response-code nil input)) ([resultWrapper160903 input] (clojure.core/let [rawinput160902 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160904 {"Message" (portkey.aws/search-for-tag rawinput160902 "Message" :flattened? false :result-wrapper resultWrapper160903)}] (clojure.core/cond-> {} (letvar160904 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160904 ["Message" :content])))))))

(clojure.core/defn- response-no-such-invalidation ([input] (response-no-such-invalidation nil input)) ([resultWrapper160906 input] (clojure.core/let [rawinput160905 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160907 {"Message" (portkey.aws/search-for-tag rawinput160905 "Message" :flattened? false :result-wrapper resultWrapper160906)}] (clojure.core/cond-> {} (letvar160907 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160907 ["Message" :content])))))))

(clojure.core/defn- response-too-many-invalidations-in-progress ([input] (response-too-many-invalidations-in-progress nil input)) ([resultWrapper160909 input] (clojure.core/let [rawinput160908 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160910 {"Message" (portkey.aws/search-for-tag rawinput160908 "Message" :flattened? false :result-wrapper resultWrapper160909)}] (clojure.core/cond-> {} (letvar160910 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160910 ["Message" :content])))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result ([input] (response-list-cloud-front-origin-access-identities-result nil input)) ([resultWrapper160912 input] (clojure.core/let [rawinput160911 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160913 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput160911 "CloudFrontOriginAccessIdentityList" :flattened? false :result-wrapper resultWrapper160912)}] (clojure.core/cond-> {} (letvar160913 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar160913 ["CloudFrontOriginAccessIdentityList" :content])))))))

(clojure.core/defn- response-invalid-forward-cookies ([input] (response-invalid-forward-cookies nil input)) ([resultWrapper160915 input] (clojure.core/let [rawinput160914 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160916 {"Message" (portkey.aws/search-for-tag rawinput160914 "Message" :flattened? false :result-wrapper resultWrapper160915)}] (clojure.core/cond-> {} (letvar160916 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160916 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-config-result ([input] (response-get-distribution-config-result nil input)) ([resultWrapper160918 input] (clojure.core/let [rawinput160917 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160919 {"DistributionConfig" (portkey.aws/search-for-tag rawinput160917 "DistributionConfig" :flattened? false :result-wrapper resultWrapper160918), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar160919 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar160919 ["DistributionConfig" :content]))) (letvar160919 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar160919 ["ETag"])))))))

(clojure.core/defn- response-invalid-required-protocol ([input] (response-invalid-required-protocol nil input)) ([resultWrapper160921 input] (clojure.core/let [rawinput160920 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160922 {"Message" (portkey.aws/search-for-tag rawinput160920 "Message" :flattened? false :result-wrapper resultWrapper160921)}] (clojure.core/cond-> {} (letvar160922 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160922 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-result ([input] (response-get-distribution-result nil input)) ([resultWrapper160924 input] (clojure.core/let [rawinput160923 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160925 {"Distribution" (portkey.aws/search-for-tag rawinput160923 "Distribution" :flattened? false :result-wrapper resultWrapper160924), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar160925 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar160925 ["Distribution" :content]))) (letvar160925 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar160925 ["ETag"])))))))

(clojure.core/defn- response-get-streaming-distribution-config-result ([input] (response-get-streaming-distribution-config-result nil input)) ([resultWrapper160927 input] (clojure.core/let [rawinput160926 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160928 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput160926 "StreamingDistributionConfig" :flattened? false :result-wrapper resultWrapper160927), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar160928 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar160928 ["StreamingDistributionConfig" :content]))) (letvar160928 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar160928 ["ETag"])))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin ([input] (response-invalid-headers-for-s-3-origin nil input)) ([resultWrapper160933 input] (clojure.core/let [rawinput160932 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160934 {"Message" (portkey.aws/search-for-tag rawinput160932 "Message" :flattened? false :result-wrapper resultWrapper160933)}] (clojure.core/cond-> {} (letvar160934 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160934 ["Message" :content])))))))

(clojure.core/defn- response-too-many-distribution-cnam-es ([input] (response-too-many-distribution-cnam-es nil input)) ([resultWrapper160936 input] (clojure.core/let [rawinput160935 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160937 {"Message" (portkey.aws/search-for-tag rawinput160935 "Message" :flattened? false :result-wrapper resultWrapper160936)}] (clojure.core/cond-> {} (letvar160937 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160937 ["Message" :content])))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter ([input] (response-invalid-geo-restriction-parameter nil input)) ([resultWrapper160939 input] (clojure.core/let [rawinput160938 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160940 {"Message" (portkey.aws/search-for-tag rawinput160938 "Message" :flattened? false :result-wrapper resultWrapper160939)}] (clojure.core/cond-> {} (letvar160940 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160940 ["Message" :content])))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity ([input] (response-no-such-cloud-front-origin-access-identity nil input)) ([resultWrapper160942 input] (clojure.core/let [rawinput160941 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160943 {"Message" (portkey.aws/search-for-tag rawinput160941 "Message" :flattened? false :result-wrapper resultWrapper160942)}] (clojure.core/cond-> {} (letvar160943 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160943 ["Message" :content])))))))

(clojure.core/defn- response-list-invalidations-result ([input] (response-list-invalidations-result nil input)) ([resultWrapper160947 input] (clojure.core/let [rawinput160946 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160948 {"InvalidationList" (portkey.aws/search-for-tag rawinput160946 "InvalidationList" :flattened? false :result-wrapper resultWrapper160947)}] (clojure.core/cond-> {} (letvar160948 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar160948 ["InvalidationList" :content])))))))

(clojure.core/defn- response-batch-too-large ([input] (response-batch-too-large nil input)) ([resultWrapper160954 input] (clojure.core/let [rawinput160953 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160955 {"Message" (portkey.aws/search-for-tag rawinput160953 "Message" :flattened? false :result-wrapper resultWrapper160954)}] (clojure.core/cond-> {} (letvar160955 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160955 ["Message" :content])))))))

(clojure.core/defn- response-list-streaming-distributions-result ([input] (response-list-streaming-distributions-result nil input)) ([resultWrapper160957 input] (clojure.core/let [rawinput160956 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160958 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput160956 "StreamingDistributionList" :flattened? false :result-wrapper resultWrapper160957)}] (clojure.core/cond-> {} (letvar160958 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar160958 ["StreamingDistributionList" :content])))))))

(clojure.core/defn- response-create-invalidation-result ([input] (response-create-invalidation-result nil input)) ([resultWrapper160962 input] (clojure.core/let [rawinput160961 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160963 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput160961 "Invalidation" :flattened? false :result-wrapper resultWrapper160962)}] (clojure.core/cond-> {} (letvar160963 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar160963 ["Location"]))) (letvar160963 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar160963 ["Invalidation" :content])))))))

(clojure.core/defn- response-missing-body ([input] (response-missing-body nil input)) ([resultWrapper160969 input] (clojure.core/let [rawinput160968 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160970 {"Message" (portkey.aws/search-for-tag rawinput160968 "Message" :flattened? false :result-wrapper resultWrapper160969)}] (clojure.core/cond-> {} (letvar160970 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160970 ["Message" :content])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result ([input] (response-get-cloud-front-origin-access-identity-config-result nil input)) ([resultWrapper160972 input] (clojure.core/let [rawinput160971 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160973 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput160971 "CloudFrontOriginAccessIdentityConfig" :flattened? false :result-wrapper resultWrapper160972), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar160973 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar160973 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar160973 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar160973 ["ETag"])))))))

(clojure.core/defn- response-distribution-not-disabled ([input] (response-distribution-not-disabled nil input)) ([resultWrapper160977 input] (clojure.core/let [rawinput160976 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160978 {"Message" (portkey.aws/search-for-tag rawinput160976 "Message" :flattened? false :result-wrapper resultWrapper160977)}] (clojure.core/cond-> {} (letvar160978 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160978 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists ([input] (response-cloud-front-origin-access-identity-already-exists nil input)) ([resultWrapper160980 input] (clojure.core/let [rawinput160979 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160981 {"Message" (portkey.aws/search-for-tag rawinput160979 "Message" :flattened? false :result-wrapper resultWrapper160980)}] (clojure.core/cond-> {} (letvar160981 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160981 ["Message" :content])))))))

(clojure.core/defn- response-precondition-failed ([input] (response-precondition-failed nil input)) ([resultWrapper160983 input] (clojure.core/let [rawinput160982 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160984 {"Message" (portkey.aws/search-for-tag rawinput160982 "Message" :flattened? false :result-wrapper resultWrapper160983)}] (clojure.core/cond-> {} (letvar160984 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160984 ["Message" :content])))))))

(clojure.core/defn- response-distribution-already-exists ([input] (response-distribution-already-exists nil input)) ([resultWrapper160986 input] (clojure.core/let [rawinput160985 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160987 {"Message" (portkey.aws/search-for-tag rawinput160985 "Message" :flattened? false :result-wrapper resultWrapper160986)}] (clojure.core/cond-> {} (letvar160987 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160987 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-access-identity ([input] (response-invalid-origin-access-identity nil input)) ([resultWrapper160989 input] (clojure.core/let [rawinput160988 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160990 {"Message" (portkey.aws/search-for-tag rawinput160988 "Message" :flattened? false :result-wrapper resultWrapper160989)}] (clojure.core/cond-> {} (letvar160990 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160990 ["Message" :content])))))))

(clojure.core/defn- response-too-many-trusted-signers ([input] (response-too-many-trusted-signers nil input)) ([resultWrapper160992 input] (clojure.core/let [rawinput160991 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160993 {"Message" (portkey.aws/search-for-tag rawinput160991 "Message" :flattened? false :result-wrapper resultWrapper160992)}] (clojure.core/cond-> {} (letvar160993 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160993 ["Message" :content])))))))

(clojure.core/defn- response-invalid-minimum-protocol-version ([input] (response-invalid-minimum-protocol-version nil input)) ([resultWrapper160995 input] (clojure.core/let [rawinput160994 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160996 {"Message" (portkey.aws/search-for-tag rawinput160994 "Message" :flattened? false :result-wrapper resultWrapper160995)}] (clojure.core/cond-> {} (letvar160996 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160996 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-already-exists ([input] (response-streaming-distribution-already-exists nil input)) ([resultWrapper160998 input] (clojure.core/let [rawinput160997 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar160999 {"Message" (portkey.aws/search-for-tag rawinput160997 "Message" :flattened? false :result-wrapper resultWrapper160998)}] (clojure.core/cond-> {} (letvar160999 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar160999 ["Message" :content])))))))

(clojure.core/defn- response-invalid-if-match-version ([input] (response-invalid-if-match-version nil input)) ([resultWrapper161001 input] (clojure.core/let [rawinput161000 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161002 {"Message" (portkey.aws/search-for-tag rawinput161000 "Message" :flattened? false :result-wrapper resultWrapper161001)}] (clojure.core/cond-> {} (letvar161002 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar161002 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-result ([input] (response-create-distribution-result nil input)) ([resultWrapper161004 input] (clojure.core/let [rawinput161003 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161006 {"Distribution" (portkey.aws/search-for-tag rawinput161003 "Distribution" :flattened? false :result-wrapper resultWrapper161004), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar161006 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar161006 ["Distribution" :content]))) (letvar161006 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar161006 ["Location"]))) (letvar161006 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar161006 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions ([input] (response-too-many-distributions nil input)) ([resultWrapper161010 input] (clojure.core/let [rawinput161009 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161011 {"Message" (portkey.aws/search-for-tag rawinput161009 "Message" :flattened? false :result-wrapper resultWrapper161010)}] (clojure.core/cond-> {} (letvar161011 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar161011 ["Message" :content])))))))

(clojure.core/defn- response-no-such-distribution ([input] (response-no-such-distribution nil input)) ([resultWrapper161014 input] (clojure.core/let [rawinput161013 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161016 {"Message" (portkey.aws/search-for-tag rawinput161013 "Message" :flattened? false :result-wrapper resultWrapper161014)}] (clojure.core/cond-> {} (letvar161016 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar161016 ["Message" :content])))))))

(clojure.core/defn- response-update-streaming-distribution-result ([input] (response-update-streaming-distribution-result nil input)) ([resultWrapper161018 input] (clojure.core/let [rawinput161017 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161022 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput161017 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper161018), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar161022 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar161022 ["StreamingDistribution" :content]))) (letvar161022 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar161022 ["ETag"])))))))

(clojure.core/defn- response-illegal-update ([input] (response-illegal-update nil input)) ([resultWrapper161024 input] (clojure.core/let [rawinput161023 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161025 {"Message" (portkey.aws/search-for-tag rawinput161023 "Message" :flattened? false :result-wrapper resultWrapper161024)}] (clojure.core/cond-> {} (letvar161025 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar161025 ["Message" :content])))))))

(clojure.core/defn- response-inconsistent-quantities ([input] (response-inconsistent-quantities nil input)) ([resultWrapper161028 input] (clojure.core/let [rawinput161027 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161029 {"Message" (portkey.aws/search-for-tag rawinput161027 "Message" :flattened? false :result-wrapper resultWrapper161028)}] (clojure.core/cond-> {} (letvar161029 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar161029 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result ([input] (response-list-distributions-by-web-acl-id-result nil input)) ([resultWrapper161031 input] (clojure.core/let [rawinput161030 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161032 {"DistributionList" (portkey.aws/search-for-tag rawinput161030 "DistributionList" :flattened? false :result-wrapper resultWrapper161031)}] (clojure.core/cond-> {} (letvar161032 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar161032 ["DistributionList" :content])))))))

(clojure.core/defn- response-list-distributions-result ([input] (response-list-distributions-result nil input)) ([resultWrapper161034 input] (clojure.core/let [rawinput161033 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161037 {"DistributionList" (portkey.aws/search-for-tag rawinput161033 "DistributionList" :flattened? false :result-wrapper resultWrapper161034)}] (clojure.core/cond-> {} (letvar161037 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar161037 ["DistributionList" :content])))))))

(clojure.core/defn- response-trusted-signer-does-not-exist ([input] (response-trusted-signer-does-not-exist nil input)) ([resultWrapper161039 input] (clojure.core/let [rawinput161038 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161040 {"Message" (portkey.aws/search-for-tag rawinput161038 "Message" :flattened? false :result-wrapper resultWrapper161039)}] (clojure.core/cond-> {} (letvar161040 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar161040 ["Message" :content])))))))

(clojure.core/defn- response-get-invalidation-result ([input] (response-get-invalidation-result nil input)) ([resultWrapper161042 input] (clojure.core/let [rawinput161041 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161043 {"Invalidation" (portkey.aws/search-for-tag rawinput161041 "Invalidation" :flattened? false :result-wrapper resultWrapper161042)}] (clojure.core/cond-> {} (letvar161043 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar161043 ["Invalidation" :content])))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values ([input] (response-too-many-headers-in-forwarded-values nil input)) ([resultWrapper161045 input] (clojure.core/let [rawinput161044 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar161046 {"Message" (portkey.aws/search-for-tag rawinput161044 "Message" :flattened? false :result-wrapper resultWrapper161045)}] (clojure.core/cond-> {} (letvar161046 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar161046 ["Message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2016-01-28.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2016-01-28.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.logging-config/enabled :portkey.aws.cloudfront.-2016-01-28.logging-config/include-cookies :portkey.aws.cloudfront.-2016-01-28.logging-config/bucket :portkey.aws.cloudfront.-2016-01-28.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.invalidation-summary/id :portkey.aws.cloudfront.-2016-01-28.invalidation-summary/create-time :portkey.aws.cloudfront.-2016-01-28.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.invalidation/id :portkey.aws.cloudfront.-2016-01-28.invalidation/status :portkey.aws.cloudfront.-2016-01-28.invalidation/create-time :portkey.aws.cloudfront.-2016-01-28/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/streaming-distribution :portkey.aws.cloudfront.-2016-01-28.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-01-28.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.distribution/id :portkey.aws.cloudfront.-2016-01-28.distribution/status :portkey.aws.cloudfront.-2016-01-28.distribution/last-modified-time :portkey.aws.cloudfront.-2016-01-28.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2016-01-28.distribution/domain-name :portkey.aws.cloudfront.-2016-01-28/active-trusted-signers :portkey.aws.cloudfront.-2016-01-28/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.forwarded-values/query-string :portkey.aws.cloudfront.-2016-01-28.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2016-01-28/headers]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28/paths :portkey.aws.cloudfront.-2016-01-28.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-01-28.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/marker :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.streaming-distribution/id :portkey.aws.cloudfront.-2016-01-28.streaming-distribution/status :portkey.aws.cloudfront.-2016-01-28.streaming-distribution/domain-name :portkey.aws.cloudfront.-2016-01-28/active-trusted-signers :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2016-01-28.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2016-01-28.custom-error-response/response-page-path :portkey.aws.cloudfront.-2016-01-28.custom-error-response/response-code :portkey.aws.cloudfront.-2016-01-28.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.signer/aws-account-number :portkey.aws.cloudfront.-2016-01-28/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-01-28.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.cached-methods/quantity :portkey.aws.cloudfront.-2016-01-28.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/streaming-distribution :portkey.aws.cloudfront.-2016-01-28.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2016-01-28.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.cache-behavior/path-pattern :portkey.aws.cloudfront.-2016-01-28.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-01-28/forwarded-values :portkey.aws.cloudfront.-2016-01-28/trusted-signers :portkey.aws.cloudfront.-2016-01-28/viewer-protocol-policy :portkey.aws.cloudfront.-2016-01-28.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-01-28.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-01-28.cache-behavior/compress :portkey.aws.cloudfront.-2016-01-28.cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-01-28/allowed-methods :portkey.aws.cloudfront.-2016-01-28.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2016-01-28.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.active-trusted-signers/enabled :portkey.aws.cloudfront.-2016-01-28.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.origin/id :portkey.aws.cloudfront.-2016-01-28.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2016-01-28.origin/origin-path :portkey.aws.cloudfront.-2016-01-28/custom-headers :portkey.aws.cloudfront.-2016-01-28/s-3-origin-config :portkey.aws.cloudfront.-2016-01-28/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.invalidation-list/marker :portkey.aws.cloudfront.-2016-01-28.invalidation-list/max-items :portkey.aws.cloudfront.-2016-01-28.invalidation-list/is-truncated :portkey.aws.cloudfront.-2016-01-28.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalidation-list/next-marker :portkey.aws.cloudfront.-2016-01-28.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2016-01-28.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/distribution :portkey.aws.cloudfront.-2016-01-28.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-01-28.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.allowed-methods/quantity :portkey.aws.cloudfront.-2016-01-28.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2016-01-28/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.custom-origin-config/http-port :portkey.aws.cloudfront.-2016-01-28.custom-origin-config/https-port :portkey.aws.cloudfront.-2016-01-28/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2016-01-28/origin-ssl-protocols]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.list-distributions-request/marker :portkey.aws.cloudfront.-2016-01-28.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.s-3-origin/domain-name :portkey.aws.cloudfront.-2016-01-28.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-01-28.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2016-01-28.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/id :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/status :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2016-01-28/s-3-origin :portkey.aws.cloudfront.-2016-01-28/aliases :portkey.aws.cloudfront.-2016-01-28/trusted-signers :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2016-01-28/price-class :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-01-28.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-01-28.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-01-28/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.distribution-config/caller-reference :portkey.aws.cloudfront.-2016-01-28/origins :portkey.aws.cloudfront.-2016-01-28/default-cache-behavior :portkey.aws.cloudfront.-2016-01-28.distribution-config/comment :portkey.aws.cloudfront.-2016-01-28.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-01-28.distribution-config/default-root-object :portkey.aws.cloudfront.-2016-01-28/restrictions :portkey.aws.cloudfront.-2016-01-28.distribution-config/web-acl-id :portkey.aws.cloudfront.-2016-01-28.distribution-config/logging :portkey.aws.cloudfront.-2016-01-28/cache-behaviors :portkey.aws.cloudfront.-2016-01-28/custom-error-responses :portkey.aws.cloudfront.-2016-01-28/aliases :portkey.aws.cloudfront.-2016-01-28/price-class :portkey.aws.cloudfront.-2016-01-28/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/distribution-config :portkey.aws.cloudfront.-2016-01-28.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/distribution :portkey.aws.cloudfront.-2016-01-28.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/streaming-distribution-config :portkey.aws.cloudfront.-2016-01-28.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28/streaming-distribution-config :portkey.aws.cloudfront.-2016-01-28.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-01-28.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.create-invalidation-result/location :portkey.aws.cloudfront.-2016-01-28/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-01-28.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.origin-custom-header/header-name :portkey.aws.cloudfront.-2016-01-28.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2016-01-28/s-3-origin :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-config/comment :portkey.aws.cloudfront.-2016-01-28/trusted-signers :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-01-28/aliases :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-config/logging :portkey.aws.cloudfront.-2016-01-28/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.streaming-logging-config/enabled :portkey.aws.cloudfront.-2016-01-28.streaming-logging-config/bucket :portkey.aws.cloudfront.-2016-01-28.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.distribution-summary/id :portkey.aws.cloudfront.-2016-01-28.distribution-summary/status :portkey.aws.cloudfront.-2016-01-28.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-01-28.distribution-summary/domain-name :portkey.aws.cloudfront.-2016-01-28/aliases :portkey.aws.cloudfront.-2016-01-28/origins :portkey.aws.cloudfront.-2016-01-28/default-cache-behavior :portkey.aws.cloudfront.-2016-01-28/cache-behaviors :portkey.aws.cloudfront.-2016-01-28/custom-error-responses :portkey.aws.cloudfront.-2016-01-28.distribution-summary/comment :portkey.aws.cloudfront.-2016-01-28/price-class :portkey.aws.cloudfront.-2016-01-28.distribution-summary/enabled :portkey.aws.cloudfront.-2016-01-28/viewer-certificate :portkey.aws.cloudfront.-2016-01-28/restrictions :portkey.aws.cloudfront.-2016-01-28.distribution-summary/web-acl-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/minimum-protocol-version #{"TLSv1" :tl-sv-1 :ss-lv-3 "SSLv3"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.origins/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.origins/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/distribution :portkey.aws.cloudfront.-2016-01-28.create-distribution-result/location :portkey.aws.cloudfront.-2016-01-28.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-01-28.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-01-28.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.distribution-list/marker :portkey.aws.cloudfront.-2016-01-28.distribution-list/max-items :portkey.aws.cloudfront.-2016-01-28.distribution-list/is-truncated :portkey.aws.cloudfront.-2016-01-28.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.distribution-list/next-marker :portkey.aws.cloudfront.-2016-01-28.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/streaming-distribution :portkey.aws.cloudfront.-2016-01-28.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2016-01-28.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2016-01-28.list-invalidations-request/marker :portkey.aws.cloudfront.-2016-01-28.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-01-28/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-01-28/forwarded-values :portkey.aws.cloudfront.-2016-01-28/trusted-signers :portkey.aws.cloudfront.-2016-01-28/viewer-protocol-policy :portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/compress :portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-01-28/allowed-methods :portkey.aws.cloudfront.-2016-01-28.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.trusted-signers/enabled :portkey.aws.cloudfront.-2016-01-28.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28/distribution-config :portkey.aws.cloudfront.-2016-01-28.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-01-28.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2016-01-28.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2016-01-28.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2016-01-28/ssl-support-method :portkey.aws.cloudfront.-2016-01-28/minimum-protocol-version :portkey.aws.cloudfront.-2016-01-28.viewer-certificate/certificate :portkey.aws.cloudfront.-2016-01-28/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-01-28.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2016-01-28.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2016-01-28.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-01-28/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-01-28.geo-restriction/restriction-type :portkey.aws.cloudfront.-2016-01-28.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2016-01-28.geo-restriction/items]))

(clojure.core/defn get-distribution-2016-01-28 ([get-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistribution2016_01_28", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-distribution-result))

(clojure.core/defn update-distribution-2016-01-28 ([update-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDistribution2016_01_28", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-01-28/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-01-28/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-01-28/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-01-28/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-01-28/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-01-28/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-01-28/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-01-28/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-01-28/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-01-28/invalid-web-acl-id, "TooManyOrigins" :portkey.aws.cloudfront.-2016-01-28/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-01-28/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-01-28/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-01-28/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-01-28/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-01-28/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-01-28/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-01-28/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-01-28/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-01-28/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2016-01-28/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-01-28/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-01-28/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/update-distribution-result))

(clojure.core/defn delete-streaming-distribution-2016-01-28 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStreamingDistribution2016_01_28", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2016-01-28 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2016_01_28", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn get-invalidation-2016-01-28 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvalidation2016_01_28", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2016-01-28/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-invalidation-result))

(clojure.core/defn create-streaming-distribution-2016-01-28 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistribution2016_01_28", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-01-28/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-01-28/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-01-28/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-01-28/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-01-28/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/create-streaming-distribution-result))

(clojure.core/defn get-streaming-distribution-2016-01-28 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistribution2016_01_28", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-result))

(clojure.core/defn create-distribution-2016-01-28 ([create-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistribution2016_01_28", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-01-28/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-01-28/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-01-28/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-01-28/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-01-28/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-01-28/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-01-28/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-01-28/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-01-28/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-01-28/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-01-28/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-01-28/invalid-origin, "TooManyOrigins" :portkey.aws.cloudfront.-2016-01-28/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-01-28/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-01-28/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-01-28/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-01-28/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-01-28/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-01-28/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-01-28/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-01-28/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-01-28/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-01-28/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-01-28/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-01-28/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/create-distribution-result))

(clojure.core/defn get-streaming-distribution-config-2016-01-28 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistributionConfig2016_01_28", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-config-result))

(clojure.core/defn list-distributions-2016-01-28 ([] (list-distributions-2016-01-28 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributions2016_01_28", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2016-01-28 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-01-28/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/list-distributions-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2016-01-28 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2016_01_28", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2016-01-28 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInvalidations2016_01_28", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/list-invalidations-result))

(clojure.core/defn get-cloud-front-origin-access-identity-2016-01-28 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2016_01_28", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2016-01-28 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2016_01_28", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2016-01-28/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2016-01-28 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateStreamingDistribution2016_01_28", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-01-28/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-01-28/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2016-01-28/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-01-28/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2016-01-28 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistributionConfig2016_01_28", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-distribution-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2016-01-28 ([] (list-cloud-front-origin-access-identities-2016-01-28 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2016_01_28", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2016-01-28 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-01-28/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2016-01-28 ([] (list-streaming-distributions-2016-01-28 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamingDistributions2016_01_28", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2016-01-28 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-01-28/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/list-streaming-distributions-result))

(clojure.core/defn delete-distribution-2016-01-28 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDistribution2016_01_28", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2016-01-28/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2016-01-28 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInvalidation2016_01_28", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2016-01-28/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2016-01-28/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/create-invalidation-result))

(clojure.core/defn list-distributions-by-web-acl-id-2016-01-28 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributionsByWebACLId2016_01_28", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-01-28/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2016-01-28 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2016_01_28", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2016-01-28/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/create-cloud-front-origin-access-identity-result))
