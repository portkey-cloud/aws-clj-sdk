(ns portkey.aws.signer (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-signing-material)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-platform-id)

(clojure.core/declare ser-signing-status)

(clojure.core/declare ser-prefix)

(clojure.core/declare ser-source)

(clojure.core/declare ser-s-3-source)

(clojure.core/declare ser-destination)

(clojure.core/declare ser-signing-platform-overrides)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-key)

(clojure.core/declare serbool)

(clojure.core/declare ser-signing-parameter-key)

(clojure.core/declare ser-string)

(clojure.core/declare ser-signing-parameter-value)

(clojure.core/declare ser-certificate-arn)

(clojure.core/declare ser-hash-algorithm)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-s-3-destination)

(clojure.core/declare ser-version)

(clojure.core/declare ser-encryption-algorithm)

(clojure.core/declare ser-bucket-name)

(clojure.core/declare ser-profile-name)

(clojure.core/declare ser-requested-by)

(clojure.core/declare ser-signing-parameters)

(clojure.core/declare ser-signing-configuration-overrides)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-signing-material [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-certificate-arn (:certificate-arn input)) #:http.request.field{:name "certificateArn", :shape "CertificateArn"})], :shape "SigningMaterial", :type "structure"}))

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-platform-id [input] #:http.request.field{:value input, :shape "PlatformId"})

