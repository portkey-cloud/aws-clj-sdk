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

(clojure.core/defn- response-list-s-3-resources-result ([input] (response-list-s-3-resources-result nil input)) ([resultWrapper1262934 input] (clojure.core/let [rawinput1262933 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1262935 {"s3Resources" (rawinput1262933 "s3Resources"), "nextToken" (rawinput1262933 "nextToken")}] (clojure.core/cond-> {} (letvar1262935 "s3Resources") (clojure.core/assoc :s-3-resources (deser-s-3-resources-classification (clojure.core/get-in letvar1262935 ["s3Resources"]))) (letvar1262935 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1262935 ["nextToken"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1262937 input] (clojure.core/let [rawinput1262936 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1262938 {"errorCode" (rawinput1262936 "errorCode"), "message" (rawinput1262936 "message"), "resourceType" (rawinput1262936 "resourceType")}] (clojure.core/cond-> {} (letvar1262938 "errorCode") (clojure.core/assoc :error-code (deser-error-code (clojure.core/get-in letvar1262938 ["errorCode"]))) (letvar1262938 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1262938 ["message"]))) (letvar1262938 "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar1262938 ["resourceType"])))))))

(clojure.core/defn- response-list-member-accounts-result ([input] (response-list-member-accounts-result nil input)) ([resultWrapper1262940 input] (clojure.core/let [rawinput1262939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1262941 {"memberAccounts" (rawinput1262939 "memberAccounts"), "nextToken" (rawinput1262939 "nextToken")}] (clojure.core/cond-> {} (letvar1262941 "memberAccounts") (clojure.core/assoc :member-accounts (deser-member-accounts (clojure.core/get-in letvar1262941 ["memberAccounts"]))) (letvar1262941 "nextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1262941 ["nextToken"])))))))

(clojure.core/defn- response-invalid-input-exception ([input] (response-invalid-input-exception nil input)) ([resultWrapper1262943 input] (clojure.core/let [rawinput1262942 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1262944 {"errorCode" (rawinput1262942 "errorCode"), "message" (rawinput1262942 "message"), "fieldName" (rawinput1262942 "fieldName")}] (clojure.core/cond-> {} (letvar1262944 "errorCode") (clojure.core/assoc :error-code (deser-error-code (clojure.core/get-in letvar1262944 ["errorCode"]))) (letvar1262944 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1262944 ["message"]))) (letvar1262944 "fieldName") (clojure.core/assoc :field-name (deser-field-name (clojure.core/get-in letvar1262944 ["fieldName"])))))))

(clojure.core/defn- response-internal-exception ([input] (response-internal-exception nil input)) ([resultWrapper1262946 input] (clojure.core/let [rawinput1262945 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1262947 {"errorCode" (rawinput1262945 "errorCode"), "message" (rawinput1262945 "message")}] (clojure.core/cond-> {} (letvar1262947 "errorCode") (clojure.core/assoc :error-code (deser-error-code (clojure.core/get-in letvar1262947 ["errorCode"]))) (letvar1262947 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1262947 ["message"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1262949 input] (clojure.core/let [rawinput1262948 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1262950 {"message" (rawinput1262948 "message"), "resourceType" (rawinput1262948 "resourceType")}] (clojure.core/cond-> {} (letvar1262950 "message") (clojure.core/assoc :message (deser-exception-message (clojure.core/get-in letvar1262950 ["message"]))) (letvar1262950 "resourceType") (clojure.core/assoc :resource-type (deser-resource-type (clojure.core/get-in letvar1262950 ["resourceType"])))))))

(clojure.core/defn- response-associate-s-3-resources-result ([input] (response-associate-s-3-resources-result nil input)) ([resultWrapper1262952 input] (clojure.core/let [rawinput1262951 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1262953 {"failedS3Resources" (rawinput1262951 "failedS3Resources")}] (clojure.core/cond-> {} (letvar1262953 "failedS3Resources") (clojure.core/assoc :failed-s-3-resources (deser-failed-s-3-resources (clojure.core/get-in letvar1262953 ["failedS3Resources"])))))))

(clojure.core/defn- response-update-s-3-resources-result ([input] (response-update-s-3-resources-result nil input)) ([resultWrapper1262955 input] (clojure.core/let [rawinput1262954 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1262956 {"failedS3Resources" (rawinput1262954 "failedS3Resources")}] (clojure.core/cond-> {} (letvar1262956 "failedS3Resources") (clojure.core/assoc :failed-s-3-resources (deser-failed-s-3-resources (clojure.core/get-in letvar1262956 ["failedS3Resources"])))))))

(clojure.core/defn- response-disassociate-s-3-resources-result ([input] (response-disassociate-s-3-resources-result nil input)) ([resultWrapper1262958 input] (clojure.core/let [rawinput1262957 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1262959 {"failedS3Resources" (rawinput1262957 "failedS3Resources")}] (clojure.core/cond-> {} (letvar1262959 "failedS3Resources") (clojure.core/assoc :failed-s-3-resources (deser-failed-s-3-resources (clojure.core/get-in letvar1262959 ["failedS3Resources"])))))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-resources-classification (clojure.spec.alpha/coll-of :portkey.aws.macie.-2017-12-19/s-3-resource-classification))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.update-s-3-resources-request/member-account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.update-s-3-resources-request/s-3-resources-update (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-resources-classification-update))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/update-s-3-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.update-s-3-resources-request/s-3-resources-update] :opt-un [:portkey.aws.macie.-2017-12-19.update-s-3-resources-request/member-account-id]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-member-accounts-request/next-token (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/next-token))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-member-accounts-request/max-results (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/max-results))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/list-member-accounts-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.list-member-accounts-request/next-token :portkey.aws.macie.-2017-12-19.list-member-accounts-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-resources (clojure.spec.alpha/coll-of :portkey.aws.macie.-2017-12-19/s-3-resource))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 10000))))

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

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.failed-s-3-resource/failed-item (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-resource))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.failed-s-3-resource/error-code (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/error-code))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.failed-s-3-resource/error-message (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/exception-message))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/failed-s-3-resource (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.failed-s-3-resource/failed-item :portkey.aws.macie.-2017-12-19.failed-s-3-resource/error-code :portkey.aws.macie.-2017-12-19.failed-s-3-resource/error-message]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/aws-account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[0-9]{12}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.disassociate-s-3-resources-request/member-account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.disassociate-s-3-resources-request/associated-s-3-resources (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-resources))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.disassociate-s-3-resources-request/associated-s-3-resources] :opt-un [:portkey.aws.macie.-2017-12-19.disassociate-s-3-resources-request/member-account-id]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.associate-s-3-resources-request/member-account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.associate-s-3-resources-request/s-3-resources (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/s-3-resources-classification))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/associate-s-3-resources-request (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.associate-s-3-resources-request/s-3-resources] :opt-un [:portkey.aws.macie.-2017-12-19.associate-s-3-resources-request/member-account-id]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/error-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 10))))

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

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/exception-message (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 10000))))

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

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/bucket-name (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/bucket-name))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/prefix (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/prefix))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/classification-type-update (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/classification-type-update))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-resource-classification-update (clojure.spec.alpha/keys :req-un [:portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/bucket-name :portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/classification-type-update] :opt-un [:portkey.aws.macie.-2017-12-19.s-3-resource-classification-update/prefix]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/resource-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1000))))

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

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/bucket-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-continuous-classification-type #{:full "FULL"})

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-s-3-resources-request/member-account-id (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/aws-account-id))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-s-3-resources-request/next-token (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/next-token))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19.list-s-3-resources-request/max-results (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/max-results))
(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/list-s-3-resources-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.macie.-2017-12-19.list-s-3-resources-request/member-account-id :portkey.aws.macie.-2017-12-19.list-s-3-resources-request/next-token :portkey.aws.macie.-2017-12-19.list-s-3-resources-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-resources-classification-update (clojure.spec.alpha/coll-of :portkey.aws.macie.-2017-12-19/s-3-resource-classification-update))

