(ns portkey.aws.rekognition.-2016-06-27 (:require [portkey.aws]))

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

(clojure.core/defn- response-list-faces-response ([input] (response-list-faces-response nil input)) ([resultWrapper1948783 input] (clojure.core/let [rawinput1948782 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948784 {"Faces" (rawinput1948782 "Faces"), "NextToken" (rawinput1948782 "NextToken"), "FaceModelVersion" (rawinput1948782 "FaceModelVersion")}] (clojure.core/cond-> {} (letvar1948784 "Faces") (clojure.core/assoc :faces (deser-face-list (clojure.core/get-in letvar1948784 ["Faces"]))) (letvar1948784 "NextToken") (clojure.core/assoc :next-token (deser-string (clojure.core/get-in letvar1948784 ["NextToken"]))) (letvar1948784 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1948784 ["FaceModelVersion"])))))))

(clojure.core/defn- response-stop-stream-processor-response ([input] (response-stop-stream-processor-response nil input)) ([resultWrapper1948786 input] (clojure.core/let [rawinput1948785 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948787 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-image-format-exception ([input] (response-invalid-image-format-exception nil input)) ([resultWrapper1948789 input] (clojure.core/let [rawinput1948788 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948790 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-recognize-celebrities-response ([input] (response-recognize-celebrities-response nil input)) ([resultWrapper1948792 input] (clojure.core/let [rawinput1948791 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948793 {"CelebrityFaces" (rawinput1948791 "CelebrityFaces"), "UnrecognizedFaces" (rawinput1948791 "UnrecognizedFaces"), "OrientationCorrection" (rawinput1948791 "OrientationCorrection")}] (clojure.core/cond-> {} (letvar1948793 "CelebrityFaces") (clojure.core/assoc :celebrity-faces (deser-celebrity-list (clojure.core/get-in letvar1948793 ["CelebrityFaces"]))) (letvar1948793 "UnrecognizedFaces") (clojure.core/assoc :unrecognized-faces (deser-compared-face-list (clojure.core/get-in letvar1948793 ["UnrecognizedFaces"]))) (letvar1948793 "OrientationCorrection") (clojure.core/assoc :orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1948793 ["OrientationCorrection"])))))))

(clojure.core/defn- response-get-label-detection-response ([input] (response-get-label-detection-response nil input)) ([resultWrapper1948795 input] (clojure.core/let [rawinput1948794 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948796 {"JobStatus" (rawinput1948794 "JobStatus"), "StatusMessage" (rawinput1948794 "StatusMessage"), "VideoMetadata" (rawinput1948794 "VideoMetadata"), "NextToken" (rawinput1948794 "NextToken"), "Labels" (rawinput1948794 "Labels"), "LabelModelVersion" (rawinput1948794 "LabelModelVersion")}] (clojure.core/cond-> {} (letvar1948796 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1948796 ["JobStatus"]))) (letvar1948796 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1948796 ["StatusMessage"]))) (letvar1948796 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1948796 ["VideoMetadata"]))) (letvar1948796 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1948796 ["NextToken"]))) (letvar1948796 "Labels") (clojure.core/assoc :labels (deser-label-detections (clojure.core/get-in letvar1948796 ["Labels"]))) (letvar1948796 "LabelModelVersion") (clojure.core/assoc :label-model-version (deser-string (clojure.core/get-in letvar1948796 ["LabelModelVersion"])))))))

(clojure.core/defn- response-start-label-detection-response ([input] (response-start-label-detection-response nil input)) ([resultWrapper1948798 input] (clojure.core/let [rawinput1948797 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948799 {"JobId" (rawinput1948797 "JobId")}] (clojure.core/cond-> {} (letvar1948799 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1948799 ["JobId"])))))))

(clojure.core/defn- response-delete-faces-response ([input] (response-delete-faces-response nil input)) ([resultWrapper1948801 input] (clojure.core/let [rawinput1948800 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948802 {"DeletedFaces" (rawinput1948800 "DeletedFaces")}] (clojure.core/cond-> {} (letvar1948802 "DeletedFaces") (clojure.core/assoc :deleted-faces (deser-face-id-list (clojure.core/get-in letvar1948802 ["DeletedFaces"])))))))

(clojure.core/defn- response-get-person-tracking-response ([input] (response-get-person-tracking-response nil input)) ([resultWrapper1948804 input] (clojure.core/let [rawinput1948803 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948805 {"JobStatus" (rawinput1948803 "JobStatus"), "StatusMessage" (rawinput1948803 "StatusMessage"), "VideoMetadata" (rawinput1948803 "VideoMetadata"), "NextToken" (rawinput1948803 "NextToken"), "Persons" (rawinput1948803 "Persons")}] (clojure.core/cond-> {} (letvar1948805 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1948805 ["JobStatus"]))) (letvar1948805 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1948805 ["StatusMessage"]))) (letvar1948805 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1948805 ["VideoMetadata"]))) (letvar1948805 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1948805 ["NextToken"]))) (letvar1948805 "Persons") (clojure.core/assoc :persons (deser-person-detections (clojure.core/get-in letvar1948805 ["Persons"])))))))

(clojure.core/defn- response-compare-faces-response ([input] (response-compare-faces-response nil input)) ([resultWrapper1948807 input] (clojure.core/let [rawinput1948806 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948808 {"SourceImageFace" (rawinput1948806 "SourceImageFace"), "FaceMatches" (rawinput1948806 "FaceMatches"), "UnmatchedFaces" (rawinput1948806 "UnmatchedFaces"), "SourceImageOrientationCorrection" (rawinput1948806 "SourceImageOrientationCorrection"), "TargetImageOrientationCorrection" (rawinput1948806 "TargetImageOrientationCorrection")}] (clojure.core/cond-> {} (letvar1948808 "SourceImageFace") (clojure.core/assoc :source-image-face (deser-compared-source-image-face (clojure.core/get-in letvar1948808 ["SourceImageFace"]))) (letvar1948808 "FaceMatches") (clojure.core/assoc :face-matches (deser-compare-faces-match-list (clojure.core/get-in letvar1948808 ["FaceMatches"]))) (letvar1948808 "UnmatchedFaces") (clojure.core/assoc :unmatched-faces (deser-compare-faces-unmatch-list (clojure.core/get-in letvar1948808 ["UnmatchedFaces"]))) (letvar1948808 "SourceImageOrientationCorrection") (clojure.core/assoc :source-image-orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1948808 ["SourceImageOrientationCorrection"]))) (letvar1948808 "TargetImageOrientationCorrection") (clojure.core/assoc :target-image-orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1948808 ["TargetImageOrientationCorrection"])))))))

(clojure.core/defn- response-invalid-s-3-object-exception ([input] (response-invalid-s-3-object-exception nil input)) ([resultWrapper1948810 input] (clojure.core/let [rawinput1948809 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948811 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-search-faces-response ([input] (response-search-faces-response nil input)) ([resultWrapper1948813 input] (clojure.core/let [rawinput1948812 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948814 {"SearchedFaceId" (rawinput1948812 "SearchedFaceId"), "FaceMatches" (rawinput1948812 "FaceMatches"), "FaceModelVersion" (rawinput1948812 "FaceModelVersion")}] (clojure.core/cond-> {} (letvar1948814 "SearchedFaceId") (clojure.core/assoc :searched-face-id (deser-face-id (clojure.core/get-in letvar1948814 ["SearchedFaceId"]))) (letvar1948814 "FaceMatches") (clojure.core/assoc :face-matches (deser-face-match-list (clojure.core/get-in letvar1948814 ["FaceMatches"]))) (letvar1948814 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1948814 ["FaceModelVersion"])))))))

(clojure.core/defn- response-start-face-search-response ([input] (response-start-face-search-response nil input)) ([resultWrapper1948816 input] (clojure.core/let [rawinput1948815 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948817 {"JobId" (rawinput1948815 "JobId")}] (clojure.core/cond-> {} (letvar1948817 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1948817 ["JobId"])))))))

(clojure.core/defn- response-get-face-detection-response ([input] (response-get-face-detection-response nil input)) ([resultWrapper1948819 input] (clojure.core/let [rawinput1948818 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948820 {"JobStatus" (rawinput1948818 "JobStatus"), "StatusMessage" (rawinput1948818 "StatusMessage"), "VideoMetadata" (rawinput1948818 "VideoMetadata"), "NextToken" (rawinput1948818 "NextToken"), "Faces" (rawinput1948818 "Faces")}] (clojure.core/cond-> {} (letvar1948820 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1948820 ["JobStatus"]))) (letvar1948820 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1948820 ["StatusMessage"]))) (letvar1948820 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1948820 ["VideoMetadata"]))) (letvar1948820 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1948820 ["NextToken"]))) (letvar1948820 "Faces") (clojure.core/assoc :faces (deser-face-detections (clojure.core/get-in letvar1948820 ["Faces"])))))))

(clojure.core/defn- response-detect-text-response ([input] (response-detect-text-response nil input)) ([resultWrapper1948822 input] (clojure.core/let [rawinput1948821 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948823 {"TextDetections" (rawinput1948821 "TextDetections")}] (clojure.core/cond-> {} (letvar1948823 "TextDetections") (clojure.core/assoc :text-detections (deser-text-detection-list (clojure.core/get-in letvar1948823 ["TextDetections"])))))))

(clojure.core/defn- response-search-faces-by-image-response ([input] (response-search-faces-by-image-response nil input)) ([resultWrapper1948825 input] (clojure.core/let [rawinput1948824 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948826 {"SearchedFaceBoundingBox" (rawinput1948824 "SearchedFaceBoundingBox"), "SearchedFaceConfidence" (rawinput1948824 "SearchedFaceConfidence"), "FaceMatches" (rawinput1948824 "FaceMatches"), "FaceModelVersion" (rawinput1948824 "FaceModelVersion")}] (clojure.core/cond-> {} (letvar1948826 "SearchedFaceBoundingBox") (clojure.core/assoc :searched-face-bounding-box (deser-bounding-box (clojure.core/get-in letvar1948826 ["SearchedFaceBoundingBox"]))) (letvar1948826 "SearchedFaceConfidence") (clojure.core/assoc :searched-face-confidence (deser-percent (clojure.core/get-in letvar1948826 ["SearchedFaceConfidence"]))) (letvar1948826 "FaceMatches") (clojure.core/assoc :face-matches (deser-face-match-list (clojure.core/get-in letvar1948826 ["FaceMatches"]))) (letvar1948826 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1948826 ["FaceModelVersion"])))))))

(clojure.core/defn- response-resource-in-use-exception ([input] (response-resource-in-use-exception nil input)) ([resultWrapper1948828 input] (clojure.core/let [rawinput1948827 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948829 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-face-search-response ([input] (response-get-face-search-response nil input)) ([resultWrapper1948831 input] (clojure.core/let [rawinput1948830 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948832 {"JobStatus" (rawinput1948830 "JobStatus"), "StatusMessage" (rawinput1948830 "StatusMessage"), "NextToken" (rawinput1948830 "NextToken"), "VideoMetadata" (rawinput1948830 "VideoMetadata"), "Persons" (rawinput1948830 "Persons")}] (clojure.core/cond-> {} (letvar1948832 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1948832 ["JobStatus"]))) (letvar1948832 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1948832 ["StatusMessage"]))) (letvar1948832 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1948832 ["NextToken"]))) (letvar1948832 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1948832 ["VideoMetadata"]))) (letvar1948832 "Persons") (clojure.core/assoc :persons (deser-person-matches (clojure.core/get-in letvar1948832 ["Persons"])))))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper1948834 input] (clojure.core/let [rawinput1948833 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948835 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-resource-already-exists-exception ([input] (response-resource-already-exists-exception nil input)) ([resultWrapper1948837 input] (clojure.core/let [rawinput1948836 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948838 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-content-moderation-response ([input] (response-start-content-moderation-response nil input)) ([resultWrapper1948840 input] (clojure.core/let [rawinput1948839 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948841 {"JobId" (rawinput1948839 "JobId")}] (clojure.core/cond-> {} (letvar1948841 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1948841 ["JobId"])))))))

(clojure.core/defn- response-delete-stream-processor-response ([input] (response-delete-stream-processor-response nil input)) ([resultWrapper1948843 input] (clojure.core/let [rawinput1948842 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948844 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-index-faces-response ([input] (response-index-faces-response nil input)) ([resultWrapper1948846 input] (clojure.core/let [rawinput1948845 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948847 {"FaceRecords" (rawinput1948845 "FaceRecords"), "OrientationCorrection" (rawinput1948845 "OrientationCorrection"), "FaceModelVersion" (rawinput1948845 "FaceModelVersion"), "UnindexedFaces" (rawinput1948845 "UnindexedFaces")}] (clojure.core/cond-> {} (letvar1948847 "FaceRecords") (clojure.core/assoc :face-records (deser-face-record-list (clojure.core/get-in letvar1948847 ["FaceRecords"]))) (letvar1948847 "OrientationCorrection") (clojure.core/assoc :orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1948847 ["OrientationCorrection"]))) (letvar1948847 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1948847 ["FaceModelVersion"]))) (letvar1948847 "UnindexedFaces") (clojure.core/assoc :unindexed-faces (deser-unindexed-faces (clojure.core/get-in letvar1948847 ["UnindexedFaces"])))))))

(clojure.core/defn- response-create-collection-response ([input] (response-create-collection-response nil input)) ([resultWrapper1948849 input] (clojure.core/let [rawinput1948848 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948850 {"StatusCode" (rawinput1948848 "StatusCode"), "CollectionArn" (rawinput1948848 "CollectionArn"), "FaceModelVersion" (rawinput1948848 "FaceModelVersion")}] (clojure.core/cond-> {} (letvar1948850 "StatusCode") (clojure.core/assoc :status-code (deser-u-integer (clojure.core/get-in letvar1948850 ["StatusCode"]))) (letvar1948850 "CollectionArn") (clojure.core/assoc :collection-arn (deser-string (clojure.core/get-in letvar1948850 ["CollectionArn"]))) (letvar1948850 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1948850 ["FaceModelVersion"])))))))

