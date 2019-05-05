(ns portkey.aws.textract (:require [portkey.aws]))

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

(clojure.core/defn- response-invalid-s-3-object-exception ([input] (response-invalid-s-3-object-exception nil input)) ([resultWrapper2130471 input] (clojure.core/let [rawinput2130470 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130472 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-document-analysis-response ([input] (response-get-document-analysis-response nil input)) ([resultWrapper2130474 input] (clojure.core/let [rawinput2130473 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130475 {"DocumentMetadata" (rawinput2130473 "DocumentMetadata"), "JobStatus" (rawinput2130473 "JobStatus"), "NextToken" (rawinput2130473 "NextToken"), "Blocks" (rawinput2130473 "Blocks"), "Warnings" (rawinput2130473 "Warnings"), "StatusMessage" (rawinput2130473 "StatusMessage")}] (clojure.core/cond-> {} (letvar2130475 "DocumentMetadata") (clojure.core/assoc :document-metadata (deser-document-metadata (clojure.core/get-in letvar2130475 ["DocumentMetadata"]))) (letvar2130475 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar2130475 ["JobStatus"]))) (letvar2130475 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2130475 ["NextToken"]))) (letvar2130475 "Blocks") (clojure.core/assoc :blocks (deser-block-list (clojure.core/get-in letvar2130475 ["Blocks"]))) (letvar2130475 "Warnings") (clojure.core/assoc :warnings (deser-warnings (clojure.core/get-in letvar2130475 ["Warnings"]))) (letvar2130475 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar2130475 ["StatusMessage"])))))))

(clojure.core/defn- response-analyze-document-response ([input] (response-analyze-document-response nil input)) ([resultWrapper2130477 input] (clojure.core/let [rawinput2130476 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130478 {"DocumentMetadata" (rawinput2130476 "DocumentMetadata"), "Blocks" (rawinput2130476 "Blocks")}] (clojure.core/cond-> {} (letvar2130478 "DocumentMetadata") (clojure.core/assoc :document-metadata (deser-document-metadata (clojure.core/get-in letvar2130478 ["DocumentMetadata"]))) (letvar2130478 "Blocks") (clojure.core/assoc :blocks (deser-block-list (clojure.core/get-in letvar2130478 ["Blocks"])))))))

