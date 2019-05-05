(ns portkey.aws.textract.-2018-06-27 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-client-request-token)

(clojure.core/declare ser-s-3-object-version)

(clojure.core/declare ser-feature-type)

(clojure.core/declare ser-role-arn)

(clojure.core/declare ser-job-tag)

(clojure.core/declare ser-pagination-token)

(clojure.core/declare ser-s-3-object-name)

(clojure.core/declare ser-image-blob)

(clojure.core/declare ser-sns-topic-arn)

(clojure.core/declare ser-document-location)

(clojure.core/declare ser-s-3-bucket)

(clojure.core/declare ser-notification-channel)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-document)

(clojure.core/declare ser-feature-types)

(clojure.core/declare ser-s-3-object)

(clojure.core/declare ser-job-id)

(clojure.core/defn- ser-client-request-token [input] #:http.request.field{:value input, :shape "ClientRequestToken"})

(clojure.core/defn- ser-s-3-object-version [input] #:http.request.field{:value input, :shape "S3ObjectVersion"})

(clojure.core/defn- ser-feature-type [input] #:http.request.field{:value (clojure.core/get {"TABLES" "TABLES", :tables "TABLES", "FORMS" "FORMS", :forms "FORMS"} input), :shape "FeatureType"})

(clojure.core/defn- ser-role-arn [input] #:http.request.field{:value input, :shape "RoleArn"})

(clojure.core/defn- ser-job-tag [input] #:http.request.field{:value input, :shape "JobTag"})

(clojure.core/defn- ser-pagination-token [input] #:http.request.field{:value input, :shape "PaginationToken"})

(clojure.core/defn- ser-s-3-object-name [input] #:http.request.field{:value input, :shape "S3ObjectName"})

(clojure.core/defn- ser-image-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "ImageBlob"})

(clojure.core/defn- ser-sns-topic-arn [input] #:http.request.field{:value input, :shape "SNSTopicArn"})

(clojure.core/defn- ser-document-location [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "DocumentLocation", :type "structure"} (clojure.core/contains? input :s-3-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object (input :s-3-object)) #:http.request.field{:name "S3Object", :shape "S3Object"}))))

(clojure.core/defn- ser-s-3-bucket [input] #:http.request.field{:value input, :shape "S3Bucket"})

(clojure.core/defn- ser-notification-channel [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-sns-topic-arn (:sns-topic-arn input)) #:http.request.field{:name "SNSTopicArn", :shape "SNSTopicArn"}) (clojure.core/into (ser-role-arn (:role-arn input)) #:http.request.field{:name "RoleArn", :shape "RoleArn"})], :shape "NotificationChannel", :type "structure"}))

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-document [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "Document", :type "structure"} (clojure.core/contains? input :bytes) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-image-blob (input :bytes)) #:http.request.field{:name "Bytes", :shape "ImageBlob"})) (clojure.core/contains? input :s-3-object) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object (input :s-3-object)) #:http.request.field{:name "S3Object", :shape "S3Object"}))))

(clojure.core/defn- ser-feature-types [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-feature-type coll) #:http.request.field{:shape "FeatureType"}))) input), :shape "FeatureTypes", :type "list"})

(clojure.core/defn- ser-s-3-object [input] (clojure.core/cond-> #:http.request.field{:value [], :shape "S3Object", :type "structure"} (clojure.core/contains? input :bucket) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-bucket (input :bucket)) #:http.request.field{:name "Bucket", :shape "S3Bucket"})) (clojure.core/contains? input :name) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-name (input :name)) #:http.request.field{:name "Name", :shape "S3ObjectName"})) (clojure.core/contains? input :version) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-s-3-object-version (input :version)) #:http.request.field{:name "Version", :shape "S3ObjectVersion"}))))

(clojure.core/defn- ser-job-id [input] #:http.request.field{:value input, :shape "JobId"})

(clojure.core/defn- req-start-document-text-detection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-location (input :document-location)) #:http.request.field{:name "DocumentLocation", :shape "DocumentLocation"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"}))))

(clojure.core/defn- req-start-document-analysis-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document-location (input :document-location)) #:http.request.field{:name "DocumentLocation", :shape "DocumentLocation"}) (clojure.core/into (ser-feature-types (input :feature-types)) #:http.request.field{:name "FeatureTypes", :shape "FeatureTypes"})]} (clojure.core/contains? input :client-request-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-client-request-token (input :client-request-token)) #:http.request.field{:name "ClientRequestToken", :shape "ClientRequestToken"})) (clojure.core/contains? input :job-tag) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-job-tag (input :job-tag)) #:http.request.field{:name "JobTag", :shape "JobTag"})) (clojure.core/contains? input :notification-channel) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-notification-channel (input :notification-channel)) #:http.request.field{:name "NotificationChannel", :shape "NotificationChannel"}))))

(clojure.core/defn- req-get-document-text-detection-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/defn- req-detect-document-text-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document (input :document)) #:http.request.field{:name "Document", :shape "Document"})]}))

(clojure.core/defn- req-analyze-document-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-document (input :document)) #:http.request.field{:name "Document", :shape "Document"}) (clojure.core/into (ser-feature-types (input :feature-types)) #:http.request.field{:name "FeatureTypes", :shape "FeatureTypes"})]}))

(clojure.core/defn- req-get-document-analysis-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-job-id (input :job-id)) #:http.request.field{:name "JobId", :shape "JobId"})]} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-pagination-token (input :next-token)) #:http.request.field{:name "NextToken", :shape "PaginationToken"}))))

(clojure.core/declare deser-document-metadata)

(clojure.core/declare deser-relationship)

(clojure.core/declare deser-non-empty-string)

(clojure.core/declare deser-id-list)

(clojure.core/declare deser-job-status)

(clojure.core/declare deser-warnings)

(clojure.core/declare deser-bounding-box)

(clojure.core/declare deser-status-message)

(clojure.core/declare deser-geometry)

(clojure.core/declare deser-relationship-list)

(clojure.core/declare deser-pagination-token)

(clojure.core/declare deser-relationship-type)

(clojure.core/declare deser-block-type)

(clojure.core/declare deser-block-list)

(clojure.core/declare deser-u-integer)

(clojure.core/declare deser-block)

(clojure.core/declare deser-percent)

(clojure.core/declare deser-warning)

(clojure.core/declare deser-error-code)

(clojure.core/declare deser-point)

(clojure.core/declare deser-string)

(clojure.core/declare deser-pages)

(clojure.core/declare deser-polygon)

(clojure.core/declare deser-entity-type)

(clojure.core/declare deser-float)

(clojure.core/declare deser-entity-types)

(clojure.core/declare deser-job-id)

(clojure.core/defn- deser-document-metadata [input] (clojure.core/cond-> {} (clojure.core/contains? input "Pages") (clojure.core/assoc :pages (deser-u-integer (input "Pages")))))

(clojure.core/defn- deser-relationship [input] (clojure.core/cond-> {} (clojure.core/contains? input "Type") (clojure.core/assoc :type (deser-relationship-type (input "Type"))) (clojure.core/contains? input "Ids") (clojure.core/assoc :ids (deser-id-list (input "Ids")))))

(clojure.core/defn- deser-non-empty-string [input] input)

(clojure.core/defn- deser-id-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-non-empty-string coll))) input))

(clojure.core/defn- deser-job-status [input] (clojure.core/get {"IN_PROGRESS" :in-progress, "SUCCEEDED" :succeeded, "FAILED" :failed, "PARTIAL_SUCCESS" :partial-success} input))

(clojure.core/defn- deser-warnings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-warning coll))) input))

(clojure.core/defn- deser-bounding-box [input] (clojure.core/cond-> {} (clojure.core/contains? input "Width") (clojure.core/assoc :width (deser-float (input "Width"))) (clojure.core/contains? input "Height") (clojure.core/assoc :height (deser-float (input "Height"))) (clojure.core/contains? input "Left") (clojure.core/assoc :left (deser-float (input "Left"))) (clojure.core/contains? input "Top") (clojure.core/assoc :top (deser-float (input "Top")))))

(clojure.core/defn- deser-status-message [input] input)

(clojure.core/defn- deser-geometry [input] (clojure.core/cond-> {} (clojure.core/contains? input "BoundingBox") (clojure.core/assoc :bounding-box (deser-bounding-box (input "BoundingBox"))) (clojure.core/contains? input "Polygon") (clojure.core/assoc :polygon (deser-polygon (input "Polygon")))))

(clojure.core/defn- deser-relationship-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-relationship coll))) input))

(clojure.core/defn- deser-pagination-token [input] input)

(clojure.core/defn- deser-relationship-type [input] (clojure.core/get {"VALUE" :value, "CHILD" :child} input))

(clojure.core/defn- deser-block-type [input] (clojure.core/get {"KEY_VALUE_SET" :key-value-set, "PAGE" :page, "LINE" :line, "WORD" :word, "TABLE" :table, "CELL" :cell} input))

(clojure.core/defn- deser-block-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-block coll))) input))

