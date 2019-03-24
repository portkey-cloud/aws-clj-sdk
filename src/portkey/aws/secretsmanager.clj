(ns portkey.aws.secretsmanager (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "secretsmanager", :region "us-west-1"},
    :ssl-common-name "secretsmanager-fips.us-west-1.amazonaws.com",
    :endpoint "https://secretsmanager-fips.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "secretsmanager", :region "ap-northeast-1"},
    :ssl-common-name "secretsmanager.ap-northeast-1.amazonaws.com",
    :endpoint "https://secretsmanager.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "secretsmanager", :region "eu-west-1"},
    :ssl-common-name "secretsmanager.eu-west-1.amazonaws.com",
    :endpoint "https://secretsmanager.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "secretsmanager", :region "us-east-2"},
    :ssl-common-name "secretsmanager.us-east-2.amazonaws.com",
    :endpoint "https://secretsmanager.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "secretsmanager", :region "ap-southeast-2"},
    :ssl-common-name "secretsmanager.ap-southeast-2.amazonaws.com",
    :endpoint "https://secretsmanager.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "secretsmanager", :region "sa-east-1"},
    :ssl-common-name "secretsmanager.sa-east-1.amazonaws.com",
    :endpoint "https://secretsmanager.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "secretsmanager", :region "ap-southeast-1"},
    :ssl-common-name "secretsmanager.ap-southeast-1.amazonaws.com",
    :endpoint "https://secretsmanager.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "secretsmanager", :region "ap-northeast-2"},
    :ssl-common-name "secretsmanager.ap-northeast-2.amazonaws.com",
    :endpoint "https://secretsmanager.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "secretsmanager", :region "eu-west-3"},
    :ssl-common-name "secretsmanager.eu-west-3.amazonaws.com",
    :endpoint "https://secretsmanager.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "secretsmanager", :region "us-east-2"},
    :ssl-common-name "secretsmanager-fips.us-east-2.amazonaws.com",
    :endpoint "https://secretsmanager-fips.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "secretsmanager", :region "ca-central-1"},
    :ssl-common-name "secretsmanager.ca-central-1.amazonaws.com",
    :endpoint "https://secretsmanager.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "secretsmanager", :region "eu-central-1"},
    :ssl-common-name "secretsmanager.eu-central-1.amazonaws.com",
    :endpoint "https://secretsmanager.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "secretsmanager", :region "eu-west-2"},
    :ssl-common-name "secretsmanager.eu-west-2.amazonaws.com",
    :endpoint "https://secretsmanager.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1-fips"
   {:credential-scope {:service "secretsmanager", :region "us-east-1"},
    :ssl-common-name "secretsmanager-fips.us-east-1.amazonaws.com",
    :endpoint "https://secretsmanager-fips.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "secretsmanager", :region "us-west-2"},
    :ssl-common-name "secretsmanager.us-west-2.amazonaws.com",
    :endpoint "https://secretsmanager.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "secretsmanager", :region "us-west-2"},
    :ssl-common-name "secretsmanager-fips.us-west-2.amazonaws.com",
    :endpoint "https://secretsmanager-fips.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "secretsmanager", :region "us-east-1"},
    :ssl-common-name "secretsmanager.us-east-1.amazonaws.com",
    :endpoint "https://secretsmanager.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "secretsmanager", :region "us-west-1"},
    :ssl-common-name "secretsmanager.us-west-1.amazonaws.com",
    :endpoint "https://secretsmanager.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "secretsmanager", :region "ap-south-1"},
    :ssl-common-name "secretsmanager.ap-south-1.amazonaws.com",
    :endpoint "https://secretsmanager.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-rotation-lambda-arn-type)

(clojure.core/declare ser-tag-key-type)

(clojure.core/declare ser-exclude-characters-type)

(clojure.core/declare ser-max-results-type)

(clojure.core/declare ser-secret-version-stages-type)

(clojure.core/declare ser-password-length-type)

(clojure.core/declare ser-rotation-rules-type)

(clojure.core/declare ser-exclude-lowercase-type)

(clojure.core/declare ser-tag-key-list-type)

(clojure.core/declare ser-exclude-punctuation-type)

(clojure.core/declare ser-next-token-type)

(clojure.core/declare ser-kms-key-id-type)

(clojure.core/declare ser-secret-version-stage-type)

(clojure.core/declare ser-exclude-numbers-type)

(clojure.core/declare ser-secret-version-id-type)

(clojure.core/declare ser-include-space-type)

(clojure.core/declare ser-require-each-included-type-type)

(clojure.core/declare ser-tag-list-type)

(clojure.core/declare ser-tag-value-type)

(clojure.core/declare ser-client-request-token-type)

(clojure.core/declare ser-non-empty-resource-policy-type)

(clojure.core/declare ser-automatically-rotate-after-days-type)

(clojure.core/declare ser-secret-binary-type)

(clojure.core/declare ser-exclude-uppercase-type)

(clojure.core/declare ser-secret-string-type)

(clojure.core/declare ser-recovery-window-in-days-type)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-description-type)

(clojure.core/declare ser-secret-id-type)

(clojure.core/declare ser-boolean-type)

(clojure.core/declare ser-name-type)

(clojure.core/defn- ser-rotation-lambda-arn-type [input] #:http.request.field{:value input, :shape "RotationLambdaARNType"})

(clojure.core/defn- ser-tag-key-type [input] #:http.request.field{:value input, :shape "TagKeyType"})

(clojure.core/defn- ser-exclude-characters-type [input] #:http.request.field{:value input, :shape "ExcludeCharactersType"})

(clojure.core/defn- ser-max-results-type [input] #:http.request.field{:value input, :shape "MaxResultsType"})

(clojure.core/defn- ser-secret-version-stages-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-secret-version-stage-type coll) #:http.request.field{:shape "SecretVersionStageType"}))) input), :shape "SecretVersionStagesType", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-password-length-type [input] #:http.request.field{:value input, :shape "PasswordLengthType"})

(clojure.core/defn- ser-rotation-rules-type [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "RotationRulesType", :type "structure"} (clojure.core/contains? input :automatically-after-days) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-automatically-rotate-after-days-type (input :automatically-after-days)) #:http.request.field{:name "AutomaticallyAfterDays", :shape "AutomaticallyRotateAfterDaysType", :box true}))))

(clojure.core/defn- ser-exclude-lowercase-type [input] #:http.request.field{:value input, :shape "ExcludeLowercaseType"})

(clojure.core/defn- ser-tag-key-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key-type coll) #:http.request.field{:shape "TagKeyType"}))) input), :shape "TagKeyListType", :type "list"})

(clojure.core/defn- ser-exclude-punctuation-type [input] #:http.request.field{:value input, :shape "ExcludePunctuationType"})

(clojure.core/defn- ser-next-token-type [input] #:http.request.field{:value input, :shape "NextTokenType"})

(clojure.core/defn- ser-kms-key-id-type [input] #:http.request.field{:value input, :shape "KmsKeyIdType"})

(clojure.core/defn- ser-secret-version-stage-type [input] #:http.request.field{:value input, :shape "SecretVersionStageType"})

(clojure.core/defn- ser-exclude-numbers-type [input] #:http.request.field{:value input, :shape "ExcludeNumbersType"})

(clojure.core/defn- ser-secret-version-id-type [input] #:http.request.field{:value input, :shape "SecretVersionIdType"})

(clojure.core/defn- ser-include-space-type [input] #:http.request.field{:value input, :shape "IncludeSpaceType"})

(clojure.core/defn- ser-require-each-included-type-type [input] #:http.request.field{:value input, :shape "RequireEachIncludedTypeType"})

(clojure.core/defn- ser-tag-list-type [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagListType", :type "list"})

(clojure.core/defn- ser-tag-value-type [input] #:http.request.field{:value input, :shape "TagValueType"})

(clojure.core/defn- ser-client-request-token-type [input] #:http.request.field{:value input, :shape "ClientRequestTokenType"})

(clojure.core/defn- ser-non-empty-resource-policy-type [input] #:http.request.field{:value input, :shape "NonEmptyResourcePolicyType"})

(clojure.core/defn- ser-automatically-rotate-after-days-type [input] #:http.request.field{:value input, :shape "AutomaticallyRotateAfterDaysType"})

(clojure.core/defn- ser-secret-binary-type [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "SecretBinaryType"})

(clojure.core/defn- ser-exclude-uppercase-type [input] #:http.request.field{:value input, :shape "ExcludeUppercaseType"})

(clojure.core/defn- ser-secret-string-type [input] #:http.request.field{:value input, :shape "SecretStringType"})

(clojure.core/defn- ser-recovery-window-in-days-type [input] #:http.request.field{:value input, :shape "RecoveryWindowInDaysType"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Tag", :type "structure"} (clojure.core/contains? input :key) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-key-type (input :key)) #:http.request.field{:name "Key", :shape "TagKeyType"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-value-type (input :value)) #:http.request.field{:name "Value", :shape "TagValueType"}))))

(clojure.core/defn- ser-description-type [input] #:http.request.field{:value input, :shape "DescriptionType"})

(clojure.core/defn- ser-secret-id-type [input] #:http.request.field{:value input, :shape "SecretIdType"})

(clojure.core/defn- ser-boolean-type [input] #:http.request.field{:value input, :shape "BooleanType"})

(clojure.core/defn- ser-name-type [input] #:http.request.field{:value input, :shape "NameType"})

(clojure.core/defn- req-create-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-name-type (input :name)) #:http.request.field{:name "Name", :shape "NameType"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-type (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenType", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-type (input :description)) #:http.request.field{:name "Description", :shape "DescriptionType"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id-type (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyIdType"})) (clojure.core/contains? input :secret-binary) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-binary-type (input :secret-binary)) #:http.request.field{:name "SecretBinary", :shape "SecretBinaryType"})) (clojure.core/contains? input :secret-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-string-type (input :secret-string)) #:http.request.field{:name "SecretString", :shape "SecretStringType"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list-type (input :tags)) #:http.request.field{:name "Tags", :shape "TagListType"}))))

(clojure.core/defn- req-put-resource-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"}) (clojure.core/into (ser-non-empty-resource-policy-type (input :resource-policy)) #:http.request.field{:name "ResourcePolicy", :shape "NonEmptyResourcePolicyType"})]}))

(clojure.core/defn- req-get-random-password-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :password-length) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-password-length-type (input :password-length)) #:http.request.field{:name "PasswordLength", :shape "PasswordLengthType", :box true})) (clojure.core/contains? input :exclude-characters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exclude-characters-type (input :exclude-characters)) #:http.request.field{:name "ExcludeCharacters", :shape "ExcludeCharactersType"})) (clojure.core/contains? input :exclude-numbers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exclude-numbers-type (input :exclude-numbers)) #:http.request.field{:name "ExcludeNumbers", :shape "ExcludeNumbersType", :box true})) (clojure.core/contains? input :exclude-punctuation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exclude-punctuation-type (input :exclude-punctuation)) #:http.request.field{:name "ExcludePunctuation", :shape "ExcludePunctuationType", :box true})) (clojure.core/contains? input :exclude-uppercase) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exclude-uppercase-type (input :exclude-uppercase)) #:http.request.field{:name "ExcludeUppercase", :shape "ExcludeUppercaseType", :box true})) (clojure.core/contains? input :exclude-lowercase) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-exclude-lowercase-type (input :exclude-lowercase)) #:http.request.field{:name "ExcludeLowercase", :shape "ExcludeLowercaseType", :box true})) (clojure.core/contains? input :include-space) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-include-space-type (input :include-space)) #:http.request.field{:name "IncludeSpace", :shape "IncludeSpaceType", :box true})) (clojure.core/contains? input :require-each-included-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-require-each-included-type-type (input :require-each-included-type)) #:http.request.field{:name "RequireEachIncludedType", :shape "RequireEachIncludedTypeType", :box true}))))

(clojure.core/defn- req-delete-resource-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]}))

(clojure.core/defn- req-get-secret-value-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :version-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-version-id-type (input :version-id)) #:http.request.field{:name "VersionId", :shape "SecretVersionIdType"})) (clojure.core/contains? input :version-stage) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-version-stage-type (input :version-stage)) #:http.request.field{:name "VersionStage", :shape "SecretVersionStageType"}))))

(clojure.core/defn- req-delete-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :recovery-window-in-days) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-recovery-window-in-days-type (input :recovery-window-in-days)) #:http.request.field{:name "RecoveryWindowInDays", :shape "RecoveryWindowInDaysType", :box true})) (clojure.core/contains? input :force-delete-without-recovery) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :force-delete-without-recovery)) #:http.request.field{:name "ForceDeleteWithoutRecovery", :shape "BooleanType", :box true}))))

(clojure.core/defn- req-rotate-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-type (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenType", :idempotency-token true})) (clojure.core/contains? input :rotation-lambda-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rotation-lambda-arn-type (input :rotation-lambda-arn)) #:http.request.field{:name "RotationLambdaARN", :shape "RotationLambdaARNType"})) (clojure.core/contains? input :rotation-rules) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-rotation-rules-type (input :rotation-rules)) #:http.request.field{:name "RotationRules", :shape "RotationRulesType"}))))

(clojure.core/defn- req-get-resource-policy-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]}))

(clojure.core/defn- req-tag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"}) (clojure.core/into (ser-tag-list-type (input :tags)) #:http.request.field{:name "Tags", :shape "TagListType"})]}))

(clojure.core/defn- req-cancel-rotate-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]}))

(clojure.core/defn- req-update-secret-version-stage-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"}) (clojure.core/into (ser-secret-version-stage-type (input :version-stage)) #:http.request.field{:name "VersionStage", :shape "SecretVersionStageType"})]} (clojure.core/contains? input :remove-from-version-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-version-id-type (input :remove-from-version-id)) #:http.request.field{:name "RemoveFromVersionId", :shape "SecretVersionIdType", :box true})) (clojure.core/contains? input :move-to-version-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-version-id-type (input :move-to-version-id)) #:http.request.field{:name "MoveToVersionId", :shape "SecretVersionIdType", :box true}))))

(clojure.core/defn- req-put-secret-value-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-type (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenType", :idempotency-token true})) (clojure.core/contains? input :secret-binary) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-binary-type (input :secret-binary)) #:http.request.field{:name "SecretBinary", :shape "SecretBinaryType"})) (clojure.core/contains? input :secret-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-string-type (input :secret-string)) #:http.request.field{:name "SecretString", :shape "SecretStringType"})) (clojure.core/contains? input :version-stages) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-version-stages-type (input :version-stages)) #:http.request.field{:name "VersionStages", :shape "SecretVersionStagesType"}))))

(clojure.core/defn- req-update-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token-type (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestTokenType", :idempotency-token true})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description-type (input :description)) #:http.request.field{:name "Description", :shape "DescriptionType"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id-type (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyIdType"})) (clojure.core/contains? input :secret-binary) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-binary-type (input :secret-binary)) #:http.request.field{:name "SecretBinary", :shape "SecretBinaryType"})) (clojure.core/contains? input :secret-string) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-string-type (input :secret-string)) #:http.request.field{:name "SecretString", :shape "SecretStringType"}))))

(clojure.core/defn- req-list-secret-version-ids-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-type (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsType", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextTokenType"})) (clojure.core/contains? input :include-deprecated) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-type (input :include-deprecated)) #:http.request.field{:name "IncludeDeprecated", :shape "BooleanType", :box true}))))

(clojure.core/defn- req-list-secrets-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results-type (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResultsType", :box true})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token-type (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextTokenType"}))))

(clojure.core/defn- req-describe-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]}))

(clojure.core/defn- req-untag-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"}) (clojure.core/into (ser-tag-key-list-type (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyListType"})]}))

(clojure.core/defn- req-restore-secret-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-secret-id-type (input :secret-id)) #:http.request.field{:name "SecretId", :shape "SecretIdType"})]}))

(clojure.core/declare deser-rotation-lambda-arn-type)

(clojure.core/declare deser-random-password-type)

(clojure.core/declare deser-last-accessed-date-type)

(clojure.core/declare deser-rotation-enabled-type)

(clojure.core/declare deser-secret-list-type)

(clojure.core/declare deser-secret-arn-type)

(clojure.core/declare deser-secret-versions-list-entry)

(clojure.core/declare deser-tag-key-type)

(clojure.core/declare deser-created-date-type)

(clojure.core/declare deser-secret-version-stages-type)

(clojure.core/declare deser-rotation-rules-type)

(clojure.core/declare deser-secret-versions-list-type)

(clojure.core/declare deser-deletion-date-type)

(clojure.core/declare deser-last-changed-date-type)

(clojure.core/declare deser-next-token-type)

(clojure.core/declare deser-error-message)

(clojure.core/declare deser-kms-key-id-type)

(clojure.core/declare deser-secret-version-stage-type)

(clojure.core/declare deser-deleted-date-type)

(clojure.core/declare deser-secret-version-id-type)

(clojure.core/declare deser-tag-list-type)

(clojure.core/declare deser-secret-versions-to-stages-map-type)

(clojure.core/declare deser-tag-value-type)

(clojure.core/declare deser-non-empty-resource-policy-type)

(clojure.core/declare deser-automatically-rotate-after-days-type)

(clojure.core/declare deser-secret-binary-type)

(clojure.core/declare deser-secret-name-type)

(clojure.core/declare deser-last-rotated-date-type)

(clojure.core/declare deser-secret-string-type)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-secret-list-entry)

(clojure.core/declare deser-description-type)

(clojure.core/declare deser-name-type)

(clojure.core/defn- deser-rotation-lambda-arn-type [input] input)

(clojure.core/defn- deser-random-password-type [input] input)

(clojure.core/defn- deser-last-accessed-date-type [input] input)

(clojure.core/defn- deser-rotation-enabled-type [input] input)

(clojure.core/defn- deser-secret-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-secret-list-entry coll))) input))

(clojure.core/defn- deser-secret-arn-type [input] input)

(clojure.core/defn- deser-secret-versions-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (input "VersionId"))) (clojure.core/contains? input "VersionStages") (clojure.core/assoc :version-stages (deser-secret-version-stages-type (input "VersionStages"))) (clojure.core/contains? input "LastAccessedDate") (clojure.core/assoc :last-accessed-date (deser-last-accessed-date-type (input "LastAccessedDate"))) (clojure.core/contains? input "CreatedDate") (clojure.core/assoc :created-date (deser-created-date-type (input "CreatedDate")))))