(clojure.core/defn- response-document-too-large-exception ([input] (response-document-too-large-exception nil input)) ([resultWrapper2130480 input] (clojure.core/let [rawinput2130479 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130481 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-limit-exceeded-exception ([input] (response-limit-exceeded-exception nil input)) ([resultWrapper2130483 input] (clojure.core/let [rawinput2130482 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130484 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-job-id-exception ([input] (response-invalid-job-id-exception nil input)) ([resultWrapper2130486 input] (clojure.core/let [rawinput2130485 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130487 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-bad-document-exception ([input] (response-bad-document-exception nil input)) ([resultWrapper2130489 input] (clojure.core/let [rawinput2130488 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130490 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-document-analysis-response ([input] (response-start-document-analysis-response nil input)) ([resultWrapper2130492 input] (clojure.core/let [rawinput2130491 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130493 {"JobId" (rawinput2130491 "JobId")}] (clojure.core/cond-> {} (letvar2130493 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar2130493 ["JobId"])))))))

(clojure.core/defn- response-detect-document-text-response ([input] (response-detect-document-text-response nil input)) ([resultWrapper2130495 input] (clojure.core/let [rawinput2130494 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130496 {"DocumentMetadata" (rawinput2130494 "DocumentMetadata"), "Blocks" (rawinput2130494 "Blocks")}] (clojure.core/cond-> {} (letvar2130496 "DocumentMetadata") (clojure.core/assoc :document-metadata (deser-document-metadata (clojure.core/get-in letvar2130496 ["DocumentMetadata"]))) (letvar2130496 "Blocks") (clojure.core/assoc :blocks (deser-block-list (clojure.core/get-in letvar2130496 ["Blocks"])))))))

(clojure.core/defn- response-idempotent-parameter-mismatch-exception ([input] (response-idempotent-parameter-mismatch-exception nil input)) ([resultWrapper2130498 input] (clojure.core/let [rawinput2130497 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130499 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-access-denied-exception ([input] (response-access-denied-exception nil input)) ([resultWrapper2130501 input] (clojure.core/let [rawinput2130500 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130502 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-start-document-text-detection-response ([input] (response-start-document-text-detection-response nil input)) ([resultWrapper2130504 input] (clojure.core/let [rawinput2130503 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130505 {"JobId" (rawinput2130503 "JobId")}] (clojure.core/cond-> {} (letvar2130505 "JobId") (clojure.core/assoc :job-id (deser-job-id (clojure.core/get-in letvar2130505 ["JobId"])))))))

(clojure.core/defn- response-unsupported-document-exception ([input] (response-unsupported-document-exception nil input)) ([resultWrapper2130507 input] (clojure.core/let [rawinput2130506 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130508 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-throttling-exception ([input] (response-throttling-exception nil input)) ([resultWrapper2130510 input] (clojure.core/let [rawinput2130509 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130511 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-internal-server-error ([input] (response-internal-server-error nil input)) ([resultWrapper2130513 input] (clojure.core/let [rawinput2130512 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130514 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-invalid-parameter-exception ([input] (response-invalid-parameter-exception nil input)) ([resultWrapper2130516 input] (clojure.core/let [rawinput2130515 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130517 {}] (clojure.core/cond-> {}))))

(clojure.core/defn- response-get-document-text-detection-response ([input] (response-get-document-text-detection-response nil input)) ([resultWrapper2130519 input] (clojure.core/let [rawinput2130518 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130520 {"DocumentMetadata" (rawinput2130518 "DocumentMetadata"), "JobStatus" (rawinput2130518 "JobStatus"), "NextToken" (rawinput2130518 "NextToken"), "Blocks" (rawinput2130518 "Blocks"), "Warnings" (rawinput2130518 "Warnings"), "StatusMessage" (rawinput2130518 "StatusMessage")}] (clojure.core/cond-> {} (letvar2130520 "DocumentMetadata") (clojure.core/assoc :document-metadata (deser-document-metadata (clojure.core/get-in letvar2130520 ["DocumentMetadata"]))) (letvar2130520 "JobStatus") (clojure.core/assoc :job-status (deser-job-status (clojure.core/get-in letvar2130520 ["JobStatus"]))) (letvar2130520 "NextToken") (clojure.core/assoc :next-token (deser-pagination-token (clojure.core/get-in letvar2130520 ["NextToken"]))) (letvar2130520 "Blocks") (clojure.core/assoc :blocks (deser-block-list (clojure.core/get-in letvar2130520 ["Blocks"]))) (letvar2130520 "Warnings") (clojure.core/assoc :warnings (deser-warnings (clojure.core/get-in letvar2130520 ["Warnings"]))) (letvar2130520 "StatusMessage") (clojure.core/assoc :status-message (deser-status-message (clojure.core/get-in letvar2130520 ["StatusMessage"])))))))

(clojure.core/defn- response-provisioned-throughput-exceeded-exception ([input] (response-provisioned-throughput-exceeded-exception nil input)) ([resultWrapper2130522 input] (clojure.core/let [rawinput2130521 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar2130523 {}] (clojure.core/cond-> {}))))

(clojure.spec.alpha/def :portkey.aws.textract.document-metadata/pages (clojure.spec.alpha/and :portkey.aws.textract/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract/document-metadata (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.document-metadata/pages]))

(clojure.spec.alpha/def :portkey.aws.textract/client-request-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-_]+$" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract.relationship/type (clojure.spec.alpha/and :portkey.aws.textract/relationship-type))
(clojure.spec.alpha/def :portkey.aws.textract.relationship/ids (clojure.spec.alpha/and :portkey.aws.textract/id-list))
(clojure.spec.alpha/def :portkey.aws.textract/relationship (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.relationship/type :portkey.aws.textract.relationship/ids]))

(clojure.spec.alpha/def :portkey.aws.textract/non-empty-string (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #".*\S.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract/id-list (clojure.spec.alpha/coll-of :portkey.aws.textract/non-empty-string))

(clojure.spec.alpha/def :portkey.aws.textract/s-3-object-version (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #".*\S.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract/job-status #{"IN_PROGRESS" :in-progress "PARTIAL_SUCCESS" "SUCCEEDED" "FAILED" :partial-success :failed :succeeded})

(clojure.spec.alpha/def :portkey.aws.textract/start-document-text-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract/document-location] :opt-un [:portkey.aws.textract/client-request-token :portkey.aws.textract/job-tag :portkey.aws.textract/notification-channel]))

(clojure.spec.alpha/def :portkey.aws.textract/warnings (clojure.spec.alpha/coll-of :portkey.aws.textract/warning))

(clojure.spec.alpha/def :portkey.aws.textract.bounding-box/width (clojure.spec.alpha/and :portkey.aws.textract/float))
(clojure.spec.alpha/def :portkey.aws.textract.bounding-box/height (clojure.spec.alpha/and :portkey.aws.textract/float))
(clojure.spec.alpha/def :portkey.aws.textract.bounding-box/left (clojure.spec.alpha/and :portkey.aws.textract/float))
(clojure.spec.alpha/def :portkey.aws.textract.bounding-box/top (clojure.spec.alpha/and :portkey.aws.textract/float))
(clojure.spec.alpha/def :portkey.aws.textract/bounding-box (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.bounding-box/width :portkey.aws.textract.bounding-box/height :portkey.aws.textract.bounding-box/left :portkey.aws.textract.bounding-box/top]))

(clojure.spec.alpha/def :portkey.aws.textract/invalid-s-3-object-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/status-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.textract/geometry (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract/bounding-box :portkey.aws.textract/polygon]))

(clojure.spec.alpha/def :portkey.aws.textract.get-document-analysis-response/next-token (clojure.spec.alpha/and :portkey.aws.textract/pagination-token))
(clojure.spec.alpha/def :portkey.aws.textract.get-document-analysis-response/blocks (clojure.spec.alpha/and :portkey.aws.textract/block-list))
(clojure.spec.alpha/def :portkey.aws.textract/get-document-analysis-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract/document-metadata :portkey.aws.textract/job-status :portkey.aws.textract.get-document-analysis-response/next-token :portkey.aws.textract.get-document-analysis-response/blocks :portkey.aws.textract/warnings :portkey.aws.textract/status-message]))

(clojure.spec.alpha/def :portkey.aws.textract/start-document-analysis-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract/document-location :portkey.aws.textract/feature-types] :opt-un [:portkey.aws.textract/client-request-token :portkey.aws.textract/job-tag :portkey.aws.textract/notification-channel]))

(clojure.spec.alpha/def :portkey.aws.textract.analyze-document-response/blocks (clojure.spec.alpha/and :portkey.aws.textract/block-list))
(clojure.spec.alpha/def :portkey.aws.textract/analyze-document-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract/document-metadata :portkey.aws.textract.analyze-document-response/blocks]))

(clojure.spec.alpha/def :portkey.aws.textract/relationship-list (clojure.spec.alpha/coll-of :portkey.aws.textract/relationship))

(clojure.spec.alpha/def :portkey.aws.textract/feature-type #{"TABLES" "FORMS" :tables :forms})

(clojure.spec.alpha/def :portkey.aws.textract/role-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 20 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 2048)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"arn:([a-z\d-]+):iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract/job-tag (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_.\-:]+" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract/document-too-large-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/pagination-token (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #".*\S.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract/s-3-object-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #".*\S.*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract/relationship-type #{"VALUE" :value :child "CHILD"})

(clojure.spec.alpha/def :portkey.aws.textract/limit-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/block-type #{"KEY_VALUE_SET" :table "WORD" "CELL" :key-value-set :page "LINE" :line :word "PAGE" "TABLE" :cell})

(clojure.spec.alpha/def :portkey.aws.textract/image-blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.textract/block-list (clojure.spec.alpha/coll-of :portkey.aws.textract/block))

(clojure.spec.alpha/def :portkey.aws.textract/u-integer (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.textract/invalid-job-id-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.block/relationships (clojure.spec.alpha/and :portkey.aws.textract/relationship-list))
(clojure.spec.alpha/def :portkey.aws.textract.block/column-index (clojure.spec.alpha/and :portkey.aws.textract/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.block/column-span (clojure.spec.alpha/and :portkey.aws.textract/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.block/row-index (clojure.spec.alpha/and :portkey.aws.textract/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.block/page (clojure.spec.alpha/and :portkey.aws.textract/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.block/row-span (clojure.spec.alpha/and :portkey.aws.textract/u-integer))
(clojure.spec.alpha/def :portkey.aws.textract.block/text (clojure.spec.alpha/and :portkey.aws.textract/string))
(clojure.spec.alpha/def :portkey.aws.textract.block/id (clojure.spec.alpha/and :portkey.aws.textract/non-empty-string))
(clojure.spec.alpha/def :portkey.aws.textract.block/confidence (clojure.spec.alpha/and :portkey.aws.textract/percent))
(clojure.spec.alpha/def :portkey.aws.textract/block (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.block/relationships :portkey.aws.textract.block/column-index :portkey.aws.textract/geometry :portkey.aws.textract/block-type :portkey.aws.textract.block/column-span :portkey.aws.textract.block/row-index :portkey.aws.textract.block/page :portkey.aws.textract.block/row-span :portkey.aws.textract.block/text :portkey.aws.textract/entity-types :portkey.aws.textract.block/id :portkey.aws.textract.block/confidence]))

(clojure.spec.alpha/def :portkey.aws.textract/bad-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/percent clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.textract.get-document-text-detection-request/next-token (clojure.spec.alpha/and :portkey.aws.textract/pagination-token))
(clojure.spec.alpha/def :portkey.aws.textract/get-document-text-detection-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract/job-id] :opt-un [:portkey.aws.textract/max-results :portkey.aws.textract.get-document-text-detection-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.textract/start-document-analysis-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract/job-id]))

(clojure.spec.alpha/def :portkey.aws.textract.detect-document-text-response/blocks (clojure.spec.alpha/and :portkey.aws.textract/block-list))
(clojure.spec.alpha/def :portkey.aws.textract/detect-document-text-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract/document-metadata :portkey.aws.textract.detect-document-text-response/blocks]))

(clojure.spec.alpha/def :portkey.aws.textract/warning (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract/error-code :portkey.aws.textract/pages]))

(clojure.spec.alpha/def :portkey.aws.textract/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.textract/idempotent-parameter-mismatch-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/access-denied-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.point/x (clojure.spec.alpha/and :portkey.aws.textract/float))
(clojure.spec.alpha/def :portkey.aws.textract.point/y (clojure.spec.alpha/and :portkey.aws.textract/float))
(clojure.spec.alpha/def :portkey.aws.textract/point (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.point/x :portkey.aws.textract.point/y]))

(clojure.spec.alpha/def :portkey.aws.textract/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.textract/sns-topic-arn (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 20 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 1024)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"(^arn:([a-z\d-]+):sns:[a-zA-Z\d-]{1,20}:\w{12}:.+$)" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract/start-document-text-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract/job-id]))

(clojure.spec.alpha/def :portkey.aws.textract/document-location (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract/s-3-object]))

(clojure.spec.alpha/def :portkey.aws.textract/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 3 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 255)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"[0-9A-Za-z\.\-_]*" s__1410940__auto__))))

(clojure.spec.alpha/def :portkey.aws.textract/notification-channel (clojure.spec.alpha/keys :req-un [:portkey.aws.textract/sns-topic-arn :portkey.aws.textract/role-arn] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/detect-document-text-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract/document] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/max-results (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.textract/unsupported-document-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/pages (clojure.spec.alpha/coll-of :portkey.aws.textract/u-integer))

(clojure.spec.alpha/def :portkey.aws.textract/throttling-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/internal-server-error (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.document/bytes (clojure.spec.alpha/and :portkey.aws.textract/image-blob))
(clojure.spec.alpha/def :portkey.aws.textract/document (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.document/bytes :portkey.aws.textract/s-3-object]))

(clojure.spec.alpha/def :portkey.aws.textract/polygon (clojure.spec.alpha/coll-of :portkey.aws.textract/point))

(clojure.spec.alpha/def :portkey.aws.textract/invalid-parameter-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/entity-type #{"VALUE" :key :value "KEY"})

(clojure.spec.alpha/def :portkey.aws.textract/float clojure.core/float?)

(clojure.spec.alpha/def :portkey.aws.textract/entity-types (clojure.spec.alpha/coll-of :portkey.aws.textract/entity-type))

(clojure.spec.alpha/def :portkey.aws.textract/feature-types (clojure.spec.alpha/coll-of :portkey.aws.textract/feature-type))

(clojure.spec.alpha/def :portkey.aws.textract/analyze-document-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract/document :portkey.aws.textract/feature-types] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract.get-document-analysis-request/next-token (clojure.spec.alpha/and :portkey.aws.textract/pagination-token))
(clojure.spec.alpha/def :portkey.aws.textract/get-document-analysis-request (clojure.spec.alpha/keys :req-un [:portkey.aws.textract/job-id] :opt-un [:portkey.aws.textract/max-results :portkey.aws.textract.get-document-analysis-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.textract.s-3-object/bucket (clojure.spec.alpha/and :portkey.aws.textract/s-3-bucket))
(clojure.spec.alpha/def :portkey.aws.textract.s-3-object/name (clojure.spec.alpha/and :portkey.aws.textract/s-3-object-name))
(clojure.spec.alpha/def :portkey.aws.textract.s-3-object/version (clojure.spec.alpha/and :portkey.aws.textract/s-3-object-version))
(clojure.spec.alpha/def :portkey.aws.textract/s-3-object (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract.s-3-object/bucket :portkey.aws.textract.s-3-object/name :portkey.aws.textract.s-3-object/version]))

(clojure.spec.alpha/def :portkey.aws.textract.get-document-text-detection-response/next-token (clojure.spec.alpha/and :portkey.aws.textract/pagination-token))
(clojure.spec.alpha/def :portkey.aws.textract.get-document-text-detection-response/blocks (clojure.spec.alpha/and :portkey.aws.textract/block-list))
(clojure.spec.alpha/def :portkey.aws.textract/get-document-text-detection-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.textract/document-metadata :portkey.aws.textract/job-status :portkey.aws.textract.get-document-text-detection-response/next-token :portkey.aws.textract.get-document-text-detection-response/blocks :portkey.aws.textract/warnings :portkey.aws.textract/status-message]))

(clojure.spec.alpha/def :portkey.aws.textract/provisioned-throughput-exceeded-exception (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.textract/job-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__1410938__auto__] (clojure.core/<= 1 (clojure.core/count s__1410938__auto__))) (clojure.core/fn [s__1410939__auto__] (clojure.core/< (clojure.core/count s__1410939__auto__) 64)) (clojure.core/fn [s__1410940__auto__] (clojure.core/re-matches #"^[a-zA-Z0-9-_]+$" s__1410940__auto__))))

(clojure.core/defn analyze-document "Analyzes an input document for relationships in the detected text and tables.\n Two types of information are returned:\n * Words and lines that are related to nearby lines and words. The related\ninformation is returned in two Block objects: a KEY Block object and a VALUE\nBlock object. For example, Name: Ana Silva Carolina contains a key and value.\nName: is the key. Ana Silva Carolina is the value.\n * Table and table cell data. A TABLE Block contains information about a\ndetected table. A CELL block is returned for each cell in a table.\n You can choose which type of analysis to perform by specifying the FeatureTypes\nlist.\n The output is returned in a list of BLOCK objects (Blocks). For more\ninformation, see how-it-works-analyzing.\n AnalyzeDocument is a synchronous operation. To analyze documents\nasynchronously, use StartDocumentAnalysis." ([analyze-document-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-analyze-document-request analyze-document-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract/analyze-document-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract/analyze-document-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "AnalyzeDocument", :http.request.configuration/output-deser-fn response-analyze-document-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.textract/invalid-s-3-object-exception, "DocumentTooLargeException" :portkey.aws.textract/document-too-large-exception, "BadDocumentException" :portkey.aws.textract/bad-document-exception, "AccessDeniedException" :portkey.aws.textract/access-denied-exception, "UnsupportedDocumentException" :portkey.aws.textract/unsupported-document-exception, "ThrottlingException" :portkey.aws.textract/throttling-exception, "InternalServerError" :portkey.aws.textract/internal-server-error, "InvalidParameterException" :portkey.aws.textract/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef analyze-document :args (clojure.spec.alpha/tuple :portkey.aws.textract/analyze-document-request) :ret (clojure.spec.alpha/and :portkey.aws.textract/analyze-document-response))

(clojure.core/defn detect-document-text "Detects text in the input document. Amazon Textract can detect lines of text and\nthe words that make up a line of text. The input document must be an image in\nJPG or PNG format. DetectDocumentText returns the detected text in an array of\nBlock objects. For more information, see how-it-works-detecting.\n DetectDocumentText is a synchronous operation. To analyze documents\nasynchronously, use StartDocumentTextDetection." ([detect-document-text-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-detect-document-text-request detect-document-text-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract/detect-document-text-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract/detect-document-text-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "DetectDocumentText", :http.request.configuration/output-deser-fn response-detect-document-text-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.textract/invalid-s-3-object-exception, "DocumentTooLargeException" :portkey.aws.textract/document-too-large-exception, "BadDocumentException" :portkey.aws.textract/bad-document-exception, "AccessDeniedException" :portkey.aws.textract/access-denied-exception, "UnsupportedDocumentException" :portkey.aws.textract/unsupported-document-exception, "ThrottlingException" :portkey.aws.textract/throttling-exception, "InternalServerError" :portkey.aws.textract/internal-server-error, "InvalidParameterException" :portkey.aws.textract/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef detect-document-text :args (clojure.spec.alpha/tuple :portkey.aws.textract/detect-document-text-request) :ret (clojure.spec.alpha/and :portkey.aws.textract/detect-document-text-response))

(clojure.core/defn get-document-analysis "Gets the results for an Amazon Textract asynchronous operation that analyzes\ntext in a document image.\n You start asynchronous text analysis by calling StartDocumentAnalysis, which\nreturns a job identifier (JobId). When the text analysis operation finishes,\nAmazon Textract publishes a completion status to the Amazon Simple Notification\nService (Amazon SNS) topic that's registered in the initial call to\nStartDocumentAnalysis. To get the results of the text-detection operation, first\ncheck that the status value published to the Amazon SNS topic is SUCCEEDED. If\nso, call GetDocumentAnalysis, and pass the job identifier (JobId) from the\ninitial call to StartDocumentAnalysis.\n GetDocumentAnalysis returns an array of Block objects. For more information,\nsee how-it-works-analyzing.\n Use the MaxResults parameter to limit the number of blocks returned. If there\nare more results than specified in MaxResults, the value of NextToken in the\noperation response contains a pagination token for getting the next set of\nresults. To get the next page of results, call GetDocumentAnalysis, and populate\nthe NextToken request parameter with the token value that's returned from the\nprevious call to GetDocumentAnalysis." ([get-document-analysis-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-document-analysis-request get-document-analysis-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract/get-document-analysis-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract/get-document-analysis-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDocumentAnalysis", :http.request.configuration/output-deser-fn response-get-document-analysis-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.textract/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.textract/access-denied-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract/provisioned-throughput-exceeded-exception, "InvalidJobIdException" :portkey.aws.textract/invalid-job-id-exception, "InternalServerError" :portkey.aws.textract/internal-server-error, "ThrottlingException" :portkey.aws.textract/throttling-exception}})))))
(clojure.spec.alpha/fdef get-document-analysis :args (clojure.spec.alpha/tuple :portkey.aws.textract/get-document-analysis-request) :ret (clojure.spec.alpha/and :portkey.aws.textract/get-document-analysis-response))

(clojure.core/defn get-document-text-detection "Gets the results for an Amazon Textract asynchronous operation that detects text\nin a document image. Amazon Textract can detect lines of text and the words that\nmake up a line of text.\n You start asynchronous text detection by calling StartDocumentTextDetection,\nwhich returns a job identifier (JobId). When the text detection operation\nfinishes, Amazon Textract publishes a completion status to the Amazon Simple\nNotification Service (Amazon SNS) topic that's registered in the initial call to\nStartDocumentTextDetection. To get the results of the text-detection operation,\nfirst check that the status value published to the Amazon SNS topic is\nSUCCEEDED. If so, call GetDocumentTextDetection, and pass the job identifier\n(JobId) from the initial call to StartDocumentTextDetection.\n GetDocumentTextDetection returns an array of Block objects. For more\ninformation, see how-it-works-detecting.\n Use the MaxResults parameter to limit the number of blocks that are returned.\nIf there are more results than specified in MaxResults, the value of NextToken\nin the operation response contains a pagination token for getting the next set\nof results. To get the next page of results, call GetDocumentTextDetection, and\npopulate the NextToken request parameter with the token value that's returned\nfrom the previous call to GetDocumentTextDetection.\n For more information, see Document Text Detection in the Amazon Textract\nDeveloper Guide." ([get-document-text-detection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-get-document-text-detection-request get-document-text-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract/get-document-text-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract/get-document-text-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "GetDocumentTextDetection", :http.request.configuration/output-deser-fn response-get-document-text-detection-response, :http.request.spec/error-spec {"InvalidParameterException" :portkey.aws.textract/invalid-parameter-exception, "AccessDeniedException" :portkey.aws.textract/access-denied-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract/provisioned-throughput-exceeded-exception, "InvalidJobIdException" :portkey.aws.textract/invalid-job-id-exception, "InternalServerError" :portkey.aws.textract/internal-server-error, "ThrottlingException" :portkey.aws.textract/throttling-exception}})))))
(clojure.spec.alpha/fdef get-document-text-detection :args (clojure.spec.alpha/tuple :portkey.aws.textract/get-document-text-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.textract/get-document-text-detection-response))

(clojure.core/defn start-document-analysis "Starts asynchronous analysis of text for relationships in the text and tables\nthat are detected in a document. Amazon Textract returns for two types of\ninformation:\n * Words and lines that are related to nearby lines and words. The related\ninformation is returned in two Block objects: A KEY Block object and a VALUE\nBlock object. For example, Name: Ana Silva Carolina contains a key and value.\nName: is the key. Ana Silva Carolina is the value.\n * Table and table cell data. A TABLE block contains information about a\ndetected table. A CELL block is returned for each cell in a table.\n Amazon Textract can analyze text in document images and PDF files that are\nstored in an Amazon S3 bucket. Use DocumentLocation to specify the bucket name\nand file name of the document image.\n StartDocumentAnalysis returns a job identifier (JobId) that you use to get the\nresults of the operation. When text analysis is finished, Amazon Textract\npublishes a completion status to the Amazon Simple Notification Service (Amazon\nSNS) topic that you specify in NotificationChannel. To get the results of the\ntext analysis operation, first check that the status value published to the\nAmazon SNS topic is SUCCEEDED. If so, call GetDocumentAnalysis, and pass the job\nidentifier (JobId) from the initial call to StartDocumentAnalysis." ([start-document-analysis-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-document-analysis-request start-document-analysis-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract/start-document-analysis-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract/start-document-analysis-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartDocumentAnalysis", :http.request.configuration/output-deser-fn response-start-document-analysis-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.textract/invalid-s-3-object-exception, "DocumentTooLargeException" :portkey.aws.textract/document-too-large-exception, "LimitExceededException" :portkey.aws.textract/limit-exceeded-exception, "BadDocumentException" :portkey.aws.textract/bad-document-exception, "IdempotentParameterMismatchException" :portkey.aws.textract/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.textract/access-denied-exception, "UnsupportedDocumentException" :portkey.aws.textract/unsupported-document-exception, "ThrottlingException" :portkey.aws.textract/throttling-exception, "InternalServerError" :portkey.aws.textract/internal-server-error, "InvalidParameterException" :portkey.aws.textract/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-document-analysis :args (clojure.spec.alpha/tuple :portkey.aws.textract/start-document-analysis-request) :ret (clojure.spec.alpha/and :portkey.aws.textract/start-document-analysis-response))

(clojure.core/defn start-document-text-detection "Starts the asynchronous detection of text in a document. Amazon Textract can\ndetect lines of text and the words that make up a line of text.\n Amazon Textract can detect text in document images and PDF files that are\nstored in an Amazon S3 bucket. Use DocumentLocation to specify the bucket name\nand the file name of the document image.\n StartTextDetection returns a job identifier (JobId) that you use to get the\nresults of the operation. When text detection is finished, Amazon Textract\npublishes a completion status to the Amazon Simple Notification Service (Amazon\nSNS) topic that you specify in NotificationChannel. To get the results of the\ntext detection operation, first check that the status value published to the\nAmazon SNS topic is SUCCEEDED. If so, call GetDocumentTextDetection, and pass\nthe job identifier (JobId) from the initial call to StartDocumentTextDetection.\n For more information, see Document Text Detection in the Amazon Textract\nDeveloper Guide." ([start-document-text-detection-requestinput] (clojure.core/let [request-function-result__1411981__auto__ (req-start-document-text-detection-request start-document-text-detection-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1411981__auto__ {:http.request.configuration/endpoints portkey.aws.textract/endpoints, :http.request.configuration/target-prefix "Textract", :http.request.spec/output-spec :portkey.aws.textract/start-document-text-detection-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2018-06-27", :http.request.configuration/service-id "Textract", :http.request.spec/input-spec :portkey.aws.textract/start-document-text-detection-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "StartDocumentTextDetection", :http.request.configuration/output-deser-fn response-start-document-text-detection-response, :http.request.spec/error-spec {"InvalidS3ObjectException" :portkey.aws.textract/invalid-s-3-object-exception, "DocumentTooLargeException" :portkey.aws.textract/document-too-large-exception, "LimitExceededException" :portkey.aws.textract/limit-exceeded-exception, "BadDocumentException" :portkey.aws.textract/bad-document-exception, "IdempotentParameterMismatchException" :portkey.aws.textract/idempotent-parameter-mismatch-exception, "AccessDeniedException" :portkey.aws.textract/access-denied-exception, "UnsupportedDocumentException" :portkey.aws.textract/unsupported-document-exception, "ThrottlingException" :portkey.aws.textract/throttling-exception, "InternalServerError" :portkey.aws.textract/internal-server-error, "InvalidParameterException" :portkey.aws.textract/invalid-parameter-exception, "ProvisionedThroughputExceededException" :portkey.aws.textract/provisioned-throughput-exceeded-exception}})))))
(clojure.spec.alpha/fdef start-document-text-detection :args (clojure.spec.alpha/tuple :portkey.aws.textract/start-document-text-detection-request) :ret (clojure.spec.alpha/and :portkey.aws.textract/start-document-text-detection-response))
