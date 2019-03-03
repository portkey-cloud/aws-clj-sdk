(ns portkey.aws.macie.-2017-12-19 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-s-3-resources-classification)

(clojure.core/declare ser-s-3-resources)

(clojure.core/declare ser-prefix)

(clojure.core/declare ser-s-3-resource)

(clojure.core/declare ser-classification-type)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-aws-account-id)

(clojure.core/declare ser-s-3-resource-classification)

(clojure.core/declare ser-s-3-resource-classification-update)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-classification-type-update)

(clojure.core/declare ser-bucket-name)

(clojure.core/declare ser-s-3-continuous-classification-type)

(clojure.core/declare ser-s-3-resources-classification-update)

(clojure.core/declare ser-s-3-one-time-classification-type)

(clojure.core/defn- ser-s-3-resources-classification [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-s-3-resource-classification coll) #:http.request.field{:shape "S3ResourceClassification"}))) input), :shape "S3ResourcesClassification", :type "list"})

(clojure.core/defn- ser-s-3-resources [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-s-3-resource coll) #:http.request.field{:shape "S3Resource"}))) input), :shape "S3Resources", :type "list"})

(clojure.core/defn- ser-prefix [input] #:http.request.field{:value input, :shape "Prefix"})

(clojure.core/defn- ser-s-3-resource [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-name (:bucket-name input)) #:http.request.field{:name "bucketName", :shape "BucketName"})], :shape "S3Resource", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "prefix", :shape "Prefix"}))))

(clojure.core/defn- ser-classification-type [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-one-time-classification-type (:one-time input)) #:http.request.field{:name "oneTime", :shape "S3OneTimeClassificationType"}) (clojure.core/into (ser-s-3-continuous-classification-type (:continuous input)) #:http.request.field{:name "continuous", :shape "S3ContinuousClassificationType"})], :shape "ClassificationType", :type "structure"}))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-aws-account-id [input] #:http.request.field{:value input, :shape "AWSAccountId"})

(clojure.core/defn- ser-s-3-resource-classification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-name (:bucket-name input)) #:http.request.field{:name "bucketName", :shape "BucketName"}) (clojure.core/into (ser-classification-type (:classification-type input)) #:http.request.field{:name "classificationType", :shape "ClassificationType"})], :shape "S3ResourceClassification", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "prefix", :shape "Prefix"}))))

(clojure.core/defn- ser-s-3-resource-classification-update [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-bucket-name (:bucket-name input)) #:http.request.field{:name "bucketName", :shape "BucketName"}) (clojure.core/into (ser-classification-type-update (:classification-type-update input)) #:http.request.field{:name "classificationTypeUpdate", :shape "ClassificationTypeUpdate"})], :shape "S3ResourceClassificationUpdate", :type "structure"} (clojure.core/contains? input :prefix) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-prefix (input :prefix)) #:http.request.field{:name "prefix", :shape "Prefix"}))))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-classification-type-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ClassificationTypeUpdate", :type "structure"} (clojure.core/contains? input :one-time) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-one-time-classification-type (input :one-time)) #:http.request.field{:name "oneTime", :shape "S3OneTimeClassificationType"})) (clojure.core/contains? input :continuous) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-continuous-classification-type (input :continuous)) #:http.request.field{:name "continuous", :shape "S3ContinuousClassificationType"}))))

(clojure.core/defn- ser-bucket-name [input] #:http.request.field{:value input, :shape "BucketName"})

(clojure.core/defn- ser-s-3-continuous-classification-type [input] #:http.request.field{:value (clojure.core/get {"FULL" "FULL", :full "FULL"} input), :shape "S3ContinuousClassificationType"})

(clojure.core/defn- ser-s-3-resources-classification-update [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-s-3-resource-classification-update coll) #:http.request.field{:shape "S3ResourceClassificationUpdate"}))) input), :shape "S3ResourcesClassificationUpdate", :type "list"})

(clojure.core/defn- ser-s-3-one-time-classification-type [input] #:http.request.field{:value (clojure.core/get {"FULL" "FULL", :full "FULL", "NONE" "NONE", :none "NONE"} input), :shape "S3OneTimeClassificationType"})

(clojure.core/defn- req-update-s-3-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-s-3-resources-classification-update (input :s-3-resources-update)) #:http.request.field{:name "s3ResourcesUpdate", :shape "S3ResourcesClassificationUpdate"})]} (clojure.core/contains? input :member-account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-id (input :member-account-id)) #:http.request.field{:name "memberAccountId", :shape "AWSAccountId"}))))

(clojure.core/defn- req-list-member-accounts-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-disassociate-s-3-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-s-3-resources (input :associated-s-3-resources)) #:http.request.field{:name "associatedS3Resources", :shape "S3Resources"})]} (clojure.core/contains? input :member-account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-id (input :member-account-id)) #:http.request.field{:name "memberAccountId", :shape "AWSAccountId"}))))

(clojure.core/defn- req-associate-s-3-resources-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-s-3-resources-classification (input :s-3-resources)) #:http.request.field{:name "s3Resources", :shape "S3ResourcesClassification"})]} (clojure.core/contains? input :member-account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-id (input :member-account-id)) #:http.request.field{:name "memberAccountId", :shape "AWSAccountId"}))))

(clojure.core/defn- req-associate-member-account-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-aws-account-id (input :member-account-id)) #:http.request.field{:name "memberAccountId", :shape "AWSAccountId"})]}))

(clojure.core/defn- req-disassociate-member-account-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-aws-account-id (input :member-account-id)) #:http.request.field{:name "memberAccountId", :shape "AWSAccountId"})]}))

(clojure.core/defn- req-list-s-3-resources-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :member-account-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-aws-account-id (input :member-account-id)) #:http.request.field{:name "memberAccountId", :shape "AWSAccountId"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "nextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "maxResults", :shape "MaxResults"}))))

(clojure.core/declare deser-s-3-resources-classification)

(clojure.core/declare deser-prefix)

(clojure.core/declare deser-s-3-resource)

(clojure.core/declare deser-classification-type)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-failed-s-3-resource)

(clojure.core/declare deser-aws-account-id)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-member-accounts)

(clojure.core/declare deser-exception-message)

(clojure.core/declare deser-s-3-resource-classification)

(clojure.core/declare deser-field-name)

(clojure.core/declare deser-resource-type)

(clojure.core/declare deser-member-account)

(clojure.core/declare deser-failed-s-3-resources)

(clojure.core/declare deser-bucket-name)

(clojure.core/declare deser-s-3-continuous-classification-type)

(clojure.core/declare deser-s-3-one-time-classification-type)

(clojure.core/defn- deser-s-3-resources-classification [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-s-3-resource-classification coll))) input))

(clojure.core/defn- deser-prefix [input] input)

(clojure.core/defn- deser-s-3-resource [input] (clojure.core/cond-> {:bucket-name (deser-bucket-name (input "bucketName"))} (clojure.core/contains? input "prefix") (clojure.core/assoc :prefix (deser-prefix (input "prefix")))))

(clojure.core/defn- deser-classification-type [input] (clojure.core/cond-> {:one-time (deser-s-3-one-time-classification-type (input "oneTime")), :continuous (deser-s-3-continuous-classification-type (input "continuous"))}))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-failed-s-3-resource [input] (clojure.core/cond-> {} (clojure.core/contains? input "failedItem") (clojure.core/assoc :failed-item (deser-s-3-resource (input "failedItem"))) (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-error-code (input "errorCode"))) (clojure.core/contains? input "errorMessage") (clojure.core/assoc :error-message (deser-exception-message (input "errorMessage")))))

(clojure.core/defn- deser-aws-account-id [input] input)

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-member-accounts [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-member-account coll))) input))