(clojure.core/defn- ser-signing-status [input] #:http.request.field{:value (clojure.core/get {"InProgress" "InProgress", :in-progress "InProgress", "Failed" "Failed", :failed "Failed", "Succeeded" "Succeeded", :succeeded "Succeeded"} input), :shape "SigningStatus"})

(clojure.core/defn- ser-prefix [input] #:http.request.field{:value input, :shape "Prefix"})

(clojure.core/defn- ser-source [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Source", :type "structure"} (clojure.core/contains? input :s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-source (input :s-3)) #:http.request.field{:name "s3", :shape "S3Source"}))))

(clojure.core/defn- ser-s-3-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-name (:bucket-name input)) #:http.request.field{:name "bucketName", :shape "BucketName"}) (clojure.core/into (ser-key (:key input)) #:http.request.field{:name "key", :shape "Key"}) (clojure.core/into (ser-version (:version input)) #:http.request.field{:name "version", :shape "Version"})], :shape "S3Source", :type "structure"}))

(clojure.core/defn- ser-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Destination", :type "structure"} (clojure.core/contains? input :s-3) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-destination (input :s-3)) #:http.request.field{:name "s3", :shape "S3Destination"}))))

(clojure.core/defn- ser-signing-platform-overrides [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SigningPlatformOverrides", :type "structure"} (clojure.core/contains? input :signing-configuration) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-configuration-overrides (input :signing-configuration)) #:http.request.field{:name "signingConfiguration", :shape "SigningConfigurationOverrides"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-key [input] #:http.request.field{:value input, :shape "Key"})

(clojure.core/defn- serbool [input] #:http.request.field{:value input, :shape "bool"})

(clojure.core/defn- ser-signing-parameter-key [input] #:http.request.field{:value input, :shape "SigningParameterKey"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-signing-parameter-value [input] #:http.request.field{:value input, :shape "SigningParameterValue"})

(clojure.core/defn- ser-certificate-arn [input] #:http.request.field{:value input, :shape "CertificateArn"})

(clojure.core/defn- ser-hash-algorithm [input] #:http.request.field{:value (clojure.core/get {"SHA1" "SHA1", :sha-1 "SHA1", "SHA256" "SHA256", :sha-256 "SHA256"} input), :shape "HashAlgorithm"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-s-3-destination [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Destination", :type "structure"} (clojure.core/contains? input :bucket-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bucket-name (input :bucket-name)) #:http.request.field{:name "bucketName", :shape "BucketName"})) (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "prefix", :shape "Prefix"}))))

(clojure.core/defn- ser-version [input] #:http.request.field{:value input, :shape "Version"})

(clojure.core/defn- ser-encryption-algorithm [input] #:http.request.field{:value (clojure.core/get {"RSA" "RSA", :rsa "RSA", "ECDSA" "ECDSA", :ecdsa "ECDSA"} input), :shape "EncryptionAlgorithm"})

(clojure.core/defn- ser-bucket-name [input] #:http.request.field{:value input, :shape "BucketName"})

(clojure.core/defn- ser-profile-name [input] #:http.request.field{:value input, :shape "ProfileName"})

(clojure.core/defn- ser-requested-by [input] #:http.request.field{:value input, :shape "RequestedBy"})

(clojure.core/defn- ser-signing-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-signing-parameter-key k) #:http.request.field{:map-info "key", :shape "SigningParameterKey"}) (clojure.core/into (ser-signing-parameter-value v) #:http.request.field{:map-info "value", :shape "SigningParameterValue"})])) input), :shape "SigningParameters", :type "map"})

(clojure.core/defn- ser-signing-configuration-overrides [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SigningConfigurationOverrides", :type "structure"} (clojure.core/contains? input :encryption-algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-encryption-algorithm (input :encryption-algorithm)) #:http.request.field{:name "encryptionAlgorithm", :shape "EncryptionAlgorithm"})) (clojure.core/contains? input :hash-algorithm) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hash-algorithm (input :hash-algorithm)) #:http.request.field{:name "hashAlgorithm", :shape "HashAlgorithm"}))))

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-list-signing-platforms-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :category) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :category)) #:http.request.field{:name "category", :shape "String", :location "querystring", :location-name "category"})) (clojure.core/contains? input :partner) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :partner)) #:http.request.field{:name "partner", :shape "String", :location "querystring", :location-name "partner"})) (clojure.core/contains? input :target) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :target)) #:http.request.field{:name "target", :shape "String", :location "querystring", :location-name "target"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string (input :next-token)) #:http.request.field{:name "nextToken", :shape "String", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-put-signing-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "profileName", :shape "ProfileName", :location "uri", :location-name "profileName"})], :body [(clojure.core/into (ser-signing-material (input :signing-material)) #:http.request.field{:name "signingMaterial", :shape "SigningMaterial"}) (clojure.core/into (ser-platform-id (input :platform-id)) #:http.request.field{:name "platformId", :shape "PlatformId"})]} (clojure.core/contains? input :overrides) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-platform-overrides (input :overrides)) #:http.request.field{:name "overrides", :shape "SigningPlatformOverrides"})) (clojure.core/contains? input :signing-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-parameters (input :signing-parameters)) #:http.request.field{:name "signingParameters", :shape "SigningParameters"}))))

(clojure.core/defn- req-start-signing-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-source (input :source)) #:http.request.field{:name "source", :shape "Source"}) (clojure.core/into (ser-destination (input :destination)) #:http.request.field{:name "destination", :shape "Destination"}) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "clientRequestToken", :shape "ClientRequestToken", :idempotency-token true})]} (clojure.core/contains? input :profile-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "profileName", :shape "ProfileName"}))))

(clojure.core/defn- req-get-signing-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "profileName", :shape "ProfileName", :location "uri", :location-name "profileName"})]}))

(clojure.core/defn- req-list-signing-profiles-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :include-canceled) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serbool (input :include-canceled)) #:http.request.field{:name "includeCanceled", :shape "bool", :location "querystring", :location-name "includeCanceled"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-list-signing-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :status) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-signing-status (input :status)) #:http.request.field{:name "status", :shape "SigningStatus", :location "querystring", :location-name "status"})) (clojure.core/contains? input :platform-id) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-platform-id (input :platform-id)) #:http.request.field{:name "platformId", :shape "PlatformId", :location "querystring", :location-name "platformId"})) (clojure.core/contains? input :requested-by) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-requested-by (input :requested-by)) #:http.request.field{:name "requestedBy", :shape "RequestedBy", :location "querystring", :location-name "requestedBy"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults", :location "querystring", :location-name "maxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken", :location "querystring", :location-name "nextToken"}))))

(clojure.core/defn- req-cancel-signing-profile-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-profile-name (input :profile-name)) #:http.request.field{:name "profileName", :shape "ProfileName", :location "uri", :location-name "profileName"})]}))

(clojure.core/defn- req-describe-signing-job-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "jobId", :shape "JobId", :location "uri", :location-name "jobId"})]}))

(clojure.core/defn- req-get-signing-platform-request [input] (clojure.core/cond-> #:http.request.configuration{:uri [(clojure.core/into (ser-platform-id (input :platform-id)) #:http.request.field{:name "platformId", :shape "PlatformId", :location "uri", :location-name "platformId"})]}))

(clojure.spec.alpha/def :portkey.aws.signer/encryption-algorithms (clojure.spec.alpha/coll-of :portkey.aws.signer/encryption-algorithm))

(clojure.spec.alpha/def :portkey.aws.signer.list-signing-platforms-response/platforms (clojure.spec.alpha/and :portkey.aws.signer/signing-platforms))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-platforms-response/next-token (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer/list-signing-platforms-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.list-signing-platforms-response/platforms :portkey.aws.signer.list-signing-platforms-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer.put-signing-profile-response/arn (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer/put-signing-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.put-signing-profile-response/arn]))

(clojure.spec.alpha/def :portkey.aws.signer.signing-material/certificate-arn (clojure.spec.alpha/and :portkey.aws.signer/certificate-arn))
(clojure.spec.alpha/def :portkey.aws.signer/signing-material (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.signing-material/certificate-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer/client-request-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer/signing-jobs (clojure.spec.alpha/coll-of :portkey.aws.signer/signing-job))

(clojure.spec.alpha/def :portkey.aws.signer.validation-exception/message (clojure.spec.alpha/and :portkey.aws.signer/error-message))
(clojure.spec.alpha/def :portkey.aws.signer/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.signer/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer/platform-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer/completed-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.signer/signing-status #{"Failed" :in-progress "Succeeded" "InProgress" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.signer/prefix (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer/category #{:aws-io-t "AWSIoT"})

(clojure.spec.alpha/def :portkey.aws.signer.source/s-3 (clojure.spec.alpha/and :portkey.aws.signer/s-3-source))
(clojure.spec.alpha/def :portkey.aws.signer/source (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.source/s-3]))

(clojure.spec.alpha/def :portkey.aws.signer.s-3-signed-object/bucket-name (clojure.spec.alpha/and :portkey.aws.signer/bucket-name))
(clojure.spec.alpha/def :portkey.aws.signer/s-3-signed-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.s-3-signed-object/bucket-name :portkey.aws.signer/key]))

(clojure.spec.alpha/def :portkey.aws.signer/hash-algorithms (clojure.spec.alpha/coll-of :portkey.aws.signer/hash-algorithm))

(clojure.spec.alpha/def :portkey.aws.signer.internal-service-error-exception/message (clojure.spec.alpha/and :portkey.aws.signer/error-message))
(clojure.spec.alpha/def :portkey.aws.signer/internal-service-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.internal-service-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.signer.start-signing-job-response/job-id (clojure.spec.alpha/and :portkey.aws.signer/job-id))
(clojure.spec.alpha/def :portkey.aws.signer/start-signing-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.start-signing-job-response/job-id]))

(clojure.spec.alpha/def :portkey.aws.signer/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.s-3-source/bucket-name (clojure.spec.alpha/and :portkey.aws.signer/bucket-name))
(clojure.spec.alpha/def :portkey.aws.signer.s-3-source/key (clojure.spec.alpha/and :portkey.aws.signer/key))
(clojure.spec.alpha/def :portkey.aws.signer.s-3-source/version (clojure.spec.alpha/and :portkey.aws.signer/version))
(clojure.spec.alpha/def :portkey.aws.signer/s-3-source (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.s-3-source/bucket-name :portkey.aws.signer.s-3-source/key :portkey.aws.signer.s-3-source/version] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.list-signing-platforms-request/category (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-platforms-request/partner (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-platforms-request/target (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-platforms-request/max-results (clojure.spec.alpha/and :portkey.aws.signer/max-results))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-platforms-request/next-token (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer/list-signing-platforms-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.list-signing-platforms-request/category :portkey.aws.signer.list-signing-platforms-request/partner :portkey.aws.signer.list-signing-platforms-request/target :portkey.aws.signer.list-signing-platforms-request/max-results :portkey.aws.signer.list-signing-platforms-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer.destination/s-3 (clojure.spec.alpha/and :portkey.aws.signer/s-3-destination))
(clojure.spec.alpha/def :portkey.aws.signer/destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.destination/s-3]))

(clojure.spec.alpha/def :portkey.aws.signer.get-signing-profile-response/profile-name (clojure.spec.alpha/and :portkey.aws.signer/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-profile-response/signing-material (clojure.spec.alpha/and :portkey.aws.signer/signing-material))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-profile-response/platform-id (clojure.spec.alpha/and :portkey.aws.signer/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-profile-response/overrides (clojure.spec.alpha/and :portkey.aws.signer/signing-platform-overrides))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-profile-response/signing-parameters (clojure.spec.alpha/and :portkey.aws.signer/signing-parameters))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-profile-response/status (clojure.spec.alpha/and :portkey.aws.signer/signing-profile-status))
(clojure.spec.alpha/def :portkey.aws.signer/get-signing-profile-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.get-signing-profile-response/profile-name :portkey.aws.signer.get-signing-profile-response/signing-material :portkey.aws.signer.get-signing-profile-response/platform-id :portkey.aws.signer.get-signing-profile-response/overrides :portkey.aws.signer.get-signing-profile-response/signing-parameters :portkey.aws.signer.get-signing-profile-response/status]))

