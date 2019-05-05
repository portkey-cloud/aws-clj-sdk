(ns portkey.aws.cloudfront.-2016-11-25 (:require [portkey.aws]))

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

(clojure.core/declare ser-lambda-function-association)

(clojure.core/declare ser-forwarded-values)

(clojure.core/declare ser-invalidation-batch)

(clojure.core/declare ser-query-string-cache-keys-list)

(clojure.core/declare ser-item-selection)

(clojure.core/declare ser-lambda-function-associations)

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

(clojure.core/declare ser-event-type)

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

(clojure.core/defn- ser-lambda-function-association [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LambdaFunctionAssociation", :type "structure"} (clojure.core/contains? input :lambda-function-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :lambda-function-arn)) #:http.request.field{:name "LambdaFunctionARN", :shape "string"})) (clojure.core/contains? input :event-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-event-type (input :event-type)) #:http.request.field{:name "EventType", :shape "EventType"}))))

(clojure.core/defn- ser-forwarded-values [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serboolean (:query-string input)) #:http.request.field{:name "QueryString", :shape "boolean"}) (clojure.core/into (ser-cookie-preference (:cookies input)) #:http.request.field{:name "Cookies", :shape "CookiePreference"})], :shape "ForwardedValues", :type "structure"} (clojure.core/contains? input :headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-headers (input :headers)) #:http.request.field{:name "Headers", :shape "Headers"})) (clojure.core/contains? input :query-string-cache-keys) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-string-cache-keys (input :query-string-cache-keys)) #:http.request.field{:name "QueryStringCacheKeys", :shape "QueryStringCacheKeys"}))))

(clojure.core/defn- ser-invalidation-batch [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-paths (:paths input)) #:http.request.field{:name "Paths", :shape "Paths"}) (clojure.core/into (serstring (:caller-reference input)) #:http.request.field{:name "CallerReference", :shape "string"})], :shape "InvalidationBatch", :type "structure"}))

(clojure.core/defn- ser-query-string-cache-keys-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (serstring coll) #:http.request.field{:shape "string", :location-name "Name"}))) input), :shape "QueryStringCacheKeysList", :type "list"})

(clojure.core/defn- ser-item-selection [input] #:http.request.field{:value (clojure.core/get {"none" "none", :none "none", "whitelist" "whitelist", :whitelist "whitelist", "all" "all", :all "all"} input), :shape "ItemSelection"})

(clojure.core/defn- ser-lambda-function-associations [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "LambdaFunctionAssociations", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-association-list (input :items)) #:http.request.field{:name "Items", :shape "LambdaFunctionAssociationList"}))))

(clojure.core/defn- ser-viewer-protocol-policy [input] #:http.request.field{:value (clojure.core/get {"allow-all" "allow-all", :allowall "allow-all", "https-only" "https-only", :httpsonly "https-only", "redirect-to-https" "redirect-to-https", :redirecttohttps "redirect-to-https"} input), :shape "ViewerProtocolPolicy"})

(clojure.core/defn- ser-custom-error-response [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:error-code input)) #:http.request.field{:name "ErrorCode", :shape "integer"})], :shape "CustomErrorResponse", :type "structure"} (clojure.core/contains? input :response-page-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-page-path)) #:http.request.field{:name "ResponsePagePath", :shape "string"})) (clojure.core/contains? input :response-code) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :response-code)) #:http.request.field{:name "ResponseCode", :shape "string"})) (clojure.core/contains? input :error-caching-min-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :error-caching-min-ttl)) #:http.request.field{:name "ErrorCachingMinTTL", :shape "long"}))))

(clojure.core/defn- serlong [input] #:http.request.field{:value input, :shape "long"})

(clojure.core/defn- ser-origin-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-origin coll) #:http.request.field{:shape "Origin", :location-name "Origin"}))) input), :shape "OriginList", :type "list", :min 1})

(clojure.core/defn- ser-cached-methods [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-methods-list (:items input)) #:http.request.field{:name "Items", :shape "MethodsList"})], :shape "CachedMethods", :type "structure"}))

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-tags [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tags", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :items)) #:http.request.field{:name "Items", :shape "TagList"}))))

(clojure.core/defn- ser-cache-behaviors [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CacheBehaviors", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cache-behavior-list (input :items)) #:http.request.field{:name "Items", :shape "CacheBehaviorList"}))))

(clojure.core/defn- ser-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:path-pattern input)) #:http.request.field{:name "PathPattern", :shape "string"}) (clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "CacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

(clojure.core/defn- ser-origin [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:id input)) #:http.request.field{:name "Id", :shape "string"}) (clojure.core/into (serstring (:domain-name input)) #:http.request.field{:name "DomainName", :shape "string"})], :shape "Origin", :type "structure"} (clojure.core/contains? input :origin-path) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :origin-path)) #:http.request.field{:name "OriginPath", :shape "string"})) (clojure.core/contains? input :custom-headers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-headers (input :custom-headers)) #:http.request.field{:name "CustomHeaders", :shape "CustomHeaders"})) (clojure.core/contains? input :s-3-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-origin-config (input :s-3-origin-config)) #:http.request.field{:name "S3OriginConfig", :shape "S3OriginConfig"})) (clojure.core/contains? input :custom-origin-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-origin-config (input :custom-origin-config)) #:http.request.field{:name "CustomOriginConfig", :shape "CustomOriginConfig"}))))

(clojure.core/defn- ser-custom-error-responses [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "CustomErrorResponses", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-custom-error-response-list (input :items)) #:http.request.field{:name "Items", :shape "CustomErrorResponseList"}))))

(clojure.core/defn- ser-origin-ssl-protocols [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"}) (clojure.core/into (ser-ssl-protocols-list (:items input)) #:http.request.field{:name "Items", :shape "SslProtocolsList"})], :shape "OriginSslProtocols", :type "structure"}))

(clojure.core/defn- ser-aliases [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:quantity input)) #:http.request.field{:name "Quantity", :shape "integer"})], :shape "Aliases", :type "structure"} (clojure.core/contains? input :items) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-alias-list (input :items)) #:http.request.field{:name "Items", :shape "AliasList"}))))

(clojure.core/defn- ser-event-type [input] #:http.request.field{:value (clojure.core/get {"viewer-request" "viewer-request", :viewerrequest "viewer-request", "viewer-response" "viewer-response", :viewerresponse "viewer-response", "origin-request" "origin-request", :originrequest "origin-request", "origin-response" "origin-response", :originresponse "origin-response"} input), :shape "EventType"})

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

(clojure.core/defn- ser-lambda-function-association-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-lambda-function-association coll) #:http.request.field{:shape "LambdaFunctionAssociation", :location-name "LambdaFunctionAssociation"}))) input), :shape "LambdaFunctionAssociationList", :type "list"})

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

(clojure.core/defn- ser-default-cache-behavior [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serstring (:target-origin-id input)) #:http.request.field{:name "TargetOriginId", :shape "string"}) (clojure.core/into (ser-forwarded-values (:forwarded-values input)) #:http.request.field{:name "ForwardedValues", :shape "ForwardedValues"}) (clojure.core/into (ser-trusted-signers (:trusted-signers input)) #:http.request.field{:name "TrustedSigners", :shape "TrustedSigners"}) (clojure.core/into (ser-viewer-protocol-policy (:viewer-protocol-policy input)) #:http.request.field{:name "ViewerProtocolPolicy", :shape "ViewerProtocolPolicy"}) (clojure.core/into (serlong (:min-ttl input)) #:http.request.field{:name "MinTTL", :shape "long"})], :shape "DefaultCacheBehavior", :type "structure"} (clojure.core/contains? input :smooth-streaming) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :smooth-streaming)) #:http.request.field{:name "SmoothStreaming", :shape "boolean"})) (clojure.core/contains? input :compress) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :compress)) #:http.request.field{:name "Compress", :shape "boolean"})) (clojure.core/contains? input :lambda-function-associations) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-lambda-function-associations (input :lambda-function-associations)) #:http.request.field{:name "LambdaFunctionAssociations", :shape "LambdaFunctionAssociations"})) (clojure.core/contains? input :max-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :max-ttl)) #:http.request.field{:name "MaxTTL", :shape "long"})) (clojure.core/contains? input :allowed-methods) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-allowed-methods (input :allowed-methods)) #:http.request.field{:name "AllowedMethods", :shape "AllowedMethods"})) (clojure.core/contains? input :default-ttl) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serlong (input :default-ttl)) #:http.request.field{:name "DefaultTTL", :shape "long"}))))

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

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})]}))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2016-11-25/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

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

(clojure.core/declare deser-lambda-function-association)

(clojure.core/declare deser-forwarded-values)

(clojure.core/declare deser-invalidation-batch)

(clojure.core/declare deser-invalidation-summary-list)

(clojure.core/declare deser-query-string-cache-keys-list)

(clojure.core/declare deser-streaming-distribution-list)

(clojure.core/declare deser-item-selection)

(clojure.core/declare deser-streaming-distribution)

(clojure.core/declare deser-lambda-function-associations)

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

(clojure.core/declare deser-event-type)

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

(clojure.core/declare deser-methods-list)

(clojure.core/declare deser-default-cache-behavior)

(clojure.core/declare deser-trusted-signers)

(clojure.core/declare deser-viewer-certificate)

(clojure.core/declare deser-cloud-front-origin-access-identity-config)

(clojure.core/declare deser-geo-restriction)

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__21591__auto__ (portkey.aws/unbox-xml-primitive-value input)] (clojure.core/cond (clojure.core/= "true" boolstr__21591__auto__) true (clojure.core/= "false" boolstr__21591__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar288457 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar288457 ["Quantity" :content]))} (letvar288457 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar288457 ["Items" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar288565 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar288565 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar288565 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar288565 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar288565 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar288673 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar288673 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar288673 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar288673 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar288798 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? nil :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar288798 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar288798 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar288798 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar288798 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar288945 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar288945 ["GeoRestriction" :content]))})))

(clojure.core/defn- deserstring [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar289058 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? nil :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar289058 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar289058 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar289058 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar289058 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar289058 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar289058 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar289058 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar289058 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar289166 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar289166 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar289166 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar289166 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar289166 ["Quantity" :content]))} (letvar289166 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar289166 ["NextMarker" :content]))) (letvar289166 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar289166 ["Items" :content]))))))

