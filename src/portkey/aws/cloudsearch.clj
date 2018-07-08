(ns portkey.aws.cloudsearch (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope
    {:service "cloudsearch", :region "ap-northeast-1"},
    :ssl-common-name "cloudsearch.ap-northeast-1.amazonaws.com",
    :endpoint "https://cloudsearch.ap-northeast-1.amazonaws.com",
    :signature-version :v4},
   "eu-west-1"
   {:credential-scope {:service "cloudsearch", :region "eu-west-1"},
    :ssl-common-name "cloudsearch.eu-west-1.amazonaws.com",
    :endpoint "https://cloudsearch.eu-west-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-2"
   {:credential-scope
    {:service "cloudsearch", :region "ap-southeast-2"},
    :ssl-common-name "cloudsearch.ap-southeast-2.amazonaws.com",
    :endpoint "https://cloudsearch.ap-southeast-2.amazonaws.com",
    :signature-version :v4},
   "sa-east-1"
   {:credential-scope {:service "cloudsearch", :region "sa-east-1"},
    :ssl-common-name "cloudsearch.sa-east-1.amazonaws.com",
    :endpoint "https://cloudsearch.sa-east-1.amazonaws.com",
    :signature-version :v4},
   "ap-southeast-1"
   {:credential-scope
    {:service "cloudsearch", :region "ap-southeast-1"},
    :ssl-common-name "cloudsearch.ap-southeast-1.amazonaws.com",
    :endpoint "https://cloudsearch.ap-southeast-1.amazonaws.com",
    :signature-version :v4},
   "ap-northeast-2"
   {:credential-scope
    {:service "cloudsearch", :region "ap-northeast-2"},
    :ssl-common-name "cloudsearch.ap-northeast-2.amazonaws.com",
    :endpoint "https://cloudsearch.ap-northeast-2.amazonaws.com",
    :signature-version :v4},
   "eu-central-1"
   {:credential-scope {:service "cloudsearch", :region "eu-central-1"},
    :ssl-common-name "cloudsearch.eu-central-1.amazonaws.com",
    :endpoint "https://cloudsearch.eu-central-1.amazonaws.com",
    :signature-version :v4},
   "us-west-2"
   {:credential-scope {:service "cloudsearch", :region "us-west-2"},
    :ssl-common-name "cloudsearch.us-west-2.amazonaws.com",
    :endpoint "https://cloudsearch.us-west-2.amazonaws.com",
    :signature-version :v4},
   "us-east-1"
   {:credential-scope {:service "cloudsearch", :region "us-east-1"},
    :ssl-common-name "cloudsearch.us-east-1.amazonaws.com",
    :endpoint "https://cloudsearch.us-east-1.amazonaws.com",
    :signature-version :v4},
   "us-west-1"
   {:credential-scope {:service "cloudsearch", :region "us-west-1"},
    :ssl-common-name "cloudsearch.us-west-1.amazonaws.com",
    :endpoint "https://cloudsearch.us-west-1.amazonaws.com",
    :signature-version :v4}})

(clojure.core/declare ser-double-array-options ser-double ser-index-field-type ser-field-name-comma-list ser-suggester ser-lat-lon-options ser-text-options ser-standard-name ser-analysis-scheme ser-double-options ser-expression ser-text-array-options ser-int-array-options ser-domain-name-list ser-dynamic-field-name-list ser-analysis-options ser-date-array-options ser-policy-document ser-expression-value ser-algorithmic-stemming ser-string ser-date-options ser-field-name ser-standard-name-list ser-suggester-fuzzy-matching ser-dynamic-field-name ser-analysis-scheme-language ser-long ser-literal-array-options ser-word ser-partition-instance-type ser-literal-options ser-domain-name ser-index-field ser-field-value ser-uint-value ser-scaling-parameters ser-int-options ser-document-suggester-options ser-boolean)