(clojure.spec.alpha/def :portkey.aws.signer.signing-platform-overrides/signing-configuration (clojure.spec.alpha/and :portkey.aws.signer/signing-configuration-overrides))
(clojure.spec.alpha/def :portkey.aws.signer/signing-platform-overrides (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.signing-platform-overrides/signing-configuration]))

(clojure.spec.alpha/def :portkey.aws.signer.signing-configuration/encryption-algorithm-options (clojure.spec.alpha/and :portkey.aws.signer/encryption-algorithm-options))
(clojure.spec.alpha/def :portkey.aws.signer.signing-configuration/hash-algorithm-options (clojure.spec.alpha/and :portkey.aws.signer/hash-algorithm-options))
(clojure.spec.alpha/def :portkey.aws.signer/signing-configuration (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.signing-configuration/encryption-algorithm-options :portkey.aws.signer.signing-configuration/hash-algorithm-options] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.put-signing-profile-request/profile-name (clojure.spec.alpha/and :portkey.aws.signer/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.put-signing-profile-request/signing-material (clojure.spec.alpha/and :portkey.aws.signer/signing-material))
(clojure.spec.alpha/def :portkey.aws.signer.put-signing-profile-request/platform-id (clojure.spec.alpha/and :portkey.aws.signer/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.put-signing-profile-request/overrides (clojure.spec.alpha/and :portkey.aws.signer/signing-platform-overrides))
(clojure.spec.alpha/def :portkey.aws.signer.put-signing-profile-request/signing-parameters (clojure.spec.alpha/and :portkey.aws.signer/signing-parameters))
(clojure.spec.alpha/def :portkey.aws.signer/put-signing-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.put-signing-profile-request/profile-name :portkey.aws.signer.put-signing-profile-request/signing-material :portkey.aws.signer.put-signing-profile-request/platform-id] :opt-un [:portkey.aws.signer.put-signing-profile-request/overrides :portkey.aws.signer.put-signing-profile-request/signing-parameters]))