(clojure.core/defn- deser-lambda-function-association [input] (clojure.core/let [letvar289274 {"LambdaFunctionARN" (portkey.aws/search-for-tag input "LambdaFunctionARN" :flattened? nil :xmlAttribute? nil), "EventType" (portkey.aws/search-for-tag input "EventType" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar289274 "LambdaFunctionARN") (clojure.core/assoc :lambda-function-arn (deserstring (clojure.core/get-in letvar289274 ["LambdaFunctionARN" :content]))) (letvar289274 "EventType") (clojure.core/assoc :event-type (deser-event-type (clojure.core/get-in letvar289274 ["EventType" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar289382 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? nil :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? nil :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? nil :xmlAttribute? nil), "QueryStringCacheKeys" (portkey.aws/search-for-tag input "QueryStringCacheKeys" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar289382 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar289382 ["Cookies" :content]))} (letvar289382 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar289382 ["Headers" :content]))) (letvar289382 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar289382 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar289490 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar289490 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar289490 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar289632 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar289632 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar289632 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar289632 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar289632 ["Quantity" :content]))} (letvar289632 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar289632 ["NextMarker" :content]))) (letvar289632 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar289632 ["Items" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar289745 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? nil :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar289745 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar289745 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar289745 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar289745 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar289745 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar289745 ["StreamingDistributionConfig" :content]))} (letvar289745 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar289745 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-lambda-function-associations [input] (clojure.core/let [letvar289853 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar289853 ["Quantity" :content]))} (letvar289853 "Items") (clojure.core/assoc :items (deser-lambda-function-association-list (clojure.core/get-in letvar289853 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar289966 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? nil :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? nil :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? nil :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar289966 ["ErrorCode" :content]))} (letvar289966 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar289966 ["ResponsePagePath" :content]))) (letvar289966 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar289966 ["ResponseCode" :content]))) (letvar289966 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar289966 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar290091 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? nil :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar290091 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar290091 ["AwsAccountNumber" :content]))) (letvar290091 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar290091 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar290218 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar290218 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar290218 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar290331 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar290331 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar290331 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar290456 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar290456 ["Quantity" :content]))} (letvar290456 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar290456 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar290564 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? nil :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? nil :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? nil :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? nil :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? nil :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? nil :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? nil :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? nil :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? nil :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? nil :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar290564 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar290564 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar290564 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar290564 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar290564 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar290564 ["MinTTL" :content]))} (letvar290564 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar290564 ["SmoothStreaming" :content]))) (letvar290564 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar290564 ["Compress" :content]))) (letvar290564 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar290564 ["LambdaFunctionAssociations" :content]))) (letvar290564 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar290564 ["MaxTTL" :content]))) (letvar290564 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar290564 ["AllowedMethods" :content]))) (letvar290564 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar290564 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar290672 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar290672 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar290672 ["Quantity" :content]))} (letvar290672 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar290672 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar290780 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? nil :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? nil :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? nil :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar290780 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar290780 ["DomainName" :content]))} (letvar290780 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar290780 ["OriginPath" :content]))) (letvar290780 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar290780 ["CustomHeaders" :content]))) (letvar290780 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar290780 ["S3OriginConfig" :content]))) (letvar290780 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar290780 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (portkey.aws/unbox-xml-primitive-value input))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar290890 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar290890 ["Quantity" :content]))} (letvar290890 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar290890 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar290998 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar290998 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar290998 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar290998 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar290998 ["Quantity" :content]))} (letvar290998 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar290998 ["NextMarker" :content]))) (letvar290998 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar290998 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar291106 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar291106 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar291106 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar291214 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar291214 ["Quantity" :content]))} (letvar291214 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar291214 ["Items" :content]))))))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"viewer-request" :viewerrequest, "viewer-response" :viewerresponse, "origin-request" :originrequest, "origin-response" :originresponse} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar291327 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar291327 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar291327 ["Items" :content]))} (letvar291327 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar291327 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar291440 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? nil :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? nil :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? nil :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar291440 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar291440 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar291440 ["OriginProtocolPolicy" :content]))} (letvar291440 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar291440 ["OriginSslProtocols" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar291548 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar291548 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar291548 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar291656 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar291656 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar291656 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar291656 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar291656 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar291656 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar291656 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar291656 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar291656 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar291656 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar291656 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar291656 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar291764 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? nil :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar291764 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar291764 ["S3CanonicalUserId" :content]))} (letvar291764 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar291764 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar291906 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar291906 ["Quantity" :content]))} (letvar291906 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar291906 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar292014 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar292014 ["Quantity" :content]))} (letvar292014 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar292014 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar292122 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? nil :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? nil :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? nil :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? nil :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? nil :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? nil :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? nil :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? nil :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar292122 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar292122 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar292122 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar292122 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar292122 ["Enabled" :content]))} (letvar292122 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar292122 ["DefaultRootObject" :content]))) (letvar292122 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar292122 ["IsIPV6Enabled" :content]))) (letvar292122 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar292122 ["Restrictions" :content]))) (letvar292122 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar292122 ["WebACLId" :content]))) (letvar292122 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar292122 ["Logging" :content]))) (letvar292122 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar292122 ["CacheBehaviors" :content]))) (letvar292122 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar292122 ["CustomErrorResponses" :content]))) (letvar292122 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar292122 ["Aliases" :content]))) (letvar292122 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar292122 ["PriceClass" :content]))) (letvar292122 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar292122 ["HttpVersion" :content]))) (letvar292122 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar292122 ["ViewerCertificate" :content]))))))

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

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar292352 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar292352 ["Quantity" :content]))} (letvar292352 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar292352 ["Items" :content]))))))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar292462 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar292462 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar292462 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar292462 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar292587 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? nil :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar292587 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar292587 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar292695 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar292695 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar292695 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar292695 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar292695 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar292695 ["Enabled" :content]))} (letvar292695 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar292695 ["Aliases" :content]))) (letvar292695 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar292695 ["Logging" :content]))) (letvar292695 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar292695 ["PriceClass" :content]))))))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar292803 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar292803 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar292928 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? nil :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar292928 ["Key" :content]))} (letvar292928 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar292928 ["Value" :content]))))))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar293036 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? nil :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar293036 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar293036 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar293036 ["Prefix" :content]))})))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar293144 {"IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? nil :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? nil :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? nil :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? nil :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? nil :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? nil :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? nil :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? nil :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? nil :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? nil :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? nil :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? nil :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? nil :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? nil :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar293144 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar293144 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar293144 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar293144 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar293144 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar293144 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar293144 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar293144 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar293144 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar293144 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar293144 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar293144 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar293144 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar293144 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar293144 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar293144 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar293144 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar293144 ["PriceClass" :content]))})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-lambda-function-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-association coll))) input))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar293274 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar293274 ["Quantity" :content]))} (letvar293274 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar293274 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar293387 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar293387 ["Quantity" :content]))} (letvar293387 "Items") (clojure.core/assoc :items (deser-origin-list (clojure.core/get-in letvar293387 ["Items" :content]))))))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar293512 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? nil :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? nil :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? nil :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar293512 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar293512 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar293512 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar293512 ["Quantity" :content]))} (letvar293512 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar293512 ["NextMarker" :content]))) (letvar293512 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar293512 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-http-version [input] (clojure.core/get {"http1.1" :http-11, "http2" :http-2} (portkey.aws/unbox-xml-primitive-value input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar293630 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? nil :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar293630 ["Forward" :content]))} (letvar293630 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar293630 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar293738 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar293738 ["Quantity" :content]))} (letvar293738 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar293738 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar293863 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? nil :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? nil :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? nil :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? nil :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? nil :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? nil :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? nil :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? nil :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? nil :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? nil :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar293863 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar293863 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar293863 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar293863 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar293863 ["MinTTL" :content]))} (letvar293863 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar293863 ["SmoothStreaming" :content]))) (letvar293863 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar293863 ["Compress" :content]))) (letvar293863 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar293863 ["LambdaFunctionAssociations" :content]))) (letvar293863 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar293863 ["MaxTTL" :content]))) (letvar293863 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar293863 ["AllowedMethods" :content]))) (letvar293863 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar293863 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar293971 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar293971 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar293971 ["Quantity" :content]))} (letvar293971 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar293971 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar294079 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? nil :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? nil :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? nil :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? nil :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? nil :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? nil :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar294079 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar294079 ["CloudFrontDefaultCertificate" :content]))) (letvar294079 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar294079 ["IAMCertificateId" :content]))) (letvar294079 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar294079 ["ACMCertificateArn" :content]))) (letvar294079 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar294079 ["SSLSupportMethod" :content]))) (letvar294079 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar294079 ["MinimumProtocolVersion" :content]))) (letvar294079 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar294079 ["Certificate" :content]))) (letvar294079 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar294079 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar294187 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? nil :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar294187 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar294187 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar294295 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? nil :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? nil :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? nil :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar294295 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar294295 ["Quantity" :content]))} (letvar294295 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar294295 ["Items" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-result ([input] (response-list-tags-for-resource-result nil input)) ([resultWrapper294297 input] (clojure.core/let [rawinput294296 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294298 {"Tags" (portkey.aws/search-for-tag rawinput294296 "Tags" :flattened? nil :result-wrapper resultWrapper294297)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar294298 ["Tags" :content]))}))))

(clojure.core/defn- response-too-many-distributions-with-lambda-associations ([input] (response-too-many-distributions-with-lambda-associations nil input)) ([resultWrapper294300 input] (clojure.core/let [rawinput294299 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294301 {"Message" (portkey.aws/search-for-tag rawinput294299 "Message" :flattened? nil :result-wrapper resultWrapper294300)}] (clojure.core/cond-> {} (letvar294301 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294301 ["Message" :content])))))))