(clojure.core/defn- response-resource-not-found-exception ([input] (response-resource-not-found-exception nil input)) ([resultWrapper1948852 input] (clojure.core/let [rawinput1948851 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948853 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-create-stream-processor-response ([input] (response-create-stream-processor-response nil input)) ([resultWrapper1948855 input] (clojure.core/let [rawinput1948854 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948856 {"StreamProcessorArn" (rawinput1948854 "StreamProcessorArn")}] (clojure.core/cond-> {} (letvar1948856 "StreamProcessorArn") (clojure.core/assoc :stream-processor-arn (deser-stream-processor-arn (clojure.core/get-in letvar1948856 ["StreamProcessorArn"])))))))

(clojure.core/defn- response-list-stream-processors-response ([input] (response-list-stream-processors-response nil input)) ([resultWrapper1948858 input] (clojure.core/let [rawinput1948857 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948859 {"NextToken" (rawinput1948857 "NextToken"), "StreamProcessors" (rawinput1948857 "StreamProcessors")}] (clojure.core/cond-> {} (letvar1948859 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1948859 ["NextToken"]))) (letvar1948859 "StreamProcessors") (clojure.core/assoc :stream-processors (deser-stream-processor-list (clojure.core/get-in letvar1948859 ["StreamProcessors"])))))))

(clojure.core/defn- response-idempotent-parameter-mismatch-exception ([input] (response-idempotent-parameter-mismatch-exception nil input)) ([resultWrapper1948861 input] (clojure.core/let [rawinput1948860 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948862 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-celebrity-recognition-response ([input] (response-get-celebrity-recognition-response nil input)) ([resultWrapper1948864 input] (clojure.core/let [rawinput1948863 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948865 {"JobStatus" (rawinput1948863 "JobStatus"), "StatusMessage" (rawinput1948863 "StatusMessage"), "VideoMetadata" (rawinput1948863 "VideoMetadata"), "NextToken" (rawinput1948863 "NextToken"), "Celebrities" (rawinput1948863 "Celebrities")}] (clojure.core/cond-> {} (letvar1948865 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1948865 ["JobStatus"]))) (letvar1948865 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1948865 ["StatusMessage"]))) (letvar1948865 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1948865 ["VideoMetadata"]))) (letvar1948865 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1948865 ["NextToken"]))) (letvar1948865 "Celebrities") (clojure.core/assoc :celebrities (deser-celebrity-recognitions (clojure.core/get-in letvar1948865 ["Celebrities"])))))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper1948867 input] (clojure.core/let [rawinput1948866 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948868 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-celebrity-info-response ([input] (response-get-celebrity-info-response nil input)) ([resultWrapper1948870 input] (clojure.core/let [rawinput1948869 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948871 {"Urls" (rawinput1948869 "Urls"), "Name" (rawinput1948869 "Name")}] (clojure.core/cond-> {} (letvar1948871 "Urls") (clojure.core/assoc :urls (deser-urls (clojure.core/get-in letvar1948871 ["Urls"]))) (letvar1948871 "Name") (clojure.core/assoc :name (deser-string (clojure.core/get-in letvar1948871 ["Name"])))))))

(clojure.core/defn- response-describe-stream-processor-response ([input] (response-describe-stream-processor-response nil input)) ([resultWrapper1948873 input] (clojure.core/let [rawinput1948872 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948874 {"LastUpdateTimestamp" (rawinput1948872 "LastUpdateTimestamp"), "StatusMessage" (rawinput1948872 "StatusMessage"), "RoleArn" (rawinput1948872 "RoleArn"), "Status" (rawinput1948872 "Status"), "CreationTimestamp" (rawinput1948872 "CreationTimestamp"), "Input" (rawinput1948872 "Input"), "Settings" (rawinput1948872 "Settings"), "StreamProcessorArn" (rawinput1948872 "StreamProcessorArn"), "Output" (rawinput1948872 "Output"), "Name" (rawinput1948872 "Name")}] (clojure.core/cond-> {} (letvar1948874 "LastUpdateTimestamp") (clojure.core/assoc :last-update-timestamp (deser-date-time (clojure.core/get-in letvar1948874 ["LastUpdateTimestamp"]))) (letvar1948874 "StatusMessage") (clojure.core/assoc :status-message (deser-string (clojure.core/get-in letvar1948874 ["StatusMessage"]))) (letvar1948874 "RoleArn") (clojure.core/assoc :role-arn (deser-role-arn (clojure.core/get-in letvar1948874 ["RoleArn"]))) (letvar1948874 "Status") (clojure.core/assoc :status (deser-stream-processor-status (clojure.core/get-in letvar1948874 ["Status"]))) (letvar1948874 "CreationTimestamp") (clojure.core/assoc :creation-timestamp (deser-date-time (clojure.core/get-in letvar1948874 ["CreationTimestamp"]))) (letvar1948874 "Input") (clojure.core/assoc :input (deser-stream-processor-input (clojure.core/get-in letvar1948874 ["Input"]))) (letvar1948874 "Settings") (clojure.core/assoc :settings (deser-stream-processor-settings (clojure.core/get-in letvar1948874 ["Settings"]))) (letvar1948874 "StreamProcessorArn") (clojure.core/assoc :stream-processor-arn (deser-stream-processor-arn (clojure.core/get-in letvar1948874 ["StreamProcessorArn"]))) (letvar1948874 "Output") (clojure.core/assoc :output (deser-stream-processor-output (clojure.core/get-in letvar1948874 ["Output"]))) (letvar1948874 "Name") (clojure.core/assoc :name (deser-stream-processor-name (clojure.core/get-in letvar1948874 ["Name"])))))))

(clojure.core/defn- response-detect-moderation-labels-response ([input] (response-detect-moderation-labels-response nil input)) ([resultWrapper1948876 input] (clojure.core/let [rawinput1948875 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948877 {"ModerationLabels" (rawinput1948875 "ModerationLabels"), "ModerationModelVersion" (rawinput1948875 "ModerationModelVersion")}] (clojure.core/cond-> {} (letvar1948877 "ModerationLabels") (clojure.core/assoc :moderation-labels (deser-moderation-labels (clojure.core/get-in letvar1948877 ["ModerationLabels"]))) (letvar1948877 "ModerationModelVersion") (clojure.core/assoc :moderation-model-version (deser-string (clojure.core/get-in letvar1948877 ["ModerationModelVersion"])))))))

(clojure.core/defn- response-delete-collection-response ([input] (response-delete-collection-response nil input)) ([resultWrapper1948879 input] (clojure.core/let [rawinput1948878 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948880 {"StatusCode" (rawinput1948878 "StatusCode")}] (clojure.core/cond-> {} (letvar1948880 "StatusCode") (clojure.core/assoc :status-code (deser-u-integer (clojure.core/get-in letvar1948880 ["StatusCode"])))))))

(clojure.core/defn- response-start-face-detection-response ([input] (response-start-face-detection-response nil input)) ([resultWrapper1948882 input] (clojure.core/let [rawinput1948881 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948883 {"JobId" (rawinput1948881 "JobId")}] (clojure.core/cond-> {} (letvar1948883 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1948883 ["JobId"])))))))

(clojure.core/defn- response-list-collections-response ([input] (response-list-collections-response nil input)) ([resultWrapper1948885 input] (clojure.core/let [rawinput1948884 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948886 {"CollectionIds" (rawinput1948884 "CollectionIds"), "NextToken" (rawinput1948884 "NextToken"), "FaceModelVersions" (rawinput1948884 "FaceModelVersions")}] (clojure.core/cond-> {} (letvar1948886 "CollectionIds") (clojure.core/assoc :collection-ids (deser-collection-id-list (clojure.core/get-in letvar1948886 ["CollectionIds"]))) (letvar1948886 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1948886 ["NextToken"]))) (letvar1948886 "FaceModelVersions") (clojure.core/assoc :face-model-versions (deser-face-model-version-list (clojure.core/get-in letvar1948886 ["FaceModelVersions"])))))))

(clojure.core/defn- response-detect-faces-response ([input] (response-detect-faces-response nil input)) ([resultWrapper1948888 input] (clojure.core/let [rawinput1948887 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948889 {"FaceDetails" (rawinput1948887 "FaceDetails"), "OrientationCorrection" (rawinput1948887 "OrientationCorrection")}] (clojure.core/cond-> {} (letvar1948889 "FaceDetails") (clojure.core/assoc :face-details (deser-face-detail-list (clojure.core/get-in letvar1948889 ["FaceDetails"]))) (letvar1948889 "OrientationCorrection") (clojure.core/assoc :orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1948889 ["OrientationCorrection"])))))))

(clojure.core/defn- response-video-too-large-exception ([input] (response-video-too-large-exception nil input)) ([resultWrapper1948891 input] (clojure.core/let [rawinput1948890 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948892 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-content-moderation-response ([input] (response-get-content-moderation-response nil input)) ([resultWrapper1948894 input] (clojure.core/let [rawinput1948893 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948895 {"JobStatus" (rawinput1948893 "JobStatus"), "StatusMessage" (rawinput1948893 "StatusMessage"), "VideoMetadata" (rawinput1948893 "VideoMetadata"), "ModerationLabels" (rawinput1948893 "ModerationLabels"), "NextToken" (rawinput1948893 "NextToken"), "ModerationModelVersion" (rawinput1948893 "ModerationModelVersion")}] (clojure.core/cond-> {} (letvar1948895 "JobStatus") (clojure.core/assoc :job-status (deser-video-job-status (clojure.core/get-in letvar1948895 ["JobStatus"]))) (letvar1948895 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar1948895 ["StatusMessage"]))) (letvar1948895 "VideoMetadata") (clojure.core/assoc :video-metadata (deser-video-metadata (clojure.core/get-in letvar1948895 ["VideoMetadata"]))) (letvar1948895 "ModerationLabels") (clojure.core/assoc :moderation-labels (deser-content-moderation-detections (clojure.core/get-in letvar1948895 ["ModerationLabels"]))) (letvar1948895 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar1948895 ["NextToken"]))) (letvar1948895 "ModerationModelVersion") (clojure.core/assoc :moderation-model-version (deser-string (clojure.core/get-in letvar1948895 ["ModerationModelVersion"])))))))

