(ns portkey.aws.glacier (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "glacier", :region "ap-northeast-1"},
    :ssl-common-name "glacier.ap-northeast-1.amazonaws.com",
    :endpoint "https://glacier.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "glacier", :region "eu-west-1"},
    :ssl-common-name "glacier.eu-west-1.amazonaws.com",
    :endpoint "https://glacier.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "glacier", :region "us-east-2"},
    :ssl-common-name "glacier.us-east-2.amazonaws.com",
    :endpoint "https://glacier.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "glacier", :region "ap-southeast-2"},
    :ssl-common-name "glacier.ap-southeast-2.amazonaws.com",
    :endpoint "https://glacier.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope {:service "glacier", :region "cn-north-1"},
    :ssl-common-name "glacier.cn-north-1.amazonaws.com.cn",
    :endpoint "https://glacier.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope {:service "glacier", :region "ap-northeast-2"},
    :ssl-common-name "glacier.ap-northeast-2.amazonaws.com",
    :endpoint "https://glacier.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "glacier", :region "ca-central-1"},
    :ssl-common-name "glacier.ca-central-1.amazonaws.com",
    :endpoint "https://glacier.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "glacier", :region "eu-central-1"},
    :ssl-common-name "glacier.eu-central-1.amazonaws.com",
    :endpoint "https://glacier.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "glacier", :region "eu-west-2"},
    :ssl-common-name "glacier.eu-west-2.amazonaws.com",
    :endpoint "https://glacier.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "glacier", :region "us-gov-west-1"},
    :ssl-common-name "glacier.us-gov-west-1.amazonaws.com",
    :endpoint "https://glacier.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "glacier", :region "us-west-2"},
    :ssl-common-name "glacier.us-west-2.amazonaws.com",
    :endpoint "https://glacier.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "glacier", :region "us-east-1"},
    :ssl-common-name "glacier.us-east-1.amazonaws.com",
    :endpoint "https://glacier.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "glacier", :region "us-west-1"},
    :ssl-common-name "glacier.us-west-1.amazonaws.com",
    :endpoint "https://glacier.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "glacier", :region "ap-south-1"},
    :ssl-common-name "glacier.ap-south-1.amazonaws.com",
    :endpoint "https://glacier.ap-south-1.amazonaws.com",
    :signature-version :v4}})

(clojure.spec.alpha/def :portkey.aws.glacier.list-multipart-uploads-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-multipart-uploads-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-multipart-uploads-input/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-multipart-uploads-input/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-multipart-uploads-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.list-multipart-uploads-input/accountId :portkey.aws.glacier.list-multipart-uploads-input/vaultName] :opt-un [:portkey.aws.glacier.list-multipart-uploads-input/marker :portkey.aws.glacier.list-multipart-uploads-input/limit]))

(clojure.spec.alpha/def :portkey.aws.glacier/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.glacier.provisioned-capacity-description/capacity-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.provisioned-capacity-description/start-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.provisioned-capacity-description/expiration-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/provisioned-capacity-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.provisioned-capacity-description/CapacityId :portkey.aws.glacier.provisioned-capacity-description/StartDate :portkey.aws.glacier.provisioned-capacity-description/ExpirationDate]))

(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-access-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-access-policy-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-access-policy-input/policy (clojure.spec.alpha/and :portkey.aws.glacier/vault-access-policy))
(clojure.spec.alpha/def :portkey.aws.glacier/set-vault-access-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.set-vault-access-policy-input/accountId :portkey.aws.glacier.set-vault-access-policy-input/vaultName] :opt-un [:portkey.aws.glacier.set-vault-access-policy-input/policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-input/job-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-input/range (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-job-output-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.get-job-output-input/accountId :portkey.aws.glacier.get-job-output-input/vaultName :portkey.aws.glacier.get-job-output-input/jobId] :opt-un [:portkey.aws.glacier.get-job-output-input/range]))

(clojure.spec.alpha/def :portkey.aws.glacier.data-retrieval-rule/strategy (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.data-retrieval-rule/bytes-per-hour (clojure.spec.alpha/and :portkey.aws.glacier/nullable-long))
(clojure.spec.alpha/def :portkey.aws.glacier/data-retrieval-rule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.data-retrieval-rule/Strategy :portkey.aws.glacier.data-retrieval-rule/BytesPerHour]))

(clojure.spec.alpha/def :portkey.aws.glacier/uploads-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/upload-list-element :max-count nil))

