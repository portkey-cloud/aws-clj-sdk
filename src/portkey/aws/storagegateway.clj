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

(clojure.core/defn- response-join-domain-output ([input] (response-join-domain-output nil input)) ([resultWrapper1812422 input] (clojure.core/let [rawinput1812421 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812423 {"GatewayARN" (rawinput1812421 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812423 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812423 ["GatewayARN"])))))))

(clojure.core/defn- response-activate-gateway-output ([input] (response-activate-gateway-output nil input)) ([resultWrapper1812425 input] (clojure.core/let [rawinput1812424 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812426 {"GatewayARN" (rawinput1812424 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812426 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812426 ["GatewayARN"])))))))

(clojure.core/defn- response-list-volume-initiators-output ([input] (response-list-volume-initiators-output nil input)) ([resultWrapper1812428 input] (clojure.core/let [rawinput1812427 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812429 {"Initiators" (rawinput1812427 "Initiators")}] (clojure.core/cond-> {} (letvar1812429 "Initiators") (clojure.core/assoc :initiators (deser-initiators (clojure.core/get-in letvar1812429 ["Initiators"])))))))

(clojure.core/defn- response-describe-bandwidth-rate-limit-output ([input] (response-describe-bandwidth-rate-limit-output nil input)) ([resultWrapper1812431 input] (clojure.core/let [rawinput1812430 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812432 {"GatewayARN" (rawinput1812430 "GatewayARN"), "AverageUploadRateLimitInBitsPerSec" (rawinput1812430 "AverageUploadRateLimitInBitsPerSec"), "AverageDownloadRateLimitInBitsPerSec" (rawinput1812430 "AverageDownloadRateLimitInBitsPerSec")}] (clojure.core/cond-> {} (letvar1812432 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812432 ["GatewayARN"]))) (letvar1812432 "AverageUploadRateLimitInBitsPerSec") (clojure.core/assoc :average-upload-rate-limit-in-bits-per-sec (deser-bandwidth-upload-rate-limit (clojure.core/get-in letvar1812432 ["AverageUploadRateLimitInBitsPerSec"]))) (letvar1812432 "AverageDownloadRateLimitInBitsPerSec") (clojure.core/assoc :average-download-rate-limit-in-bits-per-sec (deser-bandwidth-download-rate-limit (clojure.core/get-in letvar1812432 ["AverageDownloadRateLimitInBitsPerSec"])))))))

(clojure.core/defn- response-list-volume-recovery-points-output ([input] (response-list-volume-recovery-points-output nil input)) ([resultWrapper1812434 input] (clojure.core/let [rawinput1812433 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812435 {"GatewayARN" (rawinput1812433 "GatewayARN"), "VolumeRecoveryPointInfos" (rawinput1812433 "VolumeRecoveryPointInfos")}] (clojure.core/cond-> {} (letvar1812435 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812435 ["GatewayARN"]))) (letvar1812435 "VolumeRecoveryPointInfos") (clojure.core/assoc :volume-recovery-point-infos (deser-volume-recovery-point-infos (clojure.core/get-in letvar1812435 ["VolumeRecoveryPointInfos"])))))))

(clojure.core/defn- response-describe-tape-recovery-points-output ([input] (response-describe-tape-recovery-points-output nil input)) ([resultWrapper1812437 input] (clojure.core/let [rawinput1812436 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812438 {"GatewayARN" (rawinput1812436 "GatewayARN"), "TapeRecoveryPointInfos" (rawinput1812436 "TapeRecoveryPointInfos"), "Marker" (rawinput1812436 "Marker")}] (clojure.core/cond-> {} (letvar1812438 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812438 ["GatewayARN"]))) (letvar1812438 "TapeRecoveryPointInfos") (clojure.core/assoc :tape-recovery-point-infos (deser-tape-recovery-point-infos (clojure.core/get-in letvar1812438 ["TapeRecoveryPointInfos"]))) (letvar1812438 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1812438 ["Marker"])))))))

(clojure.core/defn- response-update-gateway-software-now-output ([input] (response-update-gateway-software-now-output nil input)) ([resultWrapper1812440 input] (clojure.core/let [rawinput1812439 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812441 {"GatewayARN" (rawinput1812439 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812441 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812441 ["GatewayARN"])))))))

(clojure.core/defn- response-start-gateway-output ([input] (response-start-gateway-output nil input)) ([resultWrapper1812443 input] (clojure.core/let [rawinput1812442 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812444 {"GatewayARN" (rawinput1812442 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812444 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812444 ["GatewayARN"])))))))

(clojure.core/defn- response-create-storedi-scsi-volume-output ([input] (response-create-storedi-scsi-volume-output nil input)) ([resultWrapper1812446 input] (clojure.core/let [rawinput1812445 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812447 {"VolumeARN" (rawinput1812445 "VolumeARN"), "VolumeSizeInBytes" (rawinput1812445 "VolumeSizeInBytes"), "TargetARN" (rawinput1812445 "TargetARN")}] (clojure.core/cond-> {} (letvar1812447 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar1812447 ["VolumeARN"]))) (letvar1812447 "VolumeSizeInBytes") (clojure.core/assoc :volume-size-in-bytes (deserlong (clojure.core/get-in letvar1812447 ["VolumeSizeInBytes"]))) (letvar1812447 "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (clojure.core/get-in letvar1812447 ["TargetARN"])))))))

(clojure.core/defn- response-delete-tape-archive-output ([input] (response-delete-tape-archive-output nil input)) ([resultWrapper1812449 input] (clojure.core/let [rawinput1812448 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812450 {"TapeARN" (rawinput1812448 "TapeARN")}] (clojure.core/cond-> {} (letvar1812450 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar1812450 ["TapeARN"])))))))

(clojure.core/defn- response-describe-cache-output ([input] (response-describe-cache-output nil input)) ([resultWrapper1812452 input] (clojure.core/let [rawinput1812451 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812453 {"GatewayARN" (rawinput1812451 "GatewayARN"), "DiskIds" (rawinput1812451 "DiskIds"), "CacheAllocatedInBytes" (rawinput1812451 "CacheAllocatedInBytes"), "CacheUsedPercentage" (rawinput1812451 "CacheUsedPercentage"), "CacheDirtyPercentage" (rawinput1812451 "CacheDirtyPercentage"), "CacheHitPercentage" (rawinput1812451 "CacheHitPercentage"), "CacheMissPercentage" (rawinput1812451 "CacheMissPercentage")}] (clojure.core/cond-> {} (letvar1812453 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812453 ["GatewayARN"]))) (letvar1812453 "DiskIds") (clojure.core/assoc :disk-ids (deser-disk-ids (clojure.core/get-in letvar1812453 ["DiskIds"]))) (letvar1812453 "CacheAllocatedInBytes") (clojure.core/assoc :cache-allocated-in-bytes (deserlong (clojure.core/get-in letvar1812453 ["CacheAllocatedInBytes"]))) (letvar1812453 "CacheUsedPercentage") (clojure.core/assoc :cache-used-percentage (deserdouble (clojure.core/get-in letvar1812453 ["CacheUsedPercentage"]))) (letvar1812453 "CacheDirtyPercentage") (clojure.core/assoc :cache-dirty-percentage (deserdouble (clojure.core/get-in letvar1812453 ["CacheDirtyPercentage"]))) (letvar1812453 "CacheHitPercentage") (clojure.core/assoc :cache-hit-percentage (deserdouble (clojure.core/get-in letvar1812453 ["CacheHitPercentage"]))) (letvar1812453 "CacheMissPercentage") (clojure.core/assoc :cache-miss-percentage (deserdouble (clojure.core/get-in letvar1812453 ["CacheMissPercentage"])))))))

(clojure.core/defn- response-describe-upload-buffer-output ([input] (response-describe-upload-buffer-output nil input)) ([resultWrapper1812455 input] (clojure.core/let [rawinput1812454 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812456 {"GatewayARN" (rawinput1812454 "GatewayARN"), "DiskIds" (rawinput1812454 "DiskIds"), "UploadBufferUsedInBytes" (rawinput1812454 "UploadBufferUsedInBytes"), "UploadBufferAllocatedInBytes" (rawinput1812454 "UploadBufferAllocatedInBytes")}] (clojure.core/cond-> {} (letvar1812456 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812456 ["GatewayARN"]))) (letvar1812456 "DiskIds") (clojure.core/assoc :disk-ids (deser-disk-ids (clojure.core/get-in letvar1812456 ["DiskIds"]))) (letvar1812456 "UploadBufferUsedInBytes") (clojure.core/assoc :upload-buffer-used-in-bytes (deserlong (clojure.core/get-in letvar1812456 ["UploadBufferUsedInBytes"]))) (letvar1812456 "UploadBufferAllocatedInBytes") (clojure.core/assoc :upload-buffer-allocated-in-bytes (deserlong (clojure.core/get-in letvar1812456 ["UploadBufferAllocatedInBytes"])))))))

(clojure.core/defn- response-describe-tape-archives-output ([input] (response-describe-tape-archives-output nil input)) ([resultWrapper1812458 input] (clojure.core/let [rawinput1812457 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812459 {"TapeArchives" (rawinput1812457 "TapeArchives"), "Marker" (rawinput1812457 "Marker")}] (clojure.core/cond-> {} (letvar1812459 "TapeArchives") (clojure.core/assoc :tape-archives (deser-tape-archives (clojure.core/get-in letvar1812459 ["TapeArchives"]))) (letvar1812459 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1812459 ["Marker"])))))))

(clojure.core/defn- response-cancel-archival-output ([input] (response-cancel-archival-output nil input)) ([resultWrapper1812461 input] (clojure.core/let [rawinput1812460 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812462 {"TapeARN" (rawinput1812460 "TapeARN")}] (clojure.core/cond-> {} (letvar1812462 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar1812462 ["TapeARN"])))))))

(clojure.core/defn- response-shutdown-gateway-output ([input] (response-shutdown-gateway-output nil input)) ([resultWrapper1812464 input] (clojure.core/let [rawinput1812463 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812465 {"GatewayARN" (rawinput1812463 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812465 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812465 ["GatewayARN"])))))))

(clojure.core/defn- response-update-vtl-device-type-output ([input] (response-update-vtl-device-type-output nil input)) ([resultWrapper1812467 input] (clojure.core/let [rawinput1812466 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812468 {"VTLDeviceARN" (rawinput1812466 "VTLDeviceARN")}] (clojure.core/cond-> {} (letvar1812468 "VTLDeviceARN") (clojure.core/assoc :vtl-device-arn (deser-vtl-device-arn (clojure.core/get-in letvar1812468 ["VTLDeviceARN"])))))))

(clojure.core/defn- response-update-bandwidth-rate-limit-output ([input] (response-update-bandwidth-rate-limit-output nil input)) ([resultWrapper1812470 input] (clojure.core/let [rawinput1812469 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812471 {"GatewayARN" (rawinput1812469 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812471 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812471 ["GatewayARN"])))))))

(clojure.core/defn- response-delete-chap-credentials-output ([input] (response-delete-chap-credentials-output nil input)) ([resultWrapper1812473 input] (clojure.core/let [rawinput1812472 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812474 {"TargetARN" (rawinput1812472 "TargetARN"), "InitiatorName" (rawinput1812472 "InitiatorName")}] (clojure.core/cond-> {} (letvar1812474 "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (clojure.core/get-in letvar1812474 ["TargetARN"]))) (letvar1812474 "InitiatorName") (clojure.core/assoc :initiator-name (deser-iqn-name (clojure.core/get-in letvar1812474 ["InitiatorName"])))))))

(clojure.core/defn- response-describe-chap-credentials-output ([input] (response-describe-chap-credentials-output nil input)) ([resultWrapper1812476 input] (clojure.core/let [rawinput1812475 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812477 {"ChapCredentials" (rawinput1812475 "ChapCredentials")}] (clojure.core/cond-> {} (letvar1812477 "ChapCredentials") (clojure.core/assoc :chap-credentials (deser-chap-credentials (clojure.core/get-in letvar1812477 ["ChapCredentials"])))))))

(clojure.core/defn- response-refresh-cache-output ([input] (response-refresh-cache-output nil input)) ([resultWrapper1812479 input] (clojure.core/let [rawinput1812478 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812480 {"FileShareARN" (rawinput1812478 "FileShareARN"), "NotificationId" (rawinput1812478 "NotificationId")}] (clojure.core/cond-> {} (letvar1812480 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar1812480 ["FileShareARN"]))) (letvar1812480 "NotificationId") (clojure.core/assoc :notification-id (deser-notification-id (clojure.core/get-in letvar1812480 ["NotificationId"])))))))

(clojure.core/defn- response-add-cache-output ([input] (response-add-cache-output nil input)) ([resultWrapper1812482 input] (clojure.core/let [rawinput1812481 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812483 {"GatewayARN" (rawinput1812481 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812483 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812483 ["GatewayARN"])))))))

(clojure.core/defn- response-describe-maintenance-start-time-output ([input] (response-describe-maintenance-start-time-output nil input)) ([resultWrapper1812485 input] (clojure.core/let [rawinput1812484 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812486 {"GatewayARN" (rawinput1812484 "GatewayARN"), "HourOfDay" (rawinput1812484 "HourOfDay"), "MinuteOfHour" (rawinput1812484 "MinuteOfHour"), "DayOfWeek" (rawinput1812484 "DayOfWeek"), "Timezone" (rawinput1812484 "Timezone")}] (clojure.core/cond-> {} (letvar1812486 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812486 ["GatewayARN"]))) (letvar1812486 "HourOfDay") (clojure.core/assoc :hour-of-day (deser-hour-of-day (clojure.core/get-in letvar1812486 ["HourOfDay"]))) (letvar1812486 "MinuteOfHour") (clojure.core/assoc :minute-of-hour (deser-minute-of-hour (clojure.core/get-in letvar1812486 ["MinuteOfHour"]))) (letvar1812486 "DayOfWeek") (clojure.core/assoc :day-of-week (deser-day-of-week (clojure.core/get-in letvar1812486 ["DayOfWeek"]))) (letvar1812486 "Timezone") (clojure.core/assoc :timezone (deser-gateway-timezone (clojure.core/get-in letvar1812486 ["Timezone"])))))))

