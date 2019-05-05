(ns portkey.aws.cloudsearchdomain (:require [portkey.aws]))

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

(clojure.core/defn- response-document-service-exception ([input] (response-document-service-exception nil input)) ([resultWrapper1111413 input] (clojure.core/let [rawinput1111412 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1111414 {"status" (rawinput1111412 "status"), "message" (rawinput1111412 "message")}] (clojure.core/cond-> {} (letvar1111414 "status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar1111414 ["status"]))) (letvar1111414 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1111414 ["message"])))))))

(clojure.core/defn- response-suggest-response ([input] (response-suggest-response nil input)) ([resultWrapper1111416 input] (clojure.core/let [rawinput1111415 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1111417 {"status" (rawinput1111415 "status"), "suggest" (rawinput1111415 "suggest")}] (clojure.core/cond-> {} (letvar1111417 "status") (clojure.core/assoc :status (deser-suggest-status (clojure.core/get-in letvar1111417 ["status"]))) (letvar1111417 "suggest") (clojure.core/assoc :suggest (deser-suggest-model (clojure.core/get-in letvar1111417 ["suggest"])))))))

(clojure.core/defn- response-search-exception ([input] (response-search-exception nil input)) ([resultWrapper1111419 input] (clojure.core/let [rawinput1111418 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1111420 {"message" (rawinput1111418 "message")}] (clojure.core/cond-> {} (letvar1111420 "message") (clojure.core/assoc :message (deser-string (clojure.core/get-in letvar1111420 ["message"])))))))

(clojure.core/defn- response-upload-documents-response ([input] (response-upload-documents-response nil input)) ([resultWrapper1111422 input] (clojure.core/let [rawinput1111421 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1111423 {"status" (rawinput1111421 "status"), "adds" (rawinput1111421 "adds"), "deletes" (rawinput1111421 "deletes"), "warnings" (rawinput1111421 "warnings")}] (clojure.core/cond-> {} (letvar1111423 "status") (clojure.core/assoc :status (deser-string (clojure.core/get-in letvar1111423 ["status"]))) (letvar1111423 "adds") (clojure.core/assoc :adds (deser-adds (clojure.core/get-in letvar1111423 ["adds"]))) (letvar1111423 "deletes") (clojure.core/assoc :deletes (deser-deletes (clojure.core/get-in letvar1111423 ["deletes"]))) (letvar1111423 "warnings") (clojure.core/assoc :warnings (deser-document-service-warnings (clojure.core/get-in letvar1111423 ["warnings"])))))))

(clojure.core/defn- response-search-response ([input] (response-search-response nil input)) ([resultWrapper1111425 input] (clojure.core/let [rawinput1111424 (clojure.core/some-> input :body portkey.aws/parse-json-body) letvar1111426 {"status" (rawinput1111424 "status"), "hits" (rawinput1111424 "hits"), "facets" (rawinput1111424 "facets"), "stats" (rawinput1111424 "stats")}] (clojure.core/cond-> {} (letvar1111426 "status") (clojure.core/assoc :status (deser-search-status (clojure.core/get-in letvar1111426 ["status"]))) (letvar1111426 "hits") (clojure.core/assoc :hits (deser-hits (clojure.core/get-in letvar1111426 ["hits"]))) (letvar1111426 "facets") (clojure.core/assoc :facets (deser-facets (clojure.core/get-in letvar1111426 ["facets"]))) (letvar1111426 "stats") (clojure.core/assoc :stats (deser-stats (clojure.core/get-in letvar1111426 ["stats"])))))))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.bucket/value (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.bucket/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/bucket (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.bucket/value :portkey.aws.cloudsearchdomain.bucket/count]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/sort (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/expr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/deletes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/partial clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggester (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/bucket-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/bucket))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/fields (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/field-value))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/start clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggestions-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/query-parser #{:dismax :lucene "structured" :simple "lucene" "dismax" :structured "simple"})

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.document-service-exception/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.document-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/document-service-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.document-service-exception/status :portkey.aws.cloudsearchdomain.document-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/highlight (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/adds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/hit-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/hit))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/query-options (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/content-type #{"application/json" :applicationjson :applicationxml "application/xml"})

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/exprs (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggest-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-response/suggest (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggest-model))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggest-response/status :portkey.aws.cloudsearchdomain.suggest-response/suggest]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/filter-query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/hit (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/hit-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/hits (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.hits/found :portkey.aws.cloudsearchdomain.hits/start :portkey.aws.cloudsearchdomain.hits/cursor :portkey.aws.cloudsearchdomain.hits/hit]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/facet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.search-status/timems :portkey.aws.cloudsearchdomain.search-status/rid]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/min (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/max (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/missing (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/sum (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/sum-of-squares (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/mean (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/stddev (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/field-stats (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.field-stats/min :portkey.aws.cloudsearchdomain.field-stats/max :portkey.aws.cloudsearchdomain.field-stats/count :portkey.aws.cloudsearchdomain.field-stats/missing :portkey.aws.cloudsearchdomain.field-stats/sum :portkey.aws.cloudsearchdomain.field-stats/sum-of-squares :portkey.aws.cloudsearchdomain.field-stats/mean :portkey.aws.cloudsearchdomain.field-stats/stddev]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/stat (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-exception (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.search-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggestions (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/suggestion-match))

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
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearchdomain.search-request/query] :opt-un [:portkey.aws.cloudsearchdomain.search-request/partial :portkey.aws.cloudsearchdomain.search-request/expr :portkey.aws.cloudsearchdomain.search-request/query-parser :portkey.aws.cloudsearchdomain.search-request/filter-query :portkey.aws.cloudsearchdomain.search-request/return :portkey.aws.cloudsearchdomain.search-request/sort :portkey.aws.cloudsearchdomain.search-request/start :portkey.aws.cloudsearchdomain.search-request/cursor :portkey.aws.cloudsearchdomain.search-request/facet :portkey.aws.cloudsearchdomain.search-request/size :portkey.aws.cloudsearchdomain.search-request/highlight :portkey.aws.cloudsearchdomain.search-request/query-options :portkey.aws.cloudsearchdomain.search-request/stats]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/stats (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/field-stats))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-request/documents (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/blob))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-request/content-type (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/content-type))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/upload-documents-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearchdomain.upload-documents-request/documents :portkey.aws.cloudsearchdomain.upload-documents-request/content-type] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/fields (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/fields))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/exprs (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/exprs))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/highlights (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/highlights))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/hit (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.hit/id :portkey.aws.cloudsearchdomain.hit/fields :portkey.aws.cloudsearchdomain.hit/exprs :portkey.aws.cloudsearchdomain.hit/highlights]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/cursor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/adds (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/adds))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/deletes (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/deletes))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/warnings (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/document-service-warnings))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/upload-documents-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.upload-documents-response/status :portkey.aws.cloudsearchdomain.upload-documents-response/adds :portkey.aws.cloudsearchdomain.upload-documents-response/deletes :portkey.aws.cloudsearchdomain.upload-documents-response/warnings]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.bucket-info/buckets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/bucket-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/bucket-info (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.bucket-info/buckets]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggestion-match/suggestion (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggestion-match/score (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggestion-match/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggestion-match (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggestion-match/suggestion :portkey.aws.cloudsearchdomain.suggestion-match/score :portkey.aws.cloudsearchdomain.suggestion-match/id]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/document-service-warnings (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/document-service-warning))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.document-service-warning/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/document-service-warning (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.document-service-warning/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/blob clojure.core/bytes?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/field-value (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-model/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-model/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-model/suggestions (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggestions))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-model (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggest-model/query :portkey.aws.cloudsearchdomain.suggest-model/found :portkey.aws.cloudsearchdomain.suggest-model/suggestions]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-status (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggest-status/timems :portkey.aws.cloudsearchdomain.suggest-status/rid]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/return (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/highlights (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-request/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggester))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggestions-size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-request (clojure.spec.alpha/keys :req-un [:portkey.aws.cloudsearchdomain.suggest-request/query :portkey.aws.cloudsearchdomain.suggest-request/suggester] :opt-un [:portkey.aws.cloudsearchdomain.suggest-request/size]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/search-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/hits (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/hits))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/facets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/facets))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/stats))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-response (clojure.spec.alpha/keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.search-response/status :portkey.aws.cloudsearchdomain.search-response/hits :portkey.aws.cloudsearchdomain.search-response/facets :portkey.aws.cloudsearchdomain.search-response/stats]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/facets (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/bucket-info))

