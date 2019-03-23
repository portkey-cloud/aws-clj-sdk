(ns portkey.aws.cloudfront.-2017-03-25 (:require [portkey.aws]))

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

(clojure.core/defn- ser-custom-origin-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (serinteger (:http-port input)) #:http.request.field{:name "HTTPPort", :shape "integer"}) (clojure.core/into (serinteger (:https-port input)) #:http.request.field{:name "HTTPSPort", :shape "integer"}) (clojure.core/into (ser-origin-protocol-policy (:origin-protocol-policy input)) #:http.request.field{:name "OriginProtocolPolicy", :shape "OriginProtocolPolicy"})], :shape "CustomOriginConfig", :type "structure"} (clojure.core/contains? input :origin-ssl-protocols) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-origin-ssl-protocols (input :origin-ssl-protocols)) #:http.request.field{:name "OriginSslProtocols", :shape "OriginSslProtocols"})) (clojure.core/contains? input :origin-read-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serinteger (input :origin-read-timeout)) #:http.request.field{:name "OriginReadTimeout", :shape "integer"})) (clojure.core/contains? input :origin-keepalive-timeout) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serinteger (input :origin-keepalive-timeout)) #:http.request.field{:name "OriginKeepaliveTimeout", :shape "integer"}))))

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

(clojure.core/defn- ser-minimum-protocol-version [input] #:http.request.field{:value (clojure.core/get {"TLSv1" "TLSv1", :tl-sv-1 "TLSv1", "TLSv1_2016" "TLSv1_2016", :tl-sv-12-2018 "TLSv1.2_2018", :ss-lv-3 "SSLv3", "TLSv1.2_2018" "TLSv1.2_2018", "SSLv3" "SSLv3", :tl-sv-11-2016 "TLSv1.1_2016", :tl-sv-1-2016 "TLSv1_2016", "TLSv1.1_2016" "TLSv1.1_2016"} input), :shape "MinimumProtocolVersion"})

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

(clojure.core/defn- req-create-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config-with-tags (input :distribution-config-with-tags)) #:http.request.field{:name "DistributionConfigWithTags", :shape "DistributionConfigWithTags", :location-name "DistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})]}))

(clojure.core/defn- req-delete-service-linked-role-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :role-name)) #:http.request.field{:name "RoleName", :shape "string", :location "uri", :location-name "RoleName"})]}))

(clojure.core/defn- req-list-streaming-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-get-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-get-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-distributions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-update-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-create-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})], :body [(clojure.core/into (ser-invalidation-batch (input :invalidation-batch)) #:http.request.field{:name "InvalidationBatch", :shape "InvalidationBatch", :location-name "InvalidationBatch", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags", :location-name "Tags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})]}))

(clojure.core/defn- req-create-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})]}))

(clojure.core/defn- req-create-streaming-distribution-with-tags-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config-with-tags (input :streaming-distribution-config-with-tags)) #:http.request.field{:name "StreamingDistributionConfigWithTags", :shape "StreamingDistributionConfigWithTags", :location-name "StreamingDistributionConfigWithTags", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})]}))

(clojure.core/defn- req-get-distribution-config-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-create-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})]}))

(clojure.core/defn- req-create-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-cloud-front-origin-access-identity-config (input :cloud-front-origin-access-identity-config)) #:http.request.field{:name "CloudFrontOriginAccessIdentityConfig", :shape "CloudFrontOriginAccessIdentityConfig", :location-name "CloudFrontOriginAccessIdentityConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})]}))

(clojure.core/defn- req-get-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-update-streaming-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-streaming-distribution-config (input :streaming-distribution-config)) #:http.request.field{:name "StreamingDistributionConfig", :shape "StreamingDistributionConfig", :location-name "StreamingDistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-delete-cloud-front-origin-access-identity-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

(clojure.core/defn- req-get-invalidation-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"}) (clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]}))

(clojure.core/defn- req-list-invalidations-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (serstring (input :distribution-id)) #:http.request.field{:name "DistributionId", :shape "string", :location "uri", :location-name "DistributionId"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :marker)) #:http.request.field{:name "Marker", :shape "string", :location "querystring", :location-name "Marker"})) (clojure.core/contains? input :max-items) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :max-items)) #:http.request.field{:name "MaxItems", :shape "string", :location "querystring", :location-name "MaxItems"}))))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-resource-arn (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceARN", :location "querystring", :location-name "Resource"})], :body [(clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys", :location-name "TagKeys", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})]}))

(clojure.core/defn- req-update-distribution-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-distribution-config (input :distribution-config)) #:http.request.field{:name "DistributionConfig", :shape "DistributionConfig", :location-name "DistributionConfig", :xml-namespace {"uri" "http://cloudfront.amazonaws.com/doc/2017-03-25/"}})], :uri [(clojure.core/into (serstring (input :id)) #:http.request.field{:name "Id", :shape "string", :location "uri", :location-name "Id"})]} (clojure.core/contains? input :if-match) (clojure.core/update-in [:http.request.configuration/header] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serstring (input :if-match)) #:http.request.field{:name "IfMatch", :shape "string", :location "header", :location-name "If-Match"}))))

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

(clojure.core/defn- deserboolean [input] (clojure.core/when-let [boolstr__21570__auto__ (if (clojure.core/seq? input) (clojure.core/first input) input)] (clojure.core/cond (clojure.core/= "true" boolstr__21570__auto__) true (clojure.core/= "false" boolstr__21570__auto__) false)))

(clojure.core/defn- deser-cookie-names [input] (clojure.core/let [letvar104131 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar104131 ["Quantity" :content]))} (letvar104131 "Items") (clojure.core/assoc :items (deser-cookie-name-list (clojure.core/get-in letvar104131 ["Items" :content]))))))

(clojure.core/defn- deser-logging-config [input] (clojure.core/let [letvar104227 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "IncludeCookies" (portkey.aws/search-for-tag input "IncludeCookies" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar104227 ["Enabled" :content])), :include-cookies (deserboolean (clojure.core/get-in letvar104227 ["IncludeCookies" :content])), :bucket (deserstring (clojure.core/get-in letvar104227 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar104227 ["Prefix" :content]))})))

(clojure.core/defn- deser-invalidation-summary [input] (clojure.core/let [letvar104323 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar104323 ["Id" :content])), :create-time (desertimestamp (clojure.core/get-in letvar104323 ["CreateTime" :content])), :status (deserstring (clojure.core/get-in letvar104323 ["Status" :content]))})))

(clojure.core/defn- deser-custom-error-response-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-custom-error-response coll))) input))

(clojure.core/defn- deser-invalidation [input] (clojure.core/let [letvar104436 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "CreateTime" (portkey.aws/search-for-tag input "CreateTime" :flattened? false :xmlAttribute? nil), "InvalidationBatch" (portkey.aws/search-for-tag input "InvalidationBatch" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar104436 ["Id" :content])), :status (deserstring (clojure.core/get-in letvar104436 ["Status" :content])), :create-time (desertimestamp (clojure.core/get-in letvar104436 ["CreateTime" :content])), :invalidation-batch (deser-invalidation-batch (clojure.core/get-in letvar104436 ["InvalidationBatch" :content]))})))

(clojure.core/defn- deser-certificate-source [input] (clojure.core/get {"cloudfront" :cloudfront, "iam" :iam, "acm" :acm} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-location-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-key-pair-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-restrictions [input] (clojure.core/let [letvar104571 {"GeoRestriction" (portkey.aws/search-for-tag input "GeoRestriction" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:geo-restriction (deser-geo-restriction (clojure.core/get-in letvar104571 ["GeoRestriction" :content]))})))

(clojure.core/defn- deserstring [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-distribution [input] (clojure.core/let [letvar104672 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "InProgressInvalidationBatches" (portkey.aws/search-for-tag input "InProgressInvalidationBatches" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "DistributionConfig" (portkey.aws/search-for-tag input "DistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar104672 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar104672 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar104672 ["Status" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar104672 ["LastModifiedTime" :content])), :in-progress-invalidation-batches (deserinteger (clojure.core/get-in letvar104672 ["InProgressInvalidationBatches" :content])), :domain-name (deserstring (clojure.core/get-in letvar104672 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar104672 ["ActiveTrustedSigners" :content])), :distribution-config (deser-distribution-config (clojure.core/get-in letvar104672 ["DistributionConfig" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-list [input] (clojure.core/let [letvar104768 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar104768 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar104768 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar104768 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar104768 ["Quantity" :content]))} (letvar104768 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar104768 ["NextMarker" :content]))) (letvar104768 "Items") (clojure.core/assoc :items (deser-cloud-front-origin-access-identity-summary-list (clojure.core/get-in letvar104768 ["Items" :content]))))))

(clojure.core/defn- deser-lambda-function-association [input] (clojure.core/let [letvar104864 {"LambdaFunctionARN" (portkey.aws/search-for-tag input "LambdaFunctionARN" :flattened? false :xmlAttribute? nil), "EventType" (portkey.aws/search-for-tag input "EventType" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar104864 "LambdaFunctionARN") (clojure.core/assoc :lambda-function-arn (deserstring (clojure.core/get-in letvar104864 ["LambdaFunctionARN" :content]))) (letvar104864 "EventType") (clojure.core/assoc :event-type (deser-event-type (clojure.core/get-in letvar104864 ["EventType" :content]))))))

(clojure.core/defn- deser-forwarded-values [input] (clojure.core/let [letvar104960 {"QueryString" (portkey.aws/search-for-tag input "QueryString" :flattened? false :xmlAttribute? nil), "Cookies" (portkey.aws/search-for-tag input "Cookies" :flattened? false :xmlAttribute? nil), "Headers" (portkey.aws/search-for-tag input "Headers" :flattened? false :xmlAttribute? nil), "QueryStringCacheKeys" (portkey.aws/search-for-tag input "QueryStringCacheKeys" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:query-string (deserboolean (clojure.core/get-in letvar104960 ["QueryString" :content])), :cookies (deser-cookie-preference (clojure.core/get-in letvar104960 ["Cookies" :content]))} (letvar104960 "Headers") (clojure.core/assoc :headers (deser-headers (clojure.core/get-in letvar104960 ["Headers" :content]))) (letvar104960 "QueryStringCacheKeys") (clojure.core/assoc :query-string-cache-keys (deser-query-string-cache-keys (clojure.core/get-in letvar104960 ["QueryStringCacheKeys" :content]))))))

(clojure.core/defn- deser-invalidation-batch [input] (clojure.core/let [letvar105056 {"Paths" (portkey.aws/search-for-tag input "Paths" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:paths (deser-paths (clojure.core/get-in letvar105056 ["Paths" :content])), :caller-reference (deserstring (clojure.core/get-in letvar105056 ["CallerReference" :content]))})))

(clojure.core/defn- deser-invalidation-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-invalidation-summary coll))) input))

(clojure.core/defn- deser-query-string-cache-keys-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-streaming-distribution-list [input] (clojure.core/let [letvar105186 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar105186 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar105186 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar105186 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar105186 ["Quantity" :content]))} (letvar105186 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar105186 ["NextMarker" :content]))) (letvar105186 "Items") (clojure.core/assoc :items (deser-streaming-distribution-summary-list (clojure.core/get-in letvar105186 ["Items" :content]))))))

(clojure.core/defn- deser-item-selection [input] (clojure.core/get {"none" :none, "whitelist" :whitelist, "all" :all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-streaming-distribution [input] (clojure.core/let [letvar105287 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "ActiveTrustedSigners" (portkey.aws/search-for-tag input "ActiveTrustedSigners" :flattened? false :xmlAttribute? nil), "StreamingDistributionConfig" (portkey.aws/search-for-tag input "StreamingDistributionConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar105287 ["Id" :content])), :arn (deserstring (clojure.core/get-in letvar105287 ["ARN" :content])), :status (deserstring (clojure.core/get-in letvar105287 ["Status" :content])), :domain-name (deserstring (clojure.core/get-in letvar105287 ["DomainName" :content])), :active-trusted-signers (deser-active-trusted-signers (clojure.core/get-in letvar105287 ["ActiveTrustedSigners" :content])), :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar105287 ["StreamingDistributionConfig" :content]))} (letvar105287 "LastModifiedTime") (clojure.core/assoc :last-modified-time (desertimestamp (clojure.core/get-in letvar105287 ["LastModifiedTime" :content]))))))

(clojure.core/defn- deser-lambda-function-associations [input] (clojure.core/let [letvar105383 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar105383 ["Quantity" :content]))} (letvar105383 "Items") (clojure.core/assoc :items (deser-lambda-function-association-list (clojure.core/get-in letvar105383 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-protocol-policy [input] (clojure.core/get {"allow-all" :allowall, "https-only" :httpsonly, "redirect-to-https" :redirecttohttps} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-error-response [input] (clojure.core/let [letvar105484 {"ErrorCode" (portkey.aws/search-for-tag input "ErrorCode" :flattened? false :xmlAttribute? nil), "ResponsePagePath" (portkey.aws/search-for-tag input "ResponsePagePath" :flattened? false :xmlAttribute? nil), "ResponseCode" (portkey.aws/search-for-tag input "ResponseCode" :flattened? false :xmlAttribute? nil), "ErrorCachingMinTTL" (portkey.aws/search-for-tag input "ErrorCachingMinTTL" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:error-code (deserinteger (clojure.core/get-in letvar105484 ["ErrorCode" :content]))} (letvar105484 "ResponsePagePath") (clojure.core/assoc :response-page-path (deserstring (clojure.core/get-in letvar105484 ["ResponsePagePath" :content]))) (letvar105484 "ResponseCode") (clojure.core/assoc :response-code (deserstring (clojure.core/get-in letvar105484 ["ResponseCode" :content]))) (letvar105484 "ErrorCachingMinTTL") (clojure.core/assoc :error-caching-min-ttl (deserlong (clojure.core/get-in letvar105484 ["ErrorCachingMinTTL" :content]))))))

(clojure.core/defn- deser-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-distribution-summary coll))) input))

(clojure.core/defn- deser-signer [input] (clojure.core/let [letvar105597 {"AwsAccountNumber" (portkey.aws/search-for-tag input "AwsAccountNumber" :flattened? false :xmlAttribute? nil), "KeyPairIds" (portkey.aws/search-for-tag input "KeyPairIds" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar105597 "AwsAccountNumber") (clojure.core/assoc :aws-account-number (deserstring (clojure.core/get-in letvar105597 ["AwsAccountNumber" :content]))) (letvar105597 "KeyPairIds") (clojure.core/assoc :key-pair-ids (deser-key-pair-ids (clojure.core/get-in letvar105597 ["KeyPairIds" :content]))))))

(clojure.core/defn- deserlong [input] (java.lang.Long. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origin-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-origin coll))) input))

(clojure.core/defn- deser-cached-methods [input] (clojure.core/let [letvar105712 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar105712 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar105712 ["Items" :content]))})))

(clojure.core/defn- deser-tag-key [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-tags [input] (clojure.core/let [letvar105813 {"Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar105813 "Items") (clojure.core/assoc :items (deser-tag-list (clojure.core/get-in letvar105813 ["Items" :content]))))))

(clojure.core/defn- deser-streaming-distribution-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-streaming-distribution-summary coll))) input))

(clojure.core/defn- deser-cache-behaviors [input] (clojure.core/let [letvar105926 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar105926 ["Quantity" :content]))} (letvar105926 "Items") (clojure.core/assoc :items (deser-cache-behavior-list (clojure.core/get-in letvar105926 ["Items" :content]))))))

(clojure.core/defn- deser-cache-behavior [input] (clojure.core/let [letvar106022 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "PathPattern" (portkey.aws/search-for-tag input "PathPattern" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:path-pattern (deserstring (clojure.core/get-in letvar106022 ["PathPattern" :content])), :target-origin-id (deserstring (clojure.core/get-in letvar106022 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar106022 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar106022 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar106022 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar106022 ["MinTTL" :content]))} (letvar106022 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar106022 ["SmoothStreaming" :content]))) (letvar106022 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar106022 ["Compress" :content]))) (letvar106022 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar106022 ["LambdaFunctionAssociations" :content]))) (letvar106022 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar106022 ["MaxTTL" :content]))) (letvar106022 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar106022 ["AllowedMethods" :content]))) (letvar106022 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar106022 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-active-trusted-signers [input] (clojure.core/let [letvar106118 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar106118 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar106118 ["Quantity" :content]))} (letvar106118 "Items") (clojure.core/assoc :items (deser-signer-list (clojure.core/get-in letvar106118 ["Items" :content]))))))

