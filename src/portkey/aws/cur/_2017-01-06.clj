(ns portkey.aws.cur.-2017-01-06 (:require [portkey.aws]))

(def
 endpoints
 '{"us-east-1"
   {:credential-scope {:service "cur", :region "us-east-1"},
    :ssl-common-name "cur.us-east-1.amazonaws.com",
    :endpoint "https://cur.us-east-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-additional-artifact-list)

(clojure.core/declare ser-time-unit)

(clojure.core/declare ser-compression-format)

(clojure.core/declare ser-schema-element)

(clojure.core/declare ser-schema-element-list)

(clojure.core/declare ser-aws-region)

(clojure.core/declare ser-report-format)

(clojure.core/declare ser-generic-string)

(clojure.core/declare ser-additional-artifact)

(clojure.core/declare ser-report-definition)

(clojure.core/declare ser-s-3-bucket)

(clojure.core/declare ser-max-results)

(clojure.core/declare ser-report-name)

(clojure.core/declare ser-s-3-prefix)

(clojure.core/defn- ser-additional-artifact-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-additional-artifact coll) #:http.request.field{:shape "AdditionalArtifact"}))) input), :shape "AdditionalArtifactList", :type "list"})

(clojure.core/defn- ser-time-unit [input] #:http.request.field{:value (clojure.core/get {"HOURLY" "HOURLY", :hourly "HOURLY", "DAILY" "DAILY", :daily "DAILY"} input), :shape "TimeUnit"})

(clojure.core/defn- ser-compression-format [input] #:http.request.field{:value (clojure.core/get {"ZIP" "ZIP", :zip "ZIP", "GZIP" "GZIP", :gzip "GZIP"} input), :shape "CompressionFormat"})

(clojure.core/defn- ser-schema-element [input] #:http.request.field{:value (clojure.core/get {"RESOURCES" "RESOURCES", :resources "RESOURCES"} input), :shape "SchemaElement"})

(clojure.core/defn- ser-schema-element-list [input] #:http.request.field{:value (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (clojure.core/merge (ser-schema-element coll) #:http.request.field{:shape "SchemaElement"}))) input), :shape "SchemaElementList", :type "list"})

(clojure.core/defn- ser-aws-region [input] #:http.request.field{:value (clojure.core/get {:apnortheast-1 "ap-northeast-1", "ap-northeast-1" "ap-northeast-1", "eu-west-1" "eu-west-1", :useast-1 "us-east-1", :apsoutheast-2 "ap-southeast-2", "ap-southeast-2" "ap-southeast-2", "ap-southeast-1" "ap-southeast-1", "eu-central-1" "eu-central-1", :uswest-1 "us-west-1", :eucentral-1 "eu-central-1", :apsoutheast-1 "ap-southeast-1", "us-west-2" "us-west-2", "us-east-1" "us-east-1", "us-west-1" "us-west-1", :euwest-1 "eu-west-1", :uswest-2 "us-west-2"} input), :shape "AWSRegion"})

(clojure.core/defn- ser-report-format [input] #:http.request.field{:value (clojure.core/get {"textORcsv" "textORcsv", :text-o-rcsv "textORcsv"} input), :shape "ReportFormat"})

(clojure.core/defn- ser-generic-string [input] #:http.request.field{:value input, :shape "GenericString"})

(clojure.core/defn- ser-additional-artifact [input] #:http.request.field{:value (clojure.core/get {"REDSHIFT" "REDSHIFT", :redshift "REDSHIFT", "QUICKSIGHT" "QUICKSIGHT", :quicksight "QUICKSIGHT"} input), :shape "AdditionalArtifact"})

(clojure.core/defn- ser-report-definition [input] (clojure.core/cond-> #:http.request.field{:value [(clojure.core/into (ser-report-name (:report-name input)) #:http.request.field{:name "ReportName", :shape "ReportName"}) (clojure.core/into (ser-time-unit (:time-unit input)) #:http.request.field{:name "TimeUnit", :shape "TimeUnit"}) (clojure.core/into (ser-report-format (:format input)) #:http.request.field{:name "Format", :shape "ReportFormat"}) (clojure.core/into (ser-compression-format (:compression input)) #:http.request.field{:name "Compression", :shape "CompressionFormat"}) (clojure.core/into (ser-schema-element-list (:additional-schema-elements input)) #:http.request.field{:name "AdditionalSchemaElements", :shape "SchemaElementList"}) (clojure.core/into (ser-s-3-bucket (:s-3-bucket input)) #:http.request.field{:name "S3Bucket", :shape "S3Bucket"}) (clojure.core/into (ser-s-3-prefix (:s-3-prefix input)) #:http.request.field{:name "S3Prefix", :shape "S3Prefix"}) (clojure.core/into (ser-aws-region (:s-3-region input)) #:http.request.field{:name "S3Region", :shape "AWSRegion"})], :shape "ReportDefinition", :type "structure"} (clojure.core/contains? input :additional-artifacts) (clojure.core/update-in [:http.request.field/value] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-additional-artifact-list (input :additional-artifacts)) #:http.request.field{:name "AdditionalArtifacts", :shape "AdditionalArtifactList"}))))

(clojure.core/defn- ser-s-3-bucket [input] #:http.request.field{:value input, :shape "S3Bucket"})

(clojure.core/defn- ser-max-results [input] #:http.request.field{:value input, :shape "MaxResults"})

(clojure.core/defn- ser-report-name [input] #:http.request.field{:value input, :shape "ReportName"})

(clojure.core/defn- ser-s-3-prefix [input] #:http.request.field{:value input, :shape "S3Prefix"})

(clojure.core/defn- req-put-report-definition-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-report-definition (input :report-definition)) #:http.request.field{:name "ReportDefinition", :shape "ReportDefinition"})]}))

(clojure.core/defn- req-describe-report-definitions-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :max-results) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-max-results (input :max-results)) #:http.request.field{:name "MaxResults", :shape "MaxResults"})) (clojure.core/contains? input :next-token) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-generic-string (input :next-token)) #:http.request.field{:name "NextToken", :shape "GenericString"}))))

(clojure.core/defn- req-delete-report-definition-request [input] (clojure.core/cond-> {} (clojure.core/contains? input :report-name) (clojure.core/update-in [:http.request.configuration/body] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-report-name (input :report-name)) #:http.request.field{:name "ReportName", :shape "ReportName"}))))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.report-limit-reached-exception/message (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/report-limit-reached-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cur.-2017-01-06.report-limit-reached-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.validation-exception/message (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/validation-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cur.-2017-01-06.validation-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/put-report-definition-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cur.-2017-01-06/report-definition] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/additional-artifact-list (clojure.spec.alpha/coll-of :portkey.aws.cur.-2017-01-06/additional-artifact))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/time-unit #{:daily :hourly "DAILY" "HOURLY"})

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/compression-format #{"GZIP" "ZIP" :gzip :zip})

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/put-report-definition-response (clojure.spec.alpha/keys :req-un [] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/schema-element #{"RESOURCES" :resources})

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/schema-element-list (clojure.spec.alpha/coll-of :portkey.aws.cur.-2017-01-06/schema-element))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.describe-report-definitions-response/report-definitions (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/report-definition-list))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.describe-report-definitions-response/next-token (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/generic-string))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/describe-report-definitions-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cur.-2017-01-06.describe-report-definitions-response/report-definitions :portkey.aws.cur.-2017-01-06.describe-report-definitions-response/next-token]))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/report-definition-list (clojure.spec.alpha/coll-of :portkey.aws.cur.-2017-01-06/report-definition))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.internal-error-exception/message (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/internal-error-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cur.-2017-01-06.internal-error-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/aws-region #{:apnortheast-1 "ap-northeast-1" "eu-west-1" :useast-1 :apsoutheast-2 "ap-southeast-2" "ap-southeast-1" "eu-central-1" :uswest-1 :eucentral-1 :apsoutheast-1 "us-west-2" "us-east-1" "us-west-1" :euwest-1 :uswest-2})

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.describe-report-definitions-request/next-token (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/generic-string))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/describe-report-definitions-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cur.-2017-01-06/max-results :portkey.aws.cur.-2017-01-06.describe-report-definitions-request/next-token]))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/delete-response-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/report-format #{:text-o-rcsv "textORcsv"})

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/generic-string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/additional-artifact #{:quicksight :redshift "QUICKSIGHT" "REDSHIFT"})

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.report-definition/s-3-region (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/aws-region))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.report-definition/format (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/report-format))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.report-definition/additional-artifacts (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/additional-artifact-list))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.report-definition/additional-schema-elements (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/schema-element-list))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.report-definition/compression (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/compression-format))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/report-definition (clojure.spec.alpha/keys :req-un [:portkey.aws.cur.-2017-01-06/report-name :portkey.aws.cur.-2017-01-06/time-unit :portkey.aws.cur.-2017-01-06.report-definition/format :portkey.aws.cur.-2017-01-06.report-definition/compression :portkey.aws.cur.-2017-01-06.report-definition/additional-schema-elements :portkey.aws.cur.-2017-01-06/s-3-bucket :portkey.aws.cur.-2017-01-06/s-3-prefix :portkey.aws.cur.-2017-01-06.report-definition/s-3-region] :opt-un [:portkey.aws.cur.-2017-01-06.report-definition/additional-artifacts]))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/s-3-bucket (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256))))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.duplicate-report-name-exception/message (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/error-message))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/duplicate-report-name-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cur.-2017-01-06.duplicate-report-name-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/max-results (clojure.spec.alpha/int-in 5 5))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/report-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9A-Za-z!\-_.*\'()]+" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/s-3-prefix (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__27966__auto__] (clojure.core/< (clojure.core/count s__27966__auto__) 256)) (clojure.core/fn [s__27967__auto__] (clojure.core/re-matches #"[0-9A-Za-z!\-_.*\'()/]*" s__27967__auto__))))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06.delete-report-definition-response/response-message (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/delete-response-message))
(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/delete-report-definition-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cur.-2017-01-06.delete-report-definition-response/response-message]))