(clojure.core/defn- response-start-celebrity-recognition-response ([input] (response-start-celebrity-recognition-response nil input)) ([resultWrapper1948897 input] (clojure.core/let [rawinput1948896 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948898 {"JobId" (rawinput1948896 "JobId")}] (clojure.core/cond-> {} (letvar1948898 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1948898 ["JobId"])))))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper1948900 input] (clojure.core/let [rawinput1948899 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948901 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper1948903 input] (clojure.core/let [rawinput1948902 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948904 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-stream-processor-response ([input] (response-start-stream-processor-response nil input)) ([resultWrapper1948906 input] (clojure.core/let [rawinput1948905 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948907 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-image-too-large-exception ([input] (response-image-too-large-exception nil input)) ([resultWrapper1948909 input] (clojure.core/let [rawinput1948908 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948910 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper1948912 input] (clojure.core/let [rawinput1948911 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948913 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-person-tracking-response ([input] (response-start-person-tracking-response nil input)) ([resultWrapper1948915 input] (clojure.core/let [rawinput1948914 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948916 {"JobId" (rawinput1948914 "JobId")}] (clojure.core/cond-> {} (letvar1948916 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar1948916 ["JobId"])))))))

(clojure.core/defn- response-detect-labels-response ([input] (response-detect-labels-response nil input)) ([resultWrapper1948918 input] (clojure.core/let [rawinput1948917 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948919 {"Labels" (rawinput1948917 "Labels"), "OrientationCorrection" (rawinput1948917 "OrientationCorrection"), "LabelModelVersion" (rawinput1948917 "LabelModelVersion")}] (clojure.core/cond-> {} (letvar1948919 "Labels") (clojure.core/assoc :labels (deser-labels (clojure.core/get-in letvar1948919 ["Labels"]))) (letvar1948919 "OrientationCorrection") (clojure.core/assoc :orientation-correction (deser-orientation-correction (clojure.core/get-in letvar1948919 ["OrientationCorrection"]))) (letvar1948919 "LabelModelVersion") (clojure.core/assoc :label-model-version (deser-string (clojure.core/get-in letvar1948919 ["LabelModelVersion"])))))))

(clojure.core/defn- response-describe-collection-response ([input] (response-describe-collection-response nil input)) ([resultWrapper1948921 input] (clojure.core/let [rawinput1948920 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948922 {"FaceCount" (rawinput1948920 "FaceCount"), "FaceModelVersion" (rawinput1948920 "FaceModelVersion"), "CollectionARN" (rawinput1948920 "CollectionARN"), "CreationTimestamp" (rawinput1948920 "CreationTimestamp")}] (clojure.core/cond-> {} (letvar1948922 "FaceCount") (clojure.core/assoc :face-count (deser-u-long (clojure.core/get-in letvar1948922 ["FaceCount"]))) (letvar1948922 "FaceModelVersion") (clojure.core/assoc :face-model-version (deser-string (clojure.core/get-in letvar1948922 ["FaceModelVersion"]))) (letvar1948922 "CollectionARN") (clojure.core/assoc :collection-arn (deser-string (clojure.core/get-in letvar1948922 ["CollectionARN"]))) (letvar1948922 "CreationTimestamp") (clojure.core/assoc :creation-timestamp (deser-date-time (clojure.core/get-in letvar1948922 ["CreationTimestamp"])))))))

(clojure.core/defn- response-invalid-pagination-token-exception ([input] (response-invalid-pagination-token-exception nil input)) ([resultWrapper1948924 input] (clojure.core/let [rawinput1948923 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948925 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-provisioned-throughput-exceeded-exception ([input] (response-provisioned-throughput-exceeded-exception nil input)) ([resultWrapper1948927 input] (clojure.core/let [rawinput1948926 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1948928 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/face))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-match-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/face-match))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-attributes #{:default :all "DEFAULT" "ALL"})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.person-detail/index (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/person-index))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.person-detail/face (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/person-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.person-detail/index :portkey.aws.rekognition.-2016-06-27/bounding-box :portkey.aws.rekognition.-2016-06-27.person-detail/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.sunglasses/value (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.sunglasses/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/sunglasses (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.sunglasses/value :portkey.aws.rekognition.-2016-06-27.sunglasses/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-faces-response/faces (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-faces-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-faces-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/list-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.list-faces-response/faces :portkey.aws.rekognition.-2016-06-27.list-faces-response/next-token :portkey.aws.rekognition.-2016-06-27.list-faces-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.create-stream-processor-request/input (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-input))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.create-stream-processor-request/output (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-output))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.create-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.create-stream-processor-request/settings (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-settings))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/create-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27.create-stream-processor-request/input :portkey.aws.rekognition.-2016-06-27.create-stream-processor-request/output :portkey.aws.rekognition.-2016-06-27.create-stream-processor-request/name :portkey.aws.rekognition.-2016-06-27.create-stream-processor-request/settings :portkey.aws.rekognition.-2016-06-27/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.stream-processor/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.stream-processor/status (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/stream-processor (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.stream-processor/name :portkey.aws.rekognition.-2016-06-27.stream-processor/status]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.start-face-search-request/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-face-search-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/video :portkey.aws.rekognition.-2016-06-27/collection-id] :opt-un [:portkey.aws.rekognition.-2016-06-27/client-request-token :portkey.aws.rekognition.-2016-06-27.start-face-search-request/face-match-threshold :portkey.aws.rekognition.-2016-06-27/notification-channel :portkey.aws.rekognition.-2016-06-27/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/stop-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.text-detection/detected-text (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.text-detection/type (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/text-types))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.text-detection/id (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.text-detection/parent-id (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.text-detection/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/text-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.text-detection/detected-text :portkey.aws.rekognition.-2016-06-27.text-detection/type :portkey.aws.rekognition.-2016-06-27.text-detection/id :portkey.aws.rekognition.-2016-06-27.text-detection/parent-id :portkey.aws.rekognition.-2016-06-27.text-detection/confidence :portkey.aws.rekognition.-2016-06-27/geometry]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/urls (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/url))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/stream-processor-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/stream-processor))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/invalid-image-format-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.parent/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/parent (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.parent/name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.face-detection/face (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/timestamp :portkey.aws.rekognition.-2016-06-27.face-detection/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.recognize-celebrities-response/celebrity-faces (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/celebrity-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.recognize-celebrities-response/unrecognized-faces (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/compared-face-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/recognize-celebrities-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.recognize-celebrities-response/celebrity-faces :portkey.aws.rekognition.-2016-06-27.recognize-celebrities-response/unrecognized-faces :portkey.aws.rekognition.-2016-06-27/orientation-correction]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/person-index clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-stream-processors-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/list-stream-processors-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.list-stream-processors-request/next-token :portkey.aws.rekognition.-2016-06-27/max-results]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/describe-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27.describe-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-_]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-label-detection-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-label-detection-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-label-detection-response/labels (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/label-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-label-detection-response/label-model-version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-label-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.get-label-detection-response/job-status :portkey.aws.rekognition.-2016-06-27/status-message :portkey.aws.rekognition.-2016-06-27/video-metadata :portkey.aws.rekognition.-2016-06-27.get-label-detection-response/next-token :portkey.aws.rekognition.-2016-06-27.get-label-detection-response/labels :portkey.aws.rekognition.-2016-06-27.get-label-detection-response/label-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/landmarks (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/landmark))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-label-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.delete-faces-response/deleted-faces (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-id-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/delete-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.delete-faces-response/deleted-faces]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/s-3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-person-tracking-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-person-tracking-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-person-tracking-response/persons (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/person-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-person-tracking-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.get-person-tracking-response/job-status :portkey.aws.rekognition.-2016-06-27/status-message :portkey.aws.rekognition.-2016-06-27/video-metadata :portkey.aws.rekognition.-2016-06-27.get-person-tracking-response/next-token :portkey.aws.rekognition.-2016-06-27.get-person-tracking-response/persons]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/stream-processor-output (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/kinesis-data-stream]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/page-size (clojure.spec.alpha/int-in 0 4096))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compare-faces-response/source-image-face (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/compared-source-image-face))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compare-faces-response/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/compare-faces-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compare-faces-response/unmatched-faces (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/compare-faces-unmatch-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compare-faces-response/source-image-orientation-correction (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/orientation-correction))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compare-faces-response/target-image-orientation-correction (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/orientation-correction))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/compare-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.compare-faces-response/source-image-face :portkey.aws.rekognition.-2016-06-27.compare-faces-response/face-matches :portkey.aws.rekognition.-2016-06-27.compare-faces-response/unmatched-faces :portkey.aws.rekognition.-2016-06-27.compare-faces-response/source-image-orientation-correction :portkey.aws.rekognition.-2016-06-27.compare-faces-response/target-image-orientation-correction]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-id-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/face-id :min-count 1 :max-count 4096))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.bounding-box/width (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.bounding-box/height (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.bounding-box/left (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.bounding-box/top (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/bounding-box (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.bounding-box/width :portkey.aws.rekognition.-2016-06-27.bounding-box/height :portkey.aws.rekognition.-2016-06-27.bounding-box/left :portkey.aws.rekognition.-2016-06-27.bounding-box/top]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/face-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.smile/value (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.smile/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/smile (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.smile/value :portkey.aws.rekognition.-2016-06-27.smile/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/detect-text-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/image] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.age-range/low (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.age-range/high (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/age-range (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.age-range/low :portkey.aws.rekognition.-2016-06-27.age-range/high]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/person-tracking-sort-by #{"INDEX" "TIMESTAMP" :index :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/image-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-search-sort-by #{"INDEX" "TIMESTAMP" :index :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.detect-moderation-labels-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/detect-moderation-labels-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/image] :opt-un [:portkey.aws.rekognition.-2016-06-27.detect-moderation-labels-request/min-confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.search-faces-response/searched-face-id (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-id))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.search-faces-response/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.search-faces-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/search-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.search-faces-response/searched-face-id :portkey.aws.rekognition.-2016-06-27.search-faces-response/face-matches :portkey.aws.rekognition.-2016-06-27.search-faces-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.search-faces-by-image-request/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/search-faces-by-image-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/collection-id :portkey.aws.rekognition.-2016-06-27/image] :opt-un [:portkey.aws.rekognition.-2016-06-27/max-faces :portkey.aws.rekognition.-2016-06-27.search-faces-by-image-request/face-match-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.landmark/type (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/landmark-type))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.landmark/x (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.landmark/y (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/landmark (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.landmark/type :portkey.aws.rekognition.-2016-06-27.landmark/x :portkey.aws.rekognition.-2016-06-27.landmark/y]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/video (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/s-3-object]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/emotions (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/emotion))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.celebrity/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.celebrity/id (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/rekognition-unique-id))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.celebrity/face (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/compared-face))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.celebrity/match-confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/celebrity (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/urls :portkey.aws.rekognition.-2016-06-27.celebrity/name :portkey.aws.rekognition.-2016-06-27.celebrity/id :portkey.aws.rekognition.-2016-06-27.celebrity/face :portkey.aws.rekognition.-2016-06-27.celebrity/match-confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-face-search-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/geometry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/bounding-box :portkey.aws.rekognition.-2016-06-27/polygon]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.celebrity-detail/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.celebrity-detail/id (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/rekognition-unique-id))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.celebrity-detail/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.celebrity-detail/face (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/celebrity-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/urls :portkey.aws.rekognition.-2016-06-27.celebrity-detail/name :portkey.aws.rekognition.-2016-06-27.celebrity-detail/id :portkey.aws.rekognition.-2016-06-27.celebrity-detail/confidence :portkey.aws.rekognition.-2016-06-27/bounding-box :portkey.aws.rekognition.-2016-06-27.celebrity-detail/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-face-detection-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-face-detection-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-face-detection-response/faces (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-face-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.get-face-detection-response/job-status :portkey.aws.rekognition.-2016-06-27/status-message :portkey.aws.rekognition.-2016-06-27/video-metadata :portkey.aws.rekognition.-2016-06-27.get-face-detection-response/next-token :portkey.aws.rekognition.-2016-06-27.get-face-detection-response/faces]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.emotion/type (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/emotion-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.emotion/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/emotion (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.emotion/type :portkey.aws.rekognition.-2016-06-27.emotion/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-record (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/face :portkey.aws.rekognition.-2016-06-27/face-detail]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.eye-open/value (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.eye-open/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/eye-open (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.eye-open/value :portkey.aws.rekognition.-2016-06-27.eye-open/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.detect-text-response/text-detections (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/text-detection-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/detect-text-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.detect-text-response/text-detections]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/delete-collection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/collection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/celebrity-recognitions (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/celebrity-recognition))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-person-tracking-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/video] :opt-un [:portkey.aws.rekognition.-2016-06-27/client-request-token :portkey.aws.rekognition.-2016-06-27/notification-channel :portkey.aws.rekognition.-2016-06-27/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.mustache/value (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.mustache/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/mustache (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.mustache/value :portkey.aws.rekognition.-2016-06-27.mustache/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-model-version-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/string))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/job-tag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 256)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-:]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/collection-id-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/collection-id))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.search-faces-by-image-response/searched-face-bounding-box (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/bounding-box))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.search-faces-by-image-response/searched-face-confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.search-faces-by-image-response/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.search-faces-by-image-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/search-faces-by-image-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.search-faces-by-image-response/searched-face-bounding-box :portkey.aws.rekognition.-2016-06-27.search-faces-by-image-response/searched-face-confidence :portkey.aws.rekognition.-2016-06-27.search-faces-by-image-response/face-matches :portkey.aws.rekognition.-2016-06-27.search-faces-by-image-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/compare-faces-unmatch-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/compared-face))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/label-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/timestamp :portkey.aws.rekognition.-2016-06-27/label]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/resource-in-use-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/s-3-object-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/recognize-celebrities-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/image] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.start-content-moderation-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-content-moderation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/video] :opt-un [:portkey.aws.rekognition.-2016-06-27.start-content-moderation-request/min-confidence :portkey.aws.rekognition.-2016-06-27/client-request-token :portkey.aws.rekognition.-2016-06-27/notification-channel :portkey.aws.rekognition.-2016-06-27/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-face-search-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-face-search-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-face-search-response/persons (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/person-matches))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-face-search-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.get-face-search-response/job-status :portkey.aws.rekognition.-2016-06-27/status-message :portkey.aws.rekognition.-2016-06-27.get-face-search-response/next-token :portkey.aws.rekognition.-2016-06-27/video-metadata :portkey.aws.rekognition.-2016-06-27.get-face-search-response/persons]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.kinesis-data-stream/arn (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/kinesis-data-arn))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/kinesis-data-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.kinesis-data-stream/arn]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/text-detection-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/text-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/resource-already-exists-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.face-match/similarity (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.face-match/similarity :portkey.aws.rekognition.-2016-06-27/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/image-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/u-integer (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-celebrity-info-request/id (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/rekognition-unique-id))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-celebrity-info-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27.get-celebrity-info-request/id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.gender/value (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/gender-type))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.gender/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/gender (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.gender/value :portkey.aws.rekognition.-2016-06-27.gender/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compared-source-image-face/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/compared-source-image-face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/bounding-box :portkey.aws.rekognition.-2016-06-27.compared-source-image-face/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-content-moderation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/unindexed-face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/reasons :portkey.aws.rekognition.-2016-06-27/face-detail]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/delete-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/percent clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.face-search-settings/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-search-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/collection-id :portkey.aws.rekognition.-2016-06-27.face-search-settings/face-match-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/unindexed-faces (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/unindexed-face))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/create-collection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/collection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/attribute #{:default :all "DEFAULT" "ALL"})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.index-faces-response/face-records (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-record-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.index-faces-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/index-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.index-faces-response/face-records :portkey.aws.rekognition.-2016-06-27/orientation-correction :portkey.aws.rekognition.-2016-06-27.index-faces-response/face-model-version :portkey.aws.rekognition.-2016-06-27/unindexed-faces]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.pose/roll (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/degree))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.pose/yaw (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/degree))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.pose/pitch (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/degree))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/pose (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.pose/roll :portkey.aws.rekognition.-2016-06-27.pose/yaw :portkey.aws.rekognition.-2016-06-27.pose/pitch]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.person-match/person (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/person-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.person-match/face-matches (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-match-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/person-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/timestamp :portkey.aws.rekognition.-2016-06-27.person-match/person :portkey.aws.rekognition.-2016-06-27.person-match/face-matches]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-celebrity-recognition-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-celebrity-recognition-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/celebrity-recognition-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-celebrity-recognition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/job-id] :opt-un [:portkey.aws.rekognition.-2016-06-27/max-results :portkey.aws.rekognition.-2016-06-27.get-celebrity-recognition-request/next-token :portkey.aws.rekognition.-2016-06-27.get-celebrity-recognition-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.create-collection-response/status-code (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.create-collection-response/collection-arn (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.create-collection-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/create-collection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.create-collection-response/status-code :portkey.aws.rekognition.-2016-06-27.create-collection-response/collection-arn :portkey.aws.rekognition.-2016-06-27.create-collection-response/face-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/celebrity-recognition-sort-by #{"TIMESTAMP" "ID" :id :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/attributes (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/attribute))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.face/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/face-id :portkey.aws.rekognition.-2016-06-27/bounding-box :portkey.aws.rekognition.-2016-06-27/image-id :portkey.aws.rekognition.-2016-06-27/external-image-id :portkey.aws.rekognition.-2016-06-27.face/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.kinesis-video-stream/arn (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/kinesis-video-arn))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/kinesis-video-stream (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.kinesis-video-stream/arn]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.mouth-open/value (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.mouth-open/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/mouth-open (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.mouth-open/value :portkey.aws.rekognition.-2016-06-27.mouth-open/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-collections-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-collections-request/max-results (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/page-size))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/list-collections-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.list-collections-request/next-token :portkey.aws.rekognition.-2016-06-27.list-collections-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.moderation-label/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.moderation-label/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.moderation-label/parent-name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/moderation-label (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.moderation-label/confidence :portkey.aws.rekognition.-2016-06-27.moderation-label/name :portkey.aws.rekognition.-2016-06-27.moderation-label/parent-name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.person-detection/person (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/person-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/person-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/timestamp :portkey.aws.rekognition.-2016-06-27.person-detection/person]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.index-faces-request/detection-attributes (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/attributes))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.index-faces-request/max-faces (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/max-faces-to-index))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/index-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/collection-id :portkey.aws.rekognition.-2016-06-27/image] :opt-un [:portkey.aws.rekognition.-2016-06-27/external-image-id :portkey.aws.rekognition.-2016-06-27.index-faces-request/detection-attributes :portkey.aws.rekognition.-2016-06-27.index-faces-request/max-faces :portkey.aws.rekognition.-2016-06-27/quality-filter]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.delete-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/delete-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27.delete-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/detect-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/image] :opt-un [:portkey.aws.rekognition.-2016-06-27/attributes]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/moderation-labels (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/moderation-label))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/max-faces (clojure.spec.alpha/int-in 1 4096))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/create-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/stream-processor-arn]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/person-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/person-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-celebrity-recognition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/video] :opt-un [:portkey.aws.rekognition.-2016-06-27/client-request-token :portkey.aws.rekognition.-2016-06-27/notification-channel :portkey.aws.rekognition.-2016-06-27/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-stream-processors-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-stream-processors-response/stream-processors (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/list-stream-processors-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.list-stream-processors-response/next-token :portkey.aws.rekognition.-2016-06-27.list-stream-processors-response/stream-processors]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.stop-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/stop-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27.stop-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/stream-processor-input (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/kinesis-video-stream]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/content-moderation-sort-by #{"TIMESTAMP" "NAME" :name :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/labels (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/label))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-celebrity-recognition-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-celebrity-recognition-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-celebrity-recognition-response/celebrities (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/celebrity-recognitions))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-celebrity-recognition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.get-celebrity-recognition-response/job-status :portkey.aws.rekognition.-2016-06-27/status-message :portkey.aws.rekognition.-2016-06-27/video-metadata :portkey.aws.rekognition.-2016-06-27.get-celebrity-recognition-response/next-token :portkey.aws.rekognition.-2016-06-27.get-celebrity-recognition-response/celebrities]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.stream-processor-settings/face-search (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-search-settings))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/stream-processor-settings (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.stream-processor-settings/face-search]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/person-matches (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/person-match))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/stream-processor-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(^arn:[a-z\d-]+:rekognition:[a-z\d-]+:\d{12}:streamprocessor\/.+$)" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.point/x (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.point/y (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.point/x :portkey.aws.rekognition.-2016-06-27.point/y]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/label-detection-sort-by #{"TIMESTAMP" "NAME" :name :timestamp})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/landmark-type #{:eye-left :mouth-down :right-eye-left :right-eye-brow-up "rightEyeBrowUp" :upper-jawline-left :right-eye-brow-right "leftEyeRight" "rightEyeUp" "leftEyeLeft" "eyeRight" "leftEyeBrowUp" "rightEyeRight" :left-pupil "rightEyeLeft" "leftEyeUp" :left-eye-brow-right "mouthDown" "upperJawlineRight" :mouth-right :mid-jawline-left :right-eye-down :right-pupil :mouth-up "chinBottom" :left-eye-brow-left "upperJawlineLeft" :nose-left :left-eye-brow-up "midJawlineRight" "rightPupil" "leftPupil" "noseRight" :upper-jawline-right "rightEyeBrowLeft" :right-eye-brow-left "nose" "midJawlineLeft" "eyeLeft" "mouthUp" :mouth-left "mouthLeft" "rightEyeBrowRight" "mouthRight" :right-eye-up :left-eye-left "noseLeft" "leftEyeBrowLeft" :mid-jawline-right :nose :chin-bottom :left-eye-up :left-eye-down :left-eye-right "leftEyeBrowRight" :eye-right :right-eye-right :nose-right "leftEyeDown" "rightEyeDown"})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/describe-collection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/collection-id] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compare-faces-request/source-image (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/image))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compare-faces-request/target-image (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/image))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compare-faces-request/similarity-threshold (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/compare-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27.compare-faces-request/source-image :portkey.aws.rekognition.-2016-06-27.compare-faces-request/target-image] :opt-un [:portkey.aws.rekognition.-2016-06-27.compare-faces-request/similarity-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/sns-topic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(^arn:aws:sns:.*:\w{12}:.+$)" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.search-faces-request/face-match-threshold (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/search-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/collection-id :portkey.aws.rekognition.-2016-06-27/face-id] :opt-un [:portkey.aws.rekognition.-2016-06-27/max-faces :portkey.aws.rekognition.-2016-06-27.search-faces-request/face-match-threshold]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/compare-faces-match-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/compare-faces-match))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/gender-type #{:female :male "Male" "Female"})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-person-tracking-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-person-tracking-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/person-tracking-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-person-tracking-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/job-id] :opt-un [:portkey.aws.rekognition.-2016-06-27/max-results :portkey.aws.rekognition.-2016-06-27.get-person-tracking-request/next-token :portkey.aws.rekognition.-2016-06-27.get-person-tracking-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-celebrity-info-response/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-celebrity-info-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/urls :portkey.aws.rekognition.-2016-06-27.get-celebrity-info-response/name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/last-update-timestamp (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/date-time))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/status-message (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/status (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/date-time))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/input (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-input))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/settings (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-settings))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/output (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-output))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/describe-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/last-update-timestamp :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/status-message :portkey.aws.rekognition.-2016-06-27/role-arn :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/status :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/creation-timestamp :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/input :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/settings :portkey.aws.rekognition.-2016-06-27/stream-processor-arn :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/output :portkey.aws.rekognition.-2016-06-27.describe-stream-processor-response/name]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.label/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.label/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/label (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.label/name :portkey.aws.rekognition.-2016-06-27.label/confidence :portkey.aws.rekognition.-2016-06-27/instances :portkey.aws.rekognition.-2016-06-27/parents]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/u-long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/kinesis-data-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(^arn:([a-z\d-]+):kinesis:([a-z\d-]+):\d{12}:.+$)" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.detect-moderation-labels-response/moderation-model-version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/detect-moderation-labels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/moderation-labels :portkey.aws.rekognition.-2016-06-27.detect-moderation-labels-response/moderation-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.face-detail/eyes-open (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/eye-open))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.face-detail/quality (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/image-quality))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.face-detail/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-detail (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/sunglasses :portkey.aws.rekognition.-2016-06-27/landmarks :portkey.aws.rekognition.-2016-06-27/bounding-box :portkey.aws.rekognition.-2016-06-27/smile :portkey.aws.rekognition.-2016-06-27/age-range :portkey.aws.rekognition.-2016-06-27/emotions :portkey.aws.rekognition.-2016-06-27/mustache :portkey.aws.rekognition.-2016-06-27.face-detail/eyes-open :portkey.aws.rekognition.-2016-06-27/gender :portkey.aws.rekognition.-2016-06-27/pose :portkey.aws.rekognition.-2016-06-27.face-detail/quality :portkey.aws.rekognition.-2016-06-27/mouth-open :portkey.aws.rekognition.-2016-06-27/eyeglasses :portkey.aws.rekognition.-2016-06-27.face-detail/confidence :portkey.aws.rekognition.-2016-06-27/beard]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 3 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[0-9A-Za-z\.\-_]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.delete-faces-request/face-ids (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-id-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/delete-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/collection-id :portkey.aws.rekognition.-2016-06-27.delete-faces-request/face-ids] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.detect-labels-request/max-labels (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.detect-labels-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/detect-labels-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/image] :opt-un [:portkey.aws.rekognition.-2016-06-27.detect-labels-request/max-labels :portkey.aws.rekognition.-2016-06-27.detect-labels-request/min-confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.delete-collection-response/status-code (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/delete-collection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.delete-collection-response/status-code]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-face-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-collections-response/collection-ids (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/collection-id-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-collections-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-collections-response/face-model-versions (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-model-version-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/list-collections-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.list-collections-response/collection-ids :portkey.aws.rekognition.-2016-06-27.list-collections-response/next-token :portkey.aws.rekognition.-2016-06-27.list-collections-response/face-model-versions]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.detect-faces-response/face-details (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-detail-list))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/detect-faces-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.detect-faces-response/face-details :portkey.aws.rekognition.-2016-06-27/orientation-correction]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/kinesis-video-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(^arn:([a-z\d-]+):kinesisvideo:([a-z\d-]+):\d{12}:.+$)" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-label-detection-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-label-detection-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/label-detection-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-label-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/job-id] :opt-un [:portkey.aws.rekognition.-2016-06-27/max-results :portkey.aws.rekognition.-2016-06-27.get-label-detection-request/next-token :portkey.aws.rekognition.-2016-06-27.get-label-detection-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/notification-channel (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/sns-topic-arn :portkey.aws.rekognition.-2016-06-27/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/degree clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/rekognition-unique-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[0-9A-Za-z]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/stream-processor-status #{:starting :running :stopping :stopped "STOPPED" "STARTING" "FAILED" "STOPPING" :failed "RUNNING"})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/timestamp clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/video-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/label-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/label-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-content-moderation-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-content-moderation-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/content-moderation-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-content-moderation-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/job-id] :opt-un [:portkey.aws.rekognition.-2016-06-27/max-results :portkey.aws.rekognition.-2016-06-27.get-content-moderation-request/next-token :portkey.aws.rekognition.-2016-06-27.get-content-moderation-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-face-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/video] :opt-un [:portkey.aws.rekognition.-2016-06-27/client-request-token :portkey.aws.rekognition.-2016-06-27/notification-channel :portkey.aws.rekognition.-2016-06-27/face-attributes :portkey.aws.rekognition.-2016-06-27/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/text-types #{"WORD" "LINE" :line :word})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-content-moderation-response/job-status (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/video-job-status))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-content-moderation-response/moderation-labels (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/content-moderation-detections))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-content-moderation-response/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-content-moderation-response/moderation-model-version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-content-moderation-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.get-content-moderation-response/job-status :portkey.aws.rekognition.-2016-06-27/status-message :portkey.aws.rekognition.-2016-06-27/video-metadata :portkey.aws.rekognition.-2016-06-27.get-content-moderation-response/moderation-labels :portkey.aws.rekognition.-2016-06-27.get-content-moderation-response/next-token :portkey.aws.rekognition.-2016-06-27.get-content-moderation-response/moderation-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/reasons (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/reason))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/content-moderation-detections (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/content-moderation-detection))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-face-search-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-face-search-request/sort-by (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/face-search-sort-by))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-face-search-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/job-id] :opt-un [:portkey.aws.rekognition.-2016-06-27/max-results :portkey.aws.rekognition.-2016-06-27.get-face-search-request/next-token :portkey.aws.rekognition.-2016-06-27.get-face-search-request/sort-by]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.image-quality/brightness (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.image-quality/sharpness (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/image-quality (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.image-quality/brightness :portkey.aws.rekognition.-2016-06-27.image-quality/sharpness]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/reason #{"EXTREME_POSE" "LOW_BRIGHTNESS" :low-confidence :exceeds-max-faces :low-sharpness "LOW_CONFIDENCE" :extreme-pose "SMALL_BOUNDING_BOX" "EXCEEDS_MAX_FACES" "LOW_SHARPNESS" :small-bounding-box :low-brightness})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-celebrity-recognition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-detail-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/face-detail))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/orientation-correction #{:rotate-90 "ROTATE_0" "ROTATE_180" "ROTATE_90" :rotate-180 :rotate-0 "ROTATE_270" :rotate-270})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.instance/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/instance (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/bounding-box :portkey.aws.rekognition.-2016-06-27.instance/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/compared-face-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/compared-face))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.video-metadata/codec (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.video-metadata/duration-millis (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.video-metadata/format (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.video-metadata/frame-rate (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/float))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.video-metadata/frame-height (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.video-metadata/frame-width (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/video-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.video-metadata/codec :portkey.aws.rekognition.-2016-06-27.video-metadata/duration-millis :portkey.aws.rekognition.-2016-06-27.video-metadata/format :portkey.aws.rekognition.-2016-06-27.video-metadata/frame-rate :portkey.aws.rekognition.-2016-06-27.video-metadata/frame-height :portkey.aws.rekognition.-2016-06-27.video-metadata/frame-width]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/emotion-name #{"UNKNOWN" :disgusted "ANGRY" :sad :calm :unknown :happy :confused "HAPPY" "CONFUSED" "DISGUSTED" "CALM" "SAD" "SURPRISED" :surprised :angry})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.image/bytes (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/image-blob))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/image (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.image/bytes :portkey.aws.rekognition.-2016-06-27/s-3-object]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/polygon (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/point))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-stream-processor-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/max-faces-to-index (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.start-label-detection-request/min-confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-label-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/video] :opt-un [:portkey.aws.rekognition.-2016-06-27/client-request-token :portkey.aws.rekognition.-2016-06-27.start-label-detection-request/min-confidence :portkey.aws.rekognition.-2016-06-27/notification-channel :portkey.aws.rekognition.-2016-06-27/job-tag]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.start-stream-processor-request/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stream-processor-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-stream-processor-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27.start-stream-processor-request/name] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compare-faces-match/similarity (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compare-faces-match/face (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/compared-face))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/compare-faces-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.compare-faces-match/similarity :portkey.aws.rekognition.-2016-06-27.compare-faces-match/face]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.eyeglasses/value (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.eyeglasses/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/eyeglasses (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.eyeglasses/value :portkey.aws.rekognition.-2016-06-27.eyeglasses/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/image-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/stream-processor-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 128)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.celebrity-recognition/celebrity (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/celebrity-detail))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/celebrity-recognition (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/timestamp :portkey.aws.rekognition.-2016-06-27.celebrity-recognition/celebrity]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/start-person-tracking-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/job-id]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/quality-filter #{"AUTO" "NONE" :auto :none})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/parents (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/parent))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/external-image-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-:]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/instances (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/instance))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compared-face/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.compared-face/quality (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/image-quality))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/compared-face (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/bounding-box :portkey.aws.rekognition.-2016-06-27.compared-face/confidence :portkey.aws.rekognition.-2016-06-27/landmarks :portkey.aws.rekognition.-2016-06-27/pose :portkey.aws.rekognition.-2016-06-27.compared-face/quality]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/face-record-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/face-record))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/video-job-status #{"IN_PROGRESS" :in-progress "SUCCEEDED" "FAILED" :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/celebrity-list (clojure.spec.alpha/coll-of :portkey.aws.rekognition.-2016-06-27/celebrity))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.s-3-object/bucket (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.s-3-object/name (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/s-3-object-name))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.s-3-object/version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/s-3-object-version))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/s-3-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.s-3-object/bucket :portkey.aws.rekognition.-2016-06-27.s-3-object/name :portkey.aws.rekognition.-2016-06-27.s-3-object/version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.detect-labels-response/label-model-version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/detect-labels-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/labels :portkey.aws.rekognition.-2016-06-27/orientation-correction :portkey.aws.rekognition.-2016-06-27.detect-labels-response/label-model-version]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-collection-response/face-count (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/u-long))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-collection-response/face-model-version (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-collection-response/collection-arn (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/string))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.describe-collection-response/creation-timestamp (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/date-time))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/describe-collection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.describe-collection-response/face-count :portkey.aws.rekognition.-2016-06-27.describe-collection-response/face-model-version :portkey.aws.rekognition.-2016-06-27.describe-collection-response/collection-arn :portkey.aws.rekognition.-2016-06-27.describe-collection-response/creation-timestamp]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/date-time clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/collection-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-faces-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.list-faces-request/max-results (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/page-size))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/list-faces-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/collection-id] :opt-un [:portkey.aws.rekognition.-2016-06-27.list-faces-request/next-token :portkey.aws.rekognition.-2016-06-27.list-faces-request/max-results]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/invalid-pagination-token-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.beard/value (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/boolean))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.beard/confidence (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/beard (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27.beard/value :portkey.aws.rekognition.-2016-06-27.beard/confidence]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/boolean clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27.get-face-detection-request/next-token (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/get-face-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.rekognition.-2016-06-27/job-id] :opt-un [:portkey.aws.rekognition.-2016-06-27/max-results :portkey.aws.rekognition.-2016-06-27.get-face-detection-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/content-moderation-detection (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.rekognition.-2016-06-27/timestamp :portkey.aws.rekognition.-2016-06-27/moderation-label]))

(clojure.spec.alpha/def :portkey.aws.rekognition.-2016-06-27/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-_]+$" s__1410940__auto__))))

(clojure.core/defn get-label-detection "Gets the label detection results of a Amazon Rekognition Video analysis started\nby StartLabelDetection.\n The label detection operation is started by a call to StartLabelDetection which\nreturns a job identifier (JobId). When the label detection operation finishes,\nAmazon Rekognition publishes a completion status to the Amazon Simple\nNotification Service topic registered in the initial call to\nStartlabelDetection. To get the results of the label detection operation, first\ncheck that the status value published to the Amazon SNS topic is SUCCEEDED. If\nso, call GetLabelDetection and pass the job identifier (JobId) from the initial\ncall to StartLabelDetection.\n GetLabelDetection returns an array of detected labels (Labels) sorted by the\ntime the labels were detected. You can also sort by the label name by specifying\nNAME for the SortBy input parameter.\n The labels returned include the label name, the percentage confidence in the\naccuracy of the detected label, and the time the label was detected in the\nvideo.\n The returned labels also include bounding box information for common objects, a\nhierarchical taxonomy of detected labels, and the version of the label model\nused for detection.\n Use MaxResults parameter to limit the number of labels returned. If there are\nmore results than specified in MaxResults, the value of NextToken in the\noperation response contains a pagination token for getting the next set of\nresults. To get the next page of results, call GetlabelDetection and populate\nthe NextToken request parameter with the token value returned from the previous\ncall to GetLabelDetection." ([get-label-detection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-label-detection-request get-label-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/get-label-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/get-label-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetLabelDetection", :http.request.configuration/output-deser-fn response-get-label-detection-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition.-2016-06-27/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception}})))))
(clojure.spec.alpha/fdef get-label-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/get-label-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/get-label-detection-response))

(clojure.core/defn stop-stream-processor "Stops a running stream processor that was created by CreateStreamProcessor." ([stop-stream-processor-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-stop-stream-processor-request stop-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/stop-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/stop-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StopStreamProcessor", :http.request.configuration/output-deser-fn response-stop-stream-processor-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "ResourceInUseException" :portkey.aws.rekognition.-2016-06-27/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef stop-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/stop-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/stop-stream-processor-response))

(clojure.core/defn start-content-moderation " Starts asynchronous detection of explicit or suggestive adult content in a\nstored video.\n Amazon Rekognition Video can moderate content in a video stored in an Amazon S3\nbucket. Use Video to specify the bucket name and the filename of the video.\nStartContentModeration returns a job identifier (JobId) which you use to get the\nresults of the analysis. When content moderation analysis is finished, Amazon\nRekognition Video publishes a completion status to the Amazon Simple\nNotification Service topic that you specify in NotificationChannel.\n To get the results of the content moderation analysis, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetContentModeration and pass the job identifier (JobId) from the initial call\nto StartContentModeration.\n For more information, see Detecting Unsafe Content in the Amazon Rekognition\nDeveloper Guide." ([start-content-moderation-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-content-moderation-request start-content-moderation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/start-content-moderation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/start-content-moderation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartContentModeration", :http.request.configuration/output-deser-fn response-start-content-moderation-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition.-2016-06-27/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition.-2016-06-27/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition.-2016-06-27/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-content-moderation :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/start-content-moderation-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/start-content-moderation-response))

(clojure.core/defn get-celebrity-info "Gets the name and additional information about a celebrity based on his or her\nAmazon Rekognition ID. The additional information is returned as an array of\nURLs. If there is no additional information about the celebrity, this list is\nempty.\n For more information, see Recognizing Celebrities in an Image in the Amazon\nRekognition Developer Guide.\n This operation requires permissions to perform the rekognition:GetCelebrityInfo\naction." ([get-celebrity-info-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-celebrity-info-request get-celebrity-info-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/get-celebrity-info-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/get-celebrity-info-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCelebrityInfo", :http.request.configuration/output-deser-fn response-get-celebrity-info-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef get-celebrity-info :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/get-celebrity-info-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/get-celebrity-info-response))

(clojure.core/defn compare-faces "Compares a face in the source input image with each of the 100 largest faces\ndetected in the target input image.\n If the source image contains multiple faces, the service detects the largest\nface and compares it with each face detected in the target image.\n You pass the input and target images either as base64-encoded image bytes or as\nreferences to images in an Amazon S3 bucket. If you use the AWS CLI to call\nAmazon Rekognition operations, passing image bytes isn't supported. The image\nmust be formatted as a PNG or JPEG file.\n In response, the operation returns an array of face matches ordered by\nsimilarity score in descending order. For each face match, the response provides\na bounding box of the face, facial landmarks, pose details (pitch, role, and\nyaw), quality (brightness and sharpness), and confidence value (indicating the\nlevel of confidence that the bounding box contains a face). The response also\nprovides a similarity score, which indicates how closely the faces match.\n By default, only faces with a similarity score of greater than or equal to 80%\nare returned in the response. You can change this value by specifying the\nSimilarityThreshold parameter.\n CompareFaces also returns an array of faces that don't match the source image.\nFor each face, it returns a bounding box, confidence value, landmarks, pose\ndetails, and quality. The response also returns information about the face in\nthe source image, including the bounding box of the face and confidence value.\n If the image doesn't contain Exif metadata, CompareFaces returns orientation\ninformation for the source and target images. Use these values to display the\nimages with the correct image orientation.\n If no faces are detected in the source or target images, CompareFaces returns\nan InvalidParameterException error.\n This is a stateless API operation. That is, data returned by this operation\ndoesn't persist.\n For an example, see Comparing Faces in Images in the Amazon Rekognition\nDeveloper Guide.\n This operation requires permissions to perform the rekognition:CompareFaces\naction." ([compare-faces-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-compare-faces-request compare-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/compare-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/compare-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CompareFaces", :http.request.configuration/output-deser-fn response-compare-faces-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "ImageTooLargeException" :portkey.aws.rekognition.-2016-06-27/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition.-2016-06-27/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef compare-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/compare-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/compare-faces-response))

(clojure.core/defn list-collections "Returns list of collection IDs in your account. If the result is truncated, the\nresponse also provides a NextToken that you can use in the subsequent request to\nfetch the next set of collection IDs.\n For an example, see Listing Collections in the Amazon Rekognition Developer\nGuide.\n This operation requires permissions to perform the rekognition:ListCollections\naction." ([] (list-collections {})) ([list-collections-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-collections-request list-collections-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/list-collections-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/list-collections-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListCollections", :http.request.configuration/output-deser-fn response-list-collections-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition.-2016-06-27/invalid-pagination-token-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-collections :args (clojure.spec.alpha/? :portkey.aws.rekognition.-2016-06-27/list-collections-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/list-collections-response))

(clojure.core/defn recognize-celebrities "Returns an array of celebrities recognized in the input image. For more\ninformation, see Recognizing Celebrities in the Amazon Rekognition Developer\nGuide.\n RecognizeCelebrities returns the 100 largest faces in the image. It lists\nrecognized celebrities in the CelebrityFaces array and unrecognized faces in the\nUnrecognizedFaces array. RecognizeCelebrities doesn't return celebrities whose\nfaces aren't among the largest 100 faces in the image.\n For each celebrity recognized, RecognizeCelebrities returns a Celebrity object.\nThe Celebrity object contains the celebrity name, ID, URL links to additional\ninformation, match confidence, and a ComparedFace object that you can use to\nlocate the celebrity's face on the image.\n Amazon Rekognition doesn't retain information about which images a celebrity\nhas been recognized in. Your application must store this information and use the\nCelebrity ID property as a unique identifier for the celebrity. If you don't\nstore the celebrity name or additional information URLs returned by\nRecognizeCelebrities, you will need the ID to identify the celebrity in a call\nto the GetCelebrityInfo operation.\n You pass the input image either as base64-encoded image bytes or as a reference\nto an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon\nRekognition operations, passing image bytes is not supported. The image must be\neither a PNG or JPEG formatted file.\n For an example, see Recognizing Celebrities in an Image in the Amazon\nRekognition Developer Guide.\n This operation requires permissions to perform the\nrekognition:RecognizeCelebrities operation." ([recognize-celebrities-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-recognize-celebrities-request recognize-celebrities-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/recognize-celebrities-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/recognize-celebrities-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "RecognizeCelebrities", :http.request.configuration/output-deser-fn response-recognize-celebrities-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "InvalidImageFormatException" :portkey.aws.rekognition.-2016-06-27/invalid-image-format-exception, "ImageTooLargeException" :portkey.aws.rekognition.-2016-06-27/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef recognize-celebrities :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/recognize-celebrities-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/recognize-celebrities-response))

(clojure.core/defn create-stream-processor "Creates an Amazon Rekognition stream processor that you can use to detect and\nrecognize faces in a streaming video.\n Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video\nStreams. Amazon Rekognition Video sends analysis results to Amazon Kinesis Data\nStreams.\n You provide as input a Kinesis video stream (Input) and a Kinesis data stream\n(Output) stream. You also specify the face recognition criteria in Settings. For\nexample, the collection containing faces that you want to recognize. Use Name to\nassign an identifier for the stream processor. You use Name to manage the stream\nprocessor. For example, you can start processing the source video by calling\nStartStreamProcessor with the Name field.\n After you have finished analyzing a streaming video, use StopStreamProcessor to\nstop processing. You can delete the stream processor by calling\nDeleteStreamProcessor." ([create-stream-processor-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-stream-processor-request create-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/create-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/create-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateStreamProcessor", :http.request.configuration/output-deser-fn response-create-stream-processor-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "LimitExceededException" :portkey.aws.rekognition.-2016-06-27/limit-exceeded-exception, "ResourceInUseException" :portkey.aws.rekognition.-2016-06-27/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef create-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/create-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/create-stream-processor-response))

(clojure.core/defn start-celebrity-recognition "Starts asynchronous recognition of celebrities in a stored video.\n Amazon Rekognition Video can detect celebrities in a video must be stored in an\nAmazon S3 bucket. Use Video to specify the bucket name and the filename of the\nvideo. StartCelebrityRecognition returns a job identifier (JobId) which you use\nto get the results of the analysis. When celebrity recognition analysis is\nfinished, Amazon Rekognition Video publishes a completion status to the Amazon\nSimple Notification Service topic that you specify in NotificationChannel. To\nget the results of the celebrity recognition analysis, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetCelebrityRecognition and pass the job identifier (JobId) from the initial\ncall to StartCelebrityRecognition.\n For more information, see Recognizing Celebrities in the Amazon Rekognition\nDeveloper Guide." ([start-celebrity-recognition-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-celebrity-recognition-request start-celebrity-recognition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/start-celebrity-recognition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/start-celebrity-recognition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartCelebrityRecognition", :http.request.configuration/output-deser-fn response-start-celebrity-recognition-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition.-2016-06-27/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition.-2016-06-27/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition.-2016-06-27/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-celebrity-recognition :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/start-celebrity-recognition-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/start-celebrity-recognition-response))

(clojure.core/defn start-face-search "Starts the asynchronous search for faces in a collection that match the faces of\npersons detected in a stored video.\n The video must be stored in an Amazon S3 bucket. Use Video to specify the\nbucket name and the filename of the video. StartFaceSearch returns a job\nidentifier (JobId) which you use to get the search results once the search has\ncompleted. When searching is finished, Amazon Rekognition Video publishes a\ncompletion status to the Amazon Simple Notification Service topic that you\nspecify in NotificationChannel. To get the search results, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetFaceSearch and pass the job identifier (JobId) from the initial call to\nStartFaceSearch. For more information, see procedure-person-search-videos." ([start-face-search-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-face-search-request start-face-search-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/start-face-search-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/start-face-search-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartFaceSearch", :http.request.configuration/output-deser-fn response-start-face-search-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition.-2016-06-27/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition.-2016-06-27/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition.-2016-06-27/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-face-search :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/start-face-search-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/start-face-search-response))

(clojure.core/defn get-person-tracking "Gets the path tracking results of a Amazon Rekognition Video analysis started by\nStartPersonTracking.\n The person path tracking operation is started by a call to StartPersonTracking\nwhich returns a job identifier (JobId). When the operation finishes, Amazon\nRekognition Video publishes a completion status to the Amazon Simple\nNotification Service topic registered in the initial call to\nStartPersonTracking.\n To get the results of the person path tracking operation, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetPersonTracking and pass the job identifier (JobId) from the initial call to\nStartPersonTracking.\n GetPersonTracking returns an array, Persons, of tracked persons and the time(s)\ntheir paths were tracked in the video.\n GetPersonTracking only returns the default facial attributes (BoundingBox,\nConfidence, Landmarks, Pose, and Quality). The other facial attributes listed in\nthe Face object of the following response syntax are not returned.\n For more information, see FaceDetail in the Amazon Rekognition Developer Guide.\n By default, the array is sorted by the time(s) a person's path is tracked in\nthe video. You can sort by tracked persons by specifying INDEX for the SortBy\ninput parameter.\n Use the MaxResults parameter to limit the number of items returned. If there\nare more results than specified in MaxResults, the value of NextToken in the\noperation response contains a pagination token for getting the next set of\nresults. To get the next page of results, call GetPersonTracking and populate\nthe NextToken request parameter with the token value returned from the previous\ncall to GetPersonTracking." ([get-person-tracking-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-person-tracking-request get-person-tracking-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/get-person-tracking-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/get-person-tracking-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetPersonTracking", :http.request.configuration/output-deser-fn response-get-person-tracking-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition.-2016-06-27/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception}})))))
(clojure.spec.alpha/fdef get-person-tracking :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/get-person-tracking-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/get-person-tracking-response))

(clojure.core/defn detect-labels "Detects instances of real-world entities within an image (JPEG or PNG) provided\nas input. This includes objects like flower, tree, and table; events like\nwedding, graduation, and birthday party; and concepts like landscape, evening,\nand nature.\n For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the\nAmazon Rekognition Developer Guide.\n DetectLabels does not support the detection of activities. However, activity\ndetection is supported for label detection in videos. For more information, see\nStartLabelDetection in the Amazon Rekognition Developer Guide.\n You pass the input image as base64-encoded image bytes or as a reference to an\nimage in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition\noperations, passing image bytes is not supported. The image must be either a PNG\nor JPEG formatted file.\n For each object, scene, and concept the API returns one or more labels. Each\nlabel provides the object name, and the level of confidence that the image\ncontains the object. For example, suppose the input image has a lighthouse, the\nsea, and a rock. The response includes all three labels, one for each object.\n {Name: lighthouse, Confidence: 98.4629}\n {Name: rock,Confidence: 79.2097}\n {Name: sea,Confidence: 75.061}\n In the preceding example, the operation returns one label for each of the three\nobjects. The operation can also return multiple labels for the same object in\nthe image. For example, if the input image shows a flower (for example, a\ntulip), the operation might return the following three labels.\n {Name: flower,Confidence: 99.0562}\n {Name: plant,Confidence: 99.0562}\n {Name: tulip,Confidence: 99.0562}\n In this example, the detection algorithm more precisely identifies the flower\nas a tulip.\n In response, the API returns an array of labels. In addition, the response also\nincludes the orientation correction. Optionally, you can specify MinConfidence\nto control the confidence threshold for the labels returned. The default is 55%.\nYou can also add the MaxLabels parameter to limit the number of labels returned.\n If the object detected is a person, the operation doesn't provide the same\nfacial details that the DetectFaces operation provides.\n DetectLabels returns bounding boxes for instances of common object labels in an\narray of Instance objects. An Instance object contains a BoundingBox object, for\nthe location of the label on the image. It also includes the confidence by which\nthe bounding box was detected.\n DetectLabels also returns a hierarchical taxonomy of detected labels. For\nexample, a detected car might be assigned the label car. The label car has two\nparent labels: Vehicle (its parent) and Transportation (its grandparent). The\nresponse returns the entire list of ancestors for a label. Each ancestor is a\nunique label in the response. In the previous example, Car, Vehicle, and\nTransportation are returned as unique labels in the response.\n This is a stateless API operation. That is, the operation does not persist any\ndata.\n This operation requires permissions to perform the rekognition:DetectLabels\naction." ([detect-labels-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-labels-request detect-labels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/detect-labels-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/detect-labels-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectLabels", :http.request.configuration/output-deser-fn response-detect-labels-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition.-2016-06-27/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition.-2016-06-27/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-labels :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/detect-labels-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/detect-labels-response))

(clojure.core/defn detect-moderation-labels "Detects explicit or suggestive adult content in a specified JPEG or PNG format\nimage. Use DetectModerationLabels to moderate images depending on your\nrequirements. For example, you might want to filter images that contain nudity,\nbut not images containing suggestive content.\n To filter images, use the labels returned by DetectModerationLabels to\ndetermine which types of content are appropriate.\n For information about moderation labels, see Detecting Unsafe Content in the\nAmazon Rekognition Developer Guide.\n You pass the input image either as base64-encoded image bytes or as a reference\nto an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon\nRekognition operations, passing image bytes is not supported. The image must be\neither a PNG or JPEG formatted file." ([detect-moderation-labels-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-moderation-labels-request detect-moderation-labels-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/detect-moderation-labels-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/detect-moderation-labels-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectModerationLabels", :http.request.configuration/output-deser-fn response-detect-moderation-labels-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition.-2016-06-27/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition.-2016-06-27/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-moderation-labels :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/detect-moderation-labels-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/detect-moderation-labels-response))

(clojure.core/defn get-celebrity-recognition "Gets the celebrity recognition results for a Amazon Rekognition Video analysis\nstarted by StartCelebrityRecognition.\n Celebrity recognition in a video is an asynchronous operation. Analysis is\nstarted by a call to StartCelebrityRecognition which returns a job identifier\n(JobId). When the celebrity recognition operation finishes, Amazon Rekognition\nVideo publishes a completion status to the Amazon Simple Notification Service\ntopic registered in the initial call to StartCelebrityRecognition. To get the\nresults of the celebrity recognition analysis, first check that the status value\npublished to the Amazon SNS topic is SUCCEEDED. If so, call\nGetCelebrityDetection and pass the job identifier (JobId) from the initial call\nto StartCelebrityDetection.\n For more information, see Working With Stored Videos in the Amazon Rekognition\nDeveloper Guide.\n GetCelebrityRecognition returns detected celebrities and the time(s) they are\ndetected in an array (Celebrities) of CelebrityRecognition objects. Each\nCelebrityRecognition contains information about the celebrity in a\nCelebrityDetail object and the time, Timestamp, the celebrity was detected.\n GetCelebrityRecognition only returns the default facial attributes\n(BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial\nattributes listed in the Face object of the following response syntax are not\nreturned. For more information, see FaceDetail in the Amazon Rekognition\nDeveloper Guide.\n By default, the Celebrities array is sorted by time (milliseconds from the\nstart of the video). You can also sort the array by celebrity by specifying the\nvalue ID in the SortBy input parameter.\n The CelebrityDetail object includes the celebrity identifer and additional\ninformation urls. If you don't store the additional information urls, you can\nget them later by calling GetCelebrityInfo with the celebrity identifer.\n No information is returned for faces not recognized as celebrities.\n Use MaxResults parameter to limit the number of labels returned. If there are\nmore results than specified in MaxResults, the value of NextToken in the\noperation response contains a pagination token for getting the next set of\nresults. To get the next page of results, call GetCelebrityDetection and\npopulate the NextToken request parameter with the token value returned from the\nprevious call to GetCelebrityRecognition." ([get-celebrity-recognition-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-celebrity-recognition-request get-celebrity-recognition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/get-celebrity-recognition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/get-celebrity-recognition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetCelebrityRecognition", :http.request.configuration/output-deser-fn response-get-celebrity-recognition-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition.-2016-06-27/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception}})))))
(clojure.spec.alpha/fdef get-celebrity-recognition :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/get-celebrity-recognition-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/get-celebrity-recognition-response))

(clojure.core/defn start-face-detection "Starts asynchronous detection of faces in a stored video.\n Amazon Rekognition Video can detect faces in a video stored in an Amazon S3\nbucket. Use Video to specify the bucket name and the filename of the video.\nStartFaceDetection returns a job identifier (JobId) that you use to get the\nresults of the operation. When face detection is finished, Amazon Rekognition\nVideo publishes a completion status to the Amazon Simple Notification Service\ntopic that you specify in NotificationChannel. To get the results of the face\ndetection operation, first check that the status value published to the Amazon\nSNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier\n(JobId) from the initial call to StartFaceDetection.\n For more information, see Detecting Faces in a Stored Video in the Amazon\nRekognition Developer Guide." ([start-face-detection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-face-detection-request start-face-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/start-face-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/start-face-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartFaceDetection", :http.request.configuration/output-deser-fn response-start-face-detection-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition.-2016-06-27/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition.-2016-06-27/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition.-2016-06-27/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-face-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/start-face-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/start-face-detection-response))

(clojure.core/defn describe-collection "Describes the specified collection. You can use DescribeCollection to get\ninformation, such as the number of faces indexed into a collection and the\nversion of the model used by the collection for face detection.\n For more information, see Describing a Collection in the Amazon Rekognition\nDeveloper Guide." ([describe-collection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-collection-request describe-collection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/describe-collection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/describe-collection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeCollection", :http.request.configuration/output-deser-fn response-describe-collection-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef describe-collection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/describe-collection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/describe-collection-response))

(clojure.core/defn detect-text "Detects text in the input image and converts it into machine-readable text.\n Pass the input image as base64-encoded image bytes or as a reference to an\nimage in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition\noperations, you must pass it as a reference to an image in an Amazon S3 bucket.\nFor the AWS CLI, passing image bytes is not supported. The image must be either\na .png or .jpeg formatted file.\n The DetectText operation returns text in an array of TextDetection elements,\nTextDetections. Each TextDetection element provides information about a single\nword or line of text that was detected in the image.\n A word is one or more ISO basic latin script characters that are not separated\nby spaces. DetectText can detect up to 50 words in an image.\n A line is a string of equally spaced words. A line isn't necessarily a complete\nsentence. For example, a driver's license number is detected as a line. A line\nends when there is no aligned text after it. Also, a line ends when there is a\nlarge gap between words, relative to the length of the words. This means,\ndepending on the gap between words, Amazon Rekognition may detect multiple lines\nin text aligned in the same direction. Periods don't represent the end of a\nline. If a sentence spans multiple lines, the DetectText operation returns\nmultiple lines.\n To determine whether a TextDetection element is a line of text or a word, use\nthe TextDetection object Type field.\n To be detected, text must be within +/- 90 degrees orientation of the\nhorizontal axis.\n For more information, see DetectText in the Amazon Rekognition Developer Guide." ([detect-text-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-text-request detect-text-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/detect-text-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/detect-text-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectText", :http.request.configuration/output-deser-fn response-detect-text-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition.-2016-06-27/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition.-2016-06-27/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-text :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/detect-text-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/detect-text-response))

(clojure.core/defn start-person-tracking "Starts the asynchronous tracking of a person's path in a stored video.\n Amazon Rekognition Video can track the path of people in a video stored in an\nAmazon S3 bucket. Use Video to specify the bucket name and the filename of the\nvideo. StartPersonTracking returns a job identifier (JobId) which you use to get\nthe results of the operation. When label detection is finished, Amazon\nRekognition publishes a completion status to the Amazon Simple Notification\nService topic that you specify in NotificationChannel.\n To get the results of the person detection operation, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetPersonTracking and pass the job identifier (JobId) from the initial call to\nStartPersonTracking." ([start-person-tracking-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-person-tracking-request start-person-tracking-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/start-person-tracking-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/start-person-tracking-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartPersonTracking", :http.request.configuration/output-deser-fn response-start-person-tracking-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition.-2016-06-27/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition.-2016-06-27/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition.-2016-06-27/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-person-tracking :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/start-person-tracking-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/start-person-tracking-response))

(clojure.core/defn delete-stream-processor "Deletes the stream processor identified by Name. You assign the value for Name\nwhen you create the stream processor with CreateStreamProcessor. You might not\nbe able to use the same name for a stream processor for a few seconds after\ncalling DeleteStreamProcessor." ([delete-stream-processor-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-stream-processor-request delete-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/delete-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/delete-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteStreamProcessor", :http.request.configuration/output-deser-fn response-delete-stream-processor-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "ResourceInUseException" :portkey.aws.rekognition.-2016-06-27/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef delete-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/delete-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/delete-stream-processor-response))

(clojure.core/defn create-collection "Creates a collection in an AWS Region. You can add faces to the collection using\nthe IndexFaces operation.\n For example, you might create collections, one for each of your application\nusers. A user can then index faces using the IndexFaces operation and persist\nresults in a specific collection. Then, a user can search the collection for\nfaces in the user-specific container.\n When you create a collection, it is associated with the latest version of the\nface model version.\n Collection names are case-sensitive.\n This operation requires permissions to perform the rekognition:CreateCollection\naction." ([create-collection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-create-collection-request create-collection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/create-collection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/create-collection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "CreateCollection", :http.request.configuration/output-deser-fn response-create-collection-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceAlreadyExistsException" :portkey.aws.rekognition.-2016-06-27/resource-already-exists-exception}})))))
(clojure.spec.alpha/fdef create-collection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/create-collection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/create-collection-response))

(clojure.core/defn delete-faces "Deletes faces from a collection. You specify a collection ID and an array of\nface IDs to remove from the collection.\n This operation requires permissions to perform the rekognition:DeleteFaces\naction." ([delete-faces-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-faces-request delete-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/delete-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/delete-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteFaces", :http.request.configuration/output-deser-fn response-delete-faces-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/delete-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/delete-faces-response))

(clojure.core/defn list-faces "Returns metadata for faces in the specified collection. This metadata includes\ninformation such as the bounding box coordinates, the confidence (that the\nbounding box contains a face), and face ID. For an example, see Listing Faces in\na Collection in the Amazon Rekognition Developer Guide.\n This operation requires permissions to perform the rekognition:ListFaces\naction." ([list-faces-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-faces-request list-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/list-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/list-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListFaces", :http.request.configuration/output-deser-fn response-list-faces-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition.-2016-06-27/invalid-pagination-token-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef list-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/list-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/list-faces-response))

(clojure.core/defn get-content-moderation "Gets the content moderation analysis results for a Amazon Rekognition Video\nanalysis started by StartContentModeration.\n Content moderation analysis of a video is an asynchronous operation. You start\nanalysis by calling StartContentModeration. which returns a job identifier\n(JobId). When analysis finishes, Amazon Rekognition Video publishes a completion\nstatus to the Amazon Simple Notification Service topic registered in the initial\ncall to StartContentModeration. To get the results of the content moderation\nanalysis, first check that the status value published to the Amazon SNS topic is\nSUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId)\nfrom the initial call to StartCelebrityDetection.\n For more information, see Working with Stored Videos in the Amazon Rekognition\nDevlopers Guide.\n GetContentModeration returns detected content moderation labels, and the time\nthey are detected, in an array, ModerationLabels, of ContentModerationDetection\nobjects.\n By default, the moderated labels are returned sorted by time, in milliseconds\nfrom the start of the video. You can also sort them by moderated label by\nspecifying NAME for the SortBy input parameter.\n Since video analysis can return a large number of results, use the MaxResults\nparameter to limit the number of labels returned in a single call to\nGetContentModeration. If there are more results than specified in MaxResults,\nthe value of NextToken in the operation response contains a pagination token for\ngetting the next set of results. To get the next page of results, call\nGetContentModeration and populate the NextToken request parameter with the value\nof NextToken returned from the previous call to GetContentModeration.\n For more information, see Detecting Unsafe Content in the Amazon Rekognition\nDeveloper Guide." ([get-content-moderation-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-content-moderation-request get-content-moderation-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/get-content-moderation-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/get-content-moderation-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetContentModeration", :http.request.configuration/output-deser-fn response-get-content-moderation-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition.-2016-06-27/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception}})))))
(clojure.spec.alpha/fdef get-content-moderation :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/get-content-moderation-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/get-content-moderation-response))

(clojure.core/defn delete-collection "Deletes the specified collection. Note that this operation removes all faces in\nthe collection. For an example, see delete-collection-procedure.\n This operation requires permissions to perform the rekognition:DeleteCollection\naction." ([delete-collection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-delete-collection-request delete-collection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/delete-collection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/delete-collection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DeleteCollection", :http.request.configuration/output-deser-fn response-delete-collection-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef delete-collection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/delete-collection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/delete-collection-response))

(clojure.core/defn search-faces "For a given input face ID, searches for matching faces in the collection the\nface belongs to. You get a face ID when you add a face to the collection using\nthe IndexFaces operation. The operation compares the features of the input face\nwith faces in the specified collection.\n You can also search faces without indexing faces by using the\nSearchFacesByImage operation.\n The operation response returns an array of faces that match, ordered by\nsimilarity score with the highest similarity first. More specifically, it is an\narray of metadata for each face match that is found. Along with the metadata,\nthe response also includes a confidence value for each face match, indicating\nthe confidence that the specific face matches the input face.\n For an example, see Searching for a Face Using Its Face ID in the Amazon\nRekognition Developer Guide.\n This operation requires permissions to perform the rekognition:SearchFaces\naction." ([search-faces-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-search-faces-request search-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/search-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/search-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchFaces", :http.request.configuration/output-deser-fn response-search-faces-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception}})))))
(clojure.spec.alpha/fdef search-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/search-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/search-faces-response))

(clojure.core/defn start-stream-processor "Starts processing a stream processor. You create a stream processor by calling\nCreateStreamProcessor. To tell StartStreamProcessor which stream processor to\nstart, use the value of the Name field specified in the call to\nCreateStreamProcessor." ([start-stream-processor-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-stream-processor-request start-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/start-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/start-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartStreamProcessor", :http.request.configuration/output-deser-fn response-start-stream-processor-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "ResourceInUseException" :portkey.aws.rekognition.-2016-06-27/resource-in-use-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/start-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/start-stream-processor-response))

(clojure.core/defn list-stream-processors "Gets a list of stream processors that you have created with\nCreateStreamProcessor." ([] (list-stream-processors {})) ([list-stream-processors-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-list-stream-processors-request list-stream-processors-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/list-stream-processors-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/list-stream-processors-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "ListStreamProcessors", :http.request.configuration/output-deser-fn response-list-stream-processors-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition.-2016-06-27/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef list-stream-processors :args (clojure.spec.alpha/? :portkey.aws.rekognition.-2016-06-27/list-stream-processors-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/list-stream-processors-response))

(clojure.core/defn detect-faces "Detects faces within an image that is provided as input.\n DetectFaces detects the 100 largest faces in the image. For each face detected,\nthe operation returns face details. These details include a bounding box of the\nface, a confidence value (that the bounding box contains a face), and a fixed\nset of attributes such as facial landmarks (for example, coordinates of eye and\nmouth), gender, presence of beard, sunglasses, and so on.\n The face-detection algorithm is most effective on frontal faces. For\nnon-frontal or obscured faces, the algorithm might not detect the faces or might\ndetect faces with lower confidence.\n You pass the input image either as base64-encoded image bytes or as a reference\nto an image in an Amazon S3 bucket. If you use the to call Amazon Rekognition\noperations, passing image bytes is not supported. The image must be either a PNG\nor JPEG formatted file.\n This is a stateless API operation. That is, the operation does not persist any\ndata.\n This operation requires permissions to perform the rekognition:DetectFaces\naction." ([detect-faces-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-faces-request detect-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/detect-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/detect-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectFaces", :http.request.configuration/output-deser-fn response-detect-faces-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ImageTooLargeException" :portkey.aws.rekognition.-2016-06-27/image-too-large-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "InvalidImageFormatException" :portkey.aws.rekognition.-2016-06-27/invalid-image-format-exception}})))))
(clojure.spec.alpha/fdef detect-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/detect-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/detect-faces-response))

(clojure.core/defn get-face-search "Gets the face search results for Amazon Rekognition Video face search started by\nStartFaceSearch. The search returns faces in a collection that match the faces\nof persons detected in a video. It also includes the time(s) that faces are\nmatched in the video.\n Face search in a video is an asynchronous operation. You start face search by\ncalling to StartFaceSearch which returns a job identifier (JobId). When the\nsearch operation finishes, Amazon Rekognition Video publishes a completion\nstatus to the Amazon Simple Notification Service topic registered in the initial\ncall to StartFaceSearch. To get the search results, first check that the status\nvalue published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch\nand pass the job identifier (JobId) from the initial call to StartFaceSearch.\n For more information, see Searching Faces in a Collection in the Amazon\nRekognition Developer Guide.\n The search results are retured in an array, Persons, of PersonMatch objects.\nEachPersonMatch element contains details about the matching faces in the input\ncollection, person information (facial attributes, bounding boxes, and person\nidentifer) for the matched person, and the time the person was matched in the\nvideo.\n GetFaceSearch only returns the default facial attributes (BoundingBox,\nConfidence, Landmarks, Pose, and Quality). The other facial attributes listed in\nthe Face object of the following response syntax are not returned. For more\ninformation, see FaceDetail in the Amazon Rekognition Developer Guide.\n By default, the Persons array is sorted by the time, in milliseconds from the\nstart of the video, persons are matched. You can also sort by persons by\nspecifying INDEX for the SORTBY input parameter." ([get-face-search-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-face-search-request get-face-search-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/get-face-search-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/get-face-search-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFaceSearch", :http.request.configuration/output-deser-fn response-get-face-search-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition.-2016-06-27/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception}})))))
(clojure.spec.alpha/fdef get-face-search :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/get-face-search-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/get-face-search-response))

(clojure.core/defn describe-stream-processor "Provides information about a stream processor created by CreateStreamProcessor.\nYou can get information about the input and output streams, the input parameters\nfor the face recognition being performed, and the current status of the stream\nprocessor." ([describe-stream-processor-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-describe-stream-processor-request describe-stream-processor-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/describe-stream-processor-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/describe-stream-processor-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DescribeStreamProcessor", :http.request.configuration/output-deser-fn response-describe-stream-processor-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef describe-stream-processor :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/describe-stream-processor-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/describe-stream-processor-response))

(clojure.core/defn index-faces "Detects faces in the input image and adds them to the specified collection.\n Amazon Rekognition doesn't save the actual faces that are detected. Instead,\nthe underlying detection algorithm first detects the faces in the input image.\nFor each face, the algorithm extracts facial features into a feature vector, and\nstores it in the backend database. Amazon Rekognition uses feature vectors when\nit performs face match and search operations using the SearchFaces and\nSearchFacesByImage operations.\n For more information, see Adding Faces to a Collection in the Amazon\nRekognition Developer Guide.\n To get the number of faces in a collection, call DescribeCollection.\n If you're using version 1.0 of the face detection model, IndexFaces indexes the\n15 largest faces in the input image. Later versions of the face detection model\nindex the 100 largest faces in the input image.\n If you're using version 4 or later of the face model, image orientation\ninformation is not returned in the OrientationCorrection field.\n To determine which version of the model you're using, call DescribeCollection\nand supply the collection ID. You can also get the model version from the value\nof FaceModelVersion in the response from IndexFaces\n For more information, see Model Versioning in the Amazon Rekognition Developer\nGuide.\n If you provide the optional ExternalImageID for the input image you provided,\nAmazon Rekognition associates this ID with all faces that it detects. When you\ncall the ListFaces operation, the response returns the external ID. You can use\nthis external image ID to create a client-side index to associate the faces with\neach image. You can then use the index to find all faces in an image.\n You can specify the maximum number of faces to index with the MaxFaces input\nparameter. This is useful when you want to index the largest faces in an image\nand don't want to index smaller faces, such as those belonging to people\nstanding in the background.\n The QualityFilter input parameter allows you to filter out detected faces that\ndon’t meet the required quality bar chosen by Amazon Rekognition. The quality\nbar is based on a variety of common use cases. By default, IndexFaces filters\ndetected faces. You can also explicitly filter detected faces by specifying AUTO\nfor the value of QualityFilter. If you do not want to filter detected faces,\nspecify NONE.\n To use quality filtering, you need a collection associated with version 3 of\nthe face model. To get the version of the face model associated with a\ncollection, call DescribeCollection.\n Information about faces detected in an image, but not indexed, is returned in\nan array of UnindexedFace objects, UnindexedFaces. Faces aren't indexed for\nreasons such as:\n * The number of faces detected exceeds the value of the MaxFaces request\nparameter.\n * The face is too small compared to the image dimensions.\n * The face is too blurry.\n * The image is too dark.\n * The face has an extreme pose.\n In response, the IndexFaces operation returns an array of metadata for all\ndetected faces, FaceRecords. This includes:\n * The bounding box, BoundingBox, of the detected face.\n * A confidence value, Confidence, which indicates the confidence that the\nbounding box contains a face.\n * A face ID, FaceId, assigned by the service for each face that's detected and\nstored.\n * An image ID, ImageId, assigned by the service for the input image.\n If you request all facial attributes (by using the detectionAttributes\nparameter), Amazon Rekognition returns detailed facial attributes, such as\nfacial landmarks (for example, location of eye and mouth) and other facial\nattributes like gender. If you provide the same image, specify the same\ncollection, and use the same external ID in the IndexFaces operation, Amazon\nRekognition doesn't save duplicate face metadata.\n The input image is passed either as base64-encoded image bytes, or as a\nreference to an image in an Amazon S3 bucket. If you use the AWS CLI to call\nAmazon Rekognition operations, passing image bytes isn't supported. The image\nmust be formatted as a PNG or JPEG file.\n This operation requires permissions to perform the rekognition:IndexFaces\naction." ([index-faces-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-index-faces-request index-faces-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/index-faces-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/index-faces-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "IndexFaces", :http.request.configuration/output-deser-fn response-index-faces-response, :http.request.spec/error-spec {"InvalidImageFormatException" :portkey.aws.rekognition.-2016-06-27/invalid-image-format-exception, "InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ImageTooLargeException" :portkey.aws.rekognition.-2016-06-27/image-too-large-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef index-faces :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/index-faces-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/index-faces-response))

(clojure.core/defn search-faces-by-image "For a given input image, first detects the largest face in the image, and then\nsearches the specified collection for matching faces. The operation compares the\nfeatures of the input face with faces in the specified collection.\n To search for all faces in an input image, you might first call the IndexFaces\noperation, and then use the face IDs returned in subsequent calls to the\nSearchFaces operation.\n You can also call the DetectFaces operation and use the bounding boxes in the\nresponse to make face crops, which then you can pass in to the\nSearchFacesByImage operation.\n You pass the input image either as base64-encoded image bytes or as a reference\nto an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon\nRekognition operations, passing image bytes is not supported. The image must be\neither a PNG or JPEG formatted file.\n The response returns an array of faces that match, ordered by similarity score\nwith the highest similarity first. More specifically, it is an array of metadata\nfor each face match found. Along with the metadata, the response also includes a\nsimilarity indicating how similar the face is to the input face. In the\nresponse, the operation also returns the bounding box (and a confidence level\nthat the bounding box contains a face) of the face that Amazon Rekognition used\nfor the input image.\n For an example, Searching for a Face Using an Image in the Amazon Rekognition\nDeveloper Guide.\n This operation requires permissions to perform the\nrekognition:SearchFacesByImage action." ([search-faces-by-image-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-search-faces-by-image-request search-faces-by-image-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/search-faces-by-image-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/search-faces-by-image-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "SearchFacesByImage", :http.request.configuration/output-deser-fn response-search-faces-by-image-response, :http.request.spec/error-spec {"InvalidImageFormatException" :portkey.aws.rekognition.-2016-06-27/invalid-image-format-exception, "InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "ImageTooLargeException" :portkey.aws.rekognition.-2016-06-27/image-too-large-exception, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef search-faces-by-image :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/search-faces-by-image-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/search-faces-by-image-response))

(clojure.core/defn start-label-detection "Starts asynchronous detection of labels in a stored video.\n Amazon Rekognition Video can detect labels in a video. Labels are instances of\nreal-world entities. This includes objects like flower, tree, and table; events\nlike wedding, graduation, and birthday party; concepts like landscape, evening,\nand nature; and activities like a person getting out of a car or a person\nskiing.\n The video must be stored in an Amazon S3 bucket. Use Video to specify the\nbucket name and the filename of the video. StartLabelDetection returns a job\nidentifier (JobId) which you use to get the results of the operation. When label\ndetection is finished, Amazon Rekognition Video publishes a completion status to\nthe Amazon Simple Notification Service topic that you specify in\nNotificationChannel.\n To get the results of the label detection operation, first check that the\nstatus value published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetLabelDetection and pass the job identifier (JobId) from the initial call to\nStartLabelDetection." ([start-label-detection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-label-detection-request start-label-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/start-label-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/start-label-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartLabelDetection", :http.request.configuration/output-deser-fn response-start-label-detection-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.rekognition.-2016-06-27/invalid-s-3-object-exception, "LimitExceededException" :portkey.aws.rekognition.-2016-06-27/limit-exceeded-exception, "IdempotentParameterMismatchException" :portkey.aws.rekognition.-2016-06-27/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "VideoTooLargeException" :portkey.aws.rekognition.-2016-06-27/video-too-large-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-label-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/start-label-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/start-label-detection-response))

(clojure.core/defn get-face-detection "Gets face detection results for a Amazon Rekognition Video analysis started by\nStartFaceDetection.\n Face detection with Amazon Rekognition Video is an asynchronous operation. You\nstart face detection by calling StartFaceDetection which returns a job\nidentifier (JobId). When the face detection operation finishes, Amazon\nRekognition Video publishes a completion status to the Amazon Simple\nNotification Service topic registered in the initial call to StartFaceDetection.\nTo get the results of the face detection operation, first check that the status\nvalue published to the Amazon SNS topic is SUCCEEDED. If so, call\nGetFaceDetection and pass the job identifier (JobId) from the initial call to\nStartFaceDetection.\n GetFaceDetection returns an array of detected faces (Faces) sorted by the time\nthe faces were detected.\n Use MaxResults parameter to limit the number of labels returned. If there are\nmore results than specified in MaxResults, the value of NextToken in the\noperation response contains a pagination token for getting the next set of\nresults. To get the next page of results, call GetFaceDetection and populate the\nNextToken request parameter with the token value returned from the previous call\nto GetFaceDetection." ([get-face-detection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-face-detection-request get-face-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.rekognition.-2016-06-27/endpoints, :http.request.configuration/target-prefix "RekognitionService", :http.request.spec/output-spec :portkey.aws.rekognition.-2016-06-27/get-face-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2016-06-27", :http.request.configuration/service-id "Rekognition", :http.request.spec/input-spec :portkey.aws.rekognition.-2016-06-27/get-face-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetFaceDetection", :http.request.configuration/output-deser-fn response-get-face-detection-response, :http.request.spec/error-spec {"AccessDeniedException" :portkey.aws.rekognition.-2016-06-27/access-denied-exception, "InternalServerError" :portkey.aws.rekognition.-2016-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.rekognition.-2016-06-27/invalid-parameter-exception, "InvalidPaginationTokenException" :portkey.aws.rekognition.-2016-06-27/invalid-pagination-token-exception, "ProvisionedThroughputExceededException" :portkey.aws.rekognition.-2016-06-27/provisioned-throughput-exceeded-exception, "ResourceNotFoundException" :portkey.aws.rekognition.-2016-06-27/resource-not-found-exception, "ThrottlingException" :portkey.aws.rekognition.-2016-06-27/throttling-exception}})))))
(clojure.spec.alpha/fdef get-face-detection :args (clojure.spec.alpha/tuple :portkey.aws.rekognition.-2016-06-27/get-face-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.rekognition.-2016-06-27/get-face-detection-response))