(clojure.core/defn- deser-tag-key-type [input] input)

(clojure.core/defn- deser-created-date-type [input] input)

(clojure.core/defn- deser-secret-version-stages-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-secret-version-stage-type coll))) input))

(clojure.core/defn- deser-rotation-rules-type [input] (clojure.core/cond-> {} (clojure.core/contains? input "AutomaticallyAfterDays") (clojure.core/assoc :automatically-after-days (deser-automatically-rotate-after-days-type (input "AutomaticallyAfterDays")))))

(clojure.core/defn- deser-secret-versions-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-secret-versions-list-entry coll))) input))

(clojure.core/defn- deser-deletion-date-type [input] input)

(clojure.core/defn- deser-last-changed-date-type [input] input)

(clojure.core/defn- deser-next-token-type [input] input)

(clojure.core/defn- deser-error-message [input] input)

(clojure.core/defn- deser-kms-key-id-type [input] input)

(clojure.core/defn- deser-secret-version-stage-type [input] input)

(clojure.core/defn- deser-deleted-date-type [input] input)

(clojure.core/defn- deser-secret-version-id-type [input] input)

(clojure.core/defn- deser-tag-list-type [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-secret-versions-to-stages-map-type [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-secret-version-id-type k) (deser-secret-version-stages-type v)])) input))