(clojure.core/defn- ser-double-array-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "DoubleArrayOptions.DefaultValue" (ser-double (:default-value shape-input))) (:source-fields shape-input) (clojure.core/assoc "DoubleArrayOptions.SourceFields" (ser-field-name-comma-list (:source-fields shape-input))) (:facet-enabled shape-input) (clojure.core/assoc "DoubleArrayOptions.FacetEnabled" (ser-boolean (:facet-enabled shape-input))) (:search-enabled shape-input) (clojure.core/assoc "DoubleArrayOptions.SearchEnabled" (ser-boolean (:search-enabled shape-input))) (:return-enabled shape-input) (clojure.core/assoc "DoubleArrayOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input)))))
(clojure.core/defn- ser-double [shape-input] shape-input)
(clojure.core/defn- ser-index-field-type [shape-input] ({"int" "int", :int-array "int-array", :date "date", :double "double", :int "int", :double-array "double-array", "text-array" "text-array", "latlon" "latlon", :text-array "text-array", "text" "text", "int-array" "int-array", "literal-array" "literal-array", :literal-array "literal-array", :latlon "latlon", :literal "literal", "double" "double", "date" "date", "double-array" "double-array", "literal" "literal", :date-array "date-array", :text "text", "date-array" "date-array"} shape-input))
(clojure.core/defn- ser-field-name-comma-list [shape-input] shape-input)
(clojure.core/defn- ser-suggester [shape-input] (clojure.core/cond-> {} (:suggester-name shape-input) (clojure.core/assoc "Suggester.SuggesterName" (ser-standard-name (:suggester-name shape-input))) (:document-suggester-options shape-input) (clojure.core/assoc "Suggester.DocumentSuggesterOptions" (ser-document-suggester-options (:document-suggester-options shape-input)))))
(clojure.core/defn- ser-lat-lon-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "LatLonOptions.DefaultValue" (ser-field-value (:default-value shape-input))) (:source-field shape-input) (clojure.core/assoc "LatLonOptions.SourceField" (ser-field-name (:source-field shape-input))) (:facet-enabled shape-input) (clojure.core/assoc "LatLonOptions.FacetEnabled" (ser-boolean (:facet-enabled shape-input))) (:search-enabled shape-input) (clojure.core/assoc "LatLonOptions.SearchEnabled" (ser-boolean (:search-enabled shape-input))) (:return-enabled shape-input) (clojure.core/assoc "LatLonOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input))) (:sort-enabled shape-input) (clojure.core/assoc "LatLonOptions.SortEnabled" (ser-boolean (:sort-enabled shape-input)))))
(clojure.core/defn- ser-text-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "TextOptions.DefaultValue" (ser-field-value (:default-value shape-input))) (:source-field shape-input) (clojure.core/assoc "TextOptions.SourceField" (ser-field-name (:source-field shape-input))) (:return-enabled shape-input) (clojure.core/assoc "TextOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input))) (:sort-enabled shape-input) (clojure.core/assoc "TextOptions.SortEnabled" (ser-boolean (:sort-enabled shape-input))) (:highlight-enabled shape-input) (clojure.core/assoc "TextOptions.HighlightEnabled" (ser-boolean (:highlight-enabled shape-input))) (:analysis-scheme shape-input) (clojure.core/assoc "TextOptions.AnalysisScheme" (ser-word (:analysis-scheme shape-input)))))
(clojure.core/defn- ser-standard-name [shape-input] shape-input)
(clojure.core/defn- ser-analysis-scheme [shape-input] (clojure.core/cond-> {} (:analysis-scheme-name shape-input) (clojure.core/assoc "AnalysisScheme.AnalysisSchemeName" (ser-standard-name (:analysis-scheme-name shape-input))) (:analysis-scheme-language shape-input) (clojure.core/assoc "AnalysisScheme.AnalysisSchemeLanguage" (ser-analysis-scheme-language (:analysis-scheme-language shape-input))) (:analysis-options shape-input) (clojure.core/assoc "AnalysisScheme.AnalysisOptions" (ser-analysis-options (:analysis-options shape-input)))))
(clojure.core/defn- ser-double-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "DoubleOptions.DefaultValue" (ser-double (:default-value shape-input))) (:source-field shape-input) (clojure.core/assoc "DoubleOptions.SourceField" (ser-field-name (:source-field shape-input))) (:facet-enabled shape-input) (clojure.core/assoc "DoubleOptions.FacetEnabled" (ser-boolean (:facet-enabled shape-input))) (:search-enabled shape-input) (clojure.core/assoc "DoubleOptions.SearchEnabled" (ser-boolean (:search-enabled shape-input))) (:return-enabled shape-input) (clojure.core/assoc "DoubleOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input))) (:sort-enabled shape-input) (clojure.core/assoc "DoubleOptions.SortEnabled" (ser-boolean (:sort-enabled shape-input)))))
(clojure.core/defn- ser-expression [shape-input] (clojure.core/cond-> {} (:expression-name shape-input) (clojure.core/assoc "Expression.ExpressionName" (ser-standard-name (:expression-name shape-input))) (:expression-value shape-input) (clojure.core/assoc "Expression.ExpressionValue" (ser-expression-value (:expression-value shape-input)))))
(clojure.core/defn- ser-text-array-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "TextArrayOptions.DefaultValue" (ser-field-value (:default-value shape-input))) (:source-fields shape-input) (clojure.core/assoc "TextArrayOptions.SourceFields" (ser-field-name-comma-list (:source-fields shape-input))) (:return-enabled shape-input) (clojure.core/assoc "TextArrayOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input))) (:highlight-enabled shape-input) (clojure.core/assoc "TextArrayOptions.HighlightEnabled" (ser-boolean (:highlight-enabled shape-input))) (:analysis-scheme shape-input) (clojure.core/assoc "TextArrayOptions.AnalysisScheme" (ser-word (:analysis-scheme shape-input)))))
(clojure.core/defn- ser-int-array-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "IntArrayOptions.DefaultValue" (ser-long (:default-value shape-input))) (:source-fields shape-input) (clojure.core/assoc "IntArrayOptions.SourceFields" (ser-field-name-comma-list (:source-fields shape-input))) (:facet-enabled shape-input) (clojure.core/assoc "IntArrayOptions.FacetEnabled" (ser-boolean (:facet-enabled shape-input))) (:search-enabled shape-input) (clojure.core/assoc "IntArrayOptions.SearchEnabled" (ser-boolean (:search-enabled shape-input))) (:return-enabled shape-input) (clojure.core/assoc "IntArrayOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input)))))
(clojure.core/defn- ser-domain-name-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-dynamic-field-name-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-analysis-options [shape-input] (clojure.core/cond-> {} (:synonyms shape-input) (clojure.core/assoc "AnalysisOptions.Synonyms" (ser-string (:synonyms shape-input))) (:stopwords shape-input) (clojure.core/assoc "AnalysisOptions.Stopwords" (ser-string (:stopwords shape-input))) (:stemming-dictionary shape-input) (clojure.core/assoc "AnalysisOptions.StemmingDictionary" (ser-string (:stemming-dictionary shape-input))) (:japanese-tokenization-dictionary shape-input) (clojure.core/assoc "AnalysisOptions.JapaneseTokenizationDictionary" (ser-string (:japanese-tokenization-dictionary shape-input))) (:algorithmic-stemming shape-input) (clojure.core/assoc "AnalysisOptions.AlgorithmicStemming" (ser-algorithmic-stemming (:algorithmic-stemming shape-input)))))
(clojure.core/defn- ser-date-array-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "DateArrayOptions.DefaultValue" (ser-field-value (:default-value shape-input))) (:source-fields shape-input) (clojure.core/assoc "DateArrayOptions.SourceFields" (ser-field-name-comma-list (:source-fields shape-input))) (:facet-enabled shape-input) (clojure.core/assoc "DateArrayOptions.FacetEnabled" (ser-boolean (:facet-enabled shape-input))) (:search-enabled shape-input) (clojure.core/assoc "DateArrayOptions.SearchEnabled" (ser-boolean (:search-enabled shape-input))) (:return-enabled shape-input) (clojure.core/assoc "DateArrayOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input)))))
(clojure.core/defn- ser-policy-document [shape-input] shape-input)
(clojure.core/defn- ser-expression-value [shape-input] shape-input)
(clojure.core/defn- ser-algorithmic-stemming [shape-input] ({"none" "none", :none "none", "minimal" "minimal", :minimal "minimal", "light" "light", :light "light", "full" "full", :full "full"} shape-input))
(clojure.core/defn- ser-string [shape-input] shape-input)
(clojure.core/defn- ser-date-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "DateOptions.DefaultValue" (ser-field-value (:default-value shape-input))) (:source-field shape-input) (clojure.core/assoc "DateOptions.SourceField" (ser-field-name (:source-field shape-input))) (:facet-enabled shape-input) (clojure.core/assoc "DateOptions.FacetEnabled" (ser-boolean (:facet-enabled shape-input))) (:search-enabled shape-input) (clojure.core/assoc "DateOptions.SearchEnabled" (ser-boolean (:search-enabled shape-input))) (:return-enabled shape-input) (clojure.core/assoc "DateOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input))) (:sort-enabled shape-input) (clojure.core/assoc "DateOptions.SortEnabled" (ser-boolean (:sort-enabled shape-input)))))
(clojure.core/defn- ser-field-name [shape-input] shape-input)
(clojure.core/defn- ser-standard-name-list [shape-input] (clojure.core/into {} (clojure.core/map-indexed (clojure.core/fn [idx__36486__auto__ item__36487__auto__] [(clojure.core/str "member." (clojure.core/inc idx__36486__auto__)) item__36487__auto__]) shape-input)))
(clojure.core/defn- ser-suggester-fuzzy-matching [shape-input] ({"none" "none", :none "none", "low" "low", :low "low", "high" "high", :high "high"} shape-input))
(clojure.core/defn- ser-dynamic-field-name [shape-input] shape-input)
(clojure.core/defn- ser-analysis-scheme-language [shape-input] ({"nl" "nl", :fr "fr", :ja "ja", :el "el", "pt" "pt", "en" "en", :es "es", "lv" "lv", :pt "pt", :fi "fi", :ga "ga", "ro" "ro", "hy" "hy", "tr" "tr", "it" "it", "el" "el", "fa" "fa", :ca "ca", :ro "ro", :th "th", :tr "tr", :cs "cs", :hu "hu", "id" "id", "fi" "fi", :ko "ko", "ca" "ca", "sv" "sv", "fr" "fr", "eu" "eu", :it "it", "da" "da", "hu" "hu", "de" "de", "hi" "hi", :en "en", :nl "nl", "ru" "ru", :mul "mul", "ga" "ga", "es" "es", :de "de", :id "id", :ar "ar", :zh-hant "zh-Hant", "ja" "ja", :hy "hy", "mul" "mul", "gl" "gl", :ru "ru", :gl "gl", "cs" "cs", "no" "no", "zh-Hans" "zh-Hans", :he "he", :sv "sv", :da "da", "ar" "ar", "bg" "bg", "ko" "ko", :zh-hans "zh-Hans", :bg "bg", :lv "lv", "th" "th", :eu "eu", "he" "he", :hi "hi", :no "no", "zh-Hant" "zh-Hant", :fa "fa"} shape-input))
(clojure.core/defn- ser-long [shape-input] shape-input)
(clojure.core/defn- ser-literal-array-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "LiteralArrayOptions.DefaultValue" (ser-field-value (:default-value shape-input))) (:source-fields shape-input) (clojure.core/assoc "LiteralArrayOptions.SourceFields" (ser-field-name-comma-list (:source-fields shape-input))) (:facet-enabled shape-input) (clojure.core/assoc "LiteralArrayOptions.FacetEnabled" (ser-boolean (:facet-enabled shape-input))) (:search-enabled shape-input) (clojure.core/assoc "LiteralArrayOptions.SearchEnabled" (ser-boolean (:search-enabled shape-input))) (:return-enabled shape-input) (clojure.core/assoc "LiteralArrayOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input)))))
(clojure.core/defn- ser-word [shape-input] shape-input)
(clojure.core/defn- ser-partition-instance-type [shape-input] ({"search.m3.2xlarge" "search.m3.2xlarge", "search.m3.large" "search.m3.large", :search.m3.2xlarge "search.m3.2xlarge", "search.m2.xlarge" "search.m2.xlarge", :search.m3.large "search.m3.large", :search.m3.medium "search.m3.medium", :search.m1.small "search.m1.small", :search.m1.large "search.m1.large", "search.m3.xlarge" "search.m3.xlarge", :search.m2.xlarge "search.m2.xlarge", "search.m1.small" "search.m1.small", "search.m3.medium" "search.m3.medium", :search.m3.xlarge "search.m3.xlarge", "search.m1.large" "search.m1.large", :search.m2.2xlarge "search.m2.2xlarge", "search.m2.2xlarge" "search.m2.2xlarge"} shape-input))
(clojure.core/defn- ser-literal-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "LiteralOptions.DefaultValue" (ser-field-value (:default-value shape-input))) (:source-field shape-input) (clojure.core/assoc "LiteralOptions.SourceField" (ser-field-name (:source-field shape-input))) (:facet-enabled shape-input) (clojure.core/assoc "LiteralOptions.FacetEnabled" (ser-boolean (:facet-enabled shape-input))) (:search-enabled shape-input) (clojure.core/assoc "LiteralOptions.SearchEnabled" (ser-boolean (:search-enabled shape-input))) (:return-enabled shape-input) (clojure.core/assoc "LiteralOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input))) (:sort-enabled shape-input) (clojure.core/assoc "LiteralOptions.SortEnabled" (ser-boolean (:sort-enabled shape-input)))))
(clojure.core/defn- ser-domain-name [shape-input] shape-input)
(clojure.core/defn- ser-index-field [shape-input] (clojure.core/cond-> {} (:double-array-options shape-input) (clojure.core/assoc "IndexField.DoubleArrayOptions" (ser-double-array-options (:double-array-options shape-input))) (:index-field-type shape-input) (clojure.core/assoc "IndexField.IndexFieldType" (ser-index-field-type (:index-field-type shape-input))) (:lat-lon-options shape-input) (clojure.core/assoc "IndexField.LatLonOptions" (ser-lat-lon-options (:lat-lon-options shape-input))) (:text-options shape-input) (clojure.core/assoc "IndexField.TextOptions" (ser-text-options (:text-options shape-input))) (:double-options shape-input) (clojure.core/assoc "IndexField.DoubleOptions" (ser-double-options (:double-options shape-input))) (:text-array-options shape-input) (clojure.core/assoc "IndexField.TextArrayOptions" (ser-text-array-options (:text-array-options shape-input))) (:int-array-options shape-input) (clojure.core/assoc "IndexField.IntArrayOptions" (ser-int-array-options (:int-array-options shape-input))) (:date-array-options shape-input) (clojure.core/assoc "IndexField.DateArrayOptions" (ser-date-array-options (:date-array-options shape-input))) (:index-field-name shape-input) (clojure.core/assoc "IndexField.IndexFieldName" (ser-dynamic-field-name (:index-field-name shape-input))) (:date-options shape-input) (clojure.core/assoc "IndexField.DateOptions" (ser-date-options (:date-options shape-input))) (:literal-array-options shape-input) (clojure.core/assoc "IndexField.LiteralArrayOptions" (ser-literal-array-options (:literal-array-options shape-input))) (:literal-options shape-input) (clojure.core/assoc "IndexField.LiteralOptions" (ser-literal-options (:literal-options shape-input))) (:int-options shape-input) (clojure.core/assoc "IndexField.IntOptions" (ser-int-options (:int-options shape-input)))))
(clojure.core/defn- ser-field-value [shape-input] shape-input)
(clojure.core/defn- ser-uint-value [shape-input] shape-input)
(clojure.core/defn- ser-scaling-parameters [shape-input] (clojure.core/cond-> {} (:desired-instance-type shape-input) (clojure.core/assoc "ScalingParameters.DesiredInstanceType" (ser-partition-instance-type (:desired-instance-type shape-input))) (:desired-replication-count shape-input) (clojure.core/assoc "ScalingParameters.DesiredReplicationCount" (ser-uint-value (:desired-replication-count shape-input))) (:desired-partition-count shape-input) (clojure.core/assoc "ScalingParameters.DesiredPartitionCount" (ser-uint-value (:desired-partition-count shape-input)))))
(clojure.core/defn- ser-int-options [shape-input] (clojure.core/cond-> {} (:default-value shape-input) (clojure.core/assoc "IntOptions.DefaultValue" (ser-long (:default-value shape-input))) (:source-field shape-input) (clojure.core/assoc "IntOptions.SourceField" (ser-field-name (:source-field shape-input))) (:facet-enabled shape-input) (clojure.core/assoc "IntOptions.FacetEnabled" (ser-boolean (:facet-enabled shape-input))) (:search-enabled shape-input) (clojure.core/assoc "IntOptions.SearchEnabled" (ser-boolean (:search-enabled shape-input))) (:return-enabled shape-input) (clojure.core/assoc "IntOptions.ReturnEnabled" (ser-boolean (:return-enabled shape-input))) (:sort-enabled shape-input) (clojure.core/assoc "IntOptions.SortEnabled" (ser-boolean (:sort-enabled shape-input)))))
(clojure.core/defn- ser-document-suggester-options [shape-input] (clojure.core/cond-> {} (:source-field shape-input) (clojure.core/assoc "DocumentSuggesterOptions.SourceField" (ser-field-name (:source-field shape-input))) (:fuzzy-matching shape-input) (clojure.core/assoc "DocumentSuggesterOptions.FuzzyMatching" (ser-suggester-fuzzy-matching (:fuzzy-matching shape-input))) (:sort-expression shape-input) (clojure.core/assoc "DocumentSuggesterOptions.SortExpression" (ser-string (:sort-expression shape-input)))))
(clojure.core/defn- ser-boolean [shape-input] shape-input)

(clojure.core/defn req<-delete-index-field-request [action-name42103 input42102] {:body {"DomainName" (ser-domain-name (input42102 :domain-name)), "IndexFieldName" (ser-dynamic-field-name (input42102 :index-field-name)), "Version" "2013-01-01", "Action" action-name42103}})
(clojure.core/defn req<-update-service-access-policies-request [action-name42105 input42104] {:body {"DomainName" (ser-domain-name (input42104 :domain-name)), "AccessPolicies" (ser-policy-document (input42104 :access-policies)), "Version" "2013-01-01", "Action" action-name42105}})
(clojure.core/defn req<-describe-service-access-policies-request [action-name42107 input42106] (clojure.core/let [input42108 {:body {"DomainName" (ser-domain-name (input42106 :domain-name)), "Version" "2013-01-01", "Action" action-name42107}}] (clojure.core/cond-> input42108 (clojure.core/contains? input42106 :deployed) (clojure.core/assoc-in [:body "Deployed"] (ser-boolean (input42106 :deployed))))))
(clojure.core/defn req<-define-analysis-scheme-request [action-name42110 input42109] {:body {"DomainName" (ser-domain-name (input42109 :domain-name)), "AnalysisScheme" (ser-analysis-scheme (input42109 :analysis-scheme)), "Version" "2013-01-01", "Action" action-name42110}})
(clojure.core/defn req<-define-index-field-request [action-name42112 input42111] {:body {"DomainName" (ser-domain-name (input42111 :domain-name)), "IndexField" (ser-index-field (input42111 :index-field)), "Version" "2013-01-01", "Action" action-name42112}})
(clojure.core/defn req<-define-expression-request [action-name42114 input42113] {:body {"DomainName" (ser-domain-name (input42113 :domain-name)), "Expression" (ser-expression (input42113 :expression)), "Version" "2013-01-01", "Action" action-name42114}})
(clojure.core/defn req<-build-suggesters-request [action-name42116 input42115] {:body {"DomainName" (ser-domain-name (input42115 :domain-name)), "Version" "2013-01-01", "Action" action-name42116}})
(clojure.core/defn req<-describe-index-fields-request [action-name42118 input42117] (clojure.core/let [input42119 {:body {"DomainName" (ser-domain-name (input42117 :domain-name)), "Version" "2013-01-01", "Action" action-name42118}}] (clojure.core/cond-> input42119 (clojure.core/contains? input42117 :field-names) (clojure.core/assoc-in [:body "FieldNames"] (ser-dynamic-field-name-list (input42117 :field-names))) (clojure.core/contains? input42117 :deployed) (clojure.core/assoc-in [:body "Deployed"] (ser-boolean (input42117 :deployed))))))
(clojure.core/defn req<-create-domain-request [action-name42121 input42120] {:body {"DomainName" (ser-domain-name (input42120 :domain-name)), "Version" "2013-01-01", "Action" action-name42121}})
(clojure.core/defn req<-define-suggester-request [action-name42123 input42122] {:body {"DomainName" (ser-domain-name (input42122 :domain-name)), "Suggester" (ser-suggester (input42122 :suggester)), "Version" "2013-01-01", "Action" action-name42123}})
(clojure.core/defn req<-delete-expression-request [action-name42125 input42124] {:body {"DomainName" (ser-domain-name (input42124 :domain-name)), "ExpressionName" (ser-standard-name (input42124 :expression-name)), "Version" "2013-01-01", "Action" action-name42125}})
(clojure.core/defn req<-delete-analysis-scheme-request [action-name42127 input42126] {:body {"DomainName" (ser-domain-name (input42126 :domain-name)), "AnalysisSchemeName" (ser-standard-name (input42126 :analysis-scheme-name)), "Version" "2013-01-01", "Action" action-name42127}})
(clojure.core/defn req<-describe-analysis-schemes-request [action-name42129 input42128] (clojure.core/let [input42130 {:body {"DomainName" (ser-domain-name (input42128 :domain-name)), "Version" "2013-01-01", "Action" action-name42129}}] (clojure.core/cond-> input42130 (clojure.core/contains? input42128 :analysis-scheme-names) (clojure.core/assoc-in [:body "AnalysisSchemeNames"] (ser-standard-name-list (input42128 :analysis-scheme-names))) (clojure.core/contains? input42128 :deployed) (clojure.core/assoc-in [:body "Deployed"] (ser-boolean (input42128 :deployed))))))
(clojure.core/defn req<-describe-domains-request [action-name42132 input42131] (clojure.core/cond-> {:body {"Version" "2013-01-01", "Action" action-name42132}} (clojure.core/contains? input42131 :domain-names) (clojure.core/assoc-in [:body "DomainNames"] (ser-domain-name-list (input42131 :domain-names)))))
(clojure.core/defn req<-update-availability-options-request [action-name42134 input42133] {:body {"DomainName" (ser-domain-name (input42133 :domain-name)), "MultiAZ" (ser-boolean (input42133 :multiaz)), "Version" "2013-01-01", "Action" action-name42134}})
(clojure.core/defn req<-update-scaling-parameters-request [action-name42136 input42135] {:body {"DomainName" (ser-domain-name (input42135 :domain-name)), "ScalingParameters" (ser-scaling-parameters (input42135 :scaling-parameters)), "Version" "2013-01-01", "Action" action-name42136}})
(clojure.core/defn req<-describe-scaling-parameters-request [action-name42138 input42137] {:body {"DomainName" (ser-domain-name (input42137 :domain-name)), "Version" "2013-01-01", "Action" action-name42138}})
(clojure.core/defn req<-index-documents-request [action-name42140 input42139] {:body {"DomainName" (ser-domain-name (input42139 :domain-name)), "Version" "2013-01-01", "Action" action-name42140}})
(clojure.core/defn req<-delete-domain-request [action-name42142 input42141] {:body {"DomainName" (ser-domain-name (input42141 :domain-name)), "Version" "2013-01-01", "Action" action-name42142}})
(clojure.core/defn req<-delete-suggester-request [action-name42144 input42143] {:body {"DomainName" (ser-domain-name (input42143 :domain-name)), "SuggesterName" (ser-standard-name (input42143 :suggester-name)), "Version" "2013-01-01", "Action" action-name42144}})
(clojure.core/defn req<-describe-availability-options-request [action-name42146 input42145] (clojure.core/let [input42147 {:body {"DomainName" (ser-domain-name (input42145 :domain-name)), "Version" "2013-01-01", "Action" action-name42146}}] (clojure.core/cond-> input42147 (clojure.core/contains? input42145 :deployed) (clojure.core/assoc-in [:body "Deployed"] (ser-boolean (input42145 :deployed))))))
(clojure.core/defn req<-describe-expressions-request [action-name42149 input42148] (clojure.core/let [input42150 {:body {"DomainName" (ser-domain-name (input42148 :domain-name)), "Version" "2013-01-01", "Action" action-name42149}}] (clojure.core/cond-> input42150 (clojure.core/contains? input42148 :expression-names) (clojure.core/assoc-in [:body "ExpressionNames"] (ser-standard-name-list (input42148 :expression-names))) (clojure.core/contains? input42148 :deployed) (clojure.core/assoc-in [:body "Deployed"] (ser-boolean (input42148 :deployed))))))
(clojure.core/defn req<-describe-suggesters-request [action-name42152 input42151] (clojure.core/let [input42153 {:body {"DomainName" (ser-domain-name (input42151 :domain-name)), "Version" "2013-01-01", "Action" action-name42152}}] (clojure.core/cond-> input42153 (clojure.core/contains? input42151 :suggester-names) (clojure.core/assoc-in [:body "SuggesterNames"] (ser-standard-name-list (input42151 :suggester-names))) (clojure.core/contains? input42151 :deployed) (clojure.core/assoc-in [:body "Deployed"] (ser-boolean (input42151 :deployed))))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.index-documents-response/field-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-documents-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.index-documents-response/FieldNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/double-array-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.double-array-options/DefaultValue :portkey.aws.cloudsearch.double-array-options/SourceFields :portkey.aws.cloudsearch.double-array-options/FacetEnabled :portkey.aws.cloudsearch.double-array-options/SearchEnabled :portkey.aws.cloudsearch.double-array-options/ReturnEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-field-type {"int" "int", :int-array "int-array", :date "date", :double "double", :int "int", :double-array "double-array", "text-array" "text-array", "latlon" "latlon", :text-array "text-array", "text" "text", "int-array" "int-array", "literal-array" "literal-array", :literal-array "literal-array", :latlon "latlon", :literal "literal", "double" "double", "date" "date", "double-array" "double-array", "literal" "literal", :date-array "date-array", :text "text", "date-array" "date-array"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-field-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/index-field-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-timestamp clojure.core/inst?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/domain-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.update-availability-options-request/multiaz (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-availability-options-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch.update-availability-options-request/MultiAZ] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-index-fields-request/field-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/dynamic-field-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-index-fields-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-index-fields-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [:portkey.aws.cloudsearch.describe-index-fields-request/FieldNames :portkey.aws.cloudsearch.describe-index-fields-request/Deployed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-analysis-scheme-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch/AnalysisScheme] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-scaling-parameters-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/apiversion (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.define-index-field-response/index-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/index-field-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-index-field-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.define-index-field-response/IndexField] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-analysis-schemes-request/analysis-scheme-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-analysis-schemes-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-analysis-schemes-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [:portkey.aws.cloudsearch.describe-analysis-schemes-request/AnalysisSchemeNames :portkey.aws.cloudsearch.describe-analysis-schemes-request/Deployed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-expressions-response/expressions (clojure.spec.alpha/and :portkey.aws.cloudsearch/expression-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-expressions-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.describe-expressions-response/Expressions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/field-name-comma-list (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"\s*[a-z*][a-z0-9_]*\*?\s*(,\s*[a-z*][a-z0-9_]*\*?\s*)*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/maximum-replication-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.suggester/suggester-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/suggester (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.suggester/SuggesterName :portkey.aws.cloudsearch/DocumentSuggesterOptions] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-suggester-request/suggester-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-suggester-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch.delete-suggester-request/SuggesterName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.lat-lon-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/lat-lon-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.lat-lon-options/DefaultValue :portkey.aws.cloudsearch.lat-lon-options/SourceField :portkey.aws.cloudsearch.lat-lon-options/FacetEnabled :portkey.aws.cloudsearch.lat-lon-options/SearchEnabled :portkey.aws.cloudsearch.lat-lon-options/ReturnEnabled :portkey.aws.cloudsearch.lat-lon-options/SortEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/highlight-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-options/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch/word))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/text-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.text-options/DefaultValue :portkey.aws.cloudsearch.text-options/SourceField :portkey.aws.cloudsearch.text-options/ReturnEnabled :portkey.aws.cloudsearch.text-options/SortEnabled :portkey.aws.cloudsearch.text-options/HighlightEnabled :portkey.aws.cloudsearch.text-options/AnalysisScheme] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/instance-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-scheme-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/analysis-scheme))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-scheme-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/analysis-scheme-status (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.analysis-scheme-status/Options :portkey.aws.cloudsearch.analysis-scheme-status/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-suggester-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch/Suggester] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/standard-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[a-z][a-z0-9_]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-expression-request/expression-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-expression-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch.delete-expression-request/ExpressionName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-index-field-request/index-field-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/dynamic-field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-index-field-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch.delete-index-field-request/IndexFieldName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-scheme/analysis-scheme-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/analysis-scheme (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.analysis-scheme/AnalysisSchemeName :portkey.aws.cloudsearch/AnalysisSchemeLanguage] :opt-un [:portkey.aws.cloudsearch/AnalysisOptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.define-analysis-scheme-response/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch/analysis-scheme-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-analysis-scheme-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.define-analysis-scheme-response/AnalysisScheme] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.index-field-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/index-field))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.index-field-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-field-status (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.index-field-status/Options :portkey.aws.cloudsearch.index-field-status/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-availability-options-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-availability-options-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [:portkey.aws.cloudsearch.describe-availability-options-request/Deployed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/create-domain-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/arn (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/limit-exceeded-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-domains-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainStatusList] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.scaling-parameters-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/scaling-parameters))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.scaling-parameters-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/scaling-parameters-status (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.scaling-parameters-status/Options :portkey.aws.cloudsearch.scaling-parameters-status/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.double-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/double-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.double-options/DefaultValue :portkey.aws.cloudsearch.double-options/SourceField :portkey.aws.cloudsearch.double-options/FacetEnabled :portkey.aws.cloudsearch.double-options/SearchEnabled :portkey.aws.cloudsearch.double-options/ReturnEnabled :portkey.aws.cloudsearch.double-options/SortEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.expression/expression-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/expression (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.expression/ExpressionName :portkey.aws.cloudsearch/ExpressionValue] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/field-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/field-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-array-options/highlight-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.text-array-options/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch/word))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/text-array-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.text-array-options/DefaultValue :portkey.aws.cloudsearch.text-array-options/SourceFields :portkey.aws.cloudsearch.text-array-options/ReturnEnabled :portkey.aws.cloudsearch.text-array-options/HighlightEnabled :portkey.aws.cloudsearch.text-array-options/AnalysisScheme] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-expression-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch/Expression] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.update-availability-options-response/availability-options (clojure.spec.alpha/and :portkey.aws.cloudsearch/availability-options-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-availability-options-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.update-availability-options-response/AvailabilityOptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/invalid-type-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-scaling-parameters-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch/ScalingParameters] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.build-suggesters-response/field-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/build-suggesters-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.build-suggesters-response/FieldNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/service-url (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/int-array-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.int-array-options/DefaultValue :portkey.aws.cloudsearch.int-array-options/SourceFields :portkey.aws.cloudsearch.int-array-options/FacetEnabled :portkey.aws.cloudsearch.int-array-options/SearchEnabled :portkey.aws.cloudsearch.int-array-options/ReturnEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-documents-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/disabled-operation-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.list-domain-names-response/domain-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/domain-name-map))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/list-domain-names-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.list-domain-names-response/DomainNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/domain-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/created (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/requires-index-documents (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/doc-service (clojure.spec.alpha/and :portkey.aws.cloudsearch/service-endpoint))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/deleted (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/search-instance-count (clojure.spec.alpha/and :portkey.aws.cloudsearch/instance-count))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/processing (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/search-service (clojure.spec.alpha/and :portkey.aws.cloudsearch/service-endpoint))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.domain-status/search-partition-count (clojure.spec.alpha/and :portkey.aws.cloudsearch/partition-count))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-status (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainId :portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch.domain-status/RequiresIndexDocuments] :opt-un [:portkey.aws.cloudsearch.domain-status/Created :portkey.aws.cloudsearch/ARN :portkey.aws.cloudsearch/Limits :portkey.aws.cloudsearch.domain-status/DocService :portkey.aws.cloudsearch.domain-status/Deleted :portkey.aws.cloudsearch.domain-status/SearchInstanceCount :portkey.aws.cloudsearch.domain-status/Processing :portkey.aws.cloudsearch.domain-status/SearchService :portkey.aws.cloudsearch/SearchInstanceType :portkey.aws.cloudsearch.domain-status/SearchPartitionCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-domain-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.service-endpoint/endpoint (clojure.spec.alpha/and :portkey.aws.cloudsearch/service-url))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/service-endpoint (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.service-endpoint/Endpoint] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/suggester-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/suggester-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/limits (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/MaximumReplicationCount :portkey.aws.cloudsearch/MaximumPartitionCount] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/build-suggesters-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/dynamic-field-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/dynamic-field-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-options/synonyms (clojure.spec.alpha/and :portkey.aws.cloudsearch/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-options/stopwords (clojure.spec.alpha/and :portkey.aws.cloudsearch/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-options/stemming-dictionary (clojure.spec.alpha/and :portkey.aws.cloudsearch/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.analysis-options/japanese-tokenization-dictionary (clojure.spec.alpha/and :portkey.aws.cloudsearch/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/analysis-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.analysis-options/Synonyms :portkey.aws.cloudsearch.analysis-options/Stopwords :portkey.aws.cloudsearch.analysis-options/StemmingDictionary :portkey.aws.cloudsearch.analysis-options/JapaneseTokenizationDictionary :portkey.aws.cloudsearch/AlgorithmicStemming] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/error-code (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/partition-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-index-field-response/index-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/index-field-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-index-field-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.delete-index-field-response/IndexField] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/resource-not-found-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-availability-options-response/availability-options (clojure.spec.alpha/and :portkey.aws.cloudsearch/availability-options-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-availability-options-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.describe-availability-options-response/AvailabilityOptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-service-access-policies-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-service-access-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [:portkey.aws.cloudsearch.describe-service-access-policies-request/Deployed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.option-status/creation-date (clojure.spec.alpha/and :portkey.aws.cloudsearch/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.option-status/update-date (clojure.spec.alpha/and :portkey.aws.cloudsearch/update-timestamp))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.option-status/update-version (clojure.spec.alpha/and :portkey.aws.cloudsearch/uint-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.option-status/state (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-state))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.option-status/pending-deletion (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/option-status (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.option-status/CreationDate :portkey.aws.cloudsearch.option-status/UpdateDate :portkey.aws.cloudsearch.option-status/State] :opt-un [:portkey.aws.cloudsearch.option-status/UpdateVersion :portkey.aws.cloudsearch.option-status/PendingDeletion] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/date-array-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.date-array-options/DefaultValue :portkey.aws.cloudsearch.date-array-options/SourceFields :portkey.aws.cloudsearch.date-array-options/FacetEnabled :portkey.aws.cloudsearch.date-array-options/SearchEnabled :portkey.aws.cloudsearch.date-array-options/ReturnEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/policy-document (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/expression-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 10240))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/algorithmic-stemming {"none" "none", :none "none", "minimal" "minimal", :minimal "minimal", "light" "light", :light "light", "full" "full", :full "full"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch/internal-exception (portkey.aws/json-keys :req-un [] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.suggester-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/suggester))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.suggester-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/suggester-status (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.suggester-status/Options :portkey.aws.cloudsearch.suggester-status/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.define-suggester-response/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearch/suggester-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-suggester-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.define-suggester-response/Suggester] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-suggester-response/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearch/suggester-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-suggester-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.delete-suggester-response/Suggester] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-service-access-policies-response/access-policies (clojure.spec.alpha/and :portkey.aws.cloudsearch/access-policies-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-service-access-policies-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.describe-service-access-policies-response/AccessPolicies] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.date-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/date-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.date-options/DefaultValue :portkey.aws.cloudsearch.date-options/SourceField :portkey.aws.cloudsearch.date-options/FacetEnabled :portkey.aws.cloudsearch.date-options/SearchEnabled :portkey.aws.cloudsearch.date-options/ReturnEnabled :portkey.aws.cloudsearch.date-options/SortEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-analysis-schemes-response/analysis-schemes (clojure.spec.alpha/and :portkey.aws.cloudsearch/analysis-scheme-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-analysis-schemes-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.describe-analysis-schemes-response/AnalysisSchemes] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[a-z][a-z0-9_]*" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-name-map (clojure.spec.alpha/map-of :portkey.aws.cloudsearch/domain-name :portkey.aws.cloudsearch/apiversion))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.base-exception/code (clojure.spec.alpha/and :portkey.aws.cloudsearch/error-code))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.base-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearch/error-message))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/base-exception (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.base-exception/Code :portkey.aws.cloudsearch.base-exception/Message] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/standard-name-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/standard-name))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/suggester-fuzzy-matching {"none" "none", :none "none", "low" "low", :low "low", "high" "high", :high "high"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-id (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-domain-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch/DomainStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-index-fields-response/index-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/index-field-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-index-fields-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.describe-index-fields-response/IndexFields] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/dynamic-field-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 1 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 64)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"([a-z][a-z0-9_]*\*?|\*[a-z0-9_]*)" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/expression-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/expression-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/analysis-scheme-language {"nl" "nl", :fr "fr", :ja "ja", :el "el", "pt" "pt", "en" "en", :es "es", "lv" "lv", :pt "pt", :fi "fi", :ga "ga", "ro" "ro", "hy" "hy", "tr" "tr", "it" "it", "el" "el", "fa" "fa", :ca "ca", :ro "ro", :th "th", :tr "tr", :cs "cs", :hu "hu", "id" "id", "fi" "fi", :ko "ko", "ca" "ca", "sv" "sv", "fr" "fr", "eu" "eu", :it "it", "da" "da", "hu" "hu", "de" "de", "hi" "hi", :en "en", :nl "nl", "ru" "ru", :mul "mul", "ga" "ga", "es" "es", :de "de", :id "id", :ar "ar", :zh-hant "zh-Hant", "ja" "ja", :hy "hy", "mul" "mul", "gl" "gl", :ru "ru", :gl "gl", "cs" "cs", "no" "no", "zh-Hans" "zh-Hans", :he "he", :sv "sv", :da "da", "ar" "ar", "bg" "bg", "ko" "ko", :zh-hans "zh-Hans", :bg "bg", :lv "lv", "th" "th", :eu "eu", "he" "he", :hi "hi", :no "no", "zh-Hant" "zh-Hant", :fa "fa"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-suggesters-request/suggester-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-suggesters-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-suggesters-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [:portkey.aws.cloudsearch.describe-suggesters-request/SuggesterNames :portkey.aws.cloudsearch.describe-suggesters-request/Deployed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch.define-expression-response/expression (clojure.spec.alpha/and :portkey.aws.cloudsearch/expression-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-expression-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.define-expression-response/Expression] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-array-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-array-options/source-fields (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name-comma-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-array-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-array-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-array-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/literal-array-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.literal-array-options/DefaultValue :portkey.aws.cloudsearch.literal-array-options/SourceFields :portkey.aws.cloudsearch.literal-array-options/FacetEnabled :portkey.aws.cloudsearch.literal-array-options/SearchEnabled :portkey.aws.cloudsearch.literal-array-options/ReturnEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-analysis-scheme-response/analysis-scheme (clojure.spec.alpha/and :portkey.aws.cloudsearch/analysis-scheme-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-analysis-scheme-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.delete-analysis-scheme-response/AnalysisScheme] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/word (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[\S]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/partition-instance-type {"search.m3.2xlarge" "search.m3.2xlarge", "search.m3.large" "search.m3.large", :search.m3.2xlarge "search.m3.2xlarge", "search.m2.xlarge" "search.m2.xlarge", :search.m3.large "search.m3.large", :search.m3.medium "search.m3.medium", :search.m1.small "search.m1.small", :search.m1.large "search.m1.large", "search.m3.xlarge" "search.m3.xlarge", :search.m2.xlarge "search.m2.xlarge", "search.m1.small" "search.m1.small", "search.m3.medium" "search.m3.medium", :search.m3.xlarge "search.m3.xlarge", "search.m1.large" "search.m1.large", :search.m2.2xlarge "search.m2.2xlarge", "search.m2.2xlarge" "search.m2.2xlarge"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch/define-index-field-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch/IndexField] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.expression-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/expression))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.expression-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/expression-status (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.expression-status/Options :portkey.aws.cloudsearch.expression-status/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.literal-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/literal-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.literal-options/DefaultValue :portkey.aws.cloudsearch.literal-options/SourceField :portkey.aws.cloudsearch.literal-options/FacetEnabled :portkey.aws.cloudsearch.literal-options/SearchEnabled :portkey.aws.cloudsearch.literal-options/ReturnEnabled :portkey.aws.cloudsearch.literal-options/SortEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.update-scaling-parameters-response/scaling-parameters (clojure.spec.alpha/and :portkey.aws.cloudsearch/scaling-parameters-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-scaling-parameters-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.update-scaling-parameters-response/ScalingParameters] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.update-service-access-policies-response/access-policies (clojure.spec.alpha/and :portkey.aws.cloudsearch/access-policies-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-service-access-policies-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.update-service-access-policies-response/AccessPolicies] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.access-policies-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/policy-document))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.access-policies-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/access-policies-status (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.access-policies-status/Options :portkey.aws.cloudsearch.access-policies-status/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-scaling-parameters-response/scaling-parameters (clojure.spec.alpha/and :portkey.aws.cloudsearch/scaling-parameters-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-scaling-parameters-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.describe-scaling-parameters-response/ScalingParameters] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/domain-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 3 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 28)) (clojure.core/fn [s__36228__auto__] (clojure.core/re-matches #"[a-z][a-z0-9\-]+" s__36228__auto__))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-expressions-request/expression-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-expressions-request/deployed (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-expressions-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName] :opt-un [:portkey.aws.cloudsearch.describe-expressions-request/ExpressionNames :portkey.aws.cloudsearch.describe-expressions-request/Deployed] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.index-field/index-field-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/dynamic-field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/index-field (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.index-field/IndexFieldName :portkey.aws.cloudsearch/IndexFieldType] :opt-un [:portkey.aws.cloudsearch/DoubleArrayOptions :portkey.aws.cloudsearch/LatLonOptions :portkey.aws.cloudsearch/TextOptions :portkey.aws.cloudsearch/DoubleOptions :portkey.aws.cloudsearch/TextArrayOptions :portkey.aws.cloudsearch/IntArrayOptions :portkey.aws.cloudsearch/DateArrayOptions :portkey.aws.cloudsearch/DateOptions :portkey.aws.cloudsearch/LiteralArrayOptions :portkey.aws.cloudsearch/LiteralOptions :portkey.aws.cloudsearch/IntOptions] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-domains-request/domain-names (clojure.spec.alpha/and :portkey.aws.cloudsearch/domain-name-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-domains-request (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.describe-domains-request/DomainNames] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-expression-response/expression (clojure.spec.alpha/and :portkey.aws.cloudsearch/expression-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-expression-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.delete-expression-response/Expression] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/field-value (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__36226__auto__] (clojure.core/<= 0 (clojure.core/count s__36226__auto__))) (clojure.core/fn [s__36227__auto__] (clojure.core/< (clojure.core/count s__36227__auto__) 1024))))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.delete-analysis-scheme-request/analysis-scheme-name (clojure.spec.alpha/and :portkey.aws.cloudsearch/standard-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/delete-analysis-scheme-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch.delete-analysis-scheme-request/AnalysisSchemeName] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/maximum-partition-count (clojure.spec.alpha/int-in 1 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/search-instance-type (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.update-service-access-policies-request/access-policies (clojure.spec.alpha/and :portkey.aws.cloudsearch/policy-document))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/update-service-access-policies-request (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch/DomainName :portkey.aws.cloudsearch.update-service-access-policies-request/AccessPolicies] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/option-state {"RequiresIndexDocuments" "RequiresIndexDocuments", :requires-index-documents "RequiresIndexDocuments", "Processing" "Processing", :processing "Processing", "Active" "Active", :active "Active", "FailedToValidate" "FailedToValidate", :failed-to-validate "FailedToValidate"})

(clojure.spec.alpha/def :portkey.aws.cloudsearch/create-domain-response (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch/DomainStatus] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/multiaz clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudsearch/uint-value (clojure.spec.alpha/int-in 0 Long/MAX_VALUE))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.scaling-parameters/desired-instance-type (clojure.spec.alpha/and :portkey.aws.cloudsearch/partition-instance-type))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.scaling-parameters/desired-replication-count (clojure.spec.alpha/and :portkey.aws.cloudsearch/uint-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.scaling-parameters/desired-partition-count (clojure.spec.alpha/and :portkey.aws.cloudsearch/uint-value))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/scaling-parameters (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.scaling-parameters/DesiredInstanceType :portkey.aws.cloudsearch.scaling-parameters/DesiredReplicationCount :portkey.aws.cloudsearch.scaling-parameters/DesiredPartitionCount] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.describe-suggesters-response/suggesters (clojure.spec.alpha/and :portkey.aws.cloudsearch/suggester-status-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/describe-suggesters-response (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.describe-suggesters-response/Suggesters] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/default-value (clojure.spec.alpha/and :portkey.aws.cloudsearch/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/facet-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/search-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/return-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.int-options/sort-enabled (clojure.spec.alpha/and :portkey.aws.cloudsearch/boolean))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/int-options (portkey.aws/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearch.int-options/DefaultValue :portkey.aws.cloudsearch.int-options/SourceField :portkey.aws.cloudsearch.int-options/FacetEnabled :portkey.aws.cloudsearch.int-options/SearchEnabled :portkey.aws.cloudsearch.int-options/ReturnEnabled :portkey.aws.cloudsearch.int-options/SortEnabled] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/analysis-scheme-status-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearch/analysis-scheme-status))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.document-suggester-options/source-field (clojure.spec.alpha/and :portkey.aws.cloudsearch/field-name))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.document-suggester-options/fuzzy-matching (clojure.spec.alpha/and :portkey.aws.cloudsearch/suggester-fuzzy-matching))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.document-suggester-options/sort-expression (clojure.spec.alpha/and :portkey.aws.cloudsearch/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/document-suggester-options (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.document-suggester-options/SourceField] :opt-un [:portkey.aws.cloudsearch.document-suggester-options/FuzzyMatching :portkey.aws.cloudsearch.document-suggester-options/SortExpression] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch.availability-options-status/options (clojure.spec.alpha/and :portkey.aws.cloudsearch/multiaz))
(clojure.spec.alpha/def :portkey.aws.cloudsearch.availability-options-status/status (clojure.spec.alpha/and :portkey.aws.cloudsearch/option-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearch/availability-options-status (portkey.aws/json-keys :req-un [:portkey.aws.cloudsearch.availability-options-status/Options :portkey.aws.cloudsearch.availability-options-status/Status] :opt-un [] :locations {}))

(clojure.spec.alpha/def :portkey.aws.cloudsearch/boolean clojure.core/boolean?)

(clojure.core/defn delete-index-field "Removes an IndexField from the search domain. For more information, see\nConfiguring Index Fields\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html)\nin the Amazon CloudSearch Developer Guide." ([delete-index-field-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-index-field-request "DeleteIndexField" delete-index-field-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/delete-index-field-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/delete-index-field-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef delete-index-field :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/delete-index-field-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/delete-index-field-response))

nil

(clojure.core/defn update-service-access-policies "Configures the access rules that control access to the domain's document and\nsearch endpoints. For more information, see Configuring Access for an Amazon\nCloudSearch Domain\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html)." ([update-service-access-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-service-access-policies-request "UpdateServiceAccessPolicies" update-service-access-policies-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/update-service-access-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/update-service-access-policies-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception}))))
(clojure.spec.alpha/fdef update-service-access-policies :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/update-service-access-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/update-service-access-policies-response))

(clojure.core/defn describe-service-access-policies "Gets information about the access policies that control access to the domain's\ndocument and search endpoints. By default, shows the configuration with any\npending changes. Set the Deployed option to true to show the active\nconfiguration and exclude pending changes. For more information, see Configuring\nAccess for a Search Domain\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-access.html)\nin the Amazon CloudSearch Developer Guide." ([describe-service-access-policies-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-service-access-policies-request "DescribeServiceAccessPolicies" describe-service-access-policies-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/describe-service-access-policies-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/describe-service-access-policies-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef describe-service-access-policies :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-service-access-policies-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-service-access-policies-response))

(clojure.core/defn define-analysis-scheme "Configures an analysis scheme that can be applied to a text or text-array field\nto define language-specific text processing options. For more information, see\nConfiguring Analysis Schemes\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html)\nin the Amazon CloudSearch Developer Guide." ([define-analysis-scheme-request] (clojure.core/let [req<-input__36755__auto__ (req<-define-analysis-scheme-request "DefineAnalysisScheme" define-analysis-scheme-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/define-analysis-scheme-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/define-analysis-scheme-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef define-analysis-scheme :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/define-analysis-scheme-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/define-analysis-scheme-response))

(clojure.core/defn define-index-field "Configures an IndexField for the search domain. Used to create new fields and\nmodify existing ones. You must specify the name of the domain you are\nconfiguring and an index field configuration. The index field configuration\nspecifies a unique name, the index field type, and the options you want to\nconfigure for the field. The options you can specify depend on the\nIndexFieldType. If the field exists, the new configuration replaces the old one.\nFor more information, see Configuring Index Fields\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-index-fields.html)\nin the Amazon CloudSearch Developer Guide." ([define-index-field-request] (clojure.core/let [req<-input__36755__auto__ (req<-define-index-field-request "DefineIndexField" define-index-field-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/define-index-field-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/define-index-field-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef define-index-field :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/define-index-field-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/define-index-field-response))

(clojure.core/defn define-expression "Configures an Expression for the search domain. Used to create new expressions\nand modify existing ones. If the expression exists, the new configuration\nreplaces the old one. For more information, see Configuring Expressions\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html)\nin the Amazon CloudSearch Developer Guide." ([define-expression-request] (clojure.core/let [req<-input__36755__auto__ (req<-define-expression-request "DefineExpression" define-expression-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/define-expression-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/define-expression-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef define-expression :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/define-expression-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/define-expression-response))

(clojure.core/defn build-suggesters "Indexes the search suggestions. For more information, see Configuring Suggesters\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html#configuring-suggesters)\nin the Amazon CloudSearch Developer Guide." ([build-suggesters-request] (clojure.core/let [req<-input__36755__auto__ (req<-build-suggesters-request "BuildSuggesters" build-suggesters-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/build-suggesters-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/build-suggesters-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef build-suggesters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/build-suggesters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/build-suggesters-response))

(clojure.core/defn describe-index-fields "Gets information about the index fields configured for the search domain. Can be\nlimited to specific fields by name. By default, shows all fields and includes\nany pending changes to the configuration. Set the Deployed option to true to\nshow the active configuration and exclude pending changes. For more information,\nsee Getting Domain Information\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html)\nin the Amazon CloudSearch Developer Guide." ([describe-index-fields-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-index-fields-request "DescribeIndexFields" describe-index-fields-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/describe-index-fields-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/describe-index-fields-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef describe-index-fields :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-index-fields-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-index-fields-response))

(clojure.core/defn create-domain "Creates a new search domain. For more information, see Creating a Search Domain\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/creating-domains.html)\nin the Amazon CloudSearch Developer Guide." ([create-domain-request] (clojure.core/let [req<-input__36755__auto__ (req<-create-domain-request "CreateDomain" create-domain-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/create-domain-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/create-domain-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception}))))
(clojure.spec.alpha/fdef create-domain :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/create-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/create-domain-response))

(clojure.core/defn define-suggester "Configures a suggester for a domain. A suggester enables you to display possible\nmatches before users finish typing their queries. When you configure a\nsuggester, you must specify the name of the text field you want to search for\npossible matches and a unique name for the suggester. For more information, see\nGetting Search Suggestions\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html)\nin the Amazon CloudSearch Developer Guide." ([define-suggester-request] (clojure.core/let [req<-input__36755__auto__ (req<-define-suggester-request "DefineSuggester" define-suggester-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/define-suggester-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/define-suggester-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef define-suggester :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/define-suggester-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/define-suggester-response))

(clojure.core/defn delete-expression "Removes an Expression from the search domain. For more information, see\nConfiguring Expressions\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html)\nin the Amazon CloudSearch Developer Guide." ([delete-expression-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-expression-request "DeleteExpression" delete-expression-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/delete-expression-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/delete-expression-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef delete-expression :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/delete-expression-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/delete-expression-response))

(clojure.core/defn delete-analysis-scheme "Deletes an analysis scheme. For more information, see Configuring Analysis\nSchemes\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html)\nin the Amazon CloudSearch Developer Guide." ([delete-analysis-scheme-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-analysis-scheme-request "DeleteAnalysisScheme" delete-analysis-scheme-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/delete-analysis-scheme-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/delete-analysis-scheme-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef delete-analysis-scheme :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/delete-analysis-scheme-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/delete-analysis-scheme-response))

(clojure.core/defn describe-analysis-schemes "Gets the analysis schemes configured for a domain. An analysis scheme defines\nlanguage-specific text processing options for a text field. Can be limited to\nspecific analysis schemes by name. By default, shows all analysis schemes and\nincludes any pending changes to the configuration. Set the Deployed option to\ntrue to show the active configuration and exclude pending changes. For more\ninformation, see Configuring Analysis Schemes\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-analysis-schemes.html)\nin the Amazon CloudSearch Developer Guide." ([describe-analysis-schemes-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-analysis-schemes-request "DescribeAnalysisSchemes" describe-analysis-schemes-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/describe-analysis-schemes-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/describe-analysis-schemes-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef describe-analysis-schemes :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-analysis-schemes-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-analysis-schemes-response))

(clojure.core/defn describe-domains "Gets information about the search domains owned by this account. Can be limited\nto specific domains. Shows all domains by default. To get the number of\nsearchable documents in a domain, use the console or submit a matchall request\nto your domain's search endpoint: q=matchall&amp;q.parser=structured&amp;size=0.\nFor more information, see Getting Information about a Search Domain\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-domain-info.html)\nin the Amazon CloudSearch Developer Guide." ([] (describe-domains {})) ([describe-domains-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-domains-request "DescribeDomains" describe-domains-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/describe-domains-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/describe-domains-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception}))))
(clojure.spec.alpha/fdef describe-domains :args (clojure.spec.alpha/? :portkey.aws.cloudsearch/describe-domains-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-domains-response))

(clojure.core/defn update-availability-options "Configures the availability options for a domain. Enabling the Multi-AZ option\nexpands an Amazon CloudSearch domain to an additional Availability Zone in the\nsame Region to increase fault tolerance in the event of a service disruption.\nChanges to the Multi-AZ option can take about half an hour to become active. For\nmore information, see Configuring Availability Options\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html)\nin the Amazon CloudSearch Developer Guide." ([update-availability-options-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-availability-options-request "UpdateAvailabilityOptions" update-availability-options-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/update-availability-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/update-availability-options-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception, "DisabledOperationException" :portkey.aws.cloudsearch/disabled-operation-exception}))))
(clojure.spec.alpha/fdef update-availability-options :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/update-availability-options-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/update-availability-options-response))

(clojure.core/defn update-scaling-parameters "Configures scaling parameters for a domain. A domain's scaling parameters\nspecify the desired search instance type and replication count. Amazon\nCloudSearch will still automatically scale your domain based on the volume of\ndata and traffic, but not below the desired instance type and replication count.\nIf the Multi-AZ option is enabled, these values control the resources used per\nAvailability Zone. For more information, see Configuring Scaling Options\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html)\nin the Amazon CloudSearch Developer Guide." ([update-scaling-parameters-request] (clojure.core/let [req<-input__36755__auto__ (req<-update-scaling-parameters-request "UpdateScalingParameters" update-scaling-parameters-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/update-scaling-parameters-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/update-scaling-parameters-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception}))))
(clojure.spec.alpha/fdef update-scaling-parameters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/update-scaling-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/update-scaling-parameters-response))

(clojure.core/defn describe-scaling-parameters "Gets the scaling parameters configured for a domain. A domain's scaling\nparameters specify the desired search instance type and replication count. For\nmore information, see Configuring Scaling Options\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-scaling-options.html)\nin the Amazon CloudSearch Developer Guide." ([describe-scaling-parameters-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-scaling-parameters-request "DescribeScalingParameters" describe-scaling-parameters-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/describe-scaling-parameters-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/describe-scaling-parameters-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef describe-scaling-parameters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-scaling-parameters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-scaling-parameters-response))

(clojure.core/defn index-documents "Tells the search domain to start indexing its documents using the latest\nindexing options. This operation must be invoked to activate options whose\nOptionStatus is RequiresIndexDocuments." ([index-documents-request] (clojure.core/let [req<-input__36755__auto__ (req<-index-documents-request "IndexDocuments" index-documents-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/index-documents-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/index-documents-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef index-documents :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/index-documents-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/index-documents-response))

(clojure.core/defn delete-domain "Permanently deletes a search domain and all of its data. Once a domain has been\ndeleted, it cannot be recovered. For more information, see Deleting a Search\nDomain\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/deleting-domains.html)\nin the Amazon CloudSearch Developer Guide." ([delete-domain-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-domain-request "DeleteDomain" delete-domain-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/delete-domain-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/delete-domain-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception}))))
(clojure.spec.alpha/fdef delete-domain :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/delete-domain-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/delete-domain-response))

(clojure.core/defn delete-suggester "Deletes a suggester. For more information, see Getting Search Suggestions\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html)\nin the Amazon CloudSearch Developer Guide." ([delete-suggester-request] (clojure.core/let [req<-input__36755__auto__ (req<-delete-suggester-request "DeleteSuggester" delete-suggester-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/delete-suggester-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/delete-suggester-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef delete-suggester :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/delete-suggester-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/delete-suggester-response))

(clojure.core/defn describe-availability-options "Gets the availability options configured for a domain. By default, shows the\nconfiguration with any pending changes. Set the Deployed option to true to show\nthe active configuration and exclude pending changes. For more information, see\nConfiguring Availability Options\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html)\nin the Amazon CloudSearch Developer Guide." ([describe-availability-options-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-availability-options-request "DescribeAvailabilityOptions" describe-availability-options-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/describe-availability-options-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/describe-availability-options-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "InvalidTypeException" :portkey.aws.cloudsearch/invalid-type-exception, "LimitExceededException" :portkey.aws.cloudsearch/limit-exceeded-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception, "DisabledOperationException" :portkey.aws.cloudsearch/disabled-operation-exception}))))
(clojure.spec.alpha/fdef describe-availability-options :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-availability-options-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-availability-options-response))

(clojure.core/defn describe-expressions "Gets the expressions configured for the search domain. Can be limited to\nspecific expressions by name. By default, shows all expressions and includes any\npending changes to the configuration. Set the Deployed option to true to show\nthe active configuration and exclude pending changes. For more information, see\nConfiguring Expressions\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-expressions.html)\nin the Amazon CloudSearch Developer Guide." ([describe-expressions-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-expressions-request "DescribeExpressions" describe-expressions-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/describe-expressions-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/describe-expressions-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef describe-expressions :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-expressions-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-expressions-response))

(clojure.core/defn describe-suggesters "Gets the suggesters configured for a domain. A suggester enables you to display\npossible matches before users finish typing their queries. Can be limited to\nspecific suggesters by name. By default, shows all suggesters and includes any\npending changes to the configuration. Set the Deployed option to true to show\nthe active configuration and exclude pending changes. For more information, see\nGetting Search Suggestions\n(http://docs.aws.amazon.com/cloudsearch/latest/developerguide/getting-suggestions.html)\nin the Amazon CloudSearch Developer Guide." ([describe-suggesters-request] (clojure.core/let [req<-input__36755__auto__ (req<-describe-suggesters-request "DescribeSuggesters" describe-suggesters-request)] (portkey.aws/-query-call portkey.aws.cloudsearch/endpoints "POST" "/" req<-input__36755__auto__ :portkey.aws.cloudsearch/describe-suggesters-request {:payload nil, :move {}, :headers {}, :uri {}, :querystring {}} nil :portkey.aws.cloudsearch/describe-suggesters-response {"BaseException" :portkey.aws.cloudsearch/base-exception, "InternalException" :portkey.aws.cloudsearch/internal-exception, "ResourceNotFoundException" :portkey.aws.cloudsearch/resource-not-found-exception}))))
(clojure.spec.alpha/fdef describe-suggesters :args (clojure.spec.alpha/tuple :portkey.aws.cloudsearch/describe-suggesters-request) :ret (clojure.spec.alpha/and :portkey.aws.cloudsearch/describe-suggesters-response))