(clojure.spec.alpha/def :portkey.aws.signer/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.start-signing-job-request/source (clojure.spec.alpha/and :portkey.aws.signer/source))
(clojure.spec.alpha/def :portkey.aws.signer.start-signing-job-request/destination (clojure.spec.alpha/and :portkey.aws.signer/destination))
(clojure.spec.alpha/def :portkey.aws.signer.start-signing-job-request/profile-name (clojure.spec.alpha/and :portkey.aws.signer/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.start-signing-job-request/client-request-token (clojure.spec.alpha/and :portkey.aws.signer/client-request-token))
(clojure.spec.alpha/def :portkey.aws.signer/start-signing-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.start-signing-job-request/source :portkey.aws.signer.start-signing-job-request/destination :portkey.aws.signer.start-signing-job-request/client-request-token] :opt-un [:portkey.aws.signer.start-signing-job-request/profile-name]))

(clojure.spec.alpha/def :portkey.aws.signer/image-format #{"JSON" :json})

(clojure.spec.alpha/def :portkey.aws.signer/key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.list-signing-profiles-response/profiles (clojure.spec.alpha/and :portkey.aws.signer/signing-profiles))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-profiles-response/next-token (clojure.spec.alpha/and :portkey.aws.signer/next-token))
(clojure.spec.alpha/def :portkey.aws.signer/list-signing-profiles-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.list-signing-profiles-response/profiles :portkey.aws.signer.list-signing-profiles-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer/display-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.get-signing-profile-request/profile-name (clojure.spec.alpha/and :portkey.aws.signer/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer/get-signing-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.get-signing-profile-request/profile-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer/status-reason (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer/bool clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.signer.signing-platform/platform-id (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer.signing-platform/display-name (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer.signing-platform/partner (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer.signing-platform/target (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer.signing-platform/category (clojure.spec.alpha/and :portkey.aws.signer/category))
(clojure.spec.alpha/def :portkey.aws.signer.signing-platform/signing-configuration (clojure.spec.alpha/and :portkey.aws.signer/signing-configuration))
(clojure.spec.alpha/def :portkey.aws.signer.signing-platform/signing-image-format (clojure.spec.alpha/and :portkey.aws.signer/signing-image-format))
(clojure.spec.alpha/def :portkey.aws.signer.signing-platform/max-size-in-mb (clojure.spec.alpha/and :portkey.aws.signer/max-size-in-mb))
(clojure.spec.alpha/def :portkey.aws.signer/signing-platform (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.signing-platform/platform-id :portkey.aws.signer.signing-platform/display-name :portkey.aws.signer.signing-platform/partner :portkey.aws.signer.signing-platform/target :portkey.aws.signer.signing-platform/category :portkey.aws.signer.signing-platform/signing-configuration :portkey.aws.signer.signing-platform/signing-image-format :portkey.aws.signer.signing-platform/max-size-in-mb]))

(clojure.spec.alpha/def :portkey.aws.signer.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.signer/error-message))
(clojure.spec.alpha/def :portkey.aws.signer/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.signer.list-signing-profiles-request/include-canceled (clojure.spec.alpha/and :portkey.aws.signer/bool))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-profiles-request/max-results (clojure.spec.alpha/and :portkey.aws.signer/max-results))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-profiles-request/next-token (clojure.spec.alpha/and :portkey.aws.signer/next-token))
(clojure.spec.alpha/def :portkey.aws.signer/list-signing-profiles-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.list-signing-profiles-request/include-canceled :portkey.aws.signer.list-signing-profiles-request/max-results :portkey.aws.signer.list-signing-profiles-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer.get-signing-platform-response/platform-id (clojure.spec.alpha/and :portkey.aws.signer/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-platform-response/display-name (clojure.spec.alpha/and :portkey.aws.signer/display-name))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-platform-response/partner (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-platform-response/target (clojure.spec.alpha/and :portkey.aws.signer/string))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-platform-response/category (clojure.spec.alpha/and :portkey.aws.signer/category))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-platform-response/signing-configuration (clojure.spec.alpha/and :portkey.aws.signer/signing-configuration))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-platform-response/signing-image-format (clojure.spec.alpha/and :portkey.aws.signer/signing-image-format))
(clojure.spec.alpha/def :portkey.aws.signer.get-signing-platform-response/max-size-in-mb (clojure.spec.alpha/and :portkey.aws.signer/max-size-in-mb))
(clojure.spec.alpha/def :portkey.aws.signer/get-signing-platform-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.get-signing-platform-response/platform-id :portkey.aws.signer.get-signing-platform-response/display-name :portkey.aws.signer.get-signing-platform-response/partner :portkey.aws.signer.get-signing-platform-response/target :portkey.aws.signer.get-signing-platform-response/category :portkey.aws.signer.get-signing-platform-response/signing-configuration :portkey.aws.signer.get-signing-platform-response/signing-image-format :portkey.aws.signer.get-signing-platform-response/max-size-in-mb]))

