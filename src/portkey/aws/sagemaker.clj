(ns portkey.aws.sagemaker (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-resource-config)

(clojure.core/declare ser-input-data-config)

(clojure.core/declare ser-task-count)

(clojure.core/declare ser-compression-type)

(clojure.core/declare ser-output-data-config)

(clojure.core/declare ser-metric-regex)

(clojure.core/declare ser-model-name)

(clojure.core/declare ser-name-contains)

(clojure.core/declare ser-endpoint-status)

(clojure.core/declare ser-hyper-parameter-tuning-job-status)

(clojure.core/declare ser-variant-name)

(clojure.core/declare ser-sort-by)

(clojure.core/declare ser-endpoint-config-name-contains)

(clojure.core/declare ser-max-payload-in-mb)

(clojure.core/declare ser-max-number-of-training-jobs)

(clojure.core/declare ser-parameter-key)

(clojure.core/declare ser-transform-resources)

(clojure.core/declare ser-volume-size-in-gb)

(clojure.core/declare ser-security-group-ids)

(clojure.core/declare ser-hyper-parameters)

(clojure.core/declare ser-hyper-parameter-tuning-job-strategy-type)

(clojure.core/declare ser-continuous-parameter-ranges)

(clojure.core/declare ser-subnets)

(clojure.core/declare ser-transform-instance-count)

(clojure.core/declare ser-transform-data-source)

(clojure.core/declare ser-resource-limits)

(clojure.core/declare ser-training-instance-count)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-s-3-data-type)

(clojure.core/declare ser-s-3-data-distribution)

(clojure.core/declare ser-model-name-contains)

(clojure.core/declare ser-notebook-instance-lifecycle-config-sort-order)

(clojure.core/declare ser-transform-s-3-data-source)

(clojure.core/declare ser-max-concurrent-transforms)

(clojure.core/declare ser-container-hostname)

(clojure.core/declare ser-order-key)

(clojure.core/declare ser-model-sort-key)

(clojure.core/declare ser-instance-type)

(clojure.core/declare ser-hyper-parameter-tuning-job-sort-by-options)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-training-input-mode)

(clojure.core/declare ser-transform-input)

(clojure.core/declare ser-s-3-uri)

(clojure.core/declare ser-endpoint-config-sort-key)

(clojure.core/declare ser-notebook-instance-lifecycle-config-sort-key)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-production-variant-instance-type)

(clojure.core/declare ser-sort-order)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-parameter-values)

(clojure.core/declare ser-production-variant-list)

(clojure.core/declare ser-environment-map)

(clojure.core/declare ser-max-parallel-training-jobs)

(clojure.core/declare ser-notebook-instance-lifecycle-config-name)

(clojure.core/declare ser-session-expiration-duration-in-seconds)

(clojure.core/declare ser-vpc-security-group-ids)

(clojure.core/declare ser-notebook-instance-status)

(clojure.core/declare ser-notebook-instance-sort-order)

(clojure.core/declare ser-notebook-instance-lifecycle-config-name-contains)

(clojure.core/declare ser-next-token)

(clojure.core/declare ser-endpoint-name)

(clojure.core/declare ser-endpoint-sort-key)

(clojure.core/declare ser-list-tags-max-results)

(clojure.core/declare ser-hyper-parameter-tuning-job-config)

(clojure.core/declare ser-content-type)

(clojure.core/declare ser-transform-environment-value)

(clojure.core/declare ser-direct-internet-access)

(clojure.core/declare ser-transform-environment-map)

(clojure.core/declare ser-s-3-data-source)

(clojure.core/declare ser-stopping-condition)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-environment-value)

(clojure.core/declare ser-categorical-parameter-range)

(clojure.core/declare ser-hyper-parameter-tuning-job-objective-type)

(clojure.core/declare ser-max-runtime-in-seconds)

(clojure.core/declare ser-transform-environment-key)

(clojure.core/declare ser-metric-definition-list)

(clojure.core/declare ser-notebook-instance-sort-key)

(clojure.core/declare ser-channel-name)

(clojure.core/declare ser-categorical-parameter-ranges)

(clojure.core/declare ser-notebook-instance-lifecycle-config-list)

(clojure.core/declare ser-hyper-parameter-algorithm-specification)

(clojure.core/declare ser-url)

(clojure.core/declare ser-notebook-instance-lifecycle-config-content)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-container-definition)

(clojure.core/declare ser-parameter-ranges)

(clojure.core/declare ser-production-variant)

(clojure.core/declare ser-security-group-id)

(clojure.core/declare ser-notebook-instance-lifecycle-hook)

(clojure.core/declare ser-transform-job-name)

(clojure.core/declare ser-kms-key-id)

(clojure.core/declare ser-batch-strategy)

(clojure.core/declare ser-environment-key)

(clojure.core/declare ser-data-source)

(clojure.core/declare ser-assembly-type)

(clojure.core/declare ser-variant-weight)

(clojure.core/declare ser-split-type)

(clojure.core/declare ser-training-job-sort-by-options)

(clojure.core/declare ser-creation-time)

(clojure.core/declare ser-metric-definition)

(clojure.core/declare ser-vpc-config)

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

(clojure.core/declare ser-disassociate-notebook-instance-lifecycle-config)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-metric-name)

(clojure.core/declare ser-integer-parameter-ranges)

(clojure.core/declare ser-training-instance-type)

(clojure.core/declare ser-integer-parameter-range)

(clojure.core/declare ser-algorithm-image)

(clojure.core/declare ser-last-modified-time)

(clojure.core/declare ser-image)

(clojure.core/declare ser-accept)

(clojure.core/declare ser-training-job-status)

(clojure.core/declare ser-continuous-parameter-range)

(clojure.core/declare ser-algorithm-specification)

(clojure.core/declare ser-notebook-instance-name-contains)

(clojure.core/declare ser-notebook-instance-name)

(clojure.core/declare ser-transform-instance-type)

(clojure.core/declare ser-endpoint-config-name)

(clojure.core/declare ser-parameter-value)

