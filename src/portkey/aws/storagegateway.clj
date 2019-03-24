(ns portkey.aws.storagegateway (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "storagegateway", :region "ap-northeast-1"},
    :ssl-common-name "storagegateway.ap-northeast-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "storagegateway", :region "eu-west-1"},
    :ssl-common-name "storagegateway.eu-west-1.amazonaws.com",
    :endpoint "https://storagegateway.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "storagegateway", :region "us-east-2"},
    :ssl-common-name "storagegateway.us-east-2.amazonaws.com",
    :endpoint "https://storagegateway.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "storagegateway", :region "ap-southeast-2"},
    :ssl-common-name "storagegateway.ap-southeast-2.amazonaws.com",
    :endpoint "https://storagegateway.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "cn-north-1"
   {:credential-scope
    {:service "storagegateway", :region "cn-north-1"},
    :ssl-common-name "storagegateway.cn-north-1.amazonaws.com.cn",
    :endpoint "https://storagegateway.cn-north-1.amazonaws.com.cn",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "storagegateway", :region "sa-east-1"},
    :ssl-common-name "storagegateway.sa-east-1.amazonaws.com",
    :endpoint "https://storagegateway.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "storagegateway", :region "ap-southeast-1"},
    :ssl-common-name "storagegateway.ap-southeast-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "storagegateway", :region "ap-northeast-2"},
    :ssl-common-name "storagegateway.ap-northeast-2.amazonaws.com",
    :endpoint "https://storagegateway.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-west-3"
   {:credential-scope {:service "storagegateway", :region "eu-west-3"},
    :ssl-common-name "storagegateway.eu-west-3.amazonaws.com",
    :endpoint "https://storagegateway.eu-west-3.amazonaws.com",
    :signature-version :v4},
   "ca-central-1"
   {:credential-scope
    {:service "storagegateway", :region "ca-central-1"},
    :ssl-common-name "storagegateway.ca-central-1.amazonaws.com",
    :endpoint "https://storagegateway.ca-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope
    {:service "storagegateway", :region "eu-central-1"},
    :ssl-common-name "storagegateway.eu-central-1.amazonaws.com",
    :endpoint "https://storagegateway.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-2"
   {:credential-scope {:service "storagegateway", :region "eu-west-2"},
    :ssl-common-name "storagegateway.eu-west-2.amazonaws.com",
    :endpoint "https://storagegateway.eu-west-2.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "storagegateway", :region "us-gov-west-1"},
    :ssl-common-name "storagegateway.us-gov-west-1.amazonaws.com",
    :endpoint "https://storagegateway.us-gov-west-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "storagegateway", :region "us-west-2"},
    :ssl-common-name "storagegateway.us-west-2.amazonaws.com",
    :endpoint "https://storagegateway.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "storagegateway", :region "us-east-1"},
    :ssl-common-name "storagegateway.us-east-1.amazonaws.com",
    :endpoint "https://storagegateway.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "storagegateway", :region "us-west-1"},
    :ssl-common-name "storagegateway.us-west-1.amazonaws.com",
    :endpoint "https://storagegateway.us-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope
    {:service "storagegateway", :region "ap-south-1"},
    :ssl-common-name "storagegateway.ap-south-1.amazonaws.com",
    :endpoint "https://storagegateway.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "eu-north-1"
   {:credential-scope
    {:service "storagegateway", :region "eu-north-1"},
    :ssl-common-name "storagegateway.eu-north-1.amazonaws.com",
    :endpoint "https://storagegateway.eu-north-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-tag-keys)

(clojure.core/declare ser-minute-of-hour)

(clojure.core/declare serboolean)

(clojure.core/declare ser-positive-int-object)

(clojure.core/declare ser-disk-ids)

(clojure.core/declare ser-hosts)

(clojure.core/declare ser-bandwidth-type)

(clojure.core/declare ser-day-of-week)

(clojure.core/declare ser-location-arn)

(clojure.core/declare ser-bandwidth-download-rate-limit)

(clojure.core/declare ser-tape-barcode-prefix)

(clojure.core/declare ser-folder)

(clojure.core/declare ser-folder-list)

(clojure.core/declare serlong)

(clojure.core/declare ser-volume-ar-ns)

(clojure.core/declare ser-marker)

(clojure.core/declare ser-tag-key)

(clojure.core/declare ser-recurrence-in-hours)

(clojure.core/declare ser-tags)

(clojure.core/declare ser-network-interface-id)

(clojure.core/declare ser-target-arn)

(clojure.core/declare ser-object-acl)

(clojure.core/declare ser-hour-of-day)

(clojure.core/declare ser-disk-id)

(clojure.core/declare ser-medium-changer-type)

(clojure.core/declare ser-bandwidth-upload-rate-limit)

(clojure.core/declare ser-permission-id)

(clojure.core/declare ser-permission-mode)

(clojure.core/declare ser-snapshot-description)

(clojure.core/declare ser-kms-key)

(clojure.core/declare ser-role)

(clojure.core/declare ser-activation-key)

(clojure.core/declare ser-gateway-name)

(clojure.core/declare ser-volume-arn)

(clojure.core/declare ser-file-share-user-list)

(clojure.core/declare ser-file-share-arn-list)

(clojure.core/declare ser-description)

(clojure.core/declare ser-tag-value)

(clojure.core/declare ser-ipv-4-address-cidr)

(clojure.core/declare ser-device-type)

(clojure.core/declare ser-tape-arn)

(clojure.core/declare ser-vtl-device-ar-ns)

(clojure.core/declare ser-iqn-name)

(clojure.core/declare ser-tape-drive-type)

(clojure.core/declare ser-num-tapes-to-create)

(clojure.core/declare ser-tape-barcode)

(clojure.core/declare ser-chap-secret)

(clojure.core/declare ser-authentication)

(clojure.core/declare ser-region-id)

(clojure.core/declare ser-tape-ar-ns)

(clojure.core/declare ser-target-name)

(clojure.core/declare ser-local-console-password)

(clojure.core/declare ser-tag)

(clojure.core/declare ser-vtl-device-arn)

(clojure.core/declare ser-file-share-client-list)

(clojure.core/declare ser-domain-name)

(clojure.core/declare ser-gateway-type)

(clojure.core/declare ser-storage-class)

(clojure.core/declare ser-file-share-arn)

(clojure.core/declare ser-gateway-timezone)

(clojure.core/declare ser-file-share-user)

(clojure.core/declare ser-domain-user-password)

(clojure.core/declare ser-resource-arn)

(clojure.core/declare ser-organizational-unit)

(clojure.core/declare ser-gateway-arn)

(clojure.core/declare ser-smb-guest-password)

(clojure.core/declare ser-nfs-file-share-defaults)

(clojure.core/declare ser-host)

(clojure.core/declare ser-client-token)

(clojure.core/declare ser-domain-user-name)

(clojure.core/declare ser-snapshot-id)

(clojure.core/declare ser-tape-size)

(clojure.core/declare ser-boolean)

(clojure.core/declare ser-squash)

(clojure.core/defn- ser-tag-keys [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag-key coll) #:http.request.field{:shape "TagKey"}))) input), :shape "TagKeys", :type "list"})

(clojure.core/defn- ser-minute-of-hour [input] #:http.request.field{:value input, :shape "MinuteOfHour"})

(clojure.core/defn- serboolean [input] #:http.request.field{:value input, :shape "boolean"})

(clojure.core/defn- ser-positive-int-object [input] #:http.request.field{:value input, :shape "PositiveIntObject"})

(clojure.core/defn- ser-disk-ids [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-disk-id coll) #:http.request.field{:shape "DiskId"}))) input), :shape "DiskIds", :type "list"})

(clojure.core/defn- ser-hosts [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-host coll) #:http.request.field{:shape "Host"}))) input), :shape "Hosts", :type "list"})

(clojure.core/defn- ser-bandwidth-type [input] #:http.request.field{:value input, :shape "BandwidthType"})

(clojure.core/defn- ser-day-of-week [input] #:http.request.field{:value input, :shape "DayOfWeek"})

(clojure.core/defn- ser-location-arn [input] #:http.request.field{:value input, :shape "LocationARN"})

(clojure.core/defn- ser-bandwidth-download-rate-limit [input] #:http.request.field{:value input, :shape "BandwidthDownloadRateLimit"})

(clojure.core/defn- ser-tape-barcode-prefix [input] #:http.request.field{:value input, :shape "TapeBarcodePrefix"})

(clojure.core/defn- ser-folder [input] #:http.request.field{:value input, :shape "Folder"})

(clojure.core/defn- ser-folder-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-folder coll) #:http.request.field{:shape "Folder"}))) input), :shape "FolderList", :type "list", :max 50, :min 1})

(clojure.core/defn- serlong [input] #:http.request.field{:value input, :shape "long"})

(clojure.core/defn- ser-volume-ar-ns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-volume-arn coll) #:http.request.field{:shape "VolumeARN"}))) input), :shape "VolumeARNs", :type "list"})

(clojure.core/defn- ser-marker [input] #:http.request.field{:value input, :shape "Marker"})

(clojure.core/defn- ser-tag-key [input] #:http.request.field{:value input, :shape "TagKey"})

(clojure.core/defn- ser-recurrence-in-hours [input] #:http.request.field{:value input, :shape "RecurrenceInHours"})

(clojure.core/defn- ser-tags [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tag coll) #:http.request.field{:shape "Tag"}))) input), :shape "Tags", :type "list"})

(clojure.core/defn- ser-network-interface-id [input] #:http.request.field{:value input, :shape "NetworkInterfaceId"})

(clojure.core/defn- ser-target-arn [input] #:http.request.field{:value input, :shape "TargetARN"})

(clojure.core/defn- ser-object-acl [input] #:http.request.field{:value (clojure.core/get {"authenticated-read" "authenticated-read", :bucketownerfullcontrol "bucket-owner-full-control", "public-read-write" "public-read-write", :private "private", "bucket-owner-full-control" "bucket-owner-full-control", "private" "private", :bucketownerread "bucket-owner-read", :publicread "public-read", "aws-exec-read" "aws-exec-read", :publicreadwrite "public-read-write", :awsexecread "aws-exec-read", "bucket-owner-read" "bucket-owner-read", "public-read" "public-read", :authenticatedread "authenticated-read"} input), :shape "ObjectACL"})

(clojure.core/defn- ser-hour-of-day [input] #:http.request.field{:value input, :shape "HourOfDay"})

(clojure.core/defn- ser-disk-id [input] #:http.request.field{:value input, :shape "DiskId"})

(clojure.core/defn- ser-medium-changer-type [input] #:http.request.field{:value input, :shape "MediumChangerType"})

(clojure.core/defn- ser-bandwidth-upload-rate-limit [input] #:http.request.field{:value input, :shape "BandwidthUploadRateLimit"})

(clojure.core/defn- ser-permission-id [input] #:http.request.field{:value input, :shape "PermissionId"})

(clojure.core/defn- ser-permission-mode [input] #:http.request.field{:value input, :shape "PermissionMode"})

(clojure.core/defn- ser-snapshot-description [input] #:http.request.field{:value input, :shape "SnapshotDescription"})

(clojure.core/defn- ser-kms-key [input] #:http.request.field{:value input, :shape "KMSKey"})

(clojure.core/defn- ser-role [input] #:http.request.field{:value input, :shape "Role"})

(clojure.core/defn- ser-activation-key [input] #:http.request.field{:value input, :shape "ActivationKey"})

(clojure.core/defn- ser-gateway-name [input] #:http.request.field{:value input, :shape "GatewayName"})

(clojure.core/defn- ser-volume-arn [input] #:http.request.field{:value input, :shape "VolumeARN"})

(clojure.core/defn- ser-file-share-user-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-file-share-user coll) #:http.request.field{:shape "FileShareUser"}))) input), :shape "FileShareUserList", :type "list", :max 100, :min 0})

(clojure.core/defn- ser-file-share-arn-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-file-share-arn coll) #:http.request.field{:shape "FileShareARN"}))) input), :shape "FileShareARNList", :type "list", :max 10, :min 1})

(clojure.core/defn- ser-description [input] #:http.request.field{:value input, :shape "Description"})

(clojure.core/defn- ser-tag-value [input] #:http.request.field{:value input, :shape "TagValue"})

(clojure.core/defn- ser-ipv-4-address-cidr [input] #:http.request.field{:value input, :shape "IPV4AddressCIDR"})

(clojure.core/defn- ser-device-type [input] #:http.request.field{:value input, :shape "DeviceType"})

(clojure.core/defn- ser-tape-arn [input] #:http.request.field{:value input, :shape "TapeARN"})

(clojure.core/defn- ser-vtl-device-ar-ns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-vtl-device-arn coll) #:http.request.field{:shape "VTLDeviceARN"}))) input), :shape "VTLDeviceARNs", :type "list"})

(clojure.core/defn- ser-iqn-name [input] #:http.request.field{:value input, :shape "IqnName"})

(clojure.core/defn- ser-tape-drive-type [input] #:http.request.field{:value input, :shape "TapeDriveType"})

(clojure.core/defn- ser-num-tapes-to-create [input] #:http.request.field{:value input, :shape "NumTapesToCreate"})

(clojure.core/defn- ser-tape-barcode [input] #:http.request.field{:value input, :shape "TapeBarcode"})

(clojure.core/defn- ser-chap-secret [input] #:http.request.field{:value input, :shape "ChapSecret"})

(clojure.core/defn- ser-authentication [input] #:http.request.field{:value input, :shape "Authentication"})

(clojure.core/defn- ser-region-id [input] #:http.request.field{:value input, :shape "RegionId"})

(clojure.core/defn- ser-tape-ar-ns [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-tape-arn coll) #:http.request.field{:shape "TapeARN"}))) input), :shape "TapeARNs", :type "list"})

(clojure.core/defn- ser-target-name [input] #:http.request.field{:value input, :shape "TargetName"})

(clojure.core/defn- ser-local-console-password [input] #:http.request.field{:value input, :shape "LocalConsolePassword"})

(clojure.core/defn- ser-tag [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-tag-key (:key input)) #:http.request.field{:name "Key", :shape "TagKey"}) (clojure.core/into (ser-tag-value (:value input)) #:http.request.field{:name "Value", :shape "TagValue"})], :shape "Tag", :type "structure"}))

(clojure.core/defn- ser-vtl-device-arn [input] #:http.request.field{:value input, :shape "VTLDeviceARN"})

(clojure.core/defn- ser-file-share-client-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-ipv-4-address-cidr coll) #:http.request.field{:shape "IPV4AddressCIDR"}))) input), :shape "FileShareClientList", :type "list", :max 100, :min 1})

(clojure.core/defn- ser-domain-name [input] #:http.request.field{:value input, :shape "DomainName"})

(clojure.core/defn- ser-gateway-type [input] #:http.request.field{:value input, :shape "GatewayType"})

(clojure.core/defn- ser-storage-class [input] #:http.request.field{:value input, :shape "StorageClass"})

(clojure.core/defn- ser-file-share-arn [input] #:http.request.field{:value input, :shape "FileShareARN"})

(clojure.core/defn- ser-gateway-timezone [input] #:http.request.field{:value input, :shape "GatewayTimezone"})

(clojure.core/defn- ser-file-share-user [input] #:http.request.field{:value input, :shape "FileShareUser"})

(clojure.core/defn- ser-domain-user-password [input] #:http.request.field{:value input, :shape "DomainUserPassword"})

(clojure.core/defn- ser-resource-arn [input] #:http.request.field{:value input, :shape "ResourceARN"})

(clojure.core/defn- ser-organizational-unit [input] #:http.request.field{:value input, :shape "OrganizationalUnit"})

(clojure.core/defn- ser-gateway-arn [input] #:http.request.field{:value input, :shape "GatewayARN"})

(clojure.core/defn- ser-smb-guest-password [input] #:http.request.field{:value input, :shape "SMBGuestPassword"})

(clojure.core/defn- ser-nfs-file-share-defaults [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "NFSFileShareDefaults", :type "structure"} (clojure.core/contains? input :file-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-permission-mode (input :file-mode)) #:http.request.field{:name "FileMode", :shape "PermissionMode"})) (clojure.core/contains? input :directory-mode) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-permission-mode (input :directory-mode)) #:http.request.field{:name "DirectoryMode", :shape "PermissionMode"})) (clojure.core/contains? input :group-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-permission-id (input :group-id)) #:http.request.field{:name "GroupId", :shape "PermissionId"})) (clojure.core/contains? input :owner-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-permission-id (input :owner-id)) #:http.request.field{:name "OwnerId", :shape "PermissionId"}))))

(clojure.core/defn- ser-host [input] #:http.request.field{:value input, :shape "Host"})

(clojure.core/defn- ser-client-token [input] #:http.request.field{:value input, :shape "ClientToken"})

(clojure.core/defn- ser-domain-user-name [input] #:http.request.field{:value input, :shape "DomainUserName"})

(clojure.core/defn- ser-snapshot-id [input] #:http.request.field{:value input, :shape "SnapshotId"})

(clojure.core/defn- ser-tape-size [input] #:http.request.field{:value input, :shape "TapeSize"})

(clojure.core/defn- ser-boolean [input] #:http.request.field{:value input, :shape "Boolean"})

(clojure.core/defn- ser-squash [input] #:http.request.field{:value input, :shape "Squash"})

(clojure.core/defn- req-list-volume-recovery-points-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-cancel-retrieval-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-tape-arn (input :tape-arn)) #:http.request.field{:name "TapeARN", :shape "TapeARN"})]}))

(clojure.core/defn- req-describe-vtl-devices-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]} (clojure.core/contains? input :vtl-device-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-vtl-device-ar-ns (input :vtl-device-ar-ns)) #:http.request.field{:name "VTLDeviceARNs", :shape "VTLDeviceARNs"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-int-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntObject"}))))

(clojure.core/defn- req-activate-gateway-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-activation-key (input :activation-key)) #:http.request.field{:name "ActivationKey", :shape "ActivationKey"}) (clojure.core/into (ser-gateway-name (input :gateway-name)) #:http.request.field{:name "GatewayName", :shape "GatewayName"}) (clojure.core/into (ser-gateway-timezone (input :gateway-timezone)) #:http.request.field{:name "GatewayTimezone", :shape "GatewayTimezone"}) (clojure.core/into (ser-region-id (input :gateway-region)) #:http.request.field{:name "GatewayRegion", :shape "RegionId"})]} (clojure.core/contains? input :gateway-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-gateway-type (input :gateway-type)) #:http.request.field{:name "GatewayType", :shape "GatewayType"})) (clojure.core/contains? input :tape-drive-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tape-drive-type (input :tape-drive-type)) #:http.request.field{:name "TapeDriveType", :shape "TapeDriveType"})) (clojure.core/contains? input :medium-changer-type) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-medium-changer-type (input :medium-changer-type)) #:http.request.field{:name "MediumChangerType", :shape "MediumChangerType"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"}))))

(clojure.core/defn- req-describe-bandwidth-rate-limit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-describe-upload-buffer-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-start-gateway-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-list-tapes-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :tape-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tape-ar-ns (input :tape-ar-ns)) #:http.request.field{:name "TapeARNs", :shape "TapeARNs"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-int-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntObject"}))))

(clojure.core/defn- req-update-chap-credentials-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-arn (input :target-arn)) #:http.request.field{:name "TargetARN", :shape "TargetARN"}) (clojure.core/into (ser-chap-secret (input :secret-to-authenticate-initiator)) #:http.request.field{:name "SecretToAuthenticateInitiator", :shape "ChapSecret"}) (clojure.core/into (ser-iqn-name (input :initiator-name)) #:http.request.field{:name "InitiatorName", :shape "IqnName"})]} (clojure.core/contains? input :secret-to-authenticate-target) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-chap-secret (input :secret-to-authenticate-target)) #:http.request.field{:name "SecretToAuthenticateTarget", :shape "ChapSecret"}))))

(clojure.core/defn- req-delete-tape-archive-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tape-arn (input :tape-arn)) #:http.request.field{:name "TapeARN", :shape "TapeARN"})]}))

(clojure.core/defn- req-update-bandwidth-rate-limit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]} (clojure.core/contains? input :average-upload-rate-limit-in-bits-per-sec) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bandwidth-upload-rate-limit (input :average-upload-rate-limit-in-bits-per-sec)) #:http.request.field{:name "AverageUploadRateLimitInBitsPerSec", :shape "BandwidthUploadRateLimit"})) (clojure.core/contains? input :average-download-rate-limit-in-bits-per-sec) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-bandwidth-download-rate-limit (input :average-download-rate-limit-in-bits-per-sec)) #:http.request.field{:name "AverageDownloadRateLimitInBitsPerSec", :shape "BandwidthDownloadRateLimit"}))))

(clojure.core/defn- req-list-local-disks-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-update-gateway-software-now-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-create-nfs-file-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken"}) (clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-role (input :role)) #:http.request.field{:name "Role", :shape "Role"}) (clojure.core/into (ser-location-arn (input :location-arn)) #:http.request.field{:name "LocationARN", :shape "LocationARN"})]} (clojure.core/contains? input :requester-pays) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :requester-pays)) #:http.request.field{:name "RequesterPays", :shape "Boolean"})) (clojure.core/contains? input :guess-mime-type-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :guess-mime-type-enabled)) #:http.request.field{:name "GuessMIMETypeEnabled", :shape "Boolean"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :object-acl) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-acl (input :object-acl)) #:http.request.field{:name "ObjectACL", :shape "ObjectACL"})) (clojure.core/contains? input :default-storage-class) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :default-storage-class)) #:http.request.field{:name "DefaultStorageClass", :shape "StorageClass"})) (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key (input :kms-key)) #:http.request.field{:name "KMSKey", :shape "KMSKey"})) (clojure.core/contains? input :kms-encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :kms-encrypted)) #:http.request.field{:name "KMSEncrypted", :shape "Boolean"})) (clojure.core/contains? input :read-only) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :read-only)) #:http.request.field{:name "ReadOnly", :shape "Boolean"})) (clojure.core/contains? input :client-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-share-client-list (input :client-list)) #:http.request.field{:name "ClientList", :shape "FileShareClientList"})) (clojure.core/contains? input :nfs-file-share-defaults) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nfs-file-share-defaults (input :nfs-file-share-defaults)) #:http.request.field{:name "NFSFileShareDefaults", :shape "NFSFileShareDefaults"})) (clojure.core/contains? input :squash) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-squash (input :squash)) #:http.request.field{:name "Squash", :shape "Squash"}))))

(clojure.core/defn- req-delete-volume-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-volume-arn (input :volume-arn)) #:http.request.field{:name "VolumeARN", :shape "VolumeARN"})]}))

(clojure.core/defn- req-retrieve-tape-recovery-point-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tape-arn (input :tape-arn)) #:http.request.field{:name "TapeARN", :shape "TapeARN"}) (clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-update-smb-file-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-share-arn (input :file-share-arn)) #:http.request.field{:name "FileShareARN", :shape "FileShareARN"})]} (clojure.core/contains? input :requester-pays) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :requester-pays)) #:http.request.field{:name "RequesterPays", :shape "Boolean"})) (clojure.core/contains? input :guess-mime-type-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :guess-mime-type-enabled)) #:http.request.field{:name "GuessMIMETypeEnabled", :shape "Boolean"})) (clojure.core/contains? input :invalid-user-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-share-user-list (input :invalid-user-list)) #:http.request.field{:name "InvalidUserList", :shape "FileShareUserList"})) (clojure.core/contains? input :object-acl) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-acl (input :object-acl)) #:http.request.field{:name "ObjectACL", :shape "ObjectACL"})) (clojure.core/contains? input :default-storage-class) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :default-storage-class)) #:http.request.field{:name "DefaultStorageClass", :shape "StorageClass"})) (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key (input :kms-key)) #:http.request.field{:name "KMSKey", :shape "KMSKey"})) (clojure.core/contains? input :kms-encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :kms-encrypted)) #:http.request.field{:name "KMSEncrypted", :shape "Boolean"})) (clojure.core/contains? input :read-only) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :read-only)) #:http.request.field{:name "ReadOnly", :shape "Boolean"})) (clojure.core/contains? input :valid-user-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-share-user-list (input :valid-user-list)) #:http.request.field{:name "ValidUserList", :shape "FileShareUserList"}))))

(clojure.core/defn- req-create-storedi-scsi-volume-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-disk-id (input :disk-id)) #:http.request.field{:name "DiskId", :shape "DiskId"}) (clojure.core/into (serboolean (input :preserve-existing-data)) #:http.request.field{:name "PreserveExistingData", :shape "boolean"}) (clojure.core/into (ser-target-name (input :target-name)) #:http.request.field{:name "TargetName", :shape "TargetName"}) (clojure.core/into (ser-network-interface-id (input :network-interface-id)) #:http.request.field{:name "NetworkInterfaceId", :shape "NetworkInterfaceId"})]} (clojure.core/contains? input :snapshot-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-id (input :snapshot-id)) #:http.request.field{:name "SnapshotId", :shape "SnapshotId"})) (clojure.core/contains? input :kms-encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :kms-encrypted)) #:http.request.field{:name "KMSEncrypted", :shape "Boolean"})) (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key (input :kms-key)) #:http.request.field{:name "KMSKey", :shape "KMSKey"}))))

(clojure.core/defn- req-update-gateway-information-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]} (clojure.core/contains? input :gateway-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-gateway-name (input :gateway-name)) #:http.request.field{:name "GatewayName", :shape "GatewayName"})) (clojure.core/contains? input :gateway-timezone) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-gateway-timezone (input :gateway-timezone)) #:http.request.field{:name "GatewayTimezone", :shape "GatewayTimezone"}))))

(clojure.core/defn- req-update-snapshot-schedule-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-volume-arn (input :volume-arn)) #:http.request.field{:name "VolumeARN", :shape "VolumeARN"}) (clojure.core/into (ser-hour-of-day (input :start-at)) #:http.request.field{:name "StartAt", :shape "HourOfDay"}) (clojure.core/into (ser-recurrence-in-hours (input :recurrence-in-hours)) #:http.request.field{:name "RecurrenceInHours", :shape "RecurrenceInHours"})]} (clojure.core/contains? input :description) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-description (input :description)) #:http.request.field{:name "Description", :shape "Description"}))))

(clojure.core/defn- req-add-cache-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-disk-ids (input :disk-ids)) #:http.request.field{:name "DiskIds", :shape "DiskIds"})]}))

(clojure.core/defn- req-cancel-archival-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-tape-arn (input :tape-arn)) #:http.request.field{:name "TapeARN", :shape "TapeARN"})]}))

(clojure.core/defn- req-create-tape-with-barcode-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-tape-size (input :tape-size-in-bytes)) #:http.request.field{:name "TapeSizeInBytes", :shape "TapeSize"}) (clojure.core/into (ser-tape-barcode (input :tape-barcode)) #:http.request.field{:name "TapeBarcode", :shape "TapeBarcode"})]} (clojure.core/contains? input :kms-encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :kms-encrypted)) #:http.request.field{:name "KMSEncrypted", :shape "Boolean"})) (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key (input :kms-key)) #:http.request.field{:name "KMSKey", :shape "KMSKey"}))))

(clojure.core/defn- req-create-smb-file-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken"}) (clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-role (input :role)) #:http.request.field{:name "Role", :shape "Role"}) (clojure.core/into (ser-location-arn (input :location-arn)) #:http.request.field{:name "LocationARN", :shape "LocationARN"})]} (clojure.core/contains? input :requester-pays) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :requester-pays)) #:http.request.field{:name "RequesterPays", :shape "Boolean"})) (clojure.core/contains? input :guess-mime-type-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :guess-mime-type-enabled)) #:http.request.field{:name "GuessMIMETypeEnabled", :shape "Boolean"})) (clojure.core/contains? input :invalid-user-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-share-user-list (input :invalid-user-list)) #:http.request.field{:name "InvalidUserList", :shape "FileShareUserList"})) (clojure.core/contains? input :tags) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})) (clojure.core/contains? input :object-acl) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-acl (input :object-acl)) #:http.request.field{:name "ObjectACL", :shape "ObjectACL"})) (clojure.core/contains? input :default-storage-class) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :default-storage-class)) #:http.request.field{:name "DefaultStorageClass", :shape "StorageClass"})) (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key (input :kms-key)) #:http.request.field{:name "KMSKey", :shape "KMSKey"})) (clojure.core/contains? input :kms-encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :kms-encrypted)) #:http.request.field{:name "KMSEncrypted", :shape "Boolean"})) (clojure.core/contains? input :read-only) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :read-only)) #:http.request.field{:name "ReadOnly", :shape "Boolean"})) (clojure.core/contains? input :valid-user-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-share-user-list (input :valid-user-list)) #:http.request.field{:name "ValidUserList", :shape "FileShareUserList"})) (clojure.core/contains? input :authentication) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-authentication (input :authentication)) #:http.request.field{:name "Authentication", :shape "Authentication"}))))

(clojure.core/defn- req-delete-bandwidth-rate-limit-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-bandwidth-type (input :bandwidth-type)) #:http.request.field{:name "BandwidthType", :shape "BandwidthType"})]}))

(clojure.core/defn- req-describe-working-storage-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-describe-smb-file-shares-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-share-arn-list (input :file-share-arn-list)) #:http.request.field{:name "FileShareARNList", :shape "FileShareARNList"})]}))

(clojure.core/defn- req-describe-cachedi-scsi-volumes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-volume-ar-ns (input :volume-ar-ns)) #:http.request.field{:name "VolumeARNs", :shape "VolumeARNs"})]}))

(clojure.core/defn- req-update-maintenance-start-time-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-hour-of-day (input :hour-of-day)) #:http.request.field{:name "HourOfDay", :shape "HourOfDay"}) (clojure.core/into (ser-minute-of-hour (input :minute-of-hour)) #:http.request.field{:name "MinuteOfHour", :shape "MinuteOfHour"}) (clojure.core/into (ser-day-of-week (input :day-of-week)) #:http.request.field{:name "DayOfWeek", :shape "DayOfWeek"})]}))

(clojure.core/defn- req-reset-cache-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-remove-tags-from-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-tag-keys (input :tag-keys)) #:http.request.field{:name "TagKeys", :shape "TagKeys"})]}))

(clojure.core/defn- req-set-smb-guest-password-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-smb-guest-password (input :password)) #:http.request.field{:name "Password", :shape "SMBGuestPassword"})]}))

(clojure.core/defn- req-add-tags-to-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"}) (clojure.core/into (ser-tags (input :tags)) #:http.request.field{:name "Tags", :shape "Tags"})]}))

(clojure.core/defn- req-describe-tape-archives-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :tape-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tape-ar-ns (input :tape-ar-ns)) #:http.request.field{:name "TapeARNs", :shape "TapeARNs"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-int-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntObject"}))))

(clojure.core/defn- req-list-gateways-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-int-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntObject"}))))

(clojure.core/defn- req-update-vtl-device-type-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-vtl-device-arn (input :vtl-device-arn)) #:http.request.field{:name "VTLDeviceARN", :shape "VTLDeviceARN"}) (clojure.core/into (ser-device-type (input :device-type)) #:http.request.field{:name "DeviceType", :shape "DeviceType"})]}))

(clojure.core/defn- req-list-tags-for-resource-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-resource-arn (input :resource-arn)) #:http.request.field{:name "ResourceARN", :shape "ResourceARN"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-int-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntObject"}))))

(clojure.core/defn- req-set-local-console-password-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-local-console-password (input :local-console-password)) #:http.request.field{:name "LocalConsolePassword", :shape "LocalConsolePassword"})]}))

(clojure.core/defn- req-create-tapes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-tape-size (input :tape-size-in-bytes)) #:http.request.field{:name "TapeSizeInBytes", :shape "TapeSize"}) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken"}) (clojure.core/into (ser-num-tapes-to-create (input :num-tapes-to-create)) #:http.request.field{:name "NumTapesToCreate", :shape "NumTapesToCreate"}) (clojure.core/into (ser-tape-barcode-prefix (input :tape-barcode-prefix)) #:http.request.field{:name "TapeBarcodePrefix", :shape "TapeBarcodePrefix"})]} (clojure.core/contains? input :kms-encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :kms-encrypted)) #:http.request.field{:name "KMSEncrypted", :shape "Boolean"})) (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key (input :kms-key)) #:http.request.field{:name "KMSKey", :shape "KMSKey"}))))

(clojure.core/defn- req-delete-tape-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-tape-arn (input :tape-arn)) #:http.request.field{:name "TapeARN", :shape "TapeARN"})]}))

(clojure.core/defn- req-list-file-shares-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :gateway-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-int-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntObject"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"}))))

(clojure.core/defn- req-describe-cache-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-describe-tape-recovery-points-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]} (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-int-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntObject"}))))

(clojure.core/defn- req-delete-gateway-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-shutdown-gateway-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-attach-volume-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-volume-arn (input :volume-arn)) #:http.request.field{:name "VolumeARN", :shape "VolumeARN"}) (clojure.core/into (ser-network-interface-id (input :network-interface-id)) #:http.request.field{:name "NetworkInterfaceId", :shape "NetworkInterfaceId"})]} (clojure.core/contains? input :target-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-target-name (input :target-name)) #:http.request.field{:name "TargetName", :shape "TargetName"})) (clojure.core/contains? input :disk-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-disk-id (input :disk-id)) #:http.request.field{:name "DiskId", :shape "DiskId"}))))

(clojure.core/defn- req-describe-storedi-scsi-volumes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-volume-ar-ns (input :volume-ar-ns)) #:http.request.field{:name "VolumeARNs", :shape "VolumeARNs"})]}))

(clojure.core/defn- req-add-upload-buffer-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-disk-ids (input :disk-ids)) #:http.request.field{:name "DiskIds", :shape "DiskIds"})]}))

(clojure.core/defn- req-delete-file-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-share-arn (input :file-share-arn)) #:http.request.field{:name "FileShareARN", :shape "FileShareARN"})]} (clojure.core/contains? input :force-delete) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (serboolean (input :force-delete)) #:http.request.field{:name "ForceDelete", :shape "boolean"}))))

(clojure.core/defn- req-delete-snapshot-schedule-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-volume-arn (input :volume-arn)) #:http.request.field{:name "VolumeARN", :shape "VolumeARN"})]}))

(clojure.core/defn- req-create-snapshot-from-volume-recovery-point-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-volume-arn (input :volume-arn)) #:http.request.field{:name "VolumeARN", :shape "VolumeARN"}) (clojure.core/into (ser-snapshot-description (input :snapshot-description)) #:http.request.field{:name "SnapshotDescription", :shape "SnapshotDescription"})]}))

(clojure.core/defn- req-disable-gateway-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-notify-when-uploaded-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-share-arn (input :file-share-arn)) #:http.request.field{:name "FileShareARN", :shape "FileShareARN"})]}))

(clojure.core/defn- req-describe-maintenance-start-time-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-describe-gateway-information-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-delete-chap-credentials-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-arn (input :target-arn)) #:http.request.field{:name "TargetARN", :shape "TargetARN"}) (clojure.core/into (ser-iqn-name (input :initiator-name)) #:http.request.field{:name "InitiatorName", :shape "IqnName"})]}))

(clojure.core/defn- req-describe-tapes-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]} (clojure.core/contains? input :tape-ar-ns) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-tape-ar-ns (input :tape-ar-ns)) #:http.request.field{:name "TapeARNs", :shape "TapeARNs"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-int-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntObject"}))))

(clojure.core/defn- req-create-snapshot-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-volume-arn (input :volume-arn)) #:http.request.field{:name "VolumeARN", :shape "VolumeARN"}) (clojure.core/into (ser-snapshot-description (input :snapshot-description)) #:http.request.field{:name "SnapshotDescription", :shape "SnapshotDescription"})]}))

(clojure.core/defn- req-refresh-cache-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-share-arn (input :file-share-arn)) #:http.request.field{:name "FileShareARN", :shape "FileShareARN"})]} (clojure.core/contains? input :folder-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-folder-list (input :folder-list)) #:http.request.field{:name "FolderList", :shape "FolderList"})) (clojure.core/contains? input :recursive) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :recursive)) #:http.request.field{:name "Recursive", :shape "Boolean"}))))

(clojure.core/defn- req-describe-chap-credentials-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-target-arn (input :target-arn)) #:http.request.field{:name "TargetARN", :shape "TargetARN"})]}))

(clojure.core/defn- req-describe-smb-settings-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-detach-volume-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-volume-arn (input :volume-arn)) #:http.request.field{:name "VolumeARN", :shape "VolumeARN"})]} (clojure.core/contains? input :force-detach) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :force-detach)) #:http.request.field{:name "ForceDetach", :shape "Boolean"}))))

(clojure.core/defn- req-update-nfs-file-share-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-share-arn (input :file-share-arn)) #:http.request.field{:name "FileShareARN", :shape "FileShareARN"})]} (clojure.core/contains? input :requester-pays) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :requester-pays)) #:http.request.field{:name "RequesterPays", :shape "Boolean"})) (clojure.core/contains? input :guess-mime-type-enabled) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :guess-mime-type-enabled)) #:http.request.field{:name "GuessMIMETypeEnabled", :shape "Boolean"})) (clojure.core/contains? input :object-acl) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-object-acl (input :object-acl)) #:http.request.field{:name "ObjectACL", :shape "ObjectACL"})) (clojure.core/contains? input :default-storage-class) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-storage-class (input :default-storage-class)) #:http.request.field{:name "DefaultStorageClass", :shape "StorageClass"})) (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key (input :kms-key)) #:http.request.field{:name "KMSKey", :shape "KMSKey"})) (clojure.core/contains? input :kms-encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :kms-encrypted)) #:http.request.field{:name "KMSEncrypted", :shape "Boolean"})) (clojure.core/contains? input :read-only) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :read-only)) #:http.request.field{:name "ReadOnly", :shape "Boolean"})) (clojure.core/contains? input :client-list) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-file-share-client-list (input :client-list)) #:http.request.field{:name "ClientList", :shape "FileShareClientList"})) (clojure.core/contains? input :nfs-file-share-defaults) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-nfs-file-share-defaults (input :nfs-file-share-defaults)) #:http.request.field{:name "NFSFileShareDefaults", :shape "NFSFileShareDefaults"})) (clojure.core/contains? input :squash) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-squash (input :squash)) #:http.request.field{:name "Squash", :shape "Squash"}))))

(clojure.core/defn- req-create-cachedi-scsi-volume-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (serlong (input :volume-size-in-bytes)) #:http.request.field{:name "VolumeSizeInBytes", :shape "long"}) (clojure.core/into (ser-target-name (input :target-name)) #:http.request.field{:name "TargetName", :shape "TargetName"}) (clojure.core/into (ser-network-interface-id (input :network-interface-id)) #:http.request.field{:name "NetworkInterfaceId", :shape "NetworkInterfaceId"}) (clojure.core/into (ser-client-token (input :client-token)) #:http.request.field{:name "ClientToken", :shape "ClientToken"})]} (clojure.core/contains? input :kms-key) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kms-key (input :kms-key)) #:http.request.field{:name "KMSKey", :shape "KMSKey"})) (clojure.core/contains? input :kms-encrypted) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-boolean (input :kms-encrypted)) #:http.request.field{:name "KMSEncrypted", :shape "Boolean"})) (clojure.core/contains? input :source-volume-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-volume-arn (input :source-volume-arn)) #:http.request.field{:name "SourceVolumeARN", :shape "VolumeARN"})) (clojure.core/contains? input :snapshot-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-snapshot-id (input :snapshot-id)) #:http.request.field{:name "SnapshotId", :shape "SnapshotId"}))))

(clojure.core/defn- req-describe-snapshot-schedule-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-volume-arn (input :volume-arn)) #:http.request.field{:name "VolumeARN", :shape "VolumeARN"})]}))

(clojure.core/defn- req-retrieve-tape-archive-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-tape-arn (input :tape-arn)) #:http.request.field{:name "TapeARN", :shape "TapeARN"}) (clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})]}))

(clojure.core/defn- req-join-domain-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-domain-name (input :domain-name)) #:http.request.field{:name "DomainName", :shape "DomainName"}) (clojure.core/into (ser-domain-user-name (input :user-name)) #:http.request.field{:name "UserName", :shape "DomainUserName"}) (clojure.core/into (ser-domain-user-password (input :password)) #:http.request.field{:name "Password", :shape "DomainUserPassword"})]} (clojure.core/contains? input :organizational-unit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-organizational-unit (input :organizational-unit)) #:http.request.field{:name "OrganizationalUnit", :shape "OrganizationalUnit"})) (clojure.core/contains? input :domain-controllers) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-hosts (input :domain-controllers)) #:http.request.field{:name "DomainControllers", :shape "Hosts"}))))

(clojure.core/defn- req-describe-nfs-file-shares-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-file-share-arn-list (input :file-share-arn-list)) #:http.request.field{:name "FileShareARNList", :shape "FileShareARNList"})]}))

(clojure.core/defn- req-list-volumes-input [input] (clojure.core/cond-> {} (clojure.core/contains? input :gateway-arn) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"})) (clojure.core/contains? input :marker) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-marker (input :marker)) #:http.request.field{:name "Marker", :shape "Marker"})) (clojure.core/contains? input :limit) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-positive-int-object (input :limit)) #:http.request.field{:name "Limit", :shape "PositiveIntObject"}))))

(clojure.core/defn- req-add-working-storage-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-gateway-arn (input :gateway-arn)) #:http.request.field{:name "GatewayARN", :shape "GatewayARN"}) (clojure.core/into (ser-disk-ids (input :disk-ids)) #:http.request.field{:name "DiskIds", :shape "DiskIds"})]}))

(clojure.core/defn- req-list-volume-initiators-input [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-volume-arn (input :volume-arn)) #:http.request.field{:name "VolumeARN", :shape "VolumeARN"})]}))

(clojure.core/declare deser-minute-of-hour)

(clojure.core/declare deser-file-share-type)

(clojure.core/declare deserboolean)

(clojure.core/declare deser-positive-int-object)

(clojure.core/declare deser-tape-recovery-point-infos)

(clojure.core/declare deser-disk-ids)

(clojure.core/declare deser-chap-info)

(clojure.core/declare deser-disk-allocation-type)

(clojure.core/declare deser-notification-id)

(clojure.core/declare deser-volumei-scsi-attributes)

(clojure.core/declare deser-double-object)

(clojure.core/declare deser-tape-recovery-point-info)

(clojure.core/declare deser-last-software-update)

(clojure.core/declare deser-file-share-info)

(clojure.core/declare deserstring)

(clojure.core/declare deser-volume-attachment-status)

(clojure.core/declare deser-volume-used-in-bytes)

(clojure.core/declare deser-day-of-week)

(clojure.core/declare deser-location-arn)

(clojure.core/declare deser-volume-infos)

(clojure.core/declare deser-bandwidth-download-rate-limit)

(clojure.core/declare deser-storedi-scsi-volumes)

(clojure.core/declare deser-vtl-device)

(clojure.core/declare deser-next-update-availability-date)

(clojure.core/declare deser-vtl-device-product-identifier)

(clojure.core/declare deser-tape)

(clojure.core/declare deser-volume-info)

(clojure.core/declare deser-path)

(clojure.core/declare deser-tape-archive-status)

(clojure.core/declare deser-gateway-network-interfaces)

(clojure.core/declare deserlong)

(clojure.core/declare deser-file-share-id)

(clojure.core/declare deser-vtl-device-type)

(clojure.core/declare deser-marker)

(clojure.core/declare deser-tag-key)

(clojure.core/declare deser-recurrence-in-hours)

(clojure.core/declare deser-nfs-file-share-info)

(clojure.core/declare deser-tags)

(clojure.core/declare deser-gateways)

(clojure.core/declare deser-network-interface-id)

(clojure.core/declare deser-target-arn)

(clojure.core/declare deser-object-acl)

(clojure.core/declare deser-file-share-info-list)

(clojure.core/declare deser-devicei-scsi-attributes)

(clojure.core/declare deser-hour-of-day)

(clojure.core/declare deser-disk-id)

(clojure.core/declare deser-cachedi-scsi-volume)

(clojure.core/declare deser-bandwidth-upload-rate-limit)

(clojure.core/declare deser-permission-id)

(clojure.core/declare deser-gateway-info)

(clojure.core/declare deser-permission-mode)

(clojure.core/declare deser-nfs-file-share-info-list)

(clojure.core/declare deser-tape-recovery-point-status)

(clojure.core/declare deser-kms-key)

(clojure.core/declare deser-tape-status)

(clojure.core/declare deser-role)

(clojure.core/declare deser-disks)

(clojure.core/declare deser-volume-arn)

(clojure.core/declare deser-file-share-user-list)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-cachedi-scsi-volumes)

(clojure.core/declare desererror-details)

(clojure.core/declare deser-description)

(clojure.core/declare deser-tag-value)

(clojure.core/declare deser-chap-credentials)

(clojure.core/declare deser-ipv-4-address-cidr)

(clojure.core/declare deser-vtl-devices)

(clojure.core/declare deser-tape-usage)

(clojure.core/declare deser-created-date)

(clojure.core/declare deser-tape-arn)

(clojure.core/declare deser-file-share-status)

(clojure.core/declare deser-disk-attribute-list)

(clojure.core/declare deser-gateway-operational-state)

(clojure.core/declare deser-iqn-name)

(clojure.core/declare deser-tape-archive)

(clojure.core/declare deser-network-interface)

(clojure.core/declare deserinteger)

(clojure.core/declare deser-tape-barcode)

(clojure.core/declare deser-storage-gateway-error)

(clojure.core/declare deser-chap-secret)

(clojure.core/declare deser-volume-type)

(clojure.core/declare deser-volume-id)

(clojure.core/declare deser-smb-file-share-info)

(clojure.core/declare deser-tape-infos)

(clojure.core/declare deserdouble)

(clojure.core/declare deser-volume-recovery-point-infos)

(clojure.core/declare deser-authentication)

(clojure.core/declare deser-disk)

(clojure.core/declare deser-volume-recovery-point-info)

(clojure.core/declare deser-tape-ar-ns)

(clojure.core/declare deser-target-name)

(clojure.core/declare deser-tag)

(clojure.core/declare deser-gateway-id)

(clojure.core/declare deser-vtl-device-arn)

(clojure.core/declare deser-file-share-client-list)

(clojure.core/declare deser-gateway-state)

(clojure.core/declare deser-domain-name)

(clojure.core/declare deser-vtl-device-vendor)

(clojure.core/declare deser-initiators)

(clojure.core/declare deser-gateway-type)

(clojure.core/declare deser-storage-class)

(clojure.core/declare deser-file-share-arn)

(clojure.core/declare deser-gateway-timezone)

(clojure.core/declare deser-file-share-user)

(clojure.core/declare deser-storedi-scsi-volume)

(clojure.core/declare deser-tape-archives)

(clojure.core/declare deser-initiator)

(clojure.core/declare deser-tape-info)

(clojure.core/declare deser-volume-status)

(clojure.core/declare deser-resource-arn)

(clojure.core/declare deser-tapes)

(clojure.core/declare deser-smb-file-share-info-list)

(clojure.core/declare deser-gateway-arn)

(clojure.core/declare deser-nfs-file-share-defaults)

(clojure.core/declare deser-time)

(clojure.core/declare deser-disk-attribute)

(clojure.core/declare deser-snapshot-id)

(clojure.core/declare deser-tape-size)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-squash)

(clojure.core/defn- deser-minute-of-hour [input] input)

(clojure.core/defn- deser-file-share-type [input] (clojure.core/get {"NFS" :nfs, "SMB" :smb} input))

(clojure.core/defn- deserboolean [input] input)

(clojure.core/defn- deser-positive-int-object [input] input)

(clojure.core/defn- deser-tape-recovery-point-infos [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tape-recovery-point-info coll))) input))

(clojure.core/defn- deser-disk-ids [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-disk-id coll))) input))

(clojure.core/defn- deser-chap-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (input "TargetARN"))) (clojure.core/contains? input "SecretToAuthenticateInitiator") (clojure.core/assoc :secret-to-authenticate-initiator (deser-chap-secret (input "SecretToAuthenticateInitiator"))) (clojure.core/contains? input "InitiatorName") (clojure.core/assoc :initiator-name (deser-iqn-name (input "InitiatorName"))) (clojure.core/contains? input "SecretToAuthenticateTarget") (clojure.core/assoc :secret-to-authenticate-target (deser-chap-secret (input "SecretToAuthenticateTarget")))))

(clojure.core/defn- deser-disk-allocation-type [input] input)

(clojure.core/defn- deser-notification-id [input] input)

(clojure.core/defn- deser-volumei-scsi-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (input "TargetARN"))) (clojure.core/contains? input "NetworkInterfaceId") (clojure.core/assoc :network-interface-id (deser-network-interface-id (input "NetworkInterfaceId"))) (clojure.core/contains? input "NetworkInterfacePort") (clojure.core/assoc :network-interface-port (deserinteger (input "NetworkInterfacePort"))) (clojure.core/contains? input "LunNumber") (clojure.core/assoc :lun-number (deser-positive-int-object (input "LunNumber"))) (clojure.core/contains? input "ChapEnabled") (clojure.core/assoc :chap-enabled (deserboolean (input "ChapEnabled")))))

(clojure.core/defn- deser-double-object [input] input)

(clojure.core/defn- deser-tape-recovery-point-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (input "TapeARN"))) (clojure.core/contains? input "TapeRecoveryPointTime") (clojure.core/assoc :tape-recovery-point-time (deser-time (input "TapeRecoveryPointTime"))) (clojure.core/contains? input "TapeSizeInBytes") (clojure.core/assoc :tape-size-in-bytes (deser-tape-size (input "TapeSizeInBytes"))) (clojure.core/contains? input "TapeStatus") (clojure.core/assoc :tape-status (deser-tape-recovery-point-status (input "TapeStatus")))))

(clojure.core/defn- deser-last-software-update [input] input)

(clojure.core/defn- deser-file-share-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "FileShareType") (clojure.core/assoc :file-share-type (deser-file-share-type (input "FileShareType"))) (clojure.core/contains? input "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (input "FileShareARN"))) (clojure.core/contains? input "FileShareId") (clojure.core/assoc :file-share-id (deser-file-share-id (input "FileShareId"))) (clojure.core/contains? input "FileShareStatus") (clojure.core/assoc :file-share-status (deser-file-share-status (input "FileShareStatus"))) (clojure.core/contains? input "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (input "GatewayARN")))))

(clojure.core/defn- deserstring [input] input)

(clojure.core/defn- deser-volume-attachment-status [input] input)

(clojure.core/defn- deser-volume-used-in-bytes [input] input)

(clojure.core/defn- deser-day-of-week [input] input)

(clojure.core/defn- deser-location-arn [input] input)

(clojure.core/defn- deser-volume-infos [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-volume-info coll))) input))

(clojure.core/defn- deser-bandwidth-download-rate-limit [input] input)

(clojure.core/defn- deser-storedi-scsi-volumes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-storedi-scsi-volume coll))) input))

(clojure.core/defn- deser-vtl-device [input] (clojure.core/cond-> {} (clojure.core/contains? input "VTLDeviceARN") (clojure.core/assoc :vtl-device-arn (deser-vtl-device-arn (input "VTLDeviceARN"))) (clojure.core/contains? input "VTLDeviceType") (clojure.core/assoc :vtl-device-type (deser-vtl-device-type (input "VTLDeviceType"))) (clojure.core/contains? input "VTLDeviceVendor") (clojure.core/assoc :vtl-device-vendor (deser-vtl-device-vendor (input "VTLDeviceVendor"))) (clojure.core/contains? input "VTLDeviceProductIdentifier") (clojure.core/assoc :vtl-device-product-identifier (deser-vtl-device-product-identifier (input "VTLDeviceProductIdentifier"))) (clojure.core/contains? input "DeviceiSCSIAttributes") (clojure.core/assoc :devicei-scsi-attributes (deser-devicei-scsi-attributes (input "DeviceiSCSIAttributes")))))

(clojure.core/defn- deser-next-update-availability-date [input] input)

(clojure.core/defn- deser-vtl-device-product-identifier [input] input)

(clojure.core/defn- deser-tape [input] (clojure.core/cond-> {} (clojure.core/contains? input "VTLDevice") (clojure.core/assoc :vtl-device (deser-vtl-device-arn (input "VTLDevice"))) (clojure.core/contains? input "Progress") (clojure.core/assoc :progress (deser-double-object (input "Progress"))) (clojure.core/contains? input "KMSKey") (clojure.core/assoc :kms-key (deser-kms-key (input "KMSKey"))) (clojure.core/contains? input "TapeStatus") (clojure.core/assoc :tape-status (deser-tape-status (input "TapeStatus"))) (clojure.core/contains? input "TapeSizeInBytes") (clojure.core/assoc :tape-size-in-bytes (deser-tape-size (input "TapeSizeInBytes"))) (clojure.core/contains? input "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (input "TapeARN"))) (clojure.core/contains? input "TapeUsedInBytes") (clojure.core/assoc :tape-used-in-bytes (deser-tape-usage (input "TapeUsedInBytes"))) (clojure.core/contains? input "TapeBarcode") (clojure.core/assoc :tape-barcode (deser-tape-barcode (input "TapeBarcode"))) (clojure.core/contains? input "TapeCreatedDate") (clojure.core/assoc :tape-created-date (deser-time (input "TapeCreatedDate")))))

(clojure.core/defn- deser-volume-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (input "VolumeARN"))) (clojure.core/contains? input "VolumeId") (clojure.core/assoc :volume-id (deser-volume-id (input "VolumeId"))) (clojure.core/contains? input "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (input "GatewayARN"))) (clojure.core/contains? input "GatewayId") (clojure.core/assoc :gateway-id (deser-gateway-id (input "GatewayId"))) (clojure.core/contains? input "VolumeType") (clojure.core/assoc :volume-type (deser-volume-type (input "VolumeType"))) (clojure.core/contains? input "VolumeSizeInBytes") (clojure.core/assoc :volume-size-in-bytes (deserlong (input "VolumeSizeInBytes"))) (clojure.core/contains? input "VolumeAttachmentStatus") (clojure.core/assoc :volume-attachment-status (deser-volume-attachment-status (input "VolumeAttachmentStatus")))))

(clojure.core/defn- deser-path [input] input)

(clojure.core/defn- deser-tape-archive-status [input] input)

(clojure.core/defn- deser-gateway-network-interfaces [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-network-interface coll))) input))

(clojure.core/defn- deserlong [input] input)

(clojure.core/defn- deser-file-share-id [input] input)

(clojure.core/defn- deser-vtl-device-type [input] input)

(clojure.core/defn- deser-marker [input] input)

(clojure.core/defn- deser-tag-key [input] input)

(clojure.core/defn- deser-recurrence-in-hours [input] input)

(clojure.core/defn- deser-nfs-file-share-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "RequesterPays") (clojure.core/assoc :requester-pays (deser-boolean (input "RequesterPays"))) (clojure.core/contains? input "GuessMIMETypeEnabled") (clojure.core/assoc :guess-mime-type-enabled (deser-boolean (input "GuessMIMETypeEnabled"))) (clojure.core/contains? input "LocationARN") (clojure.core/assoc :location-arn (deser-location-arn (input "LocationARN"))) (clojure.core/contains? input "Path") (clojure.core/assoc :path (deser-path (input "Path"))) (clojure.core/contains? input "FileShareId") (clojure.core/assoc :file-share-id (deser-file-share-id (input "FileShareId"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tags (input "Tags"))) (clojure.core/contains? input "ObjectACL") (clojure.core/assoc :object-acl (deser-object-acl (input "ObjectACL"))) (clojure.core/contains? input "DefaultStorageClass") (clojure.core/assoc :default-storage-class (deser-storage-class (input "DefaultStorageClass"))) (clojure.core/contains? input "KMSKey") (clojure.core/assoc :kms-key (deser-kms-key (input "KMSKey"))) (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role (input "Role"))) (clojure.core/contains? input "KMSEncrypted") (clojure.core/assoc :kms-encrypted (deserboolean (input "KMSEncrypted"))) (clojure.core/contains? input "ReadOnly") (clojure.core/assoc :read-only (deser-boolean (input "ReadOnly"))) (clojure.core/contains? input "FileShareStatus") (clojure.core/assoc :file-share-status (deser-file-share-status (input "FileShareStatus"))) (clojure.core/contains? input "ClientList") (clojure.core/assoc :client-list (deser-file-share-client-list (input "ClientList"))) (clojure.core/contains? input "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (input "FileShareARN"))) (clojure.core/contains? input "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (input "GatewayARN"))) (clojure.core/contains? input "NFSFileShareDefaults") (clojure.core/assoc :nfs-file-share-defaults (deser-nfs-file-share-defaults (input "NFSFileShareDefaults"))) (clojure.core/contains? input "Squash") (clojure.core/assoc :squash (deser-squash (input "Squash")))))

(clojure.core/defn- deser-tags [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tag coll))) input))

(clojure.core/defn- deser-gateways [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-gateway-info coll))) input))

(clojure.core/defn- deser-network-interface-id [input] input)

(clojure.core/defn- deser-target-arn [input] input)

(clojure.core/defn- deser-object-acl [input] (clojure.core/get {"private" :private, "public-read" :publicread, "public-read-write" :publicreadwrite, "authenticated-read" :authenticatedread, "bucket-owner-read" :bucketownerread, "bucket-owner-full-control" :bucketownerfullcontrol, "aws-exec-read" :awsexecread} input))

(clojure.core/defn- deser-file-share-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file-share-info coll))) input))

(clojure.core/defn- deser-devicei-scsi-attributes [input] (clojure.core/cond-> {} (clojure.core/contains? input "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (input "TargetARN"))) (clojure.core/contains? input "NetworkInterfaceId") (clojure.core/assoc :network-interface-id (deser-network-interface-id (input "NetworkInterfaceId"))) (clojure.core/contains? input "NetworkInterfacePort") (clojure.core/assoc :network-interface-port (deserinteger (input "NetworkInterfacePort"))) (clojure.core/contains? input "ChapEnabled") (clojure.core/assoc :chap-enabled (deserboolean (input "ChapEnabled")))))

(clojure.core/defn- deser-hour-of-day [input] input)

(clojure.core/defn- deser-disk-id [input] input)

(clojure.core/defn- deser-cachedi-scsi-volume [input] (clojure.core/cond-> {} (clojure.core/contains? input "VolumeiSCSIAttributes") (clojure.core/assoc :volumei-scsi-attributes (deser-volumei-scsi-attributes (input "VolumeiSCSIAttributes"))) (clojure.core/contains? input "SourceSnapshotId") (clojure.core/assoc :source-snapshot-id (deser-snapshot-id (input "SourceSnapshotId"))) (clojure.core/contains? input "VolumeAttachmentStatus") (clojure.core/assoc :volume-attachment-status (deser-volume-attachment-status (input "VolumeAttachmentStatus"))) (clojure.core/contains? input "VolumeUsedInBytes") (clojure.core/assoc :volume-used-in-bytes (deser-volume-used-in-bytes (input "VolumeUsedInBytes"))) (clojure.core/contains? input "KMSKey") (clojure.core/assoc :kms-key (deser-kms-key (input "KMSKey"))) (clojure.core/contains? input "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (input "VolumeARN"))) (clojure.core/contains? input "CreatedDate") (clojure.core/assoc :created-date (deser-created-date (input "CreatedDate"))) (clojure.core/contains? input "VolumeSizeInBytes") (clojure.core/assoc :volume-size-in-bytes (deserlong (input "VolumeSizeInBytes"))) (clojure.core/contains? input "VolumeType") (clojure.core/assoc :volume-type (deser-volume-type (input "VolumeType"))) (clojure.core/contains? input "VolumeId") (clojure.core/assoc :volume-id (deser-volume-id (input "VolumeId"))) (clojure.core/contains? input "TargetName") (clojure.core/assoc :target-name (deser-target-name (input "TargetName"))) (clojure.core/contains? input "VolumeStatus") (clojure.core/assoc :volume-status (deser-volume-status (input "VolumeStatus"))) (clojure.core/contains? input "VolumeProgress") (clojure.core/assoc :volume-progress (deser-double-object (input "VolumeProgress")))))

(clojure.core/defn- deser-bandwidth-upload-rate-limit [input] input)

(clojure.core/defn- deser-permission-id [input] input)

(clojure.core/defn- deser-gateway-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "GatewayId") (clojure.core/assoc :gateway-id (deser-gateway-id (input "GatewayId"))) (clojure.core/contains? input "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (input "GatewayARN"))) (clojure.core/contains? input "GatewayType") (clojure.core/assoc :gateway-type (deser-gateway-type (input "GatewayType"))) (clojure.core/contains? input "GatewayOperationalState") (clojure.core/assoc :gateway-operational-state (deser-gateway-operational-state (input "GatewayOperationalState"))) (clojure.core/contains? input "GatewayName") (clojure.core/assoc :gateway-name (deserstring (input "GatewayName")))))

(clojure.core/defn- deser-permission-mode [input] input)

(clojure.core/defn- deser-nfs-file-share-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-nfs-file-share-info coll))) input))

(clojure.core/defn- deser-tape-recovery-point-status [input] input)

(clojure.core/defn- deser-kms-key [input] input)

(clojure.core/defn- deser-tape-status [input] input)

(clojure.core/defn- deser-role [input] input)

(clojure.core/defn- deser-disks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-disk coll))) input))

(clojure.core/defn- deser-volume-arn [input] input)

(clojure.core/defn- deser-file-share-user-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-file-share-user coll))) input))

(clojure.core/defn- deser-error-code [input] (clojure.core/get {"DuplicateSchedule" :duplicate-schedule, "InitiatorNotFound" :initiator-not-found, "InitiatorInvalid" :initiator-invalid, "NotImplemented" :not-implemented, "SnapshotInProgress" :snapshot-in-progress, "VolumeAlreadyExists" :volume-already-exists, "OperationAborted" :operation-aborted, "AuthenticationFailure" :authentication-failure, "NetworkConfigurationChanged" :network-configuration-changed, "InvalidSchedule" :invalid-schedule, "StagingAreaFull" :staging-area-full, "NotSupported" :not-supported, "Blocked" :blocked, "TargetInvalid" :target-invalid, "NoDisksAvailable" :no-disks-available, "InternalError" :internal-error, "OutdatedGateway" :outdated-gateway, "SnapshotDeleted" :snapshot-deleted, "ActivationKeyNotFound" :activation-key-not-found, "VolumeIdInvalid" :volume-id-invalid, "SnapshotNotFound" :snapshot-not-found, "LocalStorageLimitExceeded" :local-storage-limit-exceeded, "SnapshotIdInvalid" :snapshot-id-invalid, "RegionInvalid" :region-invalid, "DiskSizeLessThanVolumeSize" :disk-size-less-than-volume-size, "VolumeInUse" :volume-in-use, "UnauthorizedOperation" :unauthorized-operation, "ParametersNotImplemented" :parameters-not-implemented, "LunInvalid" :lun-invalid, "ChapCredentialNotFound" :chap-credential-not-found, "VolumeNotReady" :volume-not-ready, "DiskAlreadyAllocated" :disk-already-allocated, "ServiceUnavailable" :service-unavailable, "ActivationKeyInvalid" :activation-key-invalid, "TargetNotFound" :target-not-found, "DiskSizeGreaterThanVolumeMaxSize" :disk-size-greater-than-volume-max-size, "DuplicateCertificateInfo" :duplicate-certificate-info, "DiskSizeNotGigAligned" :disk-size-not-gig-aligned, "TapeCartridgeNotFound" :tape-cartridge-not-found, "DiskDoesNotExist" :disk-does-not-exist, "InvalidParameters" :invalid-parameters, "GatewayProxyNetworkConnectionBusy" :gateway-proxy-network-connection-busy, "GatewayNotConnected" :gateway-not-connected, "EndpointNotFound" :endpoint-not-found, "IAMNotSupported" :iam-not-supported, "VolumeNotFound" :volume-not-found, "StorageFailure" :storage-failure, "GatewayNotFound" :gateway-not-found, "InvalidEndpoint" :invalid-endpoint, "MaximumContentLengthExceeded" :maximum-content-length-exceeded, "TargetAlreadyExists" :target-already-exists, "RequestTimeout" :request-timeout, "GatewayInternalError" :gateway-internal-error, "InvalidGateway" :invalid-gateway, "MaximumVolumeCountExceeded" :maximum-volume-count-exceeded, "CannotExportSnapshot" :cannot-export-snapshot, "MaximumTapeCartridgeCountExceeded" :maximum-tape-cartridge-count-exceeded, "LunAlreadyAllocated " :lun-already-allocated, "BandwidthThrottleScheduleNotFound" :bandwidth-throttle-schedule-not-found, "SnapshotScheduleNotFound" :snapshot-schedule-not-found, "ActivationKeyExpired" :activation-key-expired} input))

(clojure.core/defn- deser-cachedi-scsi-volumes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-cachedi-scsi-volume coll))) input))

(clojure.core/defn- desererror-details [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deserstring k) (deserstring v)])) input))

(clojure.core/defn- deser-description [input] input)

(clojure.core/defn- deser-tag-value [input] input)

(clojure.core/defn- deser-chap-credentials [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-chap-info coll))) input))

(clojure.core/defn- deser-ipv-4-address-cidr [input] input)

(clojure.core/defn- deser-vtl-devices [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-vtl-device coll))) input))

(clojure.core/defn- deser-tape-usage [input] input)

(clojure.core/defn- deser-created-date [input] input)

(clojure.core/defn- deser-tape-arn [input] input)

(clojure.core/defn- deser-file-share-status [input] input)

(clojure.core/defn- deser-disk-attribute-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-disk-attribute coll))) input))

(clojure.core/defn- deser-gateway-operational-state [input] input)

(clojure.core/defn- deser-iqn-name [input] input)

(clojure.core/defn- deser-tape-archive [input] (clojure.core/cond-> {} (clojure.core/contains? input "RetrievedTo") (clojure.core/assoc :retrieved-to (deser-gateway-arn (input "RetrievedTo"))) (clojure.core/contains? input "KMSKey") (clojure.core/assoc :kms-key (deser-kms-key (input "KMSKey"))) (clojure.core/contains? input "TapeStatus") (clojure.core/assoc :tape-status (deser-tape-archive-status (input "TapeStatus"))) (clojure.core/contains? input "TapeSizeInBytes") (clojure.core/assoc :tape-size-in-bytes (deser-tape-size (input "TapeSizeInBytes"))) (clojure.core/contains? input "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (input "TapeARN"))) (clojure.core/contains? input "TapeUsedInBytes") (clojure.core/assoc :tape-used-in-bytes (deser-tape-usage (input "TapeUsedInBytes"))) (clojure.core/contains? input "TapeBarcode") (clojure.core/assoc :tape-barcode (deser-tape-barcode (input "TapeBarcode"))) (clojure.core/contains? input "TapeCreatedDate") (clojure.core/assoc :tape-created-date (deser-time (input "TapeCreatedDate"))) (clojure.core/contains? input "CompletionTime") (clojure.core/assoc :completion-time (deser-time (input "CompletionTime")))))

(clojure.core/defn- deser-network-interface [input] (clojure.core/cond-> {} (clojure.core/contains? input "Ipv4Address") (clojure.core/assoc :ipv-4-address (deserstring (input "Ipv4Address"))) (clojure.core/contains? input "MacAddress") (clojure.core/assoc :mac-address (deserstring (input "MacAddress"))) (clojure.core/contains? input "Ipv6Address") (clojure.core/assoc :ipv-6-address (deserstring (input "Ipv6Address")))))

(clojure.core/defn- deserinteger [input] input)

(clojure.core/defn- deser-tape-barcode [input] input)

(clojure.core/defn- deser-storage-gateway-error [input] (clojure.core/cond-> {} (clojure.core/contains? input "errorCode") (clojure.core/assoc :error-code (deser-error-code (input "errorCode"))) (clojure.core/contains? input "errorDetails") (clojure.core/assoc :error-details (desererror-details (input "errorDetails")))))

(clojure.core/defn- deser-chap-secret [input] input)

(clojure.core/defn- deser-volume-type [input] input)

(clojure.core/defn- deser-volume-id [input] input)

(clojure.core/defn- deser-smb-file-share-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "RequesterPays") (clojure.core/assoc :requester-pays (deser-boolean (input "RequesterPays"))) (clojure.core/contains? input "GuessMIMETypeEnabled") (clojure.core/assoc :guess-mime-type-enabled (deser-boolean (input "GuessMIMETypeEnabled"))) (clojure.core/contains? input "LocationARN") (clojure.core/assoc :location-arn (deser-location-arn (input "LocationARN"))) (clojure.core/contains? input "InvalidUserList") (clojure.core/assoc :invalid-user-list (deser-file-share-user-list (input "InvalidUserList"))) (clojure.core/contains? input "Path") (clojure.core/assoc :path (deser-path (input "Path"))) (clojure.core/contains? input "FileShareId") (clojure.core/assoc :file-share-id (deser-file-share-id (input "FileShareId"))) (clojure.core/contains? input "Tags") (clojure.core/assoc :tags (deser-tags (input "Tags"))) (clojure.core/contains? input "ObjectACL") (clojure.core/assoc :object-acl (deser-object-acl (input "ObjectACL"))) (clojure.core/contains? input "DefaultStorageClass") (clojure.core/assoc :default-storage-class (deser-storage-class (input "DefaultStorageClass"))) (clojure.core/contains? input "KMSKey") (clojure.core/assoc :kms-key (deser-kms-key (input "KMSKey"))) (clojure.core/contains? input "Role") (clojure.core/assoc :role (deser-role (input "Role"))) (clojure.core/contains? input "KMSEncrypted") (clojure.core/assoc :kms-encrypted (deserboolean (input "KMSEncrypted"))) (clojure.core/contains? input "ReadOnly") (clojure.core/assoc :read-only (deser-boolean (input "ReadOnly"))) (clojure.core/contains? input "FileShareStatus") (clojure.core/assoc :file-share-status (deser-file-share-status (input "FileShareStatus"))) (clojure.core/contains? input "ValidUserList") (clojure.core/assoc :valid-user-list (deser-file-share-user-list (input "ValidUserList"))) (clojure.core/contains? input "Authentication") (clojure.core/assoc :authentication (deser-authentication (input "Authentication"))) (clojure.core/contains? input "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (input "FileShareARN"))) (clojure.core/contains? input "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (input "GatewayARN")))))

(clojure.core/defn- deser-tape-infos [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tape-info coll))) input))

(clojure.core/defn- deserdouble [input] input)

(clojure.core/defn- deser-volume-recovery-point-infos [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-volume-recovery-point-info coll))) input))

(clojure.core/defn- deser-authentication [input] input)

(clojure.core/defn- deser-disk [input] (clojure.core/cond-> {} (clojure.core/contains? input "DiskId") (clojure.core/assoc :disk-id (deser-disk-id (input "DiskId"))) (clojure.core/contains? input "DiskPath") (clojure.core/assoc :disk-path (deserstring (input "DiskPath"))) (clojure.core/contains? input "DiskNode") (clojure.core/assoc :disk-node (deserstring (input "DiskNode"))) (clojure.core/contains? input "DiskStatus") (clojure.core/assoc :disk-status (deserstring (input "DiskStatus"))) (clojure.core/contains? input "DiskSizeInBytes") (clojure.core/assoc :disk-size-in-bytes (deserlong (input "DiskSizeInBytes"))) (clojure.core/contains? input "DiskAllocationType") (clojure.core/assoc :disk-allocation-type (deser-disk-allocation-type (input "DiskAllocationType"))) (clojure.core/contains? input "DiskAllocationResource") (clojure.core/assoc :disk-allocation-resource (deserstring (input "DiskAllocationResource"))) (clojure.core/contains? input "DiskAttributeList") (clojure.core/assoc :disk-attribute-list (deser-disk-attribute-list (input "DiskAttributeList")))))

(clojure.core/defn- deser-volume-recovery-point-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (input "VolumeARN"))) (clojure.core/contains? input "VolumeSizeInBytes") (clojure.core/assoc :volume-size-in-bytes (deserlong (input "VolumeSizeInBytes"))) (clojure.core/contains? input "VolumeUsageInBytes") (clojure.core/assoc :volume-usage-in-bytes (deserlong (input "VolumeUsageInBytes"))) (clojure.core/contains? input "VolumeRecoveryPointTime") (clojure.core/assoc :volume-recovery-point-time (deserstring (input "VolumeRecoveryPointTime")))))

