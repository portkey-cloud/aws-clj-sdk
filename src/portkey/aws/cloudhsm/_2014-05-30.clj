(ns portkey.aws.cloudhsm.-2014-05-30 (:require [portkey.aws]))

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

(clojure.core/declare deser-hsm-serial-number)

(clojure.core/declare deser-subnet-id)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-iam-role-arn)

(clojure.core/declare deser-tag-list)

(clojure.core/declare deser-hsm-list)

(clojure.core/declare deser-partition-serial-list)

(clojure.core/declare deser-ssh-key)

(clojure.core/declare deser-hsm-arn)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-partition-arn)

(clojure.core/declare deser-vpc-id)

(clojure.core/declare deser-string)

(clojure.core/declare deser-partition-list)

(clojure.core/declare deser-subscription-type)

(clojure.core/declare deser-hapg-list)

(clojure.core/declare deser-cloud-hsm-object-state)

(clojure.core/declare deser-az-list)

(clojure.core/declare deser-label)

(clojure.core/declare deser-ip-address)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-client-list)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-hapg-arn)

(clojure.core/declare deser-partition-serial)

(clojure.core/declare deser-az)

(clojure.core/declare deser-client-arn)

(clojure.core/declare deser-hsm-status)

(clojure.core/declare deser-eni-id)

(clojure.core/declare deser-certificate)

(clojure.core/declare deser-certificate-fingerprint)

(clojure.core/declare deser-boolean)

(clojure.core/defn- deser-hsm-serial-number [input] input)

(clojure.core/defn- deser-subnet-id [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-iam-role-arn [input] input)

(clojure.core/defn- deser-tag-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-hsm-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hsm-arn coll))) input))

(clojure.core/defn- deser-partition-serial-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-partition-serial coll))) input))

(clojure.core/defn- deser-ssh-key [input] input)

(clojure.core/defn- deser-hsm-arn [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-partition-arn [input] input)

(clojure.core/defn- deser-vpc-id [input] input)

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-partition-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-partition-arn coll))) input))

(clojure.core/defn- deser-subscription-type [input] (clojure.core/get {"PRODUCTION" :production} input))

(clojure.core/defn- deser-hapg-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hapg-arn coll))) input))

(clojure.core/defn- deser-cloud-hsm-object-state [input] (clojure.core/get {"READY" :ready, "UPDATING" :updating, "DEGRADED" :degraded} input))

(clojure.core/defn- deser-az-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-az coll))) input))

(clojure.core/defn- deser-label [input] input)

(clojure.core/defn- deser-ip-address [input] input)

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-client-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-client-arn coll))) input))

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-hapg-arn [input] input)

(clojure.core/defn- deser-partition-serial [input] input)

(clojure.core/defn- deser-az [input] input)

(clojure.core/defn- deser-client-arn [input] input)

(clojure.core/defn- deser-hsm-status [input] (clojure.core/get {"PENDING" :pending, "RUNNING" :running, "UPDATING" :updating, "SUSPENDED" :suspended, "TERMINATING" :terminating, "TERMINATED" :terminated, "DEGRADED" :degraded} input))

(clojure.core/defn- deser-eni-id [input] input)

(clojure.core/defn- deser-certificate [input] input)

(clojure.core/defn- deser-certificate-fingerprint [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- response-list-available-zones-response ([input] (response-list-available-zones-response nil input)) ([resultWrapper1477881 input] (clojure.core/let [rawinput1477880 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477882 {"AZList" (rawinput1477880 "AZList")}] (clojure.core/cond-> {} (letvar1477882 "AZList") (clojure.core/assoc :az-list (deser-az-list (clojure.core/get-in letvar1477882 ["AZList"])))))))

(clojure.core/defn- response-list-hapgs-response ([input] (response-list-hapgs-response nil input)) ([resultWrapper1477884 input] (clojure.core/let [rawinput1477883 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477885 {"HapgList" (rawinput1477883 "HapgList"), "NextToken" (rawinput1477883 "NextToken")}] (clojure.core/cond-> {:hapg-list (deser-hapg-list (clojure.core/get-in letvar1477885 ["HapgList"]))} (letvar1477885 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1477885 ["NextToken"])))))))

(clojure.core/defn- response-get-config-response ([input] (response-get-config-response nil input)) ([resultWrapper1477887 input] (clojure.core/let [rawinput1477886 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477888 {"ConfigType" (rawinput1477886 "ConfigType"), "ConfigFile" (rawinput1477886 "ConfigFile"), "ConfigCred" (rawinput1477886 "ConfigCred")}] (clojure.core/cond-> {} (letvar1477888 "ConfigType") (clojure.core/assoc :config-type (deser-string (clojure.core/get-in letvar1477888 ["ConfigType"]))) (letvar1477888 "ConfigFile") (clojure.core/assoc :config-file (deser-string (clojure.core/get-in letvar1477888 ["ConfigFile"]))) (letvar1477888 "ConfigCred") (clojure.core/assoc :config-cred (deser-string (clojure.core/get-in letvar1477888 ["ConfigCred"])))))))

