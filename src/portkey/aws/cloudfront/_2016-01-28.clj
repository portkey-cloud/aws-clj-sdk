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

(clojure.core/defn- ser-forwarded-values [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:query-string input)) #:http.request.field{:name "QueryString", :shape "boolean"}) (clojure.core/into (ser-cookie-preference (:cookies input)) #:http.request.field{:name "Cookies", :shape "CookiePreference"})], :shape "ForwardedValues", :type "structure"} (clojure.core/contains? input :headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-headers (input :headers)) #:http.request.field{:name "Headers", :shape "Headers"}))))

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

(clojure.core/defn- ser-custom-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:http-port input)) #:http.request.field{:name "HTTPPort", :shape "integer"}) (clojure.core/into (serinteger (:https-port input)) #:http.request.field{:name "HTTPSPort", :shape "integer"}) (clojure.core/into (ser-origin-protocol-policy (:origin-protocol-policy input)) #:http.request.field{:name "OriginProtocolPolicy", :shape "OriginProtocolPolicy"})], :shape "CustomOriginConfig", :type "structure"} (clojure.core/contains? input :origin-ssl-protocols) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-ssl-protocols (input :origin-ssl-protocols)) #:http.request.field{:name "OriginSslProtocols", :shape "OriginSslProtocols"}))))

(clojure.core/defn- ser-s-3-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"}) (clojure.core/into (serstring (:origin-access-identity input)) #:http.request.field{:name "OriginAccessIdentity", :shape "string"})], :shape "S3Origin", :type "structure"}))

(clojure.core/defn- ser-cookie-name-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "CookieNameList", :type "list"})

(clojure.core/defn- ser-distribution-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"}) (clojure.core/into (ser-origins (:origins input)) #:http.request.field{:name "Origins", :shape "Origins"}) (clojure.core/into (ser-default-cache-behavior (:default-cache-behavior input)) #:http.request.field{:name "DefaultCacheBehavior", :shape "DefaultCacheBehavior"}) (clojure.core/into (serstring (:comment input)) #:http.request.field{:name "Comment", :shape "string"}) (clojure.core/into (serboolean (:enabled input)) #:http.request.field{:name "Enabled", :shape "boolean"})], :shape "DistributionConfig", :type "structure"} (clojure.core/contains? input :default-root-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :default-root-object)) #:http.request.field{:name "DefaultRootObject", :shape "string"})) (clojure.core/contains? input :restrictions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-restrictions (input :restrictions)) #:http.request.field{:name "Restrictions", :shape "Restrictions"})) (clojure.core/contains? input :web-acl-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :web-acl-id)) #:http.request.field{:name "WebACLId", :shape "string"})) (clojure.core/contains? input :logging) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-logging-config (input :logging)) #:http.request.field{:name "Logging", :shape "LoggingConfig"})) (clojure.core/contains? input :cache-behaviors) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behaviors (input :cache-behaviors)) #:http.request.field{:name "CacheBehaviors", :shape "CacheBehaviors"})) (clojure.core/contains? input :custom-error-responses) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-responses (input :custom-error-responses)) #:http.request.field{:name "CustomErrorResponses", :shape "CustomErrorResponses"})) (clojure.core/contains? input :aliases) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aliases (input :aliases)) #:http.request.field{:name "Aliases", :shape "Aliases"})) (clojure.core/contains? input :price-class) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-price-class (input :price-class)) #:http.request.field{:name "PriceClass", :shape "PriceClass"})) (clojure.core/contains? input :viewer-certificate) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-viewer-certificate (input :viewer-certificate)) #:http.request.field{:name "ViewerCertificate", :shape "ViewerCertificate"}))))

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

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__23442__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__23442__auto__) true (clojure.core/= "false" boolstr__23442__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar51213 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar51213 ["Quantity" :content]))} (letvar51213 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar51213 ["Items" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar51309 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar51309 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar51309 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar51309 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar51309 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar51405 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar51405 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar51405 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar51405 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar51518 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar51518 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar51518 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar51518 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar51518 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar51653 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar51653 ["GeoRestriction" :content]))})))