(clojure.spec.alpha/def :portkey.aws.glacier.create-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.create-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/create-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.create-vault-input/accountId :portkey.aws.glacier.create-vault-input/vaultName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/body (clojure.spec.alpha/and :portkey.aws.glacier/stream))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/status (clojure.spec.alpha/and :portkey.aws.glacier/httpstatus))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/content-range (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/accept-ranges (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/content-type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-job-output-output/archive-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-job-output-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.get-job-output-output/body :portkey.aws.glacier.get-job-output-output/checksum :portkey.aws.glacier.get-job-output-output/status :portkey.aws.glacier.get-job-output-output/contentRange :portkey.aws.glacier.get-job-output-output/acceptRanges :portkey.aws.glacier.get-job-output-output/contentType :portkey.aws.glacier.get-job-output-output/archiveDescription]))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-input/archive-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-input/part-size (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-multipart-upload-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.initiate-multipart-upload-input/accountId :portkey.aws.glacier.initiate-multipart-upload-input/vaultName] :opt-un [:portkey.aws.glacier.initiate-multipart-upload-input/archiveDescription :portkey.aws.glacier.initiate-multipart-upload-input/partSize]))

(clojure.spec.alpha/def :portkey.aws.glacier.complete-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-vault-lock-input/lock-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/complete-vault-lock-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.complete-vault-lock-input/accountId :portkey.aws.glacier.complete-vault-lock-input/vaultName :portkey.aws.glacier.complete-vault-lock-input/lockId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.part-list-element/range-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.part-list-element/sha256-tree-hash (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/part-list-element (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.part-list-element/RangeInBytes :portkey.aws.glacier.part-list-element/SHA256TreeHash]))

(clojure.spec.alpha/def :portkey.aws.glacier.vault-access-policy/policy (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/vault-access-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.vault-access-policy/Policy]))

(clojure.spec.alpha/def :portkey.aws.glacier/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glacier/job-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/glacier-job-description :max-count nil))

(clojure.spec.alpha/def :portkey.aws.glacier.complete-multipart-upload-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-multipart-upload-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-multipart-upload-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-multipart-upload-input/archive-size (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.complete-multipart-upload-input/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/complete-multipart-upload-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.complete-multipart-upload-input/accountId :portkey.aws.glacier.complete-multipart-upload-input/vaultName :portkey.aws.glacier.complete-multipart-upload-input/uploadId] :opt-un [:portkey.aws.glacier.complete-multipart-upload-input/archiveSize :portkey.aws.glacier.complete-multipart-upload-input/checksum]))

(clojure.spec.alpha/def :portkey.aws.glacier/status-code (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"InProgress" "InProgress", :in-progress "InProgress", "Succeeded" "Succeeded", :succeeded "Succeeded", "Failed" "Failed", :failed "Failed"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.list-multipart-uploads-output/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-multipart-uploads-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier/UploadsList :portkey.aws.glacier.list-multipart-uploads-output/Marker]))

(clojure.spec.alpha/def :portkey.aws.glacier.create-vault-output/location (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/create-vault-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.create-vault-output/location]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-provisioned-capacity-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-provisioned-capacity-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.list-provisioned-capacity-input/accountId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glacier.purchase-provisioned-capacity-output/capacity-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/purchase-provisioned-capacity-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.purchase-provisioned-capacity-output/capacityId]))

(clojure.spec.alpha/def :portkey.aws.glacier/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glacier.get-data-retrieval-policy-output/policy (clojure.spec.alpha/and :portkey.aws.glacier/data-retrieval-policy))
(clojure.spec.alpha/def :portkey.aws.glacier/get-data-retrieval-policy-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.get-data-retrieval-policy-output/Policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-description/format (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-description/start-date (clojure.spec.alpha/and :portkey.aws.glacier/date-time))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-description/end-date (clojure.spec.alpha/and :portkey.aws.glacier/date-time))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-description/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-description/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/inventory-retrieval-job-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.inventory-retrieval-job-description/Format :portkey.aws.glacier.inventory-retrieval-job-description/StartDate :portkey.aws.glacier.inventory-retrieval-job-description/EndDate :portkey.aws.glacier.inventory-retrieval-job-description/Limit :portkey.aws.glacier.inventory-retrieval-job-description/Marker]))

(clojure.spec.alpha/def :portkey.aws.glacier.limit-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.limit-exceeded-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.limit-exceeded-exception/type :portkey.aws.glacier.limit-exceeded-exception/code :portkey.aws.glacier.limit-exceeded-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.delete-archive-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.delete-archive-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.delete-archive-input/archive-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/delete-archive-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.delete-archive-input/accountId :portkey.aws.glacier.delete-archive-input/vaultName :portkey.aws.glacier.delete-archive-input/archiveId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.set-data-retrieval-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.set-data-retrieval-policy-input/policy (clojure.spec.alpha/and :portkey.aws.glacier/data-retrieval-policy))
(clojure.spec.alpha/def :portkey.aws.glacier/set-data-retrieval-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.set-data-retrieval-policy-input/accountId] :opt-un [:portkey.aws.glacier.set-data-retrieval-policy-input/Policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-lock-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.get-vault-lock-input/accountId :portkey.aws.glacier.get-vault-lock-input/vaultName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.vault-notification-config/snstopic (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.vault-notification-config/events (clojure.spec.alpha/and :portkey.aws.glacier/notification-event-list))
(clojure.spec.alpha/def :portkey.aws.glacier/vault-notification-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.vault-notification-config/SNSTopic :portkey.aws.glacier.vault-notification-config/Events]))