(clojure.core/defn- response-create-tapes-output ([input] (response-create-tapes-output nil input)) ([resultWrapper1812488 input] (clojure.core/let [rawinput1812487 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812489 {"TapeARNs" (rawinput1812487 "TapeARNs")}] (clojure.core/cond-> {} (letvar1812489 "TapeARNs") (clojure.core/assoc :tape-ar-ns (deser-tape-ar-ns (clojure.core/get-in letvar1812489 ["TapeARNs"])))))))

(clojure.core/defn- response-set-smb-guest-password-output ([input] (response-set-smb-guest-password-output nil input)) ([resultWrapper1812491 input] (clojure.core/let [rawinput1812490 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812492 {"GatewayARN" (rawinput1812490 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812492 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812492 ["GatewayARN"])))))))

(clojure.core/defn- response-create-snapshot-from-volume-recovery-point-output ([input] (response-create-snapshot-from-volume-recovery-point-output nil input)) ([resultWrapper1812494 input] (clojure.core/let [rawinput1812493 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812495 {"SnapshotId" (rawinput1812493 "SnapshotId"), "VolumeARN" (rawinput1812493 "VolumeARN"), "VolumeRecoveryPointTime" (rawinput1812493 "VolumeRecoveryPointTime")}] (clojure.core/cond-> {} (letvar1812495 "SnapshotId") (clojure.core/assoc :snapshot-id (deser-snapshot-id (clojure.core/get-in letvar1812495 ["SnapshotId"]))) (letvar1812495 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar1812495 ["VolumeARN"]))) (letvar1812495 "VolumeRecoveryPointTime") (clojure.core/assoc :volume-recovery-point-time (deserstring (clojure.core/get-in letvar1812495 ["VolumeRecoveryPointTime"])))))))

(clojure.core/defn- response-cancel-retrieval-output ([input] (response-cancel-retrieval-output nil input)) ([resultWrapper1812497 input] (clojure.core/let [rawinput1812496 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812498 {"TapeARN" (rawinput1812496 "TapeARN")}] (clojure.core/cond-> {} (letvar1812498 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar1812498 ["TapeARN"])))))))

(clojure.core/defn- response-list-local-disks-output ([input] (response-list-local-disks-output nil input)) ([resultWrapper1812500 input] (clojure.core/let [rawinput1812499 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812501 {"GatewayARN" (rawinput1812499 "GatewayARN"), "Disks" (rawinput1812499 "Disks")}] (clojure.core/cond-> {} (letvar1812501 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812501 ["GatewayARN"]))) (letvar1812501 "Disks") (clojure.core/assoc :disks (deser-disks (clojure.core/get-in letvar1812501 ["Disks"])))))))

(clojure.core/defn- response-create-snapshot-output ([input] (response-create-snapshot-output nil input)) ([resultWrapper1812503 input] (clojure.core/let [rawinput1812502 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812504 {"VolumeARN" (rawinput1812502 "VolumeARN"), "SnapshotId" (rawinput1812502 "SnapshotId")}] (clojure.core/cond-> {} (letvar1812504 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar1812504 ["VolumeARN"]))) (letvar1812504 "SnapshotId") (clojure.core/assoc :snapshot-id (deser-snapshot-id (clojure.core/get-in letvar1812504 ["SnapshotId"])))))))

(clojure.core/defn- response-describe-gateway-information-output ([input] (response-describe-gateway-information-output nil input)) ([resultWrapper1812506 input] (clojure.core/let [rawinput1812505 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812507 {"LastSoftwareUpdate" (rawinput1812505 "LastSoftwareUpdate"), "NextUpdateAvailabilityDate" (rawinput1812505 "NextUpdateAvailabilityDate"), "GatewayNetworkInterfaces" (rawinput1812505 "GatewayNetworkInterfaces"), "Tags" (rawinput1812505 "Tags"), "GatewayName" (rawinput1812505 "GatewayName"), "GatewayId" (rawinput1812505 "GatewayId"), "GatewayState" (rawinput1812505 "GatewayState"), "GatewayType" (rawinput1812505 "GatewayType"), "GatewayTimezone" (rawinput1812505 "GatewayTimezone"), "GatewayARN" (rawinput1812505 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812507 "LastSoftwareUpdate") (clojure.core/assoc :last-software-update (deser-last-software-update (clojure.core/get-in letvar1812507 ["LastSoftwareUpdate"]))) (letvar1812507 "NextUpdateAvailabilityDate") (clojure.core/assoc :next-update-availability-date (deser-next-update-availability-date (clojure.core/get-in letvar1812507 ["NextUpdateAvailabilityDate"]))) (letvar1812507 "GatewayNetworkInterfaces") (clojure.core/assoc :gateway-network-interfaces (deser-gateway-network-interfaces (clojure.core/get-in letvar1812507 ["GatewayNetworkInterfaces"]))) (letvar1812507 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1812507 ["Tags"]))) (letvar1812507 "GatewayName") (clojure.core/assoc :gateway-name (deserstring (clojure.core/get-in letvar1812507 ["GatewayName"]))) (letvar1812507 "GatewayId") (clojure.core/assoc :gateway-id (deser-gateway-id (clojure.core/get-in letvar1812507 ["GatewayId"]))) (letvar1812507 "GatewayState") (clojure.core/assoc :gateway-state (deser-gateway-state (clojure.core/get-in letvar1812507 ["GatewayState"]))) (letvar1812507 "GatewayType") (clojure.core/assoc :gateway-type (deser-gateway-type (clojure.core/get-in letvar1812507 ["GatewayType"]))) (letvar1812507 "GatewayTimezone") (clojure.core/assoc :gateway-timezone (deser-gateway-timezone (clojure.core/get-in letvar1812507 ["GatewayTimezone"]))) (letvar1812507 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812507 ["GatewayARN"])))))))

(clojure.core/defn- response-create-smb-file-share-output ([input] (response-create-smb-file-share-output nil input)) ([resultWrapper1812509 input] (clojure.core/let [rawinput1812508 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812510 {"FileShareARN" (rawinput1812508 "FileShareARN")}] (clojure.core/cond-> {} (letvar1812510 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar1812510 ["FileShareARN"])))))))

(clojure.core/defn- response-add-upload-buffer-output ([input] (response-add-upload-buffer-output nil input)) ([resultWrapper1812512 input] (clojure.core/let [rawinput1812511 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812513 {"GatewayARN" (rawinput1812511 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812513 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812513 ["GatewayARN"])))))))

(clojure.core/defn- response-describe-storedi-scsi-volumes-output ([input] (response-describe-storedi-scsi-volumes-output nil input)) ([resultWrapper1812515 input] (clojure.core/let [rawinput1812514 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812516 {"StorediSCSIVolumes" (rawinput1812514 "StorediSCSIVolumes")}] (clojure.core/cond-> {} (letvar1812516 "StorediSCSIVolumes") (clojure.core/assoc :storedi-scsi-volumes (deser-storedi-scsi-volumes (clojure.core/get-in letvar1812516 ["StorediSCSIVolumes"])))))))

(clojure.core/defn- response-list-volumes-output ([input] (response-list-volumes-output nil input)) ([resultWrapper1812518 input] (clojure.core/let [rawinput1812517 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812519 {"GatewayARN" (rawinput1812517 "GatewayARN"), "Marker" (rawinput1812517 "Marker"), "VolumeInfos" (rawinput1812517 "VolumeInfos")}] (clojure.core/cond-> {} (letvar1812519 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812519 ["GatewayARN"]))) (letvar1812519 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1812519 ["Marker"]))) (letvar1812519 "VolumeInfos") (clojure.core/assoc :volume-infos (deser-volume-infos (clojure.core/get-in letvar1812519 ["VolumeInfos"])))))))

(clojure.core/defn- response-disable-gateway-output ([input] (response-disable-gateway-output nil input)) ([resultWrapper1812521 input] (clojure.core/let [rawinput1812520 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812522 {"GatewayARN" (rawinput1812520 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812522 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812522 ["GatewayARN"])))))))

(clojure.core/defn- response-list-file-shares-output ([input] (response-list-file-shares-output nil input)) ([resultWrapper1812524 input] (clojure.core/let [rawinput1812523 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812525 {"Marker" (rawinput1812523 "Marker"), "NextMarker" (rawinput1812523 "NextMarker"), "FileShareInfoList" (rawinput1812523 "FileShareInfoList")}] (clojure.core/cond-> {} (letvar1812525 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1812525 ["Marker"]))) (letvar1812525 "NextMarker") (clojure.core/assoc :next-marker (deser-marker (clojure.core/get-in letvar1812525 ["NextMarker"]))) (letvar1812525 "FileShareInfoList") (clojure.core/assoc :file-share-info-list (deser-file-share-info-list (clojure.core/get-in letvar1812525 ["FileShareInfoList"])))))))

(clojure.core/defn- response-remove-tags-from-resource-output ([input] (response-remove-tags-from-resource-output nil input)) ([resultWrapper1812527 input] (clojure.core/let [rawinput1812526 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812528 {"ResourceARN" (rawinput1812526 "ResourceARN")}] (clojure.core/cond-> {} (letvar1812528 "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (clojure.core/get-in letvar1812528 ["ResourceARN"])))))))

(clojure.core/defn- response-delete-snapshot-schedule-output ([input] (response-delete-snapshot-schedule-output nil input)) ([resultWrapper1812530 input] (clojure.core/let [rawinput1812529 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812531 {"VolumeARN" (rawinput1812529 "VolumeARN")}] (clojure.core/cond-> {} (letvar1812531 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar1812531 ["VolumeARN"])))))))

(clojure.core/defn- response-describe-smb-settings-output ([input] (response-describe-smb-settings-output nil input)) ([resultWrapper1812533 input] (clojure.core/let [rawinput1812532 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812534 {"GatewayARN" (rawinput1812532 "GatewayARN"), "DomainName" (rawinput1812532 "DomainName"), "SMBGuestPasswordSet" (rawinput1812532 "SMBGuestPasswordSet")}] (clojure.core/cond-> {} (letvar1812534 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812534 ["GatewayARN"]))) (letvar1812534 "DomainName") (clojure.core/assoc :domain-name (deser-domain-name (clojure.core/get-in letvar1812534 ["DomainName"]))) (letvar1812534 "SMBGuestPasswordSet") (clojure.core/assoc :smb-guest-password-set (deser-boolean (clojure.core/get-in letvar1812534 ["SMBGuestPasswordSet"])))))))

(clojure.core/defn- response-delete-bandwidth-rate-limit-output ([input] (response-delete-bandwidth-rate-limit-output nil input)) ([resultWrapper1812536 input] (clojure.core/let [rawinput1812535 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812537 {"GatewayARN" (rawinput1812535 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812537 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812537 ["GatewayARN"])))))))

(clojure.core/defn- response-update-maintenance-start-time-output ([input] (response-update-maintenance-start-time-output nil input)) ([resultWrapper1812539 input] (clojure.core/let [rawinput1812538 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812540 {"GatewayARN" (rawinput1812538 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812540 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812540 ["GatewayARN"])))))))

(clojure.core/defn- response-delete-gateway-output ([input] (response-delete-gateway-output nil input)) ([resultWrapper1812542 input] (clojure.core/let [rawinput1812541 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812543 {"GatewayARN" (rawinput1812541 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812543 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812543 ["GatewayARN"])))))))

(clojure.core/defn- response-list-gateways-output ([input] (response-list-gateways-output nil input)) ([resultWrapper1812545 input] (clojure.core/let [rawinput1812544 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812546 {"Gateways" (rawinput1812544 "Gateways"), "Marker" (rawinput1812544 "Marker")}] (clojure.core/cond-> {} (letvar1812546 "Gateways") (clojure.core/assoc :gateways (deser-gateways (clojure.core/get-in letvar1812546 ["Gateways"]))) (letvar1812546 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1812546 ["Marker"])))))))

(clojure.core/defn- response-update-nfs-file-share-output ([input] (response-update-nfs-file-share-output nil input)) ([resultWrapper1812548 input] (clojure.core/let [rawinput1812547 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812549 {"FileShareARN" (rawinput1812547 "FileShareARN")}] (clojure.core/cond-> {} (letvar1812549 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar1812549 ["FileShareARN"])))))))

(clojure.core/defn- response-update-gateway-information-output ([input] (response-update-gateway-information-output nil input)) ([resultWrapper1812551 input] (clojure.core/let [rawinput1812550 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812552 {"GatewayARN" (rawinput1812550 "GatewayARN"), "GatewayName" (rawinput1812550 "GatewayName")}] (clojure.core/cond-> {} (letvar1812552 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812552 ["GatewayARN"]))) (letvar1812552 "GatewayName") (clojure.core/assoc :gateway-name (deserstring (clojure.core/get-in letvar1812552 ["GatewayName"])))))))

(clojure.core/defn- response-service-unavailable-error ([input] (response-service-unavailable-error nil input)) ([resultWrapper1812554 input] (clojure.core/let [rawinput1812553 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812555 {"message" (rawinput1812553 "message"), "error" (rawinput1812553 "error")}] (clojure.core/cond-> {} (letvar1812555 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1812555 ["message"]))) (letvar1812555 "error") (clojure.core/assoc :error (deser-storage-gateway-error (clojure.core/get-in letvar1812555 ["error"])))))))

(clojure.core/defn- response-describe-nfs-file-shares-output ([input] (response-describe-nfs-file-shares-output nil input)) ([resultWrapper1812557 input] (clojure.core/let [rawinput1812556 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812558 {"NFSFileShareInfoList" (rawinput1812556 "NFSFileShareInfoList")}] (clojure.core/cond-> {} (letvar1812558 "NFSFileShareInfoList") (clojure.core/assoc :nfs-file-share-info-list (deser-nfs-file-share-info-list (clojure.core/get-in letvar1812558 ["NFSFileShareInfoList"])))))))