(clojure.core/defn- response-no-such-origin ([input] (response-no-such-origin nil input)) ([resultWrapper294303 input] (clojure.core/let [rawinput294302 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294304 {"Message" (portkey.aws/search-for-tag rawinput294302 "Message" :flattened? nil :result-wrapper resultWrapper294303)}] (clojure.core/cond-> {} (letvar294304 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294304 ["Message" :content])))))))

(clojure.core/defn- response-invalid-protocol-settings ([input] (response-invalid-protocol-settings nil input)) ([resultWrapper294306 input] (clojure.core/let [rawinput294305 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294307 {"Message" (portkey.aws/search-for-tag rawinput294305 "Message" :flattened? nil :result-wrapper resultWrapper294306)}] (clojure.core/cond-> {} (letvar294307 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294307 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list ([input] (response-too-many-cookie-names-in-white-list nil input)) ([resultWrapper294309 input] (clojure.core/let [rawinput294308 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294310 {"Message" (portkey.aws/search-for-tag rawinput294308 "Message" :flattened? nil :result-wrapper resultWrapper294309)}] (clojure.core/cond-> {} (letvar294310 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294310 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cache-behaviors ([input] (response-too-many-cache-behaviors nil input)) ([resultWrapper294312 input] (clojure.core/let [rawinput294311 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294313 {"Message" (portkey.aws/search-for-tag rawinput294311 "Message" :flattened? nil :result-wrapper resultWrapper294312)}] (clojure.core/cond-> {} (letvar294313 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294313 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origin-custom-headers ([input] (response-too-many-origin-custom-headers nil input)) ([resultWrapper294315 input] (clojure.core/let [rawinput294314 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294316 {"Message" (portkey.aws/search-for-tag rawinput294314 "Message" :flattened? nil :result-wrapper resultWrapper294315)}] (clojure.core/cond-> {} (letvar294316 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294316 ["Message" :content])))))))

(clojure.core/defn- response-too-many-streaming-distributions ([input] (response-too-many-streaming-distributions nil input)) ([resultWrapper294318 input] (clojure.core/let [rawinput294317 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294319 {"Message" (portkey.aws/search-for-tag rawinput294317 "Message" :flattened? nil :result-wrapper resultWrapper294318)}] (clojure.core/cond-> {} (letvar294319 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294319 ["Message" :content])))))))

(clojure.core/defn- response-get-streaming-distribution-result ([input] (response-get-streaming-distribution-result nil input)) ([resultWrapper294321 input] (clojure.core/let [rawinput294320 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294322 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput294320 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper294321), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294322 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar294322 ["StreamingDistribution" :content]))) (letvar294322 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294322 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es ([input] (response-too-many-streaming-distribution-cnam-es nil input)) ([resultWrapper294324 input] (clojure.core/let [rawinput294323 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294325 {"Message" (portkey.aws/search-for-tag rawinput294323 "Message" :flattened? nil :result-wrapper resultWrapper294324)}] (clojure.core/cond-> {} (letvar294325 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294325 ["Message" :content])))))))

(clojure.core/defn- response-invalid-viewer-certificate ([input] (response-invalid-viewer-certificate nil input)) ([resultWrapper294327 input] (clojure.core/let [rawinput294326 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294328 {"Message" (portkey.aws/search-for-tag rawinput294326 "Message" :flattened? nil :result-wrapper resultWrapper294327)}] (clojure.core/cond-> {} (letvar294328 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294328 ["Message" :content])))))))

(clojure.core/defn- response-invalid-argument ([input] (response-invalid-argument nil input)) ([resultWrapper294330 input] (clojure.core/let [rawinput294329 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294331 {"Message" (portkey.aws/search-for-tag rawinput294329 "Message" :flattened? nil :result-wrapper resultWrapper294330)}] (clojure.core/cond-> {} (letvar294331 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294331 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-not-disabled ([input] (response-streaming-distribution-not-disabled nil input)) ([resultWrapper294333 input] (clojure.core/let [rawinput294332 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294334 {"Message" (portkey.aws/search-for-tag rawinput294332 "Message" :flattened? nil :result-wrapper resultWrapper294333)}] (clojure.core/cond-> {} (letvar294334 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294334 ["Message" :content])))))))

(clojure.core/defn- response-too-many-certificates ([input] (response-too-many-certificates nil input)) ([resultWrapper294336 input] (clojure.core/let [rawinput294335 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294337 {"Message" (portkey.aws/search-for-tag rawinput294335 "Message" :flattened? nil :result-wrapper resultWrapper294336)}] (clojure.core/cond-> {} (letvar294337 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294337 ["Message" :content])))))))

(clojure.core/defn- response-access-denied ([input] (response-access-denied nil input)) ([resultWrapper294339 input] (clojure.core/let [rawinput294338 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294340 {"Message" (portkey.aws/search-for-tag rawinput294338 "Message" :flattened? nil :result-wrapper resultWrapper294339)}] (clojure.core/cond-> {} (letvar294340 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294340 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use ([input] (response-cloud-front-origin-access-identity-in-use nil input)) ([resultWrapper294342 input] (clojure.core/let [rawinput294341 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294343 {"Message" (portkey.aws/search-for-tag rawinput294341 "Message" :flattened? nil :result-wrapper resultWrapper294342)}] (clojure.core/cond-> {} (letvar294343 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294343 ["Message" :content])))))))

(clojure.core/defn- response-invalid-lambda-function-association ([input] (response-invalid-lambda-function-association nil input)) ([resultWrapper294345 input] (clojure.core/let [rawinput294344 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294346 {"Message" (portkey.aws/search-for-tag rawinput294344 "Message" :flattened? nil :result-wrapper resultWrapper294345)}] (clojure.core/cond-> {} (letvar294346 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294346 ["Message" :content])))))))

(clojure.core/defn- response-no-such-resource ([input] (response-no-such-resource nil input)) ([resultWrapper294348 input] (clojure.core/let [rawinput294347 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294349 {"Message" (portkey.aws/search-for-tag rawinput294347 "Message" :flattened? nil :result-wrapper resultWrapper294348)}] (clojure.core/cond-> {} (letvar294349 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294349 ["Message" :content])))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result ([input] (response-update-cloud-front-origin-access-identity-result nil input)) ([resultWrapper294351 input] (clojure.core/let [rawinput294350 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294352 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput294350 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper294351), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294352 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar294352 ["CloudFrontOriginAccessIdentity" :content]))) (letvar294352 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294352 ["ETag"])))))))