(clojure.core/defn- response-create-luna-client-response ([input] (response-create-luna-client-response nil input)) ([resultWrapper1477890 input] (clojure.core/let [rawinput1477889 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477891 {"ClientArn" (rawinput1477889 "ClientArn")}] (clojure.core/cond-> {} (letvar1477891 "ClientArn") (clojure.core/assoc :client-arn (deser-client-arn (clojure.core/get-in letvar1477891 ["ClientArn"])))))))

(clojure.core/defn- response-invalid-request-exception ([input] (response-invalid-request-exception nil input)) ([resultWrapper1477893 input] (clojure.core/let [rawinput1477892 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477894 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-list-tags-for-resource-response ([input] (response-list-tags-for-resource-response nil input)) ([resultWrapper1477896 input] (clojure.core/let [rawinput1477895 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477897 {"TagList" (rawinput1477895 "TagList")}] (clojure.core/cond-> {:tag-list (deser-tag-list (clojure.core/get-in letvar1477897 ["TagList"]))}))))

(clojure.core/defn- response-delete-luna-client-response ([input] (response-delete-luna-client-response nil input)) ([resultWrapper1477899 input] (clojure.core/let [rawinput1477898 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477900 {"Status" (rawinput1477898 "Status")}] (clojure.core/cond-> {:status (deser-string (clojure.core/get-in letvar1477900 ["Status"]))}))))

(clojure.core/defn- response-list-luna-clients-response ([input] (response-list-luna-clients-response nil input)) ([resultWrapper1477902 input] (clojure.core/let [rawinput1477901 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477903 {"ClientList" (rawinput1477901 "ClientList"), "NextToken" (rawinput1477901 "NextToken")}] (clojure.core/cond-> {:client-list (deser-client-list (clojure.core/get-in letvar1477903 ["ClientList"]))} (letvar1477903 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1477903 ["NextToken"])))))))

(clojure.core/defn- response-describe-hsm-response ([input] (response-describe-hsm-response nil input)) ([resultWrapper1477905 input] (clojure.core/let [rawinput1477904 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477906 {"SoftwareVersion" (rawinput1477904 "SoftwareVersion"), "SubscriptionEndDate" (rawinput1477904 "SubscriptionEndDate"), "SubnetId" (rawinput1477904 "SubnetId"), "SshPublicKey" (rawinput1477904 "SshPublicKey"), "ServerCertUri" (rawinput1477904 "ServerCertUri"), "AvailabilityZone" (rawinput1477904 "AvailabilityZone"), "Status" (rawinput1477904 "Status"), "StatusDetails" (rawinput1477904 "StatusDetails"), "SshKeyLastUpdated" (rawinput1477904 "SshKeyLastUpdated"), "IamRoleArn" (rawinput1477904 "IamRoleArn"), "HsmArn" (rawinput1477904 "HsmArn"), "VpcId" (rawinput1477904 "VpcId"), "Partitions" (rawinput1477904 "Partitions"), "SubscriptionType" (rawinput1477904 "SubscriptionType"), "EniIp" (rawinput1477904 "EniIp"), "SubscriptionStartDate" (rawinput1477904 "SubscriptionStartDate"), "VendorName" (rawinput1477904 "VendorName"), "ServerCertLastUpdated" (rawinput1477904 "ServerCertLastUpdated"), "SerialNumber" (rawinput1477904 "SerialNumber"), "HsmType" (rawinput1477904 "HsmType"), "EniId" (rawinput1477904 "EniId")}] (clojure.core/cond-> {} (letvar1477906 "SoftwareVersion") (clojure.core/assoc :software-version (deser-string (clojure.core/get-in letvar1477906 ["SoftwareVersion"]))) (letvar1477906 "SubscriptionEndDate") (clojure.core/assoc :subscription-end-date (deser-timestamp (clojure.core/get-in letvar1477906 ["SubscriptionEndDate"]))) (letvar1477906 "SubnetId") (clojure.core/assoc :subnet-id (deser-subnet-id (clojure.core/get-in letvar1477906 ["SubnetId"]))) (letvar1477906 "SshPublicKey") (clojure.core/assoc :ssh-public-key (deser-ssh-key (clojure.core/get-in letvar1477906 ["SshPublicKey"]))) (letvar1477906 "ServerCertUri") (clojure.core/assoc :server-cert-uri (deser-string (clojure.core/get-in letvar1477906 ["ServerCertUri"]))) (letvar1477906 "AvailabilityZone") (clojure.core/assoc :availability-zone (deser-az (clojure.core/get-in letvar1477906 ["AvailabilityZone"]))) (letvar1477906 "Status") (clojure.core/assoc :status (deser-hsm-status (clojure.core/get-in letvar1477906 ["Status"]))) (letvar1477906 "StatusDetails") (clojure.core/assoc :status-details (deser-string (clojure.core/get-in letvar1477906 ["StatusDetails"]))) (letvar1477906 "SshKeyLastUpdated") (clojure.core/assoc :ssh-key-last-updated (deser-timestamp (clojure.core/get-in letvar1477906 ["SshKeyLastUpdated"]))) (letvar1477906 "IamRoleArn") (clojure.core/assoc :iam-role-arn (deser-iam-role-arn (clojure.core/get-in letvar1477906 ["IamRoleArn"]))) (letvar1477906 "HsmArn") (clojure.core/assoc :hsm-arn (deser-hsm-arn (clojure.core/get-in letvar1477906 ["HsmArn"]))) (letvar1477906 "VpcId") (clojure.core/assoc :vpc-id (deser-vpc-id (clojure.core/get-in letvar1477906 ["VpcId"]))) (letvar1477906 "Partitions") (clojure.core/assoc :partitions (deser-partition-list (clojure.core/get-in letvar1477906 ["Partitions"]))) (letvar1477906 "SubscriptionType") (clojure.core/assoc :subscription-type (deser-subscription-type (clojure.core/get-in letvar1477906 ["SubscriptionType"]))) (letvar1477906 "EniIp") (clojure.core/assoc :eni-ip (deser-ip-address (clojure.core/get-in letvar1477906 ["EniIp"]))) (letvar1477906 "SubscriptionStartDate") (clojure.core/assoc :subscription-start-date (deser-timestamp (clojure.core/get-in letvar1477906 ["SubscriptionStartDate"]))) (letvar1477906 "VendorName") (clojure.core/assoc :vendor-name (deser-string (clojure.core/get-in letvar1477906 ["VendorName"]))) (letvar1477906 "ServerCertLastUpdated") (clojure.core/assoc :server-cert-last-updated (deser-timestamp (clojure.core/get-in letvar1477906 ["ServerCertLastUpdated"]))) (letvar1477906 "SerialNumber") (clojure.core/assoc :serial-number (deser-hsm-serial-number (clojure.core/get-in letvar1477906 ["SerialNumber"]))) (letvar1477906 "HsmType") (clojure.core/assoc :hsm-type (deser-string (clojure.core/get-in letvar1477906 ["HsmType"]))) (letvar1477906 "EniId") (clojure.core/assoc :eni-id (deser-eni-id (clojure.core/get-in letvar1477906 ["EniId"])))))))

(clojure.core/defn- response-modify-hapg-response ([input] (response-modify-hapg-response nil input)) ([resultWrapper1477908 input] (clojure.core/let [rawinput1477907 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477909 {"HapgArn" (rawinput1477907 "HapgArn")}] (clojure.core/cond-> {} (letvar1477909 "HapgArn") (clojure.core/assoc :hapg-arn (deser-hapg-arn (clojure.core/get-in letvar1477909 ["HapgArn"])))))))

(clojure.core/defn- response-cloud-hsm-internal-exception ([input] (response-cloud-hsm-internal-exception nil input)) ([resultWrapper1477911 input] (clojure.core/let [rawinput1477910 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477912 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-describe-hapg-response ([input] (response-describe-hapg-response nil input)) ([resultWrapper1477914 input] (clojure.core/let [rawinput1477913 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477915 {"HsmsPendingRegistration" (rawinput1477913 "HsmsPendingRegistration"), "HapgSerial" (rawinput1477913 "HapgSerial"), "PartitionSerialList" (rawinput1477913 "PartitionSerialList"), "LastModifiedTimestamp" (rawinput1477913 "LastModifiedTimestamp"), "HsmsPendingDeletion" (rawinput1477913 "HsmsPendingDeletion"), "HsmsLastActionFailed" (rawinput1477913 "HsmsLastActionFailed"), "Label" (rawinput1477913 "Label"), "State" (rawinput1477913 "State"), "HapgArn" (rawinput1477913 "HapgArn")}] (clojure.core/cond-> {} (letvar1477915 "HsmsPendingRegistration") (clojure.core/assoc :hsms-pending-registration (deser-hsm-list (clojure.core/get-in letvar1477915 ["HsmsPendingRegistration"]))) (letvar1477915 "HapgSerial") (clojure.core/assoc :hapg-serial (deser-string (clojure.core/get-in letvar1477915 ["HapgSerial"]))) (letvar1477915 "PartitionSerialList") (clojure.core/assoc :partition-serial-list (deser-partition-serial-list (clojure.core/get-in letvar1477915 ["PartitionSerialList"]))) (letvar1477915 "LastModifiedTimestamp") (clojure.core/assoc :last-modified-timestamp (deser-timestamp (clojure.core/get-in letvar1477915 ["LastModifiedTimestamp"]))) (letvar1477915 "HsmsPendingDeletion") (clojure.core/assoc :hsms-pending-deletion (deser-hsm-list (clojure.core/get-in letvar1477915 ["HsmsPendingDeletion"]))) (letvar1477915 "HsmsLastActionFailed") (clojure.core/assoc :hsms-last-action-failed (deser-hsm-list (clojure.core/get-in letvar1477915 ["HsmsLastActionFailed"]))) (letvar1477915 "Label") (clojure.core/assoc :label (deser-label (clojure.core/get-in letvar1477915 ["Label"]))) (letvar1477915 "State") (clojure.core/assoc :state (deser-cloud-hsm-object-state (clojure.core/get-in letvar1477915 ["State"]))) (letvar1477915 "HapgArn") (clojure.core/assoc :hapg-arn (deser-hapg-arn (clojure.core/get-in letvar1477915 ["HapgArn"])))))))

(clojure.core/defn- response-create-hapg-response ([input] (response-create-hapg-response nil input)) ([resultWrapper1477917 input] (clojure.core/let [rawinput1477916 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477918 {"HapgArn" (rawinput1477916 "HapgArn")}] (clojure.core/cond-> {} (letvar1477918 "HapgArn") (clojure.core/assoc :hapg-arn (deser-hapg-arn (clojure.core/get-in letvar1477918 ["HapgArn"])))))))

(clojure.core/defn- response-cloud-hsm-service-exception ([input] (response-cloud-hsm-service-exception nil input)) ([resultWrapper1477920 input] (clojure.core/let [rawinput1477919 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477921 {"message" (rawinput1477919 "message"), "retryable" (rawinput1477919 "retryable")}] (clojure.core/cond-> {} (letvar1477921 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1477921 ["message"]))) (letvar1477921 "retryable") (clojure.core/assoc :retryable (deser-boolean (clojure.core/get-in letvar1477921 ["retryable"])))))))

(clojure.core/defn- response-add-tags-to-resource-response ([input] (response-add-tags-to-resource-response nil input)) ([resultWrapper1477923 input] (clojure.core/let [rawinput1477922 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477924 {"Status" (rawinput1477922 "Status")}] (clojure.core/cond-> {:status (deser-string (clojure.core/get-in letvar1477924 ["Status"]))}))))

(clojure.core/defn- response-modify-hsm-response ([input] (response-modify-hsm-response nil input)) ([resultWrapper1477926 input] (clojure.core/let [rawinput1477925 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477927 {"HsmArn" (rawinput1477925 "HsmArn")}] (clojure.core/cond-> {} (letvar1477927 "HsmArn") (clojure.core/assoc :hsm-arn (deser-hsm-arn (clojure.core/get-in letvar1477927 ["HsmArn"])))))))

(clojure.core/defn- response-create-hsm-response ([input] (response-create-hsm-response nil input)) ([resultWrapper1477929 input] (clojure.core/let [rawinput1477928 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477930 {"HsmArn" (rawinput1477928 "HsmArn")}] (clojure.core/cond-> {} (letvar1477930 "HsmArn") (clojure.core/assoc :hsm-arn (deser-hsm-arn (clojure.core/get-in letvar1477930 ["HsmArn"])))))))

(clojure.core/defn- response-describe-luna-client-response ([input] (response-describe-luna-client-response nil input)) ([resultWrapper1477932 input] (clojure.core/let [rawinput1477931 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477933 {"ClientArn" (rawinput1477931 "ClientArn"), "Certificate" (rawinput1477931 "Certificate"), "CertificateFingerprint" (rawinput1477931 "CertificateFingerprint"), "LastModifiedTimestamp" (rawinput1477931 "LastModifiedTimestamp"), "Label" (rawinput1477931 "Label")}] (clojure.core/cond-> {} (letvar1477933 "ClientArn") (clojure.core/assoc :client-arn (deser-client-arn (clojure.core/get-in letvar1477933 ["ClientArn"]))) (letvar1477933 "Certificate") (clojure.core/assoc :certificate (deser-certificate (clojure.core/get-in letvar1477933 ["Certificate"]))) (letvar1477933 "CertificateFingerprint") (clojure.core/assoc :certificate-fingerprint (deser-certificate-fingerprint (clojure.core/get-in letvar1477933 ["CertificateFingerprint"]))) (letvar1477933 "LastModifiedTimestamp") (clojure.core/assoc :last-modified-timestamp (deser-timestamp (clojure.core/get-in letvar1477933 ["LastModifiedTimestamp"]))) (letvar1477933 "Label") (clojure.core/assoc :label (deser-label (clojure.core/get-in letvar1477933 ["Label"])))))))

(clojure.core/defn- response-remove-tags-from-resource-response ([input] (response-remove-tags-from-resource-response nil input)) ([resultWrapper1477935 input] (clojure.core/let [rawinput1477934 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477936 {"Status" (rawinput1477934 "Status")}] (clojure.core/cond-> {:status (deser-string (clojure.core/get-in letvar1477936 ["Status"]))}))))

(clojure.core/defn- response-delete-hsm-response ([input] (response-delete-hsm-response nil input)) ([resultWrapper1477938 input] (clojure.core/let [rawinput1477937 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477939 {"Status" (rawinput1477937 "Status")}] (clojure.core/cond-> {:status (deser-string (clojure.core/get-in letvar1477939 ["Status"]))}))))

(clojure.core/defn- response-modify-luna-client-response ([input] (response-modify-luna-client-response nil input)) ([resultWrapper1477941 input] (clojure.core/let [rawinput1477940 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477942 {"ClientArn" (rawinput1477940 "ClientArn")}] (clojure.core/cond-> {} (letvar1477942 "ClientArn") (clojure.core/assoc :client-arn (deser-client-arn (clojure.core/get-in letvar1477942 ["ClientArn"])))))))

(clojure.core/defn- response-delete-hapg-response ([input] (response-delete-hapg-response nil input)) ([resultWrapper1477944 input] (clojure.core/let [rawinput1477943 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477945 {"Status" (rawinput1477943 "Status")}] (clojure.core/cond-> {:status (deser-string (clojure.core/get-in letvar1477945 ["Status"]))}))))

(clojure.core/defn- response-list-hsms-response ([input] (response-list-hsms-response nil input)) ([resultWrapper1477947 input] (clojure.core/let [rawinput1477946 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1477948 {"HsmList" (rawinput1477946 "HsmList"), "NextToken" (rawinput1477946 "NextToken")}] (clojure.core/cond-> {} (letvar1477948 "HsmList") (clojure.core/assoc :hsm-list (deser-hsm-list (clojure.core/get-in letvar1477948 ["HsmList"]))) (letvar1477948 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1477948 ["NextToken"])))))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/describe-luna-client-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/client-arn :portkey.aws.cloudhsm.-2014-05-30/certificate-fingerprint]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/list-available-zones-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/az-list]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.list-hapgs-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/list-hapgs-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/hapg-list] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.list-hapgs-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/modify-hapg-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/hapg-arn] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/label :portkey.aws.cloudhsm.-2014-05-30/partition-serial-list]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.get-config-response/config-type (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.get-config-response/config-file (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.get-config-response/config-cred (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/get-config-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.get-config-response/config-type :portkey.aws.cloudhsm.-2014-05-30.get-config-response/config-file :portkey.aws.cloudhsm.-2014-05-30.get-config-response/config-cred]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/create-luna-client-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/client-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/hsm-serial-number (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"\d{1,16}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/client-label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]{2,64}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/list-tags-for-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/tag-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.delete-luna-client-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/delete-luna-client-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30.delete-luna-client-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/create-hapg-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/label] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/subnet-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"subnet-[0-9a-f]{8}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.create-luna-client-request/label (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/client-label))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/create-luna-client-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/certificate] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.create-luna-client-request/label]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.list-tags-for-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/list-tags-for-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30.list-tags-for-resource-request/resource-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.list-luna-clients-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/list-luna-clients-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/client-list] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.list-luna-clients-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/software-version (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/subscription-end-date (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/ssh-public-key (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/ssh-key))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/server-cert-uri (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/availability-zone (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/az))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/hsm-status))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/status-details (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/ssh-key-last-updated (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/partitions (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/partition-list))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/eni-ip (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/subscription-start-date (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/vendor-name (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/server-cert-last-updated (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/serial-number (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/hsm-serial-number))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/hsm-type (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/describe-hsm-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/software-version :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/subscription-end-date :portkey.aws.cloudhsm.-2014-05-30/subnet-id :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/ssh-public-key :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/server-cert-uri :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/availability-zone :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/status :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/status-details :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/ssh-key-last-updated :portkey.aws.cloudhsm.-2014-05-30/iam-role-arn :portkey.aws.cloudhsm.-2014-05-30/hsm-arn :portkey.aws.cloudhsm.-2014-05-30/vpc-id :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/partitions :portkey.aws.cloudhsm.-2014-05-30/subscription-type :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/eni-ip :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/subscription-start-date :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/vendor-name :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/server-cert-last-updated :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/serial-number :portkey.aws.cloudhsm.-2014-05-30.describe-hsm-response/hsm-type :portkey.aws.cloudhsm.-2014-05-30/eni-id]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/modify-hapg-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/hapg-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/external-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\w :+=./-]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/delete-hapg-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/hapg-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/hsms-pending-registration (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/hsm-list))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/hapg-serial (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/hsms-pending-deletion (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/hsm-list))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/hsms-last-action-failed (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/hsm-list))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/state (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-object-state))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/describe-hapg-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/hsms-pending-registration :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/hapg-serial :portkey.aws.cloudhsm.-2014-05-30/partition-serial-list :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/last-modified-timestamp :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/hsms-pending-deletion :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/hsms-last-action-failed :portkey.aws.cloudhsm.-2014-05-30/label :portkey.aws.cloudhsm.-2014-05-30.describe-hapg-response/state :portkey.aws.cloudhsm.-2014-05-30/hapg-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9+/]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/describe-hapg-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/hapg-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/create-hapg-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/hapg-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/describe-hsm-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/hsm-arn :portkey.aws.cloudhsm.-2014-05-30/hsm-serial-number]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/iam-role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws(-iso)?:iam::[0-9]{12}:role/[a-zA-Z0-9_\+=,\.\-@]{1,64}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/tag-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm.-2014-05-30/tag))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/hsm-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm.-2014-05-30/hsm-arn))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/partition-serial-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm.-2014-05-30/partition-serial))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/ssh-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9+/= ._:\\@-]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.list-hapgs-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/list-hapgs-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.list-hapgs-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/get-config-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/client-arn :portkey.aws.cloudhsm.-2014-05-30/client-version :portkey.aws.cloudhsm.-2014-05-30/hapg-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/tag-key-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm.-2014-05-30/tag-key))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/hsm-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.cloud-hsm-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.cloud-hsm-service-exception/retryable (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.cloud-hsm-service-exception/message :portkey.aws.cloudhsm.-2014-05-30.cloud-hsm-service-exception/retryable]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 0 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/partition-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hsm-[0-9a-f]{8}/partition-[0-9]{6,12}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/client-version #{"5.1" :53 "5.3" :51})

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/vpc-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"vpc-[0-9a-f]{8}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.add-tags-to-resource-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/add-tags-to-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30.add-tags-to-resource-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\w :+=./\\-]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/partition-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm.-2014-05-30/partition-arn))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/subscription-type #{:production "PRODUCTION"})

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/modify-hsm-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/hsm-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/hapg-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm.-2014-05-30/hapg-arn))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-object-state #{:ready "UPDATING" "READY" :degraded :updating "DEGRADED"})

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/az-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm.-2014-05-30/az))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/label (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.-]{1,64}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/create-hsm-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/hsm-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.remove-tags-from-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/remove-tags-from-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30.remove-tags-from-resource-request/resource-arn :portkey.aws.cloudhsm.-2014-05-30/tag-key-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.create-hsm-request/eni-ip (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.create-hsm-request/syslog-ip (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/create-hsm-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/subnet-id :portkey.aws.cloudhsm.-2014-05-30/ssh-key :portkey.aws.cloudhsm.-2014-05-30/iam-role-arn :portkey.aws.cloudhsm.-2014-05-30/subscription-type] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.create-hsm-request/eni-ip :portkey.aws.cloudhsm.-2014-05-30/external-id :portkey.aws.cloudhsm.-2014-05-30/client-token :portkey.aws.cloudhsm.-2014-05-30.create-hsm-request/syslog-ip]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/ip-address (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.describe-luna-client-response/last-modified-timestamp (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/describe-luna-client-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/client-arn :portkey.aws.cloudhsm.-2014-05-30/certificate :portkey.aws.cloudhsm.-2014-05-30/certificate-fingerprint :portkey.aws.cloudhsm.-2014-05-30.describe-luna-client-response/last-modified-timestamp :portkey.aws.cloudhsm.-2014-05-30/label]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/timestamp (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"\d*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.remove-tags-from-resource-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/remove-tags-from-resource-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30.remove-tags-from-resource-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/client-list (clojure.spec.alpha/coll-of :portkey.aws.cloudhsm.-2014-05-30/client-arn))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/delete-luna-client-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/client-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.tag/key (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/tag-key))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.tag/value (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/tag-value))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30.tag/key :portkey.aws.cloudhsm.-2014-05-30.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/list-available-zones-request (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/hapg-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:hapg-[0-9a-f]{8}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.list-hsms-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/list-hsms-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.list-hsms-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.delete-hsm-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/delete-hsm-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30.delete-hsm-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/partition-serial (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"\d{6,12}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/modify-luna-client-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/client-arn]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/az (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9\-]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.modify-hsm-request/eni-ip (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.modify-hsm-request/syslog-ip (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/ip-address))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/modify-hsm-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/hsm-arn] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/subnet-id :portkey.aws.cloudhsm.-2014-05-30.modify-hsm-request/eni-ip :portkey.aws.cloudhsm.-2014-05-30/iam-role-arn :portkey.aws.cloudhsm.-2014-05-30/external-id :portkey.aws.cloudhsm.-2014-05-30.modify-hsm-request/syslog-ip]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/client-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws(-iso)?:cloudhsm:[a-zA-Z0-9\-]*:[0-9]{12}:client-[0-9a-f]{8}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.add-tags-to-resource-request/resource-arn (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/add-tags-to-resource-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30.add-tags-to-resource-request/resource-arn :portkey.aws.cloudhsm.-2014-05-30/tag-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/hsm-status #{:pending "UPDATING" "TERMINATED" "PENDING" :suspended :running :terminating :degraded :terminated :updating "DEGRADED" "TERMINATING" "SUSPENDED" "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/eni-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"eni-[0-9a-f]{8}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/certificate (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 600 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2400)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[\w :+=./\n-]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.list-luna-clients-request/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/list-luna-clients-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30.list-luna-clients-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/certificate-fingerprint (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"([0-9a-fA-F][0-9a-fA-F]:){15}[0-9a-fA-F][0-9a-fA-F]" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.delete-hapg-response/status (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/string))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/delete-hapg-response (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30.delete-hapg-response/status] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/modify-luna-client-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/client-arn :portkey.aws.cloudhsm.-2014-05-30/certificate] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/delete-hsm-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudhsm.-2014-05-30/hsm-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9]{1,64}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30.list-hsms-response/next-token (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/pagination-token))
(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/list-hsms-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudhsm.-2014-05-30/hsm-list :portkey.aws.cloudhsm.-2014-05-30.list-hsms-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cloudhsm.-2014-05-30/boolean clojure.core/boolean?)

(clojure.core/defn modify-hsm "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Modifies an HSM.\n This operation can result in the HSM being offline for up to 15 minutes while\nthe AWS CloudHSM service is reconfigured. If you are modifying a production HSM,\nyou should ensure that your AWS CloudHSM service is configured for high\navailability, and consider executing this operation during a maintenance window." ([modify-hsm-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-modify-hsm-request modify-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/modify-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/modify-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ModifyHsm", :http.request.configuration/output-deser-fn response-modify-hsm-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef modify-hsm :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/modify-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/modify-hsm-response))

(clojure.core/defn create-hsm "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Creates an uninitialized HSM instance.\n There is an upfront fee charged for each HSM instance that you create with the\nCreateHsm operation. If you accidentally provision an HSM and want to request a\nrefund, delete the instance using the DeleteHsm operation, go to the AWS Support\nCenter (https://console.aws.amazon.com/support/home), create a new case, and\nselect Account and Billing Support.\n It can take up to 20 minutes to create and provision an HSM. You can monitor\nthe status of the HSM with the DescribeHsm operation. The HSM is ready to be\ninitialized when the status changes to RUNNING." ([create-hsm-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-hsm-request create-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/create-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/create-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateHsm", :http.request.configuration/output-deser-fn response-create-hsm-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-hsm :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/create-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/create-hsm-response))

(clojure.core/defn modify-luna-client "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Modifies the certificate used by the client.\n This action can potentially start a workflow to install the new certificate on\nthe client's HSMs." ([modify-luna-client-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-modify-luna-client-request modify-luna-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/modify-luna-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/modify-luna-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ModifyLunaClient", :http.request.configuration/output-deser-fn response-modify-luna-client-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception}})))))
(clojure.spec.alpha/fdef modify-luna-client :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/modify-luna-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/modify-luna-client-response))

(clojure.core/defn list-hsms "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Retrieves the identifiers of all of the HSMs provisioned for the current\ncustomer.\n This operation supports pagination with the use of the NextToken member. If\nmore results are available, the NextToken member of the response contains a\ntoken that you pass in the next call to ListHsms to retrieve the next set of\nitems." ([] (list-hsms {})) ([list-hsms-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-hsms-request list-hsms-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/list-hsms-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/list-hsms-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListHsms", :http.request.configuration/output-deser-fn response-list-hsms-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-hsms :args (clojure.spec.alpha/? :portkey.aws.cloudhsm.-2014-05-30/list-hsms-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/list-hsms-response))

(clojure.core/defn create-luna-client "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Creates an HSM client." ([create-luna-client-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-luna-client-request create-luna-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/create-luna-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/create-luna-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateLunaClient", :http.request.configuration/output-deser-fn response-create-luna-client-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-luna-client :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/create-luna-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/create-luna-client-response))

(clojure.core/defn describe-hapg "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Retrieves information about a high-availability partition group." ([describe-hapg-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-hapg-request describe-hapg-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/describe-hapg-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/describe-hapg-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeHapg", :http.request.configuration/output-deser-fn response-describe-hapg-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-hapg :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/describe-hapg-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/describe-hapg-response))

(clojure.core/defn list-tags-for-resource "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Returns a list of all tags for the specified AWS CloudHSM resource." ([list-tags-for-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-tags-for-resource-request list-tags-for-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/list-tags-for-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/list-tags-for-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/list-tags-for-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/list-tags-for-resource-response))

(clojure.core/defn get-config "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Gets the configuration files necessary to connect to all high availability\npartition groups the client is associated with." ([get-config-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-config-request get-config-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/get-config-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/get-config-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetConfig", :http.request.configuration/output-deser-fn response-get-config-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef get-config :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/get-config-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/get-config-response))

(clojure.core/defn delete-hsm "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Deletes an HSM. After completion, this operation cannot be undone and your key\nmaterial cannot be recovered." ([delete-hsm-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-hsm-request delete-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/delete-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/delete-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteHsm", :http.request.configuration/output-deser-fn response-delete-hsm-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-hsm :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/delete-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/delete-hsm-response))

(clojure.core/defn create-hapg "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Creates a high-availability partition group. A high-availability partition\ngroup is a group of partitions that spans multiple physical HSMs." ([create-hapg-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-hapg-request create-hapg-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/create-hapg-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/create-hapg-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateHapg", :http.request.configuration/output-deser-fn response-create-hapg-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef create-hapg :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/create-hapg-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/create-hapg-response))

(clojure.core/defn modify-hapg "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Modifies an existing high-availability partition group." ([modify-hapg-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-modify-hapg-request modify-hapg-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/modify-hapg-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/modify-hapg-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ModifyHapg", :http.request.configuration/output-deser-fn response-modify-hapg-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef modify-hapg :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/modify-hapg-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/modify-hapg-response))

(clojure.core/defn describe-luna-client "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Retrieves information about an HSM client." ([] (describe-luna-client {})) ([describe-luna-client-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-luna-client-request describe-luna-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/describe-luna-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/describe-luna-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeLunaClient", :http.request.configuration/output-deser-fn response-describe-luna-client-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-luna-client :args (clojure.spec.alpha/? :portkey.aws.cloudhsm.-2014-05-30/describe-luna-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/describe-luna-client-response))

(clojure.core/defn delete-hapg "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Deletes a high-availability partition group." ([delete-hapg-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-hapg-request delete-hapg-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/delete-hapg-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/delete-hapg-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteHapg", :http.request.configuration/output-deser-fn response-delete-hapg-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-hapg :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/delete-hapg-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/delete-hapg-response))

(clojure.core/defn describe-hsm "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Retrieves information about an HSM. You can identify the HSM by its ARN or its\nserial number." ([] (describe-hsm {})) ([describe-hsm-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-hsm-request describe-hsm-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/describe-hsm-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/describe-hsm-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeHsm", :http.request.configuration/output-deser-fn response-describe-hsm-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef describe-hsm :args (clojure.spec.alpha/? :portkey.aws.cloudhsm.-2014-05-30/describe-hsm-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/describe-hsm-response))

(clojure.core/defn list-hapgs "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Lists the high-availability partition groups for the account.\n This operation supports pagination with the use of the NextToken member. If\nmore results are available, the NextToken member of the response contains a\ntoken that you pass in the next call to ListHapgs to retrieve the next set of\nitems." ([] (list-hapgs {})) ([list-hapgs-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-hapgs-request list-hapgs-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/list-hapgs-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/list-hapgs-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListHapgs", :http.request.configuration/output-deser-fn response-list-hapgs-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-hapgs :args (clojure.spec.alpha/? :portkey.aws.cloudhsm.-2014-05-30/list-hapgs-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/list-hapgs-response))

(clojure.core/defn list-available-zones "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Lists the Availability Zones that have available AWS CloudHSM capacity." ([] (list-available-zones {})) ([list-available-zones-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-available-zones-request list-available-zones-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/list-available-zones-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/list-available-zones-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListAvailableZones", :http.request.configuration/output-deser-fn response-list-available-zones-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-available-zones :args (clojure.spec.alpha/? :portkey.aws.cloudhsm.-2014-05-30/list-available-zones-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/list-available-zones-response))

(clojure.core/defn remove-tags-from-resource "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Removes one or more tags from the specified AWS CloudHSM resource.\n To remove a tag, specify only the tag key to remove (not the value). To\noverwrite the value for an existing tag, use AddTagsToResource." ([remove-tags-from-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-remove-tags-from-resource-request remove-tags-from-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/remove-tags-from-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/remove-tags-from-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTagsFromResource", :http.request.configuration/output-deser-fn response-remove-tags-from-resource-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/remove-tags-from-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/remove-tags-from-resource-response))

(clojure.core/defn list-luna-clients "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Lists all of the clients.\n This operation supports pagination with the use of the NextToken member. If\nmore results are available, the NextToken member of the response contains a\ntoken that you pass in the next call to ListLunaClients to retrieve the next set\nof items." ([] (list-luna-clients {})) ([list-luna-clients-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-luna-clients-request list-luna-clients-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/list-luna-clients-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/list-luna-clients-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLunaClients", :http.request.configuration/output-deser-fn response-list-luna-clients-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef list-luna-clients :args (clojure.spec.alpha/? :portkey.aws.cloudhsm.-2014-05-30/list-luna-clients-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/list-luna-clients-response))

(clojure.core/defn add-tags-to-resource "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Adds or overwrites one or more tags for the specified AWS CloudHSM resource.\n Each tag consists of a key and a value. Tag keys must be unique to each\nresource." ([add-tags-to-resource-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-add-tags-to-resource-request add-tags-to-resource-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/add-tags-to-resource-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/add-tags-to-resource-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTagsToResource", :http.request.configuration/output-deser-fn response-add-tags-to-resource-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/add-tags-to-resource-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/add-tags-to-resource-response))

(clojure.core/defn delete-luna-client "This is documentation for AWS CloudHSM Classic. For more information, see AWS\nCloudHSM Classic FAQs (http://aws.amazon.com/cloudhsm/faqs-classic/), the AWS\nCloudHSM Classic User Guide\n(http://docs.aws.amazon.com/cloudhsm/classic/userguide/), and the AWS CloudHSM\nClassic API Reference\n(http://docs.aws.amazon.com/cloudhsm/classic/APIReference/).\n For information about the current version of AWS CloudHSM, see AWS CloudHSM\n(http://aws.amazon.com/cloudhsm/), the AWS CloudHSM User Guide\n(http://docs.aws.amazon.com/cloudhsm/latest/userguide/), and the AWS CloudHSM\nAPI Reference (http://docs.aws.amazon.com/cloudhsm/latest/APIReference/).\n Deletes a client." ([delete-luna-client-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-luna-client-request delete-luna-client-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.cloudhsm.-2014-05-30/endpoints, :http.request.configuration/target-prefix "CloudHsmFrontendService", :http.request.spec/output-spec :portkey.aws.cloudhsm.-2014-05-30/delete-luna-client-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2014-05-30", :http.request.configuration/service-id "CloudHSM", :http.request.spec/input-spec :portkey.aws.cloudhsm.-2014-05-30/delete-luna-client-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteLunaClient", :http.request.configuration/output-deser-fn response-delete-luna-client-response, :http.request.spec/error-spec {"CloudHsmServiceException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-service-exception, "CloudHsmInternalException" :portkey.aws.cloudhsm.-2014-05-30/cloud-hsm-internal-exception, "InvalidRequestException" :portkey.aws.cloudhsm.-2014-05-30/invalid-request-exception}})))))
(clojure.spec.alpha/fdef delete-luna-client :args (clojure.spec.alpha/tuple :portkey.aws.cloudhsm.-2014-05-30/delete-luna-client-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudhsm.-2014-05-30/delete-luna-client-response))