(clojure.spec.alpha/def :portkey.aws.cur.-2017-01-06/delete-report-definition-request (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cur.-2017-01-06/report-name]))

(clojure.core/defn delete-report-definition ([] (delete-report-definition {})) ([delete-report-definition-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-delete-report-definition-request delete-report-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cur.-2017-01-06/endpoints, :http.request.spec/output-spec :portkey.aws.cur.-2017-01-06/delete-report-definition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-06", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cur.-2017-01-06/delete-report-definition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DeleteReportDefinition", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.cur.-2017-01-06/internal-error-exception, "ValidationException" :portkey.aws.cur.-2017-01-06/validation-exception}})))))
(clojure.spec.alpha/fdef delete-report-definition :args (clojure.spec.alpha/? :portkey.aws.cur.-2017-01-06/delete-report-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/delete-report-definition-response))

(clojure.core/defn describe-report-definitions ([] (describe-report-definitions {})) ([describe-report-definitions-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-describe-report-definitions-request describe-report-definitions-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cur.-2017-01-06/endpoints, :http.request.spec/output-spec :portkey.aws.cur.-2017-01-06/describe-report-definitions-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-06", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cur.-2017-01-06/describe-report-definitions-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "DescribeReportDefinitions", :http.request.spec/error-spec {"InternalErrorException" :portkey.aws.cur.-2017-01-06/internal-error-exception}})))))
(clojure.spec.alpha/fdef describe-report-definitions :args (clojure.spec.alpha/? :portkey.aws.cur.-2017-01-06/describe-report-definitions-request) :ret (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/describe-report-definitions-response))

(clojure.core/defn put-report-definition ([put-report-definition-requestinput] (clojure.core/let [request-function-result__28606__auto__ (req-put-report-definition-request put-report-definition-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__28606__auto__ {:http.request.configuration/endpoints portkey.aws.cur.-2017-01-06/endpoints, :http.request.spec/output-spec :portkey.aws.cur.-2017-01-06/put-report-definition-response, :http.request.configuration/mime-type {"content-type" "application/x-amz-json-1.1"}, :http.request.configuration/request-uri "/", :http.request.configuration/version "2017-01-06", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cur.-2017-01-06/put-report-definition-request, :http.request.configuration/protocol "json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/action "PutReportDefinition", :http.request.spec/error-spec {"DuplicateReportNameException" :portkey.aws.cur.-2017-01-06/duplicate-report-name-exception, "ReportLimitReachedException" :portkey.aws.cur.-2017-01-06/report-limit-reached-exception, "InternalErrorException" :portkey.aws.cur.-2017-01-06/internal-error-exception, "ValidationException" :portkey.aws.cur.-2017-01-06/validation-exception}})))))
(clojure.spec.alpha/fdef put-report-definition :args (clojure.spec.alpha/tuple :portkey.aws.cur.-2017-01-06/put-report-definition-request) :ret (clojure.spec.alpha/and :portkey.aws.cur.-2017-01-06/put-report-definition-response))