(clojure.core/defn- response-invalid-error-code ([input] (response-invalid-error-code nil input)) ([resultWrapper294354 input] (clojure.core/let [rawinput294353 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294355 {"Message" (portkey.aws/search-for-tag rawinput294353 "Message" :flattened? nil :result-wrapper resultWrapper294354)}] (clojure.core/cond-> {} (letvar294355 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294355 ["Message" :content])))))))

(clojure.core/defn- response-too-many-lambda-function-associations ([input] (response-too-many-lambda-function-associations nil input)) ([resultWrapper294357 input] (clojure.core/let [rawinput294356 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294358 {"Message" (portkey.aws/search-for-tag rawinput294356 "Message" :flattened? nil :result-wrapper resultWrapper294357)}] (clojure.core/cond-> {} (letvar294358 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294358 ["Message" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-result ([input] (response-create-streaming-distribution-result nil input)) ([resultWrapper294360 input] (clojure.core/let [rawinput294359 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294361 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput294359 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper294360), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294361 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar294361 ["StreamingDistribution" :content]))) (letvar294361 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar294361 ["Location"]))) (letvar294361 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294361 ["ETag"])))))))

(clojure.core/defn- response-invalid-relative-path ([input] (response-invalid-relative-path nil input)) ([resultWrapper294363 input] (clojure.core/let [rawinput294362 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294364 {"Message" (portkey.aws/search-for-tag rawinput294362 "Message" :flattened? nil :result-wrapper resultWrapper294363)}] (clojure.core/cond-> {} (letvar294364 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294364 ["Message" :content])))))))

(clojure.core/defn- response-invalid-location-code ([input] (response-invalid-location-code nil input)) ([resultWrapper294366 input] (clojure.core/let [rawinput294365 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294367 {"Message" (portkey.aws/search-for-tag rawinput294365 "Message" :flattened? nil :result-wrapper resultWrapper294366)}] (clojure.core/cond-> {} (letvar294367 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294367 ["Message" :content])))))))

(clojure.core/defn- response-invalid-web-acl-id ([input] (response-invalid-web-acl-id nil input)) ([resultWrapper294369 input] (clojure.core/let [rawinput294368 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294370 {"Message" (portkey.aws/search-for-tag rawinput294368 "Message" :flattened? nil :result-wrapper resultWrapper294369)}] (clojure.core/cond-> {} (letvar294370 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294370 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin ([input] (response-invalid-origin nil input)) ([resultWrapper294372 input] (clojure.core/let [rawinput294371 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294373 {"Message" (portkey.aws/search-for-tag rawinput294371 "Message" :flattened? nil :result-wrapper resultWrapper294372)}] (clojure.core/cond-> {} (letvar294373 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294373 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities ([input] (response-too-many-cloud-front-origin-access-identities nil input)) ([resultWrapper294375 input] (clojure.core/let [rawinput294374 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294376 {"Message" (portkey.aws/search-for-tag rawinput294374 "Message" :flattened? nil :result-wrapper resultWrapper294375)}] (clojure.core/cond-> {} (letvar294376 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294376 ["Message" :content])))))))

(clojure.core/defn- response-update-distribution-result ([input] (response-update-distribution-result nil input)) ([resultWrapper294378 input] (clojure.core/let [rawinput294377 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294379 {"Distribution" (portkey.aws/search-for-tag rawinput294377 "Distribution" :flattened? nil :result-wrapper resultWrapper294378), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294379 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar294379 ["Distribution" :content]))) (letvar294379 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294379 ["ETag"])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result ([input] (response-get-cloud-front-origin-access-identity-result nil input)) ([resultWrapper294381 input] (clojure.core/let [rawinput294380 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294382 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput294380 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper294381), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294382 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar294382 ["CloudFrontOriginAccessIdentity" :content]))) (letvar294382 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294382 ["ETag"])))))))

(clojure.core/defn- response-invalid-query-string-parameters ([input] (response-invalid-query-string-parameters nil input)) ([resultWrapper294384 input] (clojure.core/let [rawinput294383 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294385 {"Message" (portkey.aws/search-for-tag rawinput294383 "Message" :flattened? nil :result-wrapper resultWrapper294384)}] (clojure.core/cond-> {} (letvar294385 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294385 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origins ([input] (response-too-many-origins nil input)) ([resultWrapper294387 input] (clojure.core/let [rawinput294386 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294388 {"Message" (portkey.aws/search-for-tag rawinput294386 "Message" :flattened? nil :result-wrapper resultWrapper294387)}] (clojure.core/cond-> {} (letvar294388 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294388 ["Message" :content])))))))

(clojure.core/defn- response-invalid-ttl-order ([input] (response-invalid-ttl-order nil input)) ([resultWrapper294390 input] (clojure.core/let [rawinput294389 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294391 {"Message" (portkey.aws/search-for-tag rawinput294389 "Message" :flattened? nil :result-wrapper resultWrapper294390)}] (clojure.core/cond-> {} (letvar294391 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294391 ["Message" :content])))))))

(clojure.core/defn- response-no-such-streaming-distribution ([input] (response-no-such-streaming-distribution nil input)) ([resultWrapper294393 input] (clojure.core/let [rawinput294392 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294394 {"Message" (portkey.aws/search-for-tag rawinput294392 "Message" :flattened? nil :result-wrapper resultWrapper294393)}] (clojure.core/cond-> {} (letvar294394 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294394 ["Message" :content])))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result ([input] (response-create-cloud-front-origin-access-identity-result nil input)) ([resultWrapper294396 input] (clojure.core/let [rawinput294395 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294397 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput294395 "CloudFrontOriginAccessIdentity" :flattened? nil :result-wrapper resultWrapper294396), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294397 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar294397 ["CloudFrontOriginAccessIdentity" :content]))) (letvar294397 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar294397 ["Location"]))) (letvar294397 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294397 ["ETag"])))))))