(clojure.core/defn search ([search-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-search-request search-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearchdomain/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearchdomain/search-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2013-01-01/search?format=sdk&pretty=true", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearchdomain/search-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Search", :http.request.configuration/output-deser-fn response-search-response, :http.request.spec/error-spec {"SearchException" :portkey.aws.cloudsearchdomain/search-exception}})))))
(clojure.spec.alpha/fdef search :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain/search-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/search-response))

(clojure.core/defn suggest ([suggest-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-suggest-request suggest-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearchdomain/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearchdomain/suggest-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2013-01-01/suggest?format=sdk&pretty=true", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearchdomain/suggest-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :get, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "Suggest", :http.request.configuration/output-deser-fn response-suggest-response, :http.request.spec/error-spec {"SearchException" :portkey.aws.cloudsearchdomain/search-exception}})))))
(clojure.spec.alpha/fdef suggest :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain/suggest-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggest-response))

(clojure.core/defn upload-documents ([upload-documents-requestinput] (clojure.core/let [request-function-result__1013884__auto__ (req-upload-documents-request upload-documents-requestinput)] (portkey.aws/-call-http (clojure.core/into request-function-result__1013884__auto__ {:http.request.configuration/endpoints portkey.aws.cloudsearchdomain/endpoints, :http.request.configuration/target-prefix nil, :http.request.spec/output-spec :portkey.aws.cloudsearchdomain/upload-documents-response, :http.request.configuration/mime-type {"content-type" "application/json"}, :http.request.configuration/request-uri "/2013-01-01/documents/batch?format=sdk", :http.request.configuration/version "2013-01-01", :http.request.configuration/service-id nil, :http.request.spec/input-spec :portkey.aws.cloudsearchdomain/upload-documents-request, :http.request.configuration/protocol "rest-json", :http.request.configuration/method :post, :http.request.configuration/response-code nil, :http.request.configuration/result-wrapper nil, :http.request.configuration/action "UploadDocuments", :http.request.configuration/output-deser-fn response-upload-documents-response, :http.request.spec/error-spec {"DocumentServiceException" :portkey.aws.cloudsearchdomain/document-service-exception}})))))
(clojure.spec.alpha/fdef upload-documents :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearchdomain/upload-documents-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/upload-documents-response))