(clojure.spec.alpha/def :portkey.aws.signer/signing-parameter-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.signer/error-message))
(clojure.spec.alpha/def :portkey.aws.signer/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.access-denied-exception/message]))

(clojure.spec.alpha/def :portkey.aws.signer/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.list-signing-jobs-request/status (clojure.spec.alpha/and :portkey.aws.signer/signing-status))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-jobs-request/platform-id (clojure.spec.alpha/and :portkey.aws.signer/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-jobs-request/requested-by (clojure.spec.alpha/and :portkey.aws.signer/requested-by))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-jobs-request/max-results (clojure.spec.alpha/and :portkey.aws.signer/max-results))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-jobs-request/next-token (clojure.spec.alpha/and :portkey.aws.signer/next-token))
(clojure.spec.alpha/def :portkey.aws.signer/list-signing-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.list-signing-jobs-request/status :portkey.aws.signer.list-signing-jobs-request/platform-id :portkey.aws.signer.list-signing-jobs-request/requested-by :portkey.aws.signer.list-signing-jobs-request/max-results :portkey.aws.signer.list-signing-jobs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer.cancel-signing-profile-request/profile-name (clojure.spec.alpha/and :portkey.aws.signer/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer/cancel-signing-profile-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.cancel-signing-profile-request/profile-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer/signing-profiles (clojure.spec.alpha/coll-of :portkey.aws.signer/signing-profile))

(clojure.spec.alpha/def :portkey.aws.signer.encryption-algorithm-options/allowed-values (clojure.spec.alpha/and :portkey.aws.signer/encryption-algorithms))
(clojure.spec.alpha/def :portkey.aws.signer.encryption-algorithm-options/default-value (clojure.spec.alpha/and :portkey.aws.signer/encryption-algorithm))
(clojure.spec.alpha/def :portkey.aws.signer/encryption-algorithm-options (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.encryption-algorithm-options/allowed-values :portkey.aws.signer.encryption-algorithm-options/default-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer/signing-parameter-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-request/job-id (clojure.spec.alpha/and :portkey.aws.signer/job-id))
(clojure.spec.alpha/def :portkey.aws.signer/describe-signing-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.describe-signing-job-request/job-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer/signing-platforms (clojure.spec.alpha/coll-of :portkey.aws.signer/signing-platform))

(clojure.spec.alpha/def :portkey.aws.signer/certificate-arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer/created-at clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.signer.signed-object/s-3 (clojure.spec.alpha/and :portkey.aws.signer/s-3-signed-object))
(clojure.spec.alpha/def :portkey.aws.signer/signed-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.signed-object/s-3]))