(clojure.core/defn- response-list-tags-for-resource-output ([input] (response-list-tags-for-resource-output nil input)) ([resultWrapper1812560 input] (clojure.core/let [rawinput1812559 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812561 {"ResourceARN" (rawinput1812559 "ResourceARN"), "Marker" (rawinput1812559 "Marker"), "Tags" (rawinput1812559 "Tags")}] (clojure.core/cond-> {} (letvar1812561 "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (clojure.core/get-in letvar1812561 ["ResourceARN"]))) (letvar1812561 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1812561 ["Marker"]))) (letvar1812561 "Tags") (clojure.core/assoc :tags (deser-tags (clojure.core/get-in letvar1812561 ["Tags"])))))))

(clojure.core/defn- response-attach-volume-output ([input] (response-attach-volume-output nil input)) ([resultWrapper1812563 input] (clojure.core/let [rawinput1812562 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812564 {"VolumeARN" (rawinput1812562 "VolumeARN"), "TargetARN" (rawinput1812562 "TargetARN")}] (clojure.core/cond-> {} (letvar1812564 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar1812564 ["VolumeARN"]))) (letvar1812564 "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (clojure.core/get-in letvar1812564 ["TargetARN"])))))))

(clojure.core/defn- response-reset-cache-output ([input] (response-reset-cache-output nil input)) ([resultWrapper1812566 input] (clojure.core/let [rawinput1812565 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812567 {"GatewayARN" (rawinput1812565 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812567 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812567 ["GatewayARN"])))))))

(clojure.core/defn- response-describe-snapshot-schedule-output ([input] (response-describe-snapshot-schedule-output nil input)) ([resultWrapper1812569 input] (clojure.core/let [rawinput1812568 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812570 {"VolumeARN" (rawinput1812568 "VolumeARN"), "StartAt" (rawinput1812568 "StartAt"), "RecurrenceInHours" (rawinput1812568 "RecurrenceInHours"), "Description" (rawinput1812568 "Description"), "Timezone" (rawinput1812568 "Timezone")}] (clojure.core/cond-> {} (letvar1812570 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar1812570 ["VolumeARN"]))) (letvar1812570 "StartAt") (clojure.core/assoc :start-at (deser-hour-of-day (clojure.core/get-in letvar1812570 ["StartAt"]))) (letvar1812570 "RecurrenceInHours") (clojure.core/assoc :recurrence-in-hours (deser-recurrence-in-hours (clojure.core/get-in letvar1812570 ["RecurrenceInHours"]))) (letvar1812570 "Description") (clojure.core/assoc :description (deser-description (clojure.core/get-in letvar1812570 ["Description"]))) (letvar1812570 "Timezone") (clojure.core/assoc :timezone (deser-gateway-timezone (clojure.core/get-in letvar1812570 ["Timezone"])))))))

(clojure.core/defn- response-retrieve-tape-archive-output ([input] (response-retrieve-tape-archive-output nil input)) ([resultWrapper1812572 input] (clojure.core/let [rawinput1812571 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812573 {"TapeARN" (rawinput1812571 "TapeARN")}] (clojure.core/cond-> {} (letvar1812573 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar1812573 ["TapeARN"])))))))

(clojure.core/defn- response-describe-vtl-devices-output ([input] (response-describe-vtl-devices-output nil input)) ([resultWrapper1812575 input] (clojure.core/let [rawinput1812574 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812576 {"GatewayARN" (rawinput1812574 "GatewayARN"), "VTLDevices" (rawinput1812574 "VTLDevices"), "Marker" (rawinput1812574 "Marker")}] (clojure.core/cond-> {} (letvar1812576 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812576 ["GatewayARN"]))) (letvar1812576 "VTLDevices") (clojure.core/assoc :vtl-devices (deser-vtl-devices (clojure.core/get-in letvar1812576 ["VTLDevices"]))) (letvar1812576 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1812576 ["Marker"])))))))

(clojure.core/defn- response-add-tags-to-resource-output ([input] (response-add-tags-to-resource-output nil input)) ([resultWrapper1812578 input] (clojure.core/let [rawinput1812577 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812579 {"ResourceARN" (rawinput1812577 "ResourceARN")}] (clojure.core/cond-> {} (letvar1812579 "ResourceARN") (clojure.core/assoc :resource-arn (deser-resource-arn (clojure.core/get-in letvar1812579 ["ResourceARN"])))))))

(clojure.core/defn- response-delete-tape-output ([input] (response-delete-tape-output nil input)) ([resultWrapper1812581 input] (clojure.core/let [rawinput1812580 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812582 {"TapeARN" (rawinput1812580 "TapeARN")}] (clojure.core/cond-> {} (letvar1812582 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar1812582 ["TapeARN"])))))))

(clojure.core/defn- response-retrieve-tape-recovery-point-output ([input] (response-retrieve-tape-recovery-point-output nil input)) ([resultWrapper1812584 input] (clojure.core/let [rawinput1812583 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812585 {"TapeARN" (rawinput1812583 "TapeARN")}] (clojure.core/cond-> {} (letvar1812585 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar1812585 ["TapeARN"])))))))

(clojure.core/defn- response-notify-when-uploaded-output ([input] (response-notify-when-uploaded-output nil input)) ([resultWrapper1812587 input] (clojure.core/let [rawinput1812586 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812588 {"FileShareARN" (rawinput1812586 "FileShareARN"), "NotificationId" (rawinput1812586 "NotificationId")}] (clojure.core/cond-> {} (letvar1812588 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar1812588 ["FileShareARN"]))) (letvar1812588 "NotificationId") (clojure.core/assoc :notification-id (deser-notification-id (clojure.core/get-in letvar1812588 ["NotificationId"])))))))

(clojure.core/defn- response-delete-file-share-output ([input] (response-delete-file-share-output nil input)) ([resultWrapper1812590 input] (clojure.core/let [rawinput1812589 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812591 {"FileShareARN" (rawinput1812589 "FileShareARN")}] (clojure.core/cond-> {} (letvar1812591 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar1812591 ["FileShareARN"])))))))

(clojure.core/defn- response-describe-cachedi-scsi-volumes-output ([input] (response-describe-cachedi-scsi-volumes-output nil input)) ([resultWrapper1812593 input] (clojure.core/let [rawinput1812592 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812594 {"CachediSCSIVolumes" (rawinput1812592 "CachediSCSIVolumes")}] (clojure.core/cond-> {} (letvar1812594 "CachediSCSIVolumes") (clojure.core/assoc :cachedi-scsi-volumes (deser-cachedi-scsi-volumes (clojure.core/get-in letvar1812594 ["CachediSCSIVolumes"])))))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper1812596 input] (clojure.core/let [rawinput1812595 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812597 {"message" (rawinput1812595 "message"), "error" (rawinput1812595 "error")}] (clojure.core/cond-> {} (letvar1812597 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1812597 ["message"]))) (letvar1812597 "error") (clojure.core/assoc :error (deser-storage-gateway-error (clojure.core/get-in letvar1812597 ["error"])))))))

(clojure.core/defn- response-list-tapes-output ([input] (response-list-tapes-output nil input)) ([resultWrapper1812599 input] (clojure.core/let [rawinput1812598 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812600 {"TapeInfos" (rawinput1812598 "TapeInfos"), "Marker" (rawinput1812598 "Marker")}] (clojure.core/cond-> {} (letvar1812600 "TapeInfos") (clojure.core/assoc :tape-infos (deser-tape-infos (clojure.core/get-in letvar1812600 ["TapeInfos"]))) (letvar1812600 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1812600 ["Marker"])))))))

(clojure.core/defn- response-update-smb-file-share-output ([input] (response-update-smb-file-share-output nil input)) ([resultWrapper1812602 input] (clojure.core/let [rawinput1812601 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812603 {"FileShareARN" (rawinput1812601 "FileShareARN")}] (clojure.core/cond-> {} (letvar1812603 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar1812603 ["FileShareARN"])))))))

(clojure.core/defn- response-update-chap-credentials-output ([input] (response-update-chap-credentials-output nil input)) ([resultWrapper1812605 input] (clojure.core/let [rawinput1812604 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812606 {"TargetARN" (rawinput1812604 "TargetARN"), "InitiatorName" (rawinput1812604 "InitiatorName")}] (clojure.core/cond-> {} (letvar1812606 "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (clojure.core/get-in letvar1812606 ["TargetARN"]))) (letvar1812606 "InitiatorName") (clojure.core/assoc :initiator-name (deser-iqn-name (clojure.core/get-in letvar1812606 ["InitiatorName"])))))))

(clojure.core/defn- response-update-snapshot-schedule-output ([input] (response-update-snapshot-schedule-output nil input)) ([resultWrapper1812608 input] (clojure.core/let [rawinput1812607 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812609 {"VolumeARN" (rawinput1812607 "VolumeARN")}] (clojure.core/cond-> {} (letvar1812609 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar1812609 ["VolumeARN"])))))))

(clojure.core/defn- response-delete-volume-output ([input] (response-delete-volume-output nil input)) ([resultWrapper1812611 input] (clojure.core/let [rawinput1812610 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812612 {"VolumeARN" (rawinput1812610 "VolumeARN")}] (clojure.core/cond-> {} (letvar1812612 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar1812612 ["VolumeARN"])))))))

(clojure.core/defn- response-add-working-storage-output ([input] (response-add-working-storage-output nil input)) ([resultWrapper1812614 input] (clojure.core/let [rawinput1812613 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812615 {"GatewayARN" (rawinput1812613 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812615 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812615 ["GatewayARN"])))))))

(clojure.core/defn- response-create-tape-with-barcode-output ([input] (response-create-tape-with-barcode-output nil input)) ([resultWrapper1812617 input] (clojure.core/let [rawinput1812616 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812618 {"TapeARN" (rawinput1812616 "TapeARN")}] (clojure.core/cond-> {} (letvar1812618 "TapeARN") (clojure.core/assoc :tape-arn (deser-tape-arn (clojure.core/get-in letvar1812618 ["TapeARN"])))))))

(clojure.core/defn- response-invalid-gateway-request-exception ([input] (response-invalid-gateway-request-exception nil input)) ([resultWrapper1812620 input] (clojure.core/let [rawinput1812619 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812621 {"message" (rawinput1812619 "message"), "error" (rawinput1812619 "error")}] (clojure.core/cond-> {} (letvar1812621 "message") (clojure.core/assoc :message (deserstring (clojure.core/get-in letvar1812621 ["message"]))) (letvar1812621 "error") (clojure.core/assoc :error (deser-storage-gateway-error (clojure.core/get-in letvar1812621 ["error"])))))))

(clojure.core/defn- response-describe-smb-file-shares-output ([input] (response-describe-smb-file-shares-output nil input)) ([resultWrapper1812623 input] (clojure.core/let [rawinput1812622 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812624 {"SMBFileShareInfoList" (rawinput1812622 "SMBFileShareInfoList")}] (clojure.core/cond-> {} (letvar1812624 "SMBFileShareInfoList") (clojure.core/assoc :smb-file-share-info-list (deser-smb-file-share-info-list (clojure.core/get-in letvar1812624 ["SMBFileShareInfoList"])))))))

(clojure.core/defn- response-describe-tapes-output ([input] (response-describe-tapes-output nil input)) ([resultWrapper1812626 input] (clojure.core/let [rawinput1812625 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812627 {"Tapes" (rawinput1812625 "Tapes"), "Marker" (rawinput1812625 "Marker")}] (clojure.core/cond-> {} (letvar1812627 "Tapes") (clojure.core/assoc :tapes (deser-tapes (clojure.core/get-in letvar1812627 ["Tapes"]))) (letvar1812627 "Marker") (clojure.core/assoc :marker (deser-marker (clojure.core/get-in letvar1812627 ["Marker"])))))))

(clojure.core/defn- response-create-cachedi-scsi-volume-output ([input] (response-create-cachedi-scsi-volume-output nil input)) ([resultWrapper1812629 input] (clojure.core/let [rawinput1812628 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812630 {"VolumeARN" (rawinput1812628 "VolumeARN"), "TargetARN" (rawinput1812628 "TargetARN")}] (clojure.core/cond-> {} (letvar1812630 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar1812630 ["VolumeARN"]))) (letvar1812630 "TargetARN") (clojure.core/assoc :target-arn (deser-target-arn (clojure.core/get-in letvar1812630 ["TargetARN"])))))))

(clojure.core/defn- response-set-local-console-password-output ([input] (response-set-local-console-password-output nil input)) ([resultWrapper1812632 input] (clojure.core/let [rawinput1812631 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812633 {"GatewayARN" (rawinput1812631 "GatewayARN")}] (clojure.core/cond-> {} (letvar1812633 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812633 ["GatewayARN"])))))))

(clojure.core/defn- response-create-nfs-file-share-output ([input] (response-create-nfs-file-share-output nil input)) ([resultWrapper1812635 input] (clojure.core/let [rawinput1812634 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812636 {"FileShareARN" (rawinput1812634 "FileShareARN")}] (clojure.core/cond-> {} (letvar1812636 "FileShareARN") (clojure.core/assoc :file-share-arn (deser-file-share-arn (clojure.core/get-in letvar1812636 ["FileShareARN"])))))))

(clojure.core/defn- response-describe-working-storage-output ([input] (response-describe-working-storage-output nil input)) ([resultWrapper1812638 input] (clojure.core/let [rawinput1812637 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812639 {"GatewayARN" (rawinput1812637 "GatewayARN"), "DiskIds" (rawinput1812637 "DiskIds"), "WorkingStorageUsedInBytes" (rawinput1812637 "WorkingStorageUsedInBytes"), "WorkingStorageAllocatedInBytes" (rawinput1812637 "WorkingStorageAllocatedInBytes")}] (clojure.core/cond-> {} (letvar1812639 "GatewayARN") (clojure.core/assoc :gateway-arn (deser-gateway-arn (clojure.core/get-in letvar1812639 ["GatewayARN"]))) (letvar1812639 "DiskIds") (clojure.core/assoc :disk-ids (deser-disk-ids (clojure.core/get-in letvar1812639 ["DiskIds"]))) (letvar1812639 "WorkingStorageUsedInBytes") (clojure.core/assoc :working-storage-used-in-bytes (deserlong (clojure.core/get-in letvar1812639 ["WorkingStorageUsedInBytes"]))) (letvar1812639 "WorkingStorageAllocatedInBytes") (clojure.core/assoc :working-storage-allocated-in-bytes (deserlong (clojure.core/get-in letvar1812639 ["WorkingStorageAllocatedInBytes"])))))))