(clojure.core/defn- deser-u-integer [input] input)

(clojure.core/defn- deser-block [input] (clojure.core/cond-> {} (clojure.core/contains? input "Relationships") (clojure.core/assoc :relationships (deser-relationship-list (input "Relationships"))) (clojure.core/contains? input "ColumnIndex") (clojure.core/assoc :column-index (deser-u-integer (input "ColumnIndex"))) (clojure.core/contains? input "Geometry") (clojure.core/assoc :geometry (deser-geometry (input "Geometry"))) (clojure.core/contains? input "BlockType") (clojure.core/assoc :block-type (deser-block-type (input "BlockType"))) (clojure.core/contains? input "ColumnSpan") (clojure.core/assoc :column-span (deser-u-integer (input "ColumnSpan"))) (clojure.core/contains? input "RowIndex") (clojure.core/assoc :row-index (deser-u-integer (input "RowIndex"))) (clojure.core/contains? input "Page") (clojure.core/assoc :page (deser-u-integer (input "Page"))) (clojure.core/contains? input "RowSpan") (clojure.core/assoc :row-span (deser-u-integer (input "RowSpan"))) (clojure.core/contains? input "Text") (clojure.core/assoc :text (deser-string (input "Text"))) (clojure.core/contains? input "EntityTypes") (clojure.core/assoc :entity-types (deser-entity-types (input "EntityTypes"))) (clojure.core/contains? input "Id") (clojure.core/assoc :id (deser-non-empty-string (input "Id"))) (clojure.core/contains? input "Confidence") (clojure.core/assoc :confidence (deser-percent (input "Confidence")))))

