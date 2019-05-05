(ns portkey.aws.cloudsearchdomain.-2013-01-01 (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.core/declare ser-sort)

(clojure.core/declare ser-expr)

(clojure.core/declare ser-partial)

(clojure.core/declare ser-suggester)

(clojure.core/declare ser-start)

(clojure.core/declare ser-suggestions-size)

(clojure.core/declare ser-query-parser)

(clojure.core/declare ser-highlight)

(clojure.core/declare ser-query-options)

(clojure.core/declare ser-query)

(clojure.core/declare ser-content-type)

(clojure.core/declare ser-filter-query)

(clojure.core/declare ser-facet)

(clojure.core/declare ser-size)

(clojure.core/declare ser-stat)

(clojure.core/declare ser-cursor)

(clojure.core/declare ser-blob)

(clojure.core/declare ser-return)

(clojure.core/defn- ser-sort [input] #:http.request.field{:value input, :shape "Sort"})

(clojure.core/defn- ser-expr [input] #:http.request.field{:value input, :shape "Expr"})

(clojure.core/defn- ser-partial [input] #:http.request.field{:value input, :shape "Partial"})

(clojure.core/defn- ser-suggester [input] #:http.request.field{:value input, :shape "Suggester"})

(clojure.core/defn- ser-start [input] #:http.request.field{:value input, :shape "Start"})

(clojure.core/defn- ser-suggestions-size [input] #:http.request.field{:value input, :shape "SuggestionsSize"})

(clojure.core/defn- ser-query-parser [input] #:http.request.field{:value (clojure.core/get {"simple" "simple", :simple "simple", "structured" "structured", :structured "structured", "lucene" "lucene", :lucene "lucene", "dismax" "dismax", :dismax "dismax"} input), :shape "QueryParser"})

(clojure.core/defn- ser-highlight [input] #:http.request.field{:value input, :shape "Highlight"})

(clojure.core/defn- ser-query-options [input] #:http.request.field{:value input, :shape "QueryOptions"})

(clojure.core/defn- ser-query [input] #:http.request.field{:value input, :shape "Query"})

(clojure.core/defn- ser-content-type [input] #:http.request.field{:value (clojure.core/get {"application/json" "application/json", :applicationjson "application/json", "application/xml" "application/xml", :applicationxml "application/xml"} input), :shape "ContentType"})

(clojure.core/defn- ser-filter-query [input] #:http.request.field{:value input, :shape "FilterQuery"})

(clojure.core/defn- ser-facet [input] #:http.request.field{:value input, :shape "Facet"})

(clojure.core/defn- ser-size [input] #:http.request.field{:value input, :shape "Size"})

(clojure.core/defn- ser-stat [input] #:http.request.field{:value input, :shape "Stat"})

(clojure.core/defn- ser-cursor [input] #:http.request.field{:value input, :shape "Cursor"})

(clojure.core/defn- ser-blob [input] #:http.request.field{:value (portkey.aws/base64-encode input), :shape "Blob"})

(clojure.core/defn- ser-return [input] #:http.request.field{:value input, :shape "Return"})

(clojure.core/defn- req-search-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-query (input :query)) #:http.request.field{:name "query", :shape "Query", :location "querystring", :location-name "q"})]} (clojure.core/contains? input :partial) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-partial (input :partial)) #:http.request.field{:name "partial", :shape "Partial", :location "querystring", :location-name "partial"})) (clojure.core/contains? input :expr) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-expr (input :expr)) #:http.request.field{:name "expr", :shape "Expr", :location "querystring", :location-name "expr"})) (clojure.core/contains? input :query-parser) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-parser (input :query-parser)) #:http.request.field{:name "queryParser", :shape "QueryParser", :location "querystring", :location-name "q.parser"})) (clojure.core/contains? input :filter-query) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-filter-query (input :filter-query)) #:http.request.field{:name "filterQuery", :shape "FilterQuery", :location "querystring", :location-name "fq"})) (clojure.core/contains? input :return) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-return (input :return)) #:http.request.field{:name "return", :shape "Return", :location "querystring", :location-name "return"})) (clojure.core/contains? input :sort) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-sort (input :sort)) #:http.request.field{:name "sort", :shape "Sort", :location "querystring", :location-name "sort"})) (clojure.core/contains? input :start) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-start (input :start)) #:http.request.field{:name "start", :shape "Start", :location "querystring", :location-name "start"})) (clojure.core/contains? input :cursor) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-cursor (input :cursor)) #:http.request.field{:name "cursor", :shape "Cursor", :location "querystring", :location-name "cursor"})) (clojure.core/contains? input :facet) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-facet (input :facet)) #:http.request.field{:name "facet", :shape "Facet", :location "querystring", :location-name "facet"})) (clojure.core/contains? input :size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-size (input :size)) #:http.request.field{:name "size", :shape "Size", :location "querystring", :location-name "size"})) (clojure.core/contains? input :highlight) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-highlight (input :highlight)) #:http.request.field{:name "highlight", :shape "Highlight", :location "querystring", :location-name "highlight"})) (clojure.core/contains? input :query-options) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-query-options (input :query-options)) #:http.request.field{:name "queryOptions", :shape "QueryOptions", :location "querystring", :location-name "q.options"})) (clojure.core/contains? input :stats) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-stat (input :stats)) #:http.request.field{:name "stats", :shape "Stat", :location "querystring", :location-name "stats"}))))

(clojure.core/defn- req-upload-documents-request [input] (clojure.core/cond-> #:http.request.configuration{:body [(clojure.core/into (ser-blob (input :documents)) #:http.request.field{:name "documents", :shape "Blob"})], :header [(clojure.core/into (ser-content-type (input :content-type)) #:http.request.field{:name "contentType", :shape "ContentType", :location "header", :location-name "Content-Type"})]}))

(clojure.core/defn- req-suggest-request [input] (clojure.core/cond-> #:http.request.configuration{:querystring [(clojure.core/into (ser-query (input :query)) #:http.request.field{:name "query", :shape "Query", :location "querystring", :location-name "q"}) (clojure.core/into (ser-suggester (input :suggester)) #:http.request.field{:name "suggester", :shape "Suggester", :location "querystring", :location-name "suggester"})]} (clojure.core/contains? input :size) (clojure.core/update-in [:http.request.configuration/querystring] (clojure.core/fnil clojure.core/conj []) (clojure.core/into (ser-suggestions-size (input :size)) #:http.request.field{:name "size", :shape "SuggestionsSize", :location "querystring", :location-name "size"}))))

(clojure.core/declare deser-bucket)

(clojure.core/declare deser-double)

(clojure.core/declare deser-deletes)

(clojure.core/declare deser-bucket-list)

(clojure.core/declare deser-fields)

(clojure.core/declare deser-adds)

(clojure.core/declare deser-hit-list)

(clojure.core/declare deser-exprs)

(clojure.core/declare deser-hits)

(clojure.core/declare deser-string)

(clojure.core/declare deser-search-status)

(clojure.core/declare deser-field-stats)

(clojure.core/declare deser-suggestions)

(clojure.core/declare deser-long)

(clojure.core/declare deser-stats)

(clojure.core/declare deser-hit)

(clojure.core/declare deser-bucket-info)

(clojure.core/declare deser-suggestion-match)

(clojure.core/declare deser-document-service-warnings)

(clojure.core/declare deser-document-service-warning)

(clojure.core/declare deser-field-value)

(clojure.core/declare deser-suggest-model)

(clojure.core/declare deser-suggest-status)

(clojure.core/declare deser-highlights)

(clojure.core/declare deser-facets)

(clojure.core/defn- deser-bucket [input] (clojure.core/cond-> {} (clojure.core/contains? input "value") (clojure.core/assoc :value (deser-string (input "value"))) (clojure.core/contains? input "count") (clojure.core/assoc :count (deser-long (input "count")))))

(clojure.core/defn- deser-double [input] input)

(clojure.core/defn- deser-deletes [input] input)

(clojure.core/defn- deser-bucket-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-bucket coll))) input))

(clojure.core/defn- deser-fields [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-field-value v)])) input))

(clojure.core/defn- deser-adds [input] input)

(clojure.core/defn- deser-hit-list [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-hit coll))) input))

(clojure.core/defn- deser-exprs [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-hits [input] (clojure.core/cond-> {} (clojure.core/contains? input "found") (clojure.core/assoc :found (deser-long (input "found"))) (clojure.core/contains? input "start") (clojure.core/assoc :start (deser-long (input "start"))) (clojure.core/contains? input "cursor") (clojure.core/assoc :cursor (deser-string (input "cursor"))) (clojure.core/contains? input "hit") (clojure.core/assoc :hit (deser-hit-list (input "hit")))))

(clojure.core/defn- deser-string [input] input)

(clojure.core/defn- deser-search-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "timems") (clojure.core/assoc :timems (deser-long (input "timems"))) (clojure.core/contains? input "rid") (clojure.core/assoc :rid (deser-string (input "rid")))))

(clojure.core/defn- deser-field-stats [input] (clojure.core/cond-> {} (clojure.core/contains? input "min") (clojure.core/assoc :min (deser-string (input "min"))) (clojure.core/contains? input "max") (clojure.core/assoc :max (deser-string (input "max"))) (clojure.core/contains? input "count") (clojure.core/assoc :count (deser-long (input "count"))) (clojure.core/contains? input "missing") (clojure.core/assoc :missing (deser-long (input "missing"))) (clojure.core/contains? input "sum") (clojure.core/assoc :sum (deser-double (input "sum"))) (clojure.core/contains? input "sumOfSquares") (clojure.core/assoc :sum-of-squares (deser-double (input "sumOfSquares"))) (clojure.core/contains? input "mean") (clojure.core/assoc :mean (deser-string (input "mean"))) (clojure.core/contains? input "stddev") (clojure.core/assoc :stddev (deser-double (input "stddev")))))

(clojure.core/defn- deser-suggestions [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-suggestion-match coll))) input))

(clojure.core/defn- deser-long [input] input)

(clojure.core/defn- deser-stats [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-field-stats v)])) input))

(clojure.core/defn- deser-hit [input] (clojure.core/cond-> {} (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id"))) (clojure.core/contains? input "fields") (clojure.core/assoc :fields (deser-fields (input "fields"))) (clojure.core/contains? input "exprs") (clojure.core/assoc :exprs (deser-exprs (input "exprs"))) (clojure.core/contains? input "highlights") (clojure.core/assoc :highlights (deser-highlights (input "highlights")))))

(clojure.core/defn- deser-bucket-info [input] (clojure.core/cond-> {} (clojure.core/contains? input "buckets") (clojure.core/assoc :buckets (deser-bucket-list (input "buckets")))))

(clojure.core/defn- deser-suggestion-match [input] (clojure.core/cond-> {} (clojure.core/contains? input "suggestion") (clojure.core/assoc :suggestion (deser-string (input "suggestion"))) (clojure.core/contains? input "score") (clojure.core/assoc :score (deser-long (input "score"))) (clojure.core/contains? input "id") (clojure.core/assoc :id (deser-string (input "id")))))

(clojure.core/defn- deser-document-service-warnings [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-document-service-warning coll))) input))

(clojure.core/defn- deser-document-service-warning [input] (clojure.core/cond-> {} (clojure.core/contains? input "message") (clojure.core/assoc :message (deser-string (input "message")))))

(clojure.core/defn- deser-field-value [input] (clojure.core/into [] (clojure.core/map (clojure.core/fn [coll] (deser-string coll))) input))

(clojure.core/defn- deser-suggest-model [input] (clojure.core/cond-> {} (clojure.core/contains? input "query") (clojure.core/assoc :query (deser-string (input "query"))) (clojure.core/contains? input "found") (clojure.core/assoc :found (deser-long (input "found"))) (clojure.core/contains? input "suggestions") (clojure.core/assoc :suggestions (deser-suggestions (input "suggestions")))))

(clojure.core/defn- deser-suggest-status [input] (clojure.core/cond-> {} (clojure.core/contains? input "timems") (clojure.core/assoc :timems (deser-long (input "timems"))) (clojure.core/contains? input "rid") (clojure.core/assoc :rid (deser-string (input "rid")))))

(clojure.core/defn- deser-highlights [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-string v)])) input))

