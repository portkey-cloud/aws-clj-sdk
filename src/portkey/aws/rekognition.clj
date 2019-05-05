(ns portkey.aws.rekognition (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "rekognition", :region "ap-northeast-1"},
    :ssl-common-name "rekognition.ap-northeast-1.amazonaws.com",
    :endpoint "https://rekognition.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "rekognition", :region "eu-west-1"},
    :ssl-common-name "rekognition.eu-west-1.amazonaws.com",
    :endpoint "https://rekognition.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "us-east-2"
   {:credential-scope {:service "rekognition", :region "us-east-2"},
    :ssl-common-name "rekognition.us-east-2.amazonaws.com",
    :endpoint "https://rekognition.us-east-2.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "rekognition", :region "ap-southeast-2"},
    :ssl-common-name "rekognition.ap-southeast-2.amazonaws.com",
    :endpoint "https://rekognition.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "rekognition", :region "ap-northeast-2"},
    :ssl-common-name "rekognition.ap-northeast-2.amazonaws.com",
    :endpoint "https://rekognition.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "rekognition", :region "us-west-2"},
    :ssl-common-name "rekognition.us-west-2.amazonaws.com",
    :endpoint "https://rekognition.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "rekognition", :region "us-east-1"},
    :ssl-common-name "rekognition.us-east-1.amazonaws.com",
    :endpoint "https://rekognition.us-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-south-1"
   {:credential-scope {:service "rekognition", :region "ap-south-1"},
    :ssl-common-name "rekognition.ap-south-1.amazonaws.com",
    :endpoint "https://rekognition.ap-south-1.amazonaws.com",
    :signature-version :v4},
   "us-gov-west-1"
   {:credential-scope
    {:service "rekognition", :region "us-gov-west-1"},
    :ssl-common-name "rekognition.us-gov-west-1.amazonaws.com",
    :endpoint "https://rekognition.us-gov-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-face-attributes)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-s-3-object-version)

(clojure.core/declare ser-stream-processor-output)

(clojure.core/declare ser-page-size)

(clojure.core/declare ser-face-id-list)

(clojure.core/declare ser-person-tracking-sort-by)

(clojure.core/declare ser-face-search-sort-by)

(clojure.core/declare ser-video)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-job-tag)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-s-3-object-name)

(clojure.core/declare ser-kinesis-data-stream)

(clojure.core/declare ser-image-blob)

(clojure.core/declare ser-u-integer)

(clojure.core/declare ser-percent)

(clojure.core/declare ser-face-search-settings)

(clojure.core/declare ser-attribute)

(clojure.core/declare ser-celebrity-recognition-sort-by)

(clojure.core/declare ser-attributes)

(clojure.core/declare ser-kinesis-video-stream)

(clojure.core/declare ser-max-faces)

(clojure.core/declare ser-stream-processor-input)

(clojure.core/declare ser-content-moderation-sort-by)

(clojure.core/declare ser-stream-processor-settings)

(clojure.core/declare ser-label-detection-sort-by)

(clojure.core/declare ser-sns-topic-arn)

(clojure.core/declare ser-kinesis-data-arn)

(clojure.core/declare ser-s-3-bucket)

(clojure.core/declare ser-face-id)

(clojure.core/declare ser-kinesis-video-arn)

(clojure.core/declare ser-notification-channel)

(clojure.core/declare ser-rekognition-unique-id)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-image)

(clojure.core/declare ser-max-faces-to-index)

(clojure.core/declare ser-stream-processor-name)

(clojure.core/declare ser-quality-filter)

(clojure.core/declare ser-external-image-id)

(clojure.core/declare ser-s-3-object)

(clojure.core/declare ser-collection-id)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-face-attributes [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "ALL" "ALL", :all "ALL"} input), :shape "FaceAttributes"})

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-s-3-object-version [input] #:http.request.field{:value input, :shape "S3ObjectVersion"})

(clojure.core/defn- ser-stream-processor-output [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StreamProcessorOutput", :type "structure"} (clojure.core/contains? input :kinesis-data-stream) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-data-stream (input :kinesis-data-stream)) #:http.request.field{:name "KinesisDataStream", :shape "KinesisDataStream"}))))

(clojure.core/defn- ser-page-size [input] #:http.request.field{:value input, :shape "PageSize"})

(clojure.core/defn- ser-face-id-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-face-id coll) #:http.request.field{:shape "FaceId"}))) input), :shape "FaceIdList", :type "list", :max 4096, :min 1})

(clojure.core/defn- ser-person-tracking-sort-by [input] #:http.request.field{:value (clojure.core/get {"INDEX" "INDEX", :index "INDEX", "TIMESTAMP" "TIMESTAMP", :timestamp "TIMESTAMP"} input), :shape "PersonTrackingSortBy"})

(clojure.core/defn- ser-face-search-sort-by [input] #:http.request.field{:value (clojure.core/get {"INDEX" "INDEX", :index "INDEX", "TIMESTAMP" "TIMESTAMP", :timestamp "TIMESTAMP"} input), :shape "FaceSearchSortBy"})

(clojure.core/defn- ser-video [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Video", :type "structure"} (clojure.core/contains? input :s-3-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object (input :s-3-object)) #:http.request.field{:name "S3Object", :shape "S3Object"}))))

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-job-tag [input] #:http.request.field{:value input, :shape "JobTag"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-s-3-object-name [input] #:http.request.field{:value input, :shape "S3ObjectName"})

(clojure.core/defn- ser-kinesis-data-stream [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KinesisDataStream", :type "structure"} (clojure.core/contains? input :arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-data-arn (input :arn)) #:http.request.field{:name "Arn", :shape "KinesisDataArn"}))))

(clojure.core/defn- ser-image-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "ImageBlob"})

(clojure.core/defn- ser-u-integer [input] #:http.request.field{:value input, :shape "UInteger"})

(clojure.core/defn- ser-percent [input] #:http.request.field{:value input, :shape "Percent"})

(clojure.core/defn- ser-face-search-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "FaceSearchSettings", :type "structure"} (clojure.core/contains? input :collection-id) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})) (clojure.core/contains? input :face-match-threshold) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :face-match-threshold)) #:http.request.field{:name "FaceMatchThreshold", :shape "Percent"}))))

(clojure.core/defn- ser-attribute [input] #:http.request.field{:value (clojure.core/get {"DEFAULT" "DEFAULT", :default "DEFAULT", "ALL" "ALL", :all "ALL"} input), :shape "Attribute"})

(clojure.core/defn- ser-celebrity-recognition-sort-by [input] #:http.request.field{:value (clojure.core/get {"ID" "ID", :id "ID", "TIMESTAMP" "TIMESTAMP", :timestamp "TIMESTAMP"} input), :shape "CelebrityRecognitionSortBy"})

(clojure.core/defn- ser-attributes [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-attribute coll) #:http.request.field{:shape "Attribute"}))) input), :shape "Attributes", :type "list"})

(clojure.core/defn- ser-kinesis-video-stream [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "KinesisVideoStream", :type "structure"} (clojure.core/contains? input :arn) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-video-arn (input :arn)) #:http.request.field{:name "Arn", :shape "KinesisVideoArn"}))))

(clojure.core/defn- ser-max-faces [input] #:http.request.field{:value input, :shape "MaxFaces"})

(clojure.core/defn- ser-stream-processor-input [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StreamProcessorInput", :type "structure"} (clojure.core/contains? input :kinesis-video-stream) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-kinesis-video-stream (input :kinesis-video-stream)) #:http.request.field{:name "KinesisVideoStream", :shape "KinesisVideoStream"}))))

(clojure.core/defn- ser-content-moderation-sort-by [input] #:http.request.field{:value (clojure.core/get {"NAME" "NAME", :name "NAME", "TIMESTAMP" "TIMESTAMP", :timestamp "TIMESTAMP"} input), :shape "ContentModerationSortBy"})

(clojure.core/defn- ser-stream-processor-settings [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "StreamProcessorSettings", :type "structure"} (clojure.core/contains? input :face-search) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-face-search-settings (input :face-search)) #:http.request.field{:name "FaceSearch", :shape "FaceSearchSettings"}))))

(clojure.core/defn- ser-label-detection-sort-by [input] #:http.request.field{:value (clojure.core/get {"NAME" "NAME", :name "NAME", "TIMESTAMP" "TIMESTAMP", :timestamp "TIMESTAMP"} input), :shape "LabelDetectionSortBy"})

(clojure.core/defn- ser-sns-topic-arn [input] #:http.request.field{:value input, :shape "SNSTopicArn"})

(clojure.core/defn- ser-kinesis-data-arn [input] #:http.request.field{:value input, :shape "KinesisDataArn"})

(clojure.core/defn- ser-s-3-bucket [input] #:http.request.field{:value input, :shape "S3Bucket"})

(clojure.core/defn- ser-face-id [input] #:http.request.field{:value input, :shape "FaceId"})

(clojure.core/defn- ser-kinesis-video-arn [input] #:http.request.field{:value input, :shape "KinesisVideoArn"})

(clojure.core/defn- ser-notification-channel [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-sns-topic-arn (:sns-topic-arn input)) #:http.request.field{:name "SNSTopicArn", :shape "SNSTopicArn"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})], :shape "NotificationChannel", :type "structure"}))

(clojure.core/defn- ser-rekognition-unique-id [input] #:http.request.field{:value input, :shape "RekognitionUniqueId"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-image [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Image", :type "structure"} (clojure.core/contains? input :bytes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-blob (input :bytes)) #:http.request.field{:name "Bytes", :shape "ImageBlob"})) (clojure.core/contains? input :s-3-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object (input :s-3-object)) #:http.request.field{:name "S3Object", :shape "S3Object"}))))

(clojure.core/defn- ser-max-faces-to-index [input] #:http.request.field{:value input, :shape "MaxFacesToIndex"})

(clojure.core/defn- ser-stream-processor-name [input] #:http.request.field{:value input, :shape "StreamProcessorName"})

(clojure.core/defn- ser-quality-filter [input] #:http.request.field{:value (clojure.core/get {"NONE" "NONE", :none "NONE", "AUTO" "AUTO", :auto "AUTO"} input), :shape "QualityFilter"})

(clojure.core/defn- ser-external-image-id [input] #:http.request.field{:value input, :shape "ExternalImageId"})

(clojure.core/defn- ser-s-3-object [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Object", :type "structure"} (clojure.core/contains? input :bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :bucket)) #:http.request.field{:name "Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-name (input :name)) #:http.request.field{:name "Name", :shape "S3ObjectName"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-version (input :version)) #:http.request.field{:name "Version", :shape "S3ObjectVersion"}))))

(clojure.core/defn- ser-collection-id [input] #:http.request.field{:value input, :shape "CollectionId"})

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-create-stream-processor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-processor-input (input :input)) #:http.request.field{:name "Input", :shape "StreamProcessorInput"}) (clojure.core/into (ser-stream-processor-output (input :output)) #:http.request.field{:name "Output", :shape "StreamProcessorOutput"}) (clojure.core/into (ser-stream-processor-name (input :name)) #:http.request.field{:name "Name", :shape "StreamProcessorName"}) (clojure.core/into (ser-stream-processor-settings (input :settings)) #:http.request.field{:name "Settings", :shape "StreamProcessorSettings"}) (clojure.core/into (ser-role-arn (input :role-arn)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})]}))

(clojure.core/defn- req-start-face-search-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"}) (clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :face-match-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :face-match-threshold)) #:http.request.field{:name "FaceMatchThreshold", :shape "Percent"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-list-stream-processors-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"}))))

(clojure.core/defn- req-describe-stream-processor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-processor-name (input :name)) #:http.request.field{:name "Name", :shape "StreamProcessorName"})]}))

(clojure.core/defn- req-detect-text-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]}))

(clojure.core/defn- req-detect-moderation-labels-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]} (clojure.core/contains? input :min-confidence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :min-confidence)) #:http.request.field{:name "MinConfidence", :shape "Percent"}))))

(clojure.core/defn- req-search-faces-by-image-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"}) (clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]} (clojure.core/contains? input :max-faces) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-faces (input :max-faces)) #:http.request.field{:name "MaxFaces", :shape "MaxFaces"})) (clojure.core/contains? input :face-match-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :face-match-threshold)) #:http.request.field{:name "FaceMatchThreshold", :shape "Percent"}))))

(clojure.core/defn- req-delete-collection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})]}))

(clojure.core/defn- req-start-person-tracking-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-recognize-celebrities-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]}))

(clojure.core/defn- req-start-content-moderation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"})]} (clojure.core/contains? input :min-confidence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :min-confidence)) #:http.request.field{:name "MinConfidence", :shape "Percent"})) (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-get-celebrity-info-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-rekognition-unique-id (input :id)) #:http.request.field{:name "Id", :shape "RekognitionUniqueId"})]}))

(clojure.core/defn- req-create-collection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})]}))

(clojure.core/defn- req-get-celebrity-recognition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-celebrity-recognition-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "CelebrityRecognitionSortBy"}))))

(clojure.core/defn- req-list-collections-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-index-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"}) (clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]} (clojure.core/contains? input :external-image-id) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-external-image-id (input :external-image-id)) #:http.request.field{:name "ExternalImageId", :shape "ExternalImageId"})) (clojure.core/contains? input :detection-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :detection-attributes)) #:http.request.field{:name "DetectionAttributes", :shape "Attributes"})) (clojure.core/contains? input :max-faces) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-faces-to-index (input :max-faces)) #:http.request.field{:name "MaxFaces", :shape "MaxFacesToIndex"})) (clojure.core/contains? input :quality-filter) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-quality-filter (input :quality-filter)) #:http.request.field{:name "QualityFilter", :shape "QualityFilter"}))))

(clojure.core/defn- req-delete-stream-processor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-processor-name (input :name)) #:http.request.field{:name "Name", :shape "StreamProcessorName"})]}))

(clojure.core/defn- req-detect-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]} (clojure.core/contains? input :attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-attributes (input :attributes)) #:http.request.field{:name "Attributes", :shape "Attributes"}))))

(clojure.core/defn- req-start-celebrity-recognition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-stop-stream-processor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-processor-name (input :name)) #:http.request.field{:name "Name", :shape "StreamProcessorName"})]}))

(clojure.core/defn- req-describe-collection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})]}))

(clojure.core/defn- req-compare-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :source-image)) #:http.request.field{:name "SourceImage", :shape "Image"}) (clojure.core/into (ser-image (input :target-image)) #:http.request.field{:name "TargetImage", :shape "Image"})]} (clojure.core/contains? input :similarity-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :similarity-threshold)) #:http.request.field{:name "SimilarityThreshold", :shape "Percent"}))))

(clojure.core/defn- req-search-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"}) (clojure.core/into (ser-face-id (input :face-id)) #:http.request.field{:name "FaceId", :shape "FaceId"})]} (clojure.core/contains? input :max-faces) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-faces (input :max-faces)) #:http.request.field{:name "MaxFaces", :shape "MaxFaces"})) (clojure.core/contains? input :face-match-threshold) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :face-match-threshold)) #:http.request.field{:name "FaceMatchThreshold", :shape "Percent"}))))

(clojure.core/defn- req-get-person-tracking-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-person-tracking-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "PersonTrackingSortBy"}))))

(clojure.core/defn- req-delete-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"}) (clojure.core/into (ser-face-id-list (input :face-ids)) #:http.request.field{:name "FaceIds", :shape "FaceIdList"})]}))

(clojure.core/defn- req-detect-labels-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-image (input :image)) #:http.request.field{:name "Image", :shape "Image"})]} (clojure.core/contains? input :max-labels) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-u-integer (input :max-labels)) #:http.request.field{:name "MaxLabels", :shape "UInteger"})) (clojure.core/contains? input :min-confidence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :min-confidence)) #:http.request.field{:name "MinConfidence", :shape "Percent"}))))

(clojure.core/defn- req-get-label-detection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-label-detection-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "LabelDetectionSortBy"}))))

(clojure.core/defn- req-get-content-moderation-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-content-moderation-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "ContentModerationSortBy"}))))

(clojure.core/defn- req-start-face-detection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :face-attributes) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-face-attributes (input :face-attributes)) #:http.request.field{:name "FaceAttributes", :shape "FaceAttributes"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-get-face-search-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :sort-by) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-face-search-sort-by (input :sort-by)) #:http.request.field{:name "SortBy", :shape "FaceSearchSortBy"}))))

(clojure.core/defn- req-start-label-detection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-video (input :video)) #:http.request.field{:name "Video", :shape "Video"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :min-confidence) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-percent (input :min-confidence)) #:http.request.field{:name "MinConfidence", :shape "Percent"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"}))))

(clojure.core/defn- req-start-stream-processor-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-stream-processor-name (input :name)) #:http.request.field{:name "Name", :shape "StreamProcessorName"})]}))

(clojure.core/defn- req-list-faces-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-collection-id (input :collection-id)) #:http.request.field{:name "CollectionId", :shape "CollectionId"})]} (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"})) (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-page-size (input :max-results)) #:http.request.field{:name "MaxResults", :shape "PageSize"}))))

(clojure.core/defn- req-get-face-detection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/declare deser-face-list)

(clojure.core/declare deser-face-match-list)

(clojure.core/declare deser-person-detail)

(clojure.core/declare deser-sunglasses)

(clojure.core/declare deser-stream-processor)

(clojure.core/declare deser-text-detection)

(clojure.core/declare deser-urls)

(clojure.core/declare deser-stream-processor-list)

(clojure.core/declare deser-parent)

(clojure.core/declare deser-face-detection)

(clojure.core/declare deser-person-index)

(clojure.core/declare deser-landmarks)

(clojure.core/declare deser-stream-processor-output)

(clojure.core/declare deser-face-id-list)

(clojure.core/declare deser-bounding-box)

(clojure.core/declare deser-face-detections)

(clojure.core/declare deser-smile)