(clojure.core/defn- deser-origin [input] (clojure.core/let [letvar106214 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginPath" (portkey.aws/search-for-tag input "OriginPath" :flattened? false :xmlAttribute? nil), "CustomHeaders" (portkey.aws/search-for-tag input "CustomHeaders" :flattened? false :xmlAttribute? nil), "S3OriginConfig" (portkey.aws/search-for-tag input "S3OriginConfig" :flattened? false :xmlAttribute? nil), "CustomOriginConfig" (portkey.aws/search-for-tag input "CustomOriginConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar106214 ["Id" :content])), :domain-name (deserstring (clojure.core/get-in letvar106214 ["DomainName" :content]))} (letvar106214 "OriginPath") (clojure.core/assoc :origin-path (deserstring (clojure.core/get-in letvar106214 ["OriginPath" :content]))) (letvar106214 "CustomHeaders") (clojure.core/assoc :custom-headers (deser-custom-headers (clojure.core/get-in letvar106214 ["CustomHeaders" :content]))) (letvar106214 "S3OriginConfig") (clojure.core/assoc :s-3-origin-config (deser-s-3-origin-config (clojure.core/get-in letvar106214 ["S3OriginConfig" :content]))) (letvar106214 "CustomOriginConfig") (clojure.core/assoc :custom-origin-config (deser-custom-origin-config (clojure.core/get-in letvar106214 ["CustomOriginConfig" :content]))))))

(clojure.core/defn- desertimestamp [input] (if (clojure.core/seq? input) (clojure.core/first input) input))

(clojure.core/defn- deser-custom-error-responses [input] (clojure.core/let [letvar106312 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar106312 ["Quantity" :content]))} (letvar106312 "Items") (clojure.core/assoc :items (deser-custom-error-response-list (clojure.core/get-in letvar106312 ["Items" :content]))))))

(clojure.core/defn- deser-invalidation-list [input] (clojure.core/let [letvar106408 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar106408 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar106408 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar106408 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar106408 ["Quantity" :content]))} (letvar106408 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar106408 ["NextMarker" :content]))) (letvar106408 "Items") (clojure.core/assoc :items (deser-invalidation-summary-list (clojure.core/get-in letvar106408 ["Items" :content]))))))

(clojure.core/defn- deser-origin-ssl-protocols [input] (clojure.core/let [letvar106504 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar106504 ["Quantity" :content])), :items (deser-ssl-protocols-list (clojure.core/get-in letvar106504 ["Items" :content]))})))

(clojure.core/defn- deser-aliases [input] (clojure.core/let [letvar106600 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar106600 ["Quantity" :content]))} (letvar106600 "Items") (clojure.core/assoc :items (deser-alias-list (clojure.core/get-in letvar106600 ["Items" :content]))))))

(clojure.core/defn- deser-event-type [input] (clojure.core/get {"viewer-request" :viewerrequest, "viewer-response" :viewerresponse, "origin-request" :originrequest, "origin-response" :originresponse} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-allowed-methods [input] (clojure.core/let [letvar106701 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil), "CachedMethods" (portkey.aws/search-for-tag input "CachedMethods" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar106701 ["Quantity" :content])), :items (deser-methods-list (clojure.core/get-in letvar106701 ["Items" :content]))} (letvar106701 "CachedMethods") (clojure.core/assoc :cached-methods (deser-cached-methods (clojure.core/get-in letvar106701 ["CachedMethods" :content]))))))

(clojure.core/defn- deser-price-class [input] (clojure.core/get {"PriceClass_100" :price-class-100, "PriceClass_200" :price-class-200, "PriceClass_All" :price-class-all} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-custom-origin-config [input] (clojure.core/let [letvar106802 {"HTTPPort" (portkey.aws/search-for-tag input "HTTPPort" :flattened? false :xmlAttribute? nil), "HTTPSPort" (portkey.aws/search-for-tag input "HTTPSPort" :flattened? false :xmlAttribute? nil), "OriginProtocolPolicy" (portkey.aws/search-for-tag input "OriginProtocolPolicy" :flattened? false :xmlAttribute? nil), "OriginSslProtocols" (portkey.aws/search-for-tag input "OriginSslProtocols" :flattened? false :xmlAttribute? nil), "OriginReadTimeout" (portkey.aws/search-for-tag input "OriginReadTimeout" :flattened? false :xmlAttribute? nil), "OriginKeepaliveTimeout" (portkey.aws/search-for-tag input "OriginKeepaliveTimeout" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:http-port (deserinteger (clojure.core/get-in letvar106802 ["HTTPPort" :content])), :https-port (deserinteger (clojure.core/get-in letvar106802 ["HTTPSPort" :content])), :origin-protocol-policy (deser-origin-protocol-policy (clojure.core/get-in letvar106802 ["OriginProtocolPolicy" :content]))} (letvar106802 "OriginSslProtocols") (clojure.core/assoc :origin-ssl-protocols (deser-origin-ssl-protocols (clojure.core/get-in letvar106802 ["OriginSslProtocols" :content]))) (letvar106802 "OriginReadTimeout") (clojure.core/assoc :origin-read-timeout (deserinteger (clojure.core/get-in letvar106802 ["OriginReadTimeout" :content]))) (letvar106802 "OriginKeepaliveTimeout") (clojure.core/assoc :origin-keepalive-timeout (deserinteger (clojure.core/get-in letvar106802 ["OriginKeepaliveTimeout" :content]))))))

(clojure.core/defn- deser-s-3-origin [input] (clojure.core/let [letvar106898 {"DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar106898 ["DomainName" :content])), :origin-access-identity (deserstring (clojure.core/get-in letvar106898 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-streaming-distribution-summary [input] (clojure.core/let [letvar106994 {"Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:domain-name (deserstring (clojure.core/get-in letvar106994 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar106994 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar106994 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar106994 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar106994 ["TrustedSigners" :content])), :aliases (deser-aliases (clojure.core/get-in letvar106994 ["Aliases" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar106994 ["S3Origin" :content])), :enabled (deserboolean (clojure.core/get-in letvar106994 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar106994 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar106994 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar106994 ["PriceClass" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity [input] (clojure.core/let [letvar107090 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag input "CloudFrontOriginAccessIdentityConfig" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar107090 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar107090 ["S3CanonicalUserId" :content]))} (letvar107090 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar107090 ["CloudFrontOriginAccessIdentityConfig" :content]))))))

(clojure.core/defn- deser-cookie-name-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-query-string-cache-keys [input] (clojure.core/let [letvar107220 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar107220 ["Quantity" :content]))} (letvar107220 "Items") (clojure.core/assoc :items (deser-query-string-cache-keys-list (clojure.core/get-in letvar107220 ["Items" :content]))))))

(clojure.core/defn- deser-key-pair-ids [input] (clojure.core/let [letvar107316 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar107316 ["Quantity" :content]))} (letvar107316 "Items") (clojure.core/assoc :items (deser-key-pair-id-list (clojure.core/get-in letvar107316 ["Items" :content]))))))

