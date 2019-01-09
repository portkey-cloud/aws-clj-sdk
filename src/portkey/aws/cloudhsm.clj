(ns portkey.aws.cloudhsm (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "cloudhsm", :region "ap-northeast-1"},
    :ssl-common-name "cloudhsm.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudhsm.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudhsm", :region "eu-west-1"},
    :ssl-common-name "cloudhsm.eu-west-1.amazonaws.com",
    :endpoint "https://cloudhsm.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "cloudhsm", :region "us-east-2"},
    :ssl-common-name "cloudhsm.us-east-2.amazonaws.com",
    :endpoint "https://cloudhsm.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope {:service "cloudhsm", :region "ap-southeast-2"},
    :ssl-common-name "cloudhsm.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudhsm.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope {:service "cloudhsm", :region "ap-southeast-1"},
    :ssl-common-name "cloudhsm.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudhsm.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope {:service "cloudhsm", :region "ca-central-1"},
    :ssl-common-name "cloudhsm.ca-central-1.amazonaws.com",
    :endpoint "https://cloudhsm.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudhsm", :region "eu-central-1"},
    :ssl-common-name "cloudhsm.eu-central-1.amazonaws.com",
    :endpoint "https://cloudhsm.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope {:service "cloudhsm", :region "us-gov-west-1"},
    :ssl-common-name "cloudhsm.us-gov-west-1.amazonaws.com",
    :endpoint "https://cloudhsm.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudhsm", :region "us-west-2"},
    :ssl-common-name "cloudhsm.us-west-2.amazonaws.com",
    :endpoint "https://cloudhsm.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudhsm", :region "us-east-1"},
    :ssl-common-name "cloudhsm.us-east-1.amazonaws.com",
    :endpoint "https://cloudhsm.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudhsm", :region "us-west-1"},
    :ssl-common-name "cloudhsm.us-west-1.amazonaws.com",
    :endpoint "https://cloudhsm.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-hsm-serial-number)

(clojure.core/declare ser-client-label)

(clojure.core/declare ser-subnet-id)

(clojure.core/declare ser-external-id)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-iam-role-arn)

(clojure.core/declare ser-tag-list)

(clojure.core/declare ser-partition-serial-list)

(clojure.core/declare ser-ssh-key)

(clojure.core/declare ser-tag-key-list)

(clojure.core/declare ser-hsm-arn)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-client-version)

(clojure.core/declare ser-string)

(clojure.core/declare ser-subscription-type)

(clojure.core/declare ser-hapg-list)

(clojure.core/declare ser-label)

(clojure.core/declare ser-ip-address)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-hapg-arn)

(clojure.core/declare ser-partition-serial)

(clojure.core/declare ser-client-arn)

(clojure.core/declare ser-certificate)

(clojure.core/declare ser-certificate-fingerprint)

(clojure.core/declare ser-client-token)