(clojure.core/defn- deserstring [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar51754 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar51754 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar51754 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar51754 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar51754 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar51754 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar51754 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar51754 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar51850 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar51850 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar51850 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar51850 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar51850 ["Quantity" :content]))} (letvar51850 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar51850 ["NextMarker" :content]))) (letvar51850 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar51850 ["Items" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar51946 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? false :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? false :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar51946 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar51946 ["Cookies" :content]))} (letvar51946 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar51946 ["Headers" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar52042 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar52042 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar52042 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar52155 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar52155 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar52155 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar52155 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar52155 ["Quantity" :content]))} (letvar52155 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar52155 ["NextMarker" :content]))) (letvar52155 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar52155 ["Items" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar52256 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar52256 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar52256 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar52256 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar52256 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar52256 ["StreamingDistributionConfig" :content]))} (letvar52256 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar52256 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar52357 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? false :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? false :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? false :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar52357 ["ErrorCode" :content]))} (letvar52357 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar52357 ["ResponsePagePath" :content]))) (letvar52357 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar52357 ["ResponseCode" :content]))) (letvar52357 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar52357 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar52470 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? false :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar52470 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar52470 ["AwsAccountNumber" :content]))) (letvar52470 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar52470 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar52585 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar52585 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar52585 ["Items" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar52698 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar52698 ["Quantity" :content]))} (letvar52698 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar52698 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar52794 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar52794 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar52794 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar52794 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar52794 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar52794 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar52794 ["MinTTL" :content]))} (letvar52794 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar52794 ["SmoothStreaming" :content]))) (letvar52794 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar52794 ["Compress" :content]))) (letvar52794 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar52794 ["MaxTTL" :content]))) (letvar52794 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar52794 ["AllowedMethods" :content]))) (letvar52794 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar52794 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar52890 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar52890 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar52890 ["Quantity" :content]))} (letvar52890 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar52890 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar52986 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? false :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? false :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? false :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar52986 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar52986 ["DomainName" :content]))} (letvar52986 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar52986 ["OriginPath" :content]))) (letvar52986 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar52986 ["CustomHeaders" :content]))) (letvar52986 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar52986 ["S3OriginConfig" :content]))) (letvar52986 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar52986 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar53084 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar53084 ["Quantity" :content]))} (letvar53084 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar53084 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar53180 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar53180 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar53180 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar53180 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar53180 ["Quantity" :content]))} (letvar53180 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar53180 ["NextMarker" :content]))) (letvar53180 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar53180 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar53276 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar53276 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar53276 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar53372 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar53372 ["Quantity" :content]))} (letvar53372 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar53372 ["Items" :content]))))))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar53468 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar53468 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar53468 ["Items" :content]))} (letvar53468 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar53468 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar53569 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? false :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? false :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? false :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar53569 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar53569 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar53569 ["OriginProtocolPolicy" :content]))} (letvar53569 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar53569 ["OriginSslProtocols" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar53665 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar53665 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar53665 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar53761 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar53761 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar53761 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar53761 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar53761 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar53761 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar53761 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar53761 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar53761 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar53761 ["LastModifiedTime" :content])), :price-class (deser-price-class (clojure.core/get-in letvar53761 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar53857 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar53857 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar53857 ["S3CanonicalUserId" :content]))} (letvar53857 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar53857 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar53970 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar53970 ["Quantity" :content]))} (letvar53970 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar53970 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar54066 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar54066 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar54066 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar54066 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar54066 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar54066 ["Enabled" :content]))} (letvar54066 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar54066 ["DefaultRootObject" :content]))) (letvar54066 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar54066 ["Restrictions" :content]))) (letvar54066 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar54066 ["WebACLId" :content]))) (letvar54066 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar54066 ["Logging" :content]))) (letvar54066 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar54066 ["CacheBehaviors" :content]))) (letvar54066 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar54066 ["CustomErrorResponses" :content]))) (letvar54066 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar54066 ["Aliases" :content]))) (letvar54066 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar54066 ["PriceClass" :content]))) (letvar54066 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar54066 ["ViewerCertificate" :content]))))))