(clojure.core/defn- deser-distribution-config [input] (clojure.core/let [letvar107412 {"DefaultRootObject" (portkey.aws/search-for-tag input "DefaultRootObject" :flattened? false :xmlAttribute? nil), "CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar107412 ["CallerReference" :content])), :origins (deser-origins (clojure.core/get-in letvar107412 ["Origins" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar107412 ["DefaultCacheBehavior" :content])), :comment (deserstring (clojure.core/get-in letvar107412 ["Comment" :content])), :enabled (deserboolean (clojure.core/get-in letvar107412 ["Enabled" :content]))} (letvar107412 "DefaultRootObject") (clojure.core/assoc :default-root-object (deserstring (clojure.core/get-in letvar107412 ["DefaultRootObject" :content]))) (letvar107412 "IsIPV6Enabled") (clojure.core/assoc :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar107412 ["IsIPV6Enabled" :content]))) (letvar107412 "Restrictions") (clojure.core/assoc :restrictions (deser-restrictions (clojure.core/get-in letvar107412 ["Restrictions" :content]))) (letvar107412 "WebACLId") (clojure.core/assoc :web-acl-id (deserstring (clojure.core/get-in letvar107412 ["WebACLId" :content]))) (letvar107412 "Logging") (clojure.core/assoc :logging (deser-logging-config (clojure.core/get-in letvar107412 ["Logging" :content]))) (letvar107412 "CacheBehaviors") (clojure.core/assoc :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar107412 ["CacheBehaviors" :content]))) (letvar107412 "CustomErrorResponses") (clojure.core/assoc :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar107412 ["CustomErrorResponses" :content]))) (letvar107412 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar107412 ["Aliases" :content]))) (letvar107412 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar107412 ["PriceClass" :content]))) (letvar107412 "HttpVersion") (clojure.core/assoc :http-version (deser-http-version (clojure.core/get-in letvar107412 ["HttpVersion" :content]))) (letvar107412 "ViewerCertificate") (clojure.core/assoc :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar107412 ["ViewerCertificate" :content]))))))

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

(clojure.core/defn- deser-paths [input] (clojure.core/let [letvar107630 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar107630 ["Quantity" :content]))} (letvar107630 "Items") (clojure.core/assoc :items (deser-path-list (clojure.core/get-in letvar107630 ["Items" :content]))))))

(clojure.core/defn- deserinteger [input] (java.lang.Integer. (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary [input] (clojure.core/let [letvar107728 {"Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "S3CanonicalUserId" (portkey.aws/search-for-tag input "S3CanonicalUserId" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:id (deserstring (clojure.core/get-in letvar107728 ["Id" :content])), :s-3-canonical-user-id (deserstring (clojure.core/get-in letvar107728 ["S3CanonicalUserId" :content])), :comment (deserstring (clojure.core/get-in letvar107728 ["Comment" :content]))})))

(clojure.core/defn- deser-cache-behavior-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cache-behavior coll))) input))

(clojure.core/defn- deser-origin-custom-header [input] (clojure.core/let [letvar107841 {"HeaderName" (portkey.aws/search-for-tag input "HeaderName" :flattened? false :xmlAttribute? nil), "HeaderValue" (portkey.aws/search-for-tag input "HeaderValue" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:header-name (deserstring (clojure.core/get-in letvar107841 ["HeaderName" :content])), :header-value (deserstring (clojure.core/get-in letvar107841 ["HeaderValue" :content]))})))

(clojure.core/defn- deser-streaming-distribution-config [input] (clojure.core/let [letvar107937 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "S3Origin" (portkey.aws/search-for-tag input "S3Origin" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "Logging" (portkey.aws/search-for-tag input "Logging" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar107937 ["CallerReference" :content])), :s-3-origin (deser-s-3-origin (clojure.core/get-in letvar107937 ["S3Origin" :content])), :comment (deserstring (clojure.core/get-in letvar107937 ["Comment" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar107937 ["TrustedSigners" :content])), :enabled (deserboolean (clojure.core/get-in letvar107937 ["Enabled" :content]))} (letvar107937 "Aliases") (clojure.core/assoc :aliases (deser-aliases (clojure.core/get-in letvar107937 ["Aliases" :content]))) (letvar107937 "Logging") (clojure.core/assoc :logging (deser-streaming-logging-config (clojure.core/get-in letvar107937 ["Logging" :content]))) (letvar107937 "PriceClass") (clojure.core/assoc :price-class (deser-price-class (clojure.core/get-in letvar107937 ["PriceClass" :content]))))))

(clojure.core/defn- deser-s-3-origin-config [input] (clojure.core/let [letvar108033 {"OriginAccessIdentity" (portkey.aws/search-for-tag input "OriginAccessIdentity" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origin-access-identity (deserstring (clojure.core/get-in letvar108033 ["OriginAccessIdentity" :content]))})))

(clojure.core/defn- deser-cloud-front-origin-access-identity-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cloud-front-origin-access-identity-summary coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/let [letvar108146 {"Key" (portkey.aws/search-for-tag input "Key" :flattened? false :xmlAttribute? nil), "Value" (portkey.aws/search-for-tag input "Value" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:key (deser-tag-key (clojure.core/get-in letvar108146 ["Key" :content]))} (letvar108146 "Value") (clojure.core/assoc :value (deser-tag-value (clojure.core/get-in letvar108146 ["Value" :content]))))))

(clojure.core/defn- deser-streaming-logging-config [input] (clojure.core/let [letvar108242 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Bucket" (portkey.aws/search-for-tag input "Bucket" :flattened? false :xmlAttribute? nil), "Prefix" (portkey.aws/search-for-tag input "Prefix" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar108242 ["Enabled" :content])), :bucket (deserstring (clojure.core/get-in letvar108242 ["Bucket" :content])), :prefix (deserstring (clojure.core/get-in letvar108242 ["Prefix" :content]))})))

(clojure.core/defn- deser-distribution-summary [input] (clojure.core/let [letvar108338 {"IsIPV6Enabled" (portkey.aws/search-for-tag input "IsIPV6Enabled" :flattened? false :xmlAttribute? nil), "Restrictions" (portkey.aws/search-for-tag input "Restrictions" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil), "WebACLId" (portkey.aws/search-for-tag input "WebACLId" :flattened? false :xmlAttribute? nil), "ARN" (portkey.aws/search-for-tag input "ARN" :flattened? false :xmlAttribute? nil), "CacheBehaviors" (portkey.aws/search-for-tag input "CacheBehaviors" :flattened? false :xmlAttribute? nil), "CustomErrorResponses" (portkey.aws/search-for-tag input "CustomErrorResponses" :flattened? false :xmlAttribute? nil), "Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Status" (portkey.aws/search-for-tag input "Status" :flattened? false :xmlAttribute? nil), "Aliases" (portkey.aws/search-for-tag input "Aliases" :flattened? false :xmlAttribute? nil), "PriceClass" (portkey.aws/search-for-tag input "PriceClass" :flattened? false :xmlAttribute? nil), "LastModifiedTime" (portkey.aws/search-for-tag input "LastModifiedTime" :flattened? false :xmlAttribute? nil), "DomainName" (portkey.aws/search-for-tag input "DomainName" :flattened? false :xmlAttribute? nil), "Origins" (portkey.aws/search-for-tag input "Origins" :flattened? false :xmlAttribute? nil), "HttpVersion" (portkey.aws/search-for-tag input "HttpVersion" :flattened? false :xmlAttribute? nil), "Id" (portkey.aws/search-for-tag input "Id" :flattened? false :xmlAttribute? nil), "DefaultCacheBehavior" (portkey.aws/search-for-tag input "DefaultCacheBehavior" :flattened? false :xmlAttribute? nil), "ViewerCertificate" (portkey.aws/search-for-tag input "ViewerCertificate" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:origins (deser-origins (clojure.core/get-in letvar108338 ["Origins" :content])), :restrictions (deser-restrictions (clojure.core/get-in letvar108338 ["Restrictions" :content])), :web-acl-id (deserstring (clojure.core/get-in letvar108338 ["WebACLId" :content])), :is-ipv-6-enabled (deserboolean (clojure.core/get-in letvar108338 ["IsIPV6Enabled" :content])), :cache-behaviors (deser-cache-behaviors (clojure.core/get-in letvar108338 ["CacheBehaviors" :content])), :default-cache-behavior (deser-default-cache-behavior (clojure.core/get-in letvar108338 ["DefaultCacheBehavior" :content])), :viewer-certificate (deser-viewer-certificate (clojure.core/get-in letvar108338 ["ViewerCertificate" :content])), :http-version (deser-http-version (clojure.core/get-in letvar108338 ["HttpVersion" :content])), :domain-name (deserstring (clojure.core/get-in letvar108338 ["DomainName" :content])), :status (deserstring (clojure.core/get-in letvar108338 ["Status" :content])), :id (deserstring (clojure.core/get-in letvar108338 ["Id" :content])), :comment (deserstring (clojure.core/get-in letvar108338 ["Comment" :content])), :aliases (deser-aliases (clojure.core/get-in letvar108338 ["Aliases" :content])), :custom-error-responses (deser-custom-error-responses (clojure.core/get-in letvar108338 ["CustomErrorResponses" :content])), :enabled (deserboolean (clojure.core/get-in letvar108338 ["Enabled" :content])), :last-modified-time (desertimestamp (clojure.core/get-in letvar108338 ["LastModifiedTime" :content])), :arn (deserstring (clojure.core/get-in letvar108338 ["ARN" :content])), :price-class (deser-price-class (clojure.core/get-in letvar108338 ["PriceClass" :content]))})))

(clojure.core/defn- deser-ssl-protocol [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1.1" :tl-sv-11, "TLSv1.2" :tl-sv-12} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-lambda-function-association-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-lambda-function-association coll))) input))

(clojure.core/defn- deser-headers [input] (clojure.core/let [letvar108456 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar108456 ["Quantity" :content]))} (letvar108456 "Items") (clojure.core/assoc :items (deser-header-list (clojure.core/get-in letvar108456 ["Items" :content]))))))

(clojure.core/defn- deser-minimum-protocol-version [input] (clojure.core/get {"SSLv3" :ss-lv-3, "TLSv1" :tl-sv-1, "TLSv1_2016" :tl-sv-1-2016, "TLSv1.1_2016" :tl-sv-11-2016, "TLSv1.2_2018" :tl-sv-12-2018} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-origins [input] (clojure.core/let [letvar108557 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar108557 ["Quantity" :content]))} (letvar108557 "Items") (clojure.core/assoc :items (deser-origin-list (clojure.core/get-in letvar108557 ["Items" :content]))))))

(clojure.core/defn- deser-header-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deserstring coll))) input))

(clojure.core/defn- deser-distribution-list [input] (clojure.core/let [letvar108670 {"Marker" (portkey.aws/search-for-tag input "Marker" :flattened? false :xmlAttribute? nil), "NextMarker" (portkey.aws/search-for-tag input "NextMarker" :flattened? false :xmlAttribute? nil), "MaxItems" (portkey.aws/search-for-tag input "MaxItems" :flattened? false :xmlAttribute? nil), "IsTruncated" (portkey.aws/search-for-tag input "IsTruncated" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:marker (deserstring (clojure.core/get-in letvar108670 ["Marker" :content])), :max-items (deserinteger (clojure.core/get-in letvar108670 ["MaxItems" :content])), :is-truncated (deserboolean (clojure.core/get-in letvar108670 ["IsTruncated" :content])), :quantity (deserinteger (clojure.core/get-in letvar108670 ["Quantity" :content]))} (letvar108670 "NextMarker") (clojure.core/assoc :next-marker (deserstring (clojure.core/get-in letvar108670 ["NextMarker" :content]))) (letvar108670 "Items") (clojure.core/assoc :items (deser-distribution-summary-list (clojure.core/get-in letvar108670 ["Items" :content]))))))

(clojure.core/defn- deser-ssl-support-method [input] (clojure.core/get {"sni-only" :snionly, "vip" :vip} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-http-version [input] (clojure.core/get {"http1.1" :http-11, "http2" :http-2} (if (clojure.core/seq? input) (clojure.core/first input) input)))

(clojure.core/defn- deser-cookie-preference [input] (clojure.core/let [letvar108776 {"Forward" (portkey.aws/search-for-tag input "Forward" :flattened? false :xmlAttribute? nil), "WhitelistedNames" (portkey.aws/search-for-tag input "WhitelistedNames" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:forward (deser-item-selection (clojure.core/get-in letvar108776 ["Forward" :content]))} (letvar108776 "WhitelistedNames") (clojure.core/assoc :whitelisted-names (deser-cookie-names (clojure.core/get-in letvar108776 ["WhitelistedNames" :content]))))))

(clojure.core/defn- deser-custom-headers [input] (clojure.core/let [letvar108872 {"Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:quantity (deserinteger (clojure.core/get-in letvar108872 ["Quantity" :content]))} (letvar108872 "Items") (clojure.core/assoc :items (deser-origin-custom-headers-list (clojure.core/get-in letvar108872 ["Items" :content]))))))

(clojure.core/defn- deser-methods-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-method coll))) input))

(clojure.core/defn- deser-default-cache-behavior [input] (clojure.core/let [letvar108985 {"SmoothStreaming" (portkey.aws/search-for-tag input "SmoothStreaming" :flattened? false :xmlAttribute? nil), "Compress" (portkey.aws/search-for-tag input "Compress" :flattened? false :xmlAttribute? nil), "ForwardedValues" (portkey.aws/search-for-tag input "ForwardedValues" :flattened? false :xmlAttribute? nil), "TargetOriginId" (portkey.aws/search-for-tag input "TargetOriginId" :flattened? false :xmlAttribute? nil), "LambdaFunctionAssociations" (portkey.aws/search-for-tag input "LambdaFunctionAssociations" :flattened? false :xmlAttribute? nil), "ViewerProtocolPolicy" (portkey.aws/search-for-tag input "ViewerProtocolPolicy" :flattened? false :xmlAttribute? nil), "MinTTL" (portkey.aws/search-for-tag input "MinTTL" :flattened? false :xmlAttribute? nil), "MaxTTL" (portkey.aws/search-for-tag input "MaxTTL" :flattened? false :xmlAttribute? nil), "AllowedMethods" (portkey.aws/search-for-tag input "AllowedMethods" :flattened? false :xmlAttribute? nil), "DefaultTTL" (portkey.aws/search-for-tag input "DefaultTTL" :flattened? false :xmlAttribute? nil), "TrustedSigners" (portkey.aws/search-for-tag input "TrustedSigners" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:target-origin-id (deserstring (clojure.core/get-in letvar108985 ["TargetOriginId" :content])), :forwarded-values (deser-forwarded-values (clojure.core/get-in letvar108985 ["ForwardedValues" :content])), :trusted-signers (deser-trusted-signers (clojure.core/get-in letvar108985 ["TrustedSigners" :content])), :viewer-protocol-policy (deser-viewer-protocol-policy (clojure.core/get-in letvar108985 ["ViewerProtocolPolicy" :content])), :min-ttl (deserlong (clojure.core/get-in letvar108985 ["MinTTL" :content]))} (letvar108985 "SmoothStreaming") (clojure.core/assoc :smooth-streaming (deserboolean (clojure.core/get-in letvar108985 ["SmoothStreaming" :content]))) (letvar108985 "Compress") (clojure.core/assoc :compress (deserboolean (clojure.core/get-in letvar108985 ["Compress" :content]))) (letvar108985 "LambdaFunctionAssociations") (clojure.core/assoc :lambda-function-associations (deser-lambda-function-associations (clojure.core/get-in letvar108985 ["LambdaFunctionAssociations" :content]))) (letvar108985 "MaxTTL") (clojure.core/assoc :max-ttl (deserlong (clojure.core/get-in letvar108985 ["MaxTTL" :content]))) (letvar108985 "AllowedMethods") (clojure.core/assoc :allowed-methods (deser-allowed-methods (clojure.core/get-in letvar108985 ["AllowedMethods" :content]))) (letvar108985 "DefaultTTL") (clojure.core/assoc :default-ttl (deserlong (clojure.core/get-in letvar108985 ["DefaultTTL" :content]))))))

(clojure.core/defn- deser-trusted-signers [input] (clojure.core/let [letvar109081 {"Enabled" (portkey.aws/search-for-tag input "Enabled" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:enabled (deserboolean (clojure.core/get-in letvar109081 ["Enabled" :content])), :quantity (deserinteger (clojure.core/get-in letvar109081 ["Quantity" :content]))} (letvar109081 "Items") (clojure.core/assoc :items (deser-aws-account-number-list (clojure.core/get-in letvar109081 ["Items" :content]))))))

(clojure.core/defn- deser-viewer-certificate [input] (clojure.core/let [letvar109177 {"CloudFrontDefaultCertificate" (portkey.aws/search-for-tag input "CloudFrontDefaultCertificate" :flattened? false :xmlAttribute? nil), "IAMCertificateId" (portkey.aws/search-for-tag input "IAMCertificateId" :flattened? false :xmlAttribute? nil), "ACMCertificateArn" (portkey.aws/search-for-tag input "ACMCertificateArn" :flattened? false :xmlAttribute? nil), "SSLSupportMethod" (portkey.aws/search-for-tag input "SSLSupportMethod" :flattened? false :xmlAttribute? nil), "MinimumProtocolVersion" (portkey.aws/search-for-tag input "MinimumProtocolVersion" :flattened? false :xmlAttribute? nil), "Certificate" (portkey.aws/search-for-tag input "Certificate" :flattened? false :xmlAttribute? nil), "CertificateSource" (portkey.aws/search-for-tag input "CertificateSource" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {} (letvar109177 "CloudFrontDefaultCertificate") (clojure.core/assoc :cloud-front-default-certificate (deserboolean (clojure.core/get-in letvar109177 ["CloudFrontDefaultCertificate" :content]))) (letvar109177 "IAMCertificateId") (clojure.core/assoc :iam-certificate-id (deserstring (clojure.core/get-in letvar109177 ["IAMCertificateId" :content]))) (letvar109177 "ACMCertificateArn") (clojure.core/assoc :acm-certificate-arn (deserstring (clojure.core/get-in letvar109177 ["ACMCertificateArn" :content]))) (letvar109177 "SSLSupportMethod") (clojure.core/assoc :ssl-support-method (deser-ssl-support-method (clojure.core/get-in letvar109177 ["SSLSupportMethod" :content]))) (letvar109177 "MinimumProtocolVersion") (clojure.core/assoc :minimum-protocol-version (deser-minimum-protocol-version (clojure.core/get-in letvar109177 ["MinimumProtocolVersion" :content]))) (letvar109177 "Certificate") (clojure.core/assoc :certificate (deserstring (clojure.core/get-in letvar109177 ["Certificate" :content]))) (letvar109177 "CertificateSource") (clojure.core/assoc :certificate-source (deser-certificate-source (clojure.core/get-in letvar109177 ["CertificateSource" :content]))))))

(clojure.core/defn- deser-cloud-front-origin-access-identity-config [input] (clojure.core/let [letvar109273 {"CallerReference" (portkey.aws/search-for-tag input "CallerReference" :flattened? false :xmlAttribute? nil), "Comment" (portkey.aws/search-for-tag input "Comment" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:caller-reference (deserstring (clojure.core/get-in letvar109273 ["CallerReference" :content])), :comment (deserstring (clojure.core/get-in letvar109273 ["Comment" :content]))})))

(clojure.core/defn- deser-geo-restriction [input] (clojure.core/let [letvar109369 {"RestrictionType" (portkey.aws/search-for-tag input "RestrictionType" :flattened? false :xmlAttribute? nil), "Quantity" (portkey.aws/search-for-tag input "Quantity" :flattened? false :xmlAttribute? nil), "Items" (portkey.aws/search-for-tag input "Items" :flattened? false :xmlAttribute? nil)}] (clojure.core/cond-> {:restriction-type (deser-geo-restriction-type (clojure.core/get-in letvar109369 ["RestrictionType" :content])), :quantity (deserinteger (clojure.core/get-in letvar109369 ["Quantity" :content]))} (letvar109369 "Items") (clojure.core/assoc :items (deser-location-list (clojure.core/get-in letvar109369 ["Items" :content]))))))

(clojure.core/defn- response-list-tags-for-resource-result ([input] (response-list-tags-for-resource-result nil input)) ([resultWrapper109371 input] (clojure.core/let [rawinput109370 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109372 {"Tags" (portkey.aws/search-for-tag rawinput109370 "Tags" :flattened? false :result-wrapper resultWrapper109371)}] (clojure.core/cond-> {:tags (deser-tags (clojure.core/get-in letvar109372 ["Tags" :content]))}))))

(clojure.core/defn- response-too-many-distributions-with-lambda-associations ([input] (response-too-many-distributions-with-lambda-associations nil input)) ([resultWrapper109374 input] (clojure.core/let [rawinput109373 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109375 {"Message" (portkey.aws/search-for-tag rawinput109373 "Message" :flattened? false :result-wrapper resultWrapper109374)}] (clojure.core/cond-> {} (letvar109375 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109375 ["Message" :content])))))))

(clojure.core/defn- response-no-such-origin ([input] (response-no-such-origin nil input)) ([resultWrapper109377 input] (clojure.core/let [rawinput109376 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109378 {"Message" (portkey.aws/search-for-tag rawinput109376 "Message" :flattened? false :result-wrapper resultWrapper109377)}] (clojure.core/cond-> {} (letvar109378 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109378 ["Message" :content])))))))

(clojure.core/defn- response-invalid-protocol-settings ([input] (response-invalid-protocol-settings nil input)) ([resultWrapper109380 input] (clojure.core/let [rawinput109379 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109381 {"Message" (portkey.aws/search-for-tag rawinput109379 "Message" :flattened? false :result-wrapper resultWrapper109380)}] (clojure.core/cond-> {} (letvar109381 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109381 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cookie-names-in-white-list ([input] (response-too-many-cookie-names-in-white-list nil input)) ([resultWrapper109383 input] (clojure.core/let [rawinput109382 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109384 {"Message" (portkey.aws/search-for-tag rawinput109382 "Message" :flattened? false :result-wrapper resultWrapper109383)}] (clojure.core/cond-> {} (letvar109384 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109384 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cache-behaviors ([input] (response-too-many-cache-behaviors nil input)) ([resultWrapper109386 input] (clojure.core/let [rawinput109385 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109387 {"Message" (portkey.aws/search-for-tag rawinput109385 "Message" :flattened? false :result-wrapper resultWrapper109386)}] (clojure.core/cond-> {} (letvar109387 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109387 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origin-custom-headers ([input] (response-too-many-origin-custom-headers nil input)) ([resultWrapper109389 input] (clojure.core/let [rawinput109388 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109390 {"Message" (portkey.aws/search-for-tag rawinput109388 "Message" :flattened? false :result-wrapper resultWrapper109389)}] (clojure.core/cond-> {} (letvar109390 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109390 ["Message" :content])))))))

(clojure.core/defn- response-too-many-streaming-distributions ([input] (response-too-many-streaming-distributions nil input)) ([resultWrapper109392 input] (clojure.core/let [rawinput109391 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109393 {"Message" (portkey.aws/search-for-tag rawinput109391 "Message" :flattened? false :result-wrapper resultWrapper109392)}] (clojure.core/cond-> {} (letvar109393 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109393 ["Message" :content])))))))

(clojure.core/defn- response-get-streaming-distribution-result ([input] (response-get-streaming-distribution-result nil input)) ([resultWrapper109395 input] (clojure.core/let [rawinput109394 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109396 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput109394 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper109395), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109396 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar109396 ["StreamingDistribution" :content]))) (letvar109396 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109396 ["ETag"])))))))

(clojure.core/defn- response-too-many-streaming-distribution-cnam-es ([input] (response-too-many-streaming-distribution-cnam-es nil input)) ([resultWrapper109398 input] (clojure.core/let [rawinput109397 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109399 {"Message" (portkey.aws/search-for-tag rawinput109397 "Message" :flattened? false :result-wrapper resultWrapper109398)}] (clojure.core/cond-> {} (letvar109399 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109399 ["Message" :content])))))))

(clojure.core/defn- response-invalid-viewer-certificate ([input] (response-invalid-viewer-certificate nil input)) ([resultWrapper109401 input] (clojure.core/let [rawinput109400 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109402 {"Message" (portkey.aws/search-for-tag rawinput109400 "Message" :flattened? false :result-wrapper resultWrapper109401)}] (clojure.core/cond-> {} (letvar109402 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109402 ["Message" :content])))))))

(clojure.core/defn- response-invalid-argument ([input] (response-invalid-argument nil input)) ([resultWrapper109404 input] (clojure.core/let [rawinput109403 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109405 {"Message" (portkey.aws/search-for-tag rawinput109403 "Message" :flattened? false :result-wrapper resultWrapper109404)}] (clojure.core/cond-> {} (letvar109405 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109405 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-not-disabled ([input] (response-streaming-distribution-not-disabled nil input)) ([resultWrapper109407 input] (clojure.core/let [rawinput109406 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109408 {"Message" (portkey.aws/search-for-tag rawinput109406 "Message" :flattened? false :result-wrapper resultWrapper109407)}] (clojure.core/cond-> {} (letvar109408 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109408 ["Message" :content])))))))

(clojure.core/defn- response-too-many-certificates ([input] (response-too-many-certificates nil input)) ([resultWrapper109410 input] (clojure.core/let [rawinput109409 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109411 {"Message" (portkey.aws/search-for-tag rawinput109409 "Message" :flattened? false :result-wrapper resultWrapper109410)}] (clojure.core/cond-> {} (letvar109411 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109411 ["Message" :content])))))))

(clojure.core/defn- response-access-denied ([input] (response-access-denied nil input)) ([resultWrapper109413 input] (clojure.core/let [rawinput109412 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109414 {"Message" (portkey.aws/search-for-tag rawinput109412 "Message" :flattened? false :result-wrapper resultWrapper109413)}] (clojure.core/cond-> {} (letvar109414 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109414 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-in-use ([input] (response-cloud-front-origin-access-identity-in-use nil input)) ([resultWrapper109416 input] (clojure.core/let [rawinput109415 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109417 {"Message" (portkey.aws/search-for-tag rawinput109415 "Message" :flattened? false :result-wrapper resultWrapper109416)}] (clojure.core/cond-> {} (letvar109417 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109417 ["Message" :content])))))))

(clojure.core/defn- response-invalid-lambda-function-association ([input] (response-invalid-lambda-function-association nil input)) ([resultWrapper109419 input] (clojure.core/let [rawinput109418 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109420 {"Message" (portkey.aws/search-for-tag rawinput109418 "Message" :flattened? false :result-wrapper resultWrapper109419)}] (clojure.core/cond-> {} (letvar109420 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109420 ["Message" :content])))))))

(clojure.core/defn- response-no-such-resource ([input] (response-no-such-resource nil input)) ([resultWrapper109422 input] (clojure.core/let [rawinput109421 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109423 {"Message" (portkey.aws/search-for-tag rawinput109421 "Message" :flattened? false :result-wrapper resultWrapper109422)}] (clojure.core/cond-> {} (letvar109423 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109423 ["Message" :content])))))))

(clojure.core/defn- response-update-cloud-front-origin-access-identity-result ([input] (response-update-cloud-front-origin-access-identity-result nil input)) ([resultWrapper109425 input] (clojure.core/let [rawinput109424 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109426 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput109424 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper109425), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109426 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar109426 ["CloudFrontOriginAccessIdentity" :content]))) (letvar109426 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109426 ["ETag"])))))))

