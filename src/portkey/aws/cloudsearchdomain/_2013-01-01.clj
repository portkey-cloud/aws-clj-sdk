(ns portkey.aws.cloudsearchdomain.-2013-01-01 (:require [portkey.aws]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/value (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.bucket/value :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/count]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/sort (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/expr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/deletes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/partial clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggester (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/bucket :max-count nil))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/fields (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/field-value))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/start clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query-parser (clojure.spec.alpha/conformer (clojure.core/let [m__30835__auto__ {"simple" "simple", :simple "simple", "structured" "structured", :structured "structured", "lucene" "lucene", :lucene "lucene", "dismax" "dismax", :dismax "dismax"}] (clojure.core/fn [s__30836__auto__] (m__30835__auto__ s__30836__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/status :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/highlight (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/adds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hit-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/hit :max-count nil))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query-options (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/content-type (clojure.spec.alpha/conformer (clojure.core/let [m__30835__auto__ {"application/json" "application/json", :application/json "application/json", "application/xml" "application/xml", :application/xml "application/xml"}] (clojure.core/fn [s__30836__auto__] (m__30835__auto__ s__30836__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/exprs (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/suggest (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-model))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/suggest]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/filter-query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/hit (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/hit-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hits (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.hits/found :portkey.aws.cloudsearchdomain.-2013-01-01.hits/start :portkey.aws.cloudsearchdomain.-2013-01-01.hits/cursor :portkey.aws.cloudsearchdomain.-2013-01-01.hits/hit]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/facet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-status (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-status/timems :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/rid]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/min (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/max (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/missing (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum-of-squares (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/mean (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/stddev (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/field-stats (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/min :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/max :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/count :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/missing :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sumOfSquares :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/mean :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/stddev]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/stat (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/suggestion-match :max-count nil))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/partial (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/partial))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/expr (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/expr))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query-parser (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/query-parser))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/filter-query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/filter-query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/return (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/return))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/sort (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/sort))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/start))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/cursor))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/facet (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/facet))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/highlight (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/highlight))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query-options (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/query-options))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/stat))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-request (portkey.awsgen/json-keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-request/partial :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/expr :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/queryParser :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/filterQuery :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/return :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/sort :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/start :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/cursor :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/facet :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/size :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/highlight :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/queryOptions :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/stats]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/stats (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/field-stats))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/documents (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/blob))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/content-type (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/content-type))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-request (portkey.awsgen/json-keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/documents :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/contentType] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/fields (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/fields))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/exprs (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/exprs))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/highlights (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/highlights))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hit (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.hit/id :portkey.aws.cloudsearchdomain.-2013-01-01.hit/fields :portkey.aws.cloudsearchdomain.-2013-01-01.hit/exprs :portkey.aws.cloudsearchdomain.-2013-01-01.hit/highlights]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/cursor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/adds (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/adds))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/deletes (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/deletes))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/warnings (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warnings))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/adds :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/deletes :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/warnings]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket-info/buckets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-info (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.bucket-info/buckets]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/suggestion (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/score (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestion-match (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/suggestion :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/score :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/id]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warnings (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warning :max-count nil))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-warning/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warning (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.document-service-warning/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/field-value (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/suggestions (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-model (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/query :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/found :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/suggestions]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-status (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/timems :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/rid]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/return (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/highlights (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggester))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions-size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-request (portkey.awsgen/json-keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/query :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/suggester] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/size]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/search-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/hits (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/hits))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/facets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/facets))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/stats))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/hits :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/facets :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/stats]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/facets (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-info))