(clojure.core/defn- deser-tape-ar-ns [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tape-arn coll))) input))

(clojure.core/defn- deser-target-name [input] input)

(clojure.core/defn- deser-tag [input] (clojure.core/cond-> {:key (deser-tag-key (input "Key")), :value (deser-tag-value (input "Value"))}))

(clojure.core/defn- deser-gateway-id [input] input)

(clojure.core/defn- deser-vtl-device-arn [input] input)

(clojure.core/defn- deser-file-share-client-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-ipv-4-address-cidr coll))) input))

(clojure.core/defn- deser-gateway-state [input] input)

(clojure.core/defn- deser-domain-name [input] input)

(clojure.core/defn- deser-vtl-device-vendor [input] input)

(clojure.core/defn- deser-initiators [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-initiator coll))) input))

(clojure.core/defn- deser-gateway-type [input] input)

(clojure.core/defn- deser-storage-class [input] input)

(clojure.core/defn- deser-file-share-arn [input] input)

(clojure.core/defn- deser-gateway-timezone [input] input)

(clojure.core/defn- deser-file-share-user [input] input)

(clojure.core/defn- deser-storedi-scsi-volume [input] (clojure.core/cond-> {} (clojure.core/contains? input "VolumeiSCSIAttributes") (clojure.core/assoc :volumei-scsi-attributes (deser-volumei-scsi-attributes (input "VolumeiSCSIAttributes"))) (clojure.core/contains? input "SourceSnapshotId") (clojure.core/assoc :source-snapshot-id (deser-snapshot-id (input "SourceSnapshotId"))) (clojure.core/contains? input "VolumeAttachmentStatus") (clojure.core/assoc :volume-attachment-status (deser-volume-attachment-status (input "VolumeAttachmentStatus"))) (clojure.core/contains? input "VolumeUsedInBytes") (clojure.core/assoc :volume-used-in-bytes (deser-volume-used-in-bytes (input "VolumeUsedInBytes"))) (clojure.core/contains? input "VolumeDiskId") (clojure.core/assoc :volume-disk-id (deser-disk-id (input "VolumeDiskId"))) (clojure.core/contains? input "KMSKey") (clojure.core/assoc :kms-key (deser-kms-key (input "KMSKey"))) (clojure.core/contains? input "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (input "VolumeARN"))) (clojure.core/contains? input "PreservedExistingData") (clojure.core/assoc :preserved-existing-data (deserboolean (input "PreservedExistingData"))) (clojure.core/contains? input "CreatedDate") (clojure.core/assoc :created-date (deser-created-date (input "CreatedDate"))) (clojure.core/contains? input "VolumeSizeInBytes") (clojure.core/assoc :volume-size-in-bytes (deserlong (input "VolumeSizeInBytes"))) (clojure.core/contains? input "VolumeType") (clojure.core/assoc :volume-type (deser-volume-type (input "VolumeType"))) (clojure.core/contains? input "VolumeId") (clojure.core/assoc :volume-id (deser-volume-id (input "VolumeId"))) (clojure.core/contains? input "TargetName") (clojure.core/assoc :target-name (deser-target-name (input "TargetName"))) (clojure.core/contains? input "VolumeStatus") (clojure.core/assoc :volume-status (deser-volume-status (input "VolumeStatus"))) (clojure.core/contains? input "VolumeProgress") (clojure.core/assoc :volume-progress (deser-double-object (input "VolumeProgress")))))

(clojure.core/defn- deser-tape-archives [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tape-archive coll))) input))