(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/overrides (clojure.spec.alpha/and :portkey.aws.signer/signing-platform-overrides))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/signing-parameters (clojure.spec.alpha/and :portkey.aws.signer/signing-parameters))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/created-at (clojure.spec.alpha/and :portkey.aws.signer/created-at))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/completed-at (clojure.spec.alpha/and :portkey.aws.signer/completed-at))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/signing-material (clojure.spec.alpha/and :portkey.aws.signer/signing-material))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/status (clojure.spec.alpha/and :portkey.aws.signer/signing-status))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/requested-by (clojure.spec.alpha/and :portkey.aws.signer/requested-by))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/source (clojure.spec.alpha/and :portkey.aws.signer/source))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/signed-object (clojure.spec.alpha/and :portkey.aws.signer/signed-object))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/profile-name (clojure.spec.alpha/and :portkey.aws.signer/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/status-reason (clojure.spec.alpha/and :portkey.aws.signer/status-reason))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/platform-id (clojure.spec.alpha/and :portkey.aws.signer/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.describe-signing-job-response/job-id (clojure.spec.alpha/and :portkey.aws.signer/job-id))
(clojure.spec.alpha/def :portkey.aws.signer/describe-signing-job-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.describe-signing-job-response/overrides :portkey.aws.signer.describe-signing-job-response/signing-parameters :portkey.aws.signer.describe-signing-job-response/created-at :portkey.aws.signer.describe-signing-job-response/completed-at :portkey.aws.signer.describe-signing-job-response/signing-material :portkey.aws.signer.describe-signing-job-response/status :portkey.aws.signer.describe-signing-job-response/requested-by :portkey.aws.signer.describe-signing-job-response/source :portkey.aws.signer.describe-signing-job-response/signed-object :portkey.aws.signer.describe-signing-job-response/profile-name :portkey.aws.signer.describe-signing-job-response/status-reason :portkey.aws.signer.describe-signing-job-response/platform-id :portkey.aws.signer.describe-signing-job-response/job-id]))

(clojure.spec.alpha/def :portkey.aws.signer.get-signing-platform-request/platform-id (clojure.spec.alpha/and :portkey.aws.signer/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer/get-signing-platform-request (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.get-signing-platform-request/platform-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer.signing-image-format/supported-formats (clojure.spec.alpha/and :portkey.aws.signer/image-formats))
(clojure.spec.alpha/def :portkey.aws.signer.signing-image-format/default-format (clojure.spec.alpha/and :portkey.aws.signer/image-format))
(clojure.spec.alpha/def :portkey.aws.signer/signing-image-format (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.signing-image-format/supported-formats :portkey.aws.signer.signing-image-format/default-format] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer/signing-profile-status #{"Active" :canceled "Canceled" :active})

(clojure.spec.alpha/def :portkey.aws.signer/max-size-in-mb clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.signer/hash-algorithm #{:sha-1 "SHA1" "SHA256" :sha-256})

(clojure.spec.alpha/def :portkey.aws.signer/max-results (clojure.spec.alpha/int-in 1 25))

(clojure.spec.alpha/def :portkey.aws.signer.s-3-destination/bucket-name (clojure.spec.alpha/and :portkey.aws.signer/bucket-name))
(clojure.spec.alpha/def :portkey.aws.signer.s-3-destination/prefix (clojure.spec.alpha/and :portkey.aws.signer/prefix))
(clojure.spec.alpha/def :portkey.aws.signer/s-3-destination (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.s-3-destination/bucket-name :portkey.aws.signer.s-3-destination/prefix]))

(clojure.spec.alpha/def :portkey.aws.signer/version (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer.signing-profile/profile-name (clojure.spec.alpha/and :portkey.aws.signer/profile-name))
(clojure.spec.alpha/def :portkey.aws.signer.signing-profile/signing-material (clojure.spec.alpha/and :portkey.aws.signer/signing-material))
(clojure.spec.alpha/def :portkey.aws.signer.signing-profile/platform-id (clojure.spec.alpha/and :portkey.aws.signer/platform-id))
(clojure.spec.alpha/def :portkey.aws.signer.signing-profile/signing-parameters (clojure.spec.alpha/and :portkey.aws.signer/signing-parameters))
(clojure.spec.alpha/def :portkey.aws.signer.signing-profile/status (clojure.spec.alpha/and :portkey.aws.signer/signing-profile-status))
(clojure.spec.alpha/def :portkey.aws.signer/signing-profile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.signing-profile/profile-name :portkey.aws.signer.signing-profile/signing-material :portkey.aws.signer.signing-profile/platform-id :portkey.aws.signer.signing-profile/signing-parameters :portkey.aws.signer.signing-profile/status]))

(clojure.spec.alpha/def :portkey.aws.signer.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.signer/error-message))
(clojure.spec.alpha/def :portkey.aws.signer/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.signer/image-formats (clojure.spec.alpha/coll-of :portkey.aws.signer/image-format))

(clojure.spec.alpha/def :portkey.aws.signer/encryption-algorithm #{:ecdsa "RSA" :rsa "ECDSA"})

(clojure.spec.alpha/def :portkey.aws.signer.signing-job/job-id (clojure.spec.alpha/and :portkey.aws.signer/job-id))
(clojure.spec.alpha/def :portkey.aws.signer.signing-job/source (clojure.spec.alpha/and :portkey.aws.signer/source))
(clojure.spec.alpha/def :portkey.aws.signer.signing-job/signed-object (clojure.spec.alpha/and :portkey.aws.signer/signed-object))
(clojure.spec.alpha/def :portkey.aws.signer.signing-job/signing-material (clojure.spec.alpha/and :portkey.aws.signer/signing-material))
(clojure.spec.alpha/def :portkey.aws.signer.signing-job/created-at (clojure.spec.alpha/and :portkey.aws.signer/created-at))
(clojure.spec.alpha/def :portkey.aws.signer.signing-job/status (clojure.spec.alpha/and :portkey.aws.signer/signing-status))
(clojure.spec.alpha/def :portkey.aws.signer/signing-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.signing-job/job-id :portkey.aws.signer.signing-job/source :portkey.aws.signer.signing-job/signed-object :portkey.aws.signer.signing-job/signing-material :portkey.aws.signer.signing-job/created-at :portkey.aws.signer.signing-job/status]))