(clojure.core/declare deser-age-range)

(clojure.core/declare deser-image-id)

(clojure.core/declare deser-landmark)

(clojure.core/declare deser-status-message)

(clojure.core/declare deser-emotions)

(clojure.core/declare deser-celebrity)

(clojure.core/declare deser-geometry)

(clojure.core/declare deser-celebrity-detail)

(clojure.core/declare deser-emotion)

(clojure.core/declare deser-face-record)

(clojure.core/declare deser-eye-open)

(clojure.core/declare deser-celebrity-recognitions)

(clojure.core/declare deser-mustache)

(clojure.core/declare deser-role-arn)

(clojure.core/declare deser-face-model-version-list)

(clojure.core/declare deser-collection-id-list)

(clojure.core/declare deser-compare-faces-unmatch-list)

(clojure.core/declare deser-label-detection)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-kinesis-data-stream)

(clojure.core/declare deser-text-detection-list)

(clojure.core/declare deser-face-match)

(clojure.core/declare deser-u-integer)

(clojure.core/declare deser-gender)

(clojure.core/declare deser-compared-source-image-face)

(clojure.core/declare deser-unindexed-face)

(clojure.core/declare deser-percent)

(clojure.core/declare deser-face-search-settings)

(clojure.core/declare deser-unindexed-faces)

(clojure.core/declare deser-pose)

(clojure.core/declare deser-person-match)

(clojure.core/declare deser-face)

(clojure.core/declare deser-kinesis-video-stream)

(clojure.core/declare deser-mouth-open)

(clojure.core/declare deser-moderation-label)

(clojure.core/declare deser-person-detection)

(clojure.core/declare deser-moderation-labels)

(clojure.core/declare deser-person-detections)

(clojure.core/declare deser-url)

(clojure.core/declare deser-stream-processor-input)

(clojure.core/declare deser-labels)

(clojure.core/declare deser-stream-processor-settings)

(clojure.core/declare deser-person-matches)

(clojure.core/declare deser-stream-processor-arn)

(clojure.core/declare deser-point)

(clojure.core/declare deser-string)

(clojure.core/declare deser-landmark-type)

(clojure.core/declare deser-compare-faces-match-list)

(clojure.core/declare deser-gender-type)

(clojure.core/declare deser-label)

(clojure.core/declare deser-u-long)

(clojure.core/declare deser-kinesis-data-arn)

(clojure.core/declare deser-face-detail)

(clojure.core/declare deser-face-id)

(clojure.core/declare deser-kinesis-video-arn)

(clojure.core/declare deser-degree)

(clojure.core/declare deser-rekognition-unique-id)

(clojure.core/declare deser-stream-processor-status)

(clojure.core/declare deser-timestamp)

(clojure.core/declare deser-label-detections)

(clojure.core/declare deser-text-types)

(clojure.core/declare deser-reasons)

(clojure.core/declare deser-content-moderation-detections)

(clojure.core/declare deser-image-quality)

(clojure.core/declare deser-reason)

(clojure.core/declare deser-face-detail-list)

(clojure.core/declare deser-orientation-correction)

(clojure.core/declare deser-instance)

(clojure.core/declare deser-compared-face-list)

(clojure.core/declare deser-video-metadata)

(clojure.core/declare deser-emotion-name)

(clojure.core/declare deser-polygon)

(clojure.core/declare deser-compare-faces-match)

(clojure.core/declare deser-eyeglasses)

(clojure.core/declare deser-stream-processor-name)

(clojure.core/declare deser-celebrity-recognition)

(clojure.core/declare deser-float)

(clojure.core/declare deser-parents)

(clojure.core/declare deser-external-image-id)

(clojure.core/declare deser-instances)

(clojure.core/declare deser-compared-face)

(clojure.core/declare deser-face-record-list)

(clojure.core/declare deser-video-job-status)

(clojure.core/declare deser-celebrity-list)

(clojure.core/declare deser-date-time)

(clojure.core/declare deser-collection-id)

(clojure.core/declare deser-beard)

(clojure.core/declare deser-boolean)

(clojure.core/declare deser-content-moderation-detection)

(clojure.core/declare deser-job-id)

(clojure.core/defn- deser-face-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-face coll))) input))

(clojure.core/defn- deser-face-match-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-face-match coll))) input))

(clojure.core/defn- deser-person-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Index") (clojure.core/assoc :index (deser-person-index (input "Index"))) (clojure.core/contains? input "BoundingBox") (clojure.core/assoc :bounding-box (deser-bounding-box (input "BoundingBox"))) (clojure.core/contains? input "Face") (clojure.core/assoc :face (deser-face-detail (input "Face")))))

(clojure.core/defn- deser-sunglasses [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-boolean (input "Value"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-stream-processor [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-stream-processor-name (input "Name"))) (clojure.core/contains? input "Status") (clojure.core/assoc :status (deser-stream-processor-status (input "Status")))))

(clojure.core/defn- deser-text-detection [input] (clojure.core/cond-> {} (clojure.core/contains? input "DetectedText") (clojure.core/assoc :detected-text (deser-string (input "DetectedText"))) (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-text-types (input "Type"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-u-integer (input "Id"))) (clojure.core/contains? input "ParentId") (clojure.core/assoc :parent-id (deser-u-integer (input "ParentId"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence"))) (clojure.core/contains? input "Geometry") (clojure.core/assoc :geometry (deser-geometry (input "Geometry")))))

(clojure.core/defn- deser-urls [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-url coll))) input))

(clojure.core/defn- deser-stream-processor-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-stream-processor coll))) input))

(clojure.core/defn- deser-parent [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name")))))

(clojure.core/defn- deser-face-detection [input] (clojure.core/cond-> {} (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp"))) (clojure.core/contains? input "Face") (clojure.core/assoc :face (deser-face-detail (input "Face")))))

(clojure.core/defn- deser-person-index [input] input)

(clojure.core/defn- deser-landmarks [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-landmark coll))) input))

(clojure.core/defn- deser-stream-processor-output [input] (clojure.core/cond-> {} (clojure.core/contains? input "KinesisDataStream") (clojure.core/assoc :kinesis-data-stream (deser-kinesis-data-stream (input "KinesisDataStream")))))

(clojure.core/defn- deser-face-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-face-id coll))) input))

(clojure.core/defn- deser-bounding-box [input] (clojure.core/cond-> {} (clojure.core/contains? input "Width") (clojure.core/assoc :width (deser-float (input "Width"))) (clojure.core/contains? input "Height") (clojure.core/assoc :height (deser-float (input "Height"))) (clojure.core/contains? input "Left") (clojure.core/assoc :left (deser-float (input "Left"))) (clojure.core/contains? input "Top") (clojure.core/assoc :top (deser-float (input "Top")))))

(clojure.core/defn- deser-face-detections [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-face-detection coll))) input))

(clojure.core/defn- deser-smile [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-boolean (input "Value"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-age-range [input] (clojure.core/cond-> {} (clojure.core/contains? input "Low") (clojure.core/assoc :low (deser-u-integer (input "Low"))) (clojure.core/contains? input "High") (clojure.core/assoc :high (deser-u-integer (input "High")))))

(clojure.core/defn- deser-image-id [input] input)

(clojure.core/defn- deser-landmark [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-landmark-type (input "Type"))) (clojure.core/contains? input "X") (clojure.core/assoc :x (deser-float (input "X"))) (clojure.core/contains? input "Y") (clojure.core/assoc :y (deser-float (input "Y")))))

(clojure.core/defn- deser-status-message [input] input)

(clojure.core/defn- deser-emotions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-emotion coll))) input))

(clojure.core/defn- deser-celebrity [input] (clojure.core/cond-> {} (clojure.core/contains? input "Urls") (clojure.core/assoc :urls (deser-urls (input "Urls"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-rekognition-unique-id (input "Id"))) (clojure.core/contains? input "Face") (clojure.core/assoc :face (deser-compared-face (input "Face"))) (clojure.core/contains? input "MatchConfidence") (clojure.core/assoc :match-confidence (deser-percent (input "MatchConfidence")))))

(clojure.core/defn- deser-geometry [input] (clojure.core/cond-> {} (clojure.core/contains? input "BoundingBox") (clojure.core/assoc :bounding-box (deser-bounding-box (input "BoundingBox"))) (clojure.core/contains? input "Polygon") (clojure.core/assoc :polygon (deser-polygon (input "Polygon")))))

(clojure.core/defn- deser-celebrity-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Urls") (clojure.core/assoc :urls (deser-urls (input "Urls"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-rekognition-unique-id (input "Id"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence"))) (clojure.core/contains? input "BoundingBox") (clojure.core/assoc :bounding-box (deser-bounding-box (input "BoundingBox"))) (clojure.core/contains? input "Face") (clojure.core/assoc :face (deser-face-detail (input "Face")))))

(clojure.core/defn- deser-emotion [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-emotion-name (input "Type"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-face-record [input] (clojure.core/cond-> {} (clojure.core/contains? input "Face") (clojure.core/assoc :face (deser-face (input "Face"))) (clojure.core/contains? input "FaceDetail") (clojure.core/assoc :face-detail (deser-face-detail (input "FaceDetail")))))

(clojure.core/defn- deser-eye-open [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-boolean (input "Value"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-celebrity-recognitions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-celebrity-recognition coll))) input))

(clojure.core/defn- deser-mustache [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-boolean (input "Value"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-role-arn [input] input)

(clojure.core/defn- deser-face-model-version-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-collection-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-collection-id coll))) input))

(clojure.core/defn- deser-compare-faces-unmatch-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compared-face coll))) input))

(clojure.core/defn- deser-label-detection [input] (clojure.core/cond-> {} (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp"))) (clojure.core/contains? input "Label") (clojure.core/assoc :label (deser-label (input "Label")))))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-kinesis-data-stream [input] (clojure.core/cond-> {} (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-kinesis-data-arn (input "Arn")))))

(clojure.core/defn- deser-text-detection-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-text-detection coll))) input))

(clojure.core/defn- deser-face-match [input] (clojure.core/cond-> {} (clojure.core/contains? input "Similarity") (clojure.core/assoc :similarity (deser-percent (input "Similarity"))) (clojure.core/contains? input "Face") (clojure.core/assoc :face (deser-face (input "Face")))))

(clojure.core/defn- deser-u-integer [input] input)

(clojure.core/defn- deser-gender [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-gender-type (input "Value"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-compared-source-image-face [input] (clojure.core/cond-> {} (clojure.core/contains? input "BoundingBox") (clojure.core/assoc :bounding-box (deser-bounding-box (input "BoundingBox"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-unindexed-face [input] (clojure.core/cond-> {} (clojure.core/contains? input "Reasons") (clojure.core/assoc :reasons (deser-reasons (input "Reasons"))) (clojure.core/contains? input "FaceDetail") (clojure.core/assoc :face-detail (deser-face-detail (input "FaceDetail")))))

(clojure.core/defn- deser-percent [input] input)

(clojure.core/defn- deser-face-search-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "CollectionId") (clojure.core/assoc :collection-id (deser-collection-id (input "CollectionId"))) (clojure.core/contains? input "FaceMatchThreshold") (clojure.core/assoc :face-match-threshold (deser-percent (input "FaceMatchThreshold")))))

(clojure.core/defn- deser-unindexed-faces [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-unindexed-face coll))) input))

(clojure.core/defn- deser-pose [input] (clojure.core/cond-> {} (clojure.core/contains? input "Roll") (clojure.core/assoc :roll (deser-degree (input "Roll"))) (clojure.core/contains? input "Yaw") (clojure.core/assoc :yaw (deser-degree (input "Yaw"))) (clojure.core/contains? input "Pitch") (clojure.core/assoc :pitch (deser-degree (input "Pitch")))))

(clojure.core/defn- deser-person-match [input] (clojure.core/cond-> {} (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp"))) (clojure.core/contains? input "Person") (clojure.core/assoc :person (deser-person-detail (input "Person"))) (clojure.core/contains? input "FaceMatches") (clojure.core/assoc :face-matches (deser-face-match-list (input "FaceMatches")))))

(clojure.core/defn- deser-face [input] (clojure.core/cond-> {} (clojure.core/contains? input "FaceId") (clojure.core/assoc :face-id (deser-face-id (input "FaceId"))) (clojure.core/contains? input "BoundingBox") (clojure.core/assoc :bounding-box (deser-bounding-box (input "BoundingBox"))) (clojure.core/contains? input "ImageId") (clojure.core/assoc :image-id (deser-image-id (input "ImageId"))) (clojure.core/contains? input "ExternalImageId") (clojure.core/assoc :external-image-id (deser-external-image-id (input "ExternalImageId"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-kinesis-video-stream [input] (clojure.core/cond-> {} (clojure.core/contains? input "Arn") (clojure.core/assoc :arn (deser-kinesis-video-arn (input "Arn")))))

(clojure.core/defn- deser-mouth-open [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-boolean (input "Value"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-moderation-label [input] (clojure.core/cond-> {} (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence"))) (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "ParentName") (clojure.core/assoc :parent-name (deser-string (input "ParentName")))))

(clojure.core/defn- deser-person-detection [input] (clojure.core/cond-> {} (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp"))) (clojure.core/contains? input "Person") (clojure.core/assoc :person (deser-person-detail (input "Person")))))

(clojure.core/defn- deser-moderation-labels [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-moderation-label coll))) input))

(clojure.core/defn- deser-person-detections [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-person-detection coll))) input))

(clojure.core/defn- deser-url [input] input)

(clojure.core/defn- deser-stream-processor-input [input] (clojure.core/cond-> {} (clojure.core/contains? input "KinesisVideoStream") (clojure.core/assoc :kinesis-video-stream (deser-kinesis-video-stream (input "KinesisVideoStream")))))

(clojure.core/defn- deser-labels [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-label coll))) input))

(clojure.core/defn- deser-stream-processor-settings [input] (clojure.core/cond-> {} (clojure.core/contains? input "FaceSearch") (clojure.core/assoc :face-search (deser-face-search-settings (input "FaceSearch")))))

(clojure.core/defn- deser-person-matches [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-person-match coll))) input))

(clojure.core/defn- deser-stream-processor-arn [input] input)

(clojure.core/defn- deser-point [input] (clojure.core/cond-> {} (clojure.core/contains? input "X") (clojure.core/assoc :x (deser-float (input "X"))) (clojure.core/contains? input "Y") (clojure.core/assoc :y (deser-float (input "Y")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-landmark-type [input] (clojure.core/get {"rightEyeBrowUp" :right-eye-brow-up, "leftEyeRight" :left-eye-right, "rightEyeUp" :right-eye-up, "leftEyeLeft" :left-eye-left, "eyeRight" :eye-right, "leftEyeBrowUp" :left-eye-brow-up, "rightEyeRight" :right-eye-right, "rightEyeLeft" :right-eye-left, "leftEyeUp" :left-eye-up, "mouthDown" :mouth-down, "upperJawlineRight" :upper-jawline-right, "chinBottom" :chin-bottom, "upperJawlineLeft" :upper-jawline-left, "midJawlineRight" :mid-jawline-right, "rightPupil" :right-pupil, "leftPupil" :left-pupil, "noseRight" :nose-right, "rightEyeBrowLeft" :right-eye-brow-left, "nose" :nose, "midJawlineLeft" :mid-jawline-left, "eyeLeft" :eye-left, "mouthUp" :mouth-up, "mouthLeft" :mouth-left, "rightEyeBrowRight" :right-eye-brow-right, "mouthRight" :mouth-right, "noseLeft" :nose-left, "leftEyeBrowLeft" :left-eye-brow-left, "leftEyeBrowRight" :left-eye-brow-right, "leftEyeDown" :left-eye-down, "rightEyeDown" :right-eye-down} input))

(clojure.core/defn- deser-compare-faces-match-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compare-faces-match coll))) input))

(clojure.core/defn- deser-gender-type [input] (clojure.core/get {"Male" :male, "Female" :female} input))

(clojure.core/defn- deser-label [input] (clojure.core/cond-> {} (clojure.core/contains? input "Name") (clojure.core/assoc :name (deser-string (input "Name"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence"))) (clojure.core/contains? input "Instances") (clojure.core/assoc :instances (deser-instances (input "Instances"))) (clojure.core/contains? input "Parents") (clojure.core/assoc :parents (deser-parents (input "Parents")))))

(clojure.core/defn- deser-u-long [input] input)

(clojure.core/defn- deser-kinesis-data-arn [input] input)

(clojure.core/defn- deser-face-detail [input] (clojure.core/cond-> {} (clojure.core/contains? input "Sunglasses") (clojure.core/assoc :sunglasses (deser-sunglasses (input "Sunglasses"))) (clojure.core/contains? input "Landmarks") (clojure.core/assoc :landmarks (deser-landmarks (input "Landmarks"))) (clojure.core/contains? input "BoundingBox") (clojure.core/assoc :bounding-box (deser-bounding-box (input "BoundingBox"))) (clojure.core/contains? input "Smile") (clojure.core/assoc :smile (deser-smile (input "Smile"))) (clojure.core/contains? input "AgeRange") (clojure.core/assoc :age-range (deser-age-range (input "AgeRange"))) (clojure.core/contains? input "Emotions") (clojure.core/assoc :emotions (deser-emotions (input "Emotions"))) (clojure.core/contains? input "Mustache") (clojure.core/assoc :mustache (deser-mustache (input "Mustache"))) (clojure.core/contains? input "EyesOpen") (clojure.core/assoc :eyes-open (deser-eye-open (input "EyesOpen"))) (clojure.core/contains? input "Gender") (clojure.core/assoc :gender (deser-gender (input "Gender"))) (clojure.core/contains? input "Pose") (clojure.core/assoc :pose (deser-pose (input "Pose"))) (clojure.core/contains? input "Quality") (clojure.core/assoc :quality (deser-image-quality (input "Quality"))) (clojure.core/contains? input "MouthOpen") (clojure.core/assoc :mouth-open (deser-mouth-open (input "MouthOpen"))) (clojure.core/contains? input "Eyeglasses") (clojure.core/assoc :eyeglasses (deser-eyeglasses (input "Eyeglasses"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence"))) (clojure.core/contains? input "Beard") (clojure.core/assoc :beard (deser-beard (input "Beard")))))

(clojure.core/defn- deser-face-id [input] input)

(clojure.core/defn- deser-kinesis-video-arn [input] input)

(clojure.core/defn- deser-degree [input] input)

(clojure.core/defn- deser-rekognition-unique-id [input] input)

(clojure.core/defn- deser-stream-processor-status [input] (clojure.core/get {"STOPPED" :stopped, "STARTING" :starting, "RUNNING" :running, "FAILED" :failed, "STOPPING" :stopping} input))

(clojure.core/defn- deser-timestamp [input] input)

(clojure.core/defn- deser-label-detections [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-label-detection coll))) input))

(clojure.core/defn- deser-text-types [input] (clojure.core/get {"LINE" :line, "WORD" :word} input))

(clojure.core/defn- deser-reasons [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-reason coll))) input))

(clojure.core/defn- deser-content-moderation-detections [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-content-moderation-detection coll))) input))

(clojure.core/defn- deser-image-quality [input] (clojure.core/cond-> {} (clojure.core/contains? input "Brightness") (clojure.core/assoc :brightness (deser-float (input "Brightness"))) (clojure.core/contains? input "Sharpness") (clojure.core/assoc :sharpness (deser-float (input "Sharpness")))))

(clojure.core/defn- deser-reason [input] (clojure.core/get {"EXCEEDS_MAX_FACES" :exceeds-max-faces, "EXTREME_POSE" :extreme-pose, "LOW_BRIGHTNESS" :low-brightness, "LOW_SHARPNESS" :low-sharpness, "LOW_CONFIDENCE" :low-confidence, "SMALL_BOUNDING_BOX" :small-bounding-box} input))

(clojure.core/defn- deser-face-detail-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-face-detail coll))) input))