(clojure.core/defn- deser-initiator [input] input)

(clojure.core/defn- deser-tape-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (input "TapeARN"))) (clojure.core/contains? input "TapeBarcode") (clojure.core/assoc :tape-barcode (deser-tape-barcode (input "TapeBarcode"))) (clojure.core/contains? input "TapeSizeInBytes") (clojure.core/assoc :tape-size-in-bytes (deser-tape-size (input "TapeSizeInBytes"))) (clojure.core/contains? input "TapeStatus") (clojure.core/assoc :tape-status (deser-tape-status (input "TapeStatus"))) (clojure.core/contains? input "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (input "GatewayARN")))))

(clojure.core/defn- deser-volume-status [input] input)

(clojure.core/defn- deser-resource-arn [input] input)

(clojure.core/defn- deser-tapes [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-tape coll))) input))

(clojure.core/defn- deser-smb-file-share-info-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-smb-file-share-info coll))) input))

(clojure.core/defn- deser-gateway-arn [input] input)

(clojure.core/defn- deser-nfs-file-share-defaults [input] (clojure.core/cond-> {} (clojure.core/contains? input "FileMode") (clojure.core/assoc :file-mode (deser-permission-mode (input "FileMode"))) (clojure.core/contains? input "DirectoryMode") (clojure.core/assoc :directory-mode (deser-permission-mode (input "DirectoryMode"))) (clojure.core/contains? input "GroupId") (clojure.core/assoc :group-id (deser-permission-id (input "GroupId"))) (clojure.core/contains? input "OwnerId") (clojure.core/assoc :owner-id (deser-permission-id (input "OwnerId")))))