(clojure.core/defn- deser-facets [input] (clojure.core/into {} (clojure.core/map (clojure.core/fn [[k v]] [(deser-string k) (deser-bucket-info v)])) input))

(clojure.core/defn- response-document-service-exception ([input] (response-document-service-exception nil input)) ([resultWrapper119654 input] (clojure.core/let [rawinput119653 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar119655 {"status" (rawinput119653 "status"), "message" (rawinput119653 "message")}] (clojure.core/cond-> {} (letvar119655 "status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar119655 ["status"]))) (letvar119655 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar119655 ["message"])))))))

(clojure.core/defn- response-suggest-response ([input] (response-suggest-response nil input)) ([resultWrapper119657 input] (clojure.core/let [rawinput119656 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar119658 {"status" (rawinput119656 "status"), "suggest" (rawinput119656 "suggest")}] (clojure.core/cond-> {} (letvar119658 "status") (clojure.core/assoc :status (deser-suggest-status (clojure.core/get-in letvar119658 ["status"]))) (letvar119658 "suggest") (clojure.core/assoc :suggest (deser-suggest-model (clojure.core/get-in letvar119658 ["suggest"])))))))

(clojure.core/defn- response-search-exception ([input] (response-search-exception nil input)) ([resultWrapper119660 input] (clojure.core/let [rawinput119659 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar119661 {"message" (rawinput119659 "message")}] (clojure.core/cond-> {} (letvar119661 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar119661 ["message"])))))))

(clojure.core/defn- response-upload-documents-response ([input] (response-upload-documents-response nil input)) ([resultWrapper119663 input] (clojure.core/let [rawinput119662 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar119664 {"status" (rawinput119662 "status"), "adds" (rawinput119662 "adds"), "deletes" (rawinput119662 "deletes"), "warnings" (rawinput119662 "warnings")}] (clojure.core/cond-> {} (letvar119664 "status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar119664 ["status"]))) (letvar119664 "adds") (clojure.core/assoc :adds (deser-adds (clojure.core/get-in letvar119664 ["adds"]))) (letvar119664 "deletes") (clojure.core/assoc :deletes (deser-deletes (clojure.core/get-in letvar119664 ["deletes"]))) (letvar119664 "warnings") (clojure.core/assoc :warnings (deser-document-service-warnings (clojure.core/get-in letvar119664 ["warnings"])))))))

(clojure.core/defn- response-search-response ([input] (response-search-response nil input)) ([resultWrapper119666 input] (clojure.core/let [rawinput119665 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar119667 {"status" (rawinput119665 "status"), "hits" (rawinput119665 "hits"), "facets" (rawinput119665 "facets"), "stats" (rawinput119665 "stats")}] (clojure.core/cond-> {} (letvar119667 "status") (clojure.core/assoc :status (deser-search-status (clojure.core/get-in letvar119667 ["status"]))) (letvar119667 "hits") (clojure.core/assoc :hits (deser-hits (clojure.core/get-in letvar119667 ["hits"]))) (letvar119667 "facets") (clojure.core/assoc :facets (deser-facets (clojure.core/get-in letvar119667 ["facets"]))) (letvar119667 "stats") (clojure.core/assoc :stats (deser-stats (clojure.core/get-in letvar119667 ["stats"])))))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/value (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.bucket/value :portkey.aws.cloudsearchdomain.-2013-01-01.bucket/count]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/sort (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/expr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/deletes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/partial clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggester (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/bucket))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/fields (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/field-value))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/start clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query-parser #{:dismax :lucene "structured" :simple "lucene" "dismax" :structured "simple"})

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/status :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/highlight (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/adds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hit-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/hit))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query-options (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/content-type #{"application/json" :applicationjson :applicationxml "application/xml"})

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/exprs (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/suggest (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-model))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-response/suggest]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/filter-query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hits/hit (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/hit-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hits (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.hits/found :portkey.aws.cloudsearchdomain.-2013-01-01.hits/start :portkey.aws.cloudsearchdomain.-2013-01-01.hits/cursor :portkey.aws.cloudsearchdomain.-2013-01-01.hits/hit]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/facet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-status/timems :portkey.aws.cloudsearchdomain.-2013-01-01.search-status/rid]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/min (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/max (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/missing (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum-of-squares (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/mean (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/stddev (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/field-stats (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/min :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/max :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/count :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/missing :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/sum-of-squares :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/mean :portkey.aws.cloudsearchdomain.-2013-01-01.field-stats/stddev]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/stat (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/suggestion-match))

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
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-request/partial :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/expr :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query-parser :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/filter-query :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/return :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/sort :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/start :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/cursor :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/facet :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/size :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/highlight :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/query-options :portkey.aws.cloudsearchdomain.-2013-01-01.search-request/stats]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/stats (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/field-stats))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/documents (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/blob))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/content-type (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/content-type))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/documents :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-request/content-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/fields (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/fields))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/exprs (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/exprs))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.hit/highlights (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/highlights))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/hit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.hit/id :portkey.aws.cloudsearchdomain.-2013-01-01.hit/fields :portkey.aws.cloudsearchdomain.-2013-01-01.hit/exprs :portkey.aws.cloudsearchdomain.-2013-01-01.hit/highlights]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/cursor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/adds (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/adds))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/deletes (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/deletes))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/warnings (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warnings))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/adds :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/deletes :portkey.aws.cloudsearchdomain.-2013-01-01.upload-documents-response/warnings]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.bucket-info/buckets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.bucket-info/buckets]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/suggestion (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/score (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggestion-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/suggestion :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/score :portkey.aws.cloudsearchdomain.-2013-01-01.suggestion-match/id]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warnings (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warning))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.document-service-warning/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-warning (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.document-service-warning/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/field-value (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain.-2013-01-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/suggestions (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/query :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/found :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-model/suggestions]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/timems :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-status/rid]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/return (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/highlights (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggester))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggestions-size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/query :portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/suggester] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.suggest-request/size]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/search-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/hits (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/hits))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/facets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/facets))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/stats))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/search-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.-2013-01-01.search-response/status :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/hits :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/facets :portkey.aws.cloudsearchdomain.-2013-01-01.search-response/stats]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.-2013-01-01/facets (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain.-2013-01-01/string :portkey.aws.cloudsearchdomain.-2013-01-01/bucket-info))