(clojure.core/defn- deser-tag-value-type [input] input)

(clojure.core/defn- deser-non-empty-resource-policy-type [input] input)

(clojure.core/defn- deser-automatically-rotate-after-days-type [input] input)

(clojure.core/defn- deser-secret-binary-type [input] (portkey.aws/base64-decode input))

(clojure.core/defn- deser-secret-name-type [input] input)

(clojure.core/defn- deser-last-rotated-date-type [input] input)

(clojure.core/defn- deser-secret-string-type [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {} (clojure.core/contains? input "Key") (clojure.core/assoc :key (deser-tag-key-type (input "Key"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-tag-value-type (input "Value")))))

(clojure.core/defn- deser-secret-list-entry [input] (clojure.core/cond-> {} (clojure.core/contains? input "RotationRules") (clojure.core/assoc :rotation-rules (deser-rotation-rules-type (input "RotationRules"))) (clojure.core/contains? input "LastRotatedDate") (clojure.core/assoc :last-rotated-date (deser-last-rotated-date-type (input "LastRotatedDate"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list-type (input "Tags"))) (clojure.core/contains? input "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (input "ARN"))) (clojure.core/contains? input "LastAccessedDate") (clojure.core/assoc :last-accessed-date (deser-last-accessed-date-type (input "LastAccessedDate"))) (clojure.core/contains? input "LastChangedDate") (clojure.core/assoc :last-changed-date (deser-last-changed-date-type (input "LastChangedDate"))) (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-description-type (input "Description"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id-type (input "KmsKeyId"))) (clojure.core/contains? input "DeletedDate") (clojure.core/assoc :deleted-date (deser-deleted-date-type (input "DeletedDate"))) (clojure.core/contains? input "RotationEnabled") (clojure.core/assoc :rotation-enabled (deser-rotation-enabled-type (input "RotationEnabled"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-secret-name-type (input "Name"))) (clojure.core/contains? input "SecretVersionsToStages") (clojure.core/assoc :secret-versions-to-stages (deser-secret-versions-to-stages-map-type (input "SecretVersionsToStages"))) (clojure.core/contains? input "RotationLambdaARN") (clojure.core/assoc :rotation-lambda-arn (deser-rotation-lambda-arn-type (input "RotationLambdaARN")))))

(clojure.core/defn- deser-description-type [input] input)

(clojure.core/defn- deser-name-type [input] input)

(clojure.core/defn- response-get-random-password-response ([input] (response-get-random-password-response nil input)) ([resultWrapper2006639 input] (clojure.core/let [rawinput2006638 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006640 {"RandomPassword" (rawinput2006638 "RandomPassword")}] (clojure.core/cond-> {} (letvar2006640 "RandomPassword") (clojure.core/assoc :random-password (deser-random-password-type (clojure.core/get-in letvar2006640 ["RandomPassword"])))))))

(clojure.core/defn- response-delete-secret-response ([input] (response-delete-secret-response nil input)) ([resultWrapper2006642 input] (clojure.core/let [rawinput2006641 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006643 {"ARN" (rawinput2006641 "ARN"), "Name" (rawinput2006641 "Name"), "DeletionDate" (rawinput2006641 "DeletionDate")}] (clojure.core/cond-> {} (letvar2006643 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006643 ["ARN"]))) (letvar2006643 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006643 ["Name"]))) (letvar2006643 "DeletionDate") (clojure.core/assoc :deletion-date (deser-deletion-date-type (clojure.core/get-in letvar2006643 ["DeletionDate"])))))))

(clojure.core/defn- response-list-secrets-response ([input] (response-list-secrets-response nil input)) ([resultWrapper2006645 input] (clojure.core/let [rawinput2006644 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006646 {"SecretList" (rawinput2006644 "SecretList"), "NextToken" (rawinput2006644 "NextToken")}] (clojure.core/cond-> {} (letvar2006646 "SecretList") (clojure.core/assoc :secret-list (deser-secret-list-type (clojure.core/get-in letvar2006646 ["SecretList"]))) (letvar2006646 "NextToken") (clojure.core/assoc :next-token (deser-next-token-type (clojure.core/get-in letvar2006646 ["NextToken"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper2006648 input] (clojure.core/let [rawinput2006647 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006649 {"Message" (rawinput2006647 "Message")}] (clojure.core/cond-> {} (letvar2006649 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006649 ["Message"])))))))

(clojure.core/defn- response-restore-secret-response ([input] (response-restore-secret-response nil input)) ([resultWrapper2006651 input] (clojure.core/let [rawinput2006650 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006652 {"ARN" (rawinput2006650 "ARN"), "Name" (rawinput2006650 "Name")}] (clojure.core/cond-> {} (letvar2006652 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006652 ["ARN"]))) (letvar2006652 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006652 ["Name"])))))))