(clojure.core/defn- deser-time [input] input)

(clojure.core/defn- deser-disk-attribute [input] input)

(clojure.core/defn- deser-snapshot-id [input] input)

(clojure.core/defn- deser-tape-size [input] input)

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-squash [input] input)

(clojure.core/defn- response-join-domain-output ([input] (response-join-domain-output nil input)) ([resultWrapper2092056 input] (clojure.core/let [rawinput2092055 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092057 {"GatewayARN" (rawinput2092055 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092057 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092057 ["GatewayARN"])))))))

(clojure.core/defn- response-activate-gateway-output ([input] (response-activate-gateway-output nil input)) ([resultWrapper2092059 input] (clojure.core/let [rawinput2092058 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092060 {"GatewayARN" (rawinput2092058 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092060 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092060 ["GatewayARN"])))))))

(clojure.core/defn- response-list-volume-initiators-output ([input] (response-list-volume-initiators-output nil input)) ([resultWrapper2092062 input] (clojure.core/let [rawinput2092061 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092063 {"Initiators" (rawinput2092061 "Initiators")}] (clojure.core/cond-> {} (letvar2092063 "Initiators") (clojure.core/assoc :initiators (deser-initiators (clojure.core/get-in letvar2092063 ["Initiators"])))))))

(clojure.core/defn- response-describe-bandwidth-rate-limit-output ([input] (response-describe-bandwidth-rate-limit-output nil input)) ([resultWrapper2092065 input] (clojure.core/let [rawinput2092064 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092066 {"GatewayARN" (rawinput2092064 "GatewayARN"), "AverageUploadRateLimitInBitsPerSec" (rawinput2092064 "AverageUploadRateLimitInBitsPerSec"), "AverageDownloadRateLimitInBitsPerSec" (rawinput2092064 "AverageDownloadRateLimitInBitsPerSec")}] (clojure.core/cond-> {} (letvar2092066 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092066 ["GatewayARN"]))) (letvar2092066 "AverageUploadRateLimitInBitsPerSec") (clojure.core/assoc :average-upload-rate-limit-in-bits-per-sec (deser-bandwidth-upload-rate-limit (clojure.core/get-in letvar2092066 ["AverageUploadRateLimitInBitsPerSec"]))) (letvar2092066 "AverageDownloadRateLimitInBitsPerSec") (clojure.core/assoc :average-download-rate-limit-in-bits-per-sec (deser-bandwidth-download-rate-limit (clojure.core/get-in letvar2092066 ["AverageDownloadRateLimitInBitsPerSec"])))))))

(clojure.core/defn- response-list-volume-recovery-points-output ([input] (response-list-volume-recovery-points-output nil input)) ([resultWrapper2092068 input] (clojure.core/let [rawinput2092067 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092069 {"GatewayARN" (rawinput2092067 "GatewayARN"), "VolumeRecoveryPointInfos" (rawinput2092067 "VolumeRecoveryPointInfos")}] (clojure.core/cond-> {} (letvar2092069 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092069 ["GatewayARN"]))) (letvar2092069 "VolumeRecoveryPointInfos") (clojure.core/assoc :volume-recovery-point-infos (deser-volume-recovery-point-infos (clojure.core/get-in letvar2092069 ["VolumeRecoveryPointInfos"])))))))

(clojure.core/defn- response-describe-tape-recovery-points-output ([input] (response-describe-tape-recovery-points-output nil input)) ([resultWrapper2092071 input] (clojure.core/let [rawinput2092070 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092072 {"GatewayARN" (rawinput2092070 "GatewayARN"), "TapeRecoveryPointInfos" (rawinput2092070 "TapeRecoveryPointInfos"), "Marker" (rawinput2092070 "Marker")}] (clojure.core/cond-> {} (letvar2092072 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092072 ["GatewayARN"]))) (letvar2092072 "TapeRecoveryPointInfos") (clojure.core/assoc :tape-recovery-point-infos (deser-tape-recovery-point-infos (clojure.core/get-in letvar2092072 ["TapeRecoveryPointInfos"]))) (letvar2092072 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar2092072 ["Marker"])))))))

(clojure.core/defn- response-update-gateway-software-now-output ([input] (response-update-gateway-software-now-output nil input)) ([resultWrapper2092074 input] (clojure.core/let [rawinput2092073 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092075 {"GatewayARN" (rawinput2092073 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092075 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092075 ["GatewayARN"])))))))

(clojure.core/defn- response-start-gateway-output ([input] (response-start-gateway-output nil input)) ([resultWrapper2092077 input] (clojure.core/let [rawinput2092076 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092078 {"GatewayARN" (rawinput2092076 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092078 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092078 ["GatewayARN"])))))))

(clojure.core/defn- response-create-storedi-scsi-volume-output ([input] (response-create-storedi-scsi-volume-output nil input)) ([resultWrapper2092080 input] (clojure.core/let [rawinput2092079 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092081 {"VolumeARN" (rawinput2092079 "VolumeARN"), "VolumeSizeInBytes" (rawinput2092079 "VolumeSizeInBytes"), "TargetARN" (rawinput2092079 "TargetARN")}] (clojure.core/cond-> {} (letvar2092081 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar2092081 ["VolumeARN"]))) (letvar2092081 "VolumeSizeInBytes") (clojure.core/assoc :volume-size-in-bytes (deserlong (clojure.core/get-in letvar2092081 ["VolumeSizeInBytes"]))) (letvar2092081 "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (clojure.core/get-in letvar2092081 ["TargetARN"])))))))

(clojure.core/defn- response-delete-tape-archive-output ([input] (response-delete-tape-archive-output nil input)) ([resultWrapper2092083 input] (clojure.core/let [rawinput2092082 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092084 {"TapeARN" (rawinput2092082 "TapeARN")}] (clojure.core/cond-> {} (letvar2092084 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar2092084 ["TapeARN"])))))))

(clojure.core/defn- response-describe-cache-output ([input] (response-describe-cache-output nil input)) ([resultWrapper2092086 input] (clojure.core/let [rawinput2092085 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092087 {"GatewayARN" (rawinput2092085 "GatewayARN"), "DiskIds" (rawinput2092085 "DiskIds"), "CacheAllocatedInBytes" (rawinput2092085 "CacheAllocatedInBytes"), "CacheUsedPercentage" (rawinput2092085 "CacheUsedPercentage"), "CacheDirtyPercentage" (rawinput2092085 "CacheDirtyPercentage"), "CacheHitPercentage" (rawinput2092085 "CacheHitPercentage"), "CacheMissPercentage" (rawinput2092085 "CacheMissPercentage")}] (clojure.core/cond-> {} (letvar2092087 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092087 ["GatewayARN"]))) (letvar2092087 "DiskIds") (clojure.core/assoc :disk-ids (deser-disk-ids (clojure.core/get-in letvar2092087 ["DiskIds"]))) (letvar2092087 "CacheAllocatedInBytes") (clojure.core/assoc :cache-allocated-in-bytes (deserlong (clojure.core/get-in letvar2092087 ["CacheAllocatedInBytes"]))) (letvar2092087 "CacheUsedPercentage") (clojure.core/assoc :cache-used-percentage (deserdouble (clojure.core/get-in letvar2092087 ["CacheUsedPercentage"]))) (letvar2092087 "CacheDirtyPercentage") (clojure.core/assoc :cache-dirty-percentage (deserdouble (clojure.core/get-in letvar2092087 ["CacheDirtyPercentage"]))) (letvar2092087 "CacheHitPercentage") (clojure.core/assoc :cache-hit-percentage (deserdouble (clojure.core/get-in letvar2092087 ["CacheHitPercentage"]))) (letvar2092087 "CacheMissPercentage") (clojure.core/assoc :cache-miss-percentage (deserdouble (clojure.core/get-in letvar2092087 ["CacheMissPercentage"])))))))

(clojure.core/defn- response-describe-upload-buffer-output ([input] (response-describe-upload-buffer-output nil input)) ([resultWrapper2092089 input] (clojure.core/let [rawinput2092088 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092090 {"GatewayARN" (rawinput2092088 "GatewayARN"), "DiskIds" (rawinput2092088 "DiskIds"), "UploadBufferUsedInBytes" (rawinput2092088 "UploadBufferUsedInBytes"), "UploadBufferAllocatedInBytes" (rawinput2092088 "UploadBufferAllocatedInBytes")}] (clojure.core/cond-> {} (letvar2092090 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092090 ["GatewayARN"]))) (letvar2092090 "DiskIds") (clojure.core/assoc :disk-ids (deser-disk-ids (clojure.core/get-in letvar2092090 ["DiskIds"]))) (letvar2092090 "UploadBufferUsedInBytes") (clojure.core/assoc :upload-buffer-used-in-bytes (deserlong (clojure.core/get-in letvar2092090 ["UploadBufferUsedInBytes"]))) (letvar2092090 "UploadBufferAllocatedInBytes") (clojure.core/assoc :upload-buffer-allocated-in-bytes (deserlong (clojure.core/get-in letvar2092090 ["UploadBufferAllocatedInBytes"])))))))

(clojure.core/defn- response-describe-tape-archives-output ([input] (response-describe-tape-archives-output nil input)) ([resultWrapper2092092 input] (clojure.core/let [rawinput2092091 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092093 {"TapeArchives" (rawinput2092091 "TapeArchives"), "Marker" (rawinput2092091 "Marker")}] (clojure.core/cond-> {} (letvar2092093 "TapeArchives") (clojure.core/assoc :tape-archives (deser-tape-archives (clojure.core/get-in letvar2092093 ["TapeArchives"]))) (letvar2092093 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar2092093 ["Marker"])))))))

(clojure.core/defn- response-cancel-archival-output ([input] (response-cancel-archival-output nil input)) ([resultWrapper2092095 input] (clojure.core/let [rawinput2092094 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092096 {"TapeARN" (rawinput2092094 "TapeARN")}] (clojure.core/cond-> {} (letvar2092096 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar2092096 ["TapeARN"])))))))

(clojure.core/defn- response-shutdown-gateway-output ([input] (response-shutdown-gateway-output nil input)) ([resultWrapper2092098 input] (clojure.core/let [rawinput2092097 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092099 {"GatewayARN" (rawinput2092097 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092099 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092099 ["GatewayARN"])))))))

(clojure.core/defn- response-update-vtl-device-type-output ([input] (response-update-vtl-device-type-output nil input)) ([resultWrapper2092101 input] (clojure.core/let [rawinput2092100 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092102 {"VTLDeviceARN" (rawinput2092100 "VTLDeviceARN")}] (clojure.core/cond-> {} (letvar2092102 "VTLDeviceARN") (clojure.core/assoc :vtl-device-arn (deser-vtl-device-arn (clojure.core/get-in letvar2092102 ["VTLDeviceARN"])))))))

(clojure.core/defn- response-update-bandwidth-rate-limit-output ([input] (response-update-bandwidth-rate-limit-output nil input)) ([resultWrapper2092104 input] (clojure.core/let [rawinput2092103 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092105 {"GatewayARN" (rawinput2092103 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092105 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092105 ["GatewayARN"])))))))

(clojure.core/defn- response-delete-chap-credentials-output ([input] (response-delete-chap-credentials-output nil input)) ([resultWrapper2092107 input] (clojure.core/let [rawinput2092106 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092108 {"TargetARN" (rawinput2092106 "TargetARN"), "InitiatorName" (rawinput2092106 "InitiatorName")}] (clojure.core/cond-> {} (letvar2092108 "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (clojure.core/get-in letvar2092108 ["TargetARN"]))) (letvar2092108 "InitiatorName") (clojure.core/assoc :initiator-name (deser-iqn-name (clojure.core/get-in letvar2092108 ["InitiatorName"])))))))

(clojure.core/defn- response-describe-chap-credentials-output ([input] (response-describe-chap-credentials-output nil input)) ([resultWrapper2092110 input] (clojure.core/let [rawinput2092109 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092111 {"ChapCredentials" (rawinput2092109 "ChapCredentials")}] (clojure.core/cond-> {} (letvar2092111 "ChapCredentials") (clojure.core/assoc :chap-credentials (deser-chap-credentials (clojure.core/get-in letvar2092111 ["ChapCredentials"])))))))

(clojure.core/defn- response-refresh-cache-output ([input] (response-refresh-cache-output nil input)) ([resultWrapper2092113 input] (clojure.core/let [rawinput2092112 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092114 {"FileShareARN" (rawinput2092112 "FileShareARN"), "NotificationId" (rawinput2092112 "NotificationId")}] (clojure.core/cond-> {} (letvar2092114 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar2092114 ["FileShareARN"]))) (letvar2092114 "NotificationId") (clojure.core/assoc :notification-id (deser-notification-id (clojure.core/get-in letvar2092114 ["NotificationId"])))))))

(clojure.core/defn- response-add-cache-output ([input] (response-add-cache-output nil input)) ([resultWrapper2092116 input] (clojure.core/let [rawinput2092115 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092117 {"GatewayARN" (rawinput2092115 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092117 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092117 ["GatewayARN"])))))))

(clojure.core/defn- response-describe-maintenance-start-time-output ([input] (response-describe-maintenance-start-time-output nil input)) ([resultWrapper2092119 input] (clojure.core/let [rawinput2092118 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092120 {"GatewayARN" (rawinput2092118 "GatewayARN"), "HourOfDay" (rawinput2092118 "HourOfDay"), "MinuteOfHour" (rawinput2092118 "MinuteOfHour"), "DayOfWeek" (rawinput2092118 "DayOfWeek"), "Timezone" (rawinput2092118 "Timezone")}] (clojure.core/cond-> {} (letvar2092120 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092120 ["GatewayARN"]))) (letvar2092120 "HourOfDay") (clojure.core/assoc :hour-of-day (deser-hour-of-day (clojure.core/get-in letvar2092120 ["HourOfDay"]))) (letvar2092120 "MinuteOfHour") (clojure.core/assoc :minute-of-hour (deser-minute-of-hour (clojure.core/get-in letvar2092120 ["MinuteOfHour"]))) (letvar2092120 "DayOfWeek") (clojure.core/assoc :day-of-week (deser-day-of-week (clojure.core/get-in letvar2092120 ["DayOfWeek"]))) (letvar2092120 "Timezone") (clojure.core/assoc :timezone (deser-gateway-timezone (clojure.core/get-in letvar2092120 ["Timezone"])))))))

(clojure.core/defn- response-create-tapes-output ([input] (response-create-tapes-output nil input)) ([resultWrapper2092122 input] (clojure.core/let [rawinput2092121 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092123 {"TapeARNs" (rawinput2092121 "TapeARNs")}] (clojure.core/cond-> {} (letvar2092123 "TapeARNs") (clojure.core/assoc :tape-ar-ns (deser-tape-ar-ns (clojure.core/get-in letvar2092123 ["TapeARNs"])))))))

(clojure.core/defn- response-set-smb-guest-password-output ([input] (response-set-smb-guest-password-output nil input)) ([resultWrapper2092125 input] (clojure.core/let [rawinput2092124 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092126 {"GatewayARN" (rawinput2092124 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092126 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092126 ["GatewayARN"])))))))

(clojure.core/defn- response-create-snapshot-from-volume-recovery-point-output ([input] (response-create-snapshot-from-volume-recovery-point-output nil input)) ([resultWrapper2092128 input] (clojure.core/let [rawinput2092127 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092129 {"SnapshotId" (rawinput2092127 "SnapshotId"), "VolumeARN" (rawinput2092127 "VolumeARN"), "VolumeRecoveryPointTime" (rawinput2092127 "VolumeRecoveryPointTime")}] (clojure.core/cond-> {} (letvar2092129 "SnapshotId") (clojure.core/assoc :snapshot-id (deser-snapshot-id (clojure.core/get-in letvar2092129 ["SnapshotId"]))) (letvar2092129 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar2092129 ["VolumeARN"]))) (letvar2092129 "VolumeRecoveryPointTime") (clojure.core/assoc :volume-recovery-point-time (deserstring (clojure.core/get-in letvar2092129 ["VolumeRecoveryPointTime"])))))))