(clojure.core/defn search "Retrieves a list of documents that match the specified search criteria. How you\nspecify the search criteria depends on which query parser you use. Amazon\nCloudSearch supports four query parsers:\n *simple: search all text and text-array fields for the specified string. Search\nfor phrases, individual terms, and prefixes.\n *structured: search specific fields, construct compound queries using Boolean\noperators, and use advanced features such as term boosting and proximity\nsearching.\n *lucene: specify search criteria using the Apache Lucene query parser syntax.\n *dismax: specify search criteria using the simplified subset of the Apache\nLucene query parser syntax defined by the DisMax query parser. For more\ninformation, see Searching Your Data\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/searching.html) in\nthe Amazon CloudSearch Developer Guide.\n The endpoint for submitting Search requests is domain-specific. You submit\nsearch requests to a domain's search endpoint. To get the search endpoint for\nyour domain, use the Amazon CloudSearch configuration service DescribeDomains\naction. A domain's endpoints are also displayed on the domain dashboard in the\nAmazon CloudSearch console." ([search-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-search-request search-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearchdomain.-2013-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearchdomain.-2013-01-01/search-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2013-01-01/search?format=sdk&pretty=true", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearchdomain.-2013-01-01/search-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Search", :http.request.configuration/output-deser-fn response-search-response, :http.request.spec/error-spec {"SearchException" :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception}})))))
(clojure.spec.alpha/fdef search :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain.-2013-01-01/search-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/search-response))