(clojure.core/defn- deser-ssl-protocols-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ssl-protocol coll))) input))

(clojure.core/defn- deser-aws-account-number-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-method [input] (clojure.core/get {"GET" :get, "HEAD" :head, "POST" :post, "PUT" :put, "PATCH" :patch, "OPTIONS" :options, "DELETE" :delete} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-alias-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-origin-custom-headers-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin-custom-header coll))) input))

(clojure.core/defn- deser-origin-protocol-policy [input] (clojure.core/get {"http-only" :httponly, "match-viewer" :matchviewer, "https-only" :httpsonly} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-signer-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-signer coll))) input))

(clojure.core/defn- deser-path-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-geo-restriction-type [input] (clojure.core/get {"blacklist" :blacklist, "whitelist" :whitelist, "none" :none} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar54279 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar54279 ["Quantity" :content]))} (letvar54279 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar54279 ["Items" :content]))))))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar54377 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar54377 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar54377 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar54377 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar54490 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? false :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar54490 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar54490 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar54586 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar54586 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar54586 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar54586 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar54586 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar54586 ["Enabled" :content]))} (letvar54586 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar54586 ["Aliases" :content]))) (letvar54586 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar54586 ["Logging" :content]))) (letvar54586 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar54586 ["PriceClass" :content]))))))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar54682 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar54682 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar54795 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar54795 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar54795 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar54795 ["Prefix" :content]))})))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar54891 {"Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar54891 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar54891 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar54891 ["WebACLId" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar54891 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar54891 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar54891 ["ViewerCertificate" :content])), :domain-name (deserstring (clojure.core/get-in letvar54891 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar54891 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar54891 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar54891 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar54891 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar54891 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar54891 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar54891 ["LastModifiedTime" :content])), :price-class (deser-price-class (clojure.core/get-in letvar54891 ["PriceClass" :content]))})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar54992 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar54992 ["Quantity" :content]))} (letvar54992 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar54992 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar55093 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar55093 ["Quantity" :content]))} (letvar55093 "Items") (clojure.core/assoc :items (deser-origin-list (clojure.core/get-in letvar55093 ["Items" :content]))))))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar55206 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar55206 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar55206 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar55206 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar55206 ["Quantity" :content]))} (letvar55206 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar55206 ["NextMarker" :content]))) (letvar55206 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar55206 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar55307 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? false :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar55307 ["Forward" :content]))} (letvar55307 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar55307 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar55403 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar55403 ["Quantity" :content]))} (letvar55403 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar55403 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar55516 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar55516 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar55516 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar55516 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar55516 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar55516 ["MinTTL" :content]))} (letvar55516 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar55516 ["SmoothStreaming" :content]))) (letvar55516 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar55516 ["Compress" :content]))) (letvar55516 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar55516 ["MaxTTL" :content]))) (letvar55516 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar55516 ["AllowedMethods" :content]))) (letvar55516 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar55516 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar55612 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar55612 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar55612 ["Quantity" :content]))} (letvar55612 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar55612 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar55708 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? false :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? false :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? false :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? false :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? false :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? false :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar55708 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar55708 ["CloudFrontDefaultCertificate" :content]))) (letvar55708 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar55708 ["IAMCertificateId" :content]))) (letvar55708 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar55708 ["ACMCertificateArn" :content]))) (letvar55708 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar55708 ["SSLSupportMethod" :content]))) (letvar55708 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar55708 ["MinimumProtocolVersion" :content]))) (letvar55708 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar55708 ["Certificate" :content]))) (letvar55708 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar55708 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar55804 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar55804 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar55804 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar55900 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar55900 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar55900 ["Quantity" :content]))} (letvar55900 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar55900 ["Items" :content]))))))

(clojure.core/defn- response-no-such-origin [input] (clojure.core/let [rawinput55901 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55902 {"Message" (portkey.aws/search-for-tag rawinput55901 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55902 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55902 ["Message" :content]))))))