(clojure.core/defn- response-cancel-retrieval-output ([input] (response-cancel-retrieval-output nil input)) ([resultWrapper2092131 input] (clojure.core/let [rawinput2092130 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092132 {"TapeARN" (rawinput2092130 "TapeARN")}] (clojure.core/cond-> {} (letvar2092132 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar2092132 ["TapeARN"])))))))

(clojure.core/defn- response-list-local-disks-output ([input] (response-list-local-disks-output nil input)) ([resultWrapper2092134 input] (clojure.core/let [rawinput2092133 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092135 {"GatewayARN" (rawinput2092133 "GatewayARN"), "Disks" (rawinput2092133 "Disks")}] (clojure.core/cond-> {} (letvar2092135 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092135 ["GatewayARN"]))) (letvar2092135 "Disks") (clojure.core/assoc :disks (deser-disks (clojure.core/get-in letvar2092135 ["Disks"])))))))

(clojure.core/defn- response-create-snapshot-output ([input] (response-create-snapshot-output nil input)) ([resultWrapper2092137 input] (clojure.core/let [rawinput2092136 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092138 {"VolumeARN" (rawinput2092136 "VolumeARN"), "SnapshotId" (rawinput2092136 "SnapshotId")}] (clojure.core/cond-> {} (letvar2092138 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar2092138 ["VolumeARN"]))) (letvar2092138 "SnapshotId") (clojure.core/assoc :snapshot-id (deser-snapshot-id (clojure.core/get-in letvar2092138 ["SnapshotId"])))))))

(clojure.core/defn- response-describe-gateway-information-output ([input] (response-describe-gateway-information-output nil input)) ([resultWrapper2092140 input] (clojure.core/let [rawinput2092139 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092141 {"LastSoftwareUpdate" (rawinput2092139 "LastSoftwareUpdate"), "NextUpdateAvailabilityDate" (rawinput2092139 "NextUpdateAvailabilityDate"), "GatewayNetworkInterfaces" (rawinput2092139 "GatewayNetworkInterfaces"), "Tags" (rawinput2092139 "Tags"), "GatewayName" (rawinput2092139 "GatewayName"), "GatewayId" (rawinput2092139 "GatewayId"), "GatewayState" (rawinput2092139 "GatewayState"), "GatewayType" (rawinput2092139 "GatewayType"), "GatewayTimezone" (rawinput2092139 "GatewayTimezone"), "GatewayARN" (rawinput2092139 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092141 "LastSoftwareUpdate") (clojure.core/assoc :last-software-update (deser-last-software-update (clojure.core/get-in letvar2092141 ["LastSoftwareUpdate"]))) (letvar2092141 "NextUpdateAvailabilityDate") (clojure.core/assoc :next-update-availability-date (deser-next-update-availability-date (clojure.core/get-in letvar2092141 ["NextUpdateAvailabilityDate"]))) (letvar2092141 "GatewayNetworkInterfaces") (clojure.core/assoc :gateway-network-interfaces (deser-gateway-network-interfaces (clojure.core/get-in letvar2092141 ["GatewayNetworkInterfaces"]))) (letvar2092141 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar2092141 ["Tags"]))) (letvar2092141 "GatewayName") (clojure.core/assoc :gateway-name (deserstring (clojure.core/get-in letvar2092141 ["GatewayName"]))) (letvar2092141 "GatewayId") (clojure.core/assoc :gateway-id (deser-gateway-id (clojure.core/get-in letvar2092141 ["GatewayId"]))) (letvar2092141 "GatewayState") (clojure.core/assoc :gateway-state (deser-gateway-state (clojure.core/get-in letvar2092141 ["GatewayState"]))) (letvar2092141 "GatewayType") (clojure.core/assoc :gateway-type (deser-gateway-type (clojure.core/get-in letvar2092141 ["GatewayType"]))) (letvar2092141 "GatewayTimezone") (clojure.core/assoc :gateway-timezone (deser-gateway-timezone (clojure.core/get-in letvar2092141 ["GatewayTimezone"]))) (letvar2092141 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092141 ["GatewayARN"])))))))

(clojure.core/defn- response-create-smb-file-share-output ([input] (response-create-smb-file-share-output nil input)) ([resultWrapper2092143 input] (clojure.core/let [rawinput2092142 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092144 {"FileShareARN" (rawinput2092142 "FileShareARN")}] (clojure.core/cond-> {} (letvar2092144 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar2092144 ["FileShareARN"])))))))

(clojure.core/defn- response-add-upload-buffer-output ([input] (response-add-upload-buffer-output nil input)) ([resultWrapper2092146 input] (clojure.core/let [rawinput2092145 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092147 {"GatewayARN" (rawinput2092145 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092147 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092147 ["GatewayARN"])))))))

(clojure.core/defn- response-describe-storedi-scsi-volumes-output ([input] (response-describe-storedi-scsi-volumes-output nil input)) ([resultWrapper2092149 input] (clojure.core/let [rawinput2092148 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092150 {"StorediSCSIVolumes" (rawinput2092148 "StorediSCSIVolumes")}] (clojure.core/cond-> {} (letvar2092150 "StorediSCSIVolumes") (clojure.core/assoc :storedi-scsi-volumes (deser-storedi-scsi-volumes (clojure.core/get-in letvar2092150 ["StorediSCSIVolumes"])))))))

(clojure.core/defn- response-list-volumes-output ([input] (response-list-volumes-output nil input)) ([resultWrapper2092152 input] (clojure.core/let [rawinput2092151 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092153 {"GatewayARN" (rawinput2092151 "GatewayARN"), "Marker" (rawinput2092151 "Marker"), "VolumeInfos" (rawinput2092151 "VolumeInfos")}] (clojure.core/cond-> {} (letvar2092153 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092153 ["GatewayARN"]))) (letvar2092153 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar2092153 ["Marker"]))) (letvar2092153 "VolumeInfos") (clojure.core/assoc :volume-infos (deser-volume-infos (clojure.core/get-in letvar2092153 ["VolumeInfos"])))))))

(clojure.core/defn- response-disable-gateway-output ([input] (response-disable-gateway-output nil input)) ([resultWrapper2092155 input] (clojure.core/let [rawinput2092154 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092156 {"GatewayARN" (rawinput2092154 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092156 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092156 ["GatewayARN"])))))))

(clojure.core/defn- response-list-file-shares-output ([input] (response-list-file-shares-output nil input)) ([resultWrapper2092158 input] (clojure.core/let [rawinput2092157 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092159 {"Marker" (rawinput2092157 "Marker"), "NextMarker" (rawinput2092157 "NextMarker"), "FileShareInfoList" (rawinput2092157 "FileShareInfoList")}] (clojure.core/cond-> {} (letvar2092159 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar2092159 ["Marker"]))) (letvar2092159 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar2092159 ["NextMarker"]))) (letvar2092159 "FileShareInfoList") (clojure.core/assoc :file-share-info-list (deser-file-share-info-list (clojure.core/get-in letvar2092159 ["FileShareInfoList"])))))))

(clojure.core/defn- response-remove-tags-from-resource-output ([input] (response-remove-tags-from-resource-output nil input)) ([resultWrapper2092161 input] (clojure.core/let [rawinput2092160 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092162 {"ResourceARN" (rawinput2092160 "ResourceARN")}] (clojure.core/cond-> {} (letvar2092162 "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (clojure.core/get-in letvar2092162 ["ResourceARN"])))))))

(clojure.core/defn- response-delete-snapshot-schedule-output ([input] (response-delete-snapshot-schedule-output nil input)) ([resultWrapper2092164 input] (clojure.core/let [rawinput2092163 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092165 {"VolumeARN" (rawinput2092163 "VolumeARN")}] (clojure.core/cond-> {} (letvar2092165 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar2092165 ["VolumeARN"])))))))

(clojure.core/defn- response-describe-smb-settings-output ([input] (response-describe-smb-settings-output nil input)) ([resultWrapper2092167 input] (clojure.core/let [rawinput2092166 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092168 {"GatewayARN" (rawinput2092166 "GatewayARN"), "DomainName" (rawinput2092166 "DomainName"), "SMBGuestPasswordSet" (rawinput2092166 "SMBGuestPasswordSet")}] (clojure.core/cond-> {} (letvar2092168 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092168 ["GatewayARN"]))) (letvar2092168 "DomainName") (clojure.core/assoc :domain-name (deser-domain-name (clojure.core/get-in letvar2092168 ["DomainName"]))) (letvar2092168 "SMBGuestPasswordSet") (clojure.core/assoc :smb-guest-password-set (deser-boolean (clojure.core/get-in letvar2092168 ["SMBGuestPasswordSet"])))))))

(clojure.core/defn- response-delete-bandwidth-rate-limit-output ([input] (response-delete-bandwidth-rate-limit-output nil input)) ([resultWrapper2092170 input] (clojure.core/let [rawinput2092169 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092171 {"GatewayARN" (rawinput2092169 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092171 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092171 ["GatewayARN"])))))))

(clojure.core/defn- response-update-maintenance-start-time-output ([input] (response-update-maintenance-start-time-output nil input)) ([resultWrapper2092173 input] (clojure.core/let [rawinput2092172 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092174 {"GatewayARN" (rawinput2092172 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092174 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092174 ["GatewayARN"])))))))

(clojure.core/defn- response-delete-gateway-output ([input] (response-delete-gateway-output nil input)) ([resultWrapper2092176 input] (clojure.core/let [rawinput2092175 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092177 {"GatewayARN" (rawinput2092175 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092177 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092177 ["GatewayARN"])))))))

(clojure.core/defn- response-list-gateways-output ([input] (response-list-gateways-output nil input)) ([resultWrapper2092179 input] (clojure.core/let [rawinput2092178 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092180 {"Gateways" (rawinput2092178 "Gateways"), "Marker" (rawinput2092178 "Marker")}] (clojure.core/cond-> {} (letvar2092180 "Gateways") (clojure.core/assoc :gateways (deser-gateways (clojure.core/get-in letvar2092180 ["Gateways"]))) (letvar2092180 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar2092180 ["Marker"])))))))

(clojure.core/defn- response-update-nfs-file-share-output ([input] (response-update-nfs-file-share-output nil input)) ([resultWrapper2092182 input] (clojure.core/let [rawinput2092181 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092183 {"FileShareARN" (rawinput2092181 "FileShareARN")}] (clojure.core/cond-> {} (letvar2092183 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar2092183 ["FileShareARN"])))))))

(clojure.core/defn- response-update-gateway-information-output ([input] (response-update-gateway-information-output nil input)) ([resultWrapper2092185 input] (clojure.core/let [rawinput2092184 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092186 {"GatewayARN" (rawinput2092184 "GatewayARN"), "GatewayName" (rawinput2092184 "GatewayName")}] (clojure.core/cond-> {} (letvar2092186 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092186 ["GatewayARN"]))) (letvar2092186 "GatewayName") (clojure.core/assoc :gateway-name (deserstring (clojure.core/get-in letvar2092186 ["GatewayName"])))))))

(clojure.core/defn- response-service-unavailable-error ([input] (response-service-unavailable-error nil input)) ([resultWrapper2092188 input] (clojure.core/let [rawinput2092187 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092189 {"message" (rawinput2092187 "message"), "error" (rawinput2092187 "error")}] (clojure.core/cond-> {} (letvar2092189 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar2092189 ["message"]))) (letvar2092189 "error") (clojure.core/assoc :error (deser-storage-gateway-error (clojure.core/get-in letvar2092189 ["error"])))))))

(clojure.core/defn- response-describe-nfs-file-shares-output ([input] (response-describe-nfs-file-shares-output nil input)) ([resultWrapper2092191 input] (clojure.core/let [rawinput2092190 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092192 {"NFSFileShareInfoList" (rawinput2092190 "NFSFileShareInfoList")}] (clojure.core/cond-> {} (letvar2092192 "NFSFileShareInfoList") (clojure.core/assoc :nfs-file-share-info-list (deser-nfs-file-share-info-list (clojure.core/get-in letvar2092192 ["NFSFileShareInfoList"])))))))

(clojure.core/defn- response-list-tags-for-resource-output ([input] (response-list-tags-for-resource-output nil input)) ([resultWrapper2092194 input] (clojure.core/let [rawinput2092193 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092195 {"ResourceARN" (rawinput2092193 "ResourceARN"), "Marker" (rawinput2092193 "Marker"), "Tags" (rawinput2092193 "Tags")}] (clojure.core/cond-> {} (letvar2092195 "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (clojure.core/get-in letvar2092195 ["ResourceARN"]))) (letvar2092195 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar2092195 ["Marker"]))) (letvar2092195 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar2092195 ["Tags"])))))))

(clojure.core/defn- response-attach-volume-output ([input] (response-attach-volume-output nil input)) ([resultWrapper2092197 input] (clojure.core/let [rawinput2092196 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092198 {"VolumeARN" (rawinput2092196 "VolumeARN"), "TargetARN" (rawinput2092196 "TargetARN")}] (clojure.core/cond-> {} (letvar2092198 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar2092198 ["VolumeARN"]))) (letvar2092198 "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (clojure.core/get-in letvar2092198 ["TargetARN"])))))))

(clojure.core/defn- response-reset-cache-output ([input] (response-reset-cache-output nil input)) ([resultWrapper2092200 input] (clojure.core/let [rawinput2092199 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092201 {"GatewayARN" (rawinput2092199 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092201 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092201 ["GatewayARN"])))))))

(clojure.core/defn- response-describe-snapshot-schedule-output ([input] (response-describe-snapshot-schedule-output nil input)) ([resultWrapper2092203 input] (clojure.core/let [rawinput2092202 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092204 {"VolumeARN" (rawinput2092202 "VolumeARN"), "StartAt" (rawinput2092202 "StartAt"), "RecurrenceInHours" (rawinput2092202 "RecurrenceInHours"), "Description" (rawinput2092202 "Description"), "Timezone" (rawinput2092202 "Timezone")}] (clojure.core/cond-> {} (letvar2092204 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar2092204 ["VolumeARN"]))) (letvar2092204 "StartAt") (clojure.core/assoc :start-at (deser-hour-of-day (clojure.core/get-in letvar2092204 ["StartAt"]))) (letvar2092204 "RecurrenceInHours") (clojure.core/assoc :recurrence-in-hours (deser-recurrence-in-hours (clojure.core/get-in letvar2092204 ["RecurrenceInHours"]))) (letvar2092204 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar2092204 ["Description"]))) (letvar2092204 "Timezone") (clojure.core/assoc :timezone (deser-gateway-timezone (clojure.core/get-in letvar2092204 ["Timezone"])))))))

(clojure.core/defn- response-retrieve-tape-archive-output ([input] (response-retrieve-tape-archive-output nil input)) ([resultWrapper2092206 input] (clojure.core/let [rawinput2092205 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092207 {"TapeARN" (rawinput2092205 "TapeARN")}] (clojure.core/cond-> {} (letvar2092207 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar2092207 ["TapeARN"])))))))

(clojure.core/defn- response-describe-vtl-devices-output ([input] (response-describe-vtl-devices-output nil input)) ([resultWrapper2092209 input] (clojure.core/let [rawinput2092208 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092210 {"GatewayARN" (rawinput2092208 "GatewayARN"), "VTLDevices" (rawinput2092208 "VTLDevices"), "Marker" (rawinput2092208 "Marker")}] (clojure.core/cond-> {} (letvar2092210 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092210 ["GatewayARN"]))) (letvar2092210 "VTLDevices") (clojure.core/assoc :vtl-devices (deser-vtl-devices (clojure.core/get-in letvar2092210 ["VTLDevices"]))) (letvar2092210 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar2092210 ["Marker"])))))))

(clojure.core/defn- response-add-tags-to-resource-output ([input] (response-add-tags-to-resource-output nil input)) ([resultWrapper2092212 input] (clojure.core/let [rawinput2092211 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092213 {"ResourceARN" (rawinput2092211 "ResourceARN")}] (clojure.core/cond-> {} (letvar2092213 "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (clojure.core/get-in letvar2092213 ["ResourceARN"])))))))

(clojure.core/defn- response-delete-tape-output ([input] (response-delete-tape-output nil input)) ([resultWrapper2092215 input] (clojure.core/let [rawinput2092214 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092216 {"TapeARN" (rawinput2092214 "TapeARN")}] (clojure.core/cond-> {} (letvar2092216 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar2092216 ["TapeARN"])))))))

(clojure.core/defn- response-retrieve-tape-recovery-point-output ([input] (response-retrieve-tape-recovery-point-output nil input)) ([resultWrapper2092218 input] (clojure.core/let [rawinput2092217 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092219 {"TapeARN" (rawinput2092217 "TapeARN")}] (clojure.core/cond-> {} (letvar2092219 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar2092219 ["TapeARN"])))))))

(clojure.core/defn- response-notify-when-uploaded-output ([input] (response-notify-when-uploaded-output nil input)) ([resultWrapper2092221 input] (clojure.core/let [rawinput2092220 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092222 {"FileShareARN" (rawinput2092220 "FileShareARN"), "NotificationId" (rawinput2092220 "NotificationId")}] (clojure.core/cond-> {} (letvar2092222 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar2092222 ["FileShareARN"]))) (letvar2092222 "NotificationId") (clojure.core/assoc :notification-id (deser-notification-id (clojure.core/get-in letvar2092222 ["NotificationId"])))))))

(clojure.core/defn- response-delete-file-share-output ([input] (response-delete-file-share-output nil input)) ([resultWrapper2092224 input] (clojure.core/let [rawinput2092223 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092225 {"FileShareARN" (rawinput2092223 "FileShareARN")}] (clojure.core/cond-> {} (letvar2092225 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar2092225 ["FileShareARN"])))))))

(clojure.core/defn- response-describe-cachedi-scsi-volumes-output ([input] (response-describe-cachedi-scsi-volumes-output nil input)) ([resultWrapper2092227 input] (clojure.core/let [rawinput2092226 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092228 {"CachediSCSIVolumes" (rawinput2092226 "CachediSCSIVolumes")}] (clojure.core/cond-> {} (letvar2092228 "CachediSCSIVolumes") (clojure.core/assoc :cachedi-scsi-volumes (deser-cachedi-scsi-volumes (clojure.core/get-in letvar2092228 ["CachediSCSIVolumes"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper2092230 input] (clojure.core/let [rawinput2092229 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092231 {"message" (rawinput2092229 "message"), "error" (rawinput2092229 "error")}] (clojure.core/cond-> {} (letvar2092231 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar2092231 ["message"]))) (letvar2092231 "error") (clojure.core/assoc :error (deser-storage-gateway-error (clojure.core/get-in letvar2092231 ["error"])))))))

(clojure.core/defn- response-list-tapes-output ([input] (response-list-tapes-output nil input)) ([resultWrapper2092233 input] (clojure.core/let [rawinput2092232 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092234 {"TapeInfos" (rawinput2092232 "TapeInfos"), "Marker" (rawinput2092232 "Marker")}] (clojure.core/cond-> {} (letvar2092234 "TapeInfos") (clojure.core/assoc :tape-infos (deser-tape-infos (clojure.core/get-in letvar2092234 ["TapeInfos"]))) (letvar2092234 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar2092234 ["Marker"])))))))

(clojure.core/defn- response-update-smb-file-share-output ([input] (response-update-smb-file-share-output nil input)) ([resultWrapper2092236 input] (clojure.core/let [rawinput2092235 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092237 {"FileShareARN" (rawinput2092235 "FileShareARN")}] (clojure.core/cond-> {} (letvar2092237 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar2092237 ["FileShareARN"])))))))

(clojure.core/defn- response-update-chap-credentials-output ([input] (response-update-chap-credentials-output nil input)) ([resultWrapper2092239 input] (clojure.core/let [rawinput2092238 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092240 {"TargetARN" (rawinput2092238 "TargetARN"), "InitiatorName" (rawinput2092238 "InitiatorName")}] (clojure.core/cond-> {} (letvar2092240 "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (clojure.core/get-in letvar2092240 ["TargetARN"]))) (letvar2092240 "InitiatorName") (clojure.core/assoc :initiator-name (deser-iqn-name (clojure.core/get-in letvar2092240 ["InitiatorName"])))))))

(clojure.core/defn- response-update-snapshot-schedule-output ([input] (response-update-snapshot-schedule-output nil input)) ([resultWrapper2092242 input] (clojure.core/let [rawinput2092241 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092243 {"VolumeARN" (rawinput2092241 "VolumeARN")}] (clojure.core/cond-> {} (letvar2092243 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar2092243 ["VolumeARN"])))))))

(clojure.core/defn- response-delete-volume-output ([input] (response-delete-volume-output nil input)) ([resultWrapper2092245 input] (clojure.core/let [rawinput2092244 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092246 {"VolumeARN" (rawinput2092244 "VolumeARN")}] (clojure.core/cond-> {} (letvar2092246 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar2092246 ["VolumeARN"])))))))

(clojure.core/defn- response-add-working-storage-output ([input] (response-add-working-storage-output nil input)) ([resultWrapper2092248 input] (clojure.core/let [rawinput2092247 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092249 {"GatewayARN" (rawinput2092247 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092249 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092249 ["GatewayARN"])))))))

(clojure.core/defn- response-create-tape-with-barcode-output ([input] (response-create-tape-with-barcode-output nil input)) ([resultWrapper2092251 input] (clojure.core/let [rawinput2092250 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092252 {"TapeARN" (rawinput2092250 "TapeARN")}] (clojure.core/cond-> {} (letvar2092252 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar2092252 ["TapeARN"])))))))

(clojure.core/defn- response-invalid-gateway-request-exception ([input] (response-invalid-gateway-request-exception nil input)) ([resultWrapper2092254 input] (clojure.core/let [rawinput2092253 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092255 {"message" (rawinput2092253 "message"), "error" (rawinput2092253 "error")}] (clojure.core/cond-> {} (letvar2092255 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar2092255 ["message"]))) (letvar2092255 "error") (clojure.core/assoc :error (deser-storage-gateway-error (clojure.core/get-in letvar2092255 ["error"])))))))

(clojure.core/defn- response-describe-smb-file-shares-output ([input] (response-describe-smb-file-shares-output nil input)) ([resultWrapper2092257 input] (clojure.core/let [rawinput2092256 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092258 {"SMBFileShareInfoList" (rawinput2092256 "SMBFileShareInfoList")}] (clojure.core/cond-> {} (letvar2092258 "SMBFileShareInfoList") (clojure.core/assoc :smb-file-share-info-list (deser-smb-file-share-info-list (clojure.core/get-in letvar2092258 ["SMBFileShareInfoList"])))))))

(clojure.core/defn- response-describe-tapes-output ([input] (response-describe-tapes-output nil input)) ([resultWrapper2092260 input] (clojure.core/let [rawinput2092259 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092261 {"Tapes" (rawinput2092259 "Tapes"), "Marker" (rawinput2092259 "Marker")}] (clojure.core/cond-> {} (letvar2092261 "Tapes") (clojure.core/assoc :tapes (deser-tapes (clojure.core/get-in letvar2092261 ["Tapes"]))) (letvar2092261 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar2092261 ["Marker"])))))))