(clojure.core/defn- deser-exception-message [input] input)

(clojure.core/defn- deser-s-3-resource-classification [input] (clojure.core/cond-> {:bucket-name (deser-bucket-name (input "bucketName")), :classification-type (deser-classification-type (input "classificationType"))} (clojure.core/contains? input "prefix") (clojure.core/assoc :prefix (deser-prefix (input "prefix")))))

(clojure.core/defn- deser-field-name [input] input)

(clojure.core/defn- deser-resource-type [input] input)

(clojure.core/defn- deser-member-account [input] (clojure.core/cond-> {} (clojure.core/contains? input "accountId") (clojure.core/assoc :account-id (deser-aws-account-id (input "accountId")))))

(clojure.core/defn- deser-failed-s-3-resources [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-failed-s-3-resource coll))) input))

(clojure.core/defn- deser-bucket-name [input] input)

(clojure.core/defn- deser-s-3-continuous-classification-type [input] (clojure.core/get {"FULL" :full} input))

(clojure.core/defn- deser-s-3-one-time-classification-type [input] (clojure.core/get {"FULL" :full, "NONE" :none} input))

(clojure.core/defn- deser-list-s-3-resources-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "s3Resources") (clojure.core/assoc :s-3-resources (deser-s-3-resources-classification (input "s3Resources"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-next-token (input "nextToken")))))