(clojure.core/defn- response-invalid-protocol-settings [input] (clojure.core/let [rawinput55903 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55904 {"Message" (portkey.aws/search-for-tag rawinput55903 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55904 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55904 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list [input] (clojure.core/let [rawinput55905 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55906 {"Message" (portkey.aws/search-for-tag rawinput55905 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55906 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55906 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cache-behaviors [input] (clojure.core/let [rawinput55907 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55908 {"Message" (portkey.aws/search-for-tag rawinput55907 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55908 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55908 ["Message" :content]))))))

(clojure.core/defn- response-too-many-origin-custom-headers [input] (clojure.core/let [rawinput55909 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55910 {"Message" (portkey.aws/search-for-tag rawinput55909 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55910 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55910 ["Message" :content]))))))

(clojure.core/defn- response-too-many-streaming-distributions [input] (clojure.core/let [rawinput55911 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55912 {"Message" (portkey.aws/search-for-tag rawinput55911 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55912 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55912 ["Message" :content]))))))

(clojure.core/defn- response-get-streaming-distribution-result [input] (clojure.core/let [rawinput55913 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55914 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput55913 "StreamingDistribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar55914 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar55914 ["StreamingDistribution" :content]))) (letvar55914 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar55914 ["ETag"]))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es [input] (clojure.core/let [rawinput55915 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55916 {"Message" (portkey.aws/search-for-tag rawinput55915 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55916 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55916 ["Message" :content]))))))

(clojure.core/defn- response-invalid-viewer-certificate [input] (clojure.core/let [rawinput55917 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55918 {"Message" (portkey.aws/search-for-tag rawinput55917 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55918 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55918 ["Message" :content]))))))

(clojure.core/defn- response-invalid-argument [input] (clojure.core/let [rawinput55919 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55920 {"Message" (portkey.aws/search-for-tag rawinput55919 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55920 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55920 ["Message" :content]))))))

(clojure.core/defn- response-streaming-distribution-not-disabled [input] (clojure.core/let [rawinput55921 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55922 {"Message" (portkey.aws/search-for-tag rawinput55921 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55922 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55922 ["Message" :content]))))))

(clojure.core/defn- response-too-many-certificates [input] (clojure.core/let [rawinput55923 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55924 {"Message" (portkey.aws/search-for-tag rawinput55923 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55924 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55924 ["Message" :content]))))))

(clojure.core/defn- response-access-denied [input] (clojure.core/let [rawinput55925 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55926 {"Message" (portkey.aws/search-for-tag rawinput55925 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55926 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55926 ["Message" :content]))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use [input] (clojure.core/let [rawinput55927 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55928 {"Message" (portkey.aws/search-for-tag rawinput55927 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55928 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55928 ["Message" :content]))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput55929 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55930 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput55929 "CloudFrontOriginAccessIdentity" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar55930 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar55930 ["CloudFrontOriginAccessIdentity" :content]))) (letvar55930 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar55930 ["ETag"]))))))

(clojure.core/defn- response-invalid-error-code [input] (clojure.core/let [rawinput55931 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55932 {"Message" (portkey.aws/search-for-tag rawinput55931 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55932 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55932 ["Message" :content]))))))

(clojure.core/defn- response-create-streaming-distribution-result [input] (clojure.core/let [rawinput55933 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55934 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput55933 "StreamingDistribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar55934 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar55934 ["StreamingDistribution" :content]))) (letvar55934 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar55934 ["Location"]))) (letvar55934 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar55934 ["ETag"]))))))

(clojure.core/defn- response-invalid-relative-path [input] (clojure.core/let [rawinput55935 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55936 {"Message" (portkey.aws/search-for-tag rawinput55935 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55936 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55936 ["Message" :content]))))))

(clojure.core/defn- response-invalid-location-code [input] (clojure.core/let [rawinput55937 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55938 {"Message" (portkey.aws/search-for-tag rawinput55937 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55938 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55938 ["Message" :content]))))))

(clojure.core/defn- response-invalid-web-acl-id [input] (clojure.core/let [rawinput55939 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55940 {"Message" (portkey.aws/search-for-tag rawinput55939 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55940 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55940 ["Message" :content]))))))