(clojure.core/defn- response-detach-volume-output ([input] (response-detach-volume-output nil input)) ([resultWrapper1812641 input] (clojure.core/let [rawinput1812640 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1812642 {"VolumeARN" (rawinput1812640 "VolumeARN")}] (clojure.core/cond-> {} (letvar1812642 "VolumeARN") (clojure.core/assoc :volume-arn (deser-volume-arn (clojure.core/get-in letvar1812642 ["VolumeARN"])))))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/disk-allocation-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.activate-gateway-input/gateway-region (clojure.spec.alpha/and :portkey.aws.storagegateway/region-id))
(clojure.spec.alpha/def :portkey.aws.storagegateway/activate-gateway-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/activation-key :portkey.aws.storagegateway/gateway-name :portkey.aws.storagegateway/gateway-timezone :portkey.aws.storagegateway.activate-gateway-input/gateway-region] :opt-un [:portkey.aws.storagegateway/gateway-type :portkey.aws.storagegateway/tape-drive-type :portkey.aws.storagegateway/medium-changer-type :portkey.aws.storagegateway/tags]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-bandwidth-rate-limit-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-volume-recovery-points-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/volume-recovery-point-infos]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-upload-buffer-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/notification-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/last-software-update (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 25))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-type :portkey.aws.storagegateway/file-share-arn :portkey.aws.storagegateway/file-share-id :portkey.aws.storagegateway/file-share-status :portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/start-gateway-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.list-tapes-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/list-tapes-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-ar-ns :portkey.aws.storagegateway/marker :portkey.aws.storagegateway.list-tapes-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-gateway-software-now-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway/bandwidth-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 25))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-attachment-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-used-in-bytes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/day-of-week (clojure.spec.alpha/int-in 0 6))

(clojure.spec.alpha/def :portkey.aws.storagegateway/location-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 16 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 310))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.update-chap-credentials-input/secret-to-authenticate-initiator (clojure.spec.alpha/and :portkey.aws.storagegateway/chap-secret))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-chap-credentials-input/initiator-name (clojure.spec.alpha/and :portkey.aws.storagegateway/iqn-name))
(clojure.spec.alpha/def :portkey.aws.storagegateway.update-chap-credentials-input/secret-to-authenticate-target (clojure.spec.alpha/and :portkey.aws.storagegateway/chap-secret))
(clojure.spec.alpha/def :portkey.aws.storagegateway/update-chap-credentials-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/target-arn :portkey.aws.storagegateway.update-chap-credentials-input/secret-to-authenticate-initiator :portkey.aws.storagegateway.update-chap-credentials-input/initiator-name] :opt-un [:portkey.aws.storagegateway.update-chap-credentials-input/secret-to-authenticate-target]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-infos (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/volume-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/bandwidth-download-rate-limit clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/storedi-scsi-volumes (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/storedi-scsi-volume))

(clojure.spec.alpha/def :portkey.aws.storagegateway/start-gateway-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-device (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/vtl-device-arn :portkey.aws.storagegateway/vtl-device-type :portkey.aws.storagegateway/vtl-device-vendor :portkey.aws.storagegateway/vtl-device-product-identifier :portkey.aws.storagegateway/devicei-scsi-attributes]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-barcode-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[A-Z]*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/next-update-availability-date (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 25))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/folder (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 30))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-gateway-information-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un [:portkey.aws.storagegateway/gateway-name :portkey.aws.storagegateway/gateway-timezone]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/volume-arn))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-device-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-cache-output/cache-allocated-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-cache-output/cache-used-percentage (clojure.spec.alpha/and :portkey.aws.storagegateway/double))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-cache-output/cache-dirty-percentage (clojure.spec.alpha/and :portkey.aws.storagegateway/double))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-cache-output/cache-hit-percentage (clojure.spec.alpha/and :portkey.aws.storagegateway/double))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-cache-output/cache-miss-percentage (clojure.spec.alpha/and :portkey.aws.storagegateway/double))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-cache-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids :portkey.aws.storagegateway.describe-cache-output/cache-allocated-in-bytes :portkey.aws.storagegateway.describe-cache-output/cache-used-percentage :portkey.aws.storagegateway.describe-cache-output/cache-dirty-percentage :portkey.aws.storagegateway.describe-cache-output/cache-hit-percentage :portkey.aws.storagegateway.describe-cache-output/cache-miss-percentage]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/marker (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1000))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-upload-buffer-output/upload-buffer-used-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-upload-buffer-output/upload-buffer-allocated-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-upload-buffer-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids :portkey.aws.storagegateway.describe-upload-buffer-output/upload-buffer-used-in-bytes :portkey.aws.storagegateway.describe-upload-buffer-output/upload-buffer-allocated-in-bytes]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tag-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/network-interface-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]?\d?\d)){3}\z" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/target-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 50 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 800))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/disk-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 300))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/medium-changer-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/permission-mode (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 4)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[0-7]{4}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/nfs-file-share-info-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/nfs-file-share-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/snapshot-description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/cancel-retrieval-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-local-disks-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disks]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-snapshot-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/snapshot-id]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-recovery-point-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-ar-ns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-maintenance-start-time-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/hour-of-day :portkey.aws.storagegateway/minute-of-hour :portkey.aws.storagegateway/day-of-week] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/reset-cache-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-gateway-information-output/gateway-name (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-gateway-information-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/last-software-update :portkey.aws.storagegateway/next-update-availability-date :portkey.aws.storagegateway/gateway-network-interfaces :portkey.aws.storagegateway/tags :portkey.aws.storagegateway.describe-gateway-information-output/gateway-name :portkey.aws.storagegateway/gateway-id :portkey.aws.storagegateway/gateway-state :portkey.aws.storagegateway/gateway-type :portkey.aws.storagegateway/gateway-timezone :portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/kms-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 7 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-status (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.storagegateway/role (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 20 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 2048))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-smb-file-share-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/remove-tags-from-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/resource-arn :portkey.aws.storagegateway/tag-keys] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-upload-buffer-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/activation-key (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[ -\.0-\[\]-~]*[!-\.0-\[\]-~][ -\.0-\[\]-~]*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.set-smb-guest-password-input/password (clojure.spec.alpha/and :portkey.aws.storagegateway/smb-guest-password))
(clojure.spec.alpha/def :portkey.aws.storagegateway/set-smb-guest-password-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway.set-smb-guest-password-input/password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-tags-to-resource-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/resource-arn :portkey.aws.storagegateway/tags] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/disks (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/disk))

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-tape-archives-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-tape-archives-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-ar-ns :portkey.aws.storagegateway/marker :portkey.aws.storagegateway.describe-tape-archives-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 50 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/description (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tag-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/chap-credentials (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/chap-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/ipv-4-address-cidr (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])(\/([0-9]|[1-2][0-9]|3[0-2]))?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/set-local-console-password-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/local-console-password] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/device-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 50 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^arn:(aws|aws-cn|aws-us-gov):storagegateway:[a-z\-0-9]+:[0-9]+:tape\/[0-9A-Z]{7,16}$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-bandwidth-rate-limit-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-device-ar-ns (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/vtl-device-arn))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/disk-attribute-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/disk-attribute :min-count 0 :max-count 10))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-maintenance-start-time-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-operational-state (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 25))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-tape-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/tape-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-gateway-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-gateways-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateways :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.list-file-shares-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/list-file-shares-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway.list-file-shares-input/limit :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/iqn-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[0-9a-z:.-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-cache-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/retrieved-to (clojure.spec.alpha/and :portkey.aws.storagegateway/gateway-arn))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/tape-status (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-archive-status))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/tape-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-size))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/tape-used-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-usage))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/tape-created-date (clojure.spec.alpha/and :portkey.aws.storagegateway/time))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-archive/completion-time (clojure.spec.alpha/and :portkey.aws.storagegateway/time))
(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-archive (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.tape-archive/retrieved-to :portkey.aws.storagegateway/kms-key :portkey.aws.storagegateway.tape-archive/tape-status :portkey.aws.storagegateway.tape-archive/tape-size-in-bytes :portkey.aws.storagegateway/tape-arn :portkey.aws.storagegateway.tape-archive/tape-used-in-bytes :portkey.aws.storagegateway/tape-barcode :portkey.aws.storagegateway.tape-archive/tape-created-date :portkey.aws.storagegateway.tape-archive/completion-time]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-drive-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-barcode (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 7 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 16)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[A-Z0-9]*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/attach-volume-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/network-interface-id] :opt-un [:portkey.aws.storagegateway/target-name :portkey.aws.storagegateway/disk-id]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-storedi-scsi-volumes-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-ar-ns] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-nfs-file-shares-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/nfs-file-share-info-list]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-upload-buffer-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.delete-file-share-input/force-delete (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-file-share-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn] :opt-un [:portkey.aws.storagegateway.delete-file-share-input/force-delete]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.storage-gateway-error/error-code (clojure.spec.alpha/and :portkey.aws.storagegateway/error-code))
(clojure.spec.alpha/def :portkey.aws.storagegateway/storage-gateway-error (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.storage-gateway-error/error-code :portkey.aws.storagegateway/error-details]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/chap-secret (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 30))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/authentication (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 5 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.disk/disk-path (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.disk/disk-node (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.disk/disk-status (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.disk/disk-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.disk/disk-allocation-resource (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway/disk (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/disk-id :portkey.aws.storagegateway.disk/disk-path :portkey.aws.storagegateway.disk/disk-node :portkey.aws.storagegateway.disk/disk-status :portkey.aws.storagegateway.disk/disk-size-in-bytes :portkey.aws.storagegateway/disk-allocation-type :portkey.aws.storagegateway.disk/disk-allocation-resource :portkey.aws.storagegateway/disk-attribute-list]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-tags-for-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/resource-arn :portkey.aws.storagegateway/marker :portkey.aws.storagegateway/tags]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-snapshot-schedule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/region-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 25))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/target-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 200)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[-\.;a-z0-9]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/local-console-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 6 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[ -~]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/notify-when-uploaded-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/retrieve-tape-archive-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.tag/key (clojure.spec.alpha/and :portkey.aws.storagegateway/tag-key))
(clojure.spec.alpha/def :portkey.aws.storagegateway.tag/value (clojure.spec.alpha/and :portkey.aws.storagegateway/tag-value))
(clojure.spec.alpha/def :portkey.aws.storagegateway/tag (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway.tag/key :portkey.aws.storagegateway.tag/value] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-maintenance-start-time-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 12 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 30))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-vtl-devices-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/vtl-devices :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-tags-to-resource-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/resource-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-gateway-information-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/vtl-device-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 50 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-client-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/ipv-4-address-cidr :min-count 1 :max-count 100))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-tape-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-state (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 25))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^([a-z0-9]+(-[a-z0-9]+)*\.)+[a-z]{2,}$" s__21078__auto__))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-type (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 2 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-snapshot-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/snapshot-description] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway.refresh-cache-input/recursive (clojure.spec.alpha/and :portkey.aws.storagegateway/boolean))
(clojure.spec.alpha/def :portkey.aws.storagegateway/refresh-cache-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn] :opt-un [:portkey.aws.storagegateway/folder-list :portkey.aws.storagegateway.refresh-cache-input/recursive]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-tapes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-infos :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-chap-credentials-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/target-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/storage-class (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 5 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 20))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 50 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/update-smb-file-share-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.update-chap-credentials-output/initiator-name (clojure.spec.alpha/and :portkey.aws.storagegateway/iqn-name))
(clojure.spec.alpha/def :portkey.aws.storagegateway/update-chap-credentials-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/target-arn :portkey.aws.storagegateway.update-chap-credentials-output/initiator-name]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-timezone (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 10))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-smb-settings-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/file-share-user (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

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

(clojure.spec.alpha/def :portkey.aws.storagegateway/domain-user-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[ -~]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/delete-volume-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-working-storage-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-tape-with-barcode-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/initiator (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.tape-info/tape-size-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/tape-size))
(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tape-arn :portkey.aws.storagegateway/tape-barcode :portkey.aws.storagegateway.tape-info/tape-size-in-bytes :portkey.aws.storagegateway/tape-status :portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/volume-status (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 50))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-snapshot-schedule-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/resource-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 50 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/organizational-unit (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/retrieve-tape-archive-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/tape-arn :portkey.aws.storagegateway/gateway-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tapes (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/tape))

(clojure.spec.alpha/def :portkey.aws.storagegateway/smb-file-share-info-list (clojure.spec.alpha/coll-of :portkey.aws.storagegateway/smb-file-share-info))

(clojure.spec.alpha/def :portkey.aws.storagegateway/gateway-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 50 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 500))))