(clojure.core/defn- response-invalid-error-code ([input] (response-invalid-error-code nil input)) ([resultWrapper109428 input] (clojure.core/let [rawinput109427 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109429 {"Message" (portkey.aws/search-for-tag rawinput109427 "Message" :flattened? false :result-wrapper resultWrapper109428)}] (clojure.core/cond-> {} (letvar109429 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109429 ["Message" :content])))))))

(clojure.core/defn- response-too-many-lambda-function-associations ([input] (response-too-many-lambda-function-associations nil input)) ([resultWrapper109431 input] (clojure.core/let [rawinput109430 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109432 {"Message" (portkey.aws/search-for-tag rawinput109430 "Message" :flattened? false :result-wrapper resultWrapper109431)}] (clojure.core/cond-> {} (letvar109432 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109432 ["Message" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-result ([input] (response-create-streaming-distribution-result nil input)) ([resultWrapper109434 input] (clojure.core/let [rawinput109433 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109435 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput109433 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper109434), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109435 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar109435 ["StreamingDistribution" :content]))) (letvar109435 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar109435 ["Location"]))) (letvar109435 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109435 ["ETag"])))))))

(clojure.core/defn- response-invalid-relative-path ([input] (response-invalid-relative-path nil input)) ([resultWrapper109437 input] (clojure.core/let [rawinput109436 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109438 {"Message" (portkey.aws/search-for-tag rawinput109436 "Message" :flattened? false :result-wrapper resultWrapper109437)}] (clojure.core/cond-> {} (letvar109438 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109438 ["Message" :content])))))))

(clojure.core/defn- response-invalid-location-code ([input] (response-invalid-location-code nil input)) ([resultWrapper109440 input] (clojure.core/let [rawinput109439 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109441 {"Message" (portkey.aws/search-for-tag rawinput109439 "Message" :flattened? false :result-wrapper resultWrapper109440)}] (clojure.core/cond-> {} (letvar109441 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109441 ["Message" :content])))))))

(clojure.core/defn- response-invalid-web-acl-id ([input] (response-invalid-web-acl-id nil input)) ([resultWrapper109443 input] (clojure.core/let [rawinput109442 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109444 {"Message" (portkey.aws/search-for-tag rawinput109442 "Message" :flattened? false :result-wrapper resultWrapper109443)}] (clojure.core/cond-> {} (letvar109444 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109444 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin ([input] (response-invalid-origin nil input)) ([resultWrapper109446 input] (clojure.core/let [rawinput109445 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109447 {"Message" (portkey.aws/search-for-tag rawinput109445 "Message" :flattened? false :result-wrapper resultWrapper109446)}] (clojure.core/cond-> {} (letvar109447 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109447 ["Message" :content])))))))

(clojure.core/defn- response-too-many-cloud-front-origin-access-identities ([input] (response-too-many-cloud-front-origin-access-identities nil input)) ([resultWrapper109449 input] (clojure.core/let [rawinput109448 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109450 {"Message" (portkey.aws/search-for-tag rawinput109448 "Message" :flattened? false :result-wrapper resultWrapper109449)}] (clojure.core/cond-> {} (letvar109450 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109450 ["Message" :content])))))))

(clojure.core/defn- response-update-distribution-result ([input] (response-update-distribution-result nil input)) ([resultWrapper109452 input] (clojure.core/let [rawinput109451 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109453 {"Distribution" (portkey.aws/search-for-tag rawinput109451 "Distribution" :flattened? false :result-wrapper resultWrapper109452), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109453 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar109453 ["Distribution" :content]))) (letvar109453 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109453 ["ETag"])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-result ([input] (response-get-cloud-front-origin-access-identity-result nil input)) ([resultWrapper109455 input] (clojure.core/let [rawinput109454 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109456 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput109454 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper109455), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109456 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar109456 ["CloudFrontOriginAccessIdentity" :content]))) (letvar109456 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109456 ["ETag"])))))))

(clojure.core/defn- response-invalid-query-string-parameters ([input] (response-invalid-query-string-parameters nil input)) ([resultWrapper109458 input] (clojure.core/let [rawinput109457 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109459 {"Message" (portkey.aws/search-for-tag rawinput109457 "Message" :flattened? false :result-wrapper resultWrapper109458)}] (clojure.core/cond-> {} (letvar109459 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109459 ["Message" :content])))))))

(clojure.core/defn- response-too-many-origins ([input] (response-too-many-origins nil input)) ([resultWrapper109461 input] (clojure.core/let [rawinput109460 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109462 {"Message" (portkey.aws/search-for-tag rawinput109460 "Message" :flattened? false :result-wrapper resultWrapper109461)}] (clojure.core/cond-> {} (letvar109462 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109462 ["Message" :content])))))))

(clojure.core/defn- response-invalid-ttl-order ([input] (response-invalid-ttl-order nil input)) ([resultWrapper109464 input] (clojure.core/let [rawinput109463 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109465 {"Message" (portkey.aws/search-for-tag rawinput109463 "Message" :flattened? false :result-wrapper resultWrapper109464)}] (clojure.core/cond-> {} (letvar109465 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109465 ["Message" :content])))))))

(clojure.core/defn- response-no-such-streaming-distribution ([input] (response-no-such-streaming-distribution nil input)) ([resultWrapper109467 input] (clojure.core/let [rawinput109466 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109468 {"Message" (portkey.aws/search-for-tag rawinput109466 "Message" :flattened? false :result-wrapper resultWrapper109467)}] (clojure.core/cond-> {} (letvar109468 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109468 ["Message" :content])))))))

(clojure.core/defn- response-create-cloud-front-origin-access-identity-result ([input] (response-create-cloud-front-origin-access-identity-result nil input)) ([resultWrapper109470 input] (clojure.core/let [rawinput109469 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109471 {"CloudFrontOriginAccessIdentity" (portkey.aws/search-for-tag rawinput109469 "CloudFrontOriginAccessIdentity" :flattened? false :result-wrapper resultWrapper109470), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109471 "CloudFrontOriginAccessIdentity") (clojure.core/assoc :cloud-front-origin-access-identity (deser-cloud-front-origin-access-identity (clojure.core/get-in letvar109471 ["CloudFrontOriginAccessIdentity" :content]))) (letvar109471 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar109471 ["Location"]))) (letvar109471 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109471 ["ETag"])))))))

(clojure.core/defn- response-cname-already-exists ([input] (response-cname-already-exists nil input)) ([resultWrapper109473 input] (clojure.core/let [rawinput109472 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109474 {"Message" (portkey.aws/search-for-tag rawinput109472 "Message" :flattened? false :result-wrapper resultWrapper109473)}] (clojure.core/cond-> {} (letvar109474 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109474 ["Message" :content])))))))

(clojure.core/defn- response-invalid-default-root-object ([input] (response-invalid-default-root-object nil input)) ([resultWrapper109476 input] (clojure.core/let [rawinput109475 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109477 {"Message" (portkey.aws/search-for-tag rawinput109475 "Message" :flattened? false :result-wrapper resultWrapper109476)}] (clojure.core/cond-> {} (letvar109477 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109477 ["Message" :content])))))))

(clojure.core/defn- response-invalid-response-code ([input] (response-invalid-response-code nil input)) ([resultWrapper109479 input] (clojure.core/let [rawinput109478 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109480 {"Message" (portkey.aws/search-for-tag rawinput109478 "Message" :flattened? false :result-wrapper resultWrapper109479)}] (clojure.core/cond-> {} (letvar109480 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109480 ["Message" :content])))))))

(clojure.core/defn- response-no-such-invalidation ([input] (response-no-such-invalidation nil input)) ([resultWrapper109482 input] (clojure.core/let [rawinput109481 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109483 {"Message" (portkey.aws/search-for-tag rawinput109481 "Message" :flattened? false :result-wrapper resultWrapper109482)}] (clojure.core/cond-> {} (letvar109483 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109483 ["Message" :content])))))))

(clojure.core/defn- response-too-many-invalidations-in-progress ([input] (response-too-many-invalidations-in-progress nil input)) ([resultWrapper109485 input] (clojure.core/let [rawinput109484 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109486 {"Message" (portkey.aws/search-for-tag rawinput109484 "Message" :flattened? false :result-wrapper resultWrapper109485)}] (clojure.core/cond-> {} (letvar109486 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109486 ["Message" :content])))))))

(clojure.core/defn- response-list-cloud-front-origin-access-identities-result ([input] (response-list-cloud-front-origin-access-identities-result nil input)) ([resultWrapper109488 input] (clojure.core/let [rawinput109487 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109489 {"CloudFrontOriginAccessIdentityList" (portkey.aws/search-for-tag rawinput109487 "CloudFrontOriginAccessIdentityList" :flattened? false :result-wrapper resultWrapper109488)}] (clojure.core/cond-> {} (letvar109489 "CloudFrontOriginAccessIdentityList") (clojure.core/assoc :cloud-front-origin-access-identity-list (deser-cloud-front-origin-access-identity-list (clojure.core/get-in letvar109489 ["CloudFrontOriginAccessIdentityList" :content])))))))

(clojure.core/defn- response-invalid-forward-cookies ([input] (response-invalid-forward-cookies nil input)) ([resultWrapper109491 input] (clojure.core/let [rawinput109490 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109492 {"Message" (portkey.aws/search-for-tag rawinput109490 "Message" :flattened? false :result-wrapper resultWrapper109491)}] (clojure.core/cond-> {} (letvar109492 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109492 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-config-result ([input] (response-get-distribution-config-result nil input)) ([resultWrapper109494 input] (clojure.core/let [rawinput109493 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109495 {"DistributionConfig" (portkey.aws/search-for-tag rawinput109493 "DistributionConfig" :flattened? false :result-wrapper resultWrapper109494), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109495 "DistributionConfig") (clojure.core/assoc :distribution-config (deser-distribution-config (clojure.core/get-in letvar109495 ["DistributionConfig" :content]))) (letvar109495 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109495 ["ETag"])))))))

(clojure.core/defn- response-invalid-required-protocol ([input] (response-invalid-required-protocol nil input)) ([resultWrapper109497 input] (clojure.core/let [rawinput109496 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109498 {"Message" (portkey.aws/search-for-tag rawinput109496 "Message" :flattened? false :result-wrapper resultWrapper109497)}] (clojure.core/cond-> {} (letvar109498 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109498 ["Message" :content])))))))

(clojure.core/defn- response-get-distribution-result ([input] (response-get-distribution-result nil input)) ([resultWrapper109500 input] (clojure.core/let [rawinput109499 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109501 {"Distribution" (portkey.aws/search-for-tag rawinput109499 "Distribution" :flattened? false :result-wrapper resultWrapper109500), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109501 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar109501 ["Distribution" :content]))) (letvar109501 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109501 ["ETag"])))))))

(clojure.core/defn- response-get-streaming-distribution-config-result ([input] (response-get-streaming-distribution-config-result nil input)) ([resultWrapper109503 input] (clojure.core/let [rawinput109502 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109504 {"StreamingDistributionConfig" (portkey.aws/search-for-tag rawinput109502 "StreamingDistributionConfig" :flattened? false :result-wrapper resultWrapper109503), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109504 "StreamingDistributionConfig") (clojure.core/assoc :streaming-distribution-config (deser-streaming-distribution-config (clojure.core/get-in letvar109504 ["StreamingDistributionConfig" :content]))) (letvar109504 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109504 ["ETag"])))))))

(clojure.core/defn- response-invalid-headers-for-s-3-origin ([input] (response-invalid-headers-for-s-3-origin nil input)) ([resultWrapper109506 input] (clojure.core/let [rawinput109505 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109507 {"Message" (portkey.aws/search-for-tag rawinput109505 "Message" :flattened? false :result-wrapper resultWrapper109506)}] (clojure.core/cond-> {} (letvar109507 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109507 ["Message" :content])))))))

(clojure.core/defn- response-too-many-distribution-cnam-es ([input] (response-too-many-distribution-cnam-es nil input)) ([resultWrapper109509 input] (clojure.core/let [rawinput109508 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109510 {"Message" (portkey.aws/search-for-tag rawinput109508 "Message" :flattened? false :result-wrapper resultWrapper109509)}] (clojure.core/cond-> {} (letvar109510 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109510 ["Message" :content])))))))

(clojure.core/defn- response-invalid-geo-restriction-parameter ([input] (response-invalid-geo-restriction-parameter nil input)) ([resultWrapper109512 input] (clojure.core/let [rawinput109511 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109513 {"Message" (portkey.aws/search-for-tag rawinput109511 "Message" :flattened? false :result-wrapper resultWrapper109512)}] (clojure.core/cond-> {} (letvar109513 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109513 ["Message" :content])))))))

(clojure.core/defn- response-no-such-cloud-front-origin-access-identity ([input] (response-no-such-cloud-front-origin-access-identity nil input)) ([resultWrapper109515 input] (clojure.core/let [rawinput109514 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109516 {"Message" (portkey.aws/search-for-tag rawinput109514 "Message" :flattened? false :result-wrapper resultWrapper109515)}] (clojure.core/cond-> {} (letvar109516 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109516 ["Message" :content])))))))