(clojure.spec.alpha/def :portkey.aws.glacier/provisioned-capacity-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/provisioned-capacity-description :max-count nil))

(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/multipart-upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/vaultarn (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/archive-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/part-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/long))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/creation-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/parts (clojure.spec.alpha/and :portkey.aws.glacier/part-list))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-output/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-parts-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.list-parts-output/MultipartUploadId :portkey.aws.glacier.list-parts-output/VaultARN :portkey.aws.glacier.list-parts-output/ArchiveDescription :portkey.aws.glacier.list-parts-output/PartSizeInBytes :portkey.aws.glacier.list-parts-output/CreationDate :portkey.aws.glacier.list-parts-output/Parts :portkey.aws.glacier.list-parts-output/Marker]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-output/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-jobs-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier/JobList :portkey.aws.glacier.list-jobs-output/Marker]))

(clojure.spec.alpha/def :portkey.aws.glacier/vault-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/describe-vault-output :max-count nil))

(clojure.spec.alpha/def :portkey.aws.glacier.service-unavailable-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.service-unavailable-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.service-unavailable-exception/type :portkey.aws.glacier.service-unavailable-exception/code :portkey.aws.glacier.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/range (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-input/body (clojure.spec.alpha/and :portkey.aws.glacier/stream))
(clojure.spec.alpha/def :portkey.aws.glacier/upload-multipart-part-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.upload-multipart-part-input/accountId :portkey.aws.glacier.upload-multipart-part-input/vaultName :portkey.aws.glacier.upload-multipart-part-input/uploadId] :opt-un [:portkey.aws.glacier.upload-multipart-part-input/checksum :portkey.aws.glacier.upload-multipart-part-input/range :portkey.aws.glacier.upload-multipart-part-input/body]))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-vault-lock-input/policy (clojure.spec.alpha/and :portkey.aws.glacier/vault-lock-policy))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-vault-lock-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.initiate-vault-lock-input/accountId :portkey.aws.glacier.initiate-vault-lock-input/vaultName] :opt-un [:portkey.aws.glacier.initiate-vault-lock-input/policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.data-retrieval-policy/rules (clojure.spec.alpha/and :portkey.aws.glacier/data-retrieval-rules-list))
(clojure.spec.alpha/def :portkey.aws.glacier/data-retrieval-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.data-retrieval-policy/Rules]))

(clojure.spec.alpha/def :portkey.aws.glacier/action-code (clojure.spec.alpha/conformer (clojure.core/let [m__8147__auto__ {"ArchiveRetrieval" "ArchiveRetrieval", :archive-retrieval "ArchiveRetrieval", "InventoryRetrieval" "InventoryRetrieval", :inventory-retrieval "InventoryRetrieval"}] (clojure.core/fn [s__8148__auto__] (m__8147__auto__ s__8148__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-access-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-access-policy-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/delete-vault-access-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.delete-vault-access-policy-input/accountId :portkey.aws.glacier.delete-vault-access-policy-input/vaultName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.list-tags-for-vault-output/tags (clojure.spec.alpha/and :portkey.aws.glacier/tag-map))
(clojure.spec.alpha/def :portkey.aws.glacier/list-tags-for-vault-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.list-tags-for-vault-output/Tags]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-notifications-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-notifications-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-notifications-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.get-vault-notifications-input/accountId :portkey.aws.glacier.get-vault-notifications-input/vaultName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.get-data-retrieval-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-data-retrieval-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.get-data-retrieval-policy-input/accountId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.abort-multipart-upload-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.abort-multipart-upload-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.abort-multipart-upload-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/abort-multipart-upload-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.abort-multipart-upload-input/accountId :portkey.aws.glacier.abort-multipart-upload-input/vaultName :portkey.aws.glacier.abort-multipart-upload-input/uploadId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-access-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-access-policy-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-access-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.get-vault-access-policy-input/accountId :portkey.aws.glacier.get-vault-access-policy-input/vaultName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/delete-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.delete-vault-input/accountId :portkey.aws.glacier.delete-vault-input/vaultName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.resource-not-found-exception/type :portkey.aws.glacier.resource-not-found-exception/code :portkey.aws.glacier.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.policy-enforced-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.policy-enforced-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.policy-enforced-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/policy-enforced-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.policy-enforced-exception/type :portkey.aws.glacier.policy-enforced-exception/code :portkey.aws.glacier.policy-enforced-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glacier.purchase-provisioned-capacity-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/purchase-provisioned-capacity-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.purchase-provisioned-capacity-input/accountId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/vaultarn (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/creation-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/last-inventory-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/number-of-archives (clojure.spec.alpha/and :portkey.aws.glacier/long))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-output/size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/long))
(clojure.spec.alpha/def :portkey.aws.glacier/describe-vault-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.describe-vault-output/VaultARN :portkey.aws.glacier.describe-vault-output/VaultName :portkey.aws.glacier.describe-vault-output/CreationDate :portkey.aws.glacier.describe-vault-output/LastInventoryDate :portkey.aws.glacier.describe-vault-output/NumberOfArchives :portkey.aws.glacier.describe-vault-output/SizeInBytes]))