(clojure.spec.alpha/def :portkey.aws.storagegateway.join-domain-input/domain-controllers (clojure.spec.alpha/and :portkey.aws.storagegateway/hosts))
(clojure.spec.alpha/def :portkey.aws.storagegateway.join-domain-input/user-name (clojure.spec.alpha/and :portkey.aws.storagegateway/domain-user-name))
(clojure.spec.alpha/def :portkey.aws.storagegateway.join-domain-input/password (clojure.spec.alpha/and :portkey.aws.storagegateway/domain-user-password))
(clojure.spec.alpha/def :portkey.aws.storagegateway/join-domain-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/domain-name :portkey.aws.storagegateway.join-domain-input/user-name :portkey.aws.storagegateway.join-domain-input/password] :opt-un [:portkey.aws.storagegateway/organizational-unit :portkey.aws.storagegateway.join-domain-input/domain-controllers]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.invalid-gateway-request-exception/message (clojure.spec.alpha/and :portkey.aws.storagegateway/string))
(clojure.spec.alpha/def :portkey.aws.storagegateway.invalid-gateway-request-exception/error (clojure.spec.alpha/and :portkey.aws.storagegateway/storage-gateway-error))
(clojure.spec.alpha/def :portkey.aws.storagegateway/invalid-gateway-request-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.invalid-gateway-request-exception/message :portkey.aws.storagegateway.invalid-gateway-request-exception/error]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-smb-file-shares-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/smb-file-share-info-list]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/smb-guest-password (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 6 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 512)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[ -~]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-tapes-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/tapes :portkey.aws.storagegateway/marker]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-cachedi-scsi-volume-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn :portkey.aws.storagegateway/target-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-defaults/file-mode (clojure.spec.alpha/and :portkey.aws.storagegateway/permission-mode))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-defaults/directory-mode (clojure.spec.alpha/and :portkey.aws.storagegateway/permission-mode))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-defaults/group-id (clojure.spec.alpha/and :portkey.aws.storagegateway/permission-id))
(clojure.spec.alpha/def :portkey.aws.storagegateway.nfs-file-share-defaults/owner-id (clojure.spec.alpha/and :portkey.aws.storagegateway/permission-id))
(clojure.spec.alpha/def :portkey.aws.storagegateway/nfs-file-share-defaults (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway.nfs-file-share-defaults/file-mode :portkey.aws.storagegateway.nfs-file-share-defaults/directory-mode :portkey.aws.storagegateway.nfs-file-share-defaults/group-id :portkey.aws.storagegateway.nfs-file-share-defaults/owner-id]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/host (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^(([a-zA-Z0-9\-]*[a-zA-Z0-9])\.)*([A-Za-z0-9\-]*[A-Za-z0-9])(:(\d+))?$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-nfs-file-shares-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/file-share-arn-list] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/disk-attribute (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/client-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 5 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 100))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/set-local-console-password-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway.list-volumes-input/limit (clojure.spec.alpha/and :portkey.aws.storagegateway/positive-int-object))
(clojure.spec.alpha/def :portkey.aws.storagegateway/list-volumes-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/marker :portkey.aws.storagegateway.list-volumes-input/limit]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/create-nfs-file-share-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/file-share-arn]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/domain-user-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^\w[\w\.\- ]*$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/snapshot-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/add-working-storage-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/list-volume-initiators-input (clojure.spec.alpha/keys :req-un [:portkey.aws.storagegateway/volume-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.storagegateway/tape-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-working-storage-output/working-storage-used-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway.describe-working-storage-output/working-storage-allocated-in-bytes (clojure.spec.alpha/and :portkey.aws.storagegateway/long))
(clojure.spec.alpha/def :portkey.aws.storagegateway/describe-working-storage-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/gateway-arn :portkey.aws.storagegateway/disk-ids :portkey.aws.storagegateway.describe-working-storage-output/working-storage-used-in-bytes :portkey.aws.storagegateway.describe-working-storage-output/working-storage-allocated-in-bytes]))

(clojure.spec.alpha/def :portkey.aws.storagegateway/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.storagegateway/squash (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 5 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 15))))

(clojure.spec.alpha/def :portkey.aws.storagegateway/detach-volume-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.storagegateway/volume-arn]))

