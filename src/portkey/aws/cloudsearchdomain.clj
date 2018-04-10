(ns portkey.aws.cloudsearchdomain (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.bucket/value (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.bucket/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/bucket (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.bucket/value :portkey.aws.cloudsearchdomain.bucket/count] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/sort (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/expr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/deletes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/partial clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggester (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/bucket-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/bucket) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/fields (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/field-value))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/start clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggestions-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/query-parser (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"simple" "simple", :simple "simple", "structured" "structured", :structured "structured", "lucene" "lucene", :lucene "lucene", "dismax" "dismax", :dismax "dismax"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.document-service-exception/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.document-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/document-service-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.document-service-exception/status :portkey.aws.cloudsearchdomain.document-service-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/highlight (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/adds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/hit-list (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/hit) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/query-options (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/content-type (clojure.spec.alpha/conformer (clojure.core/let [m__15964__auto__ {"application/json" "application/json", :application/json "application/json", "application/xml" "application/xml", :application/xml "application/xml"}] (clojure.core/fn [s__15965__auto__] (m__15964__auto__ s__15965__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.aws/dashed)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/exprs (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggest-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-response/suggest (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggest-model))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggest-response/status :portkey.aws.cloudsearchdomain.suggest-response/suggest] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/filter-query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/hit (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/hit-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/hits (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.hits/found :portkey.aws.cloudsearchdomain.hits/start :portkey.aws.cloudsearchdomain.hits/cursor :portkey.aws.cloudsearchdomain.hits/hit] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/facet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.search-status/timems :portkey.aws.cloudsearchdomain.search-status/rid] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/min (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/max (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/missing (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/sum (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/sum-of-squares (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/mean (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/stddev (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/field-stats (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.field-stats/min :portkey.aws.cloudsearchdomain.field-stats/max :portkey.aws.cloudsearchdomain.field-stats/count :portkey.aws.cloudsearchdomain.field-stats/missing :portkey.aws.cloudsearchdomain.field-stats/sum :portkey.aws.cloudsearchdomain.field-stats/sumOfSquares :portkey.aws.cloudsearchdomain.field-stats/mean :portkey.aws.cloudsearchdomain.field-stats/stddev] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/stat (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.search-exception/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggestions (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/suggestion-match) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/partial (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/partial))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/expr (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/expr))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/query-parser (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/query-parser))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/filter-query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/filter-query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/return (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/return))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/sort (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/sort))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/start))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/cursor))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/facet (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/facet))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/highlight (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/highlight))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/query-options (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/query-options))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/stat))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearchdomain.search-request/query] :opt-un [:portkey.aws.cloudsearchdomain.search-request/partial :portkey.aws.cloudsearchdomain.search-request/expr :portkey.aws.cloudsearchdomain.search-request/queryParser :portkey.aws.cloudsearchdomain.search-request/filterQuery :portkey.aws.cloudsearchdomain.search-request/return :portkey.aws.cloudsearchdomain.search-request/sort :portkey.aws.cloudsearchdomain.search-request/start :portkey.aws.cloudsearchdomain.search-request/cursor :portkey.aws.cloudsearchdomain.search-request/facet :portkey.aws.cloudsearchdomain.search-request/size :portkey.aws.cloudsearchdomain.search-request/highlight :portkey.aws.cloudsearchdomain.search-request/queryOptions :portkey.aws.cloudsearchdomain.search-request/stats] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/stats (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/field-stats))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-request/documents (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/blob))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-request/content-type (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/content-type))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/upload-documents-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearchdomain.upload-documents-request/documents :portkey.aws.cloudsearchdomain.upload-documents-request/contentType] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/fields (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/fields))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/exprs (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/exprs))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/highlights (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/highlights))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/hit (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.hit/id :portkey.aws.cloudsearchdomain.hit/fields :portkey.aws.cloudsearchdomain.hit/exprs :portkey.aws.cloudsearchdomain.hit/highlights] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/cursor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/adds (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/adds))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/deletes (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/deletes))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/warnings (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/document-service-warnings))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/upload-documents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.upload-documents-response/status :portkey.aws.cloudsearchdomain.upload-documents-response/adds :portkey.aws.cloudsearchdomain.upload-documents-response/deletes :portkey.aws.cloudsearchdomain.upload-documents-response/warnings] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.bucket-info/buckets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/bucket-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/bucket-info (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.bucket-info/buckets] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggestion-match/suggestion (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggestion-match/score (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggestion-match/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggestion-match (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggestion-match/suggestion :portkey.aws.cloudsearchdomain.suggestion-match/score :portkey.aws.cloudsearchdomain.suggestion-match/id] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/document-service-warnings (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/document-service-warning) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.document-service-warning/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/document-service-warning (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.document-service-warning/message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.aws/base64-encode portkey.aws/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/field-value (clojure.spec.alpha/and (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/string) (clojure.spec.alpha/conformer clojure.core/identity (fn* [p1__15885__15886__auto__] (if (clojure.core/sequential? p1__15885__15886__auto__) p1__15885__15886__auto__ [p1__15885__15886__auto__])))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-model/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-model/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-model/suggestions (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggestions))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-model (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggest-model/query :portkey.aws.cloudsearchdomain.suggest-model/found :portkey.aws.cloudsearchdomain.suggest-model/suggestions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-status (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggest-status/timems :portkey.aws.cloudsearchdomain.suggest-status/rid] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/return (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/highlights (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-request/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggester))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggestions-size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearchdomain.suggest-request/query :portkey.aws.cloudsearchdomain.suggest-request/suggester] :opt-un [:portkey.aws.cloudsearchdomain.suggest-request/size] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/search-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/hits (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/hits))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/facets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/facets))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/stats))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.search-response/status :portkey.aws.cloudsearchdomain.search-response/hits :portkey.aws.cloudsearchdomain.search-response/facets :portkey.aws.cloudsearchdomain.search-response/stats] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/facets (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/bucket-info))