(clojure.core/defn- deser-percent [input] input)

(clojure.core/defn- deser-warning [input] (clojure.core/cond-> {} (clojure.core/contains? input "ErrorCode") (clojure.core/assoc :error-code (deser-error-code (input "ErrorCode"))) (clojure.core/contains? input "Pages") (clojure.core/assoc :pages (deser-pages (input "Pages")))))

(clojure.core/defn- deser-error-code [input] input)

(clojure.core/defn- deser-point [input] (clojure.core/cond-> {} (clojure.core/contains? input "X") (clojure.core/assoc :x (deser-float (input "X"))) (clojure.core/contains? input "Y") (clojure.core/assoc :y (deser-float (input "Y")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-pages [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-u-integer coll))) input))

(clojure.core/defn- deser-polygon [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-point coll))) input))

(clojure.core/defn- deser-entity-type [input] (clojure.core/get {"KEY" :key, "VALUE" :value} input))

(clojure.core/defn- deser-float [input] input)

(clojure.core/defn- deser-entity-types [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-entity-type coll))) input))

(clojure.core/defn- deser-job-id [input] input)

(clojure.core/defn- response-invalid-s-3-object-exception ([input] (response-invalid-s-3-object-exception nil input)) ([resultWrapper2131913 input] (clojure.core/let [rawinput2131912 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131914 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-document-analysis-response ([input] (response-get-document-analysis-response nil input)) ([resultWrapper2131916 input] (clojure.core/let [rawinput2131915 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131917 {"DocumentMetadata" (rawinput2131915 "DocumentMetadata"), "JobStatus" (rawinput2131915 "JobStatus"), "NextToken" (rawinput2131915 "NextToken"), "Blocks" (rawinput2131915 "Blocks"), "Warnings" (rawinput2131915 "Warnings"), "StatusMessage" (rawinput2131915 "StatusMessage")}] (clojure.core/cond-> {} (letvar2131917 "DocumentMetadata") (clojure.core/assoc :document-metadata (deser-document-metadata (clojure.core/get-in letvar2131917 ["DocumentMetadata"]))) (letvar2131917 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar2131917 ["JobStatus"]))) (letvar2131917 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2131917 ["NextToken"]))) (letvar2131917 "Blocks") (clojure.core/assoc :blocks (deser-block-list (clojure.core/get-in letvar2131917 ["Blocks"]))) (letvar2131917 "Warnings") (clojure.core/assoc :warnings (deser-warnings (clojure.core/get-in letvar2131917 ["Warnings"]))) (letvar2131917 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar2131917 ["StatusMessage"])))))))

(clojure.core/defn- response-analyze-document-response ([input] (response-analyze-document-response nil input)) ([resultWrapper2131919 input] (clojure.core/let [rawinput2131918 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131920 {"DocumentMetadata" (rawinput2131918 "DocumentMetadata"), "Blocks" (rawinput2131918 "Blocks")}] (clojure.core/cond-> {} (letvar2131920 "DocumentMetadata") (clojure.core/assoc :document-metadata (deser-document-metadata (clojure.core/get-in letvar2131920 ["DocumentMetadata"]))) (letvar2131920 "Blocks") (clojure.core/assoc :blocks (deser-block-list (clojure.core/get-in letvar2131920 ["Blocks"])))))))