(clojure.core/defn- deser-orientation-correction [input] (clojure.core/get {"ROTATE_0" :rotate-0, "ROTATE_90" :rotate-90, "ROTATE_180" :rotate-180, "ROTATE_270" :rotate-270} input))

(clojure.core/defn- deser-instance [input] (clojure.core/cond-> {} (clojure.core/contains? input "BoundingBox") (clojure.core/assoc :bounding-box (deser-bounding-box (input "BoundingBox"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-compared-face-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-compared-face coll))) input))

(clojure.core/defn- deser-video-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "Codec") (clojure.core/assoc :codec (deser-string (input "Codec"))) (clojure.core/contains? input "DurationMillis") (clojure.core/assoc :duration-millis (deser-u-long (input "DurationMillis"))) (clojure.core/contains? input "Format") (clojure.core/assoc :format (deser-string (input "Format"))) (clojure.core/contains? input "FrameRate") (clojure.core/assoc :frame-rate (deser-float (input "FrameRate"))) (clojure.core/contains? input "FrameHeight") (clojure.core/assoc :frame-height (deser-u-long (input "FrameHeight"))) (clojure.core/contains? input "FrameWidth") (clojure.core/assoc :frame-width (deser-u-long (input "FrameWidth")))))

(clojure.core/defn- deser-emotion-name [input] (clojure.core/get {"HAPPY" :happy, "SAD" :sad, "ANGRY" :angry, "CONFUSED" :confused, "DISGUSTED" :disgusted, "SURPRISED" :surprised, "CALM" :calm, "UNKNOWN" :unknown} input))

(clojure.core/defn- deser-polygon [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-point coll))) input))

(clojure.core/defn- deser-compare-faces-match [input] (clojure.core/cond-> {} (clojure.core/contains? input "Similarity") (clojure.core/assoc :similarity (deser-percent (input "Similarity"))) (clojure.core/contains? input "Face") (clojure.core/assoc :face (deser-compared-face (input "Face")))))

(clojure.core/defn- deser-eyeglasses [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-boolean (input "Value"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-stream-processor-name [input] input)

(clojure.core/defn- deser-celebrity-recognition [input] (clojure.core/cond-> {} (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp"))) (clojure.core/contains? input "Celebrity") (clojure.core/assoc :celebrity (deser-celebrity-detail (input "Celebrity")))))

(clojure.core/defn- deser-float [input] input)

(clojure.core/defn- deser-parents [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-parent coll))) input))

(clojure.core/defn- deser-external-image-id [input] input)

(clojure.core/defn- deser-instances [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-instance coll))) input))

(clojure.core/defn- deser-compared-face [input] (clojure.core/cond-> {} (clojure.core/contains? input "BoundingBox") (clojure.core/assoc :bounding-box (deser-bounding-box (input "BoundingBox"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence"))) (clojure.core/contains? input "Landmarks") (clojure.core/assoc :landmarks (deser-landmarks (input "Landmarks"))) (clojure.core/contains? input "Pose") (clojure.core/assoc :pose (deser-pose (input "Pose"))) (clojure.core/contains? input "Quality") (clojure.core/assoc :quality (deser-image-quality (input "Quality")))))

(clojure.core/defn- deser-face-record-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-face-record coll))) input))

(clojure.core/defn- deser-video-job-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "SUCCEEDED" :succeeded, "FAILED" :failed} input))

(clojure.core/defn- deser-celebrity-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-celebrity coll))) input))

(clojure.core/defn- deser-date-time [input] input)

(clojure.core/defn- deser-collection-id [input] input)

(clojure.core/defn- deser-beard [input] (clojure.core/cond-> {} (clojure.core/contains? input "Value") (clojure.core/assoc :value (deser-boolean (input "Value"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-boolean [input] input)

(clojure.core/defn- deser-content-moderation-detection [input] (clojure.core/cond-> {} (clojure.core/contains? input "Timestamp") (clojure.core/assoc :timestamp (deser-timestamp (input "Timestamp"))) (clojure.core/contains? input "ModerationLabel") (clojure.core/assoc :moderation-label (deser-moderation-label (input "ModerationLabel")))))

(clojure.core/defn- deser-job-id [input] input)

(clojure.core/defn- response-list-faces-response ([input] (response-list-faces-response nil input)) ([resultWrapper1552494 input] (clojure.core/let [rawinput1552493 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552495 {"Faces" (rawinput1552493 "Faces"), "NextToken" (rawinput1552493 "NextToken"), "FaceModelVersion" (rawinput1552493 "FaceModelVersion")}] (clojure.core/cond-> {} (letvar1552495 "Faces") (clojure.core/assoc :faces (deser-face-list (clojure.core/get-in letvar1552495 ["Faces"]))) (letvar1552495 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1552495 ["NextToken"]))) (letvar1552495 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1552495 ["FaceModelVersion"])))))))

(clojure.core/defn- response-stop-stream-processor-response ([input] (response-stop-stream-processor-response nil input)) ([resultWrapper1552497 input] (clojure.core/let [rawinput1552496 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552498 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-image-format-exception ([input] (response-invalid-image-format-exception nil input)) ([resultWrapper1552500 input] (clojure.core/let [rawinput1552499 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552501 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-recognize-celebrities-response ([input] (response-recognize-celebrities-response nil input)) ([resultWrapper1552503 input] (clojure.core/let [rawinput1552502 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552504 {"CelebrityFaces" (rawinput1552502 "CelebrityFaces"), "UnrecognizedFaces" (rawinput1552502 "UnrecognizedFaces"), "OrientationCorrection" (rawinput1552502 "OrientationCorrection")}] (clojure.core/cond-> {} (letvar1552504 "CelebrityFaces") (clojure.core/assoc :celebrity-faces (deser-celebrity-list (clojure.core/get-in letvar1552504 ["CelebrityFaces"]))) (letvar1552504 "UnrecognizedFaces") (clojure.core/assoc :unrecognized-faces (deser-compared-face-list (clojure.core/get-in letvar1552504 ["UnrecognizedFaces"]))) (letvar1552504 "OrientationCorrection") (clojure.core/assoc :orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1552504 ["OrientationCorrection"])))))))

(clojure.core/defn- response-get-label-detection-response ([input] (response-get-label-detection-response nil input)) ([resultWrapper1552506 input] (clojure.core/let [rawinput1552505 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552507 {"JobStatus" (rawinput1552505 "JobStatus"), "StatusMessage" (rawinput1552505 "StatusMessage"), "VideoMetadata" (rawinput1552505 "VideoMetadata"), "NextToken" (rawinput1552505 "NextToken"), "Labels" (rawinput1552505 "Labels"), "LabelModelVersion" (rawinput1552505 "LabelModelVersion")}] (clojure.core/cond-> {} (letvar1552507 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1552507 ["JobStatus"]))) (letvar1552507 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1552507 ["StatusMessage"]))) (letvar1552507 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1552507 ["VideoMetadata"]))) (letvar1552507 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1552507 ["NextToken"]))) (letvar1552507 "Labels") (clojure.core/assoc :labels (deser-label-detections (clojure.core/get-in letvar1552507 ["Labels"]))) (letvar1552507 "LabelModelVersion") (clojure.core/assoc :label-model-version (deser-string (clojure.core/get-in letvar1552507 ["LabelModelVersion"])))))))

(clojure.core/defn- response-start-label-detection-response ([input] (response-start-label-detection-response nil input)) ([resultWrapper1552509 input] (clojure.core/let [rawinput1552508 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552510 {"JobId" (rawinput1552508 "JobId")}] (clojure.core/cond-> {} (letvar1552510 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1552510 ["JobId"])))))))

(clojure.core/defn- response-delete-faces-response ([input] (response-delete-faces-response nil input)) ([resultWrapper1552512 input] (clojure.core/let [rawinput1552511 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552513 {"DeletedFaces" (rawinput1552511 "DeletedFaces")}] (clojure.core/cond-> {} (letvar1552513 "DeletedFaces") (clojure.core/assoc :deleted-faces (deser-face-id-list (clojure.core/get-in letvar1552513 ["DeletedFaces"])))))))

(clojure.core/defn- response-get-person-tracking-response ([input] (response-get-person-tracking-response nil input)) ([resultWrapper1552515 input] (clojure.core/let [rawinput1552514 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552516 {"JobStatus" (rawinput1552514 "JobStatus"), "StatusMessage" (rawinput1552514 "StatusMessage"), "VideoMetadata" (rawinput1552514 "VideoMetadata"), "NextToken" (rawinput1552514 "NextToken"), "Persons" (rawinput1552514 "Persons")}] (clojure.core/cond-> {} (letvar1552516 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1552516 ["JobStatus"]))) (letvar1552516 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1552516 ["StatusMessage"]))) (letvar1552516 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1552516 ["VideoMetadata"]))) (letvar1552516 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1552516 ["NextToken"]))) (letvar1552516 "Persons") (clojure.core/assoc :persons (deser-person-detections (clojure.core/get-in letvar1552516 ["Persons"])))))))

(clojure.core/defn- response-compare-faces-response ([input] (response-compare-faces-response nil input)) ([resultWrapper1552518 input] (clojure.core/let [rawinput1552517 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552519 {"SourceImageFace" (rawinput1552517 "SourceImageFace"), "FaceMatches" (rawinput1552517 "FaceMatches"), "UnmatchedFaces" (rawinput1552517 "UnmatchedFaces"), "SourceImageOrientationCorrection" (rawinput1552517 "SourceImageOrientationCorrection"), "TargetImageOrientationCorrection" (rawinput1552517 "TargetImageOrientationCorrection")}] (clojure.core/cond-> {} (letvar1552519 "SourceImageFace") (clojure.core/assoc :source-image-face (deser-compared-source-image-face (clojure.core/get-in letvar1552519 ["SourceImageFace"]))) (letvar1552519 "FaceMatches") (clojure.core/assoc :face-matches (deser-compare-faces-match-list (clojure.core/get-in letvar1552519 ["FaceMatches"]))) (letvar1552519 "UnmatchedFaces") (clojure.core/assoc :unmatched-faces (deser-compare-faces-unmatch-list (clojure.core/get-in letvar1552519 ["UnmatchedFaces"]))) (letvar1552519 "SourceImageOrientationCorrection") (clojure.core/assoc :source-image-orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1552519 ["SourceImageOrientationCorrection"]))) (letvar1552519 "TargetImageOrientationCorrection") (clojure.core/assoc :target-image-orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1552519 ["TargetImageOrientationCorrection"])))))))

(clojure.core/defn- response-invalid-s-3-object-exception ([input] (response-invalid-s-3-object-exception nil input)) ([resultWrapper1552521 input] (clojure.core/let [rawinput1552520 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552522 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-search-faces-response ([input] (response-search-faces-response nil input)) ([resultWrapper1552524 input] (clojure.core/let [rawinput1552523 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552525 {"SearchedFaceId" (rawinput1552523 "SearchedFaceId"), "FaceMatches" (rawinput1552523 "FaceMatches"), "FaceModelVersion" (rawinput1552523 "FaceModelVersion")}] (clojure.core/cond-> {} (letvar1552525 "SearchedFaceId") (clojure.core/assoc :searched-face-id (deser-face-id (clojure.core/get-in letvar1552525 ["SearchedFaceId"]))) (letvar1552525 "FaceMatches") (clojure.core/assoc :face-matches (deser-face-match-list (clojure.core/get-in letvar1552525 ["FaceMatches"]))) (letvar1552525 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1552525 ["FaceModelVersion"])))))))

(clojure.core/defn- response-start-face-search-response ([input] (response-start-face-search-response nil input)) ([resultWrapper1552527 input] (clojure.core/let [rawinput1552526 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552528 {"JobId" (rawinput1552526 "JobId")}] (clojure.core/cond-> {} (letvar1552528 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1552528 ["JobId"])))))))

(clojure.core/defn- response-get-face-detection-response ([input] (response-get-face-detection-response nil input)) ([resultWrapper1552530 input] (clojure.core/let [rawinput1552529 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552531 {"JobStatus" (rawinput1552529 "JobStatus"), "StatusMessage" (rawinput1552529 "StatusMessage"), "VideoMetadata" (rawinput1552529 "VideoMetadata"), "NextToken" (rawinput1552529 "NextToken"), "Faces" (rawinput1552529 "Faces")}] (clojure.core/cond-> {} (letvar1552531 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1552531 ["JobStatus"]))) (letvar1552531 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1552531 ["StatusMessage"]))) (letvar1552531 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1552531 ["VideoMetadata"]))) (letvar1552531 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1552531 ["NextToken"]))) (letvar1552531 "Faces") (clojure.core/assoc :faces (deser-face-detections (clojure.core/get-in letvar1552531 ["Faces"])))))))

(clojure.core/defn- response-detect-text-response ([input] (response-detect-text-response nil input)) ([resultWrapper1552533 input] (clojure.core/let [rawinput1552532 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552534 {"TextDetections" (rawinput1552532 "TextDetections")}] (clojure.core/cond-> {} (letvar1552534 "TextDetections") (clojure.core/assoc :text-detections (deser-text-detection-list (clojure.core/get-in letvar1552534 ["TextDetections"])))))))