(clojure.core/defn- response-encryption-failure ([input] (response-encryption-failure nil input)) ([resultWrapper2006654 input] (clojure.core/let [rawinput2006653 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006655 {"Message" (rawinput2006653 "Message")}] (clojure.core/cond-> {} (letvar2006655 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006655 ["Message"])))))))

(clojure.core/defn- response-decryption-failure ([input] (response-decryption-failure nil input)) ([resultWrapper2006657 input] (clojure.core/let [rawinput2006656 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006658 {"Message" (rawinput2006656 "Message")}] (clojure.core/cond-> {} (letvar2006658 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006658 ["Message"])))))))

(clojure.core/defn- response-internal-service-error ([input] (response-internal-service-error nil input)) ([resultWrapper2006660 input] (clojure.core/let [rawinput2006659 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006661 {"Message" (rawinput2006659 "Message")}] (clojure.core/cond-> {} (letvar2006661 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006661 ["Message"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper2006663 input] (clojure.core/let [rawinput2006662 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006664 {"Message" (rawinput2006662 "Message")}] (clojure.core/cond-> {} (letvar2006664 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006664 ["Message"])))))))

(clojure.core/defn- response-resource-exists-exception ([input] (response-resource-exists-exception nil input)) ([resultWrapper2006666 input] (clojure.core/let [rawinput2006665 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006667 {"Message" (rawinput2006665 "Message")}] (clojure.core/cond-> {} (letvar2006667 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006667 ["Message"])))))))

(clojure.core/defn- response-cancel-rotate-secret-response ([input] (response-cancel-rotate-secret-response nil input)) ([resultWrapper2006669 input] (clojure.core/let [rawinput2006668 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006670 {"ARN" (rawinput2006668 "ARN"), "Name" (rawinput2006668 "Name"), "VersionId" (rawinput2006668 "VersionId")}] (clojure.core/cond-> {} (letvar2006670 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006670 ["ARN"]))) (letvar2006670 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006670 ["Name"]))) (letvar2006670 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar2006670 ["VersionId"])))))))

(clojure.core/defn- response-describe-secret-response ([input] (response-describe-secret-response nil input)) ([resultWrapper2006672 input] (clojure.core/let [rawinput2006671 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006673 {"RotationRules" (rawinput2006671 "RotationRules"), "LastRotatedDate" (rawinput2006671 "LastRotatedDate"), "Tags" (rawinput2006671 "Tags"), "ARN" (rawinput2006671 "ARN"), "LastAccessedDate" (rawinput2006671 "LastAccessedDate"), "LastChangedDate" (rawinput2006671 "LastChangedDate"), "Description" (rawinput2006671 "Description"), "KmsKeyId" (rawinput2006671 "KmsKeyId"), "DeletedDate" (rawinput2006671 "DeletedDate"), "VersionIdsToStages" (rawinput2006671 "VersionIdsToStages"), "RotationEnabled" (rawinput2006671 "RotationEnabled"), "Name" (rawinput2006671 "Name"), "RotationLambdaARN" (rawinput2006671 "RotationLambdaARN")}] (clojure.core/cond-> {} (letvar2006673 "RotationRules") (clojure.core/assoc :rotation-rules (deser-rotation-rules-type (clojure.core/get-in letvar2006673 ["RotationRules"]))) (letvar2006673 "LastRotatedDate") (clojure.core/assoc :last-rotated-date (deser-last-rotated-date-type (clojure.core/get-in letvar2006673 ["LastRotatedDate"]))) (letvar2006673 "Tags") (clojure.core/assoc :tags (deser-tag-list-type (clojure.core/get-in letvar2006673 ["Tags"]))) (letvar2006673 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006673 ["ARN"]))) (letvar2006673 "LastAccessedDate") (clojure.core/assoc :last-accessed-date (deser-last-accessed-date-type (clojure.core/get-in letvar2006673 ["LastAccessedDate"]))) (letvar2006673 "LastChangedDate") (clojure.core/assoc :last-changed-date (deser-last-changed-date-type (clojure.core/get-in letvar2006673 ["LastChangedDate"]))) (letvar2006673 "Description") (clojure.core/assoc :description (deser-description-type (clojure.core/get-in letvar2006673 ["Description"]))) (letvar2006673 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id-type (clojure.core/get-in letvar2006673 ["KmsKeyId"]))) (letvar2006673 "DeletedDate") (clojure.core/assoc :deleted-date (deser-deleted-date-type (clojure.core/get-in letvar2006673 ["DeletedDate"]))) (letvar2006673 "VersionIdsToStages") (clojure.core/assoc :version-ids-to-stages (deser-secret-versions-to-stages-map-type (clojure.core/get-in letvar2006673 ["VersionIdsToStages"]))) (letvar2006673 "RotationEnabled") (clojure.core/assoc :rotation-enabled (deser-rotation-enabled-type (clojure.core/get-in letvar2006673 ["RotationEnabled"]))) (letvar2006673 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006673 ["Name"]))) (letvar2006673 "RotationLambdaARN") (clojure.core/assoc :rotation-lambda-arn (deser-rotation-lambda-arn-type (clojure.core/get-in letvar2006673 ["RotationLambdaARN"])))))))

(clojure.core/defn- response-invalid-next-token-exception ([input] (response-invalid-next-token-exception nil input)) ([resultWrapper2006675 input] (clojure.core/let [rawinput2006674 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006676 {"Message" (rawinput2006674 "Message")}] (clojure.core/cond-> {} (letvar2006676 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006676 ["Message"])))))))

(clojure.core/defn- response-create-secret-response ([input] (response-create-secret-response nil input)) ([resultWrapper2006678 input] (clojure.core/let [rawinput2006677 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006679 {"ARN" (rawinput2006677 "ARN"), "Name" (rawinput2006677 "Name"), "VersionId" (rawinput2006677 "VersionId")}] (clojure.core/cond-> {} (letvar2006679 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006679 ["ARN"]))) (letvar2006679 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006679 ["Name"]))) (letvar2006679 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar2006679 ["VersionId"])))))))

(clojure.core/defn- response-get-secret-value-response ([input] (response-get-secret-value-response nil input)) ([resultWrapper2006681 input] (clojure.core/let [rawinput2006680 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006682 {"ARN" (rawinput2006680 "ARN"), "Name" (rawinput2006680 "Name"), "VersionId" (rawinput2006680 "VersionId"), "SecretBinary" (rawinput2006680 "SecretBinary"), "SecretString" (rawinput2006680 "SecretString"), "VersionStages" (rawinput2006680 "VersionStages"), "CreatedDate" (rawinput2006680 "CreatedDate")}] (clojure.core/cond-> {} (letvar2006682 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006682 ["ARN"]))) (letvar2006682 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006682 ["Name"]))) (letvar2006682 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar2006682 ["VersionId"]))) (letvar2006682 "SecretBinary") (clojure.core/assoc :secret-binary (deser-secret-binary-type (clojure.core/get-in letvar2006682 ["SecretBinary"]))) (letvar2006682 "SecretString") (clojure.core/assoc :secret-string (deser-secret-string-type (clojure.core/get-in letvar2006682 ["SecretString"]))) (letvar2006682 "VersionStages") (clojure.core/assoc :version-stages (deser-secret-version-stages-type (clojure.core/get-in letvar2006682 ["VersionStages"]))) (letvar2006682 "CreatedDate") (clojure.core/assoc :created-date (deser-created-date-type (clojure.core/get-in letvar2006682 ["CreatedDate"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper2006684 input] (clojure.core/let [rawinput2006683 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006685 {"Message" (rawinput2006683 "Message")}] (clojure.core/cond-> {} (letvar2006685 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006685 ["Message"])))))))

(clojure.core/defn- response-malformed-policy-document-exception ([input] (response-malformed-policy-document-exception nil input)) ([resultWrapper2006687 input] (clojure.core/let [rawinput2006686 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006688 {"Message" (rawinput2006686 "Message")}] (clojure.core/cond-> {} (letvar2006688 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006688 ["Message"])))))))