(clojure.core/defn- response-invalid-origin [input] (clojure.core/let [rawinput55941 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55942 {"Message" (portkey.aws/search-for-tag rawinput55941 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55942 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55942 ["Message" :content]))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities [input] (clojure.core/let [rawinput55943 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55944 {"Message" (portkey.aws/search-for-tag rawinput55943 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55944 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55944 ["Message" :content]))))))

(clojure.core/defn- response-update-distribution-result [input] (clojure.core/let [rawinput55945 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55946 {"Distribution" (portkey.aws/search-for-tag rawinput55945 "Distribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar55946 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar55946 ["Distribution" :content]))) (letvar55946 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar55946 ["ETag"]))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput55947 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55948 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput55947 "CloudFrontOriginAccessIdentity" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar55948 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar55948 ["CloudFrontOriginAccessIdentity" :content]))) (letvar55948 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar55948 ["ETag"]))))))

(clojure.core/defn- response-too-many-origins [input] (clojure.core/let [rawinput55949 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55950 {"Message" (portkey.aws/search-for-tag rawinput55949 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55950 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55950 ["Message" :content]))))))

(clojure.core/defn- response-invalid-ttl-order [input] (clojure.core/let [rawinput55951 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55952 {"Message" (portkey.aws/search-for-tag rawinput55951 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55952 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55952 ["Message" :content]))))))

(clojure.core/defn- response-no-such-streaming-distribution [input] (clojure.core/let [rawinput55953 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55954 {"Message" (portkey.aws/search-for-tag rawinput55953 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55954 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55954 ["Message" :content]))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result [input] (clojure.core/let [rawinput55955 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55956 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput55955 "CloudFrontOriginAccessIdentity" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar55956 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar55956 ["CloudFrontOriginAccessIdentity" :content]))) (letvar55956 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar55956 ["Location"]))) (letvar55956 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar55956 ["ETag"]))))))

(clojure.core/defn- response-cname-already-exists [input] (clojure.core/let [rawinput55957 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55958 {"Message" (portkey.aws/search-for-tag rawinput55957 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55958 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55958 ["Message" :content]))))))

(clojure.core/defn- response-invalid-default-root-object [input] (clojure.core/let [rawinput55959 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55960 {"Message" (portkey.aws/search-for-tag rawinput55959 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55960 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55960 ["Message" :content]))))))

(clojure.core/defn- response-invalid-response-code [input] (clojure.core/let [rawinput55961 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55962 {"Message" (portkey.aws/search-for-tag rawinput55961 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55962 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55962 ["Message" :content]))))))

(clojure.core/defn- response-no-such-invalidation [input] (clojure.core/let [rawinput55963 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55964 {"Message" (portkey.aws/search-for-tag rawinput55963 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55964 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55964 ["Message" :content]))))))

(clojure.core/defn- response-too-many-invalidations-in-progress [input] (clojure.core/let [rawinput55965 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55966 {"Message" (portkey.aws/search-for-tag rawinput55965 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55966 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55966 ["Message" :content]))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result [input] (clojure.core/let [rawinput55967 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55968 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput55967 "CloudFrontOriginAccessIdentityList" :flattened? false)}] (clojure.core/cond-> {} (letvar55968 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar55968 ["CloudFrontOriginAccessIdentityList" :content]))))))

(clojure.core/defn- response-invalid-forward-cookies [input] (clojure.core/let [rawinput55969 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55970 {"Message" (portkey.aws/search-for-tag rawinput55969 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55970 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55970 ["Message" :content]))))))