(clojure.core/defn delete-chap-credentials "Deletes Challenge-Handshake Authentication Protocol (CHAP) credentials for a\nspecified iSCSI target and initiator pair." ([delete-chap-credentials-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-chap-credentials-input delete-chap-credentials-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-chap-credentials-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-chap-credentials-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteChapCredentials", :http.request.configuration/output-deser-fn response-delete-chap-credentials-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-chap-credentials :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-chap-credentials-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-chap-credentials-output))

(clojure.core/defn add-upload-buffer "Configures one or more gateway local disks as upload buffer for a specified\ngateway. This operation is supported for the stored volume, cached volume and\ntape gateway types.\n In the request, you specify the gateway Amazon Resource Name (ARN) to which you\nwant to add upload buffer, and one or more disk IDs that you want to configure\nas upload buffer." ([add-upload-buffer-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-upload-buffer-input add-upload-buffer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/add-upload-buffer-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/add-upload-buffer-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddUploadBuffer", :http.request.configuration/output-deser-fn response-add-upload-buffer-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef add-upload-buffer :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/add-upload-buffer-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/add-upload-buffer-output))

(clojure.core/defn delete-bandwidth-rate-limit "Deletes the bandwidth rate limits of a gateway. You can delete either the upload\nand download bandwidth rate limit, or you can delete both. If you delete only\none of the limits, the other limit remains unchanged. To specify which gateway\nto work with, use the Amazon Resource Name (ARN) of the gateway in your request." ([delete-bandwidth-rate-limit-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-bandwidth-rate-limit-input delete-bandwidth-rate-limit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-bandwidth-rate-limit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-bandwidth-rate-limit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteBandwidthRateLimit", :http.request.configuration/output-deser-fn response-delete-bandwidth-rate-limit-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-bandwidth-rate-limit :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-bandwidth-rate-limit-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-bandwidth-rate-limit-output))

(clojure.core/defn update-bandwidth-rate-limit "Updates the bandwidth rate limits of a gateway. You can update both the upload\nand download bandwidth rate limit or specify only one of the two. If you don't\nset a bandwidth rate limit, the existing rate limit remains.\n By default, a gateway's bandwidth rate limits are not set. If you don't set any\nlimit, the gateway does not have any limitations on its bandwidth usage and\ncould potentially use the maximum available bandwidth.\n To specify which gateway to update, use the Amazon Resource Name (ARN) of the\ngateway in your request." ([update-bandwidth-rate-limit-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-bandwidth-rate-limit-input update-bandwidth-rate-limit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-bandwidth-rate-limit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-bandwidth-rate-limit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateBandwidthRateLimit", :http.request.configuration/output-deser-fn response-update-bandwidth-rate-limit-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-bandwidth-rate-limit :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-bandwidth-rate-limit-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-bandwidth-rate-limit-output))

(clojure.core/defn describe-cachedi-scsi-volumes "Returns a description of the gateway volumes specified in the request. This\noperation is only supported in the cached volume gateway types.\n The list of gateway volumes in the request must be from one gateway. In the\nresponse Amazon Storage Gateway returns volume information sorted by volume\nAmazon Resource Name (ARN)." ([describe-cachedi-scsi-volumes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-cachedi-scsi-volumes-input describe-cachedi-scsi-volumes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCachediSCSIVolumes", :http.request.configuration/output-deser-fn response-describe-cachedi-scsi-volumes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-cachedi-scsi-volumes :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-cachedi-scsi-volumes-output))

(clojure.core/defn list-gateways "Lists gateways owned by an AWS account in a region specified in the request. The\nreturned list is ordered by gateway Amazon Resource Name (ARN).\n By default, the operation returns a maximum of 100 gateways. This operation\nsupports pagination that allows you to optionally reduce the number of gateways\nreturned in a response.\n If you have more gateways than are returned in a response (that is, the\nresponse returns only a truncated list of your gateways), the response contains\na marker that you can specify in your next request to fetch the next page of\ngateways." ([] (list-gateways {})) ([list-gateways-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-gateways-input list-gateways-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-gateways-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-gateways-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListGateways", :http.request.configuration/output-deser-fn response-list-gateways-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-gateways :args (clojure.spec.alpha/? :portkey.aws.storagegateway/list-gateways-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-gateways-output))

(clojure.core/defn attach-volume "Connects a volume to an iSCSI connection and then attaches the volume to the\nspecified gateway. Detaching and attaching a volume enables you to recover your\ndata from one gateway to a different gateway without creating a snapshot. It\nalso makes it easier to move your volumes from an on-premises gateway to a\ngateway hosted on an Amazon EC2 instance." ([attach-volume-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-attach-volume-input attach-volume-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/attach-volume-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/attach-volume-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AttachVolume", :http.request.configuration/output-deser-fn response-attach-volume-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef attach-volume :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/attach-volume-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/attach-volume-output))

(clojure.core/defn create-smb-file-share "Creates a Server Message Block (SMB) file share on an existing file gateway. In\nStorage Gateway, a file share is a file system mount point backed by Amazon S3\ncloud storage. Storage Gateway expose file shares using a SMB interface. This\noperation is only supported for file gateways.\n File gateways require AWS Security Token Service (AWS STS) to be activated to\nenable you to create a file share. Make sure that AWS STS is activated in the\nAWS Region you are creating your file gateway in. If AWS STS is not activated in\nthis AWS Region, activate it. For information about how to activate AWS STS, see\nActivating and Deactivating AWS STS in an AWS Region\n(https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html)\nin the AWS Identity and Access Management User Guide.\n File gateways don't support creating hard or symbolic links on a file share." ([create-smb-file-share-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-smb-file-share-input create-smb-file-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-smb-file-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-smb-file-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSMBFileShare", :http.request.configuration/output-deser-fn response-create-smb-file-share-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-smb-file-share :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-smb-file-share-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-smb-file-share-output))

(clojure.core/defn describe-working-storage "Returns information about the working storage of a gateway. This operation is\nonly supported in the stored volumes gateway type. This operation is deprecated\nin cached volumes API version (20120630). Use DescribeUploadBuffer instead.\n Working storage is also referred to as upload buffer. You can also use the\nDescribeUploadBuffer operation to add upload buffer to a stored volume gateway.\n The response includes disk IDs that are configured as working storage, and it\nincludes the amount of working storage allocated and used." ([describe-working-storage-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-working-storage-input describe-working-storage-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-working-storage-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-working-storage-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeWorkingStorage", :http.request.configuration/output-deser-fn response-describe-working-storage-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-working-storage :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-working-storage-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-working-storage-output))

(clojure.core/defn activate-gateway "Activates the gateway you previously deployed on your host. In the activation\nprocess, you specify information such as the region you want to use for storing\nsnapshots or tapes, the time zone for scheduled snapshots the gateway snapshot\nschedule window, an activation key, and a name for your gateway. The activation\nprocess also associates your gateway with your account; for more information,\nsee UpdateGatewayInformation.\n You must turn on the gateway VM before you can activate your gateway." ([activate-gateway-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-activate-gateway-input activate-gateway-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/activate-gateway-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/activate-gateway-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ActivateGateway", :http.request.configuration/output-deser-fn response-activate-gateway-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef activate-gateway :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/activate-gateway-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/activate-gateway-output))

(clojure.core/defn create-tape-with-barcode "Creates a virtual tape by using your own barcode. You write data to the virtual\ntape and then archive the tape. A barcode is unique and can not be reused if it\nhas already been used on a tape . This applies to barcodes used on deleted\ntapes. This operation is only supported in the tape gateway type.\n Cache storage must be allocated to the gateway before you can create a virtual\ntape. Use the AddCache operation to add cache storage to a gateway." ([create-tape-with-barcode-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-tape-with-barcode-input create-tape-with-barcode-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-tape-with-barcode-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-tape-with-barcode-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTapeWithBarcode", :http.request.configuration/output-deser-fn response-create-tape-with-barcode-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-tape-with-barcode :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-tape-with-barcode-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-tape-with-barcode-output))

(clojure.core/defn update-nfs-file-share "Updates a Network File System (NFS) file share. This operation is only supported\nin the file gateway type.\n To leave a file share field unchanged, set the corresponding input field to\nnull.\n Updates the following file share setting:\n * Default storage class for your S3 bucket\n * Metadata defaults for your S3 bucket\n * Allowed NFS clients for your file share\n * Squash settings\n * Write status of your file share\n To leave a file share field unchanged, set the corresponding input field to\nnull. This operation is only supported in file gateways." ([update-nfs-file-share-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-nfs-file-share-input update-nfs-file-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-nfs-file-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-nfs-file-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateNFSFileShare", :http.request.configuration/output-deser-fn response-update-nfs-file-share-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-nfs-file-share :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-nfs-file-share-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-nfs-file-share-output))

(clojure.core/defn set-local-console-password "Sets the password for your VM local console. When you log in to the local\nconsole for the first time, you log in to the VM with the default credentials.\nWe recommend that you set a new password. You don't need to know the default\npassword to set a new password." ([set-local-console-password-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-local-console-password-input set-local-console-password-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/set-local-console-password-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/set-local-console-password-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetLocalConsolePassword", :http.request.configuration/output-deser-fn response-set-local-console-password-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef set-local-console-password :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/set-local-console-password-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/set-local-console-password-output))

(clojure.core/defn describe-upload-buffer "Returns information about the upload buffer of a gateway. This operation is\nsupported for the stored volume, cached volume and tape gateway types.\n The response includes disk IDs that are configured as upload buffer space, and\nit includes the amount of upload buffer space allocated and used." ([describe-upload-buffer-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-upload-buffer-input describe-upload-buffer-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-upload-buffer-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-upload-buffer-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeUploadBuffer", :http.request.configuration/output-deser-fn response-describe-upload-buffer-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-upload-buffer :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-upload-buffer-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-upload-buffer-output))

(clojure.core/defn describe-vtl-devices "Returns a description of virtual tape library (VTL) devices for the specified\ntape gateway. In the response, AWS Storage Gateway returns VTL device\ninformation.\n This operation is only supported in the tape gateway type." ([describe-vtl-devices-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-vtl-devices-input describe-vtl-devices-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-vtl-devices-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-vtl-devices-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeVTLDevices", :http.request.configuration/output-deser-fn response-describe-vtl-devices-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-vtl-devices :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-vtl-devices-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-vtl-devices-output))

(clojure.core/defn create-tapes "Creates one or more virtual tapes. You write data to the virtual tapes and then\narchive the tapes. This operation is only supported in the tape gateway type.\n Cache storage must be allocated to the gateway before you can create virtual\ntapes. Use the AddCache operation to add cache storage to a gateway." ([create-tapes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-tapes-input create-tapes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-tapes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-tapes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateTapes", :http.request.configuration/output-deser-fn response-create-tapes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-tapes :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-tapes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-tapes-output))

(clojure.core/defn describe-chap-credentials "Returns an array of Challenge-Handshake Authentication Protocol (CHAP)\ncredentials information for a specified iSCSI target, one for each\ntarget-initiator pair." ([describe-chap-credentials-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-chap-credentials-input describe-chap-credentials-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-chap-credentials-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-chap-credentials-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeChapCredentials", :http.request.configuration/output-deser-fn response-describe-chap-credentials-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-chap-credentials :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-chap-credentials-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-chap-credentials-output))

(clojure.core/defn create-snapshot "Initiates a snapshot of a volume.\n AWS Storage Gateway provides the ability to back up point-in-time snapshots of\nyour data to Amazon Simple Storage (S3) for durable off-site recovery, as well\nas import the data to an Amazon Elastic Block Store (EBS) volume in Amazon\nElastic Compute Cloud (EC2). You can take snapshots of your gateway volume on a\nscheduled or ad-hoc basis. This API enables you to take ad-hoc snapshot. For\nmore information, see Editing a Snapshot Schedule\n(https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#SchedulingSnapshot).\n In the CreateSnapshot request you identify the volume by providing its Amazon\nResource Name (ARN). You must also provide description for the snapshot. When\nAWS Storage Gateway takes the snapshot of specified volume, the snapshot and\ndescription appears in the AWS Storage Gateway Console. In response, AWS Storage\nGateway returns you a snapshot ID. You can use this snapshot ID to check the\nsnapshot progress or later use it when you want to create a volume from a\nsnapshot. This operation is only supported in stored and cached volume gateway\ntype.\n To list or delete a snapshot, you must use the Amazon EC2 API. For more\ninformation, see DescribeSnapshots or DeleteSnapshot in the EC2 API reference\n(https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Operations.html).\n Volume and snapshot IDs are changing to a longer length ID format. For more\ninformation, see the important note on the Welcome\n(https://docs.aws.amazon.com/storagegateway/latest/APIReference/Welcome.html)\npage." ([create-snapshot-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-snapshot-input create-snapshot-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-snapshot-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-snapshot-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSnapshot", :http.request.configuration/output-deser-fn response-create-snapshot-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error, "ServiceUnavailableError" :portkey.aws.storagegateway/service-unavailable-error}})))))
(clojure.spec.alpha/fdef create-snapshot :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-snapshot-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-snapshot-output))

(clojure.core/defn notify-when-uploaded "Sends you notification through CloudWatch Events when all files written to your\nNFS file share have been uploaded to Amazon S3.\n AWS Storage Gateway can send a notification through Amazon CloudWatch Events\nwhen all files written to your file share up to that point in time have been\nuploaded to Amazon S3. These files include files written to the NFS file share\nup to the time that you make a request for notification. When the upload is\ndone, Storage Gateway sends you notification through an Amazon CloudWatch Event.\nYou can configure CloudWatch Events to send the notification through event\ntargets such as Amazon SNS or AWS Lambda function. This operation is only\nsupported for file gateways.\n For more information, see Getting File Upload Notification in the Storage\nGateway User Guide\n(https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-upload-notification)." ([notify-when-uploaded-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-notify-when-uploaded-input notify-when-uploaded-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/notify-when-uploaded-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/notify-when-uploaded-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "NotifyWhenUploaded", :http.request.configuration/output-deser-fn response-notify-when-uploaded-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef notify-when-uploaded :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/notify-when-uploaded-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/notify-when-uploaded-output))

(clojure.core/defn describe-snapshot-schedule "Describes the snapshot schedule for the specified gateway volume. The snapshot\nschedule information includes intervals at which snapshots are automatically\ninitiated on the volume. This operation is only supported in the cached volume\nand stored volume types." ([describe-snapshot-schedule-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-snapshot-schedule-input describe-snapshot-schedule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-snapshot-schedule-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-snapshot-schedule-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSnapshotSchedule", :http.request.configuration/output-deser-fn response-describe-snapshot-schedule-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-snapshot-schedule :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-snapshot-schedule-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-snapshot-schedule-output))

(clojure.core/defn delete-volume "Deletes the specified storage volume that you previously created using the\nCreateCachediSCSIVolume or CreateStorediSCSIVolume API. This operation is only\nsupported in the cached volume and stored volume types. For stored volume\ngateways, the local disk that was configured as the storage volume is not\ndeleted. You can reuse the local disk to create another storage volume.\n Before you delete a volume, make sure there are no iSCSI connections to the\nvolume you are deleting. You should also make sure there is no snapshot in\nprogress. You can use the Amazon Elastic Compute Cloud (Amazon EC2) API to query\nsnapshots on the volume you are deleting and check the snapshot status. For more\ninformation, go to DescribeSnapshots\n(https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html)\nin the Amazon Elastic Compute Cloud API Reference.\n In the request, you must provide the Amazon Resource Name (ARN) of the storage\nvolume you want to delete." ([delete-volume-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-volume-input delete-volume-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-volume-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-volume-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteVolume", :http.request.configuration/output-deser-fn response-delete-volume-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-volume :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-volume-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-volume-output))

(clojure.core/defn list-volume-initiators "Lists iSCSI initiators that are connected to a volume. You can use this\noperation to determine whether a volume is being used or not. This operation is\nonly supported in the cached volume and stored volume gateway types." ([list-volume-initiators-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-volume-initiators-input list-volume-initiators-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-volume-initiators-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-volume-initiators-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVolumeInitiators", :http.request.configuration/output-deser-fn response-list-volume-initiators-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-volume-initiators :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/list-volume-initiators-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-volume-initiators-output))

(clojure.core/defn shutdown-gateway "Shuts down a gateway. To specify which gateway to shut down, use the Amazon\nResource Name (ARN) of the gateway in the body of your request.\n The operation shuts down the gateway service component running in the gateway's\nvirtual machine (VM) and not the host VM.\n If you want to shut down the VM, it is recommended that you first shut down the\ngateway component in the VM to avoid unpredictable conditions.\n After the gateway is shutdown, you cannot call any other API except\nStartGateway, DescribeGatewayInformation, and ListGateways. For more\ninformation, see ActivateGateway. Your applications cannot read from or write to\nthe gateway's storage volumes, and there are no snapshots taken.\n When you make a shutdown request, you will get a 200 OK success response\nimmediately. However, it might take some time for the gateway to shut down. You\ncan call the DescribeGatewayInformation API to check the status. For more\ninformation, see ActivateGateway.\n If do not intend to use the gateway again, you must delete the gateway (using\nDeleteGateway) to no longer pay software charges associated with the gateway." ([shutdown-gateway-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-shutdown-gateway-input shutdown-gateway-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/shutdown-gateway-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/shutdown-gateway-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ShutdownGateway", :http.request.configuration/output-deser-fn response-shutdown-gateway-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef shutdown-gateway :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/shutdown-gateway-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/shutdown-gateway-output))

(clojure.core/defn describe-storedi-scsi-volumes "Returns the description of the gateway volumes specified in the request. The\nlist of gateway volumes in the request must be from one gateway. In the response\nAmazon Storage Gateway returns volume information sorted by volume ARNs. This\noperation is only supported in stored volume gateway type." ([describe-storedi-scsi-volumes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-storedi-scsi-volumes-input describe-storedi-scsi-volumes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-storedi-scsi-volumes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-storedi-scsi-volumes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStorediSCSIVolumes", :http.request.configuration/output-deser-fn response-describe-storedi-scsi-volumes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-storedi-scsi-volumes :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-storedi-scsi-volumes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-storedi-scsi-volumes-output))

(clojure.core/defn refresh-cache "Refreshes the cache for the specified file share. This operation finds objects\nin the Amazon S3 bucket that were added, removed or replaced since the gateway\nlast listed the bucket's contents and cached the results. This operation is only\nsupported in the file gateway type. You can subscribe to be notified through an\nAmazon CloudWatch event when your RefreshCache operation completes. For more\ninformation, see Getting Notified About File Operations\n(https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification)." ([refresh-cache-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-refresh-cache-input refresh-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/refresh-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/refresh-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RefreshCache", :http.request.configuration/output-deser-fn response-refresh-cache-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef refresh-cache :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/refresh-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/refresh-cache-output))

(clojure.core/defn delete-snapshot-schedule "Deletes a snapshot of a volume.\n You can take snapshots of your gateway volumes on a scheduled or ad hoc basis.\nThis API action enables you to delete a snapshot schedule for a volume. For more\ninformation, see Working with Snapshots\n(https://docs.aws.amazon.com/storagegateway/latest/userguide/WorkingWithSnapshots.html).\nIn the DeleteSnapshotSchedule request, you identify the volume by providing its\nAmazon Resource Name (ARN). This operation is only supported in stored and\ncached volume gateway types.\n To list or delete a snapshot, you must use the Amazon EC2 API. in Amazon\nElastic Compute Cloud API Reference." ([delete-snapshot-schedule-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-snapshot-schedule-input delete-snapshot-schedule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-snapshot-schedule-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-snapshot-schedule-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteSnapshotSchedule", :http.request.configuration/output-deser-fn response-delete-snapshot-schedule-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-snapshot-schedule :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-snapshot-schedule-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-snapshot-schedule-output))

(clojure.core/defn describe-maintenance-start-time "Returns your gateway's weekly maintenance start time including the day and time\nof the week. Note that values are in terms of the gateway's time zone." ([describe-maintenance-start-time-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-maintenance-start-time-input describe-maintenance-start-time-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-maintenance-start-time-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-maintenance-start-time-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeMaintenanceStartTime", :http.request.configuration/output-deser-fn response-describe-maintenance-start-time-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-maintenance-start-time :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-maintenance-start-time-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-maintenance-start-time-output))

(clojure.core/defn list-tags-for-resource "Lists the tags that have been added to the specified resource. This operation is\nonly supported in the cached volume, stored volume and tape gateway type." ([list-tags-for-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tags-for-resource-input list-tags-for-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-tags-for-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-tags-for-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTagsForResource", :http.request.configuration/output-deser-fn response-list-tags-for-resource-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-tags-for-resource :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/list-tags-for-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-tags-for-resource-output))

(clojure.core/defn describe-smb-file-shares "Gets a description for one or more Server Message Block (SMB) file shares from a\nfile gateway. This operation is only supported for file gateways." ([describe-smb-file-shares-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-smb-file-shares-input describe-smb-file-shares-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-smb-file-shares-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-smb-file-shares-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSMBFileShares", :http.request.configuration/output-deser-fn response-describe-smb-file-shares-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-smb-file-shares :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-smb-file-shares-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-smb-file-shares-output))

(clojure.core/defn add-working-storage "Configures one or more gateway local disks as working storage for a gateway.\nThis operation is only supported in the stored volume gateway type. This\noperation is deprecated in cached volume API version 20120630. Use\nAddUploadBuffer instead.\n Working storage is also referred to as upload buffer. You can also use the\nAddUploadBuffer operation to add upload buffer to a stored volume gateway.\n In the request, you specify the gateway Amazon Resource Name (ARN) to which you\nwant to add working storage, and one or more disk IDs that you want to configure\nas working storage." ([add-working-storage-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-working-storage-input add-working-storage-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/add-working-storage-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/add-working-storage-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddWorkingStorage", :http.request.configuration/output-deser-fn response-add-working-storage-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef add-working-storage :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/add-working-storage-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/add-working-storage-output))

(clojure.core/defn create-snapshot-from-volume-recovery-point "Initiates a snapshot of a gateway from a volume recovery point. This operation\nis only supported in the cached volume gateway type.\n A volume recovery point is a point in time at which all data of the volume is\nconsistent and from which you can create a snapshot. To get a list of volume\nrecovery point for cached volume gateway, use ListVolumeRecoveryPoints.\n In the CreateSnapshotFromVolumeRecoveryPoint request, you identify the volume\nby providing its Amazon Resource Name (ARN). You must also provide a description\nfor the snapshot. When the gateway takes a snapshot of the specified volume, the\nsnapshot and its description appear in the AWS Storage Gateway console. In\nresponse, the gateway returns you a snapshot ID. You can use this snapshot ID to\ncheck the snapshot progress or later use it when you want to create a volume\nfrom a snapshot.\n To list or delete a snapshot, you must use the Amazon EC2 API. For more\ninformation, in Amazon Elastic Compute Cloud API Reference." ([create-snapshot-from-volume-recovery-point-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-snapshot-from-volume-recovery-point-input create-snapshot-from-volume-recovery-point-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-snapshot-from-volume-recovery-point-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-snapshot-from-volume-recovery-point-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateSnapshotFromVolumeRecoveryPoint", :http.request.configuration/output-deser-fn response-create-snapshot-from-volume-recovery-point-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error, "ServiceUnavailableError" :portkey.aws.storagegateway/service-unavailable-error}})))))
(clojure.spec.alpha/fdef create-snapshot-from-volume-recovery-point :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-snapshot-from-volume-recovery-point-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-snapshot-from-volume-recovery-point-output))

(clojure.core/defn create-storedi-scsi-volume "Creates a volume on a specified gateway. This operation is only supported in the\nstored volume gateway type.\n The size of the volume to create is inferred from the disk size. You can choose\nto preserve existing data on the disk, create volume from an existing snapshot,\nor create an empty volume. If you choose to create an empty gateway volume, then\nany existing data on the disk is erased.\n In the request you must specify the gateway and the disk information on which\nyou are creating the volume. In response, the gateway creates the volume and\nreturns volume information such as the volume Amazon Resource Name (ARN), its\nsize, and the iSCSI target ARN that initiators can use to connect to the volume\ntarget." ([create-storedi-scsi-volume-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-storedi-scsi-volume-input create-storedi-scsi-volume-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-storedi-scsi-volume-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-storedi-scsi-volume-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStorediSCSIVolume", :http.request.configuration/output-deser-fn response-create-storedi-scsi-volume-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-storedi-scsi-volume :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-storedi-scsi-volume-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-storedi-scsi-volume-output))

(clojure.core/defn update-vtl-device-type "Updates the type of medium changer in a tape gateway. When you activate a tape\ngateway, you select a medium changer type for the tape gateway. This operation\nenables you to select a different type of medium changer after a tape gateway is\nactivated. This operation is only supported in the tape gateway type." ([update-vtl-device-type-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-vtl-device-type-input update-vtl-device-type-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-vtl-device-type-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-vtl-device-type-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateVTLDeviceType", :http.request.configuration/output-deser-fn response-update-vtl-device-type-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-vtl-device-type :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-vtl-device-type-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-vtl-device-type-output))

(clojure.core/defn create-cachedi-scsi-volume "Creates a cached volume on a specified cached volume gateway. This operation is\nonly supported in the cached volume gateway type.\n Cache storage must be allocated to the gateway before you can create a cached\nvolume. Use the AddCache operation to add cache storage to a gateway.\n In the request, you must specify the gateway, size of the volume in bytes, the\niSCSI target name, an IP address on which to expose the target, and a unique\nclient token. In response, the gateway creates the volume and returns\ninformation about it. This information includes the volume Amazon Resource Name\n(ARN), its size, and the iSCSI target ARN that initiators can use to connect to\nthe volume target.\n Optionally, you can provide the ARN for an existing volume as the\nSourceVolumeARN for this cached volume, which creates an exact copy of the\nexisting volume’s latest recovery point. The VolumeSizeInBytes value must be\nequal to or larger than the size of the copied volume, in bytes." ([create-cachedi-scsi-volume-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-cachedi-scsi-volume-input create-cachedi-scsi-volume-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-cachedi-scsi-volume-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-cachedi-scsi-volume-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCachediSCSIVolume", :http.request.configuration/output-deser-fn response-create-cachedi-scsi-volume-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-cachedi-scsi-volume :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-cachedi-scsi-volume-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-cachedi-scsi-volume-output))

(clojure.core/defn delete-tape "Deletes the specified virtual tape. This operation is only supported in the tape\ngateway type." ([delete-tape-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-tape-input delete-tape-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-tape-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-tape-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTape", :http.request.configuration/output-deser-fn response-delete-tape-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-tape :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-tape-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-tape-output))

(clojure.core/defn describe-gateway-information "Returns metadata about a gateway such as its name, network interfaces,\nconfigured time zone, and the state (whether the gateway is running or not). To\nspecify which gateway to describe, use the Amazon Resource Name (ARN) of the\ngateway in your request." ([describe-gateway-information-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-gateway-information-input describe-gateway-information-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-gateway-information-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-gateway-information-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeGatewayInformation", :http.request.configuration/output-deser-fn response-describe-gateway-information-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-gateway-information :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-gateway-information-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-gateway-information-output))

(clojure.core/defn describe-tape-recovery-points "Returns a list of virtual tape recovery points that are available for the\nspecified tape gateway.\n A recovery point is a point-in-time view of a virtual tape at which all the\ndata on the virtual tape is consistent. If your gateway crashes, virtual tapes\nthat have recovery points can be recovered to a new gateway. This operation is\nonly supported in the tape gateway type." ([describe-tape-recovery-points-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-tape-recovery-points-input describe-tape-recovery-points-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-tape-recovery-points-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-tape-recovery-points-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTapeRecoveryPoints", :http.request.configuration/output-deser-fn response-describe-tape-recovery-points-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-tape-recovery-points :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-tape-recovery-points-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-tape-recovery-points-output))

(clojure.core/defn cancel-retrieval "Cancels retrieval of a virtual tape from the virtual tape shelf (VTS) to a\ngateway after the retrieval process is initiated. The virtual tape is returned\nto the VTS. This operation is only supported in the tape gateway type." ([cancel-retrieval-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-cancel-retrieval-input cancel-retrieval-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/cancel-retrieval-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/cancel-retrieval-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelRetrieval", :http.request.configuration/output-deser-fn response-cancel-retrieval-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef cancel-retrieval :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/cancel-retrieval-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/cancel-retrieval-output))

(clojure.core/defn list-volumes "Lists the iSCSI stored volumes of a gateway. Results are sorted by volume ARN.\nThe response includes only the volume ARNs. If you want additional volume\ninformation, use the DescribeStorediSCSIVolumes or the\nDescribeCachediSCSIVolumes API.\n The operation supports pagination. By default, the operation returns a maximum\nof up to 100 volumes. You can optionally specify the Limit field in the body to\nlimit the number of volumes in the response. If the number of volumes returned\nin the response is truncated, the response includes a Marker field. You can use\nthis Marker value in your subsequent request to retrieve the next set of\nvolumes. This operation is only supported in the cached volume and stored volume\ngateway types." ([] (list-volumes {})) ([list-volumes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-volumes-input list-volumes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-volumes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-volumes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVolumes", :http.request.configuration/output-deser-fn response-list-volumes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-volumes :args (clojure.spec.alpha/? :portkey.aws.storagegateway/list-volumes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-volumes-output))

(clojure.core/defn describe-tape-archives "Returns a description of specified virtual tapes in the virtual tape shelf\n(VTS). This operation is only supported in the tape gateway type.\n If a specific TapeARN is not specified, AWS Storage Gateway returns a\ndescription of all virtual tapes found in the VTS associated with your account." ([] (describe-tape-archives {})) ([describe-tape-archives-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-tape-archives-input describe-tape-archives-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-tape-archives-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-tape-archives-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTapeArchives", :http.request.configuration/output-deser-fn response-describe-tape-archives-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-tape-archives :args (clojure.spec.alpha/? :portkey.aws.storagegateway/describe-tape-archives-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-tape-archives-output))

(clojure.core/defn update-smb-file-share "Updates a Server Message Block (SMB) file share.\n To leave a file share field unchanged, set the corresponding input field to\nnull. This operation is only supported for file gateways.\n File gateways require AWS Security Token Service (AWS STS) to be activated to\nenable you to create a file share. Make sure that AWS STS is activated in the\nAWS Region you are creating your file gateway in. If AWS STS is not activated in\nthis AWS Region, activate it. For information about how to activate AWS STS, see\nActivating and Deactivating AWS STS in an AWS Region\n(https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html)\nin the AWS Identity and Access Management User Guide.\n File gateways don't support creating hard or symbolic links on a file share." ([update-smb-file-share-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-smb-file-share-input update-smb-file-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-smb-file-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-smb-file-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSMBFileShare", :http.request.configuration/output-deser-fn response-update-smb-file-share-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-smb-file-share :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-smb-file-share-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-smb-file-share-output))

(clojure.core/defn list-tapes "Lists virtual tapes in your virtual tape library (VTL) and your virtual tape\nshelf (VTS). You specify the tapes to list by specifying one or more tape Amazon\nResource Names (ARNs). If you don't specify a tape ARN, the operation lists all\nvirtual tapes in both your VTL and VTS.\n This operation supports pagination. By default, the operation returns a maximum\nof up to 100 tapes. You can optionally specify the Limit parameter in the body\nto limit the number of tapes in the response. If the number of tapes returned in\nthe response is truncated, the response includes a Marker element that you can\nuse in your subsequent request to retrieve the next set of tapes. This operation\nis only supported in the tape gateway type." ([] (list-tapes {})) ([list-tapes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-tapes-input list-tapes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-tapes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-tapes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListTapes", :http.request.configuration/output-deser-fn response-list-tapes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-tapes :args (clojure.spec.alpha/? :portkey.aws.storagegateway/list-tapes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-tapes-output))

(clojure.core/defn delete-file-share "Deletes a file share from a file gateway. This operation is only supported for\nfile gateways." ([delete-file-share-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-file-share-input delete-file-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-file-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-file-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFileShare", :http.request.configuration/output-deser-fn response-delete-file-share-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-file-share :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-file-share-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-file-share-output))

(clojure.core/defn describe-tapes "Returns a description of the specified Amazon Resource Name (ARN) of virtual\ntapes. If a TapeARN is not specified, returns a description of all virtual tapes\nassociated with the specified gateway. This operation is only supported in the\ntape gateway type." ([describe-tapes-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-tapes-input describe-tapes-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-tapes-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-tapes-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeTapes", :http.request.configuration/output-deser-fn response-describe-tapes-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-tapes :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-tapes-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-tapes-output))

(clojure.core/defn create-nfs-file-share "Creates a Network File System (NFS) file share on an existing file gateway. In\nStorage Gateway, a file share is a file system mount point backed by Amazon S3\ncloud storage. Storage Gateway exposes file shares using a NFS interface. This\noperation is only supported for file gateways.\n File gateway requires AWS Security Token Service (AWS STS) to be activated to\nenable you create a file share. Make sure AWS STS is activated in the region you\nare creating your file gateway in. If AWS STS is not activated in the region,\nactivate it. For information about how to activate AWS STS, see Activating and\nDeactivating AWS STS in an AWS Region in the AWS Identity and Access Management\nUser Guide.\n File gateway does not support creating hard or symbolic links on a file share." ([create-nfs-file-share-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-nfs-file-share-input create-nfs-file-share-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/create-nfs-file-share-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/create-nfs-file-share-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateNFSFileShare", :http.request.configuration/output-deser-fn response-create-nfs-file-share-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef create-nfs-file-share :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/create-nfs-file-share-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/create-nfs-file-share-output))

(clojure.core/defn set-smb-guest-password "Sets the password for the guest user smbguest. The smbguest user is the user\nwhen the authentication method for the file share is set to GuestAccess." ([set-smb-guest-password-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-set-smb-guest-password-input set-smb-guest-password-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/set-smb-guest-password-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/set-smb-guest-password-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SetSMBGuestPassword", :http.request.configuration/output-deser-fn response-set-smb-guest-password-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef set-smb-guest-password :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/set-smb-guest-password-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/set-smb-guest-password-output))

(clojure.core/defn list-local-disks "Returns a list of the gateway's local disks. To specify which gateway to\ndescribe, you use the Amazon Resource Name (ARN) of the gateway in the body of\nthe request.\n The request returns a list of all disks, specifying which are configured as\nworking storage, cache storage, or stored volume or not configured at all. The\nresponse includes a DiskStatus field. This field can have a value of present\n(the disk is available to use), missing (the disk is no longer connected to the\ngateway), or mismatch (the disk node is occupied by a disk that has incorrect\nmetadata or the disk content is corrupted)." ([list-local-disks-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-local-disks-input list-local-disks-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-local-disks-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-local-disks-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListLocalDisks", :http.request.configuration/output-deser-fn response-list-local-disks-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-local-disks :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/list-local-disks-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-local-disks-output))

(clojure.core/defn reset-cache "Resets all cache disks that have encountered a error and makes the disks\navailable for reconfiguration as cache storage. If your cache disk encounters a\nerror, the gateway prevents read and write operations on virtual tapes in the\ngateway. For example, an error can occur when a disk is corrupted or removed\nfrom the gateway. When a cache is reset, the gateway loses its cache storage. At\nthis point you can reconfigure the disks as cache disks. This operation is only\nsupported in the cached volume and tape types.\n If the cache disk you are resetting contains data that has not been uploaded to\nAmazon S3 yet, that data can be lost. After you reset cache disks, there will be\nno configured cache disks left in the gateway, so you must configure at least\none new cache disk for your gateway to function properly." ([reset-cache-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-reset-cache-input reset-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/reset-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/reset-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ResetCache", :http.request.configuration/output-deser-fn response-reset-cache-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef reset-cache :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/reset-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/reset-cache-output))

(clojure.core/defn describe-nfs-file-shares "Gets a description for one or more Network File System (NFS) file shares from a\nfile gateway. This operation is only supported for file gateways." ([describe-nfs-file-shares-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-nfs-file-shares-input describe-nfs-file-shares-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-nfs-file-shares-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-nfs-file-shares-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeNFSFileShares", :http.request.configuration/output-deser-fn response-describe-nfs-file-shares-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-nfs-file-shares :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-nfs-file-shares-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-nfs-file-shares-output))

(clojure.core/defn update-gateway-information "Updates a gateway's metadata, which includes the gateway's name and time zone.\nTo specify which gateway to update, use the Amazon Resource Name (ARN) of the\ngateway in your request.\n For Gateways activated after September 2, 2015, the gateway's ARN contains the\ngateway ID rather than the gateway name. However, changing the name of the\ngateway has no effect on the gateway's ARN." ([update-gateway-information-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-gateway-information-input update-gateway-information-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-gateway-information-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-gateway-information-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGatewayInformation", :http.request.configuration/output-deser-fn response-update-gateway-information-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-gateway-information :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-gateway-information-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-gateway-information-output))

(clojure.core/defn update-chap-credentials "Updates the Challenge-Handshake Authentication Protocol (CHAP) credentials for a\nspecified iSCSI target. By default, a gateway does not have CHAP enabled;\nhowever, for added security, you might use it.\n When you update CHAP credentials, all existing connections on the target are\nclosed and initiators must reconnect with the new credentials." ([update-chap-credentials-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-chap-credentials-input update-chap-credentials-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-chap-credentials-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-chap-credentials-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateChapCredentials", :http.request.configuration/output-deser-fn response-update-chap-credentials-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-chap-credentials :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-chap-credentials-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-chap-credentials-output))

(clojure.core/defn describe-bandwidth-rate-limit "Returns the bandwidth rate limits of a gateway. By default, these limits are not\nset, which means no bandwidth rate limiting is in effect.\n This operation only returns a value for a bandwidth rate limit only if the\nlimit is set. If no limits are set for the gateway, then this operation returns\nonly the gateway ARN in the response body. To specify which gateway to describe,\nuse the Amazon Resource Name (ARN) of the gateway in your request." ([describe-bandwidth-rate-limit-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-bandwidth-rate-limit-input describe-bandwidth-rate-limit-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-bandwidth-rate-limit-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-bandwidth-rate-limit-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeBandwidthRateLimit", :http.request.configuration/output-deser-fn response-describe-bandwidth-rate-limit-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-bandwidth-rate-limit :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-bandwidth-rate-limit-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-bandwidth-rate-limit-output))

(clojure.core/defn update-maintenance-start-time "Updates a gateway's weekly maintenance start time information, including day and\ntime of the week. The maintenance time is the time in your gateway's time zone." ([update-maintenance-start-time-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-maintenance-start-time-input update-maintenance-start-time-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-maintenance-start-time-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-maintenance-start-time-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateMaintenanceStartTime", :http.request.configuration/output-deser-fn response-update-maintenance-start-time-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-maintenance-start-time :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-maintenance-start-time-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-maintenance-start-time-output))

(clojure.core/defn update-gateway-software-now "Updates the gateway virtual machine (VM) software. The request immediately\ntriggers the software update.\n When you make this request, you get a 200 OK success response immediately.\nHowever, it might take some time for the update to complete. You can call\nDescribeGatewayInformation to verify the gateway is in the STATE_RUNNING state.\n A software update forces a system restart of your gateway. You can minimize the\nchance of any disruption to your applications by increasing your iSCSI\nInitiators' timeouts. For more information about increasing iSCSI Initiator\ntimeouts for Windows and Linux, see Customizing Your Windows iSCSI Settings\n(https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorWindowsClient.html#CustomizeWindowsiSCSISettings)\nand Customizing Your Linux iSCSI Settings\n(https://docs.aws.amazon.com/storagegateway/latest/userguide/ConfiguringiSCSIClientInitiatorRedHatClient.html#CustomizeLinuxiSCSISettings),\nrespectively." ([update-gateway-software-now-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-gateway-software-now-input update-gateway-software-now-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-gateway-software-now-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-gateway-software-now-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateGatewaySoftwareNow", :http.request.configuration/output-deser-fn response-update-gateway-software-now-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-gateway-software-now :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-gateway-software-now-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-gateway-software-now-output))

(clojure.core/defn describe-smb-settings "Gets a description of a Server Message Block (SMB) file share settings from a\nfile gateway. This operation is only supported for file gateways." ([describe-smb-settings-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-smb-settings-input describe-smb-settings-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-smb-settings-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-smb-settings-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeSMBSettings", :http.request.configuration/output-deser-fn response-describe-smb-settings-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-smb-settings :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-smb-settings-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-smb-settings-output))

(clojure.core/defn list-file-shares "Gets a list of the file shares for a specific file gateway, or the list of file\nshares that belong to the calling user account. This operation is only supported\nfor file gateways." ([] (list-file-shares {})) ([list-file-shares-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-file-shares-input list-file-shares-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-file-shares-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-file-shares-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFileShares", :http.request.configuration/output-deser-fn response-list-file-shares-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-file-shares :args (clojure.spec.alpha/? :portkey.aws.storagegateway/list-file-shares-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-file-shares-output))

(clojure.core/defn list-volume-recovery-points "Lists the recovery points for a specified gateway. This operation is only\nsupported in the cached volume gateway type.\n Each cache volume has one recovery point. A volume recovery point is a point in\ntime at which all data of the volume is consistent and from which you can create\na snapshot or clone a new cached volume from a source volume. To create a\nsnapshot from a volume recovery point use the\nCreateSnapshotFromVolumeRecoveryPoint operation." ([list-volume-recovery-points-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-volume-recovery-points-input list-volume-recovery-points-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/list-volume-recovery-points-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/list-volume-recovery-points-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListVolumeRecoveryPoints", :http.request.configuration/output-deser-fn response-list-volume-recovery-points-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef list-volume-recovery-points :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/list-volume-recovery-points-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/list-volume-recovery-points-output))

(clojure.core/defn retrieve-tape-recovery-point "Retrieves the recovery point for the specified virtual tape. This operation is\nonly supported in the tape gateway type.\n A recovery point is a point in time view of a virtual tape at which all the\ndata on the tape is consistent. If your gateway crashes, virtual tapes that have\nrecovery points can be recovered to a new gateway.\n The virtual tape can be retrieved to only one gateway. The retrieved tape is\nread-only. The virtual tape can be retrieved to only a tape gateway. There is no\ncharge for retrieving recovery points." ([retrieve-tape-recovery-point-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-retrieve-tape-recovery-point-input retrieve-tape-recovery-point-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/retrieve-tape-recovery-point-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/retrieve-tape-recovery-point-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RetrieveTapeRecoveryPoint", :http.request.configuration/output-deser-fn response-retrieve-tape-recovery-point-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef retrieve-tape-recovery-point :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/retrieve-tape-recovery-point-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/retrieve-tape-recovery-point-output))

(clojure.core/defn retrieve-tape-archive "Retrieves an archived virtual tape from the virtual tape shelf (VTS) to a tape\ngateway. Virtual tapes archived in the VTS are not associated with any gateway.\nHowever after a tape is retrieved, it is associated with a gateway, even though\nit is also listed in the VTS, that is, archive. This operation is only supported\nin the tape gateway type.\n Once a tape is successfully retrieved to a gateway, it cannot be retrieved\nagain to another gateway. You must archive the tape again before you can\nretrieve it to another gateway. This operation is only supported in the tape\ngateway type." ([retrieve-tape-archive-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-retrieve-tape-archive-input retrieve-tape-archive-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/retrieve-tape-archive-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/retrieve-tape-archive-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RetrieveTapeArchive", :http.request.configuration/output-deser-fn response-retrieve-tape-archive-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef retrieve-tape-archive :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/retrieve-tape-archive-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/retrieve-tape-archive-output))

(clojure.core/defn describe-cache "Returns information about the cache of a gateway. This operation is only\nsupported in the cached volume, tape and file gateway types.\n The response includes disk IDs that are configured as cache, and it includes\nthe amount of cache allocated and used." ([describe-cache-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-cache-input describe-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/describe-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/describe-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCache", :http.request.configuration/output-deser-fn response-describe-cache-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef describe-cache :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/describe-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/describe-cache-output))

(clojure.core/defn start-gateway "Starts a gateway that you previously shut down (see ShutdownGateway). After the\ngateway starts, you can then make other API calls, your applications can read\nfrom or write to the gateway's storage volumes and you will be able to take\nsnapshot backups.\n When you make a request, you will get a 200 OK success response immediately.\nHowever, it might take some time for the gateway to be ready. You should call\nDescribeGatewayInformation and check the status before making any additional API\ncalls. For more information, see ActivateGateway.\n To specify which gateway to start, use the Amazon Resource Name (ARN) of the\ngateway in your request." ([start-gateway-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-gateway-input start-gateway-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/start-gateway-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/start-gateway-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartGateway", :http.request.configuration/output-deser-fn response-start-gateway-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef start-gateway :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/start-gateway-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/start-gateway-output))

(clojure.core/defn remove-tags-from-resource "Removes one or more tags from the specified resource. This operation is only\nsupported in the cached volume, stored volume and tape gateway types." ([remove-tags-from-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-remove-tags-from-resource-input remove-tags-from-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/remove-tags-from-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/remove-tags-from-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RemoveTagsFromResource", :http.request.configuration/output-deser-fn response-remove-tags-from-resource-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef remove-tags-from-resource :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/remove-tags-from-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/remove-tags-from-resource-output))

(clojure.core/defn update-snapshot-schedule "Updates a snapshot schedule configured for a gateway volume. This operation is\nonly supported in the cached volume and stored volume gateway types.\n The default snapshot schedule for volume is once every 24 hours, starting at\nthe creation time of the volume. You can use this API to change the snapshot\nschedule configured for the volume.\n In the request you must identify the gateway volume whose snapshot schedule you\nwant to update, and the schedule information, including when you want the\nsnapshot to begin on a day and the frequency (in hours) of snapshots." ([update-snapshot-schedule-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-update-snapshot-schedule-input update-snapshot-schedule-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/update-snapshot-schedule-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/update-snapshot-schedule-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UpdateSnapshotSchedule", :http.request.configuration/output-deser-fn response-update-snapshot-schedule-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef update-snapshot-schedule :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/update-snapshot-schedule-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/update-snapshot-schedule-output))

(clojure.core/defn delete-gateway "Deletes a gateway. To specify which gateway to delete, use the Amazon Resource\nName (ARN) of the gateway in your request. The operation deletes the gateway;\nhowever, it does not delete the gateway virtual machine (VM) from your host\ncomputer.\n After you delete a gateway, you cannot reactivate it. Completed snapshots of\nthe gateway volumes are not deleted upon deleting the gateway, however, pending\nsnapshots will not complete. After you delete a gateway, your next step is to\nremove it from your environment.\n You no longer pay software charges after the gateway is deleted; however, your\nexisting Amazon EBS snapshots persist and you will continue to be billed for\nthese snapshots. You can choose to remove all remaining Amazon EBS snapshots by\ncanceling your Amazon EC2 subscription. If you prefer not to cancel your Amazon\nEC2 subscription, you can delete your snapshots using the Amazon EC2 console.\nFor more information, see the AWS Storage Gateway Detail Page\n(http://aws.amazon.com/storagegateway)." ([delete-gateway-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-gateway-input delete-gateway-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-gateway-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-gateway-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteGateway", :http.request.configuration/output-deser-fn response-delete-gateway-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-gateway :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-gateway-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-gateway-output))

(clojure.core/defn disable-gateway "Disables a tape gateway when the gateway is no longer functioning. For example,\nif your gateway VM is damaged, you can disable the gateway so you can recover\nvirtual tapes.\n Use this operation for a tape gateway that is not reachable or not functioning.\nThis operation is only supported in the tape gateway type.\n Once a gateway is disabled it cannot be enabled." ([disable-gateway-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-disable-gateway-input disable-gateway-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/disable-gateway-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/disable-gateway-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DisableGateway", :http.request.configuration/output-deser-fn response-disable-gateway-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef disable-gateway :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/disable-gateway-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/disable-gateway-output))

(clojure.core/defn join-domain "Adds a file gateway to an Active Directory domain. This operation is only\nsupported for file gateways that support the SMB file protocol." ([join-domain-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-join-domain-input join-domain-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/join-domain-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/join-domain-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "JoinDomain", :http.request.configuration/output-deser-fn response-join-domain-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef join-domain :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/join-domain-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/join-domain-output))

(clojure.core/defn add-tags-to-resource "Adds one or more tags to the specified resource. You use tags to add metadata to\nresources, which you can use to categorize these resources. For example, you can\ncategorize resources by purpose, owner, environment, or team. Each tag consists\nof a key and a value, which you define. You can add tags to the following AWS\nStorage Gateway resources:\n * Storage gateways of all types\n * Storage Volumes\n * Virtual Tapes\n * NFS and SMB File Shares\n You can create a maximum of 10 tags for each resource. Virtual tapes and\nstorage volumes that are recovered to a new gateway maintain their tags." ([add-tags-to-resource-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-tags-to-resource-input add-tags-to-resource-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/add-tags-to-resource-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/add-tags-to-resource-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddTagsToResource", :http.request.configuration/output-deser-fn response-add-tags-to-resource-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef add-tags-to-resource :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/add-tags-to-resource-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/add-tags-to-resource-output))

(clojure.core/defn cancel-archival "Cancels archiving of a virtual tape to the virtual tape shelf (VTS) after the\narchiving process is initiated. This operation is only supported in the tape\ngateway type." ([cancel-archival-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-cancel-archival-input cancel-archival-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/cancel-archival-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/cancel-archival-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CancelArchival", :http.request.configuration/output-deser-fn response-cancel-archival-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef cancel-archival :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/cancel-archival-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/cancel-archival-output))

(clojure.core/defn add-cache "Configures one or more gateway local disks as cache for a gateway. This\noperation is only supported in the cached volume, tape and file gateway type\n(see Storage Gateway Concepts\n(https://docs.aws.amazon.com/storagegateway/latest/userguide/StorageGatewayConcepts.html)).\n In the request, you specify the gateway Amazon Resource Name (ARN) to which you\nwant to add cache, and one or more disk IDs that you want to configure as cache." ([add-cache-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-add-cache-input add-cache-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/add-cache-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/add-cache-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AddCache", :http.request.configuration/output-deser-fn response-add-cache-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef add-cache :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/add-cache-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/add-cache-output))

(clojure.core/defn detach-volume "Disconnects a volume from an iSCSI connection and then detaches the volume from\nthe specified gateway. Detaching and attaching a volume enables you to recover\nyour data from one gateway to a different gateway without creating a snapshot.\nIt also makes it easier to move your volumes from an on-premises gateway to a\ngateway hosted on an Amazon EC2 instance." ([detach-volume-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-detach-volume-input detach-volume-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/detach-volume-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/detach-volume-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetachVolume", :http.request.configuration/output-deser-fn response-detach-volume-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef detach-volume :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/detach-volume-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/detach-volume-output))

(clojure.core/defn delete-tape-archive "Deletes the specified virtual tape from the virtual tape shelf (VTS). This\noperation is only supported in the tape gateway type." ([delete-tape-archive-inputinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-tape-archive-input delete-tape-archive-inputinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.storagegateway/endpoints, :http.request.configuration/target-prefix "StorageGateway_20130630", :http.request.spec/output-spec :portkey.aws.storagegateway/delete-tape-archive-output, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2013-06-30", :http.request.configuration/service-id "Storage Gateway", :http.request.spec/input-spec :portkey.aws.storagegateway/delete-tape-archive-input, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteTapeArchive", :http.request.configuration/output-deser-fn response-delete-tape-archive-output, :http.request.spec/error-spec {"InvalidGatewayRequestException" :portkey.aws.storagegateway/invalid-gateway-request-exception, "InternalServerError" :portkey.aws.storagegateway/internal-server-error}})))))
(clojure.spec.alpha/fdef delete-tape-archive :args (clojure.spec.alpha/tuple :portkey.aws.storagegateway/delete-tape-archive-input) :ret (clojure.spec.alpha/and :portkey.aws.storagegateway/delete-tape-archive-output))