(clojure.core/defn suggest "Retrieves autocomplete suggestions for a partial query string. You can use\nsuggestions enable you to display likely matches before users finish typing. In\nAmazon CloudSearch, suggestions are based on the contents of a particular text\nfield. When you request suggestions, Amazon CloudSearch finds all of the\ndocuments whose values in the suggester field start with the specified query\nstring. The beginning of the field must match the query string to be considered\na match.\n For more information about configuring suggesters and retrieving suggestions,\nsee Getting Suggestions\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html)\nin the Amazon CloudSearch Developer Guide.\n The endpoint for submitting Suggest requests is domain-specific. You submit\nsuggest requests to a domain's search endpoint. To get the search endpoint for\nyour domain, use the Amazon CloudSearch configuration service DescribeDomains\naction. A domain's endpoints are also displayed on the domain dashboard in the\nAmazon CloudSearch console." ([suggest-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-suggest-request suggest-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearchdomain.-2013-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2013-01-01/suggest?format=sdk&pretty=true", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Suggest", :http.request.configuration/output-deser-fn response-suggest-response, :http.request.spec/error-spec {"SearchException" :portkey.aws.cloudsearchdomain.-2013-01-01/search-exception}})))))
(clojure.spec.alpha/fdef suggest :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/suggest-response))