(clojure.core/defn- response-cname-already-exists ([input] (response-cname-already-exists nil input)) ([resultWrapper294399 input] (clojure.core/let [rawinput294398 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294400 {"Message" (portkey.aws/search-for-tag rawinput294398 "Message" :flattened? nil :result-wrapper resultWrapper294399)}] (clojure.core/cond-> {} (letvar294400 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294400 ["Message" :content])))))))

(clojure.core/defn- response-invalid-default-root-object ([input] (response-invalid-default-root-object nil input)) ([resultWrapper294402 input] (clojure.core/let [rawinput294401 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294403 {"Message" (portkey.aws/search-for-tag rawinput294401 "Message" :flattened? nil :result-wrapper resultWrapper294402)}] (clojure.core/cond-> {} (letvar294403 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294403 ["Message" :content])))))))

(clojure.core/defn- response-invalid-response-code ([input] (response-invalid-response-code nil input)) ([resultWrapper294405 input] (clojure.core/let [rawinput294404 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294406 {"Message" (portkey.aws/search-for-tag rawinput294404 "Message" :flattened? nil :result-wrapper resultWrapper294405)}] (clojure.core/cond-> {} (letvar294406 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294406 ["Message" :content])))))))

(clojure.core/defn- response-no-such-invalidation ([input] (response-no-such-invalidation nil input)) ([resultWrapper294408 input] (clojure.core/let [rawinput294407 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294409 {"Message" (portkey.aws/search-for-tag rawinput294407 "Message" :flattened? nil :result-wrapper resultWrapper294408)}] (clojure.core/cond-> {} (letvar294409 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294409 ["Message" :content])))))))

(clojure.core/defn- response-too-many-invalidations-in-progress ([input] (response-too-many-invalidations-in-progress nil input)) ([resultWrapper294411 input] (clojure.core/let [rawinput294410 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294412 {"Message" (portkey.aws/search-for-tag rawinput294410 "Message" :flattened? nil :result-wrapper resultWrapper294411)}] (clojure.core/cond-> {} (letvar294412 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294412 ["Message" :content])))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result ([input] (response-list-cloud-front-origin-access-identities-result nil input)) ([resultWrapper294414 input] (clojure.core/let [rawinput294413 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294415 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput294413 "CloudFrontOriginAccessIdentityList" :flattened? nil :result-wrapper resultWrapper294414)}] (clojure.core/cond-> {} (letvar294415 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar294415 ["CloudFrontOriginAccessIdentityList" :content])))))))

(clojure.core/defn- response-invalid-forward-cookies ([input] (response-invalid-forward-cookies nil input)) ([resultWrapper294417 input] (clojure.core/let [rawinput294416 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294418 {"Message" (portkey.aws/search-for-tag rawinput294416 "Message" :flattened? nil :result-wrapper resultWrapper294417)}] (clojure.core/cond-> {} (letvar294418 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294418 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-config-result ([input] (response-get-distribution-config-result nil input)) ([resultWrapper294420 input] (clojure.core/let [rawinput294419 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294421 {"DistributionConfig" (portkey.aws/search-for-tag rawinput294419 "DistributionConfig" :flattened? nil :result-wrapper resultWrapper294420), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294421 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar294421 ["DistributionConfig" :content]))) (letvar294421 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294421 ["ETag"])))))))

(clojure.core/defn- response-invalid-required-protocol ([input] (response-invalid-required-protocol nil input)) ([resultWrapper294423 input] (clojure.core/let [rawinput294422 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294424 {"Message" (portkey.aws/search-for-tag rawinput294422 "Message" :flattened? nil :result-wrapper resultWrapper294423)}] (clojure.core/cond-> {} (letvar294424 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294424 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-result ([input] (response-get-distribution-result nil input)) ([resultWrapper294426 input] (clojure.core/let [rawinput294425 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294427 {"Distribution" (portkey.aws/search-for-tag rawinput294425 "Distribution" :flattened? nil :result-wrapper resultWrapper294426), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294427 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar294427 ["Distribution" :content]))) (letvar294427 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294427 ["ETag"])))))))

(clojure.core/defn- response-get-streaming-distribution-config-result ([input] (response-get-streaming-distribution-config-result nil input)) ([resultWrapper294429 input] (clojure.core/let [rawinput294428 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294430 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput294428 "StreamingDistributionConfig" :flattened? nil :result-wrapper resultWrapper294429), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294430 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar294430 ["StreamingDistributionConfig" :content]))) (letvar294430 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294430 ["ETag"])))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin ([input] (response-invalid-headers-for-s-3-origin nil input)) ([resultWrapper294432 input] (clojure.core/let [rawinput294431 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294433 {"Message" (portkey.aws/search-for-tag rawinput294431 "Message" :flattened? nil :result-wrapper resultWrapper294432)}] (clojure.core/cond-> {} (letvar294433 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294433 ["Message" :content])))))))

(clojure.core/defn- response-too-many-distribution-cnam-es ([input] (response-too-many-distribution-cnam-es nil input)) ([resultWrapper294435 input] (clojure.core/let [rawinput294434 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294436 {"Message" (portkey.aws/search-for-tag rawinput294434 "Message" :flattened? nil :result-wrapper resultWrapper294435)}] (clojure.core/cond-> {} (letvar294436 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294436 ["Message" :content])))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter ([input] (response-invalid-geo-restriction-parameter nil input)) ([resultWrapper294438 input] (clojure.core/let [rawinput294437 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294439 {"Message" (portkey.aws/search-for-tag rawinput294437 "Message" :flattened? nil :result-wrapper resultWrapper294438)}] (clojure.core/cond-> {} (letvar294439 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294439 ["Message" :content])))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity ([input] (response-no-such-cloud-front-origin-access-identity nil input)) ([resultWrapper294441 input] (clojure.core/let [rawinput294440 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294442 {"Message" (portkey.aws/search-for-tag rawinput294440 "Message" :flattened? nil :result-wrapper resultWrapper294441)}] (clojure.core/cond-> {} (letvar294442 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294442 ["Message" :content])))))))

(clojure.core/defn- response-list-invalidations-result ([input] (response-list-invalidations-result nil input)) ([resultWrapper294444 input] (clojure.core/let [rawinput294443 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294445 {"InvalidationList" (portkey.aws/search-for-tag rawinput294443 "InvalidationList" :flattened? nil :result-wrapper resultWrapper294444)}] (clojure.core/cond-> {} (letvar294445 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar294445 ["InvalidationList" :content])))))))

(clojure.core/defn- response-batch-too-large ([input] (response-batch-too-large nil input)) ([resultWrapper294447 input] (clojure.core/let [rawinput294446 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294448 {"Message" (portkey.aws/search-for-tag rawinput294446 "Message" :flattened? nil :result-wrapper resultWrapper294447)}] (clojure.core/cond-> {} (letvar294448 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294448 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-with-tags-result ([input] (response-create-distribution-with-tags-result nil input)) ([resultWrapper294450 input] (clojure.core/let [rawinput294449 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294451 {"Distribution" (portkey.aws/search-for-tag rawinput294449 "Distribution" :flattened? nil :result-wrapper resultWrapper294450), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294451 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar294451 ["Distribution" :content]))) (letvar294451 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar294451 ["Location"]))) (letvar294451 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294451 ["ETag"])))))))

(clojure.core/defn- response-list-streaming-distributions-result ([input] (response-list-streaming-distributions-result nil input)) ([resultWrapper294453 input] (clojure.core/let [rawinput294452 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294454 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput294452 "StreamingDistributionList" :flattened? nil :result-wrapper resultWrapper294453)}] (clojure.core/cond-> {} (letvar294454 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar294454 ["StreamingDistributionList" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result ([input] (response-create-streaming-distribution-with-tags-result nil input)) ([resultWrapper294456 input] (clojure.core/let [rawinput294455 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294457 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput294455 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper294456), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294457 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar294457 ["StreamingDistribution" :content]))) (letvar294457 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar294457 ["Location"]))) (letvar294457 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294457 ["ETag"])))))))