(clojure.spec.alpha/def :portkey.aws.glacier/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glacier.vault-lock-policy/policy (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/vault-lock-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.vault-lock-policy/Policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-output/policy (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-output/state (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-output/expiration-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-lock-output/creation-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-lock-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.get-vault-lock-output/Policy :portkey.aws.glacier.get-vault-lock-output/State :portkey.aws.glacier.get-vault-lock-output/ExpirationDate :portkey.aws.glacier.get-vault-lock-output/CreationDate]))

(clojure.spec.alpha/def :portkey.aws.glacier.add-tags-to-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.add-tags-to-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.add-tags-to-vault-input/tags (clojure.spec.alpha/and :portkey.aws.glacier/tag-map))
(clojure.spec.alpha/def :portkey.aws.glacier/add-tags-to-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.add-tags-to-vault-input/accountId :portkey.aws.glacier.add-tags-to-vault-input/vaultName] :opt-un [:portkey.aws.glacier.add-tags-to-vault-input/Tags]))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-output/location (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-output/job-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-job-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.initiate-job-output/location :portkey.aws.glacier.initiate-job-output/jobId]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-notifications-output/vault-notification-config (clojure.spec.alpha/and :portkey.aws.glacier/vault-notification-config))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-notifications-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.get-vault-notifications-output/vaultNotificationConfig]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/statuscode (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-jobs-input/completed (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-jobs-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.list-jobs-input/accountId :portkey.aws.glacier.list-jobs-input/vaultName] :opt-un [:portkey.aws.glacier.list-jobs-input/limit :portkey.aws.glacier.list-jobs-input/marker :portkey.aws.glacier.list-jobs-input/statuscode :portkey.aws.glacier.list-jobs-input/completed]))

(clojure.spec.alpha/def :portkey.aws.glacier/part-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/part-list-element :max-count nil))

(clojure.spec.alpha/def :portkey.aws.glacier/tag-map (clojure.spec.alpha/map-of :portkey.aws.glacier/tag-key :portkey.aws.glacier/tag-value))

(clojure.spec.alpha/def :portkey.aws.glacier/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glacier.request-timeout-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.request-timeout-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.request-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/request-timeout-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.request-timeout-exception/type :portkey.aws.glacier.request-timeout-exception/code :portkey.aws.glacier.request-timeout-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.upload-list-element/multipart-upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-list-element/vaultarn (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-list-element/archive-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-list-element/part-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/long))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-list-element/creation-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/upload-list-element (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.upload-list-element/MultipartUploadId :portkey.aws.glacier.upload-list-element/VaultARN :portkey.aws.glacier.upload-list-element/ArchiveDescription :portkey.aws.glacier.upload-list-element/PartSizeInBytes :portkey.aws.glacier.upload-list-element/CreationDate]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-vaults-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-vaults-input/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-vaults-input/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-vaults-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.list-vaults-input/accountId] :opt-un [:portkey.aws.glacier.list-vaults-input/marker :portkey.aws.glacier.list-vaults-input/limit]))

(clojure.spec.alpha/def :portkey.aws.glacier/stream (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-job-input/job-parameters (clojure.spec.alpha/and :portkey.aws.glacier/job-parameters))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-job-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.initiate-job-input/accountId :portkey.aws.glacier.initiate-job-input/vaultName] :opt-un [:portkey.aws.glacier.initiate-job-input/jobParameters]))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-vault-lock-output/lock-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-vault-lock-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.initiate-vault-lock-output/lockId]))