(clojure.core/defn- response-create-cachedi-scsi-volume-output ([input] (response-create-cachedi-scsi-volume-output nil input)) ([resultWrapper2092263 input] (clojure.core/let [rawinput2092262 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092264 {"VolumeARN" (rawinput2092262 "VolumeARN"), "TargetARN" (rawinput2092262 "TargetARN")}] (clojure.core/cond-> {} (letvar2092264 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar2092264 ["VolumeARN"]))) (letvar2092264 "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (clojure.core/get-in letvar2092264 ["TargetARN"])))))))

(clojure.core/defn- response-set-local-console-password-output ([input] (response-set-local-console-password-output nil input)) ([resultWrapper2092266 input] (clojure.core/let [rawinput2092265 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092267 {"GatewayARN" (rawinput2092265 "GatewayARN")}] (clojure.core/cond-> {} (letvar2092267 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092267 ["GatewayARN"])))))))

(clojure.core/defn- response-create-nfs-file-share-output ([input] (response-create-nfs-file-share-output nil input)) ([resultWrapper2092269 input] (clojure.core/let [rawinput2092268 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092270 {"FileShareARN" (rawinput2092268 "FileShareARN")}] (clojure.core/cond-> {} (letvar2092270 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar2092270 ["FileShareARN"])))))))

(clojure.core/defn- response-describe-working-storage-output ([input] (response-describe-working-storage-output nil input)) ([resultWrapper2092272 input] (clojure.core/let [rawinput2092271 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092273 {"GatewayARN" (rawinput2092271 "GatewayARN"), "DiskIds" (rawinput2092271 "DiskIds"), "WorkingStorageUsedInBytes" (rawinput2092271 "WorkingStorageUsedInBytes"), "WorkingStorageAllocatedInBytes" (rawinput2092271 "WorkingStorageAllocatedInBytes")}] (clojure.core/cond-> {} (letvar2092273 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar2092273 ["GatewayARN"]))) (letvar2092273 "DiskIds") (clojure.core/assoc :disk-ids (deser-disk-ids (clojure.core/get-in letvar2092273 ["DiskIds"]))) (letvar2092273 "WorkingStorageUsedInBytes") (clojure.core/assoc :working-storage-used-in-bytes (deserlong (clojure.core/get-in letvar2092273 ["WorkingStorageUsedInBytes"]))) (letvar2092273 "WorkingStorageAllocatedInBytes") (clojure.core/assoc :working-storage-allocated-in-bytes (deserlong (clojure.core/get-in letvar2092273 ["WorkingStorageAllocatedInBytes"])))))))

(clojure.core/defn- response-detach-volume-output ([input] (response-detach-volume-output nil input)) ([resultWrapper2092275 input] (clojure.core/let [rawinput2092274 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2092276 {"VolumeARN" (rawinput2092274 "VolumeARN")}] (clojure.core/cond-> {} (letvar2092276 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar2092276 ["VolumeARN"])))))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tag-keys (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/tag-key))

(clojure.spec.alpha/def :portkey.aws.storagegateway/minute-of-hour (clojure.spec.alpha/int-in 0 59))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-type #{:nfs :smb "NFS" "SMB"})

(clojure.spec.alpha/def :portkey.aws.storagegateway/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/join-domain-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-volume-recovery-points-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/positive-int-object (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.storagegateway/activate-gateway-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/cancel-retrieval-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/tape-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-volume-initiators-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/initiators]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-recovery-point-infos (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/tape-recovery-point-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/disk-ids (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/disk-id))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-bandwidth-rate-limit-output/average-upload-rate-limit-in-bits-per-sec (clojure.spec.alpha/and :portkey.aws.storagegateway/bandwidth-upload-rate-limit))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-bandwidth-rate-limit-output/average-download-rate-limit-in-bits-per-sec (clojure.spec.alpha/and :portkey.aws.storagegateway/bandwidth-download-rate-limit))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-bandwidth-rate-limit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway.describe-bandwidth-rate-limit-output/average-upload-rate-limit-in-bits-per-sec :portkey.aws.storagegateway.describe-bandwidth-rate-limit-output/average-download-rate-limit-in-bits-per-sec]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.chap-info/secret-to-authenticate-initiator (clojure.spec.alpha/and :portkey.aws.storagegateway/chap-secret))
(clojure.spec.alpha/def :portkey.aws.storagegateway.chap-info/initiator-name (clojure.spec.alpha/and :portkey.aws.storagegateway/iqn-name))
(clojure.spec.alpha/def :portkey.aws.storagegateway.chap-info/secret-to-authenticate-target (clojure.spec.alpha/and :portkey.aws.storagegateway/chap-secret))
(clojure.spec.alpha/def :portkey.aws.storagegateway/chap-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/target-arn :portkey.aws.storagegateway.chap-info/secret-to-authenticate-initiator :portkey.aws.storagegateway.chap-info/initiator-name :portkey.aws.storagegateway.chap-info/secret-to-authenticate-target]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-vtl-devices-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-vtl-devices-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un [:portkey.aws.storagegateway/vtl-device-ar-ns :portkey.aws.storagegateway/marker :portkey.aws.storagegateway.describe-vtl-devices-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/disk-allocation-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 3 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.activate-gateway-input/gateway-region (clojure.spec.alpha/and :portkey.aws.storagegateway/region-id))
(clojure.spec.alpha/def :portkey.aws.storagegateway/activate-gateway-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/activation-key :portkey.aws.storagegateway/gateway-name :portkey.aws.storagegateway/gateway-timezone :portkey.aws.storagegateway.activate-gateway-input/gateway-region] :opt-un [:portkey.aws.storagegateway/gateway-type :portkey.aws.storagegateway/tape-drive-type :portkey.aws.storagegateway/medium-changer-type :portkey.aws.storagegateway/tags]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-bandwidth-rate-limit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-volume-recovery-points-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/volume-recovery-point-infos]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-upload-buffer-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/notification-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.volumei-scsi-attributes/network-interface-port (clojure.spec.alpha/and :portkey.aws.storagegateway/integer))
(clojure.spec.alpha/def :portkey.aws.storagegateway.volumei-scsi-attributes/lun-number (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway.volumei-scsi-attributes/chap-enabled (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/volumei-scsi-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/target-arn :portkey.aws.storagegateway/network-interface-id :portkey.aws.storagegateway.volumei-scsi-attributes/network-interface-port :portkey.aws.storagegateway.volumei-scsi-attributes/lun-number :portkey.aws.storagegateway.volumei-scsi-attributes/chap-enabled]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/double-object clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-recovery-point-info/tape-recovery-point-time (clojure.spec.alpha/and :portkey.aws.storagegateway/time))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-recovery-point-info/tape-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-size))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-recovery-point-info/tape-status (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-recovery-point-status))
(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-recovery-point-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn :portkey.aws.storagegateway.tape-recovery-point-info/tape-recovery-point-time :portkey.aws.storagegateway.tape-recovery-point-info/tape-size-in-bytes :portkey.aws.storagegateway.tape-recovery-point-info/tape-status]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-tape-recovery-points-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/tape-recovery-point-infos :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/hosts (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/host))

(clojure.spec.alpha/def :portkey.aws.storagegateway/last-software-update (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 25))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-type :portkey.aws.storagegateway/file-share-arn :portkey.aws.storagegateway/file-share-id :portkey.aws.storagegateway/file-share-status :portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/start-gateway-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.list-tapes-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/list-tapes-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-ar-ns :portkey.aws.storagegateway/marker :portkey.aws.storagegateway.list-tapes-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-gateway-software-now-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway/bandwidth-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 3 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 25))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-attachment-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 3 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-used-in-bytes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/day-of-week (clojure.spec.alpha/int-in 0 6))

(clojure.spec.alpha/def :portkey.aws.storagegateway/location-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 16 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 310))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.update-chap-credentials-input/secret-to-authenticate-initiator (clojure.spec.alpha/and :portkey.aws.storagegateway/chap-secret))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-chap-credentials-input/initiator-name (clojure.spec.alpha/and :portkey.aws.storagegateway/iqn-name))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-chap-credentials-input/secret-to-authenticate-target (clojure.spec.alpha/and :portkey.aws.storagegateway/chap-secret))
(clojure.spec.alpha/def :portkey.aws.storagegateway/update-chap-credentials-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/target-arn :portkey.aws.storagegateway.update-chap-credentials-input/secret-to-authenticate-initiator :portkey.aws.storagegateway.update-chap-credentials-input/initiator-name] :opt-un [:portkey.aws.storagegateway.update-chap-credentials-input/secret-to-authenticate-target]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-infos (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/volume-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/bandwidth-download-rate-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/storedi-scsi-volumes (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/storedi-scsi-volume))

(clojure.spec.alpha/def :portkey.aws.storagegateway/start-gateway-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-device (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/vtl-device-arn :portkey.aws.storagegateway/vtl-device-type :portkey.aws.storagegateway/vtl-device-vendor :portkey.aws.storagegateway/vtl-device-product-identifier :portkey.aws.storagegateway/devicei-scsi-attributes]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-barcode-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 4)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[A-Z]*$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/next-update-availability-date (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 25))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-tape-archive-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/tape-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.update-bandwidth-rate-limit-input/average-upload-rate-limit-in-bits-per-sec (clojure.spec.alpha/and :portkey.aws.storagegateway/bandwidth-upload-rate-limit))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-bandwidth-rate-limit-input/average-download-rate-limit-in-bits-per-sec (clojure.spec.alpha/and :portkey.aws.storagegateway/bandwidth-download-rate-limit))
(clojure.spec.alpha/def :portkey.aws.storagegateway/update-bandwidth-rate-limit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un [:portkey.aws.storagegateway.update-bandwidth-rate-limit-input/average-upload-rate-limit-in-bits-per-sec :portkey.aws.storagegateway.update-bandwidth-rate-limit-input/average-download-rate-limit-in-bits-per-sec]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-device-product-identifier (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-local-disks-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.tape/vtl-device (clojure.spec.alpha/and :portkey.aws.storagegateway/vtl-device-arn))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape/progress (clojure.spec.alpha/and :portkey.aws.storagegateway/double-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape/tape-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-size))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape/tape-used-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-usage))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape/tape-created-date (clojure.spec.alpha/and :portkey.aws.storagegateway/time))
(clojure.spec.alpha/def :portkey.aws.storagegateway/tape (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.tape/vtl-device :portkey.aws.storagegateway.tape/progress :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway/tape-status :portkey.aws.storagegateway.tape/tape-size-in-bytes :portkey.aws.storagegateway/tape-arn :portkey.aws.storagegateway.tape/tape-used-in-bytes :portkey.aws.storagegateway/tape-barcode :portkey.aws.storagegateway.tape/tape-created-date]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.volume-info/volume-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/volume-id :portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/gateway-id :portkey.aws.storagegateway/volume-type :portkey.aws.storagegateway.volume-info/volume-size-in-bytes :portkey.aws.storagegateway/volume-attachment-status]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-gateway-software-now-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.create-nfs-file-share-input/requester-pays (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-nfs-file-share-input/guess-mime-type-enabled (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-nfs-file-share-input/default-storage-class (clojure.spec.alpha/and :portkey.aws.storagegateway/storage-class))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-nfs-file-share-input/kms-encrypted (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-nfs-file-share-input/read-only (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-nfs-file-share-input/client-list (clojure.spec.alpha/and :portkey.aws.storagegateway/file-share-client-list))
(clojure.spec.alpha/def :portkey.aws.storagegateway/create-nfs-file-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/client-token :portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/role :portkey.aws.storagegateway/location-arn] :opt-un [:portkey.aws.storagegateway.create-nfs-file-share-input/requester-pays :portkey.aws.storagegateway.create-nfs-file-share-input/guess-mime-type-enabled :portkey.aws.storagegateway/tags :portkey.aws.storagegateway/object-acl :portkey.aws.storagegateway.create-nfs-file-share-input/default-storage-class :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway.create-nfs-file-share-input/kms-encrypted :portkey.aws.storagegateway.create-nfs-file-share-input/read-only :portkey.aws.storagegateway.create-nfs-file-share-input/client-list :portkey.aws.storagegateway/nfs-file-share-defaults :portkey.aws.storagegateway/squash]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-volume-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.create-storedi-scsi-volume-output/volume-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway/create-storedi-scsi-volume-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway.create-storedi-scsi-volume-output/volume-size-in-bytes :portkey.aws.storagegateway/target-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/path (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway/folder (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-archive-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway/folder-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/folder :min-count 1 :max-count 50))

(clojure.spec.alpha/def :portkey.aws.storagegateway/retrieve-tape-recovery-point-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/tape-arn :portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-tape-archive-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.update-smb-file-share-input/requester-pays (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-smb-file-share-input/guess-mime-type-enabled (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-smb-file-share-input/invalid-user-list (clojure.spec.alpha/and :portkey.aws.storagegateway/file-share-user-list))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-smb-file-share-input/default-storage-class (clojure.spec.alpha/and :portkey.aws.storagegateway/storage-class))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-smb-file-share-input/kms-encrypted (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-smb-file-share-input/read-only (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-smb-file-share-input/valid-user-list (clojure.spec.alpha/and :portkey.aws.storagegateway/file-share-user-list))
(clojure.spec.alpha/def :portkey.aws.storagegateway/update-smb-file-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn] :opt-un [:portkey.aws.storagegateway.update-smb-file-share-input/requester-pays :portkey.aws.storagegateway.update-smb-file-share-input/guess-mime-type-enabled :portkey.aws.storagegateway.update-smb-file-share-input/invalid-user-list :portkey.aws.storagegateway/object-acl :portkey.aws.storagegateway.update-smb-file-share-input/default-storage-class :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway.update-smb-file-share-input/kms-encrypted :portkey.aws.storagegateway.update-smb-file-share-input/read-only :portkey.aws.storagegateway.update-smb-file-share-input/valid-user-list]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.create-storedi-scsi-volume-input/preserve-existing-data (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-storedi-scsi-volume-input/kms-encrypted (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/create-storedi-scsi-volume-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-id :portkey.aws.storagegateway.create-storedi-scsi-volume-input/preserve-existing-data :portkey.aws.storagegateway/target-name :portkey.aws.storagegateway/network-interface-id] :opt-un [:portkey.aws.storagegateway/snapshot-id :portkey.aws.storagegateway.create-storedi-scsi-volume-input/kms-encrypted :portkey.aws.storagegateway/kms-key]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-network-interfaces (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/network-interface))

(clojure.spec.alpha/def :portkey.aws.storagegateway/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 12 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 30))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-gateway-information-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un [:portkey.aws.storagegateway/gateway-name :portkey.aws.storagegateway/gateway-timezone]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/volume-arn))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-device-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-cache-output/cache-allocated-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-cache-output/cache-used-percentage (clojure.spec.alpha/and :portkey.aws.storagegateway/double))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-cache-output/cache-dirty-percentage (clojure.spec.alpha/and :portkey.aws.storagegateway/double))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-cache-output/cache-hit-percentage (clojure.spec.alpha/and :portkey.aws.storagegateway/double))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-cache-output/cache-miss-percentage (clojure.spec.alpha/and :portkey.aws.storagegateway/double))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-cache-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids :portkey.aws.storagegateway.describe-cache-output/cache-allocated-in-bytes :portkey.aws.storagegateway.describe-cache-output/cache-used-percentage :portkey.aws.storagegateway.describe-cache-output/cache-dirty-percentage :portkey.aws.storagegateway.describe-cache-output/cache-hit-percentage :portkey.aws.storagegateway.describe-cache-output/cache-miss-percentage]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-upload-buffer-output/upload-buffer-used-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-upload-buffer-output/upload-buffer-allocated-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-upload-buffer-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids :portkey.aws.storagegateway.describe-upload-buffer-output/upload-buffer-used-in-bytes :portkey.aws.storagegateway.describe-upload-buffer-output/upload-buffer-allocated-in-bytes]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 128)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/recurrence-in-hours (clojure.spec.alpha/int-in 1 24))

(clojure.spec.alpha/def :portkey.aws.storagegateway.update-snapshot-schedule-input/start-at (clojure.spec.alpha/and :portkey.aws.storagegateway/hour-of-day))
(clojure.spec.alpha/def :portkey.aws.storagegateway/update-snapshot-schedule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway.update-snapshot-schedule-input/start-at :portkey.aws.storagegateway/recurrence-in-hours] :opt-un [:portkey.aws.storagegateway/description]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-tape-archives-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-archives :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-info/requester-pays (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-info/guess-mime-type-enabled (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-info/default-storage-class (clojure.spec.alpha/and :portkey.aws.storagegateway/storage-class))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-info/kms-encrypted (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-info/read-only (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-info/client-list (clojure.spec.alpha/and :portkey.aws.storagegateway/file-share-client-list))
(clojure.spec.alpha/def :portkey.aws.storagegateway/nfs-file-share-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.nfs-file-share-info/requester-pays :portkey.aws.storagegateway.nfs-file-share-info/guess-mime-type-enabled :portkey.aws.storagegateway/location-arn :portkey.aws.storagegateway/path :portkey.aws.storagegateway/file-share-id :portkey.aws.storagegateway/tags :portkey.aws.storagegateway/object-acl :portkey.aws.storagegateway.nfs-file-share-info/default-storage-class :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway/role :portkey.aws.storagegateway.nfs-file-share-info/kms-encrypted :portkey.aws.storagegateway.nfs-file-share-info/read-only :portkey.aws.storagegateway/file-share-status :portkey.aws.storagegateway.nfs-file-share-info/client-list :portkey.aws.storagegateway/file-share-arn :portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/nfs-file-share-defaults :portkey.aws.storagegateway/squash]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/cancel-archival-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tags (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/tag))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateways (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/gateway-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/network-interface-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/target-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 50 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 800))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/shutdown-gateway-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/object-acl #{"authenticated-read" :bucketownerfullcontrol "public-read-write" :private "bucket-owner-full-control" "private" :bucketownerread :publicread "aws-exec-read" :publicreadwrite :awsexecread "bucket-owner-read" "public-read" :authenticatedread})

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-info-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/file-share-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-vtl-device-type-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/vtl-device-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.devicei-scsi-attributes/network-interface-port (clojure.spec.alpha/and :portkey.aws.storagegateway/integer))
(clojure.spec.alpha/def :portkey.aws.storagegateway.devicei-scsi-attributes/chap-enabled (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/devicei-scsi-attributes (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/target-arn :portkey.aws.storagegateway/network-interface-id :portkey.aws.storagegateway.devicei-scsi-attributes/network-interface-port :portkey.aws.storagegateway.devicei-scsi-attributes/chap-enabled]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-cache-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-bandwidth-rate-limit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/cancel-archival-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/tape-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/hour-of-day (clojure.spec.alpha/int-in 0 23))

(clojure.spec.alpha/def :portkey.aws.storagegateway/disk-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 300))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.delete-chap-credentials-output/initiator-name (clojure.spec.alpha/and :portkey.aws.storagegateway/iqn-name))
(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-chap-credentials-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/target-arn :portkey.aws.storagegateway.delete-chap-credentials-output/initiator-name]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-chap-credentials-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/chap-credentials]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.create-tape-with-barcode-input/tape-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-size))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-tape-with-barcode-input/kms-encrypted (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/create-tape-with-barcode-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway.create-tape-with-barcode-input/tape-size-in-bytes :portkey.aws.storagegateway/tape-barcode] :opt-un [:portkey.aws.storagegateway.create-tape-with-barcode-input/kms-encrypted :portkey.aws.storagegateway/kms-key]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.cachedi-scsi-volume/source-snapshot-id (clojure.spec.alpha/and :portkey.aws.storagegateway/snapshot-id))
(clojure.spec.alpha/def :portkey.aws.storagegateway.cachedi-scsi-volume/volume-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.cachedi-scsi-volume/volume-progress (clojure.spec.alpha/and :portkey.aws.storagegateway/double-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/cachedi-scsi-volume (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volumei-scsi-attributes :portkey.aws.storagegateway.cachedi-scsi-volume/source-snapshot-id :portkey.aws.storagegateway/volume-attachment-status :portkey.aws.storagegateway/volume-used-in-bytes :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/created-date :portkey.aws.storagegateway.cachedi-scsi-volume/volume-size-in-bytes :portkey.aws.storagegateway/volume-type :portkey.aws.storagegateway/volume-id :portkey.aws.storagegateway/target-name :portkey.aws.storagegateway/volume-status :portkey.aws.storagegateway.cachedi-scsi-volume/volume-progress]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/refresh-cache-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-arn :portkey.aws.storagegateway/notification-id]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-cache-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/medium-changer-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 2 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.create-smb-file-share-input/requester-pays (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-smb-file-share-input/guess-mime-type-enabled (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-smb-file-share-input/invalid-user-list (clojure.spec.alpha/and :portkey.aws.storagegateway/file-share-user-list))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-smb-file-share-input/default-storage-class (clojure.spec.alpha/and :portkey.aws.storagegateway/storage-class))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-smb-file-share-input/kms-encrypted (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-smb-file-share-input/read-only (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-smb-file-share-input/valid-user-list (clojure.spec.alpha/and :portkey.aws.storagegateway/file-share-user-list))
(clojure.spec.alpha/def :portkey.aws.storagegateway/create-smb-file-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/client-token :portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/role :portkey.aws.storagegateway/location-arn] :opt-un [:portkey.aws.storagegateway.create-smb-file-share-input/requester-pays :portkey.aws.storagegateway.create-smb-file-share-input/guess-mime-type-enabled :portkey.aws.storagegateway.create-smb-file-share-input/invalid-user-list :portkey.aws.storagegateway/tags :portkey.aws.storagegateway/object-acl :portkey.aws.storagegateway.create-smb-file-share-input/default-storage-class :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway.create-smb-file-share-input/kms-encrypted :portkey.aws.storagegateway.create-smb-file-share-input/read-only :portkey.aws.storagegateway.create-smb-file-share-input/valid-user-list :portkey.aws.storagegateway/authentication]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-maintenance-start-time-output/timezone (clojure.spec.alpha/and :portkey.aws.storagegateway/gateway-timezone))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-maintenance-start-time-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/hour-of-day :portkey.aws.storagegateway/minute-of-hour :portkey.aws.storagegateway/day-of-week :portkey.aws.storagegateway.describe-maintenance-start-time-output/timezone]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-bandwidth-rate-limit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/bandwidth-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-working-storage-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-smb-file-shares-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-tapes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-ar-ns]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/bandwidth-upload-rate-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/permission-id clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway.gateway-info/gateway-name (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-id :portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/gateway-type :portkey.aws.storagegateway/gateway-operational-state :portkey.aws.storagegateway.gateway-info/gateway-name]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/set-smb-guest-password-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.create-snapshot-from-volume-recovery-point-output/volume-recovery-point-time (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway/create-snapshot-from-volume-recovery-point-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/snapshot-id :portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway.create-snapshot-from-volume-recovery-point-output/volume-recovery-point-time]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/permission-mode (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 4)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[0-7]{4}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/nfs-file-share-info-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/nfs-file-share-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/snapshot-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/cancel-retrieval-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-local-disks-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disks]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-snapshot-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-recovery-point-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-ar-ns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-maintenance-start-time-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/hour-of-day :portkey.aws.storagegateway/minute-of-hour :portkey.aws.storagegateway/day-of-week] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/reset-cache-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-gateway-information-output/gateway-name (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-gateway-information-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/last-software-update :portkey.aws.storagegateway/next-update-availability-date :portkey.aws.storagegateway/gateway-network-interfaces :portkey.aws.storagegateway/tags :portkey.aws.storagegateway.describe-gateway-information-output/gateway-name :portkey.aws.storagegateway/gateway-id :portkey.aws.storagegateway/gateway-state :portkey.aws.storagegateway/gateway-type :portkey.aws.storagegateway/gateway-timezone :portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/kms-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 7 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway/role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 20 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-smb-file-share-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/remove-tags-from-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/resource-arn :portkey.aws.storagegateway/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-upload-buffer-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/activation-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 2 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.set-smb-guest-password-input/password (clojure.spec.alpha/and :portkey.aws.storagegateway/smb-guest-password))
(clojure.spec.alpha/def :portkey.aws.storagegateway/set-smb-guest-password-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway.set-smb-guest-password-input/password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-tags-to-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/resource-arn :portkey.aws.storagegateway/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/disks (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/disk))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-tape-archives-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-tape-archives-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-ar-ns :portkey.aws.storagegateway/marker :portkey.aws.storagegateway.describe-tape-archives-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 50 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-user-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/file-share-user :min-count 0 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.storagegateway/error-code #{:parameters-not-implemented "DuplicateSchedule" "InitiatorNotFound" "InitiatorInvalid" :gateway-proxy-network-connection-busy "NotImplemented" :initiator-not-found :disk-does-not-exist "SnapshotInProgress" "VolumeAlreadyExists" "OperationAborted" :no-disks-available "AuthenticationFailure" "NetworkConfigurationChanged" "InvalidSchedule" "StagingAreaFull" "NotSupported" "Blocked" "TargetInvalid" :snapshot-in-progress :unauthorized-operation "NoDisksAvailable" "InternalError" "OutdatedGateway" :gateway-not-found :disk-size-greater-than-volume-max-size "SnapshotDeleted" "ActivationKeyNotFound" "VolumeIdInvalid" "SnapshotNotFound" "LocalStorageLimitExceeded" :maximum-tape-cartridge-count-exceeded :authentication-failure :snapshot-id-invalid :tape-cartridge-not-found "SnapshotIdInvalid" "RegionInvalid" "DiskSizeLessThanVolumeSize" :internal-error :not-supported :cannot-export-snapshot "VolumeInUse" :volume-already-exists "UnauthorizedOperation" :lun-already-allocated "ParametersNotImplemented" :snapshot-schedule-not-found :target-invalid "LunInvalid" "ChapCredentialNotFound" :volume-not-found "VolumeNotReady" "DiskAlreadyAllocated" "ServiceUnavailable" "ActivationKeyInvalid" :region-invalid :snapshot-not-found "TargetNotFound" :target-not-found "DiskSizeGreaterThanVolumeMaxSize" :target-already-exists :duplicate-certificate-info :maximum-content-length-exceeded "DuplicateCertificateInfo" "DiskSizeNotGigAligned" :disk-already-allocated :request-timeout :volume-not-ready "TapeCartridgeNotFound" :network-configuration-changed :volume-id-invalid :activation-key-not-found "DiskDoesNotExist" :service-unavailable "InvalidParameters" :volume-in-use :chap-credential-not-found "GatewayProxyNetworkConnectionBusy" :activation-key-expired "GatewayNotConnected" :disk-size-not-gig-aligned "EndpointNotFound" "IAMNotSupported" "VolumeNotFound" "StorageFailure" "GatewayNotFound" :iam-not-supported "InvalidEndpoint" :operation-aborted :initiator-invalid :lun-invalid "MaximumContentLengthExceeded" :storage-failure :outdated-gateway :invalid-schedule :blocked :not-implemented :maximum-volume-count-exceeded :bandwidth-throttle-schedule-not-found "TargetAlreadyExists" :endpoint-not-found "RequestTimeout" "GatewayInternalError" "InvalidGateway" :invalid-endpoint :invalid-parameters :staging-area-full "MaximumVolumeCountExceeded" :local-storage-limit-exceeded "CannotExportSnapshot" "MaximumTapeCartridgeCountExceeded" :activation-key-invalid "LunAlreadyAllocated " "BandwidthThrottleScheduleNotFound" :gateway-internal-error "SnapshotScheduleNotFound" :disk-size-less-than-volume-size :duplicate-schedule :invalid-gateway :gateway-not-connected :snapshot-deleted "ActivationKeyExpired"})

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-storedi-scsi-volumes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/storedi-scsi-volumes]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/cachedi-scsi-volumes (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/cachedi-scsi-volume))