(clojure.core/defn- ser-hsm-serial-number [input] #:http.request.field{:value input, :shape "HsmSerialNumber"})

(clojure.core/defn- ser-client-label [input] #:http.request.field{:value input, :shape "ClientLabel"})

(clojure.core/defn- ser-subnet-id [input] #:http.request.field{:value input, :shape "SubnetId"})

(clojure.core/defn- ser-external-id [input] #:http.request.field{:value input, :shape "ExternalId"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-iam-role-arn [input] #:http.request.field{:value input, :shape "IamRoleArn"})

(clojure.core/defn- ser-tag-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "TagList", :type "list"})

(clojure.core/defn- ser-partition-serial-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-partition-serial coll) #:http.request.field{:shape "PartitionSerial"}))) input), :shape "PartitionSerialList", :type "list"})

(clojure.core/defn- ser-ssh-key [input] #:http.request.field{:value input, :shape "SshKey"})

(clojure.core/defn- ser-tag-key-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeyList", :type "list"})

(clojure.core/defn- ser-hsm-arn [input] #:http.request.field{:value input, :shape "HsmArn"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-client-version [input] #:http.request.field{:value (clojure.core/get {"5.1" "5.1", :51 "5.1", "5.3" "5.3", :53 "5.3"} input), :shape "ClientVersion"})

(clojure.core/defn- ser-string [input] #:http.request.field{:value input, :shape "String"})

(clojure.core/defn- ser-subscription-type [input] #:http.request.field{:value (clojure.core/get {"PRODUCTION" "PRODUCTION", :production "PRODUCTION"} input), :shape "SubscriptionType"})

(clojure.core/defn- ser-hapg-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-hapg-arn coll) #:http.request.field{:shape "HapgArn"}))) input), :shape "HapgList", :type "list"})

(clojure.core/defn- ser-label [input] #:http.request.field{:value input, :shape "Label"})

(clojure.core/defn- ser-ip-address [input] #:http.request.field{:value input, :shape "IpAddress"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-hapg-arn [input] #:http.request.field{:value input, :shape "HapgArn"})

(clojure.core/defn- ser-partition-serial [input] #:http.request.field{:value input, :shape "PartitionSerial"})

(clojure.core/defn- ser-client-arn [input] #:http.request.field{:value input, :shape "ClientArn"})

(clojure.core/defn- ser-certificate [input] #:http.request.field{:value input, :shape "Certificate"})

(clojure.core/defn- ser-certificate-fingerprint [input] #:http.request.field{:value input, :shape "CertificateFingerprint"})

(clojure.core/defn- ser-client-token [input] #:http.request.field{:value input, :shape "ClientToken"})

(clojure.core/defn- req-describe-luna-client-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :client-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-arn (input :client-arn)) #:http.request.field{:name "ClientArn", :shape "ClientArn"})) (clojure.core/contains? input :certificate-fingerprint) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-certificate-fingerprint (input :certificate-fingerprint)) #:http.request.field{:name "CertificateFingerprint", :shape "CertificateFingerprint"}))))

(clojure.core/defn- req-modify-hapg-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hapg-arn (input :hapg-arn)) #:http.request.field{:name "HapgArn", :shape "HapgArn"})]} (clojure.core/contains? input :label) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-label (input :label)) #:http.request.field{:name "Label", :shape "Label"})) (clojure.core/contains? input :partition-serial-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-partition-serial-list (input :partition-serial-list)) #:http.request.field{:name "PartitionSerialList", :shape "PartitionSerialList"}))))

(clojure.core/defn- req-create-hapg-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-label (input :label)) #:http.request.field{:name "Label", :shape "Label"})]}))

(clojure.core/defn- req-create-luna-client-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-certificate (input :certificate)) #:http.request.field{:name "Certificate", :shape "Certificate"})]} (clojure.core/contains? input :label) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-label (input :label)) #:http.request.field{:name "Label", :shape "ClientLabel"}))))

(clojure.core/defn- req-list-tags-for-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"})]}))

(clojure.core/defn- req-delete-hapg-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hapg-arn (input :hapg-arn)) #:http.request.field{:name "HapgArn", :shape "HapgArn"})]}))

(clojure.core/defn- req-describe-hapg-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hapg-arn (input :hapg-arn)) #:http.request.field{:name "HapgArn", :shape "HapgArn"})]}))

(clojure.core/defn- req-describe-hsm-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :hsm-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hsm-arn (input :hsm-arn)) #:http.request.field{:name "HsmArn", :shape "HsmArn"})) (clojure.core/contains? input :hsm-serial-number) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hsm-serial-number (input :hsm-serial-number)) #:http.request.field{:name "HsmSerialNumber", :shape "HsmSerialNumber"}))))

(clojure.core/defn- req-list-hapgs-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-get-config-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-arn (input :client-arn)) #:http.request.field{:name "ClientArn", :shape "ClientArn"}) (clojure.core/into (ser-client-version (input :client-version)) #:http.request.field{:name "ClientVersion", :shape "ClientVersion"}) (clojure.core/into (ser-hapg-list (input :hapg-list)) #:http.request.field{:name "HapgList", :shape "HapgList"})]}))

(clojure.core/defn- req-remove-tags-from-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"}) (clojure.core/into (ser-tag-key-list (input :tag-key-list)) #:http.request.field{:name "TagKeyList", :shape "TagKeyList"})]}))

(clojure.core/defn- req-create-hsm-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "SubnetId", :location-name "SubnetId"}) (clojure.core/into (ser-ssh-key (input :ssh-key)) #:http.request.field{:name "SshKey", :shape "SshKey", :location-name "SshKey"}) (clojure.core/into (ser-iam-role-arn (input :iam-role-arn)) #:http.request.field{:name "IamRoleArn", :shape "IamRoleArn", :location-name "IamRoleArn"}) (clojure.core/into (ser-subscription-type (input :subscription-type)) #:http.request.field{:name "SubscriptionType", :shape "SubscriptionType", :location-name "SubscriptionType"})]} (clojure.core/contains? input :eni-ip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :eni-ip)) #:http.request.field{:name "EniIp", :shape "IpAddress", :location-name "EniIp"})) (clojure.core/contains? input :external-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-external-id (input :external-id)) #:http.request.field{:name "ExternalId", :shape "ExternalId", :location-name "ExternalId"})) (clojure.core/contains? input :client-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken", :location-name "ClientToken"})) (clojure.core/contains? input :syslog-ip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :syslog-ip)) #:http.request.field{:name "SyslogIp", :shape "IpAddress", :location-name "SyslogIp"}))))

(clojure.core/defn- req-delete-luna-client-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-arn (input :client-arn)) #:http.request.field{:name "ClientArn", :shape "ClientArn"})]}))

(clojure.core/defn- req-list-available-zones-request [input] (clojure.core/cond-> {}))

(clojure.core/defn- req-list-hsms-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-modify-hsm-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hsm-arn (input :hsm-arn)) #:http.request.field{:name "HsmArn", :shape "HsmArn", :location-name "HsmArn"})]} (clojure.core/contains? input :subnet-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-subnet-id (input :subnet-id)) #:http.request.field{:name "SubnetId", :shape "SubnetId", :location-name "SubnetId"})) (clojure.core/contains? input :eni-ip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :eni-ip)) #:http.request.field{:name "EniIp", :shape "IpAddress", :location-name "EniIp"})) (clojure.core/contains? input :iam-role-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-iam-role-arn (input :iam-role-arn)) #:http.request.field{:name "IamRoleArn", :shape "IamRoleArn", :location-name "IamRoleArn"})) (clojure.core/contains? input :external-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-external-id (input :external-id)) #:http.request.field{:name "ExternalId", :shape "ExternalId", :location-name "ExternalId"})) (clojure.core/contains? input :syslog-ip) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-ip-address (input :syslog-ip)) #:http.request.field{:name "SyslogIp", :shape "IpAddress", :location-name "SyslogIp"}))))

(clojure.core/defn- req-add-tags-to-resource-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-string (input :resource-arn)) #:http.request.field{:name "ResourceArn", :shape "String"}) (clojure.core/into (ser-tag-list (input :tag-list)) #:http.request.field{:name "TagList", :shape "TagList"})]}))

(clojure.core/defn- req-list-luna-clients-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-modify-luna-client-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-arn (input :client-arn)) #:http.request.field{:name "ClientArn", :shape "ClientArn"}) (clojure.core/into (ser-certificate (input :certificate)) #:http.request.field{:name "Certificate", :shape "Certificate"})]}))

(clojure.core/defn- req-delete-hsm-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-hsm-arn (input :hsm-arn)) #:http.request.field{:name "HsmArn", :shape "HsmArn", :location-name "HsmArn"})]}))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/describe-luna-client-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/client-arn :portkey.aws.cloudhsm/certificate-fingerprint]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/list-available-zones-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/az-list]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.list-hapgs-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/list-hapgs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/hapg-list] :opt-un [:portkey.aws.cloudhsm.list-hapgs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/modify-hapg-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/hapg-arn] :opt-un [:portkey.aws.cloudhsm/label :portkey.aws.cloudhsm/partition-serial-list]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.get-config-response/config-type (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.get-config-response/config-file (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.get-config-response/config-cred (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/get-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.get-config-response/config-type :portkey.aws.cloudhsm.get-config-response/config-file :portkey.aws.cloudhsm.get-config-response/config-cred]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/create-luna-client-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/client-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/hsm-serial-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\d{1,16}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/client-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]{2,64}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/tag-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.delete-luna-client-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/delete-luna-client-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.delete-luna-client-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/create-hapg-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/label] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"subnet-[0-9a-f]{8}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.create-luna-client-request/label (clojure.spec.alpha/and :portkey.aws.cloudhsm/client-label))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/create-luna-client-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/certificate] :opt-un [:portkey.aws.cloudhsm.create-luna-client-request/label]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.list-luna-clients-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/list-luna-clients-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/client-list] :opt-un [:portkey.aws.cloudhsm.list-luna-clients-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/software-version (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/subscription-end-date (clojure.spec.alpha/and :portkey.aws.cloudhsm/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/ssh-public-key (clojure.spec.alpha/and :portkey.aws.cloudhsm/ssh-key))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/server-cert-uri (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/availability-zone (clojure.spec.alpha/and :portkey.aws.cloudhsm/az))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm/hsm-status))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/status-details (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/ssh-key-last-updated (clojure.spec.alpha/and :portkey.aws.cloudhsm/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/partitions (clojure.spec.alpha/and :portkey.aws.cloudhsm/partition-list))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/eni-ip (clojure.spec.alpha/and :portkey.aws.cloudhsm/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/subscription-start-date (clojure.spec.alpha/and :portkey.aws.cloudhsm/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/vendor-name (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/server-cert-last-updated (clojure.spec.alpha/and :portkey.aws.cloudhsm/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/serial-number (clojure.spec.alpha/and :portkey.aws.cloudhsm/hsm-serial-number))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hsm-response/hsm-type (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/describe-hsm-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.describe-hsm-response/software-version :portkey.aws.cloudhsm.describe-hsm-response/subscription-end-date :portkey.aws.cloudhsm/subnet-id :portkey.aws.cloudhsm.describe-hsm-response/ssh-public-key :portkey.aws.cloudhsm.describe-hsm-response/server-cert-uri :portkey.aws.cloudhsm.describe-hsm-response/availability-zone :portkey.aws.cloudhsm.describe-hsm-response/status :portkey.aws.cloudhsm.describe-hsm-response/status-details :portkey.aws.cloudhsm.describe-hsm-response/ssh-key-last-updated :portkey.aws.cloudhsm/iam-role-arn :portkey.aws.cloudhsm/hsm-arn :portkey.aws.cloudhsm/vpc-id :portkey.aws.cloudhsm.describe-hsm-response/partitions :portkey.aws.cloudhsm/subscription-type :portkey.aws.cloudhsm.describe-hsm-response/eni-ip :portkey.aws.cloudhsm.describe-hsm-response/subscription-start-date :portkey.aws.cloudhsm.describe-hsm-response/vendor-name :portkey.aws.cloudhsm.describe-hsm-response/server-cert-last-updated :portkey.aws.cloudhsm.describe-hsm-response/serial-number :portkey.aws.cloudhsm.describe-hsm-response/hsm-type :portkey.aws.cloudhsm/eni-id]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/modify-hapg-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/hapg-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/external-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w :+=./-]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/delete-hapg-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/hapg-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/cloud-hsm-internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 1 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hapg-response/hsms-pending-registration (clojure.spec.alpha/and :portkey.aws.cloudhsm/hsm-list))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hapg-response/hapg-serial (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hapg-response/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsm/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hapg-response/hsms-pending-deletion (clojure.spec.alpha/and :portkey.aws.cloudhsm/hsm-list))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hapg-response/hsms-last-action-failed (clojure.spec.alpha/and :portkey.aws.cloudhsm/hsm-list))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-hapg-response/state (clojure.spec.alpha/and :portkey.aws.cloudhsm/cloud-hsm-object-state))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/describe-hapg-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.describe-hapg-response/hsms-pending-registration :portkey.aws.cloudhsm.describe-hapg-response/hapg-serial :portkey.aws.cloudhsm/partition-serial-list :portkey.aws.cloudhsm.describe-hapg-response/last-modified-timestamp :portkey.aws.cloudhsm.describe-hapg-response/hsms-pending-deletion :portkey.aws.cloudhsm.describe-hapg-response/hsms-last-action-failed :portkey.aws.cloudhsm/label :portkey.aws.cloudhsm.describe-hapg-response/state :portkey.aws.cloudhsm/hapg-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9+/]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/describe-hapg-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/hapg-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/create-hapg-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/hapg-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/describe-hsm-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/hsm-arn :portkey.aws.cloudhsm/hsm-serial-number]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/iam-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm/tag))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/hsm-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm/hsm-arn))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/partition-serial-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm/partition-serial))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/ssh-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9+/= ._:\\@-]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.list-hapgs-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/list-hapgs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.list-hapgs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/get-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/client-arn :portkey.aws.cloudhsm/client-version :portkey.aws.cloudhsm/hapg-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/hsm-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.cloud-hsm-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.cloud-hsm-service-exception/retryable (clojure.spec.alpha/and :portkey.aws.cloudhsm/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/cloud-hsm-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.cloud-hsm-service-exception/message :portkey.aws.cloudhsm.cloud-hsm-service-exception/retryable]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 0 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/partition-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}/partition-[0-9]{6,12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/client-version #{"5.1" :53 "5.3" :51})

(clojure.spec.alpha/def :portkey.aws.cloudhsm/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"vpc-[0-9a-f]{8}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.add-tags-to-resource-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/add-tags-to-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.add-tags-to-resource-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w :+=./\\-]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/partition-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm/partition-arn))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/subscription-type #{:production "PRODUCTION"})

(clojure.spec.alpha/def :portkey.aws.cloudhsm/modify-hsm-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/hsm-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/hapg-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm/hapg-arn))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/cloud-hsm-object-state #{:ready "UPDATING" "READY" :degraded :updating "DEGRADED"})

(clojure.spec.alpha/def :portkey.aws.cloudhsm/az-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm/az))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]{1,64}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/create-hsm-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/hsm-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.remove-tags-from-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/remove-tags-from-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.remove-tags-from-resource-request/resource-arn :portkey.aws.cloudhsm/tag-key-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.create-hsm-request/eni-ip (clojure.spec.alpha/and :portkey.aws.cloudhsm/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.create-hsm-request/syslog-ip (clojure.spec.alpha/and :portkey.aws.cloudhsm/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/create-hsm-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/subnet-id :portkey.aws.cloudhsm/ssh-key :portkey.aws.cloudhsm/iam-role-arn :portkey.aws.cloudhsm/subscription-type] :opt-un [:portkey.aws.cloudhsm.create-hsm-request/eni-ip :portkey.aws.cloudhsm/external-id :portkey.aws.cloudhsm/client-token :portkey.aws.cloudhsm.create-hsm-request/syslog-ip]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/ip-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.describe-luna-client-response/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsm/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/describe-luna-client-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/client-arn :portkey.aws.cloudhsm/certificate :portkey.aws.cloudhsm/certificate-fingerprint :portkey.aws.cloudhsm.describe-luna-client-response/last-modified-timestamp :portkey.aws.cloudhsm/label]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/timestamp (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\d*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.remove-tags-from-resource-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/remove-tags-from-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.remove-tags-from-resource-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/client-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm/client-arn))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/delete-luna-client-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/client-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.tag/key (clojure.spec.alpha/and :portkey.aws.cloudhsm/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.tag/value (clojure.spec.alpha/and :portkey.aws.cloudhsm/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.tag/key :portkey.aws.cloudhsm.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/list-available-zones-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/hapg-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.list-hsms-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/list-hsms-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.list-hsms-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.delete-hsm-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/delete-hsm-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.delete-hsm-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/partition-serial (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"\d{6,12}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/modify-luna-client-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/client-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/az (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\-]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.modify-hsm-request/eni-ip (clojure.spec.alpha/and :portkey.aws.cloudhsm/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.modify-hsm-request/syslog-ip (clojure.spec.alpha/and :portkey.aws.cloudhsm/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/modify-hsm-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/hsm-arn] :opt-un [:portkey.aws.cloudhsm/subnet-id :portkey.aws.cloudhsm.modify-hsm-request/eni-ip :portkey.aws.cloudhsm/iam-role-arn :portkey.aws.cloudhsm/external-id :portkey.aws.cloudhsm.modify-hsm-request/syslog-ip]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/client-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.add-tags-to-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/add-tags-to-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.add-tags-to-resource-request/resource-arn :portkey.aws.cloudhsm/tag-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/hsm-status #{:pending "UPDATING" "TERMINATED" "PENDING" :suspended :running :terminating :degraded :terminated :updating "DEGRADED" "TERMINATING" "SUSPENDED" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.cloudhsm/eni-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"eni-[0-9a-f]{8}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/certificate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27880__auto__] (clojure.core/<= 600 (clojure.core/count s__27880__auto__))) (clojure.core/fn [s__27881__auto__] (clojure.core/< (clojure.core/count s__27881__auto__) 2400)) (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[\w :+=./\n-]*" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.list-luna-clients-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/list-luna-clients-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.list-luna-clients-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/certificate-fingerprint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"([0-9a-fA-F][0-9a-fA-F]:){15}[0-9a-fA-F][0-9a-fA-F]" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.delete-hapg-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/delete-hapg-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.delete-hapg-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/modify-luna-client-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/client-arn :portkey.aws.cloudhsm/certificate] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/delete-hsm-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm/hsm-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27882__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]{1,64}" s__27882__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.list-hsms-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm/list-hsms-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm/hsm-list :portkey.aws.cloudhsm.list-hsms-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm/boolean clojure.core/boolean?)

(clojure.core/defn modify-hsm ([modify-hsm-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-modify-hsm-request modify-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/modify-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/modify-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyHsm", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef modify-hsm :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/modify-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/modify-hsm-response))

(clojure.core/defn create-hsm ([create-hsm-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-hsm-request create-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/create-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/create-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateHsm", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-hsm :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/create-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/create-hsm-response))

(clojure.core/defn modify-luna-client ([modify-luna-client-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-modify-luna-client-request modify-luna-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/modify-luna-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/modify-luna-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyLunaClient", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception}})))))
(clojure.spec.alpha/fdef modify-luna-client :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/modify-luna-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/modify-luna-client-response))

(clojure.core/defn list-hsms ([] (list-hsms {})) ([list-hsms-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-hsms-request list-hsms-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/list-hsms-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/list-hsms-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHsms", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-hsms :args (clojure.spec.alpha/? :portkey.aws.cloudhsm/list-hsms-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/list-hsms-response))

(clojure.core/defn create-luna-client ([create-luna-client-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-luna-client-request create-luna-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/create-luna-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/create-luna-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateLunaClient", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-luna-client :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/create-luna-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/create-luna-client-response))

(clojure.core/defn describe-hapg ([describe-hapg-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-hapg-request describe-hapg-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/describe-hapg-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/describe-hapg-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeHapg", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-hapg :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/describe-hapg-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/describe-hapg-response))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListTagsForResource", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/list-tags-for-resource-response))

(clojure.core/defn get-config ([get-config-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-get-config-request get-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/get-config-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/get-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "GetConfig", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-config :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/get-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/get-config-response))

(clojure.core/defn delete-hsm ([delete-hsm-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-hsm-request delete-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/delete-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/delete-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteHsm", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-hsm :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/delete-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/delete-hsm-response))

(clojure.core/defn create-hapg ([create-hapg-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-create-hapg-request create-hapg-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/create-hapg-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/create-hapg-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "CreateHapg", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-hapg :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/create-hapg-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/create-hapg-response))

(clojure.core/defn modify-hapg ([modify-hapg-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-modify-hapg-request modify-hapg-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/modify-hapg-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/modify-hapg-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ModifyHapg", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef modify-hapg :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/modify-hapg-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/modify-hapg-response))

(clojure.core/defn describe-luna-client ([] (describe-luna-client {})) ([describe-luna-client-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-luna-client-request describe-luna-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/describe-luna-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/describe-luna-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeLunaClient", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-luna-client :args (clojure.spec.alpha/? :portkey.aws.cloudhsm/describe-luna-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/describe-luna-client-response))

(clojure.core/defn delete-hapg ([delete-hapg-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-hapg-request delete-hapg-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/delete-hapg-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/delete-hapg-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteHapg", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-hapg :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/delete-hapg-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/delete-hapg-response))

(clojure.core/defn describe-hsm ([] (describe-hsm {})) ([describe-hsm-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-describe-hsm-request describe-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/describe-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/describe-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeHsm", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-hsm :args (clojure.spec.alpha/? :portkey.aws.cloudhsm/describe-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/describe-hsm-response))

(clojure.core/defn list-hapgs ([] (list-hapgs {})) ([list-hapgs-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-hapgs-request list-hapgs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/list-hapgs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/list-hapgs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListHapgs", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-hapgs :args (clojure.spec.alpha/? :portkey.aws.cloudhsm/list-hapgs-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/list-hapgs-response))

(clojure.core/defn list-available-zones ([] (list-available-zones {})) ([list-available-zones-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-available-zones-request list-available-zones-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/list-available-zones-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/list-available-zones-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListAvailableZones", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-available-zones :args (clojure.spec.alpha/? :portkey.aws.cloudhsm/list-available-zones-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/list-available-zones-response))

(clojure.core/defn remove-tags-from-resource ([remove-tags-from-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-remove-tags-from-resource-request remove-tags-from-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/remove-tags-from-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/remove-tags-from-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "RemoveTagsFromResource", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/remove-tags-from-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/remove-tags-from-resource-response))

(clojure.core/defn list-luna-clients ([] (list-luna-clients {})) ([list-luna-clients-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-list-luna-clients-request list-luna-clients-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/list-luna-clients-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/list-luna-clients-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "ListLunaClients", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-luna-clients :args (clojure.spec.alpha/? :portkey.aws.cloudhsm/list-luna-clients-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/list-luna-clients-response))

(clojure.core/defn add-tags-to-resource ([add-tags-to-resource-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-add-tags-to-resource-request add-tags-to-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/add-tags-to-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/add-tags-to-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "AddTagsToResource", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/add-tags-to-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/add-tags-to-resource-response))

(clojure.core/defn delete-luna-client ([delete-luna-client-requestinput] (clojure.core/let [request-function-result__28521__auto__ (req-delete-luna-client-request delete-luna-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28521__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm/delete-luna-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm/delete-luna-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteLunaClient", :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-luna-client :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm/delete-luna-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm/delete-luna-client-response))