(clojure.core/defn- deser-limit-exceeded-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-error-code (input "errorCode"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType")))))

(clojure.core/defn- deser-list-member-accounts-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "memberAccounts") (clojure.core/assoc :member-accounts (deser-member-accounts (input "memberAccounts"))) (clojure.core/contains? input "nextToken") (clojure.core/assoc :next-token (deser-next-token (input "nextToken")))))

(clojure.core/defn- deser-invalid-input-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-error-code (input "errorCode"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message"))) (clojure.core/contains? input "fieldName") (clojure.core/assoc :field-name (deser-field-name (input "fieldName")))))

(clojure.core/defn- deser-internal-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-error-code (input "errorCode"))) (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message")))))

(clojure.core/defn- deser-access-denied-exception [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-exception-message (input "message"))) (clojure.core/contains? input "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (input "resourceType")))))

(clojure.core/defn- deser-associate-s-3-resources-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "failedS3Resources") (clojure.core/assoc :failed-s-3-resources (deser-failed-s-3-resources (input "failedS3Resources")))))

(clojure.core/defn- deser-update-s-3-resources-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "failedS3Resources") (clojure.core/assoc :failed-s-3-resources (deser-failed-s-3-resources (input "failedS3Resources")))))

(clojure.core/defn- deser-disassociate-s-3-resources-result [input] (clojure.core/cond-> {} (clojure.core/contains? input "failedS3Resources") (clojure.core/assoc :failed-s-3-resources (deser-failed-s-3-resources (input "failedS3Resources")))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-resources-classification (clojure.spec.alpha/coll-of :portkey.aws.macie.-2017-12-19/s-3-resource-classification))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.update-s-3-resources-request/member-account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.update-s-3-resources-request/s-3-resources-update (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-resources-classification-update))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/update-s-3-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.update-s-3-resources-request/s-3-resources-update] :opt-un [:portkey.aws.macie.-2017-12-19.update-s-3-resources-request/member-account-id]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-member-accounts-request/next-token (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/next-token))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-member-accounts-request/max-results (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/max-results))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/list-member-accounts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.list-member-accounts-request/next-token :portkey.aws.macie.-2017-12-19.list-member-accounts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-resources (clojure.spec.alpha/coll-of :portkey.aws.macie.-2017-12-19/s-3-resource))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 10000))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-s-3-resources-result/s-3-resources (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-resources-classification))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-s-3-resources-result/next-token (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/next-token))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/list-s-3-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.list-s-3-resources-result/s-3-resources :portkey.aws.macie.-2017-12-19.list-s-3-resources-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource/bucket-name (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/bucket-name))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource/prefix (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/prefix))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-resource (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.s-3-resource/bucket-name] :opt-un [:portkey.aws.macie.-2017-12-19.s-3-resource/prefix]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.limit-exceeded-exception/error-code (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/error-code))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/exception-message))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.limit-exceeded-exception/resource-type (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/resource-type))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.limit-exceeded-exception/error-code :portkey.aws.macie.-2017-12-19.limit-exceeded-exception/message :portkey.aws.macie.-2017-12-19.limit-exceeded-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.classification-type/one-time (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-one-time-classification-type))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.classification-type/continuous (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-continuous-classification-type))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/classification-type (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.classification-type/one-time :portkey.aws.macie.-2017-12-19.classification-type/continuous] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.failed-s-3-resource/failed-item (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-resource))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.failed-s-3-resource/error-code (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/error-code))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.failed-s-3-resource/error-message (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/exception-message))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/failed-s-3-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.failed-s-3-resource/failed-item :portkey.aws.macie.-2017-12-19.failed-s-3-resource/error-code :portkey.aws.macie.-2017-12-19.failed-s-3-resource/error-message]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27881__auto__] (clojure.core/re-matches #"[0-9]{12}" s__27881__auto__))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.disassociate-s-3-resources-request/member-account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.disassociate-s-3-resources-request/associated-s-3-resources (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-resources))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.disassociate-s-3-resources-request/associated-s-3-resources] :opt-un [:portkey.aws.macie.-2017-12-19.disassociate-s-3-resources-request/member-account-id]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.associate-s-3-resources-request/member-account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.associate-s-3-resources-request/s-3-resources (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-resources-classification))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/associate-s-3-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.associate-s-3-resources-request/s-3-resources] :opt-un [:portkey.aws.macie.-2017-12-19.associate-s-3-resources-request/member-account-id]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 10))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-member-accounts-result/member-accounts (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/member-accounts))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-member-accounts-result/next-token (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/next-token))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/list-member-accounts-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.list-member-accounts-result/member-accounts :portkey.aws.macie.-2017-12-19.list-member-accounts-result/next-token]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.associate-member-account-request/member-account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/associate-member-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.associate-member-account-request/member-account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/member-accounts (clojure.spec.alpha/coll-of :portkey.aws.macie.-2017-12-19/member-account))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.invalid-input-exception/error-code (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/error-code))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.invalid-input-exception/message (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/exception-message))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.invalid-input-exception/field-name (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/field-name))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/invalid-input-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.invalid-input-exception/error-code :portkey.aws.macie.-2017-12-19.invalid-input-exception/message :portkey.aws.macie.-2017-12-19.invalid-input-exception/field-name]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/exception-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 10000))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource-classification/bucket-name (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/bucket-name))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource-classification/prefix (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/prefix))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource-classification/classification-type (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/classification-type))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-resource-classification (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.s-3-resource-classification/bucket-name :portkey.aws.macie.-2017-12-19.s-3-resource-classification/classification-type] :opt-un [:portkey.aws.macie.-2017-12-19.s-3-resource-classification/prefix]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.internal-exception/error-code (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/error-code))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.internal-exception/message (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/exception-message))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.internal-exception/error-code :portkey.aws.macie.-2017-12-19.internal-exception/message]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.access-denied-exception/message (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/exception-message))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.access-denied-exception/resource-type (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/resource-type))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.access-denied-exception/message :portkey.aws.macie.-2017-12-19.access-denied-exception/resource-type]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/bucket-name (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/bucket-name))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/prefix (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/prefix))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/classification-type-update (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/classification-type-update))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-resource-classification-update (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/bucket-name :portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/classification-type-update] :opt-un [:portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/prefix]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.associate-s-3-resources-result/failed-s-3-resources (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/failed-s-3-resources))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/associate-s-3-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.associate-s-3-resources-result/failed-s-3-resources]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.update-s-3-resources-result/failed-s-3-resources (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/failed-s-3-resources))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/update-s-3-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.update-s-3-resources-result/failed-s-3-resources]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.member-account/account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/member-account (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.member-account/account-id]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.disassociate-member-account-request/member-account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/disassociate-member-account-request (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.disassociate-member-account-request/member-account-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/failed-s-3-resources (clojure.spec.alpha/coll-of :portkey.aws.macie.-2017-12-19/failed-s-3-resource))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/max-results (clojure.spec.alpha/int-in Long/MIN_VALUE 250))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.classification-type-update/one-time (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-one-time-classification-type))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.classification-type-update/continuous (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-continuous-classification-type))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/classification-type-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.classification-type-update/one-time :portkey.aws.macie.-2017-12-19.classification-type-update/continuous]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.disassociate-s-3-resources-result/failed-s-3-resources (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/failed-s-3-resources))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-result (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.disassociate-s-3-resources-result/failed-s-3-resources]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/< (clojure.core/count s__27880__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-continuous-classification-type #{:full "FULL"})

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-s-3-resources-request/member-account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-s-3-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/next-token))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-s-3-resources-request/max-results (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/max-results))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/list-s-3-resources-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.list-s-3-resources-request/member-account-id :portkey.aws.macie.-2017-12-19.list-s-3-resources-request/next-token :portkey.aws.macie.-2017-12-19.list-s-3-resources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-resources-classification-update (clojure.spec.alpha/coll-of :portkey.aws.macie.-2017-12-19/s-3-resource-classification-update))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-one-time-classification-type #{:full "FULL" "NONE" :none})