(clojure.core/defn search ([input__33752__auto__] (search input__33752__auto__ portkey.aws/*http-client*)) ([input34610 http-client__33753__auto__] (clojure.core/let [req__33754__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2013-01-01/search?format=sdk&pretty=true", :body (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain.-2013-01-01/SearchRequest input34610)} (portkey.awsgen/params-to-header) (portkey.awsgen/params-to-uri) (portkey.awsgen/params-to-querystring ["partial" "partial"] ["expr" "expr"] ["fq" "filterQuery"] ["q" "query"] ["return" "return"] ["sort" "sort"] ["q.options" "queryOptions"] ["start" "start"] ["cursor" "cursor"] ["q.parser" "queryParser"] ["facet" "facet"] ["size" "size"] ["highlight" "highlight"] ["stats" "stats"]) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__33751__33755__auto__] (clojure.core/some-> p1__33751__33755__auto__ cheshire.core/generate-string))))] (http-client__33753__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2013-01-01/search?format=sdk&pretty=true", :body body__33756__auto__} (clojure.core/fn [response34609] (clojure.core/let [errors__33757__auto__ {"SearchException" :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception}] (if (clojure.core/= nil (:status response34609)) (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain.-2013-01-01/search-response (:body response34609)) (clojure.core/if-some [[type__33758__auto__ spec__33759__auto__] (clojure.core/find errors__33757__auto__ (clojure.core/get-in response34609 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__33760__auto__ (clojure.spec.alpha/unform spec__33759__auto__ (cheshire.core/parse-string (:body response34609)))] (throw (clojure.core/ex-info (clojure.core/str type__33758__auto__ ": " (:message m__33760__auto__)) m__33760__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response34609}))))))))))

(clojure.core/defn suggest ([input__33752__auto__] (suggest input__33752__auto__ portkey.aws/*http-client*)) ([input34612 http-client__33753__auto__] (clojure.core/let [req__33754__auto__ (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2013-01-01/suggest?format=sdk&pretty=true", :body (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain.-2013-01-01/SuggestRequest input34612)} (portkey.awsgen/params-to-header) (portkey.awsgen/params-to-uri) (portkey.awsgen/params-to-querystring ["q" "query"] ["suggester" "suggester"] ["size" "size"]) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__33751__33755__auto__] (clojure.core/some-> p1__33751__33755__auto__ cheshire.core/generate-string))))] (http-client__33753__auto__ {:method "GET", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2013-01-01/suggest?format=sdk&pretty=true", :body body__33756__auto__} (clojure.core/fn [response34611] (clojure.core/let [errors__33757__auto__ {"SearchException" :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception}] (if (clojure.core/= nil (:status response34611)) (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response (:body response34611)) (clojure.core/if-some [[type__33758__auto__ spec__33759__auto__] (clojure.core/find errors__33757__auto__ (clojure.core/get-in response34611 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__33760__auto__ (clojure.spec.alpha/unform spec__33759__auto__ (cheshire.core/parse-string (:body response34611)))] (throw (clojure.core/ex-info (clojure.core/str type__33758__auto__ ": " (:message m__33760__auto__)) m__33760__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response34611}))))))))))

(clojure.core/defn upload-documents ([input__33752__auto__] (upload-documents input__33752__auto__ portkey.aws/*http-client*)) ([input34614 http-client__33753__auto__] (clojure.core/let [req__33754__auto__ (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2013-01-01/documents/batch?format=sdk", :body (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain.-2013-01-01/UploadDocumentsRequest input34614)} (portkey.awsgen/params-to-header ["contentType" ["Content-Type" nil]]) (portkey.awsgen/params-to-uri) (portkey.awsgen/params-to-querystring) (portkey.awsgen/params-to-payload "documents") (clojure.core/update :body (fn* [p1__33751__33755__auto__] (clojure.core/some-> p1__33751__33755__auto__ cheshire.core/generate-string))))] (http-client__33753__auto__ {:method "POST", :headers {"content-type" "application/json"}, :url "https://lambda.eu-central-1.amazonaws.com/2013-01-01/documents/batch?format=sdk", :body body__33756__auto__} (clojure.core/fn [response34613] (clojure.core/let [errors__33757__auto__ {"DocumentServiceException" :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-exception}] (if (clojure.core/= nil (:status response34613)) (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response (:body response34613)) (clojure.core/if-some [[type__33758__auto__ spec__33759__auto__] (clojure.core/find errors__33757__auto__ (clojure.core/get-in response34613 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__33760__auto__ (clojure.spec.alpha/unform spec__33759__auto__ (cheshire.core/parse-string (:body response34613)))] (throw (clojure.core/ex-info (clojure.core/str type__33758__auto__ ": " (:message m__33760__auto__)) m__33760__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response34613}))))))))))