(clojure.core/defn- response-list-invalidations-result ([input] (response-list-invalidations-result nil input)) ([resultWrapper109518 input] (clojure.core/let [rawinput109517 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109519 {"InvalidationList" (portkey.aws/search-for-tag rawinput109517 "InvalidationList" :flattened? false :result-wrapper resultWrapper109518)}] (clojure.core/cond-> {} (letvar109519 "InvalidationList") (clojure.core/assoc :invalidation-list (deser-invalidation-list (clojure.core/get-in letvar109519 ["InvalidationList" :content])))))))

(clojure.core/defn- response-batch-too-large ([input] (response-batch-too-large nil input)) ([resultWrapper109521 input] (clojure.core/let [rawinput109520 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109522 {"Message" (portkey.aws/search-for-tag rawinput109520 "Message" :flattened? false :result-wrapper resultWrapper109521)}] (clojure.core/cond-> {} (letvar109522 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109522 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-with-tags-result ([input] (response-create-distribution-with-tags-result nil input)) ([resultWrapper109524 input] (clojure.core/let [rawinput109523 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109525 {"Distribution" (portkey.aws/search-for-tag rawinput109523 "Distribution" :flattened? false :result-wrapper resultWrapper109524), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109525 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar109525 ["Distribution" :content]))) (letvar109525 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar109525 ["Location"]))) (letvar109525 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109525 ["ETag"])))))))

(clojure.core/defn- response-list-streaming-distributions-result ([input] (response-list-streaming-distributions-result nil input)) ([resultWrapper109527 input] (clojure.core/let [rawinput109526 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109528 {"StreamingDistributionList" (portkey.aws/search-for-tag rawinput109526 "StreamingDistributionList" :flattened? false :result-wrapper resultWrapper109527)}] (clojure.core/cond-> {} (letvar109528 "StreamingDistributionList") (clojure.core/assoc :streaming-distribution-list (deser-streaming-distribution-list (clojure.core/get-in letvar109528 ["StreamingDistributionList" :content])))))))

(clojure.core/defn- response-create-streaming-distribution-with-tags-result ([input] (response-create-streaming-distribution-with-tags-result nil input)) ([resultWrapper109530 input] (clojure.core/let [rawinput109529 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109531 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput109529 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper109530), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109531 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar109531 ["StreamingDistribution" :content]))) (letvar109531 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar109531 ["Location"]))) (letvar109531 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109531 ["ETag"])))))))

(clojure.core/defn- response-create-invalidation-result ([input] (response-create-invalidation-result nil input)) ([resultWrapper109533 input] (clojure.core/let [rawinput109532 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109534 {"Location" (clojure.core/get-in input [:headers "Location"]), "Invalidation" (portkey.aws/search-for-tag rawinput109532 "Invalidation" :flattened? false :result-wrapper resultWrapper109533)}] (clojure.core/cond-> {} (letvar109534 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar109534 ["Location"]))) (letvar109534 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar109534 ["Invalidation" :content])))))))

(clojure.core/defn- response-missing-body ([input] (response-missing-body nil input)) ([resultWrapper109536 input] (clojure.core/let [rawinput109535 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109537 {"Message" (portkey.aws/search-for-tag rawinput109535 "Message" :flattened? false :result-wrapper resultWrapper109536)}] (clojure.core/cond-> {} (letvar109537 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109537 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-read-timeout ([input] (response-invalid-origin-read-timeout nil input)) ([resultWrapper109539 input] (clojure.core/let [rawinput109538 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109540 {"Message" (portkey.aws/search-for-tag rawinput109538 "Message" :flattened? false :result-wrapper resultWrapper109539)}] (clojure.core/cond-> {} (letvar109540 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109540 ["Message" :content])))))))

(clojure.core/defn- response-get-cloud-front-origin-access-identity-config-result ([input] (response-get-cloud-front-origin-access-identity-config-result nil input)) ([resultWrapper109542 input] (clojure.core/let [rawinput109541 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109543 {"CloudFrontOriginAccessIdentityConfig" (portkey.aws/search-for-tag rawinput109541 "CloudFrontOriginAccessIdentityConfig" :flattened? false :result-wrapper resultWrapper109542), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109543 "CloudFrontOriginAccessIdentityConfig") (clojure.core/assoc :cloud-front-origin-access-identity-config (deser-cloud-front-origin-access-identity-config (clojure.core/get-in letvar109543 ["CloudFrontOriginAccessIdentityConfig" :content]))) (letvar109543 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109543 ["ETag"])))))))

(clojure.core/defn- response-distribution-not-disabled ([input] (response-distribution-not-disabled nil input)) ([resultWrapper109545 input] (clojure.core/let [rawinput109544 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109546 {"Message" (portkey.aws/search-for-tag rawinput109544 "Message" :flattened? false :result-wrapper resultWrapper109545)}] (clojure.core/cond-> {} (letvar109546 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109546 ["Message" :content])))))))

(clojure.core/defn- response-cloud-front-origin-access-identity-already-exists ([input] (response-cloud-front-origin-access-identity-already-exists nil input)) ([resultWrapper109548 input] (clojure.core/let [rawinput109547 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109549 {"Message" (portkey.aws/search-for-tag rawinput109547 "Message" :flattened? false :result-wrapper resultWrapper109548)}] (clojure.core/cond-> {} (letvar109549 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109549 ["Message" :content])))))))

(clojure.core/defn- response-precondition-failed ([input] (response-precondition-failed nil input)) ([resultWrapper109551 input] (clojure.core/let [rawinput109550 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109552 {"Message" (portkey.aws/search-for-tag rawinput109550 "Message" :flattened? false :result-wrapper resultWrapper109551)}] (clojure.core/cond-> {} (letvar109552 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109552 ["Message" :content])))))))

(clojure.core/defn- response-distribution-already-exists ([input] (response-distribution-already-exists nil input)) ([resultWrapper109554 input] (clojure.core/let [rawinput109553 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109555 {"Message" (portkey.aws/search-for-tag rawinput109553 "Message" :flattened? false :result-wrapper resultWrapper109554)}] (clojure.core/cond-> {} (letvar109555 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109555 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-access-identity ([input] (response-invalid-origin-access-identity nil input)) ([resultWrapper109557 input] (clojure.core/let [rawinput109556 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109558 {"Message" (portkey.aws/search-for-tag rawinput109556 "Message" :flattened? false :result-wrapper resultWrapper109557)}] (clojure.core/cond-> {} (letvar109558 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109558 ["Message" :content])))))))

(clojure.core/defn- response-too-many-trusted-signers ([input] (response-too-many-trusted-signers nil input)) ([resultWrapper109560 input] (clojure.core/let [rawinput109559 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109561 {"Message" (portkey.aws/search-for-tag rawinput109559 "Message" :flattened? false :result-wrapper resultWrapper109560)}] (clojure.core/cond-> {} (letvar109561 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109561 ["Message" :content])))))))

(clojure.core/defn- response-invalid-minimum-protocol-version ([input] (response-invalid-minimum-protocol-version nil input)) ([resultWrapper109563 input] (clojure.core/let [rawinput109562 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109564 {"Message" (portkey.aws/search-for-tag rawinput109562 "Message" :flattened? false :result-wrapper resultWrapper109563)}] (clojure.core/cond-> {} (letvar109564 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109564 ["Message" :content])))))))

(clojure.core/defn- response-streaming-distribution-already-exists ([input] (response-streaming-distribution-already-exists nil input)) ([resultWrapper109566 input] (clojure.core/let [rawinput109565 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109567 {"Message" (portkey.aws/search-for-tag rawinput109565 "Message" :flattened? false :result-wrapper resultWrapper109566)}] (clojure.core/cond-> {} (letvar109567 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109567 ["Message" :content])))))))

(clojure.core/defn- response-invalid-if-match-version ([input] (response-invalid-if-match-version nil input)) ([resultWrapper109569 input] (clojure.core/let [rawinput109568 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109570 {"Message" (portkey.aws/search-for-tag rawinput109568 "Message" :flattened? false :result-wrapper resultWrapper109569)}] (clojure.core/cond-> {} (letvar109570 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109570 ["Message" :content])))))))

(clojure.core/defn- response-create-distribution-result ([input] (response-create-distribution-result nil input)) ([resultWrapper109572 input] (clojure.core/let [rawinput109571 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109573 {"Distribution" (portkey.aws/search-for-tag rawinput109571 "Distribution" :flattened? false :result-wrapper resultWrapper109572), "Location" (clojure.core/get-in input [:headers "Location"]), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109573 "Distribution") (clojure.core/assoc :distribution (deser-distribution (clojure.core/get-in letvar109573 ["Distribution" :content]))) (letvar109573 "Location") (clojure.core/assoc :location (deserstring (clojure.core/get-in letvar109573 ["Location"]))) (letvar109573 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109573 ["ETag"])))))))

(clojure.core/defn- response-too-many-distributions ([input] (response-too-many-distributions nil input)) ([resultWrapper109575 input] (clojure.core/let [rawinput109574 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109576 {"Message" (portkey.aws/search-for-tag rawinput109574 "Message" :flattened? false :result-wrapper resultWrapper109575)}] (clojure.core/cond-> {} (letvar109576 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109576 ["Message" :content])))))))

(clojure.core/defn- response-no-such-distribution ([input] (response-no-such-distribution nil input)) ([resultWrapper109578 input] (clojure.core/let [rawinput109577 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109579 {"Message" (portkey.aws/search-for-tag rawinput109577 "Message" :flattened? false :result-wrapper resultWrapper109578)}] (clojure.core/cond-> {} (letvar109579 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109579 ["Message" :content])))))))

(clojure.core/defn- response-update-streaming-distribution-result ([input] (response-update-streaming-distribution-result nil input)) ([resultWrapper109581 input] (clojure.core/let [rawinput109580 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109582 {"StreamingDistribution" (portkey.aws/search-for-tag rawinput109580 "StreamingDistribution" :flattened? false :result-wrapper resultWrapper109581), "ETag" (clojure.core/get-in input [:headers "ETag"])}] (clojure.core/cond-> {} (letvar109582 "StreamingDistribution") (clojure.core/assoc :streaming-distribution (deser-streaming-distribution (clojure.core/get-in letvar109582 ["StreamingDistribution" :content]))) (letvar109582 "ETag") (clojure.core/assoc :e-tag (deserstring (clojure.core/get-in letvar109582 ["ETag"])))))))

(clojure.core/defn- response-illegal-update ([input] (response-illegal-update nil input)) ([resultWrapper109584 input] (clojure.core/let [rawinput109583 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109585 {"Message" (portkey.aws/search-for-tag rawinput109583 "Message" :flattened? false :result-wrapper resultWrapper109584)}] (clojure.core/cond-> {} (letvar109585 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109585 ["Message" :content])))))))

(clojure.core/defn- response-invalid-origin-keepalive-timeout ([input] (response-invalid-origin-keepalive-timeout nil input)) ([resultWrapper109587 input] (clojure.core/let [rawinput109586 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109588 {"Message" (portkey.aws/search-for-tag rawinput109586 "Message" :flattened? false :result-wrapper resultWrapper109587)}] (clojure.core/cond-> {} (letvar109588 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109588 ["Message" :content])))))))

(clojure.core/defn- response-inconsistent-quantities ([input] (response-inconsistent-quantities nil input)) ([resultWrapper109590 input] (clojure.core/let [rawinput109589 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109591 {"Message" (portkey.aws/search-for-tag rawinput109589 "Message" :flattened? false :result-wrapper resultWrapper109590)}] (clojure.core/cond-> {} (letvar109591 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109591 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-by-web-acl-id-result ([input] (response-list-distributions-by-web-acl-id-result nil input)) ([resultWrapper109593 input] (clojure.core/let [rawinput109592 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109594 {"DistributionList" (portkey.aws/search-for-tag rawinput109592 "DistributionList" :flattened? false :result-wrapper resultWrapper109593)}] (clojure.core/cond-> {} (letvar109594 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar109594 ["DistributionList" :content])))))))

(clojure.core/defn- response-too-many-query-string-parameters ([input] (response-too-many-query-string-parameters nil input)) ([resultWrapper109596 input] (clojure.core/let [rawinput109595 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109597 {"Message" (portkey.aws/search-for-tag rawinput109595 "Message" :flattened? false :result-wrapper resultWrapper109596)}] (clojure.core/cond-> {} (letvar109597 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109597 ["Message" :content])))))))

(clojure.core/defn- response-invalid-tagging ([input] (response-invalid-tagging nil input)) ([resultWrapper109599 input] (clojure.core/let [rawinput109598 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109600 {"Message" (portkey.aws/search-for-tag rawinput109598 "Message" :flattened? false :result-wrapper resultWrapper109599)}] (clojure.core/cond-> {} (letvar109600 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109600 ["Message" :content])))))))

(clojure.core/defn- response-list-distributions-result ([input] (response-list-distributions-result nil input)) ([resultWrapper109602 input] (clojure.core/let [rawinput109601 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109603 {"DistributionList" (portkey.aws/search-for-tag rawinput109601 "DistributionList" :flattened? false :result-wrapper resultWrapper109602)}] (clojure.core/cond-> {} (letvar109603 "DistributionList") (clojure.core/assoc :distribution-list (deser-distribution-list (clojure.core/get-in letvar109603 ["DistributionList" :content])))))))

(clojure.core/defn- response-trusted-signer-does-not-exist ([input] (response-trusted-signer-does-not-exist nil input)) ([resultWrapper109605 input] (clojure.core/let [rawinput109604 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109606 {"Message" (portkey.aws/search-for-tag rawinput109604 "Message" :flattened? false :result-wrapper resultWrapper109605)}] (clojure.core/cond-> {} (letvar109606 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109606 ["Message" :content])))))))

(clojure.core/defn- response-resource-in-use ([input] (response-resource-in-use nil input)) ([resultWrapper109608 input] (clojure.core/let [rawinput109607 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109609 {"Message" (portkey.aws/search-for-tag rawinput109607 "Message" :flattened? false :result-wrapper resultWrapper109608)}] (clojure.core/cond-> {} (letvar109609 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109609 ["Message" :content])))))))

(clojure.core/defn- response-get-invalidation-result ([input] (response-get-invalidation-result nil input)) ([resultWrapper109611 input] (clojure.core/let [rawinput109610 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109612 {"Invalidation" (portkey.aws/search-for-tag rawinput109610 "Invalidation" :flattened? false :result-wrapper resultWrapper109611)}] (clojure.core/cond-> {} (letvar109612 "Invalidation") (clojure.core/assoc :invalidation (deser-invalidation (clojure.core/get-in letvar109612 ["Invalidation" :content])))))))