(clojure.core/defn associate-member-account ([associate-member-account-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-associate-member-account-request associate-member-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/associate-member-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateMemberAccount", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "LimitExceededException" :portkey.aws.macie.-2017-12-19/limit-exceeded-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef associate-member-account :args (clojure.spec.alpha/tuple :portkey.aws.macie.-2017-12-19/associate-member-account-request) :ret clojure.core/true?)

(clojure.core/defn associate-s-3-resources ([associate-s-3-resources-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-associate-s-3-resources-request associate-s-3-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec :portkey.aws.macie.-2017-12-19/associate-s-3-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/associate-s-3-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AssociateS3Resources", :http.request.configuration/output-deser-fn deser-associate-s-3-resources-result, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "AccessDeniedException" :portkey.aws.macie.-2017-12-19/access-denied-exception, "LimitExceededException" :portkey.aws.macie.-2017-12-19/limit-exceeded-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef associate-s-3-resources :args (clojure.spec.alpha/tuple :portkey.aws.macie.-2017-12-19/associate-s-3-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/associate-s-3-resources-result))

(clojure.core/defn disassociate-member-account ([disassociate-member-account-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disassociate-member-account-request disassociate-member-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/disassociate-member-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateMemberAccount", :http.request.configuration/output-deser-fn deser, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef disassociate-member-account :args (clojure.spec.alpha/tuple :portkey.aws.macie.-2017-12-19/disassociate-member-account-request) :ret clojure.core/true?)

(clojure.core/defn disassociate-s-3-resources ([disassociate-s-3-resources-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-disassociate-s-3-resources-request disassociate-s-3-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DisassociateS3Resources", :http.request.configuration/output-deser-fn deser-disassociate-s-3-resources-result, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "AccessDeniedException" :portkey.aws.macie.-2017-12-19/access-denied-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef disassociate-s-3-resources :args (clojure.spec.alpha/tuple :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-result))

(clojure.core/defn list-member-accounts ([] (list-member-accounts {})) ([list-member-accounts-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-member-accounts-request list-member-accounts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec :portkey.aws.macie.-2017-12-19/list-member-accounts-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/list-member-accounts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListMemberAccounts", :http.request.configuration/output-deser-fn deser-list-member-accounts-result, :http.request.spec/error-spec {"InternalException" :portkey.aws.macie.-2017-12-19/internal-exception, "InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-member-accounts :args (clojure.spec.alpha/? :portkey.aws.macie.-2017-12-19/list-member-accounts-request) :ret (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/list-member-accounts-result))

(clojure.core/defn list-s-3-resources ([] (list-s-3-resources {})) ([list-s-3-resources-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-list-s-3-resources-request list-s-3-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec :portkey.aws.macie.-2017-12-19/list-s-3-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/list-s-3-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListS3Resources", :http.request.configuration/output-deser-fn deser-list-s-3-resources-result, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "AccessDeniedException" :portkey.aws.macie.-2017-12-19/access-denied-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef list-s-3-resources :args (clojure.spec.alpha/? :portkey.aws.macie.-2017-12-19/list-s-3-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/list-s-3-resources-result))

(clojure.core/defn update-s-3-resources ([update-s-3-resources-requestinput] (clojure.core/let [request-function-result__28581__auto__ (req-update-s-3-resources-request update-s-3-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28581__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec :portkey.aws.macie.-2017-12-19/update-s-3-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/update-s-3-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateS3Resources", :http.request.configuration/output-deser-fn deser-update-s-3-resources-result, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "AccessDeniedException" :portkey.aws.macie.-2017-12-19/access-denied-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef update-s-3-resources :args (clojure.spec.alpha/tuple :portkey.aws.macie.-2017-12-19/update-s-3-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/update-s-3-resources-result))