(clojure.spec.alpha/def :portkey.aws.signer.hash-algorithm-options/allowed-values (clojure.spec.alpha/and :portkey.aws.signer/hash-algorithms))
(clojure.spec.alpha/def :portkey.aws.signer.hash-algorithm-options/default-value (clojure.spec.alpha/and :portkey.aws.signer/hash-algorithm))
(clojure.spec.alpha/def :portkey.aws.signer/hash-algorithm-options (clojure.spec.alpha/keys :req-un [:portkey.aws.signer.hash-algorithm-options/allowed-values :portkey.aws.signer.hash-algorithm-options/default-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.signer/bucket-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer/profile-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__42947__auto__] (clojure.core/<= 2 (clojure.core/count s__42947__auto__))) (clojure.core/fn [s__42948__auto__] (clojure.core/< (clojure.core/count s__42948__auto__) 20)) (clojure.core/fn [s__42949__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9_]{2,}" s__42949__auto__))))

(clojure.spec.alpha/def :portkey.aws.signer/requested-by (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.signer/signing-parameters (clojure.spec.alpha/map-of :portkey.aws.signer/signing-parameter-key :portkey.aws.signer/signing-parameter-value))

(clojure.spec.alpha/def :portkey.aws.signer.signing-configuration-overrides/encryption-algorithm (clojure.spec.alpha/and :portkey.aws.signer/encryption-algorithm))
(clojure.spec.alpha/def :portkey.aws.signer.signing-configuration-overrides/hash-algorithm (clojure.spec.alpha/and :portkey.aws.signer/hash-algorithm))
(clojure.spec.alpha/def :portkey.aws.signer/signing-configuration-overrides (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.signing-configuration-overrides/encryption-algorithm :portkey.aws.signer.signing-configuration-overrides/hash-algorithm]))

(clojure.spec.alpha/def :portkey.aws.signer.list-signing-jobs-response/jobs (clojure.spec.alpha/and :portkey.aws.signer/signing-jobs))
(clojure.spec.alpha/def :portkey.aws.signer.list-signing-jobs-response/next-token (clojure.spec.alpha/and :portkey.aws.signer/next-token))
(clojure.spec.alpha/def :portkey.aws.signer/list-signing-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.signer.list-signing-jobs-response/jobs :portkey.aws.signer.list-signing-jobs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.signer/job-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn get-signing-profile ([get-signing-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-signing-profile-request get-signing-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.signer/endpoints, :http.request.spec/output-spec :portkey.aws.signer/get-signing-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-profiles/{profileName}", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer/get-signing-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSigningProfile", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.signer/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer/access-denied-exception, "ThrottlingException" :portkey.aws.signer/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef get-signing-profile :args (clojure.spec.alpha/tuple :portkey.aws.signer/get-signing-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.signer/get-signing-profile-response))

(clojure.core/defn get-signing-platform ([get-signing-platform-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-get-signing-platform-request get-signing-platform-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.signer/endpoints, :http.request.spec/output-spec :portkey.aws.signer/get-signing-platform-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-platforms/{platformId}", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer/get-signing-platform-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "GetSigningPlatform", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.signer/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer/access-denied-exception, "InternalServiceErrorException" :portkey.aws.signer/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef get-signing-platform :args (clojure.spec.alpha/tuple :portkey.aws.signer/get-signing-platform-request) :ret (clojure.spec.alpha/and :portkey.aws.signer/get-signing-platform-response))

(clojure.core/defn list-signing-profiles ([] (list-signing-profiles {})) ([list-signing-profiles-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-signing-profiles-request list-signing-profiles-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.signer/endpoints, :http.request.spec/output-spec :portkey.aws.signer/list-signing-profiles-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-profiles", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer/list-signing-profiles-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSigningProfiles", :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.signer/access-denied-exception, "ThrottlingException" :portkey.aws.signer/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef list-signing-profiles :args (clojure.spec.alpha/? :portkey.aws.signer/list-signing-profiles-request) :ret (clojure.spec.alpha/and :portkey.aws.signer/list-signing-profiles-response))

(clojure.core/defn list-signing-platforms ([] (list-signing-platforms {})) ([list-signing-platforms-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-signing-platforms-request list-signing-platforms-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.signer/endpoints, :http.request.spec/output-spec :portkey.aws.signer/list-signing-platforms-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-platforms", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer/list-signing-platforms-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSigningPlatforms", :http.request.spec/error-spec {"ValidationException" :portkey.aws.signer/validation-exception, "AccessDeniedException" :portkey.aws.signer/access-denied-exception, "ThrottlingException" :portkey.aws.signer/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef list-signing-platforms :args (clojure.spec.alpha/? :portkey.aws.signer/list-signing-platforms-request) :ret (clojure.spec.alpha/and :portkey.aws.signer/list-signing-platforms-response))

(clojure.core/defn start-signing-job ([start-signing-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-start-signing-job-request start-signing-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.signer/endpoints, :http.request.spec/output-spec :portkey.aws.signer/start-signing-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-jobs", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer/start-signing-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartSigningJob", :http.request.spec/error-spec {"ValidationException" :portkey.aws.signer/validation-exception, "ResourceNotFoundException" :portkey.aws.signer/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer/access-denied-exception, "ThrottlingException" :portkey.aws.signer/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef start-signing-job :args (clojure.spec.alpha/tuple :portkey.aws.signer/start-signing-job-request) :ret (clojure.spec.alpha/and :portkey.aws.signer/start-signing-job-response))

(clojure.core/defn list-signing-jobs ([] (list-signing-jobs {})) ([list-signing-jobs-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-list-signing-jobs-request list-signing-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.signer/endpoints, :http.request.spec/output-spec :portkey.aws.signer/list-signing-jobs-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-jobs", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer/list-signing-jobs-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "ListSigningJobs", :http.request.spec/error-spec {"ValidationException" :portkey.aws.signer/validation-exception, "AccessDeniedException" :portkey.aws.signer/access-denied-exception, "ThrottlingException" :portkey.aws.signer/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef list-signing-jobs :args (clojure.spec.alpha/? :portkey.aws.signer/list-signing-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.signer/list-signing-jobs-response))

(clojure.core/defn cancel-signing-profile ([cancel-signing-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-cancel-signing-profile-request cancel-signing-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.signer/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-profiles/{profileName}", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer/cancel-signing-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :delete, :http.request.configuration/response-code nil, :http.request.configuration/action "CancelSigningProfile", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.signer/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer/access-denied-exception, "ThrottlingException" :portkey.aws.signer/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef cancel-signing-profile :args (clojure.spec.alpha/tuple :portkey.aws.signer/cancel-signing-profile-request) :ret clojure.core/true?)

(clojure.core/defn describe-signing-job ([describe-signing-job-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-describe-signing-job-request describe-signing-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.signer/endpoints, :http.request.spec/output-spec :portkey.aws.signer/describe-signing-job-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-jobs/{jobId}", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer/describe-signing-job-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeSigningJob", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.signer/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer/access-denied-exception, "InternalServiceErrorException" :portkey.aws.signer/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef describe-signing-job :args (clojure.spec.alpha/tuple :portkey.aws.signer/describe-signing-job-request) :ret (clojure.spec.alpha/and :portkey.aws.signer/describe-signing-job-response))

(clojure.core/defn put-signing-profile ([put-signing-profile-requestinput] (clojure.core/let [request-function-result__43533__auto__ (req-put-signing-profile-request put-signing-profile-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__43533__auto__ {:http.request.configuration/endpoints portkey.aws.signer/endpoints, :http.request.spec/output-spec :portkey.aws.signer/put-signing-profile-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/signing-profiles/{profileName}", :http.request.configuration/version "2017-08-25", :http.request.configuration/service-id "signer", :http.request.spec/input-spec :portkey.aws.signer/put-signing-profile-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :put, :http.request.configuration/response-code nil, :http.request.configuration/action "PutSigningProfile", :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.signer/resource-not-found-exception, "AccessDeniedException" :portkey.aws.signer/access-denied-exception, "ValidationException" :portkey.aws.signer/validation-exception, "ThrottlingException" :portkey.aws.signer/throttling-exception, "InternalServiceErrorException" :portkey.aws.signer/internal-service-error-exception}})))))
(clojure.spec.alpha/fdef put-signing-profile :args (clojure.spec.alpha/tuple :portkey.aws.signer/put-signing-profile-request) :ret (clojure.spec.alpha/and :portkey.aws.signer/put-signing-profile-response))