(clojure.core/defn- response-search-faces-by-image-response ([input] (response-search-faces-by-image-response nil input)) ([resultWrapper1552536 input] (clojure.core/let [rawinput1552535 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552537 {"SearchedFaceBoundingBox" (rawinput1552535 "SearchedFaceBoundingBox"), "SearchedFaceConfidence" (rawinput1552535 "SearchedFaceConfidence"), "FaceMatches" (rawinput1552535 "FaceMatches"), "FaceModelVersion" (rawinput1552535 "FaceModelVersion")}] (clojure.core/cond-> {} (letvar1552537 "SearchedFaceBoundingBox") (clojure.core/assoc :searched-face-bounding-box (deser-bounding-box (clojure.core/get-in letvar1552537 ["SearchedFaceBoundingBox"]))) (letvar1552537 "SearchedFaceConfidence") (clojure.core/assoc :searched-face-confidence (deser-percent (clojure.core/get-in letvar1552537 ["SearchedFaceConfidence"]))) (letvar1552537 "FaceMatches") (clojure.core/assoc :face-matches (deser-face-match-list (clojure.core/get-in letvar1552537 ["FaceMatches"]))) (letvar1552537 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1552537 ["FaceModelVersion"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1552539 input] (clojure.core/let [rawinput1552538 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552540 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-face-search-response ([input] (response-get-face-search-response nil input)) ([resultWrapper1552542 input] (clojure.core/let [rawinput1552541 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552543 {"JobStatus" (rawinput1552541 "JobStatus"), "StatusMessage" (rawinput1552541 "StatusMessage"), "NextToken" (rawinput1552541 "NextToken"), "VideoMetadata" (rawinput1552541 "VideoMetadata"), "Persons" (rawinput1552541 "Persons")}] (clojure.core/cond-> {} (letvar1552543 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1552543 ["JobStatus"]))) (letvar1552543 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1552543 ["StatusMessage"]))) (letvar1552543 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1552543 ["NextToken"]))) (letvar1552543 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1552543 ["VideoMetadata"]))) (letvar1552543 "Persons") (clojure.core/assoc :persons (deser-person-matches (clojure.core/get-in letvar1552543 ["Persons"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1552545 input] (clojure.core/let [rawinput1552544 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552546 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper1552548 input] (clojure.core/let [rawinput1552547 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552549 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-content-moderation-response ([input] (response-start-content-moderation-response nil input)) ([resultWrapper1552551 input] (clojure.core/let [rawinput1552550 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552552 {"JobId" (rawinput1552550 "JobId")}] (clojure.core/cond-> {} (letvar1552552 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1552552 ["JobId"])))))))

(clojure.core/defn- response-delete-stream-processor-response ([input] (response-delete-stream-processor-response nil input)) ([resultWrapper1552554 input] (clojure.core/let [rawinput1552553 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552555 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-index-faces-response ([input] (response-index-faces-response nil input)) ([resultWrapper1552557 input] (clojure.core/let [rawinput1552556 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552558 {"FaceRecords" (rawinput1552556 "FaceRecords"), "OrientationCorrection" (rawinput1552556 "OrientationCorrection"), "FaceModelVersion" (rawinput1552556 "FaceModelVersion"), "UnindexedFaces" (rawinput1552556 "UnindexedFaces")}] (clojure.core/cond-> {} (letvar1552558 "FaceRecords") (clojure.core/assoc :face-records (deser-face-record-list (clojure.core/get-in letvar1552558 ["FaceRecords"]))) (letvar1552558 "OrientationCorrection") (clojure.core/assoc :orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1552558 ["OrientationCorrection"]))) (letvar1552558 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1552558 ["FaceModelVersion"]))) (letvar1552558 "UnindexedFaces") (clojure.core/assoc :unindexed-faces (deser-unindexed-faces (clojure.core/get-in letvar1552558 ["UnindexedFaces"])))))))

(clojure.core/defn- response-create-collection-response ([input] (response-create-collection-response nil input)) ([resultWrapper1552560 input] (clojure.core/let [rawinput1552559 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552561 {"StatusCode" (rawinput1552559 "StatusCode"), "CollectionArn" (rawinput1552559 "CollectionArn"), "FaceModelVersion" (rawinput1552559 "FaceModelVersion")}] (clojure.core/cond-> {} (letvar1552561 "StatusCode") (clojure.core/assoc :status-code (deser-u-integer (clojure.core/get-in letvar1552561 ["StatusCode"]))) (letvar1552561 "CollectionArn") (clojure.core/assoc :collection-arn (deser-string (clojure.core/get-in letvar1552561 ["CollectionArn"]))) (letvar1552561 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1552561 ["FaceModelVersion"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1552563 input] (clojure.core/let [rawinput1552562 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552564 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-stream-processor-response ([input] (response-create-stream-processor-response nil input)) ([resultWrapper1552566 input] (clojure.core/let [rawinput1552565 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552567 {"StreamProcessorArn" (rawinput1552565 "StreamProcessorArn")}] (clojure.core/cond-> {} (letvar1552567 "StreamProcessorArn") (clojure.core/assoc :stream-processor-arn (deser-stream-processor-arn (clojure.core/get-in letvar1552567 ["StreamProcessorArn"])))))))

(clojure.core/defn- response-list-stream-processors-response ([input] (response-list-stream-processors-response nil input)) ([resultWrapper1552569 input] (clojure.core/let [rawinput1552568 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552570 {"NextToken" (rawinput1552568 "NextToken"), "StreamProcessors" (rawinput1552568 "StreamProcessors")}] (clojure.core/cond-> {} (letvar1552570 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1552570 ["NextToken"]))) (letvar1552570 "StreamProcessors") (clojure.core/assoc :stream-processors (deser-stream-processor-list (clojure.core/get-in letvar1552570 ["StreamProcessors"])))))))

(clojure.core/defn- response-idempotent-parameter-mismatch-exception ([input] (response-idempotent-parameter-mismatch-exception nil input)) ([resultWrapper1552572 input] (clojure.core/let [rawinput1552571 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552573 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-celebrity-recognition-response ([input] (response-get-celebrity-recognition-response nil input)) ([resultWrapper1552575 input] (clojure.core/let [rawinput1552574 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552576 {"JobStatus" (rawinput1552574 "JobStatus"), "StatusMessage" (rawinput1552574 "StatusMessage"), "VideoMetadata" (rawinput1552574 "VideoMetadata"), "NextToken" (rawinput1552574 "NextToken"), "Celebrities" (rawinput1552574 "Celebrities")}] (clojure.core/cond-> {} (letvar1552576 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1552576 ["JobStatus"]))) (letvar1552576 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1552576 ["StatusMessage"]))) (letvar1552576 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1552576 ["VideoMetadata"]))) (letvar1552576 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1552576 ["NextToken"]))) (letvar1552576 "Celebrities") (clojure.core/assoc :celebrities (deser-celebrity-recognitions (clojure.core/get-in letvar1552576 ["Celebrities"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1552578 input] (clojure.core/let [rawinput1552577 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552579 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-celebrity-info-response ([input] (response-get-celebrity-info-response nil input)) ([resultWrapper1552581 input] (clojure.core/let [rawinput1552580 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552582 {"Urls" (rawinput1552580 "Urls"), "Name" (rawinput1552580 "Name")}] (clojure.core/cond-> {} (letvar1552582 "Urls") (clojure.core/assoc :urls (deser-urls (clojure.core/get-in letvar1552582 ["Urls"]))) (letvar1552582 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1552582 ["Name"])))))))

(clojure.core/defn- response-describe-stream-processor-response ([input] (response-describe-stream-processor-response nil input)) ([resultWrapper1552584 input] (clojure.core/let [rawinput1552583 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552585 {"LastUpdateTimestamp" (rawinput1552583 "LastUpdateTimestamp"), "StatusMessage" (rawinput1552583 "StatusMessage"), "RoleArn" (rawinput1552583 "RoleArn"), "Status" (rawinput1552583 "Status"), "CreationTimestamp" (rawinput1552583 "CreationTimestamp"), "Input" (rawinput1552583 "Input"), "Settings" (rawinput1552583 "Settings"), "StreamProcessorArn" (rawinput1552583 "StreamProcessorArn"), "Output" (rawinput1552583 "Output"), "Name" (rawinput1552583 "Name")}] (clojure.core/cond-> {} (letvar1552585 "LastUpdateTimestamp") (clojure.core/assoc :last-update-timestamp (deser-date-time (clojure.core/get-in letvar1552585 ["LastUpdateTimestamp"]))) (letvar1552585 "StatusMessage") (clojure.core/assoc :status-message (deser-string (clojure.core/get-in letvar1552585 ["StatusMessage"]))) (letvar1552585 "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (clojure.core/get-in letvar1552585 ["RoleArn"]))) (letvar1552585 "Status") (clojure.core/assoc :status (deser-stream-processor-status (clojure.core/get-in letvar1552585 ["Status"]))) (letvar1552585 "CreationTimestamp") (clojure.core/assoc :creation-timestamp (deser-date-time (clojure.core/get-in letvar1552585 ["CreationTimestamp"]))) (letvar1552585 "Input") (clojure.core/assoc :input (deser-stream-processor-input (clojure.core/get-in letvar1552585 ["Input"]))) (letvar1552585 "Settings") (clojure.core/assoc :settings (deser-stream-processor-settings (clojure.core/get-in letvar1552585 ["Settings"]))) (letvar1552585 "StreamProcessorArn") (clojure.core/assoc :stream-processor-arn (deser-stream-processor-arn (clojure.core/get-in letvar1552585 ["StreamProcessorArn"]))) (letvar1552585 "Output") (clojure.core/assoc :output (deser-stream-processor-output (clojure.core/get-in letvar1552585 ["Output"]))) (letvar1552585 "Name") (clojure.core/assoc :name (deser-stream-processor-name (clojure.core/get-in letvar1552585 ["Name"])))))))

(clojure.core/defn- response-detect-moderation-labels-response ([input] (response-detect-moderation-labels-response nil input)) ([resultWrapper1552587 input] (clojure.core/let [rawinput1552586 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552588 {"ModerationLabels" (rawinput1552586 "ModerationLabels"), "ModerationModelVersion" (rawinput1552586 "ModerationModelVersion")}] (clojure.core/cond-> {} (letvar1552588 "ModerationLabels") (clojure.core/assoc :moderation-labels (deser-moderation-labels (clojure.core/get-in letvar1552588 ["ModerationLabels"]))) (letvar1552588 "ModerationModelVersion") (clojure.core/assoc :moderation-model-version (deser-string (clojure.core/get-in letvar1552588 ["ModerationModelVersion"])))))))

(clojure.core/defn- response-delete-collection-response ([input] (response-delete-collection-response nil input)) ([resultWrapper1552590 input] (clojure.core/let [rawinput1552589 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552591 {"StatusCode" (rawinput1552589 "StatusCode")}] (clojure.core/cond-> {} (letvar1552591 "StatusCode") (clojure.core/assoc :status-code (deser-u-integer (clojure.core/get-in letvar1552591 ["StatusCode"])))))))

(clojure.core/defn- response-start-face-detection-response ([input] (response-start-face-detection-response nil input)) ([resultWrapper1552593 input] (clojure.core/let [rawinput1552592 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552594 {"JobId" (rawinput1552592 "JobId")}] (clojure.core/cond-> {} (letvar1552594 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1552594 ["JobId"])))))))

(clojure.core/defn- response-list-collections-response ([input] (response-list-collections-response nil input)) ([resultWrapper1552596 input] (clojure.core/let [rawinput1552595 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552597 {"CollectionIds" (rawinput1552595 "CollectionIds"), "NextToken" (rawinput1552595 "NextToken"), "FaceModelVersions" (rawinput1552595 "FaceModelVersions")}] (clojure.core/cond-> {} (letvar1552597 "CollectionIds") (clojure.core/assoc :collection-ids (deser-collection-id-list (clojure.core/get-in letvar1552597 ["CollectionIds"]))) (letvar1552597 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1552597 ["NextToken"]))) (letvar1552597 "FaceModelVersions") (clojure.core/assoc :face-model-versions (deser-face-model-version-list (clojure.core/get-in letvar1552597 ["FaceModelVersions"])))))))

(clojure.core/defn- response-detect-faces-response ([input] (response-detect-faces-response nil input)) ([resultWrapper1552599 input] (clojure.core/let [rawinput1552598 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552600 {"FaceDetails" (rawinput1552598 "FaceDetails"), "OrientationCorrection" (rawinput1552598 "OrientationCorrection")}] (clojure.core/cond-> {} (letvar1552600 "FaceDetails") (clojure.core/assoc :face-details (deser-face-detail-list (clojure.core/get-in letvar1552600 ["FaceDetails"]))) (letvar1552600 "OrientationCorrection") (clojure.core/assoc :orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1552600 ["OrientationCorrection"])))))))

(clojure.core/defn- response-video-too-large-exception ([input] (response-video-too-large-exception nil input)) ([resultWrapper1552602 input] (clojure.core/let [rawinput1552601 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552603 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-content-moderation-response ([input] (response-get-content-moderation-response nil input)) ([resultWrapper1552605 input] (clojure.core/let [rawinput1552604 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552606 {"JobStatus" (rawinput1552604 "JobStatus"), "StatusMessage" (rawinput1552604 "StatusMessage"), "VideoMetadata" (rawinput1552604 "VideoMetadata"), "ModerationLabels" (rawinput1552604 "ModerationLabels"), "NextToken" (rawinput1552604 "NextToken"), "ModerationModelVersion" (rawinput1552604 "ModerationModelVersion")}] (clojure.core/cond-> {} (letvar1552606 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1552606 ["JobStatus"]))) (letvar1552606 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1552606 ["StatusMessage"]))) (letvar1552606 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1552606 ["VideoMetadata"]))) (letvar1552606 "ModerationLabels") (clojure.core/assoc :moderation-labels (deser-content-moderation-detections (clojure.core/get-in letvar1552606 ["ModerationLabels"]))) (letvar1552606 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1552606 ["NextToken"]))) (letvar1552606 "ModerationModelVersion") (clojure.core/assoc :moderation-model-version (deser-string (clojure.core/get-in letvar1552606 ["ModerationModelVersion"])))))))

(clojure.core/defn- response-start-celebrity-recognition-response ([input] (response-start-celebrity-recognition-response nil input)) ([resultWrapper1552608 input] (clojure.core/let [rawinput1552607 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552609 {"JobId" (rawinput1552607 "JobId")}] (clojure.core/cond-> {} (letvar1552609 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1552609 ["JobId"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper1552611 input] (clojure.core/let [rawinput1552610 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552612 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper1552614 input] (clojure.core/let [rawinput1552613 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552615 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-stream-processor-response ([input] (response-start-stream-processor-response nil input)) ([resultWrapper1552617 input] (clojure.core/let [rawinput1552616 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552618 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-image-too-large-exception ([input] (response-image-too-large-exception nil input)) ([resultWrapper1552620 input] (clojure.core/let [rawinput1552619 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552621 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1552623 input] (clojure.core/let [rawinput1552622 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552624 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-person-tracking-response ([input] (response-start-person-tracking-response nil input)) ([resultWrapper1552626 input] (clojure.core/let [rawinput1552625 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552627 {"JobId" (rawinput1552625 "JobId")}] (clojure.core/cond-> {} (letvar1552627 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1552627 ["JobId"])))))))

(clojure.core/defn- response-detect-labels-response ([input] (response-detect-labels-response nil input)) ([resultWrapper1552629 input] (clojure.core/let [rawinput1552628 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552630 {"Labels" (rawinput1552628 "Labels"), "OrientationCorrection" (rawinput1552628 "OrientationCorrection"), "LabelModelVersion" (rawinput1552628 "LabelModelVersion")}] (clojure.core/cond-> {} (letvar1552630 "Labels") (clojure.core/assoc :labels (deser-labels (clojure.core/get-in letvar1552630 ["Labels"]))) (letvar1552630 "OrientationCorrection") (clojure.core/assoc :orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1552630 ["OrientationCorrection"]))) (letvar1552630 "LabelModelVersion") (clojure.core/assoc :label-model-version (deser-string (clojure.core/get-in letvar1552630 ["LabelModelVersion"])))))))

(clojure.core/defn- response-describe-collection-response ([input] (response-describe-collection-response nil input)) ([resultWrapper1552632 input] (clojure.core/let [rawinput1552631 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552633 {"FaceCount" (rawinput1552631 "FaceCount"), "FaceModelVersion" (rawinput1552631 "FaceModelVersion"), "CollectionARN" (rawinput1552631 "CollectionARN"), "CreationTimestamp" (rawinput1552631 "CreationTimestamp")}] (clojure.core/cond-> {} (letvar1552633 "FaceCount") (clojure.core/assoc :face-count (deser-u-long (clojure.core/get-in letvar1552633 ["FaceCount"]))) (letvar1552633 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1552633 ["FaceModelVersion"]))) (letvar1552633 "CollectionARN") (clojure.core/assoc :collection-arn (deser-string (clojure.core/get-in letvar1552633 ["CollectionARN"]))) (letvar1552633 "CreationTimestamp") (clojure.core/assoc :creation-timestamp (deser-date-time (clojure.core/get-in letvar1552633 ["CreationTimestamp"])))))))

(clojure.core/defn- response-invalid-pagination-token-exception ([input] (response-invalid-pagination-token-exception nil input)) ([resultWrapper1552635 input] (clojure.core/let [rawinput1552634 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552636 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-provisioned-throughput-exceeded-exception ([input] (response-provisioned-throughput-exceeded-exception nil input)) ([resultWrapper1552638 input] (clojure.core/let [rawinput1552637 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1552639 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-match-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face-match))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-attributes #{:default :all "DEFAULT" "ALL"})

(clojure.spec.alpha/def :portkey.aws.rekognition.person-detail/index (clojure.spec.alpha/and :portkey.aws.rekognition/person-index))
(clojure.spec.alpha/def :portkey.aws.rekognition.person-detail/face (clojure.spec.alpha/and :portkey.aws.rekognition/face-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition/person-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.person-detail/index :portkey.aws.rekognition/bounding-box :portkey.aws.rekognition.person-detail/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.sunglasses/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.sunglasses/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/sunglasses (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.sunglasses/value :portkey.aws.rekognition.sunglasses/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.list-faces-response/faces (clojure.spec.alpha/and :portkey.aws.rekognition/face-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-faces-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-faces-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.list-faces-response/faces :portkey.aws.rekognition.list-faces-response/next-token :portkey.aws.rekognition.list-faces-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.create-stream-processor-request/input (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-input))
(clojure.spec.alpha/def :portkey.aws.rekognition.create-stream-processor-request/output (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-output))
(clojure.spec.alpha/def :portkey.aws.rekognition.create-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.create-stream-processor-request/settings (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-settings))
(clojure.spec.alpha/def :portkey.aws.rekognition/create-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.create-stream-processor-request/input :portkey.aws.rekognition.create-stream-processor-request/output :portkey.aws.rekognition.create-stream-processor-request/name :portkey.aws.rekognition.create-stream-processor-request/settings :portkey.aws.rekognition/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.stream-processor/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.stream-processor/status (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-status))
(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.stream-processor/name :portkey.aws.rekognition.stream-processor/status]))

(clojure.spec.alpha/def :portkey.aws.rekognition.start-face-search-request/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/start-face-search-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video :portkey.aws.rekognition/collection-id] :opt-un [:portkey.aws.rekognition/client-request-token :portkey.aws.rekognition.start-face-search-request/face-match-threshold :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition/stop-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.text-detection/detected-text (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.text-detection/type (clojure.spec.alpha/and :portkey.aws.rekognition/text-types))
(clojure.spec.alpha/def :portkey.aws.rekognition.text-detection/id (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.text-detection/parent-id (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.text-detection/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/text-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.text-detection/detected-text :portkey.aws.rekognition.text-detection/type :portkey.aws.rekognition.text-detection/id :portkey.aws.rekognition.text-detection/parent-id :portkey.aws.rekognition.text-detection/confidence :portkey.aws.rekognition/geometry]))

(clojure.spec.alpha/def :portkey.aws.rekognition/urls (clojure.spec.alpha/coll-of :portkey.aws.rekognition/url))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/stream-processor))

(clojure.spec.alpha/def :portkey.aws.rekognition/invalid-image-format-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.parent/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/parent (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.parent/name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.face-detection/face (clojure.spec.alpha/and :portkey.aws.rekognition/face-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition/face-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition.face-detection/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.recognize-celebrities-response/celebrity-faces (clojure.spec.alpha/and :portkey.aws.rekognition/celebrity-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.recognize-celebrities-response/unrecognized-faces (clojure.spec.alpha/and :portkey.aws.rekognition/compared-face-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/recognize-celebrities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.recognize-celebrities-response/celebrity-faces :portkey.aws.rekognition.recognize-celebrities-response/unrecognized-faces :portkey.aws.rekognition/orientation-correction]))

(clojure.spec.alpha/def :portkey.aws.rekognition/person-index clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rekognition.list-stream-processors-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-stream-processors-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.list-stream-processors-request/next-token :portkey.aws.rekognition/max-results]))

(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition/describe-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.describe-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-_]+$" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-response/labels (clojure.spec.alpha/and :portkey.aws.rekognition/label-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-response/label-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-label-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-label-detection-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-label-detection-response/next-token :portkey.aws.rekognition.get-label-detection-response/labels :portkey.aws.rekognition.get-label-detection-response/label-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition/landmarks (clojure.spec.alpha/coll-of :portkey.aws.rekognition/landmark))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-label-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition.delete-faces-response/deleted-faces (clojure.spec.alpha/and :portkey.aws.rekognition/face-id-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/delete-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.delete-faces-response/deleted-faces]))

(clojure.spec.alpha/def :portkey.aws.rekognition/s-3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-person-tracking-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-person-tracking-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-person-tracking-response/persons (clojure.spec.alpha/and :portkey.aws.rekognition/person-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-person-tracking-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-person-tracking-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-person-tracking-response/next-token :portkey.aws.rekognition.get-person-tracking-response/persons]))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/kinesis-data-stream]))

(clojure.spec.alpha/def :portkey.aws.rekognition/page-size (clojure.spec.alpha/int-in 0 4096))

(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-response/source-image-face (clojure.spec.alpha/and :portkey.aws.rekognition/compared-source-image-face))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-response/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition/compare-faces-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-response/unmatched-faces (clojure.spec.alpha/and :portkey.aws.rekognition/compare-faces-unmatch-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-response/source-image-orientation-correction (clojure.spec.alpha/and :portkey.aws.rekognition/orientation-correction))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-response/target-image-orientation-correction (clojure.spec.alpha/and :portkey.aws.rekognition/orientation-correction))
(clojure.spec.alpha/def :portkey.aws.rekognition/compare-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.compare-faces-response/source-image-face :portkey.aws.rekognition.compare-faces-response/face-matches :portkey.aws.rekognition.compare-faces-response/unmatched-faces :portkey.aws.rekognition.compare-faces-response/source-image-orientation-correction :portkey.aws.rekognition.compare-faces-response/target-image-orientation-correction]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-id-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face-id :min-count 1 :max-count 4096))

(clojure.spec.alpha/def :portkey.aws.rekognition.bounding-box/width (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.bounding-box/height (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.bounding-box/left (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.bounding-box/top (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition/bounding-box (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.bounding-box/width :portkey.aws.rekognition.bounding-box/height :portkey.aws.rekognition.bounding-box/left :portkey.aws.rekognition.bounding-box/top]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.smile/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.smile/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/smile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.smile/value :portkey.aws.rekognition.smile/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/detect-text-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/image] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.age-range/low (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.age-range/high (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition/age-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.age-range/low :portkey.aws.rekognition.age-range/high]))

(clojure.spec.alpha/def :portkey.aws.rekognition/person-tracking-sort-by #{"INDEX" "TIMESTAMP" :index :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition/image-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/invalid-s-3-object-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-search-sort-by #{"INDEX" "TIMESTAMP" :index :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition.detect-moderation-labels-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/detect-moderation-labels-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/image] :opt-un [:portkey.aws.rekognition.detect-moderation-labels-request/min-confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-response/searched-face-id (clojure.spec.alpha/and :portkey.aws.rekognition/face-id))
(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-response/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition/face-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/search-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.search-faces-response/searched-face-id :portkey.aws.rekognition.search-faces-response/face-matches :portkey.aws.rekognition.search-faces-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-by-image-request/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/search-faces-by-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id :portkey.aws.rekognition/image] :opt-un [:portkey.aws.rekognition/max-faces :portkey.aws.rekognition.search-faces-by-image-request/face-match-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition.landmark/type (clojure.spec.alpha/and :portkey.aws.rekognition/landmark-type))
(clojure.spec.alpha/def :portkey.aws.rekognition.landmark/x (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.landmark/y (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition/landmark (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.landmark/type :portkey.aws.rekognition.landmark/x :portkey.aws.rekognition.landmark/y]))

(clojure.spec.alpha/def :portkey.aws.rekognition/video (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/s-3-object]))

(clojure.spec.alpha/def :portkey.aws.rekognition/status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rekognition/emotions (clojure.spec.alpha/coll-of :portkey.aws.rekognition/emotion))

(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity/id (clojure.spec.alpha/and :portkey.aws.rekognition/rekognition-unique-id))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity/face (clojure.spec.alpha/and :portkey.aws.rekognition/compared-face))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity/match-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/urls :portkey.aws.rekognition.celebrity/name :portkey.aws.rekognition.celebrity/id :portkey.aws.rekognition.celebrity/face :portkey.aws.rekognition.celebrity/match-confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-face-search-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition/geometry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/bounding-box :portkey.aws.rekognition/polygon]))

(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity-detail/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity-detail/id (clojure.spec.alpha/and :portkey.aws.rekognition/rekognition-unique-id))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity-detail/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity-detail/face (clojure.spec.alpha/and :portkey.aws.rekognition/face-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/urls :portkey.aws.rekognition.celebrity-detail/name :portkey.aws.rekognition.celebrity-detail/id :portkey.aws.rekognition.celebrity-detail/confidence :portkey.aws.rekognition/bounding-box :portkey.aws.rekognition.celebrity-detail/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-detection-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-detection-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-detection-response/faces (clojure.spec.alpha/and :portkey.aws.rekognition/face-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-face-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-face-detection-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-face-detection-response/next-token :portkey.aws.rekognition.get-face-detection-response/faces]))

(clojure.spec.alpha/def :portkey.aws.rekognition.emotion/type (clojure.spec.alpha/and :portkey.aws.rekognition/emotion-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.emotion/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/emotion (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.emotion/type :portkey.aws.rekognition.emotion/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/face :portkey.aws.rekognition/face-detail]))

(clojure.spec.alpha/def :portkey.aws.rekognition.eye-open/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.eye-open/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/eye-open (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.eye-open/value :portkey.aws.rekognition.eye-open/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.detect-text-response/text-detections (clojure.spec.alpha/and :portkey.aws.rekognition/text-detection-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/detect-text-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.detect-text-response/text-detections]))

(clojure.spec.alpha/def :portkey.aws.rekognition/delete-collection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity-recognitions (clojure.spec.alpha/coll-of :portkey.aws.rekognition/celebrity-recognition))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-person-tracking-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video] :opt-un [:portkey.aws.rekognition/client-request-token :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.mustache/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.mustache/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/mustache (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.mustache/value :portkey.aws.rekognition.mustache/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-model-version-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/string))

(clojure.spec.alpha/def :portkey.aws.rekognition/job-tag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 256)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-:]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/collection-id-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/collection-id))

(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-by-image-response/searched-face-bounding-box (clojure.spec.alpha/and :portkey.aws.rekognition/bounding-box))
(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-by-image-response/searched-face-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-by-image-response/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition/face-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-by-image-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/search-faces-by-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.search-faces-by-image-response/searched-face-bounding-box :portkey.aws.rekognition.search-faces-by-image-response/searched-face-confidence :portkey.aws.rekognition.search-faces-by-image-response/face-matches :portkey.aws.rekognition.search-faces-by-image-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition/compare-faces-unmatch-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/compared-face))

(clojure.spec.alpha/def :portkey.aws.rekognition/label-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition/label]))

(clojure.spec.alpha/def :portkey.aws.rekognition/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.rekognition/s-3-object-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.rekognition/recognize-celebrities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/image] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.start-content-moderation-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/start-content-moderation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video] :opt-un [:portkey.aws.rekognition.start-content-moderation-request/min-confidence :portkey.aws.rekognition/client-request-token :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-search-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-search-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-search-response/persons (clojure.spec.alpha/and :portkey.aws.rekognition/person-matches))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-face-search-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-face-search-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition.get-face-search-response/next-token :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-face-search-response/persons]))