(clojure.spec.alpha/def :portkey.aws.macie.-2017-12-19/s-3-one-time-classification-type #{:full "FULL" "NONE" :none})

(clojure.core/defn associate-member-account "Associates a specified AWS account with Amazon Macie as a member account." ([associate-member-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-member-account-request associate-member-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/associate-member-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateMemberAccount", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "LimitExceededException" :portkey.aws.macie.-2017-12-19/limit-exceeded-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef associate-member-account :args (clojure.spec.alpha/tuple :portkey.aws.macie.-2017-12-19/associate-member-account-request) :ret clojure.core/true?)

(clojure.core/defn associate-s-3-resources "Associates specified S3 resources with Amazon Macie for monitoring and data\nclassification. If memberAccountId isn't specified, the action associates\nspecified S3 resources with Macie for the current master account. If\nmemberAccountId is specified, the action associates specified S3 resources with\nMacie for the specified member account." ([associate-s-3-resources-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-associate-s-3-resources-request associate-s-3-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec :portkey.aws.macie.-2017-12-19/associate-s-3-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/associate-s-3-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AssociateS3Resources", :http.request.configuration/output-deser-fn response-associate-s-3-resources-result, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "AccessDeniedException" :portkey.aws.macie.-2017-12-19/access-denied-exception, "LimitExceededException" :portkey.aws.macie.-2017-12-19/limit-exceeded-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef associate-s-3-resources :args (clojure.spec.alpha/tuple :portkey.aws.macie.-2017-12-19/associate-s-3-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/associate-s-3-resources-result))

(clojure.core/defn disassociate-member-account "Removes the specified member account from Amazon Macie." ([disassociate-member-account-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-member-account-request disassociate-member-account-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/disassociate-member-account-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateMemberAccount", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__22118__auto__] {}), :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef disassociate-member-account :args (clojure.spec.alpha/tuple :portkey.aws.macie.-2017-12-19/disassociate-member-account-request) :ret clojure.core/true?)

(clojure.core/defn disassociate-s-3-resources "Removes specified S3 resources from being monitored by Amazon Macie. If\nmemberAccountId isn't specified, the action removes specified S3 resources from\nMacie for the current master account. If memberAccountId is specified, the\naction removes specified S3 resources from Macie for the specified member\naccount." ([disassociate-s-3-resources-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-disassociate-s-3-resources-request disassociate-s-3-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisassociateS3Resources", :http.request.configuration/output-deser-fn response-disassociate-s-3-resources-result, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "AccessDeniedException" :portkey.aws.macie.-2017-12-19/access-denied-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef disassociate-s-3-resources :args (clojure.spec.alpha/tuple :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/disassociate-s-3-resources-result))

(clojure.core/defn list-member-accounts "Lists all Amazon Macie member accounts for the current Amazon Macie master\naccount." ([] (list-member-accounts {})) ([list-member-accounts-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-member-accounts-request list-member-accounts-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec :portkey.aws.macie.-2017-12-19/list-member-accounts-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/list-member-accounts-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListMemberAccounts", :http.request.configuration/output-deser-fn response-list-member-accounts-result, :http.request.spec/error-spec {"InternalException" :portkey.aws.macie.-2017-12-19/internal-exception, "InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception}})))))
(clojure.spec.alpha/fdef list-member-accounts :args (clojure.spec.alpha/? :portkey.aws.macie.-2017-12-19/list-member-accounts-request) :ret (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/list-member-accounts-result))

(clojure.core/defn list-s-3-resources "Lists all the S3 resources associated with Amazon Macie. If memberAccountId\nisn't specified, the action lists the S3 resources associated with Amazon Macie\nfor the current master account. If memberAccountId is specified, the action\nlists the S3 resources associated with Amazon Macie for the specified member\naccount." ([] (list-s-3-resources {})) ([list-s-3-resources-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-s-3-resources-request list-s-3-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec :portkey.aws.macie.-2017-12-19/list-s-3-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/list-s-3-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListS3Resources", :http.request.configuration/output-deser-fn response-list-s-3-resources-result, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "AccessDeniedException" :portkey.aws.macie.-2017-12-19/access-denied-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef list-s-3-resources :args (clojure.spec.alpha/? :portkey.aws.macie.-2017-12-19/list-s-3-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/list-s-3-resources-result))

(clojure.core/defn update-s-3-resources "Updates the classification types for the specified S3 resources. If\nmemberAccountId isn't specified, the action updates the classification types of\nthe S3 resources associated with Amazon Macie for the current master account. If\nmemberAccountId is specified, the action updates the classification types of the\nS3 resources associated with Amazon Macie for the specified member account." ([update-s-3-resources-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-s-3-resources-request update-s-3-resources-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.macie.-2017-12-19/endpoints, :http.request.configuration/target-prefix "MacieService", :http.request.spec/output-spec :portkey.aws.macie.-2017-12-19/update-s-3-resources-result, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-12-19", :http.request.configuration/service-id "Macie", :http.request.spec/input-spec :portkey.aws.macie.-2017-12-19/update-s-3-resources-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateS3Resources", :http.request.configuration/output-deser-fn response-update-s-3-resources-result, :http.request.spec/error-spec {"InvalidInputException" :portkey.aws.macie.-2017-12-19/invalid-input-exception, "AccessDeniedException" :portkey.aws.macie.-2017-12-19/access-denied-exception, "InternalException" :portkey.aws.macie.-2017-12-19/internal-exception}})))))
(clojure.spec.alpha/fdef update-s-3-resources :args (clojure.spec.alpha/tuple :portkey.aws.macie.-2017-12-19/update-s-3-resources-request) :ret (clojure.spec.alpha/and :portkey.aws.macie.-2017-12-19/update-s-3-resources-result))