(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/describe-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.describe-vault-input/accountId :portkey.aws.glacier.describe-vault-input/vaultName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.remove-tags-from-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.remove-tags-from-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.remove-tags-from-vault-input/tag-keys (clojure.spec.alpha/and :portkey.aws.glacier/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.glacier/remove-tags-from-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.remove-tags-from-vault-input/accountId :portkey.aws.glacier.remove-tags-from-vault-input/vaultName] :opt-un [:portkey.aws.glacier.remove-tags-from-vault-input/TagKeys]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-tags-for-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-tags-for-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-tags-for-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.list-tags-for-vault-input/accountId :portkey.aws.glacier.list-tags-for-vault-input/vaultName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.insufficient-capacity-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.insufficient-capacity-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.insufficient-capacity-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/insufficient-capacity-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.insufficient-capacity-exception/type :portkey.aws.glacier.insufficient-capacity-exception/code :portkey.aws.glacier.insufficient-capacity-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-notifications-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.delete-vault-notifications-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/delete-vault-notifications-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.delete-vault-notifications-input/accountId :portkey.aws.glacier.delete-vault-notifications-input/vaultName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.describe-job-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-job-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.describe-job-input/job-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/describe-job-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.describe-job-input/accountId :portkey.aws.glacier.describe-job-input/vaultName :portkey.aws.glacier.describe-job-input/jobId] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/tier (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/completion-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/archive-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/status-message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/archive-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/size))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/snstopic (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/vaultarn (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/inventory-retrieval-parameters (clojure.spec.alpha/and :portkey.aws.glacier/inventory-retrieval-job-description))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/archivesha256-tree-hash (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/sha256-tree-hash (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/creation-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/inventory-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier/size))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/completed (clojure.spec.alpha/and :portkey.aws.glacier/boolean))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/action (clojure.spec.alpha/and :portkey.aws.glacier/action-code))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/job-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/retrieval-byte-range (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.glacier-job-description/job-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/glacier-job-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.glacier-job-description/Tier :portkey.aws.glacier.glacier-job-description/CompletionDate :portkey.aws.glacier/StatusCode :portkey.aws.glacier.glacier-job-description/ArchiveId :portkey.aws.glacier.glacier-job-description/StatusMessage :portkey.aws.glacier.glacier-job-description/ArchiveSizeInBytes :portkey.aws.glacier.glacier-job-description/SNSTopic :portkey.aws.glacier.glacier-job-description/VaultARN :portkey.aws.glacier.glacier-job-description/InventoryRetrievalParameters :portkey.aws.glacier.glacier-job-description/ArchiveSHA256TreeHash :portkey.aws.glacier.glacier-job-description/SHA256TreeHash :portkey.aws.glacier.glacier-job-description/CreationDate :portkey.aws.glacier.glacier-job-description/InventorySizeInBytes :portkey.aws.glacier.glacier-job-description/Completed :portkey.aws.glacier.glacier-job-description/Action :portkey.aws.glacier.glacier-job-description/JobDescription :portkey.aws.glacier.glacier-job-description/RetrievalByteRange :portkey.aws.glacier.glacier-job-description/JobId]))

(clojure.spec.alpha/def :portkey.aws.glacier.missing-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.missing-parameter-value-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.missing-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/missing-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.missing-parameter-value-exception/type :portkey.aws.glacier.missing-parameter-value-exception/code :portkey.aws.glacier.missing-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-output/location (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.initiate-multipart-upload-output/upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/initiate-multipart-upload-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.initiate-multipart-upload-output/location :portkey.aws.glacier.initiate-multipart-upload-output/uploadId]))

(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-input/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.list-parts-input/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-parts-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.list-parts-input/accountId :portkey.aws.glacier.list-parts-input/vaultName :portkey.aws.glacier.list-parts-input/uploadId] :opt-un [:portkey.aws.glacier.list-parts-input/marker :portkey.aws.glacier.list-parts-input/limit]))

(clojure.spec.alpha/def :portkey.aws.glacier.get-vault-access-policy-output/policy (clojure.spec.alpha/and :portkey.aws.glacier/vault-access-policy))
(clojure.spec.alpha/def :portkey.aws.glacier/get-vault-access-policy-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.get-vault-access-policy-output/policy]))

(clojure.spec.alpha/def :portkey.aws.glacier.archive-creation-output/location (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.archive-creation-output/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.archive-creation-output/archive-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/archive-creation-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.archive-creation-output/location :portkey.aws.glacier.archive-creation-output/checksum :portkey.aws.glacier.archive-creation-output/archiveId]))

(clojure.spec.alpha/def :portkey.aws.glacier/list-provisioned-capacity-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier/ProvisionedCapacityList]))

(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-input/start-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-input/end-date (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-input/limit (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.inventory-retrieval-job-input/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/inventory-retrieval-job-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.inventory-retrieval-job-input/StartDate :portkey.aws.glacier.inventory-retrieval-job-input/EndDate :portkey.aws.glacier.inventory-retrieval-job-input/Limit :portkey.aws.glacier.inventory-retrieval-job-input/Marker]))

(clojure.spec.alpha/def :portkey.aws.glacier.upload-multipart-part-output/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/upload-multipart-part-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.upload-multipart-part-output/checksum]))

(clojure.spec.alpha/def :portkey.aws.glacier.upload-archive-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-archive-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-archive-input/archive-description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-archive-input/checksum (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.upload-archive-input/body (clojure.spec.alpha/and :portkey.aws.glacier/stream))
(clojure.spec.alpha/def :portkey.aws.glacier/upload-archive-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.upload-archive-input/vaultName :portkey.aws.glacier.upload-archive-input/accountId] :opt-un [:portkey.aws.glacier.upload-archive-input/archiveDescription :portkey.aws.glacier.upload-archive-input/checksum :portkey.aws.glacier.upload-archive-input/body]))

(clojure.spec.alpha/def :portkey.aws.glacier/data-retrieval-rules-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/data-retrieval-rule :max-count nil))

