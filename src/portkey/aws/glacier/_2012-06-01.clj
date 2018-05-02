(ns portkey.aws.glacier.-2012-06-01 (:require [portkey.aws]))

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

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-multipart-uploads-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-multipart-uploads-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-multipart-uploads-input/marker (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-multipart-uploads-input/limit (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-multipart-uploads-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.list-multipart-uploads-input/accountId :portkey.aws.glacier.-2012-06-01.list-multipart-uploads-input/vaultName] :opt-un [:portkey.aws.glacier.-2012-06-01.list-multipart-uploads-input/marker :portkey.aws.glacier.-2012-06-01.list-multipart-uploads-input/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.provisioned-capacity-description/capacity-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.provisioned-capacity-description/start-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.provisioned-capacity-description/expiration-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/provisioned-capacity-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.provisioned-capacity-description/CapacityId :portkey.aws.glacier.-2012-06-01.provisioned-capacity-description/StartDate :portkey.aws.glacier.-2012-06-01.provisioned-capacity-description/ExpirationDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.set-vault-access-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.set-vault-access-policy-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.set-vault-access-policy-input/policy (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/vault-access-policy))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/set-vault-access-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.set-vault-access-policy-input/accountId :portkey.aws.glacier.-2012-06-01.set-vault-access-policy-input/vaultName] :opt-un [:portkey.aws.glacier.-2012-06-01.set-vault-access-policy-input/policy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-input/job-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-input/range (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/get-job-output-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.get-job-output-input/accountId :portkey.aws.glacier.-2012-06-01.get-job-output-input/vaultName :portkey.aws.glacier.-2012-06-01.get-job-output-input/jobId] :opt-un [:portkey.aws.glacier.-2012-06-01.get-job-output-input/range] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.data-retrieval-rule/strategy (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.data-retrieval-rule/bytes-per-hour (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/nullable-long))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/data-retrieval-rule (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.data-retrieval-rule/Strategy :portkey.aws.glacier.-2012-06-01.data-retrieval-rule/BytesPerHour] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/uploads-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.glacier.-2012-06-01/upload-list-element) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.input-serialization/csv (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/csvinput))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/input-serialization (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.input-serialization/csv] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.create-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.create-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/create-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.create-vault-input/accountId :portkey.aws.glacier.-2012-06-01.create-vault-input/vaultName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-output/body (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/stream))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-output/checksum (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-output/status (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/httpstatus))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-output/content-range (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-output/accept-ranges (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-output/content-type (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-job-output-output/archive-description (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/get-job-output-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.get-job-output-output/body :portkey.aws.glacier.-2012-06-01.get-job-output-output/checksum :portkey.aws.glacier.-2012-06-01.get-job-output-output/status :portkey.aws.glacier.-2012-06-01.get-job-output-output/contentRange :portkey.aws.glacier.-2012-06-01.get-job-output-output/acceptRanges :portkey.aws.glacier.-2012-06-01.get-job-output-output/contentType :portkey.aws.glacier.-2012-06-01.get-job-output-output/archiveDescription] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-input/archive-description (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-input/part-size (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/initiate-multipart-upload-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-input/accountId :portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-input/vaultName] :opt-un [:portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-input/archiveDescription :portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-input/partSize] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.complete-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.complete-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.complete-vault-lock-input/lock-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/complete-vault-lock-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.complete-vault-lock-input/accountId :portkey.aws.glacier.-2012-06-01.complete-vault-lock-input/vaultName :portkey.aws.glacier.-2012-06-01.complete-vault-lock-input/lockId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.part-list-element/range-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.part-list-element/sha256-tree-hash (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/part-list-element (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.part-list-element/RangeInBytes :portkey.aws.glacier.-2012-06-01.part-list-element/SHA256TreeHash] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.vault-access-policy/policy (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/vault-access-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.vault-access-policy/Policy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/job-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.glacier.-2012-06-01/glacier-job-description) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.complete-multipart-upload-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.complete-multipart-upload-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.complete-multipart-upload-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.complete-multipart-upload-input/archive-size (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.complete-multipart-upload-input/checksum (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/complete-multipart-upload-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.complete-multipart-upload-input/accountId :portkey.aws.glacier.-2012-06-01.complete-multipart-upload-input/vaultName :portkey.aws.glacier.-2012-06-01.complete-multipart-upload-input/uploadId] :opt-un [:portkey.aws.glacier.-2012-06-01.complete-multipart-upload-input/archiveSize :portkey.aws.glacier.-2012-06-01.complete-multipart-upload-input/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/type (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"AmazonCustomerByEmail" "AmazonCustomerByEmail", :amazon-customer-by-email "AmazonCustomerByEmail", "CanonicalUser" "CanonicalUser", :canonical-user "CanonicalUser", "Group" "Group", :group "Group"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/status-code (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"InProgress" "InProgress", :in-progress "InProgress", "Succeeded" "Succeeded", :succeeded "Succeeded", "Failed" "Failed", :failed "Failed"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/permission (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"WRITE" "WRITE", "FULL_CONTROL" "FULL_CONTROL", :read "READ", :read-acp "READ_ACP", "READ_ACP" "READ_ACP", :write-acp "WRITE_ACP", :write "WRITE", "WRITE_ACP" "WRITE_ACP", "READ" "READ", :full-control "FULL_CONTROL"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-multipart-uploads-output/marker (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-multipart-uploads-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01/UploadsList :portkey.aws.glacier.-2012-06-01.list-multipart-uploads-output/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/cannedacl (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"authenticated-read" "authenticated-read", "public-read-write" "public-read-write", :bucket-owner-full-control "bucket-owner-full-control", :private "private", "bucket-owner-full-control" "bucket-owner-full-control", "private" "private", :authenticated-read "authenticated-read", "aws-exec-read" "aws-exec-read", :aws-exec-read "aws-exec-read", :bucket-owner-read "bucket-owner-read", "bucket-owner-read" "bucket-owner-read", "public-read" "public-read", :public-read-write "public-read-write", :public-read "public-read"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.create-vault-output/location (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/create-vault-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.create-vault-output/location] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-provisioned-capacity-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-provisioned-capacity-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.list-provisioned-capacity-input/accountId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.purchase-provisioned-capacity-output/capacity-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/purchase-provisioned-capacity-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.purchase-provisioned-capacity-output/capacityId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/tag-key (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-data-retrieval-policy-output/policy (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/data-retrieval-policy))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/get-data-retrieval-policy-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.get-data-retrieval-policy-output/Policy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-description/format (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-description/start-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/date-time))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-description/end-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/date-time))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-description/limit (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-description/marker (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/inventory-retrieval-job-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-description/Format :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-description/StartDate :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-description/EndDate :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-description/Limit :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-description/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.limit-exceeded-exception/type (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.limit-exceeded-exception/code (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.limit-exceeded-exception/message (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.limit-exceeded-exception/type :portkey.aws.glacier.-2012-06-01.limit-exceeded-exception/code :portkey.aws.glacier.-2012-06-01.limit-exceeded-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.delete-archive-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.delete-archive-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.delete-archive-input/archive-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/delete-archive-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.delete-archive-input/accountId :portkey.aws.glacier.-2012-06-01.delete-archive-input/vaultName :portkey.aws.glacier.-2012-06-01.delete-archive-input/archiveId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.set-data-retrieval-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.set-data-retrieval-policy-input/policy (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/data-retrieval-policy))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/set-data-retrieval-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.set-data-retrieval-policy-input/accountId] :opt-un [:portkey.aws.glacier.-2012-06-01.set-data-retrieval-policy-input/Policy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/get-vault-lock-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.get-vault-lock-input/accountId :portkey.aws.glacier.-2012-06-01.get-vault-lock-input/vaultName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.vault-notification-config/snstopic (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.vault-notification-config/events (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/notification-event-list))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/vault-notification-config (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.vault-notification-config/SNSTopic :portkey.aws.glacier.-2012-06-01.vault-notification-config/Events] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/provisioned-capacity-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.glacier.-2012-06-01/provisioned-capacity-description) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-output/multipart-upload-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-output/vaultarn (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-output/archive-description (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-output/part-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/long))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-output/creation-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-output/parts (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/part-list))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-output/marker (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-parts-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.list-parts-output/MultipartUploadId :portkey.aws.glacier.-2012-06-01.list-parts-output/VaultARN :portkey.aws.glacier.-2012-06-01.list-parts-output/ArchiveDescription :portkey.aws.glacier.-2012-06-01.list-parts-output/PartSizeInBytes :portkey.aws.glacier.-2012-06-01.list-parts-output/CreationDate :portkey.aws.glacier.-2012-06-01.list-parts-output/Parts :portkey.aws.glacier.-2012-06-01.list-parts-output/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-jobs-output/marker (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-jobs-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01/JobList :portkey.aws.glacier.-2012-06-01.list-jobs-output/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/access-control-policy-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.glacier.-2012-06-01/grant) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/vault-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.glacier.-2012-06-01/describe-vault-output) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.service-unavailable-exception/type (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.service-unavailable-exception/code (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/service-unavailable-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.service-unavailable-exception/type :portkey.aws.glacier.-2012-06-01.service-unavailable-exception/code :portkey.aws.glacier.-2012-06-01.service-unavailable-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/checksum (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/range (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/body (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/stream))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/upload-multipart-part-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/accountId :portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/vaultName :portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/uploadId] :opt-un [:portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/checksum :portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/range :portkey.aws.glacier.-2012-06-01.upload-multipart-part-input/body] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-vault-lock-input/policy (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/vault-lock-policy))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/initiate-vault-lock-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.initiate-vault-lock-input/accountId :portkey.aws.glacier.-2012-06-01.initiate-vault-lock-input/vaultName] :opt-un [:portkey.aws.glacier.-2012-06-01.initiate-vault-lock-input/policy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.output-serialization/csv (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/csvoutput))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/output-serialization (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.output-serialization/csv] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.data-retrieval-policy/rules (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/data-retrieval-rules-list))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/data-retrieval-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.data-retrieval-policy/Rules] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/encryption-type (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"aws:kms" "aws:kms", :aws:kms "aws:kms", "AES256" "AES256", :aes256 "AES256"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/action-code (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"ArchiveRetrieval" "ArchiveRetrieval", :archive-retrieval "ArchiveRetrieval", "InventoryRetrieval" "InventoryRetrieval", :inventory-retrieval "InventoryRetrieval", "Select" "Select", :select "Select"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.delete-vault-access-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.delete-vault-access-policy-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/delete-vault-access-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.delete-vault-access-policy-input/accountId :portkey.aws.glacier.-2012-06-01.delete-vault-access-policy-input/vaultName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-tags-for-vault-output/tags (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/tag-map))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-tags-for-vault-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.list-tags-for-vault-output/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-notifications-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-notifications-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/get-vault-notifications-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.get-vault-notifications-input/accountId :portkey.aws.glacier.-2012-06-01.get-vault-notifications-input/vaultName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-data-retrieval-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/get-data-retrieval-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.get-data-retrieval-policy-input/accountId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.abort-multipart-upload-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.abort-multipart-upload-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.abort-multipart-upload-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/abort-multipart-upload-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.abort-multipart-upload-input/accountId :portkey.aws.glacier.-2012-06-01.abort-multipart-upload-input/vaultName :portkey.aws.glacier.-2012-06-01.abort-multipart-upload-input/uploadId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/grant (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01/Grantee :portkey.aws.glacier.-2012-06-01/Permission] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/tag-key-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.glacier.-2012-06-01/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-access-policy-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-access-policy-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/get-vault-access-policy-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.get-vault-access-policy-input/accountId :portkey.aws.glacier.-2012-06-01.get-vault-access-policy-input/vaultName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.delete-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.delete-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/delete-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.delete-vault-input/accountId :portkey.aws.glacier.-2012-06-01.delete-vault-input/vaultName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.csvoutput/quote-escape-character (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.csvoutput/record-delimiter (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.csvoutput/field-delimiter (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.csvoutput/quote-character (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/csvoutput (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01/QuoteFields :portkey.aws.glacier.-2012-06-01.csvoutput/QuoteEscapeCharacter :portkey.aws.glacier.-2012-06-01.csvoutput/RecordDelimiter :portkey.aws.glacier.-2012-06-01.csvoutput/FieldDelimiter :portkey.aws.glacier.-2012-06-01.csvoutput/QuoteCharacter] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.resource-not-found-exception/type (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.resource-not-found-exception/code (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.resource-not-found-exception/type :portkey.aws.glacier.-2012-06-01.resource-not-found-exception/code :portkey.aws.glacier.-2012-06-01.resource-not-found-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/hashmap (clojure.spec.alpha/map-of :portkey.aws.glacier.-2012-06-01/string :portkey.aws.glacier.-2012-06-01/string))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.policy-enforced-exception/type (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.policy-enforced-exception/code (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.policy-enforced-exception/message (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/policy-enforced-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.policy-enforced-exception/type :portkey.aws.glacier.-2012-06-01.policy-enforced-exception/code :portkey.aws.glacier.-2012-06-01.policy-enforced-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/nullable-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.purchase-provisioned-capacity-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/purchase-provisioned-capacity-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.purchase-provisioned-capacity-input/accountId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-vault-output/vaultarn (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-vault-output/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-vault-output/creation-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-vault-output/last-inventory-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-vault-output/number-of-archives (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/long))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-vault-output/size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/long))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/describe-vault-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.describe-vault-output/VaultARN :portkey.aws.glacier.-2012-06-01.describe-vault-output/VaultName :portkey.aws.glacier.-2012-06-01.describe-vault-output/CreationDate :portkey.aws.glacier.-2012-06-01.describe-vault-output/LastInventoryDate :portkey.aws.glacier.-2012-06-01.describe-vault-output/NumberOfArchives :portkey.aws.glacier.-2012-06-01.describe-vault-output/SizeInBytes] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/tag-value (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.vault-lock-policy/policy (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/vault-lock-policy (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.vault-lock-policy/Policy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-lock-output/policy (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-lock-output/state (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-lock-output/expiration-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-lock-output/creation-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/get-vault-lock-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.get-vault-lock-output/Policy :portkey.aws.glacier.-2012-06-01.get-vault-lock-output/State :portkey.aws.glacier.-2012-06-01.get-vault-lock-output/ExpirationDate :portkey.aws.glacier.-2012-06-01.get-vault-lock-output/CreationDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.add-tags-to-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.add-tags-to-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.add-tags-to-vault-input/tags (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/tag-map))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/add-tags-to-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.add-tags-to-vault-input/accountId :portkey.aws.glacier.-2012-06-01.add-tags-to-vault-input/vaultName] :opt-un [:portkey.aws.glacier.-2012-06-01.add-tags-to-vault-input/Tags] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-job-output/location (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-job-output/job-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-job-output/job-output-path (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/initiate-job-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.initiate-job-output/location :portkey.aws.glacier.-2012-06-01.initiate-job-output/jobId :portkey.aws.glacier.-2012-06-01.initiate-job-output/jobOutputPath] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-notifications-output/vault-notification-config (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/vault-notification-config))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/get-vault-notifications-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.get-vault-notifications-output/vaultNotificationConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-jobs-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-jobs-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-jobs-input/limit (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-jobs-input/marker (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-jobs-input/statuscode (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-jobs-input/completed (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-jobs-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.list-jobs-input/accountId :portkey.aws.glacier.-2012-06-01.list-jobs-input/vaultName] :opt-un [:portkey.aws.glacier.-2012-06-01.list-jobs-input/limit :portkey.aws.glacier.-2012-06-01.list-jobs-input/marker :portkey.aws.glacier.-2012-06-01.list-jobs-input/statuscode :portkey.aws.glacier.-2012-06-01.list-jobs-input/completed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/part-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.glacier.-2012-06-01/part-list-element) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/tag-map (clojure.spec.alpha/map-of :portkey.aws.glacier.-2012-06-01/tag-key :portkey.aws.glacier.-2012-06-01/tag-value))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.request-timeout-exception/type (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.request-timeout-exception/code (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.request-timeout-exception/message (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/request-timeout-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.request-timeout-exception/type :portkey.aws.glacier.-2012-06-01.request-timeout-exception/code :portkey.aws.glacier.-2012-06-01.request-timeout-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-list-element/multipart-upload-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-list-element/vaultarn (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-list-element/archive-description (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-list-element/part-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/long))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-list-element/creation-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/upload-list-element (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.upload-list-element/MultipartUploadId :portkey.aws.glacier.-2012-06-01.upload-list-element/VaultARN :portkey.aws.glacier.-2012-06-01.upload-list-element/ArchiveDescription :portkey.aws.glacier.-2012-06-01.upload-list-element/PartSizeInBytes :portkey.aws.glacier.-2012-06-01.upload-list-element/CreationDate] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.select-parameters/expression (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/select-parameters (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01/InputSerialization :portkey.aws.glacier.-2012-06-01/ExpressionType :portkey.aws.glacier.-2012-06-01.select-parameters/Expression :portkey.aws.glacier.-2012-06-01/OutputSerialization] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.s3-location/bucket-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.s3-location/prefix (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.s3-location/access-control-list (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/access-control-policy-list))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.s3-location/tagging (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/hashmap))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.s3-location/user-metadata (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/hashmap))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/s3-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.s3-location/BucketName :portkey.aws.glacier.-2012-06-01.s3-location/Prefix :portkey.aws.glacier.-2012-06-01/Encryption :portkey.aws.glacier.-2012-06-01/CannedACL :portkey.aws.glacier.-2012-06-01.s3-location/AccessControlList :portkey.aws.glacier.-2012-06-01.s3-location/Tagging :portkey.aws.glacier.-2012-06-01.s3-location/UserMetadata :portkey.aws.glacier.-2012-06-01/StorageClass] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-vaults-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-vaults-input/marker (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-vaults-input/limit (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-vaults-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.list-vaults-input/accountId] :opt-un [:portkey.aws.glacier.-2012-06-01.list-vaults-input/marker :portkey.aws.glacier.-2012-06-01.list-vaults-input/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/stream (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-job-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-job-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-job-input/job-parameters (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/job-parameters))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/initiate-job-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.initiate-job-input/accountId :portkey.aws.glacier.-2012-06-01.initiate-job-input/vaultName] :opt-un [:portkey.aws.glacier.-2012-06-01.initiate-job-input/jobParameters] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-vault-lock-output/lock-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/initiate-vault-lock-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.initiate-vault-lock-output/lockId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/describe-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.describe-vault-input/accountId :portkey.aws.glacier.-2012-06-01.describe-vault-input/vaultName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.remove-tags-from-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.remove-tags-from-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.remove-tags-from-vault-input/tag-keys (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/tag-key-list))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/remove-tags-from-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.remove-tags-from-vault-input/accountId :portkey.aws.glacier.-2012-06-01.remove-tags-from-vault-input/vaultName] :opt-un [:portkey.aws.glacier.-2012-06-01.remove-tags-from-vault-input/TagKeys] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-tags-for-vault-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-tags-for-vault-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-tags-for-vault-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.list-tags-for-vault-input/accountId :portkey.aws.glacier.-2012-06-01.list-tags-for-vault-input/vaultName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.insufficient-capacity-exception/type (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.insufficient-capacity-exception/code (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.insufficient-capacity-exception/message (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/insufficient-capacity-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.insufficient-capacity-exception/type :portkey.aws.glacier.-2012-06-01.insufficient-capacity-exception/code :portkey.aws.glacier.-2012-06-01.insufficient-capacity-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.delete-vault-notifications-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.delete-vault-notifications-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/delete-vault-notifications-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.delete-vault-notifications-input/accountId :portkey.aws.glacier.-2012-06-01.delete-vault-notifications-input/vaultName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-job-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-job-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.describe-job-input/job-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/describe-job-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.describe-job-input/accountId :portkey.aws.glacier.-2012-06-01.describe-job-input/vaultName :portkey.aws.glacier.-2012-06-01.describe-job-input/jobId] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.encryption/kmskey-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.encryption/kmscontext (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/encryption (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01/EncryptionType :portkey.aws.glacier.-2012-06-01.encryption/KMSKeyId :portkey.aws.glacier.-2012-06-01.encryption/KMSContext] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/expression-type (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"SQL" "SQL", :sql "SQL"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/tier (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/job-output-path (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/completion-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/archive-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/status-message (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/archive-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/size))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/snstopic (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/vaultarn (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/inventory-retrieval-parameters (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/inventory-retrieval-job-description))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/archivesha256-tree-hash (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/sha256-tree-hash (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/creation-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/inventory-size-in-bytes (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/size))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/completed (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/boolean))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/action (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/action-code))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/job-description (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/retrieval-byte-range (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.glacier-job-description/job-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/glacier-job-description (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.glacier-job-description/Tier :portkey.aws.glacier.-2012-06-01.glacier-job-description/JobOutputPath :portkey.aws.glacier.-2012-06-01.glacier-job-description/CompletionDate :portkey.aws.glacier.-2012-06-01/StatusCode :portkey.aws.glacier.-2012-06-01.glacier-job-description/ArchiveId :portkey.aws.glacier.-2012-06-01.glacier-job-description/StatusMessage :portkey.aws.glacier.-2012-06-01.glacier-job-description/ArchiveSizeInBytes :portkey.aws.glacier.-2012-06-01.glacier-job-description/SNSTopic :portkey.aws.glacier.-2012-06-01.glacier-job-description/VaultARN :portkey.aws.glacier.-2012-06-01.glacier-job-description/InventoryRetrievalParameters :portkey.aws.glacier.-2012-06-01.glacier-job-description/ArchiveSHA256TreeHash :portkey.aws.glacier.-2012-06-01/SelectParameters :portkey.aws.glacier.-2012-06-01.glacier-job-description/SHA256TreeHash :portkey.aws.glacier.-2012-06-01.glacier-job-description/CreationDate :portkey.aws.glacier.-2012-06-01.glacier-job-description/InventorySizeInBytes :portkey.aws.glacier.-2012-06-01.glacier-job-description/Completed :portkey.aws.glacier.-2012-06-01/OutputLocation :portkey.aws.glacier.-2012-06-01.glacier-job-description/Action :portkey.aws.glacier.-2012-06-01.glacier-job-description/JobDescription :portkey.aws.glacier.-2012-06-01.glacier-job-description/RetrievalByteRange :portkey.aws.glacier.-2012-06-01.glacier-job-description/JobId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.missing-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.missing-parameter-value-exception/code (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.missing-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.missing-parameter-value-exception/type :portkey.aws.glacier.-2012-06-01.missing-parameter-value-exception/code :portkey.aws.glacier.-2012-06-01.missing-parameter-value-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-output/location (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-output/upload-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/initiate-multipart-upload-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-output/location :portkey.aws.glacier.-2012-06-01.initiate-multipart-upload-output/uploadId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-input/upload-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-input/marker (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-parts-input/limit (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-parts-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.list-parts-input/accountId :portkey.aws.glacier.-2012-06-01.list-parts-input/vaultName :portkey.aws.glacier.-2012-06-01.list-parts-input/uploadId] :opt-un [:portkey.aws.glacier.-2012-06-01.list-parts-input/marker :portkey.aws.glacier.-2012-06-01.list-parts-input/limit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/storage-class (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"STANDARD" "STANDARD", :standard "STANDARD", "REDUCED_REDUNDANCY" "REDUCED_REDUNDANCY", :reduced-redundancy "REDUCED_REDUNDANCY", "STANDARD_IA" "STANDARD_IA", :standard-ia "STANDARD_IA"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.get-vault-access-policy-output/policy (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/vault-access-policy))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/get-vault-access-policy-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.get-vault-access-policy-output/policy] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.archive-creation-output/location (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.archive-creation-output/checksum (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.archive-creation-output/archive-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/archive-creation-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.archive-creation-output/location :portkey.aws.glacier.-2012-06-01.archive-creation-output/checksum :portkey.aws.glacier.-2012-06-01.archive-creation-output/archiveId] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-provisioned-capacity-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01/ProvisionedCapacityList] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.grantee/display-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.grantee/uri (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.grantee/id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.grantee/email-address (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/grantee (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01/Type] :opt-un [:portkey.aws.glacier.-2012-06-01.grantee/DisplayName :portkey.aws.glacier.-2012-06-01.grantee/URI :portkey.aws.glacier.-2012-06-01.grantee/ID :portkey.aws.glacier.-2012-06-01.grantee/EmailAddress] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/file-header-info (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"USE" "USE", :use "USE", "IGNORE" "IGNORE", :ignore "IGNORE", "NONE" "NONE", :none "NONE"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-input/start-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-input/end-date (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-input/limit (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-input/marker (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/inventory-retrieval-job-input (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-input/StartDate :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-input/EndDate :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-input/Limit :portkey.aws.glacier.-2012-06-01.inventory-retrieval-job-input/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-multipart-part-output/checksum (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/upload-multipart-part-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.upload-multipart-part-output/checksum] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.output-location/s3 (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/s3-location))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/output-location (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.output-location/S3] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-archive-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-archive-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-archive-input/archive-description (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-archive-input/checksum (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.upload-archive-input/body (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/stream))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/upload-archive-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.upload-archive-input/vaultName :portkey.aws.glacier.-2012-06-01.upload-archive-input/accountId] :opt-un [:portkey.aws.glacier.-2012-06-01.upload-archive-input/archiveDescription :portkey.aws.glacier.-2012-06-01.upload-archive-input/checksum :portkey.aws.glacier.-2012-06-01.upload-archive-input/body] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/data-retrieval-rules-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.glacier.-2012-06-01/data-retrieval-rule) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.invalid-parameter-value-exception/type (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.invalid-parameter-value-exception/code (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.invalid-parameter-value-exception/message (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.invalid-parameter-value-exception/type :portkey.aws.glacier.-2012-06-01.invalid-parameter-value-exception/code :portkey.aws.glacier.-2012-06-01.invalid-parameter-value-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.abort-vault-lock-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.abort-vault-lock-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/abort-vault-lock-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.abort-vault-lock-input/accountId :portkey.aws.glacier.-2012-06-01.abort-vault-lock-input/vaultName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.list-vaults-output/marker (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/list-vaults-output (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01/VaultList :portkey.aws.glacier.-2012-06-01.list-vaults-output/Marker] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.job-parameters/tier (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.job-parameters/type (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.job-parameters/archive-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.job-parameters/snstopic (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.job-parameters/format (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.job-parameters/description (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.job-parameters/inventory-retrieval-parameters (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/inventory-retrieval-job-input))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.job-parameters/retrieval-byte-range (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/job-parameters (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01.job-parameters/Tier :portkey.aws.glacier.-2012-06-01.job-parameters/Type :portkey.aws.glacier.-2012-06-01.job-parameters/ArchiveId :portkey.aws.glacier.-2012-06-01.job-parameters/SNSTopic :portkey.aws.glacier.-2012-06-01.job-parameters/Format :portkey.aws.glacier.-2012-06-01.job-parameters/Description :portkey.aws.glacier.-2012-06-01.job-parameters/InventoryRetrievalParameters :portkey.aws.glacier.-2012-06-01/SelectParameters :portkey.aws.glacier.-2012-06-01/OutputLocation :portkey.aws.glacier.-2012-06-01.job-parameters/RetrievalByteRange] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.csvinput/comments (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.csvinput/quote-escape-character (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.csvinput/record-delimiter (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.csvinput/field-delimiter (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.csvinput/quote-character (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/csvinput (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.glacier.-2012-06-01/FileHeaderInfo :portkey.aws.glacier.-2012-06-01.csvinput/Comments :portkey.aws.glacier.-2012-06-01.csvinput/QuoteEscapeCharacter :portkey.aws.glacier.-2012-06-01.csvinput/RecordDelimiter :portkey.aws.glacier.-2012-06-01.csvinput/FieldDelimiter :portkey.aws.glacier.-2012-06-01.csvinput/QuoteCharacter] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.set-vault-notifications-input/account-id (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.set-vault-notifications-input/vault-name (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/string))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01.set-vault-notifications-input/vault-notification-config (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/vault-notification-config))
(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/set-vault-notifications-input (portkey.aws/json-keys :req-un [:portkey.aws.glacier.-2012-06-01.set-vault-notifications-input/accountId :portkey.aws.glacier.-2012-06-01.set-vault-notifications-input/vaultName] :opt-un [:portkey.aws.glacier.-2012-06-01.set-vault-notifications-input/vaultNotificationConfig] :locations {}))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/quote-fields (clojure.spec.alpha/conformer (clojure.core/let [m__13959__auto__ {"ALWAYS" "ALWAYS", :always "ALWAYS", "ASNEEDED" "ASNEEDED", :asneeded "ASNEEDED"}] (clojure.core/fn [s__13960__auto__] (m__13959__auto__ s__13960__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/notification-event-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.glacier.-2012-06-01/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__13880__13881__auto__] (if (clojure.core/sequential? p1__13880__13881__auto__) p1__13880__13881__auto__ [p1__13880__13881__auto__])))))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/httpstatus (clojure.spec.alpha/and clojure.core/int?))

(clojure.spec.alpha/def :portkey.aws.glacier.-2012-06-01/date-time (clojure.spec.alpha/and clojure.core/string?))

(clojure.core/defn initiate-multipart-upload ([initiate-multipart-upload-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "POST" "/{accountId}/vaults/{vaultName}/multipart-uploads" initiate-multipart-upload-input :portkey.aws.glacier.-2012-06-01/initiate-multipart-upload-input {:payload nil, :move {}, :headers {"archiveDescription" ["x-amz-archive-description" nil], "partSize" ["x-amz-part-size" nil]}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 201 :portkey.aws.glacier.-2012-06-01/initiate-multipart-upload-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef initiate-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/initiate-multipart-upload-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/initiate-multipart-upload-output))

(clojure.core/defn describe-vault ([describe-vault-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults/{vaultName}" describe-vault-input :portkey.aws.glacier.-2012-06-01/describe-vault-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} nil :portkey.aws.glacier.-2012-06-01/describe-vault-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef describe-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/describe-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/describe-vault-output))

(clojure.core/defn initiate-job ([initiate-job-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "POST" "/{accountId}/vaults/{vaultName}/jobs" initiate-job-input :portkey.aws.glacier.-2012-06-01/initiate-job-input {:payload "jobParameters", :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 202 :portkey.aws.glacier.-2012-06-01/initiate-job-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "PolicyEnforcedException" :portkey.aws.glacier.-2012-06-01/policy-enforced-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "InsufficientCapacityException" :portkey.aws.glacier.-2012-06-01/insufficient-capacity-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef initiate-job :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/initiate-job-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/initiate-job-output))

(clojure.core/defn delete-vault-notifications ([delete-vault-notifications-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "DELETE" "/{accountId}/vaults/{vaultName}/notification-configuration" delete-vault-notifications-input :portkey.aws.glacier.-2012-06-01/delete-vault-notifications-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef delete-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/delete-vault-notifications-input) :ret clojure.core/true?)

(clojure.core/defn get-vault-notifications ([get-vault-notifications-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults/{vaultName}/notification-configuration" get-vault-notifications-input :portkey.aws.glacier.-2012-06-01/get-vault-notifications-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} nil :portkey.aws.glacier.-2012-06-01/get-vault-notifications-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/get-vault-notifications-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/get-vault-notifications-output))

(clojure.core/defn set-vault-notifications ([set-vault-notifications-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "PUT" "/{accountId}/vaults/{vaultName}/notification-configuration" set-vault-notifications-input :portkey.aws.glacier.-2012-06-01/set-vault-notifications-input {:payload "vaultNotificationConfig", :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef set-vault-notifications :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/set-vault-notifications-input) :ret clojure.core/true?)

(clojure.core/defn list-tags-for-vault ([list-tags-for-vault-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults/{vaultName}/tags" list-tags-for-vault-input :portkey.aws.glacier.-2012-06-01/list-tags-for-vault-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} nil :portkey.aws.glacier.-2012-06-01/list-tags-for-vault-output {"InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-tags-for-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/list-tags-for-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/list-tags-for-vault-output))

(clojure.core/defn list-multipart-uploads ([list-multipart-uploads-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults/{vaultName}/multipart-uploads" list-multipart-uploads-input :portkey.aws.glacier.-2012-06-01/list-multipart-uploads-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {"marker" "marker", "limit" "limit"}} nil :portkey.aws.glacier.-2012-06-01/list-multipart-uploads-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-multipart-uploads :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/list-multipart-uploads-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/list-multipart-uploads-output))

(clojure.core/defn delete-vault-access-policy ([delete-vault-access-policy-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "DELETE" "/{accountId}/vaults/{vaultName}/access-policy" delete-vault-access-policy-input :portkey.aws.glacier.-2012-06-01/delete-vault-access-policy-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef delete-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/delete-vault-access-policy-input) :ret clojure.core/true?)

(clojure.core/defn get-data-retrieval-policy ([get-data-retrieval-policy-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/policies/data-retrieval" get-data-retrieval-policy-input :portkey.aws.glacier.-2012-06-01/get-data-retrieval-policy-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId"}, :querystring {}} nil :portkey.aws.glacier.-2012-06-01/get-data-retrieval-policy-output {"InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-data-retrieval-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/get-data-retrieval-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/get-data-retrieval-policy-output))

(clojure.core/defn purchase-provisioned-capacity ([purchase-provisioned-capacity-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "POST" "/{accountId}/provisioned-capacity" purchase-provisioned-capacity-input :portkey.aws.glacier.-2012-06-01/purchase-provisioned-capacity-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId"}, :querystring {}} 201 :portkey.aws.glacier.-2012-06-01/purchase-provisioned-capacity-output {"InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "LimitExceededException" :portkey.aws.glacier.-2012-06-01/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef purchase-provisioned-capacity :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/purchase-provisioned-capacity-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/purchase-provisioned-capacity-output))

(clojure.core/defn delete-archive ([delete-archive-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "DELETE" "/{accountId}/vaults/{vaultName}/archives/{archiveId}" delete-archive-input :portkey.aws.glacier.-2012-06-01/delete-archive-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName", "archiveId" "archiveId"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef delete-archive :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/delete-archive-input) :ret clojure.core/true?)

(clojure.core/defn describe-job ([describe-job-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults/{vaultName}/jobs/{jobId}" describe-job-input :portkey.aws.glacier.-2012-06-01/describe-job-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName", "jobId" "jobId"}, :querystring {}} nil :portkey.aws.glacier.-2012-06-01/glacier-job-description {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef describe-job :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/describe-job-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/glacier-job-description))

(clojure.core/defn complete-multipart-upload ([complete-multipart-upload-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "POST" "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}" complete-multipart-upload-input :portkey.aws.glacier.-2012-06-01/complete-multipart-upload-input {:payload nil, :move {}, :headers {"archiveSize" ["x-amz-archive-size" nil], "checksum" ["x-amz-sha256-tree-hash" nil]}, :uri {"accountId" "accountId", "vaultName" "vaultName", "uploadId" "uploadId"}, :querystring {}} 201 :portkey.aws.glacier.-2012-06-01/archive-creation-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef complete-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/complete-multipart-upload-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/archive-creation-output))

(clojure.core/defn abort-multipart-upload ([abort-multipart-upload-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "DELETE" "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}" abort-multipart-upload-input :portkey.aws.glacier.-2012-06-01/abort-multipart-upload-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName", "uploadId" "uploadId"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef abort-multipart-upload :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/abort-multipart-upload-input) :ret clojure.core/true?)

(clojure.core/defn add-tags-to-vault ([add-tags-to-vault-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "POST" "/{accountId}/vaults/{vaultName}/tags?operation=add" add-tags-to-vault-input :portkey.aws.glacier.-2012-06-01/add-tags-to-vault-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "LimitExceededException" :portkey.aws.glacier.-2012-06-01/limit-exceeded-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef add-tags-to-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/add-tags-to-vault-input) :ret clojure.core/true?)

(clojure.core/defn initiate-vault-lock ([initiate-vault-lock-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "POST" "/{accountId}/vaults/{vaultName}/lock-policy" initiate-vault-lock-input :portkey.aws.glacier.-2012-06-01/initiate-vault-lock-input {:payload "policy", :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 201 :portkey.aws.glacier.-2012-06-01/initiate-vault-lock-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef initiate-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/initiate-vault-lock-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/initiate-vault-lock-output))

(clojure.core/defn delete-vault ([delete-vault-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "DELETE" "/{accountId}/vaults/{vaultName}" delete-vault-input :portkey.aws.glacier.-2012-06-01/delete-vault-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef delete-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/delete-vault-input) :ret clojure.core/true?)

(clojure.core/defn list-provisioned-capacity ([list-provisioned-capacity-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/provisioned-capacity" list-provisioned-capacity-input :portkey.aws.glacier.-2012-06-01/list-provisioned-capacity-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId"}, :querystring {}} nil :portkey.aws.glacier.-2012-06-01/list-provisioned-capacity-output {"InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-provisioned-capacity :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/list-provisioned-capacity-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/list-provisioned-capacity-output))

(clojure.core/defn get-vault-lock ([get-vault-lock-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults/{vaultName}/lock-policy" get-vault-lock-input :portkey.aws.glacier.-2012-06-01/get-vault-lock-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} nil :portkey.aws.glacier.-2012-06-01/get-vault-lock-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/get-vault-lock-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/get-vault-lock-output))

(clojure.core/defn list-vaults ([list-vaults-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults" list-vaults-input :portkey.aws.glacier.-2012-06-01/list-vaults-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId"}, :querystring {"marker" "marker", "limit" "limit"}} nil :portkey.aws.glacier.-2012-06-01/list-vaults-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-vaults :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/list-vaults-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/list-vaults-output))

(clojure.core/defn set-data-retrieval-policy ([set-data-retrieval-policy-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "PUT" "/{accountId}/policies/data-retrieval" set-data-retrieval-policy-input :portkey.aws.glacier.-2012-06-01/set-data-retrieval-policy-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId"}, :querystring {}} 204 nil {"InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef set-data-retrieval-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/set-data-retrieval-policy-input) :ret clojure.core/true?)

(clojure.core/defn get-job-output ([get-job-output-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults/{vaultName}/jobs/{jobId}/output" get-job-output-input :portkey.aws.glacier.-2012-06-01/get-job-output-input {:payload nil, :move {}, :headers {"range" ["Range" nil]}, :uri {"accountId" "accountId", "vaultName" "vaultName", "jobId" "jobId"}, :querystring {}} nil :portkey.aws.glacier.-2012-06-01/get-job-output-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-job-output :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/get-job-output-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/get-job-output-output))

(clojure.core/defn remove-tags-from-vault ([remove-tags-from-vault-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "POST" "/{accountId}/vaults/{vaultName}/tags?operation=remove" remove-tags-from-vault-input :portkey.aws.glacier.-2012-06-01/remove-tags-from-vault-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef remove-tags-from-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/remove-tags-from-vault-input) :ret clojure.core/true?)

(clojure.core/defn abort-vault-lock ([abort-vault-lock-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "DELETE" "/{accountId}/vaults/{vaultName}/lock-policy" abort-vault-lock-input :portkey.aws.glacier.-2012-06-01/abort-vault-lock-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef abort-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/abort-vault-lock-input) :ret clojure.core/true?)

(clojure.core/defn list-parts ([list-parts-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}" list-parts-input :portkey.aws.glacier.-2012-06-01/list-parts-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName", "uploadId" "uploadId"}, :querystring {"marker" "marker", "limit" "limit"}} nil :portkey.aws.glacier.-2012-06-01/list-parts-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-parts :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/list-parts-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/list-parts-output))

(clojure.core/defn set-vault-access-policy ([set-vault-access-policy-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "PUT" "/{accountId}/vaults/{vaultName}/access-policy" set-vault-access-policy-input :portkey.aws.glacier.-2012-06-01/set-vault-access-policy-input {:payload "policy", :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef set-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/set-vault-access-policy-input) :ret clojure.core/true?)

(clojure.core/defn create-vault ([create-vault-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "PUT" "/{accountId}/vaults/{vaultName}" create-vault-input :portkey.aws.glacier.-2012-06-01/create-vault-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} 201 :portkey.aws.glacier.-2012-06-01/create-vault-output {"InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception, "LimitExceededException" :portkey.aws.glacier.-2012-06-01/limit-exceeded-exception})))
(clojure.spec.alpha/fdef create-vault :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/create-vault-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/create-vault-output))

(clojure.core/defn complete-vault-lock ([complete-vault-lock-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "POST" "/{accountId}/vaults/{vaultName}/lock-policy/{lockId}" complete-vault-lock-input :portkey.aws.glacier.-2012-06-01/complete-vault-lock-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName", "lockId" "lockId"}, :querystring {}} 204 nil {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef complete-vault-lock :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/complete-vault-lock-input) :ret clojure.core/true?)

(clojure.core/defn upload-multipart-part ([upload-multipart-part-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "PUT" "/{accountId}/vaults/{vaultName}/multipart-uploads/{uploadId}" upload-multipart-part-input :portkey.aws.glacier.-2012-06-01/upload-multipart-part-input {:payload "body", :move {}, :headers {"checksum" ["x-amz-sha256-tree-hash" nil], "range" ["Content-Range" nil]}, :uri {"accountId" "accountId", "vaultName" "vaultName", "uploadId" "uploadId"}, :querystring {}} 204 :portkey.aws.glacier.-2012-06-01/upload-multipart-part-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "RequestTimeoutException" :portkey.aws.glacier.-2012-06-01/request-timeout-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef upload-multipart-part :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/upload-multipart-part-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/upload-multipart-part-output))

(clojure.core/defn upload-archive ([upload-archive-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "POST" "/{accountId}/vaults/{vaultName}/archives" upload-archive-input :portkey.aws.glacier.-2012-06-01/upload-archive-input {:payload "body", :move {}, :headers {"archiveDescription" ["x-amz-archive-description" nil], "checksum" ["x-amz-sha256-tree-hash" nil]}, :uri {"vaultName" "vaultName", "accountId" "accountId"}, :querystring {}} 201 :portkey.aws.glacier.-2012-06-01/archive-creation-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "RequestTimeoutException" :portkey.aws.glacier.-2012-06-01/request-timeout-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef upload-archive :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/upload-archive-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/archive-creation-output))

(clojure.core/defn get-vault-access-policy ([get-vault-access-policy-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults/{vaultName}/access-policy" get-vault-access-policy-input :portkey.aws.glacier.-2012-06-01/get-vault-access-policy-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {}} nil :portkey.aws.glacier.-2012-06-01/get-vault-access-policy-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef get-vault-access-policy :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/get-vault-access-policy-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/get-vault-access-policy-output))

(clojure.core/defn list-jobs ([list-jobs-input] (portkey.aws/-rest-json-call portkey.aws.glacier.-2012-06-01/endpoints "GET" "/{accountId}/vaults/{vaultName}/jobs" list-jobs-input :portkey.aws.glacier.-2012-06-01/list-jobs-input {:payload nil, :move {}, :headers {}, :uri {"accountId" "accountId", "vaultName" "vaultName"}, :querystring {"limit" "limit", "marker" "marker", "statuscode" "statuscode", "completed" "completed"}} nil :portkey.aws.glacier.-2012-06-01/list-jobs-output {"ResourceNotFoundException" :portkey.aws.glacier.-2012-06-01/resource-not-found-exception, "InvalidParameterValueException" :portkey.aws.glacier.-2012-06-01/invalid-parameter-value-exception, "MissingParameterValueException" :portkey.aws.glacier.-2012-06-01/missing-parameter-value-exception, "ServiceUnavailableException" :portkey.aws.glacier.-2012-06-01/service-unavailable-exception})))
(clojure.spec.alpha/fdef list-jobs :args (clojure.spec.alpha/tuple :portkey.aws.glacier.-2012-06-01/list-jobs-input) :ret (clojure.spec.alpha/and :portkey.aws.glacier.-2012-06-01/list-jobs-output))