(clojure.spec.alpha/def :portkey.aws.storagegateway.list-gateways-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/list-gateways-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/marker :portkey.aws.storagegateway.list-gateways-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-vtl-device-type-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/vtl-device-arn :portkey.aws.storagegateway/device-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-arn-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/file-share-arn :min-count 1 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-volumes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/marker :portkey.aws.storagegateway/volume-infos]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/disable-gateway-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/error-details (clojure.spec.alpha/map-of :portkey.aws.storagegateway/string :portkey.aws.storagegateway/string))

(clojure.spec.alpha/def :portkey.aws.storagegateway.list-tags-for-resource-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/list-tags-for-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/resource-arn] :opt-un [:portkey.aws.storagegateway/marker :portkey.aws.storagegateway.list-tags-for-resource-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/chap-credentials (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/chap-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/ipv-4-address-cidr (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])(\/([0-9]|[1-2][0-9]|3[0-2]))?$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/set-local-console-password-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/local-console-password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/device-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 2 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-devices (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/vtl-device))

(clojure.spec.alpha/def :portkey.aws.storagegateway.list-file-shares-output/next-marker (clojure.spec.alpha/and :portkey.aws.storagegateway/marker))
(clojure.spec.alpha/def :portkey.aws.storagegateway/list-file-shares-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/marker :portkey.aws.storagegateway.list-file-shares-output/next-marker :portkey.aws.storagegateway/file-share-info-list]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-usage clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/remove-tags-from-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.create-tapes-input/tape-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-size))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-tapes-input/kms-encrypted (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/create-tapes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway.create-tapes-input/tape-size-in-bytes :portkey.aws.storagegateway/client-token :portkey.aws.storagegateway/num-tapes-to-create :portkey.aws.storagegateway/tape-barcode-prefix] :opt-un [:portkey.aws.storagegateway.create-tapes-input/kms-encrypted :portkey.aws.storagegateway/kms-key]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-snapshot-schedule-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-smb-settings-output/smb-guest-password-set (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-smb-settings-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/domain-name :portkey.aws.storagegateway.describe-smb-settings-output/smb-guest-password-set]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/created-date clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 50 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0-9]+:tape\/[0-9A-Z]{7,16}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-bandwidth-rate-limit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-device-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/vtl-device-arn))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 3 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/disk-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/disk-attribute :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-maintenance-start-time-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-operational-state (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 2 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 25))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-tape-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/tape-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-gateway-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-gateways-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateways :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.list-file-shares-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/list-file-shares-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway.list-file-shares-input/limit :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/iqn-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 255)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"[0-9a-z:.-]+" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-cache-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/retrieved-to (clojure.spec.alpha/and :portkey.aws.storagegateway/gateway-arn))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/tape-status (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-archive-status))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/tape-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-size))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/tape-used-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-usage))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/tape-created-date (clojure.spec.alpha/and :portkey.aws.storagegateway/time))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/completion-time (clojure.spec.alpha/and :portkey.aws.storagegateway/time))
(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-archive (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.tape-archive/retrieved-to :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway.tape-archive/tape-status :portkey.aws.storagegateway.tape-archive/tape-size-in-bytes :portkey.aws.storagegateway/tape-arn :portkey.aws.storagegateway.tape-archive/tape-used-in-bytes :portkey.aws.storagegateway/tape-barcode :portkey.aws.storagegateway.tape-archive/tape-created-date :portkey.aws.storagegateway.tape-archive/completion-time]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-drive-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 2 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.network-interface/ipv-4-address (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.network-interface/mac-address (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.network-interface/ipv-6-address (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway/network-interface (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.network-interface/ipv-4-address :portkey.aws.storagegateway.network-interface/mac-address :portkey.aws.storagegateway.network-interface/ipv-6-address]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-tape-recovery-points-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-tape-recovery-points-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un [:portkey.aws.storagegateway/marker :portkey.aws.storagegateway.describe-tape-recovery-points-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-gateway-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/num-tapes-to-create (clojure.spec.alpha/int-in 1 10))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-nfs-file-share-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.update-gateway-information-output/gateway-name (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway/update-gateway-information-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway.update-gateway-information-output/gateway-name]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/integer clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway.service-unavailable-error/message (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.service-unavailable-error/error (clojure.spec.alpha/and :portkey.aws.storagegateway/storage-gateway-error))
(clojure.spec.alpha/def :portkey.aws.storagegateway/service-unavailable-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.service-unavailable-error/message :portkey.aws.storagegateway.service-unavailable-error/error]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/shutdown-gateway-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-barcode (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 7 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 16)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[A-Z0-9]*$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/attach-volume-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/network-interface-id] :opt-un [:portkey.aws.storagegateway/target-name :portkey.aws.storagegateway/disk-id]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-storedi-scsi-volumes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-ar-ns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-nfs-file-shares-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/nfs-file-share-info-list]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-upload-buffer-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.delete-file-share-input/force-delete (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-file-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn] :opt-un [:portkey.aws.storagegateway.delete-file-share-input/force-delete]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.storage-gateway-error/error-code (clojure.spec.alpha/and :portkey.aws.storagegateway/error-code))
(clojure.spec.alpha/def :portkey.aws.storagegateway/storage-gateway-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.storage-gateway-error/error-code :portkey.aws.storagegateway/error-details]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/chap-secret (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 3 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 12 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 30))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.smb-file-share-info/requester-pays (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.smb-file-share-info/guess-mime-type-enabled (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.smb-file-share-info/invalid-user-list (clojure.spec.alpha/and :portkey.aws.storagegateway/file-share-user-list))
(clojure.spec.alpha/def :portkey.aws.storagegateway.smb-file-share-info/default-storage-class (clojure.spec.alpha/and :portkey.aws.storagegateway/storage-class))
(clojure.spec.alpha/def :portkey.aws.storagegateway.smb-file-share-info/kms-encrypted (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.smb-file-share-info/read-only (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.smb-file-share-info/valid-user-list (clojure.spec.alpha/and :portkey.aws.storagegateway/file-share-user-list))
(clojure.spec.alpha/def :portkey.aws.storagegateway/smb-file-share-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.smb-file-share-info/requester-pays :portkey.aws.storagegateway.smb-file-share-info/guess-mime-type-enabled :portkey.aws.storagegateway/location-arn :portkey.aws.storagegateway.smb-file-share-info/invalid-user-list :portkey.aws.storagegateway/path :portkey.aws.storagegateway/file-share-id :portkey.aws.storagegateway/tags :portkey.aws.storagegateway/object-acl :portkey.aws.storagegateway.smb-file-share-info/default-storage-class :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway/role :portkey.aws.storagegateway.smb-file-share-info/kms-encrypted :portkey.aws.storagegateway.smb-file-share-info/read-only :portkey.aws.storagegateway/file-share-status :portkey.aws.storagegateway.smb-file-share-info/valid-user-list :portkey.aws.storagegateway/authentication :portkey.aws.storagegateway/file-share-arn :portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-infos (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/tape-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-recovery-point-infos (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/volume-recovery-point-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/authentication (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 5 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.disk/disk-path (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.disk/disk-node (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.disk/disk-status (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.disk/disk-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.disk/disk-allocation-resource (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway/disk (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/disk-id :portkey.aws.storagegateway.disk/disk-path :portkey.aws.storagegateway.disk/disk-node :portkey.aws.storagegateway.disk/disk-status :portkey.aws.storagegateway.disk/disk-size-in-bytes :portkey.aws.storagegateway/disk-allocation-type :portkey.aws.storagegateway.disk/disk-allocation-resource :portkey.aws.storagegateway/disk-attribute-list]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-tags-for-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/resource-arn :portkey.aws.storagegateway/marker :portkey.aws.storagegateway/tags]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-snapshot-schedule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/region-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 25))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/attach-volume-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/target-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-snapshot-from-volume-recovery-point-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/snapshot-description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/reset-cache-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.volume-recovery-point-info/volume-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.volume-recovery-point-info/volume-usage-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.volume-recovery-point-info/volume-recovery-point-time (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-recovery-point-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway.volume-recovery-point-info/volume-size-in-bytes :portkey.aws.storagegateway.volume-recovery-point-info/volume-usage-in-bytes :portkey.aws.storagegateway.volume-recovery-point-info/volume-recovery-point-time]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/tape-arn))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-snapshot-schedule-output/start-at (clojure.spec.alpha/and :portkey.aws.storagegateway/hour-of-day))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-snapshot-schedule-output/timezone (clojure.spec.alpha/and :portkey.aws.storagegateway/gateway-timezone))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-snapshot-schedule-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway.describe-snapshot-schedule-output/start-at :portkey.aws.storagegateway/recurrence-in-hours :portkey.aws.storagegateway/description :portkey.aws.storagegateway.describe-snapshot-schedule-output/timezone]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/disable-gateway-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/target-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 200)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[-\.;a-z0-9]+$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/local-console-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 6 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[ -~]+$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/notify-when-uploaded-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/retrieve-tape-archive-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.tag/key (clojure.spec.alpha/and :portkey.aws.storagegateway/tag-key))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tag/value (clojure.spec.alpha/and :portkey.aws.storagegateway/tag-value))
(clojure.spec.alpha/def :portkey.aws.storagegateway/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway.tag/key :portkey.aws.storagegateway.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-maintenance-start-time-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 12 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 30))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-vtl-devices-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/vtl-devices :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-tags-to-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-gateway-information-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-device-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 50 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-client-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/ipv-4-address-cidr :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-tape-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-state (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 2 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 25))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^([a-z0-9]+(-[a-z0-9]+)*\.)+[a-z]{2,}$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.delete-chap-credentials-input/initiator-name (clojure.spec.alpha/and :portkey.aws.storagegateway/iqn-name))
(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-chap-credentials-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/target-arn :portkey.aws.storagegateway.delete-chap-credentials-input/initiator-name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/retrieve-tape-recovery-point-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/notify-when-uploaded-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-arn :portkey.aws.storagegateway/notification-id]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-file-share-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-device-vendor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/cachedi-scsi-volumes]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.internal-server-error/message (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.internal-server-error/error (clojure.spec.alpha/and :portkey.aws.storagegateway/storage-gateway-error))
(clojure.spec.alpha/def :portkey.aws.storagegateway/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.internal-server-error/message :portkey.aws.storagegateway.internal-server-error/error]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/initiators (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/initiator))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-tapes-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-tapes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un [:portkey.aws.storagegateway/tape-ar-ns :portkey.aws.storagegateway/marker :portkey.aws.storagegateway.describe-tapes-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 2 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-snapshot-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/snapshot-description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.refresh-cache-input/recursive (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/refresh-cache-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn] :opt-un [:portkey.aws.storagegateway/folder-list :portkey.aws.storagegateway.refresh-cache-input/recursive]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-tapes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-infos :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-chap-credentials-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/target-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/storage-class (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 5 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 50 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-smb-file-share-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.update-chap-credentials-output/initiator-name (clojure.spec.alpha/and :portkey.aws.storagegateway/iqn-name))
(clojure.spec.alpha/def :portkey.aws.storagegateway/update-chap-credentials-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/target-arn :portkey.aws.storagegateway.update-chap-credentials-output/initiator-name]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-timezone (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 3 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 10))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-smb-settings-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-user (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-snapshot-schedule-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.storedi-scsi-volume/source-snapshot-id (clojure.spec.alpha/and :portkey.aws.storagegateway/snapshot-id))
(clojure.spec.alpha/def :portkey.aws.storagegateway.storedi-scsi-volume/volume-disk-id (clojure.spec.alpha/and :portkey.aws.storagegateway/disk-id))
(clojure.spec.alpha/def :portkey.aws.storagegateway.storedi-scsi-volume/preserved-existing-data (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.storedi-scsi-volume/volume-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.storedi-scsi-volume/volume-progress (clojure.spec.alpha/and :portkey.aws.storagegateway/double-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/storedi-scsi-volume (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volumei-scsi-attributes :portkey.aws.storagegateway.storedi-scsi-volume/source-snapshot-id :portkey.aws.storagegateway/volume-attachment-status :portkey.aws.storagegateway/volume-used-in-bytes :portkey.aws.storagegateway.storedi-scsi-volume/volume-disk-id :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway.storedi-scsi-volume/preserved-existing-data :portkey.aws.storagegateway/created-date :portkey.aws.storagegateway.storedi-scsi-volume/volume-size-in-bytes :portkey.aws.storagegateway/volume-type :portkey.aws.storagegateway/volume-id :portkey.aws.storagegateway/target-name :portkey.aws.storagegateway/volume-status :portkey.aws.storagegateway.storedi-scsi-volume/volume-progress]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.detach-volume-input/force-detach (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/detach-volume-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn] :opt-un [:portkey.aws.storagegateway.detach-volume-input/force-detach]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.update-nfs-file-share-input/requester-pays (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-nfs-file-share-input/guess-mime-type-enabled (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-nfs-file-share-input/default-storage-class (clojure.spec.alpha/and :portkey.aws.storagegateway/storage-class))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-nfs-file-share-input/kms-encrypted (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-nfs-file-share-input/read-only (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-nfs-file-share-input/client-list (clojure.spec.alpha/and :portkey.aws.storagegateway/file-share-client-list))
(clojure.spec.alpha/def :portkey.aws.storagegateway/update-nfs-file-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn] :opt-un [:portkey.aws.storagegateway.update-nfs-file-share-input/requester-pays :portkey.aws.storagegateway.update-nfs-file-share-input/guess-mime-type-enabled :portkey.aws.storagegateway/object-acl :portkey.aws.storagegateway.update-nfs-file-share-input/default-storage-class :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway.update-nfs-file-share-input/kms-encrypted :portkey.aws.storagegateway.update-nfs-file-share-input/read-only :portkey.aws.storagegateway.update-nfs-file-share-input/client-list :portkey.aws.storagegateway/nfs-file-share-defaults :portkey.aws.storagegateway/squash]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-archives (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/tape-archive))

(clojure.spec.alpha/def :portkey.aws.storagegateway.create-cachedi-scsi-volume-input/kms-encrypted (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-cachedi-scsi-volume-input/volume-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.create-cachedi-scsi-volume-input/source-volume-arn (clojure.spec.alpha/and :portkey.aws.storagegateway/volume-arn))
(clojure.spec.alpha/def :portkey.aws.storagegateway/create-cachedi-scsi-volume-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway.create-cachedi-scsi-volume-input/volume-size-in-bytes :portkey.aws.storagegateway/target-name :portkey.aws.storagegateway/network-interface-id :portkey.aws.storagegateway/client-token] :opt-un [:portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway.create-cachedi-scsi-volume-input/kms-encrypted :portkey.aws.storagegateway.create-cachedi-scsi-volume-input/source-volume-arn :portkey.aws.storagegateway/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/domain-user-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[ -~]+$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-volume-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-working-storage-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-tape-with-barcode-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/initiator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-info/tape-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-size))
(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn :portkey.aws.storagegateway/tape-barcode :portkey.aws.storagegateway.tape-info/tape-size-in-bytes :portkey.aws.storagegateway/tape-status :portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 3 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-snapshot-schedule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 50 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/organizational-unit (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/retrieve-tape-archive-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/tape-arn :portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tapes (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/tape))

(clojure.spec.alpha/def :portkey.aws.storagegateway/smb-file-share-info-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/smb-file-share-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 50 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.join-domain-input/domain-controllers (clojure.spec.alpha/and :portkey.aws.storagegateway/hosts))
(clojure.spec.alpha/def :portkey.aws.storagegateway.join-domain-input/user-name (clojure.spec.alpha/and :portkey.aws.storagegateway/domain-user-name))
(clojure.spec.alpha/def :portkey.aws.storagegateway.join-domain-input/password (clojure.spec.alpha/and :portkey.aws.storagegateway/domain-user-password))
(clojure.spec.alpha/def :portkey.aws.storagegateway/join-domain-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/domain-name :portkey.aws.storagegateway.join-domain-input/user-name :portkey.aws.storagegateway.join-domain-input/password] :opt-un [:portkey.aws.storagegateway/organizational-unit :portkey.aws.storagegateway.join-domain-input/domain-controllers]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.invalid-gateway-request-exception/message (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.invalid-gateway-request-exception/error (clojure.spec.alpha/and :portkey.aws.storagegateway/storage-gateway-error))
(clojure.spec.alpha/def :portkey.aws.storagegateway/invalid-gateway-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.invalid-gateway-request-exception/message :portkey.aws.storagegateway.invalid-gateway-request-exception/error]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-smb-file-shares-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/smb-file-share-info-list]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/smb-guest-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 6 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 512)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^[ -~]+$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-tapes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tapes :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-cachedi-scsi-volume-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/target-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-defaults/file-mode (clojure.spec.alpha/and :portkey.aws.storagegateway/permission-mode))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-defaults/directory-mode (clojure.spec.alpha/and :portkey.aws.storagegateway/permission-mode))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-defaults/group-id (clojure.spec.alpha/and :portkey.aws.storagegateway/permission-id))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-defaults/owner-id (clojure.spec.alpha/and :portkey.aws.storagegateway/permission-id))
(clojure.spec.alpha/def :portkey.aws.storagegateway/nfs-file-share-defaults (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.nfs-file-share-defaults/file-mode :portkey.aws.storagegateway.nfs-file-share-defaults/directory-mode :portkey.aws.storagegateway.nfs-file-share-defaults/group-id :portkey.aws.storagegateway.nfs-file-share-defaults/owner-id]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/host (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^(([a-zA-Z0-9\-]*[a-zA-Z0-9])\.)*([A-Za-z0-9\-]*[A-Za-z0-9])(:(\d+))?$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-nfs-file-shares-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/disk-attribute (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 5 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/set-local-console-password-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.list-volumes-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/list-volumes-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/marker :portkey.aws.storagegateway.list-volumes-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-nfs-file-share-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/domain-user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 1 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 1024)) (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"^\w[\w\.\- ]*$" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/snapshot-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467903__auto__] (clojure.core/re-matches #"\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z" s__1467903__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-working-storage-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-volume-initiators-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-working-storage-output/working-storage-used-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-working-storage-output/working-storage-allocated-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-working-storage-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids :portkey.aws.storagegateway.describe-working-storage-output/working-storage-used-in-bytes :portkey.aws.storagegateway.describe-working-storage-output/working-storage-allocated-in-bytes]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/squash (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1467901__auto__] (clojure.core/<= 5 (clojure.core/count s__1467901__auto__))) (clojure.core/fn [s__1467902__auto__] (clojure.core/< (clojure.core/count s__1467902__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/detach-volume-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn]))

(clojure.core/defn delete-chap-credentials ([delete-chap-credentials-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-chap-credentials-input delete-chap-credentials-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-chap-credentials-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-chap-credentials-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteChapCredentials", :http.request.configuration/output-deser-fn response-delete-chap-credentials-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-chap-credentials :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-chap-credentials-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-chap-credentials-output))

(clojure.core/defn add-upload-buffer ([add-upload-buffer-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-add-upload-buffer-input add-upload-buffer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/add-upload-buffer-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/add-upload-buffer-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddUploadBuffer", :http.request.configuration/output-deser-fn response-add-upload-buffer-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef add-upload-buffer :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/add-upload-buffer-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/add-upload-buffer-output))

(clojure.core/defn delete-bandwidth-rate-limit ([delete-bandwidth-rate-limit-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-bandwidth-rate-limit-input delete-bandwidth-rate-limit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-bandwidth-rate-limit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-bandwidth-rate-limit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBandwidthRateLimit", :http.request.configuration/output-deser-fn response-delete-bandwidth-rate-limit-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-bandwidth-rate-limit :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-bandwidth-rate-limit-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-bandwidth-rate-limit-output))

(clojure.core/defn update-bandwidth-rate-limit ([update-bandwidth-rate-limit-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-bandwidth-rate-limit-input update-bandwidth-rate-limit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-bandwidth-rate-limit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-bandwidth-rate-limit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateBandwidthRateLimit", :http.request.configuration/output-deser-fn response-update-bandwidth-rate-limit-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-bandwidth-rate-limit :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-bandwidth-rate-limit-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-bandwidth-rate-limit-output))

(clojure.core/defn describe-cachedi-scsi-volumes ([describe-cachedi-scsi-volumes-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-cachedi-scsi-volumes-input describe-cachedi-scsi-volumes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCachediSCSIVolumes", :http.request.configuration/output-deser-fn response-describe-cachedi-scsi-volumes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-cachedi-scsi-volumes :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-output))

(clojure.core/defn list-gateways ([] (list-gateways {})) ([list-gateways-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-gateways-input list-gateways-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-gateways-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-gateways-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGateways", :http.request.configuration/output-deser-fn response-list-gateways-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-gateways :args (clojure.spec.alpha/? :portkey.aws.storagegateway/list-gateways-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-gateways-output))

(clojure.core/defn attach-volume ([attach-volume-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-attach-volume-input attach-volume-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/attach-volume-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/attach-volume-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachVolume", :http.request.configuration/output-deser-fn response-attach-volume-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef attach-volume :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/attach-volume-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/attach-volume-output))

(clojure.core/defn create-smb-file-share ([create-smb-file-share-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-smb-file-share-input create-smb-file-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-smb-file-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-smb-file-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSMBFileShare", :http.request.configuration/output-deser-fn response-create-smb-file-share-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-smb-file-share :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-smb-file-share-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-smb-file-share-output))

(clojure.core/defn describe-working-storage ([describe-working-storage-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-working-storage-input describe-working-storage-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-working-storage-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-working-storage-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWorkingStorage", :http.request.configuration/output-deser-fn response-describe-working-storage-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-working-storage :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-working-storage-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-working-storage-output))

(clojure.core/defn activate-gateway ([activate-gateway-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-activate-gateway-input activate-gateway-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/activate-gateway-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/activate-gateway-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ActivateGateway", :http.request.configuration/output-deser-fn response-activate-gateway-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef activate-gateway :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/activate-gateway-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/activate-gateway-output))

(clojure.core/defn create-tape-with-barcode ([create-tape-with-barcode-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-tape-with-barcode-input create-tape-with-barcode-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-tape-with-barcode-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-tape-with-barcode-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTapeWithBarcode", :http.request.configuration/output-deser-fn response-create-tape-with-barcode-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-tape-with-barcode :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-tape-with-barcode-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-tape-with-barcode-output))

(clojure.core/defn update-nfs-file-share ([update-nfs-file-share-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-nfs-file-share-input update-nfs-file-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-nfs-file-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-nfs-file-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateNFSFileShare", :http.request.configuration/output-deser-fn response-update-nfs-file-share-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-nfs-file-share :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-nfs-file-share-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-nfs-file-share-output))

(clojure.core/defn set-local-console-password ([set-local-console-password-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-set-local-console-password-input set-local-console-password-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/set-local-console-password-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/set-local-console-password-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetLocalConsolePassword", :http.request.configuration/output-deser-fn response-set-local-console-password-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef set-local-console-password :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/set-local-console-password-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/set-local-console-password-output))

(clojure.core/defn describe-upload-buffer ([describe-upload-buffer-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-upload-buffer-input describe-upload-buffer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-upload-buffer-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-upload-buffer-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUploadBuffer", :http.request.configuration/output-deser-fn response-describe-upload-buffer-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-upload-buffer :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-upload-buffer-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-upload-buffer-output))

(clojure.core/defn describe-vtl-devices ([describe-vtl-devices-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-vtl-devices-input describe-vtl-devices-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-vtl-devices-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-vtl-devices-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeVTLDevices", :http.request.configuration/output-deser-fn response-describe-vtl-devices-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-vtl-devices :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-vtl-devices-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-vtl-devices-output))

(clojure.core/defn create-tapes ([create-tapes-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-tapes-input create-tapes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-tapes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-tapes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTapes", :http.request.configuration/output-deser-fn response-create-tapes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-tapes :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-tapes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-tapes-output))

(clojure.core/defn describe-chap-credentials ([describe-chap-credentials-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-chap-credentials-input describe-chap-credentials-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-chap-credentials-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-chap-credentials-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeChapCredentials", :http.request.configuration/output-deser-fn response-describe-chap-credentials-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-chap-credentials :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-chap-credentials-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-chap-credentials-output))

(clojure.core/defn create-snapshot ([create-snapshot-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-snapshot-input create-snapshot-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-snapshot-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-snapshot-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSnapshot", :http.request.configuration/output-deser-fn response-create-snapshot-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error, "ServiceUnavailableError" :portkey.aws.storagegateway/service-unavailable-error}})))))
(clojure.spec.alpha/fdef create-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-snapshot-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-snapshot-output))

(clojure.core/defn notify-when-uploaded ([notify-when-uploaded-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-notify-when-uploaded-input notify-when-uploaded-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/notify-when-uploaded-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/notify-when-uploaded-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "NotifyWhenUploaded", :http.request.configuration/output-deser-fn response-notify-when-uploaded-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef notify-when-uploaded :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/notify-when-uploaded-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/notify-when-uploaded-output))

(clojure.core/defn describe-snapshot-schedule ([describe-snapshot-schedule-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-snapshot-schedule-input describe-snapshot-schedule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-snapshot-schedule-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-snapshot-schedule-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSnapshotSchedule", :http.request.configuration/output-deser-fn response-describe-snapshot-schedule-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-snapshot-schedule :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-snapshot-schedule-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-snapshot-schedule-output))

(clojure.core/defn delete-volume ([delete-volume-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-volume-input delete-volume-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-volume-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-volume-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVolume", :http.request.configuration/output-deser-fn response-delete-volume-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-volume :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-volume-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-volume-output))

(clojure.core/defn list-volume-initiators ([list-volume-initiators-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-volume-initiators-input list-volume-initiators-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-volume-initiators-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-volume-initiators-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVolumeInitiators", :http.request.configuration/output-deser-fn response-list-volume-initiators-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-volume-initiators :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/list-volume-initiators-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-volume-initiators-output))

(clojure.core/defn shutdown-gateway ([shutdown-gateway-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-shutdown-gateway-input shutdown-gateway-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/shutdown-gateway-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/shutdown-gateway-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ShutdownGateway", :http.request.configuration/output-deser-fn response-shutdown-gateway-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef shutdown-gateway :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/shutdown-gateway-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/shutdown-gateway-output))

(clojure.core/defn describe-storedi-scsi-volumes ([describe-storedi-scsi-volumes-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-storedi-scsi-volumes-input describe-storedi-scsi-volumes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-storedi-scsi-volumes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-storedi-scsi-volumes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStorediSCSIVolumes", :http.request.configuration/output-deser-fn response-describe-storedi-scsi-volumes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-storedi-scsi-volumes :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-storedi-scsi-volumes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-storedi-scsi-volumes-output))

(clojure.core/defn refresh-cache ([refresh-cache-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-refresh-cache-input refresh-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/refresh-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/refresh-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RefreshCache", :http.request.configuration/output-deser-fn response-refresh-cache-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef refresh-cache :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/refresh-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/refresh-cache-output))

(clojure.core/defn delete-snapshot-schedule ([delete-snapshot-schedule-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-snapshot-schedule-input delete-snapshot-schedule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-snapshot-schedule-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-snapshot-schedule-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSnapshotSchedule", :http.request.configuration/output-deser-fn response-delete-snapshot-schedule-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-snapshot-schedule :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-snapshot-schedule-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-snapshot-schedule-output))

(clojure.core/defn describe-maintenance-start-time ([describe-maintenance-start-time-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-maintenance-start-time-input describe-maintenance-start-time-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-maintenance-start-time-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-maintenance-start-time-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMaintenanceStartTime", :http.request.configuration/output-deser-fn response-describe-maintenance-start-time-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-maintenance-start-time :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-maintenance-start-time-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-maintenance-start-time-output))

(clojure.core/defn list-tags-for-resource ([list-tags-for-resource-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tags-for-resource-input list-tags-for-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-tags-for-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-tags-for-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/list-tags-for-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-tags-for-resource-output))

(clojure.core/defn describe-smb-file-shares ([describe-smb-file-shares-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-smb-file-shares-input describe-smb-file-shares-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-smb-file-shares-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-smb-file-shares-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSMBFileShares", :http.request.configuration/output-deser-fn response-describe-smb-file-shares-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-smb-file-shares :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-smb-file-shares-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-smb-file-shares-output))

(clojure.core/defn add-working-storage ([add-working-storage-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-add-working-storage-input add-working-storage-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/add-working-storage-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/add-working-storage-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddWorkingStorage", :http.request.configuration/output-deser-fn response-add-working-storage-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef add-working-storage :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/add-working-storage-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/add-working-storage-output))

(clojure.core/defn create-snapshot-from-volume-recovery-point ([create-snapshot-from-volume-recovery-point-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-snapshot-from-volume-recovery-point-input create-snapshot-from-volume-recovery-point-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-snapshot-from-volume-recovery-point-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-snapshot-from-volume-recovery-point-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSnapshotFromVolumeRecoveryPoint", :http.request.configuration/output-deser-fn response-create-snapshot-from-volume-recovery-point-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error, "ServiceUnavailableError" :portkey.aws.storagegateway/service-unavailable-error}})))))
(clojure.spec.alpha/fdef create-snapshot-from-volume-recovery-point :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-snapshot-from-volume-recovery-point-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-snapshot-from-volume-recovery-point-output))

(clojure.core/defn create-storedi-scsi-volume ([create-storedi-scsi-volume-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-storedi-scsi-volume-input create-storedi-scsi-volume-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-storedi-scsi-volume-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-storedi-scsi-volume-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStorediSCSIVolume", :http.request.configuration/output-deser-fn response-create-storedi-scsi-volume-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-storedi-scsi-volume :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-storedi-scsi-volume-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-storedi-scsi-volume-output))

(clojure.core/defn update-vtl-device-type ([update-vtl-device-type-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-vtl-device-type-input update-vtl-device-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-vtl-device-type-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-vtl-device-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateVTLDeviceType", :http.request.configuration/output-deser-fn response-update-vtl-device-type-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-vtl-device-type :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-vtl-device-type-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-vtl-device-type-output))

(clojure.core/defn create-cachedi-scsi-volume ([create-cachedi-scsi-volume-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-cachedi-scsi-volume-input create-cachedi-scsi-volume-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-cachedi-scsi-volume-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-cachedi-scsi-volume-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCachediSCSIVolume", :http.request.configuration/output-deser-fn response-create-cachedi-scsi-volume-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-cachedi-scsi-volume :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-cachedi-scsi-volume-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-cachedi-scsi-volume-output))

(clojure.core/defn delete-tape ([delete-tape-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-tape-input delete-tape-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-tape-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-tape-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTape", :http.request.configuration/output-deser-fn response-delete-tape-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-tape :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-tape-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-tape-output))

(clojure.core/defn describe-gateway-information ([describe-gateway-information-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-gateway-information-input describe-gateway-information-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-gateway-information-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-gateway-information-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeGatewayInformation", :http.request.configuration/output-deser-fn response-describe-gateway-information-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-gateway-information :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-gateway-information-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-gateway-information-output))

(clojure.core/defn describe-tape-recovery-points ([describe-tape-recovery-points-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-tape-recovery-points-input describe-tape-recovery-points-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-tape-recovery-points-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-tape-recovery-points-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTapeRecoveryPoints", :http.request.configuration/output-deser-fn response-describe-tape-recovery-points-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-tape-recovery-points :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-tape-recovery-points-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-tape-recovery-points-output))

(clojure.core/defn cancel-retrieval ([cancel-retrieval-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-cancel-retrieval-input cancel-retrieval-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/cancel-retrieval-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/cancel-retrieval-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelRetrieval", :http.request.configuration/output-deser-fn response-cancel-retrieval-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef cancel-retrieval :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/cancel-retrieval-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/cancel-retrieval-output))

(clojure.core/defn list-volumes ([] (list-volumes {})) ([list-volumes-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-volumes-input list-volumes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-volumes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-volumes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVolumes", :http.request.configuration/output-deser-fn response-list-volumes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-volumes :args (clojure.spec.alpha/? :portkey.aws.storagegateway/list-volumes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-volumes-output))

(clojure.core/defn describe-tape-archives ([] (describe-tape-archives {})) ([describe-tape-archives-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-tape-archives-input describe-tape-archives-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-tape-archives-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-tape-archives-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTapeArchives", :http.request.configuration/output-deser-fn response-describe-tape-archives-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-tape-archives :args (clojure.spec.alpha/? :portkey.aws.storagegateway/describe-tape-archives-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-tape-archives-output))

(clojure.core/defn update-smb-file-share ([update-smb-file-share-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-smb-file-share-input update-smb-file-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-smb-file-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-smb-file-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSMBFileShare", :http.request.configuration/output-deser-fn response-update-smb-file-share-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-smb-file-share :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-smb-file-share-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-smb-file-share-output))

(clojure.core/defn list-tapes ([] (list-tapes {})) ([list-tapes-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-tapes-input list-tapes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-tapes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-tapes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTapes", :http.request.configuration/output-deser-fn response-list-tapes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-tapes :args (clojure.spec.alpha/? :portkey.aws.storagegateway/list-tapes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-tapes-output))

(clojure.core/defn delete-file-share ([delete-file-share-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-file-share-input delete-file-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-file-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-file-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFileShare", :http.request.configuration/output-deser-fn response-delete-file-share-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-file-share :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-file-share-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-file-share-output))

(clojure.core/defn describe-tapes ([describe-tapes-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-tapes-input describe-tapes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-tapes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-tapes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTapes", :http.request.configuration/output-deser-fn response-describe-tapes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-tapes :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-tapes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-tapes-output))

(clojure.core/defn create-nfs-file-share ([create-nfs-file-share-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-create-nfs-file-share-input create-nfs-file-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-nfs-file-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-nfs-file-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateNFSFileShare", :http.request.configuration/output-deser-fn response-create-nfs-file-share-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-nfs-file-share :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-nfs-file-share-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-nfs-file-share-output))

(clojure.core/defn set-smb-guest-password ([set-smb-guest-password-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-set-smb-guest-password-input set-smb-guest-password-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/set-smb-guest-password-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/set-smb-guest-password-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetSMBGuestPassword", :http.request.configuration/output-deser-fn response-set-smb-guest-password-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef set-smb-guest-password :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/set-smb-guest-password-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/set-smb-guest-password-output))

(clojure.core/defn list-local-disks ([list-local-disks-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-local-disks-input list-local-disks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-local-disks-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-local-disks-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLocalDisks", :http.request.configuration/output-deser-fn response-list-local-disks-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-local-disks :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/list-local-disks-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-local-disks-output))

(clojure.core/defn reset-cache ([reset-cache-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-reset-cache-input reset-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/reset-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/reset-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResetCache", :http.request.configuration/output-deser-fn response-reset-cache-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef reset-cache :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/reset-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/reset-cache-output))

(clojure.core/defn describe-nfs-file-shares ([describe-nfs-file-shares-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-nfs-file-shares-input describe-nfs-file-shares-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-nfs-file-shares-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-nfs-file-shares-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeNFSFileShares", :http.request.configuration/output-deser-fn response-describe-nfs-file-shares-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-nfs-file-shares :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-nfs-file-shares-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-nfs-file-shares-output))

(clojure.core/defn update-gateway-information ([update-gateway-information-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-gateway-information-input update-gateway-information-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-gateway-information-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-gateway-information-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGatewayInformation", :http.request.configuration/output-deser-fn response-update-gateway-information-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-gateway-information :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-gateway-information-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-gateway-information-output))

(clojure.core/defn update-chap-credentials ([update-chap-credentials-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-chap-credentials-input update-chap-credentials-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-chap-credentials-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-chap-credentials-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateChapCredentials", :http.request.configuration/output-deser-fn response-update-chap-credentials-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-chap-credentials :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-chap-credentials-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-chap-credentials-output))

(clojure.core/defn describe-bandwidth-rate-limit ([describe-bandwidth-rate-limit-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-bandwidth-rate-limit-input describe-bandwidth-rate-limit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-bandwidth-rate-limit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-bandwidth-rate-limit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBandwidthRateLimit", :http.request.configuration/output-deser-fn response-describe-bandwidth-rate-limit-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-bandwidth-rate-limit :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-bandwidth-rate-limit-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-bandwidth-rate-limit-output))

(clojure.core/defn update-maintenance-start-time ([update-maintenance-start-time-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-maintenance-start-time-input update-maintenance-start-time-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-maintenance-start-time-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-maintenance-start-time-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateMaintenanceStartTime", :http.request.configuration/output-deser-fn response-update-maintenance-start-time-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-maintenance-start-time :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-maintenance-start-time-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-maintenance-start-time-output))

(clojure.core/defn update-gateway-software-now ([update-gateway-software-now-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-gateway-software-now-input update-gateway-software-now-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-gateway-software-now-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-gateway-software-now-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGatewaySoftwareNow", :http.request.configuration/output-deser-fn response-update-gateway-software-now-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-gateway-software-now :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-gateway-software-now-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-gateway-software-now-output))

(clojure.core/defn describe-smb-settings ([describe-smb-settings-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-smb-settings-input describe-smb-settings-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-smb-settings-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-smb-settings-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSMBSettings", :http.request.configuration/output-deser-fn response-describe-smb-settings-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-smb-settings :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-smb-settings-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-smb-settings-output))

(clojure.core/defn list-file-shares ([] (list-file-shares {})) ([list-file-shares-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-file-shares-input list-file-shares-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-file-shares-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-file-shares-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFileShares", :http.request.configuration/output-deser-fn response-list-file-shares-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-file-shares :args (clojure.spec.alpha/? :portkey.aws.storagegateway/list-file-shares-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-file-shares-output))

(clojure.core/defn list-volume-recovery-points ([list-volume-recovery-points-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-list-volume-recovery-points-input list-volume-recovery-points-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-volume-recovery-points-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-volume-recovery-points-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVolumeRecoveryPoints", :http.request.configuration/output-deser-fn response-list-volume-recovery-points-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-volume-recovery-points :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/list-volume-recovery-points-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-volume-recovery-points-output))

(clojure.core/defn retrieve-tape-recovery-point ([retrieve-tape-recovery-point-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-retrieve-tape-recovery-point-input retrieve-tape-recovery-point-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/retrieve-tape-recovery-point-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/retrieve-tape-recovery-point-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RetrieveTapeRecoveryPoint", :http.request.configuration/output-deser-fn response-retrieve-tape-recovery-point-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef retrieve-tape-recovery-point :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/retrieve-tape-recovery-point-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/retrieve-tape-recovery-point-output))

(clojure.core/defn retrieve-tape-archive ([retrieve-tape-archive-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-retrieve-tape-archive-input retrieve-tape-archive-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/retrieve-tape-archive-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/retrieve-tape-archive-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RetrieveTapeArchive", :http.request.configuration/output-deser-fn response-retrieve-tape-archive-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef retrieve-tape-archive :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/retrieve-tape-archive-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/retrieve-tape-archive-output))

(clojure.core/defn describe-cache ([describe-cache-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-describe-cache-input describe-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCache", :http.request.configuration/output-deser-fn response-describe-cache-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-cache :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-cache-output))

(clojure.core/defn start-gateway ([start-gateway-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-start-gateway-input start-gateway-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/start-gateway-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/start-gateway-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartGateway", :http.request.configuration/output-deser-fn response-start-gateway-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef start-gateway :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/start-gateway-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/start-gateway-output))

(clojure.core/defn remove-tags-from-resource ([remove-tags-from-resource-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-remove-tags-from-resource-input remove-tags-from-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/remove-tags-from-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/remove-tags-from-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTagsFromResource", :http.request.configuration/output-deser-fn response-remove-tags-from-resource-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/remove-tags-from-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/remove-tags-from-resource-output))

(clojure.core/defn update-snapshot-schedule ([update-snapshot-schedule-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-update-snapshot-schedule-input update-snapshot-schedule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-snapshot-schedule-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-snapshot-schedule-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSnapshotSchedule", :http.request.configuration/output-deser-fn response-update-snapshot-schedule-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-snapshot-schedule :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-snapshot-schedule-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-snapshot-schedule-output))

(clojure.core/defn delete-gateway ([delete-gateway-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-gateway-input delete-gateway-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-gateway-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-gateway-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGateway", :http.request.configuration/output-deser-fn response-delete-gateway-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-gateway :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-gateway-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-gateway-output))

(clojure.core/defn disable-gateway ([disable-gateway-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-disable-gateway-input disable-gateway-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/disable-gateway-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/disable-gateway-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableGateway", :http.request.configuration/output-deser-fn response-disable-gateway-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef disable-gateway :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/disable-gateway-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/disable-gateway-output))

(clojure.core/defn join-domain ([join-domain-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-join-domain-input join-domain-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/join-domain-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/join-domain-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "JoinDomain", :http.request.configuration/output-deser-fn response-join-domain-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef join-domain :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/join-domain-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/join-domain-output))

(clojure.core/defn add-tags-to-resource ([add-tags-to-resource-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-add-tags-to-resource-input add-tags-to-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/add-tags-to-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/add-tags-to-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTagsToResource", :http.request.configuration/output-deser-fn response-add-tags-to-resource-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/add-tags-to-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/add-tags-to-resource-output))

(clojure.core/defn cancel-archival ([cancel-archival-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-cancel-archival-input cancel-archival-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/cancel-archival-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/cancel-archival-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelArchival", :http.request.configuration/output-deser-fn response-cancel-archival-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef cancel-archival :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/cancel-archival-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/cancel-archival-output))

(clojure.core/defn add-cache ([add-cache-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-add-cache-input add-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/add-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/add-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddCache", :http.request.configuration/output-deser-fn response-add-cache-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef add-cache :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/add-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/add-cache-output))

(clojure.core/defn detach-volume ([detach-volume-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-detach-volume-input detach-volume-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/detach-volume-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/detach-volume-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachVolume", :http.request.configuration/output-deser-fn response-detach-volume-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef detach-volume :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/detach-volume-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/detach-volume-output))

(clojure.core/defn delete-tape-archive ([delete-tape-archive-inputinput] (clojure.core/let [request-function-result__1468878__auto__ (req-delete-tape-archive-input delete-tape-archive-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1468878__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-tape-archive-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-tape-archive-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTapeArchive", :http.request.configuration/output-deser-fn response-delete-tape-archive-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-tape-archive :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-tape-archive-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-tape-archive-output))