(clojure.core/defn- response-update-secret-response ([input] (response-update-secret-response nil input)) ([resultWrapper2006690 input] (clojure.core/let [rawinput2006689 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006691 {"ARN" (rawinput2006689 "ARN"), "Name" (rawinput2006689 "Name"), "VersionId" (rawinput2006689 "VersionId")}] (clojure.core/cond-> {} (letvar2006691 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006691 ["ARN"]))) (letvar2006691 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006691 ["Name"]))) (letvar2006691 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar2006691 ["VersionId"])))))))

(clojure.core/defn- response-delete-resource-policy-response ([input] (response-delete-resource-policy-response nil input)) ([resultWrapper2006693 input] (clojure.core/let [rawinput2006692 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006694 {"ARN" (rawinput2006692 "ARN"), "Name" (rawinput2006692 "Name")}] (clojure.core/cond-> {} (letvar2006694 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006694 ["ARN"]))) (letvar2006694 "Name") (clojure.core/assoc :name (deser-name-type (clojure.core/get-in letvar2006694 ["Name"])))))))

(clojure.core/defn- response-put-resource-policy-response ([input] (response-put-resource-policy-response nil input)) ([resultWrapper2006696 input] (clojure.core/let [rawinput2006695 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006697 {"ARN" (rawinput2006695 "ARN"), "Name" (rawinput2006695 "Name")}] (clojure.core/cond-> {} (letvar2006697 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006697 ["ARN"]))) (letvar2006697 "Name") (clojure.core/assoc :name (deser-name-type (clojure.core/get-in letvar2006697 ["Name"])))))))

(clojure.core/defn- response-precondition-not-met-exception ([input] (response-precondition-not-met-exception nil input)) ([resultWrapper2006699 input] (clojure.core/let [rawinput2006698 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006700 {"Message" (rawinput2006698 "Message")}] (clojure.core/cond-> {} (letvar2006700 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006700 ["Message"])))))))

(clojure.core/defn- response-get-resource-policy-response ([input] (response-get-resource-policy-response nil input)) ([resultWrapper2006702 input] (clojure.core/let [rawinput2006701 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006703 {"ARN" (rawinput2006701 "ARN"), "Name" (rawinput2006701 "Name"), "ResourcePolicy" (rawinput2006701 "ResourcePolicy")}] (clojure.core/cond-> {} (letvar2006703 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006703 ["ARN"]))) (letvar2006703 "Name") (clojure.core/assoc :name (deser-name-type (clojure.core/get-in letvar2006703 ["Name"]))) (letvar2006703 "ResourcePolicy") (clojure.core/assoc :resource-policy (deser-non-empty-resource-policy-type (clojure.core/get-in letvar2006703 ["ResourcePolicy"])))))))

(clojure.core/defn- response-update-secret-version-stage-response ([input] (response-update-secret-version-stage-response nil input)) ([resultWrapper2006705 input] (clojure.core/let [rawinput2006704 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006706 {"ARN" (rawinput2006704 "ARN"), "Name" (rawinput2006704 "Name")}] (clojure.core/cond-> {} (letvar2006706 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006706 ["ARN"]))) (letvar2006706 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006706 ["Name"])))))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper2006708 input] (clojure.core/let [rawinput2006707 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006709 {"Message" (rawinput2006707 "Message")}] (clojure.core/cond-> {} (letvar2006709 "Message") (clojure.core/assoc :message (deser-error-message (clojure.core/get-in letvar2006709 ["Message"])))))))

(clojure.core/defn- response-list-secret-version-ids-response ([input] (response-list-secret-version-ids-response nil input)) ([resultWrapper2006711 input] (clojure.core/let [rawinput2006710 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006712 {"Versions" (rawinput2006710 "Versions"), "NextToken" (rawinput2006710 "NextToken"), "ARN" (rawinput2006710 "ARN"), "Name" (rawinput2006710 "Name")}] (clojure.core/cond-> {} (letvar2006712 "Versions") (clojure.core/assoc :versions (deser-secret-versions-list-type (clojure.core/get-in letvar2006712 ["Versions"]))) (letvar2006712 "NextToken") (clojure.core/assoc :next-token (deser-next-token-type (clojure.core/get-in letvar2006712 ["NextToken"]))) (letvar2006712 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006712 ["ARN"]))) (letvar2006712 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006712 ["Name"])))))))

(clojure.core/defn- response-rotate-secret-response ([input] (response-rotate-secret-response nil input)) ([resultWrapper2006714 input] (clojure.core/let [rawinput2006713 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006715 {"ARN" (rawinput2006713 "ARN"), "Name" (rawinput2006713 "Name"), "VersionId" (rawinput2006713 "VersionId")}] (clojure.core/cond-> {} (letvar2006715 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006715 ["ARN"]))) (letvar2006715 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006715 ["Name"]))) (letvar2006715 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar2006715 ["VersionId"])))))))