(clojure.core/defn- response-document-too-large-exception ([input] (response-document-too-large-exception nil input)) ([resultWrapper2131922 input] (clojure.core/let [rawinput2131921 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131923 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper2131925 input] (clojure.core/let [rawinput2131924 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131926 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-job-id-exception ([input] (response-invalid-job-id-exception nil input)) ([resultWrapper2131928 input] (clojure.core/let [rawinput2131927 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131929 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-bad-document-exception ([input] (response-bad-document-exception nil input)) ([resultWrapper2131931 input] (clojure.core/let [rawinput2131930 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131932 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-document-analysis-response ([input] (response-start-document-analysis-response nil input)) ([resultWrapper2131934 input] (clojure.core/let [rawinput2131933 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131935 {"JobId" (rawinput2131933 "JobId")}] (clojure.core/cond-> {} (letvar2131935 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar2131935 ["JobId"])))))))

(clojure.core/defn- response-detect-document-text-response ([input] (response-detect-document-text-response nil input)) ([resultWrapper2131937 input] (clojure.core/let [rawinput2131936 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131938 {"DocumentMetadata" (rawinput2131936 "DocumentMetadata"), "Blocks" (rawinput2131936 "Blocks")}] (clojure.core/cond-> {} (letvar2131938 "DocumentMetadata") (clojure.core/assoc :document-metadata (deser-document-metadata (clojure.core/get-in letvar2131938 ["DocumentMetadata"]))) (letvar2131938 "Blocks") (clojure.core/assoc :blocks (deser-block-list (clojure.core/get-in letvar2131938 ["Blocks"])))))))

(clojure.core/defn- response-idempotent-parameter-mismatch-exception ([input] (response-idempotent-parameter-mismatch-exception nil input)) ([resultWrapper2131940 input] (clojure.core/let [rawinput2131939 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131941 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper2131943 input] (clojure.core/let [rawinput2131942 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131944 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-document-text-detection-response ([input] (response-start-document-text-detection-response nil input)) ([resultWrapper2131946 input] (clojure.core/let [rawinput2131945 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131947 {"JobId" (rawinput2131945 "JobId")}] (clojure.core/cond-> {} (letvar2131947 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar2131947 ["JobId"])))))))

(clojure.core/defn- response-unsupported-document-exception ([input] (response-unsupported-document-exception nil input)) ([resultWrapper2131949 input] (clojure.core/let [rawinput2131948 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131950 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper2131952 input] (clojure.core/let [rawinput2131951 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131953 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper2131955 input] (clojure.core/let [rawinput2131954 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131956 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper2131958 input] (clojure.core/let [rawinput2131957 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131959 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-document-text-detection-response ([input] (response-get-document-text-detection-response nil input)) ([resultWrapper2131961 input] (clojure.core/let [rawinput2131960 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131962 {"DocumentMetadata" (rawinput2131960 "DocumentMetadata"), "JobStatus" (rawinput2131960 "JobStatus"), "NextToken" (rawinput2131960 "NextToken"), "Blocks" (rawinput2131960 "Blocks"), "Warnings" (rawinput2131960 "Warnings"), "StatusMessage" (rawinput2131960 "StatusMessage")}] (clojure.core/cond-> {} (letvar2131962 "DocumentMetadata") (clojure.core/assoc :document-metadata (deser-document-metadata (clojure.core/get-in letvar2131962 ["DocumentMetadata"]))) (letvar2131962 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar2131962 ["JobStatus"]))) (letvar2131962 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2131962 ["NextToken"]))) (letvar2131962 "Blocks") (clojure.core/assoc :blocks (deser-block-list (clojure.core/get-in letvar2131962 ["Blocks"]))) (letvar2131962 "Warnings") (clojure.core/assoc :warnings (deser-warnings (clojure.core/get-in letvar2131962 ["Warnings"]))) (letvar2131962 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar2131962 ["StatusMessage"])))))))

(clojure.core/defn- response-provisioned-throughput-exceeded-exception ([input] (response-provisioned-throughput-exceeded-exception nil input)) ([resultWrapper2131964 input] (clojure.core/let [rawinput2131963 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2131965 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.document-metadata/pages (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/document-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27.document-metadata/pages]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-_]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.relationship/type (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/relationship-type))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.relationship/ids (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/id-list))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/relationship (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27.relationship/type :portkey.aws.textract.-2018-06-27.relationship/ids]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #".*\S.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/id-list (clojure.spec.alpha/coll-of :portkey.aws.textract.-2018-06-27/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/s-3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #".*\S.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/job-status #{"IN_PROGRESS" :in-progress "PARTIAL_SUCCESS" "SUCCEEDED" "FAILED" :partial-success :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/start-document-text-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract.-2018-06-27/document-location] :opt-un [:portkey.aws.textract.-2018-06-27/client-request-token :portkey.aws.textract.-2018-06-27/job-tag :portkey.aws.textract.-2018-06-27/notification-channel]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/warnings (clojure.spec.alpha/coll-of :portkey.aws.textract.-2018-06-27/warning))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.bounding-box/width (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/float))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.bounding-box/height (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/float))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.bounding-box/left (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/float))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.bounding-box/top (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/float))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/bounding-box (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27.bounding-box/width :portkey.aws.textract.-2018-06-27.bounding-box/height :portkey.aws.textract.-2018-06-27.bounding-box/left :portkey.aws.textract.-2018-06-27.bounding-box/top]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/invalid-s-3-object-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/geometry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27/bounding-box :portkey.aws.textract.-2018-06-27/polygon]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.get-document-analysis-response/next-token (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.get-document-analysis-response/blocks (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/block-list))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/get-document-analysis-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27/document-metadata :portkey.aws.textract.-2018-06-27/job-status :portkey.aws.textract.-2018-06-27.get-document-analysis-response/next-token :portkey.aws.textract.-2018-06-27.get-document-analysis-response/blocks :portkey.aws.textract.-2018-06-27/warnings :portkey.aws.textract.-2018-06-27/status-message]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/start-document-analysis-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract.-2018-06-27/document-location :portkey.aws.textract.-2018-06-27/feature-types] :opt-un [:portkey.aws.textract.-2018-06-27/client-request-token :portkey.aws.textract.-2018-06-27/job-tag :portkey.aws.textract.-2018-06-27/notification-channel]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.analyze-document-response/blocks (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/block-list))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/analyze-document-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27/document-metadata :portkey.aws.textract.-2018-06-27.analyze-document-response/blocks]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/relationship-list (clojure.spec.alpha/coll-of :portkey.aws.textract.-2018-06-27/relationship))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/feature-type #{"TABLES" "FORMS" :tables :forms})

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 20 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/job-tag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-:]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/document-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #".*\S.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/s-3-object-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #".*\S.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/relationship-type #{"VALUE" :value :child "CHILD"})

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/block-type #{"KEY_VALUE_SET" :table "WORD" "CELL" :key-value-set :page "LINE" :line :word "PAGE" "TABLE" :cell})

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/image-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/block-list (clojure.spec.alpha/coll-of :portkey.aws.textract.-2018-06-27/block))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/u-integer (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/invalid-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.block/relationships (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/relationship-list))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.block/column-index (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.block/column-span (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.block/row-index (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.block/page (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.block/row-span (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.block/text (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/string))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.block/id (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.block/confidence (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/percent))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/block (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27.block/relationships :portkey.aws.textract.-2018-06-27.block/column-index :portkey.aws.textract.-2018-06-27/geometry :portkey.aws.textract.-2018-06-27/block-type :portkey.aws.textract.-2018-06-27.block/column-span :portkey.aws.textract.-2018-06-27.block/row-index :portkey.aws.textract.-2018-06-27.block/page :portkey.aws.textract.-2018-06-27.block/row-span :portkey.aws.textract.-2018-06-27.block/text :portkey.aws.textract.-2018-06-27/entity-types :portkey.aws.textract.-2018-06-27.block/id :portkey.aws.textract.-2018-06-27.block/confidence]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/bad-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/percent clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.get-document-text-detection-request/next-token (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/get-document-text-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract.-2018-06-27/job-id] :opt-un [:portkey.aws.textract.-2018-06-27/max-results :portkey.aws.textract.-2018-06-27.get-document-text-detection-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/start-document-analysis-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27/job-id]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.detect-document-text-response/blocks (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/block-list))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/detect-document-text-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27/document-metadata :portkey.aws.textract.-2018-06-27.detect-document-text-response/blocks]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/warning (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27/error-code :portkey.aws.textract.-2018-06-27/pages]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.point/x (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/float))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.point/y (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/float))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27.point/x :portkey.aws.textract.-2018-06-27.point/y]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/sns-topic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 20 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(^arn:([a-z\d-]+):sns:[a-zA-Z\d-]{1,20}:\w{12}:.+$)" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/start-document-text-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27/job-id]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/document-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27/s-3-object]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 3 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[0-9A-Za-z\.\-_]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/notification-channel (clojure.spec.alpha/keys :req-un [:portkey.aws.textract.-2018-06-27/sns-topic-arn :portkey.aws.textract.-2018-06-27/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/detect-document-text-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract.-2018-06-27/document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/unsupported-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/pages (clojure.spec.alpha/coll-of :portkey.aws.textract.-2018-06-27/u-integer))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.document/bytes (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/image-blob))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27.document/bytes :portkey.aws.textract.-2018-06-27/s-3-object]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/polygon (clojure.spec.alpha/coll-of :portkey.aws.textract.-2018-06-27/point))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/entity-type #{"VALUE" :key :value "KEY"})

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/entity-types (clojure.spec.alpha/coll-of :portkey.aws.textract.-2018-06-27/entity-type))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/feature-types (clojure.spec.alpha/coll-of :portkey.aws.textract.-2018-06-27/feature-type))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/analyze-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract.-2018-06-27/document :portkey.aws.textract.-2018-06-27/feature-types] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.get-document-analysis-request/next-token (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/get-document-analysis-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract.-2018-06-27/job-id] :opt-un [:portkey.aws.textract.-2018-06-27/max-results :portkey.aws.textract.-2018-06-27.get-document-analysis-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.s-3-object/bucket (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.s-3-object/name (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/s-3-object-name))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.s-3-object/version (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/s-3-object-version))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/s-3-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27.s-3-object/bucket :portkey.aws.textract.-2018-06-27.s-3-object/name :portkey.aws.textract.-2018-06-27.s-3-object/version]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.get-document-text-detection-response/next-token (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/pagination-token))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27.get-document-text-detection-response/blocks (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/block-list))
(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/get-document-text-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.-2018-06-27/document-metadata :portkey.aws.textract.-2018-06-27/job-status :portkey.aws.textract.-2018-06-27.get-document-text-detection-response/next-token :portkey.aws.textract.-2018-06-27.get-document-text-detection-response/blocks :portkey.aws.textract.-2018-06-27/warnings :portkey.aws.textract.-2018-06-27/status-message]))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.-2018-06-27/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-_]+$" s__1410940__auto__))))

