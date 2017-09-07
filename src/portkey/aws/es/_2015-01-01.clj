(ns portkey.aws.es.-2015-01-01 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credentialScope {"service" "es", "region" "ap-northeast-1"},
    :sslCommonName "es.ap-northeast-1.amazonaws.com",
    :endpoint "https://es.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credentialScope {"service" "es", "region" "eu-west-1"},
    :sslCommonName "es.eu-west-1.amazonaws.com",
    :endpoint "https://es.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credentialScope {"service" "es", "region" "us-east-2"},
    :sslCommonName "es.us-east-2.amazonaws.com",
    :endpoint "https://es.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credentialScope {"service" "es", "region" "ap-southeast-2"},
    :sslCommonName "es.ap-southeast-2.amazonaws.com",
    :endpoint "https://es.ap-southeast-2.amazonaws.com"},
   "sa-east-1"
   {:credentialScope {"service" "es", "region" "sa-east-1"},
    :sslCommonName "es.sa-east-1.amazonaws.com",
    :endpoint "https://es.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credentialScope {"service" "es", "region" "ap-southeast-1"},
    :sslCommonName "es.ap-southeast-1.amazonaws.com",
    :endpoint "https://es.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credentialScope {"service" "es", "region" "ap-northeast-2"},
    :sslCommonName "es.ap-northeast-2.amazonaws.com",
    :endpoint "https://es.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credentialScope {"service" "es", "region" "ca-central-1"},
    :sslCommonName "es.ca-central-1.amazonaws.com",
    :endpoint "https://es.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credentialScope {"service" "es", "region" "eu-central-1"},
    :sslCommonName "es.eu-central-1.amazonaws.com",
    :endpoint "https://es.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credentialScope {"service" "es", "region" "eu-west-2"},
    :sslCommonName "es.eu-west-2.amazonaws.com",
    :endpoint "https://es.eu-west-2.amazonaws.com"},
   "us-west-2"
   {:credentialScope {"service" "es", "region" "us-west-2"},
    :sslCommonName "es.us-west-2.amazonaws.com",
    :endpoint "https://es.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credentialScope {"service" "es", "region" "us-east-1"},
    :sslCommonName "es.us-east-1.amazonaws.com",
    :endpoint "https://es.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credentialScope {"service" "es", "region" "us-west-1"},
    :sslCommonName "es.us-west-1.amazonaws.com",
    :endpoint "https://es.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credentialScope {"service" "es", "region" "ap-south-1"},
    :sslCommonName "es.ap-south-1.amazonaws.com",
    :endpoint "https://es.ap-south-1.amazonaws.com"}})

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/maximum-instance-count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.snapshot-options/automated-snapshot-start-hour (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/snapshot-options (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.snapshot-options/AutomatedSnapshotStartHour]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.delete-elasticsearch-domain-response/domain-status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.delete-elasticsearch-domain-response/DomainStatus]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/string-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/storage-type :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.ebsoptions/ebsenabled (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.ebsoptions/volume-size (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.ebsoptions/iops (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/ebsoptions (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.ebsoptions/EBSEnabled :portkey.aws.es.-2015-01-01/VolumeType :portkey.aws.es.-2015-01-01.ebsoptions/VolumeSize :portkey.aws.es.-2015-01-01.ebsoptions/Iops]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/update-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/elasticsearch-cluster-config (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/ebsoptions (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/ebsoptions-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/access-policies (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/access-policies-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/snapshot-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/snapshot-options-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/advanced-options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/advanced-options-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-domain-config (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.elasticsearch-domain-config/ElasticsearchVersion :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/ElasticsearchClusterConfig :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/EBSOptions :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/AccessPolicies :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/SnapshotOptions :portkey.aws.es.-2015-01-01.elasticsearch-domain-config/AdvancedOptions]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type-limit-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/storage-type-limit :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.advanced-options-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/advanced-options))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.advanced-options-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/advanced-options-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.advanced-options-status/Options :portkey.aws.es.-2015-01-01.advanced-options-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/validation-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-sub-type-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-domain-response/domain-status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-response (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.describe-elasticsearch-domain-response/DomainStatus] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/instance-role (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.update-elasticsearch-domain-config-request/access-policies (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/policy-document))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01/DomainName] :opt-un [:portkey.aws.es.-2015-01-01/ElasticsearchClusterConfig :portkey.aws.es.-2015-01-01/EBSOptions :portkey.aws.es.-2015-01-01/SnapshotOptions :portkey.aws.es.-2015-01-01/AdvancedOptions :portkey.aws.es.-2015-01-01.update-elasticsearch-domain-config-request/AccessPolicies]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limit-value-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/limit-value :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-tags-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/TagList]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/additional-limit-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/additional-limit :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-elasticsearch-versions-response/elasticsearch-versions (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.list-elasticsearch-versions-response/ElasticsearchVersions :portkey.aws.es.-2015-01-01/NextToken]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-domain-status-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/elasticsearch-domain-status :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limit-exceeded-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-info-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/domain-info :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/resource-already-exists-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-request/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-request/ElasticsearchVersion] :opt-un [:portkey.aws.es.-2015-01-01/DomainName :portkey.aws.es.-2015-01-01/MaxResults :portkey.aws.es.-2015-01-01/NextToken]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/invalid-type-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/next-token (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.update-elasticsearch-domain-config-response/domain-config (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-config))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-response (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.update-elasticsearch-domain-config-response/DomainConfig] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/service-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.elasticsearch-cluster-config-status/Options :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01/DomainName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.remove-tags-request/tag-keys (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/string-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/remove-tags-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01/ARN :portkey.aws.es.-2015-01-01.remove-tags-request/TagKeys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/created (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/access-policies (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/policy-document))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/deleted (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/processing (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/endpoint (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/service-url))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-domain-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01/DomainId :portkey.aws.es.-2015-01-01/DomainName :portkey.aws.es.-2015-01-01/ARN :portkey.aws.es.-2015-01-01/ElasticsearchClusterConfig] :opt-un [:portkey.aws.es.-2015-01-01/SnapshotOptions :portkey.aws.es.-2015-01-01/EBSOptions :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/Created :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/ElasticsearchVersion :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/AccessPolicies :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/Deleted :portkey.aws.es.-2015-01-01/AdvancedOptions :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/Processing :portkey.aws.es.-2015-01-01.elasticsearch-domain-status/Endpoint]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/disabled-operation-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-domain-names-response/domain-names (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/domain-info-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-domain-names-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.list-domain-names-response/DomainNames]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-name-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/domain-name :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/add-tags-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01/ARN :portkey.aws.es.-2015-01-01/TagList] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-instance-type-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/espartition-instance-type :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.limits/storage-types (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/storage-type-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.limits/additional-limits (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/additional-limit-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limits (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.limits/StorageTypes :portkey.aws.es.-2015-01-01/InstanceLimits :portkey.aws.es.-2015-01-01.limits/AdditionalLimits]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/tag-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/tag :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.ebsoptions-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/ebsoptions))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.ebsoptions-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/ebsoptions-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.ebsoptions-status/Options :portkey.aws.es.-2015-01-01.ebsoptions-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/instance-type (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/espartition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/instance-count (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-enabled (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/zone-awareness-enabled (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-type (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/espartition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/dedicated-master-count (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/integer-class))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-cluster-config (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/InstanceType :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/InstanceCount :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/DedicatedMasterEnabled :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/ZoneAwarenessEnabled :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/DedicatedMasterType :portkey.aws.es.-2015-01-01.elasticsearch-cluster-config/DedicatedMasterCount]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-response/elasticsearch-instance-types (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-instance-type-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.list-elasticsearch-instance-types-response/ElasticsearchInstanceTypes :portkey.aws.es.-2015-01-01/NextToken]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/resource-not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-version-list (clojure.spec.alpha/coll-of :portkey.aws.es.-2015-01-01/elasticsearch-version-string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-request (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/MaxResults :portkey.aws.es.-2015-01-01/NextToken]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/espartition-instance-type (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {:r3.8xlarge.elasticsearch "r3.8xlarge.elasticsearch", :c4.4xlarge.elasticsearch "c4.4xlarge.elasticsearch", "m4.2xlarge.elasticsearch" "m4.2xlarge.elasticsearch", "d2.4xlarge.elasticsearch" "d2.4xlarge.elasticsearch", "t2.micro.elasticsearch" "t2.micro.elasticsearch", :m3.medium.elasticsearch "m3.medium.elasticsearch", "r3.2xlarge.elasticsearch" "r3.2xlarge.elasticsearch", "c4.large.elasticsearch" "c4.large.elasticsearch", :r3.4xlarge.elasticsearch "r3.4xlarge.elasticsearch", "r4.2xlarge.elasticsearch" "r4.2xlarge.elasticsearch", "m4.xlarge.elasticsearch" "m4.xlarge.elasticsearch", :c4.large.elasticsearch "c4.large.elasticsearch", :r4.16xlarge.elasticsearch "r4.16xlarge.elasticsearch", "m3.xlarge.elasticsearch" "m3.xlarge.elasticsearch", "i2.2xlarge.elasticsearch" "i2.2xlarge.elasticsearch", :m3.xlarge.elasticsearch "m3.xlarge.elasticsearch", :r3.xlarge.elasticsearch "r3.xlarge.elasticsearch", "r4.8xlarge.elasticsearch" "r4.8xlarge.elasticsearch", "r4.large.elasticsearch" "r4.large.elasticsearch", :d2.2xlarge.elasticsearch "d2.2xlarge.elasticsearch", "r3.xlarge.elasticsearch" "r3.xlarge.elasticsearch", :c4.8xlarge.elasticsearch "c4.8xlarge.elasticsearch", "r3.4xlarge.elasticsearch" "r3.4xlarge.elasticsearch", "r4.16xlarge.elasticsearch" "r4.16xlarge.elasticsearch", "m3.medium.elasticsearch" "m3.medium.elasticsearch", "t2.medium.elasticsearch" "t2.medium.elasticsearch", :d2.xlarge.elasticsearch "d2.xlarge.elasticsearch", "c4.xlarge.elasticsearch" "c4.xlarge.elasticsearch", :m4.2xlarge.elasticsearch "m4.2xlarge.elasticsearch", :i2.2xlarge.elasticsearch "i2.2xlarge.elasticsearch", :t2.small.elasticsearch "t2.small.elasticsearch", :r4.large.elasticsearch "r4.large.elasticsearch", "r4.4xlarge.elasticsearch" "r4.4xlarge.elasticsearch", "d2.2xlarge.elasticsearch" "d2.2xlarge.elasticsearch", "m4.large.elasticsearch" "m4.large.elasticsearch", :d2.4xlarge.elasticsearch "d2.4xlarge.elasticsearch", :r4.xlarge.elasticsearch "r4.xlarge.elasticsearch", :d2.8xlarge.elasticsearch "d2.8xlarge.elasticsearch", "t2.small.elasticsearch" "t2.small.elasticsearch", "m4.4xlarge.elasticsearch" "m4.4xlarge.elasticsearch", :m4.10xlarge.elasticsearch "m4.10xlarge.elasticsearch", :r3.large.elasticsearch "r3.large.elasticsearch", "d2.8xlarge.elasticsearch" "d2.8xlarge.elasticsearch", "c4.2xlarge.elasticsearch" "c4.2xlarge.elasticsearch", "r3.large.elasticsearch" "r3.large.elasticsearch", "m3.2xlarge.elasticsearch" "m3.2xlarge.elasticsearch", "m4.10xlarge.elasticsearch" "m4.10xlarge.elasticsearch", :c4.xlarge.elasticsearch "c4.xlarge.elasticsearch", "d2.xlarge.elasticsearch" "d2.xlarge.elasticsearch", :m4.xlarge.elasticsearch "m4.xlarge.elasticsearch", :m3.large.elasticsearch "m3.large.elasticsearch", :i2.xlarge.elasticsearch "i2.xlarge.elasticsearch", :r4.8xlarge.elasticsearch "r4.8xlarge.elasticsearch", "m3.large.elasticsearch" "m3.large.elasticsearch", "i2.xlarge.elasticsearch" "i2.xlarge.elasticsearch", :t2.medium.elasticsearch "t2.medium.elasticsearch", :t2.micro.elasticsearch "t2.micro.elasticsearch", "r4.xlarge.elasticsearch" "r4.xlarge.elasticsearch", :r3.2xlarge.elasticsearch "r3.2xlarge.elasticsearch", :m3.2xlarge.elasticsearch "m3.2xlarge.elasticsearch", :r4.2xlarge.elasticsearch "r4.2xlarge.elasticsearch", :m4.large.elasticsearch "m4.large.elasticsearch", :r4.4xlarge.elasticsearch "r4.4xlarge.elasticsearch", :c4.2xlarge.elasticsearch "c4.2xlarge.elasticsearch", "c4.4xlarge.elasticsearch" "c4.4xlarge.elasticsearch", :m4.4xlarge.elasticsearch "m4.4xlarge.elasticsearch", "c4.8xlarge.elasticsearch" "c4.8xlarge.elasticsearch", "r3.8xlarge.elasticsearch" "r3.8xlarge.elasticsearch"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/creation-date (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/update-date (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/update-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/uint-value))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/state (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-state))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.option-status/pending-deletion (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/boolean))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/option-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.option-status/CreationDate :portkey.aws.es.-2015-01-01.option-status/UpdateDate :portkey.aws.es.-2015-01-01.option-status/State] :opt-un [:portkey.aws.es.-2015-01-01.option-status/UpdateVersion :portkey.aws.es.-2015-01-01.option-status/PendingDeletion]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 0 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.additional-limit/limit-values (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/limit-value-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/additional-limit (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/LimitName :portkey.aws.es.-2015-01-01.additional-limit/LimitValues]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.snapshot-options-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/snapshot-options))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.snapshot-options-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/snapshot-options-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.snapshot-options-status/Options :portkey.aws.es.-2015-01-01.snapshot-options-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/internal-exception (portkey.awsgen/json-keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/instance-limits (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/InstanceCountLimits]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-domains-response/domain-status-list (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-status-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-response (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.describe-elasticsearch-domains-response/DomainStatusList] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limits-by-role (clojure.spec.alpha/map-of :portkey.aws.es.-2015-01-01/instance-role :portkey.aws.es.-2015-01-01/limits))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.base-exception/message (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/error-message))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/base-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.base-exception/message]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01/DomainName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.create-elasticsearch-domain-request/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.create-elasticsearch-domain-request/access-policies (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/policy-document))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01/DomainName] :opt-un [:portkey.aws.es.-2015-01-01.create-elasticsearch-domain-request/ElasticsearchVersion :portkey.aws.es.-2015-01-01/ElasticsearchClusterConfig :portkey.aws.es.-2015-01-01/EBSOptions :portkey.aws.es.-2015-01-01.create-elasticsearch-domain-request/AccessPolicies :portkey.aws.es.-2015-01-01/SnapshotOptions :portkey.aws.es.-2015-01-01/AdvancedOptions]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 1 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/minimum-instance-count (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/integer-class (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/advanced-options (clojure.spec.alpha/map-of :portkey.aws.es.-2015-01-01/string :portkey.aws.es.-2015-01-01/string))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.storage-type/storage-type-limits (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/storage-type-limit-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/StorageTypeName :portkey.aws.es.-2015-01-01/StorageSubTypeName :portkey.aws.es.-2015-01-01.storage-type/StorageTypeLimits]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/LimitsByRole]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/volume-type (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"standard" "standard", :standard "standard", "gp2" "gp2", :gp2 "gp2", "io1" "io1", :io1 "io1"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01/DomainName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/max-results (clojure.spec.alpha/and clojure.core/int? (fn* [p1__44541__44542__auto__] (clojure.core/<= p1__44541__44542__auto__ 100))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.tag/key (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/tag-key))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.tag/value (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/tag-value))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/tag (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.tag/Key :portkey.aws.es.-2015-01-01.tag/Value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.access-policies-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/policy-document))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.access-policies-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/access-policies-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.access-policies-status/Options :portkey.aws.es.-2015-01-01.access-policies-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.create-elasticsearch-domain-response/domain-status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01.create-elasticsearch-domain-response/DomainStatus]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-version-status/options (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.elasticsearch-version-status/status (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/option-status))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-version-status (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.elasticsearch-version-status/Options :portkey.aws.es.-2015-01-01.elasticsearch-version-status/Status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__44498__auto__] (clojure.core/<= 3 (clojure.core/count s__44498__auto__))) (clojure.core/fn [s__44499__auto__] (clojure.core/< (clojure.core/count s__44499__auto__) 28)) (clojure.core/fn [s__44500__auto__] (clojure.core/re-matches #"[a-z][a-z0-9\-]+" s__44500__auto__))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-domains-request/domain-names (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/domain-name-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.describe-elasticsearch-domains-request/DomainNames] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/domain-info (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/DomainName]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/elasticsearch-version-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/instance-count-limits (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/MinimumInstanceCount :portkey.aws.es.-2015-01-01/MaximumInstanceCount]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/option-state (clojure.spec.alpha/conformer (clojure.core/let [m__44496__auto__ {"RequiresIndexDocuments" "RequiresIndexDocuments", :requires-index-documents "RequiresIndexDocuments", "Processing" "Processing", :processing "Processing", "Active" "Active", :active "Active"}] (clojure.core/fn [s__44497__auto__] (m__44496__auto__ s__44497__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/uint-value (clojure.spec.alpha/and clojure.core/int? (fn* [p1__44539__44540__auto__] (clojure.core/<= 0 p1__44539__44540__auto__))))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limit-name (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-domain-config-response/domain-config (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-domain-config))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-response (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.describe-elasticsearch-domain-config-response/DomainConfig] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-instance-type-limits-request/instance-type (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/espartition-instance-type))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.describe-elasticsearch-instance-type-limits-request/elasticsearch-version (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/elasticsearch-version-string))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01.describe-elasticsearch-instance-type-limits-request/InstanceType :portkey.aws.es.-2015-01-01.describe-elasticsearch-instance-type-limits-request/ElasticsearchVersion] :opt-un [:portkey.aws.es.-2015-01-01/DomainName]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/limit-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01.storage-type-limit/limit-values (clojure.spec.alpha/and :portkey.aws.es.-2015-01-01/limit-value-list))
(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/storage-type-limit (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.es.-2015-01-01/LimitName :portkey.aws.es.-2015-01-01.storage-type-limit/LimitValues]))

(clojure.spec.alpha/def :portkey.aws.es.-2015-01-01/list-tags-request (portkey.awsgen/json-keys :req-un [:portkey.aws.es.-2015-01-01/ARN] :opt-un []))

(clojure.core/defn remove-tags ([input__47307__auto__] (remove-tags input__47307__auto__ portkey.aws/*http-client*)) ([input48307 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/tags-removal"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/RemoveTagsRequest input48307)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48306] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}] (if (clojure.core/= nil (:status response48306)) true (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48306 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48306)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48306}))))))))))

(clojure.core/defn list-domain-names ([input__47307__auto__] (list-domain-names input__47307__auto__ portkey.aws/*http-client*)) ([input48309 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/domain"), :body nil} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48308] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}] (if (clojure.core/= nil (:status response48308)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/list-domain-names-response (:body response48308)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48308 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48308)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48308}))))))))))

(clojure.core/defn update-elasticsearch-domain-config ([input__47307__auto__] (update-elasticsearch-domain-config input__47307__auto__ portkey.aws/*http-client*)) ([input48311 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain/{DomainName}/config"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/UpdateElasticsearchDomainConfigRequest input48311)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"DomainName" "DomainName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48310] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "InvalidTypeException" :portkey.aws.es.-2015-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}] (if (clojure.core/= nil (:status response48310)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/update-elasticsearch-domain-config-response (:body response48310)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48310 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48310)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48310}))))))))))

(clojure.core/defn describe-elasticsearch-domain-config ([input__47307__auto__] (describe-elasticsearch-domain-config input__47307__auto__ portkey.aws/*http-client*)) ([input48313 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain/{DomainName}/config"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/DescribeElasticsearchDomainConfigRequest input48313)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"DomainName" "DomainName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48312] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}] (if (clojure.core/= nil (:status response48312)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-config-response (:body response48312)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48312 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48312)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48312}))))))))))

(clojure.core/defn list-tags ([input__47307__auto__] (list-tags input__47307__auto__ portkey.aws/*http-client*)) ([input48315 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/tags/"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/ListTagsRequest input48315)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"arn" "ARN"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48314] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}] (if (clojure.core/= nil (:status response48314)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/list-tags-response (:body response48314)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48314 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48314)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48314}))))))))))

(clojure.core/defn describe-elasticsearch-domain ([input__47307__auto__] (describe-elasticsearch-domain input__47307__auto__ portkey.aws/*http-client*)) ([input48317 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain/{DomainName}"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/DescribeElasticsearchDomainRequest input48317)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"DomainName" "DomainName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48316] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}] (if (clojure.core/= nil (:status response48316)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/describe-elasticsearch-domain-response (:body response48316)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48316 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48316)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48316}))))))))))

(clojure.core/defn describe-elasticsearch-instance-type-limits ([input__47307__auto__] (describe-elasticsearch-instance-type-limits input__47307__auto__ portkey.aws/*http-client*)) ([input48319 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/instanceTypeLimits/{ElasticsearchVersion}/{InstanceType}"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/DescribeElasticsearchInstanceTypeLimitsRequest input48319)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"InstanceType" "InstanceType", "ElasticsearchVersion" "ElasticsearchVersion"}) (portkey.awsgen/params-to-querystring {"domainName" "DomainName"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48318] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "InvalidTypeException" :portkey.aws.es.-2015-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}] (if (clojure.core/= nil (:status response48318)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/describe-elasticsearch-instance-type-limits-response (:body response48318)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48318 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48318)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48318}))))))))))

(clojure.core/defn list-elasticsearch-versions ([input__47307__auto__] (list-elasticsearch-versions input__47307__auto__ portkey.aws/*http-client*)) ([input48321 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/versions"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/ListElasticsearchVersionsRequest input48321)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"maxResults" "MaxResults", "nextToken" "NextToken"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48320] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}] (if (clojure.core/= nil (:status response48320)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/list-elasticsearch-versions-response (:body response48320)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48320 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48320)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48320}))))))))))

(clojure.core/defn describe-elasticsearch-domains ([input__47307__auto__] (describe-elasticsearch-domains input__47307__auto__ portkey.aws/*http-client*)) ([input48323 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain-info"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/DescribeElasticsearchDomainsRequest input48323)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48322] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}] (if (clojure.core/= nil (:status response48322)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/describe-elasticsearch-domains-response (:body response48322)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48322 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48322)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48322}))))))))))

(clojure.core/defn delete-elasticsearch-domain ([input__47307__auto__] (delete-elasticsearch-domain input__47307__auto__ portkey.aws/*http-client*)) ([input48325 http-client__47308__auto__] (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain/{DomainName}"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/DeleteElasticsearchDomainRequest input48325)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"DomainName" "DomainName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48324] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}] (if (clojure.core/= nil (:status response48324)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/delete-elasticsearch-domain-response (:body response48324)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48324 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48324)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48324}))))))))))

(clojure.core/defn add-tags ([input__47307__auto__] (add-tags input__47307__auto__ portkey.aws/*http-client*)) ([input48327 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/tags"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/AddTagsRequest input48327)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48326] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception}] (if (clojure.core/= nil (:status response48326)) true (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48326 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48326)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48326}))))))))))

(clojure.core/defn list-elasticsearch-instance-types ([input__47307__auto__] (list-elasticsearch-instance-types input__47307__auto__ portkey.aws/*http-client*)) ([input48329 http-client__47308__auto__] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/instanceTypes/{ElasticsearchVersion}"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/ListElasticsearchInstanceTypesRequest input48329)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"ElasticsearchVersion" "ElasticsearchVersion"}) (portkey.awsgen/params-to-querystring {"domainName" "DomainName", "maxResults" "MaxResults", "nextToken" "NextToken"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48328] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "ResourceNotFoundException" :portkey.aws.es.-2015-01-01/resource-not-found-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}] (if (clojure.core/= nil (:status response48328)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/list-elasticsearch-instance-types-response (:body response48328)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48328 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48328)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48328}))))))))))

(clojure.core/defn create-elasticsearch-domain ([input__47307__auto__] (create-elasticsearch-domain input__47307__auto__ portkey.aws/*http-client*)) ([input48331 http-client__47308__auto__] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2015-01-01/es/domain"), :body (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/CreateElasticsearchDomainRequest input48331)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__47306__47309__auto__] (clojure.core/some-> p1__47306__47309__auto__ cheshire.core/generate-string))) (http-client__47308__auto__ (clojure.core/fn [response48330] (clojure.core/let [errors__47310__auto__ {"BaseException" :portkey.aws.es.-2015-01-01/base-exception, "DisabledOperationException" :portkey.aws.es.-2015-01-01/disabled-operation-exception, "InternalException" :portkey.aws.es.-2015-01-01/internal-exception, "InvalidTypeException" :portkey.aws.es.-2015-01-01/invalid-type-exception, "LimitExceededException" :portkey.aws.es.-2015-01-01/limit-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.es.-2015-01-01/resource-already-exists-exception, "ValidationException" :portkey.aws.es.-2015-01-01/validation-exception}] (if (clojure.core/= nil (:status response48330)) (clojure.spec.alpha/unform :portkey.aws.es.-2015-01-01/create-elasticsearch-domain-response (:body response48330)) (clojure.core/if-some [[type__47311__auto__ spec__47312__auto__] (clojure.core/find errors__47310__auto__ (clojure.core/get-in response48330 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__47313__auto__ (clojure.spec.alpha/unform spec__47312__auto__ (cheshire.core/parse-string (:body response48330)))] (throw (clojure.core/ex-info (clojure.core/str type__47311__auto__ ": " (:message m__47313__auto__)) m__47313__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response48330}))))))))))