(clojure.spec.alpha/def :portkey.aws.rekognition/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.kinesis-data-stream/arn (clojure.spec.alpha/and :portkey.aws.rekognition/kinesis-data-arn))
(clojure.spec.alpha/def :portkey.aws.rekognition/kinesis-data-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.kinesis-data-stream/arn]))

(clojure.spec.alpha/def :portkey.aws.rekognition/text-detection-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/text-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.face-match/similarity (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/face-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.face-match/similarity :portkey.aws.rekognition/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition/image-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.rekognition/u-integer (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-info-request/id (clojure.spec.alpha/and :portkey.aws.rekognition/rekognition-unique-id))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-celebrity-info-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.get-celebrity-info-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.gender/value (clojure.spec.alpha/and :portkey.aws.rekognition/gender-type))
(clojure.spec.alpha/def :portkey.aws.rekognition.gender/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/gender (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.gender/value :portkey.aws.rekognition.gender/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.compared-source-image-face/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/compared-source-image-face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/bounding-box :portkey.aws.rekognition.compared-source-image-face/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-content-moderation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition/unindexed-face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/reasons :portkey.aws.rekognition/face-detail]))

(clojure.spec.alpha/def :portkey.aws.rekognition/delete-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/percent clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.rekognition.face-search-settings/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/face-search-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/collection-id :portkey.aws.rekognition.face-search-settings/face-match-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition/unindexed-faces (clojure.spec.alpha/coll-of :portkey.aws.rekognition/unindexed-face))

(clojure.spec.alpha/def :portkey.aws.rekognition/create-collection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/attribute #{:default :all "DEFAULT" "ALL"})

(clojure.spec.alpha/def :portkey.aws.rekognition.index-faces-response/face-records (clojure.spec.alpha/and :portkey.aws.rekognition/face-record-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.index-faces-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/index-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.index-faces-response/face-records :portkey.aws.rekognition/orientation-correction :portkey.aws.rekognition.index-faces-response/face-model-version :portkey.aws.rekognition/unindexed-faces]))

(clojure.spec.alpha/def :portkey.aws.rekognition.pose/roll (clojure.spec.alpha/and :portkey.aws.rekognition/degree))
(clojure.spec.alpha/def :portkey.aws.rekognition.pose/yaw (clojure.spec.alpha/and :portkey.aws.rekognition/degree))
(clojure.spec.alpha/def :portkey.aws.rekognition.pose/pitch (clojure.spec.alpha/and :portkey.aws.rekognition/degree))
(clojure.spec.alpha/def :portkey.aws.rekognition/pose (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.pose/roll :portkey.aws.rekognition.pose/yaw :portkey.aws.rekognition.pose/pitch]))

(clojure.spec.alpha/def :portkey.aws.rekognition.person-match/person (clojure.spec.alpha/and :portkey.aws.rekognition/person-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition.person-match/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition/face-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/person-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition.person-match/person :portkey.aws.rekognition.person-match/face-matches]))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-recognition-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-recognition-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition/celebrity-recognition-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-celebrity-recognition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-celebrity-recognition-request/next-token :portkey.aws.rekognition.get-celebrity-recognition-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.create-collection-response/status-code (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.create-collection-response/collection-arn (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.create-collection-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/create-collection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.create-collection-response/status-code :portkey.aws.rekognition.create-collection-response/collection-arn :portkey.aws.rekognition.create-collection-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity-recognition-sort-by #{"TIMESTAMP" "ID" :id :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition/attributes (clojure.spec.alpha/coll-of :portkey.aws.rekognition/attribute))

(clojure.spec.alpha/def :portkey.aws.rekognition.face/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/face-id :portkey.aws.rekognition/bounding-box :portkey.aws.rekognition/image-id :portkey.aws.rekognition/external-image-id :portkey.aws.rekognition.face/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.kinesis-video-stream/arn (clojure.spec.alpha/and :portkey.aws.rekognition/kinesis-video-arn))
(clojure.spec.alpha/def :portkey.aws.rekognition/kinesis-video-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.kinesis-video-stream/arn]))

(clojure.spec.alpha/def :portkey.aws.rekognition.mouth-open/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.mouth-open/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/mouth-open (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.mouth-open/value :portkey.aws.rekognition.mouth-open/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.list-collections-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-collections-request/max-results (clojure.spec.alpha/and :portkey.aws.rekognition/page-size))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-collections-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.list-collections-request/next-token :portkey.aws.rekognition.list-collections-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.rekognition.moderation-label/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.moderation-label/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.moderation-label/parent-name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/moderation-label (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.moderation-label/confidence :portkey.aws.rekognition.moderation-label/name :portkey.aws.rekognition.moderation-label/parent-name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.person-detection/person (clojure.spec.alpha/and :portkey.aws.rekognition/person-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition/person-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition.person-detection/person]))

(clojure.spec.alpha/def :portkey.aws.rekognition.index-faces-request/detection-attributes (clojure.spec.alpha/and :portkey.aws.rekognition/attributes))
(clojure.spec.alpha/def :portkey.aws.rekognition.index-faces-request/max-faces (clojure.spec.alpha/and :portkey.aws.rekognition/max-faces-to-index))
(clojure.spec.alpha/def :portkey.aws.rekognition/index-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id :portkey.aws.rekognition/image] :opt-un [:portkey.aws.rekognition/external-image-id :portkey.aws.rekognition.index-faces-request/detection-attributes :portkey.aws.rekognition.index-faces-request/max-faces :portkey.aws.rekognition/quality-filter]))

(clojure.spec.alpha/def :portkey.aws.rekognition.delete-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition/delete-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.delete-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/detect-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/image] :opt-un [:portkey.aws.rekognition/attributes]))

(clojure.spec.alpha/def :portkey.aws.rekognition/moderation-labels (clojure.spec.alpha/coll-of :portkey.aws.rekognition/moderation-label))

(clojure.spec.alpha/def :portkey.aws.rekognition/max-faces (clojure.spec.alpha/int-in 1 4096))

(clojure.spec.alpha/def :portkey.aws.rekognition/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/create-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/stream-processor-arn]))

(clojure.spec.alpha/def :portkey.aws.rekognition/person-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition/person-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-celebrity-recognition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video] :opt-un [:portkey.aws.rekognition/client-request-token :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rekognition.list-stream-processors-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-stream-processors-response/stream-processors (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-stream-processors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.list-stream-processors-response/next-token :portkey.aws.rekognition.list-stream-processors-response/stream-processors]))

(clojure.spec.alpha/def :portkey.aws.rekognition.stop-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition/stop-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.stop-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/kinesis-video-stream]))

(clojure.spec.alpha/def :portkey.aws.rekognition/content-moderation-sort-by #{"TIMESTAMP" "NAME" :name :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition/labels (clojure.spec.alpha/coll-of :portkey.aws.rekognition/label))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-recognition-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-recognition-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-recognition-response/celebrities (clojure.spec.alpha/and :portkey.aws.rekognition/celebrity-recognitions))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-celebrity-recognition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-celebrity-recognition-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-celebrity-recognition-response/next-token :portkey.aws.rekognition.get-celebrity-recognition-response/celebrities]))

(clojure.spec.alpha/def :portkey.aws.rekognition.stream-processor-settings/face-search (clojure.spec.alpha/and :portkey.aws.rekognition/face-search-settings))
(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.stream-processor-settings/face-search]))

(clojure.spec.alpha/def :portkey.aws.rekognition/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/person-matches (clojure.spec.alpha/coll-of :portkey.aws.rekognition/person-match))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.point/x (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.point/y (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition/point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.point/x :portkey.aws.rekognition.point/y]))