(clojure.core/defn search "Retrieves a list of documents that match the specified search criteria. How you\nspecify the search criteria depends on which query parser you use. Amazon\nCloudSearch supports four query parsers:\n *simple: search all text and text-array fields for the specified string. Search\nfor phrases, individual terms, and prefixes.\n *structured: search specific fields, construct compound queries using Boolean\noperators, and use advanced features such as term boosting and proximity\nsearching.\n *lucene: specify search criteria using the Apache Lucene query parser syntax.\n *dismax: specify search criteria using the simplified subset of the Apache\nLucene query parser syntax defined by the DisMax query parser. For more\ninformation, see Searching Your Data\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html) in\nthe Amazon CloudSearch Developer Guide.\n The endpoint for submitting Search requests is domain-specific. You submit\nsearch requests to a domain's search endpoint. To get the search endpoint for\nyour domain, use the Amazon CloudSearch configuration service DescribeDomains\naction. A domain's endpoints are also displayed on the domain dashboard in the\nAmazon CloudSearch console." ([search-request] (portkey.aws/-rest-json-call portkey.aws.cloudsearchdomain/endpoints "GET" "/2013-01-01/search?format=sdk&pretty=true" search-request :portkey.aws.cloudsearchdomain/search-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"partial" "partial", "expr" "expr", "fq" "filterQuery", "q" "query", "return" "return", "sort" "sort", "q.options" "queryOptions", "start" "start", "cursor" "cursor", "q.parser" "queryParser", "facet" "facet", "size" "size", "highlight" "highlight", "stats" "stats"}} nil :portkey.aws.cloudsearchdomain/search-response {"SearchException" :portkey.aws.cloudsearchdomain/search-exception})))
(clojure.spec.alpha/fdef search :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain/search-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/search-response))

(clojure.core/defn suggest "Retrieves autocomplete suggestions for a partial query string. You can use\nsuggestions enable you to display likely matches before users finish typing. In\nAmazon CloudSearch, suggestions are based on the contents of a particular text\nfield. When you request suggestions, Amazon CloudSearch finds all of the\ndocuments whose values in the suggester field start with the specified query\nstring. The beginning of the field must match the query string to be considered\na match.\n For more information about configuring suggesters and retrieving suggestions,\nsee Getting Suggestions\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html)\nin the Amazon CloudSearch Developer Guide.\n The endpoint for submitting Suggest requests is domain-specific. You submit\nsuggest requests to a domain's search endpoint. To get the search endpoint for\nyour domain, use the Amazon CloudSearch configuration service DescribeDomains\naction. A domain's endpoints are also displayed on the domain dashboard in the\nAmazon CloudSearch console." ([suggest-request] (portkey.aws/-rest-json-call portkey.aws.cloudsearchdomain/endpoints "GET" "/2013-01-01/suggest?format=sdk&pretty=true" suggest-request :portkey.aws.cloudsearchdomain/suggest-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {"q" "query", "suggester" "suggester", "size" "size"}} nil :portkey.aws.cloudsearchdomain/suggest-response {"SearchException" :portkey.aws.cloudsearchdomain/search-exception})))
(clojure.spec.alpha/fdef suggest :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain/suggest-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggest-response))

(clojure.core/defn upload-documents "Posts a batch of documents to a search domain for indexing. A document batch is\na collection of add and delete operations that represent the documents you want\nto add, update, or delete from your domain. Batches can be described in either\nJSON or XML. Each item that you want Amazon CloudSearch to return as a search\nresult (such as a product) is represented as a document. Every document has a\nunique ID and one or more fields that contain the data that you want to search\nand return in results. Individual documents cannot contain more than 1 MB of\ndata. The entire batch cannot exceed 5 MB. To get the best possible upload\nperformance, group add and delete operations in batches that are close the 5 MB\nlimit. Submitting a large volume of single-document batches can overload a\ndomain's document service.\n The endpoint for submitting UploadDocuments requests is domain-specific. To get\nthe document endpoint for your domain, use the Amazon CloudSearch configuration\nservice DescribeDomains action. A domain's endpoints are also displayed on the\ndomain dashboard in the Amazon CloudSearch console.\n For more information about formatting your data for Amazon CloudSearch, see\nPreparing Your Data\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/preparing-data.html)\nin the Amazon CloudSearch Developer Guide. For more information about uploading\ndata for indexing, see Uploading Data\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/uploading-data.html)\nin the Amazon CloudSearch Developer Guide." ([upload-documents-request] (portkey.aws/-rest-json-call portkey.aws.cloudsearchdomain/endpoints "POST" "/2013-01-01/documents/batch?format=sdk" upload-documents-request :portkey.aws.cloudsearchdomain/upload-documents-request {:payload "documents", :move {}, :headers {"contentType" ["Content-Type" nil]}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearchdomain/upload-documents-response {"DocumentServiceException" :portkey.aws.cloudsearchdomain/document-service-exception})))
(clojure.spec.alpha/fdef upload-documents :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain/upload-documents-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/upload-documents-response))