(clojure.core/defn- response-create-invalidation-result ([input] (response-create-invalidation-result nil input)) ([resultWrapper294459 input] (clojure.core/let [rawinput294458 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294460 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput294458 "Invalidation" :flattened? nil :result-wrapper resultWrapper294459)}] (clojure.core/cond-> {} (letvar294460 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar294460 ["Location"]))) (letvar294460 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar294460 ["Invalidation" :content])))))))

(clojure.core/defn- response-missing-body ([input] (response-missing-body nil input)) ([resultWrapper294462 input] (clojure.core/let [rawinput294461 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294463 {"Message" (portkey.aws/search-for-tag rawinput294461 "Message" :flattened? nil :result-wrapper resultWrapper294462)}] (clojure.core/cond-> {} (letvar294463 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294463 ["Message" :content])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result ([input] (response-get-cloud-front-origin-access-identity-config-result nil input)) ([resultWrapper294465 input] (clojure.core/let [rawinput294464 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294466 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput294464 "CloudFrontOriginAccessIdentityConfig" :flattened? nil :result-wrapper resultWrapper294465), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294466 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar294466 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar294466 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294466 ["ETag"])))))))

(clojure.core/defn- response-distribution-not-disabled ([input] (response-distribution-not-disabled nil input)) ([resultWrapper294468 input] (clojure.core/let [rawinput294467 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294469 {"Message" (portkey.aws/search-for-tag rawinput294467 "Message" :flattened? nil :result-wrapper resultWrapper294468)}] (clojure.core/cond-> {} (letvar294469 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294469 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists ([input] (response-cloud-front-origin-access-identity-already-exists nil input)) ([resultWrapper294471 input] (clojure.core/let [rawinput294470 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294472 {"Message" (portkey.aws/search-for-tag rawinput294470 "Message" :flattened? nil :result-wrapper resultWrapper294471)}] (clojure.core/cond-> {} (letvar294472 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294472 ["Message" :content])))))))

(clojure.core/defn- response-precondition-failed ([input] (response-precondition-failed nil input)) ([resultWrapper294474 input] (clojure.core/let [rawinput294473 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294475 {"Message" (portkey.aws/search-for-tag rawinput294473 "Message" :flattened? nil :result-wrapper resultWrapper294474)}] (clojure.core/cond-> {} (letvar294475 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294475 ["Message" :content])))))))

(clojure.core/defn- response-distribution-already-exists ([input] (response-distribution-already-exists nil input)) ([resultWrapper294477 input] (clojure.core/let [rawinput294476 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294478 {"Message" (portkey.aws/search-for-tag rawinput294476 "Message" :flattened? nil :result-wrapper resultWrapper294477)}] (clojure.core/cond-> {} (letvar294478 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294478 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-access-identity ([input] (response-invalid-origin-access-identity nil input)) ([resultWrapper294480 input] (clojure.core/let [rawinput294479 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294481 {"Message" (portkey.aws/search-for-tag rawinput294479 "Message" :flattened? nil :result-wrapper resultWrapper294480)}] (clojure.core/cond-> {} (letvar294481 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294481 ["Message" :content])))))))

(clojure.core/defn- response-too-many-trusted-signers ([input] (response-too-many-trusted-signers nil input)) ([resultWrapper294483 input] (clojure.core/let [rawinput294482 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294484 {"Message" (portkey.aws/search-for-tag rawinput294482 "Message" :flattened? nil :result-wrapper resultWrapper294483)}] (clojure.core/cond-> {} (letvar294484 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294484 ["Message" :content])))))))

(clojure.core/defn- response-invalid-minimum-protocol-version ([input] (response-invalid-minimum-protocol-version nil input)) ([resultWrapper294486 input] (clojure.core/let [rawinput294485 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294487 {"Message" (portkey.aws/search-for-tag rawinput294485 "Message" :flattened? nil :result-wrapper resultWrapper294486)}] (clojure.core/cond-> {} (letvar294487 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294487 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-already-exists ([input] (response-streaming-distribution-already-exists nil input)) ([resultWrapper294489 input] (clojure.core/let [rawinput294488 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294490 {"Message" (portkey.aws/search-for-tag rawinput294488 "Message" :flattened? nil :result-wrapper resultWrapper294489)}] (clojure.core/cond-> {} (letvar294490 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294490 ["Message" :content])))))))

(clojure.core/defn- response-invalid-if-match-version ([input] (response-invalid-if-match-version nil input)) ([resultWrapper294492 input] (clojure.core/let [rawinput294491 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294493 {"Message" (portkey.aws/search-for-tag rawinput294491 "Message" :flattened? nil :result-wrapper resultWrapper294492)}] (clojure.core/cond-> {} (letvar294493 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294493 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-result ([input] (response-create-distribution-result nil input)) ([resultWrapper294495 input] (clojure.core/let [rawinput294494 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294496 {"Distribution" (portkey.aws/search-for-tag rawinput294494 "Distribution" :flattened? nil :result-wrapper resultWrapper294495), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294496 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar294496 ["Distribution" :content]))) (letvar294496 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar294496 ["Location"]))) (letvar294496 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294496 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions ([input] (response-too-many-distributions nil input)) ([resultWrapper294498 input] (clojure.core/let [rawinput294497 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294499 {"Message" (portkey.aws/search-for-tag rawinput294497 "Message" :flattened? nil :result-wrapper resultWrapper294498)}] (clojure.core/cond-> {} (letvar294499 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294499 ["Message" :content])))))))

(clojure.core/defn- response-no-such-distribution ([input] (response-no-such-distribution nil input)) ([resultWrapper294501 input] (clojure.core/let [rawinput294500 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294502 {"Message" (portkey.aws/search-for-tag rawinput294500 "Message" :flattened? nil :result-wrapper resultWrapper294501)}] (clojure.core/cond-> {} (letvar294502 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294502 ["Message" :content])))))))

(clojure.core/defn- response-update-streaming-distribution-result ([input] (response-update-streaming-distribution-result nil input)) ([resultWrapper294504 input] (clojure.core/let [rawinput294503 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294505 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput294503 "StreamingDistribution" :flattened? nil :result-wrapper resultWrapper294504), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar294505 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar294505 ["StreamingDistribution" :content]))) (letvar294505 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar294505 ["ETag"])))))))

(clojure.core/defn- response-illegal-update ([input] (response-illegal-update nil input)) ([resultWrapper294507 input] (clojure.core/let [rawinput294506 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294508 {"Message" (portkey.aws/search-for-tag rawinput294506 "Message" :flattened? nil :result-wrapper resultWrapper294507)}] (clojure.core/cond-> {} (letvar294508 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294508 ["Message" :content])))))))

(clojure.core/defn- response-inconsistent-quantities ([input] (response-inconsistent-quantities nil input)) ([resultWrapper294510 input] (clojure.core/let [rawinput294509 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294511 {"Message" (portkey.aws/search-for-tag rawinput294509 "Message" :flattened? nil :result-wrapper resultWrapper294510)}] (clojure.core/cond-> {} (letvar294511 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294511 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result ([input] (response-list-distributions-by-web-acl-id-result nil input)) ([resultWrapper294513 input] (clojure.core/let [rawinput294512 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294514 {"DistributionList" (portkey.aws/search-for-tag rawinput294512 "DistributionList" :flattened? nil :result-wrapper resultWrapper294513)}] (clojure.core/cond-> {} (letvar294514 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar294514 ["DistributionList" :content])))))))

(clojure.core/defn- response-too-many-query-string-parameters ([input] (response-too-many-query-string-parameters nil input)) ([resultWrapper294516 input] (clojure.core/let [rawinput294515 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294517 {"Message" (portkey.aws/search-for-tag rawinput294515 "Message" :flattened? nil :result-wrapper resultWrapper294516)}] (clojure.core/cond-> {} (letvar294517 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294517 ["Message" :content])))))))