(clojure.spec.alpha/def :portkey.aws.rekognition/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rekognition/label-detection-sort-by #{"TIMESTAMP" "NAME" :name :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition/landmark-type #{:eye-left :mouth-down :right-eye-left :right-eye-brow-up "rightEyeBrowUp" :upper-jawline-left :right-eye-brow-right "leftEyeRight" "rightEyeUp" "leftEyeLeft" "eyeRight" "leftEyeBrowUp" "rightEyeRight" :left-pupil "rightEyeLeft" "leftEyeUp" :left-eye-brow-right "mouthDown" "upperJawlineRight" :mouth-right :mid-jawline-left :right-eye-down :right-pupil :mouth-up "chinBottom" :left-eye-brow-left "upperJawlineLeft" :nose-left :left-eye-brow-up "midJawlineRight" "rightPupil" "leftPupil" "noseRight" :upper-jawline-right "rightEyeBrowLeft" :right-eye-brow-left "nose" "midJawlineLeft" "eyeLeft" "mouthUp" :mouth-left "mouthLeft" "rightEyeBrowRight" "mouthRight" :right-eye-up :left-eye-left "noseLeft" "leftEyeBrowLeft" :mid-jawline-right :nose :chin-bottom :left-eye-up :left-eye-down :left-eye-right "leftEyeBrowRight" :eye-right :right-eye-right :nose-right "leftEyeDown" "rightEyeDown"})

(clojure.spec.alpha/def :portkey.aws.rekognition/describe-collection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-request/source-image (clojure.spec.alpha/and :portkey.aws.rekognition/image))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-request/target-image (clojure.spec.alpha/and :portkey.aws.rekognition/image))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-request/similarity-threshold (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/compare-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.compare-faces-request/source-image :portkey.aws.rekognition.compare-faces-request/target-image] :opt-un [:portkey.aws.rekognition.compare-faces-request/similarity-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition/sns-topic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(^arn:aws:sns:.*:\w{12}:.+$)" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.search-faces-request/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/search-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id :portkey.aws.rekognition/face-id] :opt-un [:portkey.aws.rekognition/max-faces :portkey.aws.rekognition.search-faces-request/face-match-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition/compare-faces-match-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/compare-faces-match))

(clojure.spec.alpha/def :portkey.aws.rekognition/gender-type #{:female :male "Male" "Female"})

(clojure.spec.alpha/def :portkey.aws.rekognition.get-person-tracking-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-person-tracking-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition/person-tracking-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-person-tracking-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-person-tracking-request/next-token :portkey.aws.rekognition.get-person-tracking-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-celebrity-info-response/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-celebrity-info-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/urls :portkey.aws.rekognition.get-celebrity-info-response/name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/last-update-timestamp (clojure.spec.alpha/and :portkey.aws.rekognition/date-time))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/status-message (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/status (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.rekognition/date-time))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/input (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-input))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/settings (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-settings))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/output (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-output))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-stream-processor-response/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition/describe-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.describe-stream-processor-response/last-update-timestamp :portkey.aws.rekognition.describe-stream-processor-response/status-message :portkey.aws.rekognition/role-arn :portkey.aws.rekognition.describe-stream-processor-response/status :portkey.aws.rekognition.describe-stream-processor-response/creation-timestamp :portkey.aws.rekognition.describe-stream-processor-response/input :portkey.aws.rekognition.describe-stream-processor-response/settings :portkey.aws.rekognition/stream-processor-arn :portkey.aws.rekognition.describe-stream-processor-response/output :portkey.aws.rekognition.describe-stream-processor-response/name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.label/name (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.label/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/label (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.label/name :portkey.aws.rekognition.label/confidence :portkey.aws.rekognition/instances :portkey.aws.rekognition/parents]))

(clojure.spec.alpha/def :portkey.aws.rekognition/u-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rekognition/kinesis-data-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(^arn:([a-z\d-]+):kinesis:([a-z\d-]+):\d{12}:.+$)" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.detect-moderation-labels-response/moderation-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/detect-moderation-labels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/moderation-labels :portkey.aws.rekognition.detect-moderation-labels-response/moderation-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.face-detail/eyes-open (clojure.spec.alpha/and :portkey.aws.rekognition/eye-open))
(clojure.spec.alpha/def :portkey.aws.rekognition.face-detail/quality (clojure.spec.alpha/and :portkey.aws.rekognition/image-quality))
(clojure.spec.alpha/def :portkey.aws.rekognition.face-detail/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/face-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/sunglasses :portkey.aws.rekognition/landmarks :portkey.aws.rekognition/bounding-box :portkey.aws.rekognition/smile :portkey.aws.rekognition/age-range :portkey.aws.rekognition/emotions :portkey.aws.rekognition/mustache :portkey.aws.rekognition.face-detail/eyes-open :portkey.aws.rekognition/gender :portkey.aws.rekognition/pose :portkey.aws.rekognition.face-detail/quality :portkey.aws.rekognition/mouth-open :portkey.aws.rekognition/eyeglasses :portkey.aws.rekognition.face-detail/confidence :portkey.aws.rekognition/beard]))

(clojure.spec.alpha/def :portkey.aws.rekognition/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 3 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[0-9A-Za-z\.\-_]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.delete-faces-request/face-ids (clojure.spec.alpha/and :portkey.aws.rekognition/face-id-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/delete-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id :portkey.aws.rekognition.delete-faces-request/face-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.detect-labels-request/max-labels (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.detect-labels-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/detect-labels-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/image] :opt-un [:portkey.aws.rekognition.detect-labels-request/max-labels :portkey.aws.rekognition.detect-labels-request/min-confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.delete-collection-response/status-code (clojure.spec.alpha/and :portkey.aws.rekognition/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition/delete-collection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.delete-collection-response/status-code]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-face-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition.list-collections-response/collection-ids (clojure.spec.alpha/and :portkey.aws.rekognition/collection-id-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-collections-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-collections-response/face-model-versions (clojure.spec.alpha/and :portkey.aws.rekognition/face-model-version-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-collections-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.list-collections-response/collection-ids :portkey.aws.rekognition.list-collections-response/next-token :portkey.aws.rekognition.list-collections-response/face-model-versions]))

(clojure.spec.alpha/def :portkey.aws.rekognition.detect-faces-response/face-details (clojure.spec.alpha/and :portkey.aws.rekognition/face-detail-list))
(clojure.spec.alpha/def :portkey.aws.rekognition/detect-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.detect-faces-response/face-details :portkey.aws.rekognition/orientation-correction]))