(clojure.core/defn upload-documents "Posts a batch of documents to a search domain for indexing. A document batch is\na collection of add and delete operations that represent the documents you want\nto add, update, or delete from your domain. Batches can be described in either\nJSON or XML. Each item that you want Amazon CloudSearch to return as a search\nresult (such as a product) is represented as a document. Every document has a\nunique ID and one or more fields that contain the data that you want to search\nand return in results. Individual documents cannot contain more than 1 MB of\ndata. The entire batch cannot exceed 5 MB. To get the best possible upload\nperformance, group add and delete operations in batches that are close the 5 MB\nlimit. Submitting a large volume of single-document batches can overload a\ndomain's document service.\n The endpoint for submitting UploadDocuments requests is domain-specific. To get\nthe document endpoint for your domain, use the Amazon CloudSearch configuration\nservice DescribeDomains action. A domain's endpoints are also displayed on the\ndomain dashboard in the Amazon CloudSearch console.\n For more information about formatting your data for Amazon CloudSearch, see\nPreparing Your Data\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/preparing-data.html)\nin the Amazon CloudSearch Developer Guide. For more information about uploading\ndata for indexing, see Uploading Data\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/uploading-data.html)\nin the Amazon CloudSearch Developer Guide." ([upload-documents-requestinput] (clojure.core/let [request-function-result__22153__auto__ (req-upload-documents-request upload-documents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__22153__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearchdomain.-2013-01-01/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2013-01-01/documents/batch?format=sdk", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UploadDocuments", :http.request.configuration/output-deser-fn response-upload-documents-response, :http.request.spec/error-spec {"DocumentServiceException" :portkey.aws.cloudsearchdomain.-2013-01-01/document-service-exception}})))))
(clojure.spec.alpha/fdef upload-documents :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain.-2013-01-01/upload-documents-response))