(clojure.core/defn- response-get-distribution-config-result [input] (clojure.core/let [rawinput55971 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55972 {"DistributionConfig" (portkey.aws/search-for-tag rawinput55971 "DistributionConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar55972 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar55972 ["DistributionConfig" :content]))) (letvar55972 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar55972 ["ETag"]))))))

(clojure.core/defn- response-invalid-required-protocol [input] (clojure.core/let [rawinput55973 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55974 {"Message" (portkey.aws/search-for-tag rawinput55973 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55974 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55974 ["Message" :content]))))))

(clojure.core/defn- response-get-distribution-result [input] (clojure.core/let [rawinput55975 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55976 {"Distribution" (portkey.aws/search-for-tag rawinput55975 "Distribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar55976 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar55976 ["Distribution" :content]))) (letvar55976 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar55976 ["ETag"]))))))

(clojure.core/defn- response-get-streaming-distribution-config-result [input] (clojure.core/let [rawinput55977 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55978 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput55977 "StreamingDistributionConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar55978 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar55978 ["StreamingDistributionConfig" :content]))) (letvar55978 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar55978 ["ETag"]))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin [input] (clojure.core/let [rawinput55979 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55980 {"Message" (portkey.aws/search-for-tag rawinput55979 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55980 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55980 ["Message" :content]))))))

(clojure.core/defn- response-too-many-distribution-cnam-es [input] (clojure.core/let [rawinput55981 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55982 {"Message" (portkey.aws/search-for-tag rawinput55981 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55982 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55982 ["Message" :content]))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter [input] (clojure.core/let [rawinput55983 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55984 {"Message" (portkey.aws/search-for-tag rawinput55983 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55984 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55984 ["Message" :content]))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity [input] (clojure.core/let [rawinput55985 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55986 {"Message" (portkey.aws/search-for-tag rawinput55985 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55986 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55986 ["Message" :content]))))))

(clojure.core/defn- response-list-invalidations-result [input] (clojure.core/let [rawinput55987 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55988 {"InvalidationList" (portkey.aws/search-for-tag rawinput55987 "InvalidationList" :flattened? false)}] (clojure.core/cond-> {} (letvar55988 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar55988 ["InvalidationList" :content]))))))

(clojure.core/defn- response-batch-too-large [input] (clojure.core/let [rawinput55989 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55990 {"Message" (portkey.aws/search-for-tag rawinput55989 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55990 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55990 ["Message" :content]))))))

(clojure.core/defn- response-list-streaming-distributions-result [input] (clojure.core/let [rawinput55991 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55992 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput55991 "StreamingDistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar55992 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar55992 ["StreamingDistributionList" :content]))))))

(clojure.core/defn- response-create-invalidation-result [input] (clojure.core/let [rawinput55993 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55994 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput55993 "Invalidation" :flattened? false)}] (clojure.core/cond-> {} (letvar55994 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar55994 ["Location"]))) (letvar55994 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar55994 ["Invalidation" :content]))))))

(clojure.core/defn- response-missing-body [input] (clojure.core/let [rawinput55995 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55996 {"Message" (portkey.aws/search-for-tag rawinput55995 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar55996 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar55996 ["Message" :content]))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result [input] (clojure.core/let [rawinput55997 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar55998 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput55997 "CloudFrontOriginAccessIdentityConfig" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar55998 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar55998 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar55998 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar55998 ["ETag"]))))))

(clojure.core/defn- response-distribution-not-disabled [input] (clojure.core/let [rawinput55999 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56000 {"Message" (portkey.aws/search-for-tag rawinput55999 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56000 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56000 ["Message" :content]))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists [input] (clojure.core/let [rawinput56001 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56002 {"Message" (portkey.aws/search-for-tag rawinput56001 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56002 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56002 ["Message" :content]))))))

(clojure.core/defn- response-precondition-failed [input] (clojure.core/let [rawinput56003 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56004 {"Message" (portkey.aws/search-for-tag rawinput56003 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56004 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56004 ["Message" :content]))))))

(clojure.core/defn- response-distribution-already-exists [input] (clojure.core/let [rawinput56005 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56006 {"Message" (portkey.aws/search-for-tag rawinput56005 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56006 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56006 ["Message" :content]))))))

(clojure.core/defn- response-invalid-origin-access-identity [input] (clojure.core/let [rawinput56007 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56008 {"Message" (portkey.aws/search-for-tag rawinput56007 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56008 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56008 ["Message" :content]))))))

(clojure.core/defn- response-too-many-trusted-signers [input] (clojure.core/let [rawinput56009 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56010 {"Message" (portkey.aws/search-for-tag rawinput56009 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56010 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56010 ["Message" :content]))))))

(clojure.core/defn- response-invalid-minimum-protocol-version [input] (clojure.core/let [rawinput56011 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56012 {"Message" (portkey.aws/search-for-tag rawinput56011 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56012 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56012 ["Message" :content]))))))

(clojure.core/defn- response-streaming-distribution-already-exists [input] (clojure.core/let [rawinput56013 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56014 {"Message" (portkey.aws/search-for-tag rawinput56013 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56014 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56014 ["Message" :content]))))))

(clojure.core/defn- response-invalid-if-match-version [input] (clojure.core/let [rawinput56015 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56016 {"Message" (portkey.aws/search-for-tag rawinput56015 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56016 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56016 ["Message" :content]))))))

(clojure.core/defn- response-create-distribution-result [input] (clojure.core/let [rawinput56017 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56018 {"Distribution" (portkey.aws/search-for-tag rawinput56017 "Distribution" :flattened? false), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar56018 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar56018 ["Distribution" :content]))) (letvar56018 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar56018 ["Location"]))) (letvar56018 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar56018 ["ETag"]))))))