(clojure.core/defn- ser-resource-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-training-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "TrainingInstanceType"}) (clojure.core/into (ser-training-instance-count (:instance-count input)) #:http.request.field{:name "InstanceCount", :shape "TrainingInstanceCount"}) (clojure.core/into (ser-volume-size-in-gb (:volume-size-in-gb input)) #:http.request.field{:name "VolumeSizeInGB", :shape "VolumeSizeInGB"})], :shape "ResourceConfig", :type "structure"} (clojure.core/contains? input :volume-kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :volume-kms-key-id)) #:http.request.field{:name "VolumeKmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-input-data-config [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-channel coll) #:http.request.field{:shape "Channel"}))) input), :shape "InputDataConfig", :type "list", :max 8, :min 1})

(clojure.core/defn- ser-task-count [input] #:http.request.field{:value input, :shape "TaskCount"})

(clojure.core/defn- ser-compression-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Gzip" "Gzip", :gzip "Gzip"} input), :shape "CompressionType"})

(clojure.core/defn- ser-output-data-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-output-path input)) #:http.request.field{:name "S3OutputPath", :shape "S3Uri"})], :shape "OutputDataConfig", :type "structure"} (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-metric-regex [input] #:http.request.field{:value input, :shape "MetricRegex"})

(clojure.core/defn- ser-model-name [input] #:http.request.field{:value input, :shape "ModelName"})

(clojure.core/defn- ser-name-contains [input] #:http.request.field{:value input, :shape "NameContains"})

(clojure.core/defn- ser-endpoint-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", "Creating" "Creating", "SystemUpdating" "SystemUpdating", :system-updating "SystemUpdating", :creating "Creating", "InService" "InService", "RollingBack" "RollingBack", :deleting "Deleting", "OutOfService" "OutOfService", :out-of-service "OutOfService", "Deleting" "Deleting", :in-service "InService", :rolling-back "RollingBack", :updating "Updating", "Updating" "Updating", :failed "Failed"} input), :shape "EndpointStatus"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :in-progress "InProgress", :completed "Completed", :stopping "Stopping", :stopped "Stopped", "InProgress" "InProgress", "Stopping" "Stopping", "Stopped" "Stopped", "Completed" "Completed", :failed "Failed"} input), :shape "HyperParameterTuningJobStatus"})

(clojure.core/defn- ser-variant-name [input] #:http.request.field{:value input, :shape "VariantName"})

(clojure.core/defn- ser-sort-by [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status"} input), :shape "SortBy"})

(clojure.core/defn- ser-endpoint-config-name-contains [input] #:http.request.field{:value input, :shape "EndpointConfigNameContains"})

(clojure.core/defn- ser-max-payload-in-mb [input] #:http.request.field{:value input, :shape "MaxPayloadInMB"})

(clojure.core/defn- ser-max-number-of-training-jobs [input] #:http.request.field{:value input, :shape "MaxNumberOfTrainingJobs"})

(clojure.core/defn- ser-parameter-key [input] #:http.request.field{:value input, :shape "ParameterKey"})

(clojure.core/defn- ser-transform-resources [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transform-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "TransformInstanceType"}) (clojure.core/into (ser-transform-instance-count (:instance-count input)) #:http.request.field{:name "InstanceCount", :shape "TransformInstanceCount"})], :shape "TransformResources", :type "structure"} (clojure.core/contains? input :volume-kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :volume-kms-key-id)) #:http.request.field{:name "VolumeKmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-volume-size-in-gb [input] #:http.request.field{:value input, :shape "VolumeSizeInGB"})

(clojure.core/defn- ser-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "SecurityGroupIds", :type "list", :max 5})

(clojure.core/defn- ser-hyper-parameters [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-parameter-key k) #:http.request.field{:map-info "key", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-value v) #:http.request.field{:map-info "value", :shape "ParameterValue"})])) input), :shape "HyperParameters", :type "map", :max 100, :min 0})

(clojure.core/defn- ser-hyper-parameter-tuning-job-strategy-type [input] #:http.request.field{:value (clojure.core/get {"Bayesian" "Bayesian", :bayesian "Bayesian"} input), :shape "HyperParameterTuningJobStrategyType"})

(clojure.core/defn- ser-continuous-parameter-ranges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-continuous-parameter-range coll) #:http.request.field{:shape "ContinuousParameterRange"}))) input), :shape "ContinuousParameterRanges", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-subnets [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-subnet-id coll) #:http.request.field{:shape "SubnetId"}))) input), :shape "Subnets", :type "list", :max 16, :min 1})

(clojure.core/defn- ser-transform-instance-count [input] #:http.request.field{:value input, :shape "TransformInstanceCount"})

(clojure.core/defn- ser-transform-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transform-s-3-data-source (:s-3-data-source input)) #:http.request.field{:name "S3DataSource", :shape "TransformS3DataSource"})], :shape "TransformDataSource", :type "structure"}))

(clojure.core/defn- ser-resource-limits [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-max-number-of-training-jobs (:max-number-of-training-jobs input)) #:http.request.field{:name "MaxNumberOfTrainingJobs", :shape "MaxNumberOfTrainingJobs"}) (clojure.core/into (ser-max-parallel-training-jobs (:max-parallel-training-jobs input)) #:http.request.field{:name "MaxParallelTrainingJobs", :shape "MaxParallelTrainingJobs"})], :shape "ResourceLimits", :type "structure"}))

(clojure.core/defn- ser-training-instance-count [input] #:http.request.field{:value input, :shape "TrainingInstanceCount"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-s-3-data-type [input] #:http.request.field{:value (clojure.core/get {"ManifestFile" "ManifestFile", :manifest-file "ManifestFile", "S3Prefix" "S3Prefix", :s-3-prefix "S3Prefix"} input), :shape "S3DataType"})

(clojure.core/defn- ser-s-3-data-distribution [input] #:http.request.field{:value (clojure.core/get {"FullyReplicated" "FullyReplicated", :fully-replicated "FullyReplicated", "ShardedByS3Key" "ShardedByS3Key", :sharded-by-s-3-key "ShardedByS3Key"} input), :shape "S3DataDistribution"})

(clojure.core/defn- ser-model-name-contains [input] #:http.request.field{:value input, :shape "ModelNameContains"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "NotebookInstanceLifecycleConfigSortOrder"})

(clojure.core/defn- ser-transform-s-3-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-data-type (:s-3-data-type input)) #:http.request.field{:name "S3DataType", :shape "S3DataType"}) (clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "TransformS3DataSource", :type "structure"}))

(clojure.core/defn- ser-max-concurrent-transforms [input] #:http.request.field{:value input, :shape "MaxConcurrentTransforms"})

(clojure.core/defn- ser-container-hostname [input] #:http.request.field{:value input, :shape "ContainerHostname"})

(clojure.core/defn- ser-order-key [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "OrderKey"})

(clojure.core/defn- ser-model-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "ModelSortKey"})

(clojure.core/defn- ser-instance-type [input] #:http.request.field{:value (clojure.core/get {"ml.t2.large" "ml.t2.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlt-2medium "ml.t2.medium", :mlt-2large "ml.t2.large", "ml.t2.2xlarge" "ml.t2.2xlarge", :mlm-410xlarge "ml.m4.10xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlt-2xlarge "ml.t2.xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", "ml.t2.xlarge" "ml.t2.xlarge", :mlt-22xlarge "ml.t2.2xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlp-2xlarge "ml.p2.xlarge", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", "ml.t2.medium" "ml.t2.medium"} input), :shape "InstanceType"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-sort-by-options [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "Status" "Status", :status "Status", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "HyperParameterTuningJobSortByOptions"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-training-input-mode [input] #:http.request.field{:value (clojure.core/get {"Pipe" "Pipe", :pipe "Pipe", "File" "File", :file "File"} input), :shape "TrainingInputMode"})

(clojure.core/defn- ser-transform-input [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-transform-data-source (:data-source input)) #:http.request.field{:name "DataSource", :shape "TransformDataSource"})], :shape "TransformInput", :type "structure"} (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType"})) (clojure.core/contains? input :compression-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-type (input :compression-type)) #:http.request.field{:name "CompressionType", :shape "CompressionType"})) (clojure.core/contains? input :split-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-split-type (input :split-type)) #:http.request.field{:name "SplitType", :shape "SplitType"}))))

(clojure.core/defn- ser-s-3-uri [input] #:http.request.field{:value input, :shape "S3Uri"})

(clojure.core/defn- ser-endpoint-config-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime"} input), :shape "EndpointConfigSortKey"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "LastModifiedTime" "LastModifiedTime", :last-modified-time "LastModifiedTime"} input), :shape "NotebookInstanceLifecycleConfigSortKey"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-production-variant-instance-type [input] #:http.request.field{:value (clojure.core/get {:mlm-5large "ml.m5.large", "ml.t2.large" "ml.t2.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.c4.large" "ml.c4.large", "ml.m5.xlarge" "ml.m5.xlarge", "ml.c5.xlarge" "ml.c5.xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.c5.9xlarge" "ml.c5.9xlarge", :mlm-54xlarge "ml.m5.4xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlt-2medium "ml.t2.medium", :mlt-2large "ml.t2.large", :mlm-52xlarge "ml.m5.2xlarge", "ml.m5.large" "ml.m5.large", :mlc-54xlarge "ml.c5.4xlarge", "ml.m5.12xlarge" "ml.m5.12xlarge", "ml.c5.2xlarge" "ml.c5.2xlarge", :mlc-52xlarge "ml.c5.2xlarge", "ml.c4.2xlarge" "ml.c4.2xlarge", "ml.t2.2xlarge" "ml.t2.2xlarge", "ml.c5.large" "ml.c5.large", "ml.c4.4xlarge" "ml.c4.4xlarge", :mlm-410xlarge "ml.m4.10xlarge", :mlm-512xlarge "ml.m5.12xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m5.4xlarge" "ml.m5.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlc-4large "ml.c4.large", :mlt-2xlarge "ml.t2.xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", :mlc-48xlarge "ml.c4.8xlarge", "ml.t2.xlarge" "ml.t2.xlarge", :mlt-22xlarge "ml.t2.2xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", :mlc-59xlarge "ml.c5.9xlarge", :mlc-4xlarge "ml.c4.xlarge", "ml.c4.8xlarge" "ml.c4.8xlarge", "ml.c5.18xlarge" "ml.c5.18xlarge", :mlc-42xlarge "ml.c4.2xlarge", :mlc-44xlarge "ml.c4.4xlarge", "ml.m5.2xlarge" "ml.m5.2xlarge", :mlc-518xlarge "ml.c5.18xlarge", "ml.c4.xlarge" "ml.c4.xlarge", "ml.m5.24xlarge" "ml.m5.24xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlm-524xlarge "ml.m5.24xlarge", :mlp-2xlarge "ml.p2.xlarge", :mlc-5large "ml.c5.large", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-5xlarge "ml.m5.xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", :mlc-5xlarge "ml.c5.xlarge", "ml.t2.medium" "ml.t2.medium", "ml.c5.4xlarge" "ml.c5.4xlarge"} input), :shape "ProductionVariantInstanceType"})

(clojure.core/defn- ser-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "SortOrder"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-parameter-values [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-parameter-value coll) #:http.request.field{:shape "ParameterValue"}))) input), :shape "ParameterValues", :type "list", :max 20, :min 1})

(clojure.core/defn- ser-production-variant-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-production-variant coll) #:http.request.field{:shape "ProductionVariant"}))) input), :shape "ProductionVariantList", :type "list", :min 1})

(clojure.core/defn- ser-environment-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-environment-key k) #:http.request.field{:map-info "key", :shape "EnvironmentKey"}) (clojure.core/into (ser-environment-value v) #:http.request.field{:map-info "value", :shape "EnvironmentValue"})])) input), :shape "EnvironmentMap", :type "map", :max 16})

(clojure.core/defn- ser-max-parallel-training-jobs [input] #:http.request.field{:value input, :shape "MaxParallelTrainingJobs"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-name [input] #:http.request.field{:value input, :shape "NotebookInstanceLifecycleConfigName"})

(clojure.core/defn- ser-session-expiration-duration-in-seconds [input] #:http.request.field{:value input, :shape "SessionExpirationDurationInSeconds"})

(clojure.core/defn- ser-vpc-security-group-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-security-group-id coll) #:http.request.field{:shape "SecurityGroupId"}))) input), :shape "VpcSecurityGroupIds", :type "list", :max 5, :min 1})

(clojure.core/defn- ser-notebook-instance-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :pending "Pending", "InService" "InService", :deleting "Deleting", :stopping "Stopping", :stopped "Stopped", "Deleting" "Deleting", :in-service "InService", "Stopping" "Stopping", :updating "Updating", "Stopped" "Stopped", "Pending" "Pending", "Updating" "Updating", :failed "Failed"} input), :shape "NotebookInstanceStatus"})

(clojure.core/defn- ser-notebook-instance-sort-order [input] #:http.request.field{:value (clojure.core/get {"Ascending" "Ascending", :ascending "Ascending", "Descending" "Descending", :descending "Descending"} input), :shape "NotebookInstanceSortOrder"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-name-contains [input] #:http.request.field{:value input, :shape "NotebookInstanceLifecycleConfigNameContains"})

(clojure.core/defn- ser-next-token [input] #:http.request.field{:value input, :shape "NextToken"})

(clojure.core/defn- ser-endpoint-name [input] #:http.request.field{:value input, :shape "EndpointName"})

(clojure.core/defn- ser-endpoint-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status"} input), :shape "EndpointSortKey"})

(clojure.core/defn- ser-list-tags-max-results [input] #:http.request.field{:value input, :shape "ListTagsMaxResults"})

(clojure.core/defn- ser-hyper-parameter-tuning-job-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hyper-parameter-tuning-job-strategy-type (:strategy input)) #:http.request.field{:name "Strategy", :shape "HyperParameterTuningJobStrategyType"}) (clojure.core/into (ser-hyper-parameter-tuning-job-objective (:hyper-parameter-tuning-job-objective input)) #:http.request.field{:name "HyperParameterTuningJobObjective", :shape "HyperParameterTuningJobObjective"}) (clojure.core/into (ser-resource-limits (:resource-limits input)) #:http.request.field{:name "ResourceLimits", :shape "ResourceLimits"}) (clojure.core/into (ser-parameter-ranges (:parameter-ranges input)) #:http.request.field{:name "ParameterRanges", :shape "ParameterRanges"})], :shape "HyperParameterTuningJobConfig", :type "structure"}))

(clojure.core/defn- ser-content-type [input] #:http.request.field{:value input, :shape "ContentType"})

(clojure.core/defn- ser-transform-environment-value [input] #:http.request.field{:value input, :shape "TransformEnvironmentValue"})

(clojure.core/defn- ser-direct-internet-access [input] #:http.request.field{:value (clojure.core/get {"Enabled" "Enabled", :enabled "Enabled", "Disabled" "Disabled", :disabled "Disabled"} input), :shape "DirectInternetAccess"})

(clojure.core/defn- ser-transform-environment-map [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [[k v]] [(clojure.core/into (ser-transform-environment-key k) #:http.request.field{:map-info "key", :shape "TransformEnvironmentKey"}) (clojure.core/into (ser-transform-environment-value v) #:http.request.field{:map-info "value", :shape "TransformEnvironmentValue"})])) input), :shape "TransformEnvironmentMap", :type "map", :max 16})

(clojure.core/defn- ser-s-3-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-data-type (:s-3-data-type input)) #:http.request.field{:name "S3DataType", :shape "S3DataType"}) (clojure.core/into (ser-s-3-uri (:s-3-uri input)) #:http.request.field{:name "S3Uri", :shape "S3Uri"})], :shape "S3DataSource", :type "structure"} (clojure.core/contains? input :s-3-data-distribution-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-data-distribution (input :s-3-data-distribution-type)) #:http.request.field{:name "S3DataDistributionType", :shape "S3DataDistribution"}))))

(clojure.core/defn- ser-stopping-condition [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StoppingCondition", :type "structure"} (clojure.core/contains? input :max-runtime-in-seconds) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-runtime-in-seconds (input :max-runtime-in-seconds)) #:http.request.field{:name "MaxRuntimeInSeconds", :shape "MaxRuntimeInSeconds"}))))

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list", :max 50, :min 0})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list", :max 50, :min 1})

(clojure.core/defn- ser-environment-value [input] #:http.request.field{:value input, :shape "EnvironmentValue"})

(clojure.core/defn- ser-categorical-parameter-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-key (:name input)) #:http.request.field{:name "Name", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-values (:values input)) #:http.request.field{:name "Values", :shape "ParameterValues"})], :shape "CategoricalParameterRange", :type "structure"}))

(clojure.core/defn- ser-hyper-parameter-tuning-job-objective-type [input] #:http.request.field{:value (clojure.core/get {"Maximize" "Maximize", :maximize "Maximize", "Minimize" "Minimize", :minimize "Minimize"} input), :shape "HyperParameterTuningJobObjectiveType"})

(clojure.core/defn- ser-max-runtime-in-seconds [input] #:http.request.field{:value input, :shape "MaxRuntimeInSeconds"})

(clojure.core/defn- ser-transform-environment-key [input] #:http.request.field{:value input, :shape "TransformEnvironmentKey"})

(clojure.core/defn- ser-metric-definition-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-metric-definition coll) #:http.request.field{:shape "MetricDefinition"}))) input), :shape "MetricDefinitionList", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-notebook-instance-sort-key [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status"} input), :shape "NotebookInstanceSortKey"})

(clojure.core/defn- ser-channel-name [input] #:http.request.field{:value input, :shape "ChannelName"})

(clojure.core/defn- ser-categorical-parameter-ranges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-categorical-parameter-range coll) #:http.request.field{:shape "CategoricalParameterRange"}))) input), :shape "CategoricalParameterRanges", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-notebook-instance-lifecycle-hook coll) #:http.request.field{:shape "NotebookInstanceLifecycleHook"}))) input), :shape "NotebookInstanceLifecycleConfigList", :type "list", :max 1})

(clojure.core/defn- ser-hyper-parameter-algorithm-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-algorithm-image (:training-image input)) #:http.request.field{:name "TrainingImage", :shape "AlgorithmImage"}) (clojure.core/into (ser-training-input-mode (:training-input-mode input)) #:http.request.field{:name "TrainingInputMode", :shape "TrainingInputMode"})], :shape "HyperParameterAlgorithmSpecification", :type "structure"} (clojure.core/contains? input :metric-definitions) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-metric-definition-list (input :metric-definitions)) #:http.request.field{:name "MetricDefinitions", :shape "MetricDefinitionList"}))))

(clojure.core/defn- ser-url [input] #:http.request.field{:value input, :shape "Url"})

(clojure.core/defn- ser-notebook-instance-lifecycle-config-content [input] #:http.request.field{:value input, :shape "NotebookInstanceLifecycleConfigContent"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-container-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-image (:image input)) #:http.request.field{:name "Image", :shape "Image"})], :shape "ContainerDefinition", :type "structure"} (clojure.core/contains? input :container-hostname) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-container-hostname (input :container-hostname)) #:http.request.field{:name "ContainerHostname", :shape "ContainerHostname"})) (clojure.core/contains? input :model-data-url) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-url (input :model-data-url)) #:http.request.field{:name "ModelDataUrl", :shape "Url"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-environment-map (input :environment)) #:http.request.field{:name "Environment", :shape "EnvironmentMap"}))))

(clojure.core/defn- ser-parameter-ranges [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "ParameterRanges", :type "structure"} (clojure.core/contains? input :integer-parameter-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-integer-parameter-ranges (input :integer-parameter-ranges)) #:http.request.field{:name "IntegerParameterRanges", :shape "IntegerParameterRanges"})) (clojure.core/contains? input :continuous-parameter-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-continuous-parameter-ranges (input :continuous-parameter-ranges)) #:http.request.field{:name "ContinuousParameterRanges", :shape "ContinuousParameterRanges"})) (clojure.core/contains? input :categorical-parameter-ranges) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-categorical-parameter-ranges (input :categorical-parameter-ranges)) #:http.request.field{:name "CategoricalParameterRanges", :shape "CategoricalParameterRanges"}))))

(clojure.core/defn- ser-production-variant [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-variant-name (:variant-name input)) #:http.request.field{:name "VariantName", :shape "VariantName"}) (clojure.core/into (ser-model-name (:model-name input)) #:http.request.field{:name "ModelName", :shape "ModelName"}) (clojure.core/into (ser-task-count (:initial-instance-count input)) #:http.request.field{:name "InitialInstanceCount", :shape "TaskCount"}) (clojure.core/into (ser-production-variant-instance-type (:instance-type input)) #:http.request.field{:name "InstanceType", :shape "ProductionVariantInstanceType"})], :shape "ProductionVariant", :type "structure"} (clojure.core/contains? input :initial-variant-weight) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-variant-weight (input :initial-variant-weight)) #:http.request.field{:name "InitialVariantWeight", :shape "VariantWeight"}))))

(clojure.core/defn- ser-security-group-id [input] #:http.request.field{:value input, :shape "SecurityGroupId"})

(clojure.core/defn- ser-notebook-instance-lifecycle-hook [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NotebookInstanceLifecycleHook", :type "structure"} (clojure.core/contains? input :content) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-content (input :content)) #:http.request.field{:name "Content", :shape "NotebookInstanceLifecycleConfigContent"}))))

(clojure.core/defn- ser-transform-job-name [input] #:http.request.field{:value input, :shape "TransformJobName"})

(clojure.core/defn- ser-kms-key-id [input] #:http.request.field{:value input, :shape "KmsKeyId"})

(clojure.core/defn- ser-batch-strategy [input] #:http.request.field{:value (clojure.core/get {"MultiRecord" "MultiRecord", :multi-record "MultiRecord", "SingleRecord" "SingleRecord", :single-record "SingleRecord"} input), :shape "BatchStrategy"})

(clojure.core/defn- ser-environment-key [input] #:http.request.field{:value input, :shape "EnvironmentKey"})

(clojure.core/defn- ser-data-source [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-data-source (:s-3-data-source input)) #:http.request.field{:name "S3DataSource", :shape "S3DataSource"})], :shape "DataSource", :type "structure"}))

(clojure.core/defn- ser-assembly-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Line" "Line", :line "Line"} input), :shape "AssemblyType"})

(clojure.core/defn- ser-variant-weight [input] #:http.request.field{:value input, :shape "VariantWeight"})

(clojure.core/defn- ser-split-type [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "Line" "Line", :line "Line", "RecordIO" "RecordIO", :record-io "RecordIO"} input), :shape "SplitType"})

(clojure.core/defn- ser-training-job-sort-by-options [input] #:http.request.field{:value (clojure.core/get {"Name" "Name", :name "Name", "CreationTime" "CreationTime", :creation-time "CreationTime", "Status" "Status", :status "Status", "FinalObjectiveMetricValue" "FinalObjectiveMetricValue", :final-objective-metric-value "FinalObjectiveMetricValue"} input), :shape "TrainingJobSortByOptions"})

(clojure.core/defn- ser-creation-time [input] #:http.request.field{:value input, :shape "CreationTime"})

(clojure.core/defn- ser-metric-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-metric-name (:name input)) #:http.request.field{:name "Name", :shape "MetricName"}) (clojure.core/into (ser-metric-regex (:regex input)) #:http.request.field{:name "Regex", :shape "MetricRegex"})], :shape "MetricDefinition", :type "structure"}))

(clojure.core/defn- ser-vpc-config [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-vpc-security-group-ids (:security-group-ids input)) #:http.request.field{:name "SecurityGroupIds", :shape "VpcSecurityGroupIds"}) (clojure.core/into (ser-subnets (:subnets input)) #:http.request.field{:name "Subnets", :shape "Subnets"})], :shape "VpcConfig", :type "structure"}))

(clojure.core/defn- ser-hyper-parameter-tuning-job-name [input] #:http.request.field{:value input, :shape "HyperParameterTuningJobName"})

(clojure.core/defn- ser-training-job-name [input] #:http.request.field{:value input, :shape "TrainingJobName"})

(clojure.core/defn- ser-transform-job-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :in-progress "InProgress", :completed "Completed", :stopping "Stopping", :stopped "Stopped", "InProgress" "InProgress", "Stopping" "Stopping", "Stopped" "Stopped", "Completed" "Completed", :failed "Failed"} input), :shape "TransformJobStatus"})

(clojure.core/defn- ser-transform-output [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-s-3-uri (:s-3-output-path input)) #:http.request.field{:name "S3OutputPath", :shape "S3Uri"})], :shape "TransformOutput", :type "structure"} (clojure.core/contains? input :accept) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-accept (input :accept)) #:http.request.field{:name "Accept", :shape "Accept"})) (clojure.core/contains? input :assemble-with) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-assembly-type (input :assemble-with)) #:http.request.field{:name "AssembleWith", :shape "AssemblyType"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- ser-desired-weight-and-capacity-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-desired-weight-and-capacity coll) #:http.request.field{:shape "DesiredWeightAndCapacity"}))) input), :shape "DesiredWeightAndCapacityList", :type "list", :min 1})

(clojure.core/defn- ser-endpoint-name-contains [input] #:http.request.field{:value input, :shape "EndpointNameContains"})

(clojure.core/defn- ser-hyper-parameter-training-job-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hyper-parameter-algorithm-specification (:algorithm-specification input)) #:http.request.field{:name "AlgorithmSpecification", :shape "HyperParameterAlgorithmSpecification"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}) (clojure.core/into (ser-input-data-config (:input-data-config input)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (:output-data-config input)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-resource-config (:resource-config input)) #:http.request.field{:name "ResourceConfig", :shape "ResourceConfig"}) (clojure.core/into (ser-stopping-condition (:stopping-condition input)) #:http.request.field{:name "StoppingCondition", :shape "StoppingCondition"})], :shape "HyperParameterTrainingJobDefinition", :type "structure"} (clojure.core/contains? input :static-hyper-parameters) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameters (input :static-hyper-parameters)) #:http.request.field{:name "StaticHyperParameters", :shape "HyperParameters"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"}))))

(clojure.core/defn- ser-timestamp [input] #:http.request.field{:value input, :shape "Timestamp"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceArn"})

(clojure.core/defn- ser-desired-weight-and-capacity [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-variant-name (:variant-name input)) #:http.request.field{:name "VariantName", :shape "VariantName"})], :shape "DesiredWeightAndCapacity", :type "structure"} (clojure.core/contains? input :desired-weight) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-variant-weight (input :desired-weight)) #:http.request.field{:name "DesiredWeight", :shape "VariantWeight"})) (clojure.core/contains? input :desired-instance-count) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-task-count (input :desired-instance-count)) #:http.request.field{:name "DesiredInstanceCount", :shape "TaskCount"}))))

(clojure.core/defn- ser-record-wrapper [input] #:http.request.field{:value (clojure.core/get {"None" "None", :none "None", "RecordIO" "RecordIO", :record-io "RecordIO"} input), :shape "RecordWrapper"})

(clojure.core/defn- ser-channel [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-channel-name (:channel-name input)) #:http.request.field{:name "ChannelName", :shape "ChannelName"}) (clojure.core/into (ser-data-source (:data-source input)) #:http.request.field{:name "DataSource", :shape "DataSource"})], :shape "Channel", :type "structure"} (clojure.core/contains? input :content-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "ContentType", :shape "ContentType"})) (clojure.core/contains? input :compression-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-compression-type (input :compression-type)) #:http.request.field{:name "CompressionType", :shape "CompressionType"})) (clojure.core/contains? input :record-wrapper-type) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-record-wrapper (input :record-wrapper-type)) #:http.request.field{:name "RecordWrapperType", :shape "RecordWrapper"}))))

(clojure.core/defn- ser-hyper-parameter-tuning-job-objective [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-hyper-parameter-tuning-job-objective-type (:type input)) #:http.request.field{:name "Type", :shape "HyperParameterTuningJobObjectiveType"}) (clojure.core/into (ser-metric-name (:metric-name input)) #:http.request.field{:name "MetricName", :shape "MetricName"})], :shape "HyperParameterTuningJobObjective", :type "structure"}))

(clojure.core/defn- ser-disassociate-notebook-instance-lifecycle-config [input] #:http.request.field{:value input, :shape "DisassociateNotebookInstanceLifecycleConfig"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-metric-name [input] #:http.request.field{:value input, :shape "MetricName"})

(clojure.core/defn- ser-integer-parameter-ranges [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-integer-parameter-range coll) #:http.request.field{:shape "IntegerParameterRange"}))) input), :shape "IntegerParameterRanges", :type "list", :max 20, :min 0})

(clojure.core/defn- ser-training-instance-type [input] #:http.request.field{:value (clojure.core/get {:mlm-5large "ml.m5.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.m5.xlarge" "ml.m5.xlarge", "ml.c5.xlarge" "ml.c5.xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.c5.9xlarge" "ml.c5.9xlarge", :mlm-54xlarge "ml.m5.4xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlm-52xlarge "ml.m5.2xlarge", "ml.m5.large" "ml.m5.large", :mlc-54xlarge "ml.c5.4xlarge", "ml.m5.12xlarge" "ml.m5.12xlarge", "ml.c5.2xlarge" "ml.c5.2xlarge", :mlc-52xlarge "ml.c5.2xlarge", "ml.c4.2xlarge" "ml.c4.2xlarge", "ml.c4.4xlarge" "ml.c4.4xlarge", :mlm-410xlarge "ml.m4.10xlarge", :mlm-512xlarge "ml.m5.12xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m5.4xlarge" "ml.m5.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", :mlc-48xlarge "ml.c4.8xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", :mlc-59xlarge "ml.c5.9xlarge", :mlc-4xlarge "ml.c4.xlarge", "ml.c4.8xlarge" "ml.c4.8xlarge", "ml.c5.18xlarge" "ml.c5.18xlarge", :mlc-42xlarge "ml.c4.2xlarge", :mlc-44xlarge "ml.c4.4xlarge", "ml.m5.2xlarge" "ml.m5.2xlarge", :mlc-518xlarge "ml.c5.18xlarge", "ml.c4.xlarge" "ml.c4.xlarge", "ml.m5.24xlarge" "ml.m5.24xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlm-524xlarge "ml.m5.24xlarge", :mlp-2xlarge "ml.p2.xlarge", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-5xlarge "ml.m5.xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", :mlc-5xlarge "ml.c5.xlarge", "ml.c5.4xlarge" "ml.c5.4xlarge"} input), :shape "TrainingInstanceType"})

(clojure.core/defn- ser-integer-parameter-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-key (:name input)) #:http.request.field{:name "Name", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-value (:min-value input)) #:http.request.field{:name "MinValue", :shape "ParameterValue"}) (clojure.core/into (ser-parameter-value (:max-value input)) #:http.request.field{:name "MaxValue", :shape "ParameterValue"})], :shape "IntegerParameterRange", :type "structure"}))

(clojure.core/defn- ser-algorithm-image [input] #:http.request.field{:value input, :shape "AlgorithmImage"})

(clojure.core/defn- ser-last-modified-time [input] #:http.request.field{:value input, :shape "LastModifiedTime"})

(clojure.core/defn- ser-image [input] #:http.request.field{:value input, :shape "Image"})

(clojure.core/defn- ser-accept [input] #:http.request.field{:value input, :shape "Accept"})

(clojure.core/defn- ser-training-job-status [input] #:http.request.field{:value (clojure.core/get {"Failed" "Failed", :in-progress "InProgress", :completed "Completed", :stopping "Stopping", :stopped "Stopped", "InProgress" "InProgress", "Stopping" "Stopping", "Stopped" "Stopped", "Completed" "Completed", :failed "Failed"} input), :shape "TrainingJobStatus"})

(clojure.core/defn- ser-continuous-parameter-range [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-parameter-key (:name input)) #:http.request.field{:name "Name", :shape "ParameterKey"}) (clojure.core/into (ser-parameter-value (:min-value input)) #:http.request.field{:name "MinValue", :shape "ParameterValue"}) (clojure.core/into (ser-parameter-value (:max-value input)) #:http.request.field{:name "MaxValue", :shape "ParameterValue"})], :shape "ContinuousParameterRange", :type "structure"}))

(clojure.core/defn- ser-algorithm-specification [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-algorithm-image (:training-image input)) #:http.request.field{:name "TrainingImage", :shape "AlgorithmImage"}) (clojure.core/into (ser-training-input-mode (:training-input-mode input)) #:http.request.field{:name "TrainingInputMode", :shape "TrainingInputMode"})], :shape "AlgorithmSpecification", :type "structure"}))

(clojure.core/defn- ser-notebook-instance-name-contains [input] #:http.request.field{:value input, :shape "NotebookInstanceNameContains"})

(clojure.core/defn- ser-notebook-instance-name [input] #:http.request.field{:value input, :shape "NotebookInstanceName"})

(clojure.core/defn- ser-transform-instance-type [input] #:http.request.field{:value (clojure.core/get {:mlm-5large "ml.m5.large", :mlm-42xlarge "ml.m4.2xlarge", :mlp-32xlarge "ml.p3.2xlarge", :mlp-316xlarge "ml.p3.16xlarge", "ml.m5.xlarge" "ml.m5.xlarge", "ml.c5.xlarge" "ml.c5.xlarge", "ml.m4.2xlarge" "ml.m4.2xlarge", "ml.c5.9xlarge" "ml.c5.9xlarge", :mlm-54xlarge "ml.m5.4xlarge", "ml.p2.16xlarge" "ml.p2.16xlarge", :mlm-52xlarge "ml.m5.2xlarge", "ml.m5.large" "ml.m5.large", :mlc-54xlarge "ml.c5.4xlarge", "ml.m5.12xlarge" "ml.m5.12xlarge", "ml.c5.2xlarge" "ml.c5.2xlarge", :mlc-52xlarge "ml.c5.2xlarge", "ml.c4.2xlarge" "ml.c4.2xlarge", "ml.c4.4xlarge" "ml.c4.4xlarge", :mlm-410xlarge "ml.m4.10xlarge", :mlm-512xlarge "ml.m5.12xlarge", "ml.m4.4xlarge" "ml.m4.4xlarge", "ml.m5.4xlarge" "ml.m5.4xlarge", "ml.m4.xlarge" "ml.m4.xlarge", "ml.m4.16xlarge" "ml.m4.16xlarge", :mlp-38xlarge "ml.p3.8xlarge", :mlm-416xlarge "ml.m4.16xlarge", "ml.p2.8xlarge" "ml.p2.8xlarge", :mlm-44xlarge "ml.m4.4xlarge", :mlc-48xlarge "ml.c4.8xlarge", "ml.p3.16xlarge" "ml.p3.16xlarge", :mlc-59xlarge "ml.c5.9xlarge", :mlc-4xlarge "ml.c4.xlarge", "ml.c4.8xlarge" "ml.c4.8xlarge", "ml.c5.18xlarge" "ml.c5.18xlarge", :mlc-42xlarge "ml.c4.2xlarge", :mlc-44xlarge "ml.c4.4xlarge", "ml.m5.2xlarge" "ml.m5.2xlarge", :mlc-518xlarge "ml.c5.18xlarge", "ml.c4.xlarge" "ml.c4.xlarge", "ml.m5.24xlarge" "ml.m5.24xlarge", "ml.p3.2xlarge" "ml.p3.2xlarge", :mlp-216xlarge "ml.p2.16xlarge", :mlm-524xlarge "ml.m5.24xlarge", :mlp-2xlarge "ml.p2.xlarge", "ml.p3.8xlarge" "ml.p3.8xlarge", :mlp-28xlarge "ml.p2.8xlarge", :mlm-5xlarge "ml.m5.xlarge", :mlm-4xlarge "ml.m4.xlarge", "ml.p2.xlarge" "ml.p2.xlarge", "ml.m4.10xlarge" "ml.m4.10xlarge", :mlc-5xlarge "ml.c5.xlarge", "ml.c5.4xlarge" "ml.c5.4xlarge"} input), :shape "TransformInstanceType"})

(clojure.core/defn- ser-endpoint-config-name [input] #:http.request.field{:value input, :shape "EndpointConfigName"})

(clojure.core/defn- ser-parameter-value [input] #:http.request.field{:value input, :shape "ParameterValue"})

(clojure.core/defn- req-delete-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"})]}))

(clojure.core/defn- req-describe-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-update-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"}) (clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]}))

(clojure.core/defn- req-create-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]} (clojure.core/contains? input :on-create) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-create)) #:http.request.field{:name "OnCreate", :shape "NotebookInstanceLifecycleConfigList"})) (clojure.core/contains? input :on-start) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-start)) #:http.request.field{:name "OnStart", :shape "NotebookInstanceLifecycleConfigList"}))))

(clojure.core/defn- req-list-notebook-instance-lifecycle-configs-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "CreationTime"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NotebookInstanceLifecycleConfigNameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "NotebookInstanceLifecycleConfigSortKey"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "CreationTime"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "NotebookInstanceLifecycleConfigSortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "LastModifiedTime"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "LastModifiedTime"}))))

(clojure.core/defn- req-update-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]} (clojure.core/contains? input :on-create) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-create)) #:http.request.field{:name "OnCreate", :shape "NotebookInstanceLifecycleConfigList"})) (clojure.core/contains? input :on-start) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-list (input :on-start)) #:http.request.field{:name "OnStart", :shape "NotebookInstanceLifecycleConfigList"}))))

(clojure.core/defn- req-stop-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"})]}))

(clojure.core/defn- req-create-endpoint-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"}) (clojure.core/into (ser-production-variant-list (input :production-variants)) #:http.request.field{:name "ProductionVariants", :shape "ProductionVariantList"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"}))))

(clojure.core/defn- req-list-endpoint-configs-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-config-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "EndpointConfigSortKey"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-key (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "OrderKey"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-config-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "EndpointConfigNameContains"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- req-list-hyper-parameter-tuning-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameter-tuning-job-sort-by-options (input :sort-by)) #:http.request.field{:name "SortBy", :shape "HyperParameterTuningJobSortByOptions"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameter-tuning-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "HyperParameterTuningJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-list-models-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ModelSortKey"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-key (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "OrderKey"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-model-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "ModelNameContains"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"}))))

(clojure.core/defn- req-update-endpoint-weights-and-capacities-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"}) (clojure.core/into (ser-desired-weight-and-capacity-list (input :desired-weights-and-capacities)) #:http.request.field{:name "DesiredWeightsAndCapacities", :shape "DesiredWeightAndCapacityList"})]}))

(clojure.core/defn- req-delete-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"})]}))

(clojure.core/defn- req-create-transform-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transform-job-name (input :transform-job-name)) #:http.request.field{:name "TransformJobName", :shape "TransformJobName"}) (clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"}) (clojure.core/into (ser-transform-input (input :transform-input)) #:http.request.field{:name "TransformInput", :shape "TransformInput"}) (clojure.core/into (ser-transform-output (input :transform-output)) #:http.request.field{:name "TransformOutput", :shape "TransformOutput"}) (clojure.core/into (ser-transform-resources (input :transform-resources)) #:http.request.field{:name "TransformResources", :shape "TransformResources"})]} (clojure.core/contains? input :max-payload-in-mb) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-payload-in-mb (input :max-payload-in-mb)) #:http.request.field{:name "MaxPayloadInMB", :shape "MaxPayloadInMB"})) (clojure.core/contains? input :max-concurrent-transforms) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-concurrent-transforms (input :max-concurrent-transforms)) #:http.request.field{:name "MaxConcurrentTransforms", :shape "MaxConcurrentTransforms"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :batch-strategy) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-batch-strategy (input :batch-strategy)) #:http.request.field{:name "BatchStrategy", :shape "BatchStrategy"})) (clojure.core/contains? input :environment) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transform-environment-map (input :environment)) #:http.request.field{:name "Environment", :shape "TransformEnvironmentMap"}))))

(clojure.core/defn- req-create-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"}) (clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-describe-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"})]}))

(clojure.core/defn- req-describe-endpoint-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]}))

(clojure.core/defn- req-stop-transform-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transform-job-name (input :transform-job-name)) #:http.request.field{:name "TransformJobName", :shape "TransformJobName"})]}))

(clojure.core/defn- req-describe-transform-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-transform-job-name (input :transform-job-name)) #:http.request.field{:name "TransformJobName", :shape "TransformJobName"})]}))

(clojure.core/defn- req-create-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"}) (clojure.core/into (ser-container-definition (input :primary-container)) #:http.request.field{:name "PrimaryContainer", :shape "ContainerDefinition"}) (clojure.core/into (ser-role-arn (input :execution-role-arn)) #:http.request.field{:name "ExecutionRoleArn", :shape "RoleArn"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"}))))

(clojure.core/defn- req-create-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"}) (clojure.core/into (ser-instance-type (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "InstanceType"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})]} (clojure.core/contains? input :security-group-ids) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-security-group-ids (input :security-group-ids)) #:http.request.field{:name "SecurityGroupIds", :shape "SecurityGroupIds"})) (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "SubnetId"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :direct-internet-access) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-direct-internet-access (input :direct-internet-access)) #:http.request.field{:name "DirectInternetAccess", :shape "DirectInternetAccess"})) (clojure.core/contains? input :kms-key-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key-id (input :kms-key-id)) #:http.request.field{:name "KmsKeyId", :shape "KmsKeyId"})) (clojure.core/contains? input :lifecycle-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :lifecycle-config-name)) #:http.request.field{:name "LifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"}))))

(clojure.core/defn- req-delete-endpoint-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-config-name (input :endpoint-config-name)) #:http.request.field{:name "EndpointConfigName", :shape "EndpointConfigName"})]}))

(clojure.core/defn- req-stop-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-start-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-delete-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]}))

(clojure.core/defn- req-delete-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-tag-key-list (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeyList"})]}))

(clojure.core/defn- req-update-notebook-instance-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]} (clojure.core/contains? input :instance-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-instance-type (input :instance-type)) #:http.request.field{:name "InstanceType", :shape "InstanceType"})) (clojure.core/contains? input :role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})) (clojure.core/contains? input :lifecycle-config-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :lifecycle-config-name)) #:http.request.field{:name "LifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})) (clojure.core/contains? input :disassociate-lifecycle-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disassociate-notebook-instance-lifecycle-config (input :disassociate-lifecycle-config)) #:http.request.field{:name "DisassociateLifecycleConfig", :shape "DisassociateNotebookInstanceLifecycleConfig"}))))

(clojure.core/defn- req-add-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"}) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})]}))

(clojure.core/defn- req-list-endpoints-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "EndpointNameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "EndpointSortKey"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-order-key (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "OrderKey"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-endpoint-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "EndpointStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-delete-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]}))

(clojure.core/defn- req-list-training-jobs-for-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "TrainingJobStatus"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-job-sort-by-options (input :sort-by)) #:http.request.field{:name "SortBy", :shape "TrainingJobSortByOptions"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"}))))

(clojure.core/defn- req-describe-notebook-instance-lifecycle-config-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name)) #:http.request.field{:name "NotebookInstanceLifecycleConfigName", :shape "NotebookInstanceLifecycleConfigName"})]}))

(clojure.core/defn- req-list-training-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "SortBy"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-training-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "TrainingJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-stop-training-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-training-job-name (input :training-job-name)) #:http.request.field{:name "TrainingJobName", :shape "TrainingJobName"})]}))

(clojure.core/defn- req-create-hyper-parameter-tuning-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hyper-parameter-tuning-job-name (input :hyper-parameter-tuning-job-name)) #:http.request.field{:name "HyperParameterTuningJobName", :shape "HyperParameterTuningJobName"}) (clojure.core/into (ser-hyper-parameter-tuning-job-config (input :hyper-parameter-tuning-job-config)) #:http.request.field{:name "HyperParameterTuningJobConfig", :shape "HyperParameterTuningJobConfig"}) (clojure.core/into (ser-hyper-parameter-training-job-definition (input :training-job-definition)) #:http.request.field{:name "TrainingJobDefinition", :shape "HyperParameterTrainingJobDefinition"})]} (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"}))))

(clojure.core/defn- req-create-training-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-training-job-name (input :training-job-name)) #:http.request.field{:name "TrainingJobName", :shape "TrainingJobName"}) (clojure.core/into (ser-algorithm-specification (input :algorithm-specification)) #:http.request.field{:name "AlgorithmSpecification", :shape "AlgorithmSpecification"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"}) (clojure.core/into (ser-input-data-config (input :input-data-config)) #:http.request.field{:name "InputDataConfig", :shape "InputDataConfig"}) (clojure.core/into (ser-output-data-config (input :output-data-config)) #:http.request.field{:name "OutputDataConfig", :shape "OutputDataConfig"}) (clojure.core/into (ser-resource-config (input :resource-config)) #:http.request.field{:name "ResourceConfig", :shape "ResourceConfig"}) (clojure.core/into (ser-stopping-condition (input :stopping-condition)) #:http.request.field{:name "StoppingCondition", :shape "StoppingCondition"})]} (clojure.core/contains? input :hyper-parameters) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hyper-parameters (input :hyper-parameters)) #:http.request.field{:name "HyperParameters", :shape "HyperParameters"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tag-list (input :tags)) #:http.request.field{:name "Tags", :shape "TagList"})) (clojure.core/contains? input :vpc-config) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vpc-config (input :vpc-config)) #:http.request.field{:name "VpcConfig", :shape "VpcConfig"}))))

(clojure.core/defn- req-create-presigned-notebook-instance-url-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-notebook-instance-name (input :notebook-instance-name)) #:http.request.field{:name "NotebookInstanceName", :shape "NotebookInstanceName"})]} (clojure.core/contains? input :session-expiration-duration-in-seconds) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-session-expiration-duration-in-seconds (input :session-expiration-duration-in-seconds)) #:http.request.field{:name "SessionExpirationDurationInSeconds", :shape "SessionExpirationDurationInSeconds"}))))

(clojure.core/defn- req-list-transform-jobs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "SortBy"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "Timestamp"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "SortOrder"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "Timestamp"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-transform-job-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "TransformJobStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults", :box true})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-timestamp (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "Timestamp"}))))

(clojure.core/defn- req-describe-endpoint-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-endpoint-name (input :endpoint-name)) #:http.request.field{:name "EndpointName", :shape "EndpointName"})]}))

(clojure.core/defn- req-describe-model-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-model-name (input :model-name)) #:http.request.field{:name "ModelName", :shape "ModelName"})]}))

(clojure.core/defn- req-list-tags-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "ResourceArn"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-list-tags-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "ListTagsMaxResults"}))))

(clojure.core/defn- req-list-notebook-instances-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :creation-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-after)) #:http.request.field{:name "CreationTimeAfter", :shape "CreationTime"})) (clojure.core/contains? input :name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-name-contains (input :name-contains)) #:http.request.field{:name "NameContains", :shape "NotebookInstanceNameContains"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-sort-key (input :sort-by)) #:http.request.field{:name "SortBy", :shape "NotebookInstanceSortKey"})) (clojure.core/contains? input :creation-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-creation-time (input :creation-time-before)) #:http.request.field{:name "CreationTimeBefore", :shape "CreationTime"})) (clojure.core/contains? input :sort-order) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-sort-order (input :sort-order)) #:http.request.field{:name "SortOrder", :shape "NotebookInstanceSortOrder"})) (clojure.core/contains? input :notebook-instance-lifecycle-config-name-contains) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-lifecycle-config-name (input :notebook-instance-lifecycle-config-name-contains)) #:http.request.field{:name "NotebookInstanceLifecycleConfigNameContains", :shape "NotebookInstanceLifecycleConfigName"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-next-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "NextToken"})) (clojure.core/contains? input :last-modified-time-after) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-after)) #:http.request.field{:name "LastModifiedTimeAfter", :shape "LastModifiedTime"})) (clojure.core/contains? input :status-equals) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notebook-instance-status (input :status-equals)) #:http.request.field{:name "StatusEquals", :shape "NotebookInstanceStatus"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :last-modified-time-before) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-last-modified-time (input :last-modified-time-before)) #:http.request.field{:name "LastModifiedTimeBefore", :shape "LastModifiedTime"}))))

(clojure.core/defn- req-describe-training-job-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-training-job-name (input :training-job-name)) #:http.request.field{:name "TrainingJobName", :shape "TrainingJobName"})]}))

(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-config/instance-type (clojure.spec.alpha/and :portkey.aws.sagemaker/training-instance-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-config/instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/training-instance-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-config/volume-kms-key-id (clojure.spec.alpha/and :portkey.aws.sagemaker/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.resource-config/instance-type :portkey.aws.sagemaker.resource-config/instance-count :portkey.aws.sagemaker/volume-size-in-gb] :opt-un [:portkey.aws.sagemaker.resource-config/volume-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/input-data-config (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/channel :min-count 1 :max-count 8))

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/objective-status-counter (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/task-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/compression-type #{"None" :gzip :none "Gzip"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoint-configs-output/endpoint-configs (clojure.spec.alpha/and :portkey.aws.sagemaker/endpoint-config-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoint-configs-output/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-endpoint-configs-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.list-endpoint-configs-output/endpoint-configs] :opt-un [:portkey.aws.sagemaker.list-endpoint-configs-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.output-data-config/s-3-output-path (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker/output-data-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.output-data-config/s-3-output-path] :opt-un [:portkey.aws.sagemaker/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-regex (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-status #{"Failed" "Creating" "SystemUpdating" :system-updating :creating "InService" "RollingBack" :deleting "OutOfService" :out-of-service "Deleting" :in-service :rolling-back :updating "Updating" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-status #{"Failed" :in-progress :completed :stopping :stopped "InProgress" "Stopping" "Stopped" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/endpoint-config-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name :portkey.aws.sagemaker/endpoint-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-arn]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/variant-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-lifecycle-config-input/on-create (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-lifecycle-config-input/on-start (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-name] :opt-un [:portkey.aws.sagemaker.create-notebook-instance-lifecycle-config-input/on-create :portkey.aws.sagemaker.create-notebook-instance-lifecycle-config-input/on-start]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/name-contains (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name-contains))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-sort-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/creation-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/sort-order (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-sort-order))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/creation-time-after :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/name-contains :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/sort-by :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/creation-time-before :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/last-modified-time-after :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-input/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/sort-by #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-transform-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-summaries] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-lifecycle-config-input/on-create (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-lifecycle-config-input/on-start (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-name] :opt-un [:portkey.aws.sagemaker.update-notebook-instance-lifecycle-config-input/on-create :portkey.aws.sagemaker.update-notebook-instance-lifecycle-config-input/on-start]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.endpoint-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.endpoint-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name :portkey.aws.sagemaker/endpoint-arn :portkey.aws.sagemaker.endpoint-summary/creation-time :portkey.aws.sagemaker.endpoint-summary/last-modified-time :portkey.aws.sagemaker/endpoint-status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-payload-in-mb (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-number-of-training-jobs (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-models-output/models (clojure.spec.alpha/and :portkey.aws.sagemaker/model-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-models-output/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-models-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.list-models-output/models] :opt-un [:portkey.aws.sagemaker.list-models-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/stop-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-resources/instance-type (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-instance-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-resources/instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-instance-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-resources/volume-kms-key-id (clojure.spec.alpha/and :portkey.aws.sagemaker/kms-key-id))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-resources (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.transform-resources/instance-type :portkey.aws.sagemaker.transform-resources/instance-count] :opt-un [:portkey.aws.sagemaker.transform-resources/volume-kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-status-counter (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/volume-size-in-gb (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/security-group-id :max-count 5))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-presigned-notebook-instance-url-output/authorized-url (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-presigned-notebook-instance-url-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.create-presigned-notebook-instance-url-output/authorized-url]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameters (clojure.spec.alpha/map-of :portkey.aws.sagemaker/parameter-key :portkey.aws.sagemaker/parameter-value))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-strategy-type #{"Bayesian" :bayesian})

(clojure.spec.alpha/def :portkey.aws.sagemaker/continuous-parameter-ranges (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/continuous-parameter-range :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/hyper-parameter-tuning-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/best-training-job (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-training-job-summary))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/training-job-definition (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-training-job-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name :portkey.aws.sagemaker/hyper-parameter-tuning-job-arn :portkey.aws.sagemaker/hyper-parameter-tuning-job-config :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/training-job-definition :portkey.aws.sagemaker/hyper-parameter-tuning-job-status :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/creation-time :portkey.aws.sagemaker/training-job-status-counters :portkey.aws.sagemaker/objective-status-counters] :opt-un [:portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/hyper-parameter-tuning-end-time :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/best-training-job :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker.describe-hyper-parameter-tuning-job-response/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-training-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/hyper-parameter-training-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/subnets (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/subnet-id :min-count 1 :max-count 16))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-endpoint-config-input/production-variants (clojure.spec.alpha/and :portkey.aws.sagemaker/production-variant-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-endpoint-config-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-endpoint-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-name :portkey.aws.sagemaker.create-endpoint-config-input/production-variants] :opt-un [:portkey.aws.sagemaker.create-endpoint-config-input/tags :portkey.aws.sagemaker/kms-key-id]))

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
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-transform-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-name :portkey.aws.sagemaker/transform-job-arn :portkey.aws.sagemaker/transform-job-status :portkey.aws.sagemaker/model-name :portkey.aws.sagemaker/transform-input :portkey.aws.sagemaker/transform-resources :portkey.aws.sagemaker.describe-transform-job-response/creation-time] :opt-un [:portkey.aws.sagemaker.describe-transform-job-response/transform-end-time :portkey.aws.sagemaker/max-payload-in-mb :portkey.aws.sagemaker/max-concurrent-transforms :portkey.aws.sagemaker.describe-transform-job-response/transform-start-time :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker/batch-strategy :portkey.aws.sagemaker.describe-transform-job-response/environment :portkey.aws.sagemaker/transform-output]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-instance-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-data-source/s-3-data-source (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-s-3-data-source))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.transform-data-source/s-3-data-source] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-limits (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/max-number-of-training-jobs :portkey.aws.sagemaker/max-parallel-training-jobs] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-instance-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/s-3-data-type #{:s-3-prefix "ManifestFile" :manifest-file "S3Prefix"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/s-3-data-distribution #{"ShardedByS3Key" :fully-replicated "FullyReplicated" :sharded-by-s-3-key})

(clojure.spec.alpha/def :portkey.aws.sagemaker/status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-s-3-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/s-3-data-type :portkey.aws.sagemaker/s-3-uri] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-concurrent-transforms (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/container-hostname (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27967__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-sort-key #{:name "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/instance-type #{"ml.t2.large" :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.m4.2xlarge" "ml.p2.16xlarge" :mlt-2medium :mlt-2large "ml.t2.2xlarge" :mlm-410xlarge "ml.m4.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlt-2xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge "ml.t2.xlarge" :mlt-22xlarge "ml.p3.16xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlp-2xlarge "ml.p3.8xlarge" :mlp-28xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" "ml.t2.medium"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-output/primary-container (clojure.spec.alpha/and :portkey.aws.sagemaker/container-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-output/execution-role-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/role-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-model-output/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-model-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-name :portkey.aws.sagemaker.describe-model-output/primary-container :portkey.aws.sagemaker.describe-model-output/execution-role-arn :portkey.aws.sagemaker.describe-model-output/creation-time :portkey.aws.sagemaker/model-arn] :opt-un [:portkey.aws.sagemaker/vpc-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.final-hyper-parameter-tuning-job-objective-metric/type (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.final-hyper-parameter-tuning-job-objective-metric/value (clojure.spec.alpha/and :portkey.aws.sagemaker/metric-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/final-hyper-parameter-tuning-job-objective-metric (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/metric-name :portkey.aws.sagemaker.final-hyper-parameter-tuning-job-objective-metric/value] :opt-un [:portkey.aws.sagemaker.final-hyper-parameter-tuning-job-objective-metric/type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-sort-by-options #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 20 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^arn:aws[a-z\-]*:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-input-mode #{"Pipe" "File" :pipe :file})

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-input/data-source (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-data-source))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.transform-input/data-source] :opt-un [:portkey.aws.sagemaker/content-type :portkey.aws.sagemaker/compression-type :portkey.aws.sagemaker/split-type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/s-3-uri (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(https|s3)://([^/]+)/?(.*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-sort-key #{:name "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-sort-key #{:name "CreationTime" "LastModifiedTime" "Name" :last-modified-time :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker.add-tags-output/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/add-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.add-tags-output/tags]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 128)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^((?!aws:)[\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-job-summary/transform-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-job-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-name :portkey.aws.sagemaker/transform-job-arn :portkey.aws.sagemaker.transform-job-summary/creation-time :portkey.aws.sagemaker/transform-job-status] :opt-un [:portkey.aws.sagemaker.transform-job-summary/transform-end-time :portkey.aws.sagemaker.transform-job-summary/last-modified-time :portkey.aws.sagemaker/failure-reason]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant-instance-type #{:mlm-5large "ml.t2.large" :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.c4.large" "ml.m5.xlarge" "ml.c5.xlarge" "ml.m4.2xlarge" "ml.c5.9xlarge" :mlm-54xlarge "ml.p2.16xlarge" :mlt-2medium :mlt-2large :mlm-52xlarge "ml.m5.large" :mlc-54xlarge "ml.m5.12xlarge" "ml.c5.2xlarge" :mlc-52xlarge "ml.c4.2xlarge" "ml.t2.2xlarge" "ml.c5.large" "ml.c4.4xlarge" :mlm-410xlarge :mlm-512xlarge "ml.m4.4xlarge" "ml.m5.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlc-4large :mlt-2xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge :mlc-48xlarge "ml.t2.xlarge" :mlt-22xlarge "ml.p3.16xlarge" :mlc-59xlarge :mlc-4xlarge "ml.c4.8xlarge" "ml.c5.18xlarge" :mlc-42xlarge :mlc-44xlarge "ml.m5.2xlarge" :mlc-518xlarge "ml.c4.xlarge" "ml.m5.24xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlm-524xlarge :mlp-2xlarge :mlc-5large "ml.p3.8xlarge" :mlp-28xlarge :mlm-5xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" :mlc-5xlarge "ml.t2.medium" "ml.c5.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-values (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/parameter-value :min-count 1 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/production-variant :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker/network-interface-id (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker/environment-map (clojure.spec.alpha/map-of :portkey.aws.sagemaker/environment-key :portkey.aws.sagemaker/environment-value))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-parallel-training-jobs (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.update-endpoint-weights-and-capacities-input/desired-weights-and-capacities (clojure.spec.alpha/and :portkey.aws.sagemaker/desired-weight-and-capacity-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name :portkey.aws.sagemaker.update-endpoint-weights-and-capacities-input/desired-weights-and-capacities] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/session-expiration-duration-in-seconds (clojure.spec.alpha/int-in 1800 43200))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-model-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-output/notebook-instances (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-notebook-instances-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-notebook-instances-output/notebook-instances]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/vpc-security-group-ids (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/security-group-id :min-count 1 :max-count 5))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-output/security-groups (clojure.spec.alpha/and :portkey.aws.sagemaker/security-group-ids))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-output/url (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-notebook-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/notebook-instance-arn :portkey.aws.sagemaker/subnet-id :portkey.aws.sagemaker.describe-notebook-instance-output/security-groups :portkey.aws.sagemaker/instance-type :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/network-interface-id :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name :portkey.aws.sagemaker/notebook-instance-status :portkey.aws.sagemaker/direct-internet-access :portkey.aws.sagemaker.describe-notebook-instance-output/url :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker/kms-key-id :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/last-modified-time :portkey.aws.sagemaker/notebook-instance-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-status #{"Failed" :pending "InService" :deleting :stopping :stopped "Deleting" :in-service "Stopping" :updating "Stopped" "Pending" "Updating" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-transform-job-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-transform-job-request/environment (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-environment-map))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-transform-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-name :portkey.aws.sagemaker/model-name :portkey.aws.sagemaker/transform-input :portkey.aws.sagemaker/transform-output :portkey.aws.sagemaker/transform-resources] :opt-un [:portkey.aws.sagemaker/max-payload-in-mb :portkey.aws.sagemaker/max-concurrent-transforms :portkey.aws.sagemaker.create-transform-job-request/tags :portkey.aws.sagemaker/batch-strategy :portkey.aws.sagemaker.create-transform-job-request/environment]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-sort-order #{"Descending" :descending :ascending "Ascending"})

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-response/training-job-summaries (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-training-job-summaries))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-response/training-job-summaries] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-training-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-summaries] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/next-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 8192))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/objective-status #{"Failed" "Succeeded" :pending "Pending" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-endpoint-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name :portkey.aws.sagemaker/endpoint-config-name] :opt-un [:portkey.aws.sagemaker.create-endpoint-input/tags]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:training-job/.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-endpoint-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-sort-key #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-tags-max-results (clojure.spec.alpha/int-in 50 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-config/strategy (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-strategy-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.hyper-parameter-tuning-job-config/strategy :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective :portkey.aws.sagemaker/resource-limits :portkey.aws.sagemaker/parameter-ranges] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 20 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/content-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.objective-status-counters/succeeded (clojure.spec.alpha/and :portkey.aws.sagemaker/objective-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.objective-status-counters/pending (clojure.spec.alpha/and :portkey.aws.sagemaker/objective-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.objective-status-counters/failed (clojure.spec.alpha/and :portkey.aws.sagemaker/objective-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker/objective-status-counters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.objective-status-counters/succeeded :portkey.aws.sagemaker.objective-status-counters/pending :portkey.aws.sagemaker.objective-status-counters/failed]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/hyper-parameter-tuning-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-environment-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/direct-internet-access #{"Disabled" :disabled "Enabled" :enabled})

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-environment-map (clojure.spec.alpha/map-of :portkey.aws.sagemaker/transform-environment-key :portkey.aws.sagemaker/transform-environment-value))

(clojure.spec.alpha/def :portkey.aws.sagemaker.s-3-data-source/s-3-data-distribution-type (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-data-distribution))
(clojure.spec.alpha/def :portkey.aws.sagemaker/s-3-data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/s-3-data-type :portkey.aws.sagemaker/s-3-uri] :opt-un [:portkey.aws.sagemaker.s-3-data-source/s-3-data-distribution-type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/stopping-condition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/max-runtime-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-transform-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/transform-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/tag-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/tag :min-count 0 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.sagemaker/secondary-status #{:uploading "Failed" :starting "Downloading" "LaunchingMLInstances" :completed :max-runtime-exceeded "DownloadingTrainingImage" :stopping :downloading :stopped "PreparingTrainingStack" "MaxRuntimeExceeded" :downloading-training-image "Uploading" "Stopping" :training "Starting" :preparing-training-stack "Stopped" "Completed" "Training" :launching-ml-instances :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker/stop-transform-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-transform-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/transform-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/tag-key :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-name :portkey.aws.sagemaker/notebook-instance-lifecycle-config-arn] :opt-un [:portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/environment-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.categorical-parameter-range/name (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.categorical-parameter-range/values (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-values))
(clojure.spec.alpha/def :portkey.aws.sagemaker/categorical-parameter-range (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.categorical-parameter-range/name :portkey.aws.sagemaker.categorical-parameter-range/values] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective-type #{"Maximize" "Minimize" :maximize :minimize})

(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-summary/training-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name :portkey.aws.sagemaker/training-job-arn :portkey.aws.sagemaker.training-job-summary/creation-time :portkey.aws.sagemaker/training-job-status] :opt-un [:portkey.aws.sagemaker.training-job-summary/training-end-time :portkey.aws.sagemaker.training-job-summary/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-runtime-in-seconds (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-environment-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z_][a-zA-Z0-9_]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-input/primary-container (clojure.spec.alpha/and :portkey.aws.sagemaker/container-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-input/execution-role-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/role-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-model-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-name :portkey.aws.sagemaker.create-model-input/primary-container :portkey.aws.sagemaker.create-model-input/execution-role-arn] :opt-un [:portkey.aws.sagemaker.create-model-input/tags :portkey.aws.sagemaker/vpc-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-definition-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/metric-definition :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-endpoint-config-output/production-variants (clojure.spec.alpha/and :portkey.aws.sagemaker/production-variant-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-endpoint-config-output/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-endpoint-config-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-name :portkey.aws.sagemaker/endpoint-config-arn :portkey.aws.sagemaker.describe-endpoint-config-output/production-variants :portkey.aws.sagemaker.describe-endpoint-config-output/creation-time] :opt-un [:portkey.aws.sagemaker/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-sort-key #{:name "Status" :status "CreationTime" "Name" :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/channel-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 64)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[A-Za-z0-9\.\-_]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/categorical-parameter-ranges (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/categorical-parameter-range :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-notebook-instance-input/lifecycle-config-name (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name :portkey.aws.sagemaker/instance-type :portkey.aws.sagemaker/role-arn] :opt-un [:portkey.aws.sagemaker/security-group-ids :portkey.aws.sagemaker/subnet-id :portkey.aws.sagemaker.create-notebook-instance-input/tags :portkey.aws.sagemaker/direct-internet-access :portkey.aws.sagemaker/kms-key-id :portkey.aws.sagemaker.create-notebook-instance-input/lifecycle-config-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-endpoint-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/stop-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:hyper-parameter-tuning-job/.*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/start-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/notebook-instance-lifecycle-hook :max-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker.model-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/model-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-name :portkey.aws.sagemaker/model-arn :portkey.aws.sagemaker.model-summary/creation-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-algorithm-specification/training-image (clojure.spec.alpha/and :portkey.aws.sagemaker/algorithm-image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-algorithm-specification/metric-definitions (clojure.spec.alpha/and :portkey.aws.sagemaker/metric-definition-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-algorithm-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.hyper-parameter-algorithm-specification/training-image :portkey.aws.sagemaker/training-input-mode] :opt-un [:portkey.aws.sagemaker.hyper-parameter-algorithm-specification/metric-definitions]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/url (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^(https|s3)://([^/]+)/?(.*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-content (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 16384))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.delete-tags-input/tag-keys (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/delete-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/resource-arn :portkey.aws.sagemaker.delete-tags-input/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 0 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.container-definition/model-data-url (clojure.spec.alpha/and :portkey.aws.sagemaker/url))
(clojure.spec.alpha/def :portkey.aws.sagemaker.container-definition/environment (clojure.spec.alpha/and :portkey.aws.sagemaker/environment-map))
(clojure.spec.alpha/def :portkey.aws.sagemaker/container-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/image] :opt-un [:portkey.aws.sagemaker/container-hostname :portkey.aws.sagemaker.container-definition/model-data-url :portkey.aws.sagemaker.container-definition/environment]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/model-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-input/lifecycle-config-name (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.update-notebook-instance-input/disassociate-lifecycle-config (clojure.spec.alpha/and :portkey.aws.sagemaker/disassociate-notebook-instance-lifecycle-config))
(clojure.spec.alpha/def :portkey.aws.sagemaker/update-notebook-instance-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un [:portkey.aws.sagemaker/instance-type :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker.update-notebook-instance-input/lifecycle-config-name :portkey.aws.sagemaker.update-notebook-instance-input/disassociate-lifecycle-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-ranges (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/integer-parameter-ranges :portkey.aws.sagemaker/continuous-parameter-ranges :portkey.aws.sagemaker/categorical-parameter-ranges]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant/initial-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant/instance-type (clojure.spec.alpha/and :portkey.aws.sagemaker/production-variant-instance-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant/initial-variant-weight (clojure.spec.alpha/and :portkey.aws.sagemaker/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/variant-name :portkey.aws.sagemaker/model-name :portkey.aws.sagemaker.production-variant/initial-instance-count :portkey.aws.sagemaker.production-variant/instance-type] :opt-un [:portkey.aws.sagemaker.production-variant/initial-variant-weight]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/security-group-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 32))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/training-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/tuning-job-arn (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-arn))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/training-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-training-job-response/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-training-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name :portkey.aws.sagemaker/training-job-arn :portkey.aws.sagemaker/model-artifacts :portkey.aws.sagemaker/training-job-status :portkey.aws.sagemaker/secondary-status :portkey.aws.sagemaker/algorithm-specification :portkey.aws.sagemaker/input-data-config :portkey.aws.sagemaker/resource-config :portkey.aws.sagemaker/stopping-condition :portkey.aws.sagemaker.describe-training-job-response/creation-time] :opt-un [:portkey.aws.sagemaker.describe-training-job-response/training-end-time :portkey.aws.sagemaker/output-data-config :portkey.aws.sagemaker/hyper-parameters :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker/vpc-config :portkey.aws.sagemaker.describe-training-job-response/tuning-job-arn :portkey.aws.sagemaker.describe-training-job-response/training-start-time :portkey.aws.sagemaker.describe-training-job-response/last-modified-time :portkey.aws.sagemaker/secondary-status-transitions]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.notebook-instance-lifecycle-hook/content (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-content))
(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-hook (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.notebook-instance-lifecycle-hook/content]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/failure-reason (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.endpoint-config-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-name :portkey.aws.sagemaker/endpoint-config-arn :portkey.aws.sagemaker.endpoint-config-summary/creation-time] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.add-tags-input/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/add-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/resource-arn :portkey.aws.sagemaker.add-tags-input/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"arn:aws[a-z\-]*:sagemaker:[a-z0-9\-]*:[0-9]{12}:transform-job/.*" s__27967__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.sagemaker/kms-key-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/batch-strategy #{"MultiRecord" :multi-record "SingleRecord" :single-record})

(clojure.spec.alpha/def :portkey.aws.sagemaker/environment-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 1024)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z_][a-zA-Z0-9_]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/endpoint-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/data-source (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/s-3-data-source] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/notebook-instance-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-status-counters/completed (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-status-counters/in-progress (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-status-counters/retryable-error (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-status-counters/non-retryable-error (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker.training-job-status-counters/stopped (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status-counter))
(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-status-counters (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.training-job-status-counters/completed :portkey.aws.sagemaker.training-job-status-counters/in-progress :portkey.aws.sagemaker.training-job-status-counters/retryable-error :portkey.aws.sagemaker.training-job-status-counters/non-retryable-error :portkey.aws.sagemaker.training-job-status-counters/stopped]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/assembly-type #{"Line" "None" :line :none})

(clojure.spec.alpha/def :portkey.aws.sagemaker/variant-weight clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.sagemaker/split-type #{"RecordIO" "Line" "None" :line :record-io :none})

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-sort-by-options #{:name "FinalObjectiveMetricValue" "Status" :status "CreationTime" "Name" :final-objective-metric-value :creation-time})

(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-value clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-request/sort-by (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-sort-by-options))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name] :opt-un [:portkey.aws.sagemaker/next-token :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-request/status-equals :portkey.aws.sagemaker.list-training-jobs-for-hyper-parameter-tuning-job-request/sort-by :portkey.aws.sagemaker/sort-order]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/production-variant-summary :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant-summary/current-weight (clojure.spec.alpha/and :portkey.aws.sagemaker/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant-summary/desired-weight (clojure.spec.alpha/and :portkey.aws.sagemaker/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant-summary/current-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker.production-variant-summary/desired-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker/production-variant-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/variant-name] :opt-un [:portkey.aws.sagemaker/deployed-images :portkey.aws.sagemaker.production-variant-summary/current-weight :portkey.aws.sagemaker.production-variant-summary/desired-weight :portkey.aws.sagemaker.production-variant-summary/current-instance-count :portkey.aws.sagemaker.production-variant-summary/desired-instance-count]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/creation-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-summary/training-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-summary/tuned-hyper-parameters (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameters))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-summary/training-start-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-training-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name :portkey.aws.sagemaker/training-job-arn :portkey.aws.sagemaker.hyper-parameter-training-job-summary/creation-time :portkey.aws.sagemaker/training-job-status :portkey.aws.sagemaker.hyper-parameter-training-job-summary/tuned-hyper-parameters] :opt-un [:portkey.aws.sagemaker.hyper-parameter-training-job-summary/training-end-time :portkey.aws.sagemaker/final-hyper-parameter-tuning-job-objective-metric :portkey.aws.sagemaker/objective-status :portkey.aws.sagemaker/failure-reason :portkey.aws.sagemaker.hyper-parameter-training-job-summary/training-start-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.metric-definition/name (clojure.spec.alpha/and :portkey.aws.sagemaker/metric-name))
(clojure.spec.alpha/def :portkey.aws.sagemaker.metric-definition/regex (clojure.spec.alpha/and :portkey.aws.sagemaker/metric-regex))
(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.metric-definition/name :portkey.aws.sagemaker.metric-definition/regex] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.vpc-config/security-group-ids (clojure.spec.alpha/and :portkey.aws.sagemaker/vpc-security-group-ids))
(clojure.spec.alpha/def :portkey.aws.sagemaker/vpc-config (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.vpc-config/security-group-ids :portkey.aws.sagemaker/subnets] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.notebook-instance-summary/url (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-url))
(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name :portkey.aws.sagemaker/notebook-instance-arn] :opt-un [:portkey.aws.sagemaker/notebook-instance-status :portkey.aws.sagemaker.notebook-instance-summary/url :portkey.aws.sagemaker/instance-type :portkey.aws.sagemaker/creation-time :portkey.aws.sagemaker/last-modified-time :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 32)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-job-status #{"Failed" :in-progress :completed :stopping :stopped "InProgress" "Stopping" "Stopped" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-output/s-3-output-path (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker.transform-output/assemble-with (clojure.spec.alpha/and :portkey.aws.sagemaker/assembly-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.transform-output/s-3-output-path] :opt-un [:portkey.aws.sagemaker/accept :portkey.aws.sagemaker.transform-output/assemble-with :portkey.aws.sagemaker/kms-key-id]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/desired-weight-and-capacity-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/desired-weight-and-capacity :min-count 1))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-lifecycle-config-summary-list (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/notebook-instance-lifecycle-config-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-notebook-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-definition/static-hyper-parameters (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameters))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-training-job-definition/algorithm-specification (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-algorithm-specification))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-training-job-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.hyper-parameter-training-job-definition/algorithm-specification :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/input-data-config :portkey.aws.sagemaker/output-data-config :portkey.aws.sagemaker/resource-config :portkey.aws.sagemaker/stopping-condition] :opt-un [:portkey.aws.sagemaker.hyper-parameter-training-job-definition/static-hyper-parameters :portkey.aws.sagemaker/vpc-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/strategy (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-strategy-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/hyper-parameter-tuning-end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/creation-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/last-modified-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-summary (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name :portkey.aws.sagemaker/hyper-parameter-tuning-job-arn :portkey.aws.sagemaker/hyper-parameter-tuning-job-status :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/strategy :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/creation-time :portkey.aws.sagemaker/training-job-status-counters :portkey.aws.sagemaker/objective-status-counters] :opt-un [:portkey.aws.sagemaker/resource-limits :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/hyper-parameter-tuning-end-time :portkey.aws.sagemaker.hyper-parameter-tuning-job-summary/last-modified-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.model-artifacts/s-3-model-artifacts (clojure.spec.alpha/and :portkey.aws.sagemaker/s-3-uri))
(clojure.spec.alpha/def :portkey.aws.sagemaker/model-artifacts (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.model-artifacts/s-3-model-artifacts] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.desired-weight-and-capacity/desired-weight (clojure.spec.alpha/and :portkey.aws.sagemaker/variant-weight))
(clojure.spec.alpha/def :portkey.aws.sagemaker.desired-weight-and-capacity/desired-instance-count (clojure.spec.alpha/and :portkey.aws.sagemaker/task-count))
(clojure.spec.alpha/def :portkey.aws.sagemaker/desired-weight-and-capacity (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/variant-name] :opt-un [:portkey.aws.sagemaker.desired-weight-and-capacity/desired-weight :portkey.aws.sagemaker.desired-weight-and-capacity/desired-instance-count]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/record-wrapper #{"RecordIO" "None" :record-io :none})

(clojure.spec.alpha/def :portkey.aws.sagemaker.channel/record-wrapper-type (clojure.spec.alpha/and :portkey.aws.sagemaker/record-wrapper))
(clojure.spec.alpha/def :portkey.aws.sagemaker/channel (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/channel-name :portkey.aws.sagemaker/data-source] :opt-un [:portkey.aws.sagemaker/content-type :portkey.aws.sagemaker/compression-type :portkey.aws.sagemaker.channel/record-wrapper-type]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-request/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/training-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-training-jobs-request/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-training-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-training-jobs-request/creation-time-after :portkey.aws.sagemaker/name-contains :portkey.aws.sagemaker/sort-by :portkey.aws.sagemaker.list-training-jobs-request/creation-time-before :portkey.aws.sagemaker/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-training-jobs-request/last-modified-time-after :portkey.aws.sagemaker.list-training-jobs-request/status-equals :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-training-jobs-request/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.hyper-parameter-tuning-job-objective/type (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective-type))
(clojure.spec.alpha/def :portkey.aws.sagemaker/hyper-parameter-tuning-job-objective (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.hyper-parameter-tuning-job-objective/type :portkey.aws.sagemaker/metric-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/stop-training-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/disassociate-notebook-instance-lifecycle-config clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-hyper-parameter-tuning-job-request/training-job-definition (clojure.spec.alpha/and :portkey.aws.sagemaker/hyper-parameter-training-job-definition))
(clojure.spec.alpha/def :portkey.aws.sagemaker.create-hyper-parameter-tuning-job-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-name :portkey.aws.sagemaker/hyper-parameter-tuning-job-config :portkey.aws.sagemaker.create-hyper-parameter-tuning-job-request/training-job-definition] :opt-un [:portkey.aws.sagemaker.create-hyper-parameter-tuning-job-request/tags]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.secondary-status-transition/status (clojure.spec.alpha/and :portkey.aws.sagemaker/secondary-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.secondary-status-transition/start-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.secondary-status-transition/end-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/secondary-status-transition (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.secondary-status-transition/status :portkey.aws.sagemaker.secondary-status-transition/start-time] :opt-un [:portkey.aws.sagemaker.secondary-status-transition/end-time :portkey.aws.sagemaker/status-message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-training-job-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/max-results (clojure.spec.alpha/int-in 1 100))

(clojure.spec.alpha/def :portkey.aws.sagemaker/deployed-images (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/deployed-image))

(clojure.spec.alpha/def :portkey.aws.sagemaker.tag/key (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.tag/value (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.tag/key :portkey.aws.sagemaker.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/metric-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 1 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/integer-parameter-ranges (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/integer-parameter-range :min-count 0 :max-count 20))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-instance-type #{:mlm-5large :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.m5.xlarge" "ml.c5.xlarge" "ml.m4.2xlarge" "ml.c5.9xlarge" :mlm-54xlarge "ml.p2.16xlarge" :mlm-52xlarge "ml.m5.large" :mlc-54xlarge "ml.m5.12xlarge" "ml.c5.2xlarge" :mlc-52xlarge "ml.c4.2xlarge" "ml.c4.4xlarge" :mlm-410xlarge :mlm-512xlarge "ml.m4.4xlarge" "ml.m5.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge :mlc-48xlarge "ml.p3.16xlarge" :mlc-59xlarge :mlc-4xlarge "ml.c4.8xlarge" "ml.c5.18xlarge" :mlc-42xlarge :mlc-44xlarge "ml.m5.2xlarge" :mlc-518xlarge "ml.c4.xlarge" "ml.m5.24xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlm-524xlarge :mlp-2xlarge "ml.p3.8xlarge" :mlp-28xlarge :mlm-5xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" :mlc-5xlarge "ml.c5.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.integer-parameter-range/name (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.integer-parameter-range/min-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.integer-parameter-range/max-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/integer-parameter-range (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.integer-parameter-range/name :portkey.aws.sagemaker.integer-parameter-range/min-value :portkey.aws.sagemaker.integer-parameter-range/max-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-image (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/last-modified-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-limit-exceeded/message (clojure.spec.alpha/and :portkey.aws.sagemaker/failure-reason))
(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-limit-exceeded (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.resource-limit-exceeded/message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.create-training-job-request/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/create-training-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name :portkey.aws.sagemaker/algorithm-specification :portkey.aws.sagemaker/role-arn :portkey.aws.sagemaker/input-data-config :portkey.aws.sagemaker/output-data-config :portkey.aws.sagemaker/resource-config :portkey.aws.sagemaker/stopping-condition] :opt-un [:portkey.aws.sagemaker/hyper-parameters :portkey.aws.sagemaker.create-training-job-request/tags :portkey.aws.sagemaker/vpc-config]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/image (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 255)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[\S]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/accept (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-summaries (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/training-job-summary))

(clojure.spec.alpha/def :portkey.aws.sagemaker/update-endpoint-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-endpoint-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-not-found/message (clojure.spec.alpha/and :portkey.aws.sagemaker/failure-reason))
(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-not-found (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.resource-not-found/message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/hyper-parameter-tuning-job-summaries] :opt-un [:portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-presigned-notebook-instance-url-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/notebook-instance-name] :opt-un [:portkey.aws.sagemaker/session-expiration-duration-in-seconds]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/training-job-status #{"Failed" :in-progress :completed :stopping :stopped "InProgress" "Stopping" "Stopped" "Completed" :failed})

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-transform-jobs-request/creation-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-transform-jobs-request/creation-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-transform-jobs-request/last-modified-time-after (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-transform-jobs-request/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/transform-job-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-transform-jobs-request/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-transform-jobs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-transform-jobs-request/creation-time-after :portkey.aws.sagemaker/name-contains :portkey.aws.sagemaker/sort-by :portkey.aws.sagemaker.list-transform-jobs-request/creation-time-before :portkey.aws.sagemaker/sort-order :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-transform-jobs-request/last-modified-time-after :portkey.aws.sagemaker.list-transform-jobs-request/status-equals :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-transform-jobs-request/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.continuous-parameter-range/name (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-key))
(clojure.spec.alpha/def :portkey.aws.sagemaker.continuous-parameter-range/min-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker.continuous-parameter-range/max-value (clojure.spec.alpha/and :portkey.aws.sagemaker/parameter-value))
(clojure.spec.alpha/def :portkey.aws.sagemaker/continuous-parameter-range (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.continuous-parameter-range/name :portkey.aws.sagemaker.continuous-parameter-range/min-value :portkey.aws.sagemaker.continuous-parameter-range/max-value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-endpoint-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.algorithm-specification/training-image (clojure.spec.alpha/and :portkey.aws.sagemaker/algorithm-image))
(clojure.spec.alpha/def :portkey.aws.sagemaker/algorithm-specification (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.algorithm-specification/training-image :portkey.aws.sagemaker/training-input-mode] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 20 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-name-contains (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[a-zA-Z0-9-]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-output/endpoints (clojure.spec.alpha/and :portkey.aws.sagemaker/endpoint-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-endpoints-output/next-token (clojure.spec.alpha/and :portkey.aws.sagemaker/pagination-token))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-endpoints-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker.list-endpoints-output/endpoints] :opt-un [:portkey.aws.sagemaker.list-endpoints-output/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/notebook-instance-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-model-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/model-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-notebook-instance-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/notebook-instance-arn]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-tags-input/max-results (clojure.spec.alpha/and :portkey.aws.sagemaker/list-tags-max-results))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-tags-input (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/resource-arn] :opt-un [:portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-tags-input/max-results]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-tags-output/tags (clojure.spec.alpha/and :portkey.aws.sagemaker/tag-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-tags-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-tags-output/tags :portkey.aws.sagemaker/next-token]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/secondary-status-transitions (clojure.spec.alpha/coll-of :portkey.aws.sagemaker/secondary-status-transition))

(clojure.spec.alpha/def :portkey.aws.sagemaker.deployed-image/specified-image (clojure.spec.alpha/and :portkey.aws.sagemaker/image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.deployed-image/resolved-image (clojure.spec.alpha/and :portkey.aws.sagemaker/image))
(clojure.spec.alpha/def :portkey.aws.sagemaker.deployed-image/resolution-time (clojure.spec.alpha/and :portkey.aws.sagemaker/timestamp))
(clojure.spec.alpha/def :portkey.aws.sagemaker/deployed-image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.deployed-image/specified-image :portkey.aws.sagemaker.deployed-image/resolved-image :portkey.aws.sagemaker.deployed-image/resolution-time]))

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
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/status-equals (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-status))
(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instances-input/last-modified-time-before (clojure.spec.alpha/and :portkey.aws.sagemaker/last-modified-time))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-notebook-instances-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.list-notebook-instances-input/creation-time-after :portkey.aws.sagemaker.list-notebook-instances-input/name-contains :portkey.aws.sagemaker.list-notebook-instances-input/sort-by :portkey.aws.sagemaker.list-notebook-instances-input/creation-time-before :portkey.aws.sagemaker.list-notebook-instances-input/sort-order :portkey.aws.sagemaker.list-notebook-instances-input/notebook-instance-lifecycle-config-name-contains :portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-notebook-instances-input/last-modified-time-after :portkey.aws.sagemaker.list-notebook-instances-input/status-equals :portkey.aws.sagemaker/max-results :portkey.aws.sagemaker.list-notebook-instances-input/last-modified-time-before]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/transform-instance-type #{:mlm-5large :mlm-42xlarge :mlp-32xlarge :mlp-316xlarge "ml.m5.xlarge" "ml.c5.xlarge" "ml.m4.2xlarge" "ml.c5.9xlarge" :mlm-54xlarge "ml.p2.16xlarge" :mlm-52xlarge "ml.m5.large" :mlc-54xlarge "ml.m5.12xlarge" "ml.c5.2xlarge" :mlc-52xlarge "ml.c4.2xlarge" "ml.c4.4xlarge" :mlm-410xlarge :mlm-512xlarge "ml.m4.4xlarge" "ml.m5.4xlarge" "ml.m4.xlarge" "ml.m4.16xlarge" :mlp-38xlarge :mlm-416xlarge "ml.p2.8xlarge" :mlm-44xlarge :mlc-48xlarge "ml.p3.16xlarge" :mlc-59xlarge :mlc-4xlarge "ml.c4.8xlarge" "ml.c5.18xlarge" :mlc-42xlarge :mlc-44xlarge "ml.m5.2xlarge" :mlc-518xlarge "ml.c4.xlarge" "ml.m5.24xlarge" "ml.p3.2xlarge" :mlp-216xlarge :mlm-524xlarge :mlp-2xlarge "ml.p3.8xlarge" :mlp-28xlarge :mlm-5xlarge :mlm-4xlarge "ml.p2.xlarge" "ml.m4.10xlarge" :mlc-5xlarge "ml.c5.4xlarge"})

(clojure.spec.alpha/def :portkey.aws.sagemaker.resource-in-use/message (clojure.spec.alpha/and :portkey.aws.sagemaker/failure-reason))
(clojure.spec.alpha/def :portkey.aws.sagemaker/resource-in-use (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker.resource-in-use/message]))

(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-lifecycle-config-output/on-create (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker.describe-notebook-instance-lifecycle-config-output/on-start (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/notebook-instance-lifecycle-config-arn :portkey.aws.sagemaker/notebook-instance-lifecycle-config-name :portkey.aws.sagemaker.describe-notebook-instance-lifecycle-config-output/on-create :portkey.aws.sagemaker.describe-notebook-instance-lifecycle-config-output/on-start :portkey.aws.sagemaker/last-modified-time :portkey.aws.sagemaker/creation-time]))

(clojure.spec.alpha/def :portkey.aws.sagemaker/endpoint-config-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 63)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9](-*[a-zA-Z0-9])*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/describe-training-job-request (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/training-job-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker/parameter-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/model-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27965__auto__] (clojure.core/<= 20 (clojure.core/count s__27965__auto__))) (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.sagemaker/create-endpoint-config-output (clojure.spec.alpha/keys :req-un [:portkey.aws.sagemaker/endpoint-config-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-output/notebook-instance-lifecycle-configs (clojure.spec.alpha/and :portkey.aws.sagemaker/notebook-instance-lifecycle-config-summary-list))
(clojure.spec.alpha/def :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.sagemaker/next-token :portkey.aws.sagemaker.list-notebook-instance-lifecycle-configs-output/notebook-instance-lifecycle-configs]))

(clojure.core/defn list-training-jobs-for-hyper-parameter-tuning-job ([list-training-jobs-for-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-training-jobs-for-hyper-parameter-tuning-job-request list-training-jobs-for-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrainingJobsForHyperParameterTuningJob", :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef list-training-jobs-for-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-training-jobs-for-hyper-parameter-tuning-job-response))

(clojure.core/defn create-notebook-instance ([create-notebook-instance-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-notebook-instance-input create-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/create-notebook-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateNotebookInstance", :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-notebook-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-notebook-instance-output))

(clojure.core/defn describe-notebook-instance-lifecycle-config ([describe-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-notebook-instance-lifecycle-config-input describe-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeNotebookInstanceLifecycleConfig", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-notebook-instance-lifecycle-config-output))

(clojure.core/defn list-notebook-instance-lifecycle-configs ([] (list-notebook-instance-lifecycle-configs {})) ([list-notebook-instance-lifecycle-configs-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-notebook-instance-lifecycle-configs-input list-notebook-instance-lifecycle-configs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListNotebookInstanceLifecycleConfigs", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-notebook-instance-lifecycle-configs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-notebook-instance-lifecycle-configs-output))

(clojure.core/defn create-training-job ([create-training-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-training-job-request create-training-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/create-training-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-training-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTrainingJob", :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-training-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-training-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-training-job-response))

(clojure.core/defn update-notebook-instance ([update-notebook-instance-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-notebook-instance-input update-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/update-notebook-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/update-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateNotebookInstance", :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/update-notebook-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/update-notebook-instance-output))

(clojure.core/defn create-notebook-instance-lifecycle-config ([create-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-notebook-instance-lifecycle-config-input create-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateNotebookInstanceLifecycleConfig", :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-notebook-instance-lifecycle-config-output))

(clojure.core/defn delete-tags ([delete-tags-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-tags-input delete-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/delete-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteTags", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-tags :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/delete-tags-output))

(clojure.core/defn list-training-jobs ([] (list-training-jobs {})) ([list-training-jobs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-training-jobs-request list-training-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/list-training-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-training-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTrainingJobs", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-training-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-training-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-training-jobs-response))

(clojure.core/defn stop-notebook-instance ([stop-notebook-instance-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-notebook-instance-input stop-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/stop-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopNotebookInstance", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef stop-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/stop-notebook-instance-input) :ret clojure.core/true?)

(clojure.core/defn create-transform-job ([create-transform-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-transform-job-request create-transform-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/create-transform-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-transform-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateTransformJob", :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-transform-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-transform-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-transform-job-response))

(clojure.core/defn list-notebook-instances ([] (list-notebook-instances {})) ([list-notebook-instances-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-notebook-instances-input list-notebook-instances-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/list-notebook-instances-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-notebook-instances-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListNotebookInstances", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-notebook-instances :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-notebook-instances-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-notebook-instances-output))

(clojure.core/defn list-tags ([list-tags-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-tags-input list-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/list-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTags", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-tags :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/list-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-tags-output))

(clojure.core/defn create-endpoint ([create-endpoint-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-endpoint-input create-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/create-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateEndpoint", :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-endpoint-output))

(clojure.core/defn list-endpoint-configs ([] (list-endpoint-configs {})) ([list-endpoint-configs-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-endpoint-configs-input list-endpoint-configs-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/list-endpoint-configs-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-endpoint-configs-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEndpointConfigs", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-endpoint-configs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-endpoint-configs-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-endpoint-configs-output))

(clojure.core/defn create-model ([create-model-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-model-input create-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/create-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateModel", :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-model :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-model-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-model-output))

(clojure.core/defn stop-hyper-parameter-tuning-job ([stop-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-hyper-parameter-tuning-job-request stop-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/stop-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopHyperParameterTuningJob", :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/stop-hyper-parameter-tuning-job-request) :ret clojure.core/true?)

(clojure.core/defn list-models ([] (list-models {})) ([list-models-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-models-input list-models-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/list-models-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-models-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListModels", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-models :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-models-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-models-output))

(clojure.core/defn update-endpoint-weights-and-capacities ([update-endpoint-weights-and-capacities-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-endpoint-weights-and-capacities-input update-endpoint-weights-and-capacities-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateEndpointWeightsAndCapacities", :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-endpoint-weights-and-capacities :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/update-endpoint-weights-and-capacities-output))

(clojure.core/defn create-presigned-notebook-instance-url ([create-presigned-notebook-instance-url-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-presigned-notebook-instance-url-input create-presigned-notebook-instance-url-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/create-presigned-notebook-instance-url-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-presigned-notebook-instance-url-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreatePresignedNotebookInstanceUrl", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef create-presigned-notebook-instance-url :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-presigned-notebook-instance-url-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-presigned-notebook-instance-url-output))

(clojure.core/defn describe-endpoint ([describe-endpoint-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-endpoint-input describe-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/describe-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEndpoint", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-endpoint-output))

(clojure.core/defn describe-hyper-parameter-tuning-job ([describe-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-hyper-parameter-tuning-job-request describe-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeHyperParameterTuningJob", :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-hyper-parameter-tuning-job-response))

(clojure.core/defn describe-transform-job ([describe-transform-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-transform-job-request describe-transform-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/describe-transform-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-transform-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTransformJob", :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-transform-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-transform-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-transform-job-response))

(clojure.core/defn start-notebook-instance ([start-notebook-instance-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-start-notebook-instance-input start-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/start-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StartNotebookInstance", :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef start-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/start-notebook-instance-input) :ret clojure.core/true?)

(clojure.core/defn update-endpoint ([update-endpoint-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-endpoint-input update-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/update-endpoint-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/update-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateEndpoint", :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/update-endpoint-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/update-endpoint-output))

(clojure.core/defn delete-model ([delete-model-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-model-input delete-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteModel", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-model :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-model-input) :ret clojure.core/true?)

(clojure.core/defn describe-training-job ([describe-training-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-training-job-request describe-training-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/describe-training-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-training-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeTrainingJob", :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef describe-training-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-training-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-training-job-response))

(clojure.core/defn stop-transform-job ([stop-transform-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-transform-job-request stop-transform-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/stop-transform-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopTransformJob", :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-transform-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/stop-transform-job-request) :ret clojure.core/true?)

(clojure.core/defn delete-notebook-instance ([delete-notebook-instance-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-notebook-instance-input delete-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteNotebookInstance", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-notebook-instance-input) :ret clojure.core/true?)

(clojure.core/defn create-endpoint-config ([create-endpoint-config-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-endpoint-config-input create-endpoint-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/create-endpoint-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-endpoint-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateEndpointConfig", :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-endpoint-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-endpoint-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-endpoint-config-output))

(clojure.core/defn delete-endpoint-config ([delete-endpoint-config-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-endpoint-config-input delete-endpoint-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-endpoint-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEndpointConfig", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-endpoint-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-endpoint-config-input) :ret clojure.core/true?)

(clojure.core/defn describe-model ([describe-model-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-model-input describe-model-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/describe-model-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-model-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeModel", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-model :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-model-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-model-output))

(clojure.core/defn stop-training-job ([stop-training-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-stop-training-job-request stop-training-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/stop-training-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "StopTrainingJob", :http.request.spec/error-spec {"ResourceNotFound" :portkey.aws.sagemaker/resource-not-found}})))))
(clojure.spec.alpha/fdef stop-training-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/stop-training-job-request) :ret clojure.core/true?)

(clojure.core/defn update-notebook-instance-lifecycle-config ([update-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-update-notebook-instance-lifecycle-config-input update-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "UpdateNotebookInstanceLifecycleConfig", :http.request.spec/error-spec {"ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef update-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/update-notebook-instance-lifecycle-config-output))

(clojure.core/defn list-hyper-parameter-tuning-jobs ([] (list-hyper-parameter-tuning-jobs {})) ([list-hyper-parameter-tuning-jobs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-hyper-parameter-tuning-jobs-request list-hyper-parameter-tuning-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHyperParameterTuningJobs", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-hyper-parameter-tuning-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-hyper-parameter-tuning-jobs-response))

(clojure.core/defn add-tags ([add-tags-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-add-tags-input add-tags-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/add-tags-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/add-tags-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTags", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef add-tags :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/add-tags-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/add-tags-output))

(clojure.core/defn describe-endpoint-config ([describe-endpoint-config-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-endpoint-config-input describe-endpoint-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/describe-endpoint-config-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-endpoint-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeEndpointConfig", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-endpoint-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-endpoint-config-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-endpoint-config-output))

(clojure.core/defn list-transform-jobs ([] (list-transform-jobs {})) ([list-transform-jobs-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-transform-jobs-request list-transform-jobs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/list-transform-jobs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-transform-jobs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTransformJobs", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-transform-jobs :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-transform-jobs-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-transform-jobs-response))

(clojure.core/defn describe-notebook-instance ([describe-notebook-instance-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-notebook-instance-input describe-notebook-instance-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/describe-notebook-instance-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/describe-notebook-instance-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeNotebookInstance", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef describe-notebook-instance :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/describe-notebook-instance-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/describe-notebook-instance-output))

(clojure.core/defn delete-endpoint ([delete-endpoint-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-endpoint-input delete-endpoint-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-endpoint-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteEndpoint", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-endpoint :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-endpoint-input) :ret clojure.core/true?)

(clojure.core/defn list-endpoints ([] (list-endpoints {})) ([list-endpoints-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-list-endpoints-input list-endpoints-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/list-endpoints-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/list-endpoints-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListEndpoints", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef list-endpoints :args (clojure.spec.alpha/? :portkey.aws.sagemaker/list-endpoints-input) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/list-endpoints-output))

(clojure.core/defn delete-notebook-instance-lifecycle-config ([delete-notebook-instance-lifecycle-config-inputinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-notebook-instance-lifecycle-config-input delete-notebook-instance-lifecycle-config-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec nil, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/delete-notebook-instance-lifecycle-config-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteNotebookInstanceLifecycleConfig", :http.request.spec/error-spec {}})))))
(clojure.spec.alpha/fdef delete-notebook-instance-lifecycle-config :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/delete-notebook-instance-lifecycle-config-input) :ret clojure.core/true?)

(clojure.core/defn create-hyper-parameter-tuning-job ([create-hyper-parameter-tuning-job-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-create-hyper-parameter-tuning-job-request create-hyper-parameter-tuning-job-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.sagemaker/endpoints, :http.request.spec/output-spec :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-07-24", :http.request.configuration/service-id "SageMaker", :http.request.spec/input-spec :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateHyperParameterTuningJob", :http.request.spec/error-spec {"ResourceInUse" :portkey.aws.sagemaker/resource-in-use, "ResourceLimitExceeded" :portkey.aws.sagemaker/resource-limit-exceeded}})))))
(clojure.spec.alpha/fdef create-hyper-parameter-tuning-job :args (clojure.spec.alpha/tuple :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-request) :ret (clojure.spec.alpha/and :portkey.aws.sagemaker/create-hyper-parameter-tuning-job-response))
