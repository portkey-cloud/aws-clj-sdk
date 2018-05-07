(ns portkey.aws.cloudsearchdomain.-2013-01-01 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/value (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.bucket/value :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/count] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/sort (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/expr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/deletes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/partial clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggester (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/bucket) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/fields (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/field-value))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/start clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query-parser (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"simple" "simple", :simple "simple", "structured" "structured", :structured "structured", "lucene" "lucene", :lucene "lucene", "dismax" "dismax", :dismax "dismax"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/status :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/highlight (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/adds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hit-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/hit) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query-options (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/content-type (clojure.spec.alpha/conformer (clojure.core/let [m__16140__auto__ {"application/json" "application/json", :application/json "application/json", "application/xml" "application/xml", :application/xml "application/xml"}] (clojure.core/fn [s__16141__auto__] (m__16140__auto__ s__16141__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/exprs (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/suggest (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-model))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/suggest] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/filter-query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/hit (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/hit-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hits (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.hits/found :portkey.aws.cloudsearchdomain.-2013-01-01.hits/start :portkey.aws.cloudsearchdomain.-2013-01-01.hits/cursor :portkey.aws.cloudsearchdomain.-2013-01-01.hits/hit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/facet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-status/timems :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/rid] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/min (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/max (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/missing (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum-of-squares (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/mean (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/stddev (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/field-stats (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/min :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/max :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/count :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/missing :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sumOfSquares :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/mean :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/stddev] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/stat (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/suggestion-match) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

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
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-request/partial :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/expr :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/queryParser :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/filterQuery :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/return :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/sort :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/start :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/cursor :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/facet :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/size :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/highlight :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/queryOptions :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/stats] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/stats (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/field-stats))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/documents (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/blob))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/content-type (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/content-type))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/documents :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/contentType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/fields (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/fields))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/exprs (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/exprs))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/highlights (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/highlights))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hit (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.hit/id :portkey.aws.cloudsearchdomain.-2013-01-01.hit/fields :portkey.aws.cloudsearchdomain.-2013-01-01.hit/exprs :portkey.aws.cloudsearchdomain.-2013-01-01.hit/highlights] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/cursor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/adds (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/adds))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/deletes (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/deletes))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/warnings (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warnings))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/adds :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/deletes :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/warnings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket-info/buckets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.bucket-info/buckets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/suggestion (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/score (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestion-match (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/suggestion :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/score :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warnings (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warning) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-warning/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warning (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.document-service-warning/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/field-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__16061__16062__auto__] (if (clojure.core/sequential? p1__16061__16062__auto__) p1__16061__16062__auto__ [p1__16061__16062__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/suggestions (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-model (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/query :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/found :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/suggestions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/timems :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/rid] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/return (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/highlights (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggester))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions-size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/query :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/suggester] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/size] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/search-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/hits (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/hits))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/facets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/facets))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/stats))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/hits :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/facets :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/stats] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/facets (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-info))

(clojure.core/defn search "Retrieves a list of documents that match the specified search criteria. How you\nspecify the search criteria depends on which query parser you use. Amazon\nCloudSearch supports four query parsers:\n *simple: search all text and text-array fields for the specified string. Search\nfor phrases, individual terms, and prefixes.\n *structured: search specific fields, construct compound queries using Boolean\noperators, and use advanced features such as term boosting and proximity\nsearching.\n *lucene: specify search criteria using the Apache Lucene query parser syntax.\n *dismax: specify search criteria using the simplified subset of the Apache\nLucene query parser syntax defined by the DisMax query parser. For more\ninformation, see Searching Your Data\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html) in\nthe Amazon CloudSearch Developer Guide.\n The endpoint for submitting Search requests is domain-specific. You submit\nsearch requests to a domain's search endpoint. To get the search endpoint for\nyour domain, use the Amazon CloudSearch configuration service DescribeDomains\naction. A domain's endpoints are also displayed on the domain dashboard in the\nAmazon CloudSearch console." ([search-request] (portkey.aws/-rest-json-call portkey.aws.cloudsearchdomain.-2013-01-01/endpoints "GET" "/2013-01-01/search?format=sdk&pretty=true" search-request :portkey.aws.cloudsearchdomain.-2013-01-01/search-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"partial" "partial", "expr" "expr", "fq" "filterQuery", "q" "query", "return" "return", "sort" "sort", "q.options" "queryOptions", "start" "start", "cursor" "cursor", "q.parser" "queryParser", "facet" "facet", "size" "size", "highlight" "highlight", "stats" "stats"}} nil :portkey.aws.cloudsearchdomain.-2013-01-01/search-response {"SearchException" :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception})))
(clojure.spec.alpha/fdef search :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain.-2013-01-01/search-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/search-response))

(clojure.core/defn suggest "Retrieves autocomplete suggestions for a partial query string. You can use\nsuggestions enable you to display likely matches before users finish typing. In\nAmazon CloudSearch, suggestions are based on the contents of a particular text\nfield. When you request suggestions, Amazon CloudSearch finds all of the\ndocuments whose values in the suggester field start with the specified query\nstring. The beginning of the field must match the query string to be considered\na match.\n For more information about configuring suggesters and retrieving suggestions,\nsee Getting Suggestions\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html)\nin the Amazon CloudSearch Developer Guide.\n The endpoint for submitting Suggest requests is domain-specific. You submit\nsuggest requests to a domain's search endpoint. To get the search endpoint for\nyour domain, use the Amazon CloudSearch configuration service DescribeDomains\naction. A domain's endpoints are also displayed on the domain dashboard in the\nAmazon CloudSearch console." ([suggest-request] (portkey.aws/-rest-json-call portkey.aws.cloudsearchdomain.-2013-01-01/endpoints "GET" "/2013-01-01/suggest?format=sdk&pretty=true" suggest-request :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"q" "query", "suggester" "suggester", "size" "size"}} nil :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response {"SearchException" :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception})))
(clojure.spec.alpha/fdef suggest :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response))

(clojure.core/defn upload-documents "Posts a batch of documents to a search domain for indexing. A document batch is\na collection of add and delete operations that represent the documents you want\nto add, update, or delete from your domain. Batches can be described in either\nJSON or XML. Each item that you want Amazon CloudSearch to return as a search\nresult (such as a product) is represented as a document. Every document has a\nunique ID and one or more fields that contain the data that you want to search\nand return in results. Individual documents cannot contain more than 1 MB of\ndata. The entire batch cannot exceed 5 MB. To get the best possible upload\nperformance, group add and delete operations in batches that are close the 5 MB\nlimit. Submitting a large volume of single-document batches can overload a\ndomain's document service.\n The endpoint for submitting UploadDocuments requests is domain-specific. To get\nthe document endpoint for your domain, use the Amazon CloudSearch configuration\nservice DescribeDomains action. A domain's endpoints are also displayed on the\ndomain dashboard in the Amazon CloudSearch console.\n For more information about formatting your data for Amazon CloudSearch, see\nPreparing Your Data\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/preparing-data.html)\nin the Amazon CloudSearch Developer Guide. For more information about uploading\ndata for indexing, see Uploading Data\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/uploading-data.html)\nin the Amazon CloudSearch Developer Guide." ([upload-documents-request] (portkey.aws/-rest-json-call portkey.aws.cloudsearchdomain.-2013-01-01/endpoints "POST" "/2013-01-01/documents/batch?format=sdk" upload-documents-request :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-request {:payload "documents", :move {}, :headers {"contentType" ["Content-Type" nil]}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response {"DocumentServiceException" :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-exception})))
(clojure.spec.alpha/fdef upload-documents :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response))