(clojure.core/defn- response-too-many-distributions [input] (clojure.core/let [rawinput56019 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56020 {"Message" (portkey.aws/search-for-tag rawinput56019 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56020 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56020 ["Message" :content]))))))

(clojure.core/defn- response-no-such-distribution [input] (clojure.core/let [rawinput56021 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56022 {"Message" (portkey.aws/search-for-tag rawinput56021 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56022 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56022 ["Message" :content]))))))

(clojure.core/defn- response-update-streaming-distribution-result [input] (clojure.core/let [rawinput56023 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56024 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput56023 "StreamingDistribution" :flattened? false), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar56024 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar56024 ["StreamingDistribution" :content]))) (letvar56024 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar56024 ["ETag"]))))))

(clojure.core/defn- response-illegal-update [input] (clojure.core/let [rawinput56025 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56026 {"Message" (portkey.aws/search-for-tag rawinput56025 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56026 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56026 ["Message" :content]))))))

(clojure.core/defn- response-inconsistent-quantities [input] (clojure.core/let [rawinput56027 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56028 {"Message" (portkey.aws/search-for-tag rawinput56027 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56028 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56028 ["Message" :content]))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result [input] (clojure.core/let [rawinput56029 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56030 {"DistributionList" (portkey.aws/search-for-tag rawinput56029 "DistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar56030 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar56030 ["DistributionList" :content]))))))

(clojure.core/defn- response-list-distributions-result [input] (clojure.core/let [rawinput56031 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56032 {"DistributionList" (portkey.aws/search-for-tag rawinput56031 "DistributionList" :flattened? false)}] (clojure.core/cond-> {} (letvar56032 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar56032 ["DistributionList" :content]))))))

(clojure.core/defn- response-trusted-signer-does-not-exist [input] (clojure.core/let [rawinput56033 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56034 {"Message" (portkey.aws/search-for-tag rawinput56033 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56034 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56034 ["Message" :content]))))))

(clojure.core/defn- response-get-invalidation-result [input] (clojure.core/let [rawinput56035 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56036 {"Invalidation" (portkey.aws/search-for-tag rawinput56035 "Invalidation" :flattened? false)}] (clojure.core/cond-> {} (letvar56036 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar56036 ["Invalidation" :content]))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values [input] (clojure.core/let [rawinput56037 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar56038 {"Message" (portkey.aws/search-for-tag rawinput56037 "Message" :flattened? false)}] (clojure.core/cond-> {} (letvar56038 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar56038 ["Message" :content]))))))

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

(clojure.core/defn get-distribution-2016-01-28 ([get-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistribution2016_01_28", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-distribution-result))

(clojure.core/defn update-distribution-2016-01-28 ([update-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateDistribution2016_01_28", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-01-28/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-01-28/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-01-28/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-01-28/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-01-28/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-01-28/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-01-28/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-01-28/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-01-28/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-01-28/invalid-web-acl-id, "TooManyOrigins" :portkey.aws.cloudfront.-2016-01-28/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-01-28/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-01-28/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-01-28/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-01-28/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-01-28/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-01-28/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-01-28/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-01-28/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-01-28/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2016-01-28/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-01-28/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-01-28/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/update-distribution-result))

(clojure.core/defn delete-streaming-distribution-2016-01-28 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteStreamingDistribution2016_01_28", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2016-01-28 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2016_01_28", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn get-invalidation-2016-01-28 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetInvalidation2016_01_28", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2016-01-28/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-invalidation-result))

(clojure.core/defn create-streaming-distribution-2016-01-28 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateStreamingDistribution2016_01_28", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-01-28/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-01-28/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-01-28/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-01-28/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-01-28/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/create-streaming-distribution-result))

(clojure.core/defn get-streaming-distribution-2016-01-28 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistribution2016_01_28", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-result))

(clojure.core/defn create-distribution-2016-01-28 ([create-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateDistribution2016_01_28", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"NoSuchOrigin" :portkey.aws.cloudfront.-2016-01-28/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-01-28/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-01-28/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-01-28/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-01-28/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-01-28/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-01-28/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-01-28/invalid-error-code, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-01-28/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-01-28/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-01-28/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-01-28/invalid-origin, "TooManyOrigins" :portkey.aws.cloudfront.-2016-01-28/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-01-28/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-01-28/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-01-28/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-01-28/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-01-28/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-01-28/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-01-28/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-01-28/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-01-28/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-01-28/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-01-28/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-01-28/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/create-distribution-result))

(clojure.core/defn get-streaming-distribution-config-2016-01-28 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetStreamingDistributionConfig2016_01_28", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-streaming-distribution-config-result))

(clojure.core/defn list-distributions-2016-01-28 ([] (list-distributions-2016-01-28 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributions2016_01_28", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2016-01-28 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-01-28/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/list-distributions-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2016-01-28 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2016_01_28", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2016-01-28 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListInvalidations2016_01_28", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/list-invalidations-result))

(clojure.core/defn get-cloud-front-origin-access-identity-2016-01-28 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2016_01_28", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2016-01-28 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2016_01_28", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2016-01-28/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2016-01-28 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateStreamingDistribution2016_01_28", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-01-28/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-01-28/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-01-28/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2016-01-28/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-01-28/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2016-01-28 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{Id}/config", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetDistributionConfig2016_01_28", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/get-distribution-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2016-01-28 ([] (list-cloud-front-origin-access-identities-2016-01-28 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2016_01_28", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2016-01-28 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-01-28/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2016-01-28 ([] (list-streaming-distributions-2016-01-28 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/streaming-distribution", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListStreamingDistributions2016_01_28", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2016-01-28 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-01-28/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/list-streaming-distributions-result))

(clojure.core/defn delete-distribution-2016-01-28 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{Id}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/action "DeleteDistribution2016_01_28", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__23834__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2016-01-28/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-01-28/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-01-28/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2016-01-28 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateInvalidation2016_01_28", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-01-28/access-denied, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-01-28/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2016-01-28/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2016-01-28/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/create-invalidation-result))

(clojure.core/defn list-distributions-by-web-acl-id-2016-01-28 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListDistributionsByWebACLId2016_01_28", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-01-28/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2016-01-28 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__23835__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__23835__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-01-28/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-01-28/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-01-28/origin-access-identity/cloudfront", :http.request.configuration/version "2016-01-28", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-01-28/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2016_01_28", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2016-01-28/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-01-28/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2016-01-28/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2016-01-28/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-01-28/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2016-01-28 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-01-28/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-01-28/create-cloud-front-origin-access-identity-result))