(clojure.core/defn- response-too-many-headers-in-forwarded-values ([input] (response-too-many-headers-in-forwarded-values nil input)) ([resultWrapper109614 input] (clojure.core/let [rawinput109613 (clojure.core/some-> input :body portkey.aws/parse-xml-body) letvar109615 {"Message" (portkey.aws/search-for-tag rawinput109613 "Message" :flattened? false :result-wrapper resultWrapper109614)}] (clojure.core/cond-> {} (letvar109615 "Message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar109615 ["Message" :content])))))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.tag-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/tag-keys (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.tag-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-tags-for-resource-result (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-distributions-by-web-acl-id-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-distributions-by-web-acl-id-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-distributions-by-web-acl-id-request/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-distributions-by-web-acl-id-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.list-distributions-by-web-acl-id-request/web-acl-id] :opt-un [:portkey.aws.cloudfront.-2017-03-25.list-distributions-by-web-acl-id-request/marker :portkey.aws.cloudfront.-2017-03-25.list-distributions-by-web-acl-id-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-distributions-with-lambda-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-distributions-with-lambda-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-distributions-with-lambda-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.no-such-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/no-such-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.no-such-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cookie-names/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cookie-names/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/cookie-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cookie-names (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.cookie-names/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.cookie-names/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.logging-config/include-cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.logging-config/enabled :portkey.aws.cloudfront.-2017-03-25.logging-config/include-cookies :portkey.aws.cloudfront.-2017-03-25.logging-config/bucket :portkey.aws.cloudfront.-2017-03-25.logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/streaming-distribution-config :portkey.aws.cloudfront.-2017-03-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-protocol-settings/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-protocol-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-protocol-settings/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-cookie-names-in-white-list/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-cookie-names-in-white-list (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-cookie-names-in-white-list/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation-summary/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalidation-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.invalidation-summary/id :portkey.aws.cloudfront.-2017-03-25.invalidation-summary/create-time :portkey.aws.cloudfront.-2017-03-25.invalidation-summary/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-cache-behaviors/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-cache-behaviors (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-cache-behaviors/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-origin-custom-headers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-origin-custom-headers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-origin-custom-headers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/custom-error-response-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/custom-error-response))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation/create-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalidation (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.invalidation/id :portkey.aws.cloudfront.-2017-03-25.invalidation/status :portkey.aws.cloudfront.-2017-03-25.invalidation/create-time :portkey.aws.cloudfront.-2017-03-25/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-streaming-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-streaming-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-streaming-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/certificate-source #{"cloudfront" "acm" :acm :cloudfront :iam "iam"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/location-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/streaming-distribution :portkey.aws.cloudfront.-2017-03-25.get-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/key-pair-id-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-streaming-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-streaming-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-streaming-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/restrictions (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/geo-restriction] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-viewer-certificate/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-viewer-certificate/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-argument/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-argument (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-argument/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.streaming-distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-streaming-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.get-streaming-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.delete-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.delete-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/delete-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.delete-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2017-03-25.delete-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-cloud-front-origin-access-identity-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.get-cloud-front-origin-access-identity-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-certificates/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-certificates (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-certificates/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution/in-progress-invalidation-batches (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.distribution/id :portkey.aws.cloudfront.-2017-03-25.distribution/arn :portkey.aws.cloudfront.-2017-03-25.distribution/status :portkey.aws.cloudfront.-2017-03-25.distribution/last-modified-time :portkey.aws.cloudfront.-2017-03-25.distribution/in-progress-invalidation-batches :portkey.aws.cloudfront.-2017-03-25.distribution/domain-name :portkey.aws.cloudfront.-2017-03-25/active-trusted-signers :portkey.aws.cloudfront.-2017-03-25/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/marker :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/max-items :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/is-truncated :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/next-marker :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.lambda-function-association/lambda-function-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/lambda-function-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.lambda-function-association/lambda-function-arn :portkey.aws.cloudfront.-2017-03-25/event-type]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.forwarded-values/query-string (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.forwarded-values/cookies (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/cookie-preference))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/forwarded-values (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.forwarded-values/query-string :portkey.aws.cloudfront.-2017-03-25.forwarded-values/cookies] :opt-un [:portkey.aws.cloudfront.-2017-03-25/headers :portkey.aws.cloudfront.-2017-03-25/query-string-cache-keys]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.access-denied/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/access-denied (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.access-denied/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation-batch/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalidation-batch (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/paths :portkey.aws.cloudfront.-2017-03-25.invalidation-batch/caller-reference] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalidation-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/invalidation-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.delete-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.delete-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/delete-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.delete-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2017-03-25.delete-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/query-string-cache-keys-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/marker :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/max-items :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/is-truncated :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/next-marker :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/item-selection #{"none" "whitelist" :all "all" :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-tags-for-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.list-tags-for-resource-request/resource] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/streaming-distribution (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.streaming-distribution/id :portkey.aws.cloudfront.-2017-03-25.streaming-distribution/arn :portkey.aws.cloudfront.-2017-03-25.streaming-distribution/status :portkey.aws.cloudfront.-2017-03-25.streaming-distribution/domain-name :portkey.aws.cloudfront.-2017-03-25/active-trusted-signers :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-config] :opt-un [:portkey.aws.cloudfront.-2017-03-25.streaming-distribution/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.lambda-function-associations/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.lambda-function-associations/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/lambda-function-association-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/lambda-function-associations (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.lambda-function-associations/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.lambda-function-associations/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/viewer-protocol-policy #{"allow-all" :redirecttohttps :httpsonly "https-only" "redirect-to-https" :allowall})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-lambda-function-association/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-lambda-function-association (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-lambda-function-association/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-error-response/error-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-error-response/response-page-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-error-response/response-code (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-error-response/error-caching-min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/custom-error-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.custom-error-response/error-code] :opt-un [:portkey.aws.cloudfront.-2017-03-25.custom-error-response/response-page-path :portkey.aws.cloudfront.-2017-03-25.custom-error-response/response-code :portkey.aws.cloudfront.-2017-03-25.custom-error-response/error-caching-min-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.signer/aws-account-number (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/signer (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.signer/aws-account-number :portkey.aws.cloudfront.-2017-03-25/key-pair-ids]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.no-such-resource/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/no-such-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.no-such-resource/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/origin-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/origin :min-count 1))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.update-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/update-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2017-03-25.update-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-error-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-error-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-error-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.delete-service-linked-role-request/role-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/delete-service-linked-role-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.delete-service-linked-role-request/role-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cached-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cached-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cached-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.cached-methods/quantity :portkey.aws.cloudfront.-2017-03-25.cached-methods/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21055__auto__] (clojure.core/<= 1 (clojure.core/count s__21055__auto__))) (clojure.core/fn [s__21056__auto__] (clojure.core/< (clojure.core/count s__21056__auto__) 128)) (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21057__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-lambda-function-associations/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-lambda-function-associations (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-lambda-function-associations/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-streaming-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/streaming-distribution :portkey.aws.cloudfront.-2017-03-25.create-streaming-distribution-result/location :portkey.aws.cloudfront.-2017-03-25.create-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.tags/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/tag-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/tags (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.tags/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cache-behaviors/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cache-behaviors/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/cache-behavior-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cache-behaviors (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.cache-behaviors/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.cache-behaviors/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cache-behavior/path-pattern (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.cache-behavior/path-pattern :portkey.aws.cloudfront.-2017-03-25.cache-behavior/target-origin-id :portkey.aws.cloudfront.-2017-03-25/forwarded-values :portkey.aws.cloudfront.-2017-03-25/trusted-signers :portkey.aws.cloudfront.-2017-03-25/viewer-protocol-policy :portkey.aws.cloudfront.-2017-03-25.cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2017-03-25.cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2017-03-25.cache-behavior/compress :portkey.aws.cloudfront.-2017-03-25/lambda-function-associations :portkey.aws.cloudfront.-2017-03-25.cache-behavior/max-ttl :portkey.aws.cloudfront.-2017-03-25/allowed-methods :portkey.aws.cloudfront.-2017-03-25.cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-streaming-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-streaming-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-streaming-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.list-streaming-distributions-request/marker :portkey.aws.cloudfront.-2017-03-25.list-streaming-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.active-trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.active-trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.active-trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/signer-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/active-trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.active-trusted-signers/enabled :portkey.aws.cloudfront.-2017-03-25.active-trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.active-trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-relative-path/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-relative-path (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-relative-path/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.origin/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.origin/origin-path (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.origin/id :portkey.aws.cloudfront.-2017-03-25.origin/domain-name] :opt-un [:portkey.aws.cloudfront.-2017-03-25.origin/origin-path :portkey.aws.cloudfront.-2017-03-25/custom-headers :portkey.aws.cloudfront.-2017-03-25/s-3-origin-config :portkey.aws.cloudfront.-2017-03-25/custom-origin-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-location-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-location-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-location-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-web-acl-id/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-web-acl-id (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-web-acl-id/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-cloud-front-origin-access-identities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-cloud-front-origin-access-identities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-cloud-front-origin-access-identities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.get-cloud-front-origin-access-identity-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-error-responses/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-error-responses/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/custom-error-response-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/custom-error-responses (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.custom-error-responses/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.custom-error-responses/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalidation-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/invalidation-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalidation-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.invalidation-list/marker :portkey.aws.cloudfront.-2017-03-25.invalidation-list/max-items :portkey.aws.cloudfront.-2017-03-25.invalidation-list/is-truncated :portkey.aws.cloudfront.-2017-03-25.invalidation-list/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalidation-list/next-marker :portkey.aws.cloudfront.-2017-03-25.invalidation-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.origin-ssl-protocols/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.origin-ssl-protocols/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/ssl-protocols-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/origin-ssl-protocols (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.origin-ssl-protocols/quantity :portkey.aws.cloudfront.-2017-03-25.origin-ssl-protocols/items] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.aliases/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.aliases/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/alias-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/aliases (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.aliases/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.aliases/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/event-type #{:viewerresponse :originresponse :viewerrequest "viewer-response" :originrequest "origin-response" "origin-request" "viewer-request"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.update-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/update-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/distribution :portkey.aws.cloudfront.-2017-03-25.update-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2017-03-25.get-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.get-streaming-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.allowed-methods/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.allowed-methods/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/methods-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/allowed-methods (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.allowed-methods/quantity :portkey.aws.cloudfront.-2017-03-25.allowed-methods/items] :opt-un [:portkey.aws.cloudfront.-2017-03-25/cached-methods]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/price-class #{"PriceClass_200" :price-class-100 :price-class-200 "PriceClass_All" :price-class-all "PriceClass_100"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-origin-config/http-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-origin-config/https-port (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-origin-config/origin-read-timeout (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-origin-config/origin-keepalive-timeout (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/custom-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.custom-origin-config/http-port :portkey.aws.cloudfront.-2017-03-25.custom-origin-config/https-port :portkey.aws.cloudfront.-2017-03-25/origin-protocol-policy] :opt-un [:portkey.aws.cloudfront.-2017-03-25/origin-ssl-protocols :portkey.aws.cloudfront.-2017-03-25.custom-origin-config/origin-read-timeout :portkey.aws.cloudfront.-2017-03-25.custom-origin-config/origin-keepalive-timeout]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-origins/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-origins (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-origins/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-ttl-order/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-ttl-order (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-ttl-order/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-distributions-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-distributions-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-distributions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.list-distributions-request/marker :portkey.aws.cloudfront.-2017-03-25.list-distributions-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.no-such-streaming-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/no-such-streaming-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.no-such-streaming-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.s-3-origin/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.s-3-origin/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/s-3-origin (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.s-3-origin/domain-name :portkey.aws.cloudfront.-2017-03-25.s-3-origin/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-cloud-front-origin-access-identity-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-cloud-front-origin-access-identity-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-cloud-front-origin-access-identity-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity :portkey.aws.cloudfront.-2017-03-25.create-cloud-front-origin-access-identity-result/location :portkey.aws.cloudfront.-2017-03-25.create-cloud-front-origin-access-identity-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cname-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cname-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.cname-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/id :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/arn :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/status :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/last-modified-time :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/domain-name :portkey.aws.cloudfront.-2017-03-25/s-3-origin :portkey.aws.cloudfront.-2017-03-25/aliases :portkey.aws.cloudfront.-2017-03-25/trusted-signers :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/comment :portkey.aws.cloudfront.-2017-03-25/price-class :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-summary/enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-default-root-object/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-default-root-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-default-root-object/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity/id :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity/s-3-canonical-user-id] :opt-un [:portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-config]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.update-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.update-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/update-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2017-03-25.update-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2017-03-25.update-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.create-invalidation-request/distribution-id :portkey.aws.cloudfront.-2017-03-25/invalidation-batch] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.tag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.tag-resource-request/resource :portkey.aws.cloudfront.-2017-03-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-with-tags-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/streaming-distribution-config-with-tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-response-code/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-response-code (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-response-code/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cookie-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/tag))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.query-string-cache-keys/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.query-string-cache-keys/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/query-string-cache-keys-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/query-string-cache-keys (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.query-string-cache-keys/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.query-string-cache-keys/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.no-such-invalidation/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/no-such-invalidation (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.no-such-invalidation/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-distribution-config-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-distribution-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.get-distribution-config-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.key-pair-ids/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.key-pair-ids/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/key-pair-id-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/key-pair-ids (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.key-pair-ids/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.key-pair-ids/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-config/default-root-object (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-config/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-config/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.distribution-config/caller-reference :portkey.aws.cloudfront.-2017-03-25/origins :portkey.aws.cloudfront.-2017-03-25/default-cache-behavior :portkey.aws.cloudfront.-2017-03-25.distribution-config/comment :portkey.aws.cloudfront.-2017-03-25.distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2017-03-25.distribution-config/default-root-object :portkey.aws.cloudfront.-2017-03-25.distribution-config/is-ipv-6-enabled :portkey.aws.cloudfront.-2017-03-25/restrictions :portkey.aws.cloudfront.-2017-03-25.distribution-config/web-acl-id :portkey.aws.cloudfront.-2017-03-25.distribution-config/logging :portkey.aws.cloudfront.-2017-03-25/cache-behaviors :portkey.aws.cloudfront.-2017-03-25/custom-error-responses :portkey.aws.cloudfront.-2017-03-25/aliases :portkey.aws.cloudfront.-2017-03-25/price-class :portkey.aws.cloudfront.-2017-03-25/http-version :portkey.aws.cloudfront.-2017-03-25/viewer-certificate]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-invalidations-in-progress/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-invalidations-in-progress (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-invalidations-in-progress/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/streaming-distribution-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-cloud-front-origin-access-identities-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-forward-cookies/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-forward-cookies (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-forward-cookies/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/distribution-config :portkey.aws.cloudfront.-2017-03-25.get-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-required-protocol/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-required-protocol (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-required-protocol/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/ssl-protocols-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/ssl-protocol))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/aws-account-number-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21055__auto__] (clojure.core/<= 0 (clojure.core/count s__21055__auto__))) (clojure.core/fn [s__21056__auto__] (clojure.core/< (clojure.core/count s__21056__auto__) 256)) (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21057__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/method #{"DELETE" :get "OPTIONS" :patch "PATCH" :delete :head "HEAD" "POST" :post :options :put "GET" "PUT"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/distribution :portkey.aws.cloudfront.-2017-03-25.get-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/alias-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-streaming-distribution-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/streaming-distribution-config :portkey.aws.cloudfront.-2017-03-25.get-streaming-distribution-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/origin-custom-headers-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/origin-custom-header))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.get-distribution-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/origin-protocol-policy #{"match-viewer" :matchviewer :httpsonly :httponly "https-only" "http-only"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/signer-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/signer))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-headers-for-s-3-origin/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-headers-for-s-3-origin (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-headers-for-s-3-origin/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/path-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-distribution-cnam-es/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-distribution-cnam-es (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-distribution-cnam-es/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/geo-restriction-type #{"none" "whitelist" "blacklist" :blacklist :whitelist :none})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-geo-restriction-parameter/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-geo-restriction-parameter (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-geo-restriction-parameter/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.no-such-cloud-front-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/no-such-cloud-front-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.no-such-cloud-front-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-invalidations-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/invalidation-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.paths/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.paths/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/path-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/paths (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.paths/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.paths/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.batch-too-large/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/batch-too-large (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.batch-too-large/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/distribution :portkey.aws.cloudfront.-2017-03-25.create-distribution-with-tags-result/location :portkey.aws.cloudfront.-2017-03-25.create-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.update-streaming-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.update-streaming-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/update-streaming-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/streaming-distribution-config :portkey.aws.cloudfront.-2017-03-25.update-streaming-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2017-03-25.update-streaming-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-streaming-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/streaming-distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-streaming-distribution-with-tags-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-streaming-distribution-with-tags-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-with-tags-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/streaming-distribution :portkey.aws.cloudfront.-2017-03-25.create-streaming-distribution-with-tags-result/location :portkey.aws.cloudfront.-2017-03-25.create-streaming-distribution-with-tags-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-invalidation-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.create-invalidation-result/location :portkey.aws.cloudfront.-2017-03-25/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.missing-body/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/missing-body (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.missing-body/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-origin-read-timeout/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-origin-read-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-origin-read-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-summary/s-3-canonical-user-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-summary/id :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-summary/s-3-canonical-user-id :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-summary/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-cloud-front-origin-access-identity-config-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-config-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-config :portkey.aws.cloudfront.-2017-03-25.get-cloud-front-origin-access-identity-config-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cache-behavior-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/cache-behavior))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.origin-custom-header/header-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.origin-custom-header/header-value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/origin-custom-header (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.origin-custom-header/header-name :portkey.aws.cloudfront.-2017-03-25.origin-custom-header/header-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-config/logging (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/streaming-logging-config))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.streaming-distribution-config/caller-reference :portkey.aws.cloudfront.-2017-03-25/s-3-origin :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-config/comment :portkey.aws.cloudfront.-2017-03-25/trusted-signers :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-config/enabled] :opt-un [:portkey.aws.cloudfront.-2017-03-25/aliases :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-config/logging :portkey.aws.cloudfront.-2017-03-25/price-class]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-not-disabled/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/distribution-not-disabled (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.distribution-not-disabled/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.precondition-failed/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/precondition-failed (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.precondition-failed/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.s-3-origin-config/origin-access-identity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/s-3-origin-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.s-3-origin-config/origin-access-identity] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-summary-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-summary))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-origin-access-identity/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-origin-access-identity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-origin-access-identity/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.tag/key (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.tag/value (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.tag/key] :opt-un [:portkey.aws.cloudfront.-2017-03-25.tag/value]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-trusted-signers/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-trusted-signers (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-trusted-signers/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-logging-config/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-logging-config/bucket (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-logging-config/prefix (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/streaming-logging-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.streaming-logging-config/enabled :portkey.aws.cloudfront.-2017-03-25.streaming-logging-config/bucket :portkey.aws.cloudfront.-2017-03-25.streaming-logging-config/prefix] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-minimum-protocol-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-minimum-protocol-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-minimum-protocol-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-summary/is-ipv-6-enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-summary/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-summary/web-acl-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-summary/arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-summary/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-summary/status (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-summary/domain-name (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-summary/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/distribution-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.distribution-summary/id :portkey.aws.cloudfront.-2017-03-25.distribution-summary/arn :portkey.aws.cloudfront.-2017-03-25.distribution-summary/status :portkey.aws.cloudfront.-2017-03-25.distribution-summary/last-modified-time :portkey.aws.cloudfront.-2017-03-25.distribution-summary/domain-name :portkey.aws.cloudfront.-2017-03-25/aliases :portkey.aws.cloudfront.-2017-03-25/origins :portkey.aws.cloudfront.-2017-03-25/default-cache-behavior :portkey.aws.cloudfront.-2017-03-25/cache-behaviors :portkey.aws.cloudfront.-2017-03-25/custom-error-responses :portkey.aws.cloudfront.-2017-03-25.distribution-summary/comment :portkey.aws.cloudfront.-2017-03-25/price-class :portkey.aws.cloudfront.-2017-03-25.distribution-summary/enabled :portkey.aws.cloudfront.-2017-03-25/viewer-certificate :portkey.aws.cloudfront.-2017-03-25/restrictions :portkey.aws.cloudfront.-2017-03-25.distribution-summary/web-acl-id :portkey.aws.cloudfront.-2017-03-25/http-version :portkey.aws.cloudfront.-2017-03-25.distribution-summary/is-ipv-6-enabled] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/ssl-protocol #{"TLSv1" :tl-sv-12 :tl-sv-1 "TLSv1.2" :ss-lv-3 "SSLv3" "TLSv1.1" :tl-sv-11})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.streaming-distribution-already-exists/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-already-exists (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.streaming-distribution-already-exists/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/lambda-function-association-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/lambda-function-association))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/header-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.headers/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/minimum-protocol-version #{"TLSv1" :tl-sv-1 "TLSv1_2016" :tl-sv-12-2018 :ss-lv-3 "TLSv1.2_2018" "SSLv3" :tl-sv-11-2016 :tl-sv-1-2016 "TLSv1.1_2016"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.origins/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.origins/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/origin-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/origins (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.origins/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.origins/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/distribution-config-with-tags (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/distribution-config :portkey.aws.cloudfront.-2017-03-25/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/header-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/string))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-if-match-version/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-if-match-version (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-if-match-version/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-distribution-result/location (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.create-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/create-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/distribution :portkey.aws.cloudfront.-2017-03-25.create-distribution-result/location :portkey.aws.cloudfront.-2017-03-25.create-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.delete-cloud-front-origin-access-identity-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.delete-cloud-front-origin-access-identity-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/delete-cloud-front-origin-access-identity-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.delete-cloud-front-origin-access-identity-request/id] :opt-un [:portkey.aws.cloudfront.-2017-03-25.delete-cloud-front-origin-access-identity-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-distributions/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-distributions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-distributions/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.no-such-distribution/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/no-such-distribution (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.no-such-distribution/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-invalidation-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.get-invalidation-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-invalidation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.get-invalidation-request/distribution-id :portkey.aws.cloudfront.-2017-03-25.get-invalidation-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21057__auto__] (clojure.core/re-matches #"arn:aws:cloudfront::[0-9]+:.*" s__21057__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-list/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-list/next-marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-list/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-list/is-truncated (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-list/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.distribution-list/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/distribution-summary-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/distribution-list (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.distribution-list/marker :portkey.aws.cloudfront.-2017-03-25.distribution-list/max-items :portkey.aws.cloudfront.-2017-03-25.distribution-list/is-truncated :portkey.aws.cloudfront.-2017-03-25.distribution-list/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.distribution-list/next-marker :portkey.aws.cloudfront.-2017-03-25.distribution-list/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.update-streaming-distribution-result/e-tag (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/update-streaming-distribution-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/streaming-distribution :portkey.aws.cloudfront.-2017-03-25.update-streaming-distribution-result/e-tag]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.illegal-update/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/illegal-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.illegal-update/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/ssl-support-method #{"sni-only" :snionly :vip "vip"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/http-version #{:http-11 "http2" :http-2 "http1.1"})

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cookie-preference/forward (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/item-selection))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cookie-preference/whitelisted-names (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/cookie-names))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cookie-preference (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.cookie-preference/forward] :opt-un [:portkey.aws.cloudfront.-2017-03-25.cookie-preference/whitelisted-names]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-headers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.custom-headers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/origin-custom-headers-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/custom-headers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.custom-headers/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.custom-headers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-origin-keepalive-timeout/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-origin-keepalive-timeout (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-origin-keepalive-timeout/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.inconsistent-quantities/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/inconsistent-quantities (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.inconsistent-quantities/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-distributions-by-web-acl-id-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-invalidations-request/distribution-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-invalidations-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-invalidations-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-invalidations-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.list-invalidations-request/distribution-id] :opt-un [:portkey.aws.cloudfront.-2017-03-25.list-invalidations-request/marker :portkey.aws.cloudfront.-2017-03-25.list-invalidations-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-query-string-parameters/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-query-string-parameters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-query-string-parameters/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/methods-list (clojure.spec.alpha/coll-of :portkey.aws.cloudfront.-2017-03-25/method))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.untag-resource-request/resource (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/resource-arn))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.untag-resource-request/resource :portkey.aws.cloudfront.-2017-03-25/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.invalid-tagging/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/invalid-tagging (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.invalid-tagging/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/smooth-streaming (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/compress (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/target-origin-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/min-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/max-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/default-ttl (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/long))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/default-cache-behavior (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/target-origin-id :portkey.aws.cloudfront.-2017-03-25/forwarded-values :portkey.aws.cloudfront.-2017-03-25/trusted-signers :portkey.aws.cloudfront.-2017-03-25/viewer-protocol-policy :portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/min-ttl] :opt-un [:portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/smooth-streaming :portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/compress :portkey.aws.cloudfront.-2017-03-25/lambda-function-associations :portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/max-ttl :portkey.aws.cloudfront.-2017-03-25/allowed-methods :portkey.aws.cloudfront.-2017-03-25.default-cache-behavior/default-ttl]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.trusted-signers/enabled (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.trusted-signers/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.trusted-signers/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/aws-account-number-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/trusted-signers (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.trusted-signers/enabled :portkey.aws.cloudfront.-2017-03-25.trusted-signers/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.trusted-signers/items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-distributions-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/distribution-list]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.trusted-signer-does-not-exist/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/trusted-signer-does-not-exist (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.trusted-signer-does-not-exist/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.update-distribution-request/id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.update-distribution-request/if-match (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/update-distribution-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25/distribution-config :portkey.aws.cloudfront.-2017-03-25.update-distribution-request/id] :opt-un [:portkey.aws.cloudfront.-2017-03-25.update-distribution-request/if-match]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.resource-in-use/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/resource-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.resource-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/get-invalidation-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25/invalidation]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.too-many-headers-in-forwarded-values/message (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/too-many-headers-in-forwarded-values (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.too-many-headers-in-forwarded-values/message]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.viewer-certificate/cloud-front-default-certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.viewer-certificate/iam-certificate-id (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.viewer-certificate/acm-certificate-arn (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.viewer-certificate/certificate (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/viewer-certificate (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.viewer-certificate/cloud-front-default-certificate :portkey.aws.cloudfront.-2017-03-25.viewer-certificate/iam-certificate-id :portkey.aws.cloudfront.-2017-03-25.viewer-certificate/acm-certificate-arn :portkey.aws.cloudfront.-2017-03-25/ssl-support-method :portkey.aws.cloudfront.-2017-03-25/minimum-protocol-version :portkey.aws.cloudfront.-2017-03-25.viewer-certificate/certificate :portkey.aws.cloudfront.-2017-03-25/certificate-source]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-cloud-front-origin-access-identities-request/marker (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.list-cloud-front-origin-access-identities-request/max-items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/list-cloud-front-origin-access-identities-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudfront.-2017-03-25.list-cloud-front-origin-access-identities-request/marker :portkey.aws.cloudfront.-2017-03-25.list-cloud-front-origin-access-identities-request/max-items]))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-config/caller-reference (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-config/comment (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/string))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-config (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-config/caller-reference :portkey.aws.cloudfront.-2017-03-25.cloud-front-origin-access-identity-config/comment] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.geo-restriction/restriction-type (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/geo-restriction-type))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.geo-restriction/quantity (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/integer))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25.geo-restriction/items (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/location-list))
(clojure.spec.alpha/def :portkey.aws.cloudfront.-2017-03-25/geo-restriction (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudfront.-2017-03-25.geo-restriction/restriction-type :portkey.aws.cloudfront.-2017-03-25.geo-restriction/quantity] :opt-un [:portkey.aws.cloudfront.-2017-03-25.geo-restriction/items]))

(clojure.core/defn tag-resource-2017-03-25 ([tag-resource-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/tagging?Operation=Tag", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/tag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource2017_03_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2017-03-25/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2017-03-25/no-such-resource}})))))
(clojure.spec.alpha/fdef tag-resource-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-distribution-2017-03-25 ([get-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-distribution-request get-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/get-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distribution/{Id}", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/get-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistribution2017_03_25", :http.request.configuration/output-deser-fn response-get-distribution-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/get-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/get-distribution-result))

(clojure.core/defn create-streaming-distribution-with-tags-2017-03-25 ([create-streaming-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-streaming-distribution-with-tags-request create-streaming-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/streaming-distribution?WithTags", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistributionWithTags2017_03_25", :http.request.configuration/output-deser-fn response-create-streaming-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2017-03-25/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2017-03-25/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2017-03-25/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2017-03-25/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2017-03-25/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2017-03-25/inconsistent-quantities, "InvalidTagging" :portkey.aws.cloudfront.-2017-03-25/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2017-03-25/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-with-tags-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-with-tags-result))

(clojure.core/defn update-distribution-2017-03-25 ([update-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-distribution-request update-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/update-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distribution/{Id}/config", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/update-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateDistribution2017_03_25", :http.request.configuration/output-deser-fn response-update-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2017-03-25/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2017-03-25/no-such-origin, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2017-03-25/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2017-03-25/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2017-03-25/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2017-03-25/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2017-03-25/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2017-03-25/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2017-03-25/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2017-03-25/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2017-03-25/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2017-03-25/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2017-03-25/invalid-web-acl-id, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2017-03-25/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2017-03-25/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2017-03-25/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2017-03-25/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2017-03-25/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2017-03-25/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2017-03-25/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2017-03-25/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2017-03-25/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2017-03-25/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2017-03-25/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-read-timeout, "PreconditionFailed" :portkey.aws.cloudfront.-2017-03-25/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2017-03-25/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2017-03-25/invalid-minimum-protocol-version, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2017-03-25/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-distribution, "IllegalUpdate" :portkey.aws.cloudfront.-2017-03-25/illegal-update, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2017-03-25/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2017-03-25/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2017-03-25/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2017-03-25/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef update-distribution-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/update-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/update-distribution-result))

(clojure.core/defn delete-streaming-distribution-2017-03-25 ([delete-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-streaming-distribution-request delete-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/streaming-distribution/{Id}", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/delete-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStreamingDistribution2017_03_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "StreamingDistributionNotDisabled" :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2017-03-25/invalid-if-match-version, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-streaming-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2017-03-25/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-streaming-distribution-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/delete-streaming-distribution-request) :ret clojure.core/true?)

(clojure.core/defn delete-cloud-front-origin-access-identity-2017-03-25 ([delete-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-cloud-front-origin-access-identity-request delete-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/delete-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCloudFrontOriginAccessIdentity2017_03_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2017-03-25/invalid-if-match-version, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2017-03-25/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2017-03-25/precondition-failed, "CloudFrontOriginAccessIdentityInUse" :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-in-use}})))))
(clojure.spec.alpha/fdef delete-cloud-front-origin-access-identity-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/delete-cloud-front-origin-access-identity-request) :ret clojure.core/true?)

(clojure.core/defn create-distribution-with-tags-2017-03-25 ([create-distribution-with-tags-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-distribution-with-tags-request create-distribution-with-tags-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/create-distribution-with-tags-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distribution?WithTags", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/create-distribution-with-tags-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistributionWithTags2017_03_25", :http.request.configuration/output-deser-fn response-create-distribution-with-tags-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2017-03-25/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2017-03-25/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2017-03-25/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2017-03-25/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2017-03-25/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2017-03-25/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2017-03-25/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2017-03-25/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2017-03-25/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2017-03-25/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2017-03-25/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2017-03-25/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2017-03-25/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2017-03-25/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2017-03-25/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2017-03-25/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2017-03-25/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2017-03-25/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2017-03-25/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2017-03-25/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2017-03-25/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2017-03-25/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2017-03-25/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2017-03-25/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2017-03-25/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2017-03-25/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2017-03-25/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2017-03-25/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2017-03-25/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2017-03-25/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2017-03-25/too-many-query-string-parameters, "InvalidTagging" :portkey.aws.cloudfront.-2017-03-25/invalid-tagging, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2017-03-25/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2017-03-25/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-with-tags-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/create-distribution-with-tags-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/create-distribution-with-tags-result))

(clojure.core/defn get-invalidation-2017-03-25 ([get-invalidation-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-invalidation-request get-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/get-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distribution/{DistributionId}/invalidation/{Id}", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/get-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetInvalidation2017_03_25", :http.request.configuration/output-deser-fn response-get-invalidation-result, :http.request.spec/error-spec {"NoSuchInvalidation" :portkey.aws.cloudfront.-2017-03-25/no-such-invalidation, "NoSuchDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied}})))))
(clojure.spec.alpha/fdef get-invalidation-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/get-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/get-invalidation-result))

(clojure.core/defn create-streaming-distribution-2017-03-25 ([create-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-streaming-distribution-request create-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/streaming-distribution", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamingDistribution2017_03_25", :http.request.configuration/output-deser-fn response-create-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributions" :portkey.aws.cloudfront.-2017-03-25/too-many-streaming-distributions, "TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2017-03-25/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "InvalidOrigin" :portkey.aws.cloudfront.-2017-03-25/invalid-origin, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2017-03-25/missing-body, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2017-03-25/too-many-trusted-signers, "StreamingDistributionAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/streaming-distribution-already-exists, "InconsistentQuantities" :portkey.aws.cloudfront.-2017-03-25/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2017-03-25/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef create-streaming-distribution-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/create-streaming-distribution-result))

(clojure.core/defn list-tags-for-resource-2017-03-25 ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/list-tags-for-resource-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/tagging", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/list-tags-for-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource2017_03_25", :http.request.configuration/output-deser-fn response-list-tags-for-resource-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2017-03-25/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2017-03-25/no-such-resource}})))))
(clojure.spec.alpha/fdef list-tags-for-resource-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/list-tags-for-resource-result))

(clojure.core/defn get-streaming-distribution-2017-03-25 ([get-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-streaming-distribution-request get-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/streaming-distribution/{Id}", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistribution2017_03_25", :http.request.configuration/output-deser-fn response-get-streaming-distribution-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-result))

(clojure.core/defn create-distribution-2017-03-25 ([create-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-distribution-request create-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/create-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distribution", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/create-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateDistribution2017_03_25", :http.request.configuration/output-deser-fn response-create-distribution-result, :http.request.spec/error-spec {"TooManyDistributionsWithLambdaAssociations" :portkey.aws.cloudfront.-2017-03-25/too-many-distributions-with-lambda-associations, "NoSuchOrigin" :portkey.aws.cloudfront.-2017-03-25/no-such-origin, "InvalidProtocolSettings" :portkey.aws.cloudfront.-2017-03-25/invalid-protocol-settings, "TooManyCookieNamesInWhiteList" :portkey.aws.cloudfront.-2017-03-25/too-many-cookie-names-in-white-list, "TooManyCacheBehaviors" :portkey.aws.cloudfront.-2017-03-25/too-many-cache-behaviors, "TooManyOriginCustomHeaders" :portkey.aws.cloudfront.-2017-03-25/too-many-origin-custom-headers, "InvalidViewerCertificate" :portkey.aws.cloudfront.-2017-03-25/invalid-viewer-certificate, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "TooManyCertificates" :portkey.aws.cloudfront.-2017-03-25/too-many-certificates, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "InvalidLambdaFunctionAssociation" :portkey.aws.cloudfront.-2017-03-25/invalid-lambda-function-association, "InvalidErrorCode" :portkey.aws.cloudfront.-2017-03-25/invalid-error-code, "TooManyLambdaFunctionAssociations" :portkey.aws.cloudfront.-2017-03-25/too-many-lambda-function-associations, "InvalidRelativePath" :portkey.aws.cloudfront.-2017-03-25/invalid-relative-path, "InvalidLocationCode" :portkey.aws.cloudfront.-2017-03-25/invalid-location-code, "InvalidWebACLId" :portkey.aws.cloudfront.-2017-03-25/invalid-web-acl-id, "InvalidOrigin" :portkey.aws.cloudfront.-2017-03-25/invalid-origin, "InvalidQueryStringParameters" :portkey.aws.cloudfront.-2017-03-25/invalid-query-string-parameters, "TooManyOrigins" :portkey.aws.cloudfront.-2017-03-25/too-many-origins, "InvalidTTLOrder" :portkey.aws.cloudfront.-2017-03-25/invalid-ttl-order, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/cname-already-exists, "InvalidDefaultRootObject" :portkey.aws.cloudfront.-2017-03-25/invalid-default-root-object, "InvalidResponseCode" :portkey.aws.cloudfront.-2017-03-25/invalid-response-code, "InvalidForwardCookies" :portkey.aws.cloudfront.-2017-03-25/invalid-forward-cookies, "InvalidRequiredProtocol" :portkey.aws.cloudfront.-2017-03-25/invalid-required-protocol, "InvalidHeadersForS3Origin" :portkey.aws.cloudfront.-2017-03-25/invalid-headers-for-s-3-origin, "TooManyDistributionCNAMEs" :portkey.aws.cloudfront.-2017-03-25/too-many-distribution-cnam-es, "InvalidGeoRestrictionParameter" :portkey.aws.cloudfront.-2017-03-25/invalid-geo-restriction-parameter, "MissingBody" :portkey.aws.cloudfront.-2017-03-25/missing-body, "InvalidOriginReadTimeout" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-read-timeout, "DistributionAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/distribution-already-exists, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2017-03-25/too-many-trusted-signers, "InvalidMinimumProtocolVersion" :portkey.aws.cloudfront.-2017-03-25/invalid-minimum-protocol-version, "TooManyDistributions" :portkey.aws.cloudfront.-2017-03-25/too-many-distributions, "InvalidOriginKeepaliveTimeout" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-keepalive-timeout, "InconsistentQuantities" :portkey.aws.cloudfront.-2017-03-25/inconsistent-quantities, "TooManyQueryStringParameters" :portkey.aws.cloudfront.-2017-03-25/too-many-query-string-parameters, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2017-03-25/trusted-signer-does-not-exist, "TooManyHeadersInForwardedValues" :portkey.aws.cloudfront.-2017-03-25/too-many-headers-in-forwarded-values}})))))
(clojure.spec.alpha/fdef create-distribution-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/create-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/create-distribution-result))

(clojure.core/defn get-streaming-distribution-config-2017-03-25 ([get-streaming-distribution-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-streaming-distribution-config-request get-streaming-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/streaming-distribution/{Id}/config", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetStreamingDistributionConfig2017_03_25", :http.request.configuration/output-deser-fn response-get-streaming-distribution-config-result, :http.request.spec/error-spec {"NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-streaming-distribution, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied}})))))
(clojure.spec.alpha/fdef get-streaming-distribution-config-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/get-streaming-distribution-config-result))

(clojure.core/defn list-distributions-2017-03-25 ([] (list-distributions-2017-03-25 {})) ([list-distributions-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-distributions-request list-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/list-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distribution", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/list-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributions2017_03_25", :http.request.configuration/output-deser-fn response-list-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument}})))))
(clojure.spec.alpha/fdef list-distributions-2017-03-25 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2017-03-25/list-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/list-distributions-result))

(clojure.core/defn get-cloud-front-origin-access-identity-config-2017-03-25 ([get-cloud-front-origin-access-identity-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-cloud-front-origin-access-identity-config-request get-cloud-front-origin-access-identity-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentityConfig2017_03_25", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-config-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2017-03-25/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-config-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-config-result))

(clojure.core/defn delete-service-linked-role-2017-03-25 ([delete-service-linked-role-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-service-linked-role-request delete-service-linked-role-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/service-linked-role/{RoleName}", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/delete-service-linked-role-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteServiceLinkedRole2017_03_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "ResourceInUse" :portkey.aws.cloudfront.-2017-03-25/resource-in-use, "NoSuchResource" :portkey.aws.cloudfront.-2017-03-25/no-such-resource}})))))
(clojure.spec.alpha/fdef delete-service-linked-role-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/delete-service-linked-role-request) :ret clojure.core/true?)

(clojure.core/defn list-invalidations-2017-03-25 ([list-invalidations-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-invalidations-request list-invalidations-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/list-invalidations-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/list-invalidations-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListInvalidations2017_03_25", :http.request.configuration/output-deser-fn response-list-invalidations-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied}})))))
(clojure.spec.alpha/fdef list-invalidations-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/list-invalidations-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/list-invalidations-result))

(clojure.core/defn untag-resource-2017-03-25 ([untag-resource-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/tagging?Operation=Untag", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/untag-resource-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource2017_03_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "InvalidTagging" :portkey.aws.cloudfront.-2017-03-25/invalid-tagging, "NoSuchResource" :portkey.aws.cloudfront.-2017-03-25/no-such-resource}})))))
(clojure.spec.alpha/fdef untag-resource-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn get-cloud-front-origin-access-identity-2017-03-25 ([get-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-cloud-front-origin-access-identity-request get-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/origin-access-identity/cloudfront/{Id}", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCloudFrontOriginAccessIdentity2017_03_25", :http.request.configuration/output-deser-fn response-get-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2017-03-25/no-such-cloud-front-origin-access-identity, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied}})))))
(clojure.spec.alpha/fdef get-cloud-front-origin-access-identity-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/get-cloud-front-origin-access-identity-result))

(clojure.core/defn update-cloud-front-origin-access-identity-2017-03-25 ([update-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-cloud-front-origin-access-identity-request update-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/update-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/origin-access-identity/cloudfront/{Id}/config", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/update-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCloudFrontOriginAccessIdentity2017_03_25", :http.request.configuration/output-deser-fn response-update-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "IllegalUpdate" :portkey.aws.cloudfront.-2017-03-25/illegal-update, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2017-03-25/invalid-if-match-version, "MissingBody" :portkey.aws.cloudfront.-2017-03-25/missing-body, "NoSuchCloudFrontOriginAccessIdentity" :portkey.aws.cloudfront.-2017-03-25/no-such-cloud-front-origin-access-identity, "PreconditionFailed" :portkey.aws.cloudfront.-2017-03-25/precondition-failed, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2017-03-25/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef update-cloud-front-origin-access-identity-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/update-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/update-cloud-front-origin-access-identity-result))

(clojure.core/defn update-streaming-distribution-2017-03-25 ([update-streaming-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-update-streaming-distribution-request update-streaming-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/update-streaming-distribution-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/streaming-distribution/{Id}/config", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/update-streaming-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateStreamingDistribution2017_03_25", :http.request.configuration/output-deser-fn response-update-streaming-distribution-result, :http.request.spec/error-spec {"TooManyStreamingDistributionCNAMEs" :portkey.aws.cloudfront.-2017-03-25/too-many-streaming-distribution-cnam-es, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "NoSuchStreamingDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-streaming-distribution, "CNAMEAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/cname-already-exists, "MissingBody" :portkey.aws.cloudfront.-2017-03-25/missing-body, "PreconditionFailed" :portkey.aws.cloudfront.-2017-03-25/precondition-failed, "InvalidOriginAccessIdentity" :portkey.aws.cloudfront.-2017-03-25/invalid-origin-access-identity, "TooManyTrustedSigners" :portkey.aws.cloudfront.-2017-03-25/too-many-trusted-signers, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2017-03-25/invalid-if-match-version, "IllegalUpdate" :portkey.aws.cloudfront.-2017-03-25/illegal-update, "InconsistentQuantities" :portkey.aws.cloudfront.-2017-03-25/inconsistent-quantities, "TrustedSignerDoesNotExist" :portkey.aws.cloudfront.-2017-03-25/trusted-signer-does-not-exist}})))))
(clojure.spec.alpha/fdef update-streaming-distribution-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/update-streaming-distribution-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/update-streaming-distribution-result))

(clojure.core/defn get-distribution-config-2017-03-25 ([get-distribution-config-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-get-distribution-config-request get-distribution-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/get-distribution-config-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distribution/{Id}/config", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/get-distribution-config-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDistributionConfig2017_03_25", :http.request.configuration/output-deser-fn response-get-distribution-config-result, :http.request.spec/error-spec {"NoSuchDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-distribution, "AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied}})))))
(clojure.spec.alpha/fdef get-distribution-config-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/get-distribution-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/get-distribution-config-result))

(clojure.core/defn list-cloud-front-origin-access-identities-2017-03-25 ([] (list-cloud-front-origin-access-identities-2017-03-25 {})) ([list-cloud-front-origin-access-identities-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-cloud-front-origin-access-identities-request list-cloud-front-origin-access-identities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/list-cloud-front-origin-access-identities-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/origin-access-identity/cloudfront", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/list-cloud-front-origin-access-identities-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCloudFrontOriginAccessIdentities2017_03_25", :http.request.configuration/output-deser-fn response-list-cloud-front-origin-access-identities-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument}})))))
(clojure.spec.alpha/fdef list-cloud-front-origin-access-identities-2017-03-25 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2017-03-25/list-cloud-front-origin-access-identities-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/list-cloud-front-origin-access-identities-result))

(clojure.core/defn list-streaming-distributions-2017-03-25 ([] (list-streaming-distributions-2017-03-25 {})) ([list-streaming-distributions-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-streaming-distributions-request list-streaming-distributions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/list-streaming-distributions-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/streaming-distribution", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/list-streaming-distributions-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamingDistributions2017_03_25", :http.request.configuration/output-deser-fn response-list-streaming-distributions-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument}})))))
(clojure.spec.alpha/fdef list-streaming-distributions-2017-03-25 :args (clojure.spec.alpha/? :portkey.aws.cloudfront.-2017-03-25/list-streaming-distributions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/list-streaming-distributions-result))