(clojure.core/defn analyze-document "Analyzes an input document for relationships in the detected text and tables.\n Two types of information are returned:\n * Words and lines that are related to nearby lines and words. The related\ninformation is returned in two Block objects: a KEY Block object and a VALUE\nBlock object. For example, Name: Ana Silva Carolina contains a key and value.\nName: is the key. Ana Silva Carolina is the value.\n * Table and table cell data. A TABLE Block contains information about a\ndetected table. A CELL block is returned for each cell in a table.\n You can choose which type of analysis to perform by specifying the FeatureTypes\nlist.\n The output is returned in a list of BLOCK objects (Blocks). For more\ninformation, see how-it-works-analyzing.\n AnalyzeDocument is a synchronous operation. To analyze documents\nasynchronously, use StartDocumentAnalysis." ([analyze-document-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-analyze-document-request analyze-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract.-2018-06-27/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract.-2018-06-27/analyze-document-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract.-2018-06-27/analyze-document-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AnalyzeDocument", :http.request.configuration/output-deser-fn response-analyze-document-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.textract.-2018-06-27/invalid-s-3-object-exception, "DocumentTooLargeException" :portkey.aws.textract.-2018-06-27/document-too-large-exception, "BadDocumentException" :portkey.aws.textract.-2018-06-27/bad-document-exception, "AccessDeniedException" :portkey.aws.textract.-2018-06-27/access-denied-exception, "UnsupportedDocumentException" :portkey.aws.textract.-2018-06-27/unsupported-document-exception, "ThrottlingException" :portkey.aws.textract.-2018-06-27/throttling-exception, "InternalServerError" :portkey.aws.textract.-2018-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.textract.-2018-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract.-2018-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef analyze-document :args (clojure.spec.alpha/tuple :portkey.aws.textract.-2018-06-27/analyze-document-request) :ret (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/analyze-document-response))

(clojure.core/defn detect-document-text "Detects text in the input document. Amazon Textract can detect lines of text and\nthe words that make up a line of text. The input document must be an image in\nJPG or PNG format. DetectDocumentText returns the detected text in an array of\nBlock objects. For more information, see how-it-works-detecting.\n DetectDocumentText is a synchronous operation. To analyze documents\nasynchronously, use StartDocumentTextDetection." ([detect-document-text-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-document-text-request detect-document-text-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract.-2018-06-27/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract.-2018-06-27/detect-document-text-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract.-2018-06-27/detect-document-text-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectDocumentText", :http.request.configuration/output-deser-fn response-detect-document-text-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.textract.-2018-06-27/invalid-s-3-object-exception, "DocumentTooLargeException" :portkey.aws.textract.-2018-06-27/document-too-large-exception, "BadDocumentException" :portkey.aws.textract.-2018-06-27/bad-document-exception, "AccessDeniedException" :portkey.aws.textract.-2018-06-27/access-denied-exception, "UnsupportedDocumentException" :portkey.aws.textract.-2018-06-27/unsupported-document-exception, "ThrottlingException" :portkey.aws.textract.-2018-06-27/throttling-exception, "InternalServerError" :portkey.aws.textract.-2018-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.textract.-2018-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract.-2018-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef detect-document-text :args (clojure.spec.alpha/tuple :portkey.aws.textract.-2018-06-27/detect-document-text-request) :ret (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/detect-document-text-response))

(clojure.core/defn get-document-analysis "Gets the results for an Amazon Textract asynchronous operation that analyzes\ntext in a document image.\n You start asynchronous text analysis by calling StartDocumentAnalysis, which\nreturns a job identifier (JobId). When the text analysis operation finishes,\nAmazon Textract publishes a completion status to the Amazon Simple Notification\nService (Amazon SNS) topic that's registered in the initial call to\nStartDocumentAnalysis. To get the results of the text-detection operation, first\ncheck that the status value published to the Amazon SNS topic is SUCCEEDED. If\nso, call GetDocumentAnalysis, and pass the job identifier (JobId) from the\ninitial call to StartDocumentAnalysis.\n GetDocumentAnalysis returns an array of Block objects. For more information,\nsee how-it-works-analyzing.\n Use the MaxResults parameter to limit the number of blocks returned. If there\nare more results than specified in MaxResults, the value of NextToken in the\noperation response contains a pagination token for getting the next set of\nresults. To get the next page of results, call GetDocumentAnalysis, and populate\nthe NextToken request parameter with the token value that's returned from the\nprevious call to GetDocumentAnalysis." ([get-document-analysis-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-document-analysis-request get-document-analysis-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract.-2018-06-27/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract.-2018-06-27/get-document-analysis-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract.-2018-06-27/get-document-analysis-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDocumentAnalysis", :http.request.configuration/output-deser-fn response-get-document-analysis-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.textract.-2018-06-27/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.textract.-2018-06-27/access-denied-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract.-2018-06-27/provisioned-throughput-exceeded-exception, "InvalidJobIdException" :portkey.aws.textract.-2018-06-27/invalid-job-id-exception, "InternalServerError" :portkey.aws.textract.-2018-06-27/internal-server-error, "ThrottlingException" :portkey.aws.textract.-2018-06-27/throttling-exception}})))))
(clojure.spec.alpha/fdef get-document-analysis :args (clojure.spec.alpha/tuple :portkey.aws.textract.-2018-06-27/get-document-analysis-request) :ret (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/get-document-analysis-response))

(clojure.core/defn get-document-text-detection "Gets the results for an Amazon Textract asynchronous operation that detects text\nin a document image. Amazon Textract can detect lines of text and the words that\nmake up a line of text.\n You start asynchronous text detection by calling StartDocumentTextDetection,\nwhich returns a job identifier (JobId). When the text detection operation\nfinishes, Amazon Textract publishes a completion status to the Amazon Simple\nNotification Service (Amazon SNS) topic that's registered in the initial call to\nStartDocumentTextDetection. To get the results of the text-detection operation,\nfirst check that the status value published to the Amazon SNS topic is\nSUCCEEDED. If so, call GetDocumentTextDetection, and pass the job identifier\n(JobId) from the initial call to StartDocumentTextDetection.\n GetDocumentTextDetection returns an array of Block objects. For more\ninformation, see how-it-works-detecting.\n Use the MaxResults parameter to limit the number of blocks that are returned.\nIf there are more results than specified in MaxResults, the value of NextToken\nin the operation response contains a pagination token for getting the next set\nof results. To get the next page of results, call GetDocumentTextDetection, and\npopulate the NextToken request parameter with the token value that's returned\nfrom the previous call to GetDocumentTextDetection.\n For more information, see Document Text Detection in the Amazon Textract\nDeveloper Guide." ([get-document-text-detection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-document-text-detection-request get-document-text-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract.-2018-06-27/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract.-2018-06-27/get-document-text-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract.-2018-06-27/get-document-text-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDocumentTextDetection", :http.request.configuration/output-deser-fn response-get-document-text-detection-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.textract.-2018-06-27/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.textract.-2018-06-27/access-denied-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract.-2018-06-27/provisioned-throughput-exceeded-exception, "InvalidJobIdException" :portkey.aws.textract.-2018-06-27/invalid-job-id-exception, "InternalServerError" :portkey.aws.textract.-2018-06-27/internal-server-error, "ThrottlingException" :portkey.aws.textract.-2018-06-27/throttling-exception}})))))
(clojure.spec.alpha/fdef get-document-text-detection :args (clojure.spec.alpha/tuple :portkey.aws.textract.-2018-06-27/get-document-text-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/get-document-text-detection-response))

(clojure.core/defn start-document-analysis "Starts asynchronous analysis of text for relationships in the text and tables\nthat are detected in a document. Amazon Textract returns for two types of\ninformation:\n * Words and lines that are related to nearby lines and words. The related\ninformation is returned in two Block objects: A KEY Block object and a VALUE\nBlock object. For example, Name: Ana Silva Carolina contains a key and value.\nName: is the key. Ana Silva Carolina is the value.\n * Table and table cell data. A TABLE block contains information about a\ndetected table. A CELL block is returned for each cell in a table.\n Amazon Textract can analyze text in document images and PDF files that are\nstored in an Amazon S3 bucket. Use DocumentLocation to specify the bucket name\nand file name of the document image.\n StartDocumentAnalysis returns a job identifier (JobId) that you use to get the\nresults of the operation. When text analysis is finished, Amazon Textract\npublishes a completion status to the Amazon Simple Notification Service (Amazon\nSNS) topic that you specify in NotificationChannel. To get the results of the\ntext analysis operation, first check that the status value published to the\nAmazon SNS topic is SUCCEEDED. If so, call GetDocumentAnalysis, and pass the job\nidentifier (JobId) from the initial call to StartDocumentAnalysis." ([start-document-analysis-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-document-analysis-request start-document-analysis-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract.-2018-06-27/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract.-2018-06-27/start-document-analysis-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract.-2018-06-27/start-document-analysis-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartDocumentAnalysis", :http.request.configuration/output-deser-fn response-start-document-analysis-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.textract.-2018-06-27/invalid-s-3-object-exception, "DocumentTooLargeException" :portkey.aws.textract.-2018-06-27/document-too-large-exception, "LimitExceededException" :portkey.aws.textract.-2018-06-27/limit-exceeded-exception, "BadDocumentException" :portkey.aws.textract.-2018-06-27/bad-document-exception, "IdempotentParameterMismatchException" :portkey.aws.textract.-2018-06-27/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.textract.-2018-06-27/access-denied-exception, "UnsupportedDocumentException" :portkey.aws.textract.-2018-06-27/unsupported-document-exception, "ThrottlingException" :portkey.aws.textract.-2018-06-27/throttling-exception, "InternalServerError" :portkey.aws.textract.-2018-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.textract.-2018-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract.-2018-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-document-analysis :args (clojure.spec.alpha/tuple :portkey.aws.textract.-2018-06-27/start-document-analysis-request) :ret (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/start-document-analysis-response))

(clojure.core/defn start-document-text-detection "Starts the asynchronous detection of text in a document. Amazon Textract can\ndetect lines of text and the words that make up a line of text.\n Amazon Textract can detect text in document images and PDF files that are\nstored in an Amazon S3 bucket. Use DocumentLocation to specify the bucket name\nand the file name of the document image.\n StartTextDetection returns a job identifier (JobId) that you use to get the\nresults of the operation. When text detection is finished, Amazon Textract\npublishes a completion status to the Amazon Simple Notification Service (Amazon\nSNS) topic that you specify in NotificationChannel. To get the results of the\ntext detection operation, first check that the status value published to the\nAmazon SNS topic is SUCCEEDED. If so, call GetDocumentTextDetection, and pass\nthe job identifier (JobId) from the initial call to StartDocumentTextDetection.\n For more information, see Document Text Detection in the Amazon Textract\nDeveloper Guide." ([start-document-text-detection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-document-text-detection-request start-document-text-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract.-2018-06-27/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract.-2018-06-27/start-document-text-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract.-2018-06-27/start-document-text-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartDocumentTextDetection", :http.request.configuration/output-deser-fn response-start-document-text-detection-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.textract.-2018-06-27/invalid-s-3-object-exception, "DocumentTooLargeException" :portkey.aws.textract.-2018-06-27/document-too-large-exception, "LimitExceededException" :portkey.aws.textract.-2018-06-27/limit-exceeded-exception, "BadDocumentException" :portkey.aws.textract.-2018-06-27/bad-document-exception, "IdempotentParameterMismatchException" :portkey.aws.textract.-2018-06-27/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.textract.-2018-06-27/access-denied-exception, "UnsupportedDocumentException" :portkey.aws.textract.-2018-06-27/unsupported-document-exception, "ThrottlingException" :portkey.aws.textract.-2018-06-27/throttling-exception, "InternalServerError" :portkey.aws.textract.-2018-06-27/internal-server-error, "InvalidParameterException" :portkey.aws.textract.-2018-06-27/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract.-2018-06-27/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-document-text-detection :args (clojure.spec.alpha/tuple :portkey.aws.textract.-2018-06-27/start-document-text-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.textract.-2018-06-27/start-document-text-detection-response))