(clojure.core/defn- response-put-secret-value-response ([input] (response-put-secret-value-response nil input)) ([resultWrapper2006717 input] (clojure.core/let [rawinput2006716 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2006718 {"ARN" (rawinput2006716 "ARN"), "Name" (rawinput2006716 "Name"), "VersionId" (rawinput2006716 "VersionId"), "VersionStages" (rawinput2006716 "VersionStages")}] (clojure.core/cond-> {} (letvar2006718 "ARN") (clojure.core/assoc :arn (deser-secret-arn-type (clojure.core/get-in letvar2006718 ["ARN"]))) (letvar2006718 "Name") (clojure.core/assoc :name (deser-secret-name-type (clojure.core/get-in letvar2006718 ["Name"]))) (letvar2006718 "VersionId") (clojure.core/assoc :version-id (deser-secret-version-id-type (clojure.core/get-in letvar2006718 ["VersionId"]))) (letvar2006718 "VersionStages") (clojure.core/assoc :version-stages (deser-secret-version-stages-type (clojure.core/get-in letvar2006718 ["VersionStages"])))))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.create-secret-request/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.create-secret-request/client-request-token (clojure.spec.alpha/and :portkey.aws.secretsmanager/client-request-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.create-secret-request/description (clojure.spec.alpha/and :portkey.aws.secretsmanager/description-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.create-secret-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/kms-key-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.create-secret-request/secret-binary (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-binary-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.create-secret-request/secret-string (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-string-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.create-secret-request/tags (clojure.spec.alpha/and :portkey.aws.secretsmanager/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/create-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.create-secret-request/name] :opt-un [:portkey.aws.secretsmanager.create-secret-request/client-request-token :portkey.aws.secretsmanager.create-secret-request/description :portkey.aws.secretsmanager.create-secret-request/kms-key-id :portkey.aws.secretsmanager.create-secret-request/secret-binary :portkey.aws.secretsmanager.create-secret-request/secret-string :portkey.aws.secretsmanager.create-secret-request/tags]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/rotation-lambda-arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/random-password-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-resource-policy-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-resource-policy-request/resource-policy (clojure.spec.alpha/and :portkey.aws.secretsmanager/non-empty-resource-policy-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/put-resource-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.put-resource-policy-request/secret-id :portkey.aws.secretsmanager.put-resource-policy-request/resource-policy] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-random-password-response/random-password (clojure.spec.alpha/and :portkey.aws.secretsmanager/random-password-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/get-random-password-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.get-random-password-response/random-password]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/last-accessed-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-random-password-request/password-length (clojure.spec.alpha/and :portkey.aws.secretsmanager/password-length-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-random-password-request/exclude-characters (clojure.spec.alpha/and :portkey.aws.secretsmanager/exclude-characters-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-random-password-request/exclude-numbers (clojure.spec.alpha/and :portkey.aws.secretsmanager/exclude-numbers-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-random-password-request/exclude-punctuation (clojure.spec.alpha/and :portkey.aws.secretsmanager/exclude-punctuation-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-random-password-request/exclude-uppercase (clojure.spec.alpha/and :portkey.aws.secretsmanager/exclude-uppercase-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-random-password-request/exclude-lowercase (clojure.spec.alpha/and :portkey.aws.secretsmanager/exclude-lowercase-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-random-password-request/include-space (clojure.spec.alpha/and :portkey.aws.secretsmanager/include-space-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-random-password-request/require-each-included-type (clojure.spec.alpha/and :portkey.aws.secretsmanager/require-each-included-type-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/get-random-password-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.get-random-password-request/password-length :portkey.aws.secretsmanager.get-random-password-request/exclude-characters :portkey.aws.secretsmanager.get-random-password-request/exclude-numbers :portkey.aws.secretsmanager.get-random-password-request/exclude-punctuation :portkey.aws.secretsmanager.get-random-password-request/exclude-uppercase :portkey.aws.secretsmanager.get-random-password-request/exclude-lowercase :portkey.aws.secretsmanager.get-random-password-request/include-space :portkey.aws.secretsmanager.get-random-password-request/require-each-included-type]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/rotation-enabled-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.delete-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.delete-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.delete-secret-response/deletion-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/deletion-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/delete-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.delete-secret-response/arn :portkey.aws.secretsmanager.delete-secret-response/name :portkey.aws.secretsmanager.delete-secret-response/deletion-date]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-list-type (clojure.spec.alpha/coll-of :portkey.aws.secretsmanager/secret-list-entry))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-arn-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 20 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secrets-response/secret-list (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secrets-response/next-token (clojure.spec.alpha/and :portkey.aws.secretsmanager/next-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/list-secrets-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.list-secrets-response/secret-list :portkey.aws.secretsmanager.list-secrets-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-versions-list-entry/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-versions-list-entry/version-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-stages-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-versions-list-entry/last-accessed-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/last-accessed-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-versions-list-entry/created-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/created-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-versions-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.secret-versions-list-entry/version-id :portkey.aws.secretsmanager.secret-versions-list-entry/version-stages :portkey.aws.secretsmanager.secret-versions-list-entry/last-accessed-date :portkey.aws.secretsmanager.secret-versions-list-entry/created-date]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/tag-key-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/created-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.restore-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.restore-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/restore-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.restore-secret-response/arn :portkey.aws.secretsmanager.restore-secret-response/name]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.encryption-failure/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/encryption-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.encryption-failure/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.decryption-failure/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/decryption-failure (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.decryption-failure/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.delete-resource-policy-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/delete-resource-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.delete-resource-policy-request/secret-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-secret-value-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-secret-value-request/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-secret-value-request/version-stage (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-stage-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/get-secret-value-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.get-secret-value-request/secret-id] :opt-un [:portkey.aws.secretsmanager.get-secret-value-request/version-id :portkey.aws.secretsmanager.get-secret-value-request/version-stage]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.delete-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.delete-secret-request/recovery-window-in-days (clojure.spec.alpha/and :portkey.aws.secretsmanager/recovery-window-in-days-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.delete-secret-request/force-delete-without-recovery (clojure.spec.alpha/and :portkey.aws.secretsmanager/boolean-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/delete-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.delete-secret-request/secret-id] :opt-un [:portkey.aws.secretsmanager.delete-secret-request/recovery-window-in-days :portkey.aws.secretsmanager.delete-secret-request/force-delete-without-recovery]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/exclude-characters-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/max-results-type (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-version-stages-type (clojure.spec.alpha/coll-of :portkey.aws.secretsmanager/secret-version-stage-type :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.rotate-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.rotate-secret-request/client-request-token (clojure.spec.alpha/and :portkey.aws.secretsmanager/client-request-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.rotate-secret-request/rotation-lambda-arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/rotation-lambda-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.rotate-secret-request/rotation-rules (clojure.spec.alpha/and :portkey.aws.secretsmanager/rotation-rules-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/rotate-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.rotate-secret-request/secret-id] :opt-un [:portkey.aws.secretsmanager.rotate-secret-request/client-request-token :portkey.aws.secretsmanager.rotate-secret-request/rotation-lambda-arn :portkey.aws.secretsmanager.rotate-secret-request/rotation-rules]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/password-length-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.internal-service-error/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/internal-service-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.internal-service-error/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.rotation-rules-type/automatically-after-days (clojure.spec.alpha/and :portkey.aws.secretsmanager/automatically-rotate-after-days-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/rotation-rules-type (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.rotation-rules-type/automatically-after-days]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-versions-list-type (clojure.spec.alpha/coll-of :portkey.aws.secretsmanager/secret-versions-list-entry))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/exclude-lowercase-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager/tag-key-list-type (clojure.spec.alpha/coll-of :portkey.aws.secretsmanager/tag-key-type))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.resource-exists-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/resource-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.resource-exists-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/deletion-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager/exclude-punctuation-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager/last-changed-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.cancel-rotate-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.cancel-rotate-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.cancel-rotate-secret-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/cancel-rotate-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.cancel-rotate-secret-response/arn :portkey.aws.secretsmanager.cancel-rotate-secret-response/name :portkey.aws.secretsmanager.cancel-rotate-secret-response/version-id]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/next-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/rotation-rules (clojure.spec.alpha/and :portkey.aws.secretsmanager/rotation-rules-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/last-rotated-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/last-rotated-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/tags (clojure.spec.alpha/and :portkey.aws.secretsmanager/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/last-accessed-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/last-accessed-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/last-changed-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/last-changed-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/description (clojure.spec.alpha/and :portkey.aws.secretsmanager/description-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/kms-key-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/kms-key-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/deleted-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/deleted-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/version-ids-to-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-versions-to-stages-map-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/rotation-enabled (clojure.spec.alpha/and :portkey.aws.secretsmanager/rotation-enabled-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-response/rotation-lambda-arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/rotation-lambda-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/describe-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.describe-secret-response/rotation-rules :portkey.aws.secretsmanager.describe-secret-response/last-rotated-date :portkey.aws.secretsmanager.describe-secret-response/tags :portkey.aws.secretsmanager.describe-secret-response/arn :portkey.aws.secretsmanager.describe-secret-response/last-accessed-date :portkey.aws.secretsmanager.describe-secret-response/last-changed-date :portkey.aws.secretsmanager.describe-secret-response/description :portkey.aws.secretsmanager.describe-secret-response/kms-key-id :portkey.aws.secretsmanager.describe-secret-response/deleted-date :portkey.aws.secretsmanager.describe-secret-response/version-ids-to-stages :portkey.aws.secretsmanager.describe-secret-response/rotation-enabled :portkey.aws.secretsmanager.describe-secret-response/name :portkey.aws.secretsmanager.describe-secret-response/rotation-lambda-arn]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-resource-policy-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/get-resource-policy-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.get-resource-policy-request/secret-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.invalid-next-token-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/invalid-next-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.invalid-next-token-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.create-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.create-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.create-secret-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/create-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.create-secret-response/arn :portkey.aws.secretsmanager.create-secret-response/name :portkey.aws.secretsmanager.create-secret-response/version-id]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/kms-key-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-version-stage-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.tag-resource-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.tag-resource-request/tags (clojure.spec.alpha/and :portkey.aws.secretsmanager/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/tag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.tag-resource-request/secret-id :portkey.aws.secretsmanager.tag-resource-request/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.cancel-rotate-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/cancel-rotate-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.cancel-rotate-secret-request/secret-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/exclude-numbers-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-secret-value-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-secret-value-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-secret-value-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-secret-value-response/secret-binary (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-binary-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-secret-value-response/secret-string (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-string-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-secret-value-response/version-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-stages-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-secret-value-response/created-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/created-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/get-secret-value-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.get-secret-value-response/arn :portkey.aws.secretsmanager.get-secret-value-response/name :portkey.aws.secretsmanager.get-secret-value-response/version-id :portkey.aws.secretsmanager.get-secret-value-response/secret-binary :portkey.aws.secretsmanager.get-secret-value-response/secret-string :portkey.aws.secretsmanager.get-secret-value-response/version-stages :portkey.aws.secretsmanager.get-secret-value-response/created-date]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/deleted-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-version-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 32 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-version-stage-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-version-stage-request/version-stage (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-stage-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-version-stage-request/remove-from-version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-version-stage-request/move-to-version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/update-secret-version-stage-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.update-secret-version-stage-request/secret-id :portkey.aws.secretsmanager.update-secret-version-stage-request/version-stage] :opt-un [:portkey.aws.secretsmanager.update-secret-version-stage-request/remove-from-version-id :portkey.aws.secretsmanager.update-secret-version-stage-request/move-to-version-id]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/include-space-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager/require-each-included-type-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.malformed-policy-document-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/malformed-policy-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.malformed-policy-document-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-secret-value-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-secret-value-request/client-request-token (clojure.spec.alpha/and :portkey.aws.secretsmanager/client-request-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-secret-value-request/secret-binary (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-binary-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-secret-value-request/secret-string (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-string-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-secret-value-request/version-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-stages-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/put-secret-value-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.put-secret-value-request/secret-id] :opt-un [:portkey.aws.secretsmanager.put-secret-value-request/client-request-token :portkey.aws.secretsmanager.put-secret-value-request/secret-binary :portkey.aws.secretsmanager.put-secret-value-request/secret-string :portkey.aws.secretsmanager.put-secret-value-request/version-stages]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/tag-list-type (clojure.spec.alpha/coll-of :portkey.aws.secretsmanager/tag))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-request/client-request-token (clojure.spec.alpha/and :portkey.aws.secretsmanager/client-request-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-request/description (clojure.spec.alpha/and :portkey.aws.secretsmanager/description-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-request/kms-key-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/kms-key-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-request/secret-binary (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-binary-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-request/secret-string (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-string-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/update-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.update-secret-request/secret-id] :opt-un [:portkey.aws.secretsmanager.update-secret-request/client-request-token :portkey.aws.secretsmanager.update-secret-request/description :portkey.aws.secretsmanager.update-secret-request/kms-key-id :portkey.aws.secretsmanager.update-secret-request/secret-binary :portkey.aws.secretsmanager.update-secret-request/secret-string]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/update-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.update-secret-response/arn :portkey.aws.secretsmanager.update-secret-response/name :portkey.aws.secretsmanager.update-secret-response/version-id]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-versions-to-stages-map-type (clojure.spec.alpha/map-of :portkey.aws.secretsmanager/secret-version-id-type :portkey.aws.secretsmanager/secret-version-stages-type))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/tag-value-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/client-request-token-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 32 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secret-version-ids-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secret-version-ids-request/max-results (clojure.spec.alpha/and :portkey.aws.secretsmanager/max-results-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secret-version-ids-request/next-token (clojure.spec.alpha/and :portkey.aws.secretsmanager/next-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secret-version-ids-request/include-deprecated (clojure.spec.alpha/and :portkey.aws.secretsmanager/boolean-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/list-secret-version-ids-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.list-secret-version-ids-request/secret-id] :opt-un [:portkey.aws.secretsmanager.list-secret-version-ids-request/max-results :portkey.aws.secretsmanager.list-secret-version-ids-request/next-token :portkey.aws.secretsmanager.list-secret-version-ids-request/include-deprecated]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/non-empty-resource-policy-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 4096))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/automatically-rotate-after-days-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.delete-resource-policy-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.delete-resource-policy-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/delete-resource-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.delete-resource-policy-response/arn :portkey.aws.secretsmanager.delete-resource-policy-response/name]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-resource-policy-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-resource-policy-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/put-resource-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.put-resource-policy-response/arn :portkey.aws.secretsmanager.put-resource-policy-response/name]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-binary-type clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.precondition-not-met-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/precondition-not-met-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.precondition-not-met-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/last-rotated-date-type clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secrets-request/max-results (clojure.spec.alpha/and :portkey.aws.secretsmanager/max-results-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secrets-request/next-token (clojure.spec.alpha/and :portkey.aws.secretsmanager/next-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/list-secrets-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.list-secrets-request/max-results :portkey.aws.secretsmanager.list-secrets-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/exclude-uppercase-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-string-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 0 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 7168))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/recovery-window-in-days-type clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager.tag/key (clojure.spec.alpha/and :portkey.aws.secretsmanager/tag-key-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.tag/value (clojure.spec.alpha/and :portkey.aws.secretsmanager/tag-value-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/tag (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.tag/key :portkey.aws.secretsmanager.tag/value]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/rotation-rules (clojure.spec.alpha/and :portkey.aws.secretsmanager/rotation-rules-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/last-rotated-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/last-rotated-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/tags (clojure.spec.alpha/and :portkey.aws.secretsmanager/tag-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/last-accessed-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/last-accessed-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/last-changed-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/last-changed-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/description (clojure.spec.alpha/and :portkey.aws.secretsmanager/description-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/kms-key-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/kms-key-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/deleted-date (clojure.spec.alpha/and :portkey.aws.secretsmanager/deleted-date-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/rotation-enabled (clojure.spec.alpha/and :portkey.aws.secretsmanager/rotation-enabled-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/secret-versions-to-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-versions-to-stages-map-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.secret-list-entry/rotation-lambda-arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/rotation-lambda-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-list-entry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.secret-list-entry/rotation-rules :portkey.aws.secretsmanager.secret-list-entry/last-rotated-date :portkey.aws.secretsmanager.secret-list-entry/tags :portkey.aws.secretsmanager.secret-list-entry/arn :portkey.aws.secretsmanager.secret-list-entry/last-accessed-date :portkey.aws.secretsmanager.secret-list-entry/last-changed-date :portkey.aws.secretsmanager.secret-list-entry/description :portkey.aws.secretsmanager.secret-list-entry/kms-key-id :portkey.aws.secretsmanager.secret-list-entry/deleted-date :portkey.aws.secretsmanager.secret-list-entry/rotation-enabled :portkey.aws.secretsmanager.secret-list-entry/name :portkey.aws.secretsmanager.secret-list-entry/secret-versions-to-stages :portkey.aws.secretsmanager.secret-list-entry/rotation-lambda-arn]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-resource-policy-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-resource-policy-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.get-resource-policy-response/resource-policy (clojure.spec.alpha/and :portkey.aws.secretsmanager/non-empty-resource-policy-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/get-resource-policy-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.get-resource-policy-response/arn :portkey.aws.secretsmanager.get-resource-policy-response/name :portkey.aws.secretsmanager.get-resource-policy-response/resource-policy]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/description-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/secret-id-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-version-stage-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.update-secret-version-stage-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/update-secret-version-stage-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.update-secret-version-stage-response/arn :portkey.aws.secretsmanager.update-secret-version-stage-response/name]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.invalid-parameter-exception/message (clojure.spec.alpha/and :portkey.aws.secretsmanager/error-message))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.invalid-parameter-exception/message]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secret-version-ids-response/versions (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-versions-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secret-version-ids-response/next-token (clojure.spec.alpha/and :portkey.aws.secretsmanager/next-token-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secret-version-ids-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.list-secret-version-ids-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/list-secret-version-ids-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.list-secret-version-ids-response/versions :portkey.aws.secretsmanager.list-secret-version-ids-response/next-token :portkey.aws.secretsmanager.list-secret-version-ids-response/arn :portkey.aws.secretsmanager.list-secret-version-ids-response/name]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.rotate-secret-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.rotate-secret-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.rotate-secret-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/rotate-secret-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.rotate-secret-response/arn :portkey.aws.secretsmanager.rotate-secret-response/name :portkey.aws.secretsmanager.rotate-secret-response/version-id]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-secret-value-response/arn (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-arn-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-secret-value-response/name (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-name-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-secret-value-response/version-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.put-secret-value-response/version-stages (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-version-stages-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/put-secret-value-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.secretsmanager.put-secret-value-response/arn :portkey.aws.secretsmanager.put-secret-value-response/name :portkey.aws.secretsmanager.put-secret-value-response/version-id :portkey.aws.secretsmanager.put-secret-value-response/version-stages]))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.describe-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/describe-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.describe-secret-request/secret-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.untag-resource-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager.untag-resource-request/tag-keys (clojure.spec.alpha/and :portkey.aws.secretsmanager/tag-key-list-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/untag-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.untag-resource-request/secret-id :portkey.aws.secretsmanager.untag-resource-request/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager.restore-secret-request/secret-id (clojure.spec.alpha/and :portkey.aws.secretsmanager/secret-id-type))
(clojure.spec.alpha/def :portkey.aws.secretsmanager/restore-secret-request (clojure.spec.alpha/keys :req-un [:portkey.aws.secretsmanager.restore-secret-request/secret-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.secretsmanager/boolean-type clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.secretsmanager/name-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512))))

(clojure.core/defn tag-resource ([tag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-tag-resource-request tag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/tag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "TagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef tag-resource :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/tag-resource-request) :ret clojure.core/true?)

(clojure.core/defn cancel-rotate-secret ([cancel-rotate-secret-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-cancel-rotate-secret-request cancel-rotate-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/cancel-rotate-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/cancel-rotate-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelRotateSecret", :http.request.configuration/output-deser-fn response-cancel-rotate-secret-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception}})))))
(clojure.spec.alpha/fdef cancel-rotate-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/cancel-rotate-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/cancel-rotate-secret-response))

(clojure.core/defn delete-resource-policy ([delete-resource-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-resource-policy-request delete-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/delete-resource-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/delete-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteResourcePolicy", :http.request.configuration/output-deser-fn response-delete-resource-policy-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-resource-policy :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/delete-resource-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/delete-resource-policy-response))

(clojure.core/defn get-random-password ([] (get-random-password {})) ([get-random-password-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-random-password-request get-random-password-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/get-random-password-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/get-random-password-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetRandomPassword", :http.request.configuration/output-deser-fn response-get-random-password-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef get-random-password :args (clojure.spec.alpha/? :portkey.aws.secretsmanager/get-random-password-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/get-random-password-response))

(clojure.core/defn update-secret ([update-secret-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-secret-request update-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/update-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/update-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSecret", :http.request.configuration/output-deser-fn response-update-secret-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception, "EncryptionFailure" :portkey.aws.secretsmanager/encryption-failure, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error, "LimitExceededException" :portkey.aws.secretsmanager/limit-exceeded-exception, "ResourceExistsException" :portkey.aws.secretsmanager/resource-exists-exception, "ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "MalformedPolicyDocumentException" :portkey.aws.secretsmanager/malformed-policy-document-exception, "PreconditionNotMetException" :portkey.aws.secretsmanager/precondition-not-met-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef update-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/update-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/update-secret-response))

(clojure.core/defn get-secret-value ([get-secret-value-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-secret-value-request get-secret-value-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/get-secret-value-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/get-secret-value-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSecretValue", :http.request.configuration/output-deser-fn response-get-secret-value-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception, "DecryptionFailure" :portkey.aws.secretsmanager/decryption-failure, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef get-secret-value :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/get-secret-value-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/get-secret-value-response))

(clojure.core/defn get-resource-policy ([get-resource-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-get-resource-policy-request get-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/get-resource-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/get-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetResourcePolicy", :http.request.configuration/output-deser-fn response-get-resource-policy-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-resource-policy :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/get-resource-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/get-resource-policy-response))

(clojure.core/defn list-secret-version-ids ([list-secret-version-ids-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-secret-version-ids-request list-secret-version-ids-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/list-secret-version-ids-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/list-secret-version-ids-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSecretVersionIds", :http.request.configuration/output-deser-fn response-list-secret-version-ids-response, :http.request.spec/error-spec {"InvalidNextTokenException" :portkey.aws.secretsmanager/invalid-next-token-exception, "ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef list-secret-version-ids :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/list-secret-version-ids-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/list-secret-version-ids-response))

(clojure.core/defn put-resource-policy ([put-resource-policy-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-resource-policy-request put-resource-policy-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/put-resource-policy-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/put-resource-policy-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutResourcePolicy", :http.request.configuration/output-deser-fn response-put-resource-policy-response, :http.request.spec/error-spec {"MalformedPolicyDocumentException" :portkey.aws.secretsmanager/malformed-policy-document-exception, "ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception}})))))
(clojure.spec.alpha/fdef put-resource-policy :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/put-resource-policy-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/put-resource-policy-response))

(clojure.core/defn put-secret-value ([put-secret-value-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-put-secret-value-request put-secret-value-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/put-secret-value-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/put-secret-value-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "PutSecretValue", :http.request.configuration/output-deser-fn response-put-secret-value-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception, "LimitExceededException" :portkey.aws.secretsmanager/limit-exceeded-exception, "EncryptionFailure" :portkey.aws.secretsmanager/encryption-failure, "ResourceExistsException" :portkey.aws.secretsmanager/resource-exists-exception, "ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef put-secret-value :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/put-secret-value-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/put-secret-value-response))

(clojure.core/defn describe-secret ([describe-secret-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-secret-request describe-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/describe-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/describe-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSecret", :http.request.configuration/output-deser-fn response-describe-secret-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef describe-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/describe-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/describe-secret-response))

(clojure.core/defn delete-secret ([delete-secret-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-secret-request delete-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/delete-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/delete-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSecret", :http.request.configuration/output-deser-fn response-delete-secret-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef delete-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/delete-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/delete-secret-response))

(clojure.core/defn untag-resource ([untag-resource-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-untag-resource-request untag-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/untag-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UntagResource", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1468877__auto__] {}), :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef untag-resource :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/untag-resource-request) :ret clojure.core/true?)

(clojure.core/defn update-secret-version-stage ([update-secret-version-stage-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-secret-version-stage-request update-secret-version-stage-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/update-secret-version-stage-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/update-secret-version-stage-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSecretVersionStage", :http.request.configuration/output-deser-fn response-update-secret-version-stage-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception, "LimitExceededException" :portkey.aws.secretsmanager/limit-exceeded-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef update-secret-version-stage :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/update-secret-version-stage-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/update-secret-version-stage-response))

(clojure.core/defn restore-secret ([restore-secret-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-restore-secret-request restore-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/restore-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/restore-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RestoreSecret", :http.request.configuration/output-deser-fn response-restore-secret-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef restore-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/restore-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/restore-secret-response))

(clojure.core/defn rotate-secret ([rotate-secret-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-rotate-secret-request rotate-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/rotate-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/rotate-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RotateSecret", :http.request.configuration/output-deser-fn response-rotate-secret-response, :http.request.spec/error-spec {"ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error, "InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception}})))))
(clojure.spec.alpha/fdef rotate-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/rotate-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/rotate-secret-response))

(clojure.core/defn list-secrets ([] (list-secrets {})) ([list-secrets-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-secrets-request list-secrets-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/list-secrets-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/list-secrets-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSecrets", :http.request.configuration/output-deser-fn response-list-secrets-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception, "InvalidNextTokenException" :portkey.aws.secretsmanager/invalid-next-token-exception, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error}})))))
(clojure.spec.alpha/fdef list-secrets :args (clojure.spec.alpha/? :portkey.aws.secretsmanager/list-secrets-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/list-secrets-response))

(clojure.core/defn create-secret ([create-secret-requestinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-secret-request create-secret-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.secretsmanager/endpoints, :http.request.configuration/target-prefix "secretsmanager", :http.request.spec/output-spec :portkey.aws.secretsmanager/create-secret-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-10-17", :http.request.configuration/service-id "Secrets Manager", :http.request.spec/input-spec :portkey.aws.secretsmanager/create-secret-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSecret", :http.request.configuration/output-deser-fn response-create-secret-response, :http.request.spec/error-spec {"InvalidRequestException" :portkey.aws.secretsmanager/invalid-request-exception, "EncryptionFailure" :portkey.aws.secretsmanager/encryption-failure, "InternalServiceError" :portkey.aws.secretsmanager/internal-service-error, "LimitExceededException" :portkey.aws.secretsmanager/limit-exceeded-exception, "ResourceExistsException" :portkey.aws.secretsmanager/resource-exists-exception, "ResourceNotFoundException" :portkey.aws.secretsmanager/resource-not-found-exception, "MalformedPolicyDocumentException" :portkey.aws.secretsmanager/malformed-policy-document-exception, "PreconditionNotMetException" :portkey.aws.secretsmanager/precondition-not-met-exception, "InvalidParameterException" :portkey.aws.secretsmanager/invalid-parameter-exception}})))))
(clojure.spec.alpha/fdef create-secret :args (clojure.spec.alpha/tuple :portkey.aws.secretsmanager/create-secret-request) :ret (clojure.spec.alpha/and :portkey.aws.secretsmanager/create-secret-response))