(clojure.spec.alpha/def :portkey.aws.rekognition/kinesis-video-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"(^arn:([a-z\d-]+):kinesisvideo:([a-z\d-]+):\d{12}:.+$)" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-label-detection-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition/label-detection-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-label-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-label-detection-request/next-token :portkey.aws.rekognition.get-label-detection-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition/notification-channel (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/sns-topic-arn :portkey.aws.rekognition/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/degree clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.rekognition/rekognition-unique-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[0-9A-Za-z]*" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-status #{:starting :running :stopping :stopped "STOPPED" "STARTING" "FAILED" "STOPPING" :failed "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.rekognition/timestamp clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rekognition/video-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/label-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition/label-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition/content-moderation-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-content-moderation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-content-moderation-request/next-token :portkey.aws.rekognition.get-content-moderation-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-face-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video] :opt-un [:portkey.aws.rekognition/client-request-token :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/face-attributes :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition/text-types #{"WORD" "LINE" :line :word})

(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-response/moderation-labels (clojure.spec.alpha/and :portkey.aws.rekognition/content-moderation-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-content-moderation-response/moderation-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-content-moderation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.get-content-moderation-response/job-status :portkey.aws.rekognition/status-message :portkey.aws.rekognition/video-metadata :portkey.aws.rekognition.get-content-moderation-response/moderation-labels :portkey.aws.rekognition.get-content-moderation-response/next-token :portkey.aws.rekognition.get-content-moderation-response/moderation-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition/reasons (clojure.spec.alpha/coll-of :portkey.aws.rekognition/reason))

(clojure.spec.alpha/def :portkey.aws.rekognition/content-moderation-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition/content-moderation-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-search-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-search-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition/face-search-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-face-search-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-face-search-request/next-token :portkey.aws.rekognition.get-face-search-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.image-quality/brightness (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.image-quality/sharpness (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition/image-quality (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.image-quality/brightness :portkey.aws.rekognition.image-quality/sharpness]))

(clojure.spec.alpha/def :portkey.aws.rekognition/max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.rekognition/reason #{"EXTREME_POSE" "LOW_BRIGHTNESS" :low-confidence :exceeds-max-faces :low-sharpness "LOW_CONFIDENCE" :extreme-pose "SMALL_BOUNDING_BOX" "EXCEEDS_MAX_FACES" "LOW_SHARPNESS" :small-bounding-box :low-brightness})

(clojure.spec.alpha/def :portkey.aws.rekognition/start-celebrity-recognition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-detail-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face-detail))

(clojure.spec.alpha/def :portkey.aws.rekognition/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/orientation-correction #{:rotate-90 "ROTATE_0" "ROTATE_180" "ROTATE_90" :rotate-180 :rotate-0 "ROTATE_270" :rotate-270})

(clojure.spec.alpha/def :portkey.aws.rekognition.instance/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/bounding-box :portkey.aws.rekognition.instance/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/compared-face-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/compared-face))

(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/codec (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/duration-millis (clojure.spec.alpha/and :portkey.aws.rekognition/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/format (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/frame-rate (clojure.spec.alpha/and :portkey.aws.rekognition/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/frame-height (clojure.spec.alpha/and :portkey.aws.rekognition/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition.video-metadata/frame-width (clojure.spec.alpha/and :portkey.aws.rekognition/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition/video-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.video-metadata/codec :portkey.aws.rekognition.video-metadata/duration-millis :portkey.aws.rekognition.video-metadata/format :portkey.aws.rekognition.video-metadata/frame-rate :portkey.aws.rekognition.video-metadata/frame-height :portkey.aws.rekognition.video-metadata/frame-width]))

(clojure.spec.alpha/def :portkey.aws.rekognition/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/emotion-name #{"UNKNOWN" :disgusted "ANGRY" :sad :calm :unknown :happy :confused "HAPPY" "CONFUSED" "DISGUSTED" "CALM" "SAD" "SURPRISED" :surprised :angry})

(clojure.spec.alpha/def :portkey.aws.rekognition.image/bytes (clojure.spec.alpha/and :portkey.aws.rekognition/image-blob))
(clojure.spec.alpha/def :portkey.aws.rekognition/image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.image/bytes :portkey.aws.rekognition/s-3-object]))

(clojure.spec.alpha/def :portkey.aws.rekognition/polygon (clojure.spec.alpha/coll-of :portkey.aws.rekognition/point))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/max-faces-to-index (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.rekognition.start-label-detection-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/start-label-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/video] :opt-un [:portkey.aws.rekognition/client-request-token :portkey.aws.rekognition.start-label-detection-request/min-confidence :portkey.aws.rekognition/notification-channel :portkey.aws.rekognition/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.start-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition/start-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.start-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-match/similarity (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.compare-faces-match/face (clojure.spec.alpha/and :portkey.aws.rekognition/compared-face))
(clojure.spec.alpha/def :portkey.aws.rekognition/compare-faces-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.compare-faces-match/similarity :portkey.aws.rekognition.compare-faces-match/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.eyeglasses/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.eyeglasses/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/eyeglasses (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.eyeglasses/value :portkey.aws.rekognition.eyeglasses/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/image-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/stream-processor-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 128)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.celebrity-recognition/celebrity (clojure.spec.alpha/and :portkey.aws.rekognition/celebrity-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity-recognition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition.celebrity-recognition/celebrity]))

(clojure.spec.alpha/def :portkey.aws.rekognition/start-person-tracking-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition/quality-filter #{"AUTO" "NONE" :auto :none})

(clojure.spec.alpha/def :portkey.aws.rekognition/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.rekognition/parents (clojure.spec.alpha/coll-of :portkey.aws.rekognition/parent))

(clojure.spec.alpha/def :portkey.aws.rekognition/external-image-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-:]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition/instances (clojure.spec.alpha/coll-of :portkey.aws.rekognition/instance))

(clojure.spec.alpha/def :portkey.aws.rekognition.compared-face/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.compared-face/quality (clojure.spec.alpha/and :portkey.aws.rekognition/image-quality))
(clojure.spec.alpha/def :portkey.aws.rekognition/compared-face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/bounding-box :portkey.aws.rekognition.compared-face/confidence :portkey.aws.rekognition/landmarks :portkey.aws.rekognition/pose :portkey.aws.rekognition.compared-face/quality]))

(clojure.spec.alpha/def :portkey.aws.rekognition/face-record-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/face-record))

(clojure.spec.alpha/def :portkey.aws.rekognition/video-job-status #{"IN_PROGRESS" :in-progress "SUCCEEDED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.rekognition/celebrity-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition/celebrity))

(clojure.spec.alpha/def :portkey.aws.rekognition.s-3-object/bucket (clojure.spec.alpha/and :portkey.aws.rekognition/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.rekognition.s-3-object/name (clojure.spec.alpha/and :portkey.aws.rekognition/s-3-object-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.s-3-object/version (clojure.spec.alpha/and :portkey.aws.rekognition/s-3-object-version))
(clojure.spec.alpha/def :portkey.aws.rekognition/s-3-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.s-3-object/bucket :portkey.aws.rekognition.s-3-object/name :portkey.aws.rekognition.s-3-object/version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.detect-labels-response/label-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition/detect-labels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/labels :portkey.aws.rekognition/orientation-correction :portkey.aws.rekognition.detect-labels-response/label-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.describe-collection-response/face-count (clojure.spec.alpha/and :portkey.aws.rekognition/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-collection-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-collection-response/collection-arn (clojure.spec.alpha/and :portkey.aws.rekognition/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.describe-collection-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.rekognition/date-time))
(clojure.spec.alpha/def :portkey.aws.rekognition/describe-collection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.describe-collection-response/face-count :portkey.aws.rekognition.describe-collection-response/face-model-version :portkey.aws.rekognition.describe-collection-response/collection-arn :portkey.aws.rekognition.describe-collection-response/creation-timestamp]))

(clojure.spec.alpha/def :portkey.aws.rekognition/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.rekognition/collection-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 255)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-]+" s__21078__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.list-faces-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.list-faces-request/max-results (clojure.spec.alpha/and :portkey.aws.rekognition/page-size))
(clojure.spec.alpha/def :portkey.aws.rekognition/list-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/collection-id] :opt-un [:portkey.aws.rekognition.list-faces-request/next-token :portkey.aws.rekognition.list-faces-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.rekognition/invalid-pagination-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition/provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.beard/value (clojure.spec.alpha/and :portkey.aws.rekognition/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.beard/confidence (clojure.spec.alpha/and :portkey.aws.rekognition/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition/beard (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.beard/value :portkey.aws.rekognition.beard/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.rekognition.get-face-detection-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition/get-face-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition/job-id] :opt-un [:portkey.aws.rekognition/max-results :portkey.aws.rekognition.get-face-detection-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.rekognition/content-moderation-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition/timestamp :portkey.aws.rekognition/moderation-label]))

(clojure.spec.alpha/def :portkey.aws.rekognition/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__21076__auto__] (clojure.core/<= 1 (clojure.core/count s__21076__auto__))) (clojure.core/fn [s__21077__auto__] (clojure.core/< (clojure.core/count s__21077__auto__) 64)) (clojure.core/fn [s__21078__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-_]+$" s__21078__auto__))))

(clojure.core/defn get-label-detection "Gets the label detection results of a Amazon Rekognition Video analysis started\nby StartLabelDetection.\n The label detection operation is started by a call to StartLabelDetection which\nreturns a job identifier (JobId). When the label detection operation finishes,\nAmazon Rekognition publishes a completion status to the Amazon Simple\nNotification Service topic registered in the initial call to\nStartlabelDetection. To get the results of the label detection operation, first\ncheck that the status value published to the Amazon SNS topic is SUCCEEDED. If\nso, call GetLabelDetection and pass the job identifier (JobId) from the initial\ncall to StartLabelDetection.\n GetLabelDetection returns an array of detected labels (Labels) sorted by the\ntime the labels were detected. You can also sort by the label name by specifying\nNAME for the SortBy input parameter.\n The labels returned include the label name, the percentage confidence in the\naccuracy of the detected label, and the time the label was detected in the\nvideo.\n The returned labels also include bounding box information for common objects, a\nhierarchical taxonomy of detected labels, and the version of the label model\nused for detection.\n Use MaxResults parameter to limit the number of labels returned. If there are\nmore results than specified in MaxResults, the value of NextToken in the\noperation response contains a pagination token for getting the next set of\nresults. To get the next page of results, call GetlabelDetection and populate\nthe NextToken request parameter with the token value returned from the previous\ncall to GetLabelDetection." ([get-label-detection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-label-detection-request get-label-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-label-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-label-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLabelDetection", :http.request.configuration/output-deser-fn response-get-label-detection-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-label-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-label-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-label-detection-response))

(clojure.core/defn stop-stream-processor "Stops a running stream processor that was created by CreateStreamProcessor." ([stop-stream-processor-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-stop-stream-processor-request stop-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/stop-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/stop-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopStreamProcessor", :http.request.configuration/output-deser-fn response-stop-stream-processor-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ResourceInUseException" :portkey.aws.rekognition/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef stop-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/stop-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/stop-stream-processor-response))

(clojure.core/defn start-content-moderation " Starts asynchronous detection of explicit or suggestive adult content in a\nstored video.\n Amazon Rekognition Video can moderate content in a video stored in an Amazon S3\nbucket. Use Video to specify the bucket name and the filename of the video.\nStartContentModeration returns a job identifier (JobId) which you use to get the\nresults of the analysis. When content moderation analysis is finished, Amazon\nRekognition Video publishes a completion status to the Amazon Simple\nNotification Service topic that you specify in NotificationChannel.\n To get the results of the content moderation analysis, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetContentModeration and pass the job identifier (JobId) from the initial call\nto StartContentModeration.\n For more information, see Detecting Unsafe Content in the Amazon Rekognition\nDeveloper Guide." ([start-content-moderation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-content-moderation-request start-content-moderation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-content-moderation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-content-moderation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartContentModeration", :http.request.configuration/output-deser-fn response-start-content-moderation-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-content-moderation :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-content-moderation-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-content-moderation-response))

(clojure.core/defn get-celebrity-info "Gets the name and additional information about a celebrity based on his or her\nAmazon Rekognition ID. The additional information is returned as an array of\nURLs. If there is no additional information about the celebrity, this list is\nempty.\n For more information, see Recognizing Celebrities in an Image in the Amazon\nRekognition Developer Guide.\n This operation requires permissions to perform the rekognition:GetCelebrityInfo\naction." ([get-celebrity-info-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-celebrity-info-request get-celebrity-info-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-celebrity-info-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-celebrity-info-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCelebrityInfo", :http.request.configuration/output-deser-fn response-get-celebrity-info-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-celebrity-info :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-celebrity-info-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-celebrity-info-response))

(clojure.core/defn compare-faces "Compares a face in the source input image with each of the 100 largest faces\ndetected in the target input image.\n If the source image contains multiple faces, the service detects the largest\nface and compares it with each face detected in the target image.\n You pass the input and target images either as base64-encoded image bytes or as\nreferences to images in an Amazon S3 bucket. If you use the AWS CLI to call\nAmazon Rekognition operations, passing image bytes isn't supported. The image\nmust be formatted as a PNG or JPEG file.\n In response, the operation returns an array of face matches ordered by\nsimilarity score in descending order. For each face match, the response provides\na bounding box of the face, facial landmarks, pose details (pitch, role, and\nyaw), quality (brightness and sharpness), and confidence value (indicating the\nlevel of confidence that the bounding box contains a face). The response also\nprovides a similarity score, which indicates how closely the faces match.\n By default, only faces with a similarity score of greater than or equal to 80%\nare returned in the response. You can change this value by specifying the\nSimilarityThreshold parameter.\n CompareFaces also returns an array of faces that don't match the source image.\nFor each face, it returns a bounding box, confidence value, landmarks, pose\ndetails, and quality. The response also returns information about the face in\nthe source image, including the bounding box of the face and confidence value.\n If the image doesn't contain Exif metadata, CompareFaces returns orientation\ninformation for the source and target images. Use these values to display the\nimages with the correct image orientation.\n If no faces are detected in the source or target images, CompareFaces returns\nan InvalidParameterException error.\n This is a stateless API operation. That is, data returned by this operation\ndoesn't persist.\n For an example, see Comparing Faces in Images in the Amazon Rekognition\nDeveloper Guide.\n This operation requires permissions to perform the rekognition:CompareFaces\naction." ([compare-faces-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-compare-faces-request compare-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/compare-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/compare-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CompareFaces", :http.request.configuration/output-deser-fn response-compare-faces-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef compare-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/compare-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/compare-faces-response))

(clojure.core/defn list-collections "Returns list of collection IDs in your account. If the result is truncated, the\nresponse also provides a NextToken that you can use in the subsequent request to\nfetch the next set of collection IDs.\n For an example, see Listing Collections in the Amazon Rekognition Developer\nGuide.\n This operation requires permissions to perform the rekognition:ListCollections\naction." ([] (list-collections {})) ([list-collections-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-collections-request list-collections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/list-collections-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/list-collections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCollections", :http.request.configuration/output-deser-fn response-list-collections-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-collections :args (clojure.spec.alpha/? :portkey.aws.rekognition/list-collections-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/list-collections-response))

(clojure.core/defn recognize-celebrities "Returns an array of celebrities recognized in the input image. For more\ninformation, see Recognizing Celebrities in the Amazon Rekognition Developer\nGuide.\n RecognizeCelebrities returns the 100 largest faces in the image. It lists\nrecognized celebrities in the CelebrityFaces array and unrecognized faces in the\nUnrecognizedFaces array. RecognizeCelebrities doesn't return celebrities whose\nfaces aren't among the largest 100 faces in the image.\n For each celebrity recognized, RecognizeCelebrities returns a Celebrity object.\nThe Celebrity object contains the celebrity name, ID, URL links to additional\ninformation, match confidence, and a ComparedFace object that you can use to\nlocate the celebrity's face on the image.\n Amazon Rekognition doesn't retain information about which images a celebrity\nhas been recognized in. Your application must store this information and use the\nCelebrity ID property as a unique identifier for the celebrity. If you don't\nstore the celebrity name or additional information URLs returned by\nRecognizeCelebrities, you will need the ID to identify the celebrity in a call\nto the GetCelebrityInfo operation.\n You pass the input image either as base64-encoded image bytes or as a reference\nto an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon\nRekognition operations, passing image bytes is not supported. The image must be\neither a PNG or JPEG formatted file.\n For an example, see Recognizing Celebrities in an Image in the Amazon\nRekognition Developer Guide.\n This operation requires permissions to perform the\nrekognition:RecognizeCelebrities operation." ([recognize-celebrities-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-recognize-celebrities-request recognize-celebrities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/recognize-celebrities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/recognize-celebrities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RecognizeCelebrities", :http.request.configuration/output-deser-fn response-recognize-celebrities-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef recognize-celebrities :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/recognize-celebrities-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/recognize-celebrities-response))

(clojure.core/defn create-stream-processor "Creates an Amazon Rekognition stream processor that you can use to detect and\nrecognize faces in a streaming video.\n Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video\nStreams. Amazon Rekognition Video sends analysis results to Amazon Kinesis Data\nStreams.\n You provide as input a Kinesis video stream (Input) and a Kinesis data stream\n(Output) stream. You also specify the face recognition criteria in Settings. For\nexample, the collection containing faces that you want to recognize. Use Name to\nassign an identifier for the stream processor. You use Name to manage the stream\nprocessor. For example, you can start processing the source video by calling\nStartStreamProcessor with the Name field.\n After you have finished analyzing a streaming video, use StopStreamProcessor to\nstop processing. You can delete the stream processor by calling\nDeleteStreamProcessor." ([create-stream-processor-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-stream-processor-request create-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/create-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/create-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamProcessor", :http.request.configuration/output-deser-fn response-create-stream-processor-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.rekognition/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/create-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/create-stream-processor-response))

(clojure.core/defn start-celebrity-recognition "Starts asynchronous recognition of celebrities in a stored video.\n Amazon Rekognition Video can detect celebrities in a video must be stored in an\nAmazon S3 bucket. Use Video to specify the bucket name and the filename of the\nvideo. StartCelebrityRecognition returns a job identifier (JobId) which you use\nto get the results of the analysis. When celebrity recognition analysis is\nfinished, Amazon Rekognition Video publishes a completion status to the Amazon\nSimple Notification Service topic that you specify in NotificationChannel. To\nget the results of the celebrity recognition analysis, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetCelebrityRecognition and pass the job identifier (JobId) from the initial\ncall to StartCelebrityRecognition.\n For more information, see Recognizing Celebrities in the Amazon Rekognition\nDeveloper Guide." ([start-celebrity-recognition-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-celebrity-recognition-request start-celebrity-recognition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-celebrity-recognition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-celebrity-recognition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartCelebrityRecognition", :http.request.configuration/output-deser-fn response-start-celebrity-recognition-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-celebrity-recognition :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-celebrity-recognition-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-celebrity-recognition-response))

(clojure.core/defn start-face-search "Starts the asynchronous search for faces in a collection that match the faces of\npersons detected in a stored video.\n The video must be stored in an Amazon S3 bucket. Use Video to specify the\nbucket name and the filename of the video. StartFaceSearch returns a job\nidentifier (JobId) which you use to get the search results once the search has\ncompleted. When searching is finished, Amazon Rekognition Video publishes a\ncompletion status to the Amazon Simple Notification Service topic that you\nspecify in NotificationChannel. To get the search results, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetFaceSearch and pass the job identifier (JobId) from the initial call to\nStartFaceSearch. For more information, see procedure-person-search-videos." ([start-face-search-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-face-search-request start-face-search-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-face-search-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-face-search-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartFaceSearch", :http.request.configuration/output-deser-fn response-start-face-search-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-face-search :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-face-search-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-face-search-response))

(clojure.core/defn get-person-tracking "Gets the path tracking results of a Amazon Rekognition Video analysis started by\nStartPersonTracking.\n The person path tracking operation is started by a call to StartPersonTracking\nwhich returns a job identifier (JobId). When the operation finishes, Amazon\nRekognition Video publishes a completion status to the Amazon Simple\nNotification Service topic registered in the initial call to\nStartPersonTracking.\n To get the results of the person path tracking operation, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetPersonTracking and pass the job identifier (JobId) from the initial call to\nStartPersonTracking.\n GetPersonTracking returns an array, Persons, of tracked persons and the time(s)\ntheir paths were tracked in the video.\n GetPersonTracking only returns the default facial attributes (BoundingBox,\nConfidence, Landmarks, Pose, and Quality). The other facial attributes listed in\nthe Face object of the following response syntax are not returned.\n For more information, see FaceDetail in the Amazon Rekognition Developer Guide.\n By default, the array is sorted by the time(s) a person's path is tracked in\nthe video. You can sort by tracked persons by specifying INDEX for the SortBy\ninput parameter.\n Use the MaxResults parameter to limit the number of items returned. If there\nare more results than specified in MaxResults, the value of NextToken in the\noperation response contains a pagination token for getting the next set of\nresults. To get the next page of results, call GetPersonTracking and populate\nthe NextToken request parameter with the token value returned from the previous\ncall to GetPersonTracking." ([get-person-tracking-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-person-tracking-request get-person-tracking-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-person-tracking-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-person-tracking-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPersonTracking", :http.request.configuration/output-deser-fn response-get-person-tracking-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-person-tracking :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-person-tracking-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-person-tracking-response))

(clojure.core/defn detect-labels "Detects instances of real-world entities within an image (JPEG or PNG) provided\nas input. This includes objects like flower, tree, and table; events like\nwedding, graduation, and birthday party; and concepts like landscape, evening,\nand nature.\n For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the\nAmazon Rekognition Developer Guide.\n DetectLabels does not support the detection of activities. However, activity\ndetection is supported for label detection in videos. For more information, see\nStartLabelDetection in the Amazon Rekognition Developer Guide.\n You pass the input image as base64-encoded image bytes or as a reference to an\nimage in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition\noperations, passing image bytes is not supported. The image must be either a PNG\nor JPEG formatted file.\n For each object, scene, and concept the API returns one or more labels. Each\nlabel provides the object name, and the level of confidence that the image\ncontains the object. For example, suppose the input image has a lighthouse, the\nsea, and a rock. The response includes all three labels, one for each object.\n {Name: lighthouse, Confidence: 98.4629}\n {Name: rock,Confidence: 79.2097}\n {Name: sea,Confidence: 75.061}\n In the preceding example, the operation returns one label for each of the three\nobjects. The operation can also return multiple labels for the same object in\nthe image. For example, if the input image shows a flower (for example, a\ntulip), the operation might return the following three labels.\n {Name: flower,Confidence: 99.0562}\n {Name: plant,Confidence: 99.0562}\n {Name: tulip,Confidence: 99.0562}\n In this example, the detection algorithm more precisely identifies the flower\nas a tulip.\n In response, the API returns an array of labels. In addition, the response also\nincludes the orientation correction. Optionally, you can specify MinConfidence\nto control the confidence threshold for the labels returned. The default is 55%.\nYou can also add the MaxLabels parameter to limit the number of labels returned.\n If the object detected is a person, the operation doesn't provide the same\nfacial details that the DetectFaces operation provides.\n DetectLabels returns bounding boxes for instances of common object labels in an\narray of Instance objects. An Instance object contains a BoundingBox object, for\nthe location of the label on the image. It also includes the confidence by which\nthe bounding box was detected.\n DetectLabels also returns a hierarchical taxonomy of detected labels. For\nexample, a detected car might be assigned the label car. The label car has two\nparent labels: Vehicle (its parent) and Transportation (its grandparent). The\nresponse returns the entire list of ancestors for a label. Each ancestor is a\nunique label in the response. In the previous example, Car, Vehicle, and\nTransportation are returned as unique labels in the response.\n This is a stateless API operation. That is, the operation does not persist any\ndata.\n This operation requires permissions to perform the rekognition:DetectLabels\naction." ([detect-labels-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-detect-labels-request detect-labels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/detect-labels-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/detect-labels-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectLabels", :http.request.configuration/output-deser-fn response-detect-labels-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-labels :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/detect-labels-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/detect-labels-response))

(clojure.core/defn detect-moderation-labels "Detects explicit or suggestive adult content in a specified JPEG or PNG format\nimage. Use DetectModerationLabels to moderate images depending on your\nrequirements. For example, you might want to filter images that contain nudity,\nbut not images containing suggestive content.\n To filter images, use the labels returned by DetectModerationLabels to\ndetermine which types of content are appropriate.\n For information about moderation labels, see Detecting Unsafe Content in the\nAmazon Rekognition Developer Guide.\n You pass the input image either as base64-encoded image bytes or as a reference\nto an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon\nRekognition operations, passing image bytes is not supported. The image must be\neither a PNG or JPEG formatted file." ([detect-moderation-labels-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-detect-moderation-labels-request detect-moderation-labels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/detect-moderation-labels-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/detect-moderation-labels-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectModerationLabels", :http.request.configuration/output-deser-fn response-detect-moderation-labels-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-moderation-labels :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/detect-moderation-labels-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/detect-moderation-labels-response))

(clojure.core/defn get-celebrity-recognition "Gets the celebrity recognition results for a Amazon Rekognition Video analysis\nstarted by StartCelebrityRecognition.\n Celebrity recognition in a video is an asynchronous operation. Analysis is\nstarted by a call to StartCelebrityRecognition which returns a job identifier\n(JobId). When the celebrity recognition operation finishes, Amazon Rekognition\nVideo publishes a completion status to the Amazon Simple Notification Service\ntopic registered in the initial call to StartCelebrityRecognition. To get the\nresults of the celebrity recognition analysis, first check that the status value\npublished to the Amazon SNS topic is SUCCEEDED. If so, call\nGetCelebrityDetection and pass the job identifier (JobId) from the initial call\nto StartCelebrityDetection.\n For more information, see Working With Stored Videos in the Amazon Rekognition\nDeveloper Guide.\n GetCelebrityRecognition returns detected celebrities and the time(s) they are\ndetected in an array (Celebrities) of CelebrityRecognition objects. Each\nCelebrityRecognition contains information about the celebrity in a\nCelebrityDetail object and the time, Timestamp, the celebrity was detected.\n GetCelebrityRecognition only returns the default facial attributes\n(BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial\nattributes listed in the Face object of the following response syntax are not\nreturned. For more information, see FaceDetail in the Amazon Rekognition\nDeveloper Guide.\n By default, the Celebrities array is sorted by time (milliseconds from the\nstart of the video). You can also sort the array by celebrity by specifying the\nvalue ID in the SortBy input parameter.\n The CelebrityDetail object includes the celebrity identifer and additional\ninformation urls. If you don't store the additional information urls, you can\nget them later by calling GetCelebrityInfo with the celebrity identifer.\n No information is returned for faces not recognized as celebrities.\n Use MaxResults parameter to limit the number of labels returned. If there are\nmore results than specified in MaxResults, the value of NextToken in the\noperation response contains a pagination token for getting the next set of\nresults. To get the next page of results, call GetCelebrityDetection and\npopulate the NextToken request parameter with the token value returned from the\nprevious call to GetCelebrityRecognition." ([get-celebrity-recognition-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-celebrity-recognition-request get-celebrity-recognition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-celebrity-recognition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-celebrity-recognition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCelebrityRecognition", :http.request.configuration/output-deser-fn response-get-celebrity-recognition-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-celebrity-recognition :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-celebrity-recognition-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-celebrity-recognition-response))

(clojure.core/defn start-face-detection "Starts asynchronous detection of faces in a stored video.\n Amazon Rekognition Video can detect faces in a video stored in an Amazon S3\nbucket. Use Video to specify the bucket name and the filename of the video.\nStartFaceDetection returns a job identifier (JobId) that you use to get the\nresults of the operation. When face detection is finished, Amazon Rekognition\nVideo publishes a completion status to the Amazon Simple Notification Service\ntopic that you specify in NotificationChannel. To get the results of the face\ndetection operation, first check that the status value published to the Amazon\nSNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier\n(JobId) from the initial call to StartFaceDetection.\n For more information, see Detecting Faces in a Stored Video in the Amazon\nRekognition Developer Guide." ([start-face-detection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-face-detection-request start-face-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-face-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-face-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartFaceDetection", :http.request.configuration/output-deser-fn response-start-face-detection-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-face-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-face-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-face-detection-response))

(clojure.core/defn describe-collection "Describes the specified collection. You can use DescribeCollection to get\ninformation, such as the number of faces indexed into a collection and the\nversion of the model used by the collection for face detection.\n For more information, see Describing a Collection in the Amazon Rekognition\nDeveloper Guide." ([describe-collection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-collection-request describe-collection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/describe-collection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/describe-collection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCollection", :http.request.configuration/output-deser-fn response-describe-collection-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-collection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/describe-collection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/describe-collection-response))

(clojure.core/defn detect-text "Detects text in the input image and converts it into machine-readable text.\n Pass the input image as base64-encoded image bytes or as a reference to an\nimage in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition\noperations, you must pass it as a reference to an image in an Amazon S3 bucket.\nFor the AWS CLI, passing image bytes is not supported. The image must be either\na .png or .jpeg formatted file.\n The DetectText operation returns text in an array of TextDetection elements,\nTextDetections. Each TextDetection element provides information about a single\nword or line of text that was detected in the image.\n A word is one or more ISO basic latin script characters that are not separated\nby spaces. DetectText can detect up to 50 words in an image.\n A line is a string of equally spaced words. A line isn't necessarily a complete\nsentence. For example, a driver's license number is detected as a line. A line\nends when there is no aligned text after it. Also, a line ends when there is a\nlarge gap between words, relative to the length of the words. This means,\ndepending on the gap between words, Amazon Rekognition may detect multiple lines\nin text aligned in the same direction. Periods don't represent the end of a\nline. If a sentence spans multiple lines, the DetectText operation returns\nmultiple lines.\n To determine whether a TextDetection element is a line of text or a word, use\nthe TextDetection object Type field.\n To be detected, text must be within +/- 90 degrees orientation of the\nhorizontal axis.\n For more information, see DetectText in the Amazon Rekognition Developer Guide." ([detect-text-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-detect-text-request detect-text-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/detect-text-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/detect-text-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectText", :http.request.configuration/output-deser-fn response-detect-text-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-text :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/detect-text-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/detect-text-response))

(clojure.core/defn start-person-tracking "Starts the asynchronous tracking of a person's path in a stored video.\n Amazon Rekognition Video can track the path of people in a video stored in an\nAmazon S3 bucket. Use Video to specify the bucket name and the filename of the\nvideo. StartPersonTracking returns a job identifier (JobId) which you use to get\nthe results of the operation. When label detection is finished, Amazon\nRekognition publishes a completion status to the Amazon Simple Notification\nService topic that you specify in NotificationChannel.\n To get the results of the person detection operation, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetPersonTracking and pass the job identifier (JobId) from the initial call to\nStartPersonTracking." ([start-person-tracking-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-person-tracking-request start-person-tracking-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-person-tracking-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-person-tracking-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartPersonTracking", :http.request.configuration/output-deser-fn response-start-person-tracking-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-person-tracking :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-person-tracking-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-person-tracking-response))

(clojure.core/defn delete-stream-processor "Deletes the stream processor identified by Name. You assign the value for Name\nwhen you create the stream processor with CreateStreamProcessor. You might not\nbe able to use the same name for a stream processor for a few seconds after\ncalling DeleteStreamProcessor." ([delete-stream-processor-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-stream-processor-request delete-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/delete-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/delete-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStreamProcessor", :http.request.configuration/output-deser-fn response-delete-stream-processor-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ResourceInUseException" :portkey.aws.rekognition/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef delete-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/delete-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/delete-stream-processor-response))

(clojure.core/defn create-collection "Creates a collection in an AWS Region. You can add faces to the collection using\nthe IndexFaces operation.\n For example, you might create collections, one for each of your application\nusers. A user can then index faces using the IndexFaces operation and persist\nresults in a specific collection. Then, a user can search the collection for\nfaces in the user-specific container.\n When you create a collection, it is associated with the latest version of the\nface model version.\n Collection names are case-sensitive.\n This operation requires permissions to perform the rekognition:CreateCollection\naction." ([create-collection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-create-collection-request create-collection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/create-collection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/create-collection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCollection", :http.request.configuration/output-deser-fn response-create-collection-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.rekognition/resource-already-exists-exception}})))))
(clojure.spec.alpha/fdef create-collection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/create-collection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/create-collection-response))

(clojure.core/defn delete-faces "Deletes faces from a collection. You specify a collection ID and an array of\nface IDs to remove from the collection.\n This operation requires permissions to perform the rekognition:DeleteFaces\naction." ([delete-faces-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-faces-request delete-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/delete-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/delete-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFaces", :http.request.configuration/output-deser-fn response-delete-faces-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/delete-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/delete-faces-response))

(clojure.core/defn list-faces "Returns metadata for faces in the specified collection. This metadata includes\ninformation such as the bounding box coordinates, the confidence (that the\nbounding box contains a face), and face ID. For an example, see Listing Faces in\na Collection in the Amazon Rekognition Developer Guide.\n This operation requires permissions to perform the rekognition:ListFaces\naction." ([list-faces-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-faces-request list-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/list-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/list-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFaces", :http.request.configuration/output-deser-fn response-list-faces-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/list-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/list-faces-response))

(clojure.core/defn get-content-moderation "Gets the content moderation analysis results for a Amazon Rekognition Video\nanalysis started by StartContentModeration.\n Content moderation analysis of a video is an asynchronous operation. You start\nanalysis by calling StartContentModeration. which returns a job identifier\n(JobId). When analysis finishes, Amazon Rekognition Video publishes a completion\nstatus to the Amazon Simple Notification Service topic registered in the initial\ncall to StartContentModeration. To get the results of the content moderation\nanalysis, first check that the status value published to the Amazon SNS topic is\nSUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId)\nfrom the initial call to StartCelebrityDetection.\n For more information, see Working with Stored Videos in the Amazon Rekognition\nDevlopers Guide.\n GetContentModeration returns detected content moderation labels, and the time\nthey are detected, in an array, ModerationLabels, of ContentModerationDetection\nobjects.\n By default, the moderated labels are returned sorted by time, in milliseconds\nfrom the start of the video. You can also sort them by moderated label by\nspecifying NAME for the SortBy input parameter.\n Since video analysis can return a large number of results, use the MaxResults\nparameter to limit the number of labels returned in a single call to\nGetContentModeration. If there are more results than specified in MaxResults,\nthe value of NextToken in the operation response contains a pagination token for\ngetting the next set of results. To get the next page of results, call\nGetContentModeration and populate the NextToken request parameter with the value\nof NextToken returned from the previous call to GetContentModeration.\n For more information, see Detecting Unsafe Content in the Amazon Rekognition\nDeveloper Guide." ([get-content-moderation-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-content-moderation-request get-content-moderation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-content-moderation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-content-moderation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetContentModeration", :http.request.configuration/output-deser-fn response-get-content-moderation-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-content-moderation :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-content-moderation-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-content-moderation-response))

(clojure.core/defn delete-collection "Deletes the specified collection. Note that this operation removes all faces in\nthe collection. For an example, see delete-collection-procedure.\n This operation requires permissions to perform the rekognition:DeleteCollection\naction." ([delete-collection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-delete-collection-request delete-collection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/delete-collection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/delete-collection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCollection", :http.request.configuration/output-deser-fn response-delete-collection-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-collection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/delete-collection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/delete-collection-response))

(clojure.core/defn search-faces "For a given input face ID, searches for matching faces in the collection the\nface belongs to. You get a face ID when you add a face to the collection using\nthe IndexFaces operation. The operation compares the features of the input face\nwith faces in the specified collection.\n You can also search faces without indexing faces by using the\nSearchFacesByImage operation.\n The operation response returns an array of faces that match, ordered by\nsimilarity score with the highest similarity first. More specifically, it is an\narray of metadata for each face match that is found. Along with the metadata,\nthe response also includes a confidence value for each face match, indicating\nthe confidence that the specific face matches the input face.\n For an example, see Searching for a Face Using Its Face ID in the Amazon\nRekognition Developer Guide.\n This operation requires permissions to perform the rekognition:SearchFaces\naction." ([search-faces-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-search-faces-request search-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/search-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/search-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchFaces", :http.request.configuration/output-deser-fn response-search-faces-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef search-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/search-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/search-faces-response))

(clojure.core/defn start-stream-processor "Starts processing a stream processor. You create a stream processor by calling\nCreateStreamProcessor. To tell StartStreamProcessor which stream processor to\nstart, use the value of the Name field specified in the call to\nCreateStreamProcessor." ([start-stream-processor-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-stream-processor-request start-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartStreamProcessor", :http.request.configuration/output-deser-fn response-start-stream-processor-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ResourceInUseException" :portkey.aws.rekognition/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-stream-processor-response))

(clojure.core/defn list-stream-processors "Gets a list of stream processors that you have created with\nCreateStreamProcessor." ([] (list-stream-processors {})) ([list-stream-processors-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-list-stream-processors-request list-stream-processors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/list-stream-processors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/list-stream-processors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamProcessors", :http.request.configuration/output-deser-fn response-list-stream-processors-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-stream-processors :args (clojure.spec.alpha/? :portkey.aws.rekognition/list-stream-processors-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/list-stream-processors-response))

(clojure.core/defn detect-faces "Detects faces within an image that is provided as input.\n DetectFaces detects the 100 largest faces in the image. For each face detected,\nthe operation returns face details. These details include a bounding box of the\nface, a confidence value (that the bounding box contains a face), and a fixed\nset of attributes such as facial landmarks (for example, coordinates of eye and\nmouth), gender, presence of beard, sunglasses, and so on.\n The face-detection algorithm is most effective on frontal faces. For\nnon-frontal or obscured faces, the algorithm might not detect the faces or might\ndetect faces with lower confidence.\n You pass the input image either as base64-encoded image bytes or as a reference\nto an image in an Amazon S3 bucket. If you use the to call Amazon Rekognition\noperations, passing image bytes is not supported. The image must be either a PNG\nor JPEG formatted file.\n This is a stateless API operation. That is, the operation does not persist any\ndata.\n This operation requires permissions to perform the rekognition:DetectFaces\naction." ([detect-faces-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-detect-faces-request detect-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/detect-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/detect-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectFaces", :http.request.configuration/output-deser-fn response-detect-faces-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/detect-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/detect-faces-response))

(clojure.core/defn get-face-search "Gets the face search results for Amazon Rekognition Video face search started by\nStartFaceSearch. The search returns faces in a collection that match the faces\nof persons detected in a video. It also includes the time(s) that faces are\nmatched in the video.\n Face search in a video is an asynchronous operation. You start face search by\ncalling to StartFaceSearch which returns a job identifier (JobId). When the\nsearch operation finishes, Amazon Rekognition Video publishes a completion\nstatus to the Amazon Simple Notification Service topic registered in the initial\ncall to StartFaceSearch. To get the search results, first check that the status\nvalue published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch\nand pass the job identifier (JobId) from the initial call to StartFaceSearch.\n For more information, see Searching Faces in a Collection in the Amazon\nRekognition Developer Guide.\n The search results are retured in an array, Persons, of PersonMatch objects.\nEachPersonMatch element contains details about the matching faces in the input\ncollection, person information (facial attributes, bounding boxes, and person\nidentifer) for the matched person, and the time the person was matched in the\nvideo.\n GetFaceSearch only returns the default facial attributes (BoundingBox,\nConfidence, Landmarks, Pose, and Quality). The other facial attributes listed in\nthe Face object of the following response syntax are not returned. For more\ninformation, see FaceDetail in the Amazon Rekognition Developer Guide.\n By default, the Persons array is sorted by the time, in milliseconds from the\nstart of the video, persons are matched. You can also sort by persons by\nspecifying INDEX for the SORTBY input parameter." ([get-face-search-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-face-search-request get-face-search-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-face-search-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-face-search-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFaceSearch", :http.request.configuration/output-deser-fn response-get-face-search-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-face-search :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-face-search-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-face-search-response))

(clojure.core/defn describe-stream-processor "Provides information about a stream processor created by CreateStreamProcessor.\nYou can get information about the input and output streams, the input parameters\nfor the face recognition being performed, and the current status of the stream\nprocessor." ([describe-stream-processor-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-describe-stream-processor-request describe-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/describe-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/describe-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStreamProcessor", :http.request.configuration/output-deser-fn response-describe-stream-processor-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef describe-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/describe-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/describe-stream-processor-response))

(clojure.core/defn index-faces "Detects faces in the input image and adds them to the specified collection.\n Amazon Rekognition doesn't save the actual faces that are detected. Instead,\nthe underlying detection algorithm first detects the faces in the input image.\nFor each face, the algorithm extracts facial features into a feature vector, and\nstores it in the backend database. Amazon Rekognition uses feature vectors when\nit performs face match and search operations using the SearchFaces and\nSearchFacesByImage operations.\n For more information, see Adding Faces to a Collection in the Amazon\nRekognition Developer Guide.\n To get the number of faces in a collection, call DescribeCollection.\n If you're using version 1.0 of the face detection model, IndexFaces indexes the\n15 largest faces in the input image. Later versions of the face detection model\nindex the 100 largest faces in the input image.\n If you're using version 4 or later of the face model, image orientation\ninformation is not returned in the OrientationCorrection field.\n To determine which version of the model you're using, call DescribeCollection\nand supply the collection ID. You can also get the model version from the value\nof FaceModelVersion in the response from IndexFaces\n For more information, see Model Versioning in the Amazon Rekognition Developer\nGuide.\n If you provide the optional ExternalImageID for the input image you provided,\nAmazon Rekognition associates this ID with all faces that it detects. When you\ncall the ListFaces operation, the response returns the external ID. You can use\nthis external image ID to create a client-side index to associate the faces with\neach image. You can then use the index to find all faces in an image.\n You can specify the maximum number of faces to index with the MaxFaces input\nparameter. This is useful when you want to index the largest faces in an image\nand don't want to index smaller faces, such as those belonging to people\nstanding in the background.\n The QualityFilter input parameter allows you to filter out detected faces that\ndon’t meet the required quality bar chosen by Amazon Rekognition. The quality\nbar is based on a variety of common use cases. By default, IndexFaces filters\ndetected faces. You can also explicitly filter detected faces by specifying AUTO\nfor the value of QualityFilter. If you do not want to filter detected faces,\nspecify NONE.\n To use quality filtering, you need a collection associated with version 3 of\nthe face model. To get the version of the face model associated with a\ncollection, call DescribeCollection.\n Information about faces detected in an image, but not indexed, is returned in\nan array of UnindexedFace objects, UnindexedFaces. Faces aren't indexed for\nreasons such as:\n * The number of faces detected exceeds the value of the MaxFaces request\nparameter.\n * The face is too small compared to the image dimensions.\n * The face is too blurry.\n * The image is too dark.\n * The face has an extreme pose.\n In response, the IndexFaces operation returns an array of metadata for all\ndetected faces, FaceRecords. This includes:\n * The bounding box, BoundingBox, of the detected face.\n * A confidence value, Confidence, which indicates the confidence that the\nbounding box contains a face.\n * A face ID, FaceId, assigned by the service for each face that's detected and\nstored.\n * An image ID, ImageId, assigned by the service for the input image.\n If you request all facial attributes (by using the detectionAttributes\nparameter), Amazon Rekognition returns detailed facial attributes, such as\nfacial landmarks (for example, location of eye and mouth) and other facial\nattributes like gender. If you provide the same image, specify the same\ncollection, and use the same external ID in the IndexFaces operation, Amazon\nRekognition doesn't save duplicate face metadata.\n The input image is passed either as base64-encoded image bytes, or as a\nreference to an image in an Amazon S3 bucket. If you use the AWS CLI to call\nAmazon Rekognition operations, passing image bytes isn't supported. The image\nmust be formatted as a PNG or JPEG file.\n This operation requires permissions to perform the rekognition:IndexFaces\naction." ([index-faces-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-index-faces-request index-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/index-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/index-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "IndexFaces", :http.request.configuration/output-deser-fn response-index-faces-response, :http.request.spec/error-spec {"InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception, "InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef index-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/index-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/index-faces-response))

(clojure.core/defn search-faces-by-image "For a given input image, first detects the largest face in the image, and then\nsearches the specified collection for matching faces. The operation compares the\nfeatures of the input face with faces in the specified collection.\n To search for all faces in an input image, you might first call the IndexFaces\noperation, and then use the face IDs returned in subsequent calls to the\nSearchFaces operation.\n You can also call the DetectFaces operation and use the bounding boxes in the\nresponse to make face crops, which then you can pass in to the\nSearchFacesByImage operation.\n You pass the input image either as base64-encoded image bytes or as a reference\nto an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon\nRekognition operations, passing image bytes is not supported. The image must be\neither a PNG or JPEG formatted file.\n The response returns an array of faces that match, ordered by similarity score\nwith the highest similarity first. More specifically, it is an array of metadata\nfor each face match found. Along with the metadata, the response also includes a\nsimilarity indicating how similar the face is to the input face. In the\nresponse, the operation also returns the bounding box (and a confidence level\nthat the bounding box contains a face) of the face that Amazon Rekognition used\nfor the input image.\n For an example, Searching for a Face Using an Image in the Amazon Rekognition\nDeveloper Guide.\n This operation requires permissions to perform the\nrekognition:SearchFacesByImage action." ([search-faces-by-image-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-search-faces-by-image-request search-faces-by-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/search-faces-by-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/search-faces-by-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchFacesByImage", :http.request.configuration/output-deser-fn response-search-faces-by-image-response, :http.request.spec/error-spec {"InvalidImageFormatException" :portkey.aws.rekognition/invalid-image-format-exception, "InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "ImageTooLargeException" :portkey.aws.rekognition/image-too-large-exception, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef search-faces-by-image :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/search-faces-by-image-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/search-faces-by-image-response))

(clojure.core/defn start-label-detection "Starts asynchronous detection of labels in a stored video.\n Amazon Rekognition Video can detect labels in a video. Labels are instances of\nreal-world entities. This includes objects like flower, tree, and table; events\nlike wedding, graduation, and birthday party; concepts like landscape, evening,\nand nature; and activities like a person getting out of a car or a person\nskiing.\n The video must be stored in an Amazon S3 bucket. Use Video to specify the\nbucket name and the filename of the video. StartLabelDetection returns a job\nidentifier (JobId) which you use to get the results of the operation. When label\ndetection is finished, Amazon Rekognition Video publishes a completion status to\nthe Amazon Simple Notification Service topic that you specify in\nNotificationChannel.\n To get the results of the label detection operation, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetLabelDetection and pass the job identifier (JobId) from the initial call to\nStartLabelDetection." ([start-label-detection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-start-label-detection-request start-label-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/start-label-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/start-label-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartLabelDetection", :http.request.configuration/output-deser-fn response-start-label-detection-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-label-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/start-label-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/start-label-detection-response))

(clojure.core/defn get-face-detection "Gets face detection results for a Amazon Rekognition Video analysis started by\nStartFaceDetection.\n Face detection with Amazon Rekognition Video is an asynchronous operation. You\nstart face detection by calling StartFaceDetection which returns a job\nidentifier (JobId). When the face detection operation finishes, Amazon\nRekognition Video publishes a completion status to the Amazon Simple\nNotification Service topic registered in the initial call to StartFaceDetection.\nTo get the results of the face detection operation, first check that the status\nvalue published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetFaceDetection and pass the job identifier (JobId) from the initial call to\nStartFaceDetection.\n GetFaceDetection returns an array of detected faces (Faces) sorted by the time\nthe faces were detected.\n Use MaxResults parameter to limit the number of labels returned. If there are\nmore results than specified in MaxResults, the value of NextToken in the\noperation response contains a pagination token for getting the next set of\nresults. To get the next page of results, call GetFaceDetection and populate the\nNextToken request parameter with the token value returned from the previous call\nto GetFaceDetection." ([get-face-detection-requestinput] (clojure.core/let [request-function-result__22119__auto__ (req-get-face-detection-request get-face-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22119__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition/get-face-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition/get-face-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFaceDetection", :http.request.configuration/output-deser-fn response-get-face-detection-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition/access-denied-exception, "InternalServerError" :portkey.aws.rekognition/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition/throttling-exception}})))))
(clojure.spec.alpha/fdef get-face-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition/get-face-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition/get-face-detection-response))