(clojure.core/defn- response-invalid-tagging ([input] (response-invalid-tagging nil input)) ([resultWrapper294519 input] (clojure.core/let [rawinput294518 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294520 {"Message" (portkey.aws/search-for-tag rawinput294518 "Message" :flattened? nil :result-wrapper resultWrapper294519)}] (clojure.core/cond-> {} (letvar294520 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294520 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-result ([input] (response-list-distributions-result nil input)) ([resultWrapper294522 input] (clojure.core/let [rawinput294521 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294523 {"DistributionList" (portkey.aws/search-for-tag rawinput294521 "DistributionList" :flattened? nil :result-wrapper resultWrapper294522)}] (clojure.core/cond-> {} (letvar294523 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar294523 ["DistributionList" :content])))))))

(clojure.core/defn- response-trusted-signer-does-not-exist ([input] (response-trusted-signer-does-not-exist nil input)) ([resultWrapper294525 input] (clojure.core/let [rawinput294524 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294526 {"Message" (portkey.aws/search-for-tag rawinput294524 "Message" :flattened? nil :result-wrapper resultWrapper294525)}] (clojure.core/cond-> {} (letvar294526 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294526 ["Message" :content])))))))

(clojure.core/defn- response-get-invalidation-result ([input] (response-get-invalidation-result nil input)) ([resultWrapper294528 input] (clojure.core/let [rawinput294527 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294529 {"Invalidation" (portkey.aws/search-for-tag rawinput294527 "Invalidation" :flattened? nil :result-wrapper resultWrapper294528)}] (clojure.core/cond-> {} (letvar294529 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar294529 ["Invalidation" :content])))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values ([input] (response-too-many-headers-in-forwarded-values nil input)) ([resultWrapper294531 input] (clojure.core/let [rawinput294530 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar294532 {"Message" (portkey.aws/search-for-tag rawinput294530 "Message" :flattened? nil :result-wrapper resultWrapper294531)}] (clojure.core/cond-> {} (letvar294532 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar294532 ["Message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2016-11-25.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-distributions-with-lambda-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-distributions-with-lambda-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-distributions-with-lambda-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.logging-config/enabled :portkey.aws.cloudfront.-2016-11-25.logging-config/include-cookies :portkey.aws.cloudfront.-2016-11-25.logging-config/bucket :portkey.aws.cloudfront.-2016-11-25.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config :portkey.aws.cloudfront.-2016-11-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.invalidation-summary/id :portkey.aws.cloudfront.-2016-11-25.invalidation-summary/create-time :portkey.aws.cloudfront.-2016-11-25.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.invalidation/id :portkey.aws.cloudfront.-2016-11-25.invalidation/status :portkey.aws.cloudfront.-2016-11-25.invalidation/create-time :portkey.aws.cloudfront.-2016-11-25/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.distribution/id :portkey.aws.cloudfront.-2016-11-25.distribution/arn :portkey.aws.cloudfront.-2016-11-25.distribution/status :portkey.aws.cloudfront.-2016-11-25.distribution/last-modified-time :portkey.aws.cloudfront.-2016-11-25.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2016-11-25.distribution/domain-name :portkey.aws.cloudfront.-2016-11-25/active-trusted-signers :portkey.aws.cloudfront.-2016-11-25/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.lambda-function-association/lambda-function-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/lambda-function-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.lambda-function-association/lambda-function-arn :portkey.aws.cloudfront.-2016-11-25/event-type]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.forwarded-values/query-string :portkey.aws.cloudfront.-2016-11-25.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2016-11-25/headers :portkey.aws.cloudfront.-2016-11-25/query-string-cache-keys]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/paths :portkey.aws.cloudfront.-2016-11-25.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/query-string-cache-keys-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/marker :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution/id :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/arn :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/status :portkey.aws.cloudfront.-2016-11-25.streaming-distribution/domain-name :portkey.aws.cloudfront.-2016-11-25/active-trusted-signers :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.lambda-function-associations/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.lambda-function-associations/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/lambda-function-association-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/lambda-function-associations (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.lambda-function-associations/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.lambda-function-associations/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-lambda-function-association/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-lambda-function-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-lambda-function-association/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2016-11-25.custom-error-response/response-page-path :portkey.aws.cloudfront.-2016-11-25.custom-error-response/response-code :portkey.aws.cloudfront.-2016-11-25.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.signer/aws-account-number :portkey.aws.cloudfront.-2016-11-25/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cached-methods/quantity :portkey.aws.cloudfront.-2016-11-25.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-lambda-function-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-lambda-function-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-lambda-function-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cache-behavior/path-pattern :portkey.aws.cloudfront.-2016-11-25.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-11-25/forwarded-values :portkey.aws.cloudfront.-2016-11-25/trusted-signers :portkey.aws.cloudfront.-2016-11-25/viewer-protocol-policy :portkey.aws.cloudfront.-2016-11-25.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-11-25.cache-behavior/compress :portkey.aws.cloudfront.-2016-11-25/lambda-function-associations :portkey.aws.cloudfront.-2016-11-25.cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-11-25/allowed-methods :portkey.aws.cloudfront.-2016-11-25.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2016-11-25.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/enabled :portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.origin/id :portkey.aws.cloudfront.-2016-11-25.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2016-11-25.origin/origin-path :portkey.aws.cloudfront.-2016-11-25/custom-headers :portkey.aws.cloudfront.-2016-11-25/s-3-origin-config :portkey.aws.cloudfront.-2016-11-25/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.invalidation-list/marker :portkey.aws.cloudfront.-2016-11-25.invalidation-list/max-items :portkey.aws.cloudfront.-2016-11-25.invalidation-list/is-truncated :portkey.aws.cloudfront.-2016-11-25.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalidation-list/next-marker :portkey.aws.cloudfront.-2016-11-25.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2016-11-25.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/event-type #{:viewerresponse :originresponse :viewerrequest "viewer-response" :originrequest "origin-response" "origin-request" "viewer-request"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution :portkey.aws.cloudfront.-2016-11-25.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.allowed-methods/quantity :portkey.aws.cloudfront.-2016-11-25.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.custom-origin-config/http-port :portkey.aws.cloudfront.-2016-11-25.custom-origin-config/https-port :portkey.aws.cloudfront.-2016-11-25/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2016-11-25/origin-ssl-protocols]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.list-distributions-request/marker :portkey.aws.cloudfront.-2016-11-25.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.s-3-origin/domain-name :portkey.aws.cloudfront.-2016-11-25.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2016-11-25.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2016-11-25.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/id :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/arn :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/status :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2016-11-25/s-3-origin :portkey.aws.cloudfront.-2016-11-25/aliases :portkey.aws.cloudfront.-2016-11-25/trusted-signers :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2016-11-25/price-class :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-11-25/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.tag-resource-request/resource :portkey.aws.cloudfront.-2016-11-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.query-string-cache-keys/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.query-string-cache-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/query-string-cache-keys-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/query-string-cache-keys (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.query-string-cache-keys/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.query-string-cache-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.distribution-config/caller-reference :portkey.aws.cloudfront.-2016-11-25/origins :portkey.aws.cloudfront.-2016-11-25/default-cache-behavior :portkey.aws.cloudfront.-2016-11-25.distribution-config/comment :portkey.aws.cloudfront.-2016-11-25.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-11-25.distribution-config/default-root-object :portkey.aws.cloudfront.-2016-11-25.distribution-config/is-ipv-6-enabled :portkey.aws.cloudfront.-2016-11-25/restrictions :portkey.aws.cloudfront.-2016-11-25.distribution-config/web-acl-id :portkey.aws.cloudfront.-2016-11-25.distribution-config/logging :portkey.aws.cloudfront.-2016-11-25/cache-behaviors :portkey.aws.cloudfront.-2016-11-25/custom-error-responses :portkey.aws.cloudfront.-2016-11-25/aliases :portkey.aws.cloudfront.-2016-11-25/price-class :portkey.aws.cloudfront.-2016-11-25/http-version :portkey.aws.cloudfront.-2016-11-25/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution-config :portkey.aws.cloudfront.-2016-11-25.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 0 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution :portkey.aws.cloudfront.-2016-11-25.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config :portkey.aws.cloudfront.-2016-11-25.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution :portkey.aws.cloudfront.-2016-11-25.create-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-11-25.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config :portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.-2016-11-25.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.create-invalidation-result/location :portkey.aws.cloudfront.-2016-11-25/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2016-11-25.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.origin-custom-header/header-name :portkey.aws.cloudfront.-2016-11-25.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2016-11-25/s-3-origin :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/comment :portkey.aws.cloudfront.-2016-11-25/trusted-signers :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2016-11-25/aliases :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-config/logging :portkey.aws.cloudfront.-2016-11-25/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.tag/key] :opt-un [:portkey.aws.cloudfront.-2016-11-25.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/enabled :portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/bucket :portkey.aws.cloudfront.-2016-11-25.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.distribution-summary/id :portkey.aws.cloudfront.-2016-11-25.distribution-summary/arn :portkey.aws.cloudfront.-2016-11-25.distribution-summary/status :portkey.aws.cloudfront.-2016-11-25.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2016-11-25.distribution-summary/domain-name :portkey.aws.cloudfront.-2016-11-25/aliases :portkey.aws.cloudfront.-2016-11-25/origins :portkey.aws.cloudfront.-2016-11-25/default-cache-behavior :portkey.aws.cloudfront.-2016-11-25/cache-behaviors :portkey.aws.cloudfront.-2016-11-25/custom-error-responses :portkey.aws.cloudfront.-2016-11-25.distribution-summary/comment :portkey.aws.cloudfront.-2016-11-25/price-class :portkey.aws.cloudfront.-2016-11-25.distribution-summary/enabled :portkey.aws.cloudfront.-2016-11-25/viewer-certificate :portkey.aws.cloudfront.-2016-11-25/restrictions :portkey.aws.cloudfront.-2016-11-25.distribution-summary/web-acl-id :portkey.aws.cloudfront.-2016-11-25/http-version :portkey.aws.cloudfront.-2016-11-25.distribution-summary/is-ipv-6-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/lambda-function-association-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/lambda-function-association))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/minimum-protocol-version #{"TLSv1" :tl-sv-1 :ss-lv-3 "SSLv3"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.origins/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.origins/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/distribution-config :portkey.aws.cloudfront.-2016-11-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution :portkey.aws.cloudfront.-2016-11-25.create-distribution-result/location :portkey.aws.cloudfront.-2016-11-25.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2016-11-25.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.distribution-list/marker :portkey.aws.cloudfront.-2016-11-25.distribution-list/max-items :portkey.aws.cloudfront.-2016-11-25.distribution-list/is-truncated :portkey.aws.cloudfront.-2016-11-25.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.distribution-list/next-marker :portkey.aws.cloudfront.-2016-11-25.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/streaming-distribution :portkey.aws.cloudfront.-2016-11-25.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/http-version #{:http-11 "http2" :http-2 "http1.1"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2016-11-25.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/marker :portkey.aws.cloudfront.-2016-11-25.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2016-11-25/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.untag-resource-request/resource :portkey.aws.cloudfront.-2016-11-25/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2016-11-25/forwarded-values :portkey.aws.cloudfront.-2016-11-25/trusted-signers :portkey.aws.cloudfront.-2016-11-25/viewer-protocol-policy :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/compress :portkey.aws.cloudfront.-2016-11-25/lambda-function-associations :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2016-11-25/allowed-methods :portkey.aws.cloudfront.-2016-11-25.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.trusted-signers/enabled :portkey.aws.cloudfront.-2016-11-25.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25/distribution-config :portkey.aws.cloudfront.-2016-11-25.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2016-11-25.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2016-11-25/ssl-support-method :portkey.aws.cloudfront.-2016-11-25/minimum-protocol-version :portkey.aws.cloudfront.-2016-11-25.viewer-certificate/certificate :portkey.aws.cloudfront.-2016-11-25/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2016-11-25.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2016-11-25.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2016-11-25.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2016-11-25/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2016-11-25.geo-restriction/restriction-type :portkey.aws.cloudfront.-2016-11-25.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2016-11-25.geo-restriction/items]))

(clojure.core/defn tag-resource-2016-11-25 ([tag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/tagging?Operation=Tag", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource2016_11_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-11-25/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-11-25/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2016-11-25 ([get-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistribution2016_11_25", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-distribution-result))

(clojure.core/defn create-streaming-distribution-with-tags-2016-11-25 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution?WithTags", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistributionWithTags2016_11_25", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-11-25/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2016-11-25/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2016-11-25 ([update-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDistribution2016_11_25", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2016-11-25/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-11-25/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-11-25/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-11-25/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-11-25/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-11-25/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2016-11-25/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-11-25/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-11-25/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-11-25/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-11-25/invalid-web-acl-id, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-11-25/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-11-25/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-11-25/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-11-25/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-11-25/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-11-25/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-11-25/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-11-25/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2016-11-25/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-11-25/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/update-distribution-result))

(clojure.core/defn delete-streaming-distribution-2016-11-25 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStreamingDistribution2016_11_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2016-11-25 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2016_11_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2016-11-25 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution?WithTags", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistributionWithTags2016_11_25", :http.request.configuration/output-deser-fn response-create-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2016-11-25/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-11-25/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-11-25/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-11-25/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-11-25/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-11-25/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-11-25/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2016-11-25/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-11-25/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-11-25/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-11-25/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-11-25/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-11-25/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-11-25/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-11-25/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-11-25/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-11-25/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-11-25/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-11-25/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-11-25/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-11-25/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-11-25/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront.-2016-11-25/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-11-25/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-distribution-with-tags-result))

(clojure.core/defn get-invalidation-2016-11-25 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvalidation2016_11_25", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2016-11-25/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-invalidation-result))

(clojure.core/defn create-streaming-distribution-2016-11-25 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistribution2016_11_25", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2016-11-25/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-streaming-distribution-result))

(clojure.core/defn list-tags-for-resource-2016-11-25 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/tagging", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource2016_11_25", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-11-25/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-11-25/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2016-11-25 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistribution2016_11_25", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-result))

(clojure.core/defn create-distribution-2016-11-25 ([create-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistribution2016_11_25", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2016-11-25/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2016-11-25/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2016-11-25/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2016-11-25/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2016-11-25/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2016-11-25/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2016-11-25/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2016-11-25/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2016-11-25/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2016-11-25/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2016-11-25/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2016-11-25/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-11-25/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2016-11-25/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2016-11-25/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2016-11-25/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2016-11-25/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2016-11-25/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2016-11-25/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2016-11-25/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2016-11-25/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2016-11-25/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2016-11-25/too-many-distributions, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2016-11-25/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2016-11-25/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-distribution-result))

(clojure.core/defn get-streaming-distribution-config-2016-11-25 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistributionConfig2016_11_25", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-streaming-distribution-config-result))

(clojure.core/defn list-distributions-2016-11-25 ([] (list-distributions-2016-11-25 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributions2016_11_25", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2016-11-25 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-11-25/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-distributions-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2016-11-25 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2016_11_25", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn list-invalidations-2016-11-25 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInvalidations2016_11_25", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-invalidations-result))

(clojure.core/defn untag-resource-2016-11-25 ([untag-resource-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/tagging?Operation=Untag", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource2016_11_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2016-11-25/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2016-11-25/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2016-11-25 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2016_11_25", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2016-11-25 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2016_11_25", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2016-11-25/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2016-11-25 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateStreamingDistribution2016_11_25", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2016-11-25/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2016-11-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2016-11-25/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2016-11-25/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2016-11-25/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2016-11-25 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{Id}/config", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistributionConfig2016_11_25", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/get-distribution-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2016-11-25 ([] (list-cloud-front-origin-access-identities-2016-11-25 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2016_11_25", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2016-11-25 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2016-11-25 ([] (list-streaming-distributions-2016-11-25 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/streaming-distribution", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamingDistributions2016_11_25", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2016-11-25 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-streaming-distributions-result))

(clojure.core/defn delete-distribution-2016-11-25 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{Id}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDistribution2016_11_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2016-11-25/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2016-11-25/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2016-11-25/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2016-11-25 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInvalidation2016_11_25", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2016-11-25/access-denied, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2016-11-25/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2016-11-25/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2016-11-25/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-invalidation-result))

(clojure.core/defn list-distributions-by-web-acl-id-2016-11-25 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributionsByWebACLId2016_11_25", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2016-11-25/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2016-11-25 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2016-11-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2016-11-25/origin-access-identity/cloudfront", :http.request.configuration/version "2016-11-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2016_11_25", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2016-11-25/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2016-11-25/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2016-11-25/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2016-11-25/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2016-11-25/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2016-11-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2016-11-25/create-cloud-front-origin-access-identity-result))