(clojure.spec.alpha/def :portkey.aws.glacier.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.invalid-parameter-value-exception/code (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/invalid-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.invalid-parameter-value-exception/type :portkey.aws.glacier.invalid-parameter-value-exception/code :portkey.aws.glacier.invalid-parameter-value-exception/message]))

(clojure.spec.alpha/def :portkey.aws.glacier.abort-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.abort-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/abort-vault-lock-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.abort-vault-lock-input/accountId :portkey.aws.glacier.abort-vault-lock-input/vaultName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.glacier.list-vaults-output/marker (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier/list-vaults-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier/VaultList :portkey.aws.glacier.list-vaults-output/Marker]))

(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/format (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/type (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/archive-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/description (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/snstopic (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/retrieval-byte-range (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/tier (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.job-parameters/inventory-retrieval-parameters (clojure.spec.alpha/and :portkey.aws.glacier/inventory-retrieval-job-input))
(clojure.spec.alpha/def :portkey.aws.glacier/job-parameters (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.job-parameters/Format :portkey.aws.glacier.job-parameters/Type :portkey.aws.glacier.job-parameters/ArchiveId :portkey.aws.glacier.job-parameters/Description :portkey.aws.glacier.job-parameters/SNSTopic :portkey.aws.glacier.job-parameters/RetrievalByteRange :portkey.aws.glacier.job-parameters/Tier :portkey.aws.glacier.job-parameters/InventoryRetrievalParameters]))

(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-notifications-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-notifications-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier/string))
(clojure.spec.alpha/def :portkey.aws.glacier.set-vault-notifications-input/vault-notification-config (clojure.spec.alpha/and :portkey.aws.glacier/vault-notification-config))
(clojure.spec.alpha/def :portkey.aws.glacier/set-vault-notifications-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.set-vault-notifications-input/accountId :portkey.aws.glacier.set-vault-notifications-input/vaultName] :opt-un [:portkey.aws.glacier.set-vault-notifications-input/vaultNotificationConfig]))

(clojure.spec.alpha/def :portkey.aws.glacier/notification-event-list (clojure.spec.alpha/coll-of :portkey.aws.glacier/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.glacier/httpstatus (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.glacier/date-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn initiate-multipart-upload [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "POST" "/{accountId}/vaults/{vaultName}/multipart-uploads" input__8278__auto__ :portkey.aws.glacier/initiate-multipart-upload-input {:payload nil, :headers {"archiveDescription" ["x-amz-archive-description" nil], "partSize" ["x-amz-part-size" nil]}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 201 :portkey.aws.glacier/initiate-multipart-upload-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef initiate-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier/initiate-multipart-upload-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/initiate-multipart-upload-output))

(clojure.core/defn describe-vault [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults/{vaultName}" input__8278__auto__ :portkey.aws.glacier/describe-vault-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} nil :portkey.aws.glacier/describe-vault-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef describe-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/describe-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/describe-vault-output))

(clojure.core/defn initiate-job [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "POST" "/{accountId}/vaults/{vaultName}/jobs" input__8278__auto__ :portkey.aws.glacier/initiate-job-input {:payload "jobParameters", :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 202 :portkey.aws.glacier/initiate-job-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "PolicyEnforcedException" :portkey.aws.glacier/policy-enforced-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "InsufficientCapacityException" :portkey.aws.glacier/insufficient-capacity-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef initiate-job :args (clojure.spec.alpha/tuple :portkey.aws.glacier/initiate-job-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/initiate-job-output))

(clojure.core/defn delete-vault-notifications [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "DELETE" "/{accountId}/vaults/{vaultName}/notification-configuration" input__8278__auto__ :portkey.aws.glacier/delete-vault-notifications-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef delete-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-vault-notifications-input))

(clojure.core/defn get-vault-notifications [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults/{vaultName}/notification-configuration" input__8278__auto__ :portkey.aws.glacier/get-vault-notifications-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} nil :portkey.aws.glacier/get-vault-notifications-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef get-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-vault-notifications-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-vault-notifications-output))

(clojure.core/defn set-vault-notifications [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "PUT" "/{accountId}/vaults/{vaultName}/notification-configuration" input__8278__auto__ :portkey.aws.glacier/set-vault-notifications-input {:payload "vaultNotificationConfig", :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef set-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier/set-vault-notifications-input))

(clojure.core/defn list-tags-for-vault [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults/{vaultName}/tags" input__8278__auto__ :portkey.aws.glacier/list-tags-for-vault-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} nil :portkey.aws.glacier/list-tags-for-vault-output {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef list-tags-for-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-tags-for-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-tags-for-vault-output))

(clojure.core/defn list-multipart-uploads [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults/{vaultName}/multipart-uploads" input__8278__auto__ :portkey.aws.glacier/list-multipart-uploads-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {"marker" "marker", "limit" "limit"}} nil :portkey.aws.glacier/list-multipart-uploads-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef list-multipart-uploads :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-multipart-uploads-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-multipart-uploads-output))

(clojure.core/defn delete-vault-access-policy [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "DELETE" "/{accountId}/vaults/{vaultName}/access-policy" input__8278__auto__ :portkey.aws.glacier/delete-vault-access-policy-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef delete-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-vault-access-policy-input))

(clojure.core/defn get-data-retrieval-policy [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/policies/data-retrieval" input__8278__auto__ :portkey.aws.glacier/get-data-retrieval-policy-input {:payload nil, :headers {}, :uri {"accountId" "accountId"}, :querystring {}} nil :portkey.aws.glacier/get-data-retrieval-policy-output {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef get-data-retrieval-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-data-retrieval-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-data-retrieval-policy-output))

(clojure.core/defn purchase-provisioned-capacity [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "POST" "/{accountId}/provisioned-capacity" input__8278__auto__ :portkey.aws.glacier/purchase-provisioned-capacity-input {:payload nil, :headers {}, :uri {"accountId" "accountId"}, :querystring {}} 201 :portkey.aws.glacier/purchase-provisioned-capacity-output {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "LimitExceededException" :portkey.aws.glacier/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef purchase-provisioned-capacity :args (clojure.spec.alpha/tuple :portkey.aws.glacier/purchase-provisioned-capacity-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/purchase-provisioned-capacity-output))

(clojure.core/defn delete-archive [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "DELETE" "/{accountId}/vaults/{vaultName}/archives/{archiveId}" input__8278__auto__ :portkey.aws.glacier/delete-archive-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName", "archiveId" "archiveId"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef delete-archive :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-archive-input))

(clojure.core/defn describe-job [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults/{vaultName}/jobs/{jobId}" input__8278__auto__ :portkey.aws.glacier/describe-job-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName", "jobId" "jobId"}, :querystring {}} nil :portkey.aws.glacier/glacier-job-description {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef describe-job :args (clojure.spec.alpha/tuple :portkey.aws.glacier/describe-job-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/glacier-job-description))

(clojure.core/defn complete-multipart-upload [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "POST" "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}" input__8278__auto__ :portkey.aws.glacier/complete-multipart-upload-input {:payload nil, :headers {"archiveSize" ["x-amz-archive-size" nil], "checksum" ["x-amz-sha256-tree-hash" nil]}, :uri {"accountId" "accountId", "vaultName" "vaultName", "uploadId" "uploadId"}, :querystring {}} 201 :portkey.aws.glacier/archive-creation-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef complete-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier/complete-multipart-upload-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/archive-creation-output))

(clojure.core/defn abort-multipart-upload [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "DELETE" "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}" input__8278__auto__ :portkey.aws.glacier/abort-multipart-upload-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName", "uploadId" "uploadId"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef abort-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier/abort-multipart-upload-input))

(clojure.core/defn add-tags-to-vault [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "POST" "/{accountId}/vaults/{vaultName}/tags?operation=add" input__8278__auto__ :portkey.aws.glacier/add-tags-to-vault-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "LimitExceededException" :portkey.aws.glacier/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef add-tags-to-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/add-tags-to-vault-input))

(clojure.core/defn initiate-vault-lock [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "POST" "/{accountId}/vaults/{vaultName}/lock-policy" input__8278__auto__ :portkey.aws.glacier/initiate-vault-lock-input {:payload "policy", :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 201 :portkey.aws.glacier/initiate-vault-lock-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef initiate-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/initiate-vault-lock-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/initiate-vault-lock-output))

(clojure.core/defn delete-vault [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "DELETE" "/{accountId}/vaults/{vaultName}" input__8278__auto__ :portkey.aws.glacier/delete-vault-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef delete-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/delete-vault-input))

(clojure.core/defn list-provisioned-capacity [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/provisioned-capacity" input__8278__auto__ :portkey.aws.glacier/list-provisioned-capacity-input {:payload nil, :headers {}, :uri {"accountId" "accountId"}, :querystring {}} nil :portkey.aws.glacier/list-provisioned-capacity-output {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef list-provisioned-capacity :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-provisioned-capacity-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-provisioned-capacity-output))

(clojure.core/defn get-vault-lock [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults/{vaultName}/lock-policy" input__8278__auto__ :portkey.aws.glacier/get-vault-lock-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} nil :portkey.aws.glacier/get-vault-lock-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef get-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-vault-lock-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-vault-lock-output))

(clojure.core/defn list-vaults [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults" input__8278__auto__ :portkey.aws.glacier/list-vaults-input {:payload nil, :headers {}, :uri {"accountId" "accountId"}, :querystring {"marker" "marker", "limit" "limit"}} nil :portkey.aws.glacier/list-vaults-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef list-vaults :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-vaults-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-vaults-output))

(clojure.core/defn set-data-retrieval-policy [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "PUT" "/{accountId}/policies/data-retrieval" input__8278__auto__ :portkey.aws.glacier/set-data-retrieval-policy-input {:payload nil, :headers {}, :uri {"accountId" "accountId"}, :querystring {}} 204 nil {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef set-data-retrieval-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/set-data-retrieval-policy-input))

(clojure.core/defn get-job-output [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults/{vaultName}/jobs/{jobId}/output" input__8278__auto__ :portkey.aws.glacier/get-job-output-input {:payload nil, :headers {"range" ["Range" nil]}, :uri {"accountId" "accountId", "vaultName" "vaultName", "jobId" "jobId"}, :querystring {}} nil :portkey.aws.glacier/get-job-output-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef get-job-output :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-job-output-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-job-output-output))

(clojure.core/defn remove-tags-from-vault [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "POST" "/{accountId}/vaults/{vaultName}/tags?operation=remove" input__8278__auto__ :portkey.aws.glacier/remove-tags-from-vault-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef remove-tags-from-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/remove-tags-from-vault-input))

(clojure.core/defn abort-vault-lock [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "DELETE" "/{accountId}/vaults/{vaultName}/lock-policy" input__8278__auto__ :portkey.aws.glacier/abort-vault-lock-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef abort-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/abort-vault-lock-input))

(clojure.core/defn list-parts [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}" input__8278__auto__ :portkey.aws.glacier/list-parts-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName", "uploadId" "uploadId"}, :querystring {"marker" "marker", "limit" "limit"}} nil :portkey.aws.glacier/list-parts-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef list-parts :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-parts-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-parts-output))

(clojure.core/defn set-vault-access-policy [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "PUT" "/{accountId}/vaults/{vaultName}/access-policy" input__8278__auto__ :portkey.aws.glacier/set-vault-access-policy-input {:payload "policy", :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef set-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/set-vault-access-policy-input))

(clojure.core/defn create-vault [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "PUT" "/{accountId}/vaults/{vaultName}" input__8278__auto__ :portkey.aws.glacier/create-vault-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 201 :portkey.aws.glacier/create-vault-output {"InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception, "LimitExceededException" :portkey.aws.glacier/limit-exceeded-exception}))
(clojure.spec.alpha/fdef create-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier/create-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/create-vault-output))

(clojure.core/defn complete-vault-lock [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "POST" "/{accountId}/vaults/{vaultName}/lock-policy/{lockId}" input__8278__auto__ :portkey.aws.glacier/complete-vault-lock-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName", "lockId" "lockId"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef complete-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier/complete-vault-lock-input))

(clojure.core/defn upload-multipart-part [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "PUT" "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}" input__8278__auto__ :portkey.aws.glacier/upload-multipart-part-input {:payload "body", :headers {"checksum" ["x-amz-sha256-tree-hash" nil], "range" ["Content-Range" nil]}, :uri {"accountId" "accountId", "vaultName" "vaultName", "uploadId" "uploadId"}, :querystring {}} 204 :portkey.aws.glacier/upload-multipart-part-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "RequestTimeoutException" :portkey.aws.glacier/request-timeout-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef upload-multipart-part :args (clojure.spec.alpha/tuple :portkey.aws.glacier/upload-multipart-part-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/upload-multipart-part-output))

(clojure.core/defn upload-archive [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "POST" "/{accountId}/vaults/{vaultName}/archives" input__8278__auto__ :portkey.aws.glacier/upload-archive-input {:payload "body", :headers {"archiveDescription" ["x-amz-archive-description" nil], "checksum" ["x-amz-sha256-tree-hash" nil]}, :uri {"vaultName" "vaultName", "accountId" "accountId"}, :querystring {}} 201 :portkey.aws.glacier/archive-creation-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "RequestTimeoutException" :portkey.aws.glacier/request-timeout-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef upload-archive :args (clojure.spec.alpha/tuple :portkey.aws.glacier/upload-archive-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/archive-creation-output))

(clojure.core/defn get-vault-access-policy [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults/{vaultName}/access-policy" input__8278__auto__ :portkey.aws.glacier/get-vault-access-policy-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} nil :portkey.aws.glacier/get-vault-access-policy-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef get-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier/get-vault-access-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/get-vault-access-policy-output))

(clojure.core/defn list-jobs [input__8278__auto__] (portkey.aws/-rest-json-call portkey.aws.glacier/endpoints "GET" "/{accountId}/vaults/{vaultName}/jobs" input__8278__auto__ :portkey.aws.glacier/list-jobs-input {:payload nil, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {"limit" "limit", "marker" "marker", "statuscode" "statuscode", "completed" "completed"}} nil :portkey.aws.glacier/list-jobs-output {"ResourceNotFoundException" :portkey.aws.glacier/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier/service-unavailable-exception}))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/tuple :portkey.aws.glacier/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier/list-jobs-output))
