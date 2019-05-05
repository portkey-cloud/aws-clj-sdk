(ns portkey.aws.sagemaker (:require [portkey.aws]))

(def
 endpoints
 '{"us-west-1-fips"
   {:credential-scope {:service "api.sagemaker", :region "us-west-1"},
    :ssl-common-name "api-fips.sagemaker.us-west-1.amazonaws.com",
    :endpoint "https://api-fips.sagemaker.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-1"
   {:credential-scope
    {:service "api.sagemaker", :region "ap-northeast-1"},
    :ssl-common-name "api.sagemaker.ap-northeast-1.amazonaws.com",
    :endpoint "https://api.sagemaker.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "api.sagemaker", :region "eu-west-1"},
    :ssl-common-name "api.sagemaker.eu-west-1.amazonaws.com",
    :endpoint "https://api.sagemaker.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "api.sagemaker", :region "us-east-2"},
    :ssl-common-name "api.sagemaker.us-east-2.amazonaws.com",
    :endpoint "https://api.sagemaker.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "api.sagemaker", :region "ap-southeast-2"},
    :ssl-common-name "api.sagemaker.ap-southeast-2.amazonaws.com",
    :endpoint "https://api.sagemaker.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "api.sagemaker", :region "ap-southeast-1"},
    :ssl-common-name "api.sagemaker.ap-southeast-1.amazonaws.com",
    :endpoint "https://api.sagemaker.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "api.sagemaker", :region "ap-northeast-2"},
    :ssl-common-name "api.sagemaker.ap-northeast-2.amazonaws.com",
    :endpoint "https://api.sagemaker.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "us-east-2-fips"
   {:credential-scope {:service "api.sagemaker", :region "us-east-2"},
    :ssl-common-name "api-fips.sagemaker.us-east-2.amazonaws.com",
    :endpoint "https://api-fips.sagemaker.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "api.sagemaker", :region "ca-central-1"},
    :ssl-common-name "api.sagemaker.ca-central-1.amazonaws.com",
    :endpoint "https://api.sagemaker.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "api.sagemaker", :region "eu-central-1"},
    :ssl-common-name "api.sagemaker.eu-central-1.amazonaws.com",
    :endpoint "https://api.sagemaker.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "api.sagemaker", :region "eu-west-2"},
    :ssl-common-name "api.sagemaker.eu-west-2.amazonaws.com",
    :endpoint "https://api.sagemaker.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "api.sagemaker", :region "us-gov-west-1"},
    :ssl-common-name "api.sagemaker.us-gov-west-1.amazonaws.com",
    :endpoint "https://api.sagemaker.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-1-fips"
   {:credential-scope {:service "api.sagemaker", :region "us-east-1"},
    :ssl-common-name "api-fips.sagemaker.us-east-1.amazonaws.com",
    :endpoint "https://api-fips.sagemaker.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "api.sagemaker", :region "us-west-2"},
    :ssl-common-name "api.sagemaker.us-west-2.amazonaws.com",
    :endpoint "https://api.sagemaker.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2-fips"
   {:credential-scope {:service "api.sagemaker", :region "us-west-2"},
    :ssl-common-name "api-fips.sagemaker.us-west-2.amazonaws.com",
    :endpoint "https://api-fips.sagemaker.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "api.sagemaker", :region "us-east-1"},
    :ssl-common-name "api.sagemaker.us-east-1.amazonaws.com",
    :endpoint "https://api.sagemaker.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "api.sagemaker", :region "us-west-1"},
    :ssl-common-name "api.sagemaker.us-west-1.amazonaws.com",
    :endpoint "https://api.sagemaker.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "api.sagemaker", :region "ap-south-1"},
    :ssl-common-name "api.sagemaker.ap-south-1.amazonaws.com",
    :endpoint "https://api.sagemaker.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-resource-config)

(clojure.core/declare ser-input-data-config)

(clojure.core/declare ser-notebook-instance-accelerator-types)

(clojure.core/declare ser-labeling-job-output-config)

(clojure.core/declare ser-suggestion-query)

(clojure.core/declare ser-transform-instance-types)

(clojure.core/declare ser-notebook-instance-accelerator-type)

(clojure.core/declare ser-task-count)

(clojure.core/declare ser-compression-type)

(clojure.core/declare ser-output-data-config)

(clojure.core/declare ser-cents)

(clojure.core/declare ser-continuous-parameter-range-specification)

(clojure.core/declare ser-attribute-names)

(clojure.core/declare ser-nested-filters-list)

(clojure.core/declare ser-arn-or-name)

(clojure.core/declare ser-filter)

(clojure.core/declare ser-metric-regex)

(clojure.core/declare ser-model-name)

(clojure.core/declare ser-name-contains)

(clojure.core/declare ser-endpoint-status)

(clojure.core/declare ser-job-reference-code-contains)

(clojure.core/declare ser-additional-code-repository-names-or-urls)

(clojure.core/declare ser-parameter-name)

(clojure.core/declare ser-hyper-parameter-tuning-job-status)

(clojure.core/declare ser-variant-name)

(clojure.core/declare ser-parameter-type)

(clojure.core/declare ser-list-labeling-jobs-for-workteam-sort-by-options)

(clojure.core/declare ser-sort-by)

(clojure.core/declare ser-cognito-user-group)

(clojure.core/declare ser-endpoint-config-name-contains)

(clojure.core/declare ser-member-definitions)

(clojure.core/declare ser-max-payload-in-mb)

(clojure.core/declare ser-template-content)

(clojure.core/declare ser-max-number-of-training-jobs)

(clojure.core/declare ser-parameter-key)

(clojure.core/declare ser-transform-resources)

(clojure.core/declare ser-volume-size-in-gb)

(clojure.core/declare ser-model-package-container-definition)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-image-digest)

(clojure.core/declare ser-hyper-parameters)

(clojure.core/declare ser-branch)

(clojure.core/declare ser-hyper-parameter-tuning-job-strategy-type)

(clojure.core/declare ser-continuous-parameter-ranges)

(clojure.core/declare ser-subnets)

(clojure.core/declare ser-property-name-hint)

(clojure.core/declare ser-workteam-name)

(clojure.core/declare ser-attribute-name)

(clojure.core/declare ser-shuffle-config)

(clojure.core/declare ser-channel-specifications)

(clojure.core/declare ser-transform-instance-count)

(clojure.core/declare ser-transform-data-source)

(clojure.core/declare ser-input-config)

(clojure.core/declare ser-resource-limits)

(clojure.core/declare ser-cognito-member-definition)

(clojure.core/declare ser-training-instance-count)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-s-3-data-type)

(clojure.core/declare ser-certify-for-marketplace)

(clojure.core/declare ser-s-3-data-distribution)

(clojure.core/declare ser-response-mime-type)

(clojure.core/declare ser-model-name-contains)

(clojure.core/declare ser-notebook-instance-lifecycle-config-sort-order)

(clojure.core/declare ser-entity-name)

(clojure.core/declare ser-algorithm-sort-by)

(clojure.core/declare ser-transform-s-3-data-source)

(clojure.core/declare ser-max-concurrent-transforms)

(clojure.core/declare ser-container-hostname)

(clojure.core/declare ser-order-key)

(clojure.core/declare ser-model-sort-key)

(clojure.core/declare ser-realtime-inference-instance-types)

(clojure.core/declare ser-instance-type)

(clojure.core/declare ser-disassociate-notebook-instance-accelerator-types)

(clojure.core/declare ser-public-workforce-task-price)

(clojure.core/declare ser-hyper-parameter-tuning-job-sort-by-options)

(clojure.core/declare ser-data-input-config)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-training-input-mode)

(clojure.core/declare ser-transform-input)

(clojure.core/declare ser-s-3-uri)

(clojure.core/declare ser-response-mime-types)

(clojure.core/declare ser-task-description)

(clojure.core/declare ser-integer-parameter-range-specification)

(clojure.core/declare ser-endpoint-config-sort-key)

(clojure.core/declare ser-notebook-instance-lifecycle-config-sort-key)

(clojure.core/declare ser-secret-arn)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-parent-hyper-parameter-tuning-job)

(clojure.core/declare ser-production-variant-instance-type)

(clojure.core/declare ser-sort-order)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-parameter-values)

(clojure.core/declare ser-production-variant-list)

(clojure.core/declare ser-environment-map)

(clojure.core/declare ser-max-parallel-training-jobs)

(clojure.core/declare ser-notebook-instance-lifecycle-config-name)

(clojure.core/declare ser-renderable-task)

(clojure.core/declare ser-session-expiration-duration-in-seconds)

(clojure.core/declare ser-tenth-fractions-of-a-cent)

(clojure.core/declare ser-workteam-arn)

(clojure.core/declare ser-code-repository-sort-by)

(clojure.core/declare ser-list-workteams-sort-by-options)

(clojure.core/declare ser-task-availability-lifetime-in-seconds)

(clojure.core/declare ser-vpc-security-group-ids)

(clojure.core/declare ser-notebook-instance-status)

(clojure.core/declare ser-notebook-instance-sort-order)

(clojure.core/declare ser-notebook-instance-lifecycle-config-name-contains)

(clojure.core/declare ser-number-of-human-workers-per-data-object)

(clojure.core/declare ser-git-config)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-max-concurrent-task-count)

(clojure.core/declare ser-code-repository-name-contains)

(clojure.core/declare ser-task-input)

(clojure.core/declare ser-hyper-parameter-tuning-job-warm-start-config)

(clojure.core/declare ser-algorithm-validation-specification)

(clojure.core/declare ser-endpoint-name)

(clojure.core/declare ser-training-instance-types)

(clojure.core/declare ser-endpoint-sort-key)

(clojure.core/declare ser-content-classifiers)

(clojure.core/declare ser-list-tags-max-results)

(clojure.core/declare ser-hyper-parameter-tuning-job-config)

(clojure.core/declare ser-hyper-parameter-tuning-job-objectives)

(clojure.core/declare ser-transform-job-definition)

(clojure.core/declare ser-labeling-job-algorithm-specification-arn)

(clojure.core/declare ser-algorithm-validation-profiles)

(clojure.core/declare ser-content-type)

(clojure.core/declare ser-ui-config)

(clojure.core/declare ser-transform-environment-value)

(clojure.core/declare ser-entity-description)

(clojure.core/declare ser-categorical-parameter-range-specification)

(clojure.core/declare ser-direct-internet-access)

(clojure.core/declare ser-model-package-validation-profiles)

(clojure.core/declare ser-member-definition)

(clojure.core/declare ser-transform-environment-map)

(clojure.core/declare ser-s-3-data-source)

(clojure.core/declare ser-search-expression)

(clojure.core/declare ser-stopping-condition)

(clojure.core/declare ser-property-name-query)

(clojure.core/declare ser-parent-hyper-parameter-tuning-jobs)

(clojure.core/declare ser-human-task-config)

(clojure.core/declare ser-compression-types)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-code-repository-contains)

(clojure.core/declare ser-hyper-parameter-specification)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-environment-value)

(clojure.core/declare ser-categorical-parameter-range)

(clojure.core/declare ser-hyper-parameter-tuning-job-objective-type)

(clojure.core/declare ser-git-config-url)

(clojure.core/declare ser-cognito-user-pool)

(clojure.core/declare ser-labeling-job-resource-config)

(clojure.core/declare ser-max-runtime-in-seconds)

(clojure.core/declare ser-transform-environment-key)

(clojure.core/declare ser-label-attribute-name)

(clojure.core/declare ser-metric-definition-list)

(clojure.core/declare ser-string-200)

(clojure.core/declare ser-model-package-validation-specification)

(clojure.core/declare ser-task-keywords)

(clojure.core/declare ser-notebook-instance-sort-key)

(clojure.core/declare ser-channel-name)

(clojure.core/declare ser-categorical-parameter-ranges)

(clojure.core/declare ser-search-expression-list)

(clojure.core/declare ser-notebook-instance-lifecycle-config-list)

(clojure.core/declare ser-nested-filters)

(clojure.core/declare ser-hyper-parameter-algorithm-specification)

(clojure.core/declare ser-url)

(clojure.core/declare ser-notebook-instance-lifecycle-config-content)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-container-definition)

(clojure.core/declare ser-seed)

(clojure.core/declare ser-resource-property-name)

(clojure.core/declare ser-lambda-function-arn)

(clojure.core/declare ser-model-package-validation-profile)

(clojure.core/declare ser-labeling-job-input-config)

(clojure.core/declare ser-parameter-ranges)

(clojure.core/declare ser-production-variant)

(clojure.core/declare ser-disassociate-default-code-repository)

(clojure.core/declare ser-container-definition-list)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-notebook-instance-lifecycle-hook)

(clojure.core/declare ser-channel-specification)

(clojure.core/declare ser-cognito-client-id)

(clojure.core/declare ser-code-repository-sort-order)

(clojure.core/declare ser-transform-job-name)

(clojure.core/declare ser-inference-specification)

(clojure.core/declare ser-task-keyword)

(clojure.core/declare ser-annotation-consolidation-config)

(clojure.core/declare ser-kms-key-id)

(clojure.core/declare ser-algorithm-validation-profile)

(clojure.core/declare ser-framework)

(clojure.core/declare ser-batch-strategy)

(clojure.core/declare ser-source-algorithm-list)

(clojure.core/declare ser-hyper-parameter-specifications)

(clojure.core/declare ser-dollars)

(clojure.core/declare ser-environment-key)

(clojure.core/declare ser-data-source)

(clojure.core/declare ser-source-algorithm-specification)

(clojure.core/declare ser-assembly-type)

(clojure.core/declare ser-variant-weight)

(clojure.core/declare ser-model-package-sort-by)

(clojure.core/declare ser-source-algorithm)

(clojure.core/declare ser-split-type)

(clojure.core/declare ser-boolean-operator)

(clojure.core/declare ser-parameter-range)

(clojure.core/declare ser-resource-type)

(clojure.core/declare ser-training-specification)

(clojure.core/declare ser-search-sort-order)

(clojure.core/declare ser-training-job-definition)

(clojure.core/declare ser-target-device)

(clojure.core/declare ser-training-job-sort-by-options)

(clojure.core/declare ser-hyper-parameter-tuning-job-warm-start-type)

(clojure.core/declare ser-disassociate-additional-code-repositories)

(clojure.core/declare ser-model-package-container-definition-list)

(clojure.core/declare ser-creation-time)

(clojure.core/declare ser-operator)

(clojure.core/declare ser-metric-definition)

(clojure.core/declare ser-vpc-config)

(clojure.core/declare ser-ui-template)

(clojure.core/declare ser-labeling-job-s-3-data-source)

(clojure.core/declare ser-hyper-parameter-tuning-job-name)

(clojure.core/declare ser-training-job-name)

(clojure.core/declare ser-transform-job-status)

(clojure.core/declare ser-transform-output)

(clojure.core/declare ser-desired-weight-and-capacity-list)

(clojure.core/declare ser-endpoint-name-contains)

(clojure.core/declare ser-hyper-parameter-training-job-definition)

(clojure.core/declare ser-timestamp)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-desired-weight-and-capacity)

(clojure.core/declare ser-record-wrapper)

(clojure.core/declare ser-channel)

(clojure.core/declare ser-hyper-parameter-tuning-job-objective)

(clojure.core/declare ser-labeling-job-name)

(clojure.core/declare ser-disassociate-notebook-instance-lifecycle-config)

(clojure.core/declare ser-notebook-instance-volume-size-in-gb)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-max-human-labeled-object-count)

(clojure.core/declare ser-labeling-job-stopping-conditions)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-integer-parameter-ranges)

(clojure.core/declare ser-training-instance-type)

(clojure.core/declare ser-integer-parameter-range)

(clojure.core/declare ser-algorithm-image)

(clojure.core/declare ser-task-time-limit-in-seconds)

(clojure.core/declare ser-task-title)

(clojure.core/declare ser-last-modified-time)

(clojure.core/declare ser-training-job-early-stopping-type)

(clojure.core/declare ser-content-types)

(clojure.core/declare ser-compilation-job-status)

(clojure.core/declare ser-image)

(clojure.core/declare ser-accept)

(clojure.core/declare ser-list-compilation-jobs-sort-by)

(clojure.core/declare ser-git-config-for-update)

(clojure.core/declare ser-usd)

(clojure.core/declare ser-product-id)

(clojure.core/declare ser-training-job-status)

(clojure.core/declare ser-continuous-parameter-range)

(clojure.core/declare ser-algorithm-specification)

(clojure.core/declare ser-notebook-instance-name-contains)

(clojure.core/declare ser-production-variant-accelerator-type)

(clojure.core/declare ser-notebook-instance-name)

(clojure.core/declare ser-labeling-job-data-attributes)

(clojure.core/declare ser-input-modes)

(clojure.core/declare ser-filter-list)

(clojure.core/declare ser-filter-value)

(clojure.core/declare ser-code-repository-name-or-url)

(clojure.core/declare ser-max-percentage-of-input-dataset-labeled)

(clojure.core/declare ser-transform-instance-type)

(clojure.core/declare ser-labeling-job-status)

(clojure.core/declare ser-endpoint-config-name)

(clojure.core/declare ser-labeling-job-algorithms-config)

(clojure.core/declare ser-parameter-value)

(clojure.core/declare ser-labeling-job-data-source)

(clojure.core/declare ser-output-config)

(clojure.core/declare ser-model-arn)

(clojure.core/declare ser-content-classifier)

(clojure.core/declare ser-boolean)

(clojure.core/defn- ser-resource-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-training-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "TrainingInstanceType"}) (clojure.core/into (ser-training-instance-count (:instance-count input)) #:http.request.field{:name "InstanceCount", :shape "TrainingInstanceCount"}) (clojure.core/into (ser-volume-size-in-gb (:volume-size-in-gb input)) #:http.request.field{:name "VolumeSizeInGB", :shape "VolumeSizeInGB"})], :shape "ResourceConfig", :type "structure"} (clojure.core/contains? input :volume-kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :volume-kms-key-id)) #:http.request.field{:name "VolumeKmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-input-data-config [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-channel coll) #:http.request.field{:shape "Channel"}))) input), :shape "InputDataConfig", :type "list", :max 8, :min 1})

(clojure.core/defn- ser-notebook-instance-accelerator-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-notebook-instance-accelerator-type coll) #:http.request.field{:shape "NotebookInstanceAcceleratorType"}))) input), :shape "NotebookInstanceAcceleratorTypes", :type "list"})

(clojure.core/defn- ser-labeling-job-output-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-output-path input)) #:http.request.field{:name "S3OutputPath", :shape "S3Uri"})], :shape "LabelingJobOutputConfig", :type "structure"} (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-suggestion-query [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SuggestionQuery", :type "structure"} (clojure.core/contains? input :property-name-query) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-property-name-query (input :property-name-query)) #:http.request.field{:name "PropertyNameQuery", :shape "PropertyNameQuery"}))))

(clojure.core/defn- ser-transform-instance-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-transform-instance-type coll) #:http.request.field{:shape "TransformInstanceType"}))) input), :shape "TransformInstanceTypes", :type "list", :min 1})

(clojure.core/defn- ser-notebook-instance-accelerator-type [input] #:http.request.field{:value (clojure.core/get {"ml.eia1.medium" "ml.eia1.medium", :mleia-1medium "ml.eia1.medium", "ml.eia1.large" "ml.eia1.large", :mleia-1large "ml.eia1.large", "ml.eia1.xlarge" "ml.eia1.xlarge", :mleia-1xlarge "ml.eia1.xlarge"} input), :shape "NotebookInstanceAcceleratorType"})

(clojure.core/defn- ser-task-count [input] #:http.request.field{:value input, :shape "TaskCount"})

(clojure.core/defn- ser-compression-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Gzip" "Gzip", :gzip "Gzip"} input), :shape "CompressionType"})

(clojure.core/defn- ser-output-data-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-output-path input)) #:http.request.field{:name "S3OutputPath", :shape "S3Uri"})], :shape "OutputDataConfig", :type "structure"} (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-cents [input] #:http.request.field{:value input, :shape "Cents"})

(clojure.core/defn- ser-continuous-parameter-range-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-value (:min-value input)) #:http.request.field{:name "MinValue", :shape "ParameterValue"}) (clojure.core/into (ser-parameter-value (:max-value input)) #:http.request.field{:name "MaxValue", :shape "ParameterValue"})], :shape "ContinuousParameterRangeSpecification", :type "structure"}))

(clojure.core/defn- ser-attribute-names [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute-name coll) #:http.request.field{:shape "AttributeName"}))) input), :shape "AttributeNames", :type "list", :max 16})

(clojure.core/defn- ser-nested-filters-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-nested-filters coll) #:http.request.field{:shape "NestedFilters"}))) input), :shape "NestedFiltersList", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-arn-or-name [input] #:http.request.field{:value input, :shape "ArnOrName"})

(clojure.core/defn- ser-filter [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-property-name (:name input)) #:http.request.field{:name "Name", :shape "ResourcePropertyName"})], :shape "Filter", :type "structure"} (clojure.core/contains? input :operator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-operator (input :operator)) #:http.request.field{:name "Operator", :shape "Operator"})) (clojure.core/contains? input :value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-value (input :value)) #:http.request.field{:name "Value", :shape "FilterValue"}))))

(clojure.core/defn- ser-metric-regex [input] #:http.request.field{:value input, :shape "MetricRegex"})

(clojure.core/defn- ser-model-name [input] #:http.request.field{:value input, :shape "ModelName"})

(clojure.core/defn- ser-name-contains [input] #:http.request.field{:value input, :shape "NameContains"})

(clojure.core/defn- ser-endpoint-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", "Creating" "Creating", "SystemUpdating" "SystemUpdating", :system-updating "SystemUpdating", :creating "Creating", "InService" "InService", "RollingBack" "RollingBack", :deleting "Deleting", "OutOfService" "OutOfService", :out-of-service "OutOfService", "Deleting" "Deleting", :in-service "InService", :rolling-back "RollingBack", :updating "Updating", "Updating" "Updating", :failed "Failed"} input), :shape "EndpointStatus"})

(clojure.core/defn- ser-job-reference-code-contains [input] #:http.request.field{:value input, :shape "JobReferenceCodeContains"})

(clojure.core/defn- ser-additional-code-repository-names-or-urls [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-code-repository-name-or-url coll) #:http.request.field{:shape "CodeRepositoryNameOrUrl"}))) input), :shape "AdditionalCodeRepositoryNamesOrUrls", :type "list", :max 3})

(clojure.core/defn- ser-parameter-name [input] #:http.request.field{:value input, :shape "ParameterName"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :in-progress "InProgress", :completed "Completed", :stopping "Stopping", :stopped "Stopped", "InProgress" "InProgress", "Stopping" "Stopping", "Stopped" "Stopped", "Completed" "Completed", :failed "Failed"} input), :shape "HyperParameterTuningJobStatus"})

(clojure.core/defn- ser-variant-name [input] #:http.request.field{:value input, :shape "VariantName"})

(clojure.core/defn- ser-parameter-type [input] #:http.request.field{:value (clojure.core/get {"Integer" "Integer", :integer "Integer", "Continuous" "Continuous", :continuous "Continuous", "Categorical" "Categorical", :categorical "Categorical", "FreeText" "FreeText", :free-text "FreeText"} input), :shape "ParameterType"})

(clojure.core/defn- ser-list-labeling-jobs-for-workteam-sort-by-options [input] #:http.request.field{:value (clojure.core/get {"CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "ListLabelingJobsForWorkteamSortByOptions"})

(clojure.core/defn- ser-sort-by [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status"} input), :shape "SortBy"})

(clojure.core/defn- ser-cognito-user-group [input] #:http.request.field{:value input, :shape "CognitoUserGroup"})

(clojure.core/defn- ser-endpoint-config-name-contains [input] #:http.request.field{:value input, :shape "EndpointConfigNameContains"})

(clojure.core/defn- ser-member-definitions [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-member-definition coll) #:http.request.field{:shape "MemberDefinition"}))) input), :shape "MemberDefinitions", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-max-payload-in-mb [input] #:http.request.field{:value input, :shape "MaxPayloadInMB"})

(clojure.core/defn- ser-template-content [input] #:http.request.field{:value input, :shape "TemplateContent"})

(clojure.core/defn- ser-max-number-of-training-jobs [input] #:http.request.field{:value input, :shape "MaxNumberOfTrainingJobs"})

(clojure.core/defn- ser-parameter-key [input] #:http.request.field{:value input, :shape "ParameterKey"})

(clojure.core/defn- ser-transform-resources [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transform-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "TransformInstanceType"}) (clojure.core/into (ser-transform-instance-count (:instance-count input)) #:http.request.field{:name "InstanceCount", :shape "TransformInstanceCount"})], :shape "TransformResources", :type "structure"} (clojure.core/contains? input :volume-kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :volume-kms-key-id)) #:http.request.field{:name "VolumeKmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-volume-size-in-gb [input] #:http.request.field{:value input, :shape "VolumeSizeInGB"})

(clojure.core/defn- ser-model-package-container-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-image (:image input)) #:http.request.field{:name "Image", :shape "Image"})], :shape "ModelPackageContainerDefinition", :type "structure"} (clojure.core/contains? input :container-hostname) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-hostname (input :container-hostname)) #:http.request.field{:name "ContainerHostname", :shape "ContainerHostname"})) (clojure.core/contains? input :image-digest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-digest (input :image-digest)) #:http.request.field{:name "ImageDigest", :shape "ImageDigest"})) (clojure.core/contains? input :model-data-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url (input :model-data-url)) #:http.request.field{:name "ModelDataUrl", :shape "Url"})) (clojure.core/contains? input :product-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-product-id (input :product-id)) #:http.request.field{:name "ProductId", :shape "ProductId"}))))

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroupIds", :type "list", :max 5})

(clojure.core/defn- ser-image-digest [input] #:http.request.field{:value input, :shape "ImageDigest"})

(clojure.core/defn- ser-hyper-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-parameter-key k) #:http.request.field{:map-info "key", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-value v) #:http.request.field{:map-info "value", :shape "ParameterValue"})])) input), :shape "HyperParameters", :type "map", :max 100, :min 0})

(clojure.core/defn- ser-branch [input] #:http.request.field{:value input, :shape "Branch"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-strategy-type [input] #:http.request.field{:value (clojure.core/get {"Bayesian" "Bayesian", :bayesian "Bayesian"} input), :shape "HyperParameterTuningJobStrategyType"})

(clojure.core/defn- ser-continuous-parameter-ranges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-continuous-parameter-range coll) #:http.request.field{:shape "ContinuousParameterRange"}))) input), :shape "ContinuousParameterRanges", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-subnets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "Subnets", :type "list", :max 16, :min 1})

(clojure.core/defn- ser-property-name-hint [input] #:http.request.field{:value input, :shape "PropertyNameHint"})

(clojure.core/defn- ser-workteam-name [input] #:http.request.field{:value input, :shape "WorkteamName"})

(clojure.core/defn- ser-attribute-name [input] #:http.request.field{:value input, :shape "AttributeName"})

(clojure.core/defn- ser-shuffle-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-seed (:seed input)) #:http.request.field{:name "Seed", :shape "Seed"})], :shape "ShuffleConfig", :type "structure"}))

(clojure.core/defn- ser-channel-specifications [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-channel-specification coll) #:http.request.field{:shape "ChannelSpecification"}))) input), :shape "ChannelSpecifications", :type "list", :max 8, :min 1})

(clojure.core/defn- ser-transform-instance-count [input] #:http.request.field{:value input, :shape "TransformInstanceCount"})

(clojure.core/defn- ser-transform-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transform-s-3-data-source (:s-3-data-source input)) #:http.request.field{:name "S3DataSource", :shape "TransformS3DataSource"})], :shape "TransformDataSource", :type "structure"}))

(clojure.core/defn- ser-input-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"}) (clojure.core/into (ser-data-input-config (:data-input-config input)) #:http.request.field{:name "DataInputConfig", :shape "DataInputConfig"}) (clojure.core/into (ser-framework (:framework input)) #:http.request.field{:name "Framework", :shape "Framework"})], :shape "InputConfig", :type "structure"}))

(clojure.core/defn- ser-resource-limits [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-max-number-of-training-jobs (:max-number-of-training-jobs input)) #:http.request.field{:name "MaxNumberOfTrainingJobs", :shape "MaxNumberOfTrainingJobs"}) (clojure.core/into (ser-max-parallel-training-jobs (:max-parallel-training-jobs input)) #:http.request.field{:name "MaxParallelTrainingJobs", :shape "MaxParallelTrainingJobs"})], :shape "ResourceLimits", :type "structure"}))

(clojure.core/defn- ser-cognito-member-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-cognito-user-pool (:user-pool input)) #:http.request.field{:name "UserPool", :shape "CognitoUserPool"}) (clojure.core/into (ser-cognito-user-group (:user-group input)) #:http.request.field{:name "UserGroup", :shape "CognitoUserGroup"}) (clojure.core/into (ser-cognito-client-id (:client-id input)) #:http.request.field{:name "ClientId", :shape "CognitoClientId"})], :shape "CognitoMemberDefinition", :type "structure"}))

(clojure.core/defn- ser-training-instance-count [input] #:http.request.field{:value input, :shape "TrainingInstanceCount"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-s-3-data-type [input] #:http.request.field{:value (clojure.core/get {"ManifestFile" "ManifestFile", :manifest-file "ManifestFile", "S3Prefix" "S3Prefix", :s-3-prefix "S3Prefix", "AugmentedManifestFile" "AugmentedManifestFile", :augmented-manifest-file "AugmentedManifestFile"} input), :shape "S3DataType"})

(clojure.core/defn- ser-certify-for-marketplace [input] #:http.request.field{:value input, :shape "CertifyForMarketplace"})

(clojure.core/defn- ser-s-3-data-distribution [input] #:http.request.field{:value (clojure.core/get {"FullyReplicated" "FullyReplicated", :fully-replicated "FullyReplicated", "ShardedByS3Key" "ShardedByS3Key", :sharded-by-s-3-key "ShardedByS3Key"} input), :shape "S3DataDistribution"})

(clojure.core/defn- ser-response-mime-type [input] #:http.request.field{:value input, :shape "ResponseMIMEType"})

(clojure.core/defn- ser-model-name-contains [input] #:http.request.field{:value input, :shape "ModelNameContains"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "NotebookInstanceLifecycleConfigSortOrder"})

(clojure.core/defn- ser-entity-name [input] #:http.request.field{:value input, :shape "EntityName"})

(clojure.core/defn- ser-algorithm-sort-by [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "AlgorithmSortBy"})

(clojure.core/defn- ser-transform-s-3-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-data-type (:s-3-data-type input)) #:http.request.field{:name "S3DataType", :shape "S3DataType"}) (clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "TransformS3DataSource", :type "structure"}))

(clojure.core/defn- ser-max-concurrent-transforms [input] #:http.request.field{:value input, :shape "MaxConcurrentTransforms"})

(clojure.core/defn- ser-container-hostname [input] #:http.request.field{:value input, :shape "ContainerHostname"})

(clojure.core/defn- ser-order-key [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "OrderKey"})

(clojure.core/defn- ser-model-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "ModelSortKey"})

(clojure.core/defn- ser-realtime-inference-instance-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-production-variant-instance-type coll) #:http.request.field{:shape "ProductionVariantInstanceType"}))) input), :shape "RealtimeInferenceInstanceTypes", :type "list"})

(clojure.core/defn- ser-instance-type [input] #:http.request.field{:value (clojure.core/get {:mlc-5d-2xlarge "ml.c5d.2xlarge", "ml.t2.large" "ml.t2.large", :mlm-42xlarge "ml.m4.2xlarge", :mlt-3medium "ml.t3.medium", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.m5.xlarge" "ml.m5.xlarge", "ml.c5.xlarge" "ml.c5.xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.c5.9xlarge" "ml.c5.9xlarge", :mlm-54xlarge "ml.m5.4xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlt-2medium "ml.t2.medium", :mlt-2large "ml.t2.large", :mlc-5d-9xlarge "ml.c5d.9xlarge", :mlm-52xlarge "ml.m5.2xlarge", :mlc-54xlarge "ml.c5.4xlarge", "ml.m5.12xlarge" "ml.m5.12xlarge", "ml.c5.2xlarge" "ml.c5.2xlarge", :mlc-52xlarge "ml.c5.2xlarge", "ml.c5d.18xlarge" "ml.c5d.18xlarge", "ml.c4.2xlarge" "ml.c4.2xlarge", "ml.t2.2xlarge" "ml.t2.2xlarge", "ml.t3.large" "ml.t3.large", "ml.c4.4xlarge" "ml.c4.4xlarge", :mlm-410xlarge "ml.m4.10xlarge", "ml.t3.xlarge" "ml.t3.xlarge", :mlm-512xlarge "ml.m5.12xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m5.4xlarge" "ml.m5.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", "ml.c5d.2xlarge" "ml.c5d.2xlarge", :mlc-5d-18xlarge "ml.c5d.18xlarge", "ml.c5d.9xlarge" "ml.c5d.9xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlt-2xlarge "ml.t2.xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", "ml.c5d.4xlarge" "ml.c5d.4xlarge", "ml.t3.2xlarge" "ml.t3.2xlarge", :mlc-48xlarge "ml.c4.8xlarge", "ml.t3.medium" "ml.t3.medium", "ml.t2.xlarge" "ml.t2.xlarge", :mlt-22xlarge "ml.t2.2xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", :mlc-59xlarge "ml.c5.9xlarge", :mlc-4xlarge "ml.c4.xlarge", "ml.c4.8xlarge" "ml.c4.8xlarge", "ml.c5.18xlarge" "ml.c5.18xlarge", :mlc-42xlarge "ml.c4.2xlarge", :mlc-44xlarge "ml.c4.4xlarge", :mlt-3xlarge "ml.t3.xlarge", "ml.m5.2xlarge" "ml.m5.2xlarge", :mlc-518xlarge "ml.c5.18xlarge", "ml.c4.xlarge" "ml.c4.xlarge", "ml.m5.24xlarge" "ml.m5.24xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlt-32xlarge "ml.t3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlm-524xlarge "ml.m5.24xlarge", "ml.c5d.xlarge" "ml.c5d.xlarge", :mlp-2xlarge "ml.p2.xlarge", :mlt-3large "ml.t3.large", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-5xlarge "ml.m5.xlarge", :mlc-5dxlarge "ml.c5d.xlarge", :mlm-4xlarge "ml.m4.xlarge", :mlc-5d-4xlarge "ml.c5d.4xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", :mlc-5xlarge "ml.c5.xlarge", "ml.t2.medium" "ml.t2.medium", "ml.c5.4xlarge" "ml.c5.4xlarge"} input), :shape "InstanceType"})

(clojure.core/defn- ser-disassociate-notebook-instance-accelerator-types [input] #:http.request.field{:value input, :shape "DisassociateNotebookInstanceAcceleratorTypes"})

(clojure.core/defn- ser-public-workforce-task-price [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "PublicWorkforceTaskPrice", :type "structure"} (clojure.core/contains? input :amount-in-usd) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-usd (input :amount-in-usd)) #:http.request.field{:name "AmountInUsd", :shape "USD"}))))

(clojure.core/defn- ser-hyper-parameter-tuning-job-sort-by-options [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "Status" "Status", :status "Status", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "HyperParameterTuningJobSortByOptions"})

(clojure.core/defn- ser-data-input-config [input] #:http.request.field{:value input, :shape "DataInputConfig"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-training-input-mode [input] #:http.request.field{:value (clojure.core/get {"Pipe" "Pipe", :pipe "Pipe", "File" "File", :file "File"} input), :shape "TrainingInputMode"})

(clojure.core/defn- ser-transform-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transform-data-source (:data-source input)) #:http.request.field{:name "DataSource", :shape "TransformDataSource"})], :shape "TransformInput", :type "structure"} (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType"})) (clojure.core/contains? input :compression-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-type (input :compression-type)) #:http.request.field{:name "CompressionType", :shape "CompressionType"})) (clojure.core/contains? input :split-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-split-type (input :split-type)) #:http.request.field{:name "SplitType", :shape "SplitType"}))))

(clojure.core/defn- ser-s-3-uri [input] #:http.request.field{:value input, :shape "S3Uri"})

(clojure.core/defn- ser-response-mime-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-response-mime-type coll) #:http.request.field{:shape "ResponseMIMEType"}))) input), :shape "ResponseMIMETypes", :type "list"})

(clojure.core/defn- ser-task-description [input] #:http.request.field{:value input, :shape "TaskDescription"})

(clojure.core/defn- ser-integer-parameter-range-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-value (:min-value input)) #:http.request.field{:name "MinValue", :shape "ParameterValue"}) (clojure.core/into (ser-parameter-value (:max-value input)) #:http.request.field{:name "MaxValue", :shape "ParameterValue"})], :shape "IntegerParameterRangeSpecification", :type "structure"}))

(clojure.core/defn- ser-endpoint-config-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "EndpointConfigSortKey"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "LastModifiedTime" "LastModifiedTime", :last-modified-time "LastModifiedTime"} input), :shape "NotebookInstanceLifecycleConfigSortKey"})

(clojure.core/defn- ser-secret-arn [input] #:http.request.field{:value input, :shape "SecretArn"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-parent-hyper-parameter-tuning-job [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ParentHyperParameterTuningJob", :type "structure"} (clojure.core/contains? input :hyper-parameter-tuning-job-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"}))))

(clojure.core/defn- ser-production-variant-instance-type [input] #:http.request.field{:value (clojure.core/get {:mlm-5large "ml.m5.large", "ml.t2.large" "ml.t2.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.c4.large" "ml.c4.large", "ml.m5.xlarge" "ml.m5.xlarge", "ml.c5.xlarge" "ml.c5.xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.c5.9xlarge" "ml.c5.9xlarge", :mlm-54xlarge "ml.m5.4xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlt-2medium "ml.t2.medium", :mlt-2large "ml.t2.large", :mlm-52xlarge "ml.m5.2xlarge", "ml.m5.large" "ml.m5.large", :mlc-54xlarge "ml.c5.4xlarge", "ml.m5.12xlarge" "ml.m5.12xlarge", "ml.c5.2xlarge" "ml.c5.2xlarge", :mlc-52xlarge "ml.c5.2xlarge", "ml.c4.2xlarge" "ml.c4.2xlarge", "ml.t2.2xlarge" "ml.t2.2xlarge", "ml.c5.large" "ml.c5.large", "ml.c4.4xlarge" "ml.c4.4xlarge", :mlm-410xlarge "ml.m4.10xlarge", :mlm-512xlarge "ml.m5.12xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m5.4xlarge" "ml.m5.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlc-4large "ml.c4.large", :mlt-2xlarge "ml.t2.xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", :mlc-48xlarge "ml.c4.8xlarge", "ml.t2.xlarge" "ml.t2.xlarge", :mlt-22xlarge "ml.t2.2xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", :mlc-59xlarge "ml.c5.9xlarge", :mlc-4xlarge "ml.c4.xlarge", "ml.c4.8xlarge" "ml.c4.8xlarge", "ml.c5.18xlarge" "ml.c5.18xlarge", :mlc-42xlarge "ml.c4.2xlarge", :mlc-44xlarge "ml.c4.4xlarge", "ml.m5.2xlarge" "ml.m5.2xlarge", :mlc-518xlarge "ml.c5.18xlarge", "ml.c4.xlarge" "ml.c4.xlarge", "ml.m5.24xlarge" "ml.m5.24xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlm-524xlarge "ml.m5.24xlarge", :mlp-2xlarge "ml.p2.xlarge", :mlc-5large "ml.c5.large", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-5xlarge "ml.m5.xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", :mlc-5xlarge "ml.c5.xlarge", "ml.t2.medium" "ml.t2.medium", "ml.c5.4xlarge" "ml.c5.4xlarge"} input), :shape "ProductionVariantInstanceType"})

(clojure.core/defn- ser-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "SortOrder"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-parameter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-value coll) #:http.request.field{:shape "ParameterValue"}))) input), :shape "ParameterValues", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-production-variant-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-production-variant coll) #:http.request.field{:shape "ProductionVariant"}))) input), :shape "ProductionVariantList", :type "list", :min 1})

(clojure.core/defn- ser-environment-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-environment-key k) #:http.request.field{:map-info "key", :shape "EnvironmentKey"}) (clojure.core/into (ser-environment-value v) #:http.request.field{:map-info "value", :shape "EnvironmentValue"})])) input), :shape "EnvironmentMap", :type "map", :max 16})

(clojure.core/defn- ser-max-parallel-training-jobs [input] #:http.request.field{:value input, :shape "MaxParallelTrainingJobs"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-name [input] #:http.request.field{:value input, :shape "NotebookInstanceLifecycleConfigName"})

(clojure.core/defn- ser-renderable-task [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-task-input (:input input)) #:http.request.field{:name "Input", :shape "TaskInput"})], :shape "RenderableTask", :type "structure"}))

(clojure.core/defn- ser-session-expiration-duration-in-seconds [input] #:http.request.field{:value input, :shape "SessionExpirationDurationInSeconds"})

(clojure.core/defn- ser-tenth-fractions-of-a-cent [input] #:http.request.field{:value input, :shape "TenthFractionsOfACent"})

(clojure.core/defn- ser-workteam-arn [input] #:http.request.field{:value input, :shape "WorkteamArn"})

(clojure.core/defn- ser-code-repository-sort-by [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "LastModifiedTime" "LastModifiedTime", :last-modified-time "LastModifiedTime"} input), :shape "CodeRepositorySortBy"})

(clojure.core/defn- ser-list-workteams-sort-by-options [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreateDate" "CreateDate", :create-date "CreateDate"} input), :shape "ListWorkteamsSortByOptions"})

(clojure.core/defn- ser-task-availability-lifetime-in-seconds [input] #:http.request.field{:value input, :shape "TaskAvailabilityLifetimeInSeconds"})

(clojure.core/defn- ser-vpc-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "VpcSecurityGroupIds", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-notebook-instance-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :pending "Pending", "InService" "InService", :deleting "Deleting", :stopping "Stopping", :stopped "Stopped", "Deleting" "Deleting", :in-service "InService", "Stopping" "Stopping", :updating "Updating", "Stopped" "Stopped", "Pending" "Pending", "Updating" "Updating", :failed "Failed"} input), :shape "NotebookInstanceStatus"})

(clojure.core/defn- ser-notebook-instance-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "NotebookInstanceSortOrder"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-name-contains [input] #:http.request.field{:value input, :shape "NotebookInstanceLifecycleConfigNameContains"})

(clojure.core/defn- ser-number-of-human-workers-per-data-object [input] #:http.request.field{:value input, :shape "NumberOfHumanWorkersPerDataObject"})

(clojure.core/defn- ser-git-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-git-config-url (:repository-url input)) #:http.request.field{:name "RepositoryUrl", :shape "GitConfigUrl"})], :shape "GitConfig", :type "structure"} (clojure.core/contains? input :branch) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-branch (input :branch)) #:http.request.field{:name "Branch", :shape "Branch"})) (clojure.core/contains? input :secret-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-arn (input :secret-arn)) #:http.request.field{:name "SecretArn", :shape "SecretArn"}))))

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-max-concurrent-task-count [input] #:http.request.field{:value input, :shape "MaxConcurrentTaskCount"})

(clojure.core/defn- ser-code-repository-name-contains [input] #:http.request.field{:value input, :shape "CodeRepositoryNameContains"})

(clojure.core/defn- ser-task-input [input] #:http.request.field{:value input, :shape "TaskInput"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-warm-start-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parent-hyper-parameter-tuning-jobs (:parent-hyper-parameter-tuning-jobs input)) #:http.request.field{:name "ParentHyperParameterTuningJobs", :shape "ParentHyperParameterTuningJobs"}) (clojure.core/into (ser-hyper-parameter-tuning-job-warm-start-type (:warm-start-type input)) #:http.request.field{:name "WarmStartType", :shape "HyperParameterTuningJobWarmStartType"})], :shape "HyperParameterTuningJobWarmStartConfig", :type "structure"}))

(clojure.core/defn- ser-algorithm-validation-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role-arn (:validation-role input)) #:http.request.field{:name "ValidationRole", :shape "RoleArn"}) (clojure.core/into (ser-algorithm-validation-profiles (:validation-profiles input)) #:http.request.field{:name "ValidationProfiles", :shape "AlgorithmValidationProfiles"})], :shape "AlgorithmValidationSpecification", :type "structure"}))

(clojure.core/defn- ser-endpoint-name [input] #:http.request.field{:value input, :shape "EndpointName"})

(clojure.core/defn- ser-training-instance-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-training-instance-type coll) #:http.request.field{:shape "TrainingInstanceType"}))) input), :shape "TrainingInstanceTypes", :type "list"})

(clojure.core/defn- ser-endpoint-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status"} input), :shape "EndpointSortKey"})

(clojure.core/defn- ser-content-classifiers [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-content-classifier coll) #:http.request.field{:shape "ContentClassifier"}))) input), :shape "ContentClassifiers", :type "list", :max 256})

(clojure.core/defn- ser-list-tags-max-results [input] #:http.request.field{:value input, :shape "ListTagsMaxResults"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hyper-parameter-tuning-job-strategy-type (:strategy input)) #:http.request.field{:name "Strategy", :shape "HyperParameterTuningJobStrategyType"}) (clojure.core/into (ser-hyper-parameter-tuning-job-objective (:hyper-parameter-tuning-job-objective input)) #:http.request.field{:name "HyperParameterTuningJobObjective", :shape "HyperParameterTuningJobObjective"}) (clojure.core/into (ser-resource-limits (:resource-limits input)) #:http.request.field{:name "ResourceLimits", :shape "ResourceLimits"}) (clojure.core/into (ser-parameter-ranges (:parameter-ranges input)) #:http.request.field{:name "ParameterRanges", :shape "ParameterRanges"})], :shape "HyperParameterTuningJobConfig", :type "structure"} (clojure.core/contains? input :training-job-early-stopping-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-job-early-stopping-type (input :training-job-early-stopping-type)) #:http.request.field{:name "TrainingJobEarlyStoppingType", :shape "TrainingJobEarlyStoppingType"}))))

(clojure.core/defn- ser-hyper-parameter-tuning-job-objectives [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-hyper-parameter-tuning-job-objective coll) #:http.request.field{:shape "HyperParameterTuningJobObjective"}))) input), :shape "HyperParameterTuningJobObjectives", :type "list"})

(clojure.core/defn- ser-transform-job-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transform-input (:transform-input input)) #:http.request.field{:name "TransformInput", :shape "TransformInput"}) (clojure.core/into (ser-transform-output (:transform-output input)) #:http.request.field{:name "TransformOutput", :shape "TransformOutput"}) (clojure.core/into (ser-transform-resources (:transform-resources input)) #:http.request.field{:name "TransformResources", :shape "TransformResources"})], :shape "TransformJobDefinition", :type "structure"} (clojure.core/contains? input :max-concurrent-transforms) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrent-transforms (input :max-concurrent-transforms)) #:http.request.field{:name "MaxConcurrentTransforms", :shape "MaxConcurrentTransforms"})) (clojure.core/contains? input :max-payload-in-mb) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-payload-in-mb (input :max-payload-in-mb)) #:http.request.field{:name "MaxPayloadInMB", :shape "MaxPayloadInMB"})) (clojure.core/contains? input :batch-strategy) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-strategy (input :batch-strategy)) #:http.request.field{:name "BatchStrategy", :shape "BatchStrategy"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transform-environment-map (input :environment)) #:http.request.field{:name "Environment", :shape "TransformEnvironmentMap"}))))

(clojure.core/defn- ser-labeling-job-algorithm-specification-arn [input] #:http.request.field{:value input, :shape "LabelingJobAlgorithmSpecificationArn"})

(clojure.core/defn- ser-algorithm-validation-profiles [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-algorithm-validation-profile coll) #:http.request.field{:shape "AlgorithmValidationProfile"}))) input), :shape "AlgorithmValidationProfiles", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-content-type [input] #:http.request.field{:value input, :shape "ContentType"})

(clojure.core/defn- ser-ui-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:ui-template-s-3-uri input)) #:http.request.field{:name "UiTemplateS3Uri", :shape "S3Uri"})], :shape "UiConfig", :type "structure"}))

(clojure.core/defn- ser-transform-environment-value [input] #:http.request.field{:value input, :shape "TransformEnvironmentValue"})

(clojure.core/defn- ser-entity-description [input] #:http.request.field{:value input, :shape "EntityDescription"})

(clojure.core/defn- ser-categorical-parameter-range-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-values (:values input)) #:http.request.field{:name "Values", :shape "ParameterValues"})], :shape "CategoricalParameterRangeSpecification", :type "structure"}))

(clojure.core/defn- ser-direct-internet-access [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "DirectInternetAccess"})

(clojure.core/defn- ser-model-package-validation-profiles [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-model-package-validation-profile coll) #:http.request.field{:shape "ModelPackageValidationProfile"}))) input), :shape "ModelPackageValidationProfiles", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-member-definition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "MemberDefinition", :type "structure"} (clojure.core/contains? input :cognito-member-definition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cognito-member-definition (input :cognito-member-definition)) #:http.request.field{:name "CognitoMemberDefinition", :shape "CognitoMemberDefinition"}))))

(clojure.core/defn- ser-transform-environment-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-transform-environment-key k) #:http.request.field{:map-info "key", :shape "TransformEnvironmentKey"}) (clojure.core/into (ser-transform-environment-value v) #:http.request.field{:map-info "value", :shape "TransformEnvironmentValue"})])) input), :shape "TransformEnvironmentMap", :type "map", :max 16})

(clojure.core/defn- ser-s-3-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-data-type (:s-3-data-type input)) #:http.request.field{:name "S3DataType", :shape "S3DataType"}) (clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "S3DataSource", :type "structure"} (clojure.core/contains? input :s-3-data-distribution-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-data-distribution (input :s-3-data-distribution-type)) #:http.request.field{:name "S3DataDistributionType", :shape "S3DataDistribution"})) (clojure.core/contains? input :attribute-names) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attribute-names (input :attribute-names)) #:http.request.field{:name "AttributeNames", :shape "AttributeNames"}))))

(clojure.core/defn- ser-search-expression [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "SearchExpression", :type "structure"} (clojure.core/contains? input :filters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-list (input :filters)) #:http.request.field{:name "Filters", :shape "FilterList"})) (clojure.core/contains? input :nested-filters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nested-filters-list (input :nested-filters)) #:http.request.field{:name "NestedFilters", :shape "NestedFiltersList"})) (clojure.core/contains? input :sub-expressions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-expression-list (input :sub-expressions)) #:http.request.field{:name "SubExpressions", :shape "SearchExpressionList"})) (clojure.core/contains? input :operator) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean-operator (input :operator)) #:http.request.field{:name "Operator", :shape "BooleanOperator"}))))

(clojure.core/defn- ser-stopping-condition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StoppingCondition", :type "structure"} (clojure.core/contains? input :max-runtime-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-runtime-in-seconds (input :max-runtime-in-seconds)) #:http.request.field{:name "MaxRuntimeInSeconds", :shape "MaxRuntimeInSeconds"}))))

(clojure.core/defn- ser-property-name-query [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-property-name-hint (:property-name-hint input)) #:http.request.field{:name "PropertyNameHint", :shape "PropertyNameHint"})], :shape "PropertyNameQuery", :type "structure"}))

(clojure.core/defn- ser-parent-hyper-parameter-tuning-jobs [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parent-hyper-parameter-tuning-job coll) #:http.request.field{:shape "ParentHyperParameterTuningJob"}))) input), :shape "ParentHyperParameterTuningJobs", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-human-task-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-workteam-arn (:workteam-arn input)) #:http.request.field{:name "WorkteamArn", :shape "WorkteamArn"}) (clojure.core/into (ser-ui-config (:ui-config input)) #:http.request.field{:name "UiConfig", :shape "UiConfig"}) (clojure.core/into (ser-lambda-function-arn (:pre-human-task-lambda-arn input)) #:http.request.field{:name "PreHumanTaskLambdaArn", :shape "LambdaFunctionArn"}) (clojure.core/into (ser-task-title (:task-title input)) #:http.request.field{:name "TaskTitle", :shape "TaskTitle"}) (clojure.core/into (ser-task-description (:task-description input)) #:http.request.field{:name "TaskDescription", :shape "TaskDescription"}) (clojure.core/into (ser-number-of-human-workers-per-data-object (:number-of-human-workers-per-data-object input)) #:http.request.field{:name "NumberOfHumanWorkersPerDataObject", :shape "NumberOfHumanWorkersPerDataObject"}) (clojure.core/into (ser-task-time-limit-in-seconds (:task-time-limit-in-seconds input)) #:http.request.field{:name "TaskTimeLimitInSeconds", :shape "TaskTimeLimitInSeconds"}) (clojure.core/into (ser-annotation-consolidation-config (:annotation-consolidation-config input)) #:http.request.field{:name "AnnotationConsolidationConfig", :shape "AnnotationConsolidationConfig"})], :shape "HumanTaskConfig", :type "structure"} (clojure.core/contains? input :public-workforce-task-price) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-public-workforce-task-price (input :public-workforce-task-price)) #:http.request.field{:name "PublicWorkforceTaskPrice", :shape "PublicWorkforceTaskPrice"})) (clojure.core/contains? input :task-availability-lifetime-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-availability-lifetime-in-seconds (input :task-availability-lifetime-in-seconds)) #:http.request.field{:name "TaskAvailabilityLifetimeInSeconds", :shape "TaskAvailabilityLifetimeInSeconds"})) (clojure.core/contains? input :max-concurrent-task-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrent-task-count (input :max-concurrent-task-count)) #:http.request.field{:name "MaxConcurrentTaskCount", :shape "MaxConcurrentTaskCount"})) (clojure.core/contains? input :task-keywords) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-keywords (input :task-keywords)) #:http.request.field{:name "TaskKeywords", :shape "TaskKeywords"}))))

(clojure.core/defn- ser-compression-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-compression-type coll) #:http.request.field{:shape "CompressionType"}))) input), :shape "CompressionTypes", :type "list"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-code-repository-contains [input] #:http.request.field{:value input, :shape "CodeRepositoryContains"})

(clojure.core/defn- ser-hyper-parameter-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-name (:name input)) #:http.request.field{:name "Name", :shape "ParameterName"}) (clojure.core/into (ser-parameter-type (:type input)) #:http.request.field{:name "Type", :shape "ParameterType"})], :shape "HyperParameterSpecification", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-description (input :description)) #:http.request.field{:name "Description", :shape "EntityDescription"})) (clojure.core/contains? input :range) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-range (input :range)) #:http.request.field{:name "Range", :shape "ParameterRange"})) (clojure.core/contains? input :is-tunable) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-tunable)) #:http.request.field{:name "IsTunable", :shape "Boolean"})) (clojure.core/contains? input :is-required) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-required)) #:http.request.field{:name "IsRequired", :shape "Boolean"})) (clojure.core/contains? input :default-value) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-parameter-value (input :default-value)) #:http.request.field{:name "DefaultValue", :shape "ParameterValue"}))))

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-environment-value [input] #:http.request.field{:value input, :shape "EnvironmentValue"})

(clojure.core/defn- ser-categorical-parameter-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-key (:name input)) #:http.request.field{:name "Name", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-values (:values input)) #:http.request.field{:name "Values", :shape "ParameterValues"})], :shape "CategoricalParameterRange", :type "structure"}))

(clojure.core/defn- ser-hyper-parameter-tuning-job-objective-type [input] #:http.request.field{:value (clojure.core/get {"Maximize" "Maximize", :maximize "Maximize", "Minimize" "Minimize", :minimize "Minimize"} input), :shape "HyperParameterTuningJobObjectiveType"})

(clojure.core/defn- ser-git-config-url [input] #:http.request.field{:value input, :shape "GitConfigUrl"})

(clojure.core/defn- ser-cognito-user-pool [input] #:http.request.field{:value input, :shape "CognitoUserPool"})

(clojure.core/defn- ser-labeling-job-resource-config [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LabelingJobResourceConfig", :type "structure"} (clojure.core/contains? input :volume-kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :volume-kms-key-id)) #:http.request.field{:name "VolumeKmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-max-runtime-in-seconds [input] #:http.request.field{:value input, :shape "MaxRuntimeInSeconds"})

(clojure.core/defn- ser-transform-environment-key [input] #:http.request.field{:value input, :shape "TransformEnvironmentKey"})

(clojure.core/defn- ser-label-attribute-name [input] #:http.request.field{:value input, :shape "LabelAttributeName"})

(clojure.core/defn- ser-metric-definition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-definition coll) #:http.request.field{:shape "MetricDefinition"}))) input), :shape "MetricDefinitionList", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-string-200 [input] #:http.request.field{:value input, :shape "String200"})

(clojure.core/defn- ser-model-package-validation-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-role-arn (:validation-role input)) #:http.request.field{:name "ValidationRole", :shape "RoleArn"}) (clojure.core/into (ser-model-package-validation-profiles (:validation-profiles input)) #:http.request.field{:name "ValidationProfiles", :shape "ModelPackageValidationProfiles"})], :shape "ModelPackageValidationSpecification", :type "structure"}))

(clojure.core/defn- ser-task-keywords [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-task-keyword coll) #:http.request.field{:shape "TaskKeyword"}))) input), :shape "TaskKeywords", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-notebook-instance-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status"} input), :shape "NotebookInstanceSortKey"})

(clojure.core/defn- ser-channel-name [input] #:http.request.field{:value input, :shape "ChannelName"})

(clojure.core/defn- ser-categorical-parameter-ranges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-categorical-parameter-range coll) #:http.request.field{:shape "CategoricalParameterRange"}))) input), :shape "CategoricalParameterRanges", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-search-expression-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-search-expression coll) #:http.request.field{:shape "SearchExpression"}))) input), :shape "SearchExpressionList", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-notebook-instance-lifecycle-hook coll) #:http.request.field{:shape "NotebookInstanceLifecycleHook"}))) input), :shape "NotebookInstanceLifecycleConfigList", :type "list", :max 1})

(clojure.core/defn- ser-nested-filters [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-resource-property-name (:nested-property-name input)) #:http.request.field{:name "NestedPropertyName", :shape "ResourcePropertyName"}) (clojure.core/into (ser-filter-list (:filters input)) #:http.request.field{:name "Filters", :shape "FilterList"})], :shape "NestedFilters", :type "structure"}))

(clojure.core/defn- ser-hyper-parameter-algorithm-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-training-input-mode (:training-input-mode input)) #:http.request.field{:name "TrainingInputMode", :shape "TrainingInputMode"})], :shape "HyperParameterAlgorithmSpecification", :type "structure"} (clojure.core/contains? input :training-image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-algorithm-image (input :training-image)) #:http.request.field{:name "TrainingImage", :shape "AlgorithmImage"})) (clojure.core/contains? input :algorithm-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-or-name (input :algorithm-name)) #:http.request.field{:name "AlgorithmName", :shape "ArnOrName"})) (clojure.core/contains? input :metric-definitions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-definition-list (input :metric-definitions)) #:http.request.field{:name "MetricDefinitions", :shape "MetricDefinitionList"}))))

(clojure.core/defn- ser-url [input] #:http.request.field{:value input, :shape "Url"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-content [input] #:http.request.field{:value input, :shape "NotebookInstanceLifecycleConfigContent"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-container-definition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ContainerDefinition", :type "structure"} (clojure.core/contains? input :container-hostname) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-hostname (input :container-hostname)) #:http.request.field{:name "ContainerHostname", :shape "ContainerHostname"})) (clojure.core/contains? input :image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})) (clojure.core/contains? input :model-data-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url (input :model-data-url)) #:http.request.field{:name "ModelDataUrl", :shape "Url"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-map (input :environment)) #:http.request.field{:name "Environment", :shape "EnvironmentMap"})) (clojure.core/contains? input :model-package-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-or-name (input :model-package-name)) #:http.request.field{:name "ModelPackageName", :shape "ArnOrName"}))))

(clojure.core/defn- ser-seed [input] #:http.request.field{:value input, :shape "Seed"})

(clojure.core/defn- ser-resource-property-name [input] #:http.request.field{:value input, :shape "ResourcePropertyName"})

(clojure.core/defn- ser-lambda-function-arn [input] #:http.request.field{:value input, :shape "LambdaFunctionArn"})

(clojure.core/defn- ser-model-package-validation-profile [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-entity-name (:profile-name input)) #:http.request.field{:name "ProfileName", :shape "EntityName"}) (clojure.core/into (ser-transform-job-definition (:transform-job-definition input)) #:http.request.field{:name "TransformJobDefinition", :shape "TransformJobDefinition"})], :shape "ModelPackageValidationProfile", :type "structure"}))

(clojure.core/defn- ser-labeling-job-input-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-labeling-job-data-source (:data-source input)) #:http.request.field{:name "DataSource", :shape "LabelingJobDataSource"})], :shape "LabelingJobInputConfig", :type "structure"} (clojure.core/contains? input :data-attributes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-labeling-job-data-attributes (input :data-attributes)) #:http.request.field{:name "DataAttributes", :shape "LabelingJobDataAttributes"}))))

(clojure.core/defn- ser-parameter-ranges [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ParameterRanges", :type "structure"} (clojure.core/contains? input :integer-parameter-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-parameter-ranges (input :integer-parameter-ranges)) #:http.request.field{:name "IntegerParameterRanges", :shape "IntegerParameterRanges"})) (clojure.core/contains? input :continuous-parameter-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-continuous-parameter-ranges (input :continuous-parameter-ranges)) #:http.request.field{:name "ContinuousParameterRanges", :shape "ContinuousParameterRanges"})) (clojure.core/contains? input :categorical-parameter-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-categorical-parameter-ranges (input :categorical-parameter-ranges)) #:http.request.field{:name "CategoricalParameterRanges", :shape "CategoricalParameterRanges"}))))

(clojure.core/defn- ser-production-variant [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-variant-name (:variant-name input)) #:http.request.field{:name "VariantName", :shape "VariantName"}) (clojure.core/into (ser-model-name (:model-name input)) #:http.request.field{:name "ModelName", :shape "ModelName"}) (clojure.core/into (ser-task-count (:initial-instance-count input)) #:http.request.field{:name "InitialInstanceCount", :shape "TaskCount"}) (clojure.core/into (ser-production-variant-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "ProductionVariantInstanceType"})], :shape "ProductionVariant", :type "structure"} (clojure.core/contains? input :initial-variant-weight) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-variant-weight (input :initial-variant-weight)) #:http.request.field{:name "InitialVariantWeight", :shape "VariantWeight"})) (clojure.core/contains? input :accelerator-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-production-variant-accelerator-type (input :accelerator-type)) #:http.request.field{:name "AcceleratorType", :shape "ProductionVariantAcceleratorType"}))))

(clojure.core/defn- ser-disassociate-default-code-repository [input] #:http.request.field{:value input, :shape "DisassociateDefaultCodeRepository"})

(clojure.core/defn- ser-container-definition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-container-definition coll) #:http.request.field{:shape "ContainerDefinition"}))) input), :shape "ContainerDefinitionList", :type "list", :max 5})

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-notebook-instance-lifecycle-hook [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NotebookInstanceLifecycleHook", :type "structure"} (clojure.core/contains? input :content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-content (input :content)) #:http.request.field{:name "Content", :shape "NotebookInstanceLifecycleConfigContent"}))))

(clojure.core/defn- ser-channel-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-channel-name (:name input)) #:http.request.field{:name "Name", :shape "ChannelName"}) (clojure.core/into (ser-content-types (:supported-content-types input)) #:http.request.field{:name "SupportedContentTypes", :shape "ContentTypes"}) (clojure.core/into (ser-input-modes (:supported-input-modes input)) #:http.request.field{:name "SupportedInputModes", :shape "InputModes"})], :shape "ChannelSpecification", :type "structure"} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-description (input :description)) #:http.request.field{:name "Description", :shape "EntityDescription"})) (clojure.core/contains? input :is-required) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :is-required)) #:http.request.field{:name "IsRequired", :shape "Boolean"})) (clojure.core/contains? input :supported-compression-types) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-types (input :supported-compression-types)) #:http.request.field{:name "SupportedCompressionTypes", :shape "CompressionTypes"}))))

(clojure.core/defn- ser-cognito-client-id [input] #:http.request.field{:value input, :shape "CognitoClientId"})

(clojure.core/defn- ser-code-repository-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "CodeRepositorySortOrder"})

(clojure.core/defn- ser-transform-job-name [input] #:http.request.field{:value input, :shape "TransformJobName"})

(clojure.core/defn- ser-inference-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-model-package-container-definition-list (:containers input)) #:http.request.field{:name "Containers", :shape "ModelPackageContainerDefinitionList"}) (clojure.core/into (ser-transform-instance-types (:supported-transform-instance-types input)) #:http.request.field{:name "SupportedTransformInstanceTypes", :shape "TransformInstanceTypes"}) (clojure.core/into (ser-realtime-inference-instance-types (:supported-realtime-inference-instance-types input)) #:http.request.field{:name "SupportedRealtimeInferenceInstanceTypes", :shape "RealtimeInferenceInstanceTypes"}) (clojure.core/into (ser-content-types (:supported-content-types input)) #:http.request.field{:name "SupportedContentTypes", :shape "ContentTypes"}) (clojure.core/into (ser-response-mime-types (:supported-response-mime-types input)) #:http.request.field{:name "SupportedResponseMIMETypes", :shape "ResponseMIMETypes"})], :shape "InferenceSpecification", :type "structure"}))

(clojure.core/defn- ser-task-keyword [input] #:http.request.field{:value input, :shape "TaskKeyword"})

(clojure.core/defn- ser-annotation-consolidation-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-lambda-function-arn (:annotation-consolidation-lambda-arn input)) #:http.request.field{:name "AnnotationConsolidationLambdaArn", :shape "LambdaFunctionArn"})], :shape "AnnotationConsolidationConfig", :type "structure"}))

(clojure.core/defn- ser-kms-key-id [input] #:http.request.field{:value input, :shape "KmsKeyId"})

(clojure.core/defn- ser-algorithm-validation-profile [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-entity-name (:profile-name input)) #:http.request.field{:name "ProfileName", :shape "EntityName"}) (clojure.core/into (ser-training-job-definition (:training-job-definition input)) #:http.request.field{:name "TrainingJobDefinition", :shape "TrainingJobDefinition"})], :shape "AlgorithmValidationProfile", :type "structure"} (clojure.core/contains? input :transform-job-definition) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transform-job-definition (input :transform-job-definition)) #:http.request.field{:name "TransformJobDefinition", :shape "TransformJobDefinition"}))))

(clojure.core/defn- ser-framework [input] #:http.request.field{:value (clojure.core/get {"ONNX" "ONNX", :pytorch "PYTORCH", "MXNET" "MXNET", :onnx "ONNX", "PYTORCH" "PYTORCH", :tensorflow "TENSORFLOW", :xgboost "XGBOOST", "XGBOOST" "XGBOOST", "TENSORFLOW" "TENSORFLOW", :mxnet "MXNET"} input), :shape "Framework"})

(clojure.core/defn- ser-batch-strategy [input] #:http.request.field{:value (clojure.core/get {"MultiRecord" "MultiRecord", :multi-record "MultiRecord", "SingleRecord" "SingleRecord", :single-record "SingleRecord"} input), :shape "BatchStrategy"})

(clojure.core/defn- ser-source-algorithm-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-source-algorithm coll) #:http.request.field{:shape "SourceAlgorithm"}))) input), :shape "SourceAlgorithmList", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-hyper-parameter-specifications [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-hyper-parameter-specification coll) #:http.request.field{:shape "HyperParameterSpecification"}))) input), :shape "HyperParameterSpecifications", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-dollars [input] #:http.request.field{:value input, :shape "Dollars"})

(clojure.core/defn- ser-environment-key [input] #:http.request.field{:value input, :shape "EnvironmentKey"})

(clojure.core/defn- ser-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-data-source (:s-3-data-source input)) #:http.request.field{:name "S3DataSource", :shape "S3DataSource"})], :shape "DataSource", :type "structure"}))

(clojure.core/defn- ser-source-algorithm-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-source-algorithm-list (:source-algorithms input)) #:http.request.field{:name "SourceAlgorithms", :shape "SourceAlgorithmList"})], :shape "SourceAlgorithmSpecification", :type "structure"}))

(clojure.core/defn- ser-assembly-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Line" "Line", :line "Line"} input), :shape "AssemblyType"})

(clojure.core/defn- ser-variant-weight [input] #:http.request.field{:value input, :shape "VariantWeight"})

(clojure.core/defn- ser-model-package-sort-by [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "ModelPackageSortBy"})

(clojure.core/defn- ser-source-algorithm [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-arn-or-name (:algorithm-name input)) #:http.request.field{:name "AlgorithmName", :shape "ArnOrName"})], :shape "SourceAlgorithm", :type "structure"} (clojure.core/contains? input :model-data-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url (input :model-data-url)) #:http.request.field{:name "ModelDataUrl", :shape "Url"}))))

(clojure.core/defn- ser-split-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Line" "Line", :line "Line", "RecordIO" "RecordIO", :record-io "RecordIO", "TFRecord" "TFRecord", :tf-record "TFRecord"} input), :shape "SplitType"})

(clojure.core/defn- ser-boolean-operator [input] #:http.request.field{:value (clojure.core/get {"And" "And", :and "And", "Or" "Or", :or "Or"} input), :shape "BooleanOperator"})

(clojure.core/defn- ser-parameter-range [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ParameterRange", :type "structure"} (clojure.core/contains? input :integer-parameter-range-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-parameter-range-specification (input :integer-parameter-range-specification)) #:http.request.field{:name "IntegerParameterRangeSpecification", :shape "IntegerParameterRangeSpecification"})) (clojure.core/contains? input :continuous-parameter-range-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-continuous-parameter-range-specification (input :continuous-parameter-range-specification)) #:http.request.field{:name "ContinuousParameterRangeSpecification", :shape "ContinuousParameterRangeSpecification"})) (clojure.core/contains? input :categorical-parameter-range-specification) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-categorical-parameter-range-specification (input :categorical-parameter-range-specification)) #:http.request.field{:name "CategoricalParameterRangeSpecification", :shape "CategoricalParameterRangeSpecification"}))))

(clojure.core/defn- ser-resource-type [input] #:http.request.field{:value (clojure.core/get {"TrainingJob" "TrainingJob", :training-job "TrainingJob"} input), :shape "ResourceType"})

(clojure.core/defn- ser-training-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-image (:training-image input)) #:http.request.field{:name "TrainingImage", :shape "Image"}) (clojure.core/into (ser-training-instance-types (:supported-training-instance-types input)) #:http.request.field{:name "SupportedTrainingInstanceTypes", :shape "TrainingInstanceTypes"}) (clojure.core/into (ser-channel-specifications (:training-channels input)) #:http.request.field{:name "TrainingChannels", :shape "ChannelSpecifications"})], :shape "TrainingSpecification", :type "structure"} (clojure.core/contains? input :training-image-digest) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-digest (input :training-image-digest)) #:http.request.field{:name "TrainingImageDigest", :shape "ImageDigest"})) (clojure.core/contains? input :supported-hyper-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameter-specifications (input :supported-hyper-parameters)) #:http.request.field{:name "SupportedHyperParameters", :shape "HyperParameterSpecifications"})) (clojure.core/contains? input :supports-distributed-training) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :supports-distributed-training)) #:http.request.field{:name "SupportsDistributedTraining", :shape "Boolean"})) (clojure.core/contains? input :metric-definitions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-definition-list (input :metric-definitions)) #:http.request.field{:name "MetricDefinitions", :shape "MetricDefinitionList"})) (clojure.core/contains? input :supported-tuning-job-objective-metrics) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameter-tuning-job-objectives (input :supported-tuning-job-objective-metrics)) #:http.request.field{:name "SupportedTuningJobObjectiveMetrics", :shape "HyperParameterTuningJobObjectives"}))))

(clojure.core/defn- ser-search-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "SearchSortOrder"})

(clojure.core/defn- ser-training-job-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-training-input-mode (:training-input-mode input)) #:http.request.field{:name "TrainingInputMode", :shape "TrainingInputMode"}) (clojure.core/into (ser-input-data-config (:input-data-config input)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (:output-data-config input)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-resource-config (:resource-config input)) #:http.request.field{:name "ResourceConfig", :shape "ResourceConfig"}) (clojure.core/into (ser-stopping-condition (:stopping-condition input)) #:http.request.field{:name "StoppingCondition", :shape "StoppingCondition"})], :shape "TrainingJobDefinition", :type "structure"} (clojure.core/contains? input :hyper-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameters (input :hyper-parameters)) #:http.request.field{:name "HyperParameters", :shape "HyperParameters"}))))

(clojure.core/defn- ser-target-device [input] #:http.request.field{:value (clojure.core/get {"rasp3b" "rasp3b", "ml_c5" "ml_c5", "ml_p3" "ml_p3", :rasp-3b "rasp3b", :ml-c-4 "ml_c4", :jetson-tx-1 "jetson_tx1", "jetson_tx1" "jetson_tx1", :ml-c-5 "ml_c5", :jetson-tx-2 "jetson_tx2", "ml_p2" "ml_p2", "ml_c4" "ml_c4", :ml-m-4 "ml_m4", "deeplens" "deeplens", :ml-m-5 "ml_m5", :ml-p-2 "ml_p2", "ml_m5" "ml_m5", :deeplens "deeplens", :ml-p-3 "ml_p3", "ml_m4" "ml_m4", "jetson_tx2" "jetson_tx2"} input), :shape "TargetDevice"})

(clojure.core/defn- ser-training-job-sort-by-options [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status", "FinalObjectiveMetricValue" "FinalObjectiveMetricValue", :final-objective-metric-value "FinalObjectiveMetricValue"} input), :shape "TrainingJobSortByOptions"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-warm-start-type [input] #:http.request.field{:value (clojure.core/get {"IdenticalDataAndAlgorithm" "IdenticalDataAndAlgorithm", :identical-data-and-algorithm "IdenticalDataAndAlgorithm", "TransferLearning" "TransferLearning", :transfer-learning "TransferLearning"} input), :shape "HyperParameterTuningJobWarmStartType"})

(clojure.core/defn- ser-disassociate-additional-code-repositories [input] #:http.request.field{:value input, :shape "DisassociateAdditionalCodeRepositories"})

(clojure.core/defn- ser-model-package-container-definition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-model-package-container-definition coll) #:http.request.field{:shape "ModelPackageContainerDefinition"}))) input), :shape "ModelPackageContainerDefinitionList", :type "list", :max 1, :min 1})

(clojure.core/defn- ser-creation-time [input] #:http.request.field{:value input, :shape "CreationTime"})

(clojure.core/defn- ser-operator [input] #:http.request.field{:value (clojure.core/get {:less-than "LessThan", :contains "Contains", "GreaterThanOrEqualTo" "GreaterThanOrEqualTo", "Contains" "Contains", "NotEquals" "NotEquals", "LessThan" "LessThan", :greater-than "GreaterThan", "LessThanOrEqualTo" "LessThanOrEqualTo", :equals "Equals", "GreaterThan" "GreaterThan", :greater-than-or-equal-to "GreaterThanOrEqualTo", :less-than-or-equal-to "LessThanOrEqualTo", :not-equals "NotEquals", "Equals" "Equals"} input), :shape "Operator"})

(clojure.core/defn- ser-metric-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-name (:name input)) #:http.request.field{:name "Name", :shape "MetricName"}) (clojure.core/into (ser-metric-regex (:regex input)) #:http.request.field{:name "Regex", :shape "MetricRegex"})], :shape "MetricDefinition", :type "structure"}))

(clojure.core/defn- ser-vpc-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-vpc-security-group-ids (:security-group-ids input)) #:http.request.field{:name "SecurityGroupIds", :shape "VpcSecurityGroupIds"}) (clojure.core/into (ser-subnets (:subnets input)) #:http.request.field{:name "Subnets", :shape "Subnets"})], :shape "VpcConfig", :type "structure"}))

(clojure.core/defn- ser-ui-template [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-template-content (:content input)) #:http.request.field{:name "Content", :shape "TemplateContent"})], :shape "UiTemplate", :type "structure"}))

(clojure.core/defn- ser-labeling-job-s-3-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:manifest-s-3-uri input)) #:http.request.field{:name "ManifestS3Uri", :shape "S3Uri"})], :shape "LabelingJobS3DataSource", :type "structure"}))

(clojure.core/defn- ser-hyper-parameter-tuning-job-name [input] #:http.request.field{:value input, :shape "HyperParameterTuningJobName"})

(clojure.core/defn- ser-training-job-name [input] #:http.request.field{:value input, :shape "TrainingJobName"})

(clojure.core/defn- ser-transform-job-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :in-progress "InProgress", :completed "Completed", :stopping "Stopping", :stopped "Stopped", "InProgress" "InProgress", "Stopping" "Stopping", "Stopped" "Stopped", "Completed" "Completed", :failed "Failed"} input), :shape "TransformJobStatus"})

(clojure.core/defn- ser-transform-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-output-path input)) #:http.request.field{:name "S3OutputPath", :shape "S3Uri"})], :shape "TransformOutput", :type "structure"} (clojure.core/contains? input :accept) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept (input :accept)) #:http.request.field{:name "Accept", :shape "Accept"})) (clojure.core/contains? input :assemble-with) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assembly-type (input :assemble-with)) #:http.request.field{:name "AssembleWith", :shape "AssemblyType"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-desired-weight-and-capacity-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-desired-weight-and-capacity coll) #:http.request.field{:shape "DesiredWeightAndCapacity"}))) input), :shape "DesiredWeightAndCapacityList", :type "list", :min 1})

(clojure.core/defn- ser-endpoint-name-contains [input] #:http.request.field{:value input, :shape "EndpointNameContains"})

(clojure.core/defn- ser-hyper-parameter-training-job-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hyper-parameter-algorithm-specification (:algorithm-specification input)) #:http.request.field{:name "AlgorithmSpecification", :shape "HyperParameterAlgorithmSpecification"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}) (clojure.core/into (ser-output-data-config (:output-data-config input)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-resource-config (:resource-config input)) #:http.request.field{:name "ResourceConfig", :shape "ResourceConfig"}) (clojure.core/into (ser-stopping-condition (:stopping-condition input)) #:http.request.field{:name "StoppingCondition", :shape "StoppingCondition"})], :shape "HyperParameterTrainingJobDefinition", :type "structure"} (clojure.core/contains? input :enable-network-isolation) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-network-isolation)) #:http.request.field{:name "EnableNetworkIsolation", :shape "Boolean"})) (clojure.core/contains? input :input-data-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :enable-inter-container-traffic-encryption) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-inter-container-traffic-encryption)) #:http.request.field{:name "EnableInterContainerTrafficEncryption", :shape "Boolean"})) (clojure.core/contains? input :static-hyper-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameters (input :static-hyper-parameters)) #:http.request.field{:name "StaticHyperParameters", :shape "HyperParameters"}))))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-desired-weight-and-capacity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-variant-name (:variant-name input)) #:http.request.field{:name "VariantName", :shape "VariantName"})], :shape "DesiredWeightAndCapacity", :type "structure"} (clojure.core/contains? input :desired-weight) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-variant-weight (input :desired-weight)) #:http.request.field{:name "DesiredWeight", :shape "VariantWeight"})) (clojure.core/contains? input :desired-instance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-count (input :desired-instance-count)) #:http.request.field{:name "DesiredInstanceCount", :shape "TaskCount"}))))

(clojure.core/defn- ser-record-wrapper [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "RecordIO" "RecordIO", :record-io "RecordIO"} input), :shape "RecordWrapper"})

(clojure.core/defn- ser-channel [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-channel-name (:channel-name input)) #:http.request.field{:name "ChannelName", :shape "ChannelName"}) (clojure.core/into (ser-data-source (:data-source input)) #:http.request.field{:name "DataSource", :shape "DataSource"})], :shape "Channel", :type "structure"} (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType"})) (clojure.core/contains? input :compression-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-type (input :compression-type)) #:http.request.field{:name "CompressionType", :shape "CompressionType"})) (clojure.core/contains? input :record-wrapper-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-wrapper (input :record-wrapper-type)) #:http.request.field{:name "RecordWrapperType", :shape "RecordWrapper"})) (clojure.core/contains? input :input-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-input-mode (input :input-mode)) #:http.request.field{:name "InputMode", :shape "TrainingInputMode"})) (clojure.core/contains? input :shuffle-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-shuffle-config (input :shuffle-config)) #:http.request.field{:name "ShuffleConfig", :shape "ShuffleConfig"}))))

(clojure.core/defn- ser-hyper-parameter-tuning-job-objective [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hyper-parameter-tuning-job-objective-type (:type input)) #:http.request.field{:name "Type", :shape "HyperParameterTuningJobObjectiveType"}) (clojure.core/into (ser-metric-name (:metric-name input)) #:http.request.field{:name "MetricName", :shape "MetricName"})], :shape "HyperParameterTuningJobObjective", :type "structure"}))

(clojure.core/defn- ser-labeling-job-name [input] #:http.request.field{:value input, :shape "LabelingJobName"})

(clojure.core/defn- ser-disassociate-notebook-instance-lifecycle-config [input] #:http.request.field{:value input, :shape "DisassociateNotebookInstanceLifecycleConfig"})

(clojure.core/defn- ser-notebook-instance-volume-size-in-gb [input] #:http.request.field{:value input, :shape "NotebookInstanceVolumeSizeInGB"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-max-human-labeled-object-count [input] #:http.request.field{:value input, :shape "MaxHumanLabeledObjectCount"})

(clojure.core/defn- ser-labeling-job-stopping-conditions [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LabelingJobStoppingConditions", :type "structure"} (clojure.core/contains? input :max-human-labeled-object-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-human-labeled-object-count (input :max-human-labeled-object-count)) #:http.request.field{:name "MaxHumanLabeledObjectCount", :shape "MaxHumanLabeledObjectCount"})) (clojure.core/contains? input :max-percentage-of-input-dataset-labeled) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-percentage-of-input-dataset-labeled (input :max-percentage-of-input-dataset-labeled)) #:http.request.field{:name "MaxPercentageOfInputDatasetLabeled", :shape "MaxPercentageOfInputDatasetLabeled"}))))

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-integer-parameter-ranges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-integer-parameter-range coll) #:http.request.field{:shape "IntegerParameterRange"}))) input), :shape "IntegerParameterRanges", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-training-instance-type [input] #:http.request.field{:value (clojure.core/get {:mlm-5large "ml.m5.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.m5.xlarge" "ml.m5.xlarge", "ml.c5.xlarge" "ml.c5.xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.c5.9xlarge" "ml.c5.9xlarge", :mlm-54xlarge "ml.m5.4xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlm-52xlarge "ml.m5.2xlarge", "ml.m5.large" "ml.m5.large", :mlc-54xlarge "ml.c5.4xlarge", "ml.m5.12xlarge" "ml.m5.12xlarge", "ml.c5.2xlarge" "ml.c5.2xlarge", :mlc-52xlarge "ml.c5.2xlarge", "ml.c4.2xlarge" "ml.c4.2xlarge", "ml.c4.4xlarge" "ml.c4.4xlarge", :mlm-410xlarge "ml.m4.10xlarge", :mlm-512xlarge "ml.m5.12xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m5.4xlarge" "ml.m5.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", :mlc-48xlarge "ml.c4.8xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", :mlc-59xlarge "ml.c5.9xlarge", :mlc-4xlarge "ml.c4.xlarge", "ml.c4.8xlarge" "ml.c4.8xlarge", "ml.c5.18xlarge" "ml.c5.18xlarge", :mlc-42xlarge "ml.c4.2xlarge", :mlc-44xlarge "ml.c4.4xlarge", "ml.m5.2xlarge" "ml.m5.2xlarge", :mlc-518xlarge "ml.c5.18xlarge", "ml.c4.xlarge" "ml.c4.xlarge", "ml.m5.24xlarge" "ml.m5.24xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlm-524xlarge "ml.m5.24xlarge", :mlp-2xlarge "ml.p2.xlarge", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-5xlarge "ml.m5.xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", :mlc-5xlarge "ml.c5.xlarge", "ml.c5.4xlarge" "ml.c5.4xlarge"} input), :shape "TrainingInstanceType"})

(clojure.core/defn- ser-integer-parameter-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-key (:name input)) #:http.request.field{:name "Name", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-value (:min-value input)) #:http.request.field{:name "MinValue", :shape "ParameterValue"}) (clojure.core/into (ser-parameter-value (:max-value input)) #:http.request.field{:name "MaxValue", :shape "ParameterValue"})], :shape "IntegerParameterRange", :type "structure"}))

(clojure.core/defn- ser-algorithm-image [input] #:http.request.field{:value input, :shape "AlgorithmImage"})

(clojure.core/defn- ser-task-time-limit-in-seconds [input] #:http.request.field{:value input, :shape "TaskTimeLimitInSeconds"})

(clojure.core/defn- ser-task-title [input] #:http.request.field{:value input, :shape "TaskTitle"})

(clojure.core/defn- ser-last-modified-time [input] #:http.request.field{:value input, :shape "LastModifiedTime"})

(clojure.core/defn- ser-training-job-early-stopping-type [input] #:http.request.field{:value (clojure.core/get {"Off" "Off", :off "Off", "Auto" "Auto", :auto "Auto"} input), :shape "TrainingJobEarlyStoppingType"})

(clojure.core/defn- ser-content-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-content-type coll) #:http.request.field{:shape "ContentType"}))) input), :shape "ContentTypes", :type "list"})

(clojure.core/defn- ser-compilation-job-status [input] #:http.request.field{:value (clojure.core/get {"COMPLETED" "COMPLETED", :starting "STARTING", :inprogress "INPROGRESS", :completed "COMPLETED", :stopping "STOPPING", :stopped "STOPPED", "STOPPED" "STOPPED", "STARTING" "STARTING", "FAILED" "FAILED", "INPROGRESS" "INPROGRESS", "STOPPING" "STOPPING", :failed "FAILED"} input), :shape "CompilationJobStatus"})

(clojure.core/defn- ser-image [input] #:http.request.field{:value input, :shape "Image"})

(clojure.core/defn- ser-accept [input] #:http.request.field{:value input, :shape "Accept"})

(clojure.core/defn- ser-list-compilation-jobs-sort-by [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status"} input), :shape "ListCompilationJobsSortBy"})

(clojure.core/defn- ser-git-config-for-update [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "GitConfigForUpdate", :type "structure"} (clojure.core/contains? input :secret-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-secret-arn (input :secret-arn)) #:http.request.field{:name "SecretArn", :shape "SecretArn"}))))

(clojure.core/defn- ser-usd [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "USD", :type "structure"} (clojure.core/contains? input :dollars) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-dollars (input :dollars)) #:http.request.field{:name "Dollars", :shape "Dollars"})) (clojure.core/contains? input :cents) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cents (input :cents)) #:http.request.field{:name "Cents", :shape "Cents"})) (clojure.core/contains? input :tenth-fractions-of-a-cent) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tenth-fractions-of-a-cent (input :tenth-fractions-of-a-cent)) #:http.request.field{:name "TenthFractionsOfACent", :shape "TenthFractionsOfACent"}))))

(clojure.core/defn- ser-product-id [input] #:http.request.field{:value input, :shape "ProductId"})

(clojure.core/defn- ser-training-job-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :in-progress "InProgress", :completed "Completed", :stopping "Stopping", :stopped "Stopped", "InProgress" "InProgress", "Stopping" "Stopping", "Stopped" "Stopped", "Completed" "Completed", :failed "Failed"} input), :shape "TrainingJobStatus"})

(clojure.core/defn- ser-continuous-parameter-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-key (:name input)) #:http.request.field{:name "Name", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-value (:min-value input)) #:http.request.field{:name "MinValue", :shape "ParameterValue"}) (clojure.core/into (ser-parameter-value (:max-value input)) #:http.request.field{:name "MaxValue", :shape "ParameterValue"})], :shape "ContinuousParameterRange", :type "structure"}))

(clojure.core/defn- ser-algorithm-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-training-input-mode (:training-input-mode input)) #:http.request.field{:name "TrainingInputMode", :shape "TrainingInputMode"})], :shape "AlgorithmSpecification", :type "structure"} (clojure.core/contains? input :training-image) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-algorithm-image (input :training-image)) #:http.request.field{:name "TrainingImage", :shape "AlgorithmImage"})) (clojure.core/contains? input :algorithm-name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-arn-or-name (input :algorithm-name)) #:http.request.field{:name "AlgorithmName", :shape "ArnOrName"})) (clojure.core/contains? input :metric-definitions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-definition-list (input :metric-definitions)) #:http.request.field{:name "MetricDefinitions", :shape "MetricDefinitionList"}))))

(clojure.core/defn- ser-notebook-instance-name-contains [input] #:http.request.field{:value input, :shape "NotebookInstanceNameContains"})

(clojure.core/defn- ser-production-variant-accelerator-type [input] #:http.request.field{:value (clojure.core/get {"ml.eia1.medium" "ml.eia1.medium", :mleia-1medium "ml.eia1.medium", "ml.eia1.large" "ml.eia1.large", :mleia-1large "ml.eia1.large", "ml.eia1.xlarge" "ml.eia1.xlarge", :mleia-1xlarge "ml.eia1.xlarge"} input), :shape "ProductionVariantAcceleratorType"})

(clojure.core/defn- ser-notebook-instance-name [input] #:http.request.field{:value input, :shape "NotebookInstanceName"})

(clojure.core/defn- ser-labeling-job-data-attributes [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "LabelingJobDataAttributes", :type "structure"} (clojure.core/contains? input :content-classifiers) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-classifiers (input :content-classifiers)) #:http.request.field{:name "ContentClassifiers", :shape "ContentClassifiers"}))))

(clojure.core/defn- ser-input-modes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-training-input-mode coll) #:http.request.field{:shape "TrainingInputMode"}))) input), :shape "InputModes", :type "list", :min 1})

(clojure.core/defn- ser-filter-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-filter coll) #:http.request.field{:shape "Filter"}))) input), :shape "FilterList", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-filter-value [input] #:http.request.field{:value input, :shape "FilterValue"})

(clojure.core/defn- ser-code-repository-name-or-url [input] #:http.request.field{:value input, :shape "CodeRepositoryNameOrUrl"})

(clojure.core/defn- ser-max-percentage-of-input-dataset-labeled [input] #:http.request.field{:value input, :shape "MaxPercentageOfInputDatasetLabeled"})

(clojure.core/defn- ser-transform-instance-type [input] #:http.request.field{:value (clojure.core/get {:mlm-5large "ml.m5.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.m5.xlarge" "ml.m5.xlarge", "ml.c5.xlarge" "ml.c5.xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.c5.9xlarge" "ml.c5.9xlarge", :mlm-54xlarge "ml.m5.4xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlm-52xlarge "ml.m5.2xlarge", "ml.m5.large" "ml.m5.large", :mlc-54xlarge "ml.c5.4xlarge", "ml.m5.12xlarge" "ml.m5.12xlarge", "ml.c5.2xlarge" "ml.c5.2xlarge", :mlc-52xlarge "ml.c5.2xlarge", "ml.c4.2xlarge" "ml.c4.2xlarge", "ml.c4.4xlarge" "ml.c4.4xlarge", :mlm-410xlarge "ml.m4.10xlarge", :mlm-512xlarge "ml.m5.12xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m5.4xlarge" "ml.m5.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", :mlc-48xlarge "ml.c4.8xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", :mlc-59xlarge "ml.c5.9xlarge", :mlc-4xlarge "ml.c4.xlarge", "ml.c4.8xlarge" "ml.c4.8xlarge", "ml.c5.18xlarge" "ml.c5.18xlarge", :mlc-42xlarge "ml.c4.2xlarge", :mlc-44xlarge "ml.c4.4xlarge", "ml.m5.2xlarge" "ml.m5.2xlarge", :mlc-518xlarge "ml.c5.18xlarge", "ml.c4.xlarge" "ml.c4.xlarge", "ml.m5.24xlarge" "ml.m5.24xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlm-524xlarge "ml.m5.24xlarge", :mlp-2xlarge "ml.p2.xlarge", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-5xlarge "ml.m5.xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", :mlc-5xlarge "ml.c5.xlarge", "ml.c5.4xlarge" "ml.c5.4xlarge"} input), :shape "TransformInstanceType"})

(clojure.core/defn- ser-labeling-job-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :in-progress "InProgress", :completed "Completed", :stopping "Stopping", :stopped "Stopped", "InProgress" "InProgress", "Stopping" "Stopping", "Stopped" "Stopped", "Completed" "Completed", :failed "Failed"} input), :shape "LabelingJobStatus"})

(clojure.core/defn- ser-endpoint-config-name [input] #:http.request.field{:value input, :shape "EndpointConfigName"})

(clojure.core/defn- ser-labeling-job-algorithms-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-labeling-job-algorithm-specification-arn (:labeling-job-algorithm-specification-arn input)) #:http.request.field{:name "LabelingJobAlgorithmSpecificationArn", :shape "LabelingJobAlgorithmSpecificationArn"})], :shape "LabelingJobAlgorithmsConfig", :type "structure"} (clojure.core/contains? input :initial-active-learning-model-arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-arn (input :initial-active-learning-model-arn)) #:http.request.field{:name "InitialActiveLearningModelArn", :shape "ModelArn"})) (clojure.core/contains? input :labeling-job-resource-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-labeling-job-resource-config (input :labeling-job-resource-config)) #:http.request.field{:name "LabelingJobResourceConfig", :shape "LabelingJobResourceConfig"}))))

(clojure.core/defn- ser-parameter-value [input] #:http.request.field{:value input, :shape "ParameterValue"})

(clojure.core/defn- ser-labeling-job-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-labeling-job-s-3-data-source (:s-3-data-source input)) #:http.request.field{:name "S3DataSource", :shape "LabelingJobS3DataSource"})], :shape "LabelingJobDataSource", :type "structure"}))

(clojure.core/defn- ser-output-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-output-location input)) #:http.request.field{:name "S3OutputLocation", :shape "S3Uri"}) (clojure.core/into (ser-target-device (:target-device input)) #:http.request.field{:name "TargetDevice", :shape "TargetDevice"})], :shape "OutputConfig", :type "structure"}))

(clojure.core/defn- ser-model-arn [input] #:http.request.field{:value input, :shape "ModelArn"})

(clojure.core/defn- ser-content-classifier [input] #:http.request.field{:value (clojure.core/get {"FreeOfPersonallyIdentifiableInformation" "FreeOfPersonallyIdentifiableInformation", :free-of-personally-identifiable-information "FreeOfPersonallyIdentifiableInformation", "FreeOfAdultContent" "FreeOfAdultContent", :free-of-adult-content "FreeOfAdultContent"} input), :shape "ContentClassifier"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- req-create-compilation-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :compilation-job-name)) #:http.request.field{:name "CompilationJobName", :shape "EntityName"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}) (clojure.core/into (ser-input-config (input :input-config)) #:http.request.field{:name "InputConfig", :shape "InputConfig"}) (clojure.core/into (ser-output-config (input :output-config)) #:http.request.field{:name "OutputConfig", :shape "OutputConfig"}) (clojure.core/into (ser-stopping-condition (input :stopping-condition)) #:http.request.field{:name "StoppingCondition", :shape "StoppingCondition"})]}))

(clojure.core/defn- req-create-workteam-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workteam-name (input :workteam-name)) #:http.request.field{:name "WorkteamName", :shape "WorkteamName"}) (clojure.core/into (ser-member-definitions (input :member-definitions)) #:http.request.field{:name "MemberDefinitions", :shape "MemberDefinitions"}) (clojure.core/into (ser-string-200 (input :description)) #:http.request.field{:name "Description", :shape "String200"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-list-compilation-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "CreationTime"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-compilation-jobs-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ListCompilationJobsSortBy"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "CreationTime"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "LastModifiedTime"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compilation-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "CompilationJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "LastModifiedTime"}))))

(clojure.core/defn- req-delete-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"})]}))

(clojure.core/defn- req-describe-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-describe-labeling-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-labeling-job-name (input :labeling-job-name)) #:http.request.field{:name "LabelingJobName", :shape "LabelingJobName"})]}))

(clojure.core/defn- req-describe-code-repository-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :code-repository-name)) #:http.request.field{:name "CodeRepositoryName", :shape "EntityName"})]}))

(clojure.core/defn- req-update-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"}) (clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]}))

(clojure.core/defn- req-create-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]} (clojure.core/contains? input :on-create) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-create)) #:http.request.field{:name "OnCreate", :shape "NotebookInstanceLifecycleConfigList"})) (clojure.core/contains? input :on-start) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-start)) #:http.request.field{:name "OnStart", :shape "NotebookInstanceLifecycleConfigList"}))))

(clojure.core/defn- req-list-notebook-instance-lifecycle-configs-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "CreationTime"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NotebookInstanceLifecycleConfigNameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "NotebookInstanceLifecycleConfigSortKey"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "CreationTime"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "NotebookInstanceLifecycleConfigSortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "LastModifiedTime"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "LastModifiedTime"}))))

(clojure.core/defn- req-update-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]} (clojure.core/contains? input :on-create) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-create)) #:http.request.field{:name "OnCreate", :shape "NotebookInstanceLifecycleConfigList"})) (clojure.core/contains? input :on-start) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-start)) #:http.request.field{:name "OnStart", :shape "NotebookInstanceLifecycleConfigList"}))))

(clojure.core/defn- req-stop-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"})]}))

(clojure.core/defn- req-list-code-repositories-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "CreationTime"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-repository-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "CodeRepositoryNameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-repository-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "CodeRepositorySortBy"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "CreationTime"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-repository-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "CodeRepositorySortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-describe-model-package-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn-or-name (input :model-package-name)) #:http.request.field{:name "ModelPackageName", :shape "ArnOrName"})]}))

(clojure.core/defn- req-create-endpoint-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"}) (clojure.core/into (ser-production-variant-list (input :production-variants)) #:http.request.field{:name "ProductionVariants", :shape "ProductionVariantList"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- req-list-endpoint-configs-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-config-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "EndpointConfigSortKey"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-key (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "OrderKey"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-config-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "EndpointConfigNameContains"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- req-update-workteam-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workteam-name (input :workteam-name)) #:http.request.field{:name "WorkteamName", :shape "WorkteamName"})]} (clojure.core/contains? input :member-definitions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-member-definitions (input :member-definitions)) #:http.request.field{:name "MemberDefinitions", :shape "MemberDefinitions"})) (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-string-200 (input :description)) #:http.request.field{:name "Description", :shape "String200"}))))

(clojure.core/defn- req-list-hyper-parameter-tuning-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameter-tuning-job-sort-by-options (input :sort-by)) #:http.request.field{:name "SortBy", :shape "HyperParameterTuningJobSortByOptions"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameter-tuning-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "HyperParameterTuningJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-list-models-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ModelSortKey"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-key (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "OrderKey"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "ModelNameContains"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- req-describe-compilation-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :compilation-job-name)) #:http.request.field{:name "CompilationJobName", :shape "EntityName"})]}))

(clojure.core/defn- req-update-code-repository-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :code-repository-name)) #:http.request.field{:name "CodeRepositoryName", :shape "EntityName"})]} (clojure.core/contains? input :git-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-git-config-for-update (input :git-config)) #:http.request.field{:name "GitConfig", :shape "GitConfigForUpdate"}))))

(clojure.core/defn- req-list-subscribed-workteams-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workteam-name (input :name-contains)) #:http.request.field{:name "NameContains", :shape "WorkteamName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-update-endpoint-weights-and-capacities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"}) (clojure.core/into (ser-desired-weight-and-capacity-list (input :desired-weights-and-capacities)) #:http.request.field{:name "DesiredWeightsAndCapacities", :shape "DesiredWeightAndCapacityList"})]}))

(clojure.core/defn- req-delete-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"})]}))

(clojure.core/defn- req-stop-compilation-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :compilation-job-name)) #:http.request.field{:name "CompilationJobName", :shape "EntityName"})]}))

(clojure.core/defn- req-create-transform-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transform-job-name (input :transform-job-name)) #:http.request.field{:name "TransformJobName", :shape "TransformJobName"}) (clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"}) (clojure.core/into (ser-transform-input (input :transform-input)) #:http.request.field{:name "TransformInput", :shape "TransformInput"}) (clojure.core/into (ser-transform-output (input :transform-output)) #:http.request.field{:name "TransformOutput", :shape "TransformOutput"}) (clojure.core/into (ser-transform-resources (input :transform-resources)) #:http.request.field{:name "TransformResources", :shape "TransformResources"})]} (clojure.core/contains? input :max-payload-in-mb) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-payload-in-mb (input :max-payload-in-mb)) #:http.request.field{:name "MaxPayloadInMB", :shape "MaxPayloadInMB"})) (clojure.core/contains? input :max-concurrent-transforms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrent-transforms (input :max-concurrent-transforms)) #:http.request.field{:name "MaxConcurrentTransforms", :shape "MaxConcurrentTransforms"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :batch-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-strategy (input :batch-strategy)) #:http.request.field{:name "BatchStrategy", :shape "BatchStrategy"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transform-environment-map (input :environment)) #:http.request.field{:name "Environment", :shape "TransformEnvironmentMap"}))))

(clojure.core/defn- req-delete-model-package-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :model-package-name)) #:http.request.field{:name "ModelPackageName", :shape "EntityName"})]}))

(clojure.core/defn- req-create-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"}) (clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-describe-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"})]}))

(clojure.core/defn- req-describe-endpoint-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]}))

(clojure.core/defn- req-list-model-packages-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "CreationTime"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "CreationTime"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-package-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ModelPackageSortBy"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"}))))

(clojure.core/defn- req-stop-transform-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transform-job-name (input :transform-job-name)) #:http.request.field{:name "TransformJobName", :shape "TransformJobName"})]}))

(clojure.core/defn- req-describe-transform-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transform-job-name (input :transform-job-name)) #:http.request.field{:name "TransformJobName", :shape "TransformJobName"})]}))

(clojure.core/defn- req-render-ui-template-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-ui-template (input :ui-template)) #:http.request.field{:name "UiTemplate", :shape "UiTemplate"}) (clojure.core/into (ser-renderable-task (input :task)) #:http.request.field{:name "Task", :shape "RenderableTask"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})]}))

(clojure.core/defn- req-create-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"}) (clojure.core/into (ser-role-arn (input :execution-role-arn)) #:http.request.field{:name "ExecutionRoleArn", :shape "RoleArn"})]} (clojure.core/contains? input :primary-container) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-definition (input :primary-container)) #:http.request.field{:name "PrimaryContainer", :shape "ContainerDefinition"})) (clojure.core/contains? input :containers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-definition-list (input :containers)) #:http.request.field{:name "Containers", :shape "ContainerDefinitionList"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :enable-network-isolation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-network-isolation)) #:http.request.field{:name "EnableNetworkIsolation", :shape "Boolean"}))))

(clojure.core/defn- req-create-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"}) (clojure.core/into (ser-instance-type (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "InstanceType"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})]} (clojure.core/contains? input :volume-size-in-gb) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-volume-size-in-gb (input :volume-size-in-gb)) #:http.request.field{:name "VolumeSizeInGB", :shape "NotebookInstanceVolumeSizeInGB"})) (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIds"})) (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "SubnetId"})) (clojure.core/contains? input :accelerator-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-accelerator-types (input :accelerator-types)) #:http.request.field{:name "AcceleratorTypes", :shape "NotebookInstanceAcceleratorTypes"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :default-code-repository) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-repository-name-or-url (input :default-code-repository)) #:http.request.field{:name "DefaultCodeRepository", :shape "CodeRepositoryNameOrUrl"})) (clojure.core/contains? input :direct-internet-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-direct-internet-access (input :direct-internet-access)) #:http.request.field{:name "DirectInternetAccess", :shape "DirectInternetAccess"})) (clojure.core/contains? input :additional-code-repositories) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-additional-code-repository-names-or-urls (input :additional-code-repositories)) #:http.request.field{:name "AdditionalCodeRepositories", :shape "AdditionalCodeRepositoryNamesOrUrls"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"})) (clojure.core/contains? input :lifecycle-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :lifecycle-config-name)) #:http.request.field{:name "LifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"}))))

(clojure.core/defn- req-delete-endpoint-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]}))

(clojure.core/defn- req-stop-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-start-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-delete-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-delete-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-update-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]} (clojure.core/contains? input :volume-size-in-gb) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-volume-size-in-gb (input :volume-size-in-gb)) #:http.request.field{:name "VolumeSizeInGB", :shape "NotebookInstanceVolumeSizeInGB"})) (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-type (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "InstanceType"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})) (clojure.core/contains? input :accelerator-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-accelerator-types (input :accelerator-types)) #:http.request.field{:name "AcceleratorTypes", :shape "NotebookInstanceAcceleratorTypes"})) (clojure.core/contains? input :default-code-repository) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-repository-name-or-url (input :default-code-repository)) #:http.request.field{:name "DefaultCodeRepository", :shape "CodeRepositoryNameOrUrl"})) (clojure.core/contains? input :additional-code-repositories) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-additional-code-repository-names-or-urls (input :additional-code-repositories)) #:http.request.field{:name "AdditionalCodeRepositories", :shape "AdditionalCodeRepositoryNamesOrUrls"})) (clojure.core/contains? input :disassociate-default-code-repository) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disassociate-default-code-repository (input :disassociate-default-code-repository)) #:http.request.field{:name "DisassociateDefaultCodeRepository", :shape "DisassociateDefaultCodeRepository"})) (clojure.core/contains? input :disassociate-accelerator-types) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disassociate-notebook-instance-accelerator-types (input :disassociate-accelerator-types)) #:http.request.field{:name "DisassociateAcceleratorTypes", :shape "DisassociateNotebookInstanceAcceleratorTypes"})) (clojure.core/contains? input :disassociate-additional-code-repositories) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disassociate-additional-code-repositories (input :disassociate-additional-code-repositories)) #:http.request.field{:name "DisassociateAdditionalCodeRepositories", :shape "DisassociateAdditionalCodeRepositories"})) (clojure.core/contains? input :disassociate-lifecycle-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disassociate-notebook-instance-lifecycle-config (input :disassociate-lifecycle-config)) #:http.request.field{:name "DisassociateLifecycleConfig", :shape "DisassociateNotebookInstanceLifecycleConfig"})) (clojure.core/contains? input :lifecycle-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :lifecycle-config-name)) #:http.request.field{:name "LifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"}))))

(clojure.core/defn- req-add-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-list-endpoints-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "EndpointNameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "EndpointSortKey"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-key (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "OrderKey"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "EndpointStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-delete-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]}))

(clojure.core/defn- req-create-model-package-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :model-package-name)) #:http.request.field{:name "ModelPackageName", :shape "EntityName"})]} (clojure.core/contains? input :model-package-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-description (input :model-package-description)) #:http.request.field{:name "ModelPackageDescription", :shape "EntityDescription"})) (clojure.core/contains? input :inference-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inference-specification (input :inference-specification)) #:http.request.field{:name "InferenceSpecification", :shape "InferenceSpecification"})) (clojure.core/contains? input :validation-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-package-validation-specification (input :validation-specification)) #:http.request.field{:name "ValidationSpecification", :shape "ModelPackageValidationSpecification"})) (clojure.core/contains? input :source-algorithm-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-source-algorithm-specification (input :source-algorithm-specification)) #:http.request.field{:name "SourceAlgorithmSpecification", :shape "SourceAlgorithmSpecification"})) (clojure.core/contains? input :certify-for-marketplace) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certify-for-marketplace (input :certify-for-marketplace)) #:http.request.field{:name "CertifyForMarketplace", :shape "CertifyForMarketplace"}))))

(clojure.core/defn- req-delete-code-repository-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :code-repository-name)) #:http.request.field{:name "CodeRepositoryName", :shape "EntityName"})]}))

(clojure.core/defn- req-list-training-jobs-for-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "TrainingJobStatus"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-job-sort-by-options (input :sort-by)) #:http.request.field{:name "SortBy", :shape "TrainingJobSortByOptions"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"}))))

(clojure.core/defn- req-delete-workteam-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workteam-name (input :workteam-name)) #:http.request.field{:name "WorkteamName", :shape "WorkteamName"})]}))

(clojure.core/defn- req-search-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-type (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceType"})]} (clojure.core/contains? input :search-expression) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-expression (input :search-expression)) #:http.request.field{:name "SearchExpression", :shape "SearchExpression"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-resource-property-name (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ResourcePropertyName"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-search-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SearchSortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-create-algorithm-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :algorithm-name)) #:http.request.field{:name "AlgorithmName", :shape "EntityName"}) (clojure.core/into (ser-training-specification (input :training-specification)) #:http.request.field{:name "TrainingSpecification", :shape "TrainingSpecification"})]} (clojure.core/contains? input :algorithm-description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-entity-description (input :algorithm-description)) #:http.request.field{:name "AlgorithmDescription", :shape "EntityDescription"})) (clojure.core/contains? input :inference-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-inference-specification (input :inference-specification)) #:http.request.field{:name "InferenceSpecification", :shape "InferenceSpecification"})) (clojure.core/contains? input :validation-specification) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-algorithm-validation-specification (input :validation-specification)) #:http.request.field{:name "ValidationSpecification", :shape "AlgorithmValidationSpecification"})) (clojure.core/contains? input :certify-for-marketplace) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certify-for-marketplace (input :certify-for-marketplace)) #:http.request.field{:name "CertifyForMarketplace", :shape "CertifyForMarketplace"}))))

(clojure.core/defn- req-stop-labeling-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-labeling-job-name (input :labeling-job-name)) #:http.request.field{:name "LabelingJobName", :shape "LabelingJobName"})]}))

(clojure.core/defn- req-describe-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]}))

(clojure.core/defn- req-list-training-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "SortBy"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "TrainingJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-stop-training-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-training-job-name (input :training-job-name)) #:http.request.field{:name "TrainingJobName", :shape "TrainingJobName"})]}))

(clojure.core/defn- req-create-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"}) (clojure.core/into (ser-hyper-parameter-tuning-job-config (input :hyper-parameter-tuning-job-config)) #:http.request.field{:name "HyperParameterTuningJobConfig", :shape "HyperParameterTuningJobConfig"}) (clojure.core/into (ser-hyper-parameter-training-job-definition (input :training-job-definition)) #:http.request.field{:name "TrainingJobDefinition", :shape "HyperParameterTrainingJobDefinition"})]} (clojure.core/contains? input :warm-start-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameter-tuning-job-warm-start-config (input :warm-start-config)) #:http.request.field{:name "WarmStartConfig", :shape "HyperParameterTuningJobWarmStartConfig"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-delete-algorithm-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :algorithm-name)) #:http.request.field{:name "AlgorithmName", :shape "EntityName"})]}))

(clojure.core/defn- req-list-algorithms-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "CreationTime"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "CreationTime"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-algorithm-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "AlgorithmSortBy"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"}))))

(clojure.core/defn- req-create-labeling-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-labeling-job-name (input :labeling-job-name)) #:http.request.field{:name "LabelingJobName", :shape "LabelingJobName"}) (clojure.core/into (ser-label-attribute-name (input :label-attribute-name)) #:http.request.field{:name "LabelAttributeName", :shape "LabelAttributeName"}) (clojure.core/into (ser-labeling-job-input-config (input :input-config)) #:http.request.field{:name "InputConfig", :shape "LabelingJobInputConfig"}) (clojure.core/into (ser-labeling-job-output-config (input :output-config)) #:http.request.field{:name "OutputConfig", :shape "LabelingJobOutputConfig"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}) (clojure.core/into (ser-human-task-config (input :human-task-config)) #:http.request.field{:name "HumanTaskConfig", :shape "HumanTaskConfig"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :stopping-conditions) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-labeling-job-stopping-conditions (input :stopping-conditions)) #:http.request.field{:name "StoppingConditions", :shape "LabelingJobStoppingConditions"})) (clojure.core/contains? input :label-category-config-s-3-uri) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-uri (input :label-category-config-s-3-uri)) #:http.request.field{:name "LabelCategoryConfigS3Uri", :shape "S3Uri"})) (clojure.core/contains? input :labeling-job-algorithms-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-labeling-job-algorithms-config (input :labeling-job-algorithms-config)) #:http.request.field{:name "LabelingJobAlgorithmsConfig", :shape "LabelingJobAlgorithmsConfig"}))))

(clojure.core/defn- req-create-training-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-training-job-name (input :training-job-name)) #:http.request.field{:name "TrainingJobName", :shape "TrainingJobName"}) (clojure.core/into (ser-algorithm-specification (input :algorithm-specification)) #:http.request.field{:name "AlgorithmSpecification", :shape "AlgorithmSpecification"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-resource-config (input :resource-config)) #:http.request.field{:name "ResourceConfig", :shape "ResourceConfig"}) (clojure.core/into (ser-stopping-condition (input :stopping-condition)) #:http.request.field{:name "StoppingCondition", :shape "StoppingCondition"})]} (clojure.core/contains? input :enable-network-isolation) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-network-isolation)) #:http.request.field{:name "EnableNetworkIsolation", :shape "Boolean"})) (clojure.core/contains? input :input-data-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"})) (clojure.core/contains? input :hyper-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameters (input :hyper-parameters)) #:http.request.field{:name "HyperParameters", :shape "HyperParameters"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"})) (clojure.core/contains? input :enable-inter-container-traffic-encryption) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :enable-inter-container-traffic-encryption)) #:http.request.field{:name "EnableInterContainerTrafficEncryption", :shape "Boolean"}))))

(clojure.core/defn- req-create-presigned-notebook-instance-url-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]} (clojure.core/contains? input :session-expiration-duration-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-expiration-duration-in-seconds (input :session-expiration-duration-in-seconds)) #:http.request.field{:name "SessionExpirationDurationInSeconds", :shape "SessionExpirationDurationInSeconds"}))))

(clojure.core/defn- req-describe-workteam-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workteam-name (input :workteam-name)) #:http.request.field{:name "WorkteamName", :shape "WorkteamName"})]}))

(clojure.core/defn- req-list-transform-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "SortBy"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transform-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "TransformJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-describe-subscribed-workteam-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workteam-arn (input :workteam-arn)) #:http.request.field{:name "WorkteamArn", :shape "WorkteamArn"})]}))

(clojure.core/defn- req-describe-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"})]}))

(clojure.core/defn- req-describe-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"})]}))

(clojure.core/defn- req-list-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-tags-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListTagsMaxResults"}))))

(clojure.core/defn- req-create-code-repository-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-entity-name (input :code-repository-name)) #:http.request.field{:name "CodeRepositoryName", :shape "EntityName"}) (clojure.core/into (ser-git-config (input :git-config)) #:http.request.field{:name "GitConfig", :shape "GitConfig"})]}))

(clojure.core/defn- req-list-workteams-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-workteams-sort-by-options (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ListWorkteamsSortByOptions"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-workteam-name (input :name-contains)) #:http.request.field{:name "NameContains", :shape "WorkteamName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true}))))

(clojure.core/defn- req-describe-algorithm-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-arn-or-name (input :algorithm-name)) #:http.request.field{:name "AlgorithmName", :shape "ArnOrName"})]}))

(clojure.core/defn- req-list-labeling-jobs-for-workteam-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-workteam-arn (input :workteam-arn)) #:http.request.field{:name "WorkteamArn", :shape "WorkteamArn"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :job-reference-code-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-reference-code-contains (input :job-reference-code-contains)) #:http.request.field{:name "JobReferenceCodeContains", :shape "JobReferenceCodeContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-labeling-jobs-for-workteam-sort-by-options (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ListLabelingJobsForWorkteamSortByOptions"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"}))))

(clojure.core/defn- req-list-notebook-instances-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "CreationTime"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NotebookInstanceNameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "NotebookInstanceSortKey"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "CreationTime"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "NotebookInstanceSortOrder"})) (clojure.core/contains? input :notebook-instance-lifecycle-config-name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name-contains)) #:http.request.field{:name "NotebookInstanceLifecycleConfigNameContains", :shape "NotebookInstanceLifecycleConfigName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "LastModifiedTime"})) (clojure.core/contains? input :default-code-repository-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-repository-contains (input :default-code-repository-contains)) #:http.request.field{:name "DefaultCodeRepositoryContains", :shape "CodeRepositoryContains"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "NotebookInstanceStatus"})) (clojure.core/contains? input :additional-code-repository-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-code-repository-name-or-url (input :additional-code-repository-equals)) #:http.request.field{:name "AdditionalCodeRepositoryEquals", :shape "CodeRepositoryNameOrUrl"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "LastModifiedTime"}))))

(clojure.core/defn- req-describe-training-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-training-job-name (input :training-job-name)) #:http.request.field{:name "TrainingJobName", :shape "TrainingJobName"})]}))

(clojure.core/defn- req-get-search-suggestions-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-type (input :resource)) #:http.request.field{:name "Resource", :shape "ResourceType"})]} (clojure.core/contains? input :suggestion-query) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-suggestion-query (input :suggestion-query)) #:http.request.field{:name "SuggestionQuery", :shape "SuggestionQuery"}))))

(clojure.core/defn- req-list-labeling-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "SortBy"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-labeling-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "LabelingJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/declare deser-property-name-suggestion)

(clojure.core/declare deser-resource-config)

(clojure.core/declare deser-input-data-config)

(clojure.core/declare deser-notebook-instance-accelerator-types)

(clojure.core/declare deser-labeling-job-output-config)

(clojure.core/declare deser-labeling-job-arn)

(clojure.core/declare deser-transform-instance-types)

(clojure.core/declare deser-subscribed-workteams)

(clojure.core/declare deser-objective-status-counter)

(clojure.core/declare deser-search-record)

(clojure.core/declare deser-notebook-instance-accelerator-type)

(clojure.core/declare deser-task-count)

(clojure.core/declare deser-compression-type)

(clojure.core/declare deser-output-data-config)

(clojure.core/declare deser-cents)

(clojure.core/declare deser-continuous-parameter-range-specification)

(clojure.core/declare deser-attribute-names)

(clojure.core/declare deser-arn-or-name)

(clojure.core/declare deser-metric-regex)

(clojure.core/declare deser-model-name)

(clojure.core/declare deser-endpoint-status)

(clojure.core/declare deser-workteams)

(clojure.core/declare deser-additional-code-repository-names-or-urls)

(clojure.core/declare deser-parameter-name)

(clojure.core/declare deser-hyper-parameter-tuning-job-status)

(clojure.core/declare deser-endpoint-config-summary-list)

(clojure.core/declare deser-variant-name)

(clojure.core/declare deser-parameter-type)

(clojure.core/declare deser-workteam)

(clojure.core/declare deser-cognito-user-group)

(clojure.core/declare deser-member-definitions)

(clojure.core/declare deser-endpoint-summary)

(clojure.core/declare deser-label-counters)

(clojure.core/declare deser-max-payload-in-mb)

(clojure.core/declare deser-max-number-of-training-jobs)

(clojure.core/declare deser-parameter-key)

(clojure.core/declare deser-transform-resources)

(clojure.core/declare deser-training-job-status-counter)

(clojure.core/declare deser-volume-size-in-gb)

(clojure.core/declare deser-model-package-container-definition)

(clojure.core/declare deser-security-group-ids)

(clojure.core/declare deser-image-digest)

(clojure.core/declare deser-hyper-parameters)

(clojure.core/declare deser-branch)

(clojure.core/declare deser-hyper-parameter-tuning-job-strategy-type)

(clojure.core/declare deser-continuous-parameter-ranges)

(clojure.core/declare deser-code-repository-summary-list)

(clojure.core/declare deser-notebook-instance-arn)

(clojure.core/declare deser-hyper-parameter-training-job-summaries)

(clojure.core/declare deser-subnets)

(clojure.core/declare deser-workteam-name)

(clojure.core/declare deser-training-job)

(clojure.core/declare deser-attribute-name)

(clojure.core/declare deser-detailed-algorithm-status)

(clojure.core/declare deser-shuffle-config)

(clojure.core/declare deser-channel-specifications)

(clojure.core/declare deser-transform-instance-count)

(clojure.core/declare deser-transform-data-source)

(clojure.core/declare deser-input-config)

(clojure.core/declare deser-labeling-job-output)

(clojure.core/declare deser-resource-limits)

(clojure.core/declare deser-cognito-member-definition)

(clojure.core/declare deser-training-instance-count)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-model-package-status-item)

(clojure.core/declare deser-s-3-data-type)

(clojure.core/declare deser-certify-for-marketplace)

(clojure.core/declare deser-s-3-data-distribution)

(clojure.core/declare deser-response-mime-type)

(clojure.core/declare deser-status-message)

(clojure.core/declare deser-code-repository-summary)

(clojure.core/declare deser-entity-name)

(clojure.core/declare deser-detailed-model-package-status)

(clojure.core/declare deser-transform-s-3-data-source)

(clojure.core/declare deser-max-concurrent-transforms)

(clojure.core/declare deser-container-hostname)

(clojure.core/declare deser-labeling-job-for-workteam-summary-list)

(clojure.core/declare deser-realtime-inference-instance-types)

(clojure.core/declare deser-instance-type)

(clojure.core/declare deser-public-workforce-task-price)

(clojure.core/declare deser-final-hyper-parameter-tuning-job-objective-metric)

(clojure.core/declare deser-data-input-config)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-training-input-mode)

(clojure.core/declare deser-transform-input)

(clojure.core/declare deser-s-3-uri)

(clojure.core/declare deser-response-mime-types)

(clojure.core/declare deser-task-description)

(clojure.core/declare deser-integer-parameter-range-specification)

(clojure.core/declare deser-secret-arn)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-transform-job-summary)

(clojure.core/declare deser-parent-hyper-parameter-tuning-job)

(clojure.core/declare deser-production-variant-instance-type)

(clojure.core/declare deser-label-counters-for-workteam)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-parameter-values)

(clojure.core/declare deser-production-variant-list)

(clojure.core/declare deser-network-interface-id)

(clojure.core/declare deser-environment-map)

(clojure.core/declare deser-max-parallel-training-jobs)

(clojure.core/declare deser-notebook-instance-lifecycle-config-name)

(clojure.core/declare deser-tenth-fractions-of-a-cent)

(clojure.core/declare deser-workteam-arn)

(clojure.core/declare deser-labeling-job-for-workteam-summary)

(clojure.core/declare deser-notebook-instance-url)

(clojure.core/declare deser-task-availability-lifetime-in-seconds)

(clojure.core/declare deser-vpc-security-group-ids)

(clojure.core/declare deser-algorithm-summary)

(clojure.core/declare deser-labeling-job-summary-list)

(clojure.core/declare deser-notebook-instance-status)

(clojure.core/declare deser-number-of-human-workers-per-data-object)

(clojure.core/declare deser-git-config)

(clojure.core/declare deser-next-token)

(clojure.core/declare deser-objective-status)

(clojure.core/declare deser-max-concurrent-task-count)

(clojure.core/declare deser-hyper-parameter-tuning-job-warm-start-config)

(clojure.core/declare deser-training-job-arn)

(clojure.core/declare deser-algorithm-validation-specification)

(clojure.core/declare deser-endpoint-name)

(clojure.core/declare deser-training-instance-types)

(clojure.core/declare deser-content-classifiers)

(clojure.core/declare deser-hyper-parameter-tuning-job-config)

(clojure.core/declare deser-code-repository-arn)

(clojure.core/declare deser-hyper-parameter-tuning-job-objectives)

(clojure.core/declare deser-transform-job-definition)

(clojure.core/declare deser-labeling-job-algorithm-specification-arn)

(clojure.core/declare deser-algorithm-validation-profiles)

(clojure.core/declare deser-model-package-summary-list)

(clojure.core/declare deser-endpoint-config-arn)

(clojure.core/declare deser-content-type)

(clojure.core/declare deser-ui-config)

(clojure.core/declare deser-objective-status-counters)

(clojure.core/declare deser-hyper-parameter-tuning-job-summaries)

(clojure.core/declare deser-transform-environment-value)

(clojure.core/declare deser-subscribed-workteam)

(clojure.core/declare deser-entity-description)

(clojure.core/declare deser-categorical-parameter-range-specification)

(clojure.core/declare deser-direct-internet-access)

(clojure.core/declare deser-model-package-validation-profiles)

(clojure.core/declare deser-member-definition)

(clojure.core/declare deser-transform-environment-map)

(clojure.core/declare deser-s-3-data-source)

(clojure.core/declare deser-notebook-instance-lifecycle-config-arn)

(clojure.core/declare deser-stopping-condition)

(clojure.core/declare deser-search-results-list)

(clojure.core/declare deser-parent-hyper-parameter-tuning-jobs)

(clojure.core/declare deser-human-task-config)

(clojure.core/declare deser-compression-types)

(clojure.core/declare deser-transform-job-summaries)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-secondary-status)

(clojure.core/declare deser-hyper-parameter-specification)

(clojure.core/declare deser-notebook-instance-lifecycle-config-summary)

(clojure.core/declare deser-environment-value)

(clojure.core/declare deser-categorical-parameter-range)

(clojure.core/declare deser-hyper-parameter-tuning-job-objective-type)

(clojure.core/declare deser-git-config-url)

(clojure.core/declare deser-cognito-user-pool)

(clojure.core/declare deser-compilation-job-arn)

(clojure.core/declare deser-labeling-job-resource-config)

(clojure.core/declare deser-training-job-summary)

(clojure.core/declare deser-max-runtime-in-seconds)

(clojure.core/declare deser-success)

(clojure.core/declare deser-transform-environment-key)

(clojure.core/declare deser-label-attribute-name)

(clojure.core/declare deser-metric-definition-list)

(clojure.core/declare deser-string-200)

(clojure.core/declare deser-model-package-validation-specification)

(clojure.core/declare deser-task-keywords)

(clojure.core/declare deser-channel-name)

(clojure.core/declare deser-categorical-parameter-ranges)

(clojure.core/declare deser-hyper-parameter-tuning-job-arn)

(clojure.core/declare deser-model-package-summary)

(clojure.core/declare deser-notebook-instance-lifecycle-config-list)

(clojure.core/declare deser-model-summary)

(clojure.core/declare deser-hyper-parameter-algorithm-specification)

(clojure.core/declare deser-url)

(clojure.core/declare deser-notebook-instance-lifecycle-config-content)

(clojure.core/declare deser-algorithm-summary-list)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-container-definition)

(clojure.core/declare deser-seed)

(clojure.core/declare deser-resource-property-name)

(clojure.core/declare deser-lambda-function-arn)

(clojure.core/declare deser-model-summary-list)

(clojure.core/declare deser-property-name-suggestion-list)

(clojure.core/declare deser-model-package-validation-profile)

(clojure.core/declare deser-labeling-job-input-config)

(clojure.core/declare deser-parameter-ranges)

(clojure.core/declare deser-production-variant)

(clojure.core/declare deser-container-definition-list)

(clojure.core/declare deser-model-package-status-item-list)

(clojure.core/declare deser-security-group-id)

(clojure.core/declare deser-algorithm-status-item-list)

(clojure.core/declare deser-notebook-instance-lifecycle-hook)

(clojure.core/declare deser-algorithm-status)

(clojure.core/declare deser-channel-specification)

(clojure.core/declare deser-failure-reason)

(clojure.core/declare deser-cognito-client-id)

(clojure.core/declare deser-endpoint-config-summary)

(clojure.core/declare deser-compilation-job-summaries)

(clojure.core/declare deser-model-package-status)

(clojure.core/declare deser-transform-job-name)

(clojure.core/declare deser-inference-specification)

(clojure.core/declare deser-transform-job-arn)

(clojure.core/declare deser-model-package-status-details)

(clojure.core/declare deser-task-keyword)

(clojure.core/declare deser-annotation-consolidation-config)

(clojure.core/declare deser-kms-key-id)

(clojure.core/declare deser-algorithm-validation-profile)

(clojure.core/declare deser-framework)

(clojure.core/declare deser-batch-strategy)

(clojure.core/declare deser-source-algorithm-list)

(clojure.core/declare deser-string)

(clojure.core/declare deser-hyper-parameter-specifications)

(clojure.core/declare deser-account-id)

(clojure.core/declare deser-dollars)

(clojure.core/declare deser-environment-key)

(clojure.core/declare deser-endpoint-summary-list)

(clojure.core/declare deser-data-source)

(clojure.core/declare deser-notebook-instance-summary-list)

(clojure.core/declare deser-source-algorithm-specification)

(clojure.core/declare deser-training-job-status-counters)

(clojure.core/declare deser-assembly-type)

(clojure.core/declare deser-variant-weight)

(clojure.core/declare deser-source-algorithm)

(clojure.core/declare deser-split-type)

(clojure.core/declare deser-parameter-range)

(clojure.core/declare deser-training-specification)

(clojure.core/declare deser-training-job-definition)

(clojure.core/declare deser-target-device)

(clojure.core/declare deser-product-listings)

(clojure.core/declare deser-hyper-parameter-tuning-job-warm-start-type)

(clojure.core/declare deser-metric-value)

(clojure.core/declare deser-model-package-container-definition-list)

(clojure.core/declare deser-compilation-job-summary)

(clojure.core/declare deser-production-variant-summary-list)

(clojure.core/declare deser-production-variant-summary)

(clojure.core/declare deser-creation-time)

(clojure.core/declare deser-algorithm-status-item)

(clojure.core/declare deser-hyper-parameter-training-job-summary)

(clojure.core/declare deser-rendering-error-list)

(clojure.core/declare deser-metric-definition)

(clojure.core/declare deser-vpc-config)

(clojure.core/declare deser-notebook-instance-summary)

(clojure.core/declare deser-labeling-job-s-3-data-source)

(clojure.core/declare deser-label-counter)

(clojure.core/declare deser-hyper-parameter-tuning-job-name)

(clojure.core/declare deser-training-job-name)

(clojure.core/declare deser-transform-job-status)

(clojure.core/declare deser-transform-output)

(clojure.core/declare deser-notebook-instance-lifecycle-config-summary-list)

(clojure.core/declare deser-hyper-parameter-training-job-definition)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-hyper-parameter-tuning-job-summary)

(clojure.core/declare deser-model-artifacts)

(clojure.core/declare deser-record-wrapper)

(clojure.core/declare deser-final-metric-data-list)

(clojure.core/declare deser-labeling-job-summary)

(clojure.core/declare deser-channel)

(clojure.core/declare deser-hyper-parameter-tuning-job-objective)

(clojure.core/declare deser-labeling-job-name)

(clojure.core/declare deser-secondary-status-transition)

(clojure.core/declare deser-notebook-instance-volume-size-in-gb)

(clojure.core/declare deser-deployed-images)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-max-human-labeled-object-count)

(clojure.core/declare deser-job-reference-code)

(clojure.core/declare deser-labeling-job-stopping-conditions)

(clojure.core/declare deser-metric-name)

(clojure.core/declare deser-model-package-arn)

(clojure.core/declare deser-integer-parameter-ranges)

(clojure.core/declare deser-metric-data)

(clojure.core/declare deser-training-instance-type)

(clojure.core/declare deser-integer-parameter-range)

(clojure.core/declare deser-algorithm-image)

(clojure.core/declare deser-task-time-limit-in-seconds)

(clojure.core/declare deser-task-title)

(clojure.core/declare deser-last-modified-time)

(clojure.core/declare deser-training-job-early-stopping-type)

(clojure.core/declare deser-content-types)

(clojure.core/declare deser-compilation-job-status)

(clojure.core/declare deser-algorithm-status-details)

(clojure.core/declare deser-image)

(clojure.core/declare deser-accept)

(clojure.core/declare deser-training-job-summaries)

(clojure.core/declare deser-usd)

(clojure.core/declare deser-product-id)

(clojure.core/declare deser-rendering-error)

(clojure.core/declare deser-training-job-status)

(clojure.core/declare deser-continuous-parameter-range)

(clojure.core/declare deser-algorithm-specification)

(clojure.core/declare deser-endpoint-arn)

(clojure.core/declare deser-float)

(clojure.core/declare deser-production-variant-accelerator-type)

(clojure.core/declare deser-notebook-instance-name)

(clojure.core/declare deser-labeling-job-data-attributes)

(clojure.core/declare deser-input-modes)

(clojure.core/declare deser-secondary-status-transitions)

(clojure.core/declare deser-deployed-image)

(clojure.core/declare deser-code-repository-name-or-url)

(clojure.core/declare deser-max-percentage-of-input-dataset-labeled)

(clojure.core/declare deser-algorithm-arn)

(clojure.core/declare deser-transform-instance-type)

(clojure.core/declare deser-labeling-job-status)

(clojure.core/declare deser-endpoint-config-name)

(clojure.core/declare deser-labeling-job-algorithms-config)

(clojure.core/declare deser-parameter-value)

(clojure.core/declare deser-labeling-job-data-source)

(clojure.core/declare deser-output-config)

(clojure.core/declare deser-model-arn)

(clojure.core/declare deser-content-classifier)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-property-name-suggestion [input] (clojure.core/cond-> {} (clojure.core/contains? input "PropertyName") (clojure.core/assoc :property-name (deser-resource-property-name (input "PropertyName")))))

(clojure.core/defn- deser-resource-config [input] (clojure.core/cond-> {:instance-type (deser-training-instance-type (input "InstanceType")), :instance-count (deser-training-instance-count (input "InstanceCount")), :volume-size-in-gb (deser-volume-size-in-gb (input "VolumeSizeInGB"))} (clojure.core/contains? input "VolumeKmsKeyId") (clojure.core/assoc :volume-kms-key-id (deser-kms-key-id (input "VolumeKmsKeyId")))))

(clojure.core/defn- deser-input-data-config [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-channel coll))) input))

(clojure.core/defn- deser-notebook-instance-accelerator-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notebook-instance-accelerator-type coll))) input))

(clojure.core/defn- deser-labeling-job-output-config [input] (clojure.core/cond-> {:s-3-output-path (deser-s-3-uri (input "S3OutputPath"))} (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId")))))

(clojure.core/defn- deser-labeling-job-arn [input] input)

(clojure.core/defn- deser-transform-instance-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-transform-instance-type coll))) input))

(clojure.core/defn- deser-subscribed-workteams [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subscribed-workteam coll))) input))

(clojure.core/defn- deser-objective-status-counter [input] input)

(clojure.core/defn- deser-search-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "TrainingJob") (clojure.core/assoc :training-job (deser-training-job (input "TrainingJob")))))

(clojure.core/defn- deser-notebook-instance-accelerator-type [input] (clojure.core/get {"ml.eia1.medium" :mleia-1medium, "ml.eia1.large" :mleia-1large, "ml.eia1.xlarge" :mleia-1xlarge} input))

(clojure.core/defn- deser-task-count [input] input)

(clojure.core/defn- deser-compression-type [input] (clojure.core/get {"None" :none, "Gzip" :gzip} input))

(clojure.core/defn- deser-output-data-config [input] (clojure.core/cond-> {:s-3-output-path (deser-s-3-uri (input "S3OutputPath"))} (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId")))))

(clojure.core/defn- deser-cents [input] input)

(clojure.core/defn- deser-continuous-parameter-range-specification [input] (clojure.core/cond-> {:min-value (deser-parameter-value (input "MinValue")), :max-value (deser-parameter-value (input "MaxValue"))}))

(clojure.core/defn- deser-attribute-names [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-attribute-name coll))) input))

(clojure.core/defn- deser-arn-or-name [input] input)

(clojure.core/defn- deser-metric-regex [input] input)

(clojure.core/defn- deser-model-name [input] input)

(clojure.core/defn- deser-endpoint-status [input] (clojure.core/get {"OutOfService" :out-of-service, "Creating" :creating, "Updating" :updating, "SystemUpdating" :system-updating, "RollingBack" :rolling-back, "InService" :in-service, "Deleting" :deleting, "Failed" :failed} input))

(clojure.core/defn- deser-workteams [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-workteam coll))) input))

(clojure.core/defn- deser-additional-code-repository-names-or-urls [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-code-repository-name-or-url coll))) input))

(clojure.core/defn- deser-parameter-name [input] input)

(clojure.core/defn- deser-hyper-parameter-tuning-job-status [input] (clojure.core/get {"Completed" :completed, "InProgress" :in-progress, "Failed" :failed, "Stopped" :stopped, "Stopping" :stopping} input))

(clojure.core/defn- deser-endpoint-config-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-endpoint-config-summary coll))) input))

(clojure.core/defn- deser-variant-name [input] input)

(clojure.core/defn- deser-parameter-type [input] (clojure.core/get {"Integer" :integer, "Continuous" :continuous, "Categorical" :categorical, "FreeText" :free-text} input))

(clojure.core/defn- deser-workteam [input] (clojure.core/cond-> {:workteam-name (deser-workteam-name (input "WorkteamName")), :member-definitions (deser-member-definitions (input "MemberDefinitions")), :workteam-arn (deser-workteam-arn (input "WorkteamArn")), :description (deser-string-200 (input "Description"))} (clojure.core/contains? input "ProductListingIds") (clojure.core/assoc :product-listing-ids (deser-product-listings (input "ProductListingIds"))) (clojure.core/contains? input "SubDomain") (clojure.core/assoc :sub-domain (deser-string (input "SubDomain"))) (clojure.core/contains? input "CreateDate") (clojure.core/assoc :create-date (deser-timestamp (input "CreateDate"))) (clojure.core/contains? input "LastUpdatedDate") (clojure.core/assoc :last-updated-date (deser-timestamp (input "LastUpdatedDate")))))

(clojure.core/defn- deser-cognito-user-group [input] input)

(clojure.core/defn- deser-member-definitions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-member-definition coll))) input))

(clojure.core/defn- deser-endpoint-summary [input] (clojure.core/cond-> {:endpoint-name (deser-endpoint-name (input "EndpointName")), :endpoint-arn (deser-endpoint-arn (input "EndpointArn")), :creation-time (deser-timestamp (input "CreationTime")), :last-modified-time (deser-timestamp (input "LastModifiedTime")), :endpoint-status (deser-endpoint-status (input "EndpointStatus"))}))

(clojure.core/defn- deser-label-counters [input] (clojure.core/cond-> {} (clojure.core/contains? input "TotalLabeled") (clojure.core/assoc :total-labeled (deser-label-counter (input "TotalLabeled"))) (clojure.core/contains? input "HumanLabeled") (clojure.core/assoc :human-labeled (deser-label-counter (input "HumanLabeled"))) (clojure.core/contains? input "MachineLabeled") (clojure.core/assoc :machine-labeled (deser-label-counter (input "MachineLabeled"))) (clojure.core/contains? input "FailedNonRetryableError") (clojure.core/assoc :failed-non-retryable-error (deser-label-counter (input "FailedNonRetryableError"))) (clojure.core/contains? input "Unlabeled") (clojure.core/assoc :unlabeled (deser-label-counter (input "Unlabeled")))))

(clojure.core/defn- deser-max-payload-in-mb [input] input)

(clojure.core/defn- deser-max-number-of-training-jobs [input] input)

(clojure.core/defn- deser-parameter-key [input] input)

(clojure.core/defn- deser-transform-resources [input] (clojure.core/cond-> {:instance-type (deser-transform-instance-type (input "InstanceType")), :instance-count (deser-transform-instance-count (input "InstanceCount"))} (clojure.core/contains? input "VolumeKmsKeyId") (clojure.core/assoc :volume-kms-key-id (deser-kms-key-id (input "VolumeKmsKeyId")))))

(clojure.core/defn- deser-training-job-status-counter [input] input)

(clojure.core/defn- deser-volume-size-in-gb [input] input)

(clojure.core/defn- deser-model-package-container-definition [input] (clojure.core/cond-> {:image (deser-image (input "Image"))} (clojure.core/contains? input "ContainerHostname") (clojure.core/assoc :container-hostname (deser-container-hostname (input "ContainerHostname"))) (clojure.core/contains? input "ImageDigest") (clojure.core/assoc :image-digest (deser-image-digest (input "ImageDigest"))) (clojure.core/contains? input "ModelDataUrl") (clojure.core/assoc :model-data-url (deser-url (input "ModelDataUrl"))) (clojure.core/contains? input "ProductId") (clojure.core/assoc :product-id (deser-product-id (input "ProductId")))))

(clojure.core/defn- deser-security-group-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group-id coll))) input))

(clojure.core/defn- deser-image-digest [input] input)

(clojure.core/defn- deser-hyper-parameters [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-parameter-key k) (deser-parameter-value v)])) input))

(clojure.core/defn- deser-branch [input] input)

(clojure.core/defn- deser-hyper-parameter-tuning-job-strategy-type [input] (clojure.core/get {"Bayesian" :bayesian} input))

(clojure.core/defn- deser-continuous-parameter-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-continuous-parameter-range coll))) input))

(clojure.core/defn- deser-code-repository-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-code-repository-summary coll))) input))

(clojure.core/defn- deser-notebook-instance-arn [input] input)

(clojure.core/defn- deser-hyper-parameter-training-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hyper-parameter-training-job-summary coll))) input))

(clojure.core/defn- deser-subnets [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-subnet-id coll))) input))

(clojure.core/defn- deser-workteam-name [input] input)

(clojure.core/defn- deser-training-job [input] (clojure.core/cond-> {} (clojure.core/contains? input "EnableNetworkIsolation") (clojure.core/assoc :enable-network-isolation (deser-boolean (input "EnableNetworkIsolation"))) (clojure.core/contains? input "ResourceConfig") (clojure.core/assoc :resource-config (deser-resource-config (input "ResourceConfig"))) (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "LabelingJobArn") (clojure.core/assoc :labeling-job-arn (deser-labeling-job-arn (input "LabelingJobArn"))) (clojure.core/contains? input "TrainingEndTime") (clojure.core/assoc :training-end-time (deser-timestamp (input "TrainingEndTime"))) (clojure.core/contains? input "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (input "OutputDataConfig"))) (clojure.core/contains? input "HyperParameters") (clojure.core/assoc :hyper-parameters (deser-hyper-parameters (input "HyperParameters"))) (clojure.core/contains? input "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (input "RoleArn"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tag-list (input "Tags"))) (clojure.core/contains? input "TrainingJobArn") (clojure.core/assoc :training-job-arn (deser-training-job-arn (input "TrainingJobArn"))) (clojure.core/contains? input "StoppingCondition") (clojure.core/assoc :stopping-condition (deser-stopping-condition (input "StoppingCondition"))) (clojure.core/contains? input "SecondaryStatus") (clojure.core/assoc :secondary-status (deser-secondary-status (input "SecondaryStatus"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-timestamp (input "CreationTime"))) (clojure.core/contains? input "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "VpcConfig"))) (clojure.core/contains? input "TrainingJobName") (clojure.core/assoc :training-job-name (deser-training-job-name (input "TrainingJobName"))) (clojure.core/contains? input "TuningJobArn") (clojure.core/assoc :tuning-job-arn (deser-hyper-parameter-tuning-job-arn (input "TuningJobArn"))) (clojure.core/contains? input "ModelArtifacts") (clojure.core/assoc :model-artifacts (deser-model-artifacts (input "ModelArtifacts"))) (clojure.core/contains? input "FinalMetricDataList") (clojure.core/assoc :final-metric-data-list (deser-final-metric-data-list (input "FinalMetricDataList"))) (clojure.core/contains? input "TrainingStartTime") (clojure.core/assoc :training-start-time (deser-timestamp (input "TrainingStartTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (input "LastModifiedTime"))) (clojure.core/contains? input "TrainingJobStatus") (clojure.core/assoc :training-job-status (deser-training-job-status (input "TrainingJobStatus"))) (clojure.core/contains? input "AlgorithmSpecification") (clojure.core/assoc :algorithm-specification (deser-algorithm-specification (input "AlgorithmSpecification"))) (clojure.core/contains? input "SecondaryStatusTransitions") (clojure.core/assoc :secondary-status-transitions (deser-secondary-status-transitions (input "SecondaryStatusTransitions")))))

(clojure.core/defn- deser-attribute-name [input] input)

(clojure.core/defn- deser-detailed-algorithm-status [input] (clojure.core/get {"NotStarted" :not-started, "InProgress" :in-progress, "Completed" :completed, "Failed" :failed} input))

(clojure.core/defn- deser-shuffle-config [input] (clojure.core/cond-> {:seed (deser-seed (input "Seed"))}))

(clojure.core/defn- deser-channel-specifications [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-channel-specification coll))) input))

(clojure.core/defn- deser-transform-instance-count [input] input)

(clojure.core/defn- deser-transform-data-source [input] (clojure.core/cond-> {:s-3-data-source (deser-transform-s-3-data-source (input "S3DataSource"))}))

(clojure.core/defn- deser-input-config [input] (clojure.core/cond-> {:s-3-uri (deser-s-3-uri (input "S3Uri")), :data-input-config (deser-data-input-config (input "DataInputConfig")), :framework (deser-framework (input "Framework"))}))

(clojure.core/defn- deser-labeling-job-output [input] (clojure.core/cond-> {:output-dataset-s-3-uri (deser-s-3-uri (input "OutputDatasetS3Uri"))} (clojure.core/contains? input "FinalActiveLearningModelArn") (clojure.core/assoc :final-active-learning-model-arn (deser-model-arn (input "FinalActiveLearningModelArn")))))

(clojure.core/defn- deser-resource-limits [input] (clojure.core/cond-> {:max-number-of-training-jobs (deser-max-number-of-training-jobs (input "MaxNumberOfTrainingJobs")), :max-parallel-training-jobs (deser-max-parallel-training-jobs (input "MaxParallelTrainingJobs"))}))

(clojure.core/defn- deser-cognito-member-definition [input] (clojure.core/cond-> {:user-pool (deser-cognito-user-pool (input "UserPool")), :user-group (deser-cognito-user-group (input "UserGroup")), :client-id (deser-cognito-client-id (input "ClientId"))}))

(clojure.core/defn- deser-training-instance-count [input] input)

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-model-package-status-item [input] (clojure.core/cond-> {:name (deser-entity-name (input "Name")), :status (deser-detailed-model-package-status (input "Status"))} (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-string (input "FailureReason")))))

(clojure.core/defn- deser-s-3-data-type [input] (clojure.core/get {"ManifestFile" :manifest-file, "S3Prefix" :s-3-prefix, "AugmentedManifestFile" :augmented-manifest-file} input))

(clojure.core/defn- deser-certify-for-marketplace [input] input)

(clojure.core/defn- deser-s-3-data-distribution [input] (clojure.core/get {"FullyReplicated" :fully-replicated, "ShardedByS3Key" :sharded-by-s-3-key} input))

(clojure.core/defn- deser-response-mime-type [input] input)

(clojure.core/defn- deser-status-message [input] input)

(clojure.core/defn- deser-code-repository-summary [input] (clojure.core/cond-> {:code-repository-name (deser-entity-name (input "CodeRepositoryName")), :code-repository-arn (deser-code-repository-arn (input "CodeRepositoryArn")), :creation-time (deser-creation-time (input "CreationTime")), :last-modified-time (deser-last-modified-time (input "LastModifiedTime"))} (clojure.core/contains? input "GitConfig") (clojure.core/assoc :git-config (deser-git-config (input "GitConfig")))))

(clojure.core/defn- deser-entity-name [input] input)

(clojure.core/defn- deser-detailed-model-package-status [input] (clojure.core/get {"NotStarted" :not-started, "InProgress" :in-progress, "Completed" :completed, "Failed" :failed} input))

(clojure.core/defn- deser-transform-s-3-data-source [input] (clojure.core/cond-> {:s-3-data-type (deser-s-3-data-type (input "S3DataType")), :s-3-uri (deser-s-3-uri (input "S3Uri"))}))

(clojure.core/defn- deser-max-concurrent-transforms [input] input)

(clojure.core/defn- deser-container-hostname [input] input)

(clojure.core/defn- deser-labeling-job-for-workteam-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-labeling-job-for-workteam-summary coll))) input))

(clojure.core/defn- deser-realtime-inference-instance-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-production-variant-instance-type coll))) input))

(clojure.core/defn- deser-instance-type [input] (clojure.core/get {"ml.t2.large" :mlt-2large, "ml.m5.xlarge" :mlm-5xlarge, "ml.c5.xlarge" :mlc-5xlarge, "ml.m4.2xlarge" :mlm-42xlarge, "ml.c5.9xlarge" :mlc-59xlarge, "ml.p2.16xlarge" :mlp-216xlarge, "ml.m5.12xlarge" :mlm-512xlarge, "ml.c5.2xlarge" :mlc-52xlarge, "ml.c5d.18xlarge" :mlc-5d-18xlarge, "ml.c4.2xlarge" :mlc-42xlarge, "ml.t2.2xlarge" :mlt-22xlarge, "ml.t3.large" :mlt-3large, "ml.c4.4xlarge" :mlc-44xlarge, "ml.t3.xlarge" :mlt-3xlarge, "ml.m4.4xlarge" :mlm-44xlarge, "ml.m5.4xlarge" :mlm-54xlarge, "ml.m4.xlarge" :mlm-4xlarge, "ml.m4.16xlarge" :mlm-416xlarge, "ml.c5d.2xlarge" :mlc-5d-2xlarge, "ml.c5d.9xlarge" :mlc-5d-9xlarge, "ml.p2.8xlarge" :mlp-28xlarge, "ml.c5d.4xlarge" :mlc-5d-4xlarge, "ml.t3.2xlarge" :mlt-32xlarge, "ml.t3.medium" :mlt-3medium, "ml.t2.xlarge" :mlt-2xlarge, "ml.p3.16xlarge" :mlp-316xlarge, "ml.c4.8xlarge" :mlc-48xlarge, "ml.c5.18xlarge" :mlc-518xlarge, "ml.m5.2xlarge" :mlm-52xlarge, "ml.c4.xlarge" :mlc-4xlarge, "ml.m5.24xlarge" :mlm-524xlarge, "ml.p3.2xlarge" :mlp-32xlarge, "ml.c5d.xlarge" :mlc-5dxlarge, "ml.p3.8xlarge" :mlp-38xlarge, "ml.p2.xlarge" :mlp-2xlarge, "ml.m4.10xlarge" :mlm-410xlarge, "ml.t2.medium" :mlt-2medium, "ml.c5.4xlarge" :mlc-54xlarge} input))

(clojure.core/defn- deser-public-workforce-task-price [input] (clojure.core/cond-> {} (clojure.core/contains? input "AmountInUsd") (clojure.core/assoc :amount-in-usd (deser-usd (input "AmountInUsd")))))

(clojure.core/defn- deser-final-hyper-parameter-tuning-job-objective-metric [input] (clojure.core/cond-> {:metric-name (deser-metric-name (input "MetricName")), :value (deser-metric-value (input "Value"))} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-hyper-parameter-tuning-job-objective-type (input "Type")))))

(clojure.core/defn- deser-data-input-config [input] input)

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-training-input-mode [input] (clojure.core/get {"Pipe" :pipe, "File" :file} input))

(clojure.core/defn- deser-transform-input [input] (clojure.core/cond-> {:data-source (deser-transform-data-source (input "DataSource"))} (clojure.core/contains? input "ContentType") (clojure.core/assoc :content-type (deser-content-type (input "ContentType"))) (clojure.core/contains? input "CompressionType") (clojure.core/assoc :compression-type (deser-compression-type (input "CompressionType"))) (clojure.core/contains? input "SplitType") (clojure.core/assoc :split-type (deser-split-type (input "SplitType")))))

(clojure.core/defn- deser-s-3-uri [input] input)

(clojure.core/defn- deser-response-mime-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-response-mime-type coll))) input))

(clojure.core/defn- deser-task-description [input] input)

(clojure.core/defn- deser-integer-parameter-range-specification [input] (clojure.core/cond-> {:min-value (deser-parameter-value (input "MinValue")), :max-value (deser-parameter-value (input "MaxValue"))}))

(clojure.core/defn- deser-secret-arn [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-transform-job-summary [input] (clojure.core/cond-> {:transform-job-name (deser-transform-job-name (input "TransformJobName")), :transform-job-arn (deser-transform-job-arn (input "TransformJobArn")), :creation-time (deser-timestamp (input "CreationTime")), :transform-job-status (deser-transform-job-status (input "TransformJobStatus"))} (clojure.core/contains? input "TransformEndTime") (clojure.core/assoc :transform-end-time (deser-timestamp (input "TransformEndTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (input "LastModifiedTime"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason")))))

(clojure.core/defn- deser-parent-hyper-parameter-tuning-job [input] (clojure.core/cond-> {} (clojure.core/contains? input "HyperParameterTuningJobName") (clojure.core/assoc :hyper-parameter-tuning-job-name (deser-hyper-parameter-tuning-job-name (input "HyperParameterTuningJobName")))))

(clojure.core/defn- deser-production-variant-instance-type [input] (clojure.core/get {"ml.t2.large" :mlt-2large, "ml.c4.large" :mlc-4large, "ml.m5.xlarge" :mlm-5xlarge, "ml.c5.xlarge" :mlc-5xlarge, "ml.m4.2xlarge" :mlm-42xlarge, "ml.c5.9xlarge" :mlc-59xlarge, "ml.p2.16xlarge" :mlp-216xlarge, "ml.m5.large" :mlm-5large, "ml.m5.12xlarge" :mlm-512xlarge, "ml.c5.2xlarge" :mlc-52xlarge, "ml.c4.2xlarge" :mlc-42xlarge, "ml.t2.2xlarge" :mlt-22xlarge, "ml.c5.large" :mlc-5large, "ml.c4.4xlarge" :mlc-44xlarge, "ml.m4.4xlarge" :mlm-44xlarge, "ml.m5.4xlarge" :mlm-54xlarge, "ml.m4.xlarge" :mlm-4xlarge, "ml.m4.16xlarge" :mlm-416xlarge, "ml.p2.8xlarge" :mlp-28xlarge, "ml.t2.xlarge" :mlt-2xlarge, "ml.p3.16xlarge" :mlp-316xlarge, "ml.c4.8xlarge" :mlc-48xlarge, "ml.c5.18xlarge" :mlc-518xlarge, "ml.m5.2xlarge" :mlm-52xlarge, "ml.c4.xlarge" :mlc-4xlarge, "ml.m5.24xlarge" :mlm-524xlarge, "ml.p3.2xlarge" :mlp-32xlarge, "ml.p3.8xlarge" :mlp-38xlarge, "ml.p2.xlarge" :mlp-2xlarge, "ml.m4.10xlarge" :mlm-410xlarge, "ml.t2.medium" :mlt-2medium, "ml.c5.4xlarge" :mlc-54xlarge} input))

(clojure.core/defn- deser-label-counters-for-workteam [input] (clojure.core/cond-> {} (clojure.core/contains? input "HumanLabeled") (clojure.core/assoc :human-labeled (deser-label-counter (input "HumanLabeled"))) (clojure.core/contains? input "PendingHuman") (clojure.core/assoc :pending-human (deser-label-counter (input "PendingHuman"))) (clojure.core/contains? input "Total") (clojure.core/assoc :total (deser-label-counter (input "Total")))))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-parameter-values [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parameter-value coll))) input))

(clojure.core/defn- deser-production-variant-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-production-variant coll))) input))

(clojure.core/defn- deser-network-interface-id [input] input)

(clojure.core/defn- deser-environment-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-environment-key k) (deser-environment-value v)])) input))

(clojure.core/defn- deser-max-parallel-training-jobs [input] input)

(clojure.core/defn- deser-notebook-instance-lifecycle-config-name [input] input)

(clojure.core/defn- deser-tenth-fractions-of-a-cent [input] input)

(clojure.core/defn- deser-workteam-arn [input] input)

(clojure.core/defn- deser-labeling-job-for-workteam-summary [input] (clojure.core/cond-> {:job-reference-code (deser-job-reference-code (input "JobReferenceCode")), :work-requester-account-id (deser-account-id (input "WorkRequesterAccountId")), :creation-time (deser-timestamp (input "CreationTime"))} (clojure.core/contains? input "LabelingJobName") (clojure.core/assoc :labeling-job-name (deser-labeling-job-name (input "LabelingJobName"))) (clojure.core/contains? input "LabelCounters") (clojure.core/assoc :label-counters (deser-label-counters-for-workteam (input "LabelCounters")))))

(clojure.core/defn- deser-notebook-instance-url [input] input)

(clojure.core/defn- deser-task-availability-lifetime-in-seconds [input] input)

(clojure.core/defn- deser-vpc-security-group-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-security-group-id coll))) input))

(clojure.core/defn- deser-algorithm-summary [input] (clojure.core/cond-> {:algorithm-name (deser-entity-name (input "AlgorithmName")), :algorithm-arn (deser-algorithm-arn (input "AlgorithmArn")), :creation-time (deser-creation-time (input "CreationTime")), :algorithm-status (deser-algorithm-status (input "AlgorithmStatus"))} (clojure.core/contains? input "AlgorithmDescription") (clojure.core/assoc :algorithm-description (deser-entity-description (input "AlgorithmDescription")))))

(clojure.core/defn- deser-labeling-job-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-labeling-job-summary coll))) input))

(clojure.core/defn- deser-notebook-instance-status [input] (clojure.core/get {"Pending" :pending, "InService" :in-service, "Stopping" :stopping, "Stopped" :stopped, "Failed" :failed, "Deleting" :deleting, "Updating" :updating} input))

(clojure.core/defn- deser-number-of-human-workers-per-data-object [input] input)

(clojure.core/defn- deser-git-config [input] (clojure.core/cond-> {:repository-url (deser-git-config-url (input "RepositoryUrl"))} (clojure.core/contains? input "Branch") (clojure.core/assoc :branch (deser-branch (input "Branch"))) (clojure.core/contains? input "SecretArn") (clojure.core/assoc :secret-arn (deser-secret-arn (input "SecretArn")))))

(clojure.core/defn- deser-next-token [input] input)

(clojure.core/defn- deser-objective-status [input] (clojure.core/get {"Succeeded" :succeeded, "Pending" :pending, "Failed" :failed} input))

(clojure.core/defn- deser-max-concurrent-task-count [input] input)

(clojure.core/defn- deser-hyper-parameter-tuning-job-warm-start-config [input] (clojure.core/cond-> {:parent-hyper-parameter-tuning-jobs (deser-parent-hyper-parameter-tuning-jobs (input "ParentHyperParameterTuningJobs")), :warm-start-type (deser-hyper-parameter-tuning-job-warm-start-type (input "WarmStartType"))}))

(clojure.core/defn- deser-training-job-arn [input] input)

(clojure.core/defn- deser-algorithm-validation-specification [input] (clojure.core/cond-> {:validation-role (deser-role-arn (input "ValidationRole")), :validation-profiles (deser-algorithm-validation-profiles (input "ValidationProfiles"))}))

(clojure.core/defn- deser-endpoint-name [input] input)

(clojure.core/defn- deser-training-instance-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-training-instance-type coll))) input))

(clojure.core/defn- deser-content-classifiers [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-content-classifier coll))) input))

(clojure.core/defn- deser-hyper-parameter-tuning-job-config [input] (clojure.core/cond-> {:strategy (deser-hyper-parameter-tuning-job-strategy-type (input "Strategy")), :hyper-parameter-tuning-job-objective (deser-hyper-parameter-tuning-job-objective (input "HyperParameterTuningJobObjective")), :resource-limits (deser-resource-limits (input "ResourceLimits")), :parameter-ranges (deser-parameter-ranges (input "ParameterRanges"))} (clojure.core/contains? input "TrainingJobEarlyStoppingType") (clojure.core/assoc :training-job-early-stopping-type (deser-training-job-early-stopping-type (input "TrainingJobEarlyStoppingType")))))

(clojure.core/defn- deser-code-repository-arn [input] input)

(clojure.core/defn- deser-hyper-parameter-tuning-job-objectives [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hyper-parameter-tuning-job-objective coll))) input))

(clojure.core/defn- deser-transform-job-definition [input] (clojure.core/cond-> {:transform-input (deser-transform-input (input "TransformInput")), :transform-output (deser-transform-output (input "TransformOutput")), :transform-resources (deser-transform-resources (input "TransformResources"))} (clojure.core/contains? input "MaxConcurrentTransforms") (clojure.core/assoc :max-concurrent-transforms (deser-max-concurrent-transforms (input "MaxConcurrentTransforms"))) (clojure.core/contains? input "MaxPayloadInMB") (clojure.core/assoc :max-payload-in-mb (deser-max-payload-in-mb (input "MaxPayloadInMB"))) (clojure.core/contains? input "BatchStrategy") (clojure.core/assoc :batch-strategy (deser-batch-strategy (input "BatchStrategy"))) (clojure.core/contains? input "Environment") (clojure.core/assoc :environment (deser-transform-environment-map (input "Environment")))))

(clojure.core/defn- deser-labeling-job-algorithm-specification-arn [input] input)

(clojure.core/defn- deser-algorithm-validation-profiles [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-algorithm-validation-profile coll))) input))

(clojure.core/defn- deser-model-package-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-model-package-summary coll))) input))

(clojure.core/defn- deser-endpoint-config-arn [input] input)

(clojure.core/defn- deser-content-type [input] input)

(clojure.core/defn- deser-ui-config [input] (clojure.core/cond-> {:ui-template-s-3-uri (deser-s-3-uri (input "UiTemplateS3Uri"))}))

(clojure.core/defn- deser-objective-status-counters [input] (clojure.core/cond-> {} (clojure.core/contains? input "Succeeded") (clojure.core/assoc :succeeded (deser-objective-status-counter (input "Succeeded"))) (clojure.core/contains? input "Pending") (clojure.core/assoc :pending (deser-objective-status-counter (input "Pending"))) (clojure.core/contains? input "Failed") (clojure.core/assoc :failed (deser-objective-status-counter (input "Failed")))))

(clojure.core/defn- deser-hyper-parameter-tuning-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hyper-parameter-tuning-job-summary coll))) input))

(clojure.core/defn- deser-transform-environment-value [input] input)

(clojure.core/defn- deser-subscribed-workteam [input] (clojure.core/cond-> {:workteam-arn (deser-workteam-arn (input "WorkteamArn"))} (clojure.core/contains? input "MarketplaceTitle") (clojure.core/assoc :marketplace-title (deser-string-200 (input "MarketplaceTitle"))) (clojure.core/contains? input "SellerName") (clojure.core/assoc :seller-name (deser-string (input "SellerName"))) (clojure.core/contains? input "MarketplaceDescription") (clojure.core/assoc :marketplace-description (deser-string-200 (input "MarketplaceDescription"))) (clojure.core/contains? input "ListingId") (clojure.core/assoc :listing-id (deser-string (input "ListingId")))))

(clojure.core/defn- deser-entity-description [input] input)

(clojure.core/defn- deser-categorical-parameter-range-specification [input] (clojure.core/cond-> {:values (deser-parameter-values (input "Values"))}))

(clojure.core/defn- deser-direct-internet-access [input] (clojure.core/get {"Enabled" :enabled, "Disabled" :disabled} input))

(clojure.core/defn- deser-model-package-validation-profiles [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-model-package-validation-profile coll))) input))

(clojure.core/defn- deser-member-definition [input] (clojure.core/cond-> {} (clojure.core/contains? input "CognitoMemberDefinition") (clojure.core/assoc :cognito-member-definition (deser-cognito-member-definition (input "CognitoMemberDefinition")))))

(clojure.core/defn- deser-transform-environment-map [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-transform-environment-key k) (deser-transform-environment-value v)])) input))

(clojure.core/defn- deser-s-3-data-source [input] (clojure.core/cond-> {:s-3-data-type (deser-s-3-data-type (input "S3DataType")), :s-3-uri (deser-s-3-uri (input "S3Uri"))} (clojure.core/contains? input "S3DataDistributionType") (clojure.core/assoc :s-3-data-distribution-type (deser-s-3-data-distribution (input "S3DataDistributionType"))) (clojure.core/contains? input "AttributeNames") (clojure.core/assoc :attribute-names (deser-attribute-names (input "AttributeNames")))))

(clojure.core/defn- deser-notebook-instance-lifecycle-config-arn [input] input)

(clojure.core/defn- deser-stopping-condition [input] (clojure.core/cond-> {} (clojure.core/contains? input "MaxRuntimeInSeconds") (clojure.core/assoc :max-runtime-in-seconds (deser-max-runtime-in-seconds (input "MaxRuntimeInSeconds")))))

(clojure.core/defn- deser-search-results-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-search-record coll))) input))

(clojure.core/defn- deser-parent-hyper-parameter-tuning-jobs [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parent-hyper-parameter-tuning-job coll))) input))

(clojure.core/defn- deser-human-task-config [input] (clojure.core/cond-> {:workteam-arn (deser-workteam-arn (input "WorkteamArn")), :ui-config (deser-ui-config (input "UiConfig")), :pre-human-task-lambda-arn (deser-lambda-function-arn (input "PreHumanTaskLambdaArn")), :task-title (deser-task-title (input "TaskTitle")), :task-description (deser-task-description (input "TaskDescription")), :number-of-human-workers-per-data-object (deser-number-of-human-workers-per-data-object (input "NumberOfHumanWorkersPerDataObject")), :task-time-limit-in-seconds (deser-task-time-limit-in-seconds (input "TaskTimeLimitInSeconds")), :annotation-consolidation-config (deser-annotation-consolidation-config (input "AnnotationConsolidationConfig"))} (clojure.core/contains? input "PublicWorkforceTaskPrice") (clojure.core/assoc :public-workforce-task-price (deser-public-workforce-task-price (input "PublicWorkforceTaskPrice"))) (clojure.core/contains? input "TaskAvailabilityLifetimeInSeconds") (clojure.core/assoc :task-availability-lifetime-in-seconds (deser-task-availability-lifetime-in-seconds (input "TaskAvailabilityLifetimeInSeconds"))) (clojure.core/contains? input "MaxConcurrentTaskCount") (clojure.core/assoc :max-concurrent-task-count (deser-max-concurrent-task-count (input "MaxConcurrentTaskCount"))) (clojure.core/contains? input "TaskKeywords") (clojure.core/assoc :task-keywords (deser-task-keywords (input "TaskKeywords")))))

(clojure.core/defn- deser-compression-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compression-type coll))) input))

(clojure.core/defn- deser-transform-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-transform-job-summary coll))) input))

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-secondary-status [input] (clojure.core/get {"Failed" :failed, "Downloading" :downloading, "LaunchingMLInstances" :launching-ml-instances, "DownloadingTrainingImage" :downloading-training-image, "PreparingTrainingStack" :preparing-training-stack, "MaxRuntimeExceeded" :max-runtime-exceeded, "Uploading" :uploading, "Stopping" :stopping, "Starting" :starting, "Stopped" :stopped, "Completed" :completed, "Training" :training} input))

(clojure.core/defn- deser-hyper-parameter-specification [input] (clojure.core/cond-> {:name (deser-parameter-name (input "Name")), :type (deser-parameter-type (input "Type"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-entity-description (input "Description"))) (clojure.core/contains? input "Range") (clojure.core/assoc :range (deser-parameter-range (input "Range"))) (clojure.core/contains? input "IsTunable") (clojure.core/assoc :is-tunable (deser-boolean (input "IsTunable"))) (clojure.core/contains? input "IsRequired") (clojure.core/assoc :is-required (deser-boolean (input "IsRequired"))) (clojure.core/contains? input "DefaultValue") (clojure.core/assoc :default-value (deser-parameter-value (input "DefaultValue")))))

(clojure.core/defn- deser-notebook-instance-lifecycle-config-summary [input] (clojure.core/cond-> {:notebook-instance-lifecycle-config-name (deser-notebook-instance-lifecycle-config-name (input "NotebookInstanceLifecycleConfigName")), :notebook-instance-lifecycle-config-arn (deser-notebook-instance-lifecycle-config-arn (input "NotebookInstanceLifecycleConfigArn"))} (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (input "CreationTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-last-modified-time (input "LastModifiedTime")))))

(clojure.core/defn- deser-environment-value [input] input)

(clojure.core/defn- deser-categorical-parameter-range [input] (clojure.core/cond-> {:name (deser-parameter-key (input "Name")), :values (deser-parameter-values (input "Values"))}))

(clojure.core/defn- deser-hyper-parameter-tuning-job-objective-type [input] (clojure.core/get {"Maximize" :maximize, "Minimize" :minimize} input))

(clojure.core/defn- deser-git-config-url [input] input)

(clojure.core/defn- deser-cognito-user-pool [input] input)

(clojure.core/defn- deser-compilation-job-arn [input] input)

(clojure.core/defn- deser-labeling-job-resource-config [input] (clojure.core/cond-> {} (clojure.core/contains? input "VolumeKmsKeyId") (clojure.core/assoc :volume-kms-key-id (deser-kms-key-id (input "VolumeKmsKeyId")))))

(clojure.core/defn- deser-training-job-summary [input] (clojure.core/cond-> {:training-job-name (deser-training-job-name (input "TrainingJobName")), :training-job-arn (deser-training-job-arn (input "TrainingJobArn")), :creation-time (deser-timestamp (input "CreationTime")), :training-job-status (deser-training-job-status (input "TrainingJobStatus"))} (clojure.core/contains? input "TrainingEndTime") (clojure.core/assoc :training-end-time (deser-timestamp (input "TrainingEndTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (input "LastModifiedTime")))))

(clojure.core/defn- deser-max-runtime-in-seconds [input] input)

(clojure.core/defn- deser-success [input] input)

(clojure.core/defn- deser-transform-environment-key [input] input)

(clojure.core/defn- deser-label-attribute-name [input] input)

(clojure.core/defn- deser-metric-definition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-definition coll))) input))

(clojure.core/defn- deser-string-200 [input] input)

(clojure.core/defn- deser-model-package-validation-specification [input] (clojure.core/cond-> {:validation-role (deser-role-arn (input "ValidationRole")), :validation-profiles (deser-model-package-validation-profiles (input "ValidationProfiles"))}))

(clojure.core/defn- deser-task-keywords [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-task-keyword coll))) input))

(clojure.core/defn- deser-channel-name [input] input)

(clojure.core/defn- deser-categorical-parameter-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-categorical-parameter-range coll))) input))

(clojure.core/defn- deser-hyper-parameter-tuning-job-arn [input] input)

(clojure.core/defn- deser-model-package-summary [input] (clojure.core/cond-> {:model-package-name (deser-entity-name (input "ModelPackageName")), :model-package-arn (deser-model-package-arn (input "ModelPackageArn")), :creation-time (deser-creation-time (input "CreationTime")), :model-package-status (deser-model-package-status (input "ModelPackageStatus"))} (clojure.core/contains? input "ModelPackageDescription") (clojure.core/assoc :model-package-description (deser-entity-description (input "ModelPackageDescription")))))

(clojure.core/defn- deser-notebook-instance-lifecycle-config-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notebook-instance-lifecycle-hook coll))) input))

(clojure.core/defn- deser-model-summary [input] (clojure.core/cond-> {:model-name (deser-model-name (input "ModelName")), :model-arn (deser-model-arn (input "ModelArn")), :creation-time (deser-timestamp (input "CreationTime"))}))

(clojure.core/defn- deser-hyper-parameter-algorithm-specification [input] (clojure.core/cond-> {:training-input-mode (deser-training-input-mode (input "TrainingInputMode"))} (clojure.core/contains? input "TrainingImage") (clojure.core/assoc :training-image (deser-algorithm-image (input "TrainingImage"))) (clojure.core/contains? input "AlgorithmName") (clojure.core/assoc :algorithm-name (deser-arn-or-name (input "AlgorithmName"))) (clojure.core/contains? input "MetricDefinitions") (clojure.core/assoc :metric-definitions (deser-metric-definition-list (input "MetricDefinitions")))))

(clojure.core/defn- deser-url [input] input)

(clojure.core/defn- deser-notebook-instance-lifecycle-config-content [input] input)

(clojure.core/defn- deser-algorithm-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-algorithm-summary coll))) input))

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-container-definition [input] (clojure.core/cond-> {} (clojure.core/contains? input "ContainerHostname") (clojure.core/assoc :container-hostname (deser-container-hostname (input "ContainerHostname"))) (clojure.core/contains? input "Image") (clojure.core/assoc :image (deser-image (input "Image"))) (clojure.core/contains? input "ModelDataUrl") (clojure.core/assoc :model-data-url (deser-url (input "ModelDataUrl"))) (clojure.core/contains? input "Environment") (clojure.core/assoc :environment (deser-environment-map (input "Environment"))) (clojure.core/contains? input "ModelPackageName") (clojure.core/assoc :model-package-name (deser-arn-or-name (input "ModelPackageName")))))

(clojure.core/defn- deser-seed [input] input)

(clojure.core/defn- deser-resource-property-name [input] input)

(clojure.core/defn- deser-lambda-function-arn [input] input)

(clojure.core/defn- deser-model-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-model-summary coll))) input))

(clojure.core/defn- deser-property-name-suggestion-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-property-name-suggestion coll))) input))

(clojure.core/defn- deser-model-package-validation-profile [input] (clojure.core/cond-> {:profile-name (deser-entity-name (input "ProfileName")), :transform-job-definition (deser-transform-job-definition (input "TransformJobDefinition"))}))

(clojure.core/defn- deser-labeling-job-input-config [input] (clojure.core/cond-> {:data-source (deser-labeling-job-data-source (input "DataSource"))} (clojure.core/contains? input "DataAttributes") (clojure.core/assoc :data-attributes (deser-labeling-job-data-attributes (input "DataAttributes")))))

(clojure.core/defn- deser-parameter-ranges [input] (clojure.core/cond-> {} (clojure.core/contains? input "IntegerParameterRanges") (clojure.core/assoc :integer-parameter-ranges (deser-integer-parameter-ranges (input "IntegerParameterRanges"))) (clojure.core/contains? input "ContinuousParameterRanges") (clojure.core/assoc :continuous-parameter-ranges (deser-continuous-parameter-ranges (input "ContinuousParameterRanges"))) (clojure.core/contains? input "CategoricalParameterRanges") (clojure.core/assoc :categorical-parameter-ranges (deser-categorical-parameter-ranges (input "CategoricalParameterRanges")))))

(clojure.core/defn- deser-production-variant [input] (clojure.core/cond-> {:variant-name (deser-variant-name (input "VariantName")), :model-name (deser-model-name (input "ModelName")), :initial-instance-count (deser-task-count (input "InitialInstanceCount")), :instance-type (deser-production-variant-instance-type (input "InstanceType"))} (clojure.core/contains? input "InitialVariantWeight") (clojure.core/assoc :initial-variant-weight (deser-variant-weight (input "InitialVariantWeight"))) (clojure.core/contains? input "AcceleratorType") (clojure.core/assoc :accelerator-type (deser-production-variant-accelerator-type (input "AcceleratorType")))))

(clojure.core/defn- deser-container-definition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-container-definition coll))) input))

(clojure.core/defn- deser-model-package-status-item-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-model-package-status-item coll))) input))

(clojure.core/defn- deser-security-group-id [input] input)

(clojure.core/defn- deser-algorithm-status-item-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-algorithm-status-item coll))) input))

(clojure.core/defn- deser-notebook-instance-lifecycle-hook [input] (clojure.core/cond-> {} (clojure.core/contains? input "Content") (clojure.core/assoc :content (deser-notebook-instance-lifecycle-config-content (input "Content")))))

(clojure.core/defn- deser-algorithm-status [input] (clojure.core/get {"Pending" :pending, "InProgress" :in-progress, "Completed" :completed, "Failed" :failed, "Deleting" :deleting} input))

(clojure.core/defn- deser-channel-specification [input] (clojure.core/cond-> {:name (deser-channel-name (input "Name")), :supported-content-types (deser-content-types (input "SupportedContentTypes")), :supported-input-modes (deser-input-modes (input "SupportedInputModes"))} (clojure.core/contains? input "Description") (clojure.core/assoc :description (deser-entity-description (input "Description"))) (clojure.core/contains? input "IsRequired") (clojure.core/assoc :is-required (deser-boolean (input "IsRequired"))) (clojure.core/contains? input "SupportedCompressionTypes") (clojure.core/assoc :supported-compression-types (deser-compression-types (input "SupportedCompressionTypes")))))

(clojure.core/defn- deser-failure-reason [input] input)

(clojure.core/defn- deser-cognito-client-id [input] input)

(clojure.core/defn- deser-endpoint-config-summary [input] (clojure.core/cond-> {:endpoint-config-name (deser-endpoint-config-name (input "EndpointConfigName")), :endpoint-config-arn (deser-endpoint-config-arn (input "EndpointConfigArn")), :creation-time (deser-timestamp (input "CreationTime"))}))

(clojure.core/defn- deser-compilation-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compilation-job-summary coll))) input))

(clojure.core/defn- deser-model-package-status [input] (clojure.core/get {"Pending" :pending, "InProgress" :in-progress, "Completed" :completed, "Failed" :failed, "Deleting" :deleting} input))

(clojure.core/defn- deser-transform-job-name [input] input)

(clojure.core/defn- deser-inference-specification [input] (clojure.core/cond-> {:containers (deser-model-package-container-definition-list (input "Containers")), :supported-transform-instance-types (deser-transform-instance-types (input "SupportedTransformInstanceTypes")), :supported-realtime-inference-instance-types (deser-realtime-inference-instance-types (input "SupportedRealtimeInferenceInstanceTypes")), :supported-content-types (deser-content-types (input "SupportedContentTypes")), :supported-response-mime-types (deser-response-mime-types (input "SupportedResponseMIMETypes"))}))

(clojure.core/defn- deser-transform-job-arn [input] input)

(clojure.core/defn- deser-model-package-status-details [input] (clojure.core/cond-> {:validation-statuses (deser-model-package-status-item-list (input "ValidationStatuses"))} (clojure.core/contains? input "ImageScanStatuses") (clojure.core/assoc :image-scan-statuses (deser-model-package-status-item-list (input "ImageScanStatuses")))))

(clojure.core/defn- deser-task-keyword [input] input)

(clojure.core/defn- deser-annotation-consolidation-config [input] (clojure.core/cond-> {:annotation-consolidation-lambda-arn (deser-lambda-function-arn (input "AnnotationConsolidationLambdaArn"))}))

(clojure.core/defn- deser-kms-key-id [input] input)

(clojure.core/defn- deser-algorithm-validation-profile [input] (clojure.core/cond-> {:profile-name (deser-entity-name (input "ProfileName")), :training-job-definition (deser-training-job-definition (input "TrainingJobDefinition"))} (clojure.core/contains? input "TransformJobDefinition") (clojure.core/assoc :transform-job-definition (deser-transform-job-definition (input "TransformJobDefinition")))))

(clojure.core/defn- deser-framework [input] (clojure.core/get {"TENSORFLOW" :tensorflow, "MXNET" :mxnet, "ONNX" :onnx, "PYTORCH" :pytorch, "XGBOOST" :xgboost} input))

(clojure.core/defn- deser-batch-strategy [input] (clojure.core/get {"MultiRecord" :multi-record, "SingleRecord" :single-record} input))

(clojure.core/defn- deser-source-algorithm-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-source-algorithm coll))) input))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-hyper-parameter-specifications [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hyper-parameter-specification coll))) input))

(clojure.core/defn- deser-account-id [input] input)

(clojure.core/defn- deser-dollars [input] input)

(clojure.core/defn- deser-environment-key [input] input)

(clojure.core/defn- deser-endpoint-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-endpoint-summary coll))) input))

(clojure.core/defn- deser-data-source [input] (clojure.core/cond-> {:s-3-data-source (deser-s-3-data-source (input "S3DataSource"))}))

(clojure.core/defn- deser-notebook-instance-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notebook-instance-summary coll))) input))

(clojure.core/defn- deser-source-algorithm-specification [input] (clojure.core/cond-> {:source-algorithms (deser-source-algorithm-list (input "SourceAlgorithms"))}))

(clojure.core/defn- deser-training-job-status-counters [input] (clojure.core/cond-> {} (clojure.core/contains? input "Completed") (clojure.core/assoc :completed (deser-training-job-status-counter (input "Completed"))) (clojure.core/contains? input "InProgress") (clojure.core/assoc :in-progress (deser-training-job-status-counter (input "InProgress"))) (clojure.core/contains? input "RetryableError") (clojure.core/assoc :retryable-error (deser-training-job-status-counter (input "RetryableError"))) (clojure.core/contains? input "NonRetryableError") (clojure.core/assoc :non-retryable-error (deser-training-job-status-counter (input "NonRetryableError"))) (clojure.core/contains? input "Stopped") (clojure.core/assoc :stopped (deser-training-job-status-counter (input "Stopped")))))

(clojure.core/defn- deser-assembly-type [input] (clojure.core/get {"None" :none, "Line" :line} input))

(clojure.core/defn- deser-variant-weight [input] input)

(clojure.core/defn- deser-source-algorithm [input] (clojure.core/cond-> {:algorithm-name (deser-arn-or-name (input "AlgorithmName"))} (clojure.core/contains? input "ModelDataUrl") (clojure.core/assoc :model-data-url (deser-url (input "ModelDataUrl")))))

(clojure.core/defn- deser-split-type [input] (clojure.core/get {"None" :none, "Line" :line, "RecordIO" :record-io, "TFRecord" :tf-record} input))

(clojure.core/defn- deser-parameter-range [input] (clojure.core/cond-> {} (clojure.core/contains? input "IntegerParameterRangeSpecification") (clojure.core/assoc :integer-parameter-range-specification (deser-integer-parameter-range-specification (input "IntegerParameterRangeSpecification"))) (clojure.core/contains? input "ContinuousParameterRangeSpecification") (clojure.core/assoc :continuous-parameter-range-specification (deser-continuous-parameter-range-specification (input "ContinuousParameterRangeSpecification"))) (clojure.core/contains? input "CategoricalParameterRangeSpecification") (clojure.core/assoc :categorical-parameter-range-specification (deser-categorical-parameter-range-specification (input "CategoricalParameterRangeSpecification")))))

(clojure.core/defn- deser-training-specification [input] (clojure.core/cond-> {:training-image (deser-image (input "TrainingImage")), :supported-training-instance-types (deser-training-instance-types (input "SupportedTrainingInstanceTypes")), :training-channels (deser-channel-specifications (input "TrainingChannels"))} (clojure.core/contains? input "TrainingImageDigest") (clojure.core/assoc :training-image-digest (deser-image-digest (input "TrainingImageDigest"))) (clojure.core/contains? input "SupportedHyperParameters") (clojure.core/assoc :supported-hyper-parameters (deser-hyper-parameter-specifications (input "SupportedHyperParameters"))) (clojure.core/contains? input "SupportsDistributedTraining") (clojure.core/assoc :supports-distributed-training (deser-boolean (input "SupportsDistributedTraining"))) (clojure.core/contains? input "MetricDefinitions") (clojure.core/assoc :metric-definitions (deser-metric-definition-list (input "MetricDefinitions"))) (clojure.core/contains? input "SupportedTuningJobObjectiveMetrics") (clojure.core/assoc :supported-tuning-job-objective-metrics (deser-hyper-parameter-tuning-job-objectives (input "SupportedTuningJobObjectiveMetrics")))))

(clojure.core/defn- deser-training-job-definition [input] (clojure.core/cond-> {:training-input-mode (deser-training-input-mode (input "TrainingInputMode")), :input-data-config (deser-input-data-config (input "InputDataConfig")), :output-data-config (deser-output-data-config (input "OutputDataConfig")), :resource-config (deser-resource-config (input "ResourceConfig")), :stopping-condition (deser-stopping-condition (input "StoppingCondition"))} (clojure.core/contains? input "HyperParameters") (clojure.core/assoc :hyper-parameters (deser-hyper-parameters (input "HyperParameters")))))

(clojure.core/defn- deser-target-device [input] (clojure.core/get {"rasp3b" :rasp-3b, "ml_c5" :ml-c-5, "ml_p3" :ml-p-3, "jetson_tx1" :jetson-tx-1, "ml_p2" :ml-p-2, "ml_c4" :ml-c-4, "deeplens" :deeplens, "ml_m5" :ml-m-5, "ml_m4" :ml-m-4, "jetson_tx2" :jetson-tx-2} input))

(clojure.core/defn- deser-product-listings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-hyper-parameter-tuning-job-warm-start-type [input] (clojure.core/get {"IdenticalDataAndAlgorithm" :identical-data-and-algorithm, "TransferLearning" :transfer-learning} input))

(clojure.core/defn- deser-metric-value [input] input)

(clojure.core/defn- deser-model-package-container-definition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-model-package-container-definition coll))) input))

(clojure.core/defn- deser-compilation-job-summary [input] (clojure.core/cond-> {:compilation-job-name (deser-entity-name (input "CompilationJobName")), :compilation-job-arn (deser-compilation-job-arn (input "CompilationJobArn")), :creation-time (deser-creation-time (input "CreationTime")), :compilation-target-device (deser-target-device (input "CompilationTargetDevice")), :compilation-job-status (deser-compilation-job-status (input "CompilationJobStatus"))} (clojure.core/contains? input "CompilationStartTime") (clojure.core/assoc :compilation-start-time (deser-timestamp (input "CompilationStartTime"))) (clojure.core/contains? input "CompilationEndTime") (clojure.core/assoc :compilation-end-time (deser-timestamp (input "CompilationEndTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-last-modified-time (input "LastModifiedTime")))))

(clojure.core/defn- deser-production-variant-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-production-variant-summary coll))) input))

(clojure.core/defn- deser-production-variant-summary [input] (clojure.core/cond-> {:variant-name (deser-variant-name (input "VariantName"))} (clojure.core/contains? input "DeployedImages") (clojure.core/assoc :deployed-images (deser-deployed-images (input "DeployedImages"))) (clojure.core/contains? input "CurrentWeight") (clojure.core/assoc :current-weight (deser-variant-weight (input "CurrentWeight"))) (clojure.core/contains? input "DesiredWeight") (clojure.core/assoc :desired-weight (deser-variant-weight (input "DesiredWeight"))) (clojure.core/contains? input "CurrentInstanceCount") (clojure.core/assoc :current-instance-count (deser-task-count (input "CurrentInstanceCount"))) (clojure.core/contains? input "DesiredInstanceCount") (clojure.core/assoc :desired-instance-count (deser-task-count (input "DesiredInstanceCount")))))

(clojure.core/defn- deser-creation-time [input] input)

(clojure.core/defn- deser-algorithm-status-item [input] (clojure.core/cond-> {:name (deser-entity-name (input "Name")), :status (deser-detailed-algorithm-status (input "Status"))} (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-string (input "FailureReason")))))

(clojure.core/defn- deser-hyper-parameter-training-job-summary [input] (clojure.core/cond-> {:training-job-name (deser-training-job-name (input "TrainingJobName")), :training-job-arn (deser-training-job-arn (input "TrainingJobArn")), :creation-time (deser-timestamp (input "CreationTime")), :training-job-status (deser-training-job-status (input "TrainingJobStatus")), :tuned-hyper-parameters (deser-hyper-parameters (input "TunedHyperParameters"))} (clojure.core/contains? input "TrainingEndTime") (clojure.core/assoc :training-end-time (deser-timestamp (input "TrainingEndTime"))) (clojure.core/contains? input "FinalHyperParameterTuningJobObjectiveMetric") (clojure.core/assoc :final-hyper-parameter-tuning-job-objective-metric (deser-final-hyper-parameter-tuning-job-objective-metric (input "FinalHyperParameterTuningJobObjectiveMetric"))) (clojure.core/contains? input "ObjectiveStatus") (clojure.core/assoc :objective-status (deser-objective-status (input "ObjectiveStatus"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason"))) (clojure.core/contains? input "TuningJobName") (clojure.core/assoc :tuning-job-name (deser-hyper-parameter-tuning-job-name (input "TuningJobName"))) (clojure.core/contains? input "TrainingStartTime") (clojure.core/assoc :training-start-time (deser-timestamp (input "TrainingStartTime")))))

(clojure.core/defn- deser-rendering-error-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-rendering-error coll))) input))

(clojure.core/defn- deser-metric-definition [input] (clojure.core/cond-> {:name (deser-metric-name (input "Name")), :regex (deser-metric-regex (input "Regex"))}))

(clojure.core/defn- deser-vpc-config [input] (clojure.core/cond-> {:security-group-ids (deser-vpc-security-group-ids (input "SecurityGroupIds")), :subnets (deser-subnets (input "Subnets"))}))

(clojure.core/defn- deser-notebook-instance-summary [input] (clojure.core/cond-> {:notebook-instance-name (deser-notebook-instance-name (input "NotebookInstanceName")), :notebook-instance-arn (deser-notebook-instance-arn (input "NotebookInstanceArn"))} (clojure.core/contains? input "InstanceType") (clojure.core/assoc :instance-type (deser-instance-type (input "InstanceType"))) (clojure.core/contains? input "NotebookInstanceLifecycleConfigName") (clojure.core/assoc :notebook-instance-lifecycle-config-name (deser-notebook-instance-lifecycle-config-name (input "NotebookInstanceLifecycleConfigName"))) (clojure.core/contains? input "NotebookInstanceStatus") (clojure.core/assoc :notebook-instance-status (deser-notebook-instance-status (input "NotebookInstanceStatus"))) (clojure.core/contains? input "DefaultCodeRepository") (clojure.core/assoc :default-code-repository (deser-code-repository-name-or-url (input "DefaultCodeRepository"))) (clojure.core/contains? input "Url") (clojure.core/assoc :url (deser-notebook-instance-url (input "Url"))) (clojure.core/contains? input "AdditionalCodeRepositories") (clojure.core/assoc :additional-code-repositories (deser-additional-code-repository-names-or-urls (input "AdditionalCodeRepositories"))) (clojure.core/contains? input "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (input "CreationTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-last-modified-time (input "LastModifiedTime")))))

(clojure.core/defn- deser-labeling-job-s-3-data-source [input] (clojure.core/cond-> {:manifest-s-3-uri (deser-s-3-uri (input "ManifestS3Uri"))}))

(clojure.core/defn- deser-label-counter [input] input)

(clojure.core/defn- deser-hyper-parameter-tuning-job-name [input] input)

(clojure.core/defn- deser-training-job-name [input] input)

(clojure.core/defn- deser-transform-job-status [input] (clojure.core/get {"InProgress" :in-progress, "Completed" :completed, "Failed" :failed, "Stopping" :stopping, "Stopped" :stopped} input))

(clojure.core/defn- deser-transform-output [input] (clojure.core/cond-> {:s-3-output-path (deser-s-3-uri (input "S3OutputPath"))} (clojure.core/contains? input "Accept") (clojure.core/assoc :accept (deser-accept (input "Accept"))) (clojure.core/contains? input "AssembleWith") (clojure.core/assoc :assemble-with (deser-assembly-type (input "AssembleWith"))) (clojure.core/contains? input "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (input "KmsKeyId")))))

(clojure.core/defn- deser-notebook-instance-lifecycle-config-summary-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-notebook-instance-lifecycle-config-summary coll))) input))

(clojure.core/defn- deser-hyper-parameter-training-job-definition [input] (clojure.core/cond-> {:algorithm-specification (deser-hyper-parameter-algorithm-specification (input "AlgorithmSpecification")), :role-arn (deser-role-arn (input "RoleArn")), :output-data-config (deser-output-data-config (input "OutputDataConfig")), :resource-config (deser-resource-config (input "ResourceConfig")), :stopping-condition (deser-stopping-condition (input "StoppingCondition"))} (clojure.core/contains? input "EnableNetworkIsolation") (clojure.core/assoc :enable-network-isolation (deser-boolean (input "EnableNetworkIsolation"))) (clojure.core/contains? input "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (input "InputDataConfig"))) (clojure.core/contains? input "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (input "VpcConfig"))) (clojure.core/contains? input "EnableInterContainerTrafficEncryption") (clojure.core/assoc :enable-inter-container-traffic-encryption (deser-boolean (input "EnableInterContainerTrafficEncryption"))) (clojure.core/contains? input "StaticHyperParameters") (clojure.core/assoc :static-hyper-parameters (deser-hyper-parameters (input "StaticHyperParameters")))))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-hyper-parameter-tuning-job-summary [input] (clojure.core/cond-> {:hyper-parameter-tuning-job-name (deser-hyper-parameter-tuning-job-name (input "HyperParameterTuningJobName")), :hyper-parameter-tuning-job-arn (deser-hyper-parameter-tuning-job-arn (input "HyperParameterTuningJobArn")), :hyper-parameter-tuning-job-status (deser-hyper-parameter-tuning-job-status (input "HyperParameterTuningJobStatus")), :strategy (deser-hyper-parameter-tuning-job-strategy-type (input "Strategy")), :creation-time (deser-timestamp (input "CreationTime")), :training-job-status-counters (deser-training-job-status-counters (input "TrainingJobStatusCounters")), :objective-status-counters (deser-objective-status-counters (input "ObjectiveStatusCounters"))} (clojure.core/contains? input "ResourceLimits") (clojure.core/assoc :resource-limits (deser-resource-limits (input "ResourceLimits"))) (clojure.core/contains? input "HyperParameterTuningEndTime") (clojure.core/assoc :hyper-parameter-tuning-end-time (deser-timestamp (input "HyperParameterTuningEndTime"))) (clojure.core/contains? input "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (input "LastModifiedTime")))))

(clojure.core/defn- deser-model-artifacts [input] (clojure.core/cond-> {:s-3-model-artifacts (deser-s-3-uri (input "S3ModelArtifacts"))}))

(clojure.core/defn- deser-record-wrapper [input] (clojure.core/get {"None" :none, "RecordIO" :record-io} input))

(clojure.core/defn- deser-final-metric-data-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-metric-data coll))) input))

(clojure.core/defn- deser-labeling-job-summary [input] (clojure.core/cond-> {:labeling-job-name (deser-labeling-job-name (input "LabelingJobName")), :labeling-job-arn (deser-labeling-job-arn (input "LabelingJobArn")), :creation-time (deser-timestamp (input "CreationTime")), :last-modified-time (deser-timestamp (input "LastModifiedTime")), :labeling-job-status (deser-labeling-job-status (input "LabelingJobStatus")), :label-counters (deser-label-counters (input "LabelCounters")), :workteam-arn (deser-workteam-arn (input "WorkteamArn")), :pre-human-task-lambda-arn (deser-lambda-function-arn (input "PreHumanTaskLambdaArn"))} (clojure.core/contains? input "AnnotationConsolidationLambdaArn") (clojure.core/assoc :annotation-consolidation-lambda-arn (deser-lambda-function-arn (input "AnnotationConsolidationLambdaArn"))) (clojure.core/contains? input "InputConfig") (clojure.core/assoc :input-config (deser-labeling-job-input-config (input "InputConfig"))) (clojure.core/contains? input "LabelingJobOutput") (clojure.core/assoc :labeling-job-output (deser-labeling-job-output (input "LabelingJobOutput"))) (clojure.core/contains? input "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (input "FailureReason")))))

(clojure.core/defn- deser-channel [input] (clojure.core/cond-> {:channel-name (deser-channel-name (input "ChannelName")), :data-source (deser-data-source (input "DataSource"))} (clojure.core/contains? input "ContentType") (clojure.core/assoc :content-type (deser-content-type (input "ContentType"))) (clojure.core/contains? input "CompressionType") (clojure.core/assoc :compression-type (deser-compression-type (input "CompressionType"))) (clojure.core/contains? input "RecordWrapperType") (clojure.core/assoc :record-wrapper-type (deser-record-wrapper (input "RecordWrapperType"))) (clojure.core/contains? input "InputMode") (clojure.core/assoc :input-mode (deser-training-input-mode (input "InputMode"))) (clojure.core/contains? input "ShuffleConfig") (clojure.core/assoc :shuffle-config (deser-shuffle-config (input "ShuffleConfig")))))

(clojure.core/defn- deser-hyper-parameter-tuning-job-objective [input] (clojure.core/cond-> {:type (deser-hyper-parameter-tuning-job-objective-type (input "Type")), :metric-name (deser-metric-name (input "MetricName"))}))

(clojure.core/defn- deser-labeling-job-name [input] input)

(clojure.core/defn- deser-secondary-status-transition [input] (clojure.core/cond-> {:status (deser-secondary-status (input "Status")), :start-time (deser-timestamp (input "StartTime"))} (clojure.core/contains? input "EndTime") (clojure.core/assoc :end-time (deser-timestamp (input "EndTime"))) (clojure.core/contains? input "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (input "StatusMessage")))))

(clojure.core/defn- deser-notebook-instance-volume-size-in-gb [input] input)

(clojure.core/defn- deser-deployed-images [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-deployed-image coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-max-human-labeled-object-count [input] input)

(clojure.core/defn- deser-job-reference-code [input] input)

(clojure.core/defn- deser-labeling-job-stopping-conditions [input] (clojure.core/cond-> {} (clojure.core/contains? input "MaxHumanLabeledObjectCount") (clojure.core/assoc :max-human-labeled-object-count (deser-max-human-labeled-object-count (input "MaxHumanLabeledObjectCount"))) (clojure.core/contains? input "MaxPercentageOfInputDatasetLabeled") (clojure.core/assoc :max-percentage-of-input-dataset-labeled (deser-max-percentage-of-input-dataset-labeled (input "MaxPercentageOfInputDatasetLabeled")))))

(clojure.core/defn- deser-metric-name [input] input)

(clojure.core/defn- deser-model-package-arn [input] input)

(clojure.core/defn- deser-integer-parameter-ranges [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-integer-parameter-range coll))) input))

(clojure.core/defn- deser-metric-data [input] (clojure.core/cond-> {} (clojure.core/contains? input "MetricName") (clojure.core/assoc :metric-name (deser-metric-name (input "MetricName"))) (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-float (input "Value"))) (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp")))))

(clojure.core/defn- deser-training-instance-type [input] (clojure.core/get {"ml.m5.xlarge" :mlm-5xlarge, "ml.c5.xlarge" :mlc-5xlarge, "ml.m4.2xlarge" :mlm-42xlarge, "ml.c5.9xlarge" :mlc-59xlarge, "ml.p2.16xlarge" :mlp-216xlarge, "ml.m5.large" :mlm-5large, "ml.m5.12xlarge" :mlm-512xlarge, "ml.c5.2xlarge" :mlc-52xlarge, "ml.c4.2xlarge" :mlc-42xlarge, "ml.c4.4xlarge" :mlc-44xlarge, "ml.m4.4xlarge" :mlm-44xlarge, "ml.m5.4xlarge" :mlm-54xlarge, "ml.m4.xlarge" :mlm-4xlarge, "ml.m4.16xlarge" :mlm-416xlarge, "ml.p2.8xlarge" :mlp-28xlarge, "ml.p3.16xlarge" :mlp-316xlarge, "ml.c4.8xlarge" :mlc-48xlarge, "ml.c5.18xlarge" :mlc-518xlarge, "ml.m5.2xlarge" :mlm-52xlarge, "ml.c4.xlarge" :mlc-4xlarge, "ml.m5.24xlarge" :mlm-524xlarge, "ml.p3.2xlarge" :mlp-32xlarge, "ml.p3.8xlarge" :mlp-38xlarge, "ml.p2.xlarge" :mlp-2xlarge, "ml.m4.10xlarge" :mlm-410xlarge, "ml.c5.4xlarge" :mlc-54xlarge} input))

(clojure.core/defn- deser-integer-parameter-range [input] (clojure.core/cond-> {:name (deser-parameter-key (input "Name")), :min-value (deser-parameter-value (input "MinValue")), :max-value (deser-parameter-value (input "MaxValue"))}))

(clojure.core/defn- deser-algorithm-image [input] input)

(clojure.core/defn- deser-task-time-limit-in-seconds [input] input)

(clojure.core/defn- deser-task-title [input] input)

(clojure.core/defn- deser-last-modified-time [input] input)

(clojure.core/defn- deser-training-job-early-stopping-type [input] (clojure.core/get {"Off" :off, "Auto" :auto} input))

(clojure.core/defn- deser-content-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-content-type coll))) input))

(clojure.core/defn- deser-compilation-job-status [input] (clojure.core/get {"INPROGRESS" :inprogress, "COMPLETED" :completed, "FAILED" :failed, "STARTING" :starting, "STOPPING" :stopping, "STOPPED" :stopped} input))

(clojure.core/defn- deser-algorithm-status-details [input] (clojure.core/cond-> {} (clojure.core/contains? input "ValidationStatuses") (clojure.core/assoc :validation-statuses (deser-algorithm-status-item-list (input "ValidationStatuses"))) (clojure.core/contains? input "ImageScanStatuses") (clojure.core/assoc :image-scan-statuses (deser-algorithm-status-item-list (input "ImageScanStatuses")))))

(clojure.core/defn- deser-image [input] input)

(clojure.core/defn- deser-accept [input] input)

(clojure.core/defn- deser-training-job-summaries [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-training-job-summary coll))) input))

(clojure.core/defn- deser-usd [input] (clojure.core/cond-> {} (clojure.core/contains? input "Dollars") (clojure.core/assoc :dollars (deser-dollars (input "Dollars"))) (clojure.core/contains? input "Cents") (clojure.core/assoc :cents (deser-cents (input "Cents"))) (clojure.core/contains? input "TenthFractionsOfACent") (clojure.core/assoc :tenth-fractions-of-a-cent (deser-tenth-fractions-of-a-cent (input "TenthFractionsOfACent")))))

(clojure.core/defn- deser-product-id [input] input)

(clojure.core/defn- deser-rendering-error [input] (clojure.core/cond-> {:code (deser-string (input "Code")), :message (deser-string (input "Message"))}))

(clojure.core/defn- deser-training-job-status [input] (clojure.core/get {"InProgress" :in-progress, "Completed" :completed, "Failed" :failed, "Stopping" :stopping, "Stopped" :stopped} input))

(clojure.core/defn- deser-continuous-parameter-range [input] (clojure.core/cond-> {:name (deser-parameter-key (input "Name")), :min-value (deser-parameter-value (input "MinValue")), :max-value (deser-parameter-value (input "MaxValue"))}))

(clojure.core/defn- deser-algorithm-specification [input] (clojure.core/cond-> {:training-input-mode (deser-training-input-mode (input "TrainingInputMode"))} (clojure.core/contains? input "TrainingImage") (clojure.core/assoc :training-image (deser-algorithm-image (input "TrainingImage"))) (clojure.core/contains? input "AlgorithmName") (clojure.core/assoc :algorithm-name (deser-arn-or-name (input "AlgorithmName"))) (clojure.core/contains? input "MetricDefinitions") (clojure.core/assoc :metric-definitions (deser-metric-definition-list (input "MetricDefinitions")))))

(clojure.core/defn- deser-endpoint-arn [input] input)

(clojure.core/defn- deser-float [input] input)

(clojure.core/defn- deser-production-variant-accelerator-type [input] (clojure.core/get {"ml.eia1.medium" :mleia-1medium, "ml.eia1.large" :mleia-1large, "ml.eia1.xlarge" :mleia-1xlarge} input))

(clojure.core/defn- deser-notebook-instance-name [input] input)

(clojure.core/defn- deser-labeling-job-data-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "ContentClassifiers") (clojure.core/assoc :content-classifiers (deser-content-classifiers (input "ContentClassifiers")))))

(clojure.core/defn- deser-input-modes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-training-input-mode coll))) input))

(clojure.core/defn- deser-secondary-status-transitions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-secondary-status-transition coll))) input))

(clojure.core/defn- deser-deployed-image [input] (clojure.core/cond-> {} (clojure.core/contains? input "SpecifiedImage") (clojure.core/assoc :specified-image (deser-image (input "SpecifiedImage"))) (clojure.core/contains? input "ResolvedImage") (clojure.core/assoc :resolved-image (deser-image (input "ResolvedImage"))) (clojure.core/contains? input "ResolutionTime") (clojure.core/assoc :resolution-time (deser-timestamp (input "ResolutionTime")))))

(clojure.core/defn- deser-code-repository-name-or-url [input] input)

(clojure.core/defn- deser-max-percentage-of-input-dataset-labeled [input] input)

(clojure.core/defn- deser-algorithm-arn [input] input)

(clojure.core/defn- deser-transform-instance-type [input] (clojure.core/get {"ml.m5.xlarge" :mlm-5xlarge, "ml.c5.xlarge" :mlc-5xlarge, "ml.m4.2xlarge" :mlm-42xlarge, "ml.c5.9xlarge" :mlc-59xlarge, "ml.p2.16xlarge" :mlp-216xlarge, "ml.m5.large" :mlm-5large, "ml.m5.12xlarge" :mlm-512xlarge, "ml.c5.2xlarge" :mlc-52xlarge, "ml.c4.2xlarge" :mlc-42xlarge, "ml.c4.4xlarge" :mlc-44xlarge, "ml.m4.4xlarge" :mlm-44xlarge, "ml.m5.4xlarge" :mlm-54xlarge, "ml.m4.xlarge" :mlm-4xlarge, "ml.m4.16xlarge" :mlm-416xlarge, "ml.p2.8xlarge" :mlp-28xlarge, "ml.p3.16xlarge" :mlp-316xlarge, "ml.c4.8xlarge" :mlc-48xlarge, "ml.c5.18xlarge" :mlc-518xlarge, "ml.m5.2xlarge" :mlm-52xlarge, "ml.c4.xlarge" :mlc-4xlarge, "ml.m5.24xlarge" :mlm-524xlarge, "ml.p3.2xlarge" :mlp-32xlarge, "ml.p3.8xlarge" :mlp-38xlarge, "ml.p2.xlarge" :mlp-2xlarge, "ml.m4.10xlarge" :mlm-410xlarge, "ml.c5.4xlarge" :mlc-54xlarge} input))

(clojure.core/defn- deser-labeling-job-status [input] (clojure.core/get {"InProgress" :in-progress, "Completed" :completed, "Failed" :failed, "Stopping" :stopping, "Stopped" :stopped} input))

(clojure.core/defn- deser-endpoint-config-name [input] input)

(clojure.core/defn- deser-labeling-job-algorithms-config [input] (clojure.core/cond-> {:labeling-job-algorithm-specification-arn (deser-labeling-job-algorithm-specification-arn (input "LabelingJobAlgorithmSpecificationArn"))} (clojure.core/contains? input "InitialActiveLearningModelArn") (clojure.core/assoc :initial-active-learning-model-arn (deser-model-arn (input "InitialActiveLearningModelArn"))) (clojure.core/contains? input "LabelingJobResourceConfig") (clojure.core/assoc :labeling-job-resource-config (deser-labeling-job-resource-config (input "LabelingJobResourceConfig")))))

(clojure.core/defn- deser-parameter-value [input] input)

(clojure.core/defn- deser-labeling-job-data-source [input] (clojure.core/cond-> {:s-3-data-source (deser-labeling-job-s-3-data-source (input "S3DataSource"))}))

(clojure.core/defn- deser-output-config [input] (clojure.core/cond-> {:s-3-output-location (deser-s-3-uri (input "S3OutputLocation")), :target-device (deser-target-device (input "TargetDevice"))}))

(clojure.core/defn- deser-model-arn [input] input)

(clojure.core/defn- deser-content-classifier [input] (clojure.core/get {"FreeOfPersonallyIdentifiableInformation" :free-of-personally-identifiable-information, "FreeOfAdultContent" :free-of-adult-content} input))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-create-workteam-response ([input] (response-create-workteam-response nil input)) ([resultWrapper1977159 input] (clojure.core/let [rawinput1977158 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977160 {"WorkteamArn" (rawinput1977158 "WorkteamArn")}] (clojure.core/cond-> {} (letvar1977160 "WorkteamArn") (clojure.core/assoc :workteam-arn (deser-workteam-arn (clojure.core/get-in letvar1977160 ["WorkteamArn"])))))))

(clojure.core/defn- response-create-labeling-job-response ([input] (response-create-labeling-job-response nil input)) ([resultWrapper1977162 input] (clojure.core/let [rawinput1977161 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977163 {"LabelingJobArn" (rawinput1977161 "LabelingJobArn")}] (clojure.core/cond-> {:labeling-job-arn (deser-labeling-job-arn (clojure.core/get-in letvar1977163 ["LabelingJobArn"]))}))))

(clojure.core/defn- response-list-endpoint-configs-output ([input] (response-list-endpoint-configs-output nil input)) ([resultWrapper1977165 input] (clojure.core/let [rawinput1977164 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977166 {"EndpointConfigs" (rawinput1977164 "EndpointConfigs"), "NextToken" (rawinput1977164 "NextToken")}] (clojure.core/cond-> {:endpoint-configs (deser-endpoint-config-summary-list (clojure.core/get-in letvar1977166 ["EndpointConfigs"]))} (letvar1977166 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1977166 ["NextToken"])))))))

(clojure.core/defn- response-describe-algorithm-output ([input] (response-describe-algorithm-output nil input)) ([resultWrapper1977168 input] (clojure.core/let [rawinput1977167 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977169 {"CertifyForMarketplace" (rawinput1977167 "CertifyForMarketplace"), "AlgorithmName" (rawinput1977167 "AlgorithmName"), "AlgorithmStatus" (rawinput1977167 "AlgorithmStatus"), "InferenceSpecification" (rawinput1977167 "InferenceSpecification"), "TrainingSpecification" (rawinput1977167 "TrainingSpecification"), "CreationTime" (rawinput1977167 "CreationTime"), "AlgorithmStatusDetails" (rawinput1977167 "AlgorithmStatusDetails"), "ValidationSpecification" (rawinput1977167 "ValidationSpecification"), "ProductId" (rawinput1977167 "ProductId"), "AlgorithmDescription" (rawinput1977167 "AlgorithmDescription"), "AlgorithmArn" (rawinput1977167 "AlgorithmArn")}] (clojure.core/cond-> {:algorithm-name (deser-entity-name (clojure.core/get-in letvar1977169 ["AlgorithmName"])), :algorithm-arn (deser-algorithm-arn (clojure.core/get-in letvar1977169 ["AlgorithmArn"])), :creation-time (deser-creation-time (clojure.core/get-in letvar1977169 ["CreationTime"])), :training-specification (deser-training-specification (clojure.core/get-in letvar1977169 ["TrainingSpecification"])), :algorithm-status (deser-algorithm-status (clojure.core/get-in letvar1977169 ["AlgorithmStatus"])), :algorithm-status-details (deser-algorithm-status-details (clojure.core/get-in letvar1977169 ["AlgorithmStatusDetails"]))} (letvar1977169 "CertifyForMarketplace") (clojure.core/assoc :certify-for-marketplace (deser-certify-for-marketplace (clojure.core/get-in letvar1977169 ["CertifyForMarketplace"]))) (letvar1977169 "InferenceSpecification") (clojure.core/assoc :inference-specification (deser-inference-specification (clojure.core/get-in letvar1977169 ["InferenceSpecification"]))) (letvar1977169 "ValidationSpecification") (clojure.core/assoc :validation-specification (deser-algorithm-validation-specification (clojure.core/get-in letvar1977169 ["ValidationSpecification"]))) (letvar1977169 "ProductId") (clojure.core/assoc :product-id (deser-product-id (clojure.core/get-in letvar1977169 ["ProductId"]))) (letvar1977169 "AlgorithmDescription") (clojure.core/assoc :algorithm-description (deser-entity-description (clojure.core/get-in letvar1977169 ["AlgorithmDescription"])))))))

(clojure.core/defn- response-create-notebook-instance-lifecycle-config-output ([input] (response-create-notebook-instance-lifecycle-config-output nil input)) ([resultWrapper1977171 input] (clojure.core/let [rawinput1977170 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977172 {"NotebookInstanceLifecycleConfigArn" (rawinput1977170 "NotebookInstanceLifecycleConfigArn")}] (clojure.core/cond-> {} (letvar1977172 "NotebookInstanceLifecycleConfigArn") (clojure.core/assoc :notebook-instance-lifecycle-config-arn (deser-notebook-instance-lifecycle-config-arn (clojure.core/get-in letvar1977172 ["NotebookInstanceLifecycleConfigArn"])))))))

(clojure.core/defn- response-list-transform-jobs-response ([input] (response-list-transform-jobs-response nil input)) ([resultWrapper1977174 input] (clojure.core/let [rawinput1977173 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977175 {"TransformJobSummaries" (rawinput1977173 "TransformJobSummaries"), "NextToken" (rawinput1977173 "NextToken")}] (clojure.core/cond-> {:transform-job-summaries (deser-transform-job-summaries (clojure.core/get-in letvar1977175 ["TransformJobSummaries"]))} (letvar1977175 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977175 ["NextToken"])))))))

(clojure.core/defn- response-list-models-output ([input] (response-list-models-output nil input)) ([resultWrapper1977177 input] (clojure.core/let [rawinput1977176 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977178 {"Models" (rawinput1977176 "Models"), "NextToken" (rawinput1977176 "NextToken")}] (clojure.core/cond-> {:models (deser-model-summary-list (clojure.core/get-in letvar1977178 ["Models"]))} (letvar1977178 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1977178 ["NextToken"])))))))

(clojure.core/defn- response-create-presigned-notebook-instance-url-output ([input] (response-create-presigned-notebook-instance-url-output nil input)) ([resultWrapper1977180 input] (clojure.core/let [rawinput1977179 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977181 {"AuthorizedUrl" (rawinput1977179 "AuthorizedUrl")}] (clojure.core/cond-> {} (letvar1977181 "AuthorizedUrl") (clojure.core/assoc :authorized-url (deser-notebook-instance-url (clojure.core/get-in letvar1977181 ["AuthorizedUrl"])))))))

(clojure.core/defn- response-list-code-repositories-output ([input] (response-list-code-repositories-output nil input)) ([resultWrapper1977183 input] (clojure.core/let [rawinput1977182 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977184 {"CodeRepositorySummaryList" (rawinput1977182 "CodeRepositorySummaryList"), "NextToken" (rawinput1977182 "NextToken")}] (clojure.core/cond-> {:code-repository-summary-list (deser-code-repository-summary-list (clojure.core/get-in letvar1977184 ["CodeRepositorySummaryList"]))} (letvar1977184 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977184 ["NextToken"])))))))

(clojure.core/defn- response-describe-hyper-parameter-tuning-job-response ([input] (response-describe-hyper-parameter-tuning-job-response nil input)) ([resultWrapper1977186 input] (clojure.core/let [rawinput1977185 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977187 {"HyperParameterTuningJobStatus" (rawinput1977185 "HyperParameterTuningJobStatus"), "HyperParameterTuningJobConfig" (rawinput1977185 "HyperParameterTuningJobConfig"), "ObjectiveStatusCounters" (rawinput1977185 "ObjectiveStatusCounters"), "HyperParameterTuningEndTime" (rawinput1977185 "HyperParameterTuningEndTime"), "HyperParameterTuningJobArn" (rawinput1977185 "HyperParameterTuningJobArn"), "WarmStartConfig" (rawinput1977185 "WarmStartConfig"), "BestTrainingJob" (rawinput1977185 "BestTrainingJob"), "FailureReason" (rawinput1977185 "FailureReason"), "TrainingJobStatusCounters" (rawinput1977185 "TrainingJobStatusCounters"), "TrainingJobDefinition" (rawinput1977185 "TrainingJobDefinition"), "CreationTime" (rawinput1977185 "CreationTime"), "HyperParameterTuningJobName" (rawinput1977185 "HyperParameterTuningJobName"), "LastModifiedTime" (rawinput1977185 "LastModifiedTime"), "OverallBestTrainingJob" (rawinput1977185 "OverallBestTrainingJob")}] (clojure.core/cond-> {:hyper-parameter-tuning-job-name (deser-hyper-parameter-tuning-job-name (clojure.core/get-in letvar1977187 ["HyperParameterTuningJobName"])), :hyper-parameter-tuning-job-arn (deser-hyper-parameter-tuning-job-arn (clojure.core/get-in letvar1977187 ["HyperParameterTuningJobArn"])), :hyper-parameter-tuning-job-config (deser-hyper-parameter-tuning-job-config (clojure.core/get-in letvar1977187 ["HyperParameterTuningJobConfig"])), :training-job-definition (deser-hyper-parameter-training-job-definition (clojure.core/get-in letvar1977187 ["TrainingJobDefinition"])), :hyper-parameter-tuning-job-status (deser-hyper-parameter-tuning-job-status (clojure.core/get-in letvar1977187 ["HyperParameterTuningJobStatus"])), :creation-time (deser-timestamp (clojure.core/get-in letvar1977187 ["CreationTime"])), :training-job-status-counters (deser-training-job-status-counters (clojure.core/get-in letvar1977187 ["TrainingJobStatusCounters"])), :objective-status-counters (deser-objective-status-counters (clojure.core/get-in letvar1977187 ["ObjectiveStatusCounters"]))} (letvar1977187 "HyperParameterTuningEndTime") (clojure.core/assoc :hyper-parameter-tuning-end-time (deser-timestamp (clojure.core/get-in letvar1977187 ["HyperParameterTuningEndTime"]))) (letvar1977187 "WarmStartConfig") (clojure.core/assoc :warm-start-config (deser-hyper-parameter-tuning-job-warm-start-config (clojure.core/get-in letvar1977187 ["WarmStartConfig"]))) (letvar1977187 "BestTrainingJob") (clojure.core/assoc :best-training-job (deser-hyper-parameter-training-job-summary (clojure.core/get-in letvar1977187 ["BestTrainingJob"]))) (letvar1977187 "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (clojure.core/get-in letvar1977187 ["FailureReason"]))) (letvar1977187 "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (clojure.core/get-in letvar1977187 ["LastModifiedTime"]))) (letvar1977187 "OverallBestTrainingJob") (clojure.core/assoc :overall-best-training-job (deser-hyper-parameter-training-job-summary (clojure.core/get-in letvar1977187 ["OverallBestTrainingJob"])))))))

(clojure.core/defn- response-create-hyper-parameter-tuning-job-response ([input] (response-create-hyper-parameter-tuning-job-response nil input)) ([resultWrapper1977189 input] (clojure.core/let [rawinput1977188 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977190 {"HyperParameterTuningJobArn" (rawinput1977188 "HyperParameterTuningJobArn")}] (clojure.core/cond-> {:hyper-parameter-tuning-job-arn (deser-hyper-parameter-tuning-job-arn (clojure.core/get-in letvar1977190 ["HyperParameterTuningJobArn"]))}))))

(clojure.core/defn- response-describe-transform-job-response ([input] (response-describe-transform-job-response nil input)) ([resultWrapper1977192 input] (clojure.core/let [rawinput1977191 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977193 {"LabelingJobArn" (rawinput1977191 "LabelingJobArn"), "TransformEndTime" (rawinput1977191 "TransformEndTime"), "ModelName" (rawinput1977191 "ModelName"), "MaxPayloadInMB" (rawinput1977191 "MaxPayloadInMB"), "TransformResources" (rawinput1977191 "TransformResources"), "MaxConcurrentTransforms" (rawinput1977191 "MaxConcurrentTransforms"), "TransformInput" (rawinput1977191 "TransformInput"), "TransformStartTime" (rawinput1977191 "TransformStartTime"), "FailureReason" (rawinput1977191 "FailureReason"), "TransformJobName" (rawinput1977191 "TransformJobName"), "TransformJobArn" (rawinput1977191 "TransformJobArn"), "BatchStrategy" (rawinput1977191 "BatchStrategy"), "Environment" (rawinput1977191 "Environment"), "CreationTime" (rawinput1977191 "CreationTime"), "TransformJobStatus" (rawinput1977191 "TransformJobStatus"), "TransformOutput" (rawinput1977191 "TransformOutput")}] (clojure.core/cond-> {:transform-job-name (deser-transform-job-name (clojure.core/get-in letvar1977193 ["TransformJobName"])), :transform-job-arn (deser-transform-job-arn (clojure.core/get-in letvar1977193 ["TransformJobArn"])), :transform-job-status (deser-transform-job-status (clojure.core/get-in letvar1977193 ["TransformJobStatus"])), :model-name (deser-model-name (clojure.core/get-in letvar1977193 ["ModelName"])), :transform-input (deser-transform-input (clojure.core/get-in letvar1977193 ["TransformInput"])), :transform-resources (deser-transform-resources (clojure.core/get-in letvar1977193 ["TransformResources"])), :creation-time (deser-timestamp (clojure.core/get-in letvar1977193 ["CreationTime"]))} (letvar1977193 "LabelingJobArn") (clojure.core/assoc :labeling-job-arn (deser-labeling-job-arn (clojure.core/get-in letvar1977193 ["LabelingJobArn"]))) (letvar1977193 "TransformEndTime") (clojure.core/assoc :transform-end-time (deser-timestamp (clojure.core/get-in letvar1977193 ["TransformEndTime"]))) (letvar1977193 "MaxPayloadInMB") (clojure.core/assoc :max-payload-in-mb (deser-max-payload-in-mb (clojure.core/get-in letvar1977193 ["MaxPayloadInMB"]))) (letvar1977193 "MaxConcurrentTransforms") (clojure.core/assoc :max-concurrent-transforms (deser-max-concurrent-transforms (clojure.core/get-in letvar1977193 ["MaxConcurrentTransforms"]))) (letvar1977193 "TransformStartTime") (clojure.core/assoc :transform-start-time (deser-timestamp (clojure.core/get-in letvar1977193 ["TransformStartTime"]))) (letvar1977193 "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (clojure.core/get-in letvar1977193 ["FailureReason"]))) (letvar1977193 "BatchStrategy") (clojure.core/assoc :batch-strategy (deser-batch-strategy (clojure.core/get-in letvar1977193 ["BatchStrategy"]))) (letvar1977193 "Environment") (clojure.core/assoc :environment (deser-transform-environment-map (clojure.core/get-in letvar1977193 ["Environment"]))) (letvar1977193 "TransformOutput") (clojure.core/assoc :transform-output (deser-transform-output (clojure.core/get-in letvar1977193 ["TransformOutput"])))))))

(clojure.core/defn- response-delete-workteam-response ([input] (response-delete-workteam-response nil input)) ([resultWrapper1977195 input] (clojure.core/let [rawinput1977194 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977196 {"Success" (rawinput1977194 "Success")}] (clojure.core/cond-> {:success (deser-success (clojure.core/get-in letvar1977196 ["Success"]))}))))

(clojure.core/defn- response-update-code-repository-output ([input] (response-update-code-repository-output nil input)) ([resultWrapper1977198 input] (clojure.core/let [rawinput1977197 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977199 {"CodeRepositoryArn" (rawinput1977197 "CodeRepositoryArn")}] (clojure.core/cond-> {:code-repository-arn (deser-code-repository-arn (clojure.core/get-in letvar1977199 ["CodeRepositoryArn"]))}))))

(clojure.core/defn- response-delete-tags-output ([input] (response-delete-tags-output nil input)) ([resultWrapper1977201 input] (clojure.core/let [rawinput1977200 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977202 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-labeling-jobs-for-workteam-response ([input] (response-list-labeling-jobs-for-workteam-response nil input)) ([resultWrapper1977204 input] (clojure.core/let [rawinput1977203 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977205 {"LabelingJobSummaryList" (rawinput1977203 "LabelingJobSummaryList"), "NextToken" (rawinput1977203 "NextToken")}] (clojure.core/cond-> {:labeling-job-summary-list (deser-labeling-job-for-workteam-summary-list (clojure.core/get-in letvar1977205 ["LabelingJobSummaryList"]))} (letvar1977205 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977205 ["NextToken"])))))))

(clojure.core/defn- response-describe-code-repository-output ([input] (response-describe-code-repository-output nil input)) ([resultWrapper1977207 input] (clojure.core/let [rawinput1977206 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977208 {"CodeRepositoryName" (rawinput1977206 "CodeRepositoryName"), "CodeRepositoryArn" (rawinput1977206 "CodeRepositoryArn"), "CreationTime" (rawinput1977206 "CreationTime"), "LastModifiedTime" (rawinput1977206 "LastModifiedTime"), "GitConfig" (rawinput1977206 "GitConfig")}] (clojure.core/cond-> {:code-repository-name (deser-entity-name (clojure.core/get-in letvar1977208 ["CodeRepositoryName"])), :code-repository-arn (deser-code-repository-arn (clojure.core/get-in letvar1977208 ["CodeRepositoryArn"])), :creation-time (deser-creation-time (clojure.core/get-in letvar1977208 ["CreationTime"])), :last-modified-time (deser-last-modified-time (clojure.core/get-in letvar1977208 ["LastModifiedTime"]))} (letvar1977208 "GitConfig") (clojure.core/assoc :git-config (deser-git-config (clojure.core/get-in letvar1977208 ["GitConfig"])))))))

(clojure.core/defn- response-describe-compilation-job-response ([input] (response-describe-compilation-job-response nil input)) ([resultWrapper1977210 input] (clojure.core/let [rawinput1977209 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977211 {"InputConfig" (rawinput1977209 "InputConfig"), "RoleArn" (rawinput1977209 "RoleArn"), "StoppingCondition" (rawinput1977209 "StoppingCondition"), "CompilationJobArn" (rawinput1977209 "CompilationJobArn"), "CompilationEndTime" (rawinput1977209 "CompilationEndTime"), "FailureReason" (rawinput1977209 "FailureReason"), "CreationTime" (rawinput1977209 "CreationTime"), "CompilationJobName" (rawinput1977209 "CompilationJobName"), "ModelArtifacts" (rawinput1977209 "ModelArtifacts"), "LastModifiedTime" (rawinput1977209 "LastModifiedTime"), "CompilationJobStatus" (rawinput1977209 "CompilationJobStatus"), "OutputConfig" (rawinput1977209 "OutputConfig"), "CompilationStartTime" (rawinput1977209 "CompilationStartTime")}] (clojure.core/cond-> {:compilation-job-name (deser-entity-name (clojure.core/get-in letvar1977211 ["CompilationJobName"])), :stopping-condition (deser-stopping-condition (clojure.core/get-in letvar1977211 ["StoppingCondition"])), :output-config (deser-output-config (clojure.core/get-in letvar1977211 ["OutputConfig"])), :compilation-job-status (deser-compilation-job-status (clojure.core/get-in letvar1977211 ["CompilationJobStatus"])), :model-artifacts (deser-model-artifacts (clojure.core/get-in letvar1977211 ["ModelArtifacts"])), :failure-reason (deser-failure-reason (clojure.core/get-in letvar1977211 ["FailureReason"])), :role-arn (deser-role-arn (clojure.core/get-in letvar1977211 ["RoleArn"])), :input-config (deser-input-config (clojure.core/get-in letvar1977211 ["InputConfig"])), :compilation-job-arn (deser-compilation-job-arn (clojure.core/get-in letvar1977211 ["CompilationJobArn"])), :last-modified-time (deser-last-modified-time (clojure.core/get-in letvar1977211 ["LastModifiedTime"])), :creation-time (deser-creation-time (clojure.core/get-in letvar1977211 ["CreationTime"]))} (letvar1977211 "CompilationEndTime") (clojure.core/assoc :compilation-end-time (deser-timestamp (clojure.core/get-in letvar1977211 ["CompilationEndTime"]))) (letvar1977211 "CompilationStartTime") (clojure.core/assoc :compilation-start-time (deser-timestamp (clojure.core/get-in letvar1977211 ["CompilationStartTime"])))))))

(clojure.core/defn- response-describe-model-output ([input] (response-describe-model-output nil input)) ([resultWrapper1977213 input] (clojure.core/let [rawinput1977212 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977214 {"ModelName" (rawinput1977212 "ModelName"), "PrimaryContainer" (rawinput1977212 "PrimaryContainer"), "Containers" (rawinput1977212 "Containers"), "ExecutionRoleArn" (rawinput1977212 "ExecutionRoleArn"), "VpcConfig" (rawinput1977212 "VpcConfig"), "CreationTime" (rawinput1977212 "CreationTime"), "ModelArn" (rawinput1977212 "ModelArn"), "EnableNetworkIsolation" (rawinput1977212 "EnableNetworkIsolation")}] (clojure.core/cond-> {:model-name (deser-model-name (clojure.core/get-in letvar1977214 ["ModelName"])), :execution-role-arn (deser-role-arn (clojure.core/get-in letvar1977214 ["ExecutionRoleArn"])), :creation-time (deser-timestamp (clojure.core/get-in letvar1977214 ["CreationTime"])), :model-arn (deser-model-arn (clojure.core/get-in letvar1977214 ["ModelArn"]))} (letvar1977214 "PrimaryContainer") (clojure.core/assoc :primary-container (deser-container-definition (clojure.core/get-in letvar1977214 ["PrimaryContainer"]))) (letvar1977214 "Containers") (clojure.core/assoc :containers (deser-container-definition-list (clojure.core/get-in letvar1977214 ["Containers"]))) (letvar1977214 "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (clojure.core/get-in letvar1977214 ["VpcConfig"]))) (letvar1977214 "EnableNetworkIsolation") (clojure.core/assoc :enable-network-isolation (deser-boolean (clojure.core/get-in letvar1977214 ["EnableNetworkIsolation"])))))))

(clojure.core/defn- response-add-tags-output ([input] (response-add-tags-output nil input)) ([resultWrapper1977216 input] (clojure.core/let [rawinput1977215 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977217 {"Tags" (rawinput1977215 "Tags")}] (clojure.core/cond-> {} (letvar1977217 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1977217 ["Tags"])))))))

(clojure.core/defn- response-list-model-packages-output ([input] (response-list-model-packages-output nil input)) ([resultWrapper1977219 input] (clojure.core/let [rawinput1977218 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977220 {"ModelPackageSummaryList" (rawinput1977218 "ModelPackageSummaryList"), "NextToken" (rawinput1977218 "NextToken")}] (clojure.core/cond-> {:model-package-summary-list (deser-model-package-summary-list (clojure.core/get-in letvar1977220 ["ModelPackageSummaryList"]))} (letvar1977220 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977220 ["NextToken"])))))))

(clojure.core/defn- response-list-subscribed-workteams-response ([input] (response-list-subscribed-workteams-response nil input)) ([resultWrapper1977222 input] (clojure.core/let [rawinput1977221 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977223 {"SubscribedWorkteams" (rawinput1977221 "SubscribedWorkteams"), "NextToken" (rawinput1977221 "NextToken")}] (clojure.core/cond-> {:subscribed-workteams (deser-subscribed-workteams (clojure.core/get-in letvar1977223 ["SubscribedWorkteams"]))} (letvar1977223 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977223 ["NextToken"])))))))

(clojure.core/defn- response-list-workteams-response ([input] (response-list-workteams-response nil input)) ([resultWrapper1977225 input] (clojure.core/let [rawinput1977224 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977226 {"Workteams" (rawinput1977224 "Workteams"), "NextToken" (rawinput1977224 "NextToken")}] (clojure.core/cond-> {:workteams (deser-workteams (clojure.core/get-in letvar1977226 ["Workteams"]))} (letvar1977226 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977226 ["NextToken"])))))))

(clojure.core/defn- response-create-model-output ([input] (response-create-model-output nil input)) ([resultWrapper1977228 input] (clojure.core/let [rawinput1977227 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977229 {"ModelArn" (rawinput1977227 "ModelArn")}] (clojure.core/cond-> {:model-arn (deser-model-arn (clojure.core/get-in letvar1977229 ["ModelArn"]))}))))

(clojure.core/defn- response-list-notebook-instances-output ([input] (response-list-notebook-instances-output nil input)) ([resultWrapper1977231 input] (clojure.core/let [rawinput1977230 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977232 {"NextToken" (rawinput1977230 "NextToken"), "NotebookInstances" (rawinput1977230 "NotebookInstances")}] (clojure.core/cond-> {} (letvar1977232 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977232 ["NextToken"]))) (letvar1977232 "NotebookInstances") (clojure.core/assoc :notebook-instances (deser-notebook-instance-summary-list (clojure.core/get-in letvar1977232 ["NotebookInstances"])))))))

(clojure.core/defn- response-describe-workteam-response ([input] (response-describe-workteam-response nil input)) ([resultWrapper1977234 input] (clojure.core/let [rawinput1977233 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977235 {"Workteam" (rawinput1977233 "Workteam")}] (clojure.core/cond-> {:workteam (deser-workteam (clojure.core/get-in letvar1977235 ["Workteam"]))}))))

(clojure.core/defn- response-list-labeling-jobs-response ([input] (response-list-labeling-jobs-response nil input)) ([resultWrapper1977237 input] (clojure.core/let [rawinput1977236 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977238 {"LabelingJobSummaryList" (rawinput1977236 "LabelingJobSummaryList"), "NextToken" (rawinput1977236 "NextToken")}] (clojure.core/cond-> {} (letvar1977238 "LabelingJobSummaryList") (clojure.core/assoc :labeling-job-summary-list (deser-labeling-job-summary-list (clojure.core/get-in letvar1977238 ["LabelingJobSummaryList"]))) (letvar1977238 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977238 ["NextToken"])))))))

(clojure.core/defn- response-describe-notebook-instance-output ([input] (response-describe-notebook-instance-output nil input)) ([resultWrapper1977240 input] (clojure.core/let [rawinput1977239 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977241 {"VolumeSizeInGB" (rawinput1977239 "VolumeSizeInGB"), "NotebookInstanceArn" (rawinput1977239 "NotebookInstanceArn"), "SubnetId" (rawinput1977239 "SubnetId"), "SecurityGroups" (rawinput1977239 "SecurityGroups"), "InstanceType" (rawinput1977239 "InstanceType"), "RoleArn" (rawinput1977239 "RoleArn"), "AcceleratorTypes" (rawinput1977239 "AcceleratorTypes"), "NetworkInterfaceId" (rawinput1977239 "NetworkInterfaceId"), "NotebookInstanceLifecycleConfigName" (rawinput1977239 "NotebookInstanceLifecycleConfigName"), "NotebookInstanceStatus" (rawinput1977239 "NotebookInstanceStatus"), "DefaultCodeRepository" (rawinput1977239 "DefaultCodeRepository"), "DirectInternetAccess" (rawinput1977239 "DirectInternetAccess"), "Url" (rawinput1977239 "Url"), "AdditionalCodeRepositories" (rawinput1977239 "AdditionalCodeRepositories"), "FailureReason" (rawinput1977239 "FailureReason"), "KmsKeyId" (rawinput1977239 "KmsKeyId"), "CreationTime" (rawinput1977239 "CreationTime"), "LastModifiedTime" (rawinput1977239 "LastModifiedTime"), "NotebookInstanceName" (rawinput1977239 "NotebookInstanceName")}] (clojure.core/cond-> {} (letvar1977241 "VolumeSizeInGB") (clojure.core/assoc :volume-size-in-gb (deser-notebook-instance-volume-size-in-gb (clojure.core/get-in letvar1977241 ["VolumeSizeInGB"]))) (letvar1977241 "NotebookInstanceArn") (clojure.core/assoc :notebook-instance-arn (deser-notebook-instance-arn (clojure.core/get-in letvar1977241 ["NotebookInstanceArn"]))) (letvar1977241 "SubnetId") (clojure.core/assoc :subnet-id (deser-subnet-id (clojure.core/get-in letvar1977241 ["SubnetId"]))) (letvar1977241 "SecurityGroups") (clojure.core/assoc :security-groups (deser-security-group-ids (clojure.core/get-in letvar1977241 ["SecurityGroups"]))) (letvar1977241 "InstanceType") (clojure.core/assoc :instance-type (deser-instance-type (clojure.core/get-in letvar1977241 ["InstanceType"]))) (letvar1977241 "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (clojure.core/get-in letvar1977241 ["RoleArn"]))) (letvar1977241 "AcceleratorTypes") (clojure.core/assoc :accelerator-types (deser-notebook-instance-accelerator-types (clojure.core/get-in letvar1977241 ["AcceleratorTypes"]))) (letvar1977241 "NetworkInterfaceId") (clojure.core/assoc :network-interface-id (deser-network-interface-id (clojure.core/get-in letvar1977241 ["NetworkInterfaceId"]))) (letvar1977241 "NotebookInstanceLifecycleConfigName") (clojure.core/assoc :notebook-instance-lifecycle-config-name (deser-notebook-instance-lifecycle-config-name (clojure.core/get-in letvar1977241 ["NotebookInstanceLifecycleConfigName"]))) (letvar1977241 "NotebookInstanceStatus") (clojure.core/assoc :notebook-instance-status (deser-notebook-instance-status (clojure.core/get-in letvar1977241 ["NotebookInstanceStatus"]))) (letvar1977241 "DefaultCodeRepository") (clojure.core/assoc :default-code-repository (deser-code-repository-name-or-url (clojure.core/get-in letvar1977241 ["DefaultCodeRepository"]))) (letvar1977241 "DirectInternetAccess") (clojure.core/assoc :direct-internet-access (deser-direct-internet-access (clojure.core/get-in letvar1977241 ["DirectInternetAccess"]))) (letvar1977241 "Url") (clojure.core/assoc :url (deser-notebook-instance-url (clojure.core/get-in letvar1977241 ["Url"]))) (letvar1977241 "AdditionalCodeRepositories") (clojure.core/assoc :additional-code-repositories (deser-additional-code-repository-names-or-urls (clojure.core/get-in letvar1977241 ["AdditionalCodeRepositories"]))) (letvar1977241 "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (clojure.core/get-in letvar1977241 ["FailureReason"]))) (letvar1977241 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (clojure.core/get-in letvar1977241 ["KmsKeyId"]))) (letvar1977241 "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (clojure.core/get-in letvar1977241 ["CreationTime"]))) (letvar1977241 "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-last-modified-time (clojure.core/get-in letvar1977241 ["LastModifiedTime"]))) (letvar1977241 "NotebookInstanceName") (clojure.core/assoc :notebook-instance-name (deser-notebook-instance-name (clojure.core/get-in letvar1977241 ["NotebookInstanceName"])))))))

(clojure.core/defn- response-list-training-jobs-for-hyper-parameter-tuning-job-response ([input] (response-list-training-jobs-for-hyper-parameter-tuning-job-response nil input)) ([resultWrapper1977243 input] (clojure.core/let [rawinput1977242 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977244 {"TrainingJobSummaries" (rawinput1977242 "TrainingJobSummaries"), "NextToken" (rawinput1977242 "NextToken")}] (clojure.core/cond-> {:training-job-summaries (deser-hyper-parameter-training-job-summaries (clojure.core/get-in letvar1977244 ["TrainingJobSummaries"]))} (letvar1977244 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977244 ["NextToken"])))))))

(clojure.core/defn- response-get-search-suggestions-response ([input] (response-get-search-suggestions-response nil input)) ([resultWrapper1977246 input] (clojure.core/let [rawinput1977245 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977247 {"PropertyNameSuggestions" (rawinput1977245 "PropertyNameSuggestions")}] (clojure.core/cond-> {} (letvar1977247 "PropertyNameSuggestions") (clojure.core/assoc :property-name-suggestions (deser-property-name-suggestion-list (clojure.core/get-in letvar1977247 ["PropertyNameSuggestions"])))))))

(clojure.core/defn- response-list-training-jobs-response ([input] (response-list-training-jobs-response nil input)) ([resultWrapper1977249 input] (clojure.core/let [rawinput1977248 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977250 {"TrainingJobSummaries" (rawinput1977248 "TrainingJobSummaries"), "NextToken" (rawinput1977248 "NextToken")}] (clojure.core/cond-> {:training-job-summaries (deser-training-job-summaries (clojure.core/get-in letvar1977250 ["TrainingJobSummaries"]))} (letvar1977250 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977250 ["NextToken"])))))))

(clojure.core/defn- response-describe-labeling-job-response ([input] (response-describe-labeling-job-response nil input)) ([resultWrapper1977252 input] (clojure.core/let [rawinput1977251 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977253 {"LabelingJobArn" (rawinput1977251 "LabelingJobArn"), "LabelCounters" (rawinput1977251 "LabelCounters"), "InputConfig" (rawinput1977251 "InputConfig"), "LabelingJobOutput" (rawinput1977251 "LabelingJobOutput"), "RoleArn" (rawinput1977251 "RoleArn"), "Tags" (rawinput1977251 "Tags"), "HumanTaskConfig" (rawinput1977251 "HumanTaskConfig"), "LabelAttributeName" (rawinput1977251 "LabelAttributeName"), "FailureReason" (rawinput1977251 "FailureReason"), "CreationTime" (rawinput1977251 "CreationTime"), "StoppingConditions" (rawinput1977251 "StoppingConditions"), "LabelingJobName" (rawinput1977251 "LabelingJobName"), "LabelCategoryConfigS3Uri" (rawinput1977251 "LabelCategoryConfigS3Uri"), "JobReferenceCode" (rawinput1977251 "JobReferenceCode"), "LastModifiedTime" (rawinput1977251 "LastModifiedTime"), "LabelingJobStatus" (rawinput1977251 "LabelingJobStatus"), "LabelingJobAlgorithmsConfig" (rawinput1977251 "LabelingJobAlgorithmsConfig"), "OutputConfig" (rawinput1977251 "OutputConfig")}] (clojure.core/cond-> {:labeling-job-name (deser-labeling-job-name (clojure.core/get-in letvar1977253 ["LabelingJobName"])), :output-config (deser-labeling-job-output-config (clojure.core/get-in letvar1977253 ["OutputConfig"])), :human-task-config (deser-human-task-config (clojure.core/get-in letvar1977253 ["HumanTaskConfig"])), :labeling-job-arn (deser-labeling-job-arn (clojure.core/get-in letvar1977253 ["LabelingJobArn"])), :labeling-job-status (deser-labeling-job-status (clojure.core/get-in letvar1977253 ["LabelingJobStatus"])), :role-arn (deser-role-arn (clojure.core/get-in letvar1977253 ["RoleArn"])), :job-reference-code (deser-job-reference-code (clojure.core/get-in letvar1977253 ["JobReferenceCode"])), :input-config (deser-labeling-job-input-config (clojure.core/get-in letvar1977253 ["InputConfig"])), :last-modified-time (deser-timestamp (clojure.core/get-in letvar1977253 ["LastModifiedTime"])), :creation-time (deser-timestamp (clojure.core/get-in letvar1977253 ["CreationTime"])), :label-counters (deser-label-counters (clojure.core/get-in letvar1977253 ["LabelCounters"]))} (letvar1977253 "LabelingJobOutput") (clojure.core/assoc :labeling-job-output (deser-labeling-job-output (clojure.core/get-in letvar1977253 ["LabelingJobOutput"]))) (letvar1977253 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1977253 ["Tags"]))) (letvar1977253 "LabelAttributeName") (clojure.core/assoc :label-attribute-name (deser-label-attribute-name (clojure.core/get-in letvar1977253 ["LabelAttributeName"]))) (letvar1977253 "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (clojure.core/get-in letvar1977253 ["FailureReason"]))) (letvar1977253 "StoppingConditions") (clojure.core/assoc :stopping-conditions (deser-labeling-job-stopping-conditions (clojure.core/get-in letvar1977253 ["StoppingConditions"]))) (letvar1977253 "LabelCategoryConfigS3Uri") (clojure.core/assoc :label-category-config-s-3-uri (deser-s-3-uri (clojure.core/get-in letvar1977253 ["LabelCategoryConfigS3Uri"]))) (letvar1977253 "LabelingJobAlgorithmsConfig") (clojure.core/assoc :labeling-job-algorithms-config (deser-labeling-job-algorithms-config (clojure.core/get-in letvar1977253 ["LabelingJobAlgorithmsConfig"])))))))

(clojure.core/defn- response-update-endpoint-weights-and-capacities-output ([input] (response-update-endpoint-weights-and-capacities-output nil input)) ([resultWrapper1977255 input] (clojure.core/let [rawinput1977254 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977256 {"EndpointArn" (rawinput1977254 "EndpointArn")}] (clojure.core/cond-> {:endpoint-arn (deser-endpoint-arn (clojure.core/get-in letvar1977256 ["EndpointArn"]))}))))

(clojure.core/defn- response-create-transform-job-response ([input] (response-create-transform-job-response nil input)) ([resultWrapper1977258 input] (clojure.core/let [rawinput1977257 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977259 {"TransformJobArn" (rawinput1977257 "TransformJobArn")}] (clojure.core/cond-> {:transform-job-arn (deser-transform-job-arn (clojure.core/get-in letvar1977259 ["TransformJobArn"]))}))))

(clojure.core/defn- response-describe-endpoint-config-output ([input] (response-describe-endpoint-config-output nil input)) ([resultWrapper1977261 input] (clojure.core/let [rawinput1977260 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977262 {"EndpointConfigName" (rawinput1977260 "EndpointConfigName"), "EndpointConfigArn" (rawinput1977260 "EndpointConfigArn"), "ProductionVariants" (rawinput1977260 "ProductionVariants"), "KmsKeyId" (rawinput1977260 "KmsKeyId"), "CreationTime" (rawinput1977260 "CreationTime")}] (clojure.core/cond-> {:endpoint-config-name (deser-endpoint-config-name (clojure.core/get-in letvar1977262 ["EndpointConfigName"])), :endpoint-config-arn (deser-endpoint-config-arn (clojure.core/get-in letvar1977262 ["EndpointConfigArn"])), :production-variants (deser-production-variant-list (clojure.core/get-in letvar1977262 ["ProductionVariants"])), :creation-time (deser-timestamp (clojure.core/get-in letvar1977262 ["CreationTime"]))} (letvar1977262 "KmsKeyId") (clojure.core/assoc :kms-key-id (deser-kms-key-id (clojure.core/get-in letvar1977262 ["KmsKeyId"])))))))

(clojure.core/defn- response-create-code-repository-output ([input] (response-create-code-repository-output nil input)) ([resultWrapper1977264 input] (clojure.core/let [rawinput1977263 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977265 {"CodeRepositoryArn" (rawinput1977263 "CodeRepositoryArn")}] (clojure.core/cond-> {:code-repository-arn (deser-code-repository-arn (clojure.core/get-in letvar1977265 ["CodeRepositoryArn"]))}))))

(clojure.core/defn- response-create-algorithm-output ([input] (response-create-algorithm-output nil input)) ([resultWrapper1977267 input] (clojure.core/let [rawinput1977266 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977268 {"AlgorithmArn" (rawinput1977266 "AlgorithmArn")}] (clojure.core/cond-> {:algorithm-arn (deser-algorithm-arn (clojure.core/get-in letvar1977268 ["AlgorithmArn"]))}))))

(clojure.core/defn- response-update-notebook-instance-lifecycle-config-output ([input] (response-update-notebook-instance-lifecycle-config-output nil input)) ([resultWrapper1977270 input] (clojure.core/let [rawinput1977269 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977271 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-training-job-response ([input] (response-describe-training-job-response nil input)) ([resultWrapper1977273 input] (clojure.core/let [rawinput1977272 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977274 {"EnableNetworkIsolation" (rawinput1977272 "EnableNetworkIsolation"), "ResourceConfig" (rawinput1977272 "ResourceConfig"), "InputDataConfig" (rawinput1977272 "InputDataConfig"), "LabelingJobArn" (rawinput1977272 "LabelingJobArn"), "TrainingEndTime" (rawinput1977272 "TrainingEndTime"), "OutputDataConfig" (rawinput1977272 "OutputDataConfig"), "HyperParameters" (rawinput1977272 "HyperParameters"), "RoleArn" (rawinput1977272 "RoleArn"), "TrainingJobArn" (rawinput1977272 "TrainingJobArn"), "StoppingCondition" (rawinput1977272 "StoppingCondition"), "SecondaryStatus" (rawinput1977272 "SecondaryStatus"), "FailureReason" (rawinput1977272 "FailureReason"), "CreationTime" (rawinput1977272 "CreationTime"), "VpcConfig" (rawinput1977272 "VpcConfig"), "TrainingJobName" (rawinput1977272 "TrainingJobName"), "TuningJobArn" (rawinput1977272 "TuningJobArn"), "ModelArtifacts" (rawinput1977272 "ModelArtifacts"), "FinalMetricDataList" (rawinput1977272 "FinalMetricDataList"), "TrainingStartTime" (rawinput1977272 "TrainingStartTime"), "LastModifiedTime" (rawinput1977272 "LastModifiedTime"), "EnableInterContainerTrafficEncryption" (rawinput1977272 "EnableInterContainerTrafficEncryption"), "TrainingJobStatus" (rawinput1977272 "TrainingJobStatus"), "AlgorithmSpecification" (rawinput1977272 "AlgorithmSpecification"), "SecondaryStatusTransitions" (rawinput1977272 "SecondaryStatusTransitions")}] (clojure.core/cond-> {:stopping-condition (deser-stopping-condition (clojure.core/get-in letvar1977274 ["StoppingCondition"])), :model-artifacts (deser-model-artifacts (clojure.core/get-in letvar1977274 ["ModelArtifacts"])), :training-job-status (deser-training-job-status (clojure.core/get-in letvar1977274 ["TrainingJobStatus"])), :resource-config (deser-resource-config (clojure.core/get-in letvar1977274 ["ResourceConfig"])), :training-job-name (deser-training-job-name (clojure.core/get-in letvar1977274 ["TrainingJobName"])), :secondary-status (deser-secondary-status (clojure.core/get-in letvar1977274 ["SecondaryStatus"])), :training-job-arn (deser-training-job-arn (clojure.core/get-in letvar1977274 ["TrainingJobArn"])), :algorithm-specification (deser-algorithm-specification (clojure.core/get-in letvar1977274 ["AlgorithmSpecification"])), :creation-time (deser-timestamp (clojure.core/get-in letvar1977274 ["CreationTime"]))} (letvar1977274 "EnableNetworkIsolation") (clojure.core/assoc :enable-network-isolation (deser-boolean (clojure.core/get-in letvar1977274 ["EnableNetworkIsolation"]))) (letvar1977274 "InputDataConfig") (clojure.core/assoc :input-data-config (deser-input-data-config (clojure.core/get-in letvar1977274 ["InputDataConfig"]))) (letvar1977274 "LabelingJobArn") (clojure.core/assoc :labeling-job-arn (deser-labeling-job-arn (clojure.core/get-in letvar1977274 ["LabelingJobArn"]))) (letvar1977274 "TrainingEndTime") (clojure.core/assoc :training-end-time (deser-timestamp (clojure.core/get-in letvar1977274 ["TrainingEndTime"]))) (letvar1977274 "OutputDataConfig") (clojure.core/assoc :output-data-config (deser-output-data-config (clojure.core/get-in letvar1977274 ["OutputDataConfig"]))) (letvar1977274 "HyperParameters") (clojure.core/assoc :hyper-parameters (deser-hyper-parameters (clojure.core/get-in letvar1977274 ["HyperParameters"]))) (letvar1977274 "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (clojure.core/get-in letvar1977274 ["RoleArn"]))) (letvar1977274 "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (clojure.core/get-in letvar1977274 ["FailureReason"]))) (letvar1977274 "VpcConfig") (clojure.core/assoc :vpc-config (deser-vpc-config (clojure.core/get-in letvar1977274 ["VpcConfig"]))) (letvar1977274 "TuningJobArn") (clojure.core/assoc :tuning-job-arn (deser-hyper-parameter-tuning-job-arn (clojure.core/get-in letvar1977274 ["TuningJobArn"]))) (letvar1977274 "FinalMetricDataList") (clojure.core/assoc :final-metric-data-list (deser-final-metric-data-list (clojure.core/get-in letvar1977274 ["FinalMetricDataList"]))) (letvar1977274 "TrainingStartTime") (clojure.core/assoc :training-start-time (deser-timestamp (clojure.core/get-in letvar1977274 ["TrainingStartTime"]))) (letvar1977274 "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-timestamp (clojure.core/get-in letvar1977274 ["LastModifiedTime"]))) (letvar1977274 "EnableInterContainerTrafficEncryption") (clojure.core/assoc :enable-inter-container-traffic-encryption (deser-boolean (clojure.core/get-in letvar1977274 ["EnableInterContainerTrafficEncryption"]))) (letvar1977274 "SecondaryStatusTransitions") (clojure.core/assoc :secondary-status-transitions (deser-secondary-status-transitions (clojure.core/get-in letvar1977274 ["SecondaryStatusTransitions"])))))))

(clojure.core/defn- response-create-model-package-output ([input] (response-create-model-package-output nil input)) ([resultWrapper1977276 input] (clojure.core/let [rawinput1977275 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977277 {"ModelPackageArn" (rawinput1977275 "ModelPackageArn")}] (clojure.core/cond-> {:model-package-arn (deser-model-package-arn (clojure.core/get-in letvar1977277 ["ModelPackageArn"]))}))))

(clojure.core/defn- response-describe-model-package-output ([input] (response-describe-model-package-output nil input)) ([resultWrapper1977279 input] (clojure.core/let [rawinput1977278 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977280 {"CertifyForMarketplace" (rawinput1977278 "CertifyForMarketplace"), "ModelPackageName" (rawinput1977278 "ModelPackageName"), "ModelPackageStatus" (rawinput1977278 "ModelPackageStatus"), "InferenceSpecification" (rawinput1977278 "InferenceSpecification"), "ModelPackageStatusDetails" (rawinput1977278 "ModelPackageStatusDetails"), "SourceAlgorithmSpecification" (rawinput1977278 "SourceAlgorithmSpecification"), "CreationTime" (rawinput1977278 "CreationTime"), "ModelPackageArn" (rawinput1977278 "ModelPackageArn"), "ValidationSpecification" (rawinput1977278 "ValidationSpecification"), "ModelPackageDescription" (rawinput1977278 "ModelPackageDescription")}] (clojure.core/cond-> {:model-package-name (deser-entity-name (clojure.core/get-in letvar1977280 ["ModelPackageName"])), :model-package-arn (deser-model-package-arn (clojure.core/get-in letvar1977280 ["ModelPackageArn"])), :creation-time (deser-creation-time (clojure.core/get-in letvar1977280 ["CreationTime"])), :model-package-status (deser-model-package-status (clojure.core/get-in letvar1977280 ["ModelPackageStatus"])), :model-package-status-details (deser-model-package-status-details (clojure.core/get-in letvar1977280 ["ModelPackageStatusDetails"]))} (letvar1977280 "CertifyForMarketplace") (clojure.core/assoc :certify-for-marketplace (deser-certify-for-marketplace (clojure.core/get-in letvar1977280 ["CertifyForMarketplace"]))) (letvar1977280 "InferenceSpecification") (clojure.core/assoc :inference-specification (deser-inference-specification (clojure.core/get-in letvar1977280 ["InferenceSpecification"]))) (letvar1977280 "SourceAlgorithmSpecification") (clojure.core/assoc :source-algorithm-specification (deser-source-algorithm-specification (clojure.core/get-in letvar1977280 ["SourceAlgorithmSpecification"]))) (letvar1977280 "ValidationSpecification") (clojure.core/assoc :validation-specification (deser-model-package-validation-specification (clojure.core/get-in letvar1977280 ["ValidationSpecification"]))) (letvar1977280 "ModelPackageDescription") (clojure.core/assoc :model-package-description (deser-entity-description (clojure.core/get-in letvar1977280 ["ModelPackageDescription"])))))))

(clojure.core/defn- response-update-notebook-instance-output ([input] (response-update-notebook-instance-output nil input)) ([resultWrapper1977282 input] (clojure.core/let [rawinput1977281 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977283 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-compilation-job-response ([input] (response-create-compilation-job-response nil input)) ([resultWrapper1977285 input] (clojure.core/let [rawinput1977284 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977286 {"CompilationJobArn" (rawinput1977284 "CompilationJobArn")}] (clojure.core/cond-> {:compilation-job-arn (deser-compilation-job-arn (clojure.core/get-in letvar1977286 ["CompilationJobArn"]))}))))

(clojure.core/defn- response-create-training-job-response ([input] (response-create-training-job-response nil input)) ([resultWrapper1977288 input] (clojure.core/let [rawinput1977287 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977289 {"TrainingJobArn" (rawinput1977287 "TrainingJobArn")}] (clojure.core/cond-> {:training-job-arn (deser-training-job-arn (clojure.core/get-in letvar1977289 ["TrainingJobArn"]))}))))

(clojure.core/defn- response-update-workteam-response ([input] (response-update-workteam-response nil input)) ([resultWrapper1977291 input] (clojure.core/let [rawinput1977290 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977292 {"Workteam" (rawinput1977290 "Workteam")}] (clojure.core/cond-> {:workteam (deser-workteam (clojure.core/get-in letvar1977292 ["Workteam"]))}))))

(clojure.core/defn- response-resource-limit-exceeded ([input] (response-resource-limit-exceeded nil input)) ([resultWrapper1977294 input] (clojure.core/let [rawinput1977293 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977295 {"Message" (rawinput1977293 "Message")}] (clojure.core/cond-> {} (letvar1977295 "Message") (clojure.core/assoc :message (deser-failure-reason (clojure.core/get-in letvar1977295 ["Message"])))))))

(clojure.core/defn- response-update-endpoint-output ([input] (response-update-endpoint-output nil input)) ([resultWrapper1977297 input] (clojure.core/let [rawinput1977296 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977298 {"EndpointArn" (rawinput1977296 "EndpointArn")}] (clojure.core/cond-> {:endpoint-arn (deser-endpoint-arn (clojure.core/get-in letvar1977298 ["EndpointArn"]))}))))

(clojure.core/defn- response-create-endpoint-output ([input] (response-create-endpoint-output nil input)) ([resultWrapper1977300 input] (clojure.core/let [rawinput1977299 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977301 {"EndpointArn" (rawinput1977299 "EndpointArn")}] (clojure.core/cond-> {:endpoint-arn (deser-endpoint-arn (clojure.core/get-in letvar1977301 ["EndpointArn"]))}))))

(clojure.core/defn- response-resource-not-found ([input] (response-resource-not-found nil input)) ([resultWrapper1977303 input] (clojure.core/let [rawinput1977302 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977304 {"Message" (rawinput1977302 "Message")}] (clojure.core/cond-> {} (letvar1977304 "Message") (clojure.core/assoc :message (deser-failure-reason (clojure.core/get-in letvar1977304 ["Message"])))))))

(clojure.core/defn- response-list-hyper-parameter-tuning-jobs-response ([input] (response-list-hyper-parameter-tuning-jobs-response nil input)) ([resultWrapper1977306 input] (clojure.core/let [rawinput1977305 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977307 {"HyperParameterTuningJobSummaries" (rawinput1977305 "HyperParameterTuningJobSummaries"), "NextToken" (rawinput1977305 "NextToken")}] (clojure.core/cond-> {:hyper-parameter-tuning-job-summaries (deser-hyper-parameter-tuning-job-summaries (clojure.core/get-in letvar1977307 ["HyperParameterTuningJobSummaries"]))} (letvar1977307 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977307 ["NextToken"])))))))

(clojure.core/defn- response-list-algorithms-output ([input] (response-list-algorithms-output nil input)) ([resultWrapper1977309 input] (clojure.core/let [rawinput1977308 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977310 {"AlgorithmSummaryList" (rawinput1977308 "AlgorithmSummaryList"), "NextToken" (rawinput1977308 "NextToken")}] (clojure.core/cond-> {:algorithm-summary-list (deser-algorithm-summary-list (clojure.core/get-in letvar1977310 ["AlgorithmSummaryList"]))} (letvar1977310 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977310 ["NextToken"])))))))

(clojure.core/defn- response-list-endpoints-output ([input] (response-list-endpoints-output nil input)) ([resultWrapper1977312 input] (clojure.core/let [rawinput1977311 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977313 {"Endpoints" (rawinput1977311 "Endpoints"), "NextToken" (rawinput1977311 "NextToken")}] (clojure.core/cond-> {:endpoints (deser-endpoint-summary-list (clojure.core/get-in letvar1977313 ["Endpoints"]))} (letvar1977313 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1977313 ["NextToken"])))))))

(clojure.core/defn- response-describe-subscribed-workteam-response ([input] (response-describe-subscribed-workteam-response nil input)) ([resultWrapper1977315 input] (clojure.core/let [rawinput1977314 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977316 {"SubscribedWorkteam" (rawinput1977314 "SubscribedWorkteam")}] (clojure.core/cond-> {:subscribed-workteam (deser-subscribed-workteam (clojure.core/get-in letvar1977316 ["SubscribedWorkteam"]))}))))

(clojure.core/defn- response-create-notebook-instance-output ([input] (response-create-notebook-instance-output nil input)) ([resultWrapper1977318 input] (clojure.core/let [rawinput1977317 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977319 {"NotebookInstanceArn" (rawinput1977317 "NotebookInstanceArn")}] (clojure.core/cond-> {} (letvar1977319 "NotebookInstanceArn") (clojure.core/assoc :notebook-instance-arn (deser-notebook-instance-arn (clojure.core/get-in letvar1977319 ["NotebookInstanceArn"])))))))

(clojure.core/defn- response-list-tags-output ([input] (response-list-tags-output nil input)) ([resultWrapper1977321 input] (clojure.core/let [rawinput1977320 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977322 {"Tags" (rawinput1977320 "Tags"), "NextToken" (rawinput1977320 "NextToken")}] (clojure.core/cond-> {} (letvar1977322 "Tags") (clojure.core/assoc :tags (deser-tag-list (clojure.core/get-in letvar1977322 ["Tags"]))) (letvar1977322 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977322 ["NextToken"])))))))

(clojure.core/defn- response-render-ui-template-response ([input] (response-render-ui-template-response nil input)) ([resultWrapper1977324 input] (clojure.core/let [rawinput1977323 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977325 {"RenderedContent" (rawinput1977323 "RenderedContent"), "Errors" (rawinput1977323 "Errors")}] (clojure.core/cond-> {:rendered-content (deser-string (clojure.core/get-in letvar1977325 ["RenderedContent"])), :errors (deser-rendering-error-list (clojure.core/get-in letvar1977325 ["Errors"]))}))))

(clojure.core/defn- response-describe-endpoint-output ([input] (response-describe-endpoint-output nil input)) ([resultWrapper1977327 input] (clojure.core/let [rawinput1977326 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977328 {"EndpointName" (rawinput1977326 "EndpointName"), "EndpointArn" (rawinput1977326 "EndpointArn"), "EndpointConfigName" (rawinput1977326 "EndpointConfigName"), "ProductionVariants" (rawinput1977326 "ProductionVariants"), "EndpointStatus" (rawinput1977326 "EndpointStatus"), "FailureReason" (rawinput1977326 "FailureReason"), "CreationTime" (rawinput1977326 "CreationTime"), "LastModifiedTime" (rawinput1977326 "LastModifiedTime")}] (clojure.core/cond-> {:endpoint-name (deser-endpoint-name (clojure.core/get-in letvar1977328 ["EndpointName"])), :endpoint-arn (deser-endpoint-arn (clojure.core/get-in letvar1977328 ["EndpointArn"])), :endpoint-config-name (deser-endpoint-config-name (clojure.core/get-in letvar1977328 ["EndpointConfigName"])), :endpoint-status (deser-endpoint-status (clojure.core/get-in letvar1977328 ["EndpointStatus"])), :creation-time (deser-timestamp (clojure.core/get-in letvar1977328 ["CreationTime"])), :last-modified-time (deser-timestamp (clojure.core/get-in letvar1977328 ["LastModifiedTime"]))} (letvar1977328 "ProductionVariants") (clojure.core/assoc :production-variants (deser-production-variant-summary-list (clojure.core/get-in letvar1977328 ["ProductionVariants"]))) (letvar1977328 "FailureReason") (clojure.core/assoc :failure-reason (deser-failure-reason (clojure.core/get-in letvar1977328 ["FailureReason"])))))))

(clojure.core/defn- response-resource-in-use ([input] (response-resource-in-use nil input)) ([resultWrapper1977330 input] (clojure.core/let [rawinput1977329 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977331 {"Message" (rawinput1977329 "Message")}] (clojure.core/cond-> {} (letvar1977331 "Message") (clojure.core/assoc :message (deser-failure-reason (clojure.core/get-in letvar1977331 ["Message"])))))))

(clojure.core/defn- response-describe-notebook-instance-lifecycle-config-output ([input] (response-describe-notebook-instance-lifecycle-config-output nil input)) ([resultWrapper1977333 input] (clojure.core/let [rawinput1977332 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977334 {"NotebookInstanceLifecycleConfigArn" (rawinput1977332 "NotebookInstanceLifecycleConfigArn"), "NotebookInstanceLifecycleConfigName" (rawinput1977332 "NotebookInstanceLifecycleConfigName"), "OnCreate" (rawinput1977332 "OnCreate"), "OnStart" (rawinput1977332 "OnStart"), "LastModifiedTime" (rawinput1977332 "LastModifiedTime"), "CreationTime" (rawinput1977332 "CreationTime")}] (clojure.core/cond-> {} (letvar1977334 "NotebookInstanceLifecycleConfigArn") (clojure.core/assoc :notebook-instance-lifecycle-config-arn (deser-notebook-instance-lifecycle-config-arn (clojure.core/get-in letvar1977334 ["NotebookInstanceLifecycleConfigArn"]))) (letvar1977334 "NotebookInstanceLifecycleConfigName") (clojure.core/assoc :notebook-instance-lifecycle-config-name (deser-notebook-instance-lifecycle-config-name (clojure.core/get-in letvar1977334 ["NotebookInstanceLifecycleConfigName"]))) (letvar1977334 "OnCreate") (clojure.core/assoc :on-create (deser-notebook-instance-lifecycle-config-list (clojure.core/get-in letvar1977334 ["OnCreate"]))) (letvar1977334 "OnStart") (clojure.core/assoc :on-start (deser-notebook-instance-lifecycle-config-list (clojure.core/get-in letvar1977334 ["OnStart"]))) (letvar1977334 "LastModifiedTime") (clojure.core/assoc :last-modified-time (deser-last-modified-time (clojure.core/get-in letvar1977334 ["LastModifiedTime"]))) (letvar1977334 "CreationTime") (clojure.core/assoc :creation-time (deser-creation-time (clojure.core/get-in letvar1977334 ["CreationTime"])))))))

(clojure.core/defn- response-list-compilation-jobs-response ([input] (response-list-compilation-jobs-response nil input)) ([resultWrapper1977336 input] (clojure.core/let [rawinput1977335 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977337 {"CompilationJobSummaries" (rawinput1977335 "CompilationJobSummaries"), "NextToken" (rawinput1977335 "NextToken")}] (clojure.core/cond-> {:compilation-job-summaries (deser-compilation-job-summaries (clojure.core/get-in letvar1977337 ["CompilationJobSummaries"]))} (letvar1977337 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977337 ["NextToken"])))))))

(clojure.core/defn- response-search-response ([input] (response-search-response nil input)) ([resultWrapper1977339 input] (clojure.core/let [rawinput1977338 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977340 {"Results" (rawinput1977338 "Results"), "NextToken" (rawinput1977338 "NextToken")}] (clojure.core/cond-> {} (letvar1977340 "Results") (clojure.core/assoc :results (deser-search-results-list (clojure.core/get-in letvar1977340 ["Results"]))) (letvar1977340 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977340 ["NextToken"])))))))

(clojure.core/defn- response-create-endpoint-config-output ([input] (response-create-endpoint-config-output nil input)) ([resultWrapper1977342 input] (clojure.core/let [rawinput1977341 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977343 {"EndpointConfigArn" (rawinput1977341 "EndpointConfigArn")}] (clojure.core/cond-> {:endpoint-config-arn (deser-endpoint-config-arn (clojure.core/get-in letvar1977343 ["EndpointConfigArn"]))}))))

(clojure.core/defn- response-list-notebook-instance-lifecycle-configs-output ([input] (response-list-notebook-instance-lifecycle-configs-output nil input)) ([resultWrapper1977345 input] (clojure.core/let [rawinput1977344 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1977346 {"NextToken" (rawinput1977344 "NextToken"), "NotebookInstanceLifecycleConfigs" (rawinput1977344 "NotebookInstanceLifecycleConfigs")}] (clojure.core/cond-> {} (letvar1977346 "NextToken") (clojure.core/assoc :next-token (deser-next-token (clojure.core/get-in letvar1977346 ["NextToken"]))) (letvar1977346 "NotebookInstanceLifecycleConfigs") (clojure.core/assoc :notebook-instance-lifecycle-configs (deser-notebook-instance-lifecycle-config-summary-list (clojure.core/get-in letvar1977346 ["NotebookInstanceLifecycleConfigs"])))))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.property-name-suggestion/property-name (clojure.spec.alpha/and :portkey.aws.sagemaker/resource-property-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/property-name-suggestion (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.property-name-suggestion/property-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-config/instance-type (clojure.spec.alpha/and :portkey.aws.sagemaker/training-instance-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-config/instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/training-instance-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-config/volume-kms-key-id (clojure.spec.alpha/and :portkey.aws.sagemaker/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.resource-config/instance-type :portkey.aws.sagemaker.resource-config/instance-count :portkey.aws.sagemaker/volume-size-in-gb] :opt-un [:portkey.aws.sagemaker.resource-config/volume-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-compilation-job-request/compilation-job-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-compilation-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.create-compilation-job-request/compilation-job-name :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/input-config :portkey.aws.sagemaker/output-config :portkey.aws.sagemaker/stopping-condition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-workteam-request/description (clojure.spec.alpha/and :portkey.aws.sagemaker/string-200))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-workteam-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-workteam-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam-name :portkey.aws.sagemaker/member-definitions :portkey.aws.sagemaker.create-workteam-request/description] :opt-un [:portkey.aws.sagemaker.create-workteam-request/tags]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/input-data-config (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/channel :min-count 1 :max-count 8))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-workteam-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/workteam-arn]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-accelerator-types (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/notebook-instance-accelerator-type))

(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-output-config/s-3-output-path (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-output-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.labeling-job-output-config/s-3-output-path] :opt-un [:portkey.aws.sagemaker/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-compilation-jobs-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-compilation-jobs-request/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/list-compilation-jobs-sort-by))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-compilation-jobs-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-compilation-jobs-request/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-compilation-jobs-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/compilation-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-compilation-jobs-request/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-compilation-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-compilation-jobs-request/creation-time-after :portkey.aws.sagemaker/name-contains :portkey.aws.sagemaker.list-compilation-jobs-request/sort-by :portkey.aws.sagemaker.list-compilation-jobs-request/creation-time-before :portkey.aws.sagemaker/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-compilation-jobs-request/last-modified-time-after :portkey.aws.sagemaker.list-compilation-jobs-request/status-equals :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-compilation-jobs-request/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/suggestion-query (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/property-name-query]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:labeling-job/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-instance-types (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/transform-instance-type :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker/subscribed-workteams (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/subscribed-workteam))

(clojure.spec.alpha/def :portkey.aws.sagemaker/objective-status-counter (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/search-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/training-job]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-accelerator-type #{"ml.eia1.large" "ml.eia1.medium" "ml.eia1.xlarge" :mleia-1xlarge :mleia-1medium :mleia-1large})

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-labeling-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/labeling-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/task-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/compression-type #{"None" :gzip :none "Gzip"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoint-configs-output/endpoint-configs (clojure.spec.alpha/and :portkey.aws.sagemaker/endpoint-config-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoint-configs-output/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-endpoint-configs-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.list-endpoint-configs-output/endpoint-configs] :opt-un [:portkey.aws.sagemaker.list-endpoint-configs-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.output-data-config/s-3-output-path (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker/output-data-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.output-data-config/s-3-output-path] :opt-un [:portkey.aws.sagemaker/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/cents (clojure.spec.alpha/int-in 0 99))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-algorithm-output/algorithm-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-algorithm-output/validation-specification (clojure.spec.alpha/and :portkey.aws.sagemaker/algorithm-validation-specification))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-algorithm-output/algorithm-description (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-description))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-algorithm-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.describe-algorithm-output/algorithm-name :portkey.aws.sagemaker/algorithm-arn :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/training-specification :portkey.aws.sagemaker/algorithm-status :portkey.aws.sagemaker/algorithm-status-details] :opt-un [:portkey.aws.sagemaker/certify-for-marketplace :portkey.aws.sagemaker/inference-specification :portkey.aws.sagemaker.describe-algorithm-output/validation-specification :portkey.aws.sagemaker/product-id :portkey.aws.sagemaker.describe-algorithm-output/algorithm-description]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.continuous-parameter-range-specification/min-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.continuous-parameter-range-specification/max-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/continuous-parameter-range-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.continuous-parameter-range-specification/min-value :portkey.aws.sagemaker.continuous-parameter-range-specification/max-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/attribute-names (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/attribute-name :max-count 16))

(clojure.spec.alpha/def :portkey.aws.sagemaker/nested-filters-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/nested-filters :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker/arn-or-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 170)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:[a-z\-]*\/)?([a-zA-Z0-9]([a-zA-Z0-9-]){0,62})(?<!-)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.filter/name (clojure.spec.alpha/and :portkey.aws.sagemaker/resource-property-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.filter/value (clojure.spec.alpha/and :portkey.aws.sagemaker/filter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/filter (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.filter/name] :opt-un [:portkey.aws.sagemaker/operator :portkey.aws.sagemaker.filter/value]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-labeling-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/labeling-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-regex (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-code-repository-input/code-repository-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-code-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.describe-code-repository-input/code-repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-status #{"Failed" "Creating" "SystemUpdating" :system-updating :creating "InService" "RollingBack" :deleting "OutOfService" :out-of-service "Deleting" :in-service :rolling-back :updating "Updating" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/workteams (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/workteam))

(clojure.spec.alpha/def :portkey.aws.sagemaker/job-reference-code-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/additional-code-repository-names-or-urls (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/code-repository-name-or-url :max-count 3))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-status #{"Failed" :in-progress :completed :stopping :stopped "InProgress" "Stopping" "Stopped" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/endpoint-config-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name :portkey.aws.sagemaker/endpoint-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-arn]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/variant-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-type #{:continuous :integer "Continuous" "Integer" :categorical "Categorical" "FreeText" :free-text})

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-lifecycle-config-input/on-create (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-lifecycle-config-input/on-start (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-name] :opt-un [:portkey.aws.sagemaker.create-notebook-instance-lifecycle-config-input/on-create :portkey.aws.sagemaker.create-notebook-instance-lifecycle-config-input/on-start]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-labeling-jobs-for-workteam-sort-by-options #{"CreationTime" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-sort-order))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/creation-time-after :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/name-contains :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/sort-by :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/creation-time-before :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/last-modified-time-after :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/sort-by #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.workteam/product-listing-ids (clojure.spec.alpha/and :portkey.aws.sagemaker/product-listings))
(clojure.spec.alpha/def :portkey.aws.sagemaker.workteam/description (clojure.spec.alpha/and :portkey.aws.sagemaker/string-200))
(clojure.spec.alpha/def :portkey.aws.sagemaker.workteam/sub-domain (clojure.spec.alpha/and :portkey.aws.sagemaker/string))
(clojure.spec.alpha/def :portkey.aws.sagemaker.workteam/create-date (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.workteam/last-updated-date (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/workteam (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam-name :portkey.aws.sagemaker/member-definitions :portkey.aws.sagemaker/workteam-arn :portkey.aws.sagemaker.workteam/description] :opt-un [:portkey.aws.sagemaker.workteam/product-listing-ids :portkey.aws.sagemaker.workteam/sub-domain :portkey.aws.sagemaker.workteam/create-date :portkey.aws.sagemaker.workteam/last-updated-date]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/cognito-user-group (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{S}\p{N}\p{P}]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/member-definitions (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/member-definition :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-transform-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-summaries] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-lifecycle-config-input/on-create (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-lifecycle-config-input/on-start (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-name] :opt-un [:portkey.aws.sagemaker.update-notebook-instance-lifecycle-config-input/on-create :portkey.aws.sagemaker.update-notebook-instance-lifecycle-config-input/on-start]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.endpoint-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.endpoint-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name :portkey.aws.sagemaker/endpoint-arn :portkey.aws.sagemaker.endpoint-summary/creation-time :portkey.aws.sagemaker.endpoint-summary/last-modified-time :portkey.aws.sagemaker/endpoint-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.label-counters/total-labeled (clojure.spec.alpha/and :portkey.aws.sagemaker/label-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.label-counters/human-labeled (clojure.spec.alpha/and :portkey.aws.sagemaker/label-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.label-counters/machine-labeled (clojure.spec.alpha/and :portkey.aws.sagemaker/label-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.label-counters/failed-non-retryable-error (clojure.spec.alpha/and :portkey.aws.sagemaker/label-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.label-counters/unlabeled (clojure.spec.alpha/and :portkey.aws.sagemaker/label-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker/label-counters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.label-counters/total-labeled :portkey.aws.sagemaker.label-counters/human-labeled :portkey.aws.sagemaker.label-counters/machine-labeled :portkey.aws.sagemaker.label-counters/failed-non-retryable-error :portkey.aws.sagemaker.label-counters/unlabeled]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-payload-in-mb (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/template-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128000))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-number-of-training-jobs (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-models-output/models (clojure.spec.alpha/and :portkey.aws.sagemaker/model-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-models-output/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-models-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.list-models-output/models] :opt-un [:portkey.aws.sagemaker.list-models-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/stop-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-resources/instance-type (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-instance-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-resources/instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-instance-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-resources/volume-kms-key-id (clojure.spec.alpha/and :portkey.aws.sagemaker/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-resources (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.transform-resources/instance-type :portkey.aws.sagemaker.transform-resources/instance-count] :opt-un [:portkey.aws.sagemaker.transform-resources/volume-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-status-counter (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-code-repositories-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-code-repositories-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/code-repository-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-code-repositories-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/code-repository-sort-by))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-code-repositories-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-code-repositories-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker/code-repository-sort-order))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-code-repositories-input/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-code-repositories-input/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-code-repositories-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-code-repositories-input/creation-time-after :portkey.aws.sagemaker.list-code-repositories-input/name-contains :portkey.aws.sagemaker.list-code-repositories-input/sort-by :portkey.aws.sagemaker.list-code-repositories-input/creation-time-before :portkey.aws.sagemaker.list-code-repositories-input/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-code-repositories-input/last-modified-time-after :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-code-repositories-input/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/volume-size-in-gb (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-container-definition/model-data-url (clojure.spec.alpha/and :portkey.aws.sagemaker/url))
(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-container-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/image] :opt-un [:portkey.aws.sagemaker/container-hostname :portkey.aws.sagemaker/image-digest :portkey.aws.sagemaker.model-package-container-definition/model-data-url :portkey.aws.sagemaker/product-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/security-group-id :max-count 5))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-presigned-notebook-instance-url-output/authorized-url (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-presigned-notebook-instance-url-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.create-presigned-notebook-instance-url-output/authorized-url]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/image-digest (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 72)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[Ss][Hh][Aa]256:[0-9a-fA-F]{64}$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-code-repositories-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/code-repository-summary-list] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameters (clojure.spec.alpha/map-of :portkey.aws.sagemaker/parameter-key :portkey.aws.sagemaker/parameter-value))

(clojure.spec.alpha/def :portkey.aws.sagemaker/branch (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-strategy-type #{"Bayesian" :bayesian})

(clojure.spec.alpha/def :portkey.aws.sagemaker/continuous-parameter-ranges (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/continuous-parameter-range :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/hyper-parameter-tuning-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/warm-start-config (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-warm-start-config))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/best-training-job (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-training-job-summary))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/training-job-definition (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-training-job-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/overall-best-training-job (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-training-job-summary))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name :portkey.aws.sagemaker/hyper-parameter-tuning-job-arn :portkey.aws.sagemaker/hyper-parameter-tuning-job-config :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/training-job-definition :portkey.aws.sagemaker/hyper-parameter-tuning-job-status :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/creation-time :portkey.aws.sagemaker/training-job-status-counters :portkey.aws.sagemaker/objective-status-counters] :opt-un [:portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/hyper-parameter-tuning-end-time :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/warm-start-config :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/best-training-job :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/last-modified-time :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/overall-best-training-job]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/code-repository-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/code-repository-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-training-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/hyper-parameter-training-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/subnets (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/subnet-id :min-count 1 :max-count 16))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/property-name-hint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/workteam-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-package-input/model-package-name (clojure.spec.alpha/and :portkey.aws.sagemaker/arn-or-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-model-package-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.describe-model-package-input/model-package-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-endpoint-config-input/production-variants (clojure.spec.alpha/and :portkey.aws.sagemaker/production-variant-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-endpoint-config-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-endpoint-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-name :portkey.aws.sagemaker.create-endpoint-config-input/production-variants] :opt-un [:portkey.aws.sagemaker.create-endpoint-config-input/tags :portkey.aws.sagemaker/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job/enable-network-isolation (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job/training-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job/tuning-job-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job/training-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.training-job/enable-network-isolation :portkey.aws.sagemaker/resource-config :portkey.aws.sagemaker/input-data-config :portkey.aws.sagemaker/labeling-job-arn :portkey.aws.sagemaker.training-job/training-end-time :portkey.aws.sagemaker/output-data-config :portkey.aws.sagemaker/hyper-parameters :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker.training-job/tags :portkey.aws.sagemaker/training-job-arn :portkey.aws.sagemaker/stopping-condition :portkey.aws.sagemaker/secondary-status :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker.training-job/creation-time :portkey.aws.sagemaker/vpc-config :portkey.aws.sagemaker/training-job-name :portkey.aws.sagemaker.training-job/tuning-job-arn :portkey.aws.sagemaker/model-artifacts :portkey.aws.sagemaker/final-metric-data-list :portkey.aws.sagemaker.training-job/training-start-time :portkey.aws.sagemaker.training-job/last-modified-time :portkey.aws.sagemaker/training-job-status :portkey.aws.sagemaker/algorithm-specification :portkey.aws.sagemaker/secondary-status-transitions]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/detailed-algorithm-status #{"Failed" :in-progress "NotStarted" :completed "InProgress" :not-started "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/shuffle-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/seed] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/channel-specifications (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/channel-specification :min-count 1 :max-count 8))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoint-configs-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/endpoint-config-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoint-configs-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker/order-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoint-configs-input/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoint-configs-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/endpoint-config-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoint-configs-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoint-configs-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-endpoint-configs-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-endpoint-configs-input/sort-by :portkey.aws.sagemaker.list-endpoint-configs-input/sort-order :portkey.aws.sagemaker.list-endpoint-configs-input/next-token :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-endpoint-configs-input/name-contains :portkey.aws.sagemaker.list-endpoint-configs-input/creation-time-before :portkey.aws.sagemaker.list-endpoint-configs-input/creation-time-after]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-transform-job-response/transform-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-transform-job-response/transform-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-transform-job-response/environment (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-environment-map))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-transform-job-response/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-transform-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-name :portkey.aws.sagemaker/transform-job-arn :portkey.aws.sagemaker/transform-job-status :portkey.aws.sagemaker/model-name :portkey.aws.sagemaker/transform-input :portkey.aws.sagemaker/transform-resources :portkey.aws.sagemaker.describe-transform-job-response/creation-time] :opt-un [:portkey.aws.sagemaker/labeling-job-arn :portkey.aws.sagemaker.describe-transform-job-response/transform-end-time :portkey.aws.sagemaker/max-payload-in-mb :portkey.aws.sagemaker/max-concurrent-transforms :portkey.aws.sagemaker.describe-transform-job-response/transform-start-time :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker/batch-strategy :portkey.aws.sagemaker.describe-transform-job-response/environment :portkey.aws.sagemaker/transform-output]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-instance-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-data-source/s-3-data-source (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-s-3-data-source))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.transform-data-source/s-3-data-source] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/input-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/s-3-uri :portkey.aws.sagemaker/data-input-config :portkey.aws.sagemaker/framework] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-output/output-dataset-s-3-uri (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-output/final-active-learning-model-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/model-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.labeling-job-output/output-dataset-s-3-uri] :opt-un [:portkey.aws.sagemaker.labeling-job-output/final-active-learning-model-arn]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.update-workteam-request/description (clojure.spec.alpha/and :portkey.aws.sagemaker/string-200))
(clojure.spec.alpha/def :portkey.aws.sagemaker/update-workteam-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam-name] :opt-un [:portkey.aws.sagemaker/member-definitions :portkey.aws.sagemaker.update-workteam-request/description]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-limits (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/max-number-of-training-jobs :portkey.aws.sagemaker/max-parallel-training-jobs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.cognito-member-definition/user-pool (clojure.spec.alpha/and :portkey.aws.sagemaker/cognito-user-pool))
(clojure.spec.alpha/def :portkey.aws.sagemaker.cognito-member-definition/user-group (clojure.spec.alpha/and :portkey.aws.sagemaker/cognito-user-group))
(clojure.spec.alpha/def :portkey.aws.sagemaker.cognito-member-definition/client-id (clojure.spec.alpha/and :portkey.aws.sagemaker/cognito-client-id))
(clojure.spec.alpha/def :portkey.aws.sagemaker/cognito-member-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.cognito-member-definition/user-pool :portkey.aws.sagemaker.cognito-member-definition/user-group :portkey.aws.sagemaker.cognito-member-definition/client-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-instance-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-status-item/name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-status-item/status (clojure.spec.alpha/and :portkey.aws.sagemaker/detailed-model-package-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-status-item/failure-reason (clojure.spec.alpha/and :portkey.aws.sagemaker/string))
(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-status-item (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.model-package-status-item/name :portkey.aws.sagemaker.model-package-status-item/status] :opt-un [:portkey.aws.sagemaker.model-package-status-item/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-workteam-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/success] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-code-repository-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/code-repository-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/s-3-data-type #{"AugmentedManifestFile" :augmented-manifest-file :s-3-prefix "ManifestFile" :manifest-file "S3Prefix"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/certify-for-marketplace clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/s-3-data-distribution #{"ShardedByS3Key" :fully-replicated "FullyReplicated" :sharded-by-s-3-key})

(clojure.spec.alpha/def :portkey.aws.sagemaker/response-mime-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.code-repository-summary/code-repository-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/code-repository-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.code-repository-summary/code-repository-name :portkey.aws.sagemaker/code-repository-arn :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/last-modified-time] :opt-un [:portkey.aws.sagemaker/git-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/entity-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-sort-by #{:name "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/detailed-model-package-status #{"Failed" :in-progress "NotStarted" :completed "InProgress" :not-started "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-s-3-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/s-3-data-type :portkey.aws.sagemaker/s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-concurrent-transforms (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-labeling-jobs-for-workteam-response/labeling-job-summary-list (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-for-workteam-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-labeling-jobs-for-workteam-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.list-labeling-jobs-for-workteam-response/labeling-job-summary-list] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/container-hostname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-sort-by-options))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/creation-time-after :portkey.aws.sagemaker/name-contains :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/sort-by :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/creation-time-before :portkey.aws.sagemaker/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/last-modified-time-after :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/status-equals :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-hyper-parameter-tuning-jobs-request/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/order-key #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-models-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/model-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-models-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker/order-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-models-input/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-models-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/model-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-models-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-models-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-models-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-models-input/sort-by :portkey.aws.sagemaker.list-models-input/sort-order :portkey.aws.sagemaker.list-models-input/next-token :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-models-input/name-contains :portkey.aws.sagemaker.list-models-input/creation-time-before :portkey.aws.sagemaker.list-models-input/creation-time-after]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-for-workteam-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/labeling-job-for-workteam-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-sort-key #{:name "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-code-repository-output/code-repository-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-code-repository-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.describe-code-repository-output/code-repository-name :portkey.aws.sagemaker/code-repository-arn :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/last-modified-time] :opt-un [:portkey.aws.sagemaker/git-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/realtime-inference-instance-types (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/production-variant-instance-type))

(clojure.spec.alpha/def :portkey.aws.sagemaker/instance-type #{:mlc-5d-2xlarge "ml.t2.large" :mlm-42xlarge :mlt-3medium :mlp-32xlarge :mlp-316xlarge "ml.m5.xlarge" "ml.c5.xlarge" "ml.m4.2xlarge" "ml.c5.9xlarge" :mlm-54xlarge "ml.p2.16xlarge" :mlt-2medium :mlt-2large :mlc-5d-9xlarge :mlm-52xlarge :mlc-54xlarge "ml.m5.12xlarge" "ml.c5.2xlarge" :mlc-52xlarge "ml.c5d.18xlarge" "ml.c4.2xlarge" "ml.t2.2xlarge" "ml.t3.large" "ml.c4.4xlarge" :mlm-410xlarge "ml.t3.xlarge" :mlm-512xlarge "ml.m4.4xlarge" "ml.m5.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" "ml.c5d.2xlarge" :mlc-5d-18xlarge "ml.c5d.9xlarge" :mlp-38xlarge :mlt-2xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge "ml.c5d.4xlarge" "ml.t3.2xlarge" :mlc-48xlarge "ml.t3.medium" "ml.t2.xlarge" :mlt-22xlarge "ml.p3.16xlarge" :mlc-59xlarge :mlc-4xlarge "ml.c4.8xlarge" "ml.c5.18xlarge" :mlc-42xlarge :mlc-44xlarge :mlt-3xlarge "ml.m5.2xlarge" :mlc-518xlarge "ml.c4.xlarge" "ml.m5.24xlarge" "ml.p3.2xlarge" :mlt-32xlarge :mlp-216xlarge :mlm-524xlarge "ml.c5d.xlarge" :mlp-2xlarge :mlt-3large "ml.p3.8xlarge" :mlp-28xlarge :mlm-5xlarge :mlc-5dxlarge :mlm-4xlarge :mlc-5d-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" :mlc-5xlarge "ml.t2.medium" "ml.c5.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-compilation-job-response/compilation-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-compilation-job-response/compilation-job-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-compilation-job-response/compilation-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-compilation-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.describe-compilation-job-response/compilation-job-name :portkey.aws.sagemaker/compilation-job-arn :portkey.aws.sagemaker/compilation-job-status :portkey.aws.sagemaker/stopping-condition :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/last-modified-time :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker/model-artifacts :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/input-config :portkey.aws.sagemaker/output-config] :opt-un [:portkey.aws.sagemaker.describe-compilation-job-response/compilation-end-time :portkey.aws.sagemaker.describe-compilation-job-response/compilation-start-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/disassociate-notebook-instance-accelerator-types clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-output/primary-container (clojure.spec.alpha/and :portkey.aws.sagemaker/container-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-output/containers (clojure.spec.alpha/and :portkey.aws.sagemaker/container-definition-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-output/execution-role-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/role-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-output/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-output/enable-network-isolation (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-model-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-name :portkey.aws.sagemaker.describe-model-output/execution-role-arn :portkey.aws.sagemaker.describe-model-output/creation-time :portkey.aws.sagemaker/model-arn] :opt-un [:portkey.aws.sagemaker.describe-model-output/primary-container :portkey.aws.sagemaker.describe-model-output/containers :portkey.aws.sagemaker/vpc-config :portkey.aws.sagemaker.describe-model-output/enable-network-isolation]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.public-workforce-task-price/amount-in-usd (clojure.spec.alpha/and :portkey.aws.sagemaker/usd))
(clojure.spec.alpha/def :portkey.aws.sagemaker/public-workforce-task-price (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.public-workforce-task-price/amount-in-usd]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.final-hyper-parameter-tuning-job-objective-metric/type (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.final-hyper-parameter-tuning-job-objective-metric/value (clojure.spec.alpha/and :portkey.aws.sagemaker/metric-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/final-hyper-parameter-tuning-job-objective-metric (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/metric-name :portkey.aws.sagemaker.final-hyper-parameter-tuning-job-objective-metric/value] :opt-un [:portkey.aws.sagemaker.final-hyper-parameter-tuning-job-objective-metric/type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-sort-by-options #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/data-input-config (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 20 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-compilation-job-request/compilation-job-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-compilation-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.describe-compilation-job-request/compilation-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-input-mode #{"Pipe" "File" :pipe :file})

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-input/data-source (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-data-source))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.transform-input/data-source] :opt-un [:portkey.aws.sagemaker/content-type :portkey.aws.sagemaker/compression-type :portkey.aws.sagemaker/split-type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/s-3-uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^(https|s3)://([^/]+)/?(.*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/response-mime-types (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/response-mime-type))

(clojure.spec.alpha/def :portkey.aws.sagemaker/task-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.integer-parameter-range-specification/min-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.integer-parameter-range-specification/max-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/integer-parameter-range-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.integer-parameter-range-specification/min-value :portkey.aws.sagemaker.integer-parameter-range-specification/max-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-sort-key #{:name "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-sort-key #{:name "CreationTime" "LastModifiedTime" "Name" :last-modified-time :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.add-tags-output/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/add-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.add-tags-output/tags]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/secret-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:secretsmanager:[a-z0-9\-]*:[0-9]{12}:secret:.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-job-summary/transform-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-job-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-name :portkey.aws.sagemaker/transform-job-arn :portkey.aws.sagemaker.transform-job-summary/creation-time :portkey.aws.sagemaker/transform-job-status] :opt-un [:portkey.aws.sagemaker.transform-job-summary/transform-end-time :portkey.aws.sagemaker.transform-job-summary/last-modified-time :portkey.aws.sagemaker/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-model-packages-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-package-summary-list] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parent-hyper-parameter-tuning-job (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant-instance-type #{:mlm-5large "ml.t2.large" :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.c4.large" "ml.m5.xlarge" "ml.c5.xlarge" "ml.m4.2xlarge" "ml.c5.9xlarge" :mlm-54xlarge "ml.p2.16xlarge" :mlt-2medium :mlt-2large :mlm-52xlarge "ml.m5.large" :mlc-54xlarge "ml.m5.12xlarge" "ml.c5.2xlarge" :mlc-52xlarge "ml.c4.2xlarge" "ml.t2.2xlarge" "ml.c5.large" "ml.c4.4xlarge" :mlm-410xlarge :mlm-512xlarge "ml.m4.4xlarge" "ml.m5.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlc-4large :mlt-2xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge :mlc-48xlarge "ml.t2.xlarge" :mlt-22xlarge "ml.p3.16xlarge" :mlc-59xlarge :mlc-4xlarge "ml.c4.8xlarge" "ml.c5.18xlarge" :mlc-42xlarge :mlc-44xlarge "ml.m5.2xlarge" :mlc-518xlarge "ml.c4.xlarge" "ml.m5.24xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlm-524xlarge :mlp-2xlarge :mlc-5large "ml.p3.8xlarge" :mlp-28xlarge :mlm-5xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" :mlc-5xlarge "ml.t2.medium" "ml.c5.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.update-code-repository-input/code-repository-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.update-code-repository-input/git-config (clojure.spec.alpha/and :portkey.aws.sagemaker/git-config-for-update))
(clojure.spec.alpha/def :portkey.aws.sagemaker/update-code-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.update-code-repository-input/code-repository-name] :opt-un [:portkey.aws.sagemaker.update-code-repository-input/git-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-subscribed-workteams-request/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/workteam-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-subscribed-workteams-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-subscribed-workteams-request/name-contains :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker/max-results]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.label-counters-for-workteam/human-labeled (clojure.spec.alpha/and :portkey.aws.sagemaker/label-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.label-counters-for-workteam/pending-human (clojure.spec.alpha/and :portkey.aws.sagemaker/label-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.label-counters-for-workteam/total (clojure.spec.alpha/and :portkey.aws.sagemaker/label-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker/label-counters-for-workteam (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.label-counters-for-workteam/human-labeled :portkey.aws.sagemaker.label-counters-for-workteam/pending-human :portkey.aws.sagemaker.label-counters-for-workteam/total]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-values (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/parameter-value :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/production-variant :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker/network-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker/environment-map (clojure.spec.alpha/map-of :portkey.aws.sagemaker/environment-key :portkey.aws.sagemaker/environment-value))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-parallel-training-jobs (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.renderable-task/input (clojure.spec.alpha/and :portkey.aws.sagemaker/task-input))
(clojure.spec.alpha/def :portkey.aws.sagemaker/renderable-task (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.renderable-task/input] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.update-endpoint-weights-and-capacities-input/desired-weights-and-capacities (clojure.spec.alpha/and :portkey.aws.sagemaker/desired-weight-and-capacity-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name :portkey.aws.sagemaker.update-endpoint-weights-and-capacities-input/desired-weights-and-capacities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-subscribed-workteams-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/subscribed-workteams] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-workteams-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteams] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/session-expiration-duration-in-seconds (clojure.spec.alpha/int-in 1800 43200))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-model-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/tenth-fractions-of-a-cent (clojure.spec.alpha/int-in 0 9))

(clojure.spec.alpha/def :portkey.aws.sagemaker.stop-compilation-job-request/compilation-job-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/stop-compilation-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.stop-compilation-job-request/compilation-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/workteam-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:workteam/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-for-workteam-summary/work-requester-account-id (clojure.spec.alpha/and :portkey.aws.sagemaker/account-id))
(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-for-workteam-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-for-workteam-summary/label-counters (clojure.spec.alpha/and :portkey.aws.sagemaker/label-counters-for-workteam))
(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-for-workteam-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/job-reference-code :portkey.aws.sagemaker.labeling-job-for-workteam-summary/work-requester-account-id :portkey.aws.sagemaker.labeling-job-for-workteam-summary/creation-time] :opt-un [:portkey.aws.sagemaker/labeling-job-name :portkey.aws.sagemaker.labeling-job-for-workteam-summary/label-counters]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/code-repository-sort-by #{:name "CreationTime" "LastModifiedTime" "Name" :last-modified-time :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-workteams-sort-by-options #{:create-date "CreateDate" :name "Name"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-output/notebook-instances (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-notebook-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-notebook-instances-output/notebook-instances]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/task-availability-lifetime-in-seconds (clojure.spec.alpha/int-in 1 345600))

(clojure.spec.alpha/def :portkey.aws.sagemaker/vpc-security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/security-group-id :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-workteam-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-summary/algorithm-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-summary/algorithm-description (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-description))
(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.algorithm-summary/algorithm-name :portkey.aws.sagemaker/algorithm-arn :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/algorithm-status] :opt-un [:portkey.aws.sagemaker.algorithm-summary/algorithm-description]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-labeling-jobs-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/labeling-job-summary-list :portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/labeling-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-output/volume-size-in-gb (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-volume-size-in-gb))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-output/security-groups (clojure.spec.alpha/and :portkey.aws.sagemaker/security-group-ids))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-output/accelerator-types (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-accelerator-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-output/default-code-repository (clojure.spec.alpha/and :portkey.aws.sagemaker/code-repository-name-or-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-output/url (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-output/additional-code-repositories (clojure.spec.alpha/and :portkey.aws.sagemaker/additional-code-repository-names-or-urls))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-notebook-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.describe-notebook-instance-output/volume-size-in-gb :portkey.aws.sagemaker/notebook-instance-arn :portkey.aws.sagemaker/subnet-id :portkey.aws.sagemaker.describe-notebook-instance-output/security-groups :portkey.aws.sagemaker/instance-type :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker.describe-notebook-instance-output/accelerator-types :portkey.aws.sagemaker/network-interface-id :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name :portkey.aws.sagemaker/notebook-instance-status :portkey.aws.sagemaker.describe-notebook-instance-output/default-code-repository :portkey.aws.sagemaker/direct-internet-access :portkey.aws.sagemaker.describe-notebook-instance-output/url :portkey.aws.sagemaker.describe-notebook-instance-output/additional-code-repositories :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker/kms-key-id :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/last-modified-time :portkey.aws.sagemaker/notebook-instance-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-status #{"Failed" :pending "InService" :deleting :stopping :stopped "Deleting" :in-service "Stopping" :updating "Stopped" "Pending" "Updating" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-transform-job-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-transform-job-request/environment (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-environment-map))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-transform-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-name :portkey.aws.sagemaker/model-name :portkey.aws.sagemaker/transform-input :portkey.aws.sagemaker/transform-output :portkey.aws.sagemaker/transform-resources] :opt-un [:portkey.aws.sagemaker/max-payload-in-mb :portkey.aws.sagemaker/max-concurrent-transforms :portkey.aws.sagemaker.create-transform-job-request/tags :portkey.aws.sagemaker/batch-strategy :portkey.aws.sagemaker.create-transform-job-request/environment]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-response/training-job-summaries (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-training-job-summaries))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-response/training-job-summaries] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.get-search-suggestions-response/property-name-suggestions (clojure.spec.alpha/and :portkey.aws.sagemaker/property-name-suggestion-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/get-search-suggestions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.get-search-suggestions-response/property-name-suggestions]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-training-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-summaries] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/number-of-human-workers-per-data-object (clojure.spec.alpha/int-in 1 9))

(clojure.spec.alpha/def :portkey.aws.sagemaker.delete-model-package-input/model-package-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-model-package-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.delete-model-package-input/model-package-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.git-config/repository-url (clojure.spec.alpha/and :portkey.aws.sagemaker/git-config-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker/git-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.git-config/repository-url] :opt-un [:portkey.aws.sagemaker/branch :portkey.aws.sagemaker/secret-arn]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/objective-status #{"Failed" "Succeeded" :pending "Pending" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-concurrent-task-count (clojure.spec.alpha/int-in 1 1000))

(clojure.spec.alpha/def :portkey.aws.sagemaker/code-repository-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-endpoint-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name :portkey.aws.sagemaker/endpoint-config-name] :opt-un [:portkey.aws.sagemaker.create-endpoint-input/tags]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/task-input (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 2 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128000))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-warm-start-config/warm-start-type (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-warm-start-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-warm-start-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/parent-hyper-parameter-tuning-jobs :portkey.aws.sagemaker.hyper-parameter-tuning-job-warm-start-config/warm-start-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-validation-specification/validation-role (clojure.spec.alpha/and :portkey.aws.sagemaker/role-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-validation-specification/validation-profiles (clojure.spec.alpha/and :portkey.aws.sagemaker/algorithm-validation-profiles))
(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-validation-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.algorithm-validation-specification/validation-role :portkey.aws.sagemaker.algorithm-validation-specification/validation-profiles] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-endpoint-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-instance-types (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/training-instance-type))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-sort-key #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/content-classifiers (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/content-classifier :max-count 256))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-tags-max-results (clojure.spec.alpha/int-in 50 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-config/strategy (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-strategy-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.hyper-parameter-tuning-job-config/strategy :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective :portkey.aws.sagemaker/resource-limits :portkey.aws.sagemaker/parameter-ranges] :opt-un [:portkey.aws.sagemaker/training-job-early-stopping-type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/code-repository-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:code-repository/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-objectives (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective))

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-job-definition/environment (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-environment-map))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-input :portkey.aws.sagemaker/transform-output :portkey.aws.sagemaker/transform-resources] :opt-un [:portkey.aws.sagemaker/max-concurrent-transforms :portkey.aws.sagemaker/max-payload-in-mb :portkey.aws.sagemaker/batch-strategy :portkey.aws.sagemaker.transform-job-definition/environment]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-labeling-job-response/input-config (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-input-config))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-labeling-job-response/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-labeling-job-response/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-labeling-job-response/stopping-conditions (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-stopping-conditions))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-labeling-job-response/label-category-config-s-3-uri (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-labeling-job-response/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-labeling-job-response/output-config (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-output-config))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-labeling-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/labeling-job-status :portkey.aws.sagemaker/label-counters :portkey.aws.sagemaker.describe-labeling-job-response/creation-time :portkey.aws.sagemaker.describe-labeling-job-response/last-modified-time :portkey.aws.sagemaker/job-reference-code :portkey.aws.sagemaker/labeling-job-name :portkey.aws.sagemaker/labeling-job-arn :portkey.aws.sagemaker.describe-labeling-job-response/input-config :portkey.aws.sagemaker.describe-labeling-job-response/output-config :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/human-task-config] :opt-un [:portkey.aws.sagemaker/labeling-job-output :portkey.aws.sagemaker.describe-labeling-job-response/tags :portkey.aws.sagemaker/label-attribute-name :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker.describe-labeling-job-response/stopping-conditions :portkey.aws.sagemaker.describe-labeling-job-response/label-category-config-s-3-uri :portkey.aws.sagemaker/labeling-job-algorithms-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-algorithm-specification-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-validation-profiles (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/algorithm-validation-profile :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/model-package-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 20 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.ui-config/ui-template-s-3-uri (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker/ui-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.ui-config/ui-template-s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.objective-status-counters/succeeded (clojure.spec.alpha/and :portkey.aws.sagemaker/objective-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.objective-status-counters/pending (clojure.spec.alpha/and :portkey.aws.sagemaker/objective-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.objective-status-counters/failed (clojure.spec.alpha/and :portkey.aws.sagemaker/objective-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker/objective-status-counters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.objective-status-counters/succeeded :portkey.aws.sagemaker.objective-status-counters/pending :portkey.aws.sagemaker.objective-status-counters/failed]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/hyper-parameter-tuning-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-environment-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.subscribed-workteam/marketplace-title (clojure.spec.alpha/and :portkey.aws.sagemaker/string-200))
(clojure.spec.alpha/def :portkey.aws.sagemaker.subscribed-workteam/seller-name (clojure.spec.alpha/and :portkey.aws.sagemaker/string))
(clojure.spec.alpha/def :portkey.aws.sagemaker.subscribed-workteam/marketplace-description (clojure.spec.alpha/and :portkey.aws.sagemaker/string-200))
(clojure.spec.alpha/def :portkey.aws.sagemaker.subscribed-workteam/listing-id (clojure.spec.alpha/and :portkey.aws.sagemaker/string))
(clojure.spec.alpha/def :portkey.aws.sagemaker/subscribed-workteam (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam-arn] :opt-un [:portkey.aws.sagemaker.subscribed-workteam/marketplace-title :portkey.aws.sagemaker.subscribed-workteam/seller-name :portkey.aws.sagemaker.subscribed-workteam/marketplace-description :portkey.aws.sagemaker.subscribed-workteam/listing-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/entity-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\p{L}\p{M}\p{Z}\p{S}\p{N}\p{P}]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.categorical-parameter-range-specification/values (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-values))
(clojure.spec.alpha/def :portkey.aws.sagemaker/categorical-parameter-range-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.categorical-parameter-range-specification/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/direct-internet-access #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-validation-profiles (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/model-package-validation-profile :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker/member-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/cognito-member-definition]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-environment-map (clojure.spec.alpha/map-of :portkey.aws.sagemaker/transform-environment-key :portkey.aws.sagemaker/transform-environment-value))

(clojure.spec.alpha/def :portkey.aws.sagemaker.s-3-data-source/s-3-data-distribution-type (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-data-distribution))
(clojure.spec.alpha/def :portkey.aws.sagemaker/s-3-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/s-3-data-type :portkey.aws.sagemaker/s-3-uri] :opt-un [:portkey.aws.sagemaker.s-3-data-source/s-3-data-distribution-type :portkey.aws.sagemaker/attribute-names]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.search-expression/filters (clojure.spec.alpha/and :portkey.aws.sagemaker/filter-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.search-expression/nested-filters (clojure.spec.alpha/and :portkey.aws.sagemaker/nested-filters-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.search-expression/sub-expressions (clojure.spec.alpha/and :portkey.aws.sagemaker/search-expression-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.search-expression/operator (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean-operator))
(clojure.spec.alpha/def :portkey.aws.sagemaker/search-expression (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.search-expression/filters :portkey.aws.sagemaker.search-expression/nested-filters :portkey.aws.sagemaker.search-expression/sub-expressions :portkey.aws.sagemaker.search-expression/operator]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/stopping-condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/max-runtime-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-transform-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/search-results-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/search-record))

(clojure.spec.alpha/def :portkey.aws.sagemaker/property-name-query (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/property-name-hint] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parent-hyper-parameter-tuning-jobs (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/parent-hyper-parameter-tuning-job :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.sagemaker.human-task-config/pre-human-task-lambda-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/lambda-function-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker/human-task-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam-arn :portkey.aws.sagemaker/ui-config :portkey.aws.sagemaker.human-task-config/pre-human-task-lambda-arn :portkey.aws.sagemaker/task-title :portkey.aws.sagemaker/task-description :portkey.aws.sagemaker/number-of-human-workers-per-data-object :portkey.aws.sagemaker/task-time-limit-in-seconds :portkey.aws.sagemaker/annotation-consolidation-config] :opt-un [:portkey.aws.sagemaker/public-workforce-task-price :portkey.aws.sagemaker/task-availability-lifetime-in-seconds :portkey.aws.sagemaker/max-concurrent-task-count :portkey.aws.sagemaker/task-keywords]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/compression-types (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/compression-type))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/transform-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-model-packages-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-model-packages-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-model-packages-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/model-package-sort-by))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-model-packages-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-model-packages-input/creation-time-after :portkey.aws.sagemaker.list-model-packages-input/creation-time-before :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker/name-contains :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-model-packages-input/sort-by :portkey.aws.sagemaker/sort-order]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/tag-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/tag :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.sagemaker/secondary-status #{:uploading "Failed" :starting "Downloading" "LaunchingMLInstances" :completed :max-runtime-exceeded "DownloadingTrainingImage" :stopping :downloading :stopped "PreparingTrainingStack" "MaxRuntimeExceeded" :downloading-training-image "Uploading" "Stopping" :training "Starting" :preparing-training-stack "Stopped" "Completed" "Training" :launching-ml-instances :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/stop-transform-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-transform-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/code-repository-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-specification/name (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-specification/description (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-description))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-specification/type (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-specification/range (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-range))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-specification/is-tunable (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-specification/is-required (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-specification/default-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.hyper-parameter-specification/name :portkey.aws.sagemaker.hyper-parameter-specification/type] :opt-un [:portkey.aws.sagemaker.hyper-parameter-specification/description :portkey.aws.sagemaker.hyper-parameter-specification/range :portkey.aws.sagemaker.hyper-parameter-specification/is-tunable :portkey.aws.sagemaker.hyper-parameter-specification/is-required :portkey.aws.sagemaker.hyper-parameter-specification/default-value]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-name :portkey.aws.sagemaker/notebook-instance-lifecycle-config-arn] :opt-un [:portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.render-ui-template-request/task (clojure.spec.alpha/and :portkey.aws.sagemaker/renderable-task))
(clojure.spec.alpha/def :portkey.aws.sagemaker/render-ui-template-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/ui-template :portkey.aws.sagemaker.render-ui-template-request/task :portkey.aws.sagemaker/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/environment-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.categorical-parameter-range/name (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.categorical-parameter-range/values (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-values))
(clojure.spec.alpha/def :portkey.aws.sagemaker/categorical-parameter-range (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.categorical-parameter-range/name :portkey.aws.sagemaker.categorical-parameter-range/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective-type #{"Maximize" "Minimize" :maximize :minimize})

(clojure.spec.alpha/def :portkey.aws.sagemaker/git-config-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^https://([^/]+)/?(.*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/cognito-user-pool (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 55)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\w-]+_[0-9a-zA-Z]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/compilation-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:compilation-job/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-resource-config/volume-kms-key-id (clojure.spec.alpha/and :portkey.aws.sagemaker/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-resource-config (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.labeling-job-resource-config/volume-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-summary/training-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name :portkey.aws.sagemaker/training-job-arn :portkey.aws.sagemaker.training-job-summary/creation-time :portkey.aws.sagemaker/training-job-status] :opt-un [:portkey.aws.sagemaker.training-job-summary/training-end-time :portkey.aws.sagemaker.training-job-summary/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-runtime-in-seconds (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/success clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-environment-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z_][a-zA-Z0-9_]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-input/primary-container (clojure.spec.alpha/and :portkey.aws.sagemaker/container-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-input/containers (clojure.spec.alpha/and :portkey.aws.sagemaker/container-definition-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-input/execution-role-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/role-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-input/enable-network-isolation (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-name :portkey.aws.sagemaker.create-model-input/execution-role-arn] :opt-un [:portkey.aws.sagemaker.create-model-input/primary-container :portkey.aws.sagemaker.create-model-input/containers :portkey.aws.sagemaker.create-model-input/tags :portkey.aws.sagemaker/vpc-config :portkey.aws.sagemaker.create-model-input/enable-network-isolation]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/label-attribute-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 127)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-definition-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/metric-definition :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker/string-200 (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 200))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-validation-specification/validation-role (clojure.spec.alpha/and :portkey.aws.sagemaker/role-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-validation-specification/validation-profiles (clojure.spec.alpha/and :portkey.aws.sagemaker/model-package-validation-profiles))
(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-validation-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.model-package-validation-specification/validation-role :portkey.aws.sagemaker.model-package-validation-specification/validation-profiles] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/task-keywords (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/task-keyword :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-endpoint-config-output/production-variants (clojure.spec.alpha/and :portkey.aws.sagemaker/production-variant-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-endpoint-config-output/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-endpoint-config-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-name :portkey.aws.sagemaker/endpoint-config-arn :portkey.aws.sagemaker.describe-endpoint-config-output/production-variants :portkey.aws.sagemaker.describe-endpoint-config-output/creation-time] :opt-un [:portkey.aws.sagemaker/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-sort-key #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[A-Za-z0-9\.\-_]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-code-repository-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/code-repository-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/categorical-parameter-ranges (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/categorical-parameter-range :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-input/volume-size-in-gb (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-volume-size-in-gb))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-input/accelerator-types (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-accelerator-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-input/default-code-repository (clojure.spec.alpha/and :portkey.aws.sagemaker/code-repository-name-or-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-input/additional-code-repositories (clojure.spec.alpha/and :portkey.aws.sagemaker/additional-code-repository-names-or-urls))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-input/lifecycle-config-name (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name :portkey.aws.sagemaker/instance-type :portkey.aws.sagemaker/role-arn] :opt-un [:portkey.aws.sagemaker.create-notebook-instance-input/volume-size-in-gb :portkey.aws.sagemaker/security-group-ids :portkey.aws.sagemaker/subnet-id :portkey.aws.sagemaker.create-notebook-instance-input/accelerator-types :portkey.aws.sagemaker.create-notebook-instance-input/tags :portkey.aws.sagemaker.create-notebook-instance-input/default-code-repository :portkey.aws.sagemaker/direct-internet-access :portkey.aws.sagemaker.create-notebook-instance-input/additional-code-repositories :portkey.aws.sagemaker/kms-key-id :portkey.aws.sagemaker.create-notebook-instance-input/lifecycle-config-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/search-expression-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/search-expression :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-endpoint-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/stop-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter-tuning-job/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-summary/model-package-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-summary/model-package-description (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-description))
(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.model-package-summary/model-package-name :portkey.aws.sagemaker/model-package-arn :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/model-package-status] :opt-un [:portkey.aws.sagemaker.model-package-summary/model-package-description]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/start-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/notebook-instance-lifecycle-hook :max-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker.nested-filters/nested-property-name (clojure.spec.alpha/and :portkey.aws.sagemaker/resource-property-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.nested-filters/filters (clojure.spec.alpha/and :portkey.aws.sagemaker/filter-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/nested-filters (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.nested-filters/nested-property-name :portkey.aws.sagemaker.nested-filters/filters] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.model-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/model-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-name :portkey.aws.sagemaker/model-arn :portkey.aws.sagemaker.model-summary/creation-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-algorithm-specification/training-image (clojure.spec.alpha/and :portkey.aws.sagemaker/algorithm-image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-algorithm-specification/algorithm-name (clojure.spec.alpha/and :portkey.aws.sagemaker/arn-or-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-algorithm-specification/metric-definitions (clojure.spec.alpha/and :portkey.aws.sagemaker/metric-definition-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-algorithm-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-input-mode] :opt-un [:portkey.aws.sagemaker.hyper-parameter-algorithm-specification/training-image :portkey.aws.sagemaker.hyper-parameter-algorithm-specification/algorithm-name :portkey.aws.sagemaker.hyper-parameter-algorithm-specification/metric-definitions]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^(https|s3)://([^/]+)/?(.*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-algorithm-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/algorithm-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 16384))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/algorithm-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.delete-tags-input/tag-keys (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/resource-arn :portkey.aws.sagemaker.delete-tags-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.container-definition/model-data-url (clojure.spec.alpha/and :portkey.aws.sagemaker/url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.container-definition/environment (clojure.spec.alpha/and :portkey.aws.sagemaker/environment-map))
(clojure.spec.alpha/def :portkey.aws.sagemaker.container-definition/model-package-name (clojure.spec.alpha/and :portkey.aws.sagemaker/arn-or-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/container-definition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/container-hostname :portkey.aws.sagemaker/image :portkey.aws.sagemaker.container-definition/model-data-url :portkey.aws.sagemaker.container-definition/environment :portkey.aws.sagemaker.container-definition/model-package-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/seed clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-property-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/lambda-function-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_\.]+(:(\$LATEST|[a-zA-Z0-9-_]+))?" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/model-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/property-name-suggestion-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/property-name-suggestion))

(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-validation-profile/profile-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-validation-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.model-package-validation-profile/profile-name :portkey.aws.sagemaker/transform-job-definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-input/volume-size-in-gb (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-volume-size-in-gb))
(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-input/accelerator-types (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-accelerator-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-input/default-code-repository (clojure.spec.alpha/and :portkey.aws.sagemaker/code-repository-name-or-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-input/additional-code-repositories (clojure.spec.alpha/and :portkey.aws.sagemaker/additional-code-repository-names-or-urls))
(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-input/disassociate-accelerator-types (clojure.spec.alpha/and :portkey.aws.sagemaker/disassociate-notebook-instance-accelerator-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-input/disassociate-lifecycle-config (clojure.spec.alpha/and :portkey.aws.sagemaker/disassociate-notebook-instance-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-input/lifecycle-config-name (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/update-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un [:portkey.aws.sagemaker.update-notebook-instance-input/volume-size-in-gb :portkey.aws.sagemaker/instance-type :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker.update-notebook-instance-input/accelerator-types :portkey.aws.sagemaker.update-notebook-instance-input/default-code-repository :portkey.aws.sagemaker.update-notebook-instance-input/additional-code-repositories :portkey.aws.sagemaker/disassociate-default-code-repository :portkey.aws.sagemaker.update-notebook-instance-input/disassociate-accelerator-types :portkey.aws.sagemaker/disassociate-additional-code-repositories :portkey.aws.sagemaker.update-notebook-instance-input/disassociate-lifecycle-config :portkey.aws.sagemaker.update-notebook-instance-input/lifecycle-config-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-input-config/data-source (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-data-source))
(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-input-config/data-attributes (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-data-attributes))
(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-input-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.labeling-job-input-config/data-source] :opt-un [:portkey.aws.sagemaker.labeling-job-input-config/data-attributes]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-ranges (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/integer-parameter-ranges :portkey.aws.sagemaker/continuous-parameter-ranges :portkey.aws.sagemaker/categorical-parameter-ranges]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant/initial-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant/instance-type (clojure.spec.alpha/and :portkey.aws.sagemaker/production-variant-instance-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant/initial-variant-weight (clojure.spec.alpha/and :portkey.aws.sagemaker/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant/accelerator-type (clojure.spec.alpha/and :portkey.aws.sagemaker/production-variant-accelerator-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/variant-name :portkey.aws.sagemaker/model-name :portkey.aws.sagemaker.production-variant/initial-instance-count :portkey.aws.sagemaker.production-variant/instance-type] :opt-un [:portkey.aws.sagemaker.production-variant/initial-variant-weight :portkey.aws.sagemaker.production-variant/accelerator-type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/disassociate-default-code-repository clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/container-definition-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/container-definition :max-count 5))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-status-item-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/model-package-status-item))

(clojure.spec.alpha/def :portkey.aws.sagemaker/security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-status-item-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/algorithm-status-item))

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/enable-network-isolation (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/training-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/tuning-job-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/training-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/enable-inter-container-traffic-encryption (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-training-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name :portkey.aws.sagemaker/training-job-arn :portkey.aws.sagemaker/model-artifacts :portkey.aws.sagemaker/training-job-status :portkey.aws.sagemaker/secondary-status :portkey.aws.sagemaker/algorithm-specification :portkey.aws.sagemaker/resource-config :portkey.aws.sagemaker/stopping-condition :portkey.aws.sagemaker.describe-training-job-response/creation-time] :opt-un [:portkey.aws.sagemaker.describe-training-job-response/enable-network-isolation :portkey.aws.sagemaker/input-data-config :portkey.aws.sagemaker/labeling-job-arn :portkey.aws.sagemaker.describe-training-job-response/training-end-time :portkey.aws.sagemaker/output-data-config :portkey.aws.sagemaker/hyper-parameters :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker/vpc-config :portkey.aws.sagemaker.describe-training-job-response/tuning-job-arn :portkey.aws.sagemaker/final-metric-data-list :portkey.aws.sagemaker.describe-training-job-response/training-start-time :portkey.aws.sagemaker.describe-training-job-response/last-modified-time :portkey.aws.sagemaker.describe-training-job-response/enable-inter-container-traffic-encryption :portkey.aws.sagemaker/secondary-status-transitions]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.notebook-instance-lifecycle-hook/content (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-content))
(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-hook (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.notebook-instance-lifecycle-hook/content]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-status #{"Failed" :in-progress :pending :completed :deleting "Deleting" "InProgress" "Completed" "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.channel-specification/name (clojure.spec.alpha/and :portkey.aws.sagemaker/channel-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.channel-specification/description (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-description))
(clojure.spec.alpha/def :portkey.aws.sagemaker.channel-specification/is-required (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker.channel-specification/supported-content-types (clojure.spec.alpha/and :portkey.aws.sagemaker/content-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker.channel-specification/supported-compression-types (clojure.spec.alpha/and :portkey.aws.sagemaker/compression-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker.channel-specification/supported-input-modes (clojure.spec.alpha/and :portkey.aws.sagemaker/input-modes))
(clojure.spec.alpha/def :portkey.aws.sagemaker/channel-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.channel-specification/name :portkey.aws.sagemaker.channel-specification/supported-content-types :portkey.aws.sagemaker.channel-specification/supported-input-modes] :opt-un [:portkey.aws.sagemaker.channel-specification/description :portkey.aws.sagemaker.channel-specification/is-required :portkey.aws.sagemaker.channel-specification/supported-compression-types]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/failure-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/cognito-client-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\w+]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.endpoint-config-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-name :portkey.aws.sagemaker/endpoint-config-arn :portkey.aws.sagemaker.endpoint-config-summary/creation-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/code-repository-sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/compilation-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/compilation-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-status #{"Failed" :in-progress :pending :completed :deleting "Deleting" "InProgress" "Completed" "Pending" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.inference-specification/containers (clojure.spec.alpha/and :portkey.aws.sagemaker/model-package-container-definition-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.inference-specification/supported-transform-instance-types (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-instance-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker.inference-specification/supported-realtime-inference-instance-types (clojure.spec.alpha/and :portkey.aws.sagemaker/realtime-inference-instance-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker.inference-specification/supported-content-types (clojure.spec.alpha/and :portkey.aws.sagemaker/content-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker.inference-specification/supported-response-mime-types (clojure.spec.alpha/and :portkey.aws.sagemaker/response-mime-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker/inference-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.inference-specification/containers :portkey.aws.sagemaker.inference-specification/supported-transform-instance-types :portkey.aws.sagemaker.inference-specification/supported-realtime-inference-instance-types :portkey.aws.sagemaker.inference-specification/supported-content-types :portkey.aws.sagemaker.inference-specification/supported-response-mime-types] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/resource-arn :portkey.aws.sagemaker.add-tags-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:transform-job/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-status-details/validation-statuses (clojure.spec.alpha/and :portkey.aws.sagemaker/model-package-status-item-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.model-package-status-details/image-scan-statuses (clojure.spec.alpha/and :portkey.aws.sagemaker/model-package-status-item-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-status-details (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.model-package-status-details/validation-statuses] :opt-un [:portkey.aws.sagemaker.model-package-status-details/image-scan-statuses]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/task-keyword (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 30)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[A-Za-z0-9]+( [A-Za-z0-9]+)*$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.annotation-consolidation-config/annotation-consolidation-lambda-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/lambda-function-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker/annotation-consolidation-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.annotation-consolidation-config/annotation-consolidation-lambda-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-model-package-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-package-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/endpoint-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/endpoint-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker/order-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-input/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-input/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-input/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/endpoint-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-input/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-endpoints-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-endpoints-input/creation-time-after :portkey.aws.sagemaker.list-endpoints-input/name-contains :portkey.aws.sagemaker.list-endpoints-input/sort-by :portkey.aws.sagemaker.list-endpoints-input/creation-time-before :portkey.aws.sagemaker.list-endpoints-input/sort-order :portkey.aws.sagemaker.list-endpoints-input/next-token :portkey.aws.sagemaker.list-endpoints-input/last-modified-time-after :portkey.aws.sagemaker.list-endpoints-input/status-equals :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-endpoints-input/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-validation-profile/profile-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-validation-profile (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.algorithm-validation-profile/profile-name :portkey.aws.sagemaker/training-job-definition] :opt-un [:portkey.aws.sagemaker/transform-job-definition]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/framework #{"ONNX" :pytorch "MXNET" :onnx "PYTORCH" :tensorflow :xgboost "XGBOOST" "TENSORFLOW" :mxnet})

(clojure.spec.alpha/def :portkey.aws.sagemaker/batch-strategy #{"MultiRecord" :multi-record "SingleRecord" :single-record})

(clojure.spec.alpha/def :portkey.aws.sagemaker/source-algorithm-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/source-algorithm :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-specifications (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/hyper-parameter-specification :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-package-input/model-package-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-package-input/model-package-description (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-description))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-package-input/validation-specification (clojure.spec.alpha/and :portkey.aws.sagemaker/model-package-validation-specification))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-model-package-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.create-model-package-input/model-package-name] :opt-un [:portkey.aws.sagemaker.create-model-package-input/model-package-description :portkey.aws.sagemaker/inference-specification :portkey.aws.sagemaker.create-model-package-input/validation-specification :portkey.aws.sagemaker/source-algorithm-specification :portkey.aws.sagemaker/certify-for-marketplace]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/account-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^\d+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/dollars (clojure.spec.alpha/int-in 0 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker/environment-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z_][a-zA-Z0-9_]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/endpoint-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/s-3-data-source] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/notebook-instance-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-package-output/model-package-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-package-output/validation-specification (clojure.spec.alpha/and :portkey.aws.sagemaker/model-package-validation-specification))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-package-output/model-package-description (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-description))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-model-package-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.describe-model-package-output/model-package-name :portkey.aws.sagemaker/model-package-arn :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/model-package-status :portkey.aws.sagemaker/model-package-status-details] :opt-un [:portkey.aws.sagemaker/certify-for-marketplace :portkey.aws.sagemaker/inference-specification :portkey.aws.sagemaker/source-algorithm-specification :portkey.aws.sagemaker.describe-model-package-output/validation-specification :portkey.aws.sagemaker.describe-model-package-output/model-package-description]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.source-algorithm-specification/source-algorithms (clojure.spec.alpha/and :portkey.aws.sagemaker/source-algorithm-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/source-algorithm-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.source-algorithm-specification/source-algorithms] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-status-counters/completed (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-status-counters/in-progress (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-status-counters/retryable-error (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-status-counters/non-retryable-error (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-status-counters/stopped (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-status-counters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.training-job-status-counters/completed :portkey.aws.sagemaker.training-job-status-counters/in-progress :portkey.aws.sagemaker.training-job-status-counters/retryable-error :portkey.aws.sagemaker.training-job-status-counters/non-retryable-error :portkey.aws.sagemaker.training-job-status-counters/stopped]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/assembly-type #{"Line" "None" :line :none})

(clojure.spec.alpha/def :portkey.aws.sagemaker.delete-code-repository-input/code-repository-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-code-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.delete-code-repository-input/code-repository-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/variant-weight clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-sort-by #{:name "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.source-algorithm/model-data-url (clojure.spec.alpha/and :portkey.aws.sagemaker/url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.source-algorithm/algorithm-name (clojure.spec.alpha/and :portkey.aws.sagemaker/arn-or-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/source-algorithm (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.source-algorithm/algorithm-name] :opt-un [:portkey.aws.sagemaker.source-algorithm/model-data-url]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/split-type #{:tf-record "RecordIO" "Line" "None" :line :record-io "TFRecord" :none})

(clojure.spec.alpha/def :portkey.aws.sagemaker/boolean-operator #{"And" :or "Or" :and})

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/integer-parameter-range-specification :portkey.aws.sagemaker/continuous-parameter-range-specification :portkey.aws.sagemaker/categorical-parameter-range-specification]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-type #{"TrainingJob" :training-job})

(clojure.spec.alpha/def :portkey.aws.sagemaker.training-specification/training-image (clojure.spec.alpha/and :portkey.aws.sagemaker/image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-specification/training-image-digest (clojure.spec.alpha/and :portkey.aws.sagemaker/image-digest))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-specification/supported-hyper-parameters (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-specifications))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-specification/supported-training-instance-types (clojure.spec.alpha/and :portkey.aws.sagemaker/training-instance-types))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-specification/supports-distributed-training (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-specification/metric-definitions (clojure.spec.alpha/and :portkey.aws.sagemaker/metric-definition-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-specification/training-channels (clojure.spec.alpha/and :portkey.aws.sagemaker/channel-specifications))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-specification/supported-tuning-job-objective-metrics (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-objectives))
(clojure.spec.alpha/def :portkey.aws.sagemaker/training-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.training-specification/training-image :portkey.aws.sagemaker.training-specification/supported-training-instance-types :portkey.aws.sagemaker.training-specification/training-channels] :opt-un [:portkey.aws.sagemaker.training-specification/training-image-digest :portkey.aws.sagemaker.training-specification/supported-hyper-parameters :portkey.aws.sagemaker.training-specification/supports-distributed-training :portkey.aws.sagemaker.training-specification/metric-definitions :portkey.aws.sagemaker.training-specification/supported-tuning-job-objective-metrics]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/search-sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-input-mode :portkey.aws.sagemaker/input-data-config :portkey.aws.sagemaker/output-data-config :portkey.aws.sagemaker/resource-config :portkey.aws.sagemaker/stopping-condition] :opt-un [:portkey.aws.sagemaker/hyper-parameters]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/target-device #{"rasp3b" "ml_c5" "ml_p3" :rasp-3b :ml-c-4 :jetson-tx-1 "jetson_tx1" :ml-c-5 :jetson-tx-2 "ml_p2" "ml_c4" :ml-m-4 "deeplens" :ml-m-5 :ml-p-2 "ml_m5" :deeplens :ml-p-3 "ml_m4" "jetson_tx2"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/product-listings (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/string))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-sort-by-options #{:name "FinalObjectiveMetricValue" "Status" :status "CreationTime" "Name" :final-objective-metric-value :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-warm-start-type #{"IdenticalDataAndAlgorithm" :transfer-learning :identical-data-and-algorithm "TransferLearning"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/disassociate-additional-code-repositories clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-value clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-container-definition-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/model-package-container-definition :min-count 1 :max-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-request/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-sort-by-options))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name] :opt-un [:portkey.aws.sagemaker/next-token :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-request/status-equals :portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-request/sort-by :portkey.aws.sagemaker/sort-order]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.compilation-job-summary/compilation-job-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.compilation-job-summary/compilation-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.compilation-job-summary/compilation-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.compilation-job-summary/compilation-target-device (clojure.spec.alpha/and :portkey.aws.sagemaker/target-device))
(clojure.spec.alpha/def :portkey.aws.sagemaker/compilation-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.compilation-job-summary/compilation-job-name :portkey.aws.sagemaker/compilation-job-arn :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker.compilation-job-summary/compilation-target-device :portkey.aws.sagemaker/compilation-job-status] :opt-un [:portkey.aws.sagemaker.compilation-job-summary/compilation-start-time :portkey.aws.sagemaker.compilation-job-summary/compilation-end-time :portkey.aws.sagemaker/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/production-variant-summary :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant-summary/current-weight (clojure.spec.alpha/and :portkey.aws.sagemaker/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant-summary/desired-weight (clojure.spec.alpha/and :portkey.aws.sagemaker/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant-summary/current-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant-summary/desired-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/variant-name] :opt-un [:portkey.aws.sagemaker/deployed-images :portkey.aws.sagemaker.production-variant-summary/current-weight :portkey.aws.sagemaker.production-variant-summary/desired-weight :portkey.aws.sagemaker.production-variant-summary/current-instance-count :portkey.aws.sagemaker.production-variant-summary/desired-instance-count]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/creation-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/operator #{:less-than :contains "GreaterThanOrEqualTo" "Contains" "NotEquals" "LessThan" :greater-than "LessThanOrEqualTo" :equals "GreaterThan" :greater-than-or-equal-to :less-than-or-equal-to :not-equals "Equals"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-workteam-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-status-item/name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-status-item/status (clojure.spec.alpha/and :portkey.aws.sagemaker/detailed-algorithm-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-status-item/failure-reason (clojure.spec.alpha/and :portkey.aws.sagemaker/string))
(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-status-item (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.algorithm-status-item/name :portkey.aws.sagemaker.algorithm-status-item/status] :opt-un [:portkey.aws.sagemaker.algorithm-status-item/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-summary/training-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-summary/tuned-hyper-parameters (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameters))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-summary/tuning-job-name (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-summary/training-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-training-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name :portkey.aws.sagemaker/training-job-arn :portkey.aws.sagemaker.hyper-parameter-training-job-summary/creation-time :portkey.aws.sagemaker/training-job-status :portkey.aws.sagemaker.hyper-parameter-training-job-summary/tuned-hyper-parameters] :opt-un [:portkey.aws.sagemaker.hyper-parameter-training-job-summary/training-end-time :portkey.aws.sagemaker/final-hyper-parameter-tuning-job-objective-metric :portkey.aws.sagemaker/objective-status :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker.hyper-parameter-training-job-summary/tuning-job-name :portkey.aws.sagemaker.hyper-parameter-training-job-summary/training-start-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/rendering-error-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/rendering-error))

(clojure.spec.alpha/def :portkey.aws.sagemaker.metric-definition/name (clojure.spec.alpha/and :portkey.aws.sagemaker/metric-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.metric-definition/regex (clojure.spec.alpha/and :portkey.aws.sagemaker/metric-regex))
(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.metric-definition/name :portkey.aws.sagemaker.metric-definition/regex] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.vpc-config/security-group-ids (clojure.spec.alpha/and :portkey.aws.sagemaker/vpc-security-group-ids))
(clojure.spec.alpha/def :portkey.aws.sagemaker/vpc-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.vpc-config/security-group-ids :portkey.aws.sagemaker/subnets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.notebook-instance-summary/default-code-repository (clojure.spec.alpha/and :portkey.aws.sagemaker/code-repository-name-or-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.notebook-instance-summary/url (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.notebook-instance-summary/additional-code-repositories (clojure.spec.alpha/and :portkey.aws.sagemaker/additional-code-repository-names-or-urls))
(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name :portkey.aws.sagemaker/notebook-instance-arn] :opt-un [:portkey.aws.sagemaker/instance-type :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name :portkey.aws.sagemaker/notebook-instance-status :portkey.aws.sagemaker.notebook-instance-summary/default-code-repository :portkey.aws.sagemaker.notebook-instance-summary/url :portkey.aws.sagemaker.notebook-instance-summary/additional-code-repositories :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.ui-template/content (clojure.spec.alpha/and :portkey.aws.sagemaker/template-content))
(clojure.spec.alpha/def :portkey.aws.sagemaker/ui-template (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.ui-template/content] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-s-3-data-source/manifest-s-3-uri (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-s-3-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.labeling-job-s-3-data-source/manifest-s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/label-counter (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 32)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-status #{"Failed" :in-progress :completed :stopping :stopped "InProgress" "Stopping" "Stopped" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-output/s-3-output-path (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-output/assemble-with (clojure.spec.alpha/and :portkey.aws.sagemaker/assembly-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.transform-output/s-3-output-path] :opt-un [:portkey.aws.sagemaker/accept :portkey.aws.sagemaker.transform-output/assemble-with :portkey.aws.sagemaker/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/desired-weight-and-capacity-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/desired-weight-and-capacity :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/notebook-instance-lifecycle-config-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-notebook-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-definition/enable-network-isolation (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-definition/enable-inter-container-traffic-encryption (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-definition/algorithm-specification (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-algorithm-specification))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-definition/static-hyper-parameters (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameters))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-training-job-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.hyper-parameter-training-job-definition/algorithm-specification :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/output-data-config :portkey.aws.sagemaker/resource-config :portkey.aws.sagemaker/stopping-condition] :opt-un [:portkey.aws.sagemaker.hyper-parameter-training-job-definition/enable-network-isolation :portkey.aws.sagemaker/input-data-config :portkey.aws.sagemaker/vpc-config :portkey.aws.sagemaker.hyper-parameter-training-job-definition/enable-inter-container-traffic-encryption :portkey.aws.sagemaker.hyper-parameter-training-job-definition/static-hyper-parameters]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.search-request/resource (clojure.spec.alpha/and :portkey.aws.sagemaker/resource-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.search-request/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/resource-property-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.search-request/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker/search-sort-order))
(clojure.spec.alpha/def :portkey.aws.sagemaker/search-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.search-request/resource] :opt-un [:portkey.aws.sagemaker/search-expression :portkey.aws.sagemaker.search-request/sort-by :portkey.aws.sagemaker.search-request/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker/max-results]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-algorithm-input/algorithm-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-algorithm-input/algorithm-description (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-description))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-algorithm-input/validation-specification (clojure.spec.alpha/and :portkey.aws.sagemaker/algorithm-validation-specification))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-algorithm-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.create-algorithm-input/algorithm-name :portkey.aws.sagemaker/training-specification] :opt-un [:portkey.aws.sagemaker.create-algorithm-input/algorithm-description :portkey.aws.sagemaker/inference-specification :portkey.aws.sagemaker.create-algorithm-input/validation-specification :portkey.aws.sagemaker/certify-for-marketplace]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-compilation-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/compilation-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/stop-labeling-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/labeling-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/strategy (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-strategy-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/hyper-parameter-tuning-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name :portkey.aws.sagemaker/hyper-parameter-tuning-job-arn :portkey.aws.sagemaker/hyper-parameter-tuning-job-status :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/strategy :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/creation-time :portkey.aws.sagemaker/training-job-status-counters :portkey.aws.sagemaker/objective-status-counters] :opt-un [:portkey.aws.sagemaker/resource-limits :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/hyper-parameter-tuning-end-time :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.model-artifacts/s-3-model-artifacts (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker/model-artifacts (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.model-artifacts/s-3-model-artifacts] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.desired-weight-and-capacity/desired-weight (clojure.spec.alpha/and :portkey.aws.sagemaker/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.desired-weight-and-capacity/desired-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker/desired-weight-and-capacity (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/variant-name] :opt-un [:portkey.aws.sagemaker.desired-weight-and-capacity/desired-weight :portkey.aws.sagemaker.desired-weight-and-capacity/desired-instance-count]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/record-wrapper #{"RecordIO" "None" :record-io :none})

(clojure.spec.alpha/def :portkey.aws.sagemaker/final-metric-data-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/metric-data :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-summary/annotation-consolidation-lambda-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/lambda-function-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-summary/input-config (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-input-config))
(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-summary/pre-human-task-lambda-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/lambda-function-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/labeling-job-name :portkey.aws.sagemaker/labeling-job-arn :portkey.aws.sagemaker.labeling-job-summary/creation-time :portkey.aws.sagemaker.labeling-job-summary/last-modified-time :portkey.aws.sagemaker/labeling-job-status :portkey.aws.sagemaker/label-counters :portkey.aws.sagemaker/workteam-arn :portkey.aws.sagemaker.labeling-job-summary/pre-human-task-lambda-arn] :opt-un [:portkey.aws.sagemaker.labeling-job-summary/annotation-consolidation-lambda-arn :portkey.aws.sagemaker.labeling-job-summary/input-config :portkey.aws.sagemaker/labeling-job-output :portkey.aws.sagemaker/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.channel/record-wrapper-type (clojure.spec.alpha/and :portkey.aws.sagemaker/record-wrapper))
(clojure.spec.alpha/def :portkey.aws.sagemaker.channel/input-mode (clojure.spec.alpha/and :portkey.aws.sagemaker/training-input-mode))
(clojure.spec.alpha/def :portkey.aws.sagemaker/channel (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/channel-name :portkey.aws.sagemaker/data-source] :opt-un [:portkey.aws.sagemaker/content-type :portkey.aws.sagemaker/compression-type :portkey.aws.sagemaker.channel/record-wrapper-type :portkey.aws.sagemaker.channel/input-mode :portkey.aws.sagemaker/shuffle-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-request/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-request/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-training-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-training-jobs-request/creation-time-after :portkey.aws.sagemaker/name-contains :portkey.aws.sagemaker/sort-by :portkey.aws.sagemaker.list-training-jobs-request/creation-time-before :portkey.aws.sagemaker/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-training-jobs-request/last-modified-time-after :portkey.aws.sagemaker.list-training-jobs-request/status-equals :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-training-jobs-request/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-objective/type (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.hyper-parameter-tuning-job-objective/type :portkey.aws.sagemaker/metric-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/stop-training-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/disassociate-notebook-instance-lifecycle-config clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-hyper-parameter-tuning-job-request/training-job-definition (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-training-job-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-hyper-parameter-tuning-job-request/warm-start-config (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-warm-start-config))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-hyper-parameter-tuning-job-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name :portkey.aws.sagemaker/hyper-parameter-tuning-job-config :portkey.aws.sagemaker.create-hyper-parameter-tuning-job-request/training-job-definition] :opt-un [:portkey.aws.sagemaker.create-hyper-parameter-tuning-job-request/warm-start-config :portkey.aws.sagemaker.create-hyper-parameter-tuning-job-request/tags]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.secondary-status-transition/status (clojure.spec.alpha/and :portkey.aws.sagemaker/secondary-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.secondary-status-transition/start-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.secondary-status-transition/end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/secondary-status-transition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.secondary-status-transition/status :portkey.aws.sagemaker.secondary-status-transition/start-time] :opt-un [:portkey.aws.sagemaker.secondary-status-transition/end-time :portkey.aws.sagemaker/status-message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-volume-size-in-gb (clojure.spec.alpha/int-in 5 16384))

(clojure.spec.alpha/def :portkey.aws.sagemaker.delete-algorithm-input/algorithm-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-algorithm-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.delete-algorithm-input/algorithm-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-training-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.sagemaker/deployed-images (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/deployed-image))

(clojure.spec.alpha/def :portkey.aws.sagemaker.tag/key (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.tag/value (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.tag/key :portkey.aws.sagemaker.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-human-labeled-object-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/job-reference-code (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__)))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-stopping-conditions (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/max-human-labeled-object-count :portkey.aws.sagemaker/max-percentage-of-input-dataset-labeled]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-package-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:model-package/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/integer-parameter-ranges (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/integer-parameter-range :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.metric-data/value (clojure.spec.alpha/and :portkey.aws.sagemaker/float))
(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-data (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/metric-name :portkey.aws.sagemaker.metric-data/value :portkey.aws.sagemaker/timestamp]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-instance-type #{:mlm-5large :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.m5.xlarge" "ml.c5.xlarge" "ml.m4.2xlarge" "ml.c5.9xlarge" :mlm-54xlarge "ml.p2.16xlarge" :mlm-52xlarge "ml.m5.large" :mlc-54xlarge "ml.m5.12xlarge" "ml.c5.2xlarge" :mlc-52xlarge "ml.c4.2xlarge" "ml.c4.4xlarge" :mlm-410xlarge :mlm-512xlarge "ml.m4.4xlarge" "ml.m5.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge :mlc-48xlarge "ml.p3.16xlarge" :mlc-59xlarge :mlc-4xlarge "ml.c4.8xlarge" "ml.c5.18xlarge" :mlc-42xlarge :mlc-44xlarge "ml.m5.2xlarge" :mlc-518xlarge "ml.c4.xlarge" "ml.m5.24xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlm-524xlarge :mlp-2xlarge "ml.p3.8xlarge" :mlp-28xlarge :mlm-5xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" :mlc-5xlarge "ml.c5.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-algorithms-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-algorithms-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-algorithms-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/algorithm-sort-by))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-algorithms-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-algorithms-input/creation-time-after :portkey.aws.sagemaker.list-algorithms-input/creation-time-before :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker/name-contains :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-algorithms-input/sort-by :portkey.aws.sagemaker/sort-order]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.integer-parameter-range/name (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.integer-parameter-range/min-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.integer-parameter-range/max-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/integer-parameter-range (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.integer-parameter-range/name :portkey.aws.sagemaker.integer-parameter-range/min-value :portkey.aws.sagemaker.integer-parameter-range/max-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-image (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/task-time-limit-in-seconds (clojure.spec.alpha/int-in 1 3600))

(clojure.spec.alpha/def :portkey.aws.sagemaker/task-title (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[\t\n\r -\uD7FF\uE000-\uFFFD]*$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/last-modified-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-workteam-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-early-stopping-type #{"Off" "Auto" :off :auto})

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-labeling-job-request/input-config (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-input-config))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-labeling-job-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-labeling-job-request/stopping-conditions (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-stopping-conditions))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-labeling-job-request/label-category-config-s-3-uri (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-labeling-job-request/output-config (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-output-config))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-labeling-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/labeling-job-name :portkey.aws.sagemaker/label-attribute-name :portkey.aws.sagemaker.create-labeling-job-request/input-config :portkey.aws.sagemaker.create-labeling-job-request/output-config :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/human-task-config] :opt-un [:portkey.aws.sagemaker.create-labeling-job-request/tags :portkey.aws.sagemaker.create-labeling-job-request/stopping-conditions :portkey.aws.sagemaker.create-labeling-job-request/label-category-config-s-3-uri :portkey.aws.sagemaker/labeling-job-algorithms-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/content-types (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/content-type))

(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.sagemaker/failure-reason))
(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.resource-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/compilation-job-status #{"COMPLETED" :starting :inprogress :completed :stopping :stopped "STOPPED" "STARTING" "FAILED" "INPROGRESS" "STOPPING" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-status-details/validation-statuses (clojure.spec.alpha/and :portkey.aws.sagemaker/algorithm-status-item-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-status-details/image-scan-statuses (clojure.spec.alpha/and :portkey.aws.sagemaker/algorithm-status-item-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-status-details (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.algorithm-status-details/validation-statuses :portkey.aws.sagemaker.algorithm-status-details/image-scan-statuses]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-training-job-request/enable-network-isolation (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-training-job-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-training-job-request/enable-inter-container-traffic-encryption (clojure.spec.alpha/and :portkey.aws.sagemaker/boolean))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-training-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name :portkey.aws.sagemaker/algorithm-specification :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/output-data-config :portkey.aws.sagemaker/resource-config :portkey.aws.sagemaker/stopping-condition] :opt-un [:portkey.aws.sagemaker.create-training-job-request/enable-network-isolation :portkey.aws.sagemaker/input-data-config :portkey.aws.sagemaker/hyper-parameters :portkey.aws.sagemaker.create-training-job-request/tags :portkey.aws.sagemaker/vpc-config :portkey.aws.sagemaker.create-training-job-request/enable-inter-container-traffic-encryption]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/image (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\S]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/accept (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/training-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-compilation-jobs-sort-by #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-endpoint-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/git-config-for-update (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/secret-arn]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-endpoint-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/usd (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/dollars :portkey.aws.sagemaker/cents :portkey.aws.sagemaker/tenth-fractions-of-a-cent]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-not-found/message (clojure.spec.alpha/and :portkey.aws.sagemaker/failure-reason))
(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.resource-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/product-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-summaries] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.rendering-error/code (clojure.spec.alpha/and :portkey.aws.sagemaker/string))
(clojure.spec.alpha/def :portkey.aws.sagemaker.rendering-error/message (clojure.spec.alpha/and :portkey.aws.sagemaker/string))
(clojure.spec.alpha/def :portkey.aws.sagemaker/rendering-error (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.rendering-error/code :portkey.aws.sagemaker.rendering-error/message] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-presigned-notebook-instance-url-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un [:portkey.aws.sagemaker/session-expiration-duration-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-status #{"Failed" :in-progress :completed :stopping :stopped "InProgress" "Stopping" "Stopped" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-workteam-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-algorithms-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/algorithm-summary-list] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-transform-jobs-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-transform-jobs-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-transform-jobs-request/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-transform-jobs-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-transform-jobs-request/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-transform-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-transform-jobs-request/creation-time-after :portkey.aws.sagemaker/name-contains :portkey.aws.sagemaker/sort-by :portkey.aws.sagemaker.list-transform-jobs-request/creation-time-before :portkey.aws.sagemaker/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-transform-jobs-request/last-modified-time-after :portkey.aws.sagemaker.list-transform-jobs-request/status-equals :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-transform-jobs-request/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-subscribed-workteam-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.continuous-parameter-range/name (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.continuous-parameter-range/min-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.continuous-parameter-range/max-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/continuous-parameter-range (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.continuous-parameter-range/name :portkey.aws.sagemaker.continuous-parameter-range/min-value :portkey.aws.sagemaker.continuous-parameter-range/max-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-specification/training-image (clojure.spec.alpha/and :portkey.aws.sagemaker/algorithm-image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-specification/algorithm-name (clojure.spec.alpha/and :portkey.aws.sagemaker/arn-or-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-specification/metric-definitions (clojure.spec.alpha/and :portkey.aws.sagemaker/metric-definition-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-input-mode] :opt-un [:portkey.aws.sagemaker.algorithm-specification/training-image :portkey.aws.sagemaker.algorithm-specification/algorithm-name :portkey.aws.sagemaker.algorithm-specification/metric-definitions]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 20 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant-accelerator-type #{"ml.eia1.large" "ml.eia1.medium" "ml.eia1.xlarge" :mleia-1xlarge :mleia-1medium :mleia-1large})

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-output/endpoints (clojure.spec.alpha/and :portkey.aws.sagemaker/endpoint-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-output/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-endpoints-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.list-endpoints-output/endpoints] :opt-un [:portkey.aws.sagemaker.list-endpoints-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-data-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/content-classifiers]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-subscribed-workteam-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/subscribed-workteam] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-notebook-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/notebook-instance-arn]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-tags-input/max-results (clojure.spec.alpha/and :portkey.aws.sagemaker/list-tags-max-results))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/resource-arn] :opt-un [:portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-tags-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-code-repository-input/code-repository-name (clojure.spec.alpha/and :portkey.aws.sagemaker/entity-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-code-repository-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.create-code-repository-input/code-repository-name :portkey.aws.sagemaker/git-config] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/input-modes (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/training-input-mode :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-workteams-request/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/list-workteams-sort-by-options))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-workteams-request/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/workteam-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-workteams-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-workteams-request/sort-by :portkey.aws.sagemaker/sort-order :portkey.aws.sagemaker.list-workteams-request/name-contains :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker/max-results]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-tags-output/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-tags-output/tags :portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.render-ui-template-response/rendered-content (clojure.spec.alpha/and :portkey.aws.sagemaker/string))
(clojure.spec.alpha/def :portkey.aws.sagemaker.render-ui-template-response/errors (clojure.spec.alpha/and :portkey.aws.sagemaker/rendering-error-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/render-ui-template-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.render-ui-template-response/rendered-content :portkey.aws.sagemaker.render-ui-template-response/errors] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/filter-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/filter :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker/secondary-status-transitions (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/secondary-status-transition))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-algorithm-input/algorithm-name (clojure.spec.alpha/and :portkey.aws.sagemaker/arn-or-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-algorithm-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.describe-algorithm-input/algorithm-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.deployed-image/specified-image (clojure.spec.alpha/and :portkey.aws.sagemaker/image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.deployed-image/resolved-image (clojure.spec.alpha/and :portkey.aws.sagemaker/image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.deployed-image/resolution-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/deployed-image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.deployed-image/specified-image :portkey.aws.sagemaker.deployed-image/resolved-image :portkey.aws.sagemaker.deployed-image/resolution-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/filter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-labeling-jobs-for-workteam-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-labeling-jobs-for-workteam-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-labeling-jobs-for-workteam-request/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/list-labeling-jobs-for-workteam-sort-by-options))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-labeling-jobs-for-workteam-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/workteam-arn] :opt-un [:portkey.aws.sagemaker/max-results :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-labeling-jobs-for-workteam-request/creation-time-after :portkey.aws.sagemaker.list-labeling-jobs-for-workteam-request/creation-time-before :portkey.aws.sagemaker/job-reference-code-contains :portkey.aws.sagemaker.list-labeling-jobs-for-workteam-request/sort-by :portkey.aws.sagemaker/sort-order]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-endpoint-output/production-variants (clojure.spec.alpha/and :portkey.aws.sagemaker/production-variant-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-endpoint-output/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-endpoint-output/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-endpoint-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name :portkey.aws.sagemaker/endpoint-arn :portkey.aws.sagemaker/endpoint-config-name :portkey.aws.sagemaker/endpoint-status :portkey.aws.sagemaker.describe-endpoint-output/creation-time :portkey.aws.sagemaker.describe-endpoint-output/last-modified-time] :opt-un [:portkey.aws.sagemaker.describe-endpoint-output/production-variants :portkey.aws.sagemaker/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-sort-order))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/notebook-instance-lifecycle-config-name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/default-code-repository-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/code-repository-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/additional-code-repository-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/code-repository-name-or-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-notebook-instances-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-notebook-instances-input/creation-time-after :portkey.aws.sagemaker.list-notebook-instances-input/name-contains :portkey.aws.sagemaker.list-notebook-instances-input/sort-by :portkey.aws.sagemaker.list-notebook-instances-input/creation-time-before :portkey.aws.sagemaker.list-notebook-instances-input/sort-order :portkey.aws.sagemaker.list-notebook-instances-input/notebook-instance-lifecycle-config-name-contains :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-notebook-instances-input/last-modified-time-after :portkey.aws.sagemaker.list-notebook-instances-input/default-code-repository-contains :portkey.aws.sagemaker.list-notebook-instances-input/status-equals :portkey.aws.sagemaker.list-notebook-instances-input/additional-code-repository-equals :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-notebook-instances-input/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/code-repository-name-or-url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^https://([^/]+)/?(.*)$|^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-percentage-of-input-dataset-labeled (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:algorithm/.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-instance-type #{:mlm-5large :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.m5.xlarge" "ml.c5.xlarge" "ml.m4.2xlarge" "ml.c5.9xlarge" :mlm-54xlarge "ml.p2.16xlarge" :mlm-52xlarge "ml.m5.large" :mlc-54xlarge "ml.m5.12xlarge" "ml.c5.2xlarge" :mlc-52xlarge "ml.c4.2xlarge" "ml.c4.4xlarge" :mlm-410xlarge :mlm-512xlarge "ml.m4.4xlarge" "ml.m5.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge :mlc-48xlarge "ml.p3.16xlarge" :mlc-59xlarge :mlc-4xlarge "ml.c4.8xlarge" "ml.c5.18xlarge" :mlc-42xlarge :mlc-44xlarge "ml.m5.2xlarge" :mlc-518xlarge "ml.c4.xlarge" "ml.m5.24xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlm-524xlarge :mlp-2xlarge "ml.p3.8xlarge" :mlp-28xlarge :mlm-5xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" :mlc-5xlarge "ml.c5.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-in-use/message (clojure.spec.alpha/and :portkey.aws.sagemaker/failure-reason))
(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.resource-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-lifecycle-config-output/on-create (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-lifecycle-config-output/on-start (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-arn :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name :portkey.aws.sagemaker.describe-notebook-instance-lifecycle-config-output/on-create :portkey.aws.sagemaker.describe-notebook-instance-lifecycle-config-output/on-start :portkey.aws.sagemaker/last-modified-time :portkey.aws.sagemaker/creation-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-status #{"Failed" :in-progress :completed :stopping :stopped "InProgress" "Stopping" "Stopped" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 63)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-algorithms-config/initial-active-learning-model-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/model-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-algorithms-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/labeling-job-algorithm-specification-arn] :opt-un [:portkey.aws.sagemaker.labeling-job-algorithms-config/initial-active-learning-model-arn :portkey.aws.sagemaker/labeling-job-resource-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-training-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.labeling-job-data-source/s-3-data-source (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-s-3-data-source))
(clojure.spec.alpha/def :portkey.aws.sagemaker/labeling-job-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.labeling-job-data-source/s-3-data-source] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.get-search-suggestions-request/resource (clojure.spec.alpha/and :portkey.aws.sagemaker/resource-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker/get-search-suggestions-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.get-search-suggestions-request/resource] :opt-un [:portkey.aws.sagemaker/suggestion-query]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-labeling-jobs-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-labeling-jobs-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-labeling-jobs-request/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-labeling-jobs-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/labeling-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-labeling-jobs-request/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-labeling-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-labeling-jobs-request/creation-time-after :portkey.aws.sagemaker/name-contains :portkey.aws.sagemaker/sort-by :portkey.aws.sagemaker.list-labeling-jobs-request/creation-time-before :portkey.aws.sagemaker/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-labeling-jobs-request/last-modified-time-after :portkey.aws.sagemaker.list-labeling-jobs-request/status-equals :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-labeling-jobs-request/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.output-config/s-3-output-location (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker/output-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.output-config/s-3-output-location :portkey.aws.sagemaker/target-device] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-compilation-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/compilation-job-summaries] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.search-response/results (clojure.spec.alpha/and :portkey.aws.sagemaker/search-results-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/search-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.search-response/results :portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 20 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/content-classifier #{:free-of-adult-content "FreeOfAdultContent" "FreeOfPersonallyIdentifiableInformation" :free-of-personally-identifiable-information})

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-endpoint-config-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-output/notebook-instance-lifecycle-configs (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-output/notebook-instance-lifecycle-configs]))

(clojure.core/defn describe-labeling-job "Gets information about a labeling job." ([describe-labeling-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-labeling-job-request describe-labeling-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-labeling-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-labeling-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLabelingJob", :http.request.configuration/output-deser-fn response-describe-labeling-job-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-labeling-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-labeling-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-labeling-job-response))

(clojure.core/defn list-training-jobs-for-hyper-parameter-tuning-job "Gets a list of TrainingJobSummary objects that describe the training jobs that a\nhyperparameter tuning job launched." ([list-training-jobs-for-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-training-jobs-for-hyper-parameter-tuning-job-request list-training-jobs-for-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTrainingJobsForHyperParameterTuningJob", :http.request.configuration/output-deser-fn response-list-training-jobs-for-hyper-parameter-tuning-job-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef list-training-jobs-for-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-response))

(clojure.core/defn describe-compilation-job "Returns information about a model compilation job.\n To create a model compilation job, use CreateCompilationJob. To get information\nabout multiple model compilation jobs, use ListCompilationJobs." ([describe-compilation-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-compilation-job-request describe-compilation-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-compilation-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-compilation-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCompilationJob", :http.request.configuration/output-deser-fn response-describe-compilation-job-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-compilation-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-compilation-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-compilation-job-response))

(clojure.core/defn create-notebook-instance "Creates an Amazon SageMaker notebook instance. A notebook instance is a machine\nlearning (ML) compute instance running on a Jupyter notebook.\n In a CreateNotebookInstance request, specify the type of ML compute instance\nthat you want to run. Amazon SageMaker launches the instance, installs common\nlibraries that you can use to explore datasets for model training, and attaches\nan ML storage volume to the notebook instance.\n Amazon SageMaker also provides a set of example notebooks. Each notebook\ndemonstrates how to use Amazon SageMaker with a specific algorithm or with a\nmachine learning framework.\n After receiving the request, Amazon SageMaker does the following:\n * Creates a network interface in the Amazon SageMaker VPC.\n * (Option) If you specified SubnetId, Amazon SageMaker creates a network\ninterface in your own VPC, which is inferred from the subnet ID that you provide\nin the input. When creating this network interface, Amazon SageMaker attaches\nthe security group that you specified in the request to the network interface\nthat it creates in your VPC.\n * Launches an EC2 instance of the type specified in the request in the Amazon\nSageMaker VPC. If you specified SubnetId of your VPC, Amazon SageMaker specifies\nboth network interfaces when launching this instance. This enables inbound\ntraffic from your own VPC to the notebook instance, assuming that the security\ngroups allow it.\n After creating the notebook instance, Amazon SageMaker returns its Amazon\nResource Name (ARN).\n After Amazon SageMaker creates the notebook instance, you can connect to the\nJupyter server and work in Jupyter notebooks. For example, you can write code to\nexplore a dataset that you can use for model training, train a model, host\nmodels by creating Amazon SageMaker endpoints, and validate hosted models.\n For more information, see How It Works\n(http://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html)." ([create-notebook-instance-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-notebook-instance-input create-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-notebook-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateNotebookInstance", :http.request.configuration/output-deser-fn response-create-notebook-instance-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-notebook-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-notebook-instance-output))

(clojure.core/defn describe-notebook-instance-lifecycle-config "Returns a description of a notebook instance lifecycle configuration.\n For information about notebook instance lifestyle configurations, see Step 2.1:\n(Optional) Customize a Notebook Instance\n(http://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html)." ([describe-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-notebook-instance-lifecycle-config-input describe-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeNotebookInstanceLifecycleConfig", :http.request.configuration/output-deser-fn response-describe-notebook-instance-lifecycle-config-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-output))

(clojure.core/defn list-notebook-instance-lifecycle-configs "Lists notebook instance lifestyle configurations created with the\nCreateNotebookInstanceLifecycleConfig API." ([] (list-notebook-instance-lifecycle-configs {})) ([list-notebook-instance-lifecycle-configs-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-notebook-instance-lifecycle-configs-input list-notebook-instance-lifecycle-configs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListNotebookInstanceLifecycleConfigs", :http.request.configuration/output-deser-fn response-list-notebook-instance-lifecycle-configs-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-notebook-instance-lifecycle-configs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-output))

(clojure.core/defn create-training-job "Starts a model training job. After training completes, Amazon SageMaker saves\nthe resulting model artifacts to an Amazon S3 location that you specify.\n If you choose to host your model using Amazon SageMaker hosting services, you\ncan use the resulting model artifacts as part of the model. You can also use the\nartifacts in a deep learning service other than Amazon SageMaker, provided that\nyou know how to use them for inferences.\n In the request body, you provide the following:\n * AlgorithmSpecification - Identifies the training algorithm to use.\n * HyperParameters - Specify these algorithm-specific parameters to influence\nthe quality of the final model. For a list of hyperparameters for each training\nalgorithm provided by Amazon SageMaker, see Algorithms\n(http://docs.aws.amazon.com/sagemaker/latest/dg/algos.html).\n * InputDataConfig - Describes the training dataset and the Amazon S3 location\nwhere it is stored.\n * OutputDataConfig - Identifies the Amazon S3 location where you want Amazon\nSageMaker to save the results of model training.\n * ResourceConfig - Identifies the resources, ML compute instances, and ML\nstorage volumes to deploy for model training. In distributed training, you\nspecify more than one instance.\n * RoleARN - The Amazon Resource Number (ARN) that Amazon SageMaker assumes to\nperform tasks on your behalf during model training. You must grant this role the\nnecessary permissions so that Amazon SageMaker can successfully complete model\ntraining.\n * StoppingCondition - Sets a duration for training. Use this parameter to cap\nmodel training costs.\n For more information about Amazon SageMaker, see How It Works\n(http://docs.aws.amazon.com/sagemaker/latest/dg/how-it-works.html)." ([create-training-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-training-job-request create-training-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-training-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-training-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTrainingJob", :http.request.configuration/output-deser-fn response-create-training-job-response, :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-training-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-training-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-training-job-response))

(clojure.core/defn delete-code-repository "Deletes the specified Git repository from your account." ([delete-code-repository-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-code-repository-input delete-code-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-code-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCodeRepository", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-code-repository :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-code-repository-input) :ret clojure.core/true?)

(clojure.core/defn update-notebook-instance "Updates a notebook instance. NotebookInstance updates include upgrading or\ndowngrading the ML compute instance used for your notebook instance to\naccommodate changes in your workload requirements. You can also update the VPC\nsecurity groups." ([update-notebook-instance-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-notebook-instance-input update-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/update-notebook-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/update-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateNotebookInstance", :http.request.configuration/output-deser-fn response-update-notebook-instance-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/update-notebook-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/update-notebook-instance-output))

(clojure.core/defn create-notebook-instance-lifecycle-config "Creates a lifecycle configuration that you can associate with a notebook\ninstance. A lifecycle configuration is a collection of shell scripts that run\nwhen you create or start a notebook instance.\n Each lifecycle configuration script has a limit of 16384 characters.\n The value of the $PATH environment variable that is available to both scripts\nis /sbin:bin:/usr/sbin:/usr/bin.\n View CloudWatch Logs for notebook instance lifecycle configurations in log\ngroup /aws/sagemaker/NotebookInstances in log stream\n[notebook-instance-name]/[LifecycleConfigHook].\n Lifecycle configuration scripts cannot run for longer than 5 minutes. If a\nscript runs for longer than 5 minutes, it fails and the notebook instance is not\ncreated or started.\n For information about notebook instance lifestyle configurations, see Step 2.1:\n(Optional) Customize a Notebook Instance\n(http://docs.aws.amazon.com/sagemaker/latest/dg/notebook-lifecycle-config.html)." ([create-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-notebook-instance-lifecycle-config-input create-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateNotebookInstanceLifecycleConfig", :http.request.configuration/output-deser-fn response-create-notebook-instance-lifecycle-config-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-output))

(clojure.core/defn delete-workteam "Deletes an existing work team. This operation can't be undone." ([delete-workteam-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-workteam-request delete-workteam-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/delete-workteam-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-workteam-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteWorkteam", :http.request.configuration/output-deser-fn response-delete-workteam-response, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef delete-workteam :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-workteam-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/delete-workteam-response))

(clojure.core/defn list-code-repositories "Gets a list of the Git repositories in your account." ([] (list-code-repositories {})) ([list-code-repositories-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-code-repositories-input list-code-repositories-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-code-repositories-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-code-repositories-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCodeRepositories", :http.request.configuration/output-deser-fn response-list-code-repositories-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-code-repositories :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-code-repositories-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-code-repositories-output))

(clojure.core/defn delete-tags "Deletes the specified tags from an Amazon SageMaker resource.\n To list a resource's tags, use the ListTags API.\n When you call this API to delete tags from a hyperparameter tuning job, the\ndeleted tags are not removed from training jobs that the hyperparameter tuning\njob launched before you called this API." ([delete-tags-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-tags-input delete-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/delete-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTags", :http.request.configuration/output-deser-fn response-delete-tags-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/delete-tags-output))

(clojure.core/defn list-training-jobs "Lists training jobs." ([] (list-training-jobs {})) ([list-training-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-training-jobs-request list-training-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-training-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-training-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTrainingJobs", :http.request.configuration/output-deser-fn response-list-training-jobs-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-training-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-training-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-training-jobs-response))

(clojure.core/defn stop-notebook-instance "Terminates the ML compute instance. Before terminating the instance, Amazon\nSageMaker disconnects the ML storage volume from it. Amazon SageMaker preserves\nthe ML storage volume.\n To access data on the ML storage volume for a notebook instance that has been\nterminated, call the StartNotebookInstance API. StartNotebookInstance launches\nanother ML compute instance, configures it, and attaches the preserved ML\nstorage volume so you can continue your work." ([stop-notebook-instance-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-notebook-instance-input stop-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/stop-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopNotebookInstance", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef stop-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/stop-notebook-instance-input) :ret clojure.core/true?)

(clojure.core/defn create-transform-job "Starts a transform job. A transform job uses a trained model to get inferences\non a dataset and saves these results to an Amazon S3 location that you specify.\n To perform batch transformations, you create a transform job and use the data\nthat you have readily available.\n In the request body, you provide the following:\n * TransformJobName - Identifies the transform job. The name must be unique\nwithin an AWS Region in an AWS account.\n * ModelName - Identifies the model to use. ModelName must be the name of an\nexisting Amazon SageMaker model in the same AWS Region and AWS account. For\ninformation on creating a model, see CreateModel.\n * TransformInput - Describes the dataset to be transformed and the Amazon S3\nlocation where it is stored.\n * TransformOutput - Identifies the Amazon S3 location where you want Amazon\nSageMaker to save the results from the transform job.\n * TransformResources - Identifies the ML compute instances for the transform\njob.\n For more information about how batch transformation works Amazon SageMaker, see\nHow It Works\n(http://docs.aws.amazon.com/sagemaker/latest/dg/batch-transform.html)." ([create-transform-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-transform-job-request create-transform-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-transform-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-transform-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTransformJob", :http.request.configuration/output-deser-fn response-create-transform-job-response, :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-transform-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-transform-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-transform-job-response))

(clojure.core/defn get-search-suggestions "An auto-complete API for the search functionality in the Amazon SageMaker\nconsole. It returns suggestions of possible matches for the property name to use\nin Search queries. Provides suggestions for HyperParameters, Tags, and Metrics." ([get-search-suggestions-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-search-suggestions-request get-search-suggestions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/get-search-suggestions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/get-search-suggestions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetSearchSuggestions", :http.request.configuration/output-deser-fn response-get-search-suggestions-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef get-search-suggestions :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/get-search-suggestions-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/get-search-suggestions-response))

(clojure.core/defn list-notebook-instances "Returns a list of the Amazon SageMaker notebook instances in the requester's\naccount in an AWS Region." ([] (list-notebook-instances {})) ([list-notebook-instances-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-notebook-instances-input list-notebook-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-notebook-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-notebook-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListNotebookInstances", :http.request.configuration/output-deser-fn response-list-notebook-instances-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-notebook-instances :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-notebook-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-notebook-instances-output))

(clojure.core/defn list-tags "Returns the tags for the specified Amazon SageMaker resource." ([list-tags-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-tags-input list-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTags", :http.request.configuration/output-deser-fn response-list-tags-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/list-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-tags-output))

(clojure.core/defn stop-labeling-job "Stops a running labeling job. A job that is stopped cannot be restarted. Any\nresults obtained before the job is stopped are placed in the Amazon S3 output\nbucket." ([stop-labeling-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-labeling-job-request stop-labeling-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/stop-labeling-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopLabelingJob", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-labeling-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/stop-labeling-job-request) :ret clojure.core/true?)

(clojure.core/defn create-endpoint "Creates an endpoint using the endpoint configuration specified in the request.\nAmazon SageMaker uses the endpoint to provision resources and deploy models. You\ncreate the endpoint configuration with the CreateEndpointConfig\n(http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpointConfig.html)\nAPI.\n Use this API only for hosting models using Amazon SageMaker hosting services.\n The endpoint name must be unique within an AWS Region in your AWS account.\n When it receives the request, Amazon SageMaker creates the endpoint, launches\nthe resources (ML compute instances), and deploys the model(s) on them.\n When Amazon SageMaker receives the request, it sets the endpoint status to\nCreating. After it creates the endpoint, it sets the status to InService. Amazon\nSageMaker can then process incoming requests for inferences. To check the status\nof an endpoint, use the DescribeEndpoint\n(http://docs.aws.amazon.com/sagemaker/latest/dg/API_DescribeEndpoint.html) API.\n For an example, see Exercise 1: Using the K-Means Algorithm Provided by Amazon\nSageMaker (http://docs.aws.amazon.com/sagemaker/latest/dg/ex1.html).\n If any of the models hosted at this endpoint get model data from an Amazon S3\nlocation, Amazon SageMaker uses AWS Security Token Service to download model\nartifacts from the S3 path you provided. AWS STS is activated in your IAM user\naccount by default. If you previously deactivated AWS STS for a region, you need\nto reactivate AWS STS for that region. For more information, see Activating and\nDeactivating AWS STS i an AWS Region\n(http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html)\nin the AWS Identity and Access Management User Guide." ([create-endpoint-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-endpoint-input create-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateEndpoint", :http.request.configuration/output-deser-fn response-create-endpoint-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-endpoint-output))

(clojure.core/defn list-endpoint-configs "Lists endpoint configurations." ([] (list-endpoint-configs {})) ([list-endpoint-configs-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-endpoint-configs-input list-endpoint-configs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-endpoint-configs-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-endpoint-configs-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEndpointConfigs", :http.request.configuration/output-deser-fn response-list-endpoint-configs-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-endpoint-configs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-endpoint-configs-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-endpoint-configs-output))

(clojure.core/defn describe-workteam "Gets information about a specific work team. You can see information such as the\ncreate date, the last updated date, membership information, and the work team's\nAmazon Resource Name (ARN)." ([describe-workteam-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-workteam-request describe-workteam-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-workteam-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-workteam-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWorkteam", :http.request.configuration/output-deser-fn response-describe-workteam-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-workteam :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-workteam-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-workteam-response))

(clojure.core/defn create-model "Creates a model in Amazon SageMaker. In the request, you name the model and\ndescribe a primary container. For the primary container, you specify the docker\nimage containing inference code, artifacts (from prior training), and custom\nenvironment map that the inference code uses when you deploy the model for\npredictions.\n Use this API to create a model if you want to use Amazon SageMaker hosting\nservices or run a batch transform job.\n To host your model, you create an endpoint configuration with the\nCreateEndpointConfig API, and then create an endpoint with the CreateEndpoint\nAPI. Amazon SageMaker then deploys all of the containers that you defined for\nthe model in the hosting environment.\n To run a batch transform using your model, you start a job with the\nCreateTransformJob API. Amazon SageMaker uses your model and your dataset to get\ninferences which are then saved to a specified S3 location.\n In the CreateModel request, you must define a container with the\nPrimaryContainer parameter.\n In the request, you also provide an IAM role that Amazon SageMaker can assume\nto access model artifacts and docker image for deployment on ML compute hosting\ninstances or for batch transform jobs. In addition, you also use the IAM role to\nmanage permissions the inference code needs. For example, if the inference code\naccess any other AWS resources, you grant necessary permissions via this role." ([create-model-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-model-input create-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateModel", :http.request.configuration/output-deser-fn response-create-model-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-model :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-model-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-model-output))

(clojure.core/defn stop-hyper-parameter-tuning-job "Stops a running hyperparameter tuning job and all running training jobs that the\ntuning job launched.\n All model artifacts output from the training jobs are stored in Amazon Simple\nStorage Service (Amazon S3). All data that the training jobs write to Amazon\nCloudWatch Logs are still available in CloudWatch. After the tuning job moves to\nthe Stopped state, it releases all reserved resources for the tuning job." ([stop-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-hyper-parameter-tuning-job-request stop-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/stop-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopHyperParameterTuningJob", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/stop-hyper-parameter-tuning-job-request) :ret clojure.core/true?)

(clojure.core/defn render-ui-template "Renders the UI template so that you can preview the worker's experience." ([render-ui-template-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-render-ui-template-request render-ui-template-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/render-ui-template-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/render-ui-template-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RenderUiTemplate", :http.request.configuration/output-deser-fn response-render-ui-template-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef render-ui-template :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/render-ui-template-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/render-ui-template-response))

(clojure.core/defn list-labeling-jobs "Gets a list of labeling jobs." ([] (list-labeling-jobs {})) ([list-labeling-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-labeling-jobs-request list-labeling-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-labeling-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-labeling-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLabelingJobs", :http.request.configuration/output-deser-fn response-list-labeling-jobs-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-labeling-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-labeling-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-labeling-jobs-response))

(clojure.core/defn delete-model-package "Deletes a model package.\n A model package is used to create Amazon SageMaker models or list on AWS\nMarketplace. Buyers can subscribe to model packages listed on AWS Marketplace to\ncreate models in Amazon SageMaker." ([delete-model-package-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-model-package-input delete-model-package-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-model-package-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteModelPackage", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-model-package :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-model-package-input) :ret clojure.core/true?)

(clojure.core/defn create-compilation-job "Starts a model compilation job. After the model has been compiled, Amazon\nSageMaker saves the resulting model artifacts to an Amazon Simple Storage\nService (Amazon S3) bucket that you specify.\n If you choose to host your model using Amazon SageMaker hosting services, you\ncan use the resulting model artifacts as part of the model. You can also use the\nartifacts with AWS IoT Greengrass. In that case, deploy them as an ML resource.\n In the request body, you provide the following:\n * A name for the compilation job\n * Information about the input model artifacts\n * The output location for the compiled model and the device (target) that the\nmodel runs on\n * The Amazon Resource Name (ARN) of the IAM role that Amazon SageMaker assumes\nto perform the model compilation job\n You can also provide a Tag to track the model compilation job's resource use\nand costs. The response body contains the CompilationJobArn for the compiled\njob.\n To stop a model compilation job, use StopCompilationJob. To get information\nabout a particular model compilation job, use DescribeCompilationJob. To get\ninformation about multiple model compilation jobs, use ListCompilationJobs." ([create-compilation-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-compilation-job-request create-compilation-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-compilation-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-compilation-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCompilationJob", :http.request.configuration/output-deser-fn response-create-compilation-job-response, :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-compilation-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-compilation-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-compilation-job-response))

(clojure.core/defn describe-model-package "Returns a description of the specified model package, which is used to create\nAmazon SageMaker models or list them on AWS Marketplace.\n To create models in Amazon SageMaker, buyers can subscribe to model packages\nlisted on AWS Marketplace." ([describe-model-package-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-model-package-input describe-model-package-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-model-package-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-model-package-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeModelPackage", :http.request.configuration/output-deser-fn response-describe-model-package-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-model-package :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-model-package-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-model-package-output))

(clojure.core/defn list-models "Lists models created with the CreateModel\n(http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateModel.html) API." ([] (list-models {})) ([list-models-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-models-input list-models-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-models-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-models-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListModels", :http.request.configuration/output-deser-fn response-list-models-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-models :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-models-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-models-output))

(clojure.core/defn update-endpoint-weights-and-capacities "Updates variant weight of one or more variants associated with an existing\nendpoint, or capacity of one variant associated with an existing endpoint. When\nit receives the request, Amazon SageMaker sets the endpoint status to Updating.\nAfter updating the endpoint, it sets the status to InService. To check the\nstatus of an endpoint, use the DescribeEndpoint\n(http://docs.aws.amazon.com/sagemaker/latest/dg/API_DescribeEndpoint.html) API." ([update-endpoint-weights-and-capacities-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-endpoint-weights-and-capacities-input update-endpoint-weights-and-capacities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateEndpointWeightsAndCapacities", :http.request.configuration/output-deser-fn response-update-endpoint-weights-and-capacities-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-endpoint-weights-and-capacities :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-output))

(clojure.core/defn create-presigned-notebook-instance-url "Returns a URL that you can use to connect to the Jupyter server from a notebook\ninstance. In the Amazon SageMaker console, when you choose Open next to a\nnotebook instance, Amazon SageMaker opens a new tab showing the Jupyter server\nhome page from the notebook instance. The console uses this API to get the URL\nand show the page.\n You can restrict access to this API and to the URL that it returns to a list of\nIP addresses that you specify. To restrict access, attach an IAM policy that\ndenies access to this API unless the call comes from an IP address in the\nspecified list to every AWS Identity and Access Management user, group, or role\nused to access the notebook instance. Use the NotIpAddress condition operator\nand the aws:SourceIP condition context key to specify the list of IP addresses\nthat you want to have access to the notebook instance. For more information, see\nLimit Access to a Notebook Instance by IP Address\n(http://docs.aws.amazon.com/sagemaker/latest/dg/howitworks-access-ws.html#nbi-ip-filter)." ([create-presigned-notebook-instance-url-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-presigned-notebook-instance-url-input create-presigned-notebook-instance-url-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-presigned-notebook-instance-url-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-presigned-notebook-instance-url-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreatePresignedNotebookInstanceUrl", :http.request.configuration/output-deser-fn response-create-presigned-notebook-instance-url-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef create-presigned-notebook-instance-url :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-presigned-notebook-instance-url-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-presigned-notebook-instance-url-output))

(clojure.core/defn describe-endpoint "Returns the description of an endpoint." ([describe-endpoint-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-endpoint-input describe-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEndpoint", :http.request.configuration/output-deser-fn response-describe-endpoint-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-endpoint-output))

(clojure.core/defn create-model-package "Creates a model package that you can use to create Amazon SageMaker models or\nlist on AWS Marketplace. Buyers can subscribe to model packages listed on AWS\nMarketplace to create models in Amazon SageMaker.\n To create a model package by specifying a Docker container that contains your\ninference code and the Amazon S3 location of your model artifacts, provide\nvalues for InferenceSpecification. To create a model from an algorithm resource\nthat you created or subscribed to in AWS Marketplace, provide a value for\nSourceAlgorithmSpecification." ([create-model-package-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-model-package-input create-model-package-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-model-package-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-model-package-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateModelPackage", :http.request.configuration/output-deser-fn response-create-model-package-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef create-model-package :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-model-package-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-model-package-output))

(clojure.core/defn describe-hyper-parameter-tuning-job "Gets a description of a hyperparameter tuning job." ([describe-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-hyper-parameter-tuning-job-request describe-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeHyperParameterTuningJob", :http.request.configuration/output-deser-fn response-describe-hyper-parameter-tuning-job-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-response))

(clojure.core/defn describe-transform-job "Returns information about a transform job." ([describe-transform-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-transform-job-request describe-transform-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-transform-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-transform-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTransformJob", :http.request.configuration/output-deser-fn response-describe-transform-job-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-transform-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-transform-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-transform-job-response))

(clojure.core/defn start-notebook-instance "Launches an ML compute instance with the latest version of the libraries and\nattaches your ML storage volume. After configuring the notebook instance, Amazon\nSageMaker sets the notebook instance status to InService. A notebook instance's\nstatus must be InService before you can connect to your Jupyter notebook." ([start-notebook-instance-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-notebook-instance-input start-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/start-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartNotebookInstance", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef start-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/start-notebook-instance-input) :ret clojure.core/true?)

(clojure.core/defn list-subscribed-workteams "Gets a list of the work teams that you are subscribed to in the AWS Marketplace.\nThe list may be empty if no work team satisfies the filter specified in the\nNameContains parameter." ([] (list-subscribed-workteams {})) ([list-subscribed-workteams-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-subscribed-workteams-request list-subscribed-workteams-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-subscribed-workteams-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-subscribed-workteams-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListSubscribedWorkteams", :http.request.configuration/output-deser-fn response-list-subscribed-workteams-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-subscribed-workteams :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-subscribed-workteams-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-subscribed-workteams-response))

(clojure.core/defn update-endpoint "Deploys the new EndpointConfig specified in the request, switches to using newly\ncreated endpoint, and then deletes resources provisioned for the endpoint using\nthe previous EndpointConfig (there is no availability loss).\n When Amazon SageMaker receives the request, it sets the endpoint status to\nUpdating. After updating the endpoint, it sets the status to InService. To check\nthe status of an endpoint, use the DescribeEndpoint\n(http://docs.aws.amazon.com/sagemaker/latest/dg/API_DescribeEndpoint.html) API.\n You cannot update an endpoint with the current EndpointConfig. To update an\nendpoint, you must create a new EndpointConfig." ([update-endpoint-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-endpoint-input update-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/update-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/update-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateEndpoint", :http.request.configuration/output-deser-fn response-update-endpoint-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/update-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/update-endpoint-output))

(clojure.core/defn list-algorithms "Lists the machine learning algorithms that have been created." ([] (list-algorithms {})) ([list-algorithms-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-algorithms-input list-algorithms-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-algorithms-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-algorithms-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAlgorithms", :http.request.configuration/output-deser-fn response-list-algorithms-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-algorithms :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-algorithms-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-algorithms-output))

(clojure.core/defn delete-model "Deletes a model. The DeleteModel API deletes only the model entry that was\ncreated in Amazon SageMaker when you called the CreateModel\n(http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateModel.html) API. It\ndoes not delete model artifacts, inference code, or the IAM role that you\nspecified when creating the model." ([delete-model-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-model-input delete-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteModel", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-model :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-model-input) :ret clojure.core/true?)

(clojure.core/defn describe-training-job "Returns information about a training job." ([describe-training-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-training-job-request describe-training-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-training-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-training-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTrainingJob", :http.request.configuration/output-deser-fn response-describe-training-job-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-training-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-training-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-training-job-response))

(clojure.core/defn list-workteams "Gets a list of work teams that you have defined in a region. The list may be\nempty if no work team satisfies the filter specified in the NameContains\nparameter." ([] (list-workteams {})) ([list-workteams-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-workteams-request list-workteams-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-workteams-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-workteams-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListWorkteams", :http.request.configuration/output-deser-fn response-list-workteams-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-workteams :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-workteams-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-workteams-response))

(clojure.core/defn stop-transform-job "Stops a transform job.\n When Amazon SageMaker receives a StopTransformJob request, the status of the\njob changes to Stopping. After Amazon SageMaker stops the job, the status is set\nto Stopped. When you stop a transform job before it is completed, Amazon\nSageMaker doesn't store the job's output in Amazon S3." ([stop-transform-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-transform-job-request stop-transform-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/stop-transform-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopTransformJob", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-transform-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/stop-transform-job-request) :ret clojure.core/true?)

(clojure.core/defn delete-notebook-instance " Deletes an Amazon SageMaker notebook instance. Before you can delete a notebook\ninstance, you must call the StopNotebookInstance API.\n When you delete a notebook instance, you lose all of your data. Amazon\nSageMaker removes the ML compute instance, and deletes the ML storage volume and\nthe network interface associated with the notebook instance." ([delete-notebook-instance-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-notebook-instance-input delete-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteNotebookInstance", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-notebook-instance-input) :ret clojure.core/true?)

(clojure.core/defn create-endpoint-config "Creates an endpoint configuration that Amazon SageMaker hosting services uses to\ndeploy models. In the configuration, you identify one or more models, created\nusing the CreateModel API, to deploy and the resources that you want Amazon\nSageMaker to provision. Then you call the CreateEndpoint\n(http://docs.aws.amazon.com/sagemaker/latest/dg/API_CreateEndpoint.html) API.\n Use this API only if you want to use Amazon SageMaker hosting services to\ndeploy models into production.\n In the request, you define one or more ProductionVariants, each of which\nidentifies a model. Each ProductionVariant parameter also describes the\nresources that you want Amazon SageMaker to provision. This includes the number\nand type of ML compute instances to deploy.\n If you are hosting multiple models, you also assign a VariantWeight to specify\nhow much traffic you want to allocate to each model. For example, suppose that\nyou want to host two models, A and B, and you assign traffic weight 2 for model\nA and 1 for model B. Amazon SageMaker distributes two-thirds of the traffic to\nModel A, and one-third to model B." ([create-endpoint-config-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-endpoint-config-input create-endpoint-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-endpoint-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-endpoint-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateEndpointConfig", :http.request.configuration/output-deser-fn response-create-endpoint-config-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-endpoint-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-endpoint-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-endpoint-config-output))

(clojure.core/defn create-labeling-job "Creates a job that uses workers to label the data objects in your input dataset.\nYou can use the labeled data to train machine learning models.\n You can select your workforce from one of three providers:\n * A private workforce that you create. It can include employees, contractors,\nand outside experts. Use a private workforce when want the data to stay within\nyour organization or when a specific set of skills is required.\n * One or more vendors that you select from the AWS Marketplace. Vendors provide\nexpertise in specific areas.\n * The Amazon Mechanical Turk workforce. This is the largest workforce, but it\nshould only be used for public data or data that has been stripped of any\npersonally identifiable information.\n You can also use automated data labeling to reduce the number of data objects\nthat need to be labeled by a human. Automated data labeling uses active learning\nto determine if a data object can be labeled by machine or if it needs to be\nsent to a human worker. For more information, see Using Automated Data Labeling\n(http://docs.aws.amazon.com/sagemaker/latest/dg/sms-automated-labeling.html).\n The data objects to be labeled are contained in an Amazon S3 bucket. You create\na manifest file that describes the location of each object. For more\ninformation, see Using Input and Output Data\n(http://docs.aws.amazon.com/sagemaker/latest/dg/sms-data.html).\n The output can be used as the manifest file for another labeling job or as\ntraining data for your machine learning models." ([create-labeling-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-labeling-job-request create-labeling-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-labeling-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-labeling-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLabelingJob", :http.request.configuration/output-deser-fn response-create-labeling-job-response, :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-labeling-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-labeling-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-labeling-job-response))

(clojure.core/defn describe-algorithm "Returns a description of the specified algorithm that is in your account." ([describe-algorithm-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-algorithm-input describe-algorithm-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-algorithm-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-algorithm-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeAlgorithm", :http.request.configuration/output-deser-fn response-describe-algorithm-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-algorithm :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-algorithm-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-algorithm-output))

(clojure.core/defn create-algorithm "Create a machine learning algorithm that you can use in Amazon SageMaker and\nlist in the AWS Marketplace." ([create-algorithm-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-algorithm-input create-algorithm-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-algorithm-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-algorithm-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateAlgorithm", :http.request.configuration/output-deser-fn response-create-algorithm-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef create-algorithm :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-algorithm-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-algorithm-output))

(clojure.core/defn list-labeling-jobs-for-workteam "Gets a list of labeling jobs assigned to a specified work team." ([list-labeling-jobs-for-workteam-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-labeling-jobs-for-workteam-request list-labeling-jobs-for-workteam-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-labeling-jobs-for-workteam-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-labeling-jobs-for-workteam-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLabelingJobsForWorkteam", :http.request.configuration/output-deser-fn response-list-labeling-jobs-for-workteam-response, :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef list-labeling-jobs-for-workteam :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/list-labeling-jobs-for-workteam-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-labeling-jobs-for-workteam-response))

(clojure.core/defn update-code-repository "Updates the specified Git repository with the specified values." ([update-code-repository-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-code-repository-input update-code-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/update-code-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/update-code-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateCodeRepository", :http.request.configuration/output-deser-fn response-update-code-repository-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef update-code-repository :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/update-code-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/update-code-repository-output))

(clojure.core/defn delete-endpoint-config "Deletes an endpoint configuration. The DeleteEndpointConfig API deletes only the\nspecified configuration. It does not delete endpoints created using the\nconfiguration." ([delete-endpoint-config-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-endpoint-config-input delete-endpoint-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-endpoint-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEndpointConfig", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-endpoint-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-endpoint-config-input) :ret clojure.core/true?)

(clojure.core/defn describe-model "Describes a model that you created using the CreateModel API." ([describe-model-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-model-input describe-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeModel", :http.request.configuration/output-deser-fn response-describe-model-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-model :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-model-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-model-output))

(clojure.core/defn stop-training-job "Stops a training job. To stop a job, Amazon SageMaker sends the algorithm the\nSIGTERM signal, which delays job termination for 120 seconds. Algorithms might\nuse this 120-second window to save the model artifacts, so the results of the\ntraining is not lost.\n Training algorithms provided by Amazon SageMaker save the intermediate results\nof a model training job. This intermediate data is a valid model artifact. You\ncan use the model artifacts that are saved when Amazon SageMaker stops a\ntraining job to create a model.\n When it receives a StopTrainingJob request, Amazon SageMaker changes the status\nof the job to Stopping. After Amazon SageMaker stops the job, it sets the status\nto Stopped." ([stop-training-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-training-job-request stop-training-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/stop-training-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopTrainingJob", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-training-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/stop-training-job-request) :ret clojure.core/true?)

(clojure.core/defn list-compilation-jobs "Lists model compilation jobs that satisfy various filters.\n To create a model compilation job, use CreateCompilationJob. To get information\nabout a particular model compilation job you have created, use\nDescribeCompilationJob." ([] (list-compilation-jobs {})) ([list-compilation-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-compilation-jobs-request list-compilation-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-compilation-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-compilation-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCompilationJobs", :http.request.configuration/output-deser-fn response-list-compilation-jobs-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-compilation-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-compilation-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-compilation-jobs-response))

(clojure.core/defn update-notebook-instance-lifecycle-config "Updates a notebook instance lifecycle configuration created with the\nCreateNotebookInstanceLifecycleConfig API." ([update-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-notebook-instance-lifecycle-config-input update-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateNotebookInstanceLifecycleConfig", :http.request.configuration/output-deser-fn response-update-notebook-instance-lifecycle-config-output, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-output))

(clojure.core/defn list-hyper-parameter-tuning-jobs "Gets a list of HyperParameterTuningJobSummary objects that describe the\nhyperparameter tuning jobs launched in your account." ([] (list-hyper-parameter-tuning-jobs {})) ([list-hyper-parameter-tuning-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-hyper-parameter-tuning-jobs-request list-hyper-parameter-tuning-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListHyperParameterTuningJobs", :http.request.configuration/output-deser-fn response-list-hyper-parameter-tuning-jobs-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-hyper-parameter-tuning-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-response))

(clojure.core/defn add-tags "Adds or overwrites one or more tags for the specified Amazon SageMaker resource.\nYou can add tags to notebook instances, training jobs, hyperparameter tuning\njobs, models, endpoint configurations, and endpoints.\n Each tag consists of a key and an optional value. Tag keys must be unique per\nresource. For more information about tags, see For more information, see AWS\nTagging Strategies\n(https://aws.amazon.com/answers/account-management/aws-tagging-strategies/).\n Tags that you add to a hyperparameter tuning job by calling this API are also\nadded to any training jobs that the hyperparameter tuning job launches after you\ncall this API, but not to training jobs that the hyperparameter tuning job\nlaunched before you called this API. To make sure that the tags associated with\na hyperparameter tuning job are also added to all training jobs that the\nhyperparameter tuning job launches, add the tags when you first create the\ntuning job by specifying them in the Tags parameter of\nCreateHyperParameterTuningJob" ([add-tags-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/add-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTags", :http.request.configuration/output-deser-fn response-add-tags-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/add-tags-output))

(clojure.core/defn stop-compilation-job "Stops a model compilation job.\n To stop a job, Amazon SageMaker sends the algorithm the SIGTERM signal. This\ngracefully shuts the job down. If the job hasn't stopped, it sends the SIGKILL\nsignal.\n When it receives a StopCompilationJob request, Amazon SageMaker changes the\nCompilationJobSummary$CompilationJobStatus of the job to Stopping. After Amazon\nSageMaker stops the job, it sets the CompilationJobSummary$CompilationJobStatus\nto Stopped." ([stop-compilation-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-compilation-job-request stop-compilation-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/stop-compilation-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopCompilationJob", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-compilation-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/stop-compilation-job-request) :ret clojure.core/true?)

(clojure.core/defn delete-algorithm "Removes the specified algorithm from your account." ([delete-algorithm-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-algorithm-input delete-algorithm-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-algorithm-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteAlgorithm", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-algorithm :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-algorithm-input) :ret clojure.core/true?)

(clojure.core/defn describe-endpoint-config "Returns the description of an endpoint configuration created using the\nCreateEndpointConfig API." ([describe-endpoint-config-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-endpoint-config-input describe-endpoint-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-endpoint-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-endpoint-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeEndpointConfig", :http.request.configuration/output-deser-fn response-describe-endpoint-config-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-endpoint-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-endpoint-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-endpoint-config-output))

(clojure.core/defn list-transform-jobs "Lists transform jobs." ([] (list-transform-jobs {})) ([list-transform-jobs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-transform-jobs-request list-transform-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-transform-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-transform-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTransformJobs", :http.request.configuration/output-deser-fn response-list-transform-jobs-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-transform-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-transform-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-transform-jobs-response))

(clojure.core/defn describe-subscribed-workteam "Gets information about a work team provided by a vendor. It returns details\nabout the subscription with a vendor in the AWS Marketplace." ([describe-subscribed-workteam-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-subscribed-workteam-request describe-subscribed-workteam-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-subscribed-workteam-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-subscribed-workteam-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSubscribedWorkteam", :http.request.configuration/output-deser-fn response-describe-subscribed-workteam-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-subscribed-workteam :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-subscribed-workteam-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-subscribed-workteam-response))

(clojure.core/defn list-model-packages "Lists the model packages that have been created." ([] (list-model-packages {})) ([list-model-packages-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-model-packages-input list-model-packages-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-model-packages-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-model-packages-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListModelPackages", :http.request.configuration/output-deser-fn response-list-model-packages-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-model-packages :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-model-packages-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-model-packages-output))

(clojure.core/defn describe-notebook-instance "Returns information about a notebook instance." ([describe-notebook-instance-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-notebook-instance-input describe-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-notebook-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeNotebookInstance", :http.request.configuration/output-deser-fn response-describe-notebook-instance-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-notebook-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-notebook-instance-output))

(clojure.core/defn delete-endpoint "Deletes an endpoint. Amazon SageMaker frees up all of the resources that were\ndeployed when the endpoint was created.\n Amazon SageMaker retires any custom KMS key grants associated with the\nendpoint, meaning you don't need to use the RevokeGrant\n(http://docs.aws.amazon.com/kms/latest/APIReference/API_RevokeGrant.html) API\ncall." ([delete-endpoint-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-endpoint-input delete-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteEndpoint", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-endpoint-input) :ret clojure.core/true?)

(clojure.core/defn list-endpoints "Lists endpoints." ([] (list-endpoints {})) ([list-endpoints-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-endpoints-input list-endpoints-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/list-endpoints-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-endpoints-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListEndpoints", :http.request.configuration/output-deser-fn response-list-endpoints-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-endpoints :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-endpoints-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-endpoints-output))

(clojure.core/defn update-workteam "Updates an existing work team with new member definitions or description." ([update-workteam-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-update-workteam-request update-workteam-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/update-workteam-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/update-workteam-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateWorkteam", :http.request.configuration/output-deser-fn response-update-workteam-response, :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-workteam :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/update-workteam-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/update-workteam-response))

(clojure.core/defn search "Finds Amazon SageMaker resources that match a search query. Matching resource\nobjects are returned as a list of SearchResult objects in the response. You can\nsort the search results by any resource property in a ascending or descending\norder.\n You can query against the following value types: numerical, text, Booleans, and\ntimestamps." ([search-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-search-request search-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/search-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/search-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Search", :http.request.configuration/output-deser-fn response-search-response, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef search :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/search-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/search-response))

(clojure.core/defn create-code-repository "Creates a Git repository as a resource in your Amazon SageMaker account. You can\nassociate the repository with notebook instances so that you can use Git source\ncontrol for the notebooks you create. The Git repository is a resource in your\nAmazon SageMaker account, so it can be associated with more than one notebook\ninstance, and it persists independently from the lifecycle of any notebook\ninstances it is associated with.\n The repository can be hosted either in AWS CodeCommit\n(http://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any\nother Git repository." ([create-code-repository-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-code-repository-input create-code-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-code-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-code-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCodeRepository", :http.request.configuration/output-deser-fn response-create-code-repository-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef create-code-repository :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-code-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-code-repository-output))

(clojure.core/defn describe-code-repository "Gets details about the specified Git repository." ([describe-code-repository-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-code-repository-input describe-code-repository-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/describe-code-repository-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-code-repository-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCodeRepository", :http.request.configuration/output-deser-fn response-describe-code-repository-output, :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-code-repository :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-code-repository-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-code-repository-output))

(clojure.core/defn create-workteam "Creates a new work team for labeling your data. A work team is defined by one or\nmore Amazon Cognito user pools. You must first create the user pools before you\ncan create a work team.\n You cannot create more than 25 work teams in an account and region." ([create-workteam-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-workteam-request create-workteam-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-workteam-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-workteam-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateWorkteam", :http.request.configuration/output-deser-fn response-create-workteam-response, :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-workteam :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-workteam-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-workteam-response))

(clojure.core/defn delete-notebook-instance-lifecycle-config "Deletes a notebook instance lifecycle configuration." ([delete-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-notebook-instance-lifecycle-config-input delete-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteNotebookInstanceLifecycleConfig", :http.request.configuration/output-deser-fn (clojure.core/fn [& args__1411980__auto__] {}), :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-notebook-instance-lifecycle-config-input) :ret clojure.core/true?)

(clojure.core/defn create-hyper-parameter-tuning-job "Starts a hyperparameter tuning job. A hyperparameter tuning job finds the best\nversion of a model by running many training jobs on your dataset using the\nalgorithm you choose and values for hyperparameters within ranges that you\nspecify. It then chooses the hyperparameter values that result in a model that\nperforms the best, as measured by an objective metric that you choose." ([create-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-hyper-parameter-tuning-job-request create-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.configuration/target-prefix "SageMaker", :http.request.spec/output-spec :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateHyperParameterTuningJob", :http.request.configuration/output-deser-fn response-create-hyper-parameter-tuning-job-response, :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-response))