(clojure.core/defn delete-distribution-2017-03-25 ([delete-distribution-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-delete-distribution-request delete-distribution-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distribution/{Id}", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/delete-distribution-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :delete, :http.request.configuration/response-code 204, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteDistribution2017_03_25", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22006__auto__] {}), :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "DistributionNotDisabled" :portkey.aws.cloudfront.-2017-03-25/distribution-not-disabled, "InvalidIfMatchVersion" :portkey.aws.cloudfront.-2017-03-25/invalid-if-match-version, "NoSuchDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-distribution, "PreconditionFailed" :portkey.aws.cloudfront.-2017-03-25/precondition-failed}})))))
(clojure.spec.alpha/fdef delete-distribution-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/delete-distribution-request) :ret clojure.core/true?)

(clojure.core/defn create-invalidation-2017-03-25 ([create-invalidation-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-invalidation-request create-invalidation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/create-invalidation-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distribution/{DistributionId}/invalidation", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/create-invalidation-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateInvalidation2017_03_25", :http.request.configuration/output-deser-fn response-create-invalidation-result, :http.request.spec/error-spec {"AccessDenied" :portkey.aws.cloudfront.-2017-03-25/access-denied, "MissingBody" :portkey.aws.cloudfront.-2017-03-25/missing-body, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "NoSuchDistribution" :portkey.aws.cloudfront.-2017-03-25/no-such-distribution, "BatchTooLarge" :portkey.aws.cloudfront.-2017-03-25/batch-too-large, "TooManyInvalidationsInProgress" :portkey.aws.cloudfront.-2017-03-25/too-many-invalidations-in-progress, "InconsistentQuantities" :portkey.aws.cloudfront.-2017-03-25/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-invalidation-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/create-invalidation-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/create-invalidation-result))

(clojure.core/defn list-distributions-by-web-acl-id-2017-03-25 ([list-distributions-by-web-acl-id-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-list-distributions-by-web-acl-id-request list-distributions-by-web-acl-id-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/list-distributions-by-web-acl-id-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/distributionsByWebACLId/{WebACLId}", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/list-distributions-by-web-acl-id-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListDistributionsByWebACLId2017_03_25", :http.request.configuration/output-deser-fn response-list-distributions-by-web-acl-id-result, :http.request.spec/error-spec {"InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "InvalidWebACLId" :portkey.aws.cloudfront.-2017-03-25/invalid-web-acl-id}})))))
(clojure.spec.alpha/fdef list-distributions-by-web-acl-id-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/list-distributions-by-web-acl-id-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/list-distributions-by-web-acl-id-result))

(clojure.core/defn create-cloud-front-origin-access-identity-2017-03-25 ([create-cloud-front-origin-access-identity-requestinput] (clojure.core/let [request-function-result__22007__auto__ (req-create-cloud-front-origin-access-identity-request create-cloud-front-origin-access-identity-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22007__auto__ {:http.request.configuration/endpoints portkey.aws.cloudfront.-2017-03-25/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudfront.-2017-03-25/create-cloud-front-origin-access-identity-result, :http.request.configuration/mime-type {"content-type" "application/x-www-form-urlencoded; charset=utf-8"}, :http.request.configuration/request-uri "/2017-03-25/origin-access-identity/cloudfront", :http.request.configuration/version "2017-03-25", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudfront.-2017-03-25/create-cloud-front-origin-access-identity-request, :http.request.configuration/protocol "rest-xml", :http.request.configuration/method :post, :http.request.configuration/response-code 201, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCloudFrontOriginAccessIdentity2017_03_25", :http.request.configuration/output-deser-fn response-create-cloud-front-origin-access-identity-result, :http.request.spec/error-spec {"CloudFrontOriginAccessIdentityAlreadyExists" :portkey.aws.cloudfront.-2017-03-25/cloud-front-origin-access-identity-already-exists, "MissingBody" :portkey.aws.cloudfront.-2017-03-25/missing-body, "TooManyCloudFrontOriginAccessIdentities" :portkey.aws.cloudfront.-2017-03-25/too-many-cloud-front-origin-access-identities, "InvalidArgument" :portkey.aws.cloudfront.-2017-03-25/invalid-argument, "InconsistentQuantities" :portkey.aws.cloudfront.-2017-03-25/inconsistent-quantities}})))))
(clojure.spec.alpha/fdef create-cloud-front-origin-access-identity-2017-03-25 :args (clojure.spec.alpha/tuple :portkey.aws.cloudfront.-2017-03-25/create-cloud-front-origin-access-identity-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudfront.-2017-03-25/create-cloud-front-origin-access-identity-result))
